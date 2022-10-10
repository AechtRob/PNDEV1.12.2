package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerForgeOligopool extends AdvancedModelBase {
    public final AdvancedModelRenderer oligo;

    public ModelDNARecombinerForgeOligopool() {
        textureWidth = 7;
        textureHeight = 7;

        oligo = new AdvancedModelRenderer(this);
        oligo.setRotationPoint(-5.2143F, 18.0F, 0.0F);
        oligo.cubeList.add(new ModelBox(oligo, 0, -2, 1.2143F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, 0, -2, -0.7857F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, 0, 0, -0.7857F, -1.0F, 1.0F, 2, 2, 0, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, 0, 0, -0.7857F, -1.0F, -1.0F, 2, 2, 0, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, -2, 0, -0.7857F, -1.0F, -1.0F, 2, 0, 2, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, -2, 0, -0.7857F, 1.0F, -1.0F, 2, 0, 2, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, 0, 2, -1.7857F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        oligo.cubeList.add(new ModelBox(oligo, 0, 1, 0.2143F, -2.0F, -1.5F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        oligo.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
