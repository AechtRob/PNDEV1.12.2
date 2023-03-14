package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLimulid extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer part2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer part3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;

    public ModelSkeletonLimulid() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 23.25F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -3.0F, -0.65F, -12.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -9.0F, -0.65F, -15.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -18.0F, -0.65F, -14.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -16.0F, -0.65F, 0.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -5.0F, -0.65F, 4.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -1.0F, -0.65F, 20.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -15.0F, -0.65F, 16.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -11.0F, -0.65F, 31.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -12.0F, -0.65F, 45.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -13.0F, -0.65F, 61.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, 1.0F, -0.65F, 68.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -8.0F, -0.65F, 77.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -15.0F, -0.65F, 77.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, -11.0F, -0.65F, 90.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, 4.0F, -0.65F, 36.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, 3.0F, -0.65F, 52.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 48, 48, -6.0F, -0.75F, 17.0F, 12, 0, 12, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 48, -3.0F, -0.75F, 29.0F, 12, 0, 12, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 48, -3.0F, -0.75F, 67.0F, 12, 0, 12, 0.0F, true));
        this.bone.cubeList.add(new ModelBox(bone, 24, 48, -6.0F, -0.75F, 79.0F, 12, 0, 12, 0.0F, true));
        this.bone.cubeList.add(new ModelBox(bone, 0, 48, -2.0F, -0.75F, 42.0F, 12, 0, 12, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 48, -2.0F, -0.75F, 55.0F, 12, 0, 12, 0.0F, true));
        this.bone.cubeList.add(new ModelBox(bone, 55, 0, -7.0F, -0.7F, 4.0F, 12, 0, 12, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 55, 0, -8.0F, -0.75F, 93.0F, 12, 0, 12, 0.0F, true));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(-4.0F, 1.725F, 0.0F);
        this.bone.addChild(carapace);
        this.setRotateAngle(carapace, 0.0F, 0.2618F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 60, -4.5F, -2.75F, -6.0F, 9, 1, 8, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 34, 31, -7.5F, -2.65F, -10.0F, 15, 0, 14, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -9.0F, -2.47F, -10.5F, 18, 0, 31, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.5F, 2.0F);
        this.carapace.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 13, 3, -2.0F, -0.25F, 0.0F, 4, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 7, -1.5F, -0.25F, 4.0F, 3, 1, 2, 0.0F, false));

        this.part2 = new AdvancedModelRenderer(this);
        this.part2.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.abdomen.addChild(part2);
        this.part2.cubeList.add(new ModelBox(part2, 0, 2, -1.75F, -0.3F, 5.5F, 1, 0, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.part2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.48F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -0.75F, -0.9F, -0.25F, 3, 1, 7, 0.0F, false));

        this.part3 = new AdvancedModelRenderer(this);
        this.part3.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.abdomen.addChild(part3);
        this.part3.cubeList.add(new ModelBox(part3, 0, 0, 0.75F, -0.3F, 5.5F, 1, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -0.35F, 0.0F);
        this.part3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.48F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 0, -2.5F, -0.4F, -0.25F, 2, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.0F, -0.35F, 0.0F);
        this.part3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.5F, -0.4F, -0.25F, 2, 0, 7, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -2.25F, -0.55F, -0.25F, 3, 1, 7, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.abdomen.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, -0.75F, 0.0F, 1, 1, 11, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
