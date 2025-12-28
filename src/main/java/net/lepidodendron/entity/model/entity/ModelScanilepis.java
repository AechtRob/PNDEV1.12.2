package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScanilepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer dorsalfin7;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer dorsalfin8;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer dorsalfin9;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer dorsalfin10;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer dorsalfin11;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelScanilepis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.575F, -1.8F);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 32, -3.5F, -10.575F, 0.8F, 7, 7, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5F, 4.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -3.0F, -9.0F, -1.0F, 6, 9, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -10.225F, 1.45F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 60, -3.0F, -1.0F, 0.0F, 6, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.1F, 3.85F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 43, -2.5F, -1.0F, 0.0F, 5, 1, 6, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.35F, 2.95F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 10, -2.5F, -1.0F, 0.0F, 5, 1, 6, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.25F, 0.15F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 27, -3.0F, -3.0F, 0.0F, 6, 3, 3, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 61, -2.5F, -2.0F, -1.0F, 5, 2, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -7.8F, -4.4F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3011F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 10, -1.5F, -2.0F, -1.0F, 4, 2, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -7.875F, -4.45F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 7, -1.5F, -1.0F, -1.0F, 4, 1, 1, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -6.675F, -6.1F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 64, 42, -1.5F, -2.0F, -1.0F, 4, 1, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -7.175F, -5.6F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 63, -1.5F, -2.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.0F, -4.55F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6676F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 23, -2.5F, -3.0F, -0.125F, 5, 3, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.475F, -0.6F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 58, -3.0F, -1.0F, -1.0F, 6, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.05F, -7.325F, -5.275F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 68, 14, -1.55F, -0.75F, -0.7F, 3, 1, 0, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 52, 1.9F, -0.75F, -0.6F, 0, 1, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 52, -2.0F, -0.75F, -0.6F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.05F, -5.475F, -2.175F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 56, 2.5F, -0.75F, -1.0F, 0, 1, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 56, -2.4F, -0.75F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.475F, -2.2F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 42, -3.0F, -5.0F, -1.0F, 6, 5, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -3.325F, 3.55F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.5236F, 0.0F, 0.4363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 36, 53, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -3.325F, 3.55F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.5236F, 0.0F, -0.4363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 36, 53, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -10.8F, 6.3F);
        this.body.addChild(dorsalfin1);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.725F, 0.0F);
        this.dorsalfin1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 67, 0.99F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -10.4F, 8.725F);
        this.body.addChild(dorsalfin2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.475F, 0.0F);
        this.dorsalfin2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 9, 1.01F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -9.825F, 9.8F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, 0.0F, -1.5F, 5, 8, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.525F, -0.55F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 33, -1.5F, -1.0F, 0.0F, 4, 1, 8, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 9.125F, -0.75F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 0, -1.5F, -2.0F, 0.0F, 4, 2, 8, -0.01F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -0.325F, 0.675F);
        this.body2.addChild(dorsalfin3);
        this.setRotateAngle(dorsalfin3, 0.0873F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.225F, 0.5F);
        this.dorsalfin3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 68, 0.99F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -0.325F, 3.175F);
        this.body2.addChild(dorsalfin4);
        this.setRotateAngle(dorsalfin4, 0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.275F, 0.35F);
        this.dorsalfin4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 68, 1.01F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -0.225F, 5.675F);
        this.body2.addChild(dorsalfin5);
        this.setRotateAngle(dorsalfin5, 0.0873F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.225F, 0.25F);
        this.dorsalfin5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 68, 0.99F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 3.75F, 7.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 22, 33, -2.0F, -3.0F, -1.0F, 4, 7, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.925F, -1.0F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 53, -1.5F, 6.5711F, -0.6624F, 3, 1, 6, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.925F, -1.0F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 0, -1.5F, -1.0F, 0.0F, 3, 1, 6, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 4.0F, 0.5F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.48F, 0.0F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 30, 64, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 4.0F, 0.5F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.48F, 0.0F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 30, 64, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, true));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -3.725F, 1.175F);
        this.body3.addChild(dorsalfin6);
        this.setRotateAngle(dorsalfin6, 0.0873F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.175F, -0.35F);
        this.dorsalfin6.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 70, 0, 1.01F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin7 = new AdvancedModelRenderer(this);
        this.dorsalfin7.setRotationPoint(0.0F, -3.525F, 3.575F);
        this.body3.addChild(dorsalfin7);
        this.setRotateAngle(dorsalfin7, 0.0873F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 0.275F, -0.25F);
        this.dorsalfin7.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 70, 0.99F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 56, 52, -1.5F, -3.0F, -0.75F, 3, 5, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.575F, -0.8F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 33, -1.0F, -0.825F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -2.575F, -0.8F);
        this.body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5672F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 46, -1.0F, 4.0216F, -3.0133F, 2, 2, 4, -0.01F, false));

        this.dorsalfin8 = new AdvancedModelRenderer(this);
        this.dorsalfin8.setRotationPoint(0.0F, -3.225F, 0.825F);
        this.body4.addChild(dorsalfin8);
        this.setRotateAngle(dorsalfin8, 0.0873F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 0.275F, -0.25F);
        this.dorsalfin8.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 67, 1.01F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.975F, 3.2F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 50, -1.0F, -2.0F, -1.0F, 2, 1, 7, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.9F, 0.375F);
        this.body5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 17, -1.0F, -4.0F, -1.0F, 2, 3, 7, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.175F, 1.675F);
        this.body5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2618F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 52, 0.0F, -1.0F, -2.0F, 0, 4, 7, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 3.75F, 0.7F);
        this.body5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3491F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 17, -1.5F, -2.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.dorsalfin9 = new AdvancedModelRenderer(this);
        this.dorsalfin9.setRotationPoint(0.0F, -2.0F, 0.375F);
        this.body5.addChild(dorsalfin9);
        this.setRotateAngle(dorsalfin9, 0.1745F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, 0.2F, -1.0F);
        this.dorsalfin9.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 67, 0.99F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin10 = new AdvancedModelRenderer(this);
        this.dorsalfin10.setRotationPoint(0.0F, -2.0F, 2.875F);
        this.body5.addChild(dorsalfin10);
        this.setRotateAngle(dorsalfin10, 0.1745F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 0.25F, -1.0F);
        this.dorsalfin10.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 67, 1.01F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.dorsalfin11 = new AdvancedModelRenderer(this);
        this.dorsalfin11.setRotationPoint(0.0F, -2.0F, 4.375F);
        this.body5.addChild(dorsalfin11);
        this.setRotateAngle(dorsalfin11, 0.1745F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, 0.5F, 0.1F);
        this.dorsalfin11.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 71, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.1F, 6.125F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.1309F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 50, 66, -0.5F, -2.0F, -0.75F, 1, 3, 3, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.725F, 4.25F);
        this.body6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.0472F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 66, 38, -0.5F, -1.0F, -1.0F, 1, 1, 3, -0.02F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.225F, 2.05F);
        this.body6.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3491F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 66, 66, -0.5F, -1.0F, -1.0F, 1, 2, 3, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 24, 17, 0.0F, -1.0F, -2.0F, 0, 6, 10, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 50, 63, -0.5F, -1.0F, 2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.125F, 2.05F);
        this.body6.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.5236F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 58, 66, -0.5F, -2.0F, -1.0F, 1, 2, 3, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 1.5F, 0.15F);
        this.body6.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 60, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.25F, 1.65F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.4363F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 46, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 62, -2.0F, 0.005F, -8.4F, 4, 1, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.0F, -8.4F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2618F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 62, 28, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 2.2F, 2.0F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0873F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 52, 7, -2.0F, -1.0F, -4.0F, 4, 1, 2, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 2.7F, -1.0F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1745F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 16, 64, -2.0F, -1.0F, -4.0F, 4, 1, 3, 0.0F, false));

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
        this.body.offsetY = -0.5F;
        this.body.offsetX = 0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(235);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.65F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.14F;
        this.body.offsetY = -0.19F;
        this.body.offsetZ = 0.06F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.18F;
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

        this.body.offsetZ = -0.5F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6, this.dorsalfin7, this.dorsalfin8, this.dorsalfin9, this.dorsalfin10, this.dorsalfin11};


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

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.15F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.8F);
            this.chainFlap(dorsal, speed * still, 0.4F * still, 4.5, f2, 1F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
//            this.body.offsetY = -0.05F;

            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
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

    }
}

