package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAcrolepis extends ModelBasePalaeopedia {

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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private ModelAnimator animator;

    public ModelAcrolepis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 45, -2.5F, -9.0F, -9.2F, 5, 6, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -2.5F, -10.25F, -6.7F, 5, 8, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 55, -1.6F, -8.0F, -14.25F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 57, -1.6F, -8.0F, -13.75F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 57, -1.6F, -7.5F, -13.75F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 59, -1.6F, -7.5F, -14.25F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 59, -1.625F, -7.75F, -14.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 59, 0.6F, -7.5F, -14.25F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 30, 59, 0.625F, -7.75F, -14.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 30, 55, 0.6F, -8.0F, -14.25F, 1, 1, 1, -0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 12, 57, 0.6F, -8.0F, -13.75F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 30, 57, 0.6F, -7.5F, -13.75F, 1, 1, 1, -0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.55F, -8.975F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 36, -2.0F, 1.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.25F, -5.625F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 47, -2.0F, 1.0F, 3.0F, 4, 2, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -11.5F, -6.05F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 26, -2.0F, 0.0F, 0.0F, 4, 3, 7, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -10.55F, -9.95F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 39, -2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -8.025F, -13.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1519F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 57, -1.5F, -4.0F, -1.0F, 3, 4, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.9F, -14.35F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 39, -1.5F, -2.0F, -1.0F, 3, 2, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.25F, -6.25F, -15.175F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 58, 0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 58, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.525F, -14.375F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 12, -1.5F, -2.0F, -1.0F, 3, 2, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.5F, -13.9F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 47, -1.5F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 55, -2.0F, -4.0F, 2.0F, 4, 4, 3, 0.02F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 64, 53, -1.5F, -3.0F, 0.0F, 3, 3, 2, 0.02F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, -3.4F, -6.65F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3054F, 0.0F, 0.4363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 42, 61, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, -3.4F, -6.65F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3054F, 0.0F, -0.4363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 42, 61, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.5F, 1.1F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 0, -2.0F, -1.5F, -0.425F, 4, 7, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.2F, 3.825F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 60, 60, 0.0F, -5.0F, -1.0F, 0, 6, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.75F, 3.525F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 15, -1.5F, -2.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.425F, 0.6F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.096F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 15, -1.5F, -2.0F, -1.0F, 3, 3, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 54, -1.5F, -2.0F, -1.0F, 3, 3, 4, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 6.9F, 2.25F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.3491F, -0.0873F, 0.48F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 18, 37, 0.0F, 0.0F, -0.5F, 0, 4, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 6.9F, 2.25F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.3491F, 0.0873F, -0.48F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 18, 37, 0.0F, 0.0F, -0.5F, 0, 4, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 7.575F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 37, -1.5F, -1.75F, -0.65F, 3, 5, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.4F, 4.75F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 0, 0.0F, -1.0F, -1.4F, 0, 4, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.5F, 1.45F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.672F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 60, -1.0F, 0.0F, -1.4F, 2, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.425F, 0.35F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.192F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 45, -1.0F, -1.0F, -1.0F, 2, 4, 6, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.125F, -0.05F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2007F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 15, -1.0F, -1.0F, -1.0F, 2, 4, 3, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 5.35F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 48, -1.0F, -1.7F, -1.0F, 2, 3, 6, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 31, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.925F, 0.0F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 23, -1.0F, -1.0F, -1.0F, 2, 2, 6, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.7F, 5.0F);
        this.body4.addChild(body5);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.325F, -0.6F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7069F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 64, -0.5F, -2.0F, 1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.325F, 2.4F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4625F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, -2.0F, -4.0F, 0, 8, 13, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.125F, 2.6F);
        this.body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4625F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 62, -0.5F, -2.0F, 1.0F, 1, 1, 5, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 66, 43, -0.5F, -1.0F, -1.0F, 1, 1, 3, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3098F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 0, -0.5F, -2.0F, -1.0F, 1, 1, 7, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -5.125F, -9.65F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 50, 8, -1.0F, 0.0F, -5.5F, 2, 1, 6, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 1.0F, -5.5F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1571F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 53, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.85F, 1.0F, -5.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1571F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 33, 0.0F, -1.3F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.85F, 1.0F, -5.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.1571F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 64, 33, 0.0F, -1.3F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 1.0F, -5.5F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.1571F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 50, 53, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.8F, 0.3F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3752F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 66, 8, -1.0F, -1.0F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.925F, 3.2F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1658F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 64, 22, -1.5F, -2.0F, -5.0F, 3, 2, 3, 0.01F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.475F, -5.55F, -15.325F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.0916F, -0.1876F, -0.0873F);
        this.lipright.cubeList.add(new ModelBox(lipright, 30, 61, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, -1.0F, 5.0F);
        this.lipright.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3491F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 62, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.075F, 0.3F, 0.2F);
        this.lipright.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0305F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 27, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.475F, -5.55F, -15.325F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.0916F, 0.1876F, 0.0873F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 30, 61, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, -1.0F, 5.0F);
        this.lipleft.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3491F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 62, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.075F, 0.3F, 0.2F);
        this.lipleft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.0305F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 64, 27, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.15F;
        this.body.offsetX = -0.1F;
        this.body.offsetZ = 0.025F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, -0.0F, 0.1F);
        this.body.offsetZ = -0.05F;
        this.body.offsetY = -0.1F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.7F;
        this.body.offsetX = 0.725F;
        this.body.rotateAngleY = (float) Math.toRadians(210);
        this.body.rotateAngleX = (float) Math.toRadians(8);
        this.body.rotateAngleZ = (float) Math.toRadians(-4);
        this.body.scaleChildren = true;
        float scaler = 0.88F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.0F, -2F, 0.1F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
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
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
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
            this.body.offsetY = -0.10F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

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

