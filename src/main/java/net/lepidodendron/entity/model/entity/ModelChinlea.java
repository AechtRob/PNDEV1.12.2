package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChinlea extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer lipupper;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer liplower;

    private ModelAnimator animator;

    public ModelChinlea() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 40, 13, -2.5F, -3.0F, -2.0F, 5, 4, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -2.5F, -4.0F, 1.0F, 5, 6, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 51, -1.6F, -1.05F, -5.45F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 51, 0.6F, -1.05F, -5.45F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.225F, -1.475F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1484F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, -2.5F, -1.0F, -1.0F, 4, 2, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.75F, 1.975F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 7, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -3.5F, 4.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 20, -2.5F, -1.0F, -1.0F, 4, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.875F, 2.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7723F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 0, 0.5F, -1.0F, -0.4F, 0, 5, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.775F, -0.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2749F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 44, -0.5F, -1.0F, -0.4F, 2, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.85F, -0.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 25, -1.5F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.9F, -3.5F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 41, -2.5F, -1.0F, 0.0F, 4, 4, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.175F, -4.1F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.144F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 62, -1.5F, -1.0F, 1.0F, 3, 3, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.15F, -5.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 51, -1.5F, -1.0F, 0.0F, 3, 3, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.3F, -6.825F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 8, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.75F, -8.25F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 38, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.015F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.75F, -8.25F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 26, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, 0.8F, 2.15F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.9163F, -0.3491F, 0.3491F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 34, 62, -0.025F, -0.25F, 0.0F, 1, 1, 3, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 62, 38, -0.025F, -0.775F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.475F, 0.75F, 3.175F);
        this.pectoralfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 55, 0.0F, -3.0F, -2.0F, 0, 3, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, 0.8F, 2.15F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.9163F, 0.3491F, -0.3491F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 34, 62, -0.975F, -0.25F, 0.0F, 1, 1, 3, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 62, 38, -0.975F, -0.775F, 0.0F, 1, 1, 3, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.475F, 0.75F, 3.175F);
        this.pectoralfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 55, 0.0F, -3.0F, -2.0F, 0, 3, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -4.0F, -1.0F, 4, 6, 7, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 5.575F, 0.175F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 25, -1.0F, -4.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -4.0F, 3.025F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.8639F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 49, 0.0F, -3.0F, 0.375F, 1, 3, 1, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 57, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.8F, 3.225F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.9512F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 62, 42, 0.0F, -7.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.625F, -0.125F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 33, -1.0F, -4.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 2.3F, 0.65F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.7854F, -0.1745F, 0.1745F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 42, 62, -0.275F, -0.25F, -0.25F, 1, 1, 3, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 18, 62, -0.275F, -0.85F, -0.25F, 1, 1, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.225F, 1.125F, 3.175F);
        this.pelvicfinright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 54, 0.0F, -3.0F, -2.0F, 0, 3, 5, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 2.3F, 0.65F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.7854F, 0.1745F, -0.1745F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 42, 62, -0.725F, -0.25F, -0.25F, 1, 1, 3, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 18, 62, -0.725F, -0.85F, -0.25F, 1, 1, 3, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.225F, 1.125F, 3.175F);
        this.pelvicfinleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 54, 0.0F, -3.0F, -2.0F, 0, 3, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.8F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 22, 14, -1.5F, -2.0F, -1.0F, 3, 5, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 5.35F, 0.575F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 57, -0.5F, -2.25F, -2.0F, 1, 1, 4, -0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 13, -0.5F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.85F, -0.125F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4014F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 54, 0.0F, -2.9F, 1.5F, 0, 3, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 4.9F, 0.175F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1178F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 37, -1.0F, -2.0F, -1.0F, 2, 1, 6, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5F, -0.05F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 41, -1.0F, -2.0F, -1.0F, 2, 1, 6, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 12, 51, -1.0F, -0.5F, -0.5F, 2, 2, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 10, 57, -1.0F, 0.0F, 3.275F, 2, 1, 3, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.525F, 3.8F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4014F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 20, -1.0F, 0.0F, -5.0F, 2, 2, 4, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.575F, 4.025F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2793F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 58, 4, -1.0F, 0.0F, -1.0F, 2, 1, 3, -0.025F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.5F, 4.275F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2531F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 0, -1.0F, 0.0F, -1.0F, 2, 1, 3, -0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.6F, 6.1F);
        this.body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2967F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 25, 0.0F, 0.0F, -5.0F, 0, 4, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.825F, 4.55F);
        this.body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3098F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 33, 0.0F, 0.0F, -5.0F, 0, 4, 8, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.325F, 4.55F);
        this.body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.384F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 52, 32, -1.0F, 0.0F, -5.0F, 2, 2, 4, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.5F, 6.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 48, 48, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 44, 55, -0.01F, -1.0F, 2.15F, 0, 2, 5, 0.0F, false));

        this.lipupper = new AdvancedModelRenderer(this);
        this.lipupper.setRotationPoint(0.0F, 0.75F, -8.25F);
        this.body.addChild(lipupper);
        this.setRotateAngle(lipupper, 0.0436F, 0.0F, 0.0F);
        this.lipupper.cubeList.add(new ModelBox(lipupper, 10, 61, -1.45F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));
        this.lipupper.cubeList.add(new ModelBox(lipupper, 10, 61, 1.45F, -1.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.325F, -4.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 45, -1.5F, 0.0F, -3.975F, 3, 1, 5, -0.02F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, -3.975F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1091F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 48, -1.5F, -1.0F, 0.0F, 3, 1, 5, -0.025F, false));

        this.liplower = new AdvancedModelRenderer(this);
        this.liplower.setRotationPoint(0.0F, 0.025F, -3.95F);
        this.jaw.addChild(liplower);
        this.setRotateAngle(liplower, 0.0873F, 0.0F, 0.0F);
        this.liplower.cubeList.add(new ModelBox(liplower, 0, 62, -1.425F, -0.025F, 0.0F, 0, 1, 4, 0.0F, false));
        this.liplower.cubeList.add(new ModelBox(liplower, 0, 62, 1.425F, -0.025F, 0.0F, 0, 1, 4, 0.0F, true));

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
        this.body.offsetY = -1.8F;
        this.body.offsetX = -0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.4F;
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
        this.body.offsetZ = -0.03F;
        this.body.offsetY = -0.15F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
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

        this.body.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.386F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
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
            this.chainSwing(fishTail, speed * still, 0.4F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.4F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.4F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.175F;
            this.bob(body, -speed * 2.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 3.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.7F, 0.28F, -0.55, f2, 0.4F * still);

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

