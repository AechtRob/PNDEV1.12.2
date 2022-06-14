package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhlegethontia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhlegethontia extends AdvancedModelBase {
    public AdvancedModelRenderer Bodytruemiddle;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Tailmiddlefront;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Tailmiddleback;
    public AdvancedModelRenderer Tailback;
    public AdvancedModelRenderer Tailendstart;
    public AdvancedModelRenderer Tailendmiddle;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Bodymiddlefront;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Neckbase;
    public AdvancedModelRenderer Neckfront;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Upperjawbase;
    public AdvancedModelRenderer Lowerjawbase;
    public AdvancedModelRenderer Upperjawfront;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Lowerjawmiddle;
    public AdvancedModelRenderer Jawparting;
    public AdvancedModelRenderer Lowerjawfront;

    private ModelAnimator animator;

    public ModelPhlegethontia() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailendmiddle = new AdvancedModelRenderer(this, 54, 57);
        this.Tailendmiddle.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.Tailendmiddle.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(Tailendmiddle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 19, 88);
        this.Head.setRotationPoint(0.009999999776482582F, -0.5F, -10.899999618530273F);
        this.Head.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailendstart = new AdvancedModelRenderer(this, 63, 71);
        this.Tailendstart.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, 11.0F);
        this.Tailendstart.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(Tailendstart, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 33, 18);
        this.Tailmiddle.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, 10.75F);
        this.Tailmiddle.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailback = new AdvancedModelRenderer(this, 64, 86);
        this.Tailback.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tailback.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(Tailback, -0.021293017373673524F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 31, 84);
        this.Bodyback.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, 4.5F);
        this.Bodyback.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F);
        this.Jawparting = new AdvancedModelRenderer(this, 21, 53);
        this.Jawparting.setRotationPoint(0.0F, 0.20000000298023224F, -3.9000000953674316F);
        this.Jawparting.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.23352505591421208F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRenderer(this, 36, 50);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Lowerjawmiddle.addBox(-1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRenderer(this, 30, 56);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Lowerjawbase.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F);
        this.Bodytruemiddle = new AdvancedModelRenderer(this, 0, 1);
        this.Bodytruemiddle.setRotationPoint(0.0F, 21.8F, 0.0F);
        this.Bodytruemiddle.addBox(-2.0F, -2.0F, -6.0F, 4, 4, 12, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 18);
        this.Bodymiddle.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, -4.5F);
        this.Bodymiddle.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 54, 43);
        this.Tailend.setRotationPoint(-0.009999999776482582F, -0.009999999776482582F, 11.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(Tailend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Neckbase = new AdvancedModelRenderer(this, 0, 69);
        this.Neckbase.setRotationPoint(0.0F, 0.0F, -10.75F);
        this.Neckbase.addBox(-1.5F, -1.5F, -12.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(Neckbase, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRenderer(this, 19, 76);
        this.Upperjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjawfront.addBox(-1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 29, 51);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addBox(-0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Bodymiddlefront = new AdvancedModelRenderer(this, 0, 35);
        this.Bodymiddlefront.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, -10.5F);
        this.Bodymiddlefront.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 19, 69);
        this.Snout.setRotationPoint(0.0F, -2.9000000953674316F, -1.7999999523162842F);
        this.Snout.addBox(-0.5F, 0.0F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Snout, 0.1911135497644277F, 0.0F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 30, 67);
        this.Bodyend.setRotationPoint(-0.009999999776482582F, -0.009999999776482582F, 10.5F);
        this.Bodyend.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F);
        this.Tailmiddlefront = new AdvancedModelRenderer(this, 33, 34);
        this.Tailmiddlefront.setRotationPoint(0.0F, 0.0F, 10.75F);
        this.Tailmiddlefront.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(Tailmiddlefront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjawbase = new AdvancedModelRenderer(this, 30, 73);
        this.Upperjawbase.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.Upperjawbase.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Upperjawbase, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 33, 50);
        this.Tailbase.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, 10.5F);
        this.Tailbase.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F);
        this.Neckfront = new AdvancedModelRenderer(this, 0, 85);
        this.Neckfront.setRotationPoint(-0.009999999776482582F, -0.009999999776482582F, -10.75F);
        this.Neckfront.addBox(-1.5F, -1.5F, -12.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(Neckfront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailmiddleback = new AdvancedModelRenderer(this, 33, 2);
        this.Tailmiddleback.setRotationPoint(-0.009999999776482582F, -0.009999999776482582F, 10.75F);
        this.Tailmiddleback.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(Tailmiddleback, 0.021293017373673524F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 52);
        this.Bodyfront.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, -10.5F);
        this.Bodyfront.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.Tailendstart.addChild(this.Tailendmiddle);
        this.Neckfront.addChild(this.Head);
        this.Tailback.addChild(this.Tailendstart);
        this.Tailmiddlefront.addChild(this.Tailmiddle);
        this.Tailmiddleback.addChild(this.Tailback);
        this.Bodytruemiddle.addChild(this.Bodyback);
        this.Lowerjawbase.addChild(this.Jawparting);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Head.addChild(this.Lowerjawbase);
        this.Bodytruemiddle.addChild(this.Bodymiddle);
        this.Tailendmiddle.addChild(this.Tailend);
        this.Bodyfront.addChild(this.Neckbase);
        this.Upperjawbase.addChild(this.Upperjawfront);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Bodymiddle.addChild(this.Bodymiddlefront);
        this.Upperjawbase.addChild(this.Snout);
        this.Bodyback.addChild(this.Bodyend);
        this.Tailbase.addChild(this.Tailmiddlefront);
        this.Head.addChild(this.Upperjawbase);
        this.Bodyend.addChild(this.Tailbase);
        this.Neckbase.addChild(this.Neckfront);
        this.Tailmiddle.addChild(this.Tailmiddleback);
        this.Bodymiddlefront.addChild(this.Bodyfront);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Bodytruemiddle.render(f5 * 0.25f);
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
        this.Bodytruemiddle.offsetY = 1.1F; //72

        //test code, using -1.2F as an alternator
        f2 *= -1.2F;


        EntityPrehistoricFloraPhlegethontia Phlegethontia = (EntityPrehistoricFloraPhlegethontia) e;

        this.faceTarget(f3, f4, 8, Head);

        float speed = 0.2F;
        //AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        //AdvancedModelRenderer[] Torso = {this.Head, this.Neck, this.Bodyfront, this.Bodymiddle, this.Hips};

        //test chunk code, we need to use an alternater for the swing amount instead of f2 in this case.
        this.swing(Head, speed, 0.4F, false, 0, 0F, f2, 0.5F);
        //end test chunk

        if (!Phlegethontia.isReallyInWater()) { //flop about on land


        }
        else { //in water
            if (f3 == 0.0F || !Phlegethontia.getIsMoving()) {
                return;
            }
            speed = speed * 2F;


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-2F);
        //animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Lowerjaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.rotate(this.Leftupperarm,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Rightupperarm,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Leftlowerarm,(float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Rightlowerarm,(float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Bodyfront,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Lowerjaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
