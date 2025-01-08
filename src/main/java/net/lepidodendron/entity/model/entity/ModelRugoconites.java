package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraDickinsonia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRugoconites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelRugoconites() {
        this.textureWidth = 65;
        this.textureHeight = 30;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.9F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 3, 6.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -7.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 19, 5.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 19, -6.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 1, -2.0F, -1.9F, -7.0F, 4, 1, 14, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 17, 2.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 37, 3, -4.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 19, 4.0F, -1.9F, -5.0F, 1, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 3, -5.0F, -1.9F, -5.0F, 1, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 1, 0.25F, -1.95F, -0.5F, 6, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.95F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -2.0944F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 1, 0.25F, -1.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.95F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 2.0944F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 1, 0.25F, -1.0F, -0.5F, 6, 0, 1, 0.0F, false));

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
