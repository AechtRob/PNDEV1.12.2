package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalocaris;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAnomalocaris extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer finL10to11;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer finR10to11;
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
    private final AdvancedModelRenderer finL7to8;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer finR7to8;
    private final AdvancedModelRenderer frontfinL1;
    private final AdvancedModelRenderer frontfinR3;
    private final AdvancedModelRenderer frontfinR2;
    private final AdvancedModelRenderer frontfinR1;
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer appendageL4;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer appendageR4;
    private final AdvancedModelRenderer eyeR;

    private ModelAnimator animator;

    public ModelAnomalocaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 2, -0.5F, -0.74F, -6.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -1.0F, -0.75F, -7.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 24, -2.5F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 37, -3.0F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 39, 2.0F, -1.25F, -8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, -1.5F, -6.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 2, -2.75F, -0.76F, -1.75F, 3, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 18, 26, -2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, -1.0F, 0.0F, 7, 2, 10, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-3.5F, 0.75F, 9.0F);
        this.body2.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 18, 31, -3.5F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-3.5F, 0.75F, 7.0F);
        this.body2.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 26, 20, -4.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-3.5F, 0.75F, 5.0F);
        this.body2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 26, 22, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-3.5F, 0.75F, 1.0F);
        this.body2.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 0, 30, -3.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-3.5F, 0.75F, 3.0F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 29, 26, -4.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(3.5F, 0.75F, 1.0F);
        this.body2.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 30, 18, -1.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(3.5F, 0.75F, 5.0F);
        this.body2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 30, 14, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(3.5F, 0.75F, 7.0F);
        this.body2.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 30, 12, -1.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(3.5F, 0.75F, 9.0F);
        this.body2.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 18, 33, -0.5F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(3.5F, 0.75F, 3.0F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 30, 16, -1.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 20, -2.5F, -1.0F, -1.0F, 5, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 4, -2.0F, -1.0F, -1.0F, 4, 2, 4, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(2.0F, 0.75F, -0.5F);
        this.body4.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 37, 0, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(2.0F, 0.75F, 0.5F);
        this.body4.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 5, 33, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(2.0F, 0.75F, 1.5F);
        this.body4.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 5, 32, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL10to11 = new AdvancedModelRenderer(this);
        this.finL10to11.setRotationPoint(2.0F, 0.75F, 2.5F);
        this.body4.addChild(finL10to11);
        this.finL10to11.cubeList.add(new ModelBox(finL10to11, 5, 0, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-2.0F, 0.75F, 0.5F);
        this.body4.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 13, 27, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-2.0F, 0.75F, 1.5F);
        this.body4.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 13, 26, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10to11 = new AdvancedModelRenderer(this);
        this.finR10to11.setRotationPoint(-2.0F, 0.75F, 2.5F);
        this.body4.addChild(finR10to11);
        this.finR10to11.cubeList.add(new ModelBox(finR10to11, 5, 1, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-2.0F, 0.75F, -0.5F);
        this.body4.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 35, 36, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 40, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 36, 5, -1.0F, -0.5F, 1.0F, 2, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -0.5F, 3.0F, 1, 0, 2, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.75F, 0.5F);
        this.body5.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 23, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, -0.25F, 0.75F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 20, 0, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, -0.35F, 1.5F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.7854F, -0.2618F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 0, 20, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, -0.35F, 2.5F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.1745F, -0.9599F, -0.3491F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, 14, 12, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.75F, 0.5F);
        this.body5.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 5, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, -0.25F, 0.75F);
        this.body5.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 14, 16, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-1.0F, -0.35F, 1.5F);
        this.body5.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.7854F, 0.2618F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 0, 16, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailR3 = new AdvancedModelRenderer(this);
        this.tailR3.setRotationPoint(-1.0F, -0.35F, 2.75F);
        this.body5.addChild(tailR3);
        this.setRotateAngle(tailR3, 0.1745F, 0.9599F, 0.3491F);
        this.tailR3.cubeList.add(new ModelBox(tailR3, 0, 12, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.5F, 0.75F, 0.0F);
        this.body3.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 32, 10, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body3.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 24, 36, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL7to8 = new AdvancedModelRenderer(this);
        this.finL7to8.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body3.addChild(finL7to8);
        this.finL7to8.cubeList.add(new ModelBox(finL7to8, 35, 33, -0.9F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.5F, 0.75F, 0.0F);
        this.body3.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 30, 24, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.5F, 0.75F, 1.5F);
        this.body3.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 35, 35, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR7to8 = new AdvancedModelRenderer(this);
        this.finR7to8.setRotationPoint(-2.5F, 0.75F, 2.5F);
        this.body3.addChild(finR7to8);
        this.finR7to8.cubeList.add(new ModelBox(finR7to8, 35, 34, -3.1F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(2.5F, 0.75F, 0.5F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 23, 5, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR3 = new AdvancedModelRenderer(this);
        this.frontfinR3.setRotationPoint(-2.5F, 0.75F, 2.5F);
        this.body1.addChild(frontfinR3);
        this.frontfinR3.cubeList.add(new ModelBox(frontfinR3, 5, 2, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR2 = new AdvancedModelRenderer(this);
        this.frontfinR2.setRotationPoint(-2.5F, 0.75F, 1.5F);
        this.body1.addChild(frontfinR2);
        this.frontfinR2.cubeList.add(new ModelBox(frontfinR2, 5, 3, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinR1 = new AdvancedModelRenderer(this);
        this.frontfinR1.setRotationPoint(-2.5F, 0.75F, 0.5F);
        this.body1.addChild(frontfinR1);
        this.frontfinR1.cubeList.add(new ModelBox(frontfinR1, 5, 5, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body1.addChild(frontfinL3);
        this.frontfinL3.cubeList.add(new ModelBox(frontfinL3, 5, 7, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body1.addChild(frontfinL2);
        this.frontfinL2.cubeList.add(new ModelBox(frontfinL2, 5, 8, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(2.0F, -1.5F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 26, 38, 2.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 12, 40, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.5F, -1.05F, -7.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.7854F, -0.1745F, 0.0F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 36, 28, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 7, 35, -0.49F, -0.5F, -2.99F, 1, 1, 3, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 2, 25, -0.5F, 0.5F, -2.4F, 1, 1, 0, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-0.25F, 0.0F, -2.75F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.8727F, 0.0F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 30, 33, -0.24F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 30, 28, -0.23F, -0.41F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 22, -0.25F, 0.5F, -0.5F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 2, 20, -0.25F, 0.0F, -1.25F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 2, 16, -0.25F, 0.25F, -2.0F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 16, -0.25F, 0.25F, -2.75F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 2, 14, -0.25F, 0.25F, -3.5F, 1, 2, 0, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(0.25F, 0.0F, -3.75F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.829F, 0.0F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 32, -0.51F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 0, -0.5F, -0.25F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 20, -0.5F, 0.25F, -0.85F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 2, 18, -0.5F, 0.0F, -1.6F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 18, -0.5F, 0.0F, -2.25F, 1, 2, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 26, 7, -0.5F, 0.75F, -2.85F, 1, 1, 0, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 26, 6, -0.5F, 0.75F, -3.5F, 1, 1, 0, 0.0F, false));

        this.appendageL4 = new AdvancedModelRenderer(this);
        this.appendageL4.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.appendageL3.addChild(appendageL4);
        this.setRotateAngle(appendageL4, 0.48F, 0.0F, 0.0F);
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 2, 26, -0.5F, 0.5F, -0.65F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 0, 26, -0.5F, 0.25F, -1.15F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 0, 25, -0.5F, 0.25F, -1.55F, 1, 1, 0, 0.0F, false));
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 32, 38, -0.48F, 0.01F, -2.0F, 1, 1, 2, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.5F, -1.05F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.7854F, 0.1745F, 0.0F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 20, 36, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 12, 36, -0.51F, -0.5F, -2.99F, 1, 1, 3, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 24, 7, -0.5F, 0.5F, -2.4F, 1, 1, 0, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.25F, 0.0F, -2.75F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.8727F, 0.0F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 24, 31, -0.76F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 8, 30, -0.77F, -0.41F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 2, 7, -0.75F, 0.5F, -0.5F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 7, -0.75F, 0.0F, -1.25F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 2, 5, -0.75F, 0.25F, -2.0F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 5, -0.75F, 0.25F, -2.75F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 0, -0.75F, 0.25F, -3.5F, 1, 2, 0, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-0.25F, 0.0F, -3.75F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.829F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 14, 31, -0.49F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 5, -0.5F, -0.25F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 14, -0.5F, 0.25F, -0.85F, 1, 2, 0, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 2, 12, -0.5F, 0.0F, -1.6F, 1, 2, 0, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 12, -0.5F, 0.0F, -2.25F, 1, 2, 0, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 24, 6, -0.5F, 0.75F, -2.85F, 1, 1, 0, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 2, 24, -0.5F, 0.75F, -3.5F, 1, 1, 0, 0.0F, false));

        this.appendageR4 = new AdvancedModelRenderer(this);
        this.appendageR4.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.appendageR3.addChild(appendageR4);
        this.setRotateAngle(appendageR4, 0.48F, 0.0F, 0.0F);
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 0, 24, -0.5F, 0.5F, -0.65F, 1, 1, 0, 0.0F, false));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 2, 23, -0.5F, 0.25F, -1.15F, 1, 1, 0, 0.0F, false));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 2, 22, -0.5F, 0.25F, -1.55F, 1, 1, 0, 0.0F, false));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 17, 36, -0.52F, 0.01F, -2.0F, 1, 1, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.75F, -1.5F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 38, 20, -3.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 40, 8, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.12F;
        this.body.offsetY = -0.01F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.4999F, 0.4789F, 0.5888F);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(finR5, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finR4, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(finR3, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(finR1, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(finR2, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finL1, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(finL3, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(finL4, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(finL5, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finL2, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(finL10, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(finL10to11, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(finR10, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(finR10to11, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(body5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(finL11, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.setRotateAngle(tailL2, 0.0F, -0.7854F, -0.2618F);
        this.setRotateAngle(tailL3, 0.1745F, -0.9599F, -0.3491F);
        this.setRotateAngle(finR11, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.setRotateAngle(tailR2, 0.0F, 0.7854F, 0.2618F);
        this.setRotateAngle(tailR3, 0.1745F, 0.9599F, 0.3491F);
        this.setRotateAngle(finL6, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(finL7, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(finR6, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finR7, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(frontfinL1, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(frontfinR2, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(frontfinR1, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(frontfinL2, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.setRotateAngle(appendageL, -0.1859F, -0.3892F, 0.0406F);
        this.setRotateAngle(appendageL2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL4, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(appendageR2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR3, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR4, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
        this.body.offsetX = -0.03F;
        this.body.offsetZ = -0.03F;
        this.body.offsetY = -0.45F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 0.4F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.5F, 3.5F, 0.5F);
        this.setRotateAngle(head, -0.4999F, 0.4789F, 0.5888F);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(finR5, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finR4, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(finR3, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(finR1, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(finR2, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finL1, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(finL3, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(finL4, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(finL5, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finL2, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(finL10, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(finL10to11, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(finR10, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(finR10to11, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(body5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(finL11, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, -0.1745F);
        this.setRotateAngle(tailL2, 0.0F, -0.7854F, -0.2618F);
        this.setRotateAngle(tailL3, 0.1745F, -0.9599F, -0.3491F);
        this.setRotateAngle(finR11, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.1745F);
        this.setRotateAngle(tailR2, 0.0F, 0.7854F, 0.2618F);
        this.setRotateAngle(tailR3, 0.1745F, 0.9599F, 0.3491F);
        this.setRotateAngle(finL6, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(finL7, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(finR6, 0.0F, 0.0F, 0.0873F);
        this.setRotateAngle(finR7, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(frontfinL1, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(frontfinR2, 0.0F, 0.0F, -0.1745F);
        this.setRotateAngle(frontfinR1, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(frontfinL2, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, -0.2618F);
        this.setRotateAngle(appendageL, -0.1859F, -0.3892F, 0.0406F);
        this.setRotateAngle(appendageL2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(appendageL4, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(appendageR2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR3, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(appendageR4, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(eyeR, 0.0F, 0.1745F, 0.2618F);
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
        //this.body.offsetY = 0F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraAnomalocaris ee = (EntityPrehistoricFloraAnomalocaris) e;

        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageL, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
                this.walk(appendageR, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
            }

            this.flap(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(tailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.flap(tailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.flap(tailR3, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

            this.swing(tailL1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailR1, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);
            this.swing(tailL2, 1F, -0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(tailR2, 1F, 0.16F, false, -2.5F, 0F, f2, 0.7F);
            this.swing(tailL3, 1F, -0.16F, false, -3.0F, 0F, f2, 0.7F);
            this.swing(tailR3, 1F, 0.16F, false, -3.0F, 0F, f2, 0.7F);

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

            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.18f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                this.body.offsetY = -0.05F;
                this.bob(body, -speed * 1.5F, 2.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.25F, false, f2, 2);
                } else {
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
        animator.rotate(this.appendageL2, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(3);
        animator.rotate(this.appendageL, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL4, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR4, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(12);
    }
}
