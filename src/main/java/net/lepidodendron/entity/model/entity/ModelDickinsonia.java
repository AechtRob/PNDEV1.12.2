package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraDickinsonia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDickinsonia extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;

    public ModelDickinsonia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 21, 28, -4.0F, -1.0F, -8.0F, 8, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 23, 25, -5.0F, -1.0F, -7.0F, 10, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 16, -6.0F, -1.0F, -6.0F, 12, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -7.0F, -1.0F, -3.0F, 14, 1, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 21, -6.0F, -1.0F, 3.0F, 12, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 25, -5.0F, -1.0F, 5.0F, 10, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 28, 16, -4.0F, -1.0F, 6.0F, 8, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 29, 21, -3.0F, -1.0F, 7.0F, 6, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, -3.0F, -2.0F, -6.0F, 6, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 28, -4.0F, -2.0F, -5.0F, 8, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 8, -5.0F, -2.0F, -3.0F, 10, 1, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 27, 8, -4.0F, -2.0F, 3.0F, 8, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 20, 31, -3.0F, -2.0F, 5.0F, 6, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.75F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Body.offsetY = 0.383F;

        EntityPrehistoricFloraDickinsonia ee = (EntityPrehistoricFloraDickinsonia) e;

        this.Body.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.07F) + 1F;
        this.Body.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.07F);
        this.Body.setScaleX(scaler2 * 0.5F);

    }
}
