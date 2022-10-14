package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEdestus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Backslopefront;
    public AdvancedModelRenderer Headback;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Backslopemiddle;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Backslopeend;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Tailendmiddle;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Headmiddle;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Lowerjawback;
    public AdvancedModelRenderer Headfront;
    public AdvancedModelRenderer Mouth;
    public AdvancedModelRenderer Snoutback;
    public AdvancedModelRenderer Uppertoothwhorl;
    public AdvancedModelRenderer Snoutfront;
    public AdvancedModelRenderer Lowerjawmiddle;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Lowertoothwhorl;

    private ModelAnimator animator;

    public ModelEdestus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Throat = new AdvancedModelRenderer(this, 0, 14);
        this.Throat.setRotationPoint(0.0F, 7.0F, -2.9000000953674316F);
        this.Throat.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Throat, -0.33964105645913F, 0.0F, 0.0F);
        this.Headfront = new AdvancedModelRenderer(this, 44, 14);
        this.Headfront.setRotationPoint(0.0F, 0.0F, -3.799999952316284F);
        this.Headfront.addBox(-1.5F, 0.0F, -2.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Headfront, -0.12740903872453743F, 0.0F, 0.0F);
        this.Mouth = new AdvancedModelRenderer(this, 39, 24);
        this.Mouth.setRotationPoint(0.009999999776482582F, 4.0F, -5.0F);
        this.Mouth.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(Mouth, 1.209862232156147F, 0.0F, 0.0F);
        this.Dorsalfin = new AdvancedModelRenderer(this, 52, 66);
        this.Dorsalfin.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.Dorsalfin.addBox(0.0F, -8.0F, 0.0F, 0, 8, 8, 0.0F);
        this.setRotateAngle(Dorsalfin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Lowerjawback = new AdvancedModelRenderer(this, 25, 14);
        this.Lowerjawback.setRotationPoint(0.0F, 6.5F, -2.5F);
        this.Lowerjawback.addBox(-1.5F, -2.0F, -2.5F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Lowerjawback, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 0, 20);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addBox(-0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 77);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Bodyfront.addBox(-3.0F, -1.5F, -11.0F, 6, 8, 13, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRenderer(this, 16, 10);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.Lowerjawmiddle.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 79, 16);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tailfin.addBox(0.0F, -10.0F, 0.0F, 0, 20, 10, 0.0F);
        this.setRotateAngle(Tailfin, 0.021293017373673524F, 0.0F, 0.0F);
        this.Backslopefront = new AdvancedModelRenderer(this, 43, 86);
        this.Backslopefront.setRotationPoint(0.0F, -2.5999999046325684F, 1.100000023841858F);
        this.Backslopefront.addBox(-2.5F, 0.0F, -12.0F, 5, 2, 12, 0.0F);
        this.setRotateAngle(Backslopefront, 0.08482300397719036F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 0, 36);
        this.Rightpelvicfin.setRotationPoint(-1.5F, 4.900000095367432F, 5.0F);
        this.Rightpelvicfin.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.33964105645913F, -0.36093409463874954F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 41);
        this.Bodyend.setRotationPoint(0.0F, 0.5F, 7.699999809265137F);
        this.Bodyend.addBox(-2.5F, -1.0F, 0.0F, 5, 6, 8, 0.0F);
        this.setRotateAngle(Bodyend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 82, 73);
        this.Tailmiddle.setRotationPoint(0.0F, -0.30000001192092896F, 3.9000000953674316F);
        this.Tailmiddle.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Tailmiddle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Backslopeend = new AdvancedModelRenderer(this, 33, 63);
        this.Backslopeend.setRotationPoint(0.0F, -2.5999999046325684F, 0.0F);
        this.Backslopeend.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 8, 0.0F);
        this.setRotateAngle(Backslopeend, -0.18238690350445608F, 0.0F, 0.0F);
        this.Lowertoothwhorl = new AdvancedModelRenderer(this, 28, 5);
        this.Lowertoothwhorl.setRotationPoint(0.009999999776482582F, 0.20000000298023224F, -2.5999999046325684F);
        this.Lowertoothwhorl.addBox(0.0F, -2.0F, -1.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(Lowertoothwhorl, 0.27593656206399647F, 0.0F, 0.021293017373673524F);
        this.Uppertoothwhorl = new AdvancedModelRenderer(this, 5, 4);
        this.Uppertoothwhorl.setRotationPoint(-0.009999999776482582F, 3.4000000953674316F, -3.700000047683716F);
        this.Uppertoothwhorl.addBox(0.0F, 0.0F, -0.5F, 0, 2, 5, 0.0F);
        this.setRotateAngle(Uppertoothwhorl, -0.12740903872453743F, 0.0F, 0.021293017373673524F);
        this.Tailbase = new AdvancedModelRenderer(this, 80, 85);
        this.Tailbase.setRotationPoint(0.0F, 0.6000000238418579F, 6.900000095367432F);
        this.Tailbase.addBox(-2.0F, -1.5F, 0.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(Tailbase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 0, 0);
        this.Rightpectoralfin.setRotationPoint(-2.5F, 5.0F, -4.5F);
        this.Rightpectoralfin.addBox(-9.0F, 0.0F, -2.0F, 9, 0, 8, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.12740903872453743F, -0.6579891413176677F);
        this.Backslopemiddle = new AdvancedModelRenderer(this, 30, 74);
        this.Backslopemiddle.setRotationPoint(0.0F, -2.5999999046325684F, 0.0F);
        this.Backslopemiddle.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 9, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.17854717448953664F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 58);
        this.Bodymiddle.setRotationPoint(0.009999999776482582F, 1.0F, 0.699999988079071F);
        this.Bodymiddle.addBox(-3.0F, -1.5F, 0.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.04241150198859518F, 0.0F, 0.0F);
        this.Headback = new AdvancedModelRenderer(this, 34, 32);
        this.Headback.setRotationPoint(0.0F, -1.5F, -10.899999618530273F);
        this.Headback.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 3, 0.0F);
        this.setRotateAngle(Headback, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 19, 0);
        this.Leftpectoralfin.setRotationPoint(2.5F, 5.0F, -4.5F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, -2.0F, 9, 0, 8, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, -0.12740903872453743F, 0.6579891413176677F);
        this.Tailend = new AdvancedModelRenderer(this, 82, 50);
        this.Tailend.setRotationPoint(0.0F, 0.20000000298023224F, 2.9000000953674316F);
        this.Tailend.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F);
        this.Tailendmiddle = new AdvancedModelRenderer(this, 80, 61);
        this.Tailendmiddle.setRotationPoint(0.009999999776482582F, 0.009999999776482582F, 2.9000000953674316F);
        this.Tailendmiddle.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Tailendmiddle, 0.021293017373673524F, 0.0F, 0.0F);
        this.Snoutback = new AdvancedModelRenderer(this, 9, 20);
        this.Snoutback.setRotationPoint(0.0F, 0.0F, -2.299999952316284F);
        this.Snoutback.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Snoutback, -0.04241150198859518F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 9, 36);
        this.Leftpelvicfin.setRotationPoint(1.5F, 4.900000095367432F, 5.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, -0.33964105645913F, 0.36093409463874954F);
        this.Headmiddle = new AdvancedModelRenderer(this, 18, 23);
        this.Headmiddle.setRotationPoint(0.0F, 0.0F, -2.799999952316284F);
        this.Headmiddle.addBox(-2.0F, 0.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Headmiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Snoutfront = new AdvancedModelRenderer(this, 0, 8);
        this.Snoutfront.setRotationPoint(0.0F, 0.10000000149011612F, -2.0F);
        this.Snoutfront.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Snoutfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Headback.addChild(this.Throat);
        this.Headmiddle.addChild(this.Headfront);
        this.Headmiddle.addChild(this.Mouth);
        this.Backslopefront.addChild(this.Dorsalfin);
        this.Headback.addChild(this.Lowerjawback);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Backslopefront);
        this.Bodyend.addChild(this.Rightpelvicfin);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Bodyend.addChild(this.Backslopeend);
        this.Lowerjawfront.addChild(this.Lowertoothwhorl);
        this.Headfront.addChild(this.Uppertoothwhorl);
        this.Bodyend.addChild(this.Tailbase);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Bodymiddle.addChild(this.Backslopemiddle);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Bodyfront.addChild(this.Headback);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Tailendmiddle.addChild(this.Tailend);
        this.Tailmiddle.addChild(this.Tailendmiddle);
        this.Headfront.addChild(this.Snoutback);
        this.Bodyend.addChild(this.Leftpelvicfin);
        this.Headback.addChild(this.Headmiddle);
        this.Snoutback.addChild(this.Snoutfront);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Bodyfront.render(f5 * 1.62F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(26);
        this.Headback.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Bodyfront.offsetY = 0.7F;
        this.Bodyfront.offsetZ = 1.1F;

        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailendmiddle, this.Tailend};

        float speed = 0.21F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.5F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 0.8F, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still * 0.8F, 0.25F * still, -0.55, f2, 0.6F * still);
            this.swing(Bodyfront, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Bodyfront, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.flap(Leftpectoralfin, (float) (speed * 0.85), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Leftpectoralfin, (float) (speed * 0.85), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(Rightpectoralfin, (float) (speed * 0.85), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Rightpectoralfin, (float) (speed * 0.85), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(Leftpelvicfin, (float) (speed * 0.85), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Leftpelvicfin, (float) (speed * 0.85), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(Rightpelvicfin, (float) (speed * 0.85), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Rightpelvicfin, (float) (speed * 0.85), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.55F;
            this.bob(Bodyfront, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //duration 25
        animator.startKeyframe(5);
        animator.rotate(this.Headback, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Headback, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Headback, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Headback, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(25.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}

