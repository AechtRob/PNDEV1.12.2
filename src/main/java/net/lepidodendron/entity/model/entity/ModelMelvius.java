package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMelvius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMelvius extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer dorsalfin7;
    private final AdvancedModelRenderer dorsalfin8;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer dorsalfin4;
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
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r39;

    private ModelAnimator animator;

    public ModelMelvius() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -1.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -7.0F, -8.0F, 6, 7, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 0, -3.0F, -5.85F, -14.0F, 6, 5, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 70, -2.125F, -5.05F, -16.45F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 70, 1.125F, -5.05F, -16.45F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.6F, -15.375F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3403F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 44, -2.0F, 0.0F, -3.0F, 4, 1, 1, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.325F, -16.275F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 44, -2.0F, 0.0F, -3.0F, 4, 1, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.75F, -14.85F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2225F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 11, -2.0F, -1.0F, -3.0F, 4, 2, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.975F, -15.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3272F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 32, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.25F, -4.85F, -17.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 69, -1.0F, -0.1196F, -1.9928F, 1, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, -4.85F, -17.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 69, 0.0F, -0.1196F, -1.9928F, 1, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.3F, -11.05F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2094F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 10, -2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.65F, -12.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 56, -2.0F, 0.0F, -4.0F, 4, 2, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, -1.75F, -15.7F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4538F, 0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 48, 2.0F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, -1.75F, -15.7F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4538F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 48, -2.0F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.7F, -17.325F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4974F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 70, -1.5F, -1.0F, -2.0F, 3, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.8F, -7.2F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0916F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 36, -2.5F, 0.0F, -6.0F, 5, 2, 6, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.0F, -8.025F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 18, -2.5F, 0.0F, -4.0F, 5, 2, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.0F, -0.6F, -12.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 67, -1.0F, -5.0F, 0.0F, 1, 4, 4, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.0F, -0.6F, -12.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.0873F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 67, 0.0F, -5.0F, 0.0F, 1, 4, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.5F, -0.1F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0611F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 26, -2.5F, -1.0F, -8.0F, 5, 1, 9, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.6F, -0.1F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 16, -2.5F, -1.0F, -8.0F, 5, 1, 9, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -1.5F, -8.0F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.7418F, -0.0873F, 0.2618F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5F, 0.65F);
        this.pectoralfinright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0873F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 56, 0.0F, -2.0F, -1.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -1.5F, -8.0F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.7418F, 0.0873F, -0.2618F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.5F, 0.65F);
        this.pectoralfinleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0873F, 0.0436F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 56, 0.0F, -2.0F, -1.0F, 0, 3, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.75F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -2.5F, -1.675F, -1.0F, 5, 6, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -4.7F, 0.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0218F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 43, -2.0F, 2.0F, -1.0F, 4, 2, 8, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.325F, -0.1F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0218F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 36, -2.0F, 2.0F, -1.0F, 4, 2, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 5.25F, 3.55F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.829F, 0.0F, 0.5236F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 69, 0.0F, -0.35F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 5.25F, 3.55F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.829F, 0.0F, -0.5236F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 69, 0.0F, -0.35F, 0.0F, 0, 4, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.075F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 30, -2.0F, -1.25F, -1.0F, 4, 5, 8, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.125F, 5.175F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9774F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 67, 0.0F, 0.0F, -3.0F, 0, 5, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.525F, 6.925F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 46, -1.5F, 0.0F, -8.0F, 3, 2, 8, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.975F, 7.0F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0698F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 46, -1.5F, 0.0F, -8.0F, 3, 2, 8, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -2.425F, 0.75F);
        this.body3.addChild(dorsalfin5);
        this.dorsalfin5.cubeList.add(new ModelBox(dorsalfin5, 68, 68, 0.0F, -3.1F, -1.75F, 0, 4, 2, 0.0F, false));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -2.425F, 1.75F);
        this.body3.addChild(dorsalfin6);
        this.dorsalfin6.cubeList.add(new ModelBox(dorsalfin6, 48, 69, 0.01F, -2.1F, -1.25F, 0, 3, 2, 0.0F, false));

        this.dorsalfin7 = new AdvancedModelRenderer(this);
        this.dorsalfin7.setRotationPoint(0.0F, -2.425F, 3.25F);
        this.body3.addChild(dorsalfin7);
        this.dorsalfin7.cubeList.add(new ModelBox(dorsalfin7, 62, 69, 0.0F, -1.1F, -1.25F, 0, 2, 2, 0.0F, false));

        this.dorsalfin8 = new AdvancedModelRenderer(this);
        this.dorsalfin8.setRotationPoint(0.0F, -2.425F, 4.75F);
        this.body3.addChild(dorsalfin8);
        this.dorsalfin8.cubeList.add(new ModelBox(dorsalfin8, 14, 70, 0.01F, -1.1F, -1.25F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 54, 0, -1.5F, -1.1F, -1.0F, 3, 4, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 5.15F, 0.25F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1222F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 24, -1.0F, -3.0F, -1.0F, 2, 2, 6, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.1F, -0.1F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 56, -1.0F, -2.0F, -1.0F, 2, 1, 6, 0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.4F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 53, 0.0F, -3.7F, 2.95F, 0, 9, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.9F, -0.35F);
        this.body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1833F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 62, -1.0F, -1.0F, 0.0F, 2, 3, 4, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.body5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 62, -1.0F, -2.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -2.7F, 1.0F);
        this.body2.addChild(dorsalfin);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 58, 69, 0.0F, -1.5F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -2.625F, 2.5F);
        this.body2.addChild(dorsalfin2);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 10, 69, 0.01F, -2.575F, -1.0F, 0, 3, 2, 0.0F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -2.6F, 4.0F);
        this.body2.addChild(dorsalfin3);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 44, 69, 0.0F, -2.6F, -1.0F, 0, 3, 2, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -2.6F, 5.5F);
        this.body2.addChild(dorsalfin4);
        this.dorsalfin4.cubeList.add(new ModelBox(dorsalfin4, 68, 62, 0.01F, -3.6F, -1.0F, 0, 4, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.4F, -13.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 32, -2.0F, -1.25F, -2.0F, 4, 2, 2, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, -0.2F, -4.825F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.6414F, 0.2269F, -0.1353F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 4, 69, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.1F, 0.2F, -2.4F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4538F, 0.2182F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 44, 2.0F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.0F, -0.2F, -4.825F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.6414F, -0.2269F, 0.1353F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 4, 69, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.45F, -4.125F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.4974F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 68, 55, -1.5F, -1.0F, -2.0F, 3, 1, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.2F, -4.825F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6283F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 53, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.25F, -2.2F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4974F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 66, -2.0F, -1.0F, -3.0F, 4, 1, 3, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.1F, 0.2F, -2.4F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4538F, -0.2182F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 68, 44, -2.0F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3229F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 63, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 2.025F, 0.65F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2574F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 60, 56, -2.0F, -2.0F, -3.0F, 4, 2, 4, 0.01F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-2.0F, -4.2F, -19.3F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.7418F, -0.1833F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 68, 52, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.lipright.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4712F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 44, 11, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(2.0F, -4.2F, -19.3F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.7418F, 0.1833F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 68, 52, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.lipleft.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4712F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 44, 11, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

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
        this.body.offsetY = -0.6F;
        this.body.offsetX = 0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6, this.dorsalfin7, this.dorsalfin8};
        ((EntityPrehistoricFloraMelvius)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
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
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.3F * still, -3.5, f2, 1F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
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
            //this.head.offsetY = -0.1F;
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
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

