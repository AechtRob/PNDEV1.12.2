package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHybodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHybodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hybodus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightFrontFin;
    private final AdvancedModelRenderer leftFrontFin;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer lowerjaw;
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

    private ModelAnimator animator;

    public ModelHybodus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.Hybodus = new AdvancedModelRenderer(this);
        this.Hybodus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.125F, -7.0F);
        this.Hybodus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.875F, 0.0F, 8, 6, 17, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.75F, 8.9F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 82, 0.0F, -6.75F, 0.0F, 0, 7, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, -3.75F, 7.7F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 79, -0.75F, -6.75F, 0.0F, 1, 7, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.5F, 9.925F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0131F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 60, -3.5F, -1.0F, 0.0F, 7, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0305F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 23, -3.5F, -1.0F, 0.0F, 7, 2, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.25F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 0, -3.5F, 0.0F, 0.0F, 7, 1, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.825F, 8.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, -3.5F, 0.0F, 0.0F, 7, 1, 9, 0.0F, false));

        this.rightFrontFin = new AdvancedModelRenderer(this);
        this.rightFrontFin.setRotationPoint(-4.0F, 2.575F, 5.0F);
        this.body.addChild(rightFrontFin);
        this.setRotateAngle(rightFrontFin, -0.1309F, 0.4363F, -0.5672F);
        this.rightFrontFin.cubeList.add(new ModelBox(rightFrontFin, 64, 44, -8.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, false));

        this.leftFrontFin = new AdvancedModelRenderer(this);
        this.leftFrontFin.setRotationPoint(4.0F, 2.575F, 5.0F);
        this.body.addChild(leftFrontFin);
        this.setRotateAngle(leftFrontFin, -0.1309F, -0.4363F, 0.5672F);
        this.leftFrontFin.cubeList.add(new ModelBox(leftFrontFin, 64, 44, 0.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.175F, 17.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 36, 35, -3.0F, -2.75F, -1.3F, 6, 6, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.55F, -0.3F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 50, -2.5F, -1.0F, -1.0F, 5, 1, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.05F, -0.3F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 9, -2.5F, -1.0F, -1.0F, 5, 1, 9, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.25F, 7.7F);
        this.body2.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 60, 50, -2.0F, -2.35F, -0.5F, 4, 4, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.225F, 0.5F);
        this.tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 19, -1.5F, -1.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.225F, 0.5F);
        this.tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 35, -1.5F, 2.9572F, -1.6526F, 3, 2, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.65F, 0.175F);
        this.tail1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 71, 0.0F, -5.75F, 0.0F, 0, 6, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, -3.55F, -0.025F);
        this.tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 83, -0.75F, -4.75F, 0.0F, 1, 5, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.55F, 6.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 70, 27, -1.5F, -0.55F, -0.5F, 3, 2, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.325F, 0.45F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 70, -1.0F, -1.0F, -1.0F, 2, 1, 7, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.35F, 0.4F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 70, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.2F, 3.15F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 54, 0.0F, 1.8F, -1.0F, 0, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.15F, 5.9F);
        this.tail2.addChild(tail3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0F, 0.75F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 23, 0.0F, -2.2F, -1.0F, 0, 7, 18, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 58, -0.5F, -2.0F, -1.0F, 1, 2, 11, 0.0F, false));

        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-1.25F, 3.6F, 4.0F);
        this.body2.addChild(rightBackFin);
        this.setRotateAngle(rightBackFin, 0.0873F, 0.0F, -0.7418F);
        this.rightBackFin.cubeList.add(new ModelBox(rightBackFin, 12, 77, -3.5F, 0.0F, -1.0F, 4, 0, 5, 0.0F, false));
        this.rightBackFin.cubeList.add(new ModelBox(rightBackFin, -6, 0, -1.0F, 0.0F, 4.0F, 2, 0, 6, 0.0F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(1.25F, 3.6F, 4.0F);
        this.body2.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, 0.0873F, 0.0F, 0.7418F);
        this.leftBackFin.cubeList.add(new ModelBox(leftBackFin, 12, 77, -0.5F, 0.0F, -1.0F, 4, 0, 5, 0.0F, true));
        this.leftBackFin.cubeList.add(new ModelBox(leftBackFin, -6, 0, -1.0F, 0.0F, 4.0F, 2, 0, 6, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.2F, -7.0F);
        this.Hybodus.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 52, 61, -1.5F, -2.0F, -6.8F, 3, 2, 7, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, -3.775F, -1.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 48, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.25F, -3.675F, -2.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 48, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.775F, -1.825F, -4.15F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.4581F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 58, -1.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.4F, -2.425F, -6.4F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.5018F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 82, -2.0F, 0.0F, 0.1F, 2, 2, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.925F, -1.5F, -3.75F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.1963F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 79, -3.0F, -2.0F, 0.1F, 3, 2, 4, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.425F, -2.0F, -6.5F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.5018F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 71, -2.0F, 0.0F, 0.1F, 2, 2, 4, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.375F, 0.0F, -3.05F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1527F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 77, -3.0F, -2.0F, 0.1F, 3, 2, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.775F, -1.825F, -4.15F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, -0.4581F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 58, 0.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.925F, -1.5F, -3.75F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, -0.1963F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 79, 0.0F, -2.0F, 0.1F, 3, 2, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.15F, 0.75F, -3.25F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1527F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 73, -2.0F, -1.0F, 0.1F, 2, 1, 4, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.7F, -0.05F, -5.75F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2618F, 0.5018F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 19, -1.0F, -1.0F, 0.1F, 1, 1, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.7F, -0.05F, -5.75F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2618F, -0.5018F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 62, 19, 0.0F, -1.0F, 0.1F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.15F, 0.75F, -3.25F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.1527F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 80, 73, 0.0F, -1.0F, 0.1F, 2, 1, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.375F, 0.0F, -3.05F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.1527F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 77, 0.0F, -2.0F, 0.1F, 3, 2, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.4F, -2.425F, -6.4F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3491F, -0.5018F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 82, 0.0F, 0.0F, 0.1F, 2, 2, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.425F, -2.0F, -6.5F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.5018F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 71, 0.0F, 0.0F, 0.1F, 2, 2, 4, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.25F, -3.675F, -2.5F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, -0.2618F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 48, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.5F, -3.775F, -1.5F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1309F, 0.0F, -0.2618F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 48, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -3.5F, -3.9F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1527F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 72, 61, -2.5F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.95F, -7.575F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3927F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 62, 78, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.02F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0436F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 24, 69, -1.5F, 0.0F, -6.575F, 3, 1, 7, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 83, -1.5F, -2.0F, -2.575F, 3, 2, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 2.15F, -3.675F);
        this.lowerjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2182F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 76, 78, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.4F, 0.0F, -6.35F);
        this.lowerjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3578F, 0.4669F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 80, 5, -2.0F, 0.0F, 0.1F, 2, 1, 3, -0.01F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.625F, 2.025F, -4.3F);
        this.lowerjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1745F, 0.1963F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 78, 9, -3.0F, -2.0F, 0.1F, 3, 2, 5, -0.02F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.425F, -1.0F, -6.5F);
        this.lowerjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.4843F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 80, 68, -2.0F, 1.0F, 0.1F, 2, 1, 4, -0.01F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(3.3F, 1.0F, -3.05F);
        this.lowerjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.1527F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 80, 0, -3.0F, -1.0F, 0.1F, 3, 1, 4, -0.02F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(3.15F, 0.1F, -3.225F);
        this.lowerjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.1527F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 49, -2.0F, -1.0F, 0.1F, 2, 1, 4, -0.02F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.825F, 0.025F, -5.6F);
        this.lowerjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3491F, 0.4581F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 30, 83, -1.0F, 0.0F, 0.1F, 1, 1, 3, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.825F, 0.025F, -5.6F);
        this.lowerjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3491F, -0.4581F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 30, 83, 0.0F, 0.0F, 0.1F, 1, 1, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.05F, -6.4F);
        this.lowerjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.3752F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 19, -1.5F, -1.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.625F, 2.025F, -4.3F);
        this.lowerjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1745F, -0.1963F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 78, 9, 0.0F, -2.0F, 0.1F, 3, 2, 5, -0.02F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-3.15F, 0.1F, -3.225F);
        this.lowerjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.1527F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 49, 0.0F, -1.0F, 0.1F, 2, 1, 4, -0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-3.3F, 1.0F, -3.05F);
        this.lowerjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.1527F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 80, 0, 0.0F, -1.0F, 0.1F, 3, 1, 4, -0.02F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.4F, 0.0F, -6.35F);
        this.lowerjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3578F, -0.4669F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 80, 5, 0.0F, 0.0F, 0.1F, 2, 1, 3, -0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.425F, -1.0F, -6.5F);
        this.lowerjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -0.4843F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 68, 0.0F, 1.0F, 0.1F, 2, 1, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hybodus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hybodus.offsetY = -0.2F;
        this.Hybodus.offsetX = 0.3F;
        this.Hybodus.offsetZ = 2.0F;
        this.Hybodus.rotateAngleY = (float)Math.toRadians(120);
        this.Hybodus.rotateAngleX = (float)Math.toRadians(1);
        this.Hybodus.rotateAngleZ = (float)Math.toRadians(0);
        this.Hybodus.scaleChildren = true;
        float scaler = 0.5F;
        this.Hybodus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hybodus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftFrontFin, 0.2F, 0.0F, -0.8F);
        this.setRotateAngle(rightFrontFin, 0.2F, 0.0F, 0.8F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftBackFin, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        //End of pose, now render the model:
        this.Hybodus.render(f);
        //Reset rotations, positions and sizing:
        this.Hybodus.setScale(1.0F, 1.0F, 1.0F);
        this.Hybodus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Hybodus.rotateAngleY = (float) Math.toRadians(90);
        this.Hybodus.offsetY = -0.1F;
        this.Hybodus.offsetX = -0.05F;
        this.Hybodus.offsetZ = -0.05F;
        this.Hybodus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hybodus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.2F, 0.4363F, 0.0F);
        this.setRotateAngle(leftFrontFin, -0.10F, 0.0F, -0.75F);
        this.setRotateAngle(rightFrontFin, 12.5F, -0.0F, 0.75F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(leftBackFin, 0.0F, -0.0611F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(tail1, 0.0F, 6.3F, 0.1F);
        this.setRotateAngle(tail2, 0.0F, 6.0F, 0.0F);
        this.setRotateAngle(tail3, 0.1309F, 6.5F, 0.0F);
        this.Hybodus.offsetY = -0.14F;
        this.Hybodus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Hybodus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftFrontFin, 0.2F, 0.0F, -0.8F);
        this.setRotateAngle(rightFrontFin, 0.2F, 0.0F, 0.8F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftBackFin, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.Hybodus.offsetY = 0.0F;
        this.Hybodus.render(0.01F);
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

        //this.Hybodus.offsetY = 0.5F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail1, this.tail2, this.tail3};
        ((EntityPrehistoricFloraHybodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.85, f2, 0.6F * still);
            this.swing(Hybodus, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Hybodus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(leftFrontFin, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftFrontFin, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(rightFrontFin, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightFrontFin, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(leftBackFin, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftBackFin, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(rightBackFin, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightBackFin, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Hybodus.rotateAngleZ = (float) Math.toRadians(90);
            //this.Hybodus.offsetY = 0.5F;
            this.bob(Hybodus, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

