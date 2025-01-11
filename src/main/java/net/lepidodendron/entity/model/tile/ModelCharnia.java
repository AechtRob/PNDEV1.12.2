package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelCharnia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer frond1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer frond4;

    public ModelCharnia() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 6, -9.0F, -2.0F, 7.0F, 2, 2, 2, 0.0F, false));

        frond1 = new AdvancedModelRenderer(this);
        frond1.setRotationPoint(-8.0F, -2.0F, 8.0F);
        bone.addChild(frond1);
        frond1.cubeList.add(new ModelBox(frond1, 0, 10, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(0.0F, -5.0F, 0.0F);
        frond1.addChild(frond2);
        frond2.cubeList.add(new ModelBox(frond2, 0, 1, -1.5F, -5.0F, -0.5F, 3, 4, 1, 0.0F, false));
        frond2.cubeList.add(new ModelBox(frond2, 7, 12, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(0.0F, -5.0F, 0.0F);
        frond2.addChild(frond3);
        frond3.cubeList.add(new ModelBox(frond3, 8, 7, -1.5F, -3.0F, -0.5F, 3, 3, 1, 0.0F, false));
        frond3.cubeList.add(new ModelBox(frond3, 8, 5, -1.5F, -5.0F, 0.0F, 3, 2, 0, 0.0F, false));

        frond4 = new AdvancedModelRenderer(this);
        frond4.setRotationPoint(0.0F, -5.0F, 0.0F);
        frond3.addChild(frond4);
        frond4.cubeList.add(new ModelBox(frond4, 8, 0, -1.5F, -5.0F, 0.0F, 3, 5, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] bodyFull = {this.frond1,this.frond2,this.frond3,this.frond4};
        float speed = 0.091F;
        this.chainWave(bodyFull, speed, 0.18F, 2, f, 0.42F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
