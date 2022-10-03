package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerCentrifugeLid extends AdvancedModelBase {
    public final AdvancedModelRenderer lid;

    public ModelDNARecombinerCentrifugeLid() {
        textureWidth = 48;
        textureHeight = 32;

        lid = new AdvancedModelRenderer(this);
        lid.setRotationPoint(7.0F, 15.0F, 0.0F);
        lid.cubeList.add(new ModelBox(lid, 6, 9, -9.0F, -7.0F, -1.0F, 1, 1, 2, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 7, 19, -4.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 3, 19, -5.0F, -7.0F, -3.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 2, -9.0F, -7.0F, -2.0F, 4, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 0, -9.0F, -7.0F, 1.0F, 4, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 9, -6.0F, -7.0F, -1.0F, 1, 1, 2, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 17, 18, -11.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 18, 10, -4.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 18, 8, -10.0F, -7.0F, 2.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 18, 6, -12.0F, -6.0F, 4.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 18, 4, -3.0F, -6.0F, 4.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 18, -12.0F, -6.0F, -5.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 17, 16, -3.0F, -6.0F, -5.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 17, 14, -10.0F, -7.0F, -3.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 17, -11.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 7, 17, -5.0F, -7.0F, 2.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 3, 17, -13.0F, -5.0F, 5.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 15, -2.0F, -5.0F, -6.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 8, 15, -13.0F, -5.0F, -6.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 13, -2.0F, -5.0F, 5.0F, 1, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 2, -13.0F, -1.0F, 6.0F, 12, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 0, -13.0F, -1.0F, -7.0F, 12, 1, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 13, -14.0F, -1.0F, -6.0F, 1, 1, 12, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 0, -1.0F, -1.0F, -6.0F, 1, 1, 12, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 13, -14.0F, -4.0F, -7.0F, 1, 4, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 8, 4, -14.0F, -4.0F, 6.0F, 1, 4, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 4, 13, -13.5F, -4.0F, 1.0F, 0, 2, 2, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 4, 4, -1.0F, -4.0F, 6.0F, 1, 4, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 0, 4, -1.0F, -4.0F, -7.0F, 1, 4, 1, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 10, -6.0F, -4.0F, 6.5F, 2, 2, 0, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 4, 11, -0.5F, -4.0F, -3.0F, 0, 2, 2, 0.0F, false));
        lid.cubeList.add(new ModelBox(lid, 14, 6, -10.0F, -4.0F, -6.5F, 2, 2, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        lid.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
