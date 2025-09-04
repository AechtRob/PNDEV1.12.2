package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelMegasiphon extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer inside;

    public ModelMegasiphon() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, 1.0F, -2.0F, 7, 9, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 18, -3.0F, 0.0F, -1.5F, 6, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 28, -0.5F, 10.0F, -1.5F, 1, 1, 3, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 25, 0.757F, 8.3346F, -1.5F, 3, 4, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 27, 1.257F, 12.3346F, -1.0F, 2, 1, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 27, 1.257F, 12.3346F, 1.0F, 2, 1, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 23, 3.257F, 12.3346F, -1.0F, 0, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 23, 1.257F, 12.3346F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 11, -3.757F, 8.3346F, -1.5F, 3, 3, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 23, -1.257F, 11.3346F, -1.0F, 0, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 27, -3.257F, 11.3346F, -1.0F, 2, 1, 0, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 25, -3.257F, 11.3346F, 1.0F, 2, 1, 0, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 23, -3.257F, 11.3346F, -1.0F, 0, 1, 2, 0.0F, false));


        this.inside = new AdvancedModelRenderer(this);
        this.inside.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(inside);
        this.inside.cubeList.add(new ModelBox(inside, 0, 14, -3.0F, 1.5F, -1.5F, 6, 7, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.main.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
