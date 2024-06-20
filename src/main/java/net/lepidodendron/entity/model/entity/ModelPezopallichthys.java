package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPezopallichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelPezopallichthys() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.4F, -5.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -0.4F, 0.0F, 2, 4, 5, 0.015F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 0, -1.0F, -2.075F, 1.475F, 2, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -1.0F, 0.0F, -2.85F, 2, 1, 3, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, 0.1F, -2.1F, 2, 1, 1, 0.025F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2793F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 13, -1.0F, -2.1F, -2.75F, 2, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6F, -0.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -1.0F, 0.0F, 0.25F, 2, 1, 4, 0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, 1.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.829F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 7, -1.0F, 0.0F, -2.3F, 2, 2, 1, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -1.0F, 0.0F, -2.05F, 2, 2, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 4.5F);
        this.body.addChild(body2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.75F, 1.5F, 0.5F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 15, -1.0F, -3.9F, -2.4F, 1, 2, 3, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 15, -1.5F, -3.9F, -2.4F, 1, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.75F, 1.5F, 0.5F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 6, -1.0F, -3.0F, -0.5F, 1, 4, 3, -0.005F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 6, -1.5F, -3.0F, -0.5F, 1, 4, 3, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 2.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 15, 0.0F, -2.4F, 1.9F, 0, 4, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.5F, -1.75F, 1.5F, 1, 3, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.25F, 2.25F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 2, 0.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 10, 0.0F, -2.0F, -0.75F, 1, 2, 3, 0.01F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, (float) Math.toRadians(90), -0.3054F);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.body.offsetY = -0.3F;
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
            } else {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            }
        }
    }
}
