package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCrotalocephalus extends AdvancedModelBase {
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer CephalicLegL;
    private final AdvancedModelRenderer CephaliclegR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer ThoracicSegment1;
    private final AdvancedModelRenderer LegL1;
    private final AdvancedModelRenderer LegR1;
    private final AdvancedModelRenderer ThoracicSegment2;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer ThoracicSegment3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer ThoracicSegment4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer ThoracicSegment5;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer LegR5;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer PygidialLegL;
    private final AdvancedModelRenderer PygidialLegR;

    public ModelCrotalocephalus() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Thorax.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 9, 21, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 20, 19, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 13, 13, -3.0F, -1.01F, -1.0F, 6, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 14, 11, -2.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, false));

        this.CephalicLegL = new AdvancedModelRenderer(this);
        this.CephalicLegL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephalicLegL);
        this.setRotateAngle(CephalicLegL, 0.0F, 0.0F, 0.1745F);
        this.CephalicLegL.cubeList.add(new ModelBox(CephalicLegL, 0, 0, 3.25F, 0.0F, -0.5F, -3, 0, 1, 0.0F, false));

        this.CephaliclegR = new AdvancedModelRenderer(this);
        this.CephaliclegR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(CephaliclegR);
        this.setRotateAngle(CephaliclegR, 0.0F, 0.0F, -0.1745F);
        this.CephaliclegR.cubeList.add(new ModelBox(CephaliclegR, 25, 5, -3.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Cephalon.addChild(AntennaL);
        this.setRotateAngle(AntennaL, 0.0F, -0.2182F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 0, 0.2164F, 0.01F, -6.0237F, 4, 0, 6, 0.0F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Cephalon.addChild(AntennaR);
        this.setRotateAngle(AntennaR, 0.0F, 0.2182F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 6, -4.2164F, 0.01F, -6.0237F, 4, 0, 6, 0.0F, false));

        this.ThoracicSegment1 = new AdvancedModelRenderer(this);
        this.ThoracicSegment1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Thorax.addChild(ThoracicSegment1);
        this.ThoracicSegment1.cubeList.add(new ModelBox(ThoracicSegment1, 26, 0, -0.99F, -2.01F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment1.cubeList.add(new ModelBox(ThoracicSegment1, 20, 16, -1.99F, -1.01F, 0.0F, 4, 1, 2, 0.0F, false));
        this.ThoracicSegment1.cubeList.add(new ModelBox(ThoracicSegment1, 12, 9, -2.99F, -0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.LegL1 = new AdvancedModelRenderer(this);
        this.LegL1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment1.addChild(LegL1);
        this.setRotateAngle(LegL1, 0.0F, 0.0F, 0.1745F);
        this.LegL1.cubeList.add(new ModelBox(LegL1, 0, 0, 3.25F, 0.0F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegR1 = new AdvancedModelRenderer(this);
        this.LegR1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment1.addChild(LegR1);
        this.setRotateAngle(LegR1, 0.0F, 0.0F, -0.1745F);
        this.LegR1.cubeList.add(new ModelBox(LegR1, 25, 4, -3.25F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.ThoracicSegment2 = new AdvancedModelRenderer(this);
        this.ThoracicSegment2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment1.addChild(ThoracicSegment2);
        this.ThoracicSegment2.cubeList.add(new ModelBox(ThoracicSegment2, 25, 24, -0.99F, -2.01F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment2.cubeList.add(new ModelBox(ThoracicSegment2, 0, 20, -1.99F, -1.01F, 0.0F, 4, 1, 2, 0.0F, false));
        this.ThoracicSegment2.cubeList.add(new ModelBox(ThoracicSegment2, 12, 7, -2.99F, -0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment2.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 0, 3.25F, 0.0F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment2.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.1745F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 24, 23, -3.25F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.ThoracicSegment3 = new AdvancedModelRenderer(this);
        this.ThoracicSegment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment2.addChild(ThoracicSegment3);
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 24, 9, -0.99F, -2.01F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 10, 18, -1.99F, -1.01F, 0.0F, 4, 1, 2, 0.0F, false));
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 12, 5, -2.99F, -0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment3.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 0, 3.25F, 0.0F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment3.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 24, 22, -3.25F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.ThoracicSegment4 = new AdvancedModelRenderer(this);
        this.ThoracicSegment4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment3.addChild(ThoracicSegment4);
        this.ThoracicSegment4.cubeList.add(new ModelBox(ThoracicSegment4, 0, 23, -0.99F, -2.01F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment4.cubeList.add(new ModelBox(ThoracicSegment4, 0, 17, -1.99F, -1.01F, 0.0F, 4, 1, 2, 0.0F, false));
        this.ThoracicSegment4.cubeList.add(new ModelBox(ThoracicSegment4, 12, 3, -2.99F, -0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment4.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, 0.1745F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 0, 0, 3.25F, 0.0F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment4.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.0F, -0.1745F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 5, 23, -3.25F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.ThoracicSegment5 = new AdvancedModelRenderer(this);
        this.ThoracicSegment5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment4.addChild(ThoracicSegment5);
        this.ThoracicSegment5.cubeList.add(new ModelBox(ThoracicSegment5, 19, 22, -0.99F, -2.01F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment5.cubeList.add(new ModelBox(ThoracicSegment5, 10, 15, -1.99F, -1.01F, 0.0F, 4, 1, 2, 0.0F, false));
        this.ThoracicSegment5.cubeList.add(new ModelBox(ThoracicSegment5, 0, 12, -2.99F, -0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment5.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, 0.1745F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 0, 0, 3.25F, 0.0F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegR5 = new AdvancedModelRenderer(this);
        this.LegR5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.ThoracicSegment5.addChild(LegR5);
        this.setRotateAngle(LegR5, 0.0F, 0.0F, -0.1745F);
        this.LegR5.cubeList.add(new ModelBox(LegR5, 19, 15, -3.25F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ThoracicSegment5.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 0, -1.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 14, -2.0F, -1.0F, 2.0F, 4, 1, 2, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 11, 0, -3.0F, 0.0F, 2.0F, 6, 0, 3, 0.0F, false));

        this.PygidialLegL = new AdvancedModelRenderer(this);
        this.PygidialLegL.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Pygidium.addChild(PygidialLegL);
        this.setRotateAngle(PygidialLegL, -0.1745F, 0.1309F, 0.0F);
        this.PygidialLegL.cubeList.add(new ModelBox(PygidialLegL, 0, 3, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.PygidialLegR = new AdvancedModelRenderer(this);
        this.PygidialLegR.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Pygidium.addChild(PygidialLegR);
        this.setRotateAngle(PygidialLegR, -0.1745F, -0.1309F, 0.0F);
        this.PygidialLegR.cubeList.add(new ModelBox(PygidialLegR, 2, 3, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Thorax.render(f5 * 0.3F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Thorax.render(0.019F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.Thorax.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.ThoracicSegment1, this.ThoracicSegment2, this.ThoracicSegment3, this.ThoracicSegment4};

        float speed = 0.45F;
        float tailVdegree = 0.30F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.18F;
            tailVdegree = 0.05F;
            tailHdegree = 0.11F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            this.flap(LegL1, speed, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(LegR1, speed, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(LegL2, speed, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(LegR2, speed, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LegL3, speed, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(LegR3, speed, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LegL4, speed, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(LegR4, speed, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(LegL5, speed, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(LegR5, speed, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

            this.swing(AntennaL, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(AntennaR, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(Thorax, -speed, 0.12F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Thorax.offsetY = 1.02F;
                this.bob(Thorax, -speed, 0.21F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
