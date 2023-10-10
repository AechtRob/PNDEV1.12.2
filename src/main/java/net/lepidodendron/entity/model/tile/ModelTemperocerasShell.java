package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTemperocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;

    public ModelTemperocerasShell() {
        textureWidth = 64;
        textureHeight = 64;
        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 38, 16, -2.5F, -6.5F, -1.9F, 5, 5, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 0, -3.0F, -7.25F, 3.0F, 6, 6, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 54, -3.0F, -3.25F, 2.0F, 6, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 39, -2.5F, -6.75F, 13.0F, 5, 5, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 18, -2.0F, -6.25F, 23.0F, 4, 4, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 34, -1.5F, -5.75F, 35.0F, 3, 3, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -5.25F, 47.0F, 2, 2, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 18, -0.5F, -4.75F, 63.0F, 1, 1, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -7.25F, -2.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 34, -2.5F, -7.25F, -1.0F, 5, 1, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 1.9F, -5.5F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, 1.925F, -5.0F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, 1.91F, -4.49F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.9F, -5.5F, 0.5F, 1, 2, 2, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -2.925F, -5.0F, 1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 7, -2.91F, -4.49F, 1.01F, 1, 1, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = -4F;
        this.body.offsetZ = -7;
        this.body.rotateAngleX = -(float) Math.toRadians(2.5);
        this.body.render(0.2f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;

    }

}
