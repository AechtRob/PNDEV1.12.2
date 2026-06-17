package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlacolepis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPlacolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;

    private ModelAnimator animator;


    public ModelPlacolepis() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 15, 33, -3.0F, -2.0F, 2.0F, 6, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 8, -3.5F, -2.5F, -1.0F, 7, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 20, -3.5F, -2.0F, -1.0F, 7, 2, 3, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0044F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -2.5F, -1.0F, -5.0F, 5, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5154F, -0.8215F, -5.8404F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4005F, 1.0082F, 0.1159F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 26, -0.5F, -0.5F, -0.525F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5149F, -1.1612F, -4.9316F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0281F, 1.0221F, 0.0276F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 34, 0.025F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.606F, -1.1483F, -6.738F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3709F, 1.0282F, 0.1324F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 44, -2.0F, -0.05F, 0.025F, 2, 1, 2, -0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.6052F, -1.3846F, -7.0405F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2034F, 0.6058F, 0.0373F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 31, -1.825F, -0.025F, -0.95F, 2, 1, 1, -0.006F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.5149F, -1.1612F, -4.9316F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0281F, -1.0221F, -0.0276F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 34, -2.025F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.6076F, -1.2912F, -5.0128F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5986F, 1.4491F, 0.3731F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 43, -3.0F, -0.175F, -0.025F, 3, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.6736F, -0.4844F, -3.4732F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4198F, 1.4471F, -0.4325F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 27, 0.5F, -0.6F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.6736F, -0.4844F, -3.4732F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4198F, -1.4471F, 0.4325F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 27, -1.5F, -0.6F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.6076F, -1.2912F, -5.0128F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5986F, -1.4491F, -0.3731F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 43, 0.0F, -0.175F, -0.025F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5154F, -0.8215F, -5.8404F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4005F, -1.0082F, -0.1159F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 26, -0.5F, -0.5F, -0.525F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.606F, -1.1483F, -6.738F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3709F, -1.0282F, -0.1324F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 44, 0.0F, -0.05F, 0.025F, 2, 1, 2, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6052F, -1.3846F, -7.0405F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2034F, -0.6058F, -0.0373F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 31, -0.175F, -0.025F, -0.95F, 2, 1, 1, -0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.1084F, -3.9743F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 44, -1.0F, 0.0F, -4.1F, 2, 1, 2, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 33, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.5F, -1.0F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 13, -3.0F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -2.5F, 2.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 40, -1.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3921F, 3.461F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 36, 25, 0.0F, -0.9579F, 0.014F, 0, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.9043F, 0.05F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0305F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 18, -1.5F, 0.0F, 0.0F, 3, 1, 5, -0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 1.3921F, 0.039F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0131F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 0, -1.0F, -2.0F, 0.0F, 4, 2, 5, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.3F, 1.2707F, 0.95F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.5236F, 0.3491F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 38, 23, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.3F, 1.2707F, 0.95F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.5236F, -0.3491F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 38, 23, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3921F, 4.539F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 0, -0.025F, -1.3F, -0.025F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 38, -0.025F, 0.2F, 0.975F, 0, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.8671F, -0.0484F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0654F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 33, -1.0F, -0.975F, 0.05F, 2, 1, 5, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 26, -1.0F, -0.05F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 25, -0.5F, -0.75F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -1.25F, 0.0F, 0, 3, 9, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.2201F, -0.5548F, -0.1911F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1787F, 0.1773F, 0.0402F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 9, 47, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.2201F, -0.5548F, -0.1911F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1787F, -0.1773F, -0.0402F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 9, 47, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.5218F, -5.1542F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 12, -1.0F, -0.5001F, -2.5235F, 2, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.0F, -2.5235F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.5541F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 44, 0.0F, -0.525F, 0.0F, 2, 1, 2, -0.003F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.0F, -2.5235F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.5541F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 44, -2.0F, -0.525F, 0.0F, 2, 1, 2, 0.0F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(4.2326F, -0.985F, -1.3007F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, -0.0136F, 0.2618F, -0.0035F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5641F, 0.4298F, 0.5884F);
        this.leftSpike.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.0436F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 47, 23, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0431F, 0.9298F, -2.3661F);
        this.leftSpike.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.9599F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 7, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.6635F, 0.4298F, -0.776F);
        this.leftSpike.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 43, -0.35F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.6273F, -0.4996F, 0.8154F);
        this.leftSpike.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1058F, 0.1887F, 0.336F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 38, -2.975F, 0.325F, -3.05F, 3, 1, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.6273F, -0.4996F, 0.8154F);
        this.leftSpike.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1041F, 0.1896F, 0.3272F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 18, -2.95F, 0.025F, -3.05F, 3, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5638F, 0.4298F, 1.2404F);
        this.leftSpike.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0873F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 38, -2.725F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-4.2326F, -0.985F, -1.3007F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, -0.0136F, -0.2618F, 0.0035F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5641F, 0.4298F, 0.5884F);
        this.rightSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0436F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 47, 23, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.006F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0431F, 0.9298F, -2.3661F);
        this.rightSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, -0.9599F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 7, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.6635F, 0.4298F, -0.776F);
        this.rightSpike.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.1745F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 43, -0.65F, -0.5F, -1.5F, 1, 1, 3, 0.003F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.6273F, -0.4996F, 0.8154F);
        this.rightSpike.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1058F, -0.1887F, -0.336F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 28, 38, -0.025F, 0.325F, -3.05F, 3, 1, 3, -0.003F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.6273F, -0.4996F, 0.8154F);
        this.rightSpike.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1041F, -0.1896F, -0.3272F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 38, 18, -0.05F, 0.025F, -3.05F, 3, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5638F, 0.4298F, 1.2404F);
        this.rightSpike.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.0873F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 15, 38, -0.275F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.23F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.05F;
        this.main.offsetY = -0.08F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
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
        this.main.offsetZ = -0.2F;
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        EntityPrehistoricFloraPlacolepis phyllo = (EntityPrehistoricFloraPlacolepis) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        float finDegreeZ = (float)Math.toRadians(25);
        float finDegreeY = (float)Math.toRadians(7.5);
        if (isAtBottom && !phyllo.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.25F;
            bottomModifier = 0.9F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(10);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !phyllo.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.2), (float) Math.toRadians(20), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.02F;
                this.main.offsetZ = -0.2F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
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
