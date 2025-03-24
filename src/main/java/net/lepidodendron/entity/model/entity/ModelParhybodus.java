package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParhybodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer jaw;
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

    private ModelAnimator animator;

    public ModelParhybodus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 54, -1.0F, -4.75F, -8.1F, 2, 2, 6, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -2.5F, -2.05F, -2.85F, 5, 1, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.25F, -3.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 9, -2.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -5.975F, -5.375F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1134F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 21, -3.0F, 0.0F, 0.3F, 4, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -4.9F, -8.1F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3534F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 62, -2.0F, 0.0F, 1.2F, 3, 2, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 64, -1.5F, 0.0F, -0.8F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.1F, -3.75F, -8.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.5367F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 54, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.425F, -1.4F, -5.075F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 66, -1.0086F, -2.3F, 0.0305F, 1, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.55F, -2.75F, -5.775F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 0, -2.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -2.75F, -8.35F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5367F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 49, -2.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.675F, -2.475F, -6.925F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5236F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 54, -1.0086F, -1.3F, 0.0305F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.55F, -2.75F, -5.775F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 0, 0.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.425F, -1.4F, -5.075F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 66, 0.0086F, -2.3F, 0.0305F, 1, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.675F, -2.475F, -6.925F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, -0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 54, 0.0086F, -1.3F, 0.0305F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.1F, -3.75F, -8.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, -0.5367F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 54, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.55F, 3.2F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0262F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -3.0F, -4.0F, -6.0F, 6, 4, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -5.45F, 3.15F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 41, -2.0F, -1.0F, -1.0F, 5, 1, 7, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.45F, 3.3F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5847F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 57, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.05F, 3.55F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5847F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 57, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -2.75F, -8.35F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.5367F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 60, 49, 0.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -2.0F, 0.2F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.5236F, -0.3927F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 20, 49, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -2.0F, 0.2F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, -0.5236F, 0.3927F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 20, 49, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.65F, 9.1F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 29, -2.5F, -2.0F, -0.9F, 5, 4, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 2.45F, 0.925F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 16, -3.0F, -1.0F, -2.0F, 4, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.45F, 0.75F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 0, -2.0F, -1.0F, -2.0F, 4, 1, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.15F, 3.6F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0436F, -0.4363F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 34, 25, -3.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.15F, 3.6F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, -0.0436F, 0.4363F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 34, 25, 0.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 47, -1.5F, -1.7F, -0.5F, 3, 3, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.775F, 0.5F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 49, -1.0F, -1.0F, -1.0F, 2, 1, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.025F, 0.5F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0611F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 41, -1.0F, -1.0F, -1.0F, 2, 1, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.4F, -0.25F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 64, -0.5F, -5.0F, 0.0F, 1, 5, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -3.75F, 1.4F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 62, 0.0F, -3.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.075F, 6.5F);
        this.body3.addChild(body4);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.55F, -0.1F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 15, -1.0F, -1.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.15F, 2.0F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 57, 0.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.95F, 0.0F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 57, -1.0F, -2.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.3F, 3.9F);
        this.body4.addChild(body5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.8F, 1.1F);
        this.body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 29, 0.0F, -2.0F, -1.0F, 0, 5, 13, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.8F, 1.0F);
        this.body5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 25, -0.5F, -2.0F, -1.0F, 1, 2, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.75F, -3.1F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 34, -1.0F, 0.0F, -5.0F, 2, 1, 6, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.6F, 1.375F, -1.425F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1047F, 0.1309F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 64, -2.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.475F, 1.1F, -4.1F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1047F, 0.5236F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 62, 62, -2.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0F, 1.0F, -3.05F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.829F, 0.3054F, -0.0436F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 66, -1.0086F, -1.0F, 0.1305F, 1, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.5454F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 58, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.525F, 1.0F, -2.475F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.1309F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 32, 64, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.6F, 1.375F, -1.425F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1047F, -0.1309F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 64, 0.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.475F, 1.1F, -4.1F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1047F, -0.5236F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 62, 0.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.15F, -3.5F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1047F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 58, 9, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.0F, 1.0F, -3.05F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.829F, -0.3054F, 0.0436F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 66, 0.0086F, -1.0F, 0.1305F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.525F, 1.0F, -2.475F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.1309F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 64, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.5454F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 62, 58, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

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
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.1F;
        this.body.offsetX = -0.05F;
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticFloor(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Hybodus.offsetY = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

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
            this.swing(body, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.Hybodus.offsetY = 1F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

