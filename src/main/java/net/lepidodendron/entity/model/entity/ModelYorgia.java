package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraYorgia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYorgia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;

    public ModelYorgia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -1.0F, -6.0F, 13, 1, 13, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 1, 15, -5.5F, -1.0F, 7.0F, 11, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -4.5F, -1.0F, 8.0F, 9, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 17, -5.0F, -1.0F, -7.0F, 10, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 1, 20, -7.5F, -1.0F, -5.0F, 1, 1, 10, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 41, 21, 6.5F, -1.0F, -5.0F, 1, 1, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5 * 0.32F);
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

        this.bone.offsetY = 1.02F;

        EntityPrehistoricFloraYorgia ee = (EntityPrehistoricFloraYorgia) e;

        this.bone.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.065F) + 1F;
        this.bone.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.065F);
        this.bone.setScaleX(scaler2 * 0.5F);

    }
}
