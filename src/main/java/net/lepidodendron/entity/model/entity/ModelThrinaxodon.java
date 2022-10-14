package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThrinaxodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelThrinaxodon extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended nose1;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended nose2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended shape50;
    public AdvancedModelRendererExtended teeth1_1;
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;

    private ModelAnimator animator;

    public ModelThrinaxodon() {
        this.textureWidth = 85;
        this.textureHeight = 65;
        this.head1 = new AdvancedModelRendererExtended(this, 47, 41);
        this.head1.setRotationPoint(0.0F, -0.2F, -5.2F);
        this.head1.addBox(-2.5F, -2.0F, -3.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(head1, 0.22759093446006054F, 0.0F, 0.0F);
        this.gums1 = new AdvancedModelRendererExtended(this, 37, 35);
        this.gums1.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.gums1.addBox(-2.0F, -3.0F, -0.5F, 4, 3, 2, 0.0F);
        this.setRotateAngle(gums1, -0.5009094953223726F, 0.0F, 0.0F);
        this.shape50 = new AdvancedModelRendererExtended(this, 35, 17);
        this.shape50.setRotationPoint(0.0F, 0.7F, -0.9F);
        this.shape50.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(shape50, -0.26930430358272506F, 0.0F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 50, 35);
        this.teeth1.setRotationPoint(0.0F, 0.7F, -2.8F);
        this.teeth1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(teeth1, 0.18203784098300857F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 62, 39);
        this.hand2.setRotationPoint(0.5F, 4.9F, 0.5F);
        this.hand2.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(hand2, 0.13456488532876282F, 0.0F, 0.0F);
        this.nose1 = new AdvancedModelRendererExtended(this, 29, 34);
        this.nose1.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.nose1.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(nose1, 0.136659280431156F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 36, 10);
        this.head3.setRotationPoint(0.0F, -0.9F, -2.9F);
        this.head3.addBox(-1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(head3, 0.19774580425095753F, 0.0F, 0.0F);
        this.nose2 = new AdvancedModelRendererExtended(this, 31, 37);
        this.nose2.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.nose2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose2, 0.31869712141416456F, 0.0F, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 62, 30);
        this.arm2.setRotationPoint(-0.6F, 2.6F, -0.2F);
        this.arm2.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(arm2, -0.8196066167365371F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 23, 22);
        this.neck1.setRotationPoint(0.0F, -0.3F, -3.3F);
        this.neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(neck1, -0.13456488532876282F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 17, 33);
        this.tail2.setRotationPoint(0.0F, 0.5F, 5.7F);
        this.tail2.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(tail2, 0.08970992355250852F, 0.0F, 0.0F);
        this.leg1 = new AdvancedModelRendererExtended(this, 62, 10);
        this.leg1.setRotationPoint(-0.4F, 4.1F, -0.6F);
        this.leg1.addBox(-0.5F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(leg1, 0.9560913642424937F, 0.0F, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 62, 23);
        this.upperarm2.setRotationPoint(3.0F, 1.8F, -2.1F);
        this.upperarm2.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(upperarm2, 0.6373942428283291F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 46, 19);
        this.feet1.setRotationPoint(0.5F, 6.0F, 0.8F);
        this.feet1.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(feet1, -0.36425021489121656F, -0.017453292519943295F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 62, 39);
        this.hand1.setRotationPoint(0.5F, 4.9F, 0.5F);
        this.hand1.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(hand1, 0.13456488532876282F, 0.0F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 64, 0);
        this.upperleg1.setRotationPoint(-2.8F, 0.2F, 2.4F);
        this.upperleg1.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 4, 0.0F);
        this.setRotateAngle(upperleg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 73, 23);
        this.upperarm1.setRotationPoint(-3.0F, 1.8F, -2.1F);
        this.upperarm1.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(upperarm1, 0.6731734924942129F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 1, 1);
        this.body.setRotationPoint(0.0F, -0.7F, 1.4F);
        this.body.addBox(-3.5F, -2.0F, -0.0F, 7, 7, 10, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 55, 51);
        this.head2.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.head2.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(head2, 0.091106186954104F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 0, 21);
        this.chest.setRotationPoint(0.0F, 14.7F, -6.0F);
        this.chest.addBox(-3.0F, -2.5F, -4.0F, 6, 6, 6, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 73, 30);
        this.arm1.setRotationPoint(-0.4F, 2.6F, -0.2F);
        this.arm1.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(arm1, -0.8196066167365371F, 0.0F, 0.0F);
        this.teeth1_1 = new AdvancedModelRendererExtended(this, 50, 35);
        this.teeth1_1.setRotationPoint(0.0F, -1.2F, -1.8F);
        this.teeth1_1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(teeth1_1, -0.136659280431156F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 1, 37);
        this.tail1.setRotationPoint(0.0F, 0.1F, 3.4F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 6, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 69, 49);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.jaw2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(jaw2, 0.091106186954104F, 0.0F, 0.0F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 50, 0);
        this.upperleg2.setRotationPoint(2.8F, 0.2F, 2.4F);
        this.upperleg2.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 4, 0.0F);
        this.setRotateAngle(upperleg2, -0.4553564018453205F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 50, 10);
        this.leg2.setRotationPoint(-0.6F, 4.1F, -0.6F);
        this.leg2.addBox(-0.5F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(leg2, 0.9560913642424937F, 0.0F, 0.0F);
        this.feet2 = new AdvancedModelRendererExtended(this, 46, 19);
        this.feet2.setRotationPoint(0.5F, 6.0F, 0.8F);
        this.feet2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(feet2, -0.36425021489121656F, -0.017453292519943295F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 66, 45);
        this.jaw1.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.jaw1.addBox(-2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 27, 0);
        this.basin.setRotationPoint(0.0F, 0.6F, 9.6F);
        this.basin.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(basin, -0.136659280431156F, 0.0F, 0.0F);
        this.neck1.addChild(this.head1);
        this.jaw1.addChild(this.gums1);
        this.jaw1.addChild(this.shape50);
        this.head2.addChild(this.teeth1);
        this.arm2.addChild(this.hand2);
        this.head2.addChild(this.nose1);
        this.head1.addChild(this.head3);
        this.nose1.addChild(this.nose2);
        this.upperarm2.addChild(this.arm2);
        this.chest.addChild(this.neck1);
        this.tail1.addChild(this.tail2);
        this.upperleg1.addChild(this.leg1);
        this.chest.addChild(this.upperarm2);
        this.leg1.addChild(this.feet1);
        this.arm1.addChild(this.hand1);
        this.basin.addChild(this.upperleg1);
        this.chest.addChild(this.upperarm1);
        this.chest.addChild(this.body);
        this.head1.addChild(this.head2);
        this.upperarm1.addChild(this.arm1);
        this.jaw2.addChild(this.teeth1_1);
        this.basin.addChild(this.tail1);
        this.jaw1.addChild(this.jaw2);
        this.basin.addChild(this.upperleg2);
        this.upperleg2.addChild(this.leg2);
        this.leg2.addChild(this.feet2);
        this.head1.addChild(this.jaw1);
        this.body.addChild(this.basin);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5 * 0.22f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.chest.offsetZ = -0.3F;
        this.chest.render(0.1F);
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
        this.chest.offsetY = 1.15F;

        EntityPrehistoricFloraThrinaxodon ThrinaxodonEntity = (EntityPrehistoricFloraThrinaxodon) e;
        float masterSpeed = ThrinaxodonEntity.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck1);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        if (ThrinaxodonEntity.getAnimation() == ThrinaxodonEntity.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (ThrinaxodonEntity.getScreaming()) {
            this.neck1.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(jaw1, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !ThrinaxodonEntity.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (ThrinaxodonEntity.getIsFast()) {
            speed = speed * 1.5F;
        }

        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 1, f2, 1.5F);;
        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 1, f2, 1.5F);;

        this.flap(upperarm2, speed, -0.025F, true, 4, 0.005F, f2, 1F);
        this.flap(upperarm1, speed, 0.025F, true, 7, -0.005F, f2, 1F);
        this.flap(upperleg2, speed, 0.025F, false, 7, -0.005F, f2, 1F);
        this.flap(upperleg1, speed, -0.025F, false, 4, 0.005F, f2, 1F);

        this.walk(upperarm2, speed, 0.15F, true, 4, 0.05F, f2, 1F);
        this.walk(upperarm1, speed, 0.15F, true, 7, 0.05F, f2, 1F);
        this.walk(upperarm2, speed, 0.15F, false, 7, 0.05F, f2, 1F);
        this.walk(upperleg1, speed, 0.15F, false, 4, 0.05F, f2, 1F);

        this.swing(upperarm2, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        this.swing(upperarm1, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        this.swing(upperleg2, speed, -0.30F, true, 8, 0F, f2, 1F);
        this.swing(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.swing(arm2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(arm1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(leg2, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(leg1, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(arm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(arm1, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(leg1, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.swing(hand2, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.swing(hand1, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.swing(feet2, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.swing(feet1, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(chest, speed * 2F, 0.085F, false, 2.5F,  f2, 1F);

        this.flap(basin, speed, 0.05F, false, 5.0F,0.025F, f2, 1.0F);
        this.flap(body, speed, -0.05F, false, 5.0F,-0.025F, f2, 1.0F);
        this.flap(chest, speed, -0.05F, false, 5.0F,-0.025F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.chest.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraThrinaxodon e = (EntityPrehistoricFloraThrinaxodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION); //40 ticks
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
