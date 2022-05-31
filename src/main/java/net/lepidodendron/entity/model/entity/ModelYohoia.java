package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYohoia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer finfR2;
    private final AdvancedModelRenderer finfR;
    private final AdvancedModelRenderer finfL;
    private final AdvancedModelRenderer finfL2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;

    public ModelYohoia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 10, 0, -1.49F, -5.0F, -7.0F, 3, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.25F, -7.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 10, -1.0F, -0.5F, -0.75F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.25F, -7.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 18, 0.0F, -0.5F, -0.75F, 1, 1, 1, 0.0F, false));

        this.finfR2 = new AdvancedModelRenderer(this);
        this.finfR2.setRotationPoint(-1.5F, -2.0F, -4.5F);
        this.body.addChild(finfR2);
        this.setRotateAngle(finfR2, 0.0F, 0.0F, -0.5236F);
        this.finfR2.cubeList.add(new ModelBox(finfR2, 8, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finfR = new AdvancedModelRenderer(this);
        this.finfR.setRotationPoint(-1.5F, -2.0F, -5.5F);
        this.body.addChild(finfR);
        this.setRotateAngle(finfR, 0.0F, 0.0F, -0.5236F);
        this.finfR.cubeList.add(new ModelBox(finfR, 6, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finfL = new AdvancedModelRenderer(this);
        this.finfL.setRotationPoint(1.5F, -2.0F, -5.5F);
        this.body.addChild(finfL);
        this.setRotateAngle(finfL, 0.0F, 0.0F, 0.5236F);
        this.finfL.cubeList.add(new ModelBox(finfL, 6, 4, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finfL2 = new AdvancedModelRenderer(this);
        this.finfL2.setRotationPoint(1.5F, -2.0F, -4.5F);
        this.body.addChild(finfL2);
        this.setRotateAngle(finfL2, 0.0F, 0.0F, 0.5236F);
        this.finfL2.cubeList.add(new ModelBox(finfL2, 8, 2, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, -2.75F, -6.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -2.75F, -5.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -2.75F, -4.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, -2.75F, -6.5F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -2.75F, -5.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, -2.75F, -4.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.0F, -3.75F, -6.25F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, -0.2618F, -0.1745F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 4, 0.0F, 0.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.0F, -3.75F, -6.25F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, -0.2618F, 0.1745F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 0, 0.0F, 0.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.75F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-1.5F, 1.0F, 0.5F);
        this.body2.addChild(finR);
        this.setRotateAngle(finR, 0.0F, 0.0F, -0.7854F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 3, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.5F, 1.0F, 1.5F);
        this.body2.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, 0.0F, -0.7854F);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 3, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body2.addChild(finL);
        this.setRotateAngle(finL, 0.0F, 0.0F, 0.7854F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body2.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, 0.0F, 0.7854F);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, 1.0F, 0.5F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 1.0F, 1.5F);
        this.body2.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, 1.0F, 0.5F);
        this.body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, 1.0F, 1.5F);
        this.body2.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 14, -1.49F, -1.01F, 0.0F, 3, 2, 2, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.75F, 1.0F, 0.5F);
        this.body3.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.1745F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.75F, 1.0F, 1.5F);
        this.body3.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, 1.0F, 0.5F);
        this.body3.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.1745F);
        this.legL6.cubeList.add(new ModelBox(legL6, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, 1.0F, 1.5F);
        this.body3.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-1.5F, 1.0F, 0.5F);
        this.body3.addChild(finR3);
        this.setRotateAngle(finR3, 0.0F, 0.0F, -0.7854F);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 3, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-1.5F, 1.0F, 1.5F);
        this.body3.addChild(finR4);
        this.setRotateAngle(finR4, 0.0F, 0.0F, -0.7854F);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 3, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body3.addChild(finL3);
        this.setRotateAngle(finL3, 0.0F, 0.0F, 0.7854F);
        this.finL3.cubeList.add(new ModelBox(finL3, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body3.addChild(finL4);
        this.setRotateAngle(finL4, 0.0F, 0.0F, 0.7854F);
        this.finL4.cubeList.add(new ModelBox(finL4, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.75F, 1.0F, 0.5F);
        this.body4.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.1745F);
        this.legL8.cubeList.add(new ModelBox(legL8, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.75F, 1.0F, 0.5F);
        this.body4.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.1745F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.75F, 1.0F, 1.5F);
        this.body4.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.1745F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.75F, 1.0F, 1.5F);
        this.body4.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, -0.1745F);
        this.legL9.cubeList.add(new ModelBox(legL9, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-1.5F, 1.0F, 0.5F);
        this.body4.addChild(finR5);
        this.setRotateAngle(finR5, 0.0F, 0.0F, -0.7854F);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 3, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-1.5F, 1.0F, 1.5F);
        this.body4.addChild(finR6);
        this.setRotateAngle(finR6, 0.0F, 0.0F, -0.7854F);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 3, -2.75F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body4.addChild(finL5);
        this.setRotateAngle(finL5, 0.0F, 0.0F, 0.7854F);
        this.finL5.cubeList.add(new ModelBox(finL5, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body4.addChild(finL6);
        this.setRotateAngle(finL6, 0.0F, 0.0F, 0.7854F);
        this.finL6.cubeList.add(new ModelBox(finL6, 0, 4, -0.25F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 10, -1.49F, -1.01F, 0.0F, 3, 2, 2, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.75F, 1.0F, 0.5F);
        this.body5.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, 0.1745F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.75F, 1.0F, 1.5F);
        this.body5.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, 0.1745F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.75F, 1.0F, 0.5F);
        this.body5.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, -0.1745F);
        this.legL10.cubeList.add(new ModelBox(legL10, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.75F, 1.0F, 1.5F);
        this.body5.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, -0.1745F);
        this.legL11.cubeList.add(new ModelBox(legL11, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body5.addChild(finL7);
        this.setRotateAngle(finL7, 0.0F, 0.0F, 0.7854F);
        this.finL7.cubeList.add(new ModelBox(finL7, 0, 4, -0.5F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body5.addChild(finL8);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 0.7854F);
        this.finL8.cubeList.add(new ModelBox(finL8, 0, 4, -0.75F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.5F, 1.0F, 0.5F);
        this.body5.addChild(finR7);
        this.setRotateAngle(finR7, 0.0F, 0.0F, -0.7854F);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 3, -2.5F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.5F, 1.0F, 1.5F);
        this.body5.addChild(finR8);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -0.7854F);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 3, -2.25F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 17, 6, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.75F, 1.0F, 0.5F);
        this.body6.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0F, -0.1745F);
        this.legL12.cubeList.add(new ModelBox(legL12, 10, 6, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.75F, 1.0F, 0.5F);
        this.body6.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.0F, 0.1745F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 0, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body6.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 0.7854F);
        this.finL9.cubeList.add(new ModelBox(finL9, 0, 4, -1.0F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.5F, 1.0F, 0.5F);
        this.body6.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -0.7854F);
        this.finR9.cubeList.add(new ModelBox(finR9, 0, 3, -2.0F, -0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 10, 6, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 0, -1.5F, 0.0F, 1.0F, 3, 0, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 8, 0, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.16F);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.262F;

        AdvancedModelRenderer[] BodyF = {this.body4, this.body5, this.body6, this.body7, this.body8};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float feedModifier = 1;
            if (f3 == 0.0) {
                feedModifier = 0.15F;
            }

            float tailVdegree = 0.016F;
            float tailHdegree = 0.025F;
            float degreeFin = 0.22F * feedModifier;
            this.chainWave(BodyF, speed * feedModifier, tailVdegree, -3, f2, 0.4F);
            this.chainSwing(BodyF, speed*  feedModifier, tailHdegree, -2.5, f2, 0.5F);

            this.flap(armL, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(armR, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(armL, 0.3F, 0.1F, false, 2f, -0.1f, f2, 1F);
            this.walk(armR, 0.3F, 0.1F, false, 2f, 0.1f, f2, 1F);

            this.flap(finL9, 0.5F, -degreeFin, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finR9, 0.5F, degreeFin, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finL8, 0.5F, -degreeFin, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(finL7, 0.5F, -degreeFin, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(finL, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(finR, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);

            float speedLeg = 2.1F * feedModifier;
            float degreeLeg = 0.2F;
            this.flap(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(legL10, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(legR10, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(legL11, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(legR11, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(legL12, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(legR12, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);

            if (!e.isInWater()) {
                this.bob(body, -speed * 1.5F, 1.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(body, -speed, 0.075F, false, f2, 2);
                }
            }
        }
    }
}