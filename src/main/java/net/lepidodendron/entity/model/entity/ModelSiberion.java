package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSiberion;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSiberion extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer bodys;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;

    private ModelAnimator animator;

    public ModelSiberion() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -3.01F, -7.0F, 5, 2, 3, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-2.0F, -1.9F, -5.65F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, -0.6981F, -0.1309F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 5, -2.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 17, 18, -2.1F, -1.0F, -2.0F, 1, 2, 1, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(-2.5F, -0.5F, 1.0F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.0F, -0.2182F, -0.1745F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 16, 6, -2.05F, 0.0F, -2.01F, 2, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 19, 13, -1.75F, 0.0F, -3.01F, 1, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 16, 2, -2.04F, 0.01F, -1.26F, 2, 1, 1, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-2.0F, 0.0F, -0.75F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.0F, -0.2182F, -0.0873F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 15, 4, -2.0F, 0.0F, -1.01F, 2, 1, 1, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 19, 10, -1.6F, 0.0F, -2.01F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.appendageR3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 23, -1.25F, 0.0F, -0.5F, 1, 1, 0, 0.0F, true));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(2.0F, -1.9F, -5.65F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, 0.6981F, 0.1309F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 8, 7, -0.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 19, 1.1F, -1.0F, -2.0F, 1, 2, 1, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(2.5F, -0.5F, 1.0F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.0F, 0.2182F, 0.1745F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 18, 8, 0.05F, 0.0F, -2.01F, 2, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 4, 20, 0.75F, 0.0F, -3.01F, 1, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 12, 17, 0.04F, 0.01F, -1.26F, 2, 1, 1, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(2.0F, 0.0F, -0.75F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.0F, 0.2182F, 0.0873F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 5, 18, 0.0F, 0.0F, -1.01F, 2, 1, 1, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 19, 16, 0.6F, 0.0F, -2.01F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.appendageL3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 23, 0.25F, 0.0F, -0.5F, 1, 1, 0, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.4363F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.4363F);
        this.legR.cubeList.add(new ModelBox(legR, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 11, -2.0F, -0.76F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -0.01F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 7, 15, -1.99F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 14, 0.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 11, 2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 8, 20, 2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 3, 1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 14, 19, 1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 7, 19, 0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 0, -3.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 15, 18, -2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 18, -2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 18, 9, -1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 3, 18, -1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 17, 16, -0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.4363F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.4363F);
        this.legR3.cubeList.add(new ModelBox(legR3, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 11, -2.0F, -0.76F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, -0.01F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 7, 15, -1.99F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.4363F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.4363F);
        this.legR5.cubeList.add(new ModelBox(legR5, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 11, -2.0F, -0.76F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 16, -0.01F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 7, 15, -1.99F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.4363F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 14, 0.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 20, 11, 2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 8, 20, 2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 20, 3, 1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 14, 19, 1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 7, 19, 0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.4363F);
        this.legR6.cubeList.add(new ModelBox(legR6, 13, 0, -3.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 15, 18, -2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 13, 18, -2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 18, 9, -1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 3, 18, -1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 17, 16, -0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.4363F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.4363F);
        this.legR7.cubeList.add(new ModelBox(legR7, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 11, -2.0F, -0.76F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 0, 16, -0.01F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 7, 15, -1.99F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.4363F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.4363F);
        this.legR9.cubeList.add(new ModelBox(legR9, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 11, -2.0F, -0.76F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 0, 16, -0.01F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 7, 15, -1.99F, -0.75F, 0.75F, 2, 2, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 11, -2.0F, -0.75F, 0.0F, 4, 2, 1, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 0, 16, -0.01F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 7, 15, -1.99F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));

        this.bodys = new AdvancedModelRenderer(this);
        this.bodys.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body11.addChild(bodys);
        this.bodys.cubeList.add(new ModelBox(bodys, 12, 11, -1.5F, -0.75F, 0.0F, 3, 2, 1, 0.0F, false));
        this.bodys.cubeList.add(new ModelBox(bodys, 14, 14, -0.51F, -0.74F, 0.75F, 2, 2, 1, 0.0F, false));
        this.bodys.cubeList.add(new ModelBox(bodys, 10, 19, -1.49F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(1.5F, 0.25F, 0.75F);
        this.bodys.addChild(legsL);
        this.setRotateAngle(legsL, 0.0F, 0.0F, 0.4363F);
        this.legsL.cubeList.add(new ModelBox(legsL, 0, 9, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 10, 17, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 16, 7, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 5, 15, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 15, 1, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 12, 14, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 1.15F);
        this.bodys.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 7, 11, -0.5F, -0.25F, 0.0F, 1, 1, 3, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(-1.5F, 0.25F, 0.75F);
        this.bodys.addChild(legsR);
        this.setRotateAngle(legsR, 0.0F, 0.0F, -0.4363F);
        this.legsR.cubeList.add(new ModelBox(legsR, 8, 5, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 13, 1, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 0, 5, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 0, 4, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 0, 1, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 0, 0, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.4363F);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 14, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 20, 11, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 8, 20, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 20, 3, 1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 14, 19, 1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 7, 19, 0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.4363F);
        this.legR11.cubeList.add(new ModelBox(legR11, 13, 0, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 15, 18, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 13, 18, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 18, 9, -1.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 3, 18, -1.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 17, 16, -0.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.4363F);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 14, 0.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 20, 11, 2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 8, 20, 2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 20, 3, 1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 14, 19, 1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 7, 19, 0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.4363F);
        this.legR10.cubeList.add(new ModelBox(legR10, 13, 0, -3.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 15, 18, -2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 13, 18, -2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 18, 9, -1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 3, 18, -1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 17, 16, -0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.4363F);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 14, 0.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 20, 11, 2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 8, 20, 2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 20, 3, 1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 14, 19, 1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 7, 19, 0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.4363F);
        this.legR8.cubeList.add(new ModelBox(legR8, 13, 0, -3.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 15, 18, -2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 13, 18, -2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 18, 9, -1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 3, 18, -1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 17, 16, -0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.4363F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 14, 0.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 11, 2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 8, 20, 2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 3, 1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 14, 19, 1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 7, 19, 0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.4363F);
        this.legR4.cubeList.add(new ModelBox(legR4, 13, 0, -3.0F, -0.01F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 15, 18, -2.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 13, 18, -2.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 18, 9, -1.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 3, 18, -1.0F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 17, 16, -0.5F, -0.01F, -0.1F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.head.render(f5 * 0.2F);
        this.head.render(f5 * 0.15F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.head.render(0.01F);
        //GlStateManager.enableCull();
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
        //this.head.offsetY = 1.075F;
        this.head.offsetY = 1.275F;

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11};
        AdvancedModelRenderer[] antennaL = {this.appendageL, this.appendageL2, this.appendageL3};
        AdvancedModelRenderer[] antennaR = {this.appendageR, this.appendageR2, this.appendageR3};
        AdvancedModelRenderer[] bodyF = {this.body4, this.body5, this.body6, this.body7};
        AdvancedModelRenderer[] bodyA = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.bodys};

        EntityPrehistoricFloraSiberion ee = (EntityPrehistoricFloraSiberion) e;

        if (f3 != 0.0  && ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.3F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.3F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.3F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.3F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.3F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.3F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL10, 0.3F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR10, 0.3F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL11, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR11, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            this.bob(head, 1F, 0.05F, false, f2, 1);
            //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
            this.chainWave(bodyF, 0.4F, 0.02f, 0.2, f2, 0.4F);
            this.chainSwing(bodyA, 0.08F, 0.02f, 0.25, f2, 0.25F);
            this.chainSwing(bodyF, 0.08F, 0.05F, -1, f2, 0.5F);
        }

        this.chainSwing(antennaL, 0.12F, -0.15F, 0.3F, f2, 0.7F);
        this.chainSwing(antennaR, 0.12F, 0.15F, 0.3F, f2, 0.7F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSiberion e = (EntityPrehistoricFloraSiberion) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.body6, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.head, 0,-3F,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(14);
        animator.rotate(this.body6, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.head, 0,-3F,0);
        animator.rotate(this.body2, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(29);
        animator.rotate(this.body6, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.head, 0,-3F,0);
        animator.rotate(this.body2, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(15);
    }
}
