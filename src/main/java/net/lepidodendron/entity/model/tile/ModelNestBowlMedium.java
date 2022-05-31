package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelNestBowlMedium extends ModelBase {
    public ModelRenderer nestmiddle;
    public ModelRenderer slope1;
    public ModelRenderer slope2;
    public ModelRenderer slope3;
    public ModelRenderer slope4;
    public ModelRenderer rim1;
    public ModelRenderer rim2;
    public ModelRenderer rim3;
    public ModelRenderer rim4;
    public ModelRenderer rimslope1;
    public ModelRenderer rimslope2;
    public ModelRenderer rimslope3;
    public ModelRenderer rimslope4;
    public ModelRenderer rimslope5;
    public ModelRenderer rimslope6;
    public ModelRenderer rimslope7;
    public ModelRenderer rimslope8;

    public ModelNestBowlMedium() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rimslope3 = new ModelRenderer(this, 0, 28);
        this.rimslope3.setRotationPoint(-1.0F, -3.8F, 0.0F);
        this.rimslope3.addBox(0.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
        this.setRotateAngle(rimslope3, 0.0F, 0.0F, 0.9560913642424937F);
        this.rimslope6 = new ModelRenderer(this, 17, 39);
        this.rimslope6.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rimslope6.addBox(-3.5F, 0.0F, -1.0F, 7, 3, 1, 0.0F);
        this.setRotateAngle(rimslope6, 0.5918411493512771F, 0.0F, 0.0F);
        this.rimslope7 = new ModelRenderer(this, 19, 28);
        this.rimslope7.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rimslope7.addBox(0.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
        this.setRotateAngle(rimslope7, 0.0F, 0.0F, 0.5918411493512771F);
        this.slope1 = new ModelRenderer(this, 0, 14);
        this.slope1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.slope1.addBox(-3.5F, -4.0F, -3.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(slope1, 0.5462880558742251F, 0.0F, 0.0F);
        this.rim1 = new ModelRenderer(this, 0, 22);
        this.rim1.setRotationPoint(5.3F, 0.61F, 5.3F);
        this.rim1.addBox(-3.0F, -4.0F, -1.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(rim1, 0.0F, 0.7853981633974483F, 0.0F);
        this.rim3 = new ModelRenderer(this, 0, 22);
        this.rim3.setRotationPoint(-5.3F, 0.61F, 5.3F);
        this.rim3.addBox(-3.0F, -4.0F, -1.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(rim3, 0.0F, -0.7853981633974483F, 0.0F);
        this.rim2 = new ModelRenderer(this, 11, 22);
        this.rim2.setRotationPoint(5.3F, 0.61F, -5.3F);
        this.rim2.addBox(-1.0F, -4.0F, -3.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(rim2, 0.0F, 0.7853981633974483F, 0.0F);
        this.rimslope5 = new ModelRenderer(this, 0, 39);
        this.rimslope5.setRotationPoint(0.0F, -3.8F, -1.0F);
        this.rimslope5.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.setRotateAngle(rimslope5, -0.9560913642424937F, 0.0F, 0.0F);
        this.slope2 = new ModelRenderer(this, 21, 14);
        this.slope2.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.slope2.addBox(-3.0F, -4.0F, -3.5F, 3, 4, 7, 0.0F);
        this.setRotateAngle(slope2, 0.0F, 0.0F, -0.5462880558742251F);
        this.nestmiddle = new ModelRenderer(this, 0, 0);
        this.nestmiddle.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.nestmiddle.addBox(-5.5F, -2.0F, -5.5F, 11, 2, 11, 0.0F);
        this.rim4 = new ModelRenderer(this, 11, 22);
        this.rim4.setRotationPoint(-5.3F, 0.61F, -5.3F);
        this.rim4.addBox(0.0F, -4.0F, -3.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(rim4, 0.0F, -0.7853981633974483F, 0.0F);
        this.slope4 = new ModelRenderer(this, 21, 14);
        this.slope4.setRotationPoint(-9.0F, 0.0F, 0.0F);
        this.slope4.addBox(0.0F, -4.0F, -3.5F, 3, 4, 7, 0.0F);
        this.setRotateAngle(slope4, 0.0F, 0.0F, 0.5462880558742251F);
        this.rimslope4 = new ModelRenderer(this, 19, 28);
        this.rimslope4.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rimslope4.addBox(-1.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
        this.setRotateAngle(rimslope4, 0.0F, 0.0F, -0.5918411493512771F);
        this.slope3 = new ModelRenderer(this, 0, 14);
        this.slope3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.slope3.addBox(-3.5F, -4.0F, 0.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(slope3, -0.5462880558742251F, 0.0F, 0.0F);
        this.rimslope1 = new ModelRenderer(this, 0, 39);
        this.rimslope1.setRotationPoint(0.0F, -3.8F, -1.0F);
        this.rimslope1.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.setRotateAngle(rimslope1, -0.9560913642424937F, 0.0F, 0.0F);
        this.rimslope2 = new ModelRenderer(this, 17, 39);
        this.rimslope2.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rimslope2.addBox(-3.5F, 0.0F, -1.0F, 7, 3, 1, 0.0F);
        this.setRotateAngle(rimslope2, 0.5918411493512771F, 0.0F, 0.0F);
        this.rimslope8 = new ModelRenderer(this, 0, 28);
        this.rimslope8.setRotationPoint(1.0F, -3.8F, 0.0F);
        this.rimslope8.addBox(-1.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
        this.setRotateAngle(rimslope8, 0.0F, 0.0F, -0.9560913642424937F);
        this.rim2.addChild(this.rimslope3);
        this.rim3.addChild(this.rimslope6);
        this.rim4.addChild(this.rimslope7);
        this.nestmiddle.addChild(this.slope1);
        this.nestmiddle.addChild(this.rim1);
        this.nestmiddle.addChild(this.rim3);
        this.nestmiddle.addChild(this.rim2);
        this.rim3.addChild(this.rimslope5);
        this.nestmiddle.addChild(this.slope2);
        this.nestmiddle.addChild(this.rim4);
        this.nestmiddle.addChild(this.slope4);
        this.rim2.addChild(this.rimslope4);
        this.nestmiddle.addChild(this.slope3);
        this.rim1.addChild(this.rimslope1);
        this.rim1.addChild(this.rimslope2);
        this.rim4.addChild(this.rimslope8);
    }

    public void renderAll(float f) {
        nestmiddle.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
