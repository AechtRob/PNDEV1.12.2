package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBirkenia extends AdvancedModelBase {
    private final AdvancedModelRenderer Birkenia;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;

    public ModelBirkenia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Birkenia = new AdvancedModelRenderer(this);
        this.Birkenia.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 0, 0, -2.5F, -9.0F, -7.0F, 5, 7, 14, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.25F, -7.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.25F, -5.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.25F, -3.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.25F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.5F, 2.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 10, -0.5F, -9.75F, 4.0F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 8, 0, -0.5F, -9.75F, 5.75F, 1, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 0, 0, -0.5F, -10.5F, 1.5F, 1, 1, 2, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 34, 0, -1.5F, -7.0F, -11.0F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.0F, -7.0F);
        this.Birkenia.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 26, -2.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 23, -2.0F, 1.0F, -6.0F, 1, 2, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 23, 1.0F, 1.0F, -6.0F, 1, 2, 6, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -2.0F, 2.5F);
        this.Birkenia.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.0036F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, 0.0F, 0.0F, -4.5F, 0, 1, 9, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -2.0F, 2.5F);
        this.Birkenia.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.0036F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, 0.0F, 0.0F, -4.5F, 0, 1, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.75F, -7.0F);
        this.Birkenia.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 33, -1.0F, -1.25F, -6.0F, 2, 1, 6, -0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 32, -2.0F, -4.25F, -6.0F, 1, 4, 6, -0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 32, 1.0F, -4.25F, -6.0F, 1, 4, 6, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.5F, 7.0F);
        this.Birkenia.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 8, 2, -0.5F, -2.75F, 0.5F, 1, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 3, -0.5F, -2.5F, 2.5F, 1, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 1, 43, -2.0F, -2.0F, -1.0F, 4, 6, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 6, 0.0F, 3.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.25F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 8, -1.5F, -3.25F, -1.0F, 3, 4, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 6, 0.0F, 0.75F, -1.0F, 0, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7038F, 2.0634F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -6.5462F, -0.0634F, 0, 11, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.4538F, 0.9366F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 15, -1.0F, -1.75F, -1.5F, 2, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Birkenia.render(f5 * 0.128F * 1.4F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Birkenia.rotateAngleY = (float) Math.toRadians(90);
        this.Birkenia.render(0.01F);
        GlStateManager.enableCull();
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
        this.Birkenia.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.66F;
        if (!e.isInWater()) {
            speed = 0.99F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(Birkenia, speed, 0.16F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Birkenia.rotateAngleZ = (float) Math.toRadians(90);
                this.Birkenia.offsetY = 1.00F;
                this.bob(Birkenia, -speed, 5F, false, f2, 1);
            }
        }
    }
}
