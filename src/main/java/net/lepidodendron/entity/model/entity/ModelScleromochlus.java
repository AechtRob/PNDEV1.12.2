package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraScleromochlus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScleromochlus extends AdvancedModelBase {
    public AdvancedModelRenderer basin1;
    public AdvancedModelRenderer body1;
    public AdvancedModelRenderer neck1;
    public AdvancedModelRenderer upperleg2;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer upperleg2_1;
    public AdvancedModelRenderer head1;
    public AdvancedModelRenderer jaw1;
    public AdvancedModelRenderer head2;
    public AdvancedModelRenderer gums;
    public AdvancedModelRenderer jaw2;
    public AdvancedModelRenderer sideslope1;
    public AdvancedModelRenderer sideslope2;
    public AdvancedModelRenderer snout1;
    public AdvancedModelRenderer sideslope1_1;
    public AdvancedModelRenderer sideslope2_1;
    public AdvancedModelRenderer leg2;
    public AdvancedModelRenderer feet2;
    public AdvancedModelRenderer feet2_1;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer tail4;
    public AdvancedModelRenderer upperarm1;
    public AdvancedModelRenderer upperarm1_1;
    public AdvancedModelRenderer arm1;
    public AdvancedModelRenderer hand1;
    public AdvancedModelRenderer arm1_1;
    public AdvancedModelRenderer hand1_1;
    public AdvancedModelRenderer leg2_1;
    public AdvancedModelRenderer feet2_2;
    public AdvancedModelRenderer feet2_3;

    private ModelAnimator animator;

    public ModelScleromochlus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.arm1 = new AdvancedModelRenderer(this, 29, 35);
        this.arm1.setRotationPoint(-0.1F, 3.1F, 0.5F);
        this.arm1.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(arm1, -1.4119713914950236F, 0.0F, 0.0F);
        this.body1 = new AdvancedModelRenderer(this, 0, 50);
        this.body1.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.body1.addBox(-2.5F, -2.0F, -7.0F, 5, 4, 10, 0.0F);
        this.setRotateAngle(body1, 0.03490658503988659F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRenderer(this, 54, 54);
        this.head2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head2.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.tail4 = new AdvancedModelRenderer(this, 34, 0);
        this.tail4.setRotationPoint(0.0F, -0.3F, 9.0F);
        this.tail4.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 10, 0.0F);
        this.upperleg2 = new AdvancedModelRenderer(this, 21, 43);
        this.upperleg2.setRotationPoint(1.3F, 0.2F, 6.7F);
        this.upperleg2.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3,  0.0F);
        this.setRotateAngle(upperleg2, -1.4063863432149637F, -0.3127630032889644F, 0.0F);
        this.upperleg2_1 = new AdvancedModelRenderer(this, 21, 43);
        this.upperleg2_1.mirror = true;
        this.upperleg2_1.setRotationPoint(-1.3F, 0.2F, 6.7F);
        this.upperleg2_1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperleg2_1, -1.4063863432149637F, 0.3127630032889644F, 0.0F);
        this.jaw2 = new AdvancedModelRenderer(this, 54, 33);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw2.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3,0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 13, 0);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.8F);
        this.tail3.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 9, 0.0F);
        this.setRotateAngle(tail3, 0.07365289077231421F, 0.0F, 0.0F);
        this.sideslope1 = new AdvancedModelRenderer(this, 54, 27);
        this.sideslope1.setRotationPoint(0.04F, 0.0F, -2.74F);
        this.sideslope1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(sideslope1, 0.0F, 0.2499311435592658F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 0, 10);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.tail2.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(tail2, 0.15114551055954784F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 0, 23);
        this.tail1.setRotationPoint(0.0F, -0.1F, 7.3F);
        this.tail1.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(tail1, -0.2623229819142158F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRenderer(this, 32, 44);
        this.leg2.setRotationPoint(0.2F, 6.7F, 0.7F);
        this.leg2.addBox(-0.5F, 0.0F, -1.0F, 1, 7, 2, 0.0F);
        this.setRotateAngle(leg2, 2.814866996311166F, 0.0F, 0.10471975511965977F);
        this.hand1_1 = new AdvancedModelRenderer(this, 33, 38);
        this.hand1_1.mirror = true;
        this.hand1_1.setRotationPoint(0.0F, 3.7F, 0.1F);
        this.hand1_1.addBox(-4.0F, 0.0F, -2.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(hand1_1, 0.25481807744907486F, -0.6928957263575543F, -0.5298819715581228F);
        this.upperarm1_1 = new AdvancedModelRenderer(this, 22, 35);
        this.upperarm1_1.mirror = true;
        this.upperarm1_1.setRotationPoint(-1.5F, -0.3F, -4.0F);
        this.upperarm1_1.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(upperarm1_1, 0.9384635467868342F, -0.777718738657123F, 0.44715336900833325F);
        this.sideslope2_1 = new AdvancedModelRenderer(this, 54, 43);
        this.sideslope2_1.mirror = true;
        this.sideslope2_1.setRotationPoint(-0.04F, 0.0F, -2.74F);
        this.sideslope2_1.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(sideslope2_1, 0.0F, -0.2499311435592658F, 0.0F);
        this.neck1 = new AdvancedModelRenderer(this, 31, 56);
        this.neck1.setRotationPoint(0.0F, 0.0F, -8.4F);
        this.neck1.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(neck1, -0.2989748862192427F, 0.0F, 0.0F);
        this.sideslope2 = new AdvancedModelRenderer(this, 54, 27);
        this.sideslope2.mirror = true;
        this.sideslope2.setRotationPoint(-0.04F, 0.0F, -2.74F);
        this.sideslope2.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(sideslope2, 0.0F, -0.2499311435592658F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 0, 43);
        this.body2.setRotationPoint(0.0F, 0.5F, -4.8F);
        this.body2.addBox(-2.0F, -2.0F, -5.0F, 4, 3, 3,  0.0F);
        this.setRotateAngle(body2, -0.06457718315602803F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRenderer(this, 50, 59);
        this.head1.setRotationPoint(0.0F, -0.6F, -5.6F);
        this.head1.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(head1, 0.35081118630876296F, 0.0F, 0.0F);
        this.snout1 = new AdvancedModelRenderer(this, 54, 49);
        this.snout1.setRotationPoint(0.0F, -0.05F, -2.85F);
        this.snout1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(snout1, 0.299847570818948F, 0.0F, 0.0F);
        this.leg2_1 = new AdvancedModelRenderer(this, 32, 44);
        this.leg2_1.mirror = true;
        this.leg2_1.setRotationPoint(-0.2F, 6.7F, 0.7F);
        this.leg2_1.addBox(-0.5F, 0.0F, -1.0F, 1, 7, 2, 0.0F);
        this.setRotateAngle(leg2_1, 2.814866996311166F, 0.0F, -0.10471975511965977F);
        this.feet2_3 = new AdvancedModelRenderer(this, 40, 49);
        this.feet2_3.mirror = true;
        this.feet2_3.setRotationPoint(0.0F, 4.0F, 0.1F);
        this.feet2_3.addBox(-1.5F, 0.0F, -4.0F, 3, 0, 5, 0.0F);
        this.setRotateAngle(feet2_3, 1.3693853151357844F, -0.03490658503988659F, 0.0F);
        this.feet2 = new AdvancedModelRenderer(this, 39, 48);
        this.feet2.setRotationPoint(0.1F, 6.9F, 0.0F);
        this.feet2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(feet2, -2.7708846245923984F, 0.0F, 0.13962634015954636F);
        this.feet2_1 = new AdvancedModelRenderer(this, 40, 49);
        this.feet2_1.setRotationPoint(0.0F, 4.0F, 0.1F);
        this.feet2_1.addBox(-1.5F, 0.0F, -4.0F, 3, 0, 5, 0.0F);
        this.setRotateAngle(feet2_1, 1.3693853151357844F, 0.03490658503988659F, 0.0F);
        this.jaw1 = new AdvancedModelRenderer(this, 50, 38);
        this.jaw1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.jaw1.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F);
        this.arm1_1 = new AdvancedModelRenderer(this, 29, 35);
        this.arm1_1.mirror = true;
        this.arm1_1.setRotationPoint(0.1F, 3.1F, 0.5F);
        this.arm1_1.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(arm1_1, -1.4119713914950236F, 0.0F, 0.0F);
        this.feet2_2 = new AdvancedModelRenderer(this, 39, 48);
        this.feet2_2.mirror = true;
        this.feet2_2.setRotationPoint(-0.1F, 6.9F, 0.0F);
        this.feet2_2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(feet2_2, -2.7708846245923984F, 0.0F, -0.13962634015954636F);
        this.hand1 = new AdvancedModelRenderer(this, 33, 38);
        this.hand1.setRotationPoint(0.0F, 3.7F, 0.1F);
        this.hand1.addBox(0.0F, 0.0F, -2.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(hand1, 0.25481807744907486F, 0.6928957263575543F, 0.5298819715581228F);
        this.gums = new AdvancedModelRenderer(this, 52, 22);
        this.gums.setRotationPoint(0.0F, -1.9F, -2.0F);
        this.gums.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.basin1 = new AdvancedModelRenderer(this, 0, 34);
        this.basin1.setRotationPoint(0.0F, 20.3F, 5.0F);
        this.basin1.addBox(-1.5F, -2.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(basin1, -0.03490658503988659F, 0.0F, 0.0F);
        this.upperarm1 = new AdvancedModelRenderer(this, 22, 35);
        this.upperarm1.setRotationPoint(1.5F, -0.3F, -4.0F);
        this.upperarm1.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(upperarm1, 0.9384635467868342F, 0.777718738657123F, -0.44715336900833325F);
        this.sideslope1_1 = new AdvancedModelRenderer(this, 54, 43);
        this.sideslope1_1.setRotationPoint(0.04F, 0.0F, -2.74F);
        this.sideslope1_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(sideslope1_1, 0.0F, 0.2499311435592658F, 0.0F);
        this.upperarm1.addChild(this.arm1);
        this.basin1.addChild(this.body1);
        this.head1.addChild(this.head2);
        this.tail3.addChild(this.tail4);
        this.body1.addChild(this.upperleg2);
        this.body1.addChild(this.upperleg2_1);
        this.jaw1.addChild(this.jaw2);
        this.tail2.addChild(this.tail3);
        this.jaw2.addChild(this.sideslope1);
        this.tail1.addChild(this.tail2);
        this.body1.addChild(this.tail1);
        this.upperleg2.addChild(this.leg2);
        this.arm1_1.addChild(this.hand1_1);
        this.body2.addChild(this.upperarm1_1);
        this.head2.addChild(this.sideslope2_1);
        this.body1.addChild(this.neck1);
        this.jaw2.addChild(this.sideslope2);
        this.body1.addChild(this.body2);
        this.neck1.addChild(this.head1);
        this.head2.addChild(this.snout1);
        this.upperleg2_1.addChild(this.leg2_1);
        this.feet2_2.addChild(this.feet2_3);
        this.leg2.addChild(this.feet2);
        this.feet2.addChild(this.feet2_1);
        this.head1.addChild(this.jaw1);
        this.upperarm1_1.addChild(this.arm1_1);
        this.leg2_1.addChild(this.feet2_2);
        this.arm1.addChild(this.hand1);
        this.jaw1.addChild(this.gums);
        this.body2.addChild(this.upperarm1);
        this.head2.addChild(this.sideslope1_1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin1.render(f5 * 0.129f);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(basin1, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.2F, 0.05F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.15F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, 0.0F);
        this.basin1.offsetY = 0.31F;
        this.basin1.render(0.01F);
        resetToDefaultPose();
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
        this.basin1.offsetY = 1.3F;

        EntityPrehistoricFloraScleromochlus Scleromochlus = (EntityPrehistoricFloraScleromochlus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        float speed = 0.85F;

        if (f3 == 0.0F || !Scleromochlus.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScleromochlus e = (EntityPrehistoricFloraScleromochlus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.HOP_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.basin1, 0,-80F,0);
        animator.rotate(this.basin1, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1_1, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arm1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arm1_1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.hand1, (float) Math.toRadians(0), (float) Math.toRadians(-30), (float) Math.toRadians(80));
        animator.rotate(this.hand1_1, (float) Math.toRadians(45), (float) Math.toRadians(30), (float) Math.toRadians(80));
        animator.rotate(this.upperleg2, (float) Math.toRadians(110), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2_1, (float) Math.toRadians(110), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.rotate(this.leg2, (float) Math.toRadians(-140), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leg2_1, (float) Math.toRadians(-140), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.feet2, (float) Math.toRadians(170), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.feet2_1, (float) Math.toRadians(170), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck1, 0,0,-0.5F);
        animator.rotate(this.head1, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
