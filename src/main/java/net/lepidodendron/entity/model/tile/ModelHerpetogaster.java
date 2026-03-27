package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelHerpetogaster extends AdvancedModelBase {
    private final AdvancedModelRenderer herpetogaster;
    private final AdvancedModelRenderer stem;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;

    public ModelHerpetogaster() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.herpetogaster = new AdvancedModelRenderer(this);
        this.herpetogaster.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.stem = new AdvancedModelRenderer(this);
        this.stem.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.herpetogaster.addChild(stem);
        this.stem.cubeList.add(new ModelBox(stem, 2, 10, 0.0F, -3.5F, -1.5F, 0, 4, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.stem.addChild(body);
        this.setRotateAngle(body, 1.5708F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 8, 3, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.4142F, 0.4142F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 8, -0.5F, 0.1768F, 0.1768F, 1, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.4142F, 0.4142F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -1.1781F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 8, 12, -1.0F, -2.0F, 0.0F, 2, 2, 2, -0.004F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.9914F, 0.0305F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 8, 8, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.05F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 0, -0.5F, -1.5F, 0.5F, 1, 1, 1, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(-0.5F, -1.25F, 0.5F);
        this.body3.addChild(tentacle);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.tentacle.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -3.25F, -4.0F, 0, 3, 4, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.5F, -1.25F, 0.5F);
        this.body3.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, -0.7854F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, 0.0F, -3.0F, -4.0F, 0, 3, 4, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.5F, -1.25F, 1.5F);
        this.body3.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, -2.3562F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 0, 0.0F, -3.0F, -4.0F, 0, 3, 4, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-0.5F, -1.25F, 1.5F);
        this.body3.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, 2.3562F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 0, 0.0F, -3.0F, -4.0F, 0, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        AdvancedModelRenderer[] stem = {this.stem,this.body2};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(tentacle, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(tentacle3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.stem.render(0.1f);
    }

    public void renderAllSide(float f) {
        this.resetToDefaultPose();

        this.setRotateAngle(body, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(stem, -0.0F, 0.0F, 0.0F);

        AdvancedModelRenderer[] stem = {this.stem,this.body};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(tentacle, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(tentacle3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.stem.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
