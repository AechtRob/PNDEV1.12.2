package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelCoronacollina extends AdvancedModelBase {
    private final AdvancedModelRenderer bb_main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelCoronacollina() {
        textureWidth = 80;
        textureHeight = 25;

        bb_main = new AdvancedModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
        bb_main.addChild(cube_r1);
        setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.0F, 3.0F, 1, 1, 24, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -3.0F, 0.0F);
        bb_main.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 0, -27.0F, -1.0F, -0.5F, 24, 1, 1, 0.0F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -3.0F, 0.0F);
        bb_main.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -1.0F, -27.0F, 1, 1, 24, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -3.0F, 0.0F);
        bb_main.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 0, 3.0F, -1.0F, -0.5F, 24, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bb_main.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
