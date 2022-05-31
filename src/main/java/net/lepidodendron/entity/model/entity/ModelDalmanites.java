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
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer GenalspineL_r1;
    private final AdvancedModelRenderer GenalspineR_r1;
    private final AdvancedModelRenderer CephalicLegR;
    private final AdvancedModelRenderer CephalicLegR2;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaR;

    public ModelDalmanites() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 2.0F);


        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(Thorax);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 14, 17, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 22, 22, -0.5F, -1.2F, -4.0F, 1, 1, 4, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 17, -3.5F, -0.3F, -4.0F, 7, 0, 4, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 21, -2.5F, -1.0F, 0.0F, 5, 1, 2, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 4, -1.5F, -1.0F, 2.0F, 3, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 0, -3.5F, -0.3F, 0.0F, 7, 0, 9, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.Thorax.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.1745F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 12, -2.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Thorax.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.1745F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 9, 0.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Thorax.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.1745F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 0, 11, -2.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Thorax.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 8, 0.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 6, 0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 0, 7, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 17, -0.5F, -1.3F, -2.0F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 23, 0, -1.5F, -1.01F, -2.0F, 3, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 12, 22, -2.5F, -1.0F, -1.0F, 5, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 4, 14, 0.5F, -1.15F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 2, -1.5F, -1.15F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -0.5F, -1.0F, -2.6F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 14, -0.5F, -1.2F, -1.0F, 1, 1, 2, 0.0F, false));

        this.GenalspineL_r1 = new AdvancedModelRenderer(this);
        this.GenalspineL_r1.setRotationPoint(2.5F, 0.0F, 1.0F);
        this.Cephalon.addChild(GenalspineL_r1);
        this.setRotateAngle(GenalspineL_r1, 0.0F, 0.0873F, 0.0F);
        this.GenalspineL_r1.cubeList.add(new ModelBox(GenalspineL_r1, 0, 0, 0.0F, -0.5F, -1.0F, 1, 0, 4, 0.0F, false));

        this.GenalspineR_r1 = new AdvancedModelRenderer(this);
        this.GenalspineR_r1.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Cephalon.addChild(GenalspineR_r1);
        this.setRotateAngle(GenalspineR_r1, 0.0F, -0.0873F, 0.0F);
        this.GenalspineR_r1.cubeList.add(new ModelBox(GenalspineR_r1, 2, 0, -1.0F, -0.5F, -1.0F, 1, 0, 4, 0.0F, false));

        this.CephalicLegR = new AdvancedModelRenderer(this);
        this.CephalicLegR.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephalicLegR);
        this.setRotateAngle(CephalicLegR, 0.0F, 0.0F, -0.1745F);
        this.CephalicLegR.cubeList.add(new ModelBox(CephalicLegR, 0, 13, -2.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.CephalicLegR2 = new AdvancedModelRenderer(this);
        this.CephalicLegR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephalicLegR2);
        this.setRotateAngle(CephalicLegR2, 0.0F, 0.0F, 0.1745F);
        this.CephalicLegR2.cubeList.add(new ModelBox(CephalicLegR2, 0, 10, 0.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(AntennaL);
        this.setRotateAngle(AntennaL, -0.0873F, 0.0F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 9, 0.5F, 0.01F, -8.0F, 4, 0, 8, 0.0F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(AntennaR);
        this.setRotateAngle(AntennaR, -0.0873F, 0.0F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 8, 9, -3.5F, 0.01F, -8.0F, 4, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.23F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Body.render(0.014F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        AdvancedModelRenderer[] legsR = {this.CephalicLegR, this.LegR, this.LegR2, this.LegR3};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(CephalicLegR2, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(CephalicLegR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(LegL, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(LegR, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LegL2, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(LegR2, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LegL3, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(LegR3, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);


    }
}
