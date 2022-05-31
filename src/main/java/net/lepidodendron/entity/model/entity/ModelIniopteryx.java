package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIniopteryx extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Backslopefront;
    public AdvancedModelRenderer Bellyslopefront;
    public AdvancedModelRenderer Leftpectoralfinbase;
    public AdvancedModelRenderer Rightpectoralfinbase;
    public AdvancedModelRenderer Eyes;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Eyeslope;
    public AdvancedModelRenderer Snoutslope;
    public AdvancedModelRenderer Upperjaw;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Backslopemiddle;
    public AdvancedModelRenderer Leftpelvicfinbase;
    public AdvancedModelRenderer Rightpelvicfinbase;
    public AdvancedModelRenderer Leftclasper;
    public AdvancedModelRenderer Rightclasper;
    public AdvancedModelRenderer Tailstart;
    public AdvancedModelRenderer Backslopeend;
    public AdvancedModelRenderer Bellyslopeend;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailslopetop;
    public AdvancedModelRenderer Tailunderside;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;

    public ModelIniopteryx() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 62);
        this.Bodymiddle.setRotationPoint(0.0F, -0.25F, 3.200000047683716F);
        this.Bodymiddle.addBox(-2.5F, -1.5F, 0.0F, 5, 9, 9, 0.0F);
        this.Tailstart = new AdvancedModelRenderer(this, 0, 38);
        this.Tailstart.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tailstart.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 8, 0.0F);
        this.Backslopeend = new AdvancedModelRenderer(this, 31, 26);
        this.Backslopeend.setRotationPoint(0.009999999776482582F, -4.699999809265137F, 0.5F);
        this.Backslopeend.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(Backslopeend, -0.38205256260891435F, 0.0F, 0.0F);
        this.Rightpectoralfinbase = new AdvancedModelRenderer(this, 42, 41);
        this.Rightpectoralfinbase.setRotationPoint(-2.299999952316284F, -0.10000000149011612F, -6.0F);
        this.Rightpectoralfinbase.addBox(-0.5F, -8.0F, -1.0F, 1, 8, 4, 0.0F);
        this.setRotateAngle(Rightpectoralfinbase, -0.7641051252178287F, -0.04241150198859518F, -0.9976301977767977F);
        this.Eyes = new AdvancedModelRenderer(this, 24, 81);
        this.Eyes.setRotationPoint(0.0F, -0.6000000238418579F, -4.0F);
        this.Eyes.addBox(-3.0F, 0.0F, -2.0F, 6, 5, 2, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 26, 17);
        this.Leftpelvicfin.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, -2.0F, 0, 5, 4, 0.0F);
        this.Eyeslope = new AdvancedModelRenderer(this, 37, 59);
        this.Eyeslope.setRotationPoint(0.0F, -0.75F, -0.05000000074505806F);
        this.Eyeslope.addBox(-2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F);
        this.setRotateAngle(Eyeslope, 0.38205256260891435F, 0.0F, 0.0F);
        this.Dorsalfin = new AdvancedModelRenderer(this, 55, 53);
        this.Dorsalfin.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Dorsalfin.addBox(0.0F, -4.0F, 0.0F, 0, 5, 6, 0.0F);
        this.setRotateAngle(Dorsalfin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 20, 65);
        this.Headslope.setRotationPoint(0.009999999776482582F, -1.600000023841858F, -0.10000000149011612F);
        this.Headslope.addBox(-3.0F, 0.0F, -4.0F, 6, 1, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftpelvicfinbase = new AdvancedModelRenderer(this, 22, 27);
        this.Leftpelvicfinbase.setRotationPoint(1.7000000476837158F, 5.5F, 7.0F);
        this.Leftpelvicfinbase.addBox(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Leftpelvicfinbase, 0.8491027077268521F, 0.1911135497644277F, -0.5518731241279929F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 52, 27);
        this.Rightpectoralfin.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.Rightpectoralfin.addBox(0.0F, -12.5F, -3.5F, 0, 12, 7, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.169820528229565F, -0.04241150198859518F);
        this.Leftpectoralfinbase = new AdvancedModelRenderer(this, 31, 41);
        this.Leftpectoralfinbase.setRotationPoint(2.299999952316284F, -0.10000000149011612F, -6.0F);
        this.Leftpectoralfinbase.addBox(-0.5F, -8.0F, -1.0F, 1, 8, 4, 0.0F);
        this.setRotateAngle(Leftpectoralfinbase, -0.7641051252178287F, 0.04241150198859518F, 0.9976301977767977F);
        this.Upperjaw = new AdvancedModelRenderer(this, 29, 71);
        this.Upperjaw.setRotationPoint(0.009999999776482582F, 5.0F, -2.109999895095825F);
        this.Upperjaw.addBox(-2.5F, -1.0F, -2.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(Upperjaw, -0.21223203437934937F, 0.0F, 0.0F);
        this.Snoutslope = new AdvancedModelRenderer(this, 40, 78);
        this.Snoutslope.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Snoutslope.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Snoutslope, -0.7005751510978795F, 0.0F, 0.0F);
        this.Backslopefront = new AdvancedModelRenderer(this, 54, 81);
        this.Backslopefront.setRotationPoint(0.009999999776482582F, -2.5F, 4.0F);
        this.Backslopefront.addBox(-2.5F, 0.0F, -8.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(Backslopefront, 0.12740903872453743F, 0.0F, 0.0F);
        this.Rightpelvicfinbase = new AdvancedModelRenderer(this, 13, 27);
        this.Rightpelvicfinbase.setRotationPoint(-1.7000000476837158F, 5.5F, 7.0F);
        this.Rightpelvicfinbase.addBox(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Rightpelvicfinbase, 0.8491027077268521F, -0.1911135497644277F, 0.5518731241279929F);
        this.Backslopemiddle = new AdvancedModelRenderer(this, 51, 69);
        this.Backslopemiddle.setRotationPoint(0.0F, -2.200000047683716F, 0.0F);
        this.Backslopemiddle.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailslopetop = new AdvancedModelRenderer(this, 15, 37);
        this.Tailslopetop.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.Tailslopetop.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Tailslopetop, -0.169820528229565F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 41, 64);
        this.Lowerjaw.setRotationPoint(0.0F, 4.900000095367432F, -3.0F);
        this.Lowerjaw.addBox(-2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.1911135497644277F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 17, 17);
        this.Rightpelvicfin.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Rightpelvicfin.addBox(0.0F, 0.0F, -2.0F, 0, 5, 4, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 41, 84);
        this.Snout.setRotationPoint(0.0F, 2.299999952316284F, -2.0F);
        this.Snout.addBox(-2.5F, 0.0F, -2.0F, 5, 2, 2, 0.0F);
        this.Tailunderside = new AdvancedModelRenderer(this, 0, 20);
        this.Tailunderside.setRotationPoint(0.0F, 2.5F, 0.30000001192092896F);
        this.Tailunderside.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tailunderside, 0.08482300397719036F, 0.0F, 0.0F);
        this.Bellyslopefront = new AdvancedModelRenderer(this, 20, 57);
        this.Bellyslopefront.setRotationPoint(0.009999999776482582F, 7.300000190734863F, 3.9000000953674316F);
        this.Bellyslopefront.addBox(-2.5F, -1.0F, -6.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(Bellyslopefront, -0.13613568498450906F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 81);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-3.0F, -1.5F, -7.0F, 6, 8, 11, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 53, 39);
        this.Leftpectoralfin.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.Leftpectoralfin.addBox(0.0F, -12.0F, -3.5F, 0, 12, 7, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, -0.169820528229565F, 0.04241150198859518F);
        this.Tailfin = new AdvancedModelRenderer(this, 0, 2);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailfin.addBox(0.0F, -3.5F, 0.0F, 0, 8, 9, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 35, 89);
        this.Head.setRotationPoint(0.0F, 0.10000000149011612F, -6.5F);
        this.Head.addBox(-3.5F, -1.0F, -4.0F, 7, 7, 4, 0.0F);
        this.Rightclasper = new AdvancedModelRenderer(this, 26, 27);
        this.Rightclasper.setRotationPoint(-2.0F, 6.5F, 8.5F);
        this.Rightclasper.addBox(0.0F, -0.5F, 0.0F, 0, 1, 10, 0.0F);
        this.setRotateAngle(Rightclasper, -0.169820528229565F, -0.06370451936226872F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 50);
        this.Bodyend.setRotationPoint(0.0F, 3.0F, 8.0F);
        this.Bodyend.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 7, 0.0F);
        this.Bellyslopeend = new AdvancedModelRenderer(this, 16, 47);
        this.Bellyslopeend.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Bellyslopeend.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotateAngle(Bellyslopeend, 0.2972295835988592F, 0.0F, 0.0F);
        this.Leftclasper = new AdvancedModelRenderer(this, 26, 29);
        this.Leftclasper.setRotationPoint(2.0F, 6.5F, 8.5F);
        this.Leftclasper.addBox(0.0F, -0.5F, 0.0F, 0, 1, 10, 0.0F);
        this.setRotateAngle(Leftclasper, -0.169820528229565F, 0.06370451936226872F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 28);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.Tailend.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Bodyend.addChild(this.Tailstart);
        this.Bodyend.addChild(this.Backslopeend);
        this.Bodyfront.addChild(this.Rightpectoralfinbase);
        this.Head.addChild(this.Eyes);
        this.Leftpelvicfinbase.addChild(this.Leftpelvicfin);
        this.Eyes.addChild(this.Eyeslope);
        this.Backslopemiddle.addChild(this.Dorsalfin);
        this.Head.addChild(this.Headslope);
        this.Bodymiddle.addChild(this.Leftpelvicfinbase);
        this.Rightpectoralfinbase.addChild(this.Rightpectoralfin);
        this.Bodyfront.addChild(this.Leftpectoralfinbase);
        this.Eyes.addChild(this.Upperjaw);
        this.Eyes.addChild(this.Snoutslope);
        this.Bodyfront.addChild(this.Backslopefront);
        this.Bodymiddle.addChild(this.Rightpelvicfinbase);
        this.Bodymiddle.addChild(this.Backslopemiddle);
        this.Tailstart.addChild(this.Tailslopetop);
        this.Head.addChild(this.Lowerjaw);
        this.Rightpelvicfinbase.addChild(this.Rightpelvicfin);
        this.Eyes.addChild(this.Snout);
        this.Tailstart.addChild(this.Tailunderside);
        this.Bodyfront.addChild(this.Bellyslopefront);
        this.Leftpectoralfinbase.addChild(this.Leftpectoralfin);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Head);
        this.Bodymiddle.addChild(this.Rightclasper);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Bodyend.addChild(this.Bellyslopeend);
        this.Bodymiddle.addChild(this.Leftclasper);
        this.Tailstart.addChild(this.Tailend);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.2F);
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
        this.Bodyfront.offsetY = 1.1F;

        AdvancedModelRenderer[] finLeft = {this.Leftpectoralfinbase, this.Leftpectoralfin};
        AdvancedModelRenderer[] finRight = {this.Rightpectoralfinbase, this.Rightpectoralfin};
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailstart, this.Tailend};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            }

            this.walk(Lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.25F;
                this.bob(Bodyfront, -speed, 5F, false, f2, 1);
            }
        }
    }
}
