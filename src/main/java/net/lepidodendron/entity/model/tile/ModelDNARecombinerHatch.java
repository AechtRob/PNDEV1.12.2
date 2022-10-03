package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerHatch extends AdvancedModelBase {
    private final AdvancedModelRenderer hatch;
    private final AdvancedModelRenderer right;
    private final AdvancedModelRenderer left;

    public ModelDNARecombinerHatch() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.hatch = new AdvancedModelRenderer(this);
        this.hatch.setRotationPoint(0.0F, 0.0F, 0.0F);

        this.right = new AdvancedModelRenderer(this);
        this.right.setRotationPoint(4.0F, 14.5F, 2.0F);
        this.hatch.addChild(right);
        this.right.cubeList.add(new ModelBox(right, 0, 5, -4.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));
        this.right.cubeList.add(new ModelBox(right, 0, 5, -8.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));

        this.left = new AdvancedModelRenderer(this);
        this.left.setRotationPoint(-4.0F, 14.5F, -2.0F);
        this.hatch.addChild(left);
        this.left.cubeList.add(new ModelBox(left, 0, 1, 4.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 0, 1, 0.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        hatch.scaleY = 0.8F;
        hatch.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
