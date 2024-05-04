package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelTimeResearcherFinderPlate extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;

    public ModelTimeResearcherFinderPlate() {
        textureWidth = 32;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -8.0F, 5.0F, 6, 1, 6, 0.0F, false));

        updateDefaultPose();
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
