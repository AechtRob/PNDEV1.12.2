package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelNestMound extends ModelBase {
    private final ModelRenderer Nest;

    public ModelNestMound() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Nest = new ModelRenderer(this);
        this.Nest.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Nest.cubeList.add(new ModelBox(Nest, 0, 0, -7.0F, -1.0F, -7.0F, 14, 1, 14, 0.0F, false));
        this.Nest.cubeList.add(new ModelBox(Nest, 0, 15, -5.0F, -2.0F, -5.0F, 10, 1, 10, 0.0F, false));
    }

    public void renderAll(float f) {
        Nest.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
