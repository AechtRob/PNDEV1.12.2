package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggSmall extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape1_3;
    public ModelRenderer shape1_4;
    public ModelRenderer shape1_5;
    public ModelRenderer shape1_6;
    public ModelRenderer shape1_7;
    public ModelRenderer shape1_8;

    public ModelEggSmall() {
        this.textureWidth = 15;
        this.textureHeight = 15;
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 23.2F, 0.0F);
        this.shape1.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1, 0.0F, 0.5918411493512771F, 1.3203415791337103F);
        this.shape1_6 = new ModelRenderer(this, 0, 0);
        this.shape1_6.setRotationPoint(1.9F, 23.5F, -3.0F);
        this.shape1_6.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_6, 1.593485607070823F, -0.5009094953223726F, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(-3.2F, 23.2F, 0.0F);
        this.shape1_1.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_1, 1.6390387005478748F, 0.22759093446006054F, 0.0F);
        this.shape1_5 = new ModelRenderer(this, 0, 0);
        this.shape1_5.setRotationPoint(-1.2F, 23.0F, 2.8F);
        this.shape1_5.addBox(-1.0F, -1.4F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_5, 0.0F, -0.136659280431156F, 0.27314402793711257F);
        this.shape1_7 = new ModelRenderer(this, 0, 0);
        this.shape1_7.setRotationPoint(-3.6F, 23.6F, 4.6F);
        this.shape1_7.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_7, 0.6829473363053812F, -0.091106186954104F, -1.730144887501979F);
        this.shape1_8 = new ModelRenderer(this, 0, 0);
        this.shape1_8.setRotationPoint(-5.6F, 23.5F, 1.4F);
        this.shape1_8.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_8, -1.5025539530419183F, -0.27314402793711257F, -0.22759093446006054F);
        this.shape1_2 = new ModelRenderer(this, 0, 0);
        this.shape1_2.setRotationPoint(4.0F, 23.5F, 0.0F);
        this.shape1_2.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_2, 1.3203415791337103F, 2.777342438698576F, 0.0F);
        this.shape1_3 = new ModelRenderer(this, 0, 0);
        this.shape1_3.setRotationPoint(2.0F, 23.8F, 3.6F);
        this.shape1_3.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_3, 0.136659280431156F, 0.5918411493512771F, -0.091106186954104F);
        this.shape1_4 = new ModelRenderer(this, 0, 0);
        this.shape1_4.setRotationPoint(-1.2F, 23.0F, -3.0F);
        this.shape1_4.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape1_4, 1.593485607070823F, 1.0016444577195458F, -0.36425021489121656F);
    }

    public void renderAll(float f) {
        this.shape1.render(f);
        this.shape1_6.render(f);
        this.shape1_1.render(f);
        this.shape1_5.render(f);
        this.shape1_7.render(f);
        this.shape1_8.render(f);
        this.shape1_2.render(f);
        this.shape1_3.render(f);
        this.shape1_4.render(f);;
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
