package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPodolimirus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPodolimirus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;

    public ModelPodolimirus() {
        textureWidth = 80;
        textureHeight = 60;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.0F, 1.8F);
        main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -1.0F, -9.8F, 5, 1, 16, -0.004F, false));
        main.cubeList.add(new ModelBox(main, 0, 17, -3.5F, -1.0F, -8.8F, 7, 1, 14, -0.003F, false));
        main.cubeList.add(new ModelBox(main, 39, 39, -2.5F, -1.5F, -8.8F, 5, 1, 14, -0.003F, false));
        main.cubeList.add(new ModelBox(main, 26, 13, -5.0F, -1.0F, -6.8F, 10, 1, 1, -0.001F, false));
        main.cubeList.add(new ModelBox(main, 28, 13, -3.0F, -1.5F, -6.8F, 6, 1, 1, -0.001F, false));
        main.cubeList.add(new ModelBox(main, 26, 0, -4.5F, -1.0F, -7.8F, 9, 1, 12, -0.002F, false));
        main.cubeList.add(new ModelBox(main, 0, 40, -3.5F, -1.5F, -7.8F, 7, 1, 12, -0.002F, false));
        main.cubeList.add(new ModelBox(main, 28, 17, -5.5F, -1.0F, -5.8F, 11, 1, 9, 0.001F, false));
        main.cubeList.add(new ModelBox(main, 37, 29, -4.5F, -1.5F, -5.8F, 9, 1, 9, 0.001F, false));
        main.cubeList.add(new ModelBox(main, 0, 32, -6.0F, -1.0F, -3.8F, 12, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = -0.138F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(25);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.33F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        //this.Body.offsetY = 0.383F;

        EntityPrehistoricFloraPodolimirus ee = (EntityPrehistoricFloraPodolimirus) e;

        this.main.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.07F) + 1F;
        this.main.setScaleZ(scaler * 0.65F);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.07F);
        this.main.setScaleX(scaler2 * 0.325F);

    }
}
