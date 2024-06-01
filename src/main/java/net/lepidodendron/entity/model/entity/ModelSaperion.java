package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSaperion;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSaperion extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftAll;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightAll;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer leftAntennae;
    private final AdvancedModelRenderer rightAntennae;

    public ModelSaperion() {
        this.textureWidth = 50;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.95F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -1.15F, -6.75F, 1, 1, 12, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.55F, -2.25F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0523F, 0.0023F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 14, -4.0011F, 0.0236F, -4.0048F, 4, 0, 4, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0011F, -0.0014F, -4.0048F, 1, 1, 4, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0216F, -1.3795F, 5.7442F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.279F, -0.012F, -0.1728F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, -4.0003F, -0.0087F, 0.0005F, 4, 0, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, -1.525F, -2.25F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0174F, -0.0008F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -3.9731F, 0.0021F, -0.0039F, 4, 0, 8, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, -0.9731F, -0.0229F, -0.0039F, 1, 1, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.0216F, -1.3795F, 5.7442F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.279F, 0.012F, 0.1728F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, 0.0003F, -0.0087F, 0.0005F, 4, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.025F, -1.525F, -2.25F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0174F, 0.0008F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.0269F, -0.0229F, -0.0039F, 1, 1, 8, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -0.0269F, 0.0021F, -0.0039F, 4, 0, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.55F, -2.25F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0523F, -0.0023F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0011F, -0.0014F, -4.0048F, 1, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 14, 0.0011F, 0.0236F, -4.0048F, 4, 0, 4, 0.0F, false));

        this.leftAll = new AdvancedModelRenderer(this);
        this.leftAll.setRotationPoint(0.5F, -0.3F, -1.5F);
        this.main.addChild(leftAll);


        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.leftAll.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, 0.0F, 0.1745F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.leftAll.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.1745F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftAll.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.1745F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.leftAll.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.1745F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.leftAll.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.1745F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.leftAll.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.1745F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.leftAll.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.1745F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 0, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightAll = new AdvancedModelRenderer(this);
        this.rightAll.setRotationPoint(-0.5F, -0.3F, -1.5F);
        this.main.addChild(rightAll);


        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.rightAll.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, -0.1745F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.rightAll.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.1745F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightAll.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.1745F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.rightAll.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.1745F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rightAll.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.1745F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.rightAll.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.1745F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.rightAll.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.1745F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 0, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftAntennae = new AdvancedModelRenderer(this);
        this.leftAntennae.setRotationPoint(0.5F, -0.4F, -5.75F);
        this.main.addChild(leftAntennae);
        this.setRotateAngle(leftAntennae, 0.0F, -0.4363F, 0.0F);
        this.leftAntennae.cubeList.add(new ModelBox(leftAntennae, 22, 20, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.rightAntennae = new AdvancedModelRenderer(this);
        this.rightAntennae.setRotationPoint(-0.5F, -0.4F, -5.75F);
        this.main.addChild(rightAntennae);
        this.setRotateAngle(rightAntennae, 0.0F, 0.4363F, 0.0F);
        this.rightAntennae.cubeList.add(new ModelBox(rightAntennae, 22, 20, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftAntennae, 0.0F, 0.05F, 0.3F);
        this.setRotateAngle(rightAntennae, 0.0F, -0.05F, 0.5F);
        this.main.offsetZ = -0.03F;
        this.main.offsetY = 0.099F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.main.offsetZ = 0.030F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.6F;
        this.main.offsetX = 0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 5.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.9F, 0.5F, -0.3F);
        this.setRotateAngle(leftAntennae, 0.0F, 0.05F, 0.2F);
        this.setRotateAngle(rightAntennae, 0.0F, -0.05F, 0.3F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.bone.offsetY = 0.975F;

        AdvancedModelRenderer[] legsL = {this.leftLeg, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7};
        AdvancedModelRenderer[] legsR = {this.rightLeg, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7};


        if (((EntityPrehistoricFloraSaperion) e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.flap(leftLeg, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        }

        this.swing(leftAntennae, 0.4F, -0.22F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntennae, 0.4F, 0.22F, false, 0, 0.1F, f2, 0.8F);

    }
}
