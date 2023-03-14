package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSharkEmbryo extends AdvancedModelBase {
    private final AdvancedModelRenderer fossil;
    private final AdvancedModelRenderer delphyo;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelSkeletonSharkEmbryo() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new AdvancedModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.01F, false));

        this.delphyo = new AdvancedModelRenderer(this);
        this.delphyo.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(delphyo);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.8451F, -1.075F, -2.7304F);
        this.delphyo.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -2.9234F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 21, -4.0F, 0.0F, -3.0F, 5, 0, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -1.075F, -1.0F);
        this.delphyo.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 30, -6.4F, 0.0F, -4.0F, 8, 0, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.5F, -1.075F, 3.0F);
        this.delphyo.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.8727F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -1, 30, -2.6F, 0.0F, -2.0F, 7, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
