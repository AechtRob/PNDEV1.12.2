package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCretalamna;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCretalamna extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer upperjaw;
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
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelCretalamna() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 16.75F, -9.5F);
        this.base.cubeList.add(new ModelBox(base, 0, 31, -5.5F, -3.55F, -0.1F, 11, 9, 10, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 28, 52, -5.0F, -2.55F, -4.1F, 10, 8, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 42, 33, 0.0F, -12.3F, 0.625F, 0, 8, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.55F, 0.875F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, -5.0F, -1.0F, -1.0F, 10, 1, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 6.175F, 7.8F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 67, -5.0F, -1.0F, -1.0F, 10, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 6.425F, 0.875F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 25, -5.0F, -1.0F, -1.0F, 10, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -7.575F, -0.35F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 71, -3.0F, 3.0F, -4.0F, 8, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 2.45F, 0.75F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 84, -3.0F, 3.0F, -4.0F, 8, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.6F, 1.425F, 0.4F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 85, -1.0F, -3.0F, -4.0F, 1, 7, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.6F, 1.425F, 0.4F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 85, 0.0F, -3.0F, -4.0F, 1, 7, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-5.5F, 4.45F, -0.1F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0436F, 0.0F, 1.2217F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 46, 67, 0.0F, 0.0F, 0.0F, 0, 10, 8, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 62, 67, 0.01F, 0.0F, 0.0F, 0, 10, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(5.5F, 4.45F, -0.1F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0436F, 0.0F, -1.2217F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 46, 67, 0.0F, 0.0F, 0.0F, 0, 10, 8, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 62, 67, -0.01F, 0.0F, 0.0F, 0, 10, 8, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.55F, 9.9F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 40, 11, -5.0F, -3.0F, -1.0F, 10, 8, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.725F, 1.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0611F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 52, -5.0F, -2.0F, -2.0F, 9, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 6.15F, 1.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2356F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 59, -5.0F, -2.0F, -2.0F, 8, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 50, -4.0F, -3.0F, -1.0F, 8, 7, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.65F, 1.1F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 77, -3.0F, -1.0F, -2.0F, 6, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.15F, -4.1F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 45, -4.0F, -2.0F, 3.0F, 7, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.9F, 4.5F, 0.0F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0436F, -0.0873F, 1.0472F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 96, 21, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.9F, 4.5F, 0.0F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0436F, 0.0873F, -1.0472F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 96, 21, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 63, -3.0F, -1.65F, -1.0F, 6, 5, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, -2.0F, -1.0F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 0, -4.0F, -1.0F, 0.0F, 5, 2, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 4.25F, -1.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 59, -4.0F, -1.0F, 0.0F, 5, 1, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.75F, 1.3F, 5.2F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 87, 4.0F, 0.02F, -3.5F, 1, 0, 4, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 87, -1.5F, 0.02F, -3.5F, 1, 0, 4, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 17, 4.0F, -0.01F, -3.5F, 1, 0, 4, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 17, -1.5F, -0.01F, -3.5F, 1, 0, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.15F, 2.525F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 93, 0.0F, -2.0F, -0.75F, 0, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.35F, 5.0F);
        this.body3.addChild(body4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.6F, 6.4F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6545F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -1.0F, -1.6F, 0, 11, 20, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 64, -0.5F, -1.0F, -1.6F, 1, 2, 10, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -1.1F, 0.2F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3011F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 83, -2.0F, -1.0F, -1.0F, 3, 2, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 3.3F, 0.2F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 85, -2.0F, -1.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, 0.95F, 0.2F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 86, 38, -4.0F, 0.01F, 3.0F, 5, 0, 6, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 90, 44, -4.5F, 0.01F, -1.0F, 6, 0, 4, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 89, -4.5F, 0.0F, -1.0F, 6, 0, 4, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 86, 32, -4.0F, 0.0F, 3.0F, 5, 0, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 5.175F, 0.725F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 96, 91, 0.0F, -2.0F, -0.75F, 0, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 2.5F, 0.2F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 72, 11, -3.0F, -3.0F, -1.0F, 4, 3, 7, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.475F, -4.6F);
        this.base.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.0873F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 16, 93, -2.0F, -0.05F, -6.0F, 4, 1, 4, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 46, 65, -1.5F, -0.55F, -5.75F, 3, 1, 0, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 64, 97, -1.65F, -0.55F, -5.75F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 64, 97, 1.65F, -0.55F, -5.75F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 78, 77, -3.0F, -3.05F, -2.725F, 6, 6, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.6F, -1.325F);
        this.lowerjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 87, -3.0F, 0.0F, -1.0F, 5, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 1.55F, -5.2F);
        this.lowerjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.6109F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 90, 48, -3.0F, -1.9F, 0.0F, 4, 1, 3, -0.01F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 93, -3.0F, -1.0F, -1.0F, 4, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.75F, -0.05F, -5.0F);
        this.lowerjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 96, 0.0F, -0.5F, -0.75F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.05F, -5.8F);
        this.lowerjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 64, -1.5F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.75F, -0.05F, -5.0F);
        this.lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.1745F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 96, 96, 0.0F, -0.5F, -0.75F, 0, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.425F, -4.4F);
        this.base.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0873F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 46, 66, -1.5F, -0.5F, -5.95F, 3, 1, 0, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 74, -2.0F, -2.0F, -6.6F, 4, 2, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.025F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3927F, 0.2967F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 48, 93, -1.975F, -3.2F, -0.05F, 2, 2, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.025F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, 0.2967F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 96, 27, -1.95F, -3.0F, 0.7F, 2, 2, 2, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 33, -1.95F, -3.0F, 2.7F, 2, 3, 9, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.65F, 0.0F, -5.2F);
        this.upperjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 97, 0.0F, -0.5F, -0.75F, 0, 1, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 97, -3.3F, -0.5F, -0.75F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.75F, 0.0F, -5.2F);
        this.upperjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1745F, 0.0F, -0.1745F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 98, 0.0F, -0.5F, -0.75F, 0, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3752F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 50, -0.925F, -2.75F, 3.55F, 1, 1, 1, 0.01F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 76, 21, -1.95F, -3.025F, 3.0F, 2, 3, 8, 0.01F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0698F, 0.3752F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 86, 93, -1.95F, -1.0F, 7.5F, 2, 2, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6109F, 0.3752F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 93, -1.925F, -5.0F, 4.0F, 2, 2, 3, 0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.025F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3927F, -0.2967F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 48, 93, -0.025F, -3.2F, -0.05F, 2, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.025F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, -0.2967F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 96, 27, -0.05F, -3.0F, 0.7F, 2, 2, 2, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 64, 33, -0.05F, -3.0F, 2.7F, 2, 3, 9, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0698F, -0.3752F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 86, 93, -0.05F, -1.0F, 7.5F, 2, 2, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.6109F, -0.3752F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 76, 93, -0.075F, -5.0F, 4.0F, 2, 2, 3, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.775F, 0.0F, -9.6F);
        this.upperjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.3752F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 38, 50, -0.075F, -2.75F, 3.55F, 1, 1, 1, 0.01F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 76, 21, -0.05F, -3.025F, 3.0F, 2, 3, 8, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.1F, 0.0F, -6.6F);
        this.upperjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4363F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 94, 13, -0.9F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.1F, -1.5F, -8.45F);
        this.upperjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 86, 52, -2.9F, -2.0F, 6.0F, 6, 2, 4, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 92, -1.9F, -2.0F, 2.0F, 4, 2, 4, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 94, 8, -0.9F, -2.0F, -1.0F, 2, 2, 3, 0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.75F, 0.0F, -5.2F);
        this.upperjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1745F, 0.0F, 0.1745F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 98, 0.0F, -0.5F, -0.75F, 0, 1, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, -6.05F);
        this.upperjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1745F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 76, 32, -1.5F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));
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
        this.setRotateAngle(lowerjaw, 0.0873F, 0.0F, 0.0F);
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
        this.base.offsetY = 0.2F;
        this.base.offsetX = 0.2F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(268);
        this.base.rotateAngleX = (float)Math.toRadians(20);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 0.4F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);

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
        EntityPrehistoricFloraCretalamna ee = (EntityPrehistoricFloraCretalamna) entitylivingbaseIn;

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
        EntityPrehistoricFloraCretalamna entity = (EntityPrehistoricFloraCretalamna) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), base.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*7), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*11), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(0), lowerjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), upperjaw.rotateAngleZ + (float) Math.toRadians(0));

        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCretalamna entity = (EntityPrehistoricFloraCretalamna) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2), base.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*4), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*6), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*8), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(0), lowerjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), upperjaw.rotateAngleZ + (float) Math.toRadians(0));

        
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCretalamna entity = (EntityPrehistoricFloraCretalamna) entitylivingbaseIn;
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
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




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

        EntityPrehistoricFloraCretalamna ee = (EntityPrehistoricFloraCretalamna) e;
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

