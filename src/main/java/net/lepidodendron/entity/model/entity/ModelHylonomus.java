package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHylonomus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHylonomus extends ModelBasePalaeopedia {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer pelvis;
    public AdvancedModelRenderer leftfrontleg1;
    public AdvancedModelRenderer rightfrontleg1;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer lowerjaw1;
    public AdvancedModelRenderer upperjaw;
    public AdvancedModelRenderer lowerjaw2;
    public AdvancedModelRenderer brow;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer leftrearleg1;
    public AdvancedModelRenderer rightrearleg1;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer leftrearleg2;
    public AdvancedModelRenderer lefthindfoot;
    public AdvancedModelRenderer rightrearleg2;
    public AdvancedModelRenderer righthindfoot;
    public AdvancedModelRenderer leftfrontleg2;
    public AdvancedModelRenderer leftfrontfoot;
    public AdvancedModelRenderer rightfrontleg2;
    public AdvancedModelRenderer rightfrontfoot;

    private ModelAnimator animator;

    public ModelHylonomus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.head = new AdvancedModelRenderer(this, 24, 7);
        this.head.setRotationPoint(0.0F, -0.3F, -1.9F);
        this.head.addBox(-1.5F, -0.7F, -1.8F, 3, 2, 2, 0.0F);
        this.setRotateAngle(head, 0.27314402793711257F, 0.0F, 0.0F);
        this.pelvis = new AdvancedModelRenderer(this, 16, 0);
        this.pelvis.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.pelvis.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(pelvis, -0.18203784098300857F, 0.0F, 0.0F);
        this.rightfrontfoot = new AdvancedModelRenderer(this, 10, 16);
        this.rightfrontfoot.setRotationPoint(-2.7F, 0.2F, 0.0F);
        this.rightfrontfoot.addBox(0.0F, -2.5F, -4.5F, 0, 5, 5, 0.0F);
        this.setRotateAngle(rightfrontfoot, 0.0F, 0.7853981633974483F, -0.20943951023931953F);
        this.leftrearleg1 = new AdvancedModelRenderer(this, 27, 17);
        this.leftrearleg1.setRotationPoint(0.8F, 0.4F, 1.8F);
        this.leftrearleg1.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(leftrearleg1, 0.05235987755982988F, 0.3665191429188092F, 0.3141592653589793F);
        this.tail2 = new AdvancedModelRenderer(this, 0, 31);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail2.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(tail2, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 0, 41);
        this.tail3.setRotationPoint(0.0F, -0.3F, 7.5F);
        this.tail3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail3, 0.27314402793711257F, 0.0F, 0.0F);
        this.leftfrontfoot = new AdvancedModelRenderer(this, 0, 14);
        this.leftfrontfoot.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.leftfrontfoot.addBox(0.0F, -2.5F, -4.5F, 0, 5, 5, 0.0F);
        this.setRotateAngle(leftfrontfoot, 0.0F, -0.7853981633974483F, 0.20943951023931953F);
        this.lefthindfoot = new AdvancedModelRenderer(this, 18, 6);
        this.lefthindfoot.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.lefthindfoot.addBox(0.0F, -2.5F, -4.5F, 0, 5, 5, 0.0F);
        this.setRotateAngle(lefthindfoot, -0.9424777960769379F, 0.05235987755982988F, 0.3141592653589793F);
        this.neck = new AdvancedModelRenderer(this, 20, 22);
        this.neck.setRotationPoint(0.0F, -0.3F, -4.0F);
        this.neck.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(neck, -0.27314402793711257F, 0.0F, 0.0F);
        this.brow = new AdvancedModelRenderer(this, 28, 11);
        this.brow.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.brow.addBox(-1.5F, -1.1F, -2.0F, 3, 1, 2, 0.0F);
        this.rightfrontleg2 = new AdvancedModelRenderer(this, 0, 6);
        this.rightfrontleg2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightfrontleg2.addBox(-2.7F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightfrontleg2, 0.0F, -1.2217304763960306F, -0.8726646259971648F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 8, 0.0F);
        this.rightrearleg1 = new AdvancedModelRenderer(this, 24, 27);
        this.rightrearleg1.setRotationPoint(-0.8F, 0.4F, 1.8F);
        this.rightrearleg1.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rightrearleg1, -0.05235987755982988F, -0.3665191429188092F, -0.3141592653589793F);
        this.leftfrontleg2 = new AdvancedModelRenderer(this, 0, 0);
        this.leftfrontleg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftfrontleg2.addBox(-0.3F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftfrontleg2, 0.0F, 1.2217304763960306F, 0.8726646259971648F);
        this.upperjaw = new AdvancedModelRenderer(this, 24, 2);
        this.upperjaw.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.upperjaw.addBox(-1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F);
        this.righthindfoot = new AdvancedModelRenderer(this, 0, 19);
        this.righthindfoot.setRotationPoint(-2.7F, 0.0F, 0.0F);
        this.righthindfoot.addBox(0.0F, -2.5F, -4.5F, 0, 5, 5, 0.0F);
        this.setRotateAngle(righthindfoot, -0.9424777960769379F, -0.05235987755982988F, -0.3141592653589793F);
        this.lowerjaw1 = new AdvancedModelRenderer(this, 29, 22);
        this.lowerjaw1.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.lowerjaw1.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(lowerjaw1, -0.18203784098300857F, 0.0F, 0.0F);
        this.leftrearleg2 = new AdvancedModelRenderer(this, 0, 2);
        this.leftrearleg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftrearleg2.addBox(-0.3F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftrearleg2, -0.3665191429188092F, -0.41887902047863906F, 1.0821041362364843F);
        this.lowerjaw2 = new AdvancedModelRenderer(this, 6, 26);
        this.lowerjaw2.setRotationPoint(0.0F, 0.1F, -3.0F);
        this.lowerjaw2.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 4, 0.0F);
        this.leftfrontleg1 = new AdvancedModelRenderer(this, 14, 27);
        this.leftfrontleg1.setRotationPoint(1.6F, 0.3F, -2.8F);
        this.leftfrontleg1.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(leftfrontleg1, 0.0F, -0.6981317007977318F, 0.6981317007977318F);
        this.tail1 = new AdvancedModelRenderer(this, 0, 11);
        this.tail1.setRotationPoint(0.0F, -0.3F, 2.5F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail1, -0.091106186954104F, 0.0F, 0.0F);
        this.rightfrontleg1 = new AdvancedModelRenderer(this, 27, 14);
        this.rightfrontleg1.setRotationPoint(-1.6F, 0.3F, -2.8F);
        this.rightfrontleg1.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rightfrontleg1, 0.0F, 0.6981317007977318F, -0.6981317007977318F);
        this.rightrearleg2 = new AdvancedModelRenderer(this, 0, 4);
        this.rightrearleg2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightrearleg2.addBox(-2.7F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightrearleg2, -0.18203784098300857F, 0.41887902047863906F, -1.0471975511965976F);
        this.neck.addChild(this.head);
        this.body.addChild(this.pelvis);
        this.rightfrontleg2.addChild(this.rightfrontfoot);
        this.pelvis.addChild(this.leftrearleg1);
        this.tail1.addChild(this.tail2);
        this.tail2.addChild(this.tail3);
        this.leftfrontleg2.addChild(this.leftfrontfoot);
        this.leftrearleg2.addChild(this.lefthindfoot);
        this.body.addChild(this.neck);
        this.upperjaw.addChild(this.brow);
        this.rightfrontleg1.addChild(this.rightfrontleg2);
        this.pelvis.addChild(this.rightrearleg1);
        this.leftfrontleg1.addChild(this.leftfrontleg2);
        this.head.addChild(this.upperjaw);
        this.rightrearleg2.addChild(this.righthindfoot);
        this.head.addChild(this.lowerjaw1);
        this.leftrearleg1.addChild(this.leftrearleg2);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.body.addChild(this.leftfrontleg1);
        this.pelvis.addChild(this.tail1);
        this.body.addChild(this.rightfrontleg1);
        this.rightrearleg1.addChild(this.rightrearleg2);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(neck, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, 0.2F, 0.0F);
        this.body.offsetY = 0.3295F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
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
        this.body.offsetY = 1.25F;

        EntityPrehistoricFloraHylonomus Hylonomus = (EntityPrehistoricFloraHylonomus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.pelvis};

        float speed = 0.85F;

        //EntityPrehistoricFloraHylonomus Hylonomus = (EntityPrehistoricFloraHylonomus) e;
        if (f3 == 0.0F || !Hylonomus.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(leftrearleg1, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(leftrearleg1, speed, -0.5F, true, -1, 1F, f2, 0.5F);
        this.walk(leftrearleg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(leftrearleg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(lefthindfoot, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(lefthindfoot, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(lefthindfoot, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(rightrearleg1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(rightrearleg1, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(rightrearleg2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(rightrearleg2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(righthindfoot, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(righthindfoot, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(righthindfoot, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(leftfrontleg1, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(leftfrontleg1, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(leftfrontleg2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(leftfrontfoot, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(leftfrontfoot, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(leftfrontfoot, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(rightfrontleg1, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(rightfrontleg1, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(rightfrontleg2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(rightfrontfoot, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(rightfrontfoot, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(rightfrontfoot, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHylonomus e = (EntityPrehistoricFloraHylonomus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
