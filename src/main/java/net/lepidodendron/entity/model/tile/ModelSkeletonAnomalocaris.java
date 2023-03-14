package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnomalocaris extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer frontfinL3;
    private final AdvancedModelRenderer frontfinL2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer appendageR4;
    private final AdvancedModelRenderer eyeR;

    public ModelSkeletonAnomalocaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -1.0F, -16.0F, 16, 1, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -1.0F, -4.0F, 16, 1, 16, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -1.0F, -1.0F, 16, 1, 16, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -1.0F, 11.0F, 16, 1, 16, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 37, -1.75F, -1.11F, -8.25F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -0.5F, -0.74F, -6.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 42, -1.0F, -0.75F, -7.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 32, -2.5F, -1.0F, -8.0F, 5, 1, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 43, 2.0F, -1.1F, -8.0F, 1, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.25F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, 0.0F, 0.1309F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 5, -2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -3.5F, 0.0F, 0.0F, 7, 1, 10, 0.01F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-3.5F, 0.75F, 9.0F);
        this.body2.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 36, 23, -3.5F, -0.5F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-3.5F, 0.75F, 7.0F);
        this.body2.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 9, -4.0F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-3.5F, 0.75F, 5.0F);
        this.body2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 11, -4.5F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-3.5F, 0.75F, 1.0F);
        this.body2.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 22, 25, -1.5F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-3.5F, 0.75F, 3.0F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 13, -3.0F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(3.5F, 0.75F, 1.0F);
        this.body2.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 36, 19, -2.5F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(3.5F, 0.75F, 5.0F);
        this.body2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 0, 36, -1.5F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(3.5F, 0.75F, 7.0F);
        this.body2.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 32, 25, -1.0F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(3.5F, 0.75F, 9.0F);
        this.body2.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 28, 37, -0.5F, -0.5F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(3.5F, 0.75F, 3.0F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 36, 17, -2.0F, -0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 10.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0436F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 14, 32, -2.5F, 0.0F, -1.0F, 5, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -2.0F, 0.0F, -1.0F, 4, 1, 4, 0.01F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(2.0F, 0.75F, -0.5F);
        this.body4.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 43, 25, -0.75F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(2.0F, 0.75F, 0.5F);
        this.body4.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 43, 26, -0.25F, -0.5F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(2.0F, 0.75F, 1.5F);
        this.body4.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 0, 42, -0.75F, -0.5F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL10to11 = new AdvancedModelRenderer(this);
        this.finL10to11.setRotationPoint(2.0F, 0.75F, 2.5F);
        this.body4.addChild(finL10to11);
        this.finL10to11.cubeList.add(new ModelBox(finL10to11, 11, 0, -0.25F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-2.0F, 0.75F, 0.5F);
        this.body4.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 4, 39, -1.75F, -0.5F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-2.0F, 0.75F, 1.5F);
        this.body4.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 4, 38, -1.25F, -0.5F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10to11 = new AdvancedModelRenderer(this);
        this.finR10to11.setRotationPoint(-2.0F, 0.75F, 2.5F);
        this.body4.addChild(finR10to11);
        this.finR10to11.cubeList.add(new ModelBox(finR10to11, 11, 1, -0.75F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-2.0F, 0.75F, -0.5F);
        this.body4.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 41, 27, -2.25F, -0.51F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 44, 37, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 41, 40, -1.0F, 0.0F, 1.0F, 2, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -0.5F, 3.0F, 1, 0, 2, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.75F, 0.5F);
        this.body5.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 11, 10, 0.0F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, 0.25F, 0.75F);
        this.body5.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, 0.0F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 0, 32, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(1.0F, 0.15F, 1.5F);
        this.body5.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.7854F, 0.0F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 28, 28, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailL3 = new AdvancedModelRenderer(this);
        this.tailL3.setRotationPoint(1.0F, 0.05F, 2.5F);
        this.body5.addChild(tailL3);
        this.setRotateAngle(tailL3, 0.0F, -0.9599F, 0.0F);
        this.tailL3.cubeList.add(new ModelBox(tailL3, 20, 21, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.75F, 0.5F);
        this.body5.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 11, 2, -1.0F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, 0.25F, 0.75F);
        this.body5.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.0F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 14, 28, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-1.0F, 0.15F, 1.5F);
        this.body5.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.7854F, 0.0F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 0, 28, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.tailR3 = new AdvancedModelRenderer(this);
        this.tailR3.setRotationPoint(-1.0F, 0.05F, 2.75F);
        this.body5.addChild(tailR3);
        this.setRotateAngle(tailR3, 0.0F, 0.9599F, 0.0F);
        this.tailR3.cubeList.add(new ModelBox(tailR3, 20, 17, -7.0F, -0.01F, 0.0F, 7, 0, 4, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.5F, 0.75F, 0.0F);
        this.body3.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 18, 37, 0.0F, -0.5F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body3.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 19, 40, -0.5F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finL7to8 = new AdvancedModelRenderer(this);
        this.finL7to8.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body3.addChild(finL7to8);
        this.finL7to8.cubeList.add(new ModelBox(finL7to8, 0, 15, -0.9F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.5F, 0.75F, 0.0F);
        this.body3.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 36, 21, -3.0F, -0.51F, -1.0F, 4, 0, 2, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.5F, 0.75F, 1.5F);
        this.body3.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 19, 39, -2.5F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR7to8 = new AdvancedModelRenderer(this);
        this.finR7to8.setRotationPoint(-2.5F, 0.75F, 2.5F);
        this.body3.addChild(finR7to8);
        this.finR7to8.cubeList.add(new ModelBox(finR7to8, 33, 27, -2.1F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.frontfinL1 = new AdvancedModelRenderer(this);
        this.frontfinL1.setRotationPoint(2.5F, 0.75F, 0.5F);
        this.body1.addChild(frontfinL1);
        this.frontfinL1.cubeList.add(new ModelBox(frontfinL1, 11, 11, -0.25F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL3 = new AdvancedModelRenderer(this);
        this.frontfinL3.setRotationPoint(2.5F, 0.75F, 2.5F);
        this.body1.addChild(frontfinL3);
        this.frontfinL3.cubeList.add(new ModelBox(frontfinL3, 11, 3, -0.25F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.frontfinL2 = new AdvancedModelRenderer(this);
        this.frontfinL2.setRotationPoint(2.5F, 0.75F, 1.5F);
        this.body1.addChild(frontfinL2);
        this.frontfinL2.cubeList.add(new ModelBox(frontfinL2, 11, 9, -0.25F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.25F, -0.6F, -5.75F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.1745F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 27, 43, 1.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 35, 44, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.5F, -1.05F, -7.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.2618F, 0.0F, -1.5708F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 5, 41, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 38, -0.99F, -0.5F, -2.99F, 1, 1, 3, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-0.25F, 0.0F, -2.75F);
        this.appendageL.addChild(appendageL2);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 8, 36, -0.73F, -0.16F, -3.99F, 1, 1, 4, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.5F, -0.55F, -7.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, -0.5236F, 0.0F, -1.5708F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 36, 40, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 31, 39, -0.51F, -0.5F, -2.99F, 1, 1, 3, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 4, 0.25F, 0.5F, -2.4F, 0, 1, 1, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.25F, 0.0F, -2.75F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.6545F, 0.0F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 24, 37, -0.76F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 22, -0.77F, -0.41F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 28, 28, 0.01F, 0.5F, -3.5F, 0, 2, 4, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-0.25F, 0.0F, -3.75F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 1.0036F, 0.0F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 14, 37, -0.49F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 17, -0.5F, -0.25F, -3.99F, 1, 1, 4, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 28, 30, 0.25F, 0.25F, -3.85F, 0, 2, 4, 0.0F, false));

        this.appendageR4 = new AdvancedModelRenderer(this);
        this.appendageR4.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.appendageR3.addChild(appendageR4);
        this.setRotateAngle(appendageR4, 1.0472F, 0.0F, 0.0F);
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 0, 0, 0.26F, 0.5F, -1.65F, 0, 1, 1, 0.0F, false));
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 10, 13, -0.52F, 0.01F, -2.0F, 1, 1, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.75F, -0.55F, -6.0F);
        this.head.addChild(eyeR);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 13, 42, -3.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 43, 43, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
