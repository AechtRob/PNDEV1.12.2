package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPlatysomus extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer Headbase;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Backslope;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Headfront;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Faceslope;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Mouthslope;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Uppertailslope;
    public AdvancedModelRenderer Underslope;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Dorsalfinback;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Dorsalfinfront;

    public ModelPlatysomus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Analfin = new AdvancedModelRenderer(this, 9, 7);
        this.Analfin.setRotationPoint(-0.009999999776482582F, 0.0F, 1.0F);
        this.Analfin.addBox(0.0F, -9.0F, 0.0F, 0, 9, 4, 0.0F);
        this.setRotateAngle(Analfin, 0.10611601718967469F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 40, 63);
        this.Headslope.setRotationPoint(0.009999999776482582F, -1.0F, -2.5F);
        this.Headslope.addBox(-2.5F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.6579891413176677F, 0.0F, 0.0F);
        this.Faceslope = new AdvancedModelRenderer(this, 35, 54);
        this.Faceslope.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.Faceslope.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(Faceslope, -0.5728170551782168F, 0.0F, 0.0F);
        this.Uppertailslope = new AdvancedModelRenderer(this, 19, 40);
        this.Uppertailslope.setRotationPoint(0.009999999776482582F, -5.199999809265137F, 0.6000000238418579F);
        this.Uppertailslope.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Uppertailslope, -0.8278096695472326F, 0.0F, 0.0F);
        this.Dorsalfinback = new AdvancedModelRenderer(this, 0, 14);
        this.Dorsalfinback.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Dorsalfinback.addBox(0.0F, -3.0F, -1.0F, 0, 3, 7, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 71);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-2.5F, -3.0F, -5.0F, 5, 16, 13, 0.0F);
        this.setRotateAngle(Body, -0.10611601852125524F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 18, 1);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 2.299999952316284F);
        this.Tailfin.addBox(0.0F, -7.5F, 0.0F, 0, 15, 10, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 0, 0);
        this.Rightpelvicfin.setRotationPoint(-2.5F, 12.5F, 5.0F);
        this.Rightpelvicfin.addBox(0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(Rightpelvicfin, -0.33964105645913F, -0.23352505591421208F, 0.23352505591421208F);
        this.Dorsalfinfront = new AdvancedModelRenderer(this, 0, 8);
        this.Dorsalfinfront.setRotationPoint(0.0F, 3.0F, 11.0F);
        this.Dorsalfinfront.addBox(0.0F, -3.0F, 0.0F, 0, 7, 4, 0.0F);
        this.Underslope = new AdvancedModelRenderer(this, 20, 49);
        this.Underslope.setRotationPoint(0.009999999776482582F, 10.5F, 0.10000000149011612F);
        this.Underslope.addBox(-1.5F, -9.0F, -3.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(Underslope, -0.46705011182842415F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 41);
        this.Tailbase.setRotationPoint(0.0F, 2.0F, 7.0F);
        this.Tailbase.addBox(-1.5F, -1.5F, 0.0F, 3, 5, 5, 0.0F);
        this.Headbase = new AdvancedModelRenderer(this, 37, 82);
        this.Headbase.setRotationPoint(0.0F, 0.4000000059604645F, -5.599999904632568F);
        this.Headbase.addBox(-3.0F, -1.0F, -2.5F, 6, 13, 5, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 11, 1);
        this.Leftpectoralfin.setRotationPoint(2.5F, 12.199999809265137F, -4.5F);
        this.Leftpectoralfin.addBox(0.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(Leftpectoralfin, -0.46705011182842415F, 0.2972295835988592F, -0.06370451936226872F);
        this.Headfront = new AdvancedModelRenderer(this, 45, 71);
        this.Headfront.setRotationPoint(0.0F, 5.199999809265137F, -2.4000000953674316F);
        this.Headfront.addBox(-2.5F, -2.0F, -3.0F, 5, 7, 3, 0.0F);
        this.Backslope = new AdvancedModelRenderer(this, 0, 52);
        this.Backslope.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Backslope.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 11, 0.0F);
        this.setRotateAngle(Backslope, 0.5731661290180989F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 7, 0);
        this.Leftpelvicfin.setRotationPoint(2.5F, 12.5F, 5.0F);
        this.Leftpelvicfin.addBox(0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(Leftpelvicfin, -0.33964105645913F, 0.23352505591421208F, -0.23352505591421208F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 55, 60);
        this.Lowerjaw.setRotationPoint(0.0F, 11.0F, -1.5F);
        this.Lowerjaw.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.1911135497644277F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 32);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.Tailend.addBox(-1.0F, -1.5F, 0.0F, 2, 4, 4, 0.0F);
        this.setRotateAngle(Tailend, 0.10611601718967469F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 0, 1);
        this.Rightpectoralfin.setRotationPoint(-2.5F, 12.199999809265137F, -4.5F);
        this.Rightpectoralfin.addBox(0.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(Rightpectoralfin, -0.46705011182842415F, -0.2972295835988592F, 0.06370451936226872F);
        this.Mouthslope = new AdvancedModelRenderer(this, 26, 69);
        this.Mouthslope.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Mouthslope.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Mouthslope, -0.21223203437934937F, 0.0F, 0.0F);
        this.Underslope.addChild(this.Analfin);
        this.Headbase.addChild(this.Headslope);
        this.Headbase.addChild(this.Faceslope);
        this.Tailbase.addChild(this.Uppertailslope);
        this.Uppertailslope.addChild(this.Dorsalfinback);
        this.Tailend.addChild(this.Tailfin);
        this.Body.addChild(this.Rightpelvicfin);
        this.Backslope.addChild(this.Dorsalfinfront);
        this.Tailbase.addChild(this.Underslope);
        this.Body.addChild(this.Tailbase);
        this.Body.addChild(this.Headbase);
        this.Body.addChild(this.Leftpectoralfin);
        this.Headbase.addChild(this.Headfront);
        this.Body.addChild(this.Backslope);
        this.Body.addChild(this.Leftpelvicfin);
        this.Headbase.addChild(this.Lowerjaw);
        this.Tailbase.addChild(this.Tailend);
        this.Body.addChild(this.Rightpectoralfin);
        this.Headfront.addChild(this.Mouthslope);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.15F);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tailbase, this.Tailend, this.Tailfin};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

            this.swing(Analfin, (float) (speed * 0.75), 0.95F, true, 1.5F, 0, f2, 1);

            this.swing(Body, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = 1.4F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
