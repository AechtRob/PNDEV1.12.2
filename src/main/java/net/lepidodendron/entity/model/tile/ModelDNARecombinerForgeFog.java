package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerForgeFog extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;

    public ModelDNARecombinerForgeFog() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, -15, 7.5F, -14.0F, -8.0F, 0, 14, 16, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bone.setScale(1.0F, 0.95F, 0.95F);
        bone.offsetY = 0.5F;
        bone.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
