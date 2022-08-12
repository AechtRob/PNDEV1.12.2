package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelGoniocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelGoniocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, -5.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -1.975F, -3.0F, 6, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 10, 20, 2.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 18, -5.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 13, -2.0F, -2.5F, -3.0F, 4, 1, 4, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 30, 21, -1.5F, -2.5F, 1.0F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 28, -1.49F, -2.4F, 3.75F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 31, -1.0F, -2.3F, 6.5F, 2, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 31, -0.99F, -2.15F, 9.5F, 2, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 15, -2.5F, -2.0F, 1.0F, 5, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 4, -2.0F, -2.01F, 3.75F, 4, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 25, 26, -1.5F, -2.0F, 6.5F, 3, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 18, 4, -1.0F, -2.0F, 12.25F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 6, -0.5F, -1.75F, 14.25F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -4.225F, -1.274F, 14.5F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 16, -4.5F, -1.274F, 10.5F, 2, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, 3.225F, -1.275F, 14.5F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 10, 2.5F, -1.275F, 10.5F, 2, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -4.75F, -1.276F, 4.5F, 3, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 21, -5.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 7, 1.75F, -1.276F, 4.5F, 3, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 0, -3.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 2, 0.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, 2.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.offsetY = -1.5F;
        this.bone.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
