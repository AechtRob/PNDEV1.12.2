package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYorgia extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer yorgprint;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer yorgprint2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer yorgprint3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer yorgprint4;
    private final AdvancedModelRenderer cube_r6;

    public ModelSkeletonYorgia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(2.8441F, 22.4563F, -2.9244F);
        this.root.cubeList.add(new ModelBox(root, 0, 17, -7.8441F, -0.4562F, -15.0756F, 10, 2, 15, 0.0F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, -19.8441F, -0.4562F, -14.0756F, 12, 2, 15, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.8441F, 1.5438F, -7.0756F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.0036F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 37, -4.6556F, -2.025F, -5.3292F, 11, 0, 10, 0.005F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-13.7719F, -0.6062F, -6.0565F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9163F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 18, -4.95F, 0.0F, -4.0F, 11, 0, 10, 0.0F, false));

        this.yorgprint = new AdvancedModelRenderer(this);
        this.yorgprint.setRotationPoint(-2.8441F, 1.5438F, -7.0756F);
        this.root.addChild(yorgprint);
        this.yorgprint.cubeList.add(new ModelBox(yorgprint, 0, 17, 5.0F, -2.0F, -8.0F, 12, 2, 15, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(10.0F, 0.0F, 0.0F);
        this.yorgprint.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 35, -4.2945F, -2.025F, -3.5604F, 11, 2, 10, 0.0F, false));

        this.yorgprint2 = new AdvancedModelRenderer(this);
        this.yorgprint2.setRotationPoint(-2.8441F, 1.5438F, 7.9244F);
        this.root.addChild(yorgprint2);
        this.yorgprint2.cubeList.add(new ModelBox(yorgprint2, 0, 17, 7.0F, -2.0F, -8.0F, 12, 2, 15, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(12.0F, 0.0F, 0.0F);
        this.yorgprint2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 35, -4.7945F, -2.025F, -5.6604F, 11, 2, 10, 0.0F, false));

        this.yorgprint3 = new AdvancedModelRenderer(this);
        this.yorgprint3.setRotationPoint(-14.8441F, 1.6438F, 7.9244F);
        this.root.addChild(yorgprint3);
        this.yorgprint3.cubeList.add(new ModelBox(yorgprint3, 0, 17, 7.0F, -2.0F, -8.0F, 12, 2, 15, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(12.0F, 0.0F, 0.0F);
        this.yorgprint3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.7017F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 35, -9.3945F, -2.125F, -6.7854F, 11, 2, 10, 0.0F, false));

        this.yorgprint4 = new AdvancedModelRenderer(this);
        this.yorgprint4.setRotationPoint(-26.8441F, 1.6438F, 7.9244F);
        this.root.addChild(yorgprint4);
        this.yorgprint4.cubeList.add(new ModelBox(yorgprint4, 4, 20, 9.0F, -2.0F, -8.0F, 10, 2, 12, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(12.0F, 0.0F, 0.0F);
        this.yorgprint4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -2.3562F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 35, -11.6945F, -2.2F, -5.2854F, 11, 2, 10, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
