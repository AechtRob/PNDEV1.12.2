package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOrthacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;

    private ModelAnimator animator;

    public ModelOrthacanthus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -17.25F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -10.1F, -0.9F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1265F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 14, -5.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.2F, 6.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -5.0F, -7.0F, -7.0F, 9, 7, 7, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-4.5F, -3.5F, 5.0F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.8727F, -0.3491F, 0.3054F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 50, 68, 0.0F, 0.0F, -1.0F, 0, 7, 6, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(4.5F, -3.5F, 5.0F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.8727F, 0.3491F, -0.3054F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 50, 68, 0.0F, 0.0F, -1.0F, 0, 7, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.25F, 6.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 29, -4.0F, -3.75F, -0.5F, 8, 9, 6, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 71, 0.0F, -7.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 36, 64, 0.0F, -7.0F, 0.0F, 0, 4, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.8F, -0.675F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 0, -2.0F, 6.0F, -1.0F, 6, 2, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.65F, 0.0F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -3.0F, 0.0F, -1.0F, 7, 7, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 68, 0.0F, -7.0F, 0.0F, 0, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.45F, 0.5F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1484F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 43, -2.0F, 1.0F, -2.0F, 5, 3, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.475F, 1.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 29, -3.0F, -2.0F, -2.0F, 6, 6, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.25F, 4.125F, 1.0F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.1745F, 0.0F, 0.4363F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 70, 17, 0.0F, 0.0F, -0.5F, 0, 3, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.25F, 4.125F, 1.0F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.1745F, 0.0F, -0.4363F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 70, 17, 0.0F, 0.0F, -0.5F, 0, 3, 7, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 55, 0.0F, -6.75F, 0.0F, 0, 5, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7F, 0.2F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 53, -2.0F, 2.0F, -2.0F, 4, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.2F, 1.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -3.0F, -1.0F, -2.0F, 5, 5, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.9F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 22, 44, 0.0F, -4.5F, 2.0F, 0, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.75F, -0.6F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 55, 0.0F, 0.75F, 2.4F, 0, 4, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.75F, -0.65F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.48F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 23, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.2F, 0.7F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 9, -1.0F, 1.0F, -2.0F, 3, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.05F, 1.15F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 54, -2.0F, -1.0F, -2.0F, 4, 4, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 24, 56, 0.0F, -5.25F, 0.0F, 0, 10, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 60, 0, -1.5F, -1.35F, -1.0F, 3, 3, 6, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 62, 68, -1.0F, -0.9F, -1.0F, 2, 2, 6, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 52, 20, 0.0F, -4.25F, 0.0F, 0, 8, 9, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.25F, -0.9F);
        this.base.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 27, -1.5F, 0.0F, -6.825F, 3, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 61, -2.5F, -2.0F, -1.825F, 5, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 13, -1.5F, -0.45F, -6.6F, 3, 1, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 1.0F, -6.825F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4625F, 0.3403F, -0.1702F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 10, -2.0F, -2.0F, 2.2F, 2, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 56, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 56, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 1.0F, -6.825F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4625F, -0.3403F, 0.1702F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 10, 0.0F, -2.0F, 2.2F, 2, 1, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 76, 56, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 1.025F, -6.8F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.48F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 38, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.325F, 2.025F, -3.25F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2705F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 50, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.0F, -6.825F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4625F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 76, 33, -1.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.15F, -1.525F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.192F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 37, -3.0F, -3.0F, -2.2F, 6, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.325F, 2.025F, -3.25F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2705F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 76, 50, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 1.025F, -6.8F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.48F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 76, 38, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 0.55F, -7.0F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.48F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 17, -0.2F, -1.0F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.55F, -7.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.48F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 17, 0.2F, -1.0F, 1.0F, 0, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -6.2F, -2.0F);
        this.base.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 74, 61, -1.5F, -2.0F, -5.9F, 3, 2, 4, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 48, 13, -1.5F, -0.5F, -5.65F, 3, 1, 0, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 10, -2.5F, -1.0F, -1.9F, 5, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, -2.0F, -5.9F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.288F, 0.288F, 0.0436F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 43, -2.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.325F, 0.0F, -2.35F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3491F, 0.2662F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 78, 0, -2.0F, -1.975F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.325F, 0.0F, -2.35F);
        this.upperjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.288F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 76, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, 0.0F, -5.9F);
        this.upperjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.48F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 76, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 10, -0.975F, -1.9F, 1.35F, 1, 1, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 50, -0.125F, -0.5F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-3.325F, 0.0F, -2.35F);
        this.upperjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3491F, -0.2662F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 78, 0, 0.0F, -1.975F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.325F, 0.0F, -2.35F);
        this.upperjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.288F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 74, 76, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, 0.0F, -5.9F);
        this.upperjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.48F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 10, -0.025F, -1.9F, 1.35F, 1, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 50, 0.125F, -0.5F, 1.0F, 0, 1, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 76, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.5F, -2.0F, -5.9F);
        this.upperjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.288F, -0.288F, -0.0436F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 74, 43, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -3.4F, -1.125F);
        this.upperjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4538F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 43, -0.5F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -3.4F, -1.125F);
        this.upperjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.192F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 23, -3.5F, 0.0F, -1.0F, 6, 2, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -2.0F, -5.9F);
        this.upperjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 75, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {

        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.1F;
        this.base.offsetZ = 0.075F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.2F;
        this.base.offsetX = 0.05F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.2F;
        this.base.offsetX = 0.05F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.05F;
        this.base.offsetX = 0.3F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(220);
        this.base.rotateAngleX = (float)Math.toRadians(1);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 0.75F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.4F, 6.F, -0.2F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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

        this.base.offsetZ = 0.65F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.66F;
        }
        if (!e.isInWater()) {
            speed = 0.3F;
        }

        //this.tohead.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.tohead.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.03F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.48F * still, -3, f2, 0.5F * still);

            this.swing(base, speed, 0.25F * still, true, 2, 0, f2, 0.5F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 0.75F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 0.75F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.3F, true, 1, 0, f2, 0.75F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.3F, true, 1, 0, f2, 0.75F);

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = 0.05F;
            this.bob(base, -speed * 1.8F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

