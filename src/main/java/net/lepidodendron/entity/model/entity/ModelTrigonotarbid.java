package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrigonotarbid extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cephalothorax;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer legj1;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer legj5;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer legj2;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer legj6;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer legj3;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer legj7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer legj4;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer legj8;
    private final AdvancedModelRenderer jawL2;
    private final AdvancedModelRenderer jawL;
    private final AdvancedModelRenderer pedipalpR;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer attercopus_tail;

    public ModelTrigonotarbid() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalothorax = new AdvancedModelRenderer(this);
        this.cephalothorax.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(cephalothorax);
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 14, 8, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 0, 20, -1.0F, -1.5F, -3.0F, 2, 1, 3, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 0, 0, -1.0F, -0.5F, -5.0F, 2, 1, 1, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(2.0F, 0.5F, -3.5F);
        this.cephalothorax.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.6981F, -0.3491F);
        this.leg1.cubeList.add(new ModelBox(leg1, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj1 = new AdvancedModelRenderer(this);
        this.legj1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg1.addChild(legj1);
        this.setRotateAngle(legj1, 0.0F, 0.0F, 1.1345F);
        this.legj1.cubeList.add(new ModelBox(legj1, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-2.0F, 0.5F, -3.5F);
        this.cephalothorax.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, -0.6981F, 0.3491F);
        this.leg5.cubeList.add(new ModelBox(leg5, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj5 = new AdvancedModelRenderer(this);
        this.legj5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg5.addChild(legj5);
        this.setRotateAngle(legj5, 0.0F, 0.0F, -1.1345F);
        this.legj5.cubeList.add(new ModelBox(legj5, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(2.0F, 0.5F, -2.5F);
        this.cephalothorax.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.2618F, -0.3491F);
        this.leg2.cubeList.add(new ModelBox(leg2, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj2 = new AdvancedModelRenderer(this);
        this.legj2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg2.addChild(legj2);
        this.setRotateAngle(legj2, 0.0F, 0.0F, 1.1345F);
        this.legj2.cubeList.add(new ModelBox(legj2, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-2.0F, 0.5F, -2.5F);
        this.cephalothorax.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, -0.2618F, 0.3491F);
        this.leg6.cubeList.add(new ModelBox(leg6, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj6 = new AdvancedModelRenderer(this);
        this.legj6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg6.addChild(legj6);
        this.setRotateAngle(legj6, 0.0F, 0.0F, -1.1345F);
        this.legj6.cubeList.add(new ModelBox(legj6, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.5F, -1.5F);
        this.cephalothorax.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.2618F, -0.3491F);
        this.leg3.cubeList.add(new ModelBox(leg3, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj3 = new AdvancedModelRenderer(this);
        this.legj3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3.addChild(legj3);
        this.setRotateAngle(legj3, 0.0F, 0.0F, 1.1345F);
        this.legj3.cubeList.add(new ModelBox(legj3, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-2.0F, 0.5F, -1.5F);
        this.cephalothorax.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.2618F, 0.3491F);
        this.leg7.cubeList.add(new ModelBox(leg7, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj7 = new AdvancedModelRenderer(this);
        this.legj7.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg7.addChild(legj7);
        this.setRotateAngle(legj7, 0.0F, 0.0F, -1.1345F);
        this.legj7.cubeList.add(new ModelBox(legj7, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(2.0F, 0.5F, -0.5F);
        this.cephalothorax.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, -0.6981F, -0.3491F);
        this.leg4.cubeList.add(new ModelBox(leg4, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj4 = new AdvancedModelRenderer(this);
        this.legj4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4.addChild(legj4);
        this.setRotateAngle(legj4, 0.0F, 0.0F, 1.1345F);
        this.legj4.cubeList.add(new ModelBox(legj4, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-2.0F, 0.5F, -0.5F);
        this.cephalothorax.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.6981F, 0.3491F);
        this.leg8.cubeList.add(new ModelBox(leg8, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj8 = new AdvancedModelRenderer(this);
        this.legj8.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg8.addChild(legj8);
        this.setRotateAngle(legj8, 0.0F, 0.0F, -1.1345F);
        this.legj8.cubeList.add(new ModelBox(legj8, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.jawL2 = new AdvancedModelRenderer(this);
        this.jawL2.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.cephalothorax.addChild(jawL2);
        this.setRotateAngle(jawL2, 0.2182F, 0.0F, 0.0F);
        this.jawL2.cubeList.add(new ModelBox(jawL2, 0, 8, 0.0F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.jawL = new AdvancedModelRenderer(this);
        this.jawL.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.cephalothorax.addChild(jawL);
        this.setRotateAngle(jawL, 0.2182F, 0.0F, 0.0F);
        this.jawL.cubeList.add(new ModelBox(jawL, 0, 10, 0.0F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(-1.5F, 0.5F, -4.0F);
        this.cephalothorax.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.0F, 0.2618F, 0.0F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 0, 0, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(1.5F, 0.5F, -4.0F);
        this.cephalothorax.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.0F, -0.2618F, 0.0F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 0, 5, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 8, -2.0F, -1.5F, 0.0F, 4, 1, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 10, 21, -2.0F, -1.0F, 6.0F, 4, 2, 1, 0.0F, false));

        this.attercopus_tail = new AdvancedModelRenderer(this);
        this.attercopus_tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.abdomen.addChild(attercopus_tail);
        this.attercopus_tail.cubeList.add(new ModelBox(attercopus_tail, 0, 7, 0.0F, -0.5F, 0.0F, 0, 1, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.32F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetY = -0.005F;
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
        this.body.offsetY = 1F;

        this.body.rotateAngleY = f3 * 0.017453292F;

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && (!ee.getIsClimbing() || ee.getHeadCollided())) {
            return;
        }

        this.leg1.flap(0.5F, 0.5F, false, 0F, 1F, f2, 1F);
        this.leg5.flap(0.5F, 0.5F, true, 3F, 1F, f2, 1F);

        this.leg2.flap(0.5F, 0.5F, false, 1F, 1F, f2, 1F);
        this.leg6.flap(0.5F, 0.5F, true, 1F, 1F, f2, 1F);

        this.leg3.flap(0.5F, 0.5F, false, 2F, 1F, f2, 1F);
        this.leg7.flap(0.5F, 0.5F, true, 2F, 1F, f2, 1F);

        this.leg4.flap(0.5F, 0.5F, false, 3F, 1F, f2, 1F);
        this.leg8.flap(0.5F, 0.5F, true, 0F, 1F, f2, 1F);


        this.legj1.flap(0.5F, 0.8F, true, 2F, 1F, f2, 0.5F);
        this.legj5.flap(0.5F, 0.8F, false, 1F, 1F, f2, 0.5F);

        this.legj2.flap(0.5F, 0.8F, true, 3F, 1F, f2, 0.5F);
        this.legj6.flap(0.5F, 0.8F, false, 3F, 1F, f2, 0.5F);

        this.legj3.flap(0.5F, 0.8F, true, 0F, 1F, f2, 0.5F);
        this.legj7.flap(0.5F, 0.8F, false, 0F, 1F, f2, 0.5F);

        this.legj4.flap(0.5F, 0.8F, true, 1F, 1F, f2, 0.5F);
        this.legj8.flap(0.5F, 0.8F, false, 2F, 1F, f2, 0.5F);


        this.leg1.swing(0.5F, 0.3F, false, 2F, 0F, f2, 1F);
        this.leg5.swing(0.5F, 0.3F, true, 1F, 0F, f2, 1F);

        this.leg2.swing(0.5F, 0.3F, false, 3F, 0F, f2, 1F);
        this.leg6.swing(0.5F, 0.3F, true, 3F, 0F, f2, 1F);

        this.leg3.swing(0.5F, 0.3F, false, 0, 0F, f2, 1F);
        this.leg7.swing(0.5F, 0.3F, true, 0, 0F, f2, 1F);

        this.leg4.swing(0.5F, 0.3F, false, 1F, 0F, f2, 1F);
        this.leg8.swing(0.5F, 0.3F, true, 2F, 0F, f2, 1F);

    }
}
