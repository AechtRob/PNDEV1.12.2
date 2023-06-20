package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelTrapAir extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelTrapAir() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 54, -9.0F, -16.0F, -9.0F, 18, 2, 18, -0.002F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 33, -9.0F, -34.0F, -9.0F, 18, 2, 18, -0.002F, false));
        this.bone.cubeList.add(new ModelBox(bone, 73, 42, -3.0F, -37.0F, 8.1F, 6, 37, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 65, 0, -3.0F, -37.0F, -10.1F, 6, 37, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 25, 75, -2.0F, -39.0F, -10.0F, 4, 2, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 75, -2.0F, -39.0F, 2.0F, 4, 2, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 54, -2.0F, -17.0F, -2.0F, 4, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 33, -2.0F, -40.0F, -2.0F, 4, 9, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -31.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 74, 68, -1.0F, -10.0F, -8.0F, 2, 3, 16, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -18.0F, 7.9F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 75, -1.0F, 1.5F, 0.0F, 3, 19, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 86, -1.0F, 2.5F, -17.8F, 3, 18, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -18.0F, 7.9F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 75, -2.0F, 1.5F, 0.0F, 3, 19, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 0, -2.0F, 1.5F, -17.8F, 3, 19, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bone.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
