package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHibbertopterus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHibbertopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer carapace4_r1;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer l3R_r1;
    private final AdvancedModelRenderer l1R;
    private final AdvancedModelRenderer l1R_r1;
    private final AdvancedModelRenderer l2R;
    private final AdvancedModelRenderer l2_2R_r1;
    private final AdvancedModelRenderer l4R;
    private final AdvancedModelRenderer l4R_2_r1;
    private final AdvancedModelRenderer l5R;
    private final AdvancedModelRenderer l5R_2_r1;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer l3L_r1;
    private final AdvancedModelRenderer l1L;
    private final AdvancedModelRenderer l1L_r1;
    private final AdvancedModelRenderer l2L;
    private final AdvancedModelRenderer l2L_2_r1;
    private final AdvancedModelRenderer l4L;
    private final AdvancedModelRenderer l4L_2_r1;
    private final AdvancedModelRenderer l5L;
    private final AdvancedModelRenderer l5L_2_r1;
    private final AdvancedModelRenderer opisthosoma;
    private final AdvancedModelRenderer opisthosoma1_r1;
    private final AdvancedModelRenderer opisthosoma2;
    private final AdvancedModelRenderer opisthosoma2_r1;
    private final AdvancedModelRenderer opisthosoma3;
    private final AdvancedModelRenderer opisthosoma3_r1;
    private final AdvancedModelRenderer opisthosoma4;
    private final AdvancedModelRenderer opisthosoma4_r1;
    private final AdvancedModelRenderer opisthosoma5;
    private final AdvancedModelRenderer opisthosoma5_r1;
    private final AdvancedModelRenderer opisthosoma6;
    private final AdvancedModelRenderer opisthosoma6_r1;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer telson1_r1;

    public ModelHibbertopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 27, -6.0F, -6.0F, -4.0F, 12, 6, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 29, 27, -6.0F, -2.0F, -7.0F, 12, 2, 3, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 4, 4, -6.5F, -0.9F, -7.5F, 13, 1, 9, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 30, 34, -6.0F, -6.0F, 1.0F, 12, 6, 4, 0.0F, false));

        this.carapace4_r1 = new AdvancedModelRenderer(this);
        this.carapace4_r1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(carapace4_r1);
        this.setRotateAngle(carapace4_r1, 0.9599F, 0.0F, 0.0F);
        this.carapace4_r1.cubeList.add(new ModelBox(carapace4_r1, 28, 14, -5.5F, -9.0F, 0.9F, 11, 3, 5, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(legsR);


        this.l3R_r1 = new AdvancedModelRenderer(this);
        this.l3R_r1.setRotationPoint(-2.0F, -4.0F, -6.0F);
        this.legsR.addChild(l3R_r1);
        this.setRotateAngle(l3R_r1, 0.0F, -0.6981F, -0.6981F);
        this.l3R_r1.cubeList.add(new ModelBox(l3R_r1, 34, 32, -5.9392F, -0.6502F, 0.2642F, 6, 1, 1, 0.0F, false));

        this.l1R = new AdvancedModelRenderer(this);
        this.l1R.setRotationPoint(-1.0F, -4.0F, -5.0F);
        this.legsR.addChild(l1R);


        this.l1R_r1 = new AdvancedModelRenderer(this);
        this.l1R_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.l1R.addChild(l1R_r1);
        this.setRotateAngle(l1R_r1, 0.5236F, 0.0873F, 0.0F);
        this.l1R_r1.cubeList.add(new ModelBox(l1R_r1, 39, 50, -0.9396F, -0.0018F, -4.1109F, 2, 0, 4, 0.0F, false));

        this.l2R = new AdvancedModelRenderer(this);
        this.l2R.setRotationPoint(-2.0F, -4.0F, -6.0F);
        this.legsR.addChild(l2R);


        this.l2_2R_r1 = new AdvancedModelRenderer(this);
        this.l2_2R_r1.setRotationPoint(2.0F, 4.0F, 6.0F);
        this.l2R.addChild(l2_2R_r1);
        this.setRotateAngle(l2_2R_r1, 0.2618F, 0.0873F, 0.0F);
        this.l2_2R_r1.cubeList.add(new ModelBox(l2_2R_r1, 32, 61, -1.5F, -5.5F, -10.0F, 2, 0, 3, 0.0F, false));
        this.l2_2R_r1.cubeList.add(new ModelBox(l2_2R_r1, 2, 58, -2.0F, -6.0F, -10.0F, 1, 1, 5, 0.0F, false));

        this.l4R = new AdvancedModelRenderer(this);
        this.l4R.setRotationPoint(-3.0F, -4.0F, -4.0F);
        this.legsR.addChild(l4R);
        this.setRotateAngle(l4R, 0.0F, 0.0F, -0.0436F);


        this.l4R_2_r1 = new AdvancedModelRenderer(this);
        this.l4R_2_r1.setRotationPoint(3.0436F, 4.001F, 4.0F);
        this.l4R.addChild(l4R_2_r1);
        this.setRotateAngle(l4R_2_r1, 0.0F, 0.0F, -0.5236F);
        this.l4R_2_r1.cubeList.add(new ModelBox(l4R_2_r1, 5, 10, -8.0F, -6.0F, -4.5F, 2, 1, 1, 0.0F, false));
        this.l4R_2_r1.cubeList.add(new ModelBox(l4R_2_r1, 30, 44, -6.0F, -7.0F, -5.0F, 6, 2, 2, 0.0F, false));

        this.l5R = new AdvancedModelRenderer(this);
        this.l5R.setRotationPoint(-3.0F, -4.0F, -2.0F);
        this.legsR.addChild(l5R);


        this.l5R_2_r1 = new AdvancedModelRenderer(this);
        this.l5R_2_r1.setRotationPoint(3.0F, 4.0F, 2.0F);
        this.l5R.addChild(l5R_2_r1);
        this.setRotateAngle(l5R_2_r1, 0.0F, 0.5236F, -0.5236F);
        this.l5R_2_r1.cubeList.add(new ModelBox(l5R_2_r1, 0, 9, -8.0F, -6.0F, -2.5F, 2, 1, 1, 0.0F, false));
        this.l5R_2_r1.cubeList.add(new ModelBox(l5R_2_r1, 36, 22, -6.0F, -7.0F, -3.0F, 6, 2, 2, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(legsL);


        this.l3L_r1 = new AdvancedModelRenderer(this);
        this.l3L_r1.setRotationPoint(2.0F, -4.0F, -6.0F);
        this.legsL.addChild(l3L_r1);
        this.setRotateAngle(l3L_r1, 0.0F, 0.6981F, 0.6981F);
        this.l3L_r1.cubeList.add(new ModelBox(l3L_r1, 44, 44, -0.0608F, -0.6502F, 0.2642F, 6, 1, 1, 0.0F, false));

        this.l1L = new AdvancedModelRenderer(this);
        this.l1L.setRotationPoint(1.0F, -4.0F, -5.0F);
        this.legsL.addChild(l1L);


        this.l1L_r1 = new AdvancedModelRenderer(this);
        this.l1L_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.l1L.addChild(l1L_r1);
        this.setRotateAngle(l1L_r1, 0.5236F, -0.0873F, 0.0F);
        this.l1L_r1.cubeList.add(new ModelBox(l1L_r1, 43, 50, -1.0604F, -0.0018F, -4.1109F, 2, 0, 4, 0.0F, false));

        this.l2L = new AdvancedModelRenderer(this);
        this.l2L.setRotationPoint(2.0F, -4.0F, -6.0F);
        this.legsL.addChild(l2L);


        this.l2L_2_r1 = new AdvancedModelRenderer(this);
        this.l2L_2_r1.setRotationPoint(-2.0F, 4.0F, 6.0F);
        this.l2L.addChild(l2L_2_r1);
        this.setRotateAngle(l2L_2_r1, 0.2618F, -0.0873F, 0.0F);
        this.l2L_2_r1.cubeList.add(new ModelBox(l2L_2_r1, 39, 61, -0.5F, -5.5F, -10.0F, 2, 0, 3, 0.0F, false));
        this.l2L_2_r1.cubeList.add(new ModelBox(l2L_2_r1, 18, 58, 1.0F, -6.0F, -10.0F, 1, 1, 5, 0.0F, false));

        this.l4L = new AdvancedModelRenderer(this);
        this.l4L.setRotationPoint(3.0F, -4.0F, -4.0F);
        this.legsL.addChild(l4L);


        this.l4L_2_r1 = new AdvancedModelRenderer(this);
        this.l4L_2_r1.setRotationPoint(-3.0F, 4.0F, 4.0F);
        this.l4L.addChild(l4L_2_r1);
        this.setRotateAngle(l4L_2_r1, 0.0F, 0.0F, 0.5236F);
        this.l4L_2_r1.cubeList.add(new ModelBox(l4L_2_r1, 0, 11, 6.0F, -6.0F, -4.5F, 2, 1, 1, 0.0F, false));
        this.l4L_2_r1.cubeList.add(new ModelBox(l4L_2_r1, 44, 46, 0.0F, -7.0F, -5.0F, 6, 2, 2, 0.0F, false));

        this.l5L = new AdvancedModelRenderer(this);
        this.l5L.setRotationPoint(3.0F, -4.0F, -2.0F);
        this.legsL.addChild(l5L);


        this.l5L_2_r1 = new AdvancedModelRenderer(this);
        this.l5L_2_r1.setRotationPoint(-3.0F, 4.0F, 2.0F);
        this.l5L.addChild(l5L_2_r1);
        this.setRotateAngle(l5L_2_r1, 0.0F, -0.5236F, 0.5236F);
        this.l5L_2_r1.cubeList.add(new ModelBox(l5L_2_r1, 6, 5, 6.0F, -6.0F, -2.5F, 2, 1, 1, 0.0F, false));
        this.l5L_2_r1.cubeList.add(new ModelBox(l5L_2_r1, 16, 46, 0.0F, -7.0F, -3.0F, 6, 2, 2, 0.0F, false));

        this.opisthosoma = new AdvancedModelRenderer(this);
        this.opisthosoma.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.carapace.addChild(opisthosoma);


        this.opisthosoma1_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma1_r1.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.opisthosoma.addChild(opisthosoma1_r1);
        this.setRotateAngle(opisthosoma1_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma1_r1.cubeList.add(new ModelBox(opisthosoma1_r1, 0, 14, -5.0F, -9.0F, -1.0F, 10, 5, 8, 0.0F, false));

        this.opisthosoma2 = new AdvancedModelRenderer(this);
        this.opisthosoma2.setRotationPoint(0.0F, 1.5F, 6.0F);
        this.opisthosoma.addChild(opisthosoma2);


        this.opisthosoma2_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma2_r1.setRotationPoint(0.0F, 4.5F, -8.0F);
        this.opisthosoma2.addChild(opisthosoma2_r1);
        this.setRotateAngle(opisthosoma2_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma2_r1.cubeList.add(new ModelBox(opisthosoma2_r1, 0, 38, -4.0F, -8.0F, 7.0F, 8, 4, 2, 0.0F, false));

        this.opisthosoma3 = new AdvancedModelRenderer(this);
        this.opisthosoma3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.opisthosoma2.addChild(opisthosoma3);


        this.opisthosoma3_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma3_r1.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.opisthosoma3.addChild(opisthosoma3_r1);
        this.setRotateAngle(opisthosoma3_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma3_r1.cubeList.add(new ModelBox(opisthosoma3_r1, 0, 44, -3.0F, -8.0F, 9.0F, 6, 4, 2, 0.0F, false));

        this.opisthosoma4 = new AdvancedModelRenderer(this);
        this.opisthosoma4.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.opisthosoma3.addChild(opisthosoma4);


        this.opisthosoma4_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma4_r1.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.opisthosoma4.addChild(opisthosoma4_r1);
        this.setRotateAngle(opisthosoma4_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma4_r1.cubeList.add(new ModelBox(opisthosoma4_r1, 47, 0, -2.5F, -7.0F, 11.0F, 5, 3, 2, 0.0F, false));

        this.opisthosoma5 = new AdvancedModelRenderer(this);
        this.opisthosoma5.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.opisthosoma4.addChild(opisthosoma5);


        this.opisthosoma5_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma5_r1.setRotationPoint(0.0F, 2.5F, -14.0F);
        this.opisthosoma5.addChild(opisthosoma5_r1);
        this.setRotateAngle(opisthosoma5_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma5_r1.cubeList.add(new ModelBox(opisthosoma5_r1, 0, 0, -2.0F, -7.0F, 13.0F, 4, 3, 2, 0.0F, false));

        this.opisthosoma6 = new AdvancedModelRenderer(this);
        this.opisthosoma6.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.opisthosoma5.addChild(opisthosoma6);


        this.opisthosoma6_r1 = new AdvancedModelRenderer(this);
        this.opisthosoma6_r1.setRotationPoint(0.0F, 1.5F, -16.0F);
        this.opisthosoma6.addChild(opisthosoma6_r1);
        this.setRotateAngle(opisthosoma6_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma6_r1.cubeList.add(new ModelBox(opisthosoma6_r1, 0, 5, -1.0F, -6.0F, 15.0F, 2, 2, 2, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.opisthosoma6.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 6, 7, -0.5F, 0.0F, 5.5F, 1, 1, 2, 0.0F, false));

        this.telson1_r1 = new AdvancedModelRenderer(this);
        this.telson1_r1.setRotationPoint(0.0F, 1.0F, -18.0F);
        this.telson.addChild(telson1_r1);
        this.setRotateAngle(telson1_r1, -0.0436F, 0.0F, 0.0F);
        this.telson1_r1.cubeList.add(new ModelBox(telson1_r1, 14, 38, -1.5F, -2.0F, 17.5F, 3, 1, 6, 0.0F, false));

        updateDefaultPose();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.carapace.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.carapace.offsetZ = -0.6F;
        this.carapace.render(0.1F);
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
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        EntityPrehistoricFloraHibbertopterus ee = (EntityPrehistoricFloraHibbertopterus) e;

        this.resetToDefaultPose();
        this.carapace.offsetY = 0.0F;
        AdvancedModelRenderer[] Tail = {this.opisthosoma4, this.opisthosoma5, this.opisthosoma6};

        //mouthparts:
        this.swing(l2L, 0.4F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(l2R, 0.4F, 0.3F, false, 0, 0.1F, f2, 0.8F);
        this.swing(l1L, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(l1R, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

        if (f3 == 0.0F) {return;}

        float speedFactor = 2.0F; // a float indicating how much the size affects the speed changes
        float speedMultplier = (float) (1 + ((1F - ee.getAgeScale()) * speedFactor));
        //System.err.println("Agescale Hibbert: " + ee.getAgeScale());

        if (!e.isInWater()) {
            this.swing(l3L_r1, 0.12F * speedMultplier, -0.12F, false, 0, -0.1F, f2, 1F);
            this.swing(l3R_r1, 0.12F * speedMultplier, -0.12F, false, 2, -0.1F, f2, 1F);
            this.swing(l4L, 0.12F * speedMultplier, 0.2F, false, 0, -0.1F, f2, 1F);
            this.swing(l5L, 0.12F * speedMultplier, 0.2F, false, 2, -0.1F, f2, 1F);
            this.swing(l4R, 0.12F * speedMultplier, -0.2F, false, 0, -0.1F, f2, 1F);
            this.swing(l5R, 0.12F * speedMultplier, -0.2F, false, 2, -0.1F, f2, 1F);
        } else {
            this.swing(l3L_r1, 0.2F * speedMultplier, -0.12F, false, 0, -0.1F, f2, 1F);
            this.swing(l3R_r1, 0.2F * speedMultplier, -0.12F, false, 2, -0.1F, f2, 1F);
            this.swing(l4L, 0.2F * speedMultplier, 0.2F, false, 0, -0.1F, f2, 1F);
            this.swing(l5L, 0.2F * speedMultplier, 0.2F, false, 2, -0.1F, f2, 1F);
            this.swing(l4R, 0.2F * speedMultplier, -0.2F, false, 0, -0.1F, f2, 1F);
            this.swing(l5R, 0.2F * speedMultplier, -0.2F, false, 2, -0.1F, f2, 1F);
        }

        this.chainSwing(Tail, 0.15F, -0.2F, -1, f2, 0.5F);
    }

}
