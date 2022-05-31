package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMetaspriggina extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;

    public ModelMetaspriggina() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, -6.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 0, 0.1F, 0.9F, -0.1F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -1.1F, 0.9F, -0.1F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 5, -1.25F, -0.75F, 1.0F, 1, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 10, 0.25F, -0.75F, 1.0F, 1, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, -0.5F, -0.55F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0472F, -0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 8, 0.1F, -1.0F, -0.75F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -0.5F, 0.85F, 0.14F, 1, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 17, -0.99F, 0.1F, 0.15F, 2, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0472F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.1F, -1.0F, -0.75F, 1, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 2, -0.49F, -0.5F, 0.01F, 1, 2, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -0.25F, -1.0F, -0.01F, 1, 2, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 7, -0.5F, -1.25F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 12, 12, -0.75F, -1.0F, -0.02F, 1, 2, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 5, 15, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 17, 11, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.115F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.body.offsetZ = 0.1F;
        this.body.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.425F;
        if (!e.isInWater()) {
            speed = 0.785F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.128F, -1.1, f2, 0.9F);
            this.swing(body, speed, 0.22F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.30F;
                this.bob(body, -speed, 2F, false, f2, 1);
            }
        }
    }
}
