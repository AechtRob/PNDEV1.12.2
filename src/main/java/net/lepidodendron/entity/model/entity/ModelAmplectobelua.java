package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmplectobelua;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAmplectobelua extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tailL1;
    private final AdvancedModelRenderer tailL2;
    private final AdvancedModelRenderer tailL3;
    private final AdvancedModelRenderer tailR1;
    private final AdvancedModelRenderer tailR2;
    private final AdvancedModelRenderer tailR3;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer frontfinL1;
    private final AdvancedModelRenderer frontfinR3;
    private final AdvancedModelRenderer frontfinR2;
    private final AdvancedModelRenderer frontfinR1;
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer GLS_R;
    private final AdvancedModelRenderer GLS_L;
    private final AdvancedModelRenderer GLS_R2;
    private final AdvancedModelRenderer GLS_L2;
    private final AdvancedModelRenderer GLS_R3;
    private final AdvancedModelRenderer GLS_L3;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eyeR;

    private ModelAnimator animator;

    public ModelAmplectobelua() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 23, -0.5F, -0.74F, -5.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 18, -1.0F, -0.75F, -6.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 24, -3.0F, -3.0F, -8.0F, 6, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 25, -3.5F, -2.25F, -8.0F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 29, 2.5F, -2.25F, -8.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 34, -0.65F, -0.51F, -1.75F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 36, -1.35F, -0.51F, -1.75F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 12, -3.25F, -1.66F, -1.5F, 4, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -2.5F, -2.0F, 0.0F, 5, 3, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 11, 7, -3.0F, -2.0F, 0.0F, 6, 3, 11, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-3.0F, 0.5F, 10.0F);
        this.body2.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 16, -5.75F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-3.0F, 0.5F, 7.0F);
        this.body2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 13, 24, -7.5F, 0.0F, -1.0F, 8, 0, 3, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-3.0F, 0.5F, 1.0F);
        this.body2.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 19, 0, -9.5F, 0.0F, -1.0F, 10, 0, 3, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-3.0F, 0.5F, 4.0F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 21, -8.5F, 0.0F, -1.0F, 9, 0, 3, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(3.0F, 0.5F, 1.0F);
        this.body2.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 19, 3, -0.5F, 0.0F, -1.0F, 10, 0, 3, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(3.0F, 0.5F, 7.0F);
        this.body2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 17, 27, -0.5F, 0.0F, -1.0F, 8, 0, 3, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(3.0F, 0.5F, 10.0F);
        this.body2.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 32, 6, -0.25F, 0.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(3.0F, 0.5F, 4.0F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 18, 21, -0.5F, 0.0F, -1.0F, 9, 0, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 17, 30, -2.0F, -2.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 6, -1.5F, -2.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.5F, 0.5F, 0.5F);
        this.body4.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 9, 9, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, 0.5F, 1.5F);
        this.body4.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 27, 6, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.5F, 0.5F, 2.5F);
        this.body4.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 14, 31, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.5F, 0.5F, 3.5F);
        this.body4.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 13, 12, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.5F, 0.5F, 1.5F);
        this.body4.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 21, 6, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.5F, 0.5F, 2.5F);
        this.body4.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 5, 18, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.5F, 0.5F, 3.5F);
        this.body4.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 12, 14, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.5F, 0.5F, 0.5F);
        this.body4.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 9, 8, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 17, 36, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, -0.5F, 0.0F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 0, 31, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, -0.6F, 1.5F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.5236F, -0.2618F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 25, 30, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, -0.35F, 2.75F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.0F, 0.1745F, 0.0F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, 2, 0, -1.0F, 0.0F, -0.25F, 1, 0, 18, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.body5.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 29, 24, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-1.0F, -0.6F, 1.5F);
        this.body5.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.5236F, 0.2618F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 0, 13, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.tailR3 = new AdvancedModelRenderer(this);
        this.tailR3.setRotationPoint(-1.0F, -0.35F, 2.75F);
        this.body5.addChild(tailR3);
        this.setRotateAngle(tailR3, 0.0F, -0.1745F, 0.0F);
        this.tailR3.cubeList.add(new ModelBox(tailR3, 0, 0, 0.0F, 0.0F, -0.25F, 1, 0, 18, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(2.0F, 0.5F, 1.0F);
        this.body3.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 32, 10, 0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.0F, 0.5F, 2.5F);
        this.body3.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 9, 7, -0.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-2.0F, 0.5F, 1.0F);
        this.body3.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 32, 8, -5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.0F, 0.5F, 2.5F);
        this.body3.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 9, 6, -3.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(2.5F, 0.5F, 0.5F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 14, 32, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR3 = new AdvancedModelRenderer(this);
        this.frontfinR3.setRotationPoint(-2.5F, 0.5F, 2.5F);
        this.body1.addChild(frontfinR3);
        this.frontfinR3.cubeList.add(new ModelBox(frontfinR3, 12, 15, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR2 = new AdvancedModelRenderer(this);
        this.frontfinR2.setRotationPoint(-2.5F, 0.5F, 1.5F);
        this.body1.addChild(frontfinR2);
        this.frontfinR2.cubeList.add(new ModelBox(frontfinR2, 13, 16, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR1 = new AdvancedModelRenderer(this);
        this.frontfinR1.setRotationPoint(-2.5F, 0.5F, 0.5F);
        this.body1.addChild(frontfinR1);
        this.frontfinR1.cubeList.add(new ModelBox(frontfinR1, 13, 17, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(2.5F, 0.5F, 2.5F);
        this.body1.addChild(frontfinL3);
        this.frontfinL3.cubeList.add(new ModelBox(frontfinL3, 5, 19, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(2.5F, 0.5F, 1.5F);
        this.body1.addChild(frontfinL2);
        this.frontfinL2.cubeList.add(new ModelBox(frontfinL2, 15, 27, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.GLS_R = new AdvancedModelRenderer(this);
        this.GLS_R.setRotationPoint(-2.25F, 1.0F, 0.5F);
        this.body1.addChild(GLS_R);
        this.setRotateAngle(GLS_R, 0.0F, 0.5672F, 0.5236F);
        this.GLS_R.cubeList.add(new ModelBox(GLS_R, 12, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L = new AdvancedModelRenderer(this);
        this.GLS_L.setRotationPoint(2.25F, 1.0F, 0.5F);
        this.body1.addChild(GLS_L);
        this.setRotateAngle(GLS_L, 0.0F, -0.5672F, -0.5236F);
        this.GLS_L.cubeList.add(new ModelBox(GLS_L, 12, 2, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_R2 = new AdvancedModelRenderer(this);
        this.GLS_R2.setRotationPoint(-2.25F, 1.0F, 1.5F);
        this.body1.addChild(GLS_R2);
        this.setRotateAngle(GLS_R2, 0.0F, 0.5672F, 0.6109F);
        this.GLS_R2.cubeList.add(new ModelBox(GLS_R2, 13, 11, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L2 = new AdvancedModelRenderer(this);
        this.GLS_L2.setRotationPoint(2.25F, 1.0F, 1.5F);
        this.body1.addChild(GLS_L2);
        this.setRotateAngle(GLS_L2, 0.0F, -0.5672F, -0.6109F);
        this.GLS_L2.cubeList.add(new ModelBox(GLS_L2, 12, 1, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_R3 = new AdvancedModelRenderer(this);
        this.GLS_R3.setRotationPoint(-2.25F, 1.0F, 2.5F);
        this.body1.addChild(GLS_R3);
        this.setRotateAngle(GLS_R3, 0.0F, 0.5672F, 0.6981F);
        this.GLS_R3.cubeList.add(new ModelBox(GLS_R3, 13, 10, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.GLS_L3 = new AdvancedModelRenderer(this);
        this.GLS_L3.setRotationPoint(2.25F, 1.0F, 2.5F);
        this.body1.addChild(GLS_L3);
        this.setRotateAngle(GLS_L3, 0.0F, -0.5672F, -0.6981F);
        this.GLS_L3.cubeList.add(new ModelBox(GLS_L3, 12, 0, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(3.25F, -2.75F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 49, -1.0F, -0.5F, -0.5F, 3, 2, 2, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.9F, -0.75F, -7.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.5236F, -0.1745F, 0.0F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 9, 37, -0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-0.25F, 0.5F, -2.75F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, -0.5236F, 0.0F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 31, 39, -0.24F, -1.51F, -1.75F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, 0.5F, 10.25F);
        this.appendageL2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 20, 0.5F, 3.75F, -9.5F, 1, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.75F, 0.5F, 10.25F);
        this.appendageL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 5, 1.0F, 7.25F, -8.25F, 0, 4, 1, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(0.25F, -0.65F, -1.5F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.1745F, 0.0F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 34, -0.5F, -0.25F, -5.0F, 1, 1, 5, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 33, 28, -0.52F, -0.75F, -4.99F, 1, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.75F, 13.5F);
        this.appendageL3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, 0.51F, 7.5F, -16.55F, 1, 2, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.75F, 13.5F);
        this.appendageL3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 3, 0.51F, 11.8F, -13.6F, 1, 2, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 25, 0.51F, 12.0F, -14.0F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.75F, -1.75F);
        this.appendageL3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, 0.5F, 0.1F, -1.0F, 1, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 22, 0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, 0.5F, -0.75F, 0.5F, 1, 1, 0, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.9F, -0.75F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.5236F, 0.1745F, 0.0F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 35, 36, -0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.25F, 0.5F, -2.75F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, -0.5236F, 0.0F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 25, 39, -0.76F, -1.51F, -1.75F, 1, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, 0.5F, 10.25F);
        this.appendageR2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, -1.5F, 3.75F, -9.5F, 1, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.75F, 0.5F, 10.25F);
        this.appendageR2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 5, -1.0F, 7.25F, -8.25F, 0, 4, 1, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-0.25F, -0.65F, -1.5F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.1745F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 26, 33, -0.5F, -0.25F, -5.0F, 1, 1, 5, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 8, 31, -0.48F, -0.75F, -4.99F, 1, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.75F, 13.5F);
        this.appendageR3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.51F, 7.5F, -16.55F, 1, 2, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.75F, 13.5F);
        this.appendageR3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 13, -1.51F, 11.8F, -13.6F, 1, 2, 0, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 5, -1.51F, 12.0F, -14.0F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.75F, -1.75F);
        this.appendageR3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 17, -1.5F, 0.1F, -1.0F, 1, 1, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 18, -1.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 19, -1.5F, -0.75F, 0.5F, 1, 1, 0, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-3.25F, -2.75F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 54, -2.0F, -0.5F, -0.5F, 3, 2, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.29F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.15F;
        this.body.render(0.017F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetY = 0.9F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraAmplectobelua ee = (EntityPrehistoricFloraAmplectobelua) e;

        AdvancedModelRenderer[] bodyF = {this.body2,this.body3,this.body4,this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageL, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageR, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageL2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
                this.walk(appendageR2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
            }

            this.swing(tailL3, 1.6F, 0.16F, false, 0, 0F, f2, 0.7F);
            this.swing(tailR3, 1.6F, -0.16F, false, 0, 0F, f2, 0.7F);

            float degreeFin = 0.185F;
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

            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.15f, -3, f2, 0.55F);

            if (!e.isInWater()) {
                this.body.offsetY = 1.05F;
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
        animator.rotate(this.appendageL, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(5);
        animator.rotate(this.appendageL, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.appendageL, (float) Math.toRadians(90), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(90), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.appendageL, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(15);
    }
}
