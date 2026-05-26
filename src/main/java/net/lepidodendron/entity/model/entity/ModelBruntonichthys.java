package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBruntonichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r35;
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
    private final AdvancedModelRenderer cube_r45;
    private ModelAnimator animator;

    public ModelBruntonichthys() {
        animator = ModelAnimator.create();
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -3.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 20, -3.0F, -6.0F, 0.0F, 6, 5, 6, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 19, -2.5F, -1.3F, 0.0F, 5, 1, 6, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.9009F, -1.4492F, -2.1333F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5379F, -0.073F, 0.0673F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 53, -0.275F, -0.025F, -0.025F, 1, 3, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.9009F, -1.4492F, -2.1333F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5379F, 0.073F, -0.0673F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 53, -0.725F, -0.025F, -0.025F, 1, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.8395F, -6.1595F, -2.0637F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5681F, -0.0917F, -0.0015F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 55, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.2531F, -3.4461F, -5.5199F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.7332F, -0.2629F, 0.1237F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 31, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.8395F, -6.1595F, -2.0637F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5681F, 0.0917F, 0.0015F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 55, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.2531F, -3.4461F, -5.5199F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.7332F, 0.2629F, -0.1237F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 31, -1.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.3592F, -2.5189F, -5.8792F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2783F, -0.2289F, -0.0114F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 60, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.3592F, -2.5189F, -5.8792F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.2783F, 0.2289F, 0.0114F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 60, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -3.7972F, -7.1039F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 2.0727F, -0.4253F, 0.1006F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 61, -0.45F, 0.025F, -1.0F, 1, 2, 1, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -2.8209F, -7.3204F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.3624F, -0.4408F, 0.0256F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 60, -0.45F, 0.0F, 0.05F, 1, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -3.7972F, -7.1039F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.0727F, 0.4253F, -0.1006F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 61, -0.55F, 0.025F, -1.0F, 1, 2, 1, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.4446F, -2.6958F, -6.5072F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.452F, -0.3975F, 0.0199F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 63, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.4446F, -2.6958F, -6.5072F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.452F, 0.3975F, -0.0199F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -2.8209F, -7.3204F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.3624F, 0.4408F, -0.0256F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 60, -0.55F, 0.0F, 0.05F, 1, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -4.2231F, -7.505F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9163F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 62, 0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.3797F, -6.9677F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 26, -1.5F, -1.0F, 2.0F, 4, 1, 3, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.7783F, -5.0602F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0567F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 53, -1.5F, -0.975F, -2.225F, 3, 1, 3, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -5.835F, -4.9748F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5672F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 40, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -6.3526F, -3.0429F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 6, -0.5F, 0.0F, -2.0F, 3, 1, 2, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -6.4835F, -0.0458F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 16, -1.5F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -6.4835F, -0.0458F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0262F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 11, -1.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 0, -2.5F, -2.0F, -2.975F, 5, 2, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5109F, -1.2F, -0.5498F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0342F, -0.0426F, 0.2184F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 25, 27, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5109F, -1.2F, -0.5498F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0342F, 0.0426F, -0.2184F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 25, 27, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.1271F, -3.9281F, -4.9678F);
        this.main.addChild(eye);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.126F, -0.0179F, -0.0522F);
        this.eye.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.054F, 0.3892F, -0.1415F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 60, -0.675F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 63, 14, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.1271F, -3.9281F, -4.9678F);
        this.main.addChild(eye2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.126F, -0.0179F, -0.0522F);
        this.eye2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.054F, -0.3892F, 0.1415F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 60, -0.325F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 63, 14, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0196F, -2.0996F, -2.9776F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.609F, 0.0537F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 61, -1.5F, -1.0F, 0.0F, 3, 1, 1, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0196F, 1.5305F, -1.7446F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 10, -1.5F, -1.0F, -0.2F, 3, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4804F, 1.536F, -1.8695F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 29, 60, -0.5F, -1.35F, -1.825F, 2, 1, 2, -0.003F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 58, -0.5F, -1.0F, -2.275F, 2, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5113F, 0.1791F, -1.2069F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0641F, -0.2445F, -0.147F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 61, -0.575F, -1.825F, -0.275F, 1, 2, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.9804F, 1.469F, -1.7078F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0832F, -0.5214F, -0.0503F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 58, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.0196F, 1.469F, -1.7078F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0832F, 0.5214F, 0.0503F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 61, 58, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5506F, 0.1791F, -1.2069F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0641F, 0.2445F, 0.147F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 9, 61, -0.425F, -1.825F, -0.275F, 1, 2, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.4804F, 0.5F, -0.675F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 21, -1.5F, -0.5F, -1.325F, 4, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5657F, 5.6205F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, -2.5F, -2.4343F, -0.1205F, 5, 5, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 2.9997F, 4.8474F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.048F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 38, 33, -2.0F, -1.0F, -4.925F, 4, 1, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.5F, -2.7066F, 4.8368F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0785F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 19, 33, -0.5F, 0.025F, -4.85F, 4, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.4749F, 2.9692F, 1.8526F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0694F, -0.3565F, 0.5497F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 49, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.4749F, 2.9692F, 1.8526F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0694F, 0.3565F, -0.5497F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 49, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.231F, 4.5115F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 32, -2.0F, -1.5533F, -0.1319F, 4, 3, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, -1.5498F, 4.9344F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1833F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 40, -0.5F, 0.0F, -5.025F, 3, 1, 5, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 2.7329F, 0.1448F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1702F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 40, -1.0F, -1.6F, -0.15F, 3, 2, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.5F, -1.6282F, 1.1115F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2618F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 48, 6, 2.5F, -3.9F, -0.75F, 0, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3172F, 4.4735F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 47, -1.5F, -0.6111F, -0.1305F, 3, 2, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -1.1718F, -0.1241F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0393F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 51, 47, -0.5F, -0.05F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 1.7822F, -0.3825F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4451F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 28, 48, 0.0F, 0.8F, 0.85F, 0, 2, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 2.455F, 0.2091F);
        this.tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1047F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 15, 48, -1.0F, -1.925F, -0.2F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2376F, 3.675F);
        this.tail3.addChild(tail4);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.4737F, 2.7557F);
        this.tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3098F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 11, 55, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.006F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.1035F, 2.6272F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0262F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 39, 54, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.4564F, 2.5988F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.6414F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 54, -0.5F, -1.05F, 0.05F, 1, 1, 4, -0.003F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.4515F, 2.1195F);
        this.tail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3491F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 0, 0.5F, -1.075F, -1.0F, 0, 7, 12, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.2515F, 2.1195F);
        this.tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.3491F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 41, -0.5F, -0.925F, 0.0F, 1, 1, 6, 0.0F, false));

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
