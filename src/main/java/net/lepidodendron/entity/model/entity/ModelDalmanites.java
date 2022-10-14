package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDalmanites extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer Pleuralspines_r1;
    private final AdvancedModelRenderer Pleuralspines_r2;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegL6;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer CephalicLegR;
    private final AdvancedModelRenderer CephalicLegR2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer Posteriorborder_r1;
    private final AdvancedModelRenderer GenalspineL_r1;
    private final AdvancedModelRenderer GenalspineL_r2;
    private final AdvancedModelRenderer GenalspineL_r3;
    private final AdvancedModelRenderer GenalspineL_r4;
    private final AdvancedModelRenderer Posteriorborder_r2;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaL_r1;
    private final AdvancedModelRenderer AntennaL3;
    private final AdvancedModelRenderer AntennaL_r2;
    private final AdvancedModelRenderer AntennaL2;
    private final AdvancedModelRenderer AntennaR;
    public ModelDalmanites() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 2.0F);


        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body.addChild(Thorax);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 24, 8, -3.5F, -1.0F, -4.0F, 7, 1, 7, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 28, -1.1F, -1.5F, -4.0F, 2, 1, 7, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 0, -5.0F, -0.3F, -4.4F, 10, 0, 7, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 36, 17, -2.5F, -1.0F, 3.0F, 5, 1, 2, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 24, 22, -1.1F, -1.5F, 3.0F, 2, 1, 2, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 31, 39, -1.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 20, 29, -0.5F, -1.5F, 5.0F, 1, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 23, 18, -0.5F, -0.5F, 5.9F, 1, 0, 10, 0.0F, false));

        this.Pleuralspines_r1 = new AdvancedModelRenderer(this);
        this.Pleuralspines_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Thorax.addChild(Pleuralspines_r1);
        this.setRotateAngle(Pleuralspines_r1, 0.0F, 0.5236F, 0.0F);
        this.Pleuralspines_r1.cubeList.add(new ModelBox(Pleuralspines_r1, 0, 4, -4.8F, -0.3F, 0.9F, 2, 0, 1, 0.0F, false));

        this.Pleuralspines_r2 = new AdvancedModelRenderer(this);
        this.Pleuralspines_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Thorax.addChild(Pleuralspines_r2);
        this.setRotateAngle(Pleuralspines_r2, 0.0F, -0.5236F, 0.0F);
        this.Pleuralspines_r2.cubeList.add(new ModelBox(Pleuralspines_r2, 24, 12, 2.8F, -0.3F, 0.9F, 2, 0, 1, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Thorax.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.1745F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 43, 0.5F, 0.0F, -0.8F, 3, 0, 1, 0.0F, false));
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 41, 0.5F, 0.0F, 0.5F, 3, 0, 1, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Thorax.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, -0.1745F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 40, 31, -3.5F, 0.0F, -0.8F, 3, 0, 1, 0.0F, false));
        this.LegL4.cubeList.add(new ModelBox(LegL4, 38, 39, -3.5F, 0.0F, 0.5F, 3, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Thorax.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 40, 41, 0.5F, 0.0F, -0.2F, 3, 0, 1, 0.0F, false));
        this.LegL2.cubeList.add(new ModelBox(LegL2, 40, 35, 0.5F, 0.0F, 1.1F, 3, 0, 1, 0.0F, false));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Thorax.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, -0.1745F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 37, 29, -3.5F, 0.0F, -0.2F, 3, 0, 1, 0.0F, false));
        this.LegL5.cubeList.add(new ModelBox(LegL5, 9, 37, -3.5F, 0.0F, 1.1F, 3, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 20, 41, 0.5F, 0.0F, 0.3F, 3, 0, 1, 0.0F, false));
        this.LegL3.cubeList.add(new ModelBox(LegL3, 40, 33, 0.5F, 0.0F, 1.5F, 3, 0, 1, 0.0F, false));

        this.LegL6 = new AdvancedModelRenderer(this);
        this.LegL6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, -0.1745F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 36, 26, -3.5F, 0.0F, 0.3F, 3, 0, 1, 0.0F, false));
        this.LegL6.cubeList.add(new ModelBox(LegL6, 35, 6, -3.5F, 0.0F, 1.5F, 3, 0, 1, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 9, 39, -1.5F, -1.7F, -2.4F, 3, 1, 2, -0.002F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 37, -1.5F, -1.01F, -2.4F, 3, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 0, -2.5F, -1.0F, -1.75F, 5, 1, 4, 0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 31, -0.5F, -1.0F, -3.4F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 36, 21, -1.075F, -1.5F, -1.0F, 2, 1, 3, 0.0F, false));

        this.CephalicLegR = new AdvancedModelRenderer(this);
        this.CephalicLegR.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephalicLegR);
        this.setRotateAngle(CephalicLegR, 0.0F, 0.0F, -0.1745F);


        this.CephalicLegR2 = new AdvancedModelRenderer(this);
        this.CephalicLegR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephalicLegR2);
        this.setRotateAngle(CephalicLegR2, 0.0F, 0.0F, 0.1745F);


        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(5.0F, -0.4F, -0.5F);
        this.Cephalon.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 24, 8, -3.2F, -0.95F, 0.1F, 1, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -7.8F, -0.95F, 0.1F, 1, 1, 2, 0.0F, false));

        this.Posteriorborder_r1 = new AdvancedModelRenderer(this);
        this.Posteriorborder_r1.setRotationPoint(-5.5F, 0.4F, 0.5F);
        this.bone.addChild(Posteriorborder_r1);
        this.setRotateAngle(Posteriorborder_r1, 0.0F, 0.0F, -0.1745F);
        this.Posteriorborder_r1.cubeList.add(new ModelBox(Posteriorborder_r1, 25, 29, -3.3F, -1.4F, -1.05F, 4, 1, 3, 0.0F, false));

        this.GenalspineL_r1 = new AdvancedModelRenderer(this);
        this.GenalspineL_r1.setRotationPoint(-10.0F, 0.0F, 0.0F);
        this.bone.addChild(GenalspineL_r1);
        this.setRotateAngle(GenalspineL_r1, 0.0F, -0.1396F, 0.0F);
        this.GenalspineL_r1.cubeList.add(new ModelBox(GenalspineL_r1, 24, 18, 0.3057F, -0.1F, 2.7207F, 1, 0, 3, 0.0F, true));
        this.GenalspineL_r1.cubeList.add(new ModelBox(GenalspineL_r1, 0, 18, 0.3057F, -0.5F, -0.2793F, 1, 1, 3, -0.002F, true));

        this.GenalspineL_r2 = new AdvancedModelRenderer(this);
        this.GenalspineL_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(GenalspineL_r2);
        this.setRotateAngle(GenalspineL_r2, 0.0F, 0.1396F, 0.0F);
        this.GenalspineL_r2.cubeList.add(new ModelBox(GenalspineL_r2, 24, 18, -1.3057F, -0.1F, 2.7207F, 1, 0, 3, 0.0F, false));
        this.GenalspineL_r2.cubeList.add(new ModelBox(GenalspineL_r2, 0, 18, -1.3057F, -0.5F, -0.2793F, 1, 1, 3, -0.002F, false));

        this.GenalspineL_r3 = new AdvancedModelRenderer(this);
        this.GenalspineL_r3.setRotationPoint(-6.0F, 0.0F, -2.5F);
        this.bone.addChild(GenalspineL_r3);
        this.setRotateAngle(GenalspineL_r3, 0.0F, -1.0559F, 0.0F);
        this.GenalspineL_r3.cubeList.add(new ModelBox(GenalspineL_r3, 20, 34, 0.0904F, -0.5F, -0.7026F, 1, 1, 5, 0.0F, true));

        this.GenalspineL_r4 = new AdvancedModelRenderer(this);
        this.GenalspineL_r4.setRotationPoint(-4.0F, 0.0F, -2.5F);
        this.bone.addChild(GenalspineL_r4);
        this.setRotateAngle(GenalspineL_r4, 0.0F, 1.0559F, 0.0F);
        this.GenalspineL_r4.cubeList.add(new ModelBox(GenalspineL_r4, 20, 34, -1.0904F, -0.5F, -0.7026F, 1, 1, 5, 0.0F, false));

        this.Posteriorborder_r2 = new AdvancedModelRenderer(this);
        this.Posteriorborder_r2.setRotationPoint(-4.5F, 0.4F, 0.5F);
        this.bone.addChild(Posteriorborder_r2);
        this.setRotateAngle(Posteriorborder_r2, 0.0F, 0.0F, 0.1745F);
        this.Posteriorborder_r2.cubeList.add(new ModelBox(Posteriorborder_r2, 28, 34, -0.7F, -1.4F, -1.05F, 4, 1, 3, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.0F, -0.2F, 1.8F);
        this.Cephalon.addChild(AntennaL);


        this.AntennaL_r1 = new AdvancedModelRenderer(this);
        this.AntennaL_r1.setRotationPoint(0.5F, 0.0F, 5.0F);
        this.AntennaL.addChild(AntennaL_r1);
        this.setRotateAngle(AntennaL_r1, 0.0F, -0.3054F, 0.0F);
        this.AntennaL_r1.cubeList.add(new ModelBox(AntennaL_r1, 0, 18, -2.1F, 0.41F, -14.1F, 7, 0, 9, 0.0F, false));

        this.AntennaL3 = new AdvancedModelRenderer(this);
        this.AntennaL3.setRotationPoint(0.0F, -0.2F, 1.9F);
        this.Cephalon.addChild(AntennaL3);


        this.AntennaL_r2 = new AdvancedModelRenderer(this);
        this.AntennaL_r2.setRotationPoint(-0.5F, 0.0F, 5.0F);
        this.AntennaL3.addChild(AntennaL_r2);
        this.setRotateAngle(AntennaL_r2, 0.0F, 0.3054F, 0.0F);
        this.AntennaL_r2.cubeList.add(new ModelBox(AntennaL_r2, 0, 18, -4.9F, 0.41F, -14.1F, 7, 0, 9, 0.0F, true));

        this.AntennaL2 = new AdvancedModelRenderer(this);
        this.AntennaL2.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Cephalon.addChild(AntennaL2);


        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(AntennaR);
        this.setRotateAngle(AntennaR, -0.0873F, 0.0F, 0.0F);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.23F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.render(0.014F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Body.offsetY = 1.15F;

        AdvancedModelRenderer[] legsL = {this.CephalicLegR2, this.LegL, this.LegL2, this.LegL3};
        AdvancedModelRenderer[] legsR = {this.CephalicLegR, this.LegL4, this.LegL5, this.LegL6};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaL, 0.5F, -0.2F, true, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaL3, 0.5F, 0.2F, true, 0, 0.1F, f2, 0.8F);

        this.flap(CephalicLegR2, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
        this.flap(CephalicLegR, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
        this.flap(LegL, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
        this.flap(LegL4, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LegL2, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
        this.flap(LegL5, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LegL3, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
        this.flap(LegL6, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);


    }
}
