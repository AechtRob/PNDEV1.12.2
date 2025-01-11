package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPrimocandelabrum extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer stem;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer stem3;
    private final AdvancedModelRenderer frond;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer cube_r3;

    public ModelPrimocandelabrum() {
        textureWidth = 16;
        textureHeight = 16;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(8.0F, 24.0F, -8.0F);
        main.cubeList.add(new ModelBox(main, 0, 13, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, -3, 8, -10.0F, -0.04F, 6.0F, 4, 0, 4, 0.0F, false));

        stem = new AdvancedModelRenderer(this);
        stem.setRotationPoint(-8.0F, -1.0F, 8.0F);
        main.addChild(stem);
        stem.cubeList.add(new ModelBox(stem, 12, 6, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        stem2 = new AdvancedModelRenderer(this);
        stem2.setRotationPoint(0.0F, -1.0F, 0.0F);
        stem.addChild(stem2);
        stem2.cubeList.add(new ModelBox(stem2, 12, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        stem3 = new AdvancedModelRenderer(this);
        stem3.setRotationPoint(0.0F, -2.0F, 0.0F);
        stem2.addChild(stem3);
        stem3.cubeList.add(new ModelBox(stem3, 12, 2, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        stem3.cubeList.add(new ModelBox(stem3, 12, 0, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond = new AdvancedModelRenderer(this);
        frond.setRotationPoint(0.0F, -0.5F, 0.0F);
        stem3.addChild(frond);
        setRotateAngle(frond, 0.0873F, 0.0F, 0.0F);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.25F);
        frond.addChild(cube_r1);
        setRotateAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 8, -0.5F, -7.0F, -0.5F, 1, 7, 1, 0.002F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.5F, -7.0F, 0.0F, 5, 7, 0, 0.0F, false));

        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(0.0F, -0.5F, 0.0F);
        stem3.addChild(frond2);
        setRotateAngle(frond2, -3.0543F, -1.0472F, 3.1416F);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.25F);
        frond2.addChild(cube_r2);
        setRotateAngle(cube_r2, -1.1781F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 8, -0.5F, -7.0F, -0.5F, 1, 7, 1, 0.002F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.5F, -7.0F, 0.0F, 5, 7, 0, 0.0F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(0.0F, -0.5F, 0.0F);
        stem3.addChild(frond3);
        setRotateAngle(frond3, -3.0543F, 1.0472F, 3.1416F);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.25F);
        frond3.addChild(cube_r3);
        setRotateAngle(cube_r3, -1.1781F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 8, -0.5F, -7.0F, -0.5F, 1, 7, 1, 0.002F, false));
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.5F, -7.0F, 0.0F, 5, 7, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        frond.walk(0.05F, 0.2F, false, 0, 0.2F, f, 0.38F);
        frond2.walk(0.05F, 0.2F, false, 1.1F, 0.2F, f, 0.38F);
        frond3.walk(0.05F, 0.2F, false, 2.2F, 0.2F, f, 0.38F);
        this.main.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
