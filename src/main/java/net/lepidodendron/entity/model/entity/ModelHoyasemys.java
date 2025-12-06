package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHoyasemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHoyasemys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer upperarmLeft;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer lowerarmLeft;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer frontfootLeft;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer upperarmRight;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer lowerarmRight;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer frontfootRight;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer upperlegLeft;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer lowerlegLeft;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer backfootLeft;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer upperlegRight;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer lowerlegRight;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer backfootRight;
    private final AdvancedModelRenderer cube_r51;

    private ModelAnimator animator;

    public ModelHoyasemys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.8F, 0.4F);
        this.main.cubeList.add(new ModelBox(main, 0, 26, -1.0F, -1.6F, -2.9F, 2, 1, 5, 0.02F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, 0.3F, -5.5F, 5, 2, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, 2.3F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 13, -2.0F, -1.0F, -4.0F, 2, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, 2.3F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, 0.0F, -1.0F, -4.0F, 2, 1, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.9F, -1.4F, 2.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2455F, -0.0385F, -0.5469F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 18, -2.9678F, -0.0513F, -0.5F, 3, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.9F, -1.4F, 2.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2453F, -0.0047F, -0.5554F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 47, -3.9678F, -0.0513F, -0.5F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -1.5F, -3.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3091F, 0.0433F, -0.5658F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 35, -3.9678F, -0.0313F, -0.9F, 1, 0, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 40, -2.9678F, -0.0313F, -1.9F, 3, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -1.525F, -0.4F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.5585F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 21, -3.9678F, -0.0513F, -2.5F, 4, 0, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.9F, -1.4F, 2.5F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2453F, 0.0047F, 0.5554F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 24, 2.9678F, -0.0513F, -0.5F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.9F, -1.4F, 2.5F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2455F, 0.0385F, 0.5469F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 15, -0.0322F, -0.0513F, -0.5F, 3, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -1.5F, -3.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3091F, -0.0433F, 0.5658F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 12, 2.9678F, -0.0313F, -0.9F, 1, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 34, -0.0322F, -0.0313F, -2.9F, 1, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 8, -0.0322F, -0.0313F, -1.9F, 3, 0, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.5F, -0.4F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.5585F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 31, -4.4678F, -0.0512F, -2.5F, 1, 0, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -1.5F, -0.4F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.5585F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 26, 3.4678F, -0.0512F, -2.5F, 1, 0, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.525F, -0.4F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.5585F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 21, -0.0322F, -0.0513F, -2.5F, 4, 0, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.8F, 0.7F, 4.8F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.203F, -0.4306F, -0.2221F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 43, -0.8355F, -0.9395F, -0.6853F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.6F, 0.5F, 4.1F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2794F, 0.7942F, 0.0571F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 37, -0.0073F, -0.1778F, -0.0369F, 3, 1, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.7932F, 0.4061F, 4.0915F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1127F, 0.2248F, -0.0825F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 0, 0.1671F, -0.0878F, -3.9498F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-5.6F, 1.8F, 0.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0548F, -0.1216F, -0.0722F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 37, 0.2423F, -1.0046F, -2.7151F, 2, 1, 3, 0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.0F, 0.7F, -2.4F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1467F, -0.3334F, -0.0259F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 0, -0.1719F, -0.0863F, -2.0323F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.4732F, 0.6793F, -4.2508F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2529F, 0.5331F, -0.3304F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 45, 0.038F, -0.3392F, -0.089F, 2, 1, 2, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.1541F, -0.8897F, -6.0773F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3135F, 0.4343F, -0.412F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 13, -2.1F, -0.1F, -0.0768F, 2, 1, 1, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.0F, 0.7F, -2.4F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1467F, 0.3334F, 0.0259F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 44, -1.8281F, -0.0863F, -2.0323F, 2, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.8F, 0.7F, 4.8F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.203F, 0.4306F, 0.2221F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 42, -1.1645F, -0.9395F, -0.6853F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(4.4732F, 0.6793F, -4.2508F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2529F, -0.5331F, 0.3304F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 44, -2.038F, -0.3392F, -0.089F, 2, 1, 2, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.1541F, -0.8897F, -6.0773F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3135F, -0.4343F, 0.412F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 3, 0.1F, -0.1F, -0.0768F, 2, 1, 1, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(5.6F, 1.8F, 0.0F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0548F, 0.1216F, 0.0722F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 37, -2.2423F, -1.0046F, -2.7151F, 2, 1, 3, 0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.7932F, 0.4061F, 4.0915F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1127F, -0.2248F, 0.0825F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 32, -2.1671F, -0.0878F, -3.9498F, 2, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(4.6F, 0.5F, 4.1F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2794F, -0.7942F, -0.0571F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 34, -2.9927F, -0.1778F, -0.0369F, 3, 1, 2, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6F, 0.3F, -4.4F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2793F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 41, -2.1F, -0.9F, -2.0F, 3, 1, 2, 0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4F, 0.3F, 4.5F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 41, -1.9F, -0.7F, 0.0F, 3, 1, 2, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.6F, -2.9F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 2.8449F, 0.0F, 3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 36, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, -1.6F, 2.1F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2443F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 26, -2.0F, 0.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8F, -5.0F);
        this.main.addChild(Neck);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.5F, -1.7F);
        this.Neck.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.192F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 5, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 12, 32, -1.4F, -1.0F, -1.0F, 2, 2, 3, -0.01F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 10, -0.6F, -1.0F, -1.0F, 2, 2, 3, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.5F, -0.2F);
        this.Neck.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.4189F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 21, -1.0F, -1.9961F, -3.0559F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.1F, -0.3F, -2.2F);
        this.Neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 24, 44, -0.4F, -1.1F, -3.7F, 1, 1, 2, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 30, -1.4F, -1.4F, -1.9F, 3, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -1.3F, -2.5F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1047F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 47, -0.9F, 0.0F, -0.1F, 2, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.3F, -0.6F, -3.6F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0678F, -0.4888F, -0.0041F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 21, -0.1151F, -0.5F, 0.0364F, 1, 1, 2, 0.01F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 34, -0.2151F, -0.5F, 0.6364F, 1, 1, 1, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.1F, -1.1F, -3.6F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1396F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 32, 10, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.6F, -3.6F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0678F, 0.4888F, 0.0041F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 46, 10, -0.8849F, -0.5F, 0.0364F, 1, 1, 2, 0.01F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 22, 32, -0.7849F, -0.5F, 0.6364F, 1, 1, 1, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2F, -1.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0349F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 45, -0.4F, -0.707F, -1.7001F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.2F, 0.1929F, 0.4087F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0085F, -0.4879F, -0.032F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 47, -1.0442F, -0.8799F, -1.8448F, 1, 1, 2, -0.02F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.4F, 0.1929F, 0.4087F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0085F, 0.4879F, 0.032F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 46, 0.0442F, -0.8799F, -1.8448F, 1, 1, 2, -0.02F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.7F, 5.6F);
        this.main.addChild(Tail);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2094F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 6, 47, -0.5F, -0.4F, -0.2F, 1, 1, 2, 0.0F, false));

        this.upperarmLeft = new AdvancedModelRenderer(this);
        this.upperarmLeft.setRotationPoint(2.3F, 1.8F, -3.8F);
        this.main.addChild(upperarmLeft);
        this.setRotateAngle(upperarmLeft, 0.3025F, 0.1827F, -1.1571F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.upperarmLeft.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.4887F, 0.2094F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 32, 36, -1.4695F, -1.0F, -2.8829F, 2, 1, 3, 0.0F, false));

        this.lowerarmLeft = new AdvancedModelRenderer(this);
        this.lowerarmLeft.setRotationPoint(0.9943F, -0.2668F, -2.702F);
        this.upperarmLeft.addChild(lowerarmLeft);
        this.setRotateAngle(lowerarmLeft, 0.2681F, 0.4443F, 0.6202F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.2373F, -0.2598F, 0.0532F);
        this.lowerarmLeft.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.6283F, -0.4887F, 0.2094F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 8, 44, -0.5445F, -0.4919F, -1.8823F, 2, 1, 2, 0.0F, false));

        this.frontfootLeft = new AdvancedModelRenderer(this);
        this.frontfootLeft.setRotationPoint(0.6135F, 1.1412F, -1.1289F);
        this.lowerarmLeft.addChild(frontfootLeft);
        this.setRotateAngle(frontfootLeft, 1.0893F, 0.1674F, -0.1001F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3674F, -0.2009F, 0.1559F);
        this.frontfootLeft.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.6485F, 0.507F, 0.803F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 38, 26, -0.5445F, -0.3919F, -2.8823F, 2, 1, 3, 0.0F, false));

        this.upperarmRight = new AdvancedModelRenderer(this);
        this.upperarmRight.setRotationPoint(-2.3F, 1.8F, -3.8F);
        this.main.addChild(upperarmRight);
        this.setRotateAngle(upperarmRight, 0.3025F, -0.1827F, 1.1571F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.upperarmRight.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.4887F, -0.2094F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 32, 36, -0.5305F, -1.0F, -2.8829F, 2, 1, 3, 0.0F, true));

        this.lowerarmRight = new AdvancedModelRenderer(this);
        this.lowerarmRight.setRotationPoint(-0.9943F, -0.2668F, -2.702F);
        this.upperarmRight.addChild(lowerarmRight);
        this.setRotateAngle(lowerarmRight, 0.2681F, -0.4443F, -0.6202F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.2373F, -0.2598F, 0.0532F);
        this.lowerarmRight.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6283F, 0.4887F, -0.2094F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 8, 44, -1.4555F, -0.4919F, -1.8823F, 2, 1, 2, 0.0F, true));

        this.frontfootRight = new AdvancedModelRenderer(this);
        this.frontfootRight.setRotationPoint(-0.6135F, 1.1412F, -1.1289F);
        this.lowerarmRight.addChild(frontfootRight);
        this.setRotateAngle(frontfootRight, 1.0893F, -0.1674F, 0.1001F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.3674F, -0.2009F, 0.1559F);
        this.frontfootRight.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -1.6485F, -0.507F, -0.803F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 38, 26, -1.4555F, -0.3919F, -2.8823F, 2, 1, 3, 0.0F, true));

        this.upperlegLeft = new AdvancedModelRenderer(this);
        this.upperlegLeft.setRotationPoint(2.3F, 1.8F, 4.2F);
        this.main.addChild(upperlegLeft);
        this.setRotateAngle(upperlegLeft, 0.0F, 0.2094F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperlegLeft.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.5934F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 5, -0.2759F, -0.6F, -1.0754F, 3, 1, 2, 0.0F, false));

        this.lowerlegLeft = new AdvancedModelRenderer(this);
        this.lowerlegLeft.setRotationPoint(2.2349F, -0.1F, -1.6098F);
        this.upperlegLeft.addChild(lowerlegLeft);
        this.setRotateAngle(lowerlegLeft, 0.6989F, -1.2903F, 2.1799F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.lowerlegLeft.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0294F, 0.5928F, 0.0526F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 40, -0.1759F, -0.5F, -1.0754F, 3, 1, 2, -0.01F, false));

        this.backfootLeft = new AdvancedModelRenderer(this);
        this.backfootLeft.setRotationPoint(2.0724F, 0.0F, -1.4732F);
        this.lowerlegLeft.addChild(backfootLeft);
        this.setRotateAngle(backfootLeft, -0.6355F, -1.1042F, -2.3782F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-2.0724F, 0.0F, 1.5732F);
        this.backfootLeft.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0294F, 0.5928F, 0.0526F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 41, 2.7241F, -0.5F, -1.0754F, 3, 1, 2, -0.01F, false));

        this.upperlegRight = new AdvancedModelRenderer(this);
        this.upperlegRight.setRotationPoint(-2.3F, 1.8F, 4.2F);
        this.main.addChild(upperlegRight);
        this.setRotateAngle(upperlegRight, 0.0F, -0.2094F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperlegRight.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.5934F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 42, 5, -2.7241F, -0.6F, -1.0754F, 3, 1, 2, 0.0F, true));

        this.lowerlegRight = new AdvancedModelRenderer(this);
        this.lowerlegRight.setRotationPoint(-2.2349F, -0.1F, -1.6098F);
        this.upperlegRight.addChild(lowerlegRight);
        this.setRotateAngle(lowerlegRight, 0.6989F, 1.2903F, -2.1799F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.lowerlegRight.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0294F, -0.5928F, -0.0526F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 40, -2.8241F, -0.5F, -1.0754F, 3, 1, 2, -0.01F, true));

        this.backfootRight = new AdvancedModelRenderer(this);
        this.backfootRight.setRotationPoint(-2.0724F, 0.0F, -1.4732F);
        this.lowerlegRight.addChild(backfootRight);
        this.setRotateAngle(backfootRight, -0.6355F, 1.1042F, 2.3782F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(2.0724F, 0.0F, 1.5732F);
        this.backfootRight.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0294F, -0.5928F, -0.0526F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 41, -5.7241F, -0.5F, -1.0754F, 3, 1, 2, -0.01F, true));
        

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
        this.main.offsetY = -1.8F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(140);
        this.main.rotateAngleX = (float)Math.toRadians(5);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraHoyasemys entityHoyasemys = (EntityPrehistoricFloraHoyasemys) e;

        if (entityHoyasemys.getAnimation() == entityHoyasemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.Tail};
        AdvancedModelRenderer[] Neck = {this.Neck, this.head};

        if (entityHoyasemys.getAnimation() == entityHoyasemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityHoyasemys.isReallyInWater()) {

                if (f3 == 0.0F || !entityHoyasemys.getIsMoving()) {
                    if (entityHoyasemys.getAnimation() != entityHoyasemys.EAT_ANIMATION
                        && entityHoyasemys.getAnimation() != entityHoyasemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityHoyasemys.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraHoyasemys ee = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                //Swimming pose:
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 12) * (0-(2)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-2-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -2 + (((tickAnim - 38) / 12) * (0-(-2)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));

        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -5 + (((tickAnim - 13) / 12) * (0-(-5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 5 + (((tickAnim - 38) / 12) * (0-(5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 5 + (((tickAnim - 13) / 12) * (0-(5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-5-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -5 + (((tickAnim - 38) / 12) * (0-(-5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.44735-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-6.64653-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.19198-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 1.44735 + (((tickAnim - 13) / 12) * (0-(1.44735)));
            yy = -6.64653 + (((tickAnim - 13) / 12) * (0-(-6.64653)));
            zz = 0.19198 + (((tickAnim - 13) / 12) * (0-(0.19198)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-2.80463-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (1.19337-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-0.53839-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.80463 + (((tickAnim - 38) / 12) * (0-(-2.80463)));
            yy = 1.19337 + (((tickAnim - 38) / 12) * (0-(1.19337)));
            zz = -0.53839 + (((tickAnim - 38) / 12) * (0-(-0.53839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmLeft, upperarmLeft.rotateAngleX + (float) Math.toRadians(xx), upperarmLeft.rotateAngleY + (float) Math.toRadians(yy), upperarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.29497-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (9.67224-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.67218-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 3.29497 + (((tickAnim - 13) / 12) * (0-(3.29497)));
            yy = 9.67224 + (((tickAnim - 13) / 12) * (0-(9.67224)));
            zz = -1.67218 + (((tickAnim - 13) / 12) * (0-(-1.67218)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmLeft, lowerarmLeft.rotateAngleX + (float) Math.toRadians(xx), lowerarmLeft.rotateAngleY + (float) Math.toRadians(yy), lowerarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.35282-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.3496-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.15976-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.35282 + (((tickAnim - 13) / 12) * (0-(-0.35282)));
            yy = -0.3496 + (((tickAnim - 13) / 12) * (0-(-0.3496)));
            zz = -0.15976 + (((tickAnim - 13) / 12) * (0-(-0.15976)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-1.80835-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (2.34997-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-3.04421-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -1.80835 + (((tickAnim - 38) / 12) * (0-(-1.80835)));
            yy = 2.34997 + (((tickAnim - 38) / 12) * (0-(2.34997)));
            zz = -3.04421 + (((tickAnim - 38) / 12) * (0-(-3.04421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootLeft, frontfootLeft.rotateAngleX + (float) Math.toRadians(xx), frontfootLeft.rotateAngleY + (float) Math.toRadians(yy), frontfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.80463-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.19337-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.53839-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -2.80463 + (((tickAnim - 13) / 12) * (0-(-2.80463)));
            yy = -1.19337 + (((tickAnim - 13) / 12) * (0-(-1.19337)));
            zz = 0.53839 + (((tickAnim - 13) / 12) * (0-(0.53839)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (1.44735-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (6.64653-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-0.19198-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.44735 + (((tickAnim - 38) / 12) * (0-(1.44735)));
            yy = 6.64653 + (((tickAnim - 38) / 12) * (0-(6.64653)));
            zz = -0.19198 + (((tickAnim - 38) / 12) * (0-(-0.19198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmRight, upperarmRight.rotateAngleX + (float) Math.toRadians(xx), upperarmRight.rotateAngleY + (float) Math.toRadians(yy), upperarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (3.29497-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-9.67224-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (1.67218-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.29497 + (((tickAnim - 38) / 12) * (0-(3.29497)));
            yy = -9.67224 + (((tickAnim - 38) / 12) * (0-(-9.67224)));
            zz = 1.67218 + (((tickAnim - 38) / 12) * (0-(1.67218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmRight, lowerarmRight.rotateAngleX + (float) Math.toRadians(xx), lowerarmRight.rotateAngleY + (float) Math.toRadians(yy), lowerarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.80835-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.34997-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.04421-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -1.80835 + (((tickAnim - 13) / 12) * (0-(-1.80835)));
            yy = -2.34997 + (((tickAnim - 13) / 12) * (0-(-2.34997)));
            zz = 3.04421 + (((tickAnim - 13) / 12) * (0-(3.04421)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-0.35282-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0.3496-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0.15976-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -0.35282 + (((tickAnim - 38) / 12) * (0-(-0.35282)));
            yy = 0.3496 + (((tickAnim - 38) / 12) * (0-(0.3496)));
            zz = 0.15976 + (((tickAnim - 38) / 12) * (0-(0.15976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootRight, frontfootRight.rotateAngleX + (float) Math.toRadians(xx), frontfootRight.rotateAngleY + (float) Math.toRadians(yy), frontfootRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (33.66484-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-17.5202-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-17.22311-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 33.66484 + (((tickAnim - 4) / 11) * (117.54888-(33.66484)));
            yy = -17.5202 + (((tickAnim - 4) / 11) * (-61.38828-(-17.5202)));
            zz = -17.22311 + (((tickAnim - 4) / 11) * (-35.75574-(-17.22311)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 117.54888 + (((tickAnim - 15) / 3) * (86.57827-(117.54888)));
            yy = -61.38828 + (((tickAnim - 15) / 3) * (-50.15069-(-61.38828)));
            zz = -35.75574 + (((tickAnim - 15) / 3) * (-27.47053-(-35.75574)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 86.57827 + (((tickAnim - 18) / 3) * (54.16107-(86.57827)));
            yy = -50.15069 + (((tickAnim - 18) / 3) * (-43.03711-(-50.15069)));
            zz = -27.47053 + (((tickAnim - 18) / 3) * (-17.60863-(-27.47053)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 54.16107 + (((tickAnim - 21) / 2) * (27.12651-(54.16107)));
            yy = -43.03711 + (((tickAnim - 21) / 2) * (-21.50824-(-43.03711)));
            zz = -17.60863 + (((tickAnim - 21) / 2) * (-16.81178-(-17.60863)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 27.12651 + (((tickAnim - 23) / 2) * (0-(27.12651)));
            yy = -21.50824 + (((tickAnim - 23) / 2) * (0-(-21.50824)));
            zz = -16.81178 + (((tickAnim - 23) / 2) * (0-(-16.81178)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (118.99517-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-7.84241-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-153.9319-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 118.99517 + (((tickAnim - 4) / 5) * (49.20786-(118.99517)));
            yy = -7.84241 + (((tickAnim - 4) / 5) * (14.1056-(-7.84241)));
            zz = -153.9319 + (((tickAnim - 4) / 5) * (-111.38983-(-153.9319)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 49.20786 + (((tickAnim - 9) / 6) * (-1.36859-(49.20786)));
            yy = 14.1056 + (((tickAnim - 9) / 6) * (49.98306-(14.1056)));
            zz = -111.38983 + (((tickAnim - 9) / 6) * (-80.64927-(-111.38983)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.36859 + (((tickAnim - 15) / 3) * (-4.6598-(-1.36859)));
            yy = 49.98306 + (((tickAnim - 15) / 3) * (29.73527-(49.98306)));
            zz = -80.64927 + (((tickAnim - 15) / 3) * (-43.56217-(-80.64927)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.6598 + (((tickAnim - 18) / 3) * (-49.39309-(-4.6598)));
            yy = 29.73527 + (((tickAnim - 18) / 3) * (1.58067-(29.73527)));
            zz = -43.56217 + (((tickAnim - 18) / 3) * (8.72724-(-43.56217)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -49.39309 + (((tickAnim - 21) / 2) * (-46.10996-(-49.39309)));
            yy = 1.58067 + (((tickAnim - 21) / 2) * (7.56737-(1.58067)));
            zz = 8.72724 + (((tickAnim - 21) / 2) * (29.22816-(8.72724)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -46.10996 + (((tickAnim - 23) / 2) * (0-(-46.10996)));
            yy = 7.56737 + (((tickAnim - 23) / 2) * (0-(7.56737)));
            zz = 29.22816 + (((tickAnim - 23) / 2) * (0-(29.22816)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (38.78922-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-2.93337-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-37.63643-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 38.78922 + (((tickAnim - 38) / 12) * (0-(38.78922)));
            yy = -2.93337 + (((tickAnim - 38) / 12) * (0-(-2.93337)));
            zz = -37.63643 + (((tickAnim - 38) / 12) * (0-(-37.63643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-16.01045-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-8.2677-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (34.42905-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -16.01045 + (((tickAnim - 4) / 5) * (-28.00181-(-16.01045)));
            yy = -8.2677 + (((tickAnim - 4) / 5) * (-4.91703-(-8.2677)));
            zz = 34.42905 + (((tickAnim - 4) / 5) * (50.64459-(34.42905)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -28.00181 + (((tickAnim - 9) / 6) * (-21.49448-(-28.00181)));
            yy = -4.91703 + (((tickAnim - 9) / 6) * (9.35073-(-4.91703)));
            zz = 50.64459 + (((tickAnim - 9) / 6) * (35.08112-(50.64459)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -21.49448 + (((tickAnim - 15) / 3) * (-21.01704-(-21.49448)));
            yy = 9.35073 + (((tickAnim - 15) / 3) * (12.41582-(9.35073)));
            zz = 35.08112 + (((tickAnim - 15) / 3) * (43.85352-(35.08112)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -21.01704 + (((tickAnim - 18) / 3) * (-15.9867-(-21.01704)));
            yy = 12.41582 + (((tickAnim - 18) / 3) * (10.60302-(12.41582)));
            zz = 43.85352 + (((tickAnim - 18) / 3) * (36.25655-(43.85352)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -15.9867 + (((tickAnim - 21) / 2) * (-9.06844-(-15.9867)));
            yy = 10.60302 + (((tickAnim - 21) / 2) * (-10.16808-(10.60302)));
            zz = 36.25655 + (((tickAnim - 21) / 2) * (15.04082-(36.25655)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -9.06844 + (((tickAnim - 23) / 2) * (0-(-9.06844)));
            yy = -10.16808 + (((tickAnim - 23) / 2) * (0-(-10.16808)));
            zz = 15.04082 + (((tickAnim - 23) / 2) * (0-(15.04082)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-4.98608-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-3.26509-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (5.45867-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4.98608 + (((tickAnim - 38) / 12) * (0-(-4.98608)));
            yy = -3.26509 + (((tickAnim - 38) / 12) * (0-(-3.26509)));
            zz = 5.45867 + (((tickAnim - 38) / 12) * (0-(5.45867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootLeft, backfootLeft.rotateAngleX + (float) Math.toRadians(xx), backfootLeft.rotateAngleY + (float) Math.toRadians(yy), backfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (33.66484-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (17.5202-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (17.22311-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 33.66484 + (((tickAnim - 29) / 11) * (117.54888-(33.66484)));
            yy = 17.5202 + (((tickAnim - 29) / 11) * (61.38828-(17.5202)));
            zz = 17.22311 + (((tickAnim - 29) / 11) * (35.75574-(17.22311)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 117.54888 + (((tickAnim - 40) / 3) * (86.57827-(117.54888)));
            yy = 61.38828 + (((tickAnim - 40) / 3) * (50.15069-(61.38828)));
            zz = 35.75574 + (((tickAnim - 40) / 3) * (27.47053-(35.75574)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 86.57827 + (((tickAnim - 43) / 3) * (54.16107-(86.57827)));
            yy = 50.15069 + (((tickAnim - 43) / 3) * (43.03711-(50.15069)));
            zz = 27.47053 + (((tickAnim - 43) / 3) * (17.60863-(27.47053)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 54.16107 + (((tickAnim - 46) / 2) * (27.12651-(54.16107)));
            yy = 43.03711 + (((tickAnim - 46) / 2) * (21.50824-(43.03711)));
            zz = 17.60863 + (((tickAnim - 46) / 2) * (16.81178-(17.60863)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 27.12651 + (((tickAnim - 48) / 2) * (0-(27.12651)));
            yy = 21.50824 + (((tickAnim - 48) / 2) * (0-(21.50824)));
            zz = 16.81178 + (((tickAnim - 48) / 2) * (0-(16.81178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (38.78922-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.93337-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (37.63643-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 38.78922 + (((tickAnim - 13) / 12) * (0-(38.78922)));
            yy = 2.93337 + (((tickAnim - 13) / 12) * (0-(2.93337)));
            zz = 37.63643 + (((tickAnim - 13) / 12) * (0-(37.63643)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (118.99517-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (7.84241-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (153.9319-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 118.99517 + (((tickAnim - 29) / 5) * (49.20786-(118.99517)));
            yy = 7.84241 + (((tickAnim - 29) / 5) * (-14.1056-(7.84241)));
            zz = 153.9319 + (((tickAnim - 29) / 5) * (111.38983-(153.9319)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 49.20786 + (((tickAnim - 34) / 6) * (-1.36859-(49.20786)));
            yy = -14.1056 + (((tickAnim - 34) / 6) * (-49.98306-(-14.1056)));
            zz = 111.38983 + (((tickAnim - 34) / 6) * (80.64927-(111.38983)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -1.36859 + (((tickAnim - 40) / 3) * (-4.6598-(-1.36859)));
            yy = -49.98306 + (((tickAnim - 40) / 3) * (-29.73527-(-49.98306)));
            zz = 80.64927 + (((tickAnim - 40) / 3) * (43.56217-(80.64927)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -4.6598 + (((tickAnim - 43) / 3) * (-49.39309-(-4.6598)));
            yy = -29.73527 + (((tickAnim - 43) / 3) * (-1.58067-(-29.73527)));
            zz = 43.56217 + (((tickAnim - 43) / 3) * (-8.72724-(43.56217)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -49.39309 + (((tickAnim - 46) / 2) * (-46.10996-(-49.39309)));
            yy = -1.58067 + (((tickAnim - 46) / 2) * (-7.56737-(-1.58067)));
            zz = -8.72724 + (((tickAnim - 46) / 2) * (-29.22816-(-8.72724)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -46.10996 + (((tickAnim - 48) / 2) * (0-(-46.10996)));
            yy = -7.56737 + (((tickAnim - 48) / 2) * (0-(-7.56737)));
            zz = -29.22816 + (((tickAnim - 48) / 2) * (0-(-29.22816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.98608-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.26509-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-5.45867-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -4.98608 + (((tickAnim - 13) / 12) * (0-(-4.98608)));
            yy = 3.26509 + (((tickAnim - 13) / 12) * (0-(3.26509)));
            zz = -5.45867 + (((tickAnim - 13) / 12) * (0-(-5.45867)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (-16.01045-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (8.2677-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (-34.42905-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -16.01045 + (((tickAnim - 29) / 5) * (-28.00181-(-16.01045)));
            yy = 8.2677 + (((tickAnim - 29) / 5) * (4.91703-(8.2677)));
            zz = -34.42905 + (((tickAnim - 29) / 5) * (-50.64459-(-34.42905)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -28.00181 + (((tickAnim - 34) / 6) * (-21.49448-(-28.00181)));
            yy = 4.91703 + (((tickAnim - 34) / 6) * (-9.35073-(4.91703)));
            zz = -50.64459 + (((tickAnim - 34) / 6) * (-35.08112-(-50.64459)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -21.49448 + (((tickAnim - 40) / 3) * (-21.01704-(-21.49448)));
            yy = -9.35073 + (((tickAnim - 40) / 3) * (-12.41582-(-9.35073)));
            zz = -35.08112 + (((tickAnim - 40) / 3) * (-43.85352-(-35.08112)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -21.01704 + (((tickAnim - 43) / 3) * (-15.9867-(-21.01704)));
            yy = -12.41582 + (((tickAnim - 43) / 3) * (-10.60302-(-12.41582)));
            zz = -43.85352 + (((tickAnim - 43) / 3) * (-36.25655-(-43.85352)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -15.9867 + (((tickAnim - 46) / 2) * (-9.06844-(-15.9867)));
            yy = -10.60302 + (((tickAnim - 46) / 2) * (10.16808-(-10.60302)));
            zz = -36.25655 + (((tickAnim - 46) / 2) * (-15.04082-(-36.25655)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -9.06844 + (((tickAnim - 48) / 2) * (0-(-9.06844)));
            yy = 10.16808 + (((tickAnim - 48) / 2) * (0-(10.16808)));
            zz = -15.04082 + (((tickAnim - 48) / 2) * (0-(-15.04082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootRight, backfootRight.rotateAngleX + (float) Math.toRadians(xx), backfootRight.rotateAngleY + (float) Math.toRadians(yy), backfootRight.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -5 + (((tickAnim - 19) / 19) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 38) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 19) * (-0.9-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            yy = -0.9 + (((tickAnim - 19) / 19) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.9 + (((tickAnim - 38) / 12) * (-0.3-(-0.9)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 7 + (((tickAnim - 19) / 19) * (7-(7)));
            yy = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-2.19505-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.73957-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (7.6554-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -2.19505 + (((tickAnim - 19) / 19) * (-2.19505-(-2.19505)));
            yy = -6.73957 + (((tickAnim - 19) / 19) * (-6.73957-(-6.73957)));
            zz = 7.6554 + (((tickAnim - 19) / 19) * (7.6554-(7.6554)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.19505 + (((tickAnim - 38) / 12) * (0-(-2.19505)));
            yy = -6.73957 + (((tickAnim - 38) / 12) * (0-(-6.73957)));
            zz = 7.6554 + (((tickAnim - 38) / 12) * (0-(7.6554)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmLeft, upperarmLeft.rotateAngleX + (float) Math.toRadians(xx), upperarmLeft.rotateAngleY + (float) Math.toRadians(yy), upperarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9.6481-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.82045-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (2.48662-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 9.6481 + (((tickAnim - 19) / 19) * (9.6481-(9.6481)));
            yy = 4.82045 + (((tickAnim - 19) / 19) * (4.82045-(4.82045)));
            zz = 2.48662 + (((tickAnim - 19) / 19) * (2.48662-(2.48662)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.6481 + (((tickAnim - 38) / 12) * (0-(9.6481)));
            yy = 4.82045 + (((tickAnim - 38) / 12) * (0-(4.82045)));
            zz = 2.48662 + (((tickAnim - 38) / 12) * (0-(2.48662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmLeft, lowerarmLeft.rotateAngleX + (float) Math.toRadians(xx), lowerarmLeft.rotateAngleY + (float) Math.toRadians(yy), lowerarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9.02431-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.2086-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-6.50886-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 9.02431 + (((tickAnim - 19) / 19) * (9.02431-(9.02431)));
            yy = -2.2086 + (((tickAnim - 19) / 19) * (-2.2086-(-2.2086)));
            zz = -6.50886 + (((tickAnim - 19) / 19) * (-6.50886-(-6.50886)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.02431 + (((tickAnim - 38) / 12) * (0-(9.02431)));
            yy = -2.2086 + (((tickAnim - 38) / 12) * (0-(-2.2086)));
            zz = -6.50886 + (((tickAnim - 38) / 12) * (0-(-6.50886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootLeft, frontfootLeft.rotateAngleX + (float) Math.toRadians(xx), frontfootLeft.rotateAngleY + (float) Math.toRadians(yy), frontfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-2.19505-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (6.73957-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-7.6554-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -2.19505 + (((tickAnim - 19) / 19) * (-2.19505-(-2.19505)));
            yy = 6.73957 + (((tickAnim - 19) / 19) * (6.73957-(6.73957)));
            zz = -7.6554 + (((tickAnim - 19) / 19) * (-7.6554-(-7.6554)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.19505 + (((tickAnim - 38) / 12) * (0-(-2.19505)));
            yy = 6.73957 + (((tickAnim - 38) / 12) * (0-(6.73957)));
            zz = -7.6554 + (((tickAnim - 38) / 12) * (0-(-7.6554)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmRight, upperarmRight.rotateAngleX + (float) Math.toRadians(xx), upperarmRight.rotateAngleY + (float) Math.toRadians(yy), upperarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9.6481-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.82045-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-2.48662-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 9.6481 + (((tickAnim - 19) / 19) * (9.6481-(9.6481)));
            yy = -4.82045 + (((tickAnim - 19) / 19) * (-4.82045-(-4.82045)));
            zz = -2.48662 + (((tickAnim - 19) / 19) * (-2.48662-(-2.48662)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.6481 + (((tickAnim - 38) / 12) * (0-(9.6481)));
            yy = -4.82045 + (((tickAnim - 38) / 12) * (0-(-4.82045)));
            zz = -2.48662 + (((tickAnim - 38) / 12) * (0-(-2.48662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmRight, lowerarmRight.rotateAngleX + (float) Math.toRadians(xx), lowerarmRight.rotateAngleY + (float) Math.toRadians(yy), lowerarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.0753-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.30626-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (5.12101-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 8.0753 + (((tickAnim - 19) / 19) * (8.0753-(8.0753)));
            yy = 1.30626 + (((tickAnim - 19) / 19) * (1.30626-(1.30626)));
            zz = 5.12101 + (((tickAnim - 19) / 19) * (5.12101-(5.12101)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 8.0753 + (((tickAnim - 38) / 12) * (0-(8.0753)));
            yy = 1.30626 + (((tickAnim - 38) / 12) * (0-(1.30626)));
            zz = 5.12101 + (((tickAnim - 38) / 12) * (0-(5.12101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootRight, frontfootRight.rotateAngleX + (float) Math.toRadians(xx), frontfootRight.rotateAngleY + (float) Math.toRadians(yy), frontfootRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-14.76087-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (7.48616-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-5.53378-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -14.76087 + (((tickAnim - 19) / 19) * (-14.76087-(-14.76087)));
            yy = 7.48616 + (((tickAnim - 19) / 19) * (7.48616-(7.48616)));
            zz = -5.53378 + (((tickAnim - 19) / 19) * (-5.53378-(-5.53378)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -14.76087 + (((tickAnim - 38) / 12) * (0-(-14.76087)));
            yy = 7.48616 + (((tickAnim - 38) / 12) * (0-(7.48616)));
            zz = -5.53378 + (((tickAnim - 38) / 12) * (0-(-5.53378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-102.41791-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.69043-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (112.38755-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -102.41791 + (((tickAnim - 19) / 19) * (-102.41791-(-102.41791)));
            yy = 1.69043 + (((tickAnim - 19) / 19) * (1.69043-(1.69043)));
            zz = 112.38755 + (((tickAnim - 19) / 19) * (112.38755-(112.38755)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -102.41791 + (((tickAnim - 38) / 12) * (0-(-102.41791)));
            yy = 1.69043 + (((tickAnim - 38) / 12) * (0-(1.69043)));
            zz = 112.38755 + (((tickAnim - 38) / 12) * (0-(112.38755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3.23624-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-3.32645-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-14.38286-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 3.23624 + (((tickAnim - 19) / 19) * (3.23624-(3.23624)));
            yy = -3.32645 + (((tickAnim - 19) / 19) * (-3.32645-(-3.32645)));
            zz = -14.38286 + (((tickAnim - 19) / 19) * (-14.38286-(-14.38286)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.23624 + (((tickAnim - 38) / 12) * (0-(3.23624)));
            yy = -3.32645 + (((tickAnim - 38) / 12) * (0-(-3.32645)));
            zz = -14.38286 + (((tickAnim - 38) / 12) * (0-(-14.38286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootLeft, backfootLeft.rotateAngleX + (float) Math.toRadians(xx), backfootLeft.rotateAngleY + (float) Math.toRadians(yy), backfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-14.76087-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-7.48616-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (5.53378-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -14.76087 + (((tickAnim - 19) / 19) * (-14.76087-(-14.76087)));
            yy = -7.48616 + (((tickAnim - 19) / 19) * (-7.48616-(-7.48616)));
            zz = 5.53378 + (((tickAnim - 19) / 19) * (5.53378-(5.53378)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -14.76087 + (((tickAnim - 38) / 12) * (0-(-14.76087)));
            yy = -7.48616 + (((tickAnim - 38) / 12) * (0-(-7.48616)));
            zz = 5.53378 + (((tickAnim - 38) / 12) * (0-(5.53378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-102.41791-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.69043-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-112.38755-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = -102.41791 + (((tickAnim - 19) / 19) * (-102.41791-(-102.41791)));
            yy = -1.69043 + (((tickAnim - 19) / 19) * (-1.69043-(-1.69043)));
            zz = -112.38755 + (((tickAnim - 19) / 19) * (-112.38755-(-112.38755)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -102.41791 + (((tickAnim - 38) / 12) * (0-(-102.41791)));
            yy = -1.69043 + (((tickAnim - 38) / 12) * (0-(-1.69043)));
            zz = -112.38755 + (((tickAnim - 38) / 12) * (0-(-112.38755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3.23624-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (3.32645-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (14.38286-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 3.23624 + (((tickAnim - 19) / 19) * (3.23624-(3.23624)));
            yy = 3.32645 + (((tickAnim - 19) / 19) * (3.32645-(3.32645)));
            zz = 14.38286 + (((tickAnim - 19) / 19) * (14.38286-(14.38286)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.23624 + (((tickAnim - 38) / 12) * (0-(3.23624)));
            yy = 3.32645 + (((tickAnim - 38) / 12) * (0-(3.32645)));
            zz = 14.38286 + (((tickAnim - 38) / 12) * (0-(14.38286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootRight, backfootRight.rotateAngleX + (float) Math.toRadians(xx), backfootRight.rotateAngleY + (float) Math.toRadians(yy), backfootRight.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 11) / 7) * (1.71429-(5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1.71429 + (((tickAnim - 18) / 10) * (7.87363-(1.71429)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 7.87363 + (((tickAnim - 28) / 12) * (0-(7.87363)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 11 + (((tickAnim - 7) / 9) * (12.975-(11)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 12.975 + (((tickAnim - 16) / 9) * (4.05345-(12.975)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 4.05345 + (((tickAnim - 25) / 8) * (9.80153-(4.05345)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 9.80153 + (((tickAnim - 33) / 7) * (0-(9.80153)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (23-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 23 + (((tickAnim - 11) / 4) * (0-(23)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (23-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 23 + (((tickAnim - 27) / 4) * (0-(23)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.66-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.66 + (((tickAnim - 6) / 7) * (-1.06-(-0.66)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -1.06 + (((tickAnim - 13) / 7) * (-0.9-(-1.06)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 20) / 560) * (0-(0)));
            yy = -0.9 + (((tickAnim - 20) / 560) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 20) / 560) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 588) {
            xx = 0 + (((tickAnim - 580) / 8) * (0-(0)));
            yy = -0.9 + (((tickAnim - 580) / 8) * (-1.06-(-0.9)));
            zz = 0 + (((tickAnim - 580) / 8) * (0-(0)));
        }
        else if (tickAnim >= 588 && tickAnim < 594) {
            xx = 0 + (((tickAnim - 588) / 6) * (0-(0)));
            yy = -1.06 + (((tickAnim - 588) / 6) * (-0.66-(-1.06)));
            zz = 0 + (((tickAnim - 588) / 6) * (0-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 594) / 6) * (0-(0)));
            yy = -0.66 + (((tickAnim - 594) / 6) * (0-(-0.66)));
            zz = 0 + (((tickAnim - 594) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 594) {
            xx = 17 + (((tickAnim - 6) / 588) * (17-(17)));
            yy = 0 + (((tickAnim - 6) / 588) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 588) * (0-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 600) {
            xx = 17 + (((tickAnim - 594) / 6) * (0-(17)));
            yy = 0 + (((tickAnim - 594) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 594) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 20) / 560) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 560) * (-0.5-(-0.5)));
            zz = 1.6 + (((tickAnim - 20) / 560) * (1.6-(1.6)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 580) / 20) * (0-(-0.5)));
            zz = 1.6 + (((tickAnim - 580) / 20) * (0-(1.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 594) {
            xx = -19 + (((tickAnim - 6) / 588) * (-19-(-19)));
            yy = 0 + (((tickAnim - 6) / 588) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 588) * (0-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 600) {
            xx = -19 + (((tickAnim - 594) / 6) * (0-(-19)));
            yy = 0 + (((tickAnim - 594) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 594) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.13-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.39-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -0.13 + (((tickAnim - 8) / 12) * (-0.3-(-0.13)));
            zz = 1.39 + (((tickAnim - 8) / 12) * (1.9-(1.39)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 20) / 560) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 560) * (-0.3-(-0.3)));
            zz = 1.9 + (((tickAnim - 20) / 560) * (1.9-(1.9)));
        }
        else if (tickAnim >= 580 && tickAnim < 592) {
            xx = 0 + (((tickAnim - 580) / 12) * (0-(0)));
            yy = -0.3 + (((tickAnim - 580) / 12) * (-0.13-(-0.3)));
            zz = 1.9 + (((tickAnim - 580) / 12) * (1.39-(1.9)));
        }
        else if (tickAnim >= 592 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 592) / 8) * (0-(0)));
            yy = -0.13 + (((tickAnim - 592) / 8) * (0-(-0.13)));
            zz = 1.39 + (((tickAnim - 592) / 8) * (0-(1.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.17091-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.26646-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-30.06942-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -28.17091 + (((tickAnim - 20) / 560) * (-28.17091-(-28.17091)));
            yy = 11.26646 + (((tickAnim - 20) / 560) * (11.26646-(11.26646)));
            zz = -30.06942 + (((tickAnim - 20) / 560) * (-30.06942-(-30.06942)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -28.17091 + (((tickAnim - 580) / 20) * (0-(-28.17091)));
            yy = 11.26646 + (((tickAnim - 580) / 20) * (0-(11.26646)));
            zz = -30.06942 + (((tickAnim - 580) / 20) * (0-(-30.06942)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmLeft, upperarmLeft.rotateAngleX + (float) Math.toRadians(xx), upperarmLeft.rotateAngleY + (float) Math.toRadians(yy), upperarmLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -0.6 + (((tickAnim - 20) / 560) * (-0.6-(-0.6)));
            yy = 0.6 + (((tickAnim - 20) / 560) * (0.6-(0.6)));
            zz = 2.2 + (((tickAnim - 20) / 560) * (2.2-(2.2)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -0.6 + (((tickAnim - 580) / 20) * (0-(-0.6)));
            yy = 0.6 + (((tickAnim - 580) / 20) * (0-(0.6)));
            zz = 2.2 + (((tickAnim - 580) / 20) * (0-(2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmLeft.rotationPointX = this.upperarmLeft.rotationPointX + (float)(xx);
        this.upperarmLeft.rotationPointY = this.upperarmLeft.rotationPointY - (float)(yy);
        this.upperarmLeft.rotationPointZ = this.upperarmLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.30742-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-12.94834-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-23.52695-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.30742 + (((tickAnim - 3) / 4) * (31.29475-(17.30742)));
            yy = -12.94834 + (((tickAnim - 3) / 4) * (-18.43086-(-12.94834)));
            zz = -23.52695 + (((tickAnim - 3) / 4) * (-21.07906-(-23.52695)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 31.29475 + (((tickAnim - 7) / 13) * (-6.20983-(31.29475)));
            yy = -18.43086 + (((tickAnim - 7) / 13) * (-0.12858-(-18.43086)));
            zz = -21.07906 + (((tickAnim - 7) / 13) * (-38.41699-(-21.07906)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -6.20983 + (((tickAnim - 20) / 560) * (-6.20983-(-6.20983)));
            yy = -0.12858 + (((tickAnim - 20) / 560) * (-0.12858-(-0.12858)));
            zz = -38.41699 + (((tickAnim - 20) / 560) * (-38.41699-(-38.41699)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = -6.20983 + (((tickAnim - 580) / 13) * (31.29475-(-6.20983)));
            yy = -0.12858 + (((tickAnim - 580) / 13) * (-18.43086-(-0.12858)));
            zz = -38.41699 + (((tickAnim - 580) / 13) * (-21.07906-(-38.41699)));
        }
        else if (tickAnim >= 593 && tickAnim < 597) {
            xx = 31.29475 + (((tickAnim - 593) / 4) * (17.30742-(31.29475)));
            yy = -18.43086 + (((tickAnim - 593) / 4) * (-12.94834-(-18.43086)));
            zz = -21.07906 + (((tickAnim - 593) / 4) * (-23.52695-(-21.07906)));
        }
        else if (tickAnim >= 597 && tickAnim < 600) {
            xx = 17.30742 + (((tickAnim - 597) / 3) * (0-(17.30742)));
            yy = -12.94834 + (((tickAnim - 597) / 3) * (0-(-12.94834)));
            zz = -23.52695 + (((tickAnim - 597) / 3) * (0-(-23.52695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmLeft, lowerarmLeft.rotateAngleX + (float) Math.toRadians(xx), lowerarmLeft.rotateAngleY + (float) Math.toRadians(yy), lowerarmLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmLeft.rotationPointX = this.lowerarmLeft.rotationPointX + (float)(xx);
        this.lowerarmLeft.rotationPointY = this.lowerarmLeft.rotationPointY - (float)(yy);
        this.lowerarmLeft.rotationPointZ = this.lowerarmLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (55.77321-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.29033-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.35435-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 55.77321 + (((tickAnim - 5) / 2) * (68.02332-(55.77321)));
            yy = 3.29033 + (((tickAnim - 5) / 2) * (16.10468-(3.29033)));
            zz = -1.35435 + (((tickAnim - 5) / 2) * (5.37832-(-1.35435)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 68.02332 + (((tickAnim - 7) / 13) * (102.75768-(68.02332)));
            yy = 16.10468 + (((tickAnim - 7) / 13) * (-7.72233-(16.10468)));
            zz = 5.37832 + (((tickAnim - 7) / 13) * (61.0573-(5.37832)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 102.75768 + (((tickAnim - 20) / 560) * (102.75768-(102.75768)));
            yy = -7.72233 + (((tickAnim - 20) / 560) * (-7.72233-(-7.72233)));
            zz = 61.0573 + (((tickAnim - 20) / 560) * (61.0573-(61.0573)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 102.75768 + (((tickAnim - 580) / 13) * (68.02332-(102.75768)));
            yy = -7.72233 + (((tickAnim - 580) / 13) * (16.10468-(-7.72233)));
            zz = 61.0573 + (((tickAnim - 580) / 13) * (5.37832-(61.0573)));
        }
        else if (tickAnim >= 593 && tickAnim < 595) {
            xx = 68.02332 + (((tickAnim - 593) / 2) * (55.77321-(68.02332)));
            yy = 16.10468 + (((tickAnim - 593) / 2) * (3.29033-(16.10468)));
            zz = 5.37832 + (((tickAnim - 593) / 2) * (-1.35435-(5.37832)));
        }
        else if (tickAnim >= 595 && tickAnim < 600) {
            xx = 55.77321 + (((tickAnim - 595) / 5) * (0-(55.77321)));
            yy = 3.29033 + (((tickAnim - 595) / 5) * (0-(3.29033)));
            zz = -1.35435 + (((tickAnim - 595) / 5) * (0-(-1.35435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootLeft, frontfootLeft.rotateAngleX + (float) Math.toRadians(xx), frontfootLeft.rotateAngleY + (float) Math.toRadians(yy), frontfootLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontfootLeft.rotationPointX = this.frontfootLeft.rotationPointX + (float)(xx);
        this.frontfootLeft.rotationPointY = this.frontfootLeft.rotationPointY - (float)(yy);
        this.frontfootLeft.rotationPointZ = this.frontfootLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.17091-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.26646-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (30.06942-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -28.17091 + (((tickAnim - 20) / 560) * (-28.17091-(-28.17091)));
            yy = -11.26646 + (((tickAnim - 20) / 560) * (-11.26646-(-11.26646)));
            zz = 30.06942 + (((tickAnim - 20) / 560) * (30.06942-(30.06942)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -28.17091 + (((tickAnim - 580) / 20) * (0-(-28.17091)));
            yy = -11.26646 + (((tickAnim - 580) / 20) * (0-(-11.26646)));
            zz = 30.06942 + (((tickAnim - 580) / 20) * (0-(30.06942)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmRight, upperarmRight.rotateAngleX + (float) Math.toRadians(xx), upperarmRight.rotateAngleY + (float) Math.toRadians(yy), upperarmRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 0.6 + (((tickAnim - 20) / 560) * (0.6-(0.6)));
            yy = 0.6 + (((tickAnim - 20) / 560) * (0.6-(0.6)));
            zz = 2.2 + (((tickAnim - 20) / 560) * (2.2-(2.2)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 0.6 + (((tickAnim - 580) / 20) * (0-(0.6)));
            yy = 0.6 + (((tickAnim - 580) / 20) * (0-(0.6)));
            zz = 2.2 + (((tickAnim - 580) / 20) * (0-(2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmRight.rotationPointX = this.upperarmRight.rotationPointX + (float)(xx);
        this.upperarmRight.rotationPointY = this.upperarmRight.rotationPointY - (float)(yy);
        this.upperarmRight.rotationPointZ = this.upperarmRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.30742-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (12.94834-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (23.52695-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.30742 + (((tickAnim - 3) / 4) * (31.29475-(17.30742)));
            yy = 12.94834 + (((tickAnim - 3) / 4) * (18.43086-(12.94834)));
            zz = 23.52695 + (((tickAnim - 3) / 4) * (21.07906-(23.52695)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 31.29475 + (((tickAnim - 7) / 13) * (-6.20983-(31.29475)));
            yy = 18.43086 + (((tickAnim - 7) / 13) * (0.12858-(18.43086)));
            zz = 21.07906 + (((tickAnim - 7) / 13) * (38.41699-(21.07906)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -6.20983 + (((tickAnim - 20) / 560) * (-6.20983-(-6.20983)));
            yy = 0.12858 + (((tickAnim - 20) / 560) * (0.12858-(0.12858)));
            zz = 38.41699 + (((tickAnim - 20) / 560) * (38.41699-(38.41699)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = -6.20983 + (((tickAnim - 580) / 13) * (31.29475-(-6.20983)));
            yy = 0.12858 + (((tickAnim - 580) / 13) * (18.43086-(0.12858)));
            zz = 38.41699 + (((tickAnim - 580) / 13) * (21.07906-(38.41699)));
        }
        else if (tickAnim >= 593 && tickAnim < 597) {
            xx = 31.29475 + (((tickAnim - 593) / 4) * (17.30742-(31.29475)));
            yy = 18.43086 + (((tickAnim - 593) / 4) * (12.94834-(18.43086)));
            zz = 21.07906 + (((tickAnim - 593) / 4) * (23.52695-(21.07906)));
        }
        else if (tickAnim >= 597 && tickAnim < 600) {
            xx = 17.30742 + (((tickAnim - 597) / 3) * (0-(17.30742)));
            yy = 12.94834 + (((tickAnim - 597) / 3) * (0-(12.94834)));
            zz = 23.52695 + (((tickAnim - 597) / 3) * (0-(23.52695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmRight, lowerarmRight.rotateAngleX + (float) Math.toRadians(xx), lowerarmRight.rotateAngleY + (float) Math.toRadians(yy), lowerarmRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmRight.rotationPointX = this.lowerarmRight.rotationPointX + (float)(xx);
        this.lowerarmRight.rotationPointY = this.lowerarmRight.rotationPointY - (float)(yy);
        this.lowerarmRight.rotationPointZ = this.lowerarmRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (55.77321-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.29033-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.35435-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 55.77321 + (((tickAnim - 5) / 2) * (68.02332-(55.77321)));
            yy = -3.29033 + (((tickAnim - 5) / 2) * (-16.10468-(-3.29033)));
            zz = 1.35435 + (((tickAnim - 5) / 2) * (-5.37832-(1.35435)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 68.02332 + (((tickAnim - 7) / 13) * (102.75768-(68.02332)));
            yy = -16.10468 + (((tickAnim - 7) / 13) * (7.72233-(-16.10468)));
            zz = -5.37832 + (((tickAnim - 7) / 13) * (-61.0573-(-5.37832)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 102.75768 + (((tickAnim - 20) / 560) * (102.75768-(102.75768)));
            yy = 7.72233 + (((tickAnim - 20) / 560) * (7.72233-(7.72233)));
            zz = -61.0573 + (((tickAnim - 20) / 560) * (-61.0573-(-61.0573)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 102.75768 + (((tickAnim - 580) / 13) * (68.02332-(102.75768)));
            yy = 7.72233 + (((tickAnim - 580) / 13) * (-16.10468-(7.72233)));
            zz = -61.0573 + (((tickAnim - 580) / 13) * (-5.37832-(-61.0573)));
        }
        else if (tickAnim >= 593 && tickAnim < 595) {
            xx = 68.02332 + (((tickAnim - 593) / 2) * (55.77321-(68.02332)));
            yy = -16.10468 + (((tickAnim - 593) / 2) * (-3.29033-(-16.10468)));
            zz = -5.37832 + (((tickAnim - 593) / 2) * (1.35435-(-5.37832)));
        }
        else if (tickAnim >= 595 && tickAnim < 600) {
            xx = 55.77321 + (((tickAnim - 595) / 5) * (0-(55.77321)));
            yy = -3.29033 + (((tickAnim - 595) / 5) * (0-(-3.29033)));
            zz = 1.35435 + (((tickAnim - 595) / 5) * (0-(1.35435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootRight, frontfootRight.rotateAngleX + (float) Math.toRadians(xx), frontfootRight.rotateAngleY + (float) Math.toRadians(yy), frontfootRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontfootRight.rotationPointX = this.frontfootRight.rotationPointX + (float)(xx);
        this.frontfootRight.rotationPointY = this.frontfootRight.rotationPointY - (float)(yy);
        this.frontfootRight.rotationPointZ = this.frontfootRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (69.78465-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-32.79287-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-33.2485-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 69.78465 + (((tickAnim - 20) / 560) * (69.78465-(69.78465)));
            yy = -32.79287 + (((tickAnim - 20) / 560) * (-32.79287-(-32.79287)));
            zz = -33.2485 + (((tickAnim - 20) / 560) * (-33.2485-(-33.2485)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 69.78465 + (((tickAnim - 580) / 20) * (0-(69.78465)));
            yy = -32.79287 + (((tickAnim - 580) / 20) * (0-(-32.79287)));
            zz = -33.2485 + (((tickAnim - 580) / 20) * (0-(-33.2485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = -1.3 + (((tickAnim - 20) / 560) * (-1.3-(-1.3)));
            yy = 0.5 + (((tickAnim - 20) / 560) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 20) / 560) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -1.3 + (((tickAnim - 580) / 20) * (0-(-1.3)));
            yy = 0.5 + (((tickAnim - 580) / 20) * (0-(0.5)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegLeft.rotationPointX = this.upperlegLeft.rotationPointX + (float)(xx);
        this.upperlegLeft.rotationPointY = this.upperlegLeft.rotationPointY - (float)(yy);
        this.upperlegLeft.rotationPointZ = this.upperlegLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-32.25008-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.78145-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (21.10312-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -32.25008 + (((tickAnim - 8) / 12) * (8.83934-(-32.25008)));
            yy = -11.78145 + (((tickAnim - 8) / 12) * (3.01057-(-11.78145)));
            zz = 21.10312 + (((tickAnim - 8) / 12) * (-33.81876-(21.10312)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 8.83934 + (((tickAnim - 20) / 560) * (8.83934-(8.83934)));
            yy = 3.01057 + (((tickAnim - 20) / 560) * (3.01057-(3.01057)));
            zz = -33.81876 + (((tickAnim - 20) / 560) * (-33.81876-(-33.81876)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 8.83934 + (((tickAnim - 580) / 13) * (-32.25008-(8.83934)));
            yy = 3.01057 + (((tickAnim - 580) / 13) * (-11.78145-(3.01057)));
            zz = -33.81876 + (((tickAnim - 580) / 13) * (21.10312-(-33.81876)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -32.25008 + (((tickAnim - 593) / 7) * (0-(-32.25008)));
            yy = -11.78145 + (((tickAnim - 593) / 7) * (0-(-11.78145)));
            zz = 21.10312 + (((tickAnim - 593) / 7) * (0-(21.10312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-41.54078-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (9.10839-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (8.52648-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -41.54078 + (((tickAnim - 8) / 12) * (49.17318-(-41.54078)));
            yy = 9.10839 + (((tickAnim - 8) / 12) * (0.33032-(9.10839)));
            zz = 8.52648 + (((tickAnim - 8) / 12) * (-53.64384-(8.52648)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 49.17318 + (((tickAnim - 20) / 560) * (49.17318-(49.17318)));
            yy = 0.33032 + (((tickAnim - 20) / 560) * (0.33032-(0.33032)));
            zz = -53.64384 + (((tickAnim - 20) / 560) * (-53.64384-(-53.64384)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 49.17318 + (((tickAnim - 580) / 13) * (-41.54078-(49.17318)));
            yy = 0.33032 + (((tickAnim - 580) / 13) * (9.10839-(0.33032)));
            zz = -53.64384 + (((tickAnim - 580) / 13) * (8.52648-(-53.64384)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -41.54078 + (((tickAnim - 593) / 7) * (0-(-41.54078)));
            yy = 9.10839 + (((tickAnim - 593) / 7) * (0-(9.10839)));
            zz = 8.52648 + (((tickAnim - 593) / 7) * (0-(8.52648)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootLeft, backfootLeft.rotateAngleX + (float) Math.toRadians(xx), backfootLeft.rotateAngleY + (float) Math.toRadians(yy), backfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (69.78465-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (32.79287-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (33.2485-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 69.78465 + (((tickAnim - 20) / 560) * (69.78465-(69.78465)));
            yy = 32.79287 + (((tickAnim - 20) / 560) * (32.79287-(32.79287)));
            zz = 33.2485 + (((tickAnim - 20) / 560) * (33.2485-(33.2485)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 69.78465 + (((tickAnim - 580) / 20) * (0-(69.78465)));
            yy = 32.79287 + (((tickAnim - 580) / 20) * (0-(32.79287)));
            zz = 33.2485 + (((tickAnim - 580) / 20) * (0-(33.2485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 1.3 + (((tickAnim - 20) / 560) * (1.3-(1.3)));
            yy = 0.5 + (((tickAnim - 20) / 560) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 20) / 560) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 1.3 + (((tickAnim - 580) / 20) * (0-(1.3)));
            yy = 0.5 + (((tickAnim - 580) / 20) * (0-(0.5)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegRight.rotationPointX = this.upperlegRight.rotationPointX + (float)(xx);
        this.upperlegRight.rotationPointY = this.upperlegRight.rotationPointY - (float)(yy);
        this.upperlegRight.rotationPointZ = this.upperlegRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-32.25008-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11.78145-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-21.10312-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -32.25008 + (((tickAnim - 8) / 12) * (8.83934-(-32.25008)));
            yy = 11.78145 + (((tickAnim - 8) / 12) * (-3.01057-(11.78145)));
            zz = -21.10312 + (((tickAnim - 8) / 12) * (33.81876-(-21.10312)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 8.83934 + (((tickAnim - 20) / 560) * (8.83934-(8.83934)));
            yy = -3.01057 + (((tickAnim - 20) / 560) * (-3.01057-(-3.01057)));
            zz = 33.81876 + (((tickAnim - 20) / 560) * (33.81876-(33.81876)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 8.83934 + (((tickAnim - 580) / 13) * (-32.25008-(8.83934)));
            yy = -3.01057 + (((tickAnim - 580) / 13) * (11.78145-(-3.01057)));
            zz = 33.81876 + (((tickAnim - 580) / 13) * (-21.10312-(33.81876)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -32.25008 + (((tickAnim - 593) / 7) * (0-(-32.25008)));
            yy = 11.78145 + (((tickAnim - 593) / 7) * (0-(11.78145)));
            zz = -21.10312 + (((tickAnim - 593) / 7) * (0-(-21.10312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-41.54078-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-9.10839-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-8.52648-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -41.54078 + (((tickAnim - 8) / 12) * (49.17318-(-41.54078)));
            yy = -9.10839 + (((tickAnim - 8) / 12) * (-0.33032-(-9.10839)));
            zz = -8.52648 + (((tickAnim - 8) / 12) * (53.64384-(-8.52648)));
        }
        else if (tickAnim >= 20 && tickAnim < 580) {
            xx = 49.17318 + (((tickAnim - 20) / 560) * (49.17318-(49.17318)));
            yy = -0.33032 + (((tickAnim - 20) / 560) * (-0.33032-(-0.33032)));
            zz = 53.64384 + (((tickAnim - 20) / 560) * (53.64384-(53.64384)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 49.17318 + (((tickAnim - 580) / 13) * (-41.54078-(49.17318)));
            yy = -0.33032 + (((tickAnim - 580) / 13) * (-9.10839-(-0.33032)));
            zz = 53.64384 + (((tickAnim - 580) / 13) * (-8.52648-(53.64384)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -41.54078 + (((tickAnim - 593) / 7) * (0-(-41.54078)));
            yy = -9.10839 + (((tickAnim - 593) / 7) * (0-(-9.10839)));
            zz = -8.52648 + (((tickAnim - 593) / 7) * (0-(-8.52648)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootRight, backfootRight.rotateAngleX + (float) Math.toRadians(xx), backfootRight.rotateAngleY + (float) Math.toRadians(yy), backfootRight.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 10) / 5) * (0.6-(1.225)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 15) / 5) * (0-(0.6)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (1.375-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 1.375 + (((tickAnim - 30) / 5) * (0.6-(1.375)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 35) / 5) * (0-(0.6)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9 + (((tickAnim - 30) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.0764 + (((tickAnim - 0) / 5) * (41.81833-(7.0764)));
            yy = -3.63217 + (((tickAnim - 0) / 5) * (6.32355-(-3.63217)));
            zz = -2.02786 + (((tickAnim - 0) / 5) * (18.42802-(-2.02786)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 41.81833 + (((tickAnim - 5) / 5) * (81.16097-(41.81833)));
            yy = 6.32355 + (((tickAnim - 5) / 5) * (12.22942-(6.32355)));
            zz = 18.42802 + (((tickAnim - 5) / 5) * (40.13533-(18.42802)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 81.16097 + (((tickAnim - 10) / 5) * (111.1863-(81.16097)));
            yy = 12.22942 + (((tickAnim - 10) / 5) * (9.44797-(12.22942)));
            zz = 40.13533 + (((tickAnim - 10) / 5) * (40.2131-(40.13533)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 111.1863 + (((tickAnim - 15) / 5) * (141.21162-(111.1863)));
            yy = 9.44797 + (((tickAnim - 15) / 5) * (6.66653-(9.44797)));
            zz = 40.2131 + (((tickAnim - 15) / 5) * (50.29087-(40.2131)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 141.21162 + (((tickAnim - 20) / 4) * (112.44494-(141.21162)));
            yy = 6.66653 + (((tickAnim - 20) / 4) * (6.80542-(6.66653)));
            zz = 50.29087 + (((tickAnim - 20) / 4) * (26.3738-(50.29087)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 112.44494 + (((tickAnim - 24) / 8) * (51.78814-(112.44494)));
            yy = 6.80542 + (((tickAnim - 24) / 8) * (-0.19927-(6.80542)));
            zz = 26.3738 + (((tickAnim - 24) / 8) * (-11.92162-(26.3738)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 51.78814 + (((tickAnim - 32) / 5) * (19.29627-(51.78814)));
            yy = -0.19927 + (((tickAnim - 32) / 5) * (-21.27616-(-0.19927)));
            zz = -11.92162 + (((tickAnim - 32) / 5) * (12.12814-(-11.92162)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 19.29627 + (((tickAnim - 37) / 3) * (7.0764-(19.29627)));
            yy = -21.27616 + (((tickAnim - 37) / 3) * (-3.63217-(-21.27616)));
            zz = 12.12814 + (((tickAnim - 37) / 3) * (-2.02786-(12.12814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmLeft, upperarmLeft.rotateAngleX + (float) Math.toRadians(xx), upperarmLeft.rotateAngleY + (float) Math.toRadians(yy), upperarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -37 + (((tickAnim - 0) / 5) * (22.92894-(-37)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.33223-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.72757-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.92894 + (((tickAnim - 5) / 5) * (-0.33411-(22.92894)));
            yy = 6.33223 + (((tickAnim - 5) / 5) * (-0.13204-(6.33223)));
            zz = -9.72757 + (((tickAnim - 5) / 5) * (-26.1399-(-9.72757)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.33411 + (((tickAnim - 10) / 5) * (-10.10445-(-0.33411)));
            yy = -0.13204 + (((tickAnim - 10) / 5) * (10.85654-(-0.13204)));
            zz = -26.1399 + (((tickAnim - 10) / 5) * (-17.7081-(-26.1399)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.10445 + (((tickAnim - 15) / 5) * (-52.39586-(-10.10445)));
            yy = 10.85654 + (((tickAnim - 15) / 5) * (8.86849-(10.85654)));
            zz = -17.7081 + (((tickAnim - 15) / 5) * (-61.53551-(-17.7081)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -52.39586 + (((tickAnim - 20) / 4) * (-1.48277-(-52.39586)));
            yy = 8.86849 + (((tickAnim - 20) / 4) * (16.64226-(8.86849)));
            zz = -61.53551 + (((tickAnim - 20) / 4) * (-13.82849-(-61.53551)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.48277 + (((tickAnim - 24) / 4) * (12.05795-(-1.48277)));
            yy = 16.64226 + (((tickAnim - 24) / 4) * (-0.25389-(16.64226)));
            zz = -13.82849 + (((tickAnim - 24) / 4) * (-18.23935-(-13.82849)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 12.05795 + (((tickAnim - 28) / 4) * (18.20522-(12.05795)));
            yy = -0.25389 + (((tickAnim - 28) / 4) * (-16.64025-(-0.25389)));
            zz = -18.23935 + (((tickAnim - 28) / 4) * (-11.36592-(-18.23935)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 18.20522 + (((tickAnim - 32) / 2) * (-24.03938-(18.20522)));
            yy = -16.64025 + (((tickAnim - 32) / 2) * (-22.01264-(-16.64025)));
            zz = -11.36592 + (((tickAnim - 32) / 2) * (-34.43916-(-11.36592)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -24.03938 + (((tickAnim - 34) / 3) * (-65.22934-(-24.03938)));
            yy = -22.01264 + (((tickAnim - 34) / 3) * (-13.07655-(-22.01264)));
            zz = -34.43916 + (((tickAnim - 34) / 3) * (-46.50531-(-34.43916)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -65.22934 + (((tickAnim - 37) / 3) * (-37-(-65.22934)));
            yy = -13.07655 + (((tickAnim - 37) / 3) * (0-(-13.07655)));
            zz = -46.50531 + (((tickAnim - 37) / 3) * (0-(-46.50531)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmLeft, lowerarmLeft.rotateAngleX + (float) Math.toRadians(xx), lowerarmLeft.rotateAngleY + (float) Math.toRadians(yy), lowerarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37.61301 + (((tickAnim - 0) / 5) * (-56.06158-(37.61301)));
            yy = -1.65458 + (((tickAnim - 0) / 5) * (-26.68679-(-1.65458)));
            zz = 18.75526 + (((tickAnim - 0) / 5) * (-14.27774-(18.75526)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -56.06158 + (((tickAnim - 5) / 5) * (-68.99529-(-56.06158)));
            yy = -26.68679 + (((tickAnim - 5) / 5) * (-33.20238-(-26.68679)));
            zz = -14.27774 + (((tickAnim - 5) / 5) * (-12.87675-(-14.27774)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -68.99529 + (((tickAnim - 10) / 5) * (-75.2346-(-68.99529)));
            yy = -33.20238 + (((tickAnim - 10) / 5) * (-41.65807-(-33.20238)));
            zz = -12.87675 + (((tickAnim - 10) / 5) * (-12.52996-(-12.87675)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -75.2346 + (((tickAnim - 15) / 5) * (-87.70056-(-75.2346)));
            yy = -41.65807 + (((tickAnim - 15) / 5) * (-50.54577-(-41.65807)));
            zz = -12.52996 + (((tickAnim - 15) / 5) * (10.32839-(-12.52996)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -87.70056 + (((tickAnim - 20) / 4) * (-79.67339-(-87.70056)));
            yy = -50.54577 + (((tickAnim - 20) / 4) * (-32.78561-(-50.54577)));
            zz = 10.32839 + (((tickAnim - 20) / 4) * (-18.77385-(10.32839)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -79.67339 + (((tickAnim - 24) / 4) * (-7.39549-(-79.67339)));
            yy = -32.78561 + (((tickAnim - 24) / 4) * (-26.54497-(-32.78561)));
            zz = -18.77385 + (((tickAnim - 24) / 4) * (6.20889-(-18.77385)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -7.39549 + (((tickAnim - 28) / 4) * (84.92312-(-7.39549)));
            yy = -26.54497 + (((tickAnim - 28) / 4) * (-4.53117-(-26.54497)));
            zz = 6.20889 + (((tickAnim - 28) / 4) * (26.08303-(6.20889)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 84.92312 + (((tickAnim - 32) / 6) * (39.43633-(84.92312)));
            yy = -4.53117 + (((tickAnim - 32) / 6) * (-11.68679-(-4.53117)));
            zz = 26.08303 + (((tickAnim - 32) / 6) * (42.93563-(26.08303)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 39.43633 + (((tickAnim - 38) / 2) * (37.61301-(39.43633)));
            yy = -11.68679 + (((tickAnim - 38) / 2) * (-1.65458-(-11.68679)));
            zz = 42.93563 + (((tickAnim - 38) / 2) * (18.75526-(42.93563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootLeft, frontfootLeft.rotateAngleX + (float) Math.toRadians(xx), frontfootLeft.rotateAngleY + (float) Math.toRadians(yy), frontfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 78.56345 + (((tickAnim - 0) / 3) * (105.48122-(78.56345)));
            yy = -76.6389 + (((tickAnim - 0) / 3) * (-73.57783-(-76.6389)));
            zz = -34.58919 + (((tickAnim - 0) / 3) * (-62.73289-(-34.58919)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 105.48122 + (((tickAnim - 3) / 4) * (51.64122-(105.48122)));
            yy = -73.57783 + (((tickAnim - 3) / 4) * (-5.41087-(-73.57783)));
            zz = -62.73289 + (((tickAnim - 3) / 4) * (-38.46129-(-62.73289)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 51.64122 + (((tickAnim - 7) / 4) * (34.84051-(51.64122)));
            yy = -5.41087 + (((tickAnim - 7) / 4) * (19.87367-(-5.41087)));
            zz = -38.46129 + (((tickAnim - 7) / 4) * (-23.92915-(-38.46129)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 34.84051 + (((tickAnim - 11) / 4) * (26.55637-(34.84051)));
            yy = 19.87367 + (((tickAnim - 11) / 4) * (33.54293-(19.87367)));
            zz = -23.92915 + (((tickAnim - 11) / 4) * (-21.02588-(-23.92915)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 26.55637 + (((tickAnim - 15) / 3) * (32.2531-(26.55637)));
            yy = 33.54293 + (((tickAnim - 15) / 3) * (14.38452-(33.54293)));
            zz = -21.02588 + (((tickAnim - 15) / 3) * (-7.96048-(-21.02588)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 32.2531 + (((tickAnim - 18) / 6) * (9.54963-(32.2531)));
            yy = 14.38452 + (((tickAnim - 18) / 6) * (-27.66468-(14.38452)));
            zz = -7.96048 + (((tickAnim - 18) / 6) * (-2.50465-(-7.96048)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 9.54963 + (((tickAnim - 24) / 6) * (-10.582-(9.54963)));
            yy = -27.66468 + (((tickAnim - 24) / 6) * (-62.7243-(-27.66468)));
            zz = -2.50465 + (((tickAnim - 24) / 6) * (35.90508-(-2.50465)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.582 + (((tickAnim - 30) / 10) * (78.56345-(-10.582)));
            yy = -62.7243 + (((tickAnim - 30) / 10) * (-76.6389-(-62.7243)));
            zz = 35.90508 + (((tickAnim - 30) / 10) * (-34.58919-(35.90508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.88943 + (((tickAnim - 0) / 3) * (53.96017-(31.88943)));
            yy = 58.29648 + (((tickAnim - 0) / 3) * (106.57419-(58.29648)));
            zz = -125.1723 + (((tickAnim - 0) / 3) * (-125.87399-(-125.1723)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 53.96017 + (((tickAnim - 3) / 4) * (24.96887-(53.96017)));
            yy = 106.57419 + (((tickAnim - 3) / 4) * (34.56143-(106.57419)));
            zz = -125.87399 + (((tickAnim - 3) / 4) * (-25.55396-(-125.87399)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.96887 + (((tickAnim - 7) / 4) * (41.9544-(24.96887)));
            yy = 34.56143 + (((tickAnim - 7) / 4) * (53.54071-(34.56143)));
            zz = -25.55396 + (((tickAnim - 7) / 4) * (-32.53316-(-25.55396)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 41.9544 + (((tickAnim - 11) / 4) * (59.28334-(41.9544)));
            yy = 53.54071 + (((tickAnim - 11) / 4) * (48.16535-(53.54071)));
            zz = -32.53316 + (((tickAnim - 11) / 4) * (-42.11395-(-32.53316)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 59.28334 + (((tickAnim - 15) / 3) * (74.21718-(59.28334)));
            yy = 48.16535 + (((tickAnim - 15) / 3) * (42.28646-(48.16535)));
            zz = -42.11395 + (((tickAnim - 15) / 3) * (-49.61138-(-42.11395)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 74.21718 + (((tickAnim - 18) / 6) * (70.13253-(74.21718)));
            yy = 42.28646 + (((tickAnim - 18) / 6) * (34.86175-(42.28646)));
            zz = -49.61138 + (((tickAnim - 18) / 6) * (-64.87865-(-49.61138)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 70.13253 + (((tickAnim - 24) / 6) * (94.47872-(70.13253)));
            yy = 34.86175 + (((tickAnim - 24) / 6) * (58.62067-(34.86175)));
            zz = -64.87865 + (((tickAnim - 24) / 6) * (-121.72111-(-64.87865)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 94.47872 + (((tickAnim - 30) / 10) * (31.88943-(94.47872)));
            yy = 58.62067 + (((tickAnim - 30) / 10) * (58.29648-(58.62067)));
            zz = -121.72111 + (((tickAnim - 30) / 10) * (-125.1723-(-121.72111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -57.70959 + (((tickAnim - 0) / 3) * (-30.68717-(-57.70959)));
            yy = 28.63516 + (((tickAnim - 0) / 3) * (16.93812-(28.63516)));
            zz = 1.79617 + (((tickAnim - 0) / 3) * (25.09754-(1.79617)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -30.68717 + (((tickAnim - 3) / 2) * (-13.4467-(-30.68717)));
            yy = 16.93812 + (((tickAnim - 3) / 2) * (25.73072-(16.93812)));
            zz = 25.09754 + (((tickAnim - 3) / 2) * (8.01313-(25.09754)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -13.4467 + (((tickAnim - 5) / 2) * (1.19662-(-13.4467)));
            yy = 25.73072 + (((tickAnim - 5) / 2) * (26.81123-(25.73072)));
            zz = 8.01313 + (((tickAnim - 5) / 2) * (-3.36511-(8.01313)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 1.19662 + (((tickAnim - 7) / 4) * (-10.31449-(1.19662)));
            yy = 26.81123 + (((tickAnim - 7) / 4) * (12.60195-(26.81123)));
            zz = -3.36511 + (((tickAnim - 7) / 4) * (-0.06777-(-3.36511)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -10.31449 + (((tickAnim - 11) / 4) * (-46.38428-(-10.31449)));
            yy = 12.60195 + (((tickAnim - 11) / 4) * (-17.21417-(12.60195)));
            zz = -0.06777 + (((tickAnim - 11) / 4) * (57.94157-(-0.06777)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -46.38428 + (((tickAnim - 15) / 3) * (77.57698-(-46.38428)));
            yy = -17.21417 + (((tickAnim - 15) / 3) * (-12.57475-(-17.21417)));
            zz = 57.94157 + (((tickAnim - 15) / 3) * (-63.98829-(57.94157)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 77.57698 + (((tickAnim - 18) / 4) * (43.63177-(77.57698)));
            yy = -12.57475 + (((tickAnim - 18) / 4) * (9.32981-(-12.57475)));
            zz = -63.98829 + (((tickAnim - 18) / 4) * (-22.90128-(-63.98829)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 43.63177 + (((tickAnim - 22) / 2) * (22.93905-(43.63177)));
            yy = 9.32981 + (((tickAnim - 22) / 2) * (25.39543-(9.32981)));
            zz = -22.90128 + (((tickAnim - 22) / 2) * (-2.35035-(-22.90128)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 22.93905 + (((tickAnim - 24) / 6) * (5.52782-(22.93905)));
            yy = 25.39543 + (((tickAnim - 24) / 6) * (19.58561-(25.39543)));
            zz = -2.35035 + (((tickAnim - 24) / 6) * (-2.83309-(-2.35035)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.52782 + (((tickAnim - 30) / 10) * (-57.70959-(5.52782)));
            yy = 19.58561 + (((tickAnim - 30) / 10) * (28.63516-(19.58561)));
            zz = -2.83309 + (((tickAnim - 30) / 10) * (1.79617-(-2.83309)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootLeft, backfootLeft.rotateAngleX + (float) Math.toRadians(xx), backfootLeft.rotateAngleY + (float) Math.toRadians(yy), backfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 141.21162 + (((tickAnim - 0) / 4) * (112.44494-(141.21162)));
            yy = -6.66653 + (((tickAnim - 0) / 4) * (-6.80542-(-6.66653)));
            zz = -50.29087 + (((tickAnim - 0) / 4) * (-26.3738-(-50.29087)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 112.44494 + (((tickAnim - 4) / 8) * (51.78814-(112.44494)));
            yy = -6.80542 + (((tickAnim - 4) / 8) * (0.19927-(-6.80542)));
            zz = -26.3738 + (((tickAnim - 4) / 8) * (11.92162-(-26.3738)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 51.78814 + (((tickAnim - 12) / 5) * (19.29627-(51.78814)));
            yy = 0.19927 + (((tickAnim - 12) / 5) * (21.27616-(0.19927)));
            zz = 11.92162 + (((tickAnim - 12) / 5) * (-12.12814-(11.92162)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.29627 + (((tickAnim - 17) / 3) * (7.0764-(19.29627)));
            yy = 21.27616 + (((tickAnim - 17) / 3) * (3.63217-(21.27616)));
            zz = -12.12814 + (((tickAnim - 17) / 3) * (2.02786-(-12.12814)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.0764 + (((tickAnim - 20) / 5) * (41.81833-(7.0764)));
            yy = 3.63217 + (((tickAnim - 20) / 5) * (-6.32355-(3.63217)));
            zz = 2.02786 + (((tickAnim - 20) / 5) * (-18.42802-(2.02786)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 41.81833 + (((tickAnim - 25) / 5) * (81.16097-(41.81833)));
            yy = -6.32355 + (((tickAnim - 25) / 5) * (-12.22942-(-6.32355)));
            zz = -18.42802 + (((tickAnim - 25) / 5) * (-40.13533-(-18.42802)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 81.16097 + (((tickAnim - 30) / 5) * (111.1863-(81.16097)));
            yy = -12.22942 + (((tickAnim - 30) / 5) * (-9.44797-(-12.22942)));
            zz = -40.13533 + (((tickAnim - 30) / 5) * (-40.2131-(-40.13533)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 111.1863 + (((tickAnim - 35) / 5) * (141.21162-(111.1863)));
            yy = -9.44797 + (((tickAnim - 35) / 5) * (-6.66653-(-9.44797)));
            zz = -40.2131 + (((tickAnim - 35) / 5) * (-50.29087-(-40.2131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmRight, upperarmRight.rotateAngleX + (float) Math.toRadians(xx), upperarmRight.rotateAngleY + (float) Math.toRadians(yy), upperarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -52.39586 + (((tickAnim - 0) / 4) * (-1.48277-(-52.39586)));
            yy = -8.86849 + (((tickAnim - 0) / 4) * (-16.64226-(-8.86849)));
            zz = 61.53551 + (((tickAnim - 0) / 4) * (13.82849-(61.53551)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1.48277 + (((tickAnim - 4) / 4) * (12.05795-(-1.48277)));
            yy = -16.64226 + (((tickAnim - 4) / 4) * (0.25389-(-16.64226)));
            zz = 13.82849 + (((tickAnim - 4) / 4) * (18.23935-(13.82849)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 12.05795 + (((tickAnim - 8) / 4) * (18.20522-(12.05795)));
            yy = 0.25389 + (((tickAnim - 8) / 4) * (16.64025-(0.25389)));
            zz = 18.23935 + (((tickAnim - 8) / 4) * (11.36592-(18.23935)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 18.20522 + (((tickAnim - 12) / 2) * (-24.03938-(18.20522)));
            yy = 16.64025 + (((tickAnim - 12) / 2) * (22.01264-(16.64025)));
            zz = 11.36592 + (((tickAnim - 12) / 2) * (34.43916-(11.36592)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -24.03938 + (((tickAnim - 14) / 3) * (-65.22934-(-24.03938)));
            yy = 22.01264 + (((tickAnim - 14) / 3) * (13.07655-(22.01264)));
            zz = 34.43916 + (((tickAnim - 14) / 3) * (46.50531-(34.43916)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -65.22934 + (((tickAnim - 17) / 3) * (-37-(-65.22934)));
            yy = 13.07655 + (((tickAnim - 17) / 3) * (0-(13.07655)));
            zz = 46.50531 + (((tickAnim - 17) / 3) * (0-(46.50531)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -37 + (((tickAnim - 20) / 5) * (22.92894-(-37)));
            yy = 0 + (((tickAnim - 20) / 5) * (-6.33223-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (9.72757-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 22.92894 + (((tickAnim - 25) / 5) * (-0.33411-(22.92894)));
            yy = -6.33223 + (((tickAnim - 25) / 5) * (0.13204-(-6.33223)));
            zz = 9.72757 + (((tickAnim - 25) / 5) * (26.1399-(9.72757)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.33411 + (((tickAnim - 30) / 5) * (-10.10445-(-0.33411)));
            yy = 0.13204 + (((tickAnim - 30) / 5) * (-10.85654-(0.13204)));
            zz = 26.1399 + (((tickAnim - 30) / 5) * (17.7081-(26.1399)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -10.10445 + (((tickAnim - 35) / 5) * (-52.39586-(-10.10445)));
            yy = -10.85654 + (((tickAnim - 35) / 5) * (-8.86849-(-10.85654)));
            zz = 17.7081 + (((tickAnim - 35) / 5) * (61.53551-(17.7081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmRight, lowerarmRight.rotateAngleX + (float) Math.toRadians(xx), lowerarmRight.rotateAngleY + (float) Math.toRadians(yy), lowerarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -87.70056 + (((tickAnim - 0) / 4) * (-79.67339-(-87.70056)));
            yy = 50.54577 + (((tickAnim - 0) / 4) * (32.78561-(50.54577)));
            zz = -10.32839 + (((tickAnim - 0) / 4) * (18.77385-(-10.32839)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -79.67339 + (((tickAnim - 4) / 4) * (-7.39549-(-79.67339)));
            yy = 32.78561 + (((tickAnim - 4) / 4) * (26.54497-(32.78561)));
            zz = 18.77385 + (((tickAnim - 4) / 4) * (-6.20889-(18.77385)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.39549 + (((tickAnim - 8) / 4) * (84.92312-(-7.39549)));
            yy = 26.54497 + (((tickAnim - 8) / 4) * (4.53117-(26.54497)));
            zz = -6.20889 + (((tickAnim - 8) / 4) * (-26.08303-(-6.20889)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 84.92312 + (((tickAnim - 12) / 6) * (39.43633-(84.92312)));
            yy = 4.53117 + (((tickAnim - 12) / 6) * (11.68679-(4.53117)));
            zz = -26.08303 + (((tickAnim - 12) / 6) * (-42.93563-(-26.08303)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 39.43633 + (((tickAnim - 18) / 2) * (37.61301-(39.43633)));
            yy = 11.68679 + (((tickAnim - 18) / 2) * (1.65458-(11.68679)));
            zz = -42.93563 + (((tickAnim - 18) / 2) * (-18.75526-(-42.93563)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 37.61301 + (((tickAnim - 20) / 5) * (-56.06158-(37.61301)));
            yy = 1.65458 + (((tickAnim - 20) / 5) * (26.68679-(1.65458)));
            zz = -18.75526 + (((tickAnim - 20) / 5) * (14.27774-(-18.75526)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -56.06158 + (((tickAnim - 25) / 5) * (-68.99529-(-56.06158)));
            yy = 26.68679 + (((tickAnim - 25) / 5) * (33.20238-(26.68679)));
            zz = 14.27774 + (((tickAnim - 25) / 5) * (12.87675-(14.27774)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -68.99529 + (((tickAnim - 30) / 5) * (-75.2346-(-68.99529)));
            yy = 33.20238 + (((tickAnim - 30) / 5) * (41.65807-(33.20238)));
            zz = 12.87675 + (((tickAnim - 30) / 5) * (12.52996-(12.87675)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -75.2346 + (((tickAnim - 35) / 5) * (-87.70056-(-75.2346)));
            yy = 41.65807 + (((tickAnim - 35) / 5) * (50.54577-(41.65807)));
            zz = 12.52996 + (((tickAnim - 35) / 5) * (-10.32839-(12.52996)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootRight, frontfootRight.rotateAngleX + (float) Math.toRadians(xx), frontfootRight.rotateAngleY + (float) Math.toRadians(yy), frontfootRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.77 + (((tickAnim - 0) / 4) * (9.54963-(25.77)));
            yy = -2.37 + (((tickAnim - 0) / 4) * (27.66468-(-2.37)));
            zz = 6.4 + (((tickAnim - 0) / 4) * (2.50465-(6.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 9.54963 + (((tickAnim - 4) / 6) * (-10.582-(9.54963)));
            yy = 27.66468 + (((tickAnim - 4) / 6) * (62.7243-(27.66468)));
            zz = 2.50465 + (((tickAnim - 4) / 6) * (-35.90508-(2.50465)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.582 + (((tickAnim - 10) / 10) * (78.56345-(-10.582)));
            yy = 62.7243 + (((tickAnim - 10) / 10) * (76.6389-(62.7243)));
            zz = -35.90508 + (((tickAnim - 10) / 10) * (34.58919-(-35.90508)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 78.56345 + (((tickAnim - 20) / 3) * (105.48122-(78.56345)));
            yy = 76.6389 + (((tickAnim - 20) / 3) * (73.57783-(76.6389)));
            zz = 34.58919 + (((tickAnim - 20) / 3) * (62.73289-(34.58919)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 105.48122 + (((tickAnim - 23) / 4) * (51.64122-(105.48122)));
            yy = 73.57783 + (((tickAnim - 23) / 4) * (5.41087-(73.57783)));
            zz = 62.73289 + (((tickAnim - 23) / 4) * (38.46129-(62.73289)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 51.64122 + (((tickAnim - 27) / 4) * (34.84051-(51.64122)));
            yy = 5.41087 + (((tickAnim - 27) / 4) * (-19.87367-(5.41087)));
            zz = 38.46129 + (((tickAnim - 27) / 4) * (23.92915-(38.46129)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 34.84051 + (((tickAnim - 31) / 4) * (26.55637-(34.84051)));
            yy = -19.87367 + (((tickAnim - 31) / 4) * (-33.54293-(-19.87367)));
            zz = 23.92915 + (((tickAnim - 31) / 4) * (21.02588-(23.92915)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 26.55637 + (((tickAnim - 35) / 3) * (32.2531-(26.55637)));
            yy = -33.54293 + (((tickAnim - 35) / 3) * (-14.38452-(-33.54293)));
            zz = 21.02588 + (((tickAnim - 35) / 3) * (7.96048-(21.02588)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 32.2531 + (((tickAnim - 38) / 2) * (25.77-(32.2531)));
            yy = -14.38452 + (((tickAnim - 38) / 2) * (-2.37-(-14.38452)));
            zz = 7.96048 + (((tickAnim - 38) / 2) * (6.4-(7.96048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 73.05 + (((tickAnim - 0) / 4) * (70.13253-(73.05)));
            yy = -40.17 + (((tickAnim - 0) / 4) * (-34.86175-(-40.17)));
            zz = 53.97 + (((tickAnim - 0) / 4) * (64.87865-(53.97)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 70.13253 + (((tickAnim - 4) / 6) * (94.47872-(70.13253)));
            yy = -34.86175 + (((tickAnim - 4) / 6) * (-58.62067-(-34.86175)));
            zz = 64.87865 + (((tickAnim - 4) / 6) * (121.72111-(64.87865)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 94.47872 + (((tickAnim - 10) / 10) * (31.88943-(94.47872)));
            yy = -58.62067 + (((tickAnim - 10) / 10) * (-58.29648-(-58.62067)));
            zz = 121.72111 + (((tickAnim - 10) / 10) * (125.1723-(121.72111)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 31.88943 + (((tickAnim - 20) / 3) * (53.96017-(31.88943)));
            yy = -58.29648 + (((tickAnim - 20) / 3) * (-106.57419-(-58.29648)));
            zz = 125.1723 + (((tickAnim - 20) / 3) * (125.87399-(125.1723)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 53.96017 + (((tickAnim - 23) / 4) * (24.96887-(53.96017)));
            yy = -106.57419 + (((tickAnim - 23) / 4) * (-34.56143-(-106.57419)));
            zz = 125.87399 + (((tickAnim - 23) / 4) * (25.55396-(125.87399)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 24.96887 + (((tickAnim - 27) / 4) * (41.9544-(24.96887)));
            yy = -34.56143 + (((tickAnim - 27) / 4) * (-53.54071-(-34.56143)));
            zz = 25.55396 + (((tickAnim - 27) / 4) * (32.53316-(25.55396)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 41.9544 + (((tickAnim - 31) / 4) * (59.28334-(41.9544)));
            yy = -53.54071 + (((tickAnim - 31) / 4) * (-48.16535-(-53.54071)));
            zz = 32.53316 + (((tickAnim - 31) / 4) * (42.11395-(32.53316)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 59.28334 + (((tickAnim - 35) / 3) * (74.21718-(59.28334)));
            yy = -48.16535 + (((tickAnim - 35) / 3) * (-42.28646-(-48.16535)));
            zz = 42.11395 + (((tickAnim - 35) / 3) * (49.61138-(42.11395)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 74.21718 + (((tickAnim - 38) / 2) * (73.05-(74.21718)));
            yy = -42.28646 + (((tickAnim - 38) / 2) * (-40.17-(-42.28646)));
            zz = 49.61138 + (((tickAnim - 38) / 2) * (53.97-(49.61138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 60.6 + (((tickAnim - 0) / 2) * (43.63177-(60.6)));
            yy = 1.62 + (((tickAnim - 0) / 2) * (-9.32981-(1.62)));
            zz = 43.44 + (((tickAnim - 0) / 2) * (22.90128-(43.44)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 43.63177 + (((tickAnim - 2) / 2) * (22.93905-(43.63177)));
            yy = -9.32981 + (((tickAnim - 2) / 2) * (-25.39543-(-9.32981)));
            zz = 22.90128 + (((tickAnim - 2) / 2) * (2.35035-(22.90128)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 22.93905 + (((tickAnim - 4) / 6) * (5.52782-(22.93905)));
            yy = -25.39543 + (((tickAnim - 4) / 6) * (-19.58561-(-25.39543)));
            zz = 2.35035 + (((tickAnim - 4) / 6) * (2.83309-(2.35035)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.52782 + (((tickAnim - 10) / 10) * (-57.70959-(5.52782)));
            yy = -19.58561 + (((tickAnim - 10) / 10) * (-28.63516-(-19.58561)));
            zz = 2.83309 + (((tickAnim - 10) / 10) * (-1.79617-(2.83309)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -57.70959 + (((tickAnim - 20) / 3) * (-30.68717-(-57.70959)));
            yy = -28.63516 + (((tickAnim - 20) / 3) * (-16.93812-(-28.63516)));
            zz = -1.79617 + (((tickAnim - 20) / 3) * (-25.09754-(-1.79617)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -30.68717 + (((tickAnim - 23) / 2) * (-13.4467-(-30.68717)));
            yy = -16.93812 + (((tickAnim - 23) / 2) * (-25.73072-(-16.93812)));
            zz = -25.09754 + (((tickAnim - 23) / 2) * (-8.01313-(-25.09754)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -13.4467 + (((tickAnim - 25) / 2) * (1.19662-(-13.4467)));
            yy = -25.73072 + (((tickAnim - 25) / 2) * (-26.81123-(-25.73072)));
            zz = -8.01313 + (((tickAnim - 25) / 2) * (3.36511-(-8.01313)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 1.19662 + (((tickAnim - 27) / 4) * (-10.31449-(1.19662)));
            yy = -26.81123 + (((tickAnim - 27) / 4) * (-12.60195-(-26.81123)));
            zz = 3.36511 + (((tickAnim - 27) / 4) * (0.06777-(3.36511)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -10.31449 + (((tickAnim - 31) / 4) * (-46.38428-(-10.31449)));
            yy = -12.60195 + (((tickAnim - 31) / 4) * (17.21417-(-12.60195)));
            zz = 0.06777 + (((tickAnim - 31) / 4) * (-57.94157-(0.06777)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -46.38428 + (((tickAnim - 35) / 3) * (77.57698-(-46.38428)));
            yy = 17.21417 + (((tickAnim - 35) / 3) * (12.57475-(17.21417)));
            zz = -57.94157 + (((tickAnim - 35) / 3) * (63.98829-(-57.94157)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 77.57698 + (((tickAnim - 38) / 2) * (60.6-(77.57698)));
            yy = 12.57475 + (((tickAnim - 38) / 2) * (1.62-(12.57475)));
            zz = 63.98829 + (((tickAnim - 38) / 2) * (43.44-(63.98829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootRight, backfootRight.rotateAngleX + (float) Math.toRadians(xx), backfootRight.rotateAngleY + (float) Math.toRadians(yy), backfootRight.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHoyasemys entity = (EntityPrehistoricFloraHoyasemys) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 3 + (((tickAnim - 0) / 8) * (-3-(3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -3 + (((tickAnim - 8) / 7) * (3-(-3)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -13 + (((tickAnim - 0) / 8) * (13-(-13)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 13 + (((tickAnim - 8) / 7) * (-13-(13)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 17 + (((tickAnim - 0) / 8) * (-17-(17)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -17 + (((tickAnim - 8) / 7) * (17-(-17)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.69383 + (((tickAnim - 0) / 2) * (15.24584-(-1.69383)));
            yy = 10.87917 + (((tickAnim - 0) / 2) * (8.50674-(10.87917)));
            zz = -32.46639 + (((tickAnim - 0) / 2) * (-6.57371-(-32.46639)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15.24584 + (((tickAnim - 2) / 1) * (32.1855-(15.24584)));
            yy = 8.50674 + (((tickAnim - 2) / 1) * (6.13431-(8.50674)));
            zz = -6.57371 + (((tickAnim - 2) / 1) * (-6.68103-(-6.57371)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 32.1855 + (((tickAnim - 3) / 5) * (87.53789-(32.1855)));
            yy = 6.13431 + (((tickAnim - 3) / 5) * (-1.59707-(6.13431)));
            zz = -6.68103 + (((tickAnim - 3) / 5) * (17.28263-(-6.68103)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 87.53789 + (((tickAnim - 8) / 2) * (26.70323-(87.53789)));
            yy = -1.59707 + (((tickAnim - 8) / 2) * (9.6963-(-1.59707)));
            zz = 17.28263 + (((tickAnim - 8) / 2) * (-11.19592-(17.28263)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.70323 + (((tickAnim - 10) / 3) * (0.74035-(26.70323)));
            yy = 9.6963 + (((tickAnim - 10) / 3) * (10.24613-(9.6963)));
            zz = -11.19592 + (((tickAnim - 10) / 3) * (-26.00912-(-11.19592)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.74035 + (((tickAnim - 13) / 2) * (-1.69383-(0.74035)));
            yy = 10.24613 + (((tickAnim - 13) / 2) * (10.87917-(10.24613)));
            zz = -26.00912 + (((tickAnim - 13) / 2) * (-32.46639-(-26.00912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmLeft, upperarmLeft.rotateAngleX + (float) Math.toRadians(xx), upperarmLeft.rotateAngleY + (float) Math.toRadians(yy), upperarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -45.08511 + (((tickAnim - 0) / 2) * (-28.69754-(-45.08511)));
            yy = -31.71597 + (((tickAnim - 0) / 2) * (-27.855-(-31.71597)));
            zz = -50.14694 + (((tickAnim - 0) / 2) * (-51.25953-(-50.14694)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -28.69754 + (((tickAnim - 2) / 1) * (-17.56751-(-28.69754)));
            yy = -27.855 + (((tickAnim - 2) / 1) * (-24.24319-(-27.855)));
            zz = -51.25953 + (((tickAnim - 2) / 1) * (-42.0834-(-51.25953)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.56751 + (((tickAnim - 3) / 5) * (-30.68241-(-17.56751)));
            yy = -24.24319 + (((tickAnim - 3) / 5) * (-23.91641-(-24.24319)));
            zz = -42.0834 + (((tickAnim - 3) / 5) * (-43.75445-(-42.0834)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30.68241 + (((tickAnim - 8) / 2) * (1.55604-(-30.68241)));
            yy = -23.91641 + (((tickAnim - 8) / 2) * (-21.0346-(-23.91641)));
            zz = -43.75445 + (((tickAnim - 8) / 2) * (-28.60964-(-43.75445)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.55604 + (((tickAnim - 10) / 3) * (-2.22448-(1.55604)));
            yy = -21.0346 + (((tickAnim - 10) / 3) * (-21.41129-(-21.0346)));
            zz = -28.60964 + (((tickAnim - 10) / 3) * (-32.08895-(-28.60964)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.22448 + (((tickAnim - 13) / 2) * (-34.11964-(-2.22448)));
            yy = -21.41129 + (((tickAnim - 13) / 2) * (-25.93196-(-21.41129)));
            zz = -32.08895 + (((tickAnim - 13) / 2) * (-46.80794-(-32.08895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmLeft, lowerarmLeft.rotateAngleX + (float) Math.toRadians(xx), lowerarmLeft.rotateAngleY + (float) Math.toRadians(yy), lowerarmLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 86.83518 + (((tickAnim - 0) / 2) * (54.6299-(86.83518)));
            yy = 14.48547 + (((tickAnim - 0) / 2) * (11.58462-(14.48547)));
            zz = 38.67103 + (((tickAnim - 0) / 2) * (10.30323-(38.67103)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 54.6299 + (((tickAnim - 2) / 1) * (43.44867-(54.6299)));
            yy = 11.58462 + (((tickAnim - 2) / 1) * (5.77546-(11.58462)));
            zz = 10.30323 + (((tickAnim - 2) / 1) * (-1.32569-(10.30323)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 43.44867 + (((tickAnim - 3) / 5) * (100.5255-(43.44867)));
            yy = 5.77546 + (((tickAnim - 3) / 5) * (-8.19857-(5.77546)));
            zz = -1.32569 + (((tickAnim - 3) / 5) * (70.36871-(-1.32569)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 100.5255 + (((tickAnim - 8) / 2) * (93.04893-(100.5255)));
            yy = -8.19857 + (((tickAnim - 8) / 2) * (-11.60864-(-8.19857)));
            zz = 70.36871 + (((tickAnim - 8) / 2) * (52.38608-(70.36871)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 93.04893 + (((tickAnim - 10) / 3) * (89.14242-(93.04893)));
            yy = -11.60864 + (((tickAnim - 10) / 3) * (-6.20808-(-11.60864)));
            zz = 52.38608 + (((tickAnim - 10) / 3) * (38.06484-(52.38608)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 89.14242 + (((tickAnim - 13) / 2) * (86.83518-(89.14242)));
            yy = -6.20808 + (((tickAnim - 13) / 2) * (14.48547-(-6.20808)));
            zz = 38.06484 + (((tickAnim - 13) / 2) * (38.67103-(38.06484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootLeft, frontfootLeft.rotateAngleX + (float) Math.toRadians(xx), frontfootLeft.rotateAngleY + (float) Math.toRadians(yy), frontfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -343.88613 + (((tickAnim - 0) / 3) * (-351.63707-(-343.88613)));
            yy = -62.08716 + (((tickAnim - 0) / 3) * (-40.11006-(-62.08716)));
            zz = 338.81829 + (((tickAnim - 0) / 3) * (348.24613-(338.81829)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -351.63707 + (((tickAnim - 3) / 2) * (-355.59124-(-351.63707)));
            yy = -40.11006 + (((tickAnim - 3) / 2) * (-27.90096-(-40.11006)));
            zz = 348.24613 + (((tickAnim - 3) / 2) * (353.58997-(348.24613)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -355.59124 + (((tickAnim - 5) / 3) * (-358.59646-(-355.59124)));
            yy = -27.90096 + (((tickAnim - 5) / 3) * (-23.64076-(-27.90096)));
            zz = 353.58997 + (((tickAnim - 5) / 3) * (358.64215-(353.58997)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -358.59646 + (((tickAnim - 8) / 3) * (-347.19228-(-358.59646)));
            yy = -23.64076 + (((tickAnim - 8) / 3) * (-59.34747-(-23.64076)));
            zz = 358.64215 + (((tickAnim - 8) / 3) * (346.79192-(358.64215)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -347.19228 + (((tickAnim - 11) / 4) * (-343.88613-(-347.19228)));
            yy = -59.34747 + (((tickAnim - 11) / 4) * (-62.08716-(-59.34747)));
            zz = 346.79192 + (((tickAnim - 11) / 4) * (338.81829-(346.79192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.82881 + (((tickAnim - 0) / 3) * (2.21958-(-27.82881)));
            yy = 20.63222 + (((tickAnim - 0) / 3) * (24.64831-(20.63222)));
            zz = -82.89239 + (((tickAnim - 0) / 3) * (-89.61989-(-82.89239)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.21958 + (((tickAnim - 3) / 2) * (-7.36505-(2.21958)));
            yy = 24.64831 + (((tickAnim - 3) / 2) * (54.5393-(24.64831)));
            zz = -89.61989 + (((tickAnim - 3) / 2) * (-91.77834-(-89.61989)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.36505 + (((tickAnim - 5) / 3) * (-4.77422-(-7.36505)));
            yy = 54.5393 + (((tickAnim - 5) / 3) * (57.3664-(54.5393)));
            zz = -91.77834 + (((tickAnim - 5) / 3) * (-74.46959-(-91.77834)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.77422 + (((tickAnim - 8) / 3) * (-7.84953-(-4.77422)));
            yy = 57.3664 + (((tickAnim - 8) / 3) * (33.31186-(57.3664)));
            zz = -74.46959 + (((tickAnim - 8) / 3) * (-74.36409-(-74.46959)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.84953 + (((tickAnim - 11) / 4) * (-27.82881-(-7.84953)));
            yy = 33.31186 + (((tickAnim - 11) / 4) * (20.63222-(33.31186)));
            zz = -74.36409 + (((tickAnim - 11) / 4) * (-82.89239-(-74.36409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.17278 + (((tickAnim - 0) / 1) * (25.41173-(42.17278)));
            yy = 82.57556 + (((tickAnim - 0) / 1) * (67.59719-(82.57556)));
            zz = 71.03483 + (((tickAnim - 0) / 1) * (88.46559-(71.03483)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 25.41173 + (((tickAnim - 1) / 2) * (-30.49643-(25.41173)));
            yy = 67.59719 + (((tickAnim - 1) / 2) * (70.74961-(67.59719)));
            zz = 88.46559 + (((tickAnim - 1) / 2) * (82.85576-(88.46559)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -30.49643 + (((tickAnim - 3) / 2) * (1.24787-(-30.49643)));
            yy = 70.74961 + (((tickAnim - 3) / 2) * (47.54665-(70.74961)));
            zz = 82.85576 + (((tickAnim - 3) / 2) * (102.32956-(82.85576)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.24787 + (((tickAnim - 5) / 3) * (11.26867-(1.24787)));
            yy = 47.54665 + (((tickAnim - 5) / 3) * (37.30567-(47.54665)));
            zz = 102.32956 + (((tickAnim - 5) / 3) * (54.49858-(102.32956)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.26867 + (((tickAnim - 8) / 3) * (40.23704-(11.26867)));
            yy = 37.30567 + (((tickAnim - 8) / 3) * (77.95134-(37.30567)));
            zz = 54.49858 + (((tickAnim - 8) / 3) * (85.40131-(54.49858)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 40.23704 + (((tickAnim - 11) / 4) * (42.17278-(40.23704)));
            yy = 77.95134 + (((tickAnim - 11) / 4) * (82.57556-(77.95134)));
            zz = 85.40131 + (((tickAnim - 11) / 4) * (71.03483-(85.40131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootLeft, backfootLeft.rotateAngleX + (float) Math.toRadians(xx), backfootLeft.rotateAngleY + (float) Math.toRadians(yy), backfootLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 87.53789 + (((tickAnim - 0) / 3) * (26.70323-(87.53789)));
            yy = 1.59707 + (((tickAnim - 0) / 3) * (-9.6963-(1.59707)));
            zz = -17.28263 + (((tickAnim - 0) / 3) * (11.19592-(-17.28263)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.70323 + (((tickAnim - 3) / 2) * (0.74035-(26.70323)));
            yy = -9.6963 + (((tickAnim - 3) / 2) * (-10.24613-(-9.6963)));
            zz = 11.19592 + (((tickAnim - 3) / 2) * (26.00912-(11.19592)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.74035 + (((tickAnim - 5) / 3) * (-1.69383-(0.74035)));
            yy = -10.24613 + (((tickAnim - 5) / 3) * (-10.87917-(-10.24613)));
            zz = 26.00912 + (((tickAnim - 5) / 3) * (32.46639-(26.00912)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -1.69383 + (((tickAnim - 8) / 1) * (15.24584-(-1.69383)));
            yy = -10.87917 + (((tickAnim - 8) / 1) * (-8.50674-(-10.87917)));
            zz = 32.46639 + (((tickAnim - 8) / 1) * (6.57371-(32.46639)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 15.24584 + (((tickAnim - 9) / 2) * (32.1855-(15.24584)));
            yy = -8.50674 + (((tickAnim - 9) / 2) * (-6.13431-(-8.50674)));
            zz = 6.57371 + (((tickAnim - 9) / 2) * (6.68103-(6.57371)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 32.1855 + (((tickAnim - 11) / 4) * (87.53789-(32.1855)));
            yy = -6.13431 + (((tickAnim - 11) / 4) * (1.59707-(-6.13431)));
            zz = 6.68103 + (((tickAnim - 11) / 4) * (-17.28263-(6.68103)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmRight, upperarmRight.rotateAngleX + (float) Math.toRadians(xx), upperarmRight.rotateAngleY + (float) Math.toRadians(yy), upperarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.68241 + (((tickAnim - 0) / 3) * (1.55604-(-30.68241)));
            yy = 23.91641 + (((tickAnim - 0) / 3) * (21.0346-(23.91641)));
            zz = 43.75445 + (((tickAnim - 0) / 3) * (28.60964-(43.75445)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.55604 + (((tickAnim - 3) / 2) * (-2.22448-(1.55604)));
            yy = 21.0346 + (((tickAnim - 3) / 2) * (21.41129-(21.0346)));
            zz = 28.60964 + (((tickAnim - 3) / 2) * (32.08895-(28.60964)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.22448 + (((tickAnim - 5) / 3) * (-45.08511-(-2.22448)));
            yy = 21.41129 + (((tickAnim - 5) / 3) * (31.71597-(21.41129)));
            zz = 32.08895 + (((tickAnim - 5) / 3) * (50.14694-(32.08895)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -45.08511 + (((tickAnim - 8) / 1) * (-28.69754-(-45.08511)));
            yy = 31.71597 + (((tickAnim - 8) / 1) * (27.855-(31.71597)));
            zz = 50.14694 + (((tickAnim - 8) / 1) * (51.25953-(50.14694)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -28.69754 + (((tickAnim - 9) / 2) * (-17.56751-(-28.69754)));
            yy = 27.855 + (((tickAnim - 9) / 2) * (24.24319-(27.855)));
            zz = 51.25953 + (((tickAnim - 9) / 2) * (42.0834-(51.25953)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.56751 + (((tickAnim - 11) / 4) * (-30.68241-(-17.56751)));
            yy = 24.24319 + (((tickAnim - 11) / 4) * (23.91641-(24.24319)));
            zz = 42.0834 + (((tickAnim - 11) / 4) * (43.75445-(42.0834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmRight, lowerarmRight.rotateAngleX + (float) Math.toRadians(xx), lowerarmRight.rotateAngleY + (float) Math.toRadians(yy), lowerarmRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 100.5255 + (((tickAnim - 0) / 3) * (93.04893-(100.5255)));
            yy = 8.19857 + (((tickAnim - 0) / 3) * (11.60864-(8.19857)));
            zz = -70.36871 + (((tickAnim - 0) / 3) * (-52.38608-(-70.36871)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 93.04893 + (((tickAnim - 3) / 2) * (89.14242-(93.04893)));
            yy = 11.60864 + (((tickAnim - 3) / 2) * (6.20808-(11.60864)));
            zz = -52.38608 + (((tickAnim - 3) / 2) * (-38.06484-(-52.38608)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 89.14242 + (((tickAnim - 5) / 3) * (86.83518-(89.14242)));
            yy = 6.20808 + (((tickAnim - 5) / 3) * (-14.48547-(6.20808)));
            zz = -38.06484 + (((tickAnim - 5) / 3) * (-38.67103-(-38.06484)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 86.83518 + (((tickAnim - 8) / 1) * (54.6299-(86.83518)));
            yy = -14.48547 + (((tickAnim - 8) / 1) * (-11.58462-(-14.48547)));
            zz = -38.67103 + (((tickAnim - 8) / 1) * (-10.30323-(-38.67103)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 54.6299 + (((tickAnim - 9) / 2) * (43.44867-(54.6299)));
            yy = -11.58462 + (((tickAnim - 9) / 2) * (-5.77546-(-11.58462)));
            zz = -10.30323 + (((tickAnim - 9) / 2) * (1.32569-(-10.30323)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 43.44867 + (((tickAnim - 11) / 4) * (100.5255-(43.44867)));
            yy = -5.77546 + (((tickAnim - 11) / 4) * (8.19857-(-5.77546)));
            zz = 1.32569 + (((tickAnim - 11) / 4) * (-70.36871-(1.32569)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontfootRight, frontfootRight.rotateAngleX + (float) Math.toRadians(xx), frontfootRight.rotateAngleY + (float) Math.toRadians(yy), frontfootRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -358.59646 + (((tickAnim - 0) / 3) * (-347.19228-(-358.59646)));
            yy = 23.64076 + (((tickAnim - 0) / 3) * (59.34747-(23.64076)));
            zz = -358.64215 + (((tickAnim - 0) / 3) * (-346.79192-(-358.64215)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -347.19228 + (((tickAnim - 3) / 5) * (-343.88613-(-347.19228)));
            yy = 59.34747 + (((tickAnim - 3) / 5) * (62.08716-(59.34747)));
            zz = -346.79192 + (((tickAnim - 3) / 5) * (-338.81829-(-346.79192)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -343.88613 + (((tickAnim - 8) / 2) * (-351.63707-(-343.88613)));
            yy = 62.08716 + (((tickAnim - 8) / 2) * (40.11006-(62.08716)));
            zz = -338.81829 + (((tickAnim - 8) / 2) * (-348.24613-(-338.81829)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -351.63707 + (((tickAnim - 10) / 3) * (-355.59124-(-351.63707)));
            yy = 40.11006 + (((tickAnim - 10) / 3) * (27.90096-(40.11006)));
            zz = -348.24613 + (((tickAnim - 10) / 3) * (-353.58997-(-348.24613)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -355.59124 + (((tickAnim - 13) / 2) * (-358.59646-(-355.59124)));
            yy = 27.90096 + (((tickAnim - 13) / 2) * (23.64076-(27.90096)));
            zz = -353.58997 + (((tickAnim - 13) / 2) * (-358.64215-(-353.58997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.77422 + (((tickAnim - 0) / 3) * (-7.84953-(-4.77422)));
            yy = -57.3664 + (((tickAnim - 0) / 3) * (-33.31186-(-57.3664)));
            zz = 74.46959 + (((tickAnim - 0) / 3) * (74.36409-(74.46959)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.84953 + (((tickAnim - 3) / 5) * (-27.82881-(-7.84953)));
            yy = -33.31186 + (((tickAnim - 3) / 5) * (-20.63222-(-33.31186)));
            zz = 74.36409 + (((tickAnim - 3) / 5) * (82.89239-(74.36409)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.82881 + (((tickAnim - 8) / 2) * (2.21958-(-27.82881)));
            yy = -20.63222 + (((tickAnim - 8) / 2) * (-24.64831-(-20.63222)));
            zz = 82.89239 + (((tickAnim - 8) / 2) * (89.61989-(82.89239)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.21958 + (((tickAnim - 10) / 3) * (-7.36505-(2.21958)));
            yy = -24.64831 + (((tickAnim - 10) / 3) * (-54.5393-(-24.64831)));
            zz = 89.61989 + (((tickAnim - 10) / 3) * (91.77834-(89.61989)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.36505 + (((tickAnim - 13) / 2) * (-4.77422-(-7.36505)));
            yy = -54.5393 + (((tickAnim - 13) / 2) * (-57.3664-(-54.5393)));
            zz = 91.77834 + (((tickAnim - 13) / 2) * (74.46959-(91.77834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.26867 + (((tickAnim - 0) / 3) * (40.23704-(11.26867)));
            yy = -37.30567 + (((tickAnim - 0) / 3) * (-77.95134-(-37.30567)));
            zz = -54.49858 + (((tickAnim - 0) / 3) * (-85.40131-(-54.49858)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 40.23704 + (((tickAnim - 3) / 5) * (42.17278-(40.23704)));
            yy = -77.95134 + (((tickAnim - 3) / 5) * (-82.57556-(-77.95134)));
            zz = -85.40131 + (((tickAnim - 3) / 5) * (-71.03483-(-85.40131)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 42.17278 + (((tickAnim - 8) / 1) * (10.89364-(42.17278)));
            yy = -82.57556 + (((tickAnim - 8) / 1) * (-51.53509-(-82.57556)));
            zz = -71.03483 + (((tickAnim - 8) / 1) * (-100.22624-(-71.03483)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10.89364 + (((tickAnim - 9) / 1) * (-30.49643-(10.89364)));
            yy = -51.53509 + (((tickAnim - 9) / 1) * (-70.74961-(-51.53509)));
            zz = -100.22624 + (((tickAnim - 9) / 1) * (-82.85576-(-100.22624)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -30.49643 + (((tickAnim - 10) / 3) * (1.24787-(-30.49643)));
            yy = -70.74961 + (((tickAnim - 10) / 3) * (-47.54665-(-70.74961)));
            zz = -82.85576 + (((tickAnim - 10) / 3) * (-102.32956-(-82.85576)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.24787 + (((tickAnim - 13) / 2) * (11.26867-(1.24787)));
            yy = -47.54665 + (((tickAnim - 13) / 2) * (-37.30567-(-47.54665)));
            zz = -102.32956 + (((tickAnim - 13) / 2) * (-54.49858-(-102.32956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backfootRight, backfootRight.rotateAngleX + (float) Math.toRadians(xx), backfootRight.rotateAngleY + (float) Math.toRadians(yy), backfootRight.rotateAngleZ + (float) Math.toRadians(zz));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHoyasemys e = (EntityPrehistoricFloraHoyasemys) entity;
        animator.update(entity);


    }
}
