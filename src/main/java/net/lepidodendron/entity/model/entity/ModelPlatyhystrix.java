package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatyhystrix;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlatyhystrix extends AdvancedModelBaseExtended {

    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended neck;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended sail;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended snout1;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended eye2;
    public AdvancedModelRendererExtended eye1;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended snout2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended teeth1_1;
    public AdvancedModelRendererExtended gums2;
    public AdvancedModelRendererExtended teeth2_1;
    public AdvancedModelRendererExtended lowerjaw;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;

    private ModelAnimator animator;

    public ModelPlatyhystrix() {
        this.textureWidth = 125;
        this.textureHeight = 95;
        this.sail = new AdvancedModelRendererExtended(this, 1, 60);
        this.sail.setRotationPoint(0.1F, -19.0F, -9.9F);
        this.sail.addBox(-0.5F, 0.0F, 0.0F, 0, 16, 18, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 55, 14);
        this.tail1.setRotationPoint(-0.9F, -0.1F, -2.3F);
        this.tail1.addBox(-2.5F, -2.3F, -6.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tail1, 0.045553093477052F, 0.0F, 0.0F);
        this.feet2 = new AdvancedModelRendererExtended(this, 97, 22);
        this.feet2.setRotationPoint(1.0F, 0.0F, -4.8F);
        this.feet2.addBox(-1.5F, 0.0F, -2.1F, 3, 5, 2, 0.0F);
        this.setRotateAngle(feet2, 0.40980330836826856F, -0.31869712141416456F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 97, 11);
        this.leg2.setRotationPoint(-1.1F, 2.7F, 0.5F);
        this.leg2.addBox(0.0F, 0.0F, -5.7F, 2, 3, 6, 0.0F);
        this.setRotateAngle(leg2, 0.5918411493512771F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 34, 4);
        this.basin.setRotationPoint(0.5F, -0.3F, -5.8F);
        this.basin.addBox(-4.0F, -3.4F, -4.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(basin, 0.045553093477052F, 0.0F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 36, 74);
        this.teeth1.setRotationPoint(0.2F, 0.2F, 3.9F);
        this.teeth1.addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        this.neck = new AdvancedModelRendererExtended(this, 1, 29);
        this.neck.setRotationPoint(-0.3F, -1.0F, 3.5F);
        this.neck.addBox(-4.5F, -2.7F, -0.4F, 9, 7, 7, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.008901179185171082F);
        this.snout2 = new AdvancedModelRendererExtended(this, 1, 56);
        this.snout2.setRotationPoint(2.5F, -0.9F, -0.1F);
        this.snout2.addBox(-2.5F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(snout2, -0.14521139376592823F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 1, 10);
        this.body.setRotationPoint(0.3F, 15.6F, 0.1F);
        this.body.addBox(-5.3F, -4.0F, -4.9F, 10, 8, 10, 0.0F);
        this.setRotateAngle(body, 0.091106186954104F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 61, 3);
        this.tail2.setRotationPoint(0.0F, -0.2F, -5.0F);
        this.tail2.addBox(-2.0F, -1.6F, -5.4F, 4, 4, 5, 0.0F);
        this.setRotateAngle(tail2, -0.091106186954104F, 0.0F, 0.0F);
        this.teeth1_1 = new AdvancedModelRendererExtended(this, 36, 74);
        this.teeth1_1.setRotationPoint(-3.5F, -0.8F, 3.8F);
        this.teeth1_1.addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 55, 53);
        this.arm1.setRotationPoint(0.5F, 3.6F, -0.9F);
        this.arm1.addBox(0.0F, -1.4F, 0.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(arm1, -0.4745550236172582F, 0.0F, 0.0F);
        this.head = new AdvancedModelRendererExtended(this, 1, 44);
        this.head.setRotationPoint(-3.7F, 1.1F, 5.0F);
        this.head.addBox(-0.3F, -3.7F, 0.0F, 8, 4, 6, 0.0F);
        this.setRotateAngle(head, -0.091106186954104F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 72, 64);
        this.hand2.setRotationPoint(-0.2F, -0.1F, 4.0F);
        this.hand2.addBox(-2.6F, -4.2F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(hand2, -0.5649630788705644F, 0.06771877497737998F, -0.4293509959906051F);
        this.leg1 = new AdvancedModelRendererExtended(this, 78, 11);
        this.leg1.setRotationPoint(-1.1F, 2.7F, 0.5F);
        this.leg1.addBox(0.0F, 0.0F, -5.7F, 2, 3, 6, 0.0F);
        this.setRotateAngle(leg1, 0.5918411493512771F, 0.0F, 0.0F);
        this.eye1 = new AdvancedModelRendererExtended(this, 25, 64);
        this.eye1.setRotationPoint(5.2F, -3.0F, 5.3F);
        this.eye1.addBox(0.0F, -0.5F, -2.0F, 3, 2, 2, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 74, 53);
        this.arm2.setRotationPoint(-0.4F, 3.6F, -0.9F);
        this.arm2.addBox(-2.1F, -1.4F, 0.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(arm2, -0.4745550236172582F, 0.0F, 0.0F);
        this.snout1 = new AdvancedModelRendererExtended(this, 3, 65);
        this.snout1.setRotationPoint(0.7F, -2.7F, 5.8F);
        this.snout1.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.lowerjaw = new AdvancedModelRendererExtended(this, 27, 54);
        this.lowerjaw.setRotationPoint(0.0F, 1.0F, -1.3F);
        this.lowerjaw.addBox(-3.0F, 0.0F, 0.2F, 6, 1, 7, 0.0F);
        this.setRotateAngle(lowerjaw, 0.11205013797803595F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 59, 64);
        this.hand1.setRotationPoint(-0.2F, -0.4F, 4.0F);
        this.hand1.addBox(0.0F, -4.2F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(hand1, -0.5649630788705644F, -0.11292280260403312F, 0.4293509959906051F);
        this.feet1 = new AdvancedModelRendererExtended(this, 78, 22);
        this.feet1.setRotationPoint(1.0F, 0.0F, -4.8F);
        this.feet1.addBox(-1.5F, 0.0F, -2.1F, 3, 5, 2, 0.0F);
        this.setRotateAngle(feet1, 0.40980330836826856F, 0.31869712141416456F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 32, 44);
        this.jaw1.setRotationPoint(3.7F, 0.3F, 0.0F);
        this.jaw1.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 6, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 31, 64);
        this.jaw2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.jaw2.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.gums2 = new AdvancedModelRendererExtended(this, 60, 88);
        this.gums2.setRotationPoint(0.0F, -2.6F, -0.8F);
        this.gums2.addBox(-3.5F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(gums2, 0.38414696836395196F, 0.0F, 0.0F);
        this.teeth2_1 = new AdvancedModelRendererExtended(this, 38, 80);
        this.teeth2_1.setRotationPoint(-2.5F, -0.8F, -0.2F);
        this.teeth2_1.addBox(0.0F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 76, 42);
        this.upperarm2.setRotationPoint(-3.3F, 1.4F, 5.1F);
        this.upperarm2.addBox(-2.9F, 0.0F, -1.9F, 3, 5, 4, 0.0F);
        this.setRotateAngle(upperarm2, -0.6829473363053812F, 0.0F, 0.31869712141416456F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 81, 1);
        this.upperleg1.setRotationPoint(2.5F, 0.0F, -2.3F);
        this.upperleg1.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(upperleg1, 0.40980330836826856F, 0.0F, -0.36425021489121656F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 61, 42);
        this.upperarm1.setRotationPoint(2.7F, 1.4F, 5.1F);
        this.upperarm1.addBox(0.0F, 0.0F, -1.9F, 3, 5, 4, 0.0F);
        this.setRotateAngle(upperarm1, -0.7740535232594852F, 0.0F, -0.31869712141416456F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 97, 1);
        this.upperleg2.setRotationPoint(-4.5F, 0.0F, -2.3F);
        this.upperleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(upperleg2, 0.40980330836826856F, 0.0F, 0.36425021489121656F);
        this.eye2 = new AdvancedModelRendererExtended(this, 25, 64);
        this.eye2.setRotationPoint(-0.8F, -3.0F, 5.3F);
        this.eye2.addBox(0.0F, -0.5F, -2.0F, 3, 2, 2, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 38, 80);
        this.teeth2.setRotationPoint(0.5F, 2.9F, -0.29F);
        this.teeth2.addBox(0.0F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.body.addChild(this.sail);
        this.basin.addChild(this.tail1);
        this.leg2.addChild(this.feet2);
        this.upperleg2.addChild(this.leg2);
        this.body.addChild(this.basin);
        this.head.addChild(this.teeth1);
        this.body.addChild(this.neck);
        this.snout1.addChild(this.snout2);
        this.tail1.addChild(this.tail2);
        this.jaw1.addChild(this.teeth1_1);
        this.upperarm1.addChild(this.arm1);
        this.neck.addChild(this.head);
        this.arm2.addChild(this.hand2);
        this.upperleg1.addChild(this.leg1);
        this.head.addChild(this.eye1);
        this.upperarm2.addChild(this.arm2);
        this.head.addChild(this.snout1);
        this.jaw2.addChild(this.lowerjaw);
        this.arm1.addChild(this.hand1);
        this.leg1.addChild(this.feet1);
        this.head.addChild(this.jaw1);
        this.jaw1.addChild(this.jaw2);
        this.jaw1.addChild(this.gums2);
        this.jaw2.addChild(this.teeth2_1);
        this.body.addChild(this.upperarm2);
        this.basin.addChild(this.upperleg1);
        this.body.addChild(this.upperarm1);
        this.basin.addChild(this.upperleg2);
        this.head.addChild(this.eye2);
        this.snout1.addChild(this.teeth2);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.4f);
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
        this.body.offsetY = 0.9F;
        this.body.rotateAngleY = (float) Math.toRadians(180);

        EntityPrehistoricFloraPlatyhystrix Platyhystrix = (EntityPrehistoricFloraPlatyhystrix) e;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.385F;
        if (Platyhystrix.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.head, this.body};

        if (!Platyhystrix.isReallyInWater()) {

            this.chainWave(Tail, speed, 0.05F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.08F, -0.16, f2, 0.5F);

            if (f3 == 0.0F || !Platyhystrix.getIsMoving()) { //Not moving
                return;
            }

            this.flap(upperleg2, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(upperleg2, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(leg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(feet2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(upperleg1, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(upperleg1, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(leg1, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(feet1, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(upperarm2, speed, 0.35F, false, 3, -0.1F, f2, 0.5F);
            //this.swing(upperarm2, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(arm2, speed, -0.4F, false, 4, 0.15F, f2, 0.8F);
            this.walk(hand2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(upperarm1, speed, -0.35F, false, 0, 0.1F, f2, 0.5F);
            //this.swing(upperarm1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(arm1, speed, -0.4F, false, 1, 0.15F, f2, 0.8F);
            this.walk(hand1, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainSwing(Torso, speed, 0.08F, -0.16, f2, 0.7F);
            this.bob(body, speed*2, 0.11F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.45), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.hand2.rotateAngleY = (float) Math.toRadians(-50);
            this.hand1.rotateAngleY = (float) Math.toRadians(50);
            this.feet2.rotateAngleZ = (float) Math.toRadians(-50);
            this.feet1.rotateAngleZ = (float) Math.toRadians(50);

            this.upperarm2.rotateAngleX= (float) Math.toRadians(40);
            this.upperarm1.rotateAngleX= (float) Math.toRadians(-40);
            this.upperleg2.rotateAngleZ= (float) Math.toRadians(25);
            this.upperleg1.rotateAngleZ= (float) Math.toRadians(-25);

            this.leg2.rotateAngleX= (float) Math.toRadians(17.5);
            this.leg1.rotateAngleX= (float) Math.toRadians(-17.5);

            AdvancedModelRenderer[] BackL = {this.leg2, this.feet2};
            AdvancedModelRenderer[] BackR = {this.leg1, this.feet1};

            this.flap(upperleg2, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(upperleg1, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(upperarm2, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(upperarm2, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(arm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(hand2, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(upperarm1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(upperarm1, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(arm1, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(hand1, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.16, f2, 0.7F);
        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPlatyhystrix e = (EntityPrehistoricFloraPlatyhystrix) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
