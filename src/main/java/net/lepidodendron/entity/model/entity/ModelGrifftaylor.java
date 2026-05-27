package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrifftaylor extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private ModelAnimator animator;


    public ModelGrifftaylor() {
        animator = ModelAnimator.create();
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.7F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 36, 6, -2.0F, -4.0088F, -0.5957F, 4, 2, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 24, -2.0F, -1.7198F, -6.3838F, 4, 1, 1, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.6F, -1.4068F, -6.7272F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1886F, -0.3864F, -0.0718F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 17, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.6F, -1.4068F, -6.7272F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1886F, 0.3864F, 0.0718F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 17, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.9198F, -7.2588F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 20, -1.3F, -0.5F, -0.35F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 20, 1.3F, -0.5F, -0.35F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8042F, -7.6003F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 6, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -2.0377F, -7.277F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 47, -0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -3.0637F, -4.4579F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 12, -0.5F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -3.7477F, -2.5785F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 39, -0.5F, 0.0F, -2.0F, 5, 1, 2, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -4.0077F, 2.4514F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 27, -0.5F, 0.0F, -0.05F, 4, 1, 4, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -3.95F, -2.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 39, -1.5F, 0.125F, -0.6F, 5, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, 2.2F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.0F, -3.0F, -2.7F, 5, 3, 7, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 0, -2.5F, -1.0F, -6.0F, 6, 1, 4, 0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.975F, -1.4369F, -3.8597F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0504F, -0.523F, -0.0252F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 47, 0.0F, -1.0F, -2.0F, 1, 2, 2, 0.006F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.975F, -1.4369F, -3.8597F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0504F, 0.523F, 0.0252F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 47, -1.0F, -1.0F, -2.0F, 1, 2, 2, 0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.5176F, 5.7361F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -0.7664F, 0.5201F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5149F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 46, 1.5F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.1504F, 4.8595F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 19, -1.5F, -0.375F, -5.0F, 4, 2, 5, -0.004F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 1.8931F, 0.2601F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 11, -2.5F, -1.575F, -0.425F, 4, 2, 5, -0.006F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9619F, 2.0931F, 0.4514F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.3927F, 0.3927F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 28, 43, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9619F, 2.0931F, 0.4514F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.3927F, -0.3927F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 28, 43, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5015F, 4.2624F);
        this.tail.addChild(tail2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.9998F, -0.015F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0611F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, -1.5F, 0.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 1.552F, 0.5062F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6021F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 48, 1.0F, 0.0F, 0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0774F, 3.9454F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0654F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 33, -1.5F, -0.75F, -4.0F, 3, 1, 4, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1633F, 3.8882F);
        this.tail2.addChild(tail3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.8881F, -0.9032F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0087F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 17, -0.5F, 0.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1293F, 2.912F);
        this.tail3.addChild(tail4);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0699F, 0.0339F);
        this.tail4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4494F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 0, -0.5F, -0.825F, -0.025F, 1, 1, 3, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.7116F, 7.6813F);
        this.tail4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, 0.5F, -0.1F, -8.0F, 0, 4, 8, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.6674F, -0.2503F);
        this.tail4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 24, -0.5F, 0.0F, -0.1F, 1, 1, 6, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.1837F, -0.9805F, -0.1202F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1759F, 0.2275F, 0.0889F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 15, 27, -1.5F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.1837F, -0.9805F, -0.1202F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1759F, -0.2275F, -0.0889F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 15, 27, -1.5F, 0.0F, 0.0F, 3, 0, 5, 0.0F, true));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(3.4799F, -0.3823F, -7.9451F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.0435F, -0.0038F, 0.0872F);
        this.leftSpine.cubeList.add(new ModelBox(leftSpine, 0, 48, -2.4175F, -0.5F, 3.2839F, 2, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.1499F, -0.006F, 8.9718F);
        this.leftSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.0036F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 45, 47, 0.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.2015F, -0.006F, 5.81F);
        this.leftSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 47, -1.0F, -0.5F, 2.0F, 1, 1, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 45, 37, -3.0F, -0.5F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3682F, -0.006F, 3.2529F);
        this.leftSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.5672F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 43, -3.05F, -0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.391F, -2.3126F, 5.3408F);
        this.leftSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0181F, 0.3923F, 0.0472F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 33, -3.0F, 0.0F, -1.275F, 3, 2, 4, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0455F, -0.5F, 4.1859F);
        this.leftSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3591F, 0.1624F, 1.164F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 40, -2.0F, 0.0F, -0.375F, 2, 1, 4, 0.0F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-3.4799F, -0.3823F, -7.9451F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.0435F, 0.0038F, -0.0872F);
        this.rightSpine.cubeList.add(new ModelBox(rightSpine, 0, 48, 0.4175F, -0.5F, 3.2839F, 2, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.1499F, -0.006F, 8.9718F);
        this.rightSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -1.0036F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 45, 47, -1.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.2015F, -0.006F, 5.81F);
        this.rightSpine.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.3054F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 47, 0.0F, -0.5F, 2.0F, 1, 1, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 37, 0.0F, -0.5F, 0.0F, 3, 1, 2, 0.003F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.3682F, -0.006F, 3.2529F);
        this.rightSpine.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.5672F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 43, 0.05F, -0.5F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.391F, -2.3126F, 5.3408F);
        this.rightSpine.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0181F, -0.3923F, -0.0472F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 33, 0.0F, 0.0F, -1.275F, 3, 2, 4, 0.003F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.0455F, -0.5F, 4.1859F);
        this.rightSpine.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3591F, -0.1624F, -1.164F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 40, 0.0F, 0.0F, -0.375F, 2, 1, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.5866F, -4.0685F);
        this.main.addChild(jaw);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.75F, -0.1883F, -2.8717F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4363F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 49, 27, -0.5F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 49, 27, 2.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 0.7981F, -1.6564F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 45, 33, -0.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -0.8008F, -0.8167F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.6581F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 47, 24, -1.5F, -0.75F, -0.625F, 4, 1, 1, -0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.5F, 0.3F, -1.7F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0218F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 43, -0.5F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));

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
