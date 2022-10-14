package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelCheloniellon extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer papR;
    private final AdvancedModelRenderer papL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer exopodL;
    private final AdvancedModelRenderer exopodL2;
    private final AdvancedModelRenderer exopodL3;
    private final AdvancedModelRenderer exopodL4;
    private final AdvancedModelRenderer exopodR;
    private final AdvancedModelRenderer exopodR2;
    private final AdvancedModelRenderer exopodR3;
    private final AdvancedModelRenderer exopodR4;

    public ModelCheloniellon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.75F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -1.0F, -6.0F, 12, 0, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 14, -1.5F, -1.5F, -6.0F, 3, 1, 10, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -0.75F, -6.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 17, 17, 0.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -0.75F, -6.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 17, 12, -5.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.0F, -0.75F, 4.0F);
        this.body.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.2618F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 2, 12, 0.0F, 0.0F, 0.0F, 1, 0, 12, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(0.0F, -0.75F, 4.0F);
        this.body.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.2618F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 0, 12, -1.0F, 0.0F, 0.0F, 1, 0, 12, 0.0F, false));

        this.papR = new AdvancedModelRenderer(this);
        this.papR.setRotationPoint(-0.75F, -0.5F, -5.25F);
        this.body.addChild(papR);
        this.setRotateAngle(papR, 0.0F, -0.1745F, 0.0F);
        this.papR.cubeList.add(new ModelBox(papR, 0, 6, -3.0F, 0.01F, -1.5F, 3, 0, 2, 0.0F, false));

        this.papL = new AdvancedModelRenderer(this);
        this.papL.setRotationPoint(0.75F, -0.5F, -5.25F);
        this.body.addChild(papL);
        this.setRotateAngle(papL, 0.0F, 0.1745F, 0.0F);
        this.papL.cubeList.add(new ModelBox(papL, 0, 4, 0.0F, 0.01F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -0.5F, -4.5F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -0.5F, -2.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -0.5F, 1.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, -0.5F, 3.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -0.5F, -4.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 8, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -0.5F, -2.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 8, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 8, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -0.5F, 1.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 8, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, -0.5F, 3.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.0873F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 8, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.exopodL = new AdvancedModelRenderer(this);
        this.exopodL.setRotationPoint(1.0F, -0.6F, -2.5F);
        this.body.addChild(exopodL);
        this.setRotateAngle(exopodL, -0.0873F, 0.0F, 0.0873F);
        this.exopodL.cubeList.add(new ModelBox(exopodL, 0, 2, -0.25F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodL2 = new AdvancedModelRenderer(this);
        this.exopodL2.setRotationPoint(1.0F, -0.6F, -0.5F);
        this.body.addChild(exopodL2);
        this.setRotateAngle(exopodL2, -0.0873F, 0.0F, 0.0873F);
        this.exopodL2.cubeList.add(new ModelBox(exopodL2, 0, 2, -0.25F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodL3 = new AdvancedModelRenderer(this);
        this.exopodL3.setRotationPoint(1.0F, -0.6F, 1.5F);
        this.body.addChild(exopodL3);
        this.setRotateAngle(exopodL3, -0.0873F, 0.0F, 0.0873F);
        this.exopodL3.cubeList.add(new ModelBox(exopodL3, 0, 2, -0.25F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodL4 = new AdvancedModelRenderer(this);
        this.exopodL4.setRotationPoint(1.0F, -0.6F, 3.5F);
        this.body.addChild(exopodL4);
        this.setRotateAngle(exopodL4, -0.0873F, 0.0F, 0.0873F);
        this.exopodL4.cubeList.add(new ModelBox(exopodL4, 0, 2, -0.25F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodR = new AdvancedModelRenderer(this);
        this.exopodR.setRotationPoint(-1.0F, -0.6F, -2.5F);
        this.body.addChild(exopodR);
        this.setRotateAngle(exopodR, -0.0873F, 0.0F, -0.0873F);
        this.exopodR.cubeList.add(new ModelBox(exopodR, 0, 0, -2.75F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodR2 = new AdvancedModelRenderer(this);
        this.exopodR2.setRotationPoint(-1.0F, -0.6F, -0.5F);
        this.body.addChild(exopodR2);
        this.setRotateAngle(exopodR2, -0.0873F, 0.0F, -0.0873F);
        this.exopodR2.cubeList.add(new ModelBox(exopodR2, 0, 0, -2.75F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodR3 = new AdvancedModelRenderer(this);
        this.exopodR3.setRotationPoint(-1.0F, -0.6F, 1.5F);
        this.body.addChild(exopodR3);
        this.setRotateAngle(exopodR3, -0.0873F, 0.0F, -0.0873F);
        this.exopodR3.cubeList.add(new ModelBox(exopodR3, 0, 0, -2.75F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.exopodR4 = new AdvancedModelRenderer(this);
        this.exopodR4.setRotationPoint(-1.0F, -0.6F, 3.5F);
        this.body.addChild(exopodR4);
        this.setRotateAngle(exopodR4, -0.0873F, 0.0F, -0.0873F);
        this.exopodR4.cubeList.add(new ModelBox(exopodR4, 0, 0, -2.75F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.35F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.02F);
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
        this.body.offsetY = 0.975F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.bob(body, 0.2F, 0.1F, false, f2, 1);
        }

        this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(papL, 0.8F, -0.15F, false, 0, -0.15F, f2, 0.8F);
        this.swing(papR, 0.8F, 0.15F, false, 0, 0.15F, f2, 0.8F);

        if (f3 != 0.0F) {
            this.swing(tailL, 1.1F, -0.28F, false, 0, 0.25F, f2, 0.6F);
            this.swing(tailR, 1.1F, 0.28F, false, 0, -0.25F, f2, 0.6F);
        }
    }
}
