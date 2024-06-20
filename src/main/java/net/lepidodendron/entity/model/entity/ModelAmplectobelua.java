package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmplectobelua;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAmplectobelua extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tailR1;
    private final AdvancedModelRenderer tailL1;
    private final AdvancedModelRenderer tailR2;
    private final AdvancedModelRenderer tailL2;
    private final AdvancedModelRenderer tailR3;
    private final AdvancedModelRenderer tailL3;
    private final AdvancedModelRenderer frontfinR3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontfinR2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer frontfinR1;
    private final AdvancedModelRenderer frontfinL1;
    private final AdvancedModelRenderer GLS_R;
    private final AdvancedModelRenderer GLS_L;
    private final AdvancedModelRenderer GLS_R2;
    private final AdvancedModelRenderer GLS_L2;
    private final AdvancedModelRenderer GLS_R3;
    private final AdvancedModelRenderer GLS_L3;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer appendageL1;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;

    private ModelAnimator animator;

    public ModelAmplectobelua() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 42, -1.5F, -0.75F, -6.75F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 32, -3.0F, -3.0F, -8.0F, 6, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -3.5F, -2.25F, -8.0F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 9, 2.5F, -2.25F, -8.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 14, -0.65F, -0.51F, -1.75F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 39, -1.35F, -0.51F, -1.75F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -3.25F, -1.66F, -1.5F, 4, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 35, 3, -3.5F, -2.0F, 0.0F, 7, 3, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.5F, -2.0F, 0.0F, 9, 3, 17, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-4.5F, 0.5F, 1.0F);
        this.body2.addChild(finR1);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finR1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 20, -12.0F, -1.5F, 0.0F, 12, 0, 4, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(4.5F, 0.5F, 1.0F);
        this.body2.addChild(finL1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finL1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 20, 0.0F, -1.5F, 0.0F, 12, 0, 4, 0.0F, true));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-4.5F, 0.5F, 5.25F);
        this.body2.addChild(finR2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finR2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 24, -11.0F, -1.5F, 0.0F, 11, 0, 4, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(4.5F, 0.5F, 5.25F);
        this.body2.addChild(finL2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 24, 0.0F, -1.5F, 0.0F, 11, 0, 4, 0.0F, true));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-4.5F, 0.5F, 9.5F);
        this.body2.addChild(finR3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finR3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 28, -10.0F, -1.5F, 0.0F, 10, 0, 4, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(4.5F, 0.5F, 9.5F);
        this.body2.addChild(finL3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finL3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 28, 0.0F, -1.5F, 0.0F, 10, 0, 4, 0.0F, true));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-4.5F, 0.5F, 13.75F);
        this.body2.addChild(finR4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finR4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 30, -9.0F, -1.5F, 0.0F, 9, 0, 3, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(4.5F, 0.5F, 13.75F);
        this.body2.addChild(finL4);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finL4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 30, 0.0F, -1.5F, 0.0F, 9, 0, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 20, -3.5F, -2.0F, 0.0F, 7, 3, 7, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-3.5F, 0.5F, -0.25F);
        this.body3.addChild(finR5);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finR5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 0, -9.0F, -1.5F, -0.2F, 9, 0, 3, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(3.5F, 0.5F, -0.25F);
        this.body3.addChild(finL5);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.finL5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 0, 0.0F, -1.5F, -0.2F, 9, 0, 3, 0.0F, true));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-3.5F, 0.5F, 2.75F);
        this.body3.addChild(finR6);
        this.setRotateAngle(finR6, 0.0F, 0.0436F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.4363F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -7.0F, -1.5F, 0.8F, 7, 0, 2, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(3.5F, 0.5F, 2.75F);
        this.body3.addChild(finL6);
        this.setRotateAngle(finL6, 0.0F, -0.0436F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.4363F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, 0.0F, -1.5F, 0.8F, 7, 0, 2, 0.0F, true));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-3.5F, 0.5F, 5.0F);
        this.body3.addChild(finR7);
        this.setRotateAngle(finR7, 0.0F, 0.0873F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 6, -6.0F, -1.5F, 0.8F, 6, 0, 2, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(3.5F, 0.5F, 5.0F);
        this.body3.addChild(finL7);
        this.setRotateAngle(finL7, 0.0F, -0.0873F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.4363F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 6, 0.0F, -1.5F, 0.8F, 6, 0, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, -2.0F, -2.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-2.0F, 0.5F, -0.5F);
        this.body4.addChild(finR8);
        this.setRotateAngle(finR8, 0.0F, 0.0873F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.4363F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 8, -6.0F, -1.5F, 0.8F, 5, 0, 2, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(2.0F, 0.5F, -0.5F);
        this.body4.addChild(finL8);
        this.setRotateAngle(finL8, 0.0F, -0.0873F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL8.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.4363F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 8, 1.0F, -1.5F, 0.8F, 5, 0, 2, 0.0F, true));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.25F, 0.5F, 1.4F);
        this.body4.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, 0.1309F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR9.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.4363F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 16, -4.75F, -1.5F, 0.8F, 4, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.25F, 0.5F, 1.4F);
        this.body4.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, -0.1309F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL9.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 7, 16, 0.75F, -1.5F, 0.8F, 4, 0, 1, 0.0F, true));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.25F, 0.5F, 2.65F);
        this.body4.addChild(finR10);
        this.setRotateAngle(finR10, 0.0F, 0.2182F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR10.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.4363F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 13, -3.75F, -1.5F, 0.8F, 3, 0, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.25F, 0.5F, 2.65F);
        this.body4.addChild(finL10);
        this.setRotateAngle(finL10, 0.0F, -0.2182F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL10.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.4363F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 13, 0.75F, -1.5F, 0.8F, 3, 0, 1, 0.0F, true));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.5F, 3.9F);
        this.body4.addChild(finR11);
        this.setRotateAngle(finR11, 0.0F, 0.2182F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finR11.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.4363F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 10, -2.75F, -1.5F, 0.8F, 2, 0, 1, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.5F, 3.9F);
        this.body4.addChild(finL11);
        this.setRotateAngle(finL11, 0.0F, -0.2182F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.5F, -1.75F);
        this.finL11.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.4363F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 10, 0.75F, -1.5F, 0.8F, 2, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 34, 36, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.body5.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 0, 3, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 0, 3, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-1.0F, -0.6F, 1.0F);
        this.body5.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.5236F, 0.2618F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 0, 0, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, -0.6F, 1.0F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.5236F, -0.2618F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 0, 0, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.tailR3 = new AdvancedModelRenderer(this);
        this.tailR3.setRotationPoint(-1.0F, -0.35F, 1.75F);
        this.body5.addChild(tailR3);
        this.setRotateAngle(tailR3, 0.0F, -0.1745F, 0.0F);
        this.tailR3.cubeList.add(new ModelBox(tailR3, -1, 0, 0.0F, 0.0F, -0.25F, 1, 0, 15, 0.0F, false));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, -0.35F, 1.75F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.0F, 0.1745F, 0.0F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, -1, 0, -1.0F, 0.0F, -0.25F, 1, 0, 15, 0.0F, true));

        this.frontfinR3 = new AdvancedModelRenderer(this);
        this.frontfinR3.setRotationPoint(-3.5F, 0.5F, 2.5F);
        this.body1.addChild(frontfinR3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.frontfinR3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.1745F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 33, -3.75F, -1.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(3.5F, 0.5F, 2.5F);
        this.body1.addChild(frontfinL3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.frontfinL3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.1745F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 33, -0.25F, -1.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.frontfinR2 = new AdvancedModelRenderer(this);
        this.frontfinR2.setRotationPoint(-3.5F, 0.5F, 1.5F);
        this.body1.addChild(frontfinR2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.frontfinR2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0873F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 30, -2.75F, -1.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(3.5F, 0.5F, 1.5F);
        this.body1.addChild(frontfinL2);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.frontfinL2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.0873F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 30, -0.25F, -1.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.frontfinR1 = new AdvancedModelRenderer(this);
        this.frontfinR1.setRotationPoint(-3.5F, 0.5F, 0.5F);
        this.body1.addChild(frontfinR1);
        this.frontfinR1.cubeList.add(new ModelBox(frontfinR1, 34, 11, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(3.5F, 0.5F, 0.5F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 34, 11, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.GLS_R = new AdvancedModelRenderer(this);
        this.GLS_R.setRotationPoint(-3.25F, 1.0F, 0.5F);
        this.body1.addChild(GLS_R);
        this.setRotateAngle(GLS_R, 0.0F, 0.5672F, 0.5236F);
        this.GLS_R.cubeList.add(new ModelBox(GLS_R, 34, 10, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L = new AdvancedModelRenderer(this);
        this.GLS_L.setRotationPoint(3.25F, 1.0F, 0.5F);
        this.body1.addChild(GLS_L);
        this.setRotateAngle(GLS_L, 0.0F, -0.5672F, -0.5236F);
        this.GLS_L.cubeList.add(new ModelBox(GLS_L, 8, 33, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_R2 = new AdvancedModelRenderer(this);
        this.GLS_R2.setRotationPoint(-3.25F, 1.0F, 1.5F);
        this.body1.addChild(GLS_R2);
        this.setRotateAngle(GLS_R2, 0.0F, 0.5672F, 0.6109F);
        this.GLS_R2.cubeList.add(new ModelBox(GLS_R2, 34, 9, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L2 = new AdvancedModelRenderer(this);
        this.GLS_L2.setRotationPoint(3.25F, 1.0F, 1.5F);
        this.body1.addChild(GLS_L2);
        this.setRotateAngle(GLS_L2, 0.0F, -0.5672F, -0.6109F);
        this.GLS_L2.cubeList.add(new ModelBox(GLS_L2, 20, 31, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_R3 = new AdvancedModelRenderer(this);
        this.GLS_R3.setRotationPoint(-3.25F, 1.0F, 2.5F);
        this.body1.addChild(GLS_R3);
        this.setRotateAngle(GLS_R3, 0.0F, 0.5672F, 0.6981F);
        this.GLS_R3.cubeList.add(new ModelBox(GLS_R3, 0, 34, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L3 = new AdvancedModelRenderer(this);
        this.GLS_L3.setRotationPoint(3.25F, 1.0F, 2.5F);
        this.body1.addChild(GLS_L3);
        this.setRotateAngle(GLS_L3, 0.0F, -0.5672F, -0.6981F);
        this.GLS_L3.cubeList.add(new ModelBox(GLS_L3, 9, 11, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.4F, -0.75F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.5236F, 0.1745F, 0.0F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 23, 39, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.01F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 15, 39, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.25F, 0.5F, -2.75F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, -0.5236F, 0.0F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 21, 24, -0.76F, -0.51F, -1.75F, 1, 1, 2, -0.015F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 24, -0.76F, -1.01F, -1.75F, 1, 1, 2, -0.005F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.75F, 0.5F, 10.25F);
        this.appendageR2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.7854F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.25F, 7.25F, -8.25F, 0, 3, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 3, -0.75F, 7.25F, -8.25F, 0, 3, 1, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-0.25F, -0.9F, -1.5F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.1745F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 35, 9, -0.48F, 0.0F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 12, 0.27F, 0.25F, -3.99F, 0, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 9, -0.23F, 0.25F, -3.99F, 0, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 0.75F, 13.5F);
        this.appendageR3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.48F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -1.51F, 7.75F, -15.55F, 1, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, 0.75F, 13.5F);
        this.appendageR3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.7854F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 7, -1.51F, 12.05F, -12.6F, 1, 1, 0, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 8, -1.51F, 11.75F, -12.75F, 1, 1, 0, 0.0F, false));

        this.appendageL1 = new AdvancedModelRenderer(this);
        this.appendageL1.setRotationPoint(1.4F, -0.75F, -7.5F);
        this.head.addChild(appendageL1);
        this.setRotateAngle(appendageL1, 0.5236F, -0.1745F, 0.0F);
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 23, 39, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.01F, true));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 15, 39, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-0.25F, 0.5F, -2.75F);
        this.appendageL1.addChild(appendageL2);
        this.setRotateAngle(appendageL2, -0.5236F, 0.0F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 21, 24, -0.24F, -0.51F, -1.75F, 1, 1, 2, -0.015F, true));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 24, -0.24F, -1.01F, -1.75F, 1, 1, 2, -0.005F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.75F, 0.5F, 10.25F);
        this.appendageL2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.7854F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 1.25F, 7.25F, -8.25F, 0, 3, 1, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 3, 0.75F, 7.25F, -8.25F, 0, 3, 1, 0.0F, true));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(0.25F, -0.9F, -1.5F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.1745F, 0.0F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 35, 9, -0.52F, 0.0F, -3.99F, 1, 1, 4, 0.0F, true));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 12, -0.27F, 0.25F, -3.99F, 0, 1, 4, 0.0F, true));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 9, 0.23F, 0.25F, -3.99F, 0, 1, 4, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, 0.75F, 13.5F);
        this.appendageL3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.48F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 0.51F, 7.75F, -15.55F, 1, 1, 0, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.75F, 13.5F);
        this.appendageL3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.7854F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 7, 0.51F, 12.05F, -12.6F, 1, 1, 0, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 8, 0.51F, 11.75F, -12.75F, 1, 1, 0, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-3.25F, -2.75F, -5.5F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.1309F, 0.3054F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 33, 32, -2.0F, -0.5F, -0.5F, 3, 2, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(3.25F, -2.75F, -5.5F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1309F, -0.3054F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 33, 32, -1.0F, -0.5F, -0.5F, 3, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(appendageL1, 0.5236F, -0.1745F, 0.0F);
        this.setRotateAngle(appendageL2, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR, 0.5236F, 0.1745F, 0.0F);
        this.setRotateAngle(appendageR2, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.setRotateAngle(finL1, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(finL10, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finL2, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(finL3, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(finL5, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(finL6, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finL7, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(finR1, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(finR10, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finR2, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finR5, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(finR6, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(finR7, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(GLS_L, 0.0F, -0.5672F, -0.5236F);
        this.setRotateAngle(GLS_L2, 0.0F, -0.5672F, -0.6109F);
        this.setRotateAngle(GLS_L3, 0.0F, -0.5672F, -0.6981F);
        this.setRotateAngle(GLS_R, 0.0F, 0.5672F, 0.5236F);
        this.setRotateAngle(GLS_R2, 0.0F, 0.5672F, 0.6109F);
        this.setRotateAngle(GLS_R3, 0.0F, 0.5672F, 0.6981F);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.setRotateAngle(tailL2, 0.0F, -0.5236F, -0.2618F);
        this.setRotateAngle(tailL3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.setRotateAngle(tailR2, 0.0F, 0.5236F, 0.2618F);
        this.setRotateAngle(tailR3, 0.0F, -0.1745F, 0.0F);
        this.body.rotateAngleY=(float)Math.toRadians(90);
        this.body.offsetY=-0.5F;
        this.body.offsetX=-0.1F;
        this.body.offsetZ=0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.body.offsetY = 0.9F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraAmplectobelua ee = (EntityPrehistoricFloraAmplectobelua) e;

        this.body.offsetY = -0.08F;
        this.body.offsetZ = -0.6F;
        AdvancedModelRenderer[] bodyF = {this.body2,this.body3,this.body4,this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageL1, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageR, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageL2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
                this.walk(appendageR2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
            }

            this.swing(tailL1, 1.6F, 0.16F, false, 0, 0F, f2, 0.7F);
            this.swing(tailR1, 1.6F, -0.16F, false, 0, 0F, f2, 0.7F);

            this.swing(tailL2, 1.6F, 0.16F, false, 0, 0F, f2, 0.7F);
            this.swing(tailR2, 1.6F, -0.16F, false, 0, 0F, f2, 0.7F);

            this.swing(tailL3, 1.6F, 0.16F, false, 0, 0F, f2, 0.7F);
            this.swing(tailR3, 1.6F, -0.16F, false, 0, 0F, f2, 0.7F);

            float degreeFin = 0.185F;
            this.flap(finL11, 0.5F, -degreeFin, false, -1f, -0, f2, 0.7F);
            this.flap(finR11, 0.5F, degreeFin, false, -1f, 0, f2, 0.7F);
            this.flap(finL10, 0.5F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(finR10, 0.5F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(finL9, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(finR9, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(finL8, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(finL7, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(finL1, 0.5F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(finR1, 0.5F, degreeFin, false, 4.0F, 0, f2, 0.7F);

            this.walk(finL11, 0.5F, -degreeFin, true, -1f, -0, f2, 0.7F);
            this.walk(finR11, 0.5F, degreeFin, false, -1f, 0, f2, 0.7F);
            this.walk(finL10, 0.5F, -degreeFin * 0.5F, true, -0.5F, -0.5F, f2, 0.7F);
            this.walk(finR10, 0.5F, degreeFin * 0.5F, false, -0.5F, 0.5F, f2, 0.7F);
            this.walk(finL9, 0.5F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
            this.walk(finR9, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.walk(finL8, 0.5F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(finR8, 0.5F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
            this.walk(finL7, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(finR7, 0.5F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
            this.walk(finL6, 0.5F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
            this.walk(finR6, 0.5F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
            this.walk(finL5, 0.5F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
            this.walk(finR5, 0.5F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            this.walk(finL4, 0.5F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
            this.walk(finR4, 0.5F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
            this.walk(finL3, 0.5F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
            this.walk(finR3, 0.5F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
            this.walk(finL2, 0.5F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
            this.walk(finR2, 0.5F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);


            this.flap(GLS_L, 0.5F, -degreeFin * 0.5F, false, 0, -0.5F, f2, 0.7F);
            this.flap(GLS_R, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.flap(GLS_L2, 0.5F, -degreeFin * 0.5F, false, 0, -0.5F, f2, 0.7F);
            this.flap(GLS_R2, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.flap(GLS_L3, 0.5F, -degreeFin * 0.5F, false, 0, -0.5F, f2, 0.7F);
            this.flap(GLS_R3, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);

            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.15f, -3, f2, 0.55F);

            if (!e.isInWater()) {

                this.bob(body, -speed * 1.5F, 2.5F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.25F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 0.5F, false, f2, 2);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //Duration 40

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(15);
        animator.rotate(this.appendageL1, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(5);
        animator.rotate(this.appendageL1, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.appendageL1, (float) Math.toRadians(90), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(90), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.appendageL1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(15);
    }
}
