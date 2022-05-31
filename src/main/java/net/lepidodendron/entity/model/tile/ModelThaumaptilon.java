package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelThaumaptilon extends AdvancedModelBase {
    private final AdvancedModelRenderer stem;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer leaf1;
    private final AdvancedModelRenderer leaf2;
    private final AdvancedModelRenderer leaf3;
    private final AdvancedModelRenderer leaf4;
    private final AdvancedModelRenderer leaf5;

    public ModelThaumaptilon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.stem = new AdvancedModelRenderer(this);
        this.stem.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.stem.cubeList.add(new ModelBox(stem, 12, 0, -1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F, false));

        this.stem2 = new AdvancedModelRenderer(this);
        this.stem2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.stem.addChild(stem2);
        this.stem2.cubeList.add(new ModelBox(stem2, 11, 11, -0.99F, -2.0F, -0.51F, 2, 2, 1, 0.0F, false));

        this.leaf1 = new AdvancedModelRenderer(this);
        this.leaf1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.stem2.addChild(leaf1);
        this.leaf1.cubeList.add(new ModelBox(leaf1, 0, 9, -3.0F, -3.0F, 0.0F, 6, 3, 0, 0.0F, false));
        this.leaf1.cubeList.add(new ModelBox(leaf1, 13, 14, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.leaf2 = new AdvancedModelRenderer(this);
        this.leaf2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.leaf1.addChild(leaf2);
        this.leaf2.cubeList.add(new ModelBox(leaf2, 0, 6, -3.0F, -3.0F, 0.005F, 6, 3, 0, 0.0F, false));
        this.leaf2.cubeList.add(new ModelBox(leaf2, 9, 14, -0.49F, -3.0F, -0.51F, 1, 3, 1, 0.0F, false));

        this.leaf3 = new AdvancedModelRenderer(this);
        this.leaf3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.leaf2.addChild(leaf3);
        this.leaf3.cubeList.add(new ModelBox(leaf3, 0, 3, -3.0F, -3.0F, 0.0F, 6, 3, 0, 0.0F, false));
        this.leaf3.cubeList.add(new ModelBox(leaf3, 12, 7, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.leaf4 = new AdvancedModelRenderer(this);
        this.leaf4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.leaf3.addChild(leaf4);
        this.leaf4.cubeList.add(new ModelBox(leaf4, 0, 0, -3.0F, -3.0F, 0.005F, 6, 3, 0, 0.0F, false));
        this.leaf4.cubeList.add(new ModelBox(leaf4, 12, 3, -0.49F, -3.0F, -0.51F, 1, 3, 1, 0.0F, false));

        this.leaf5 = new AdvancedModelRenderer(this);
        this.leaf5.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.leaf4.addChild(leaf5);
        this.leaf5.cubeList.add(new ModelBox(leaf5, 0, 12, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));
        this.leaf5.cubeList.add(new ModelBox(leaf5, 0, 15, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.stem.offsetY = 1.525F;
        AdvancedModelRenderer[] bodyFull = {this.stem2,this.leaf1,this.leaf2,this.leaf3,this.leaf4,this.leaf5};
        float speed = 0.061F;
        this.chainWave(bodyFull, speed, 0.15F, 2, f, 0.42F);
        this.chainFlap(bodyFull, speed, 0.08F, 1, f, 0.32F);
        this.stem.render(0.036f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
