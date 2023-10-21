package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDaohugoucossus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer mouthpart;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer hindwingR;

    public ModelDaohugoucossus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -2.0F, -2.0F, -4.0F, 4, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 17, -1.5F, -2.0F, 1.0F, 3, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.5F, 3.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, 1.5F, -1.75F, -3.5F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -2.5F, -1.75F, -3.5F, 1, 1, 1, 0.0F, false));

        this.mouthpart = new AdvancedModelRenderer(this);
        this.mouthpart.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.body.addChild(mouthpart);
        this.setRotateAngle(mouthpart, 1.2654F, 0.0F, 0.0F);
        this.mouthpart.cubeList.add(new ModelBox(mouthpart, 4, 1, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 12, -0.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.0F, 0.0F, -2.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 6, -1.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 0.0F, -1.25F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 4, -1.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 0.0F, -0.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.5236F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 2, -1.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, 0.0F, -1.25F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 10, -0.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, 0.0F, -0.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.5236F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 8, -0.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-2.0F, -2.0F, -2.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.5236F, 1.4835F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 6, -7.75F, -0.015F, -3.0F, 8, 0, 6, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(2.0F, -2.0F, -2.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.5236F, -1.4835F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 0, -0.25F, -0.02F, -3.0F, 8, 0, 6, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(2.0F, -2.0F, -1.0F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.4363F, 0.3491F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 16, 12, -1.5F, -0.01F, 0.0F, 4, 0, 5, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-2.0F, -2.0F, -1.0F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.4363F, -0.3491F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 8, 12, -2.5F, -0.005F, 0.0F, 4, 0, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5 * 0.2f);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.body.offsetZ = 0.1F;
        this.body.render(0.022f);
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
        this.body.offsetY = 1.20F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) { //flying pose
            this.setRotateAngle(hindwingR, 0.0F, (float)Math.toRadians(30), -(float)Math.toRadians(20));
            this.setRotateAngle(forewingR, 0.0F, (float)Math.toRadians(15), (float)Math.toRadians(20));
            this.setRotateAngle(forewingL, 0.0F, -(float)Math.toRadians(15), -(float)Math.toRadians(20));
            this.setRotateAngle(hindwingL, 0.0F, -(float)Math.toRadians(30), (float)Math.toRadians(20));

            float modifier = 1F;
            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legL1,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);
            this.flap(legL2,1.2F * modifier, 0.1F, true, 2,0, f2, 1F);
            this.flap(legL3,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);

            this.flap(legR1,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);
            this.flap(legR2,1.2F * modifier, 0.1F, false, 2,0, f2, 1F);
            this.flap(legR3,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);

        }
    }
}
