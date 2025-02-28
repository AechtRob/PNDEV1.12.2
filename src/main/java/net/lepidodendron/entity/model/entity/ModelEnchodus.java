package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnchodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;

    private ModelAnimator animator;

    public ModelEnchodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 19.0F, -11.75F);
        this.head.cubeList.add(new ModelBox(head, 26, 0, -2.5F, -3.0F, 3.75F, 5, 6, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.05F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 34, -2.0F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.475F, 0.55F, -3.725F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.1309F, 0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 46, -1.0F, -1.0F, 2.0F, 1, 1, 4, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.6F, -3.55F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.3491F, 0.0873F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.05F, 0.675F, -3.55F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2802F, 0.2035F, 0.0448F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.2F, -0.3F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.475F, 0.55F, -3.725F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, -0.1309F, -0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, 0.0F, -1.0F, 2.0F, 1, 1, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.05F, 0.675F, -3.55F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2802F, -0.2035F, -0.0448F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.2F, -0.3F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.975F, 0.775F, -3.55F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, -0.1745F, -0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 10, 1.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.6F, -3.55F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, -0.3491F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6F, -2.85F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1614F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.05F, -2.125F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.48F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.0F, -0.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, -2.0F, -2.0F, -1.9F, 3, 2, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.15F, 0.225F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 0, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.02F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 16, -2.0F, -1.5F, -0.5F, 3, 1, 1, 0.03F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 1.025F, 2.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 40, -3.0F, -4.0F, -1.0F, 4, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 3.0F, 3.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 47, -3.0F, -3.0F, -1.0F, 4, 3, 2, 0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 3.95F, 3.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 26, -3.0F, -2.0F, -1.0F, 4, 2, 5, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -2.375F, 4.75F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1222F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 20, -3.0F, -1.0F, -1.0F, 4, 1, 4, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.1F, 2.375F, 7.55F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.4363F, -0.3491F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 12, 20, 0.0F, -1.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.1F, 2.375F, 7.55F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.4363F, 0.3491F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 12, 20, 0.0F, -1.0F, 0.0F, 0, 4, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.325F, 7.825F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -3.325F, -0.975F, 4, 6, 9, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -3.0F, 0.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0393F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 16, -0.5F, -1.0F, -1.0F, 3, 1, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 3.65F, 0.025F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0175F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 15, -0.5F, -1.0F, -1.0F, 3, 1, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 8.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, -1.5F, -3.25F, -0.5F, 3, 6, 6, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -3.075F, 0.55F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5498F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 30, 0.0F, -4.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.875F, 0.25F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 33, -1.0F, -1.0F, -1.0F, 2, 1, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.6F, 0.6F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 13, -1.0F, -1.0F, -1.0F, 2, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 3.6F, 1.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.3054F, 0.0F, 0.1745F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 12, 0.0F, -1.0F, -0.35F, 0, 1, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 3.6F, 1.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.3054F, 0.0F, -0.1745F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 12, 0.0F, -1.0F, -0.35F, 0, 1, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.625F, 5.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 13, 35, -1.0F, -2.0F, -0.25F, 2, 4, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 3.3F, 3.75F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9163F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.0F, -2.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 3.2F, 0.85F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 20, 0.0F, -2.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -1.55F, 0.55F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2356F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 15, 1.0F, -2.0F, 2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.65F, 0.55F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1484F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 42, -1.0F, -1.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.05F, 4.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 18, 26, -0.5F, -1.0F, -0.8F, 1, 2, 7, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 30, 5, 0.0F, -4.35F, 5.2F, 0, 9, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 2.125F, 0.2F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2313F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 34, 0.0F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.15F, 0.2F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 4, 0.0F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.45F, 2.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 42, -1.5F, 0.0064F, -2.001F, 3, 2, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.7814F, -4.676F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4102F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 44, 12, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.95F, -0.1936F, -6.801F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.5672F, 0.1484F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 5, -1.4F, -2.0F, 0.05F, 0, 2, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.95F, 0.0064F, -5.751F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1745F, 0.1484F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 13, -1.0F, -1.0F, 0.7F, 0, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 0.3564F, -5.751F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1309F, 0.1484F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 39, 27, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.01F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.95F, -0.1936F, -6.801F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5672F, -0.1484F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 5, 1.4F, -2.0F, 0.05F, 0, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.95F, 0.0064F, -5.751F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, -0.1484F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 13, 1.0F, -1.0F, 0.7F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 0.3564F, -5.751F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1309F, -0.1484F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 39, 27, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.3564F, -5.751F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 44, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 2.2314F, -0.301F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 0, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.0F;
        this.head.offsetX = 1.138F;
        this.head.rotateAngleY = (float)Math.toRadians(255);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.23F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetX = -0.14F;
        this.head.offsetY = -0.19F;
        this.head.offsetZ = 0.06F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = 0.139F;
        this.head.render(0.01f);
        resetToDefaultPose();
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

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
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(head, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 0.2F;
            this.bob(head, -speed * 1.9F, 2.5F, false, f2, 1);
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

