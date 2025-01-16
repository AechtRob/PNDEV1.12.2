package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCephalonega;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCephalonega extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tail_thing_1;
    private final AdvancedModelRenderer tail_thing_2;

    public ModelCephalonega() {
        textureWidth = 20;
        textureHeight = 20;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.5F, 4.0F);
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.5F, -7.0F, 6, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 8, 5, -2.0F, -1.5F, -3.0F, 4, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 5, -1.0F, -2.0F, -5.0F, 2, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 10, 10, -1.0F, -1.5F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 10, -2.0F, -1.5F, -8.0F, 4, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 12, 8, -1.0F, -1.5F, -9.0F, 2, 1, 1, 0.0F, false));

        tail_thing_1 = new AdvancedModelRenderer(this);
        tail_thing_1.setRotationPoint(1.0F, -1.5F, -1.0F);
        main.addChild(tail_thing_1);
        tail_thing_1.cubeList.add(new ModelBox(tail_thing_1, 0, 9, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        tail_thing_2 = new AdvancedModelRenderer(this);
        tail_thing_2.setRotationPoint(-1.0F, -1.5F, -1.0F);
        main.addChild(tail_thing_2);
        tail_thing_2.cubeList.add(new ModelBox(tail_thing_2, 6, 9, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

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

        EntityPrehistoricFloraCephalonega ee = (EntityPrehistoricFloraCephalonega) e;

        this.main.scaleChildren = true;
        this.tail_thing_1.scaleChildren = false;
        this.tail_thing_2.scaleChildren = false;
        this.swing(tail_thing_1, 0.1F, 0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(tail_thing_2, 0.1F, -0.25F, false, 0, 0.1F, f2, 0.8F);

        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.07F) + 1F;
        this.main.setScaleZ(scaler * 0.65F);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.07F);
        this.main.setScaleX(scaler2 * 0.325F);

    }
}
