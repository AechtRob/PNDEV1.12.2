package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBalanerpeton;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBalanerpeton extends AdvancedModelBase {
    public AdvancedModelRenderer basin1;
    public AdvancedModelRenderer body1;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer leg1;
    public AdvancedModelRenderer leg2;
    public AdvancedModelRenderer head1;
    public AdvancedModelRenderer arm2;
    public AdvancedModelRenderer arm1;
    public AdvancedModelRenderer jaw1;
    public AdvancedModelRenderer head2;
    public AdvancedModelRenderer eye1;
    public AdvancedModelRenderer eye2;
    public AdvancedModelRenderer jaw2;
    public AdvancedModelRenderer tail1_1;

    private ModelAnimator animator;

    public ModelBalanerpeton() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.jaw2 = new AdvancedModelRenderer(this, 24, 26);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw2.addBox(-2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F);
        this.tail1_1 = new AdvancedModelRenderer(this, 21, 0);
        this.tail1_1.setRotationPoint(0.0F, -0.2F, 6.0F);
        this.tail1_1.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(tail1_1, 0.091106186954104F, 0.0F, 0.0F);
        this.leg1 = new AdvancedModelRenderer(this, 39, 22);
        this.leg1.setRotationPoint(-1.5F, 0.3F, 6.0F);
        this.leg1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(leg1, -0.5009094953223726F, -1.3203415791337103F, 0.0F);
        this.jaw1 = new AdvancedModelRenderer(this, 0, 23);
        this.jaw1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.jaw1.addBox(-3.0F, 0.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(jaw1, 0.18203784098300857F, 0.0F, 0.0F);
        this.body1 = new AdvancedModelRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.body1.addBox(-2.5F, -2.0F, -9.0F, 5, 4, 9, 0.0F);
        this.setRotateAngle(body1, 0.091106186954104F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRenderer(this, 48, 25);
        this.leg2.setRotationPoint(1.5F, 0.3F, 6.0F);
        this.leg2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(leg2, -0.5009094953223726F, 1.3203415791337103F, 0.0F);
        this.arm1 = new AdvancedModelRenderer(this, 39, 12);
        this.arm1.setRotationPoint(-1.8F, 0.8F, -6.1F);
        this.arm1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(arm1, -0.49462631001519297F, -1.8668041679331349F, 0.0F);
        this.head2 = new AdvancedModelRenderer(this, 24, 17);
        this.head2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.head2.addBox(-2.5F, -1.0F, -2.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(head2, 0.017453292519943295F, 0.0F, 0.0F);
        this.eye2 = new AdvancedModelRenderer(this, 28, 13);
        this.eye2.setRotationPoint(1.1F, -0.9F, -3.4F);
        this.eye2.addBox(0.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(eye2, 0.0F, 0.27314402793711257F, -0.5462880558742251F);
        this.arm2 = new AdvancedModelRenderer(this, 49, 15);
        this.arm2.setRotationPoint(1.8F, 0.8F, -6.1F);
        this.arm2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(arm2, -0.5009094953223726F, 1.8668041679331349F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 46, 0);
        this.tail1.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.tail1.addBox(-1.5F, -1.1F, 0.0F, 3, 2, 6, 0.0F);
        this.head1 = new AdvancedModelRenderer(this, 0, 14);
        this.head1.setRotationPoint(0.0F, -1.3F, -8.7F);
        this.head1.addBox(-3.0F, -1.0F, -5.0F, 6, 2, 5, 0.0F);
        this.setRotateAngle(head1, 0.091106186954104F, 0.0F, 0.0F);
        this.eye1 = new AdvancedModelRenderer(this, 19, 14);
        this.eye1.setRotationPoint(-1.1F, -0.9F, -3.4F);
        this.eye1.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(eye1, 0.0F, -0.27314402793711257F, 0.5462880558742251F);
        this.basin1 = new AdvancedModelRenderer(this, 29, 0);
        this.basin1.setRotationPoint(0.0F, 21.5F, -0.5F);
        this.basin1.addBox(-2.0F, -1.5F, -0.0F, 4, 3, 8, 0.0F);
        this.setRotateAngle(basin1, -0.136659280431156F, 0.0F, 0.0F);
        this.jaw1.addChild(this.jaw2);
        this.tail1.addChild(this.tail1_1);
        this.basin1.addChild(this.leg1);
        this.head1.addChild(this.jaw1);
        this.basin1.addChild(this.body1);
        this.basin1.addChild(this.leg2);
        this.body1.addChild(this.arm1);
        this.head1.addChild(this.head2);
        this.head1.addChild(this.eye2);
        this.body1.addChild(this.arm2);
        this.basin1.addChild(this.tail1);
        this.body1.addChild(this.head1);
        this.head1.addChild(this.eye1);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin1.render(f5 * 0.26f);
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
        this.basin1.offsetY = 1.1F;

        EntityPrehistoricFloraBalanerpeton Balanerpeton = (EntityPrehistoricFloraBalanerpeton) e;

        this.faceTarget(f3, f4, 7, head1);

        float speed = 0.5F;
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail1_1};
        AdvancedModelRenderer[] Torso = {this.body1, this.basin1};

        if (!Balanerpeton.isReallyInWater()) {
            //Land animation:
            this.chainWave(Tail, speed * 0.5F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.5F, 0.12F, -3, f2, 0.8F);

            //System.err.println("Blinking: " + Balanerpeton.getBlinking());

            if (Balanerpeton.getBlinking()) {
                this.flap(eye2,0.008F, 0.05F,false, 0F,0.8F, f2, 0.2F);
                this.flap(eye1,0.008F, 0.05F,true, 0F,0.8F, f2, 0.2F);
            }

            this.jaw1.rotateAngleX = -0.2F;
            this.walk(this.jaw1, speed * 0.2F, 0.1F,false, 0F,0.5F, f2, 0.6F);

            if (f3 == 0.0F || !Balanerpeton.getIsMoving()) { //Not moving
                return;
            }

            this.swing(this.arm1, speed * 0.6F, 0.2F,false, 3F,0.1F, f2, 1F);
            this.swing(this.arm2, speed * 0.6F, 0.2F,true, 0F,0.1F, f2, 1F);

            this.swing(this.leg1, speed * 0.6F, -0.2F,false, 0F,-0.1F, f2, 1F);
            this.swing(this.leg2, speed * 0.6F, -0.2F,true, 3F,-0.1F, f2, 1F);

            this.flap(this.arm1, speed * 0.6F, -0.2F,false, 0F,-0.1F, f2, 1F);
            this.flap(this.arm2, speed * 0.6F, -0.2F,true, 0F,-0.1F, f2, 1F);

            this.flap(this.leg1, speed * 0.6F, 0.2F,false, 0F,0.1F, f2, 1F);
            this.flap(this.leg2, speed * 0.6F, 0.2F,true, 0F,0.1F, f2, 1F);

        }
        else {
            //Swimming animation:
            speed = speed * 1.2F;

            this.arm2.rotateAngleZ = (float) Math.toRadians(60);
            this.leg2.rotateAngleZ = (float) Math.toRadians(60);
            this.arm1.rotateAngleZ = (float) Math.toRadians(-60);
            this.leg1.rotateAngleZ = (float) Math.toRadians(-60);

            this.arm2.rotateAngleY = (float) Math.toRadians(40);
            this.leg2.rotateAngleY = (float) Math.toRadians(30);
            this.arm1.rotateAngleY = (float) Math.toRadians(-40);
            this.leg1.rotateAngleY = (float) Math.toRadians(-30);

            this.jaw1.rotateAngleX = 0.05F; //Close mouth

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.swing(this.arm1, speed * 0.6F, 0.8F,false, 0F,0.4F, f2, 1F);
            this.swing(this.arm2, speed * 0.6F, 0.8F,true, 0F,0.4F, f2, 1F);

            this.swing(this.leg1, speed * 0.6F, 0.8F,false, 3F,0.4F, f2, 1F);
            this.swing(this.leg2, speed * 0.6F, 0.8F,true, 3F,0.4F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBalanerpeton e = (EntityPrehistoricFloraBalanerpeton) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head1, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head1, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
