package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelArchoblattina extends AdvancedModelBase {
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer cerciR;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;

    public ModelArchoblattina() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 24.0F, 3.0F);
        this.thorax.cubeList.add(new ModelBox(thorax, 9, 26, -1.5F, -2.65F, -5.75F, 3, 1, 5, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 26, 17, -2.0F, -3.0F, -6.0F, 4, 1, 2, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 0, -1.5F, -3.0F, -8.0F, 3, 1, 2, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 6, -1.0F, -2.5F, -8.25F, 2, 1, 1, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.5F, -0.75F);
        this.thorax.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.0436F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 24, 29, -2.0F, -0.3F, 0.0F, 4, 2, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 3, -1.5F, -0.3F, 4.0F, 3, 2, 1, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(0.05F, 0.75F, 5.0F);
        this.abdomen.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.2618F, 0.0F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 33, 0.0F, 0.0F, -0.25F, 1, 0, 2, 0.0F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-0.05F, 0.75F, 5.0F);
        this.abdomen.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.2618F, 0.0F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 33, -1.0F, 0.0F, -0.25F, 1, 0, 2, 0.0F, true));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-0.75F, -3.0F, -4.0F);
        this.thorax.addChild(forewingR);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 8, 10, -2.25F, 0.0F, 0.0F, 4, 0, 10, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(0.75F, -3.0F, -4.0F);
        this.thorax.addChild(forewingL);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 10, -1.75F, 0.01F, 0.0F, 4, 0, 10, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-0.25F, -2.9F, -4.0F);
        this.thorax.addChild(hindwingR);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 8, 0, -2.25F, 0.0F, 0.0F, 4, 0, 10, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(0.25F, -2.9F, -4.0F);
        this.thorax.addChild(hindwingL);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 0, -1.75F, 0.01F, 0.0F, 4, 0, 10, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.thorax.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 14, 25, -4.0F, 0.0F, -6.0F, 4, 0, 6, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.thorax.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 20, 11, 0.0F, 0.0F, -6.0F, 4, 0, 6, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.25F, -1.75F, -4.25F);
        this.thorax.addChild(legR1);
        this.setRotateAngle(legR1, -0.1309F, -0.7854F, -0.2618F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 26, -5.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.25F, -1.75F, -4.25F);
        this.thorax.addChild(legL1);
        this.setRotateAngle(legL1, -0.1309F, 0.7854F, 0.2618F);
        this.legL1.cubeList.add(new ModelBox(legL1, 24, 25, 0.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.5F, -1.75F, -3.25F);
        this.thorax.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.0436F, -0.3054F);
        this.legR2.cubeList.add(new ModelBox(legR2, 21, 6, -6.0F, 0.0F, -1.0F, 6, 0, 5, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, -1.75F, -3.25F);
        this.thorax.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.0436F, 0.3054F);
        this.legL2.cubeList.add(new ModelBox(legL2, 15, 20, 0.0F, 0.0F, -1.0F, 6, 0, 5, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, -1.75F, -2.25F);
        this.thorax.addChild(legR3);
        this.setRotateAngle(legR3, -0.2182F, 0.6109F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 20, 0, -7.0F, 0.0F, -1.0F, 7, 0, 6, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -1.75F, -2.25F);
        this.thorax.addChild(legL3);
        this.setRotateAngle(legL3, -0.2182F, -0.6109F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 20, 0.0F, 0.0F, -1.0F, 7, 0, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.thorax.render(f5 * 0.165f);
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.thorax.offsetZ = 0.1F;
        this.thorax.render(0.022f);
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
        this.thorax.offsetY = 1.2F;

        float modifier = 1F;

        EntityPrehistoricFloraCrawlingFlyingInsectBase ee = (EntityPrehistoricFloraCrawlingFlyingInsectBase) e;
        if (ee.getIsFlying()) {
            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legR2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legL2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legR1, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL1, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);

            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);
        }
        else {
            if (!(f3 == 0.0F || !ee.getIsMoving())) {
                this.swing(legL1, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                this.swing(legL2, 0.5F * modifier, -0.5F, false, 3, 0.25F, f2, 1F);
                this.swing(legL3, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);

                this.swing(legR1, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                this.swing(legR2, 0.5F * modifier, 0.5F, false, 0, -0.25F, f2, 1F);
                this.swing(legR3, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
            }
        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);
        this.swing(cerciL, 0.12F, -0.4F, false, 0, -0.1F, f2, 0.8F);
        this.swing(cerciR, 0.12F, 0.4F, false, 0, 0.1F, f2, 0.8F);

    }
}
