package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChotecops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer LegR5;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer LegL6;
    private final AdvancedModelRenderer LegR6;
    private final AdvancedModelRenderer Telson;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer LegR7;
    private final AdvancedModelRenderer LegL7;

    public ModelChotecops() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 9, -3.5F, -1.0F, -5.0F, 7, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 15, -1.5F, -1.0F, -7.0F, 3, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 1, 25, -0.5F, -1.535F, -4.0F, 1, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 18, -1.0F, -1.5F, -5.0F, 2, 1, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, 6.5F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.9338F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 16, -1.8F, -1.0F, -1.5F, 1, 1, 1, -0.02F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, 6.5F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9338F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 16, 0.8F, -1.0F, -1.5F, 1, 1, 1, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 0.0F, -6.5F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, 0.55F, -1.0F, 0.0F, 2, 1, 2, -0.02F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 21, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.75F, 0.0F, -5.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6545F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -1.0F, -1.4F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.75F, 0.0F, -5.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6545F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, 0.0F, -1.4F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -1.5F, 0.0F, -2.025F, 3, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, -6.5F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6545F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, -2.55F, -1.0F, 0.0F, 2, 1, 2, -0.02F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 21, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.75F, 0.0F, -6.0F);
        this.Body.addChild(AntennaR);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 13, 12, -4.0F, 0.01F, -3.0F, 4, 0, 3, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.75F, 0.0F, -6.0F);
        this.Body.addChild(AntennaL);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 13, 12, 0.0F, 0.01F, -3.0F, 4, 0, 3, 0.0F, true));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-0.75F, 0.0F, -5.0F);
        this.Body.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.1745F);
        this.LegR.cubeList.add(new ModelBox(LegR, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(0.75F, 0.0F, -5.0F);
        this.Body.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.1745F);
        this.LegL.cubeList.add(new ModelBox(LegL, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.75F, 0.0F, -3.5F);
        this.Body.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-0.75F, 0.0F, -3.5F);
        this.Body.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.1745F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 6, -3.5F, -0.5F, 0.0F, 7, 1, 2, -0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 8, 18, -1.0F, -0.85F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 25, -0.5F, -0.875F, 0.0F, 1, 0, 2, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-0.75F, 0.5F, 1.0F);
        this.Body2.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.75F, 0.5F, 1.0F);
        this.Body2.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 3, -3.5F, -0.5F, 0.0F, 7, 1, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 25, -0.5F, -0.885F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 16, 4, -1.0F, -0.85F, 0.0F, 2, 1, 2, 0.01F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(-0.75F, 0.5F, 1.0F);
        this.Body3.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.0F, -0.1745F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(0.75F, 0.5F, 1.0F);
        this.Body3.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, 0.1745F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -3.5F, -0.5F, 0.0F, 7, 1, 2, -0.01F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 25, -0.5F, -0.9F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 16, 1, -1.0F, -0.85F, 0.0F, 2, 1, 2, 0.0F, false));

        this.LegR5 = new AdvancedModelRenderer(this);
        this.LegR5.setRotationPoint(-0.75F, 0.5F, 1.0F);
        this.Body4.addChild(LegR5);
        this.setRotateAngle(LegR5, 0.0F, 0.0F, -0.1745F);
        this.LegR5.cubeList.add(new ModelBox(LegR5, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(0.75F, 0.5F, 1.0F);
        this.Body4.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, 0.1745F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 1, 26, -0.5F, -0.885F, 0.0F, 1, 0, 1, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 12, -3.5F, -0.5F, 0.0F, 7, 1, 1, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 18, 10, -1.0F, -0.85F, 0.0F, 2, 1, 1, 0.01F, false));

        this.LegL6 = new AdvancedModelRenderer(this);
        this.LegL6.setRotationPoint(0.75F, 0.5F, 0.5F);
        this.Body5.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, 0.1745F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 15, 0, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegR6 = new AdvancedModelRenderer(this);
        this.LegR6.setRotationPoint(-0.75F, 0.5F, 0.5F);
        this.Body5.addChild(LegR6);
        this.setRotateAngle(LegR6, 0.0F, 0.0F, -0.1745F);
        this.LegR6.cubeList.add(new ModelBox(LegR6, 15, 0, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Telson = new AdvancedModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body5.addChild(Telson);
        this.Telson.cubeList.add(new ModelBox(Telson, 20, 21, -0.5F, -0.75F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 0, 14, -3.0F, -0.5F, 0.0F, 6, 1, 1, 0.01F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 16, 7, -1.0F, -0.5F, 0.5F, 2, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.5F, 2.5F);
        this.Telson.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.9338F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 18, -1.0F, -1.0F, -2.5F, 1, 1, 1, -0.02F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 21, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.015F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.5F, 2.5F);
        this.Telson.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.9338F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 18, 0.0F, -1.0F, -2.5F, 1, 1, 1, -0.02F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 21, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.015F, false));

        this.LegR7 = new AdvancedModelRenderer(this);
        this.LegR7.setRotationPoint(-0.75F, 0.5F, 1.0F);
        this.Telson.addChild(LegR7);
        this.setRotateAngle(LegR7, 0.0F, 0.0F, -0.2618F);
        this.LegR7.cubeList.add(new ModelBox(LegR7, 24, 3, -2.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.LegL7 = new AdvancedModelRenderer(this);
        this.LegL7.setRotationPoint(0.75F, 0.5F, 1.0F);
        this.Telson.addChild(LegL7);
        this.setRotateAngle(LegL7, 0.0F, 0.0F, 0.2618F);
        this.LegL7.cubeList.add(new ModelBox(LegL7, 24, 3, 0.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.25F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.Drotops.offsetZ = 0.1F;
        this.Body.render(0.022f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.55F;
        this.Body.offsetX = -0.15F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(1);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 1.4F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
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
        this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.LegL, this.LegL2, this.LegL3, this.LegL4, this.LegL5, this.LegL6, this.LegL7};
        AdvancedModelRenderer[] legsR = {this.LegR, this.LegR2, this.LegR3, this.LegR4, this.LegR5, this.LegR6, this.LegR7};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(LegL, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
        this.flap(LegR, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
        this.flap(LegL2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
        this.flap(LegR2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LegL3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
        this.flap(LegR3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LegL4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
        this.flap(LegR4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
        this.flap(LegL5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
        this.flap(LegR5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
        this.flap(LegL6, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
        this.flap(LegR6, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
        this.flap(LegL7, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
        this.flap(LegR7, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);

    }
}
