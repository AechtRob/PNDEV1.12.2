package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBowengriphus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBowengriphus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer all;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontbit;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;

    public ModelBowengriphus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.all = new AdvancedModelRenderer(this);
        this.all.setRotationPoint(0.0F, 25.0F, 0.0F);
        this.setRotateAngle(all, 0.0F, 3.1416F, 0.0F);
        this.all.cubeList.add(new ModelBox(all, 0, 0, -4.5F, -2.0F, -2.0F, 9, 1, 5, 0.01F, false));
        this.all.cubeList.add(new ModelBox(all, 10, 22, -0.5F, -0.975F, -2.0F, 1, 0, 3, 0.0F, false));
        this.all.cubeList.add(new ModelBox(all, 2, 21, -0.5F, -2.025F, -2.0F, 1, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.55F, -2.0F);
        this.all.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 3.1416F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 25, 5, -0.5F, 0.575F, 0.0F, 1, 0, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 25, -0.5F, -0.475F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.76F, 0.05F, 2.9F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6152F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 0, 0.0261F, -0.5F, 0.0047F, 3, 1, 3, 0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.51F, 0.05F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 20, 0.0F, -0.5F, 0.0F, 3, 1, 3, 0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.76F, 0.05F, 2.9F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6152F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -3.0261F, -0.5F, 0.0047F, 3, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.51F, 0.05F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 20, -3.0F, -0.5F, 0.0F, 3, 1, 3, 0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.05F, 5.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 10, -2.0F, -4.5F, -5.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.05F, 0.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 15, -2.0F, -4.5F, 2.325F, 4, 1, 3, -0.001F, false));

        this.frontbit = new AdvancedModelRenderer(this);
        this.frontbit.setRotationPoint(0.0F, -1.5F, 3.3F);
        this.all.addChild(frontbit);
        this.frontbit.cubeList.add(new ModelBox(frontbit, 0, 7, -2.0F, -0.5F, -1.0F, 4, 1, 4, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 13, 7, -1.0F, 0.0F, 1.5F, 2, 1, 1, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 19, 25, -2.0F, -0.5F, 3.0F, 4, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.frontbit.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.7418F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 13, -3.0F, -0.5F, -2.0F, 3, 1, 2, 0.002F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.35F, 0.0F, 3.5F);
        this.frontbit.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2923F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -2.9819F, -0.5F, -3.982F, 3, 1, 4, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.35F, 0.0F, 3.5F);
        this.frontbit.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2923F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -0.0181F, -0.5F, -3.982F, 3, 1, 4, 0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, 0.0F, 5.0F);
        this.frontbit.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7418F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 13, 0.0F, -0.5F, -2.0F, 3, 1, 2, 0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.all.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(all, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontbit, 0.0F, 0.0F, 0.0F);
        this.all.offsetZ = -0.0F;
        this.all.offsetY = 0.32F;
        this.all.offsetX = -0.0F;
        this.all.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.all.offsetY = -2.2F;
        this.all.offsetX = 0.0F;
        this.all.rotateAngleY = (float)Math.toRadians(200);
        this.all.rotateAngleX = (float)Math.toRadians(8);
        this.all.rotateAngleZ = (float)Math.toRadians(-8);
        this.all.scaleChildren = true;
        float scaler = 9.5F;
        this.all.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(all, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(frontbit, 0.1F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.all.render(f);
        //Reset rotations, positions and sizing:
        this.all.setScale(1.0F, 1.0F, 1.0F);
        this.all.scaleChildren = false;
        resetToDefaultPose();
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

        //this.body.offsetY = 1.28F;

        EntityPrehistoricFloraBowengriphus ee = (EntityPrehistoricFloraBowengriphus) e;

        this.all.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.all.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.all.setScaleX(scaler2 * 0.85F);

        float moveWeight = 0.50F;
        this.walk(frontbit, 0.05F, -moveWeight, false, 0, moveWeight, f2, 0.5F);
        this.swing(frontbit, 0.1F, -moveWeight * 0.5F, true, 0, 0, f2, 0.5F);
        this.swing(bone, 0.09F, -moveWeight * 0.4F, true, 3, 0, f2, 0.5F);

    }
}
