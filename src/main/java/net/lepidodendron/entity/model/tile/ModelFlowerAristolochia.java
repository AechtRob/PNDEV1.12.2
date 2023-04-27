package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerAristolochia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;

    public ModelFlowerAristolochia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 18.0F, 3.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 16, -6.0F, -10.0F, -2.75F, 12, 16, 0, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -10.0F, -2.575F, 12, 16, 0, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 13, -0.5F, -6.0F, 1.0F, 1, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 0, -1.5F, -5.0F, 0.0F, 3, 5, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 8, -2.0F, -4.0F, -2.75F, 4, 3, 2, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 36, 8, -2.0F, -4.0F, -2.75F, 4, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 18, -1.0F, -3.0F, -1.75F, 2, 3, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
