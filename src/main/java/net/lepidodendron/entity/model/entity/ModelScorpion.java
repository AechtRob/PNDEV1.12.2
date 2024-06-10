package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraScorpion;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScorpion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer baby3;
    private final AdvancedModelRenderer baby2;
    private final AdvancedModelRenderer baby;
    private final AdvancedModelRenderer baby4;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer baby5;
    private final AdvancedModelRenderer baby6;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL2_r1;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR2_r1;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer leg1R;
    private final AdvancedModelRenderer leg2R;
    private final AdvancedModelRenderer leg3R;
    private final AdvancedModelRenderer leg4R;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer leg1L;
    private final AdvancedModelRenderer leg2L;
    private final AdvancedModelRenderer leg3L;
    private final AdvancedModelRenderer leg4L;

    private ModelAnimator animator;

    public ModelScorpion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 18, -3.0F, -3.0F, -7.0F, 6, 2, 5, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -2.99F, -1.0F, 0.0F, 6, 2, 8, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 17, 4, -3.5F, 1.5F, 0.0F, 7, 0, 3, 0.0F, false));

        this.baby3 = new AdvancedModelRenderer(this);
        this.baby3.setRotationPoint(-1.0F, -1.0F, 4.25F);
        this.abdomen.addChild(baby3);
        this.setRotateAngle(baby3, 0.0F, -0.9599F, 0.0F);
        this.baby3.cubeList.add(new ModelBox(baby3, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.baby2 = new AdvancedModelRenderer(this);
        this.baby2.setRotationPoint(2.0F, -1.0F, 2.5F);
        this.abdomen.addChild(baby2);
        this.setRotateAngle(baby2, 0.0F, -0.0436F, 0.0F);
        this.baby2.cubeList.add(new ModelBox(baby2, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.baby = new AdvancedModelRenderer(this);
        this.baby.setRotationPoint(-1.0F, -1.0F, 0.75F);
        this.abdomen.addChild(baby);
        this.setRotateAngle(baby, 0.0F, 0.3491F, 0.0F);
        this.baby.cubeList.add(new ModelBox(baby, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.baby4 = new AdvancedModelRenderer(this);
        this.baby4.setRotationPoint(1.0F, -1.0F, 7.0F);
        this.abdomen.addChild(baby4);
        this.setRotateAngle(baby4, 0.0F, -2.618F, 0.0F);
        this.baby4.cubeList.add(new ModelBox(baby4, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.abdomen.addChild(abdomen2);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 18, 22, -2.5F, -1.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.abdomen2.addChild(abdomen3);
        this.setRotateAngle(abdomen3, 0.1745F, 0.0F, 0.0F);
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 32, 9, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen3.addChild(tail1);
        this.setRotateAngle(tail1, 0.4363F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 39, 26, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.4363F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 39, -0.999F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.4363F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 19, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4363F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 37, -0.999F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.4363F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 38, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.4363F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 7, 36, -0.999F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 0, 0.0F, -2.5F, 2.5F, 0, 3, 3, 0.0F, false));

        this.baby5 = new AdvancedModelRenderer(this);
        this.baby5.setRotationPoint(-2.0F, -1.0F, 0.75F);
        this.abdomen2.addChild(baby5);
        this.setRotateAngle(baby5, 0.0F, 0.8727F, 0.0F);
        this.baby5.cubeList.add(new ModelBox(baby5, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.baby6 = new AdvancedModelRenderer(this);
        this.baby6.setRotationPoint(1.25F, -1.0F, 1.75F);
        this.abdomen2.addChild(baby6);
        this.setRotateAngle(baby6, 0.0F, -0.3054F, 0.0F);
        this.baby6.cubeList.add(new ModelBox(baby6, 0, 43, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.0F, -2.0F, -8.0F);
        this.body.addChild(armL);
        this.armL.cubeList.add(new ModelBox(armL, 31, 31, 0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.armL.addChild(armL2);


        this.armL2_r1 = new AdvancedModelRenderer(this);
        this.armL2_r1.setRotationPoint(-6.0F, 2.0F, 8.0F);
        this.armL2.addChild(armL2_r1);
        this.setRotateAngle(armL2_r1, 0.0F, -0.0873F, 0.0F);
        this.armL2_r1.cubeList.add(new ModelBox(armL2_r1, 34, 40, 5.0F, -2.1F, -11.0F, 2, 1, 3, 0.0F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.armL2.addChild(armL3);
        this.armL3.cubeList.add(new ModelBox(armL3, 33, 35, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));
        this.armL3.cubeList.add(new ModelBox(armL3, 26, 33, 0.0F, -0.45F, -7.0F, 1, 1, 4, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.armL3.addChild(clawL);
        this.clawL.cubeList.add(new ModelBox(clawL, 32, 24, -0.25F, -0.4F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.0F, -2.0F, -8.0F);
        this.body.addChild(armR);
        this.armR.cubeList.add(new ModelBox(armR, 28, 7, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.armR.addChild(armR2);


        this.armR2_r1 = new AdvancedModelRenderer(this);
        this.armR2_r1.setRotationPoint(6.0F, 2.0F, 8.0F);
        this.armR2.addChild(armR2_r1);
        this.setRotateAngle(armR2_r1, 0.0F, 0.0873F, 0.0F);
        this.armR2_r1.cubeList.add(new ModelBox(armR2_r1, 38, 13, -7.0F, -2.1F, -11.0F, 2, 1, 3, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.armR2.addChild(armR3);
        this.armR3.cubeList.add(new ModelBox(armR3, 32, 13, -1.0F, -0.45F, -7.0F, 1, 1, 4, 0.0F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 33, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.armR3.addChild(clawR);
        this.clawR.cubeList.add(new ModelBox(clawR, 20, 32, -0.75F, -0.4F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraL);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 0, 0, 0.125F, -0.9F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraR);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 34, 4, -2.125F, -0.901F, -2.0F, 2, 1, 2, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsR);


        this.leg1R = new AdvancedModelRenderer(this);
        this.leg1R.setRotationPoint(-2.0F, -2.0F, -6.0F);
        this.legsR.addChild(leg1R);
        this.setRotateAngle(leg1R, -0.5236F, 0.0F, 0.0F);
        this.leg1R.cubeList.add(new ModelBox(leg1R, 12, 32, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.leg2R = new AdvancedModelRenderer(this);
        this.leg2R.setRotationPoint(-2.0F, -2.0F, -5.0F);
        this.legsR.addChild(leg2R);
        this.setRotateAngle(leg2R, -0.5236F, 0.3491F, 0.0F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 16, 28, -7.8307F, -2.0F, 0.3825F, 8, 4, 0, 0.0F, true));

        this.leg3R = new AdvancedModelRenderer(this);
        this.leg3R.setRotationPoint(-2.0F, -2.0F, -3.7F);
        this.legsR.addChild(leg3R);
        this.setRotateAngle(leg3R, -0.5236F, 0.5236F, 0.0F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, 20, 0, -12.0391F, -2.0F, 0.0498F, 12, 4, 0, 0.0F, true));

        this.leg4R = new AdvancedModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, -2.0F, -3.0F);
        this.legsR.addChild(leg4R);
        this.setRotateAngle(leg4R, -0.5236F, 1.0472F, 0.0F);
        this.leg4R.cubeList.add(new ModelBox(leg4R, 0, 14, -15.8533F, -2.0F, 0.0031F, 16, 4, 0, 0.0F, true));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsL);


        this.leg1L = new AdvancedModelRenderer(this);
        this.leg1L.setRotationPoint(2.0F, -2.0F, -6.0F);
        this.legsL.addChild(leg1L);
        this.setRotateAngle(leg1L, -0.5236F, 0.0F, 0.0F);
        this.leg1L.cubeList.add(new ModelBox(leg1L, 12, 32, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg2L = new AdvancedModelRenderer(this);
        this.leg2L.setRotationPoint(2.0F, -2.0F, -5.0F);
        this.legsL.addChild(leg2L);
        this.setRotateAngle(leg2L, -0.5236F, -0.3491F, 0.0F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 16, 28, -0.1693F, -2.0F, 0.3825F, 8, 4, 0, 0.0F, false));

        this.leg3L = new AdvancedModelRenderer(this);
        this.leg3L.setRotationPoint(2.0F, -2.0F, -3.7F);
        this.legsL.addChild(leg3L);
        this.setRotateAngle(leg3L, -0.5236F, -0.5236F, 0.0F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, 20, 0, 0.0391F, -2.0F, 0.0498F, 12, 4, 0, 0.0F, false));

        this.leg4L = new AdvancedModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, -2.0F, -3.0F);
        this.legsL.addChild(leg4L);
        this.setRotateAngle(leg4L, -0.5236F, -1.0472F, 0.0F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, 0, 14, -0.1467F, -2.0F, 0.0031F, 16, 4, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.32F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.01F);
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

        this.cheliceraL.swing(0.85F, (float)Math.toRadians(-25), false, 0, 0F, f2, 1.0F);
        this.cheliceraR.swing(0.85F, (float)Math.toRadians(25), false, 0, 0F, f2, 1.0F);

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && !ee.getIsClimbing()) {
            return;
        }

        this.leg1L.flap(0.45F, 0.45F, false, 0F, -0.45F, f2, 1F);
        this.leg1R.flap(0.45F, 0.45F, true, 3F, -0.45F, f2, 1F);

        this.leg2L.flap(0.45F, 0.45F, false, 1F, -0.45F, f2, 1F);
        this.leg2R.flap(0.45F, 0.45F, true, 1F, -0.45F, f2, 1F);

        this.leg3L.flap(0.45F, 0.45F, false, 2F, -0.45F, f2, 1F);
        this.leg3R.flap(0.45F, 0.45F, true, 2F, -0.45F, f2, 1F);

        this.leg4L.flap(0.45F, 0.45F, false, 3F, -0.45F, f2, 1F);
        this.leg4R.flap(0.45F, 0.45F, true, 0F, -0.45F, f2, 1F);

        this.leg1L.swing(0.45F, 0.08F, false, 2F, 0F, f2, 0.75F);
        this.leg1R.swing(0.45F, 0.08F, true, 1F, 0F, f2, 0.75F);

        this.leg2L.swing(0.45F, 0.08F, false, 3F, 0F, f2, 0.75F);
        this.leg2R.swing(0.45F, 0.08F, true, 3F, 0F, f2, 0.75F);

        this.leg3L.swing(0.45F, 0.08F, false, 0, 0F, f2, 0.75F);
        this.leg3R.swing(0.45F, 0.08F, true, 0, 0F, f2, 0.75F);

        this.leg4L.swing(0.45F, 0.08F, false, 1F, 0F, f2, 0.75F);
        this.leg4R.swing(0.45F, 0.08F, true, 2F, 0F, f2, 0.75F);

        //pincers:
        AdvancedModelRenderer[] PincerL = {this.armL, this.armL2, this.armL3};
        AdvancedModelRenderer[] PincerR = {this.armR, this.armR2, this.armR3};
        this.chainSwing(PincerL, 0.2F, 0.1F, 0.1F, f2, 1F);
        this.chainSwing(PincerR, 0.2F, -0.1F, 0.1F, f2, 1F);

        this.armL3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);
        this.armR3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);

        this.clawL.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);
        this.clawR.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        this.chainWave(Tail, 0.6F, 0.05F, 0.3F, f2, 1F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScorpion e = (EntityPrehistoricFloraScorpion) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //length = 20 ticks
        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.armL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL2, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.armR2, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.armL3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.clawL, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.clawR, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.startKeyframe(3);
        animator.rotate(this.armL, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.abdomen, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.abdomen2, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.abdomen3, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail6, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(2);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(4);

    }
}

