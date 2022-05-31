package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelRottenLogEggs extends ModelBase {
    public ModelRenderer Eggmiddle1;
    public ModelRenderer Eggtop1;
    public ModelRenderer Eggside1;
    public ModelRenderer Eggfront1;
    public ModelRenderer Eggmiddle2;
    public ModelRenderer Eggmiddle3;
    public ModelRenderer Eggtop2;
    public ModelRenderer Eggside2;
    public ModelRenderer Eggfront2;
    public ModelRenderer Eggtop3;
    public ModelRenderer Eggside3;
    public ModelRenderer Eggfront3;

    public ModelRottenLogEggs() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Eggside2 = new ModelRenderer(this, 0, 0);
        this.Eggside2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggside2.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.Eggtop2 = new ModelRenderer(this, 0, 0);
        this.Eggtop2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggtop2.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.Eggmiddle1 = new ModelRenderer(this, 0, 0);
        this.Eggmiddle1.setRotationPoint(-2.7F, 22.5F, -0.5F);
        this.Eggmiddle1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Eggmiddle2 = new ModelRenderer(this, 0, 0);
        this.Eggmiddle2.setRotationPoint(3.5F, 0.0F, 3.0F);
        this.Eggmiddle2.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Eggfront3 = new ModelRenderer(this, 0, 0);
        this.Eggfront3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggfront3.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F);
        this.Eggtop1 = new ModelRenderer(this, 0, 0);
        this.Eggtop1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggtop1.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.Eggmiddle3 = new ModelRenderer(this, 0, 0);
        this.Eggmiddle3.setRotationPoint(4.5F, 0.0F, -1.5F);
        this.Eggmiddle3.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Eggfront2 = new ModelRenderer(this, 0, 0);
        this.Eggfront2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggfront2.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F);
        this.Eggtop3 = new ModelRenderer(this, 0, 0);
        this.Eggtop3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggtop3.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.Eggfront1 = new ModelRenderer(this, 0, 0);
        this.Eggfront1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggfront1.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F);
        this.Eggside1 = new ModelRenderer(this, 0, 0);
        this.Eggside1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggside1.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.Eggside3 = new ModelRenderer(this, 0, 0);
        this.Eggside3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eggside3.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.Eggmiddle2.addChild(this.Eggside2);
        this.Eggmiddle2.addChild(this.Eggtop2);
        this.Eggmiddle1.addChild(this.Eggmiddle2);
        this.Eggmiddle3.addChild(this.Eggfront3);
        this.Eggmiddle1.addChild(this.Eggtop1);
        this.Eggmiddle1.addChild(this.Eggmiddle3);
        this.Eggmiddle2.addChild(this.Eggfront2);
        this.Eggmiddle3.addChild(this.Eggtop3);
        this.Eggmiddle1.addChild(this.Eggfront1);
        this.Eggmiddle1.addChild(this.Eggside1);
        this.Eggmiddle3.addChild(this.Eggside3);
    }

    public void renderAll(float f) {
        Eggmiddle1.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
