package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBushizheia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelBushizheia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer Head_limbR;
    private final AdvancedModelRenderer Head_LimbL;

    public ModelBushizheia() {
        this.textureWidth = 32;
        this.textureHeight = 24;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(-1.0F, 24.0F, 1.0F);
        this.Body.cubeList.add(new ModelBox(Body, 16, 13, -0.5F, -1.0F, -3.0F, 3, 1, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 5, -1.5F, -0.3F, -3.0F, 5, 0, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 11, 19, -0.5F, -1.0F, 2.0F, 3, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 0, -1.5F, -0.3F, 2.0F, 5, 0, 5, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.Body.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.1745F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 3, 0.5F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Body.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.1745F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 4, -1.5F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Body.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.1745F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 0, 2, -1.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.Body.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.1745F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 0, 2.5F, 0.0F, -1.0F, -2, 0, 1, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.1745F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 0, 1, -1.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.1745F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 0, 0.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 19, 20, -0.5F, -1.0F, -5.0F, 3, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 18, -1.5F, -0.3F, -6.0F, 5, 0, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 4, 4, 0.5F, -1.01F, -5.5F, 1, 1, 1, 0.0F, false));

        this.Head_limbR = new AdvancedModelRenderer(this);
        this.Head_limbR.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(Head_limbR);
        this.setRotateAngle(Head_limbR, -0.1309F, 0.0F, -0.2182F);
        this.Head_limbR.cubeList.add(new ModelBox(Head_limbR, 0, 9, -5.5F, -0.4F, -9.0F, 6, 0, 9, 0.0F, false));

        this.Head_LimbL = new AdvancedModelRenderer(this);
        this.Head_LimbL.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(Head_LimbL);
        this.setRotateAngle(Head_LimbL, -0.1309F, 0.0F, 0.2182F);
        this.Head_LimbL.cubeList.add(new ModelBox(Head_LimbL, 0, 0, 0.5F, -0.4F, -9.0F, 6, 0, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.213F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.render(0.013F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {

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

        float speed = 0.4F * 0.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }

        AdvancedModelRenderer[] legsL = {this.LegL, this.LegL2, this.LegL3};
        AdvancedModelRenderer[] legsR = {this.LegR, this.LegR2, this.LegR3};

        this.swing(Head_LimbL, speed * 3F, -0.3F, false, 0, -0.3F, f2, 0.5F);
        this.swing(Head_limbR, speed * 3F, 0.3F, false, 0, 0.3F, f2, 0.5F);

        if (isAtBottom && e.isInWater()) {
            if (((EntityPrehistoricFloraBushizheia)e).getIsMoving()) {
                this.chainWave(legsL, 0.9F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.9F, 0.2F, -3, f2, 1);
                this.flap(LegL, 0.9F, -0.3F, false, 0, -0.3F, f2, 0.3F);
                this.flap(LegR, 0.9F, 0.3F, false, 0, 0.3F, f2, 0.3F);
                this.flap(LegL2, 0.9F, -0.3F, false, 1.0F, -0.3F, f2, 0.3F);
                this.flap(LegR2, 0.9F, 0.3F, false, 1.0F, 0.3F, f2, 0.3F);
                this.flap(LegL3, 0.9F, -0.3F, false, 2.0F, -0.3F, f2, 0.3F);
                this.flap(LegR3, 0.9F, 0.3F, false, 2.0F, 0.3F, f2, 0.3F);

                this.swing(LegL, 0.9F, -0.3F, false, 0, -0.3F, f2, 0.3F);
                this.swing(LegR, 0.9F, 0.3F, false, 0, 0.3F, f2, 0.3F);
                this.swing(LegL2, 0.9F, -0.3F, false, 1.0F, -0.3F, f2, 0.3F);
                this.swing(LegR2, 0.9F, 0.3F, false, 1.0F, 0.3F, f2, 0.3F);
                this.swing(LegL3, 0.9F, -0.3F, false, 2.0F, -0.3F, f2, 0.3F);
                this.swing(LegR3, 0.9F, 0.3F, false, 2.0F, 0.3F, f2, 0.3F);

            }
        }
        else if (e.isInWater()) {
            this.chainWave(legsL, 0.9F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.9F, 0.2F, -3, f2, 1);
            this.flap(LegL, 0.9F, -0.3F, false, 0, -0.3F, f2, 0.3F);
            this.flap(LegR, 0.9F, 0.3F, false, 0, 0.3F, f2, 0.3F);
            this.flap(LegL2, 0.9F, -0.3F, false, 1.0F, -0.3F, f2, 0.3F);
            this.flap(LegR2, 0.9F, 0.3F, false, 1.0F, 0.3F, f2, 0.3F);
            this.flap(LegL3, 0.9F, -0.3F, false, 2.0F, -0.3F, f2, 0.3F);
            this.flap(LegR3, 0.9F, 0.3F, false, 2.0F, 0.3F, f2, 0.3F);

            this.swing(LegL, 0.9F, -0.3F, false, 0, -0.3F, f2, 0.3F);
            this.swing(LegR, 0.9F, 0.3F, false, 0, 0.3F, f2, 0.3F);
            this.swing(LegL2, 0.9F, -0.3F, false, 1.0F, -0.3F, f2, 0.3F);
            this.swing(LegR2, 0.9F, 0.3F, false, 1.0F, 0.3F, f2, 0.3F);
            this.swing(LegL3, 0.9F, -0.3F, false, 2.0F, -0.3F, f2, 0.3F);
            this.swing(LegR3, 0.9F, 0.3F, false, 2.0F, 0.3F, f2, 0.3F);

        }

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = 1.18F;
            this.bob(Body, -speed * 3F, 2F, false, f2, 1);
        }

    }
}
