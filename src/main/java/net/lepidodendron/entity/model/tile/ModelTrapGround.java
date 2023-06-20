package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelTrapGround extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer open;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer closed;
    private final AdvancedModelRenderer cube_r2;

    public ModelTrapGround() {
        this.textureWidth = 128;
        this.textureHeight = 86;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 37, -7.99F, -15.0F, -24.0F, 1, 14, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 37, -7.99F, -15.0F, -8.0F, 1, 14, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 41, 37, 6.99F, -15.0F, -24.0F, 1, 14, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 41, 37, 6.99F, -15.0F, -8.0F, 1, 14, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 67, -8.0F, -15.0F, 7.01F, 16, 14, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -1.0F, -24.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 18, -8.0F, -15.99F, -24.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 18, -8.0F, -15.99F, -8.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 18, -2.0F, -16.97F, -12.0F, 4, 1, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -19.97F, -11.0F, 1, 3, 6, 0.0F, false));

        this.open = new AdvancedModelRenderer(this);
        this.open.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(open);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -15.5F, -8.0F);
        this.open.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 14, -7.0F, -0.5F, -23.0F, 14, 1, 23, 0.0F, false));

        this.closed = new AdvancedModelRenderer(this);
        this.closed.setRotationPoint(0.0F, -15.5F, -8.0F);
        this.bone.addChild(closed);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.closed.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 45, -7.0F, -0.5F, -23.0F, 14, 1, 23, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        bone.rotateAngleY = (float)Math.toRadians(90);
        bone.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
