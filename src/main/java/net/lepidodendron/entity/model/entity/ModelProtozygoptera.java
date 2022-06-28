package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelProtozygoptera extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer hindwingR;

    public ModelProtozygoptera() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 5, -1.5F, -4.0F, -8.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -4.0F, -4.75F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -0.5F, -0.5F, -0.25F, 1, 1, 10, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -3.25F, -5.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.6981F, 0.0873F, 0.8727F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 7, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -3.25F, -6.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.2618F, 0.0F, 0.8727F);
        this.legR2.cubeList.add(new ModelBox(legR2, 4, 7, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -3.25F, -6.5F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.2618F, 0.0F, 0.8727F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 14, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -3.25F, -5.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.6981F, -0.0873F, -0.8727F);
        this.legL3.cubeList.add(new ModelBox(legL3, 4, 14, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -3.25F, -6.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.2618F, 0.0F, -0.8727F);
        this.legL2.cubeList.add(new ModelBox(legL2, 8, 14, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -3.25F, -6.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.2618F, 0.0F, -0.8727F);
        this.legL.cubeList.add(new ModelBox(legL, 12, 14, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -4.25F, -5.75F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, -1.1345F, -1.6144F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 11, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -4.25F, -5.75F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, 1.1345F, 1.6144F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 9, 3, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -4.0F, -4.75F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -1.2217F, -1.6581F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 9, 6, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -4.0F, -4.75F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 1.2217F, 1.6581F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 9, 0, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.1F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) { //flying pose
            this.setRotateAngle(hindwingR, 0.0F, (float)Math.toRadians(15), 0.0F);
            this.setRotateAngle(forewingR, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -(float)Math.toRadians(15), 0.0F);

            float modifier = 1F;
            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legL,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);
            this.flap(legL2,1.2F * modifier, 0.1F, true, 2,0, f2, 1F);
            this.flap(legL3,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);

            this.flap(legR,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);
            this.flap(legR2,1.2F * modifier, 0.1F, false, 2,0, f2, 1F);
            this.flap(legR3,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);

        }
    }
}
