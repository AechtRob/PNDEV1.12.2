package net.lepidodendron.entity.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRubberBoots extends ModelBiped {
    public ModelRenderer boot_main;
    public ModelRenderer boot_foot_middle;
    public ModelRenderer boot_main_right;
    public ModelRenderer boot_foot_middle_right;

    public ModelRubberBoots() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.boot_main = new ModelRenderer(this, 0, 4);
        this.boot_main.setRotationPoint(1.90F, 12.0F, 0.0F);
        this.boot_main.addBox(-4.0F, -6.0F, -2.0F, 4, 6, 4, 0.15F);
        this.boot_foot_middle = new ModelRenderer(this, 0, 0);
        this.boot_foot_middle.setRotationPoint(0.0F, -2.009999990463257F, -1.7999999523162842F);
        this.boot_foot_middle.addBox(-3.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.boot_main.addChild(this.boot_foot_middle);

        this.boot_main_right = new ModelRenderer(this, 0, 4);
        this.boot_main_right.setRotationPoint(-1.90F, 12.0F, 0.0F);
        this.boot_main_right.addBox(-0.0F, -6.0F, -2.0F, 4, 6, 4, 0.15F);
        this.boot_foot_middle_right = new ModelRenderer(this, 0, 0);
        this.boot_foot_middle_right.setRotationPoint(0.0F, -2.009999990463257F, -1.7999999523162842F);
        this.boot_foot_middle_right.addBox(0.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.boot_main_right.addChild(this.boot_foot_middle_right);

        this.bipedLeftLeg.addChild(boot_main);
        this.bipedRightLeg.addChild(boot_main_right);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
