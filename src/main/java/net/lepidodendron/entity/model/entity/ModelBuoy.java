package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBuoy extends AdvancedModelBase {
    private final AdvancedModelRenderer Glowybits;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelBuoy() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 26.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -5.0F, -8.0F, 16, 12, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 29, -5.0F, 7.0F, -5.0F, 10, 8, 10, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 31, 29, -3.0F, 15.0F, -3.0F, 6, 3, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 33, 40, -4.0F, -24.0F, -4.0F, 8, 5, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 5, 4, -0.5F, -28.0F, -3.0F, 1, 4, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 4, -0.5F, -30.0F, 2.0F, 1, 6, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, 18.0F, -0.5F, 4, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.9867F, -12.4965F, 3.7415F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4922F, -1.3911F, -1.4843F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 0, -0.0847F, -2.8374F, 0.5044F, 1, 5, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.9867F, -12.4965F, -3.7415F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.4922F, 1.3911F, -1.4843F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 54, -0.0847F, -2.8374F, -7.5044F, 1, 5, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.9867F, -12.4965F, -3.2585F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0221F, -0.2084F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 48, -0.2397F, -2.8374F, -1.0973F, 1, 5, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.9867F, -12.4965F, -3.2585F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0221F, 0.2084F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 48, -0.7603F, -2.8374F, -1.0973F, 1, 5, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.0F, -5.1F, -6.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2114F, 0.0651F, 0.2084F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 54, -1.0F, -14.9F, -1.0F, 2, 16, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(6.0F, -5.1F, -6.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2114F, -0.0651F, -0.2084F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 29, -1.0F, -14.9F, -1.0F, 2, 16, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(6.0F, -5.1F, 6.0F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2114F, 0.0651F, -0.2084F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 62, -1.0F, -14.9F, -1.0F, 2, 16, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.0F, -5.1F, 6.0F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2114F, -0.0651F, 0.2084F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 62, -1.0F, -14.9F, -1.0F, 2, 16, 2, 0.0F, false));

        this.Glowybits = new AdvancedModelRenderer(this);
        this.Glowybits.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(Glowybits);
        this.Glowybits.cubeList.add(new ModelBox(Glowybits, 19, 77, -0.5F, -30.0F, -3.0F, 1, 2, 1, 0.0F, false));
        this.Glowybits.cubeList.add(new ModelBox(Glowybits, 19, 73, -1.0F, -25.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.Glowybits.cubeList.add(new ModelBox(Glowybits, 19, 69, -1.0F, -31.0F, 1.5F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.offsetY = -0.6F;
        bone.render(f5);
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

        this.walk(bone, 0.05F, 0.15F, false, 0, 0.075F, f2, 1F);
        this.flap(bone, 0.05F, -0.15F, false, 2F, -0.075F, f2, 1F);
        this.swing(bone, 0.1F, 0.1F, false, 0, -0.05F, f2, 1F);
        this.bob(bone, 0.1F, 1.15F, false, f2, 1F);
    }
}
