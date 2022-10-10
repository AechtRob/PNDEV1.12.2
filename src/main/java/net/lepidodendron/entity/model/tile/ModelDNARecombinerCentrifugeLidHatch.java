package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDNARecombinerCentrifugeLidHatch extends AdvancedModelBase {
    public final AdvancedModelRenderer lid;
    public final ModelRenderer right;
    public final ModelRenderer left;

    public ModelDNARecombinerCentrifugeLidHatch() {
        textureWidth = 48;
        textureHeight = 32;

        lid = new AdvancedModelRenderer(this);
        lid.setRotationPoint(7.0F, 15.0F, 0.0F);

        right = new ModelRenderer(this);
        right.setRotationPoint(0.0F, 0.0F, 0.0F);
        lid.addChild(right);
        right.cubeList.add(new ModelBox(right, 0, 0, -9.0F, -7.0F, -1.5F, 4, 1, 2, -0.5F, false));

        left = new ModelRenderer(this);
        left.setRotationPoint(0.0F, 0.0F, 0.0F);
        lid.addChild(left);
        left.cubeList.add(new ModelBox(left, 0, 0, -9.0F, -7.0F, -0.5F, 4, 1, 2, -0.5F, false));

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
