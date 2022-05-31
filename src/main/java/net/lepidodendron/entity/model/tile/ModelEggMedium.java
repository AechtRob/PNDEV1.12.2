package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggMedium extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape1_3;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape2_1;
    public ModelRenderer shape3_1;
    public ModelRenderer shape4_1;
    public ModelRenderer shape2_2;
    public ModelRenderer shape3_2;
    public ModelRenderer shape4_2;
    public ModelRenderer shape2_3;
    public ModelRenderer shape3_3;
    public ModelRenderer shape4_3;

    public ModelEggMedium() {
        this.textureWidth = 25;
        this.textureHeight = 25;
        this.shape2_2 = new ModelRenderer(this, 0, 4);
        this.shape2_2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.shape2_2.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 0, 0);
        this.shape1_2.setRotationPoint(-0.1F, 23.5F, -1.1F);
        this.shape1_2.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape1_2, -0.27314402793711257F, -0.4553564018453205F, -0.136659280431156F);
        this.shape3_3 = new ModelRenderer(this, 0, 10);
        this.shape3_3.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.shape3_3.addBox(-1.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F);
        this.shape3_2 = new ModelRenderer(this, 0, 10);
        this.shape3_2.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.shape3_2.addBox(-1.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 10);
        this.shape3.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.shape3.addBox(-1.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 0, 15);
        this.shape4_1.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.shape4_1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.shape4_3 = new ModelRenderer(this, 0, 15);
        this.shape4_3.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.shape4_3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 15);
        this.shape4.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.shape4.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.shape2_3 = new ModelRenderer(this, 0, 4);
        this.shape2_3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.shape2_3.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape4_2 = new ModelRenderer(this, 0, 15);
        this.shape4_2.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.shape4_2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 23.9F, 4.1F);
        this.shape1.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape1, 0.4553564018453205F, 0.5462880558742251F, 0.045553093477052F);
        this.shape1_3 = new ModelRenderer(this, 0, 0);
        this.shape1_3.setRotationPoint(-3.6F, 24.0F, 1.7F);
        this.shape1_3.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape1_3, 0.0F, 0.36425021489121656F, 0.5462880558742251F);
        this.shape2_1 = new ModelRenderer(this, 0, 4);
        this.shape2_1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.shape2_1.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape3_1 = new ModelRenderer(this, 0, 10);
        this.shape3_1.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.shape3_1.addBox(-1.0F, -0.6F, -1.0F, 2, 1, 2, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(2.0F, 23.2F, 0.5F);
        this.shape1_1.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape1_1, -0.22759093446006054F, 0.18203784098300857F, 1.8212510744560826F);
        this.shape2 = new ModelRenderer(this, 0, 4);
        this.shape2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.shape2.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape1_2.addChild(this.shape2_2);
        this.shape2_3.addChild(this.shape3_3);
        this.shape2_2.addChild(this.shape3_2);
        this.shape2.addChild(this.shape3);
        this.shape3_1.addChild(this.shape4_1);
        this.shape3_3.addChild(this.shape4_3);
        this.shape3.addChild(this.shape4);
        this.shape1_3.addChild(this.shape2_3);
        this.shape3_2.addChild(this.shape4_2);
        this.shape1_1.addChild(this.shape2_1);
        this.shape2_1.addChild(this.shape3_1);
        this.shape1.addChild(this.shape2);
    }

    public void renderAll(float f) {
        this.shape1_2.render(f);
        this.shape1.render(f);
        this.shape1_3.render(f);
        this.shape1_1.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
