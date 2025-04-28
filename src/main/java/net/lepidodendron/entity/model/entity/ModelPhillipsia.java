package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhillipsia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer LegR6;
    private final AdvancedModelRenderer LegL6;
    private final AdvancedModelRenderer LegR7;
    private final AdvancedModelRenderer LegL7;
    private final AdvancedModelRenderer LegR5;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer LegR2;

    public ModelPhillipsia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.4F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 12, 23, 1.5F, -1.3F, -4.8F, 1, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 6, 21, -1.0F, -0.898F, -6.9944F, 2, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 18, -0.1364F, -0.9F, -3.1558F, 4, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 18, -3.8636F, -0.9F, -3.1558F, 4, 1, 1, 0.0F, true));
        this.Body.cubeList.add(new ModelBox(Body, 16, 1, -1.5F, -1.2677F, -6.5945F, 3, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 10, 13, -0.5F, -1.75F, -4.2F, 1, 0, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 18, -1.0F, -1.75F, -4.2F, 2, 1, 2, -0.001F, false));
        this.Body.cubeList.add(new ModelBox(Body, 20, 21, -1.5F, -1.75F, -4.65F, 3, 1, 1, 0.002F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 21, -1.5F, -1.55F, -3.65F, 3, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 6, -3.0F, -0.898F, -4.9944F, 6, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 23, -2.5F, -1.3F, -4.8F, 1, 1, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.8636F, 0.1F, -2.1558F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 0, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.6914F, -0.9F, -5.9173F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.0036F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 18, 0.0F, 0.0F, -2.0F, 2, 1, 2, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.8636F, -0.9F, -3.1558F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4014F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 8, 0.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.6914F, -0.9F, -5.9173F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0036F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 18, -2.0F, 0.0F, -2.0F, 2, 1, 2, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.8636F, 0.1F, -2.1558F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.501F, -0.8689F, -6.5456F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 4, -3.001F, -0.3978F, 0.05F, 3, 1, 2, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.8636F, -0.9F, -3.1558F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.4014F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 8, -2.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -3.5F, 0.0F, 0.0F, 7, 1, 2, -0.0001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 20, -1.0F, -0.85F, 0.0F, 2, 1, 2, -0.0011F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 6, 15, -0.5F, -0.8499F, 0.0F, 1, 0, 2, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 3, -3.5F, 0.0F, 0.0F, 7, 1, 2, -0.0002F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 7, -1.0F, -0.85F, 0.0F, 2, 1, 2, -0.0012F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 16, 12, -0.5F, -0.8498F, 0.0F, 1, 0, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 14, 18, -0.5F, 0.0F, 3.575F, 1, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 9, -3.5F, 0.0F, 0.0F, 7, 1, 1, -0.0003F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 11, -3.0F, 0.0F, 1.0F, 6, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 13, -2.5F, 0.0F, 2.0F, 5, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 16, -1.5F, 0.0F, 2.8F, 3, 1, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0162F, 0.0F, 2.9406F);
        this.Body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.9948F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 12, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.002F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.7419F, 0.0F, 0.0297F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2443F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, 0.0F, 0.0F, 1.0F, 3, 1, 2, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.85F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2094F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 23, -0.5F, 0.0F, 2.0F, 1, 1, 2, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 12, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0162F, 0.0F, 2.9406F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.9948F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 12, -2.0F, 0.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.7419F, 0.0F, 0.0297F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2443F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, -3.0F, 0.0F, 1.0F, 3, 1, 2, -0.001F, false));

        this.LegR6 = new AdvancedModelRenderer(this);
        this.LegR6.setRotationPoint(-0.75F, 1.0F, 1.2F);
        this.Body4.addChild(LegR6);
        this.setRotateAngle(LegR6, 0.0F, 0.0F, -0.1745F);
        this.LegR6.cubeList.add(new ModelBox(LegR6, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL6 = new AdvancedModelRenderer(this);
        this.LegL6.setRotationPoint(0.75F, 1.0F, 1.2F);
        this.Body4.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, 0.1745F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR7 = new AdvancedModelRenderer(this);
        this.LegR7.setRotationPoint(-0.25F, 1.0F, 2.8F);
        this.Body4.addChild(LegR7);
        this.setRotateAngle(LegR7, 0.0F, 0.0F, -0.1745F);
        this.LegR7.cubeList.add(new ModelBox(LegR7, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL7 = new AdvancedModelRenderer(this);
        this.LegL7.setRotationPoint(0.25F, 1.0F, 2.8F);
        this.Body4.addChild(LegL7);
        this.setRotateAngle(LegL7, 0.0F, 0.0F, 0.1745F);
        this.LegL7.cubeList.add(new ModelBox(LegL7, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR5 = new AdvancedModelRenderer(this);
        this.LegR5.setRotationPoint(-0.95F, 1.0F, 1.6F);
        this.Body3.addChild(LegR5);
        this.setRotateAngle(LegR5, 0.0F, 0.0F, -0.1745F);
        this.LegR5.cubeList.add(new ModelBox(LegR5, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(0.95F, 1.0F, 1.6F);
        this.Body3.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, 0.1745F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-0.95F, 1.0F, 0.4F);
        this.Body2.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.95F, 1.0F, 0.4F);
        this.Body2.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(-0.95F, 1.0F, 2.0F);
        this.Body2.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.0F, -0.1745F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(0.95F, 1.0F, 2.0F);
        this.Body2.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, 0.1745F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.75F, 0.1F, -6.0F);
        this.Body.addChild(AntennaL);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 8, 16, 0.0F, 0.01F, -2.0F, 3, 0, 2, 0.0F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.75F, 0.1F, -6.0F);
        this.Body.addChild(AntennaR);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 8, 16, -3.0F, 0.01F, -2.0F, 3, 0, 2, 0.0F, true));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(0.25F, 0.1F, -5.0F);
        this.Body.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.1745F);
        this.LegL.cubeList.add(new ModelBox(LegL, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.85F, 0.1F, -3.4F);
        this.Body.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 13, 7, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-0.25F, 0.1F, -5.0F);
        this.Body.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.1745F);
        this.LegR.cubeList.add(new ModelBox(LegR, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-0.85F, 0.1F, -3.4F);
        this.Body.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.1745F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 13, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.Body.offsetY = 0.04F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.4F;
        this.Body.offsetX = 0.0F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(0);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 3.0F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
        //this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.LegL, this.LegL2, this.LegL3, this.LegL4, this.LegL5, this.LegL6, this.LegL7};
        AdvancedModelRenderer[] legsR = {this.LegR, this.LegR2, this.LegR3, this.LegR4, this.LegR5, this.LegR6, this.LegR7};
        AdvancedModelRenderer[] bodyF = {this.Body2, this.Body3, this.Body4};

        this.chainWave(legsL, 0.2F, 0.2F * -1, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F * -1, -3, f2, 1);

        this.swing(AntennaL, 0.3F, -0.2F, true, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaR, 0.3F, 0.2F, true, 0, 0.1F, f2, 0.8F);

        if (f3 != 0) {
            this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
        }

        this.flap(LegL, 0.5F, -0.5F * -1, true, 0, -0.5F * -1, f2, 0.3F);
        this.flap(LegR, 0.5F, 0.5F * -1, true, 0, 0.5F * -1, f2, 0.3F);
        this.flap(LegL2, 0.5F, -0.5F * -1, true, 1.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR2, 0.5F, 0.5F * -1, true, 1.0F, 0.5F * -1, f2, 0.3F);
        this.flap(LegL3, 0.5F, -0.5F * -1, true, 2.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR3, 0.5F, 0.5F * -1, true, 2.0F, 0.5F * -1, f2, 0.3F);
        this.flap(LegL4, 0.5F, -0.5F * -1, true, 3.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR4, 0.5F, 0.5F * -1, true, 3.0F, 0.5F * -1, f2, 0.3F);
        this.flap(LegL5, 0.5F, -0.5F * -1, true, 4.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR5, 0.5F, 0.5F * -1, true, 4.0F, 0.5F * -1, f2, 0.3F);
        this.flap(LegL6, 0.5F, -0.5F * -1, true, 5.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR6, 0.5F, 0.5F * -1, true, 5.0F, 0.5F * -1, f2, 0.3F);
        this.flap(LegL7, 0.5F, -0.5F * -1, true, 6.0F, -0.5F * -1, f2, 0.3F);
        this.flap(LegR7, 0.5F, 0.5F * -1, true, 6.0F, 0.5F * -1, f2, 0.3F);

    }
}
