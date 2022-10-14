package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelTitanoptera extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingR;

    public ModelTitanoptera() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -4.75F, -6.0F, 2, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-1.0F, -4.25F, -5.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, -1.6581F, 0.7854F, 0.0F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 8, 11, 0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 1.0472F, 0.0F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 8, 2, -0.01F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -4.25F, -4.25F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -1.5708F, 1.5708F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 24, 21, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -4.25F, -4.25F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -1.5708F, -1.5708F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 5, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -4.25F, -3.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -1.5708F, 2.1817F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 10, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -4.25F, -3.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -1.5708F, -2.1817F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(1.0F, -4.25F, -5.0F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, -1.6581F, -0.7854F, 0.0F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 8, 15, 0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 1.0472F, 0.0F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 8, 6, 0.01F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.75F, -6.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 19, -0.99F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, 0.0F, -0.75F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0873F, 0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 15, 0.0F, -4.0F, 0.0F, 0, 4, 12, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, 0.0F, -0.75F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0873F, -0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 11, 0.0F, -4.0F, 0.0F, 0, 4, 12, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.75F, -3.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 24, 17, -0.99F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.25F, 1.0F, 6.0F);
        this.body2.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.4363F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.25F, 1.0F, 6.0F);
        this.body2.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.4363F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -4.75F, -5.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 1.3963F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 8, 0, -3.0F, -0.02F, 0.0F, 4, 0, 12, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -4.75F, -4.0F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, 1.0472F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 8, 12, -3.0F, -0.01F, 0.0F, 4, 0, 11, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -4.75F, -5.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -1.3963F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 0, -1.0F, -0.015F, 0.0F, 4, 0, 12, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -4.75F, -4.0F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, -1.0472F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 12, -1.0F, -0.005F, 0.0F, 4, 0, 11, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5 * 0.360f);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.005f);
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
        this.body.offsetY = 0.90F;

        float modifier = 1F;

        this.faceTarget(f3, f4, 8, head);

        if (e instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
            EntityPrehistoricFloraCrawlingFlyingInsectBase ee = (EntityPrehistoricFloraCrawlingFlyingInsectBase) e;
            if (ee.getIsFlying()) {
                this.setRotateAngle(forelegR, (float) Math.toRadians(40), -(float) Math.toRadians(20), 0.0F);
                this.setRotateAngle(forelegR2, -(float) Math.toRadians(75), 0.0F, 0.0F);
                this.setRotateAngle(forelegL, (float) Math.toRadians(40), (float) Math.toRadians(20), 0.0F);
                this.setRotateAngle(forelegL2, (float) Math.toRadians(-75), 0.0F, 0.0F);

                this.flap(forelegL, 1.2F * modifier, 0.1F, true, 1, 0, f2, 1F);
                this.flap(legL2, 1.2F * modifier, 0.1F, true, 2, 0, f2, 1F);
                this.flap(legL3, 1.2F * modifier, 0.1F, true, 1, 0, f2, 1F);

                this.flap(forelegR, 1.2F * modifier, 0.1F, false, 1, 0, f2, 1F);
                this.flap(legR2, 1.2F * modifier, 0.1F, false, 2, 0, f2, 1F);
                this.flap(legR3, 1.2F * modifier, 0.1F, false, 1, 0, f2, 1F);

                this.flap(forewingL, 2.2F * modifier, 0.5F, true, 0, 0, f2, 1F);
                this.flap(hindwingL, 2.2F * modifier, 0.5F, true, 3, 0, f2, 1F);
                this.flap(forewingR, 2.2F * modifier, 0.5F, false, 0, 0, f2, 1F);
                this.flap(hindwingR, 2.2F * modifier, 0.5F, false, 3, 0F, f2, 1F);

            } else {

                this.setRotateAngle(hindwingL, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(hindwingR, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(forewingR, 0.0F, 0.0F, 0.0F);

                this.walk(body2, 0.12F, -0.1F, false, 0, -0.05F, f2, 0.8F);
                this.walk(head, 0.12F, -0.15F, false, 0, -0.07F, f2, 0.8F);

                if (!(f3 == 0.0F || !ee.getIsMoving())) {
                    this.swing(forelegL, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                    this.swing(legL2, 0.5F * modifier, -0.5F, false, 3, 0.25F, f2, 1F);
                    this.swing(legL3, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                    this.swing(forelegL2, 0.5F * modifier, -0.2F, false, 0, 0.05F, f2, 1F);

                    this.swing(forelegR, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                    this.swing(legR2, 0.5F * modifier, 0.5F, false, 0, -0.25F, f2, 1F);
                    this.swing(legR3, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                    this.swing(forelegR2, 0.5F * modifier, 0.2F, false, 3, -0.05F, f2, 1F);

                    this.flap(forelegL, 1.2F * modifier, 0.05F, true, 1, 0, f2, 1F);
                    this.flap(legL2, 1.2F * modifier, 0.05F, true, 2, 0, f2, 1F);
                    this.flap(legL3, 1.2F * modifier, 0.05F, true, 1, 0, f2, 1F);

                    this.flap(forelegR, 1.2F * modifier, 0.05F, false, 1, 0, f2, 1F);
                    this.flap(legR2, 1.2F * modifier, 0.05F, false, 2, 0, f2, 1F);
                    this.flap(legR3, 1.2F * modifier, 0.05F, false, 1, 0, f2, 1F);

                }
            }
        }
        else {

            EntityPrehistoricFloraLandBase ee = (EntityPrehistoricFloraLandBase) e;

            this.walk(body2, 0.12F, -0.1F, false, 0, -0.05F, f2, 0.8F);
            this.walk(head, 0.12F, -0.15F, false, 0, -0.07F, f2, 0.8F);

            if (!(f3 == 0.0F || !ee.getIsMoving())) {
                this.swing(forelegL, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                this.swing(legL2, 0.5F * modifier, -0.5F, false, 3, 0.25F, f2, 1F);
                this.swing(legL3, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                this.swing(forelegL2, 0.5F * modifier, -0.2F, false, 0, 0.05F, f2, 1F);

                this.swing(forelegR, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                this.swing(legR2, 0.5F * modifier, 0.5F, false, 0, -0.25F, f2, 1F);
                this.swing(legR3, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                this.swing(forelegR2, 0.5F * modifier, 0.2F, false, 3, -0.05F, f2, 1F);

                this.flap(forelegL, 1.2F * modifier, 0.05F, true, 1, 0, f2, 1F);
                this.flap(legL2, 1.2F * modifier, 0.05F, true, 2, 0, f2, 1F);
                this.flap(legL3, 1.2F * modifier, 0.05F, true, 1, 0, f2, 1F);

                this.flap(forelegR, 1.2F * modifier, 0.05F, false, 1, 0, f2, 1F);
                this.flap(legR2, 1.2F * modifier, 0.05F, false, 2, 0, f2, 1F);
                this.flap(legR3, 1.2F * modifier, 0.05F, false, 1, 0, f2, 1F);

            }
        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

    }
}
