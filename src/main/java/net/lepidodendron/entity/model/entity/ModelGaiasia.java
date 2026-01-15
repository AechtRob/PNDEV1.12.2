package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGaiasia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGaiasia extends ModelBasePalaeopedia {



    private ModelAnimator animator;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer slope;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer slope2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    public ModelGaiasia() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 21.0F, 12.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 46, -2.5F, -2.5F, -4.5F, 5, 5, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -3.0F, 3.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 51, -1.0F, 0.0F, -8.0F, 4, 2, 8, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.8F, -3.1F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 3.7F, -1.4F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 0, -2.0F, -6.0F, -8.0F, 5, 2, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.425F, -0.9F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, -3.0F, -6.0F, -8.0F, 6, 6, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.95F, -7.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, -1.375F, -10.0F, 7, 7, 10, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 5.425F, -8.7F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 31, -2.0F, -7.0F, -1.0F, 6, 1, 10, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, -9.0F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 17, -4.0F, -1.0F, -8.0F, 8, 6, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.3F, -8.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 17, -3.0F, 0.0F, 0.0F, 7, 2, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 22, 59, -3.5F, -2.25F, -3.45F, 7, 6, 4, 0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.5F, 1.25F, 0.55F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.384F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 75, -2.0F, -3.0F, -4.0F, 2, 5, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5F, 1.25F, 0.55F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.384F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 75, 0.0F, -3.0F, -4.0F, 2, 5, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 81, -1.0F, -0.3F, -12.325F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 27, -2.5F, -0.3F, -10.325F, 5, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 42, -3.5F, -0.3F, -7.325F, 7, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 71, -3.5F, -2.2F, -1.575F, 7, 4, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.475F, -10.975F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 82, 3, -2.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 80, 24, -3.0F, -2.0F, 1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.65F, -0.05F, -11.325F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.213F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 49, 0.0F, 0.0F, 0.1F, 5, 1, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.05F, -12.325F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 50, 0.0F, 0.0F, 0.15F, 2, 1, 0, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 82, 0, 0.0F, -0.25F, 0.0F, 2, 1, 2, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.8F, 0.675F, -10.9F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 62, 0.0F, -0.3F, -0.55F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.65F, 0.85F, -10.775F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.5672F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 15, 0.0F, -0.2F, -0.55F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.55F, 0.6F, -9.7F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.6109F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 15, 0.05F, -0.15F, -0.6F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.125F, 0.675F, -8.875F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 15, 0.0F, -0.225F, -0.325F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.325F, 2.15F, -7.875F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2425F, -1.3997F, -0.2463F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 80, 37, 2.0F, -2.0F, 0.0F, 5, 2, 1, 0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(5.175F, 0.725F, -2.8F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.7542F, -1.3963F, -1.7891F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 55, -0.025F, -1.4F, -0.025F, 3, 2, 2, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.25F, -0.3F, -7.625F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3695F, -1.3789F, -0.3743F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 80, 28, 0.0F, 0.0F, 0.0F, 5, 1, 2, 0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.25F, 0.7F, -7.625F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6136F, -1.346F, 0.6256F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 80, 31, 0.0F, -1.0F, 0.0F, 5, 1, 2, 0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.725F, -0.3F, -11.325F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -1.1781F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 80, 52, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.125F, 0.675F, -8.875F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3927F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 15, 0.0F, -0.225F, -0.325F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.55F, 0.6F, -9.7F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6109F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 15, -0.05F, -0.15F, -0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.65F, 0.85F, -10.775F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.5672F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 15, 0.0F, -0.2F, -0.55F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.8F, 0.675F, -10.9F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.5708F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 62, 0.0F, -0.3F, -0.55F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-5.175F, 0.725F, -2.8F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.7542F, 1.3963F, 1.7891F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 80, 55, -2.975F, -1.4F, -0.025F, 3, 2, 2, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.25F, 0.7F, -7.625F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.6136F, 1.346F, -0.6256F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 80, 31, -5.0F, -1.0F, 0.0F, 5, 1, 2, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.25F, -0.3F, -7.625F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3695F, 1.3789F, 0.3743F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 28, -5.0F, 0.0F, 0.0F, 5, 1, 2, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.65F, -0.05F, -11.325F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 1.213F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 49, -5.0F, 0.0F, 0.1F, 5, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.725F, -0.3F, -11.325F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.1781F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 80, 52, -4.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -0.05F, -12.325F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.5236F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 50, -2.0F, 0.0F, 0.15F, 2, 1, 0, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 82, 0, -2.0F, -0.25F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.525F, -6.025F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 27, -3.0F, -2.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.325F, 2.15F, -7.875F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2425F, 1.3997F, 0.2463F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 37, -7.0F, -2.0F, 0.0F, 5, 2, 1, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1396F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 60, 64, -3.0F, -2.0F, -2.0F, 6, 2, 4, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-2.6F, -0.45F, -7.7F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.2618F, -0.3491F, -0.1745F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 30, 81, -1.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(2.6F, -0.45F, -7.7F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.2618F, 0.3491F, 0.1745F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 30, 81, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.slope = new AdvancedModelRenderer(this);
        this.slope.setRotationPoint(-1.0F, -0.3F, -12.3F);
        this.head.addChild(slope);
        this.setRotateAngle(slope, 0.1039F, 0.114F, 0.0251F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.8F, 0.0F, 4.525F);
        this.slope.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2356F, 1.3395F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 80, 21, -6.0F, 0.0F, 0.0F, 6, 1, 2, 0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.8F, 0.15F, 1.075F);
        this.slope.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 1.0647F, 0.0698F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 80, 49, -4.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, false));

        this.slope2 = new AdvancedModelRenderer(this);
        this.slope2.setRotationPoint(1.0F, -0.3F, -12.3F);
        this.head.addChild(slope2);
        this.setRotateAngle(slope2, 0.1039F, -0.114F, -0.0251F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(3.8F, 0.0F, 4.525F);
        this.slope2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2356F, -1.3395F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 80, 21, 0.0F, 0.0F, 0.0F, 6, 1, 2, 0.01F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.8F, 0.15F, 1.075F);
        this.slope2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1309F, -1.0647F, -0.0698F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 80, 49, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-4.25F, 1.2F, -0.625F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 82, 6, 3.25F, -0.5F, -11.7F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 42, 1.25F, -0.5F, -9.7F, 6, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 85, 0.25F, -0.5F, -3.7F, 8, 1, 3, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(4.75F, -0.3863F, -11.3888F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 1.309F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 71, 0.0F, -1.1F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(5.75F, -0.5863F, -11.1138F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.829F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 46, 62, 0.0F, -0.8F, -0.075F, 0, 1, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(6.6F, -0.5863F, -10.1388F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.5672F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 48, 62, 0.0F, -0.75F, 0.05F, 0, 1, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(9.2584F, 0.3561F, -4.4718F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.3491F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 56, 11, -0.2931F, -1.1724F, -4.9741F, 0, 1, 3, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(5.25F, -0.5F, -11.7F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.5585F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 82, 9, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(6.95F, -0.5F, -10.65F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -1.1781F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 59, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(8.475F, 0.5F, -7.0F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -1.3963F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 80, 34, 0.0F, -1.0F, 0.0F, 5, 1, 2, 0.01F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(9.375F, 0.5F, -2.1F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -1.5708F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 63, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(7.575F, -0.6F, -7.325F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.8872F, -1.2923F, 0.9063F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 82, 15, 2.0F, -2.0F, 0.0F, 3, 2, 1, 0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.875F, 0.5F, -2.1F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 1.5708F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 80, 63, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.925F, -0.6F, -7.325F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.8872F, 1.2923F, -0.9063F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 15, -5.0F, -2.0F, 0.0F, 3, 2, 1, 0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.025F, 0.5F, -7.0F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 1.3963F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 80, 34, -5.0F, -1.0F, 0.0F, 5, 1, 2, 0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(4.75F, 2.0F, -6.875F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0175F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 26, 51, -5.0F, -2.0F, 2.0F, 9, 2, 6, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(5.25F, 0.5F, -11.7F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1658F, 0.7854F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 59, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(4.05F, 0.675F, -10.9F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1222F, 0.2182F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 77, 1.0F, -1.0F, 2.0F, 2, 1, 5, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(4.45F, 0.675F, -10.9F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1222F, -0.2182F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 77, -3.0F, -1.0F, 2.0F, 2, 1, 5, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(3.75F, -0.3863F, -11.3888F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -1.309F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 18, 71, 0.0F, -1.1F, -0.25F, 0, 2, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(2.75F, -0.5863F, -11.1138F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.829F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 46, 62, 0.0F, -0.8F, -0.075F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.9F, -0.5863F, -10.1388F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.5672F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 48, 62, 0.0F, -0.75F, 0.05F, 0, 1, 1, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.7584F, 0.3561F, -4.4718F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.3491F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 56, 11, 0.2931F, -1.1724F, -4.9741F, 0, 1, 3, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(4.25F, 0.575F, -11.725F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.2094F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 34, 11, -3.0F, -1.0F, 2.0F, 6, 1, 5, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(3.25F, 0.5F, -11.7F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.1658F, -0.7854F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 80, 59, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(4.25F, 0.5F, -11.7F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.2487F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 82, 12, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(3.25F, -0.5F, -11.7F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.5585F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 82, 9, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.55F, -0.5F, -10.65F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 1.1781F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 59, -4.0F, 0.0F, 0.0F, 4, 1, 2, 0.02F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-3.25F, 4.25F, -7.1F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, -0.3491F, -0.6545F, 0.0F);
        this.armright.cubeList.add(new ModelBox(armright, 14, 77, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, 0.3927F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 50, 62, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(3.25F, 4.25F, -7.1F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, -0.3491F, 0.6545F, 0.0F);
        this.armleft.cubeList.add(new ModelBox(armleft, 14, 77, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, -0.3927F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 50, 62, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.25F, 0.8F, 0.0F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, -0.3927F, -0.48F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 36, 69, -0.5F, -1.2F, 0.0F, 1, 2, 3, 0.0F, false));
        this.legright.cubeList.add(new ModelBox(legright, 27, 84, 0.0F, -1.2F, 0.0F, 1, 2, 3, -0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.25F, 0.0F, 3.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.2618F, 0.2618F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 80, 66, -0.5F, -0.5F, -0.75F, 1, 1, 3, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 14, 81, -0.5F, -1.0F, -0.75F, 1, 1, 3, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.25F, -0.25F, 2.25F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.2182F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 26, 46, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.25F, 0.8F, 0.0F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, -0.3927F, 0.48F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 36, 69, -0.5F, -1.2F, 0.0F, 1, 2, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.2618F, -0.2618F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 80, 66, -0.5F, -0.5F, -0.75F, 1, 1, 3, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 14, 81, -0.5F, -1.0F, -0.75F, 1, 1, 3, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(-0.25F, -0.25F, 2.25F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.2182F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 26, 46, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 59, -2.0F, -2.4F, -1.0F, 4, 5, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 48, 75, 0.0F, -2.9F, 0.0F, 0, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 72, 70, 0.0F, -2.9F, 0.0F, 0, 6, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 0, -1.5F, -1.65F, -1.0F, 3, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 60, 70, 0.0F, -3.4F, 0.0F, 0, 7, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 62, 21, -1.0F, -1.15F, -1.0F, 2, 3, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 69, 0.0F, -2.4F, 0.0F, 0, 5, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 62, 31, -0.5F, -0.65F, -0.75F, 1, 2, 8, 0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 63, 12, -0.5F, -0.15F, 0.0F, 1, 1, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 44, 64, 0.0F, -1.4F, 0.0F, 0, 3, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {

        this.chest.offsetZ = -0.12F;
        this.chest.offsetY = -0.01F;
        this.chest.offsetX = -0.0F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.hips.offsetY = -0.11F;
        this.hips.offsetX = 0.025F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.2F;
        this.hips.offsetX = -0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 1.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraGaiasia entitySilesaurus = (EntityPrehistoricFloraGaiasia) e;
        ((EntityPrehistoricFloraGaiasia)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGaiasia ee = (EntityPrehistoricFloraGaiasia) entitylivingbaseIn;

        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) {
                    animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } 

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGaiasia entity = (EntityPrehistoricFloraGaiasia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*0.1), hips.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*0.1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-80))*0.3), chest.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-350))*-3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*0.6), neck.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-450))*1.5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-350))*1.5), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 11.25 + (((tickAnim - 0) / 13) * (-41.4963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(11.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (-26.14487-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (40.35735-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -41.4963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 13) / 12) * (-67.44619-(-41.4963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = -26.14487 + (((tickAnim - 13) / 12) * (-49.02164-(-26.14487)));
            zz = 40.35735 + (((tickAnim - 13) / 12) * (75.67004-(40.35735)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -67.44619 + (((tickAnim - 25) / 25) * (11.25-(-67.44619)));
            yy = -49.02164 + (((tickAnim - 25) / 25) * (0-(-49.02164)));
            zz = 75.67004 + (((tickAnim - 25) / 25) * (0-(75.67004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -67.44619 + (((tickAnim - 0) / 25) * (11.25-(-67.44619)));
            yy = 49.02164 + (((tickAnim - 0) / 25) * (0-(49.02164)));
            zz = -75.67004 + (((tickAnim - 0) / 25) * (0-(-75.67004)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 11.25 + (((tickAnim - 25) / 13) * (99.2037-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(11.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (26.14487-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-40.35735-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 99.2037-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 38) / 12) * (-67.44619-(99.2037-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 26.14487 + (((tickAnim - 38) / 12) * (49.02164-(26.14487)));
            zz = -40.35735 + (((tickAnim - 38) / 12) * (-75.67004-(-40.35735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -59.19426 + (((tickAnim - 0) / 25) * (-34.41556-(-59.19426)));
            yy = 39.13178 + (((tickAnim - 0) / 25) * (42.36148-(39.13178)));
            zz = 61.79782 + (((tickAnim - 0) / 25) * (58.60054-(61.79782)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -34.41556 + (((tickAnim - 25) / 13) * (-18.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-34.41556)));
            yy = 42.36148 + (((tickAnim - 25) / 13) * (44.83356-(42.36148)));
            zz = 58.60054 + (((tickAnim - 25) / 13) * (92.95052-(58.60054)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 38) / 12) * (-59.19426-(-18.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 44.83356 + (((tickAnim - 38) / 12) * (39.13178-(44.83356)));
            zz = 92.95052 + (((tickAnim - 38) / 12) * (61.79782-(92.95052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 3.64031 + (((tickAnim - 0) / 25) * (12.30376-(3.64031)));
            yy = -42.87583 + (((tickAnim - 0) / 25) * (-53.04703-(-42.87583)));
            zz = -8.54274 + (((tickAnim - 0) / 25) * (9.22012-(-8.54274)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 12.30376 + (((tickAnim - 25) / 13) * (4.05031-(12.30376)));
            yy = -53.04703 + (((tickAnim - 25) / 13) * (-20.67406-(-53.04703)));
            zz = 9.22012 + (((tickAnim - 25) / 13) * (10.48936-(9.22012)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.05031 + (((tickAnim - 38) / 12) * (3.64031-(4.05031)));
            yy = -20.67406 + (((tickAnim - 38) / 12) * (-42.87583-(-20.67406)));
            zz = 10.48936 + (((tickAnim - 38) / 12) * (-8.54274-(10.48936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -34.41556 + (((tickAnim - 0) / 13) * (-56.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-34.41556)));
            yy = -42.36148 + (((tickAnim - 0) / 13) * (-44.83356-(-42.36148)));
            zz = -58.60054 + (((tickAnim - 0) / 13) * (-92.95052-(-58.60054)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -56.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 13) / 12) * (-59.19426-(-56.2558-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = -44.83356 + (((tickAnim - 13) / 12) * (-39.13178-(-44.83356)));
            zz = -92.95052 + (((tickAnim - 13) / 12) * (-61.79782-(-92.95052)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -59.19426 + (((tickAnim - 25) / 25) * (-34.41556-(-59.19426)));
            yy = -39.13178 + (((tickAnim - 25) / 25) * (-42.36148-(-39.13178)));
            zz = -61.79782 + (((tickAnim - 25) / 25) * (-58.60054-(-61.79782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.30376 + (((tickAnim - 0) / 13) * (4.05031-(12.30376)));
            yy = 53.04703 + (((tickAnim - 0) / 13) * (20.67406-(53.04703)));
            zz = -9.22012 + (((tickAnim - 0) / 13) * (-10.48936-(-9.22012)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 4.05031 + (((tickAnim - 13) / 12) * (3.64031-(4.05031)));
            yy = 20.67406 + (((tickAnim - 13) / 12) * (42.87583-(20.67406)));
            zz = -10.48936 + (((tickAnim - 13) / 12) * (8.54274-(-10.48936)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 3.64031 + (((tickAnim - 25) / 25) * (12.30376-(3.64031)));
            yy = 42.87583 + (((tickAnim - 25) / 25) * (53.04703-(42.87583)));
            zz = 8.54274 + (((tickAnim - 25) / 25) * (-9.22012-(8.54274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-1.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-1.5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-1.5), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGaiasia entity = (EntityPrehistoricFloraGaiasia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*3), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*0.65);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*2), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+200))*3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+240))*2), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*5), armright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+180))*-8), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*5), armleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+180))*-8), armleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-60))*3), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*3), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(0), legright3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*5), legright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-60))*3), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*3), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*5), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*15), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*18), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGaiasia entity = (EntityPrehistoricFloraGaiasia) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1.1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+130))*4), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+200))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+240))*4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+130))*5), armright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+180))*-8), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+130))*5), armleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+180))*-8), armleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*3), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*3), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(0), legright3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*5), legright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*3), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*3), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*5), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*7), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*17), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*21), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*25), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGaiasia entity = (EntityPrehistoricFloraGaiasia) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10.25 + (((tickAnim - 3) / 5) * (-7-(10.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7 + (((tickAnim - 8) / 5) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -15.25 + (((tickAnim - 3) / 3) * (-19.37-(-15.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -19.37 + (((tickAnim - 6) / 2) * (-8.5-(-19.37)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.5 + (((tickAnim - 8) / 2) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 3) / 5) * (24.75-(1.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 24.75 + (((tickAnim - 8) / 2) * (0-(24.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGaiasia e = (EntityPrehistoricFloraGaiasia) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
