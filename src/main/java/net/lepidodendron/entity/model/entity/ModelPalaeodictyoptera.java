package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPalaeodictyoptera extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer cerciR;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer subwingL;
    private final AdvancedModelRenderer subwingR;

    public ModelPalaeodictyoptera() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 18, 4, -1.0F, -3.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -1.5F, -2.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.7854F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 22, 12, -3.0F, -0.5F, 1.0F, 3, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -1.5F, -3.0F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 22, 12, -3.0F, -0.5F, 1.0F, 3, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -1.5F, -1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.7854F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 22, 24, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -1.5F, -2.0F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 22, 24, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -1.5F, -3.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.7854F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 22, 12, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -1.5F, -3.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.7854F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 22, 24, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.body.addChild(hindwingR);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 16, -9.0F, 0.0F, -1.0F, 9, 0, 4, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -2.25F, -1.0F);
        this.body.addChild(forewingR);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 0, -9.0F, 0.0F, -2.0F, 9, 0, 4, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -2.25F, -1.0F);
        this.body.addChild(forewingL);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 4, 0.0F, 0.0F, -2.0F, 9, 0, 4, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.body.addChild(hindwingL);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 12, 0.0F, 0.0F, -1.0F, 9, 0, 4, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 15, 15, -2.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(-0.5F, 0.0F, 7.0F);
        this.abdomen.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.5236F, 0.0F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 10, 0.0F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-1.5F, 0.0F, 7.0F);
        this.abdomen.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.5236F, 0.0F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 10, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 0, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, -0.5F, -1.75F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 15, 0.15F, -3.5F, -4.75F, 0, 4, 5, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, -0.5F, -1.75F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 15, -0.15F, -3.5F, -4.75F, 0, 4, 5, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, 0.4363F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 10, 17, 0.0F, -0.5F, -2.75F, 0, 1, 3, 0.0F, false));

        this.subwingL = new AdvancedModelRenderer(this);
        this.subwingL.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.body.addChild(subwingL);
        this.subwingL.cubeList.add(new ModelBox(subwingL, 0, 8, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.subwingR = new AdvancedModelRenderer(this);
        this.subwingR.setRotationPoint(-1.0F, -2.0F, -4.0F);
        this.body.addChild(subwingR);
        this.subwingR.cubeList.add(new ModelBox(subwingR, 6, 8, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5 * 0.5f);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetZ = -0.1F;
        this.body.render(0.022f);
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
        this.body.offsetY = 0.7F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {
            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legR2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legL2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legR, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3491F, 0.0F);
            //this.setRotateAngle(cerciL, 0.0F, 0.2618F, 0.0F);
            //this.setRotateAngle(cerciR, 0.0F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);
            this.setRotateAngle(mouth, 0.4363F, 0.0F, 0.0F);

            //this.swing(cerciL, 1F, -0.4F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(cerciR, 1F, 0.4F, false, 0, 0.1F, f2, 0.8F);
            float modifier = 1F;
            //modifier = 0.02F;
            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            //this.flap(forewingL,2.2F * modifier, 0.5F, true, -1,0.2F, f2, 1F);
            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);
            //this.flap(forewingR,2.2F * modifier, 0.5F, false, -1,0.2F, f2, 1F);
        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);
        this.swing(mouth, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(cerciL, 0.12F, -0.4F, false, 0, -0.1F, f2, 0.8F);
        this.swing(cerciR, 0.12F, 0.4F, false, 0, 0.1F, f2, 0.8F);

    }
}
