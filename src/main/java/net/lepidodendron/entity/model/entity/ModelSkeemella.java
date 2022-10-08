package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSkeemella extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tail7;

    public ModelSkeemella() {
        this.textureWidth = 24;
        this.textureHeight = 20;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.5F, -6.0F);
        this.Root.cubeList.add(new ModelBox(Root, 0, 0, -1.0F, -1.51F, -2.0F, 2, 3, 4, 0.0F, false));
        this.Root.cubeList.add(new ModelBox(Root, 0, 0, -0.5F, -0.51F, -2.01F, 1, 1, 1, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.Root.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 13, -0.5F, -1.0F, 0.0F, 1, 2, 4, -0.002F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 11, -0.5F, -0.99F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 6, 9, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.002F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 8, 3, -0.5F, -0.99F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 7, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.002F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail5.addChild(Tail6);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tail7 = new AdvancedModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail6.addChild(Tail7);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 10, 14, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5 * 0.15F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Root.render(0.01F);
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
        this.Root.offsetY = 1.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6, this.Tail7};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -0.2, f2, 1);
            this.chainSwing(fishTail, speed, 0.48F, -3, f2, 0.5F);
            this.swing(Root, speed, 0.25F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Root.rotateAngleZ = (float) Math.toRadians(90);
                this.Root.offsetY = 1.4F;
                this.bob(Root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
