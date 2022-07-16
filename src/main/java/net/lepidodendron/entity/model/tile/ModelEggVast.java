package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggVast extends ModelBase {
    private final ModelRenderer egg;

    public ModelEggVast() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        egg = new ModelRenderer(this);
        egg.setRotationPoint(-0.15F, 32.0F, 0.025F);
        this.setRotateAngle(egg, -0.0436F, -0.3054F, 0.0436F);
        egg.cubeList.add(new ModelBox(egg, 0, 4, -2.85F, 1.0F, -3.025F, 6, 1, 2, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 7, -2.85F, 1.0F, -1.025F, 6, 1, 2, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 11, -2.85F, 1.0F, 0.975F, 6, 1, 2, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 4, -0.35F, -1.0F, -3.525F, 4, 2, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 1, 2, -3.35F, -1.0F, -0.525F, 3, 2, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 4, -0.35F, -1.0F, 0.475F, 4, 2, 3, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 4, -3.35F, -1.0F, -3.525F, 3, 2, 3, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 0, 0.15F, -7.0F, -4.025F, 4, 6, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 2, 0.15F, -7.0F, -0.025F, 4, 6, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 3, -3.85F, -7.0F, -0.025F, 4, 6, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 5, -3.85F, -7.0F, -4.025F, 4, 6, 4, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 6, 0.65F, -10.0F, -3.525F, 3, 3, 5, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 3, -2.35F, -10.0F, -3.525F, 3, 3, 5, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 5, -3.35F, -10.0F, -3.525F, 1, 3, 7, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 2, -2.35F, -10.0F, 1.475F, 6, 3, 2, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 4, 1.15F, -11.0F, -3.025F, 2, 1, 6, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 6, -0.85F, -11.0F, -3.025F, 2, 1, 6, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 1, -2.85F, -11.0F, -3.025F, 2, 1, 6, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 1, -0.35F, -12.0F, -2.525F, 3, 1, 5, 0.0F, false));
        egg.cubeList.add(new ModelBox(egg, 0, 0, -2.35F, -12.0F, -2.525F, 2, 1, 5, 0.0F, false));
    }

    public void renderAll(float f) {
        this.egg.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
