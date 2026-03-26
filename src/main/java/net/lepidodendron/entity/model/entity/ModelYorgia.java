package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraYorgia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYorgia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;

    public ModelYorgia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 14, -4.0F, -1.0F, -5.0F, 8, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 11, -5.0F, -1.0F, -4.0F, 10, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -1.0F, -3.0F, 12, 1, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 7, -5.0F, -1.0F, 2.0F, 10, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 17, -4.0F, -1.0F, 4.0F, 8, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 17, -3.0F, -1.0F, 5.0F, 6, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 14, -3.0F, -1.0F, -6.0F, 6, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.4F;
        this.bone.offsetX = -0.138F;
        this.bone.rotateAngleY = (float)Math.toRadians(200);
        this.bone.rotateAngleX = (float)Math.toRadians(25);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 2.33F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
        resetToDefaultPose();

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

        EntityPrehistoricFloraYorgia ee = (EntityPrehistoricFloraYorgia) e;

        this.bone.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.065F) + 1F;
        this.bone.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.065F);
        this.bone.setScaleX(scaler2 * 0.5F);

    }
}
