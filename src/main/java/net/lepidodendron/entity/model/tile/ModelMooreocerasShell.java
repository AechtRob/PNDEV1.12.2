package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMooreocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;

    public ModelMooreocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -24.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.25F, 4.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -3.0F, -6.75F, 18.0F, 6, 6, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 29, -2.5F, -6.25F, 30.0F, 5, 5, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 0, -2.0F, -5.75F, 40.0F, 4, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 44, -1.5F, -5.25F, 48.0F, 3, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -1.0F, -4.75F, 54.0F, 2, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 0, -0.5F, -4.25F, 58.0F, 1, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 12, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 0, -3.49F, -2.925F, 0.6F, 7, 4, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = -1.5F;
        this.body.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
