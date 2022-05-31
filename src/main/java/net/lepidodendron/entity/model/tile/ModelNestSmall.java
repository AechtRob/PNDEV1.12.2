package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelNestSmall extends ModelBase {
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

    public ModelNestSmall() {
        this.textureWidth = 96;
        this.textureHeight = 64;

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -32, 0, -16.0F, 0.0F, -16.0F, 16, 0, 32, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -16.0F, 0.0F, -16.0F, 32, 0, 16, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -32, 31, 0.0F, 0.0F, -16.0F, 16, 0, 32, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 16, -16.0F, 0.0F, 0.0F, 32, 0, 16, 0.0F, false));

    }

    public void renderAll(float f) {
        main.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
