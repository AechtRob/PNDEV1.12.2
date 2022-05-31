package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelListracanthus extends AdvancedModelBase {
    private final AdvancedModelRenderer bodybase;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r53;

    private ModelAnimator animator;

    public ModelListracanthus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 16.95F, -7.0F);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 76, 46, -1.99F, 5.7F, -4.01F, 4, 1, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 80, 75, -2.5F, 2.05F, -8.0F, 5, 3, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 78, 59, -2.5F, 1.1F, -4.0F, 5, 5, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 74, 2, -2.5F, 1.05F, 0.0F, 5, 6, 6, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 24, 43, -0.01F, -1.5F, -4.0F, 0, 3, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 24, 24, -0.01F, -2.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 0, 1.26F, -1.5F, -4.0F, 0, 3, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, 1.26F, -2.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 21, -1.26F, -2.0F, 0.0F, 0, 3, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -1.26F, -1.5F, -4.0F, 0, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 1.0F, 3.0F);
        this.bodybase.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 46, 0.0F, -1.25F, -11.0F, 0, 2, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 26, 0.0F, -3.0F, -3.0F, 0, 3, 6, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 34, 0.0F, -2.5F, -7.0F, 0, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, 1.0F, 3.0F);
        this.bodybase.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 48, 0.0F, -1.25F, -11.0F, 0, 2, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, 0.0F, -2.5F, -7.0F, 0, 3, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 4, 0.0F, -3.0F, -3.0F, 0, 3, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 26, -2.0F, 0.45F, 0.1F, 4, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.bodybase.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5149F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 0, -1.99F, -2.25F, -0.425F, 4, 3, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.05F, -6.0F);
        this.bodybase.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 14, -2.01F, -2.075F, 1.9F, 4, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.bodybase.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 27, 0.0F, -3.875F, -1.2F, 0, 2, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 80, 68, -2.0F, -2.35F, -0.225F, 4, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.bodybase.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, -0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 36, -1.0F, -3.875F, -1.2F, 0, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.bodybase.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 38, 1.0F, -3.875F, -1.2F, 0, 2, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 3.9F, 0.25F);
        this.bodybase.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.6F, -1.75F, -0.15F, 1, 5, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 3.9F, 0.25F);
        this.bodybase.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 21, -0.4F, -1.75F, -0.15F, 1, 5, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 3.05F, 6.0F);
        this.bodybase.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 44, 16, 0.0F, -6.05F, 0.0F, 0, 3, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -3.2F, 0.0F, 6, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 42, -2.5F, 3.3F, 0.01F, 5, 1, 14, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, -1.3F, 3.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.4363F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 37, 1.0F, -3.0F, -3.0F, 0, 3, 14, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, -3.05F, 3.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.4363F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 0, 1.0F, -3.0F, -3.0F, 0, 3, 14, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.05F, 0.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 43, 2.01F, -2.0F, 0.0F, 0, 3, 14, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, -3.05F, 3.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 43, -1.0F, -3.0F, -3.0F, 0, 3, 14, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.05F, 0.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 13, -2.01F, -2.0F, 0.0F, 0, 3, 14, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -1.3F, 3.0F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.4363F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 40, -1.0F, -3.0F, -3.0F, 0, 3, 14, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.0F, 3.25F, 0.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, -0.2618F, 0.5236F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 56, 0, 0.0F, 0.0F, 0.0F, 8, 0, 8, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.0F, 3.25F, 0.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.2618F, -0.5236F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 40, 0, -8.0F, 0.0F, 0.0F, 8, 0, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 62, 7, -0.01F, -6.05F, 0.0F, 0, 3, 13, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, -2.49F, -2.95F, -0.99F, 5, 7, 14, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, -1.3F, 3.0F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 60, 1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, -3.05F, 3.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.4363F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 62, 20, 1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -4.05F, 0.0F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 10, 1.76F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -3.05F, 3.0F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 57, -1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -4.05F, 0.0F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1745F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 60, -1.76F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, -1.3F, 3.0F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.4363F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 60, -1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 13.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 57, 0.0F, -5.8F, 0.0F, 0, 3, 13, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 26, 7, -1.99F, -2.95F, -0.99F, 4, 6, 14, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9F, -1.05F, 3.0F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.4363F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 54, 1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.9F, -2.8F, 3.0F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.4363F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 47, 1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.1745F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 52, 54, 1.51F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.9F, -2.8F, 3.0F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.4363F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 51, -1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.1745F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 57, -1.51F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.9F, -1.05F, 3.0F);
        this.body3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.4363F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 54, -1.0F, -3.0F, -3.0F, 0, 3, 13, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.5F, 2.75F, 2.0F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.6981F, -0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 21, 0, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 2.75F, 2.0F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, -0.6981F, 0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 21, 5, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 13.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 51, -0.01F, -4.55F, 0.0F, 0, 3, 13, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 62, 27, -0.01F, 2.75F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 24, 28, -1.49F, -2.2F, -0.99F, 3, 5, 14, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.55F, 0.0F);
        this.body4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.1745F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 26, 51, -1.26F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.15F, -1.55F, 3.0F);
        this.body4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.4363F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 68, 42, -1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.15F, 0.2F, 3.0F);
        this.body4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 68, 40, -1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.15F, -1.55F, 3.0F);
        this.body4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.4363F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 69, 1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -2.55F, 0.0F);
        this.body4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 4, 1.26F, -2.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.15F, 0.2F, 3.0F);
        this.body4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.4363F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 68, 44, 1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.5F, 13.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 67, -0.01F, -4.05F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 62, 25, -0.01F, 1.7F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 44, 33, -0.99F, -2.2F, -0.99F, 2, 4, 14, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.6F, 0.8F, 3.0F);
        this.body5.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.4363F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 26, 65, -0.75F, -3.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.6F, -1.05F, 3.0F);
        this.body5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 65, -1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.6F, 0.8F, 3.0F);
        this.body5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.4363F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 68, 38, 0.75F, -3.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.6F, -1.05F, 3.0F);
        this.body5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.4363F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 52, 67, 1.0F, -3.0F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.body5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.1745F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 26, 67, 0.76F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.body5.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.1745F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 52, 65, -0.76F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 13.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 62, 25, -0.01F, 1.45F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 52, 63, 0.0F, -3.05F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 24, 47, -0.51F, -1.45F, -0.99F, 1, 3, 14, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -2.05F, 0.0F);
        this.body6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.1745F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 26, 63, -0.51F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -2.05F, 0.0F);
        this.body6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.1745F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 63, 0.51F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.6F, -0.05F, 3.0F);
        this.body6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.4363F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 62, 29, -0.6F, -2.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.6F, -0.05F, 3.0F);
        this.body6.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 0.4363F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 62, 31, 0.6F, -2.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.body6.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 52, 63, 0.0F, -3.05F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 62, 23, 0.0F, 1.45F, 0.0F, 0, 2, 13, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 25, 48, -0.5F, -1.451F, 0.01F, 1, 3, 13, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -2.05F, 0.0F);
        this.body8.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, -0.1745F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 26, 63, -0.51F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -2.05F, 0.0F);
        this.body8.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, 0.1745F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 63, 0.51F, -1.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.6F, -0.05F, 3.0F);
        this.body8.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.4363F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 62, 29, -0.6F, -2.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.6F, -0.05F, 3.0F);
        this.body8.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.4363F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 62, 31, 0.6F, -2.5F, -3.0F, 0, 2, 13, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.body8.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 70, 74, -0.49F, -0.95F, 0.01F, 1, 2, 8, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 50, -0.01F, -2.55F, 0.0F, 0, 2, 10, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 48, 0, -0.01F, 0.45F, 0.0F, 0, 2, 10, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 0, -0.49F, -0.45F, 8.01F, 1, 1, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -1.55F, 0.0F);
        this.body7.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.1745F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 48, 2, -0.61F, -0.5F, 0.0F, 0, 2, 10, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -1.55F, 0.0F);
        this.body7.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, 0.1745F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 52, 0.61F, -0.5F, 0.0F, 0, 2, 10, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.bodybase.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 82, -2.0F, 0.0F, -3.75F, 4, 1, 4, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.0F, -3.75F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1745F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 44, 33, -1.5F, -1.0F, 0.025F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodybase.render(f5 * 0.6F);
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

        this.bodybase.offsetY = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body8, this.body7};

        float speed = 0.285F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.320F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.03F * still, -0.2, f2, 0.6F * still);
            this.chainSwing(fishTail, speed * still, 0.75F * still, -2.35, f2, 0.6F * still);
            this.swing(bodybase, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(bodybase, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 1.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 1.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 1.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 1.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 1.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 1.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 1.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 1.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.bodybase.rotateAngleZ = (float) Math.toRadians(90);
            this.bodybase.offsetY = 0.55F;
            this.bob(bodybase, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.12F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

