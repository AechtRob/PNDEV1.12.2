package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPholidosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;

    private ModelAnimator animator;

    public ModelPholidosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -4.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 11, -2.5F, -4.15F, -1.275F, 5, 4, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 40, 35, -1.5F, -3.9835F, -6.238F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.4913F, -4.2014F, -4.9178F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.26F, -0.0793F, 0.0459F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 46, 0.0F, 0.0F, 0.0F, 1, 2, 4, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5739F, -1.2744F, -5.5704F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.22F, -0.0793F, 0.0459F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 8, 0.0F, -3.0F, 0.0F, 1, 3, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.4913F, -4.2014F, -4.9178F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.26F, 0.0793F, -0.0459F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 46, -1.0F, 0.0F, 0.0F, 1, 2, 4, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5739F, -1.2744F, -5.5704F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.22F, 0.0793F, -0.0459F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 8, -1.0F, -3.0F, 0.0F, 1, 3, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.7457F, -2.0902F, -6.4834F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4472F, -0.2821F, 0.1681F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 30, 0.0F, -0.6F, -1.125F, 0, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.4306F, -2.5558F, -7.2862F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1572F, -0.1502F, 0.0354F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 55, 0.025F, -0.5F, -0.625F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.4306F, -2.5558F, -7.2862F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1572F, 0.1502F, -0.0354F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 55, -0.025F, -0.5F, -0.625F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.7457F, -2.0902F, -6.4834F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4472F, 0.2821F, -0.1681F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 30, 0.0F, -0.6F, -1.125F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.3686F, -7.4656F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6307F, -0.5588F, 0.3694F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 51, -0.3F, -2.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.3686F, -7.4656F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6307F, 0.5588F, -0.3694F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 51, -0.7F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.9335F, -7.238F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 8, -0.5F, 0.0F, -1.225F, 1, 1, 1, -0.003F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 35, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.0675F, -6.738F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 53, -0.5F, -1.0F, 0.0F, 2, 1, 2, -0.005F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -4.9335F, -5.5059F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 53, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -5.9688F, -1.6422F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 35, -1.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -6.65F, 2.0F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -1.5F, 0.2F, -3.7F, 6, 3, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.15F, -1.275F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 38, -1.5F, -3.0F, -4.0F, 4, 3, 4, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.7673F, 5.072F);
        this.main.addChild(tail);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.897F, 0.484F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3272F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 46, 0.0F, -4.0F, 0.0F, 0, 4, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -4.1152F, 0.2258F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1091F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 23, -2.0F, 0.075F, -0.275F, 5, 5, 6, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.6173F, 0.153F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 0, -1.5F, -2.0F, 0.25F, 4, 2, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.2668F, 2.3807F, 3.028F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0023F, -0.2618F, 0.4017F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 44, 17, 0.0F, 0.0F, -0.75F, 3, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.2668F, 2.3807F, 3.028F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0023F, 0.2618F, -0.4017F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 44, 17, -3.0F, 0.0F, -0.75F, 3, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0519F, 4.8932F);
        this.tail.addChild(tail2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 1.4726F, 4.3438F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 38, -0.5F, -1.325F, -4.95F, 3, 2, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.4667F, 5.0384F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1789F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 11, -1.5F, -0.05F, -5.0F, 4, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2621F, 4.1367F);
        this.tail2.addChild(tail3);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.6308F, 1.6165F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2132F, 0.0069F, 0.0074F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 53, 0.0F, -0.675F, -1.3F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 2.4179F, -0.2755F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1265F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 46, -0.5F, -2.05F, -0.15F, 2, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -2.161F, -0.0299F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 43, -0.5F, -0.175F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0859F, 3.1923F);
        this.tail3.addChild(tail4);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 1.7466F, -0.0587F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0654F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 46, 0.0F, -1.95F, -0.025F, 1, 2, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -1.7508F, 0.2469F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0218F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 0, -0.5F, 0.1F, -0.25F, 2, 3, 4, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5564F, 3.6885F);
        this.tail4.addChild(tail5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5445F, 0.7058F);
        this.tail5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.9512F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 51, 40, -0.5F, -0.775F, -1.45F, 1, 1, 3, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, -0.0238F, -0.2164F);
        this.tail5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3709F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 23, 1.0F, -0.725F, 0.0F, 0, 6, 8, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 27, 0.5F, -0.75F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(2.4951F, -0.9128F, -0.8916F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0F, -0.0436F, 0.2182F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.6964F, 0.0F, 0.5082F);
        this.leftSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.1745F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 55, 27, -1.5F, -0.5F, -0.65F, 2, 1, 1, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5049F, 0.025F, -0.1719F);
        this.leftSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.4363F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 27, 8, -0.5F, -0.525F, -0.4F, 4, 1, 1, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-2.4951F, -0.9128F, -0.8916F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0F, 0.0436F, -0.2182F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.6964F, 0.0F, 0.5082F);
        this.rightSpike.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.1745F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 55, 27, -0.5F, -0.5F, -0.65F, 2, 1, 1, -0.003F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5049F, 0.025F, -0.1719F);
        this.rightSpike.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.4363F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 8, -3.5F, -0.525F, -0.4F, 4, 1, 1, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.3108F, -1.0527F, 0.3095F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.2407F, 0.9091F, -0.0968F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 40, 21, -1.5F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.3108F, -1.0527F, 0.3095F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.2407F, -0.9091F, 0.0968F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 40, 21, -1.5F, 0.0F, 0.0F, 3, 0, 5, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.8241F, -2.9626F, -5.3899F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, -0.0147F, 0.5659F, -0.179F);
        this.eye.cubeList.add(new ModelBox(eye, 37, 53, -0.5125F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 5, 57, -0.4875F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.8241F, -2.9626F, -5.3899F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, -0.0147F, -0.5659F, 0.179F);
        this.eye2.cubeList.add(new ModelBox(eye2, 37, 53, -0.4875F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 5, 57, -0.5125F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0231F, -1.7F, -5.1181F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 55, -0.9769F, 0.0F, -0.7569F, 2, 1, 1, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 53, -0.4769F, 0.0F, -2.6319F, 1, 1, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.6513F, 0.1718F, -1.0749F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0349F, -0.4363F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 57, -0.175F, -0.325F, -1.525F, 0, 1, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.6975F, 0.1718F, -1.0749F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0349F, 0.4363F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 57, 0.175F, -0.325F, -1.525F, 0, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.4769F, 0.5F, -2.6319F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0524F, -0.4363F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 51, 35, 0.0F, -0.525F, 0.0F, 1, 1, 3, 0.003F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5231F, 0.5F, -2.6319F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0524F, 0.4363F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 35, -1.0F, -0.525F, 0.0F, 1, 1, 3, 0.003F, false));



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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

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

