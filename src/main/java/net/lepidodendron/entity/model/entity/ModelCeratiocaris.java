package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCeratiocaris extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;

    public ModelCeratiocaris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -8.2F, -4.7F, 3, 4, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 0, -0.5F, -8.2F, -5.7F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 11, -1.0F, -7.75F, -4.0F, 2, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 11, -1.375F, -7.5F, -5.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 11, 0.375F, -7.5F, -5.0F, 1, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -7.5F, 2.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 14, -1.0F, -0.25F, 0.0F, 2, 2, 1, -0.01F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.75F, 1.75F, 0.5F);
        this.body2.addChild(legR10);
        this.setRotateAngle(legR10, 0.6109F, 0.0873F, 0.0F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.75F, 1.75F, 0.5F);
        this.body2.addChild(legL10);
        this.setRotateAngle(legL10, 0.6109F, -0.0873F, 0.0F);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 3, -0.5F, 0.25F, -0.1F, 1, 1, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.25F, 2.0F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 0, 0.0F, -0.45F, -2.1F, 1, 1, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.5F, 1.25F, 0.25F);
        this.body3.addChild(legR11);
        this.setRotateAngle(legR11, 0.6109F, 0.0873F, 0.0873F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 0, -0.5F, -0.25F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.5F, 1.25F, 0.25F);
        this.body3.addChild(legL11);
        this.setRotateAngle(legL11, 0.6109F, -0.0873F, -0.0873F);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 0, -0.5F, -0.25F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.5F, 1.25F, 1.0F);
        this.body3.addChild(legR12);
        this.setRotateAngle(legR12, 0.6109F, 0.0873F, 0.1309F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.5F, 1.25F, 1.0F);
        this.body3.addChild(legL12);
        this.setRotateAngle(legL12, 0.6109F, -0.0873F, -0.1309F);
        this.legL12.cubeList.add(new ModelBox(legL12, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 1.85F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1309F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 11, 11, -0.5F, -0.25F, -0.7F, 1, 1, 2, -0.01F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.5F, 0.75F, 0.15F);
        this.body4.addChild(legR13);
        this.setRotateAngle(legR13, 0.6109F, 0.0873F, 0.1745F);
        this.legR13.cubeList.add(new ModelBox(legR13, 0, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.5F, 0.75F, 0.15F);
        this.body4.addChild(legL13);
        this.setRotateAngle(legL13, 0.6109F, -0.0873F, -0.1745F);
        this.legL13.cubeList.add(new ModelBox(legL13, 0, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1745F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 11, -0.5F, -0.25F, -0.05F, 1, 1, 3, -0.02F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 11, -0.5F, -0.15F, 2.85F, 1, 0, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 0.15F, 2.9F);
        this.body5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 1, -0.65F, -0.05F, -0.05F, 1, 0, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.25F, 0.15F, 2.9F);
        this.body5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 1, -0.35F, -0.05F, -0.05F, 1, 0, 4, 0.0F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.25F, -6.25F, -4.0F);
        this.body.addChild(AntennaR);
        this.setRotateAngle(AntennaR, 0.3491F, 0.3054F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 15, 0.0F, -1.5F, -5.0F, 0, 4, 5, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.25F, -6.25F, -4.0F);
        this.body.addChild(AntennaL);
        this.setRotateAngle(AntennaL, 0.3491F, -0.3054F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 15, 0.0F, -1.5F, -5.0F, 0, 4, 5, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, -4.75F, -3.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.3491F, 0.2618F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, 0.0F, -0.25F, -3.0F, 0, 4, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, -4.75F, -3.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, -0.2618F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, -0.25F, -3.0F, 0, 4, 3, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -4.75F, -2.75F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.6109F, 0.0873F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, -4.75F, -2.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.6109F, 0.0873F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, -4.75F, -1.75F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.6109F, 0.0873F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, -4.75F, -1.25F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.6109F, 0.0873F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.75F, -4.75F, -0.75F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.6109F, 0.0873F, 0.0F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.75F, -4.75F, -0.25F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.6109F, 0.0873F, 0.0F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.75F, -4.75F, 0.25F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.6109F, 0.0873F, 0.0F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.75F, -5.25F, 2.0F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.6109F, 0.0873F, 0.0F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.75F, -5.25F, 2.0F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, 0.6109F, -0.0873F, 0.0F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -4.75F, -2.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.6109F, -0.0873F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -4.75F, -2.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.6109F, -0.0873F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, -4.75F, -1.75F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.6109F, -0.0873F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, -4.75F, -1.25F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.6109F, -0.0873F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, -4.75F, -0.75F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.6109F, -0.0873F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, -4.75F, -0.25F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.6109F, -0.0873F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.75F, -4.75F, 0.25F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.6109F, -0.0873F, 0.0F);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(legR10, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legL10, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(body3, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(legR11, 0.6109F, 0.0873F, 0.0873F);
        this.setRotateAngle(legL11, 0.6109F, -0.0873F, -0.0873F);
        this.setRotateAngle(legR12, 0.6109F, 0.0873F, 0.1309F);
        this.setRotateAngle(legL12, 0.6109F, -0.0873F, -0.1309F);
        this.setRotateAngle(body4, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(legR13, 0.6109F, 0.0873F, 0.1745F);
        this.setRotateAngle(legL13, 0.6109F, -0.0873F, -0.1745F);
        this.setRotateAngle(body5, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.2618F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, -0.4363F, 0.0F);
        this.setRotateAngle(AntennaR, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(AntennaL, 0.3491F, -0.3054F, 0.0F);
        this.setRotateAngle(legR, -0.3491F, 0.2618F, 0.0F);
        this.setRotateAngle(legL, 0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(legR2, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR3, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR4, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR5, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR6, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR7, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR8, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legR9, 0.6109F, 0.0873F, 0.0F);
        this.setRotateAngle(legL9, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL2, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL3, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL4, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL5, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL6, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL7, 0.6109F, -0.0873F, 0.0F);
        this.setRotateAngle(legL8, 0.6109F, -0.0873F, 0.0F);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
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
        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.body3, this.body4, this.body5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(AntennaL, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(AntennaR, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(AntennaL, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(AntennaR, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.01F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
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
            this.flap(legL13, speedLeg, -degreeLeg, false, 6F, -0.5F, f2, 0.7F);
            this.flap(legR13, speedLeg, degreeLeg, false, 6F, 0.5F, f2, 0.7F);

                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
