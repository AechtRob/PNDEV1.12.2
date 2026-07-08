package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCladoselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer upperjaw;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private ModelAnimator animator;

    public ModelCladoselache() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.9F, 0.5F);
        this.body.cubeList.add(new ModelBox(body, 44, 26, -3.0F, -2.0F, -12.0F, 6, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -3.0F, -8.0F, 7, 7, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 59, 0.0F, -7.0F, -5.4F, 0, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.05F, -6.575F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 43, -0.5F, -2.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.6F, -6.275F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 50, -0.5F, -2.0F, 0.0F, 1, 2, 1, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, -8.15F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3709F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 38, -0.5F, -2.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.5F, -11.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 54, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.3F, -11.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 18, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3F, -2.25F, -11.775F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0524F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 61, 2.0F, 1.0F, 0.0F, 1, 4, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.3F, -2.25F, -11.775F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0524F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 61, -3.0F, 1.0F, 0.0F, 1, 4, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.5F, 1.8F, -6.0F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, -0.5236F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 44, 42, -6.5F, 0.0F, -1.0F, 7, 0, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.5F, 1.8F, -6.0F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, 0.5236F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 44, 42, -0.5F, 0.0F, -1.0F, 7, 0, 5, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.0F, -11.75F);
        this.body.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 20, 50, -2.5F, -1.6F, -3.975F, 5, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 72, -1.0F, -0.6F, -3.975F, 2, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 40, 26, -2.55F, -1.53F, -4.2F, 1, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 40, 26, 1.55F, -1.53F, -4.2F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.525F, 0.7F, -6.4F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2138F, 0.1702F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 66, 1.5F, -2.0F, -0.05F, 1, 1, 3, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.525F, 0.7F, -6.4F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0916F, 0.1702F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 46, 1.5F, -2.0F, 0.25F, 1, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.125F, 0.4F, -2.4F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2443F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 64, 1.5F, -2.0F, -1.0F, 1, 2, 4, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.075F, 0.1F, -2.375F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1833F, 0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 63, 1.0F, -0.325F, -3.0F, 0, 1, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.175F, -4.725F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 63, -2.0F, -1.0F, -2.0F, 4, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.125F, 0.4F, -2.4F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2443F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 64, -2.5F, -2.0F, -1.0F, 1, 2, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.525F, 0.7F, -6.4F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2138F, -0.1702F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 66, -2.5F, -2.0F, -0.05F, 1, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.525F, 0.7F, -6.4F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0916F, -0.1702F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 46, -2.5F, -2.0F, 0.25F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.075F, 0.1F, -2.375F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1833F, -0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 63, -1.0F, -0.325F, -3.0F, 0, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.275F, -5.375F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3752F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 23, -2.0F, -2.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.575F, -2.9F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 61, -2.0F, -2.0F, -2.0F, 4, 2, 3, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.225F, -0.2F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.192F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 54, -2.5F, -2.0F, -2.0F, 5, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.925F, -11.05F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, 0.1134F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 0, -2.0F, -1.025F, -2.05F, 4, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.75F, -3.55F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4451F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 15, -1.5F, -0.5F, -0.2F, 3, 1, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 30, -1.0F, -0.5F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.075F, 0.15F, -3.075F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2705F, 0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 47, 1.0F, -0.325F, -3.0F, 0, 1, 4, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.075F, 0.15F, -3.075F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2705F, -0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 64, 47, -1.0F, -0.325F, -3.0F, 0, 1, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.475F, -1.95F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0349F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 58, 6, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.6F, -0.25F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3142F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 15, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -0.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -3.5F, -1.725F, -0.325F, 7, 5, 8, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 5.375F, 0.825F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0785F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 28, -3.0F, -3.0F, -1.0F, 6, 2, 8, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.425F, 0.575F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 0, -3.0F, -2.0F, -1.0F, 6, 1, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.225F, 7.925F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 30, 9, -3.0F, -0.85F, -1.0F, 6, 3, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 4.825F, 0.375F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.192F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 18, -2.5F, -3.0F, -1.0F, 5, 2, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.25F, -0.4F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1353F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 23, 0.0F, -3.0F, 1.0F, 0, 2, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.275F, -0.1F);
        this.body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1265F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 35, -2.5F, -2.0F, -1.0F, 5, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 3.45F, 1.825F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.2618F, 1.0472F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 30, 26, -2.425F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 3.45F, 1.825F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.2618F, -1.0472F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 30, 26, -0.575F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.65F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 38, -2.5F, -1.0F, -1.0F, 5, 2, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 3.1F, 0.35F);
        this.body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2313F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 46, -2.0F, -3.0F, -1.0F, 4, 2, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.35F, -0.2F);
        this.body4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1222F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 47, -2.0F, -2.0F, -1.0F, 4, 1, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.35F, 4.8F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 18, 56, -2.0F, -0.8F, -1.0F, 4, 1, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 54, 59, -2.0F, -0.3F, 2.45F, 4, 0, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 34, 60, -2.0F, -0.295F, 2.45F, 4, 0, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 10, 59, -1.5F, -0.8F, 3.0F, 3, 1, 1, 0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 28, 28, 0.0F, -8.3F, 3.0F, 0, 14, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.625F, 0.0F);
        this.body5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0524F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 54, -1.5F, -1.0F, -1.0F, 3, 1, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.35F, -0.1F);
        this.body5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1134F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 54, 9, -1.5F, -1.0F, -1.0F, 3, 1, 5, 0.0F, false));

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
        this.body.offsetY = -0.17F;
        this.body.offsetX = -0.25F;
        this.body.offsetZ = 0.15F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.rotateAngleX = (float) Math.toRadians(-15);
        this.body2.rotateAngleX = (float) Math.toRadians(5);
        this.body3.rotateAngleX = (float) Math.toRadians(7.5);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.offsetY = -0.3F;
        this.body.offsetZ = 0.2F;
        this.body.offsetX = -0.25F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.35F;
        this.body.offsetX = 0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.7F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.body2.rotateAngleX = (float) Math.toRadians(5);
        this.body3.rotateAngleX = (float) Math.toRadians(7.5);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
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

        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};

        float speed = 0.22F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.35F;
        }

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.065F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.55F * still, -0.25, f2, 0.45F * still);
            this.swing(body, speed, 0.2F * still, true, 0, 0, f2, 0.5F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.1F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.1F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.1F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.1F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.1F;
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
        animator.move(this.upperjaw, 0,0,-0.5F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

