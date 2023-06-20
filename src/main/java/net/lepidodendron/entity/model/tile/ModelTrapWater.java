package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelTrapWater extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelTrapWater() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0F, 24.0F, 0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -1.01F, -8.0F, 32, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 81, 2, 23.0F, -16.0F, -8.0F, 1, 15, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 49, 53, 8.0F, -16.01F, 8.0F, 16, 16, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 18, -7.0F, -16.0F, -8.0F, 30, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 36, -8.0F, -16.01F, 8.0F, 16, 16, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 69, -8.0F, -16.0F, -8.0F, 1, 15, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 18, -7.0F, -15.0F, -8.0F, 5, 14, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 18.0F, -15.0F, -8.0F, 5, 14, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 76, -7.0F, -18.0F, 5.5F, 3, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 34, 69, -7.0F, -18.0F, 18.0F, 3, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 69, -7.0F, -18.0F, -6.0F, 3, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 69, 20.0F, -18.0F, 18.0F, 3, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 43, 20.0F, -18.0F, 5.5F, 3, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 36, 20.0F, -18.0F, -6.0F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(19.5F, -8.0F, -8.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 86, -0.5F, -7.0F, 1.0F, 1, 14, 15, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -8.0F, -8.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 86, -0.5F, -7.0F, 1.0F, 1, 14, 15, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bone.rotateAngleY = (float)Math.toRadians(90);
        bone.offsetX = -10;
        bone.offsetZ = 10;
        bone.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
