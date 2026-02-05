package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHyneria;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHyneria extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer jaw;
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

    public ModelHyneria() {
        this.textureWidth = 96;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.575F, -7.0F, 7, 7, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.525F, -7.325F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 53, -3.0F, -6.0F, -3.0F, 6, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.375F, -8.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 58, -3.0F, -2.0F, -3.0F, 6, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.725F, -10.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 38, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.375F, -14.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 30, -2.0F, -1.0F, -1.0F, 4, 3, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.175F, -18.1F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 69, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.2F, -3.6F, -9.475F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0524F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -1.0F, -3.0F, -1.475F, 2, 5, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.2F, -3.6F, -9.475F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0524F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 59, -1.0F, -3.0F, -1.475F, 2, 5, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.25F, -3.675F, -18.35F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.2705F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 50, -1.0F, -1.25F, -0.525F, 2, 1, 2, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.25F, -3.675F, -18.35F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.2705F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 69, -1.0F, -1.45F, 1.35F, 2, 2, 3, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.45F, -2.75F, -13.725F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.1396F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 60, -1.0F, -3.0F, -1.4F, 2, 3, 5, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.2443F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 36, 0.9F, -0.5F, 3.575F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 36, 0.9F, -0.5F, 1.825F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.2705F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 34, 0.875F, -0.5F, 0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.175F, -3.6F, -18.35F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.576F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 38, 0.875F, -0.875F, -0.85F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.2705F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 63, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.45F, -2.75F, -13.725F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, -0.1396F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 60, -1.0F, -3.0F, -1.4F, 2, 3, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.2705F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 48, 0.05F, -1.3F, 0.65F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, -0.2705F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 48, -1.05F, -1.3F, 0.65F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.25F, -3.675F, -18.35F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, -0.2705F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 69, -1.0F, -1.45F, 1.35F, 2, 2, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.25F, -3.675F, -18.35F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, -0.2705F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 50, -1.0F, -1.25F, -0.525F, 2, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1047F, -0.2443F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 36, -0.9F, -0.5F, 3.575F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 36, -0.9F, -0.5F, 1.825F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.175F, -3.6F, -18.35F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, -0.576F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 38, -0.875F, -0.875F, -0.85F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, -0.2705F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 34, -0.875F, -0.5F, 0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.25F, -3.6F, -18.35F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, -0.2705F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 63, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.6F, -18.6F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 50, -1.0F, -1.0F, -1.0F, 2, 1, 9, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.15F, -1.9F, -5.8F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.2618F, -0.3927F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 52, 69, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 28, 60, 0.0F, -1.725F, 1.0F, 0, 3, 6, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.15F, -1.9F, -5.8F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.2618F, 0.3927F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 52, 69, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 28, 60, 0.0F, -1.725F, 1.0F, 0, 3, 6, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.375F, 3.0F);
        this.body.addChild(body2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.65F, 0.8F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 0, -2.0F, 3.0F, -2.0F, 5, 1, 9, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.15F, 1.0F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0087F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 17, -3.0F, -2.0F, -2.0F, 6, 6, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.15F, 8.0F);
        this.body2.addChild(body3);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.4F, 0.625F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 40, -1.0F, 1.0F, -2.0F, 4, 2, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.15F, 1.0F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 32, -2.5F, -2.0F, -2.0F, 5, 5, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.95F, -0.025F);
        this.body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5672F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 0, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 3.775F, 2.65F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.3927F, -0.2618F, 0.2182F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 72, 9, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.pelvicfinright.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3011F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 64, 0.0F, -1.725F, -0.5F, 0, 2, 6, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 3.775F, 2.65F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.3927F, 0.2618F, -0.2182F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 72, 9, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.pelvicfinleft.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3011F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 64, 0.0F, -1.725F, -0.5F, 0, 2, 6, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.4F, 7.0F);
        this.body3.addChild(body4);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.35F, -0.125F);
        this.body4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1396F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 52, 20, -1.0F, -1.0F, -0.95F, 2, 3, 7, 0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.1F, 0.25F);
        this.body4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1134F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 52, 10, -1.0F, -2.0F, -1.0F, 3, 3, 7, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.85F, 1.5F);
        this.body4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6545F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 45, 0.0F, -4.0F, 0.0F, 0, 4, 10, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.6F, 1.175F);
        this.body4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.8029F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 50, 40, 0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 6.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 68, 43, -1.0F, -1.475F, -1.0F, 2, 3, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.body5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0654F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 69, -1.0F, 0.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.025F, 2.9F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 30, 17, 0.0F, -6.325F, -0.475F, 0, 12, 11, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.675F, 0.9F);
        this.body6.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0436F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 70, 33, 0.0F, -2.0F, -1.0F, 1, 1, 3, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 68, 50, 0.0F, -1.0F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 2.0F, 1.5F);
        this.body6.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.6109F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 70, 20, 0.0F, -2.0F, -1.55F, 1, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.25F, -2.675F, -13.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, 0.0349F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.25F, -1.45F, -5.475F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.0647F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 52, 38, -1.0F, 0.05F, -0.95F, 2, 1, 1, -0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.25F, -1.375F, -5.025F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.4538F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 70, 25, -1.0F, 0.0F, -1.0F, 2, 1, 3, 0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.75F, -1.375F, -5.5F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3927F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 14, 68, -2.0F, 0.0F, 2.0F, 3, 1, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.75F, -0.925F, -5.6F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1745F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 34, 10, -2.0F, -0.05F, 2.0F, 3, 1, 6, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.875F, -1.075F, -5.45F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.9599F, 0.6632F, -0.3054F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 38, 0.425F, -0.95F, -1.05F, 0, 1, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -0.925F, -5.35F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.48F, 0.2705F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 70, 29, -0.05F, -0.65F, -0.8F, 1, 1, 3, -0.01F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 28, 32, 0.875F, -1.0F, 0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.925F, -5.35F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1745F, 0.2705F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 26, 32, 0.85F, -0.5F, 2.0F, 0, 1, 1, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 26, 34, 0.85F, -0.25F, 3.25F, 0, 1, 1, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 20, 45, -0.05F, 0.0F, 2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.7F, -0.075F, -0.725F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1745F, 0.1396F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 66, 63, -1.05F, 0.0F, -1.4F, 2, 1, 5, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.2F, -0.075F, -0.725F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1745F, -0.1396F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 66, 63, -0.95F, 0.0F, -1.4F, 2, 1, 5, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.375F, -1.075F, -5.45F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.9599F, -0.6632F, 0.3054F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 28, 38, -0.425F, -0.95F, -1.05F, 0, 1, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.925F, -5.35F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.48F, -0.2705F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 28, 32, -0.875F, -1.0F, 0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 70, 29, -0.95F, -0.65F, -0.8F, 1, 1, 3, -0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.925F, -5.35F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1745F, -0.2705F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 26, 34, -0.85F, -0.25F, 3.25F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 26, 32, -0.85F, -0.5F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 45, -0.95F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.4F;
        this.body.offsetX = 1.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.8F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.jaw.rotateAngleX = (float) Math.toRadians(16.5);
        this.body2.rotateAngleY = (float) Math.toRadians(10);
        this.body3.rotateAngleY = (float) Math.toRadians(7.5);
        this.body4.rotateAngleY = (float) Math.toRadians(7.5);
        this.body5.rotateAngleY = (float) Math.toRadians(7.5);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(86);
        this.jaw.rotateAngleX = (float) Math.toRadians(16.5);
        this.body2.rotateAngleY = (float) Math.toRadians(10);
        this.body3.rotateAngleY = (float) Math.toRadians(7.5);
        this.body4.rotateAngleY = (float) Math.toRadians(7.5);
        this.body5.rotateAngleY = (float) Math.toRadians(7.5);
        this.body.offsetX = -0.27F;
        this.body.offsetY = -0.2F;
        this.body.offsetZ = 0F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(body2, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.body.offsetZ = -0.2F;
        this.body.offsetY = -0.3F;
        this.body.offsetX = 0.05F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
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
        this.body.offsetZ = -0.8F;
        this.body.offsetY = -0.26F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        ((EntityPrehistoricFloraHyneria)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.16F;

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += (f3 / (180F / (float) Math.PI));
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.43F * still, -0.65, f2, 0.5F * still);
            this.swing(body, speed, 0.1F * still, true, 0, 0, f2, 0.7F * still);
            this.body.offsetZ = -0.1F;
        }
        else {
            this.swing(body, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.26F;
            this.bob(body, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHyneria e = (EntityPrehistoricFloraHyneria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

