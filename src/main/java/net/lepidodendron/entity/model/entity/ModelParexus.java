package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParexus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyfrontslope;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Leftpectoralspinebase;
    public AdvancedModelRenderer Rightpectoralspinebase;
    public AdvancedModelRenderer Bigdorsalspinebase;
    public AdvancedModelRenderer Bigdorsalspineend;
    public AdvancedModelRenderer Dorsalspineserrations;
    public AdvancedModelRenderer Headfront;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Nose;
    public AdvancedModelRenderer Upperjaw;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Firstdorsalfin;
    public AdvancedModelRenderer Bellyspines;
    public AdvancedModelRenderer Bodyendslope;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Tailbaseslope;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Seconddorsalfin;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Leftpectoralspineend;
    public AdvancedModelRenderer Rightpectoralspineend;

    public ModelParexus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftpectoralspineend = new AdvancedModelRenderer(this, 85, 3);
        this.Leftpectoralspineend.setRotationPoint(5.0F, 0.0F, 0.10000000149011612F);
        this.Leftpectoralspineend.addBox(0.0F, -0.5F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Leftpectoralspineend, 0.0F, -0.1911135497644277F, 0.0F);
        this.Bigdorsalspineend = new AdvancedModelRenderer(this, 62, 34);
        this.Bigdorsalspineend.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Bigdorsalspineend.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 13, 0.0F);
        this.setRotateAngle(Bigdorsalspineend, -0.1485275233394591F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 49, 63);
        this.Lowerjaw.setRotationPoint(-0.01F, 4.1F, -1.5F);
        this.Lowerjaw.addBox(-2.5F, -1.0F, -8.0F, 5, 2, 8, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2553564018453205F, 0.0F, 0.0F);
        this.Bodyfrontslope = new AdvancedModelRenderer(this, 31, 85);
        this.Bodyfrontslope.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.Bodyfrontslope.addBox(-2.5F, 0.0F, -9.0F, 5, 6, 9, 0.0F);
        this.setRotateAngle(Bodyfrontslope, 0.3043854308688749F, 0.0F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 44);
        this.Bodyend.setRotationPoint(0.0F, 2.9000000953674316F, 6.0F);
        this.Bodyend.addBox(-2.0F, -2.0F, 0.0F, 4, 8, 9, 0.0F);
        this.setRotateAngle(Bodyend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 60, 87);
        this.Head.setRotationPoint(0.009999999776482582F, 1.899999976158142F, -9.100000381469727F);
        this.Head.addBox(-3.5F, -2.0F, -5.0F, 7, 7, 6, 0.0F);
        this.setRotateAngle(Head, -0.021293017373673524F, 0.0F, 0.0F);
        this.Headfront = new AdvancedModelRenderer(this, 51, 74);
        this.Headfront.setRotationPoint(0.009999999776482582F, -3.4000000953674316F, -5.0F);
        this.Headfront.addBox(-3.0F, 0.0F, -7.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(Headfront, 0.4457571069383183F, 0.0F, 0.0F);
        this.Seconddorsalfin = new AdvancedModelRenderer(this, 67, 0);
        this.Seconddorsalfin.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Seconddorsalfin.addBox(0.0F, 0.0F, 0.0F, 0, 9, 10, 0.0F);
        this.setRotateAngle(Seconddorsalfin, 0.9976301977767977F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 60, 0);
        this.Tailfin.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Tailfin.addBox(0.0F, 0.0F, 0.0F, 0, 13, 20, 0.0F);
        this.setRotateAngle(Tailfin, -0.12217304763960307F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 83);
        this.Bodyfront.setRotationPoint(0.0F, 11.0F, -6.0F);
        this.Bodyfront.addBox(-3.0F, -1.0F, -9.0F, 6, 8, 9, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 52, 0);
        this.Leftpelvicfin.setRotationPoint(0.5F, 6.0F, 4.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.40334560078853393F, 0.0F, -0.6155776351678833F);
        this.Rightpectoralspinebase = new AdvancedModelRenderer(this, 70, 5);
        this.Rightpectoralspinebase.setRotationPoint(-2.5F, 5.400000095367432F, -8.0F);
        this.Rightpectoralspinebase.addBox(-5.0F, -1.0F, 0.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(Rightpectoralspinebase, 0.0F, 0.5518731241279929F, -0.5307546228683145F);
        this.Bigdorsalspinebase = new AdvancedModelRenderer(this, 40, 28);
        this.Bigdorsalspinebase.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Bigdorsalspinebase.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 15, 0.0F);
        this.setRotateAngle(Bigdorsalspinebase, 0.33964105645913F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRenderer(this, 81, 82);
        this.Nose.setRotationPoint(0.0F, 0.0F, -6.599999904632568F);
        this.Nose.addBox(-2.5F, 0.0F, -2.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(Nose, 0.2546435405291338F, 0.0F, 0.0F);
        this.Bellyspines = new AdvancedModelRenderer(this, 37, 15);
        this.Bellyspines.setRotationPoint(0.0F, 8.5F, -0.800000011920929F);
        this.Bellyspines.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(Bellyspines, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjaw = new AdvancedModelRenderer(this, 71, 74);
        this.Upperjaw.setRotationPoint(0.009999999776482582F, 4.699999809265137F, -7.0F);
        this.Upperjaw.addBox(-3.0F, -1.0F, 0.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Upperjaw, -0.27593656206399647F, 0.0F, 0.0F);
        this.Tailbaseslope = new AdvancedModelRenderer(this, 23, 28);
        this.Tailbaseslope.setRotationPoint(0.0F, -7.699999809265137F, 0.6000000238418579F);
        this.Tailbaseslope.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 9, 0.0F);
        this.setRotateAngle(Tailbaseslope, -0.390779208868886F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 30, 70);
        this.Headslope.setRotationPoint(0.0F, -5.349999904632568F, 0.4000000059604645F);
        this.Headslope.addBox(-3.0F, 0.0F, -6.0F, 6, 4, 6, 0.0F);
        this.setRotateAngle(Headslope, 0.3483677027191016F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 62);
        this.Bodymiddle.setRotationPoint(-0.009999999776482582F, -1.899999976158142F, -1.0F);
        this.Bodymiddle.addBox(-2.5F, -4.0F, 0.0F, 5, 13, 7, 0.0F);
        this.Rightpectoralspineend = new AdvancedModelRenderer(this, 85, 0);
        this.Rightpectoralspineend.setRotationPoint(-5.0F, 0.0F, 0.10000000149011612F);
        this.Rightpectoralspineend.addBox(-6.0F, -0.5F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Rightpectoralspineend, 0.0F, 0.1911135497644277F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 37, 0);
        this.Rightpelvicfin.setRotationPoint(-0.5F, 6.0F, 4.0F);
        this.Rightpelvicfin.addBox(0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.40334560078853393F, 0.0F, 0.6155776351678833F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 0, 17);
        this.Tailmiddle.setRotationPoint(0.009999999776482582F, -2.4000000953674316F, 7.5F);
        this.Tailmiddle.addBox(-1.0F, -2.0F, 0.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(Tailmiddle, -0.12740903872453743F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 68, 50);
        this.Tailend.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 15, 0.0F);
        this.setRotateAngle(Tailend, 0.169820528229565F, 0.0F, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 88, 0);
        this.Analfin.setRotationPoint(0.0F, 3.0F, 3.5F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F);
        this.setRotateAngle(Analfin, 0.42446406875869874F, 0.0F, 0.0F);
        this.Firstdorsalfin = new AdvancedModelRenderer(this, 84, 26);
        this.Firstdorsalfin.setRotationPoint(0.0F, -4.5F, 2.0F);
        this.Firstdorsalfin.addBox(0.0F, -8.0F, 0.0F, 0, 9, 8, 0.0F);
        this.setRotateAngle(Firstdorsalfin, -0.8915142138766367F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 29);
        this.Tailbase.setRotationPoint(0.0F, 3.0F, 8.0F);
        this.Tailbase.addBox(-1.5F, -3.0F, 0.0F, 3, 6, 8, 0.0F);
        this.setRotateAngle(Tailbase, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftpectoralspinebase = new AdvancedModelRenderer(this, 70, 0);
        this.Leftpectoralspinebase.setRotationPoint(2.5F, 5.400000095367432F, -8.0F);
        this.Leftpectoralspinebase.addBox(0.0F, -1.0F, 0.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(Leftpectoralspinebase, 0.0F, -0.5518731241279929F, 0.5307546228683145F);
        this.Dorsalspineserrations = new AdvancedModelRenderer(this, 78, 33);
        this.Dorsalspineserrations.setRotationPoint(0.0F, 1.7000000476837158F, 0.699999988079071F);
        this.Dorsalspineserrations.addBox(0.0F, 0.0F, 0.0F, 0, 1, 11, 0.0F);
        this.setRotateAngle(Dorsalspineserrations, 0.04241150198859518F, 0.0F, 0.0F);
        this.Bodyendslope = new AdvancedModelRenderer(this, 27, 47);
        this.Bodyendslope.setRotationPoint(0.0F, -6.900000095367432F, 0.5F);
        this.Bodyendslope.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 9, 0.0F);
        this.setRotateAngle(Bodyendslope, -0.27593656206399647F, 0.0F, 0.0F);
        this.Leftpectoralspinebase.addChild(this.Leftpectoralspineend);
        this.Bigdorsalspinebase.addChild(this.Bigdorsalspineend);
        this.Head.addChild(this.Lowerjaw);
        this.Bodyfront.addChild(this.Bodyfrontslope);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Bodyfront.addChild(this.Head);
        this.Head.addChild(this.Headfront);
        this.Tailbaseslope.addChild(this.Seconddorsalfin);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyend.addChild(this.Leftpelvicfin);
        this.Bodyfront.addChild(this.Rightpectoralspinebase);
        this.Bodyfrontslope.addChild(this.Bigdorsalspinebase);
        this.Headfront.addChild(this.Nose);
        this.Bodymiddle.addChild(this.Bellyspines);
        this.Headfront.addChild(this.Upperjaw);
        this.Tailbase.addChild(this.Tailbaseslope);
        this.Head.addChild(this.Headslope);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Rightpectoralspinebase.addChild(this.Rightpectoralspineend);
        this.Bodyend.addChild(this.Rightpelvicfin);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Tailmiddle.addChild(this.Tailend);
        this.Tailbase.addChild(this.Analfin);
        this.Bodymiddle.addChild(this.Firstdorsalfin);
        this.Bodyend.addChild(this.Tailbase);
        this.Bodyfront.addChild(this.Leftpectoralspinebase);
        this.Bigdorsalspineend.addChild(this.Dorsalspineserrations);
        this.Bodyend.addChild(this.Bodyendslope);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.155F);
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
        this.Bodyfront.offsetY = 1.3F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tailbase, this.Tailmiddle, this.Tailend};
        float speed = 0.42F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.45F, -2, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralspinebase, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralspinebase, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralspinebase, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralspinebase, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralspineend, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralspineend, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.25F;
                this.bob(Bodyfront, -speed, 5F, false, f2, 1);
            }
        }
    }
}
