package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelHalfBlock extends ModelBase {
    private final ModelRenderer bb_main;

    public ModelHalfBlock() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, -16, 0, -8.0F, -8.0F, -8.0F, 16, 0, 16, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -8.0F, -8.0F, 16, 8, 0, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, -16, -8.0F, -8.0F, -8.0F, 0, 8, 16, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -8.0F, 8.0F, 16, 8, 0, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, -16, 8.0F, -8.0F, -8.0F, 0, 8, 16, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, -16, 0, -8.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F, false));
    }

    public void renderAll(float f) {
        bb_main.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
