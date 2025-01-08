package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAnfesta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelAnfesta() {
        this.textureWidth = 30;
        this.textureHeight = 20;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.0F, -5.0F, 6, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 10, 3.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -4.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 3, 1.3F, -1.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 2.618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 3, 1.3F, -1.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, -1.5708F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 3, 0.7F, -1.0F, -0.5F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

    }
}
