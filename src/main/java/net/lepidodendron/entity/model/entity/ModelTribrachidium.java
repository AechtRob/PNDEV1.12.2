package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTribrachidium extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r3;

    public ModelTribrachidium() {
        this.textureWidth = 80;
        this.textureHeight = 25;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.9F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 0, -6.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 21, 6, 5.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 0, -7.0F, -0.9F, -7.0F, 14, 0, 14, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -1.9F, -6.0F, 4, 1, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -4.0F, -1.9F, -5.0F, 2, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 56, 10, 2.0F, -1.9F, -5.0F, 2, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 14, -5.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 62, 0, 4.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -0.7854F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, -3, 0, -1.0F, 0.975F, 1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.bone2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -3, 4, -1.0F, 0.475F, -3.0F, 1, 0, 3, -0.001F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.main.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, 1.309F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, 0.975F, 1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -1.0F, 0.975F, -3.0F, 1, 0, 3, -0.001F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.main.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, -2.8798F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 3, 0, -1.0F, 0.975F, 1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 4, -1.0F, 0.975F, -3.0F, 1, 0, 3, -0.001F, false));
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
