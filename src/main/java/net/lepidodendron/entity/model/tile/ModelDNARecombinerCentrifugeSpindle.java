package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDNARecombinerCentrifugeSpindle extends AdvancedModelBase {
    public final ModelRenderer spindle;

    public ModelDNARecombinerCentrifugeSpindle() {
        textureWidth = 16;
        textureHeight = 16;

        spindle = new ModelRenderer(this);
        spindle.setRotationPoint(0.0F, 16.0F, 0.0F);
        spindle.cubeList.add(new ModelBox(spindle, 5, 6, -2.0F, -2.0F, -1.0F, 4, 1, 2, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 7, 0, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 5, 5, -1.0F, -3.0F, -1.0F, 2, 1, 2, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 5, 5, -1.0F, -2.0F, 1.0F, 2, 1, 1, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 5, 5, -1.0F, -2.0F, -2.0F, 2, 1, 1, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 0, 1, -0.5F, -2.0F, -3.0F, 1, 0, 1, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 0, 1, -0.5F, -2.0F, 2.0F, 1, 0, 1, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 0, 1, -3.0F, -2.0F, -0.5F, 1, 0, 1, 0.0F, false));
        spindle.cubeList.add(new ModelBox(spindle, 0, 1, 2.0F, -2.0F, -0.5F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        spindle.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
