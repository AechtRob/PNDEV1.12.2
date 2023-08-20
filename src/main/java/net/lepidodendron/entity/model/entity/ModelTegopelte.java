package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTegopelte;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelTegopelte extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;

    public ModelTegopelte() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.35F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.5F, -7.0F, 8, 1, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -2.5F, -2.0F, -6.5F, 5, 1, 13, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, -1.25F, -6.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 5, 0.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, -1.25F, -6.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, -3.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, -1.0F, -4.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.2182F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, -1.0F, -2.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.2182F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.2182F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, -1.0F, 2.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.2182F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, -1.0F, 4.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.2182F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, -1.0F, 6.0F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.2182F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 11, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, -1.0F, -4.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.2182F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, -1.0F, -2.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.2182F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.2182F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, -1.0F, 2.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.2182F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, -1.0F, 4.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.2182F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, -1.0F, 6.0F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.2182F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 10, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.25F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.body.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraTegopelte) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
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
                this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            }
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
            this.flap(legL6, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
           }

        this.swing(antennaL, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(antennaR, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}