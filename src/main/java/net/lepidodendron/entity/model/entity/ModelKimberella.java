package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraKimberella;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKimberella extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer feeder;
    private final AdvancedModelRenderer rightclaw_r1;
    private final AdvancedModelRenderer leftclaw_r1;
    private final AdvancedModelRenderer trunk_r1;

    public ModelKimberella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 23, -3.0F, -2.0F, -4.0F, 5, 2, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -2.0F, -5.0F, 7, 1, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 12, -3.5F, -2.25F, -4.5F, 6, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -2.0F, -3.0F, 2.75F, 3, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 12, -3.0F, -3.0F, -2.25F, 5, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.75F, 3.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -1.0F, -0.8038F, -0.7778F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 18, -2.0F, -3.2F, -3.0F, 3, 1, 3, 0.0F, false));

        this.feeder = new AdvancedModelRenderer(this);
        this.feeder.setRotationPoint(-0.5F, -0.75F, -4.0F);
        this.main.addChild(feeder);


        this.rightclaw_r1 = new AdvancedModelRenderer(this);
        this.rightclaw_r1.setRotationPoint(0.0F, -1.2F, -2.75F);
        this.feeder.addChild(rightclaw_r1);
        this.setRotateAngle(rightclaw_r1, 0.1309F, 0.9599F, 0.0F);
        this.rightclaw_r1.cubeList.add(new ModelBox(rightclaw_r1, 0, 0, -0.5F, -0.5382F, -1.1239F, 1, 1, 1, 0.0F, false));

        this.leftclaw_r1 = new AdvancedModelRenderer(this);
        this.leftclaw_r1.setRotationPoint(0.0F, -1.2F, -2.75F);
        this.feeder.addChild(leftclaw_r1);
        this.setRotateAngle(leftclaw_r1, 0.1309F, -0.9599F, 0.0F);
        this.leftclaw_r1.cubeList.add(new ModelBox(leftclaw_r1, 0, 2, -0.5F, -0.5382F, -1.1239F, 1, 1, 1, 0.0F, false));

        this.trunk_r1 = new AdvancedModelRenderer(this);
        this.trunk_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.feeder.addChild(trunk_r1);
        this.setRotateAngle(trunk_r1, -0.2182F, 0.0F, 0.0F);
        this.trunk_r1.cubeList.add(new ModelBox(trunk_r1, 0, 0, -0.5F, -0.6752F, -2.9711F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.45F);
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

        this.main.offsetY = 0.81F;

        EntityPrehistoricFloraKimberella ee = (EntityPrehistoricFloraKimberella) e;

        this.main.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.07F);
        this.main.setScaleZ(scaler + 1F);

        this.walk(feeder, scaler * 0.01F, 0.3F, true, 0, 0, f2, 1F);

    }
}
