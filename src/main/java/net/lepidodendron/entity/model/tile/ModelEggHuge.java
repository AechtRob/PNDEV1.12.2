package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggHuge extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape2_1;
    public ModelRenderer shape3_1;
    public ModelRenderer shape4_1;
    public ModelRenderer shape2_2;
    public ModelRenderer shape3_2;
    public ModelRenderer shape4_2;

    public ModelEggHuge() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape3_2 = new ModelRenderer(this, 0, 17);
        this.shape3_2.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.shape3_2.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 0, 7);
        this.shape2_1.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.shape2_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 26);
        this.shape4.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.shape4.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.shape2_2 = new ModelRenderer(this, 0, 7);
        this.shape2_2.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.shape2_2.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.shape4_2 = new ModelRenderer(this, 0, 26);
        this.shape4_2.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.shape4_2.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.8F, 24.0F, -4.0F);
        this.shape1.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(shape1, -0.27314402793711257F, 0.22759093446006054F, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(-3.2F, 23.8F, 1.1F);
        this.shape1_1.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(shape1_1, 0.0F, 0.0F, 0.31869712141416456F);
        this.shape3 = new ModelRenderer(this, 0, 17);
        this.shape3.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.shape3.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 0, 26);
        this.shape4_1.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.shape4_1.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 0, 0);
        this.shape1_2.setRotationPoint(0.6F, 22.7F, 1.2F);
        this.shape1_2.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(shape1_2, -0.18203784098300857F, -0.22759093446006054F, 1.8212510744560826F);
        this.shape2 = new ModelRenderer(this, 0, 7);
        this.shape2.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.shape2.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.shape3_1 = new ModelRenderer(this, 0, 17);
        this.shape3_1.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.shape3_1.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
        this.shape2_2.addChild(this.shape3_2);
        this.shape1_1.addChild(this.shape2_1);
        this.shape3.addChild(this.shape4);
        this.shape1_2.addChild(this.shape2_2);
        this.shape3_2.addChild(this.shape4_2);
        this.shape2.addChild(this.shape3);
        this.shape3_1.addChild(this.shape4_1);
        this.shape1.addChild(this.shape2);
        this.shape2_1.addChild(this.shape3_1);

    }

    public void renderAll(float f) {
        this.shape1.render(f);
        this.shape1_1.render(f);
        this.shape1_2.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
