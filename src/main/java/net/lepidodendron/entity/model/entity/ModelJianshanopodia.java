package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJianshanopodia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJianshanopodia extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone2;
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
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
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
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer bodys;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer bodys2;
    private final AdvancedModelRenderer legsL2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legsR2;

    private ModelAnimator animator;

    public ModelJianshanopodia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.1F, -1.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.99F, -2.36F, -7.0F, 4, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 22, -0.5F, -1.34F, -7.0F, 1, 0, 1, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.9F, -1.7F, -5.65F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, 0.2182F, 0.1309F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 11, -0.2521F, -0.5426F, -1.0F, 2, 1, 2, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(1.4979F, -0.0326F, 0.5F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.0F, 0.2618F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 18, 15, 0.05F, -0.5F, -1.51F, 2, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 19, 5, 1.75F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 10, 15, 1.25F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 6, 15, 0.75F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 18, 8, 0.04F, -0.49F, -0.76F, 2, 1, 1, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(1.75F, -0.5F, -0.25F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.0F, 0.2618F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 11, 18, 0.0F, 0.02F, -1.01F, 2, 1, 1, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 19, 1, 0.85F, 0.02F, -1.66F, 0, 1, 1, 0.0F, false));
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 16, 1.35F, 0.02F, -1.66F, 0, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.85F, 0.6F, -1.0F);
        this.appendageL3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, -0.2F, -0.58F, -1.66F, 0, 1, 2, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.8F, 0.5F, -0.5F);
        this.appendageL3.addChild(bone);
        this.setRotateAngle(bone, 0.0F, -0.1745F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.9F, -1.7F, -5.65F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, -0.2182F, -0.1309F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 8, 10, -1.7479F, -0.5426F, -1.0F, 2, 1, 2, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(-1.4979F, -0.0326F, 0.5F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.0F, -0.2618F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 12, 16, -2.05F, -0.5F, -1.51F, 2, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 5, -1.75F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 4, -1.25F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 3, -0.75F, -0.5F, -2.01F, 0, 1, 1, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 14, 10, -2.04F, -0.49F, -0.76F, 2, 1, 1, 0.0F, false));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-1.75F, -0.5F, -0.25F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.0F, -0.2618F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 14, 2, -2.0F, 0.02F, -1.01F, 2, 1, 1, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 1, -0.85F, 0.02F, -1.66F, 0, 1, 1, 0.0F, false));
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 0, -1.35F, 0.02F, -1.66F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.85F, 0.6F, -1.0F);
        this.appendageR3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 9, 0.2F, -0.58F, -1.66F, 0, 1, 2, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-1.8F, 0.5F, -0.5F);
        this.appendageR3.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.1745F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 4, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.35F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.3054F);
        this.legL.cubeList.add(new ModelBox(legL, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.3054F);
        this.legR.cubeList.add(new ModelBox(legR, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.3054F);
        this.legL2.cubeList.add(new ModelBox(legL2, 10, 4, -0.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.3054F);
        this.legR2.cubeList.add(new ModelBox(legR2, 8, 8, -3.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.3054F);
        this.legL3.cubeList.add(new ModelBox(legL3, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.3054F);
        this.legR3.cubeList.add(new ModelBox(legR3, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 10, 4, -0.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 8, 8, -3.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.3054F);
        this.legL5.cubeList.add(new ModelBox(legL5, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.3054F);
        this.legR5.cubeList.add(new ModelBox(legR5, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.3054F);
        this.legL6.cubeList.add(new ModelBox(legL6, 10, 4, -0.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.3054F);
        this.legR6.cubeList.add(new ModelBox(legR6, 8, 8, -3.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.3054F);
        this.legL7.cubeList.add(new ModelBox(legL7, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.3054F);
        this.legR7.cubeList.add(new ModelBox(legR7, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(2.0F, 0.25F, 0.75F);
        this.body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.3054F);
        this.legL8.cubeList.add(new ModelBox(legL8, 10, 4, -0.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 20, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-2.0F, 0.25F, 0.75F);
        this.body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.3054F);
        this.legR8.cubeList.add(new ModelBox(legR8, 8, 8, -3.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 6, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.75F, 0.25F, 0.75F);
        this.body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.3054F);
        this.legL9.cubeList.add(new ModelBox(legL9, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.75F, 0.25F, 0.75F);
        this.body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.3054F);
        this.legR9.cubeList.add(new ModelBox(legR9, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.5F, 0.25F, 0.75F);
        this.body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.3054F);
        this.legL10.cubeList.add(new ModelBox(legL10, 10, 4, -0.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL10.cubeList.add(new ModelBox(legL10, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-1.5F, 0.25F, 0.75F);
        this.body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.3054F);
        this.legR10.cubeList.add(new ModelBox(legR10, 8, 8, -3.5F, -0.01F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 10, 6, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 19, 0, -0.01F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 0, 19, -1.99F, 0.01F, 0.75F, 2, 1, 1, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(1.25F, 0.25F, 0.75F);
        this.body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.3054F);
        this.legL11.cubeList.add(new ModelBox(legL11, 10, 4, -0.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 6, 20, 2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 15, 3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 20, 4, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 4, 15, 3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 4, 20, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 2, 20, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-1.25F, 0.25F, 0.75F);
        this.body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.3054F);
        this.legR11.cubeList.add(new ModelBox(legR11, 8, 8, -3.5F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 10, 14, -2.5F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 6, 11, -3.4F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 11, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 10, -3.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 8, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 7, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));

        this.bodys = new AdvancedModelRenderer(this);
        this.bodys.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body11.addChild(bodys);
        this.bodys.cubeList.add(new ModelBox(bodys, 0, 8, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(1.5F, 0.4F, 0.75F);
        this.bodys.addChild(legsL);
        this.setRotateAngle(legsL, 0.0F, 0.0F, 0.3054F);
        this.legsL.cubeList.add(new ModelBox(legsL, 10, 4, -1.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 19, 18, 2.5F, 0.0F, -0.2F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 18, 19, 2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 16, 19, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 14, 19, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legsL.cubeList.add(new ModelBox(legsL, 19, 13, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(-1.5F, 0.4F, 0.75F);
        this.bodys.addChild(legsR);
        this.setRotateAngle(legsR, 0.0F, 0.0F, -0.3054F);
        this.legsR.cubeList.add(new ModelBox(legsR, 8, 8, -3.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 12, 19, -2.5F, 0.0F, -0.2F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 10, 19, -2.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 19, 9, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 8, 19, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legsR.cubeList.add(new ModelBox(legsR, 6, 19, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.bodys2 = new AdvancedModelRenderer(this);
        this.bodys2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bodys.addChild(bodys2);
        this.bodys2.cubeList.add(new ModelBox(bodys2, 11, 0, -1.51F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
        this.bodys2.cubeList.add(new ModelBox(bodys2, 5, 18, -0.52F, 0.01F, 0.5F, 2, 1, 1, 0.0F, false));
        this.bodys2.cubeList.add(new ModelBox(bodys2, 19, 3, -1.48F, 0.01F, 0.5F, 1, 1, 1, 0.0F, false));

        this.legsL2 = new AdvancedModelRenderer(this);
        this.legsL2.setRotationPoint(1.5F, 0.5F, 0.8F);
        this.bodys2.addChild(legsL2);
        this.setRotateAngle(legsL2, 0.0F, 0.0F, 0.4363F);
        this.legsL2.cubeList.add(new ModelBox(legsL2, 7, 13, -1.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legsL2.cubeList.add(new ModelBox(legsL2, 17, 18, 1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legsL2.cubeList.add(new ModelBox(legsL2, 17, 13, 1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legsL2.cubeList.add(new ModelBox(legsL2, 10, 17, 0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 1.4F);
        this.bodys2.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.25F, 0.25F, 0.65F);
        this.bodys2.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.3491F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 15, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.25F, 0.25F, 0.65F);
        this.bodys2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2182F, -0.3491F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 13, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, false));

        this.legsR2 = new AdvancedModelRenderer(this);
        this.legsR2.setRotationPoint(-1.5F, 0.5F, 0.8F);
        this.bodys2.addChild(legsR2);
        this.setRotateAngle(legsR2, 0.0F, 0.0F, -0.4363F);
        this.legsR2.cubeList.add(new ModelBox(legsR2, 0, 14, -2.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.legsR2.cubeList.add(new ModelBox(legsR2, 17, 7, -1.5F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.legsR2.cubeList.add(new ModelBox(legsR2, 16, 11, -1.0F, 0.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.legsR2.cubeList.add(new ModelBox(legsR2, 4, 16, -0.5F, 0.0F, 0.2F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.head.render(f5 * 0.15F);
        this.head.render(f5 * 0.2F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.render(0.013F);
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
        //this.head.offsetY = 1.275F;
        this.head.offsetY = 1.19F;

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11};
        AdvancedModelRenderer[] antennaL = {this.appendageL, this.appendageL2, this.appendageL3};
        AdvancedModelRenderer[] antennaR = {this.appendageR, this.appendageR2, this.appendageR3};
        AdvancedModelRenderer[] bodyF = {this.body4, this.body5, this.body6, this.body7};
        AdvancedModelRenderer[] bodyA = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.bodys};
        AdvancedModelRenderer[] bodyB = {this.bodys2, this.tail};

        EntityPrehistoricFloraJianshanopodia ee = (EntityPrehistoricFloraJianshanopodia) e;

        if (f3 != 0.0  && ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(legsL, 0.14F, 0.18F, -3, f2, 1);
            this.chainWave(legsR, 0.35F, 0.18F, -3, f2, 1);
            float legDegree = 0.36F;
            float legSpeed = 0.28F;
            this.flap(legL, legSpeed, -legDegree, false, 0, -legDegree, f2, 0.3F);
            this.flap(legR, legSpeed, legDegree, false, 0, legDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legL5, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legL6, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legR6, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legL7, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(legR7, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(legL8, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legR8, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legL9, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legR9, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legL10, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legR10, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legL11, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legR11, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);

            this.bob(head, 1F, 0.05F, false, f2, 1);
            //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
            this.chainWave(bodyF, 0.4F, 0.015f, 0.2, f2, 0.4F);
            this.chainSwing(bodyA, 0.08F, 0.015f, 0.25, f2, 0.25F);
            this.chainSwing(bodyF, 0.08F, 0.03F, -1, f2, 0.5F);
            this.chainWave(bodyB, 0.3F, 0.1f, 0.2, f2, 0.25F);
            this.chainSwing(bodyB, 0.3F, 0.2f, 0.25, f2, 0.4F);
        }

        this.chainSwing(antennaL, 0.12F, -0.15F, 0.3F, f2, 0.7F);
        this.chainSwing(antennaR, 0.12F, 0.15F, 0.3F, f2, 0.7F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraJianshanopodia e = (EntityPrehistoricFloraJianshanopodia) entity;
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
