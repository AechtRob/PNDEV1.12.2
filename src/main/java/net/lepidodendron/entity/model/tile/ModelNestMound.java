package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelNestMound extends ModelBase {
    private final ModelRenderer Nest;

    public ModelNestMound() {
        textureWidth = 16;
        textureHeight = 16;

        Nest = new ModelRenderer(this);
        Nest.setRotationPoint(0.0F, 24.0F, 0.0F);
        Nest.cubeList.add(new ModelBox(Nest, 0, 6, 3.0F, -1.0F, -7.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 6, 3.0F, -1.0F, -3.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 10, 3.0F, -1.0F, 1.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 2, -7.0F, -1.0F, 1.0F, 2, 1, 6, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 1, -5.0F, -1.0F, 5.0F, 6, 1, 2, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, 1.0F, -1.0F, 5.0F, 6, 1, 2, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 5, -7.0F, -1.0F, -7.0F, 2, 1, 6, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 6, 5, -7.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 1, -1.0F, -1.0F, -7.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 3, -5.0F, -1.0F, -7.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, -5.0F, -1.0F, -3.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, -5.0F, -1.0F, 1.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, -1.0F, -1.0F, -3.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, -1.0F, -1.0F, 1.0F, 4, 1, 4, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 0, -5.0F, -2.0F, -5.0F, 5, 1, 10, 0.0F, false));
        Nest.cubeList.add(new ModelBox(Nest, 0, 4, 0.0F, -2.0F, -5.0F, 5, 1, 10, 0.0F, false));
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
