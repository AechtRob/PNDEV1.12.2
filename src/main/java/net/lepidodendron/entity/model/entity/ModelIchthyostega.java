package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyostega;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIchthyostega extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer bodyfront;
    public AdvancedModelRenderer bodyrear;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftarm1;
    public AdvancedModelRenderer rightarm1;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer lowerjaw1;
    public AdvancedModelRenderer upperjaw1;
    public AdvancedModelRenderer snout;
    public AdvancedModelRenderer lowerjaw2;
    public AdvancedModelRenderer gumsleft;
    public AdvancedModelRenderer gumsright;
    public AdvancedModelRenderer underjaw;
    public AdvancedModelRenderer leftarm2;
    public AdvancedModelRenderer leftfrontfin;
    public AdvancedModelRenderer rightarm2;
    public AdvancedModelRenderer rightfrontfin;
    public AdvancedModelRenderer tailbase;
    public AdvancedModelRenderer leftleg1;
    public AdvancedModelRenderer rightleg1;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tailfin;
    public AdvancedModelRenderer leftleg2;
    public AdvancedModelRenderer leftrearfin;
    public AdvancedModelRenderer rightleg2;
    public AdvancedModelRenderer rightrearfin;

    private ModelAnimator animator;

    public ModelIchthyostega() {
        this.textureWidth = 90;
        this.textureHeight = 90;
        this.tail2 = new AdvancedModelRenderer(this, 26, 14);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 10, 0.0F);
        this.rightarm2 = new AdvancedModelRenderer(this, 22, 21);
        this.rightarm2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightarm2.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rightarm2, -0.136659280431156F, -0.091106186954104F, -0.18203784098300857F);
        this.leftleg1 = new AdvancedModelRenderer(this, 77, 27);
        this.leftleg1.setRotationPoint(4.0F, 0.5F, 3.5F);
        this.leftleg1.addBox(0.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(leftleg1, 0.045553093477052F, -0.4553564018453205F, 0.4553564018453205F);
        this.neck = new AdvancedModelRenderer(this, 0, 21);
        this.neck.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.neck.addBox(-4.5F, -3.0F, -4.0F, 9, 6, 4, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.012609847564330588F, 0.0F);
        this.upperjaw1 = new AdvancedModelRenderer(this, 21, 28);
        this.upperjaw1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.upperjaw1.addBox(-3.0F, -1.3F, -5.0F, 6, 2, 5, 0.0F);
        this.tailbase = new AdvancedModelRenderer(this, 66, 0);
        this.tailbase.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.tailbase.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 4, 0.0F);
        this.underjaw = new AdvancedModelRenderer(this, 70, 22);
        this.underjaw.setRotationPoint(0.0F, 0.6F, -2.7F);
        this.underjaw.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(underjaw, -0.22985986248765322F, 0.0F, 0.0F);
        this.leftfrontfin = new AdvancedModelRenderer(this, 63, 38);
        this.leftfrontfin.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftfrontfin.addBox(0.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(leftfrontfin, -0.18203784098300857F, 0.136659280431156F, -0.31869712141416456F);
        this.snout = new AdvancedModelRenderer(this, 21, 35);
        this.snout.setRotationPoint(0.0F, 0.4F, 0.4F);
        this.snout.addBox(-2.5F, -2.7F, -4.9F, 5, 1, 5, 0.0F);
        this.setRotateAngle(snout, 0.18517943363659833F, 0.0F, -0.003490658503988659F);
        this.head = new AdvancedModelRenderer(this, 0, 31);
        this.head.setRotationPoint(0.0F, 0.0F, -3.6F);
        this.head.addBox(-4.0F, -2.3F, -5.0F, 8, 3, 5, 0.0F);
        this.gumsleft = new AdvancedModelRenderer(this, 0, 0);
        this.gumsleft.setRotationPoint(-3.0F, -0.5F, -1.4F);
        this.gumsleft.addBox(0.0F, -1.5F, -1.3F, 0, 3, 3, 0.0F);
        this.setRotateAngle(gumsleft, -0.4073598474154765F, 0.0F, 0.0F);
        this.leftrearfin = new AdvancedModelRenderer(this, 40, 14);
        this.leftrearfin.setRotationPoint(2.3F, 0.0F, 0.0F);
        this.leftrearfin.addBox(0.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F);
        this.bodyrear = new AdvancedModelRenderer(this, 36, 0);
        this.bodyrear.setRotationPoint(0.0F, -0.2F, 2.0F);
        this.bodyrear.addBox(-4.5F, -4.0F, 0.0F, 9, 8, 6, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 59, 10);
        this.tail1.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 7, 0.0F);
        this.rightarm1 = new AdvancedModelRenderer(this, 55, 37);
        this.rightarm1.setRotationPoint(-4.5F, 1.0F, -5.5F);
        this.rightarm1.addBox(-3.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(rightarm1, 0.31869712141416456F, 0.36425021489121656F, -0.40980330836826856F);
        this.rightleg2 = new AdvancedModelRenderer(this, 60, 0);
        this.rightleg2.setRotationPoint(-2.3F, 0.0F, 0.0F);
        this.rightleg2.addBox(-2.3F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(rightleg2, 0.0F, 0.5159193268895238F, 0.0F);
        this.leftarm1 = new AdvancedModelRenderer(this, 77, 27);
        this.leftarm1.setRotationPoint(4.5F, 1.0F, -5.5F);
        this.leftarm1.addBox(0.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(leftarm1, 0.045553093477052F, -0.40980330836826856F, 0.6829473363053812F);
        this.leftarm2 = new AdvancedModelRenderer(this, 40, 19);
        this.leftarm2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftarm2.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(leftarm2, 0.0F, -0.045553093477052F, 0.0F);
        this.lowerjaw1 = new AdvancedModelRenderer(this, 35, 37);
        this.lowerjaw1.setRotationPoint(0.0F, 0.7F, -3.5F);
        this.lowerjaw1.addBox(-3.5F, 0.0F, -6.0F, 7, 2, 6, 0.0F);
        this.leftleg2 = new AdvancedModelRenderer(this, 54, 14);
        this.leftleg2.setRotationPoint(2.3F, 0.0F, 0.0F);
        this.leftleg2.addBox(0.3F, -0.5F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(leftleg2, -0.091106186954104F, -0.091106186954104F, 0.0F);
        this.tailfin = new AdvancedModelRenderer(this, 0, 28);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.tailfin.addBox(0.0F, -3.5F, 0.0F, 0, 7, 15, 0.0F);
        this.gumsright = new AdvancedModelRenderer(this, 0, 0);
        this.gumsright.setRotationPoint(3.0F, -0.5F, -1.4F);
        this.gumsright.addBox(0.0F, -1.5F, -1.3F, 0, 3, 3, 0.0F);
        this.setRotateAngle(gumsright, -0.4073598474154765F, 0.0F, 0.0F);
        this.rightrearfin = new AdvancedModelRenderer(this, 0, 16);
        this.rightrearfin.setRotationPoint(-2.3F, 0.0F, 0.0F);
        this.rightrearfin.addBox(-5.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F);
        this.rightfrontfin = new AdvancedModelRenderer(this, 73, 33);
        this.rightfrontfin.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightfrontfin.addBox(-4.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(rightfrontfin, -0.18203784098300857F, -0.136659280431156F, 0.31869712141416456F);
        this.rightleg1 = new AdvancedModelRenderer(this, 29, 0);
        this.rightleg1.setRotationPoint(-4.0F, 0.5F, 3.5F);
        this.rightleg1.addBox(-3.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(rightleg1, 0.091106186954104F, 0.18203784098300857F, -0.36425021489121656F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-5.5F, -4.5F, -3.5F, 11, 9, 7, 0.0F);
        this.lowerjaw2 = new AdvancedModelRenderer(this, 18, 16);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.lowerjaw2.addBox(-2.5F, 0.0F, -5.0F, 5, 1, 4, 0.0F);
        this.bodyfront = new AdvancedModelRenderer(this, 43, 22);
        this.bodyfront.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.bodyfront.addBox(-5.0F, -4.0F, -7.0F, 10, 8, 7, 0.0F);
        this.tail1.addChild(this.tail2);
        this.rightarm1.addChild(this.rightarm2);
        this.bodyrear.addChild(this.leftleg1);
        this.bodyfront.addChild(this.neck);
        this.head.addChild(this.upperjaw1);
        this.bodyrear.addChild(this.tailbase);
        this.lowerjaw2.addChild(this.underjaw);
        this.leftarm2.addChild(this.leftfrontfin);
        this.upperjaw1.addChild(this.snout);
        this.neck.addChild(this.head);
        this.lowerjaw1.addChild(this.gumsleft);
        this.leftleg2.addChild(this.leftrearfin);
        this.body.addChild(this.bodyrear);
        this.tailbase.addChild(this.tail1);
        this.bodyfront.addChild(this.rightarm1);
        this.rightleg1.addChild(this.rightleg2);
        this.bodyfront.addChild(this.leftarm1);
        this.leftarm1.addChild(this.leftarm2);
        this.neck.addChild(this.lowerjaw1);
        this.leftleg1.addChild(this.leftleg2);
        this.tail2.addChild(this.tailfin);
        this.lowerjaw1.addChild(this.gumsright);
        this.rightleg2.addChild(this.rightrearfin);
        this.rightarm2.addChild(this.rightfrontfin);
        this.bodyrear.addChild(this.rightleg1);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.body.addChild(this.bodyfront);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.45f);
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
        this.body.offsetY = 1.35F;

        EntityPrehistoricFloraIchthyostega Ichthyostega = (EntityPrehistoricFloraIchthyostega) e;

        this.faceTarget(f3, f4, 2, neck);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tailbase, this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.neck, this.bodyfront, this.body, this.bodyrear};

        if (!Ichthyostega.isReallyInWater()) {
            this.leftarm2.rotateAngleY = (float) Math.toRadians(90);
            this.rightarm2.rotateAngleY = (float) Math.toRadians(-90);

            if (f3 == 0.0F || !Ichthyostega.getIsMoving()) {
                return;
            }

            this.swing(this.rightarm2, speed * 0.6F, 0.8F,false, -0.8F,0.8F, f2, 1F);
            this.swing(this.leftarm2, speed * 0.6F, 0.8F,true, 0.8F,0.8F, f2, 1F);

            this.walk(this.rightleg1, speed * 0.6F, -0.4F,false, -0.8F,0.8F, f2, 1F);
            this.walk(this.leftleg1, speed * 0.6F, -0.4F,true, 0.8F,0.8F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.flap(this.rightleg2, speed * 0.7F, 0.3F,false, 0F,0.5F, f2, 0.7F);
            this.flap(this.leftleg2, speed * 0.7F, -0.3F,false, 0F,0.5F, f2, 0.7F);

            this.swing(this.rightarm2, speed * 0.7F, 0.5F,false, 2F,0.5F, f2, 1F);
            this.swing(this.leftarm2, speed * 0.7F, -0.5F,false, 2F,0.5F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
