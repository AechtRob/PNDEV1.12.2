package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelHarvestman extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer pedipalpR;

    public ModelHarvestman() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -7.0F, -3.0F, 4, 3, 6, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(0.5F, -4.5F, -2.75F);
        this.body.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.3054F, -0.1745F, 0.0F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 0, 6, 0.0F, -3.0F, -3.0F, 0, 3, 3, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.75F, -4.5F, -2.75F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.2443F, -0.7418F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 40, 36, 0.0F, -14.0F, -22.0F, 0, 14, 22, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.75F, -4.5F, -2.75F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.2443F, 0.7418F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 40, 36, 0.0F, -14.0F, -22.0F, 0, 14, 22, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.75F, -4.5F, -2.25F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.192F, -1.3526F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 14, 0.0F, -16.0F, -28.0F, 0, 16, 28, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.75F, -4.5F, -2.25F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.192F, 1.3526F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 14, 0.0F, -16.0F, -28.0F, 0, 16, 28, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.75F, -4.5F, -1.75F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.2443F, -2.0944F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 40, 36, 0.0F, -14.0F, -22.0F, 0, 14, 22, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.75F, -4.5F, -1.75F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.2443F, 2.0944F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 40, 36, 0.0F, -14.0F, -22.0F, 0, 14, 22, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.75F, -4.5F, -1.25F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.192F, -2.618F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 14, 0.0F, -16.0F, -28.0F, 0, 16, 28, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.75F, -4.5F, -1.25F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.192F, 2.618F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 14, 0.0F, -16.0F, -28.0F, 0, 16, 28, 0.0F, true));

        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(-0.5F, -4.5F, -2.75F);
        this.body.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.3054F, 0.1745F, 0.0F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 0, 0, 0.0F, -3.0F, -3.0F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.135F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = -0.04F;
        this.body.render(0.037F);
        GlStateManager.enableCull();
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
        this.body.offsetY = 1.3F;

        this.body.rotateAngleY = f3 * 0.017453292F;

        this.pedipalpL.swing(0.75F, (float)Math.toRadians(-3), false, 0, 0F, f2, 1.0F);
        this.pedipalpR.swing(0.75F, (float)Math.toRadians(3), false, 0, 0F, f2, 1.0F);
        this.pedipalpL.walk(0.75F, (float)Math.toRadians(6), false, 0, 0F, f2, 1.0F);
        this.pedipalpR.walk(0.75F, (float)Math.toRadians(6), false, 0, 0F, f2, 1.0F);

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if (f3 == 0.0F || ((!ee.getIsMoving()) && !ee.getIsClimbing()) || ee.getHeadCollided()) {
            return;
        }

        //this.legL1.flap(0.5F, -0.5F, false, 0F, 1F, f2, 1F);
        //this.legR1.flap(0.5F, -0.5F, true, 3F, 1F, f2, 1F);

        //this.legL2.flap(0.5F, -0.5F, false, 1F, 1F, f2, 1F);
        //this.legR2.flap(0.5F, -0.5F, true, 1F, 1F, f2, 1F);

        //this.legL3.flap(0.5F, -0.5F, false, 2F, 1F, f2, 1F);
        //this.legR3.flap(0.5F, -0.5F, true, 2F, 1F, f2, 1F);

        //this.legL4.flap(0.5F, -0.5F, false, 3F, 1F, f2, 1F);
        //this.legR4.flap(0.5F, -0.5F, true, 0F, 1F, f2, 1F);


        this.legL1.swing(0.65F, 0.55F, false, 2F, 0F, f2, 1F);
        this.legR1.swing(0.65F, 0.55F, true, 1F, 0F, f2, 1F);

        this.legL2.swing(0.65F, 0.55F, false, 3F, 0F, f2, 1F);
        this.legR2.swing(0.65F, 0.55F, true, 3F, 0F, f2, 1F);

        this.legL3.swing(0.65F, 0.55F, false, 0, 0F, f2, 1F);
        this.legR3.swing(0.65F, 0.55F, true, 0, 0F, f2, 1F);

        this.legL4.swing(0.65F, 0.55F, false, 1F, 0F, f2, 1F);
        this.legR4.swing(0.65F, 0.55F, true, 2F, 0F, f2, 1F);

    }
}
