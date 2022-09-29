package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelAcidBathTrayGrid extends AdvancedModelBase {

    private final AdvancedModelRenderer bb_main;

    public ModelAcidBathTrayGrid() {
        textureWidth = 22;
        textureHeight = 19;

        bb_main = new AdvancedModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, -19, 0, -5.5F, 0.0F, -10.5F, 11, 0, 19, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bb_main.render(f);
    }

    public void setRotationAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

}
