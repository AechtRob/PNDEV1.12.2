package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPikaia extends ModelBasePalaeopedia {
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Bodymiddlefront;
    public AdvancedModelRenderer Bodymiddleback;
    public AdvancedModelRenderer Backslope3;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Backslope2;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Backslope1;
    public AdvancedModelRenderer Leftfrond1;
    public AdvancedModelRenderer Leftfrond2;
    public AdvancedModelRenderer Leftfrond3;
    public AdvancedModelRenderer Leftfrond4;
    public AdvancedModelRenderer Leftfrond5;
    public AdvancedModelRenderer Leftfrond6;
    public AdvancedModelRenderer Leftfrond7;
    public AdvancedModelRenderer Leftfrond8;
    public AdvancedModelRenderer Leftfrond9;
    public AdvancedModelRenderer Rightfrond1;
    public AdvancedModelRenderer Rightfrond2;
    public AdvancedModelRenderer Rightfrond3;
    public AdvancedModelRenderer Rightfrond4;
    public AdvancedModelRenderer Rightfrond5;
    public AdvancedModelRenderer Rightfrond6;
    public AdvancedModelRenderer Rightfrond7;
    public AdvancedModelRenderer Rightfrond8;
    public AdvancedModelRenderer Rightfrond9;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Leftantenna;
    public AdvancedModelRenderer Rightantenna;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Fin1;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Fin2;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Fin3;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailslope1;
    public AdvancedModelRenderer Fin4;
    public AdvancedModelRenderer Tailslope2;
    public AdvancedModelRenderer Fin5;

    public ModelPikaia() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailslope2 = new AdvancedModelRenderer(this, 30, 62);
        this.Tailslope2.setRotationPoint(0.009999999776482582F, -2.9000000953674316F, 0.20000000298023224F);
        this.Tailslope2.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Tailslope2, -0.23352505591421208F, 0.0F, 0.0F);
        this.Rightfrond2 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond2.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -4.199999809265137F);
        this.Rightfrond2.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond2, -0.23352505591421208F, -0.08482300397719036F, -0.67928211291826F);
        this.Backslope1 = new AdvancedModelRenderer(this, 0, 21);
        this.Backslope1.setRotationPoint(0.009999999776482582F, -1.7000000476837158F, -0.4000000059604645F);
        this.Backslope1.addBox(-0.5F, -0.5F, -4.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Backslope1, 0.42446406875869874F, 0.0F, 0.0F);
        this.Leftfrond2 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond2.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -4.199999809265137F);
        this.Leftfrond2.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond2, -0.23352505591421208F, 0.08482300397719036F, 0.67928211291826F);
        this.Leftfrond3 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond3.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -3.700000047683716F);
        this.Leftfrond3.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond3, -0.12740903872453743F, 0.06370451936226872F, 0.6155776351678833F);
        this.Fin3 = new AdvancedModelRenderer(this, 18, 3);
        this.Fin3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Fin3.addBox(0.0F, 0.0F, 0.0F, 0, 3, 13, 0.0F);
        this.Fin4 = new AdvancedModelRenderer(this, 64, 10);
        this.Fin4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Fin4.addBox(0.0F, 0.0F, 0.0F, 0, 3, 12, 0.0F);
        this.Backslope2 = new AdvancedModelRenderer(this, 19, 57);
        this.Backslope2.setRotationPoint(0.0F, -3.680000066757202F, -0.30000001192092896F);
        this.Backslope2.addBox(-0.5F, 0.0F, -8.0F, 1, 4, 8, 0.0F);
        this.setRotateAngle(Backslope2, 0.34487706418882114F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 0, 21);
        this.Tailmiddle.setRotationPoint(0.009999999776482582F, 0.30000001192092896F, 12.5F);
        this.Tailmiddle.addBox(-1.0F, -2.0F, 0.0F, 2, 6, 12, 0.0F);
        this.Leftfrond1 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond1.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -4.699999809265137F);
        this.Leftfrond1.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond1, -0.2972295835988592F, 0.2546435405291338F, 0.67928211291826F);
        this.Leftfrond8 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond8.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -1.2000000476837158F);
        this.Leftfrond8.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond8, -0.04241150198859518F, -0.1485275233394591F, 0.2546435405291338F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 79);
        this.Tailbase.setRotationPoint(-0.009999999776482582F, 0.0F, 10.5F);
        this.Tailbase.addBox(-1.0F, -3.5F, 0.0F, 2, 8, 13, 0.0F);
        this.setRotateAngle(Tailbase, -0.021293017373673524F, 0.0F, 0.0F);
        this.Fin2 = new AdvancedModelRenderer(this, 50, 1);
        this.Fin2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Fin2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 11, 0.0F);
        this.Leftfrond7 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond7.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -1.7000000476837158F);
        this.Leftfrond7.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond7, -0.04241150198859518F, -0.08482300397719036F, 0.31834805156902407F);
        this.Rightfrond5 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond5.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -2.700000047683716F);
        this.Rightfrond5.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond5, -0.04241150198859518F, 0.0F, -0.4881685797985891F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 13);
        this.Bodyfront.setRotationPoint(0.0F, 1.5F, -7.5F);
        this.Bodyfront.addBox(-0.5F, -0.5F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Bodyfront, -0.169820528229565F, 0.0F, 0.0F);
        this.Tailslope1 = new AdvancedModelRenderer(this, 17, 34);
        this.Tailslope1.setRotationPoint(0.0F, -3.799999952316284F, 0.0F);
        this.Tailslope1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 12, 0.0F);
        this.setRotateAngle(Tailslope1, -0.1485275233394591F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 31, 84);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Bodymiddle.addBox(-1.5F, -3.0F, -9.0F, 3, 7, 9, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.04241150082346221F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 17, 20);
        this.Tailend.setRotationPoint(-0.009999999776482582F, 0.8999999761581421F, 11.5F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 4, 8, 0.0F);
        this.setRotateAngle(Tailend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Bodymiddlefront = new AdvancedModelRenderer(this, 19, 79);
        this.Bodymiddlefront.setRotationPoint(0.0F, 0.8999999761581421F, -8.5F);
        this.Bodymiddlefront.addBox(-1.0F, -1.0F, -8.0F, 2, 4, 8, 0.0F);
        this.setRotateAngle(Bodymiddlefront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Rightfrond8 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond8.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -1.2000000476837158F);
        this.Rightfrond8.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond8, -0.04241150198859518F, 0.1485275233394591F, -0.2546435405291338F);
        this.Rightfrond9 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond9.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -0.699999988079071F);
        this.Rightfrond9.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond9, -0.04241150198859518F, 0.21223203437934937F, -0.169820528229565F);
        this.Head = new AdvancedModelRenderer(this, 35, 11);
        this.Head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Head, 0.2546435405291338F, 0.0F, 0.0F);
        this.Rightfrond3 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond3.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -3.700000047683716F);
        this.Rightfrond3.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond3, -0.12740903872453743F, -0.06370451936226872F, -0.6155776351678833F);
        this.Leftfrond9 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond9.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -0.699999988079071F);
        this.Leftfrond9.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond9, -0.04241150198859518F, -0.21223203437934937F, 0.169820528229565F);
        this.Leftfrond5 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond5.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -2.700000047683716F);
        this.Leftfrond5.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond5, -0.04241150198859518F, 0.0F, 0.4881685797985891F);
        this.Rightfrond1 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond1.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -4.699999809265137F);
        this.Rightfrond1.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond1, -0.2972295835988592F, -0.2546435405291338F, -0.67928211291826F);
        this.Rightfrond7 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond7.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -1.7000000476837158F);
        this.Rightfrond7.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond7, -0.04241150198859518F, 0.08482300397719036F, -0.31834805156902407F);
        this.Rightfrond6 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond6.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -2.200000047683716F);
        this.Rightfrond6.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond6, -0.04241150198859518F, 0.04241150198859518F, -0.40334560078853393F);
        this.Bodyback = new AdvancedModelRenderer(this, 0, 59);
        this.Bodyback.setRotationPoint(0.009999999776482582F, 0.0F, 9.5F);
        this.Bodyback.addBox(-1.5F, -3.5F, 0.0F, 3, 8, 11, 0.0F);
        this.setRotateAngle(Bodyback, -0.021293017373673524F, 0.0F, 0.0F);
        this.Rightfrond4 = new AdvancedModelRenderer(this, 0, 2);
        this.Rightfrond4.setRotationPoint(-0.4000000059604645F, 1.2000000476837158F, -3.200000047683716F);
        this.Rightfrond4.addBox(-2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Rightfrond4, -0.12740903872453743F, 0.0F, -0.5731661290180989F);
        this.Backslope3 = new AdvancedModelRenderer(this, 30, 50);
        this.Backslope3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Backslope3.addBox(-1.0F, 0.0F, -9.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(Backslope3, 0.11135200827460905F, 0.0F, 0.0F);
        this.Bodymiddleback = new AdvancedModelRenderer(this, 0, 40);
        this.Bodymiddleback.setRotationPoint(-0.009999999776482582F, -0.5F, -0.5F);
        this.Bodymiddleback.addBox(-1.5F, -3.5F, 0.0F, 3, 8, 10, 0.0F);
        this.setRotateAngle(Bodymiddleback, 0.021293017373673524F, 0.0F, 0.0F);
        this.Leftfrond4 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond4.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -3.200000047683716F);
        this.Leftfrond4.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond4, -0.12740903872453743F, 0.0F, 0.5731661290180989F);
        this.Leftantenna = new AdvancedModelRenderer(this, 28, 0);
        this.Leftantenna.setRotationPoint(0.5F, 0.6000000238418579F, -0.800000011920929F);
        this.Leftantenna.addBox(-0.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F);
        this.setRotateAngle(Leftantenna, -0.4881685797985891F, -0.40334560078853393F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 25, 3);
        this.Neck.setRotationPoint(0.009999999776482582F, -0.5F, -5.0F);
        this.Neck.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Neck, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightantenna = new AdvancedModelRenderer(this, 36, 0);
        this.Rightantenna.setRotationPoint(-0.5F, 0.6000000238418579F, -0.800000011920929F);
        this.Rightantenna.addBox(-1.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F);
        this.setRotateAngle(Rightantenna, -0.4881685797985891F, 0.40334560078853393F, 0.0F);
        this.Fin1 = new AdvancedModelRenderer(this, 38, 14);
        this.Fin1.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Fin1.addBox(0.0F, -1.0F, 0.0F, 0, 1, 10, 0.0F);
        this.setRotateAngle(Fin1, -0.08482300397719036F, 0.0F, 0.0F);
        this.Leftfrond6 = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfrond6.setRotationPoint(0.4000000059604645F, 1.2000000476837158F, -2.200000047683716F);
        this.Leftfrond6.addBox(0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F);
        this.setRotateAngle(Leftfrond6, -0.04241150198859518F, -0.04241150198859518F, 0.40334560078853393F);
        this.Fin5 = new AdvancedModelRenderer(this, 53, 23);
        this.Fin5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Fin5.addBox(0.0F, 0.0F, 0.0F, 0, 3, 8, 0.0F);
        this.setRotateAngle(Fin5, 0.12740903872453743F, 0.0F, 0.0F);
        this.Tailend.addChild(this.Tailslope2);
        this.Bodyfront.addChild(this.Rightfrond2);
        this.Bodyfront.addChild(this.Backslope1);
        this.Bodyfront.addChild(this.Leftfrond2);
        this.Bodyfront.addChild(this.Leftfrond3);
        this.Tailbase.addChild(this.Fin3);
        this.Tailmiddle.addChild(this.Fin4);
        this.Bodymiddlefront.addChild(this.Backslope2);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Bodyfront.addChild(this.Leftfrond1);
        this.Bodyfront.addChild(this.Leftfrond8);
        this.Bodyback.addChild(this.Tailbase);
        this.Bodyback.addChild(this.Fin2);
        this.Bodyfront.addChild(this.Leftfrond7);
        this.Bodyfront.addChild(this.Rightfrond5);
        this.Bodymiddlefront.addChild(this.Bodyfront);
        this.Tailmiddle.addChild(this.Tailslope1);
        this.Tailmiddle.addChild(this.Tailend);
        this.Bodymiddle.addChild(this.Bodymiddlefront);
        this.Bodyfront.addChild(this.Rightfrond8);
        this.Bodyfront.addChild(this.Rightfrond9);
        this.Neck.addChild(this.Head);
        this.Bodyfront.addChild(this.Rightfrond3);
        this.Bodyfront.addChild(this.Leftfrond9);
        this.Bodyfront.addChild(this.Leftfrond5);
        this.Bodyfront.addChild(this.Rightfrond1);
        this.Bodyfront.addChild(this.Rightfrond7);
        this.Bodyfront.addChild(this.Rightfrond6);
        this.Bodymiddleback.addChild(this.Bodyback);
        this.Bodyfront.addChild(this.Rightfrond4);
        this.Bodymiddle.addChild(this.Backslope3);
        this.Bodymiddle.addChild(this.Bodymiddleback);
        this.Bodyfront.addChild(this.Leftfrond4);
        this.Head.addChild(this.Leftantenna);
        this.Bodyfront.addChild(this.Neck);
        this.Head.addChild(this.Rightantenna);
        this.Bodymiddleback.addChild(this.Fin1);
        this.Bodyfront.addChild(this.Leftfrond6);
        this.Tailend.addChild(this.Fin5);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodymiddle.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.Bodymiddle.render(0.01F);
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
        this.Bodymiddle.offsetY = 0.5F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodymiddleback, this.Bodyback, this.Tailbase, this.Tailmiddle, this.Tailend};
        float speed = 0.525F;
        if (!e.isInWater()) {
            speed = 0.85F;
        }

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.32F * feedModifier;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.155F, -1.2, f2, 0.8F);
            this.swing(Bodymiddle, speed, 0.22F, true, 0, 0, f2, 1);

            this.flap(Leftfrond9, 0.4F, -degreeFin, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond9, 0.4F, degreeFin, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond8, 0.4F, -degreeFin, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond8, 0.4F, degreeFin, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond7, 0.4F, -degreeFin, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond7, 0.4F, degreeFin, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond6, 0.4F, -degreeFin, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond6, 0.4F, degreeFin, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond5, 0.4F, -degreeFin, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond5, 0.4F, degreeFin, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond4, 0.4F, -degreeFin, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond4, 0.4F, degreeFin, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond3, 0.4F, -degreeFin, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond3, 0.4F, degreeFin, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond2, 0.4F, -degreeFin, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond2, 0.4F, degreeFin, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(Leftfrond1, 0.4F, -degreeFin, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(Rightfrond1, 0.4F, degreeFin, false, 4.5F, 0.5F, f2, 0.7F);

            this.swing(Leftantenna, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(Rightantenna, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

            if (!e.isInWater()) {
                this.Bodymiddle.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodymiddle.offsetY = 1.30F - 1.45F;
                this.bob(Bodymiddle, -speed, 2F, false, f2, 1);
            }
        }
    }
}
