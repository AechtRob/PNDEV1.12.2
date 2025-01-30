package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCretoxyrhina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCretoxyrhina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer membrane2;
    private final AdvancedModelRenderer membrane;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin;

    private ModelAnimator animator;

    public ModelCretoxyrhina() {
        this.textureWidth = 160;
        this.textureHeight = 140;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.0F, 1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 7.2396F, -11.014F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 18, -8.5F, -3.0F, 0.0F, 15, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-8.6393F, -0.5F, -18.9867F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 92, 94, 0.0F, -6.0F, 0.0F, 2, 12, 14, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 6.7164F, -18.9969F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0654F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 75, -6.5F, -3.2F, 0.0F, 14, 3, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(8.6393F, -0.5F, -18.9867F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0654F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 94, -2.0F, -6.0F, 0.0F, 2, 12, 14, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -9.0F, -7.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 76, -7.5F, 0.0F, -12.0F, 16, 3, 12, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -7.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 16, 0.0F, -12.0F, 3.0F, 0, 10, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, 0.0F, 0.0F, 18, 12, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 104, 64, -8.0F, 10.5229F, -0.0228F, 16, 4, 6, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 65, 0, -7.5F, -2.0F, 0.0F, 15, 3, 14, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 14.5229F, 5.9772F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 18, -6.5F, -4.0F, 0.0F, 14, 4, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -18.0F);
        this.body.addChild(body2);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 13.75F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 47, 27, -7.6512F, 0.0F, -1.7622F, 16, 9, 12, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3488F, -3.0F, 0.2378F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 92, -6.5F, 0.0F, 0.0F, 13, 4, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1512F, 10.0F, 9.2378F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 94, -5.5F, -4.1F, -10.0F, 12, 4, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.3488F, 1.25F, 9.4878F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 76, -6.0F, -0.5F, -1.25F, 12, 6, 11, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.8695F, -0.2586F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 104, 31, -5.5F, -0.175F, 0.0F, 10, 4, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 6.5F, 9.75F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 120, -3.5F, -3.525F, -10.675F, 9, 3, 10, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(-2.0F, 6.5F, 0.75F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3491F, 0.0F, 0.4363F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 92, 25, 0.0F, 1.0F, -1.0F, 0, 5, 8, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(2.0F, 6.5F, 0.75F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3491F, 0.0F, -0.4363F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 92, 25, 0.0F, 1.0F, -1.0F, 0, 5, 8, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 9.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 107, -4.5F, -0.75F, -2.0F, 9, 4, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.5F, -2.0F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 104, 87, 0.5F, -1.7F, 6.0F, 0, 2, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 109, 121, -3.0F, -0.2F, 1.0F, 7, 3, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 5.25F, -2.0F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 113, 87, 0.5F, -0.075F, 7.025F, 0, 2, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 122, -3.0F, -1.575F, 1.025F, 7, 2, 10, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 136, 127, -1.5F, -2.0F, -1.0F, 3, 4, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 97, 122, -3.0F, -0.5F, 0.0F, 3, 1, 7, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.4849F, 0.0F, 6.8341F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6545F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 117, -2.0F, -0.5F, 0.0F, 2, 1, 2, -0.001F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.2674F, 0.0F, 8.4208F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -1.1345F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 104, 46, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.2674F, 0.0F, 8.4208F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.1345F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 104, 46, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.4849F, 0.0F, 6.8341F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6545F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 82, 117, 0.0F, -0.5F, 0.0F, 2, 1, 2, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.2182F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 97, 122, 0.0F, -0.5F, 0.0F, 3, 1, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.5F, 0.0F, 6.25F);
        this.tail4.addChild(tail5);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.1012F, -1.4746F);
        this.tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.829F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 23, 0.5F, 0.0F, -3.0F, 0, 18, 27, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.25F, 0.0F);
        this.tail5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.829F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 121, -0.5F, -2.0F, 0.0F, 1, 4, 14, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, -20.0F);
        this.main.addChild(head);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.9806F, 3.5F, -13.1039F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.5061F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 29, 0.0F, -2.25F, -5.425F, 2, 3, 6, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-7.4249F, 3.5F, -5.9273F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.4363F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 36, 0.0F, -4.25F, -8.0F, 5, 5, 8, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(7.5263F, 3.5F, -5.9273F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 36, -5.0F, -4.25F, -8.0F, 5, 5, 8, 0.001F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.082F, 3.5F, -13.1039F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.5061F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 29, -2.0F, -2.25F, -5.425F, 2, 3, 6, 0.001F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(8.0507F, 7.4565F, -4.1906F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.4993F, 0.0798F, 0.0074F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 76, 49, -5.725F, 0.0F, 0.0F, 6, 6, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-7.9493F, 7.4565F, -4.1906F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.4993F, -0.0798F, -0.0074F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 76, 49, -0.275F, 0.0F, 0.0F, 6, 6, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(8.0507F, 7.4565F, -4.1906F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.18F, 0.3313F, -0.0467F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 135, 31, -5.725F, -6.0F, 0.0F, 6, 6, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-7.9493F, 7.4565F, -4.1906F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.18F, -0.3313F, 0.0467F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 135, 31, -0.275F, -6.0F, 0.0F, 6, 6, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(7.0816F, 4.3073F, -7.3911F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.5708F, 0.4843F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 111, 98, -3.0F, -7.0F, -1.0F, 3, 7, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-6.9802F, 4.3073F, -7.3911F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.5708F, -0.4843F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 111, 98, 0.0F, -7.0F, -1.0F, 3, 7, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.4493F, 5.3073F, -13.5641F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.5708F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 51, 3, -2.5F, 0.0F, 0.0F, 6, 8, 2, 0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.8628F, 5.1857F, -14.4878F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.5806F, 0.3717F, 0.3714F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 125, 87, 0.0F, -1.0F, -0.75F, 0, 2, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.0507F, 5.6725F, -14.6209F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 1.4316F, 0.346F, -0.0475F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 122, 87, 0.0F, -1.0F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.3628F, 5.3073F, -13.4957F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.7092F, 0.3215F, 0.4152F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 38, 122, 0.0F, 0.0F, -0.75F, 0, 6, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.5507F, 5.3073F, -13.5641F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.5708F, 0.3491F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 122, 0.0F, 0.0F, -0.75F, 0, 6, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.2614F, 5.3073F, -13.4957F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.7092F, -0.3215F, -0.4152F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 122, 0.0F, 0.0F, -0.75F, 0, 6, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.4493F, 5.3073F, -13.5641F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.5708F, -0.3491F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 122, 0.0F, 0.0F, -0.75F, 0, 6, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(4.1507F, 4.3811F, -12.9379F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.4552F, 0.5247F, -0.0216F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 82, 109, -2.0F, -5.225F, -0.925F, 2, 5, 2, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-4.0493F, 4.3811F, -12.9379F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 1.4552F, -0.5247F, 0.0216F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 82, 109, 0.0F, -5.225F, -0.925F, 2, 5, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.7614F, 5.1857F, -14.4878F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 1.5806F, -0.3717F, -0.3714F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 125, 87, 0.0F, -1.0F, -0.75F, 0, 2, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.4073F, 4.9498F, -15.3525F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -3.1416F, -1.1781F, -1.5708F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 131, 87, 0.0F, -2.9498F, -0.85F, 0, 3, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.6073F, 5.5498F, -15.5525F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -1.5708F, 1.5708F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 128, 87, 0.0F, -3.1498F, -0.25F, 0, 3, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.4493F, -4.4766F, 1.0109F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2182F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 39, 109, -6.5F, 0.0F, -7.0F, 14, 3, 7, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-8.5886F, 3.5F, 1.0128F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.1745F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 140, 41, 0.0F, -5.75F, -5.0F, 5, 9, 5, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 141, 15, 0.0F, -5.75F, -7.0F, 5, 8, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(8.69F, 3.5F, 1.0128F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.1745F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 141, 15, -5.0F, -5.75F, -7.0F, 5, 8, 2, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 140, 41, -5.0F, -5.75F, -5.0F, 5, 9, 5, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.9493F, 5.6725F, -14.6209F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 1.4316F, -0.346F, 0.0475F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 122, 87, 0.0F, -1.0F, -0.25F, 0, 2, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.9493F, 4.7852F, -17.5299F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.4399F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 76, -0.5F, 0.0F, 0.0F, 3, 4, 2, -0.001F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0507F, 1.2222F, -18.0821F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.7418F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 34, 69, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.002F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.9493F, -0.8909F, -13.5506F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4363F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 41, -0.5F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.4493F, -2.9615F, -5.8232F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2618F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 0, -3.5F, 0.0F, -8.0F, 8, 3, 8, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-2.9993F, 1.3073F, -13.6886F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3738F, -0.4523F, -0.0442F);
        this.eye.cubeList.add(new ModelBox(eye, 124, 12, -0.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(3.1007F, 1.3073F, -13.6886F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3738F, 0.4523F, 0.0442F);
        this.eye2.cubeList.add(new ModelBox(eye2, 124, 12, -2.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.membrane2 = new AdvancedModelRenderer(this);
        this.membrane2.setRotationPoint(3.3507F, 1.3073F, -13.6886F);
        this.head.addChild(membrane2);
        this.setRotateAngle(membrane2, 0.3738F, 0.4523F, 0.0442F);
        this.membrane2.cubeList.add(new ModelBox(membrane2, 156, 57, 0.225F, -1.025F, -1.1F, 0, 2, 2, 0.0F, true));

        this.membrane = new AdvancedModelRenderer(this);
        this.membrane.setRotationPoint(-3.3507F, 1.3073F, -13.6886F);
        this.head.addChild(membrane);
        this.setRotateAngle(membrane, 0.3738F, -0.4523F, -0.0442F);
        this.membrane.cubeList.add(new ModelBox(membrane, 156, 57, -0.225F, -1.025F, -1.1F, 0, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.4493F, 3.7505F, 1.0776F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 83, 59, -3.0F, 0.0F, -12.0F, 7, 3, 6, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 78, -1.5F, 0.0F, -17.0F, 4, 3, 5, 0.001F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 5.4015F, -6.9154F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.2836F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 125, 112, -3.5F, -3.0F, -5.0F, 8, 3, 4, -0.002F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 25, 28, -1.5F, -3.0F, -9.0F, 4, 3, 4, -0.002F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(7.1F, 1.5F, -7.0F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.48F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 66, 59, -2.975F, -1.5F, -10.025F, 3, 3, 10, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-6.1F, 1.5F, -7.0F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.48F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 66, 59, -0.025F, -1.5F, -10.025F, 3, 3, 10, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(1.5659F, 0.0F, -16.8882F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1384F, 0.3215F, -0.4152F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 117, 0.0F, -0.75F, 0.0F, 0, 1, 9, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.7538F, 0.0F, -16.9566F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.3491F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 68, 119, 0.0F, -0.75F, 0.0F, 0, 1, 9, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5659F, 0.0F, -16.8882F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1384F, -0.3215F, 0.4152F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 68, 117, 0.0F, -0.75F, 0.0F, 0, 1, 9, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.7538F, 0.0F, -16.7566F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -1.5708F, 1.1781F, -1.5708F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 68, 121, 0.0F, -0.75F, -0.25F, 0, 1, 3, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.7538F, 0.0F, -16.9566F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 1.5708F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 68, 121, 0.0F, -0.75F, -0.25F, 0, 1, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.7538F, 0.0F, -16.9566F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.3491F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 68, 119, 0.0F, -0.75F, 0.0F, 0, 1, 9, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -0.6807F, -6.9911F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0218F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 69, -5.0F, -3.5F, 0.0F, 11, 5, 1, -0.001F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.5F, 6.4664F, 0.0031F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1527F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 104, 49, -7.5F, -6.0F, -8.0F, 13, 6, 8, 0.002F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-8.3067F, 5.3212F, -14.0033F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0932F, 0.0045F, 1.0969F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 125, 87, 0.0F, 0.0F, 0.0F, 0, 14, 10, 0.0F, false));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 55, 40, 0.025F, 0.0F, 0.0F, 0, 14, 10, 0.0F, false));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 95, 96, -0.5F, 0.0F, 0.0F, 1, 7, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(8.3067F, 5.3212F, -14.0033F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0932F, -0.0045F, -1.0969F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 125, 87, 0.0F, 0.0F, 0.0F, 0, 14, 10, 0.0F, true));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 55, 40, -0.025F, 0.0F, 0.0F, 0, 14, 10, 0.0F, true));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 95, 96, -0.5F, 0.0F, 0.0F, 1, 7, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = 0.139F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = 0.139F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCretoxyrhina ee = (EntityPrehistoricFloraCretoxyrhina) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCretoxyrhina entity = (EntityPrehistoricFloraCretoxyrhina) entitylivingbaseIn;int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2), main.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-0.95);
        this.setRotateAngle(frontRightFin, frontRightFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5), frontRightFin.rotateAngleY + (float) Math.toRadians(0), frontRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.25);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*4), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(-0.85);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*6), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-270))*20), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.825);
        this.setRotateAngle(frontLeftFin, frontLeftFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5), frontLeftFin.rotateAngleY + (float) Math.toRadians(0), frontLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1.5));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCretoxyrhina entity = (EntityPrehistoricFloraCretoxyrhina) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3), main.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-0.95);
        this.setRotateAngle(frontRightFin, frontRightFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-1.5), frontRightFin.rotateAngleY + (float) Math.toRadians(0), frontRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.25);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*6), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(-0.85);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*22), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.85);
        this.setRotateAngle(frontLeftFin, frontLeftFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1.5), frontLeftFin.rotateAngleY + (float) Math.toRadians(0), frontLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCretoxyrhina entity = (EntityPrehistoricFloraCretoxyrhina) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 5) / 3) * (1-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.275 + (((tickAnim - 3) / 5) * (0.275-(0.275)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.15 + (((tickAnim - 3) / 5) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.275 + (((tickAnim - 8) / 3) * (0-(0.275)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -0.15 + (((tickAnim - 8) / 3) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.membrane2.rotationPointX = this.membrane2.rotationPointX + (float)(xx);
        this.membrane2.rotationPointY = this.membrane2.rotationPointY - (float)(yy);
        this.membrane2.rotationPointZ = this.membrane2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.01-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1.0125-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.01 + (((tickAnim - 3) / 5) * (1.01-(1.01)));
            yy = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 3) / 5) * (1.0125-(1.0125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.01 + (((tickAnim - 8) / 3) * (1-(1.01)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 8) / 3) * (1-(1.0125)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.membrane2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.5 + (((tickAnim - 5) / 3) * (0-(24.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.175 + (((tickAnim - 3) / 5) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.175 + (((tickAnim - 3) / 5) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.175 + (((tickAnim - 8) / 3) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -0.175 + (((tickAnim - 8) / 3) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.membrane.rotationPointX = this.membrane.rotationPointX + (float)(xx);
        this.membrane.rotationPointY = this.membrane.rotationPointY - (float)(yy);
        this.membrane.rotationPointZ = this.membrane.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.01-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1.0125-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.01 + (((tickAnim - 3) / 5) * (1.01-(1.01)));
            yy = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 3) / 5) * (1.0125-(1.0125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.01 + (((tickAnim - 8) / 3) * (1-(1.01)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 8) / 3) * (1-(1.0125)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.membrane.setScale((float)xx, (float)yy, (float)zz);

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        EntityPrehistoricFloraCretoxyrhina ee = (EntityPrehistoricFloraCretoxyrhina) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
           // this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

