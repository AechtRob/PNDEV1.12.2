package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelAcidBathTray extends AdvancedModelBase {
    private final AdvancedModelRenderer bb_main;

    public ModelAcidBathTray() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new AdvancedModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 7, -0.5F, -1.0F, 8.5F, 6, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 7, -5.5F, -1.0F, 8.5F, 5, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 7, -0.5F, -1.0F, -11.5F, 6, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 7, -5.5F, -1.0F, -11.5F, 5, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bb_main.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
