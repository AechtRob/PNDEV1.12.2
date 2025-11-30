package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLeptostyrax;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLeptostyrax extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer upperjaw;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelLeptostyrax() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 12.775F, -7.9F);
        this.base.cubeList.add(new ModelBox(base, 34, 0, -4.5F, -0.775F, -6.05F, 9, 6, 6, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 32, 24, -4.5F, -1.025F, -0.05F, 9, 7, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.55F, -3.7F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 61, -4.0F, -3.0F, -2.0F, 7, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.575F, 1.75F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 52, -4.0F, -3.0F, -2.0F, 8, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 7.45F, 1.75F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 49, -4.0F, -3.0F, -2.0F, 8, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 7.05F, -4.25F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 38, -4.0F, -3.0F, -2.0F, 8, 2, 6, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 3.225F, -6.1F);
        this.base.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 34, 23, -1.5F, 0.1F, -3.925F, 3, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -0.975F, -8.2F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 83, -2.0F, -1.0F, 0.1F, 2, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.975F, -8.2F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.5061F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 86, 50, -2.0F, 0.0F, 0.1F, 2, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -2.375F, -5.6F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 22, -0.95F, 0.0F, 1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -0.8F, -5.6F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3316F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 66, -3.0F, -2.0F, 0.0F, 3, 3, 6, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 58, -1.0F, 0.075F, 5.0F, 1, 2, 1, -0.02F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, -0.975F, -5.6F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.3316F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 61, -1.0F, -1.1F, 1.5F, 1, 1, 4, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 1.1F, -4.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6196F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 85, -0.15F, -1.0F, 0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5F, 0.875F, -5.6F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3316F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 58, 0.0F, -1.6F, 5.0F, 1, 2, 1, -0.02F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 72, 66, 0.0F, -3.675F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, -0.975F, -5.6F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, -0.3316F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 61, 0.0F, -1.1F, 1.5F, 1, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, -2.375F, -5.6F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 22, -0.05F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.975F, -8.2F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3578F, 0.5061F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 86, 46, -2.0F, -1.05F, 0.1F, 2, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -0.975F, -8.2F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3578F, -0.5061F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 86, 46, 0.0F, -1.05F, 0.1F, 2, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.975F, -8.2F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, -0.5061F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 86, 50, 0.0F, 0.0F, 0.1F, 2, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -0.975F, -8.2F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.5236F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 83, 0.0F, -1.0F, 0.1F, 2, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.975F, -5.2F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 80, 33, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.175F, -5.2F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 86, 54, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.2F, -3.95F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 69, -2.0F, -3.0F, -1.0F, 5, 2, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.1F, -4.0F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6196F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 85, 0.15F, -1.0F, 0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.225F, -4.25F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 66, -3.0F, -2.0F, -1.0F, 5, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.525F, -5.6F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 31, -1.5F, 0.0F, -4.5F, 3, 1, 5, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 22, -1.5F, -0.9F, -4.425F, 3, 1, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.288F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 80, 8, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2007F, 0.5978F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 80, 20, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.6196F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 80, 14, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 81, -0.15F, -1.9F, 0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2007F, -0.5978F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 20, 0.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5F, 0.1F, -4.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.6196F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 81, 0.15F, -1.0F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 80, 14, 0.0F, -0.1F, 0.0F, 3, 1, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-4.5F, 4.725F, -0.55F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, 0.8727F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 64, 0, 0.0F, -0.5F, -0.75F, 0, 8, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(4.5F, 4.725F, -0.55F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, -0.8727F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 64, 0, 0.0F, -0.5F, -0.75F, 0, 8, 8, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.975F, 6.95F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 24, -4.0F, -2.5F, -1.0F, 8, 7, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 5.6F, 0.075F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 12, -3.0F, -2.0F, -1.0F, 7, 2, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -1.8F, -0.1F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 39, -3.0F, -2.0F, -1.0F, 7, 2, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 32, 38, -3.0F, -2.25F, -1.0F, 6, 6, 8, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 2.175F, 6.75F);
        this.body2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 60, 56, -2.0F, 0.0F, -8.0F, 5, 2, 8, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, -2.25F, 7.3F);
        this.body2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 64, 16, 1.0F, -5.0F, -8.0F, 0, 7, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -2.6F, 7.05F);
        this.body2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1745F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 60, 46, -2.0F, 0.0F, -8.0F, 5, 2, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 4.75F, 1.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.1745F, 0.0F, 0.6981F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 34, 77, 0.0F, -1.0F, -0.75F, 0, 4, 6, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 4.75F, 1.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.1745F, 0.0F, -0.6981F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 34, 77, 0.0F, -1.0F, -0.75F, 0, 4, 6, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.75F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 71, -2.0F, -2.25F, -1.0F, 4, 4, 6, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -3.25F, 0.1F);
        this.body3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 64, 75, -1.0F, 0.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 1.3F, -0.2F);
        this.body3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 74, -1.0F, 0.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.75F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 80, 0, -1.5F, -0.9F, -0.65F, 3, 3, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -2.3F, 0.075F);
        this.body4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 77, 0.0F, -4.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.675F, 0.45F);
        this.body4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 46, 82, -1.0F, 0.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.85F, 0.25F);
        this.body4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 81, -1.0F, 0.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.35F, 4.35F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 80, 26, -1.0F, -0.5F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.75F, -0.45F);
        this.body5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1047F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 83, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 2.9F, 0.05F);
        this.body5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1047F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 82, 81, -1.0F, -2.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.675F, -0.25F);
        this.body5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1745F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 82, 75, -1.0F, -2.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body5.addChild(body6);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.35F, 0.25F);
        this.body6.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2182F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -0.01F, -3.0F, -1.0F, 0, 7, 17, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.0F, 0.25F);
        this.body6.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2182F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 58, -0.5F, -2.0F, -1.0F, 1, 2, 11, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperjaw, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(pelvicfinright, 0.0436F, -0.0873F, 1.0472F);
        this.setRotateAngle(pelvicfinleft, 0.0436F, 0.0873F, -1.0472F);
        this.setRotateAngle(pectoralfinright, 0.0436F, 0.0F, 1.2217F);
        this.setRotateAngle(pectoralfinleft, 0.0436F, 0.0F, -1.2217F);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, -0.1745F, 0.0F, 0.1745F);
        this.setRotateAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0F, -0.3752F, 0.0F);
        this.setRotateAngle(cube_r37, -0.6109F, -0.3752F, 0.0F);
        this.setRotateAngle(cube_r36, -0.0698F, -0.3752F, 0.0F);
        this.setRotateAngle(cube_r35, 0.2182F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r34, -0.3927F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r33, -0.6109F, 0.3752F, 0.0F);
        this.setRotateAngle(cube_r32, -0.0698F, 0.3752F, 0.0F);
        this.setRotateAngle(cube_r31, 0.0F, 0.3752F, 0.0F);
        this.setRotateAngle(cube_r30, -0.1745F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r3, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.2182F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r27, -0.3927F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(cube_r23, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.3011F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1004F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.048F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1353F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1396F, 0.0F);
        this.setRotateAngle(base, 0.1222F, -0.4458F, 0.3355F);
        this.base.offsetY = -0.34F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.08F;
        this.base.offsetX = 0.408F;
        this.base.rotateAngleY = (float)Math.toRadians(260);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 0.40F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        EntityPrehistoricFloraLeptostyrax ee = (EntityPrehistoricFloraLeptostyrax) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeptostyrax entity = (EntityPrehistoricFloraLeptostyrax) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), base.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), upperjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*7), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*11), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*11), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*11), body6.rotateAngleZ + (float) Math.toRadians(0));

        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeptostyrax entity = (EntityPrehistoricFloraLeptostyrax) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2), base.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), upperjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*6), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*8), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*8), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*8), body6.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeptostyrax entity = (EntityPrehistoricFloraLeptostyrax) entitylivingbaseIn;
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
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(xx), upperjaw.rotateAngleY + (float) Math.toRadians(yy), upperjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4};

        EntityPrehistoricFloraLeptostyrax ee = (EntityPrehistoricFloraLeptostyrax) e;
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

