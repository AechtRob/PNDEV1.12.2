package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCoelacanthus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Headbase;
    public AdvancedModelRenderer Firstdorsalfin;
    public AdvancedModelRenderer Leftarm;
    public AdvancedModelRenderer Rightarm;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Tailmiddlebase;
    public AdvancedModelRenderer Dorsallobe;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Tailmiddleend;
    public AdvancedModelRenderer Tailfinbase;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfinmiddle;
    public AdvancedModelRenderer Tailfinnub;
    public AdvancedModelRenderer Tailfinend;
    public AdvancedModelRenderer Seconddorsalfin;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Eyeportion;
    public AdvancedModelRenderer Lowerjawbase;
    public AdvancedModelRenderer Forehead;
    public AdvancedModelRenderer Upperjaw;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Jawslope;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;

    public ModelCoelacanthus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Rightarm = new AdvancedModelRenderer(this, 23, 58);
        this.Rightarm.setRotationPoint(-2.700000047683716F, 4.0F, -4.5F);
        this.Rightarm.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Rightarm, -0.1485275233394591F, -0.36093409463874954F, 0.169820528229565F);
        this.Upperjaw = new AdvancedModelRenderer(this, 44, 74);
        this.Upperjaw.setRotationPoint(0.0F, 3.0F, -3.0999999046325684F);
        this.Upperjaw.addBox(-2.0F, -2.0F, -2.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(Upperjaw, -0.06370451936226872F, 0.0F, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 47, 61);
        this.Snout.setRotationPoint(0.0F, -3.0F, -0.10000000149011612F);
        this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.5400048798881094F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRenderer(this, 0, 31);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.30000001192092896F, 6.900000095367432F);
        this.Tailmiddlebase.addBox(-1.5F, -2.5F, 0.0F, 3, 6, 8, 0.0F);
        this.Dorsallobe = new AdvancedModelRenderer(this, 19, 46);
        this.Dorsallobe.setRotationPoint(0.0F, -2.700000047683716F, 1.0F);
        this.Dorsallobe.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Dorsallobe, 0.33964105645913F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 23);
        this.Tailend.setRotationPoint(0.0F, 0.05000000074505806F, 6.099999904632568F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 80);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-3.0F, -2.0F, -7.5F, 6, 9, 11, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 34, 57);
        this.Analfin.setRotationPoint(0.0F, 4.5F, 5.199999809265137F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 6, 5, 0.0F);
        this.setRotateAngle(Analfin, 0.7853981633974483F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 25, 77);
        this.Headslope.setRotationPoint(-0.009999999776482582F, -2.700000047683716F, -0.20000000298023224F);
        this.Headslope.addBox(-3.0F, 0.0F, -6.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Headslope, 0.2459168942691621F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 32, 41);
        this.Rightpelvicfin.setRotationPoint(-0.699999988079071F, 5.300000190734863F, 3.0F);
        this.Rightpelvicfin.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 8, 0.0F);
        this.setRotateAngle(Rightpelvicfin, -0.04241150198859518F, -0.12740903872453743F, -0.5518731241279929F);
        this.Tailfinnub = new AdvancedModelRenderer(this, 33, 7);
        this.Tailfinnub.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tailfinnub.addBox(0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F);
        this.Tailfinmiddle = new AdvancedModelRenderer(this, 5, 0);
        this.Tailfinmiddle.setRotationPoint(0.0F, -0.6000000238418579F, 0.25F);
        this.Tailfinmiddle.addBox(0.0F, -7.0F, 0.0F, 0, 14, 7, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 46);
        this.Tailbase.setRotationPoint(0.0F, 0.6000000238418579F, 7.900000095367432F);
        this.Tailbase.addBox(-2.5F, -2.5F, 0.0F, 5, 7, 8, 0.0F);
        this.Eyeportion = new AdvancedModelRenderer(this, 31, 70);
        this.Eyeportion.setRotationPoint(0.0F, 0.10000000149011612F, -6.0F);
        this.Eyeportion.addBox(-3.0F, 0.0F, -3.0F, 6, 3, 3, 0.0F);
        this.Seconddorsalfin = new AdvancedModelRenderer(this, 27, 36);
        this.Seconddorsalfin.setRotationPoint(0.0F, -0.20000000298023224F, 3.700000047683716F);
        this.Seconddorsalfin.addBox(0.0F, -8.0F, 0.0F, 0, 8, 6, 0.0F);
        this.setRotateAngle(Seconddorsalfin, -1.1674507260063627F, 0.0F, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 34, 15);
        this.Leftpectoralfin.setRotationPoint(0.30000001192092896F, 0.0F, 1.0F);
        this.Leftpectoralfin.addBox(0.0F, -2.5F, 0.0F, 0, 5, 6, 0.0F);
        this.Tailmiddleend = new AdvancedModelRenderer(this, 15, 27);
        this.Tailmiddleend.setRotationPoint(0.009999999776482582F, 0.30000001192092896F, 6.800000190734863F);
        this.Tailmiddleend.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 7, 0.0F);
        this.Tailfinbase = new AdvancedModelRenderer(this, 0, 8);
        this.Tailfinbase.setRotationPoint(0.0F, 0.30000001192092896F, 6.0F);
        this.Tailfinbase.addBox(0.0F, -4.5F, 0.0F, 0, 9, 2, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 30, 50);
        this.Rightpectoralfin.setRotationPoint(-0.30000001192092896F, 0.0F, 1.0F);
        this.Rightpectoralfin.addBox(0.0F, -2.5F, 0.0F, 0, 5, 6, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 26, 32);
        this.Leftpelvicfin.setRotationPoint(0.699999988079071F, 5.300000190734863F, 3.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 5, 0, 8, 0.0F);
        this.setRotateAngle(Leftpelvicfin, -0.04241150198859518F, 0.12740903872453743F, 0.5518731241279929F);
        this.Firstdorsalfin = new AdvancedModelRenderer(this, 43, 42);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.0F, -0.5F);
        this.Firstdorsalfin.addBox(0.0F, -9.0F, 0.0F, 0, 9, 8, 0.0F);
        this.setRotateAngle(Firstdorsalfin, -0.36093409463874954F, 0.0F, 0.0F);
        this.Leftarm = new AdvancedModelRenderer(this, 24, 64);
        this.Leftarm.setRotationPoint(2.700000047683716F, 4.0F, -4.5F);
        this.Leftarm.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Leftarm, -0.1485275233394591F, 0.36093409463874954F, -0.169820528229565F);
        this.Headbase = new AdvancedModelRenderer(this, 35, 86);
        this.Headbase.setRotationPoint(0.0F, 0.699999988079071F, -7.300000190734863F);
        this.Headbase.addBox(-3.5F, -1.0F, -6.0F, 7, 7, 7, 0.0F);
        this.Forehead = new AdvancedModelRenderer(this, 47, 66);
        this.Forehead.setRotationPoint(0.0F, -1.2000000476837158F, -0.15000000596046448F);
        this.Forehead.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Forehead, 0.3998549289687398F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 0, 62);
        this.Bodyback.setRotationPoint(0.009999999776482582F, 1.0F, 2.4000000953674316F);
        this.Bodyback.addBox(-3.0F, -2.5F, 0.0F, 6, 8, 9, 0.0F);
        this.Tailfinend = new AdvancedModelRenderer(this, 20, 2);
        this.Tailfinend.setRotationPoint(-0.009999999776482582F, -0.4000000059604645F, 0.0F);
        this.Tailfinend.addBox(0.0F, -6.5F, 0.0F, 0, 13, 6, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 59, 75);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -5.5F);
        this.Lowerjawfront.addBox(-2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRenderer(this, 64, 92);
        this.Lowerjawbase.setRotationPoint(0.009999999776482582F, 5.099999904632568F, -3.799999952316284F);
        this.Lowerjawbase.addBox(-3.0F, -1.0F, -5.5F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Lowerjawbase, -0.12740903872453743F, 0.0F, 0.0F);
        this.Jawslope = new AdvancedModelRenderer(this, 57, 83);
        this.Jawslope.setRotationPoint(0.009999999776482582F, -2.5F, -0.699999988079071F);
        this.Jawslope.addBox(-3.0F, 0.0F, -5.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Jawslope, 0.2972295835988592F, 0.0F, 0.0F);
        this.Bodyfront.addChild(this.Rightarm);
        this.Eyeportion.addChild(this.Upperjaw);
        this.Upperjaw.addChild(this.Snout);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Tailbase.addChild(this.Dorsallobe);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Tailbase.addChild(this.Analfin);
        this.Headbase.addChild(this.Headslope);
        this.Bodyback.addChild(this.Rightpelvicfin);
        this.Tailend.addChild(this.Tailfinnub);
        this.Tailmiddleend.addChild(this.Tailfinmiddle);
        this.Bodyback.addChild(this.Tailbase);
        this.Headbase.addChild(this.Eyeportion);
        this.Dorsallobe.addChild(this.Seconddorsalfin);
        this.Leftarm.addChild(this.Leftpectoralfin);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Tailmiddlebase.addChild(this.Tailfinbase);
        this.Rightarm.addChild(this.Rightpectoralfin);
        this.Bodyback.addChild(this.Leftpelvicfin);
        this.Bodyfront.addChild(this.Firstdorsalfin);
        this.Bodyfront.addChild(this.Leftarm);
        this.Bodyfront.addChild(this.Headbase);
        this.Eyeportion.addChild(this.Forehead);
        this.Bodyfront.addChild(this.Bodyback);
        this.Tailend.addChild(this.Tailfinend);
        this.Lowerjawbase.addChild(this.Lowerjawfront);
        this.Headbase.addChild(this.Lowerjawbase);
        this.Lowerjawbase.addChild(this.Jawslope);
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.315F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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

        this.Bodyfront.offsetY = 1.3F;

        AdvancedModelRenderer[] fishTail = {this.Bodyback, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.1F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(Lowerjawbase, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(Bodyfront, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Bodyfront, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
        this.swing(Rightpectoralfin, (float) (speed * 0.75), -0.1F, true, 0, 0, f2, 1);
        this.walk(Leftarm, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(Leftarm, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.walk(Rightarm, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(Rightarm, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

        this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(Rightpelvicfin, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        this.walk(Dorsallobe, (float) (speed * 0.75), 0.1F, true, 0, -0.05F, f2, 0.5F);
        this.swing(Dorsallobe, (float) (speed * 0.75 * 0.5), 0.1F, true, 0, 0.05F, f2, 1);
        this.walk(Seconddorsalfin, (float) (speed * 0.75), 0.2F, true, 0, -0.1F, f2, 0.5F);
        this.swing(Seconddorsalfin, (float) (speed * 0.75 * 0.5), 0.1F, true, 0, 0.05F, f2, 1);

        if (!e.isInWater()) {
            this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.Bodyfront.offsetY = 1.32F;
            this.bob(Bodyfront, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

}

