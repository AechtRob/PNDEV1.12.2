package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelShankouclava extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer inner;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelShankouclava() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 9, 10, -1.0F, 3.275F, 0.675F, 2, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 16, 2.0F, -7.05F, 0.4F, 0, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 16, -1.0F, -7.05F, 0.4F, 0, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 16, -1.0F, -7.05F, 0.4F, 3, 1, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -1.0F, -7.05F, 2.4F, 3, 1, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -6.05F, -0.1F, 4, 6, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 6, 0.0F, 1.3F, 0.3F, 1, 3, 1, 0.0F, false));

        this.inner = new AdvancedModelRenderer(this);
        this.inner.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.main.addChild(inner);
        this.inner.cubeList.add(new ModelBox(inner, 15, 0, 0.0F, -2.1045F, -0.2693F, 1, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -0.1045F, 0.2307F);
        this.inner.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 11, -0.5F, -1.625F, 0.1F, 0, 3, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -4.0F, -0.1F);
        this.inner.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -1.5F, -2.0F, -1.0F, 2, 4, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {

        this.main.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
