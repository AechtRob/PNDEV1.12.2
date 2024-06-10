package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCometicercus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelCometicercus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.15F, -4.0F, -7.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 26, -1.0F, -5.0F, -5.0F, 2, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 0, -1.0F, -7.0F, -3.0F, 2, 6, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 3, 0.15F, -4.0F, -7.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 0, -0.5F, -7.6F, -0.2F, 1, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -7.5F, -4.5F, 2, 2, 6, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 37, -1.05F, -2.0F, -7.0F, 1, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 11, 0.05F, -2.0F, -7.0F, 1, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -1.0F, -1.0F, -8.0F, 2, 1, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.75F, -2.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 31, -1.0F, -2.0261F, -0.0047F, 2, 2, 8, 0.02F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.0F, 5.0F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -0.5F, 3.5956F, 9.59F, 1, 1, 9, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -3.4F, 1.0F, 0, 8, 17, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -0.5F, -3.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 16, -0.5F, -6.65F, 4.45F, 1, 1, 10, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 28, -0.5F, -2.6F, 3.5F, 1, 1, 9, -0.01F, false));


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
        this.setRotateAngle(tail, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.body.offsetY = -0.3F;
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail};
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
