package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDisasterItem extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;

    public ModelDisasterItem () {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.5F, 25.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 17, -4.0F, -6.0F, -4.0F, 7, 5, 9, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 32, -5.0F, -5.025F, -3.0F, 9, 4, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -5.05F, -5.0F, 5, 4, 12, 0.0F, false));

        updateDefaultPose();
    }
    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.offsetY = -25F;
        this.bone.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
