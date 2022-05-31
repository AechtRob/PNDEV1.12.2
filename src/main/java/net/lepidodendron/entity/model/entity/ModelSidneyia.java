package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSidneyia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaeL;
    private final AdvancedModelRenderer antennaeR;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;

    public ModelSidneyia() {
        this.textureWidth = 48;
        this.textureHeight = 36;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.0F, -7.0F, 8, 2, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 18, -3.0F, -2.0F, 3.0F, 6, 2, 2, 0.0F, false));

        this.antennaeL = new AdvancedModelRenderer(this);
        this.antennaeL.setRotationPoint(4.0F, -1.0F, -5.5F);
        this.body.addChild(antennaeL);
        this.setRotateAngle(antennaeL, 0.0F, 0.1745F, 0.0F);
        this.antennaeL.cubeList.add(new ModelBox(antennaeL, 10, 12, 0.0F, 0.0F, -6.0F, 5, 0, 6, 0.0F, false));

        this.antennaeR = new AdvancedModelRenderer(this);
        this.antennaeR.setRotationPoint(-4.0F, -1.0F, -5.5F);
        this.body.addChild(antennaeR);
        this.setRotateAngle(antennaeR, 0.0F, -0.1745F, 0.0F);
        this.antennaeR.cubeList.add(new ModelBox(antennaeR, 0, 12, -5.0F, 0.0F, -6.0F, 5, 0, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -1.5F, -0.5F, -1.0F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 18, -1.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -2.0F, 0.0F, 1.0F, 4, 0, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 22, -2.5F, 0.0F, 3.0F, 5, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(-2.0F, 0.0F, -4.5F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.48F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 19, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(2.0F, 0.0F, -4.5F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.48F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 18, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-0.25F, 0.0F, -3.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.0873F);
        this.legL2.cubeList.add(new ModelBox(legL2, 16, 24, -4.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(-0.25F, 0.0F, -2.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.0873F);
        this.legL3.cubeList.add(new ModelBox(legL3, 8, 24, -4.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-0.25F, 0.0F, -1.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.0873F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 24, -4.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-0.25F, 0.0F, -0.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.0873F);
        this.legL5.cubeList.add(new ModelBox(legL5, 21, 22, -4.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(-0.25F, 0.0F, 0.5F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.0873F);
        this.legL6.cubeList.add(new ModelBox(legL6, 26, 4, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(-0.25F, 0.0F, 1.5F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0436F, -0.0873F);
        this.legL7.cubeList.add(new ModelBox(legL7, 26, 2, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(-0.25F, 0.0F, 2.5F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0873F, -0.0873F);
        this.legL8.cubeList.add(new ModelBox(legL8, 26, 0, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(-0.25F, 0.0F, 3.5F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.1745F, -0.0873F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 26, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(0.25F, 0.0F, -3.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.0873F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 8, 0.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.25F, 0.0F, -2.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.0873F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 6, 0.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(0.25F, 0.0F, -1.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.0873F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 4, 0.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(0.25F, 0.0F, -0.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.0873F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 2, 0.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(0.25F, 0.0F, 0.5F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.0873F);
        this.legR6.cubeList.add(new ModelBox(legR6, 24, 24, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(0.25F, 0.0F, 1.5F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, -0.0436F, 0.0873F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 16, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(0.25F, 0.0F, 2.5F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, -0.0873F, 0.0873F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 14, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(0.25F, 0.0F, 3.5F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, -0.1745F, 0.0873F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 12, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.225F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.016F);
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
        this.body.offsetY = 1.11F;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5};
        AdvancedModelRenderer[] tailF = {this.tail, this.tail2};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
        this.chainWave(tailF, 0.25F, 0.2F, -1.5, f2, 1);
        this.chainSwing(tailF, 1.0F, 0.2F, -1.5, f2, 1);

        this.swing(antennaeL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaeR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.walk(antennaeL, 2.0F, -0.1F, false, 0, -0.05F, f2, 0.8F);
        this.walk(antennaeR, 2.0F, 0.1F, false, 0, 0.05F, f2, 0.8F);

        this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
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
        this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
        this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        this.flap(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
        this.flap(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
        this.flap(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
        this.flap(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);

        this.walk(legL1, 0.5F, -0.25F, false, 0, -0.25F, f2, 0.3F);
        this.walk(legR1, 0.5F, 0.25F, false, 0, 0.25F, f2, 0.3F);
        this.walk(legL2, 0.5F, -0.25F, false, 1.0F, -0.25F, f2, 0.3F);
        this.walk(legR2, 0.5F, 0.25F, false, 1.0F, 0.25F, f2, 0.3F);
        this.walk(legL3, 0.5F, -0.25F, false, 2.0F, -0.25F, f2, 0.3F);
        this.walk(legR3, 0.5F, 0.25F, false, 2.0F, 0.25F, f2, 0.3F);
        this.walk(legL4, 0.5F, -0.25F, false, 3.0F, -0.25F, f2, 0.3F);
        this.walk(legR4, 0.5F, 0.25F, false, 3.0F, 0.25F, f2, 0.3F);
        this.walk(legL5, 0.5F, -0.25F, false, 4.0F, -0.25F, f2, 0.3F);
        this.walk(legR5, 0.5F, 0.25F, false, 4.0F, 0.25F, f2, 0.3F);
        this.walk(legL6, 0.5F, -0.25F, false, 5.0F, -0.25F, f2, 0.3F);
        this.walk(legR6, 0.5F, 0.25F, false, 5.0F, 0.25F, f2, 0.3F);
        this.walk(legL7, 0.5F, -0.25F, false, 6.0F, -0.25F, f2, 0.3F);
        this.walk(legR7, 0.5F, 0.25F, false, 6.0F, 0.25F, f2, 0.3F);
        this.walk(legL8, 0.5F, -0.25F, false, 7.0F, -0.25F, f2, 0.3F);
        this.walk(legR8, 0.5F, 0.25F, false, 7.0F, 0.25F, f2, 0.3F);
        this.walk(legL9, 0.5F, -0.25F, false, 8.0F, -0.25F, f2, 0.3F);
        this.walk(legR9, 0.5F, 0.25F, false, 8.0F, 0.25F, f2, 0.3F);

    }
}
