package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTrigonotarbidEggs extends ModelBase {
    private final ModelRenderer bone;

    public ModelTrigonotarbidEggs() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -9.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -11.0F, -1.0F, 8.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -1.0F, 8.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -8.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -1.0F, 5.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -6.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -9.0F, -1.0F, 5.0F, 1, 1, 1, 0.0F, false));
    }

    public void renderAll(float f) {
        bone.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
