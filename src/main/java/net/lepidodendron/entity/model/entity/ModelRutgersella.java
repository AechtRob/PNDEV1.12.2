package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraRutgersella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRutgersella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;

    public ModelRutgersella() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 4, -3.0F, -1.0F, 0.25F, 7, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -3.0F, -1.25F, 0.25F, 7, 1, 2, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 0, -2.0F, -1.15F, 2.25F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 17, -2.0F, -1.15F, -3.5F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 11, 18, -2.0F, -1.0F, 2.95F, 5, 1, 1, 0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 2, -1.0F, -1.0F, 3.95F, 3, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 4, -2.0F, -1.0F, -4.5F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.0F, -3.5F, 7, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -3.0F, -1.25F, -2.5F, 7, 1, 2, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 8, 20, 0.975F, -1.0F, -1.0F, 3, 1, 2, -0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 19, 1.0F, -1.25F, -1.0F, 3, 1, 2, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 12, 3.975F, -1.0F, -2.5F, 1, 1, 5, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 12, -4.0F, -1.0F, -2.5F, 1, 1, 5, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 16, 9, -3.0F, -1.0F, -1.0F, 4, 1, 2, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 6, -3.0F, -1.25F, -1.0F, 3, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = 0.16F;
        this.main.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        //this.main.offsetY = 1.28F;

        EntityPrehistoricFloraRutgersella ee = (EntityPrehistoricFloraRutgersella) e;

        this.main.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.main.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.main.setScaleX(scaler2 * 0.5F);


    }
}
