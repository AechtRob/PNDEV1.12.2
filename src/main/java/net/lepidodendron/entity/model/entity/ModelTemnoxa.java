package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTemnoxa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTemnoxa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;

    public ModelTemnoxa() {
        textureWidth = 20;
        textureHeight = 20;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 0, 12, -1.5F, -0.9F, -1.4F, 3, 1, 5, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 5, -2.0F, -0.8F, -1.9F, 4, 1, 6, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 1, 3, -1.5F, -0.8F, 4.1F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 9, 3, -1.5F, -0.9F, -2.4F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 9, 3, -1.5F, -0.8F, -2.4F, 3, 1, 1, -0.001F, false));
        main.cubeList.add(new ModelBox(main, 10, 0, -2.2F, -0.8F, -3.4F, 1, 1, 2, 0.125F, false));
        main.cubeList.add(new ModelBox(main, 0, 8, 1.2F, -0.8F, -3.4F, 1, 1, 2, 0.125F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -0.8F, -4.0F, 3, 1, 2, 0.126F, false));
        main.cubeList.add(new ModelBox(main, 14, 9, -1.0F, -0.9F, 3.6F, 2, 1, 1, 0.0F, false));

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

        EntityPrehistoricFloraTemnoxa ee = (EntityPrehistoricFloraTemnoxa) e;

        this.main.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.07F) + 1F;
        this.main.setScaleZ(scaler * 0.65F);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.07F);
        this.main.setScaleX(scaler2 * 0.325F);

    }
}
