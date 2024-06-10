package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclomedusa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelCyclomedusa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;

    public ModelCyclomedusa() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 8, -2.0F, -1.35F, -2.0F, 4, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 14, -1.5F, -1.6F, -1.5F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 16, -1.0F, -1.95F, -1.0F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -2.35F, -0.5F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -1.0F, -3.0F, 4, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 15, 0, 2.0F, -1.0F, -2.0F, 1, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 10, -3.0F, -1.0F, -2.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);

        this.bone.render(f5);
        GlStateManager.disableBlend();
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

        //this.bone.offsetY = 1.02F;

        EntityPrehistoricFloraCyclomedusa ee = (EntityPrehistoricFloraCyclomedusa) e;

        this.bone.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.085F) + 1F;
        this.bone.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.085F);
        this.bone.setScaleX(scaler2 * 0.5F);

    }
}
