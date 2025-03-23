package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelClarkeiteuthis extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended finL;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended finR;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended armb1;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended armb6;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended armb2;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended armb7;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended armb3;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended armb8;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended armb4;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended armb9;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended armb5;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended armb10;

    public ModelClarkeiteuthis() {
        this.textureWidth = 78;
        this.textureHeight = 70;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 10, -2.5F, -5.75F, -1.75F, 5, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 12, -3.0F, -6.0F, 1.25F, 6, 5, 18, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 40, -2.0F, -5.0F, 21.25F, 4, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 48, -1.0F, -4.5F, 24.25F, 2, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 18, -2.5F, -5.5F, 19.25F, 5, 4, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 18, 2.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, 2.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 35, -2.0F, -2.25F, -1.74F, 4, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.65F, -4.15F, 1, 1, 4, 0.0F, false));

        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(2.25F, -4.0F, 22.0F);
        this.body.addChild(finL);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.25F, 0.0F, 2.25F);
        this.finL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.25F, 0.0F, -7.5F, 4, 0, 10, 0.0F, true));

        this.finR = new AdvancedModelRendererExtended(this);
        this.finR.setRotationPoint(-2.25F, -4.0F, 22.0F);
        this.body.addChild(finR);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.25F, 0.0F, 2.25F);
        this.finR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.75F, 0.0F, -7.5F, 4, 0, 10, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.65F, -5.15F, -1.75F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, 0.0F, 0.1745F);
        this.arm1.cubeList.add(new ModelBox(arm1, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));

        this.armb1 = new AdvancedModelRendererExtended(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 10, 11, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-0.65F, -5.15F, -1.75F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.0F, -0.1745F);
        this.arm6.cubeList.add(new ModelBox(arm6, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));

        this.armb6 = new AdvancedModelRendererExtended(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 10, 11, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(1.85F, -4.6F, -1.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.7854F);
        this.arm2.cubeList.add(new ModelBox(arm2, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));

        this.armb2 = new AdvancedModelRendererExtended(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 10, 11, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(-1.85F, -4.6F, -1.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, -0.7854F);
        this.arm7.cubeList.add(new ModelBox(arm7, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));

        this.armb7 = new AdvancedModelRendererExtended(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 10, 11, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(2.1F, -3.4F, -1.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));

        this.armb3 = new AdvancedModelRendererExtended(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 10, 11, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-2.1F, -3.4F, -1.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));

        this.armb8 = new AdvancedModelRendererExtended(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 10, 11, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(1.85F, -2.2F, -1.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, 2.3562F);
        this.arm4.cubeList.add(new ModelBox(arm4, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));

        this.armb4 = new AdvancedModelRendererExtended(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 10, 11, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(-1.85F, -2.2F, -1.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, -2.3562F);
        this.arm9.cubeList.add(new ModelBox(arm9, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));

        this.armb9 = new AdvancedModelRendererExtended(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 10, 11, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(0.65F, -1.65F, -1.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 2.9671F);
        this.arm5.cubeList.add(new ModelBox(arm5, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, false));

        this.armb5 = new AdvancedModelRendererExtended(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 10, 11, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(-0.65F, -1.65F, -1.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, -2.9671F);
        this.arm10.cubeList.add(new ModelBox(arm10, 18, 10, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 40, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 40, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 40, 0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 40, -0.25F, -0.25F, -4.0F, 0, 1, 1, 0.0F, true));

        this.armb10 = new AdvancedModelRendererExtended(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 10, 11, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, 0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, -0.25F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, 0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, -0.25F, -0.25F, -3.0F, 0, 1, 1, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, 0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 40, -0.25F, -0.25F, -5.0F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(body, 1.55F, 0.0F, 0.0F);
        this.body.offsetY = -0.18F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = -0.35F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(finL, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(finR, 0.0F, 0.0F, 0.9F);
        this.body.offsetY = -0.5F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(finL, 0.0F, 0.3F, 0.3F);
        this.setRotateAngle(finR, 0.0F, 0.3F, -0.3F);
        this.body.offsetY = 0.09F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.6F;
        this.body.offsetX = 0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.8F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(finL, 0.0F, 0.3F, 0.3F);
        this.setRotateAngle(finR, 0.0F, 0.3F, -0.3F);
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
        //this.body.offsetY = 1.3F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        this.body.offsetZ = 0.5F;

        AdvancedModelRendererExtended[] tentacle1 = {this.arm1, this.armb1};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.armb2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.armb3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.armb4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.armb5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.armb6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.armb7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.armb8};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9, this.armb9};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10, this.armb10};


        float speed = 0.13F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        float degreeTentacle =0.1F;

        this.chainWave(tentacle1, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle2, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle3, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle4, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle5, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle6, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle7, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle8, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle9, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle10, speed, degreeTentacle, 0, f2, 1F);
        this.swing(finL, (float) (speed), 0.15F, true, 0, 0, f2, 1);
        this.swing(finR, (float) (speed), 0.15F, true, 0, 0, f2, 1);



        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bobExtended(body, bobSpeed, 0.5F, false, 0.1F, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.50F, false, 3, f2, 1) + 1.25F;
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.25F;
        }

    }

}
