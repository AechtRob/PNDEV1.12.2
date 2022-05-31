package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLaminacaris;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLaminacaris extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer tailL1;
    private final AdvancedModelRenderer tailL2;
    private final AdvancedModelRenderer tailL3;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer tailR1;
    private final AdvancedModelRenderer tailR2;
    private final AdvancedModelRenderer tailR3;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer frontfinL1;
    private final AdvancedModelRenderer frontfinR3;
    private final AdvancedModelRenderer frontfinR2;
    private final AdvancedModelRenderer frontfinR1;
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer appendageL4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer appendageL5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer appendageR4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer appendageR5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eyeR;

    private ModelAnimator animator;

    public ModelLaminacaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -0.74F, -6.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 34, -1.0F, -0.75F, -7.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 26, -2.0F, -2.0F, -8.0F, 4, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 9, -2.5F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 37, 1.5F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 31, -2.75F, -0.76F, -1.75F, 3, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 28, 4, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -3.0F, -1.0F, 0.0F, 6, 2, 10, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-3.0F, 0.5F, 8.75F);
        this.body2.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 28, 28, -3.75F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-3.0F, 0.5F, 6.75F);
        this.body2.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 12, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-3.0F, 0.5F, 4.75F);
        this.body2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 10, 12, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-3.0F, 0.5F, 0.75F);
        this.body2.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 26, 16, -3.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-3.0F, 0.5F, 2.75F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 26, 14, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(3.0F, 0.5F, 0.75F);
        this.body2.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 25, 26, -1.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(3.0F, 0.5F, 4.75F);
        this.body2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 26, 20, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(3.0F, 0.5F, 6.75F);
        this.body2.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 26, 18, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(3.0F, 0.5F, 8.75F);
        this.body2.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 14, 31, -0.25F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(3.0F, 0.5F, 2.75F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 26, 22, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 16, 26, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 9, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, 0.5F, 0.25F);
        this.body4.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 31, 24, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.5F, 0.5F, 1.25F);
        this.body4.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 33, 32, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.5F, 0.5F, 2.25F);
        this.body4.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 19, 8, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.5F, 0.5F, 1.25F);
        this.body4.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 11, 26, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.5F, 0.5F, 2.25F);
        this.body4.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 19, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.5F, 0.5F, 0.25F);
        this.body4.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 1, 19, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 14, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.5F, 0.25F);
        this.body5.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 19, 7, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, -0.5F, 0.0F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 24, 0, 0.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, -0.6F, 1.5F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.5236F, -0.2618F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 0, 8, 0.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, false));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, -0.35F, 2.75F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.0F, 0.1745F, 0.0F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, 2, 0, -1.0F, 0.0F, -0.25F, 1, 0, 24, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.5F, 0.25F);
        this.body5.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 19, 3, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.body5.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 0, 4, -8.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, false));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-1.0F, -0.6F, 1.5F);
        this.body5.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.5236F, 0.2618F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 0, 0, -8.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, false));

        this.tailR3 = new AdvancedModelRenderer(this);
        this.tailR3.setRotationPoint(-1.0F, -0.35F, 2.75F);
        this.body5.addChild(tailR3);
        this.setRotateAngle(tailR3, 0.0F, -0.1745F, 0.0F);
        this.tailR3.cubeList.add(new ModelBox(tailR3, 0, 0, 0.0F, 0.0F, -0.25F, 1, 0, 24, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.0F, 0.5F, 0.75F);
        this.body3.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 28, 30, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(2.0F, 0.5F, 2.25F);
        this.body3.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 31, 25, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.0F, 0.5F, 0.75F);
        this.body3.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 21, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.0F, 0.5F, 2.25F);
        this.body3.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 1, 20, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(2.0F, 0.5F, 0.25F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 19, 9, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR3 = new AdvancedModelRenderer(this);
        this.frontfinR3.setRotationPoint(-2.0F, 0.5F, 2.25F);
        this.body1.addChild(frontfinR3);
        this.frontfinR3.cubeList.add(new ModelBox(frontfinR3, 19, 0, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR2 = new AdvancedModelRenderer(this);
        this.frontfinR2.setRotationPoint(-2.0F, 0.5F, 1.25F);
        this.body1.addChild(frontfinR2);
        this.frontfinR2.cubeList.add(new ModelBox(frontfinR2, 19, 1, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR1 = new AdvancedModelRenderer(this);
        this.frontfinR1.setRotationPoint(-2.0F, 0.5F, 0.25F);
        this.body1.addChild(frontfinR1);
        this.frontfinR1.cubeList.add(new ModelBox(frontfinR1, 19, 2, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(2.0F, 0.5F, 2.25F);
        this.body1.addChild(frontfinL3);
        this.frontfinL3.cubeList.add(new ModelBox(frontfinL3, 19, 5, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(2.0F, 0.5F, 1.25F);
        this.body1.addChild(frontfinL2);
        this.frontfinL2.cubeList.add(new ModelBox(frontfinL2, 19, 6, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.25F, -1.5F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 29, 36, 2.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 38, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(0.9F, -1.0F, -7.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0873F, -0.1745F, 0.0F);


        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(0.25F, -0.05F, -0.25F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.5236F, -0.0873F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 44, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 44, 0, -0.5F, 0.35F, -2.25F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 40, -0.49F, -0.5F, -2.99F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.0F, 7.75F);
        this.appendageL2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 0, 0.5F, -1.85F, -9.55F, 1, 2, 0, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(-0.25F, -0.15F, -2.25F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.6545F, 0.0F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 13, 60, -0.235F, -0.01F, -3.5F, 1, 1, 3, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 1, 60, -0.23F, -0.41F, -3.49F, 1, 1, 3, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 44, 0, -0.235F, -0.35F, -1.1F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 44, 0, -0.235F, 0.1F, -1.95F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 44, 0, -0.235F, -0.05F, -2.825F, 1, 2, 0, 0.0F, false));

        this.appendageL4 = new AdvancedModelRenderer(this);
        this.appendageL4.setRotationPoint(0.25F, -0.125F, -3.25F);
        this.appendageL3.addChild(appendageL4);
        this.setRotateAngle(appendageL4, 0.7418F, 0.0F, 0.0F);
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 32, 60, -0.51F, 0.0F, -2.9F, 1, 1, 3, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 44, 1, -0.5F, 0.575F, -0.775F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 44, 1, -0.5F, 0.675F, -1.475F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 44, 1, -0.5F, 0.675F, -2.225F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 22, 60, -0.5F, -0.25F, -2.89F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 1.125F, -2.75F);
        this.appendageL4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.6581F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 0, 0.5F, -1.225F, -1.375F, 1, 2, 0, 0.0F, false));

        this.appendageL5 = new AdvancedModelRenderer(this);
        this.appendageL5.setRotationPoint(-0.025F, -0.25F, -2.625F);
        this.appendageL4.addChild(appendageL5);
        this.setRotateAngle(appendageL5, 0.6545F, 0.0F, 0.0F);
        this.appendageL5.cubeList.add(new ModelBox(appendageL5, 44, 1, -0.48F, 0.575F, -0.825F, 1, 1, 0, 0.0F, false));
        this.appendageL5.cubeList.add(new ModelBox(appendageL5, 44, 1, -0.48F, 0.15F, -1.35F, 1, 1, 0, 0.0F, false));
        this.appendageL5.cubeList.add(new ModelBox(appendageL5, 44, 1, -0.48F, 0.15F, -1.75F, 1, 1, 0, 0.0F, false));
        this.appendageL5.cubeList.add(new ModelBox(appendageL5, 42, 61, -0.48F, 0.01F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.975F, 1.375F, -0.125F);
        this.appendageL5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.1781F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 1, 0.5F, 1.325F, -1.7F, 1, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.975F, 1.375F, -0.125F);
        this.appendageL5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.7453F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 1, 0.5F, 1.4F, -1.1F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.975F, 1.375F, -0.125F);
        this.appendageL5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.789F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 1, 0.5F, 0.85F, -1.15F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.975F, 1.375F, -0.125F);
        this.appendageL5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.8762F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 1, 0.5F, 0.45F, -1.2F, 1, 1, 0, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-0.9F, -1.0F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0873F, 0.1745F, 0.0F);


        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(-0.25F, -0.05F, -0.25F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.5236F, 0.0873F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 44, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 44, 0, -0.5F, 0.35F, -2.25F, 1, 2, 0, 0.0F, true));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 40, -0.51F, -0.5F, -2.99F, 1, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.0F, 7.75F);
        this.appendageR2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 0, -1.5F, -1.85F, -9.55F, 1, 2, 0, 0.0F, true));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(0.25F, -0.15F, -2.25F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.6545F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 13, 60, -0.765F, -0.01F, -3.5F, 1, 1, 3, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 1, 60, -0.77F, -0.41F, -3.49F, 1, 1, 3, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 44, 0, -0.765F, -0.35F, -1.1F, 1, 2, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 44, 0, -0.765F, 0.1F, -1.95F, 1, 2, 0, 0.0F, true));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 44, 0, -0.765F, -0.05F, -2.825F, 1, 2, 0, 0.0F, true));

        this.appendageR4 = new AdvancedModelRenderer(this);
        this.appendageR4.setRotationPoint(-0.25F, -0.125F, -3.25F);
        this.appendageR3.addChild(appendageR4);
        this.setRotateAngle(appendageR4, 0.7418F, 0.0F, 0.0F);
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 32, 60, -0.49F, 0.0F, -2.9F, 1, 1, 3, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 44, 1, -0.5F, 0.575F, -0.775F, 1, 1, 0, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 44, 1, -0.5F, 0.675F, -1.475F, 1, 1, 0, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 44, 1, -0.5F, 0.675F, -2.225F, 1, 1, 0, 0.0F, true));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 22, 60, -0.5F, -0.25F, -2.89F, 1, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 1.125F, -2.75F);
        this.appendageR4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.6581F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 0, -1.5F, -1.225F, -1.375F, 1, 2, 0, 0.0F, true));

        this.appendageR5 = new AdvancedModelRenderer(this);
        this.appendageR5.setRotationPoint(0.025F, -0.25F, -2.625F);
        this.appendageR4.addChild(appendageR5);
        this.setRotateAngle(appendageR5, 0.6545F, 0.0F, 0.0F);
        this.appendageR5.cubeList.add(new ModelBox(appendageR5, 44, 1, -0.52F, 0.575F, -0.825F, 1, 1, 0, 0.0F, true));
        this.appendageR5.cubeList.add(new ModelBox(appendageR5, 44, 1, -0.52F, 0.15F, -1.35F, 1, 1, 0, 0.0F, true));
        this.appendageR5.cubeList.add(new ModelBox(appendageR5, 44, 1, -0.52F, 0.15F, -1.75F, 1, 1, 0, 0.0F, true));
        this.appendageR5.cubeList.add(new ModelBox(appendageR5, 42, 61, -0.52F, 0.01F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.975F, 1.375F, -0.125F);
        this.appendageR5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1781F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 1, -1.5F, 1.325F, -1.7F, 1, 1, 0, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.975F, 1.375F, -0.125F);
        this.appendageR5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.7453F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 1, -1.5F, 1.4F, -1.1F, 1, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.975F, 1.375F, -0.125F);
        this.appendageR5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.789F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 1, -1.5F, 0.85F, -1.15F, 1, 1, 0, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.975F, 1.375F, -0.125F);
        this.appendageR5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.8762F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 1, -1.5F, 0.45F, -1.2F, 1, 1, 0, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.25F, -1.5F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 6, 36, -3.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 37, 26, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.51F);
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
        this.body.offsetY = 0.6F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraLaminacaris ee = (EntityPrehistoricFloraLaminacaris) e;

        AdvancedModelRenderer[] bodyF = {this.body2,this.body3,this.body4,this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageL, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageR, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
                this.walk(appendageL2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
                this.walk(appendageR2, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
            }


            this.flap(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(tailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);

            this.swing(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(tailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);

            this.swing(tailL3, 1.6F, 0.16F, false, 0, 0F, f2, 0.7F);
            this.swing(tailR3, 1.6F, -0.16F, false, 0, 0F, f2, 0.7F);

            float degreeFin = 0.185F;
            this.flap(finL11, 0.5F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(finR11, 0.5F, degreeFin, false, -1.0f, 0, f2, 0.7F);
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

            this.walk(finL11, 0.5F, -degreeFin * 0.5F, true, -1.0F, -0.5F, f2, 0.7F);
            this.walk(finR11, 0.5F, degreeFin * 0.5F, false, -1.0F, 0.5F, f2, 0.7F);
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

            this.chainSwing(bodyF, 0.16F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.23F, 0.17f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                this.body.offsetY = 0.7F;
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
        //Duration 45

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(15);
        animator.rotate(this.appendageL, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5);
        animator.rotate(this.appendageL, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL4, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR4, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(15);
    }
}
