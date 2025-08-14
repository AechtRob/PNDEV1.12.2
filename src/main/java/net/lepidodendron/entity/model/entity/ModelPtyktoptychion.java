package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPtyktoptychion;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPtyktoptychion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer crest;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r36;

    private ModelAnimator animator;

    public ModelPtyktoptychion() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -9.0F, -5.0F, 6, 8, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 47, -2.5F, -8.1F, -10.0F, 5, 5, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 57, -2.6F, -7.6F, -8.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 16, -2.7F, -7.1F, -8.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 57, 1.6F, -7.6F, -8.5F, 1, 2, 2, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 52, 16, 1.7F, -7.1F, -8.0F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -16.6F, 1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.117F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 9, -0.5F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -15.4F, 2.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7941F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 0, 0.0F, 0.0005F, -0.0068F, 0, 10, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -16.6F, 1.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7069F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 70, -0.5F, 0.0005F, -0.0068F, 1, 10, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.925F, -3.15F, -10.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 37, -1.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -8.825F, -5.4F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 50, -2.0F, 5.6837F, -2.9884F, 4, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.625F, -10.775F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 69, -1.5F, -4.0F, -2.0F, 3, 3, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -11.85F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 72, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.0F, -11.9F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 30, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.925F, -3.15F, -10.25F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, -0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 37, 0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.1F, -10.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 70, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -8.0F, -10.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 0, -1.5F, 0.0F, -5.0F, 2, 1, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -9.0F, -5.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 36, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -2.25F, -3.75F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.0873F, -0.5236F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 70, 24, 0.0F, -1.0F, -0.25F, 1, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.pectoralfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 41, 0.0F, -7.0F, 1.0F, 0, 8, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -2.25F, -3.75F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.0873F, 0.5236F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 70, 24, -1.0F, -1.0F, -0.25F, 1, 2, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.pectoralfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 41, 0.0F, -7.0F, 1.0F, 0, 8, 8, 0.0F, true));

        this.crest = new AdvancedModelRenderer(this);
        this.crest.setRotationPoint(0.5F, -8.825F, -7.25F);
        this.body.addChild(crest);
        this.setRotateAngle(crest, -0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 71, -1.0F, -0.1F, -1.625F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.4811F, -2.1047F);
        this.crest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.3439F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 51, -0.5F, -0.6447F, -0.0139F, 1, 2, 1, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.5F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 30, 18, -2.5F, -2.5F, -1.0F, 5, 5, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.325F, 0.3F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 31, -2.5F, -3.0F, -1.0F, 5, 2, 8, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.4F, -0.05F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 71, 0.0F, -5.2F, 4.0F, 0, 4, 3, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 0, -2.0F, -2.0F, -1.0F, 4, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.15F, 3.75F, 6.0F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, -0.1309F, 0.6109F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 67, 72, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.15F, 3.75F, 6.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.1309F, -0.6109F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 67, 72, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.5F, 5.25F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.8727F, -0.3054F, 0.7418F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 70, 67, 0.0F, -1.0F, -0.25F, 1, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 1.0F, -0.25F);
        this.pelvicfinright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 24, 0.0F, -4.0F, 1.0F, 0, 5, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.5F, 5.25F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.8727F, 0.3054F, -0.7418F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 70, 67, -1.0F, -1.0F, -0.25F, 1, 2, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 1.0F, -0.25F);
        this.pelvicfinleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 24, 0.0F, -4.0F, 1.0F, 0, 5, 7, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 20, 51, -2.0F, -1.9F, -1.0F, 4, 4, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.375F, 0.0F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 57, -1.5F, 0.0F, -1.0F, 3, 1, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.5F, -0.25F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 16, -2.0F, 0.0F, -1.0F, 4, 2, 6, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.9F, -7.05F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0698F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 6, 0.0F, -5.2F, 7.0F, 0, 4, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.1F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 37, -1.5F, -1.45F, -1.0F, 3, 2, 8, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.075F, -0.1F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0698F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 9, -1.0F, -2.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.275F, 0.2F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1963F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 22, 41, -1.5F, -2.0F, -1.0F, 3, 2, 8, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.0F, -12.05F);
        this.body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0698F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 14, 61, 0.0F, -3.2F, 12.0F, 0, 2, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.45F, 7.0F);
        this.body4.addChild(body5);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.8F, 5.1F);
        this.body5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5411F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 67, -0.5F, -2.0F, 11.0F, 1, 1, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.5F, 5.5F);
        this.body5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5847F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 42, 64, -0.5F, -2.0F, 5.0F, 1, 1, 6, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.5F, 5.6F);
        this.body5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6283F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 64, -0.5F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 5.15F, 0.25F);
        this.body5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6545F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 18, 0.0F, -4.2F, 12.0F, 0, 4, 15, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 4.65F, -8.05F);
        this.body5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 57, -0.01F, -5.2F, 12.0F, 0, 5, 7, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.05F, -11.8F);
        this.body5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.192F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 57, 0.0F, -3.2F, 12.0F, 0, 3, 7, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.1F, 0.1F);
        this.body5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2356F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 60, 42, -1.0F, -2.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.1F, -8.575F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 61, -1.0F, 0.0F, -1.95F, 2, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 1.7F, 0.2F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3927F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 72, 56, -0.5F, -1.0F, -1.95F, 2, 1, 2, -0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.5F;
        this.body.offsetX = 0.35F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.6F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        EntityPrehistoricFloraPtyktoptychion ee = (EntityPrehistoricFloraPtyktoptychion) entitylivingbaseIn;

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
        EntityPrehistoricFloraPtyktoptychion entity = (EntityPrehistoricFloraPtyktoptychion) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*1), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*6), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*8), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), jaw.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPtyktoptychion entity = (EntityPrehistoricFloraPtyktoptychion) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*7), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*11), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*11), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), jaw.rotateAngleZ + (float) Math.toRadians(0));
        
    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPtyktoptychion entity = (EntityPrehistoricFloraPtyktoptychion) entitylivingbaseIn;
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.92-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.92 + (((tickAnim - 5) / 3) * (0-(32.92)));
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
        

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        EntityPrehistoricFloraPtyktoptychion ee = (EntityPrehistoricFloraPtyktoptychion) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = -0.2F;
           // this.bob(body, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

