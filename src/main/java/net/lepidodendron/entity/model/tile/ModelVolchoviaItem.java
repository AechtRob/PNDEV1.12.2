package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelVolchoviaItem extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;

    public ModelVolchoviaItem() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(8.0F, 24.2F, -7.6578F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -11.5F, -1.2F, 5.1578F, 7, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 5, 16, -10.5F, -1.2F, 10.1578F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 5, 13, -10.5F, -1.2F, 4.1578F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 7, -10.0F, -2.2F, 5.6578F, 4, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 2, -8.5F, -2.175F, 5.6328F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 7, -9.0F, -2.95F, 6.6578F, 2, 1, 2, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(-5.8F, -0.59F, 5.0186F);
        this.main.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 2.4347F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5149F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 15, -1.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5149F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 11, -2.0F, 0.02F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-10.2F, -0.59F, 5.0186F);
        this.main.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, -2.4347F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5149F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 11, -2.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5149F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 15, -1.0F, 0.03F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-6.6F, -0.6F, 11.5F);
        this.main.addChild(bone);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.7F, 0.0F, 0.2F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5149F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 15, -1.0F, 0.02F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, 0.0F, 0.2F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5149F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 11, -2.0F, 0.03F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-11.3F, -0.59F, 8.9186F);
        this.main.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, -1.2654F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5149F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 11, -2.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5149F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 15, -1.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-4.7F, -0.59F, 8.9186F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 1.2654F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5149F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 15, -1.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5149F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 11, -2.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.main.offsetY = -24F;
        this.main.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
