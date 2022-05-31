package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmphibamus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmphibamus extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer tailbase;
    public AdvancedModelRenderer leftarm;
    public AdvancedModelRenderer rightarm;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer upperjaw1;
    public AdvancedModelRenderer lowerjaw1;
    public AdvancedModelRenderer upperjaw2;
    public AdvancedModelRenderer eyeleft;
    public AdvancedModelRenderer eyeright;
    public AdvancedModelRenderer lowerjaw2;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer tail2;

    private ModelAnimator animator;

    public ModelAmphibamus() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.eyeright = new AdvancedModelRenderer(this, 0, 4);
        this.eyeright.setRotationPoint(1.2F, -0.8F, 0.0F);
        this.eyeright.addBox(2.3F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(eyeright, 0.0F, 2.530727415391778F, 0.0F);
        this.lowerjaw2 = new AdvancedModelRenderer(this, 0, 17);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerjaw2.addBox(-1.5F, 0.0F, -0.4F, 3, 1, 1, 0.0F);
        this.tailbase = new AdvancedModelRenderer(this, 10, 13);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tailbase.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F);
        this.leftarm = new AdvancedModelRenderer(this, 7, 16);
        this.leftarm.setRotationPoint(1.5F, 0.4F, -2.0F);
        this.leftarm.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftarm, 0.0F, 0.6981317007977318F, 0.10471975511965977F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 6, 0.0F);
        this.upperjaw1 = new AdvancedModelRenderer(this, 12, 10);
        this.upperjaw1.setRotationPoint(0.0F, 0.2F, -0.7F);
        this.upperjaw1.addBox(-2.0F, -1.1F, -2.3F, 4, 1, 2, 0.0F);
        this.setRotateAngle(upperjaw1, -0.7285004297824331F, 0.0F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 14, 3);
        this.leftleg.setRotationPoint(1.5F, 0.4F, 2.0F);
        this.leftleg.addBox(0.1F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.6981317007977318F, 0.10471975511965977F);
        this.rightarm = new AdvancedModelRenderer(this, 15, 16);
        this.rightarm.setRotationPoint(-1.5F, 0.4F, -2.0F);
        this.rightarm.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, -0.6981317007977318F, -0.10471975511965977F);
        this.lowerjaw1 = new AdvancedModelRenderer(this, 1, 9);
        this.lowerjaw1.setRotationPoint(0.0F, 0.1F, -0.5F);
        this.lowerjaw1.addBox(-2.0F, 0.0F, -2.4F, 4, 1, 2, 0.0F);
        this.eyeleft = new AdvancedModelRenderer(this, 0, 2);
        this.eyeleft.setRotationPoint(-1.2F, -0.8F, 0.0F);
        this.eyeleft.addBox(2.3F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(eyeleft, 0.0F, 0.6108652381980153F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 0, 15);
        this.rightleg.setRotationPoint(-1.5F, 0.4F, 2.0F);
        this.rightleg.addBox(-3.1F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.6981317007977318F, -0.10471975511965977F);
        this.head = new AdvancedModelRenderer(this, 0, 20);
        this.head.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.head.addBox(-2.0F, -0.9F, -1.0F, 4, 2, 1, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 14, 0);
        this.tail1.setRotationPoint(0.0F, 0.0F, 0.2F);
        this.tail1.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(tail1, -0.25918139392115797F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 0, 12);
        this.neck.setRotationPoint(0.0F, -0.1F, -2.2F);
        this.neck.addBox(-1.5F, -0.5F, -1.4F, 3, 1, 2, 0.0F);
        this.upperjaw2 = new AdvancedModelRenderer(this, 7, 18);
        this.upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.upperjaw2.addBox(-1.5F, -1.1F, -0.3F, 3, 1, 1, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 0, 0);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.upperjaw1.addChild(this.eyeright);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.body.addChild(this.tailbase);
        this.body.addChild(this.leftarm);
        this.head.addChild(this.upperjaw1);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.rightarm);
        this.head.addChild(this.lowerjaw1);
        this.upperjaw1.addChild(this.eyeleft);
        this.body.addChild(this.rightleg);
        this.neck.addChild(this.head);
        this.tailbase.addChild(this.tail1);
        this.body.addChild(this.neck);
        this.upperjaw1.addChild(this.upperjaw2);
        this.tail1.addChild(this.tail2);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.42f);
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
        this.body.offsetY = 1.2F;

        EntityPrehistoricFloraAmphibamus Amphibamus = (EntityPrehistoricFloraAmphibamus) e;

        this.faceTarget(f3, f4, 2, neck);

        float speed = 0.5F;
        AdvancedModelRenderer[] Tail = {this.tailbase, this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.body, this.neck};

        if (!Amphibamus.isReallyInWater()) {
            //Land animation:
            this.chainWave(Tail, speed * (0.1F + f3), 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * (0.1F + f3), 0.12F, -3, f2, 0.8F);

            //System.err.println("Blinking: " + Amphibamus.getBlinking());

            if (Amphibamus.getBlinking()) {
                this.flap(eyeleft,0.008F, 0.05F,false, 0F,0.8F, f2, 0.2F);
                this.flap(eyeright,0.008F, 0.05F,true, 0F,0.8F, f2, 0.2F);
            }

            this.upperjaw1.rotateAngleX = -0.2F;
            this.walk(this.upperjaw1, speed * 0.2F, 2F,true, 0F,0.1F, f2, 0.1F);

            if (f3 == 0.0F || !Amphibamus.getIsMoving()) { //Not moving
                return;
            }

            this.leftarm.rotateAngleZ = (float) Math.toRadians(60);
            this.leftleg.rotateAngleZ = (float) Math.toRadians(60);
            this.rightarm.rotateAngleZ = (float) Math.toRadians(-60);
            this.rightleg.rotateAngleZ = (float) Math.toRadians(-60);

            this.leftarm.rotateAngleY = (float) Math.toRadians(40);
            this.leftleg.rotateAngleY = (float) Math.toRadians(30);
            this.rightarm.rotateAngleY = (float) Math.toRadians(-40);
            this.rightleg.rotateAngleY = (float) Math.toRadians(-30);

            this.swing(this.rightarm, speed * 0.6F, 0.2F,false, 3F,0.8F, f2, 1F);
            this.swing(this.leftarm, speed * 0.6F, 0.2F,true, 0F,0.8F, f2, 1F);

            this.swing(this.rightleg, speed * 0.6F, -0.2F,false, 0F,0.8F, f2, 1F);
            this.swing(this.leftleg, speed * 0.6F, -0.2F,true, 3F,0.8F, f2, 1F);

            this.flap(this.rightarm, speed * 0.6F, -0.2F,false, 0F,0.8F, f2, 1F);
            this.flap(this.leftarm, speed * 0.6F, -0.2F,true, 0F,0.8F, f2, 1F);

            this.flap(this.rightleg, speed * 0.6F, 0.2F,false, 0F,0.8F, f2, 1F);
            this.flap(this.leftleg, speed * 0.6F, 0.2F,true, 0F,0.8F, f2, 1F);

        }
        else {
            //Swimming animation:
            speed = speed * 1.2F;

            this.upperjaw1.rotateAngleX = 0.05F; //Close mouth

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.swing(this.rightarm, speed * 0.6F, 0.8F,false, 0F,0.8F, f2, 1F);
            this.swing(this.leftarm, speed * 0.6F, 0.8F,true, 0F,0.8F, f2, 1F);

            this.swing(this.rightleg, speed * 0.6F, 0.8F,false, 3F,0.8F, f2, 1F);
            this.swing(this.leftleg, speed * 0.6F, 0.8F,true, 3F,0.8F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAmphibamus e = (EntityPrehistoricFloraAmphibamus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.upperjaw1, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.upperjaw1, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
