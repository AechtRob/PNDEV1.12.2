package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRhachiosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;


    private ModelAnimator animator;

    public ModelRhachiosteus() {
        animator = ModelAnimator.create();
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 19, -2.5F, -4.7F, -1.075F, 5, 3, 3, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 11, -2.5F, -2.0F, -1.075F, 5, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, -3.35F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 32, -3.0F, -2.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.975F, -1.85F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0087F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 0, -3.0F, -1.0F, -1.5F, 6, 2, 3, -0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.1859F, -7.6786F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.3526F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 37, -2.0F, 0.0F, 0.0F, 3, 2, 1, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5988F, -7.7402F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.829F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 41, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0647F, -0.606F, -0.1043F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 42, -0.225F, -0.875F, 0.625F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 37, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.185F, -0.5589F, -0.0187F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 41, -0.075F, -0.55F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.752F, -2.0305F, -4.7617F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2286F, -0.1173F, -0.0798F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 0, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.752F, -2.0305F, -4.7617F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2286F, 0.1173F, 0.0798F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 0, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0541F, -0.5589F, -0.0187F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 44, 0.45F, -0.275F, 0.35F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3823F, -0.5589F, -0.0187F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 44, 0.5F, -0.275F, -0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0541F, 0.5589F, 0.0187F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 44, -0.45F, -0.275F, 0.35F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.9402F, -0.7897F, -7.5074F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.558F, -1.2418F, -1.5961F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 44, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9402F, -0.7897F, -7.5074F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.558F, 1.2418F, 1.5961F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 44, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3823F, 0.5589F, 0.0187F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 44, -0.5F, -0.275F, -0.4F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.185F, 0.5589F, 0.0187F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 41, -0.925F, -0.55F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.4327F, -1.6025F, -7.6871F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0647F, 0.606F, 0.1043F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 42, -0.775F, -0.875F, 0.625F, 1, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 37, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -3.0214F, -6.8339F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4363F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 39, -2.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -3.9235F, -3.9728F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 33, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, -4.7F, -1.075F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 12, -4.0F, 0.0F, -3.0F, 6, 3, 3, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.3F, -2.4219F, 1.4979F);
        this.main.addChild(tail);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.8F, 2.3961F, 0.1731F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 26, -0.5F, -2.0F, 0.0F, 4, 2, 3, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.3F, -2.0005F, 0.419F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 37, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.8F, -2.0531F, 0.2521F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 26, -1.5F, -0.225F, 0.0F, 4, 3, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9F, 2.0461F, 0.3231F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.1678F, -0.2564F, 0.5889F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 38, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.0461F, 0.3231F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.1678F, 0.2564F, -0.5889F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 38, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.3F, 0.1849F, 2.7525F);
        this.tail.addChild(tail2);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.5916F, 1.9922F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 33, 0.0F, -0.025F, -0.05F, 0, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 0.3839F, 2.7947F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 26, -0.5F, -0.95F, -3.0F, 3, 2, 4, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.176F, 3.9976F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2356F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 19, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1366F, 3.2971F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.9754F, 3.0649F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 10, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -1.2747F, 0.2025F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0785F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 33, -1.5F, -0.05F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3115F, 2.8512F);
        this.tail3.addChild(tail4);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.3184F, -0.1917F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4887F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.5F, -0.25F, -0.4F, 0, 4, 7, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 17, 0.0F, -0.25F, 0.0F, 1, 1, 5, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.0F, -0.75F, -2.925F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.1498F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 15, 6, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0F, -0.75F, -2.925F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.1498F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 15, 6, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.8821F, -5.2701F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 41, -1.0F, -0.3F, -2.25F, 2, 1, 1, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 6, -2.0F, -0.3F, -1.25F, 4, 1, 2, 0.006F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 0.2F, -2.25F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.7418F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 39, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 42, 0.0F, -0.5F, 0.4F, 1, 1, 1, -0.003F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.2F, -2.25F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.7418F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 7, 42, -1.0F, -0.5F, 0.4F, 1, 1, 1, -0.003F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 39, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 0.45F, -2.25F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2618F, -0.7418F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 42, 0.2F, -1.0F, -0.175F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.3784F, -0.0402F, -1.541F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, -0.7418F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 42, -0.025F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.3784F, -0.0402F, -1.541F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5236F, 0.7418F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 42, 0.025F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.8258F, -0.0783F, -2.1441F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5404F, -1.1436F, -0.9109F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 42, 0.3F, -0.2F, -0.75F, 0, 1, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.8258F, -0.0783F, -2.1441F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.5404F, 1.1436F, 0.9109F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 42, -0.3F, -0.2F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 0.45F, -2.25F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2618F, 0.7418F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 42, -0.2F, -1.0F, -0.175F, 0, 1, 1, 0.0F, false));



        updateDefaultPose();
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

