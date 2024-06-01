package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPhantaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelPhantaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Group;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer CranidiumDiagnostic_r1;
    private final AdvancedModelRenderer CranidiumDiagnostic_r2;
    private final AdvancedModelRenderer CephaicLegL2;
    private final AdvancedModelRenderer CephalicLegR2;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaL2;
    private final AdvancedModelRenderer CephalicLegL;
    private final AdvancedModelRenderer CephalicLegR;
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegR2_r1;
    private final AdvancedModelRenderer LegL1;
    private final AdvancedModelRenderer LegR1;

    public ModelPhantaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.Group = new AdvancedModelRenderer(this);
        this.Group.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Group.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 27, -3.0F, -1.0F, -3.0F, 6, 1, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 6, 15, 3.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 15, -4.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 8, -2.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 10, -1.0F, -1.5F, -3.01F, 2, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 15, 27, -3.0F, -1.4F, -2.01F, 6, 1, 2, 0.0F, false));

        this.CranidiumDiagnostic_r1 = new AdvancedModelRenderer(this);
        this.CranidiumDiagnostic_r1.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Cephalon.addChild(CranidiumDiagnostic_r1);
        this.setRotateAngle(CranidiumDiagnostic_r1, 0.0F, 0.0F, -0.4189F);
        this.CranidiumDiagnostic_r1.cubeList.add(new ModelBox(CranidiumDiagnostic_r1, 16, 0, -6.3F, -1.6F, -13.0F, 7, 0, 15, 0.0F, true));

        this.CranidiumDiagnostic_r2 = new AdvancedModelRenderer(this);
        this.CranidiumDiagnostic_r2.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Cephalon.addChild(CranidiumDiagnostic_r2);
        this.setRotateAngle(CranidiumDiagnostic_r2, 0.0F, 0.0F, 0.4189F);
        this.CranidiumDiagnostic_r2.cubeList.add(new ModelBox(CranidiumDiagnostic_r2, 16, 0, -0.7F, -1.6F, -13.0F, 7, 0, 15, 0.0F, false));

        this.CephaicLegL2 = new AdvancedModelRenderer(this);
        this.CephaicLegL2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Cephalon.addChild(CephaicLegL2);
        this.setRotateAngle(CephaicLegL2, 0.0436F, 0.3054F, 0.1745F);
        this.CephaicLegL2.cubeList.add(new ModelBox(CephaicLegL2, 0, 13, 0.25F, -0.05F, -1.0F, 3, 0, 1, 0.0F, false));

        this.CephalicLegR2 = new AdvancedModelRenderer(this);
        this.CephalicLegR2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Cephalon.addChild(CephalicLegR2);
        this.setRotateAngle(CephalicLegR2, 0.0436F, -0.3054F, -0.1745F);
        this.CephalicLegR2.cubeList.add(new ModelBox(CephalicLegR2, 6, 13, -3.25F, -0.05F, -1.0F, 3, 0, 1, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Cephalon.addChild(AntennaL);
        this.setRotateAngle(AntennaL, -0.1309F, -0.0436F, -0.1745F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, -1, 31, -1.0F, 0.1F, -17.0F, 16, 0, 17, 0.0F, false));

        this.AntennaL2 = new AdvancedModelRenderer(this);
        this.AntennaL2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Cephalon.addChild(AntennaL2);
        this.setRotateAngle(AntennaL2, -0.1309F, 0.0436F, 0.1745F);
        this.AntennaL2.cubeList.add(new ModelBox(AntennaL2, -1, 31, -15.0F, 0.1F, -17.0F, 16, 0, 17, 0.0F, true));

        this.CephalicLegL = new AdvancedModelRenderer(this);
        this.CephalicLegL.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Cephalon.addChild(CephalicLegL);
        this.setRotateAngle(CephalicLegL, 0.0F, 0.0F, 0.1745F);
        this.CephalicLegL.cubeList.add(new ModelBox(CephalicLegL, 0, 14, 0.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.CephalicLegR = new AdvancedModelRenderer(this);
        this.CephalicLegR.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Cephalon.addChild(CephalicLegR);
        this.setRotateAngle(CephalicLegR, 0.0F, 0.0F, -0.1745F);
        this.CephalicLegR.cubeList.add(new ModelBox(CephalicLegR, 6, 14, -3.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Group.addChild(Thorax);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 21, 20, -3.0F, -1.0F, 0.0F, 6, 1, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 6, -2.0F, -1.0F, 6.0F, 4, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 18, -1.0F, -1.0F, 7.0F, 2, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 20, -1.0F, -1.5F, 0.0F, 2, 1, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 20, 16, -4.0F, -0.1F, -2.0F, 8, 0, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 10, 20, -3.0F, -0.1F, 6.0F, 6, 0, 3, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Thorax.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, -0.2182F, 0.1745F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 6, 0, 0.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Thorax.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.2182F, -0.1745F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 6, 1, -3.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Thorax.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 6, 2, 0.25F, -0.05F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Thorax.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 6, 3, -3.25F, -0.05F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 6, 4, 0.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax.addChild(LegR2);


        this.LegR2_r1 = new AdvancedModelRenderer(this);
        this.LegR2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegR2.addChild(LegR2_r1);
        this.setRotateAngle(LegR2_r1, 0.0F, 0.0F, -0.1745F);
        this.LegR2_r1.cubeList.add(new ModelBox(LegR2_r1, 6, 5, -3.25F, -0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LegL1 = new AdvancedModelRenderer(this);
        this.LegL1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegL1);
        this.setRotateAngle(LegL1, 0.0F, 0.0F, 0.1745F);
        this.LegL1.cubeList.add(new ModelBox(LegL1, 5, 10, 0.25F, -0.05F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegR1 = new AdvancedModelRenderer(this);
        this.LegR1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Thorax.addChild(LegR1);
        this.setRotateAngle(LegR1, 0.0F, 0.0F, -0.1745F);
        this.LegR1.cubeList.add(new ModelBox(LegR1, 5, 11, -3.25F, -0.05F, -0.5F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Group.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Group.render(0.0130f);
        //GlStateManager.enableCull();
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
        //this.Group.offsetY = 1.18F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.CephaicLegL2, this.CephalicLegL, this.LegL1, this.LegL2, this.LegL3, this.LegL4};
        AdvancedModelRenderer[] legsR = {this.CephalicLegR2, this.CephalicLegR, this.LegR1, this.LegR2, this.LegR3, this.LegR4};
        AdvancedModelRenderer[] bodyF = {this.Cephalon,this.Thorax};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraPhantaspis) e).getIsMoving()) {
                this.chainWave(legsL, 0.5F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.5F, 0.2F, -3, f2, 1);
                this.flap(CephalicLegL, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(CephalicLegR, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(CephaicLegL2, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(CephalicLegR2, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(LegL1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(LegR1, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(LegL2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
                this.flap(LegR2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
                this.flap(LegL3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
                this.flap(LegR3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
                this.flap(LegL4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
                this.flap(LegR4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.02F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.1F, 0.02f, -3, f2, 0F);
            }
            this.bob(Group, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, 0.2F, -3, f2, 1);
            this.flap(LegL1, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(LegR1, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(LegL2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(LegR2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LegL3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(LegR3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LegL4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(LegR4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.01F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.02f, -3, f2, 0.3F);
            this.bob(Group, 0.2F, 0.2F, true, f2, 1);
        }

        this.swing(AntennaL, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaL2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
