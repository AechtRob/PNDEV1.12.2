package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOnychodus extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Leftpectoralarm;
    public AdvancedModelRenderer Rightpectoralarm;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Back1;
    public AdvancedModelRenderer Belly1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Back2;
    public AdvancedModelRenderer Belly2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Back3;
    public AdvancedModelRenderer Belly3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tailfinstart;
    public AdvancedModelRenderer Tailfinend;
    public AdvancedModelRenderer Dorsalfinback;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Dorsalfinfront;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Upperjawback;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Lowerjawback;
    public AdvancedModelRenderer Leftmouthside;
    public AdvancedModelRenderer Rightmouthside;
    public AdvancedModelRenderer Upperjawfront;
    public AdvancedModelRenderer Upperteeth;
    public AdvancedModelRenderer Upperfrontteeth;
    public AdvancedModelRenderer Jawparting;
    public AdvancedModelRenderer Lowerjawmiddle;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Lowerteeth;
    public AdvancedModelRenderer Lowerfangsback;
    public AdvancedModelRenderer Lowerfangsfront;

    private ModelAnimator animator;

    public ModelOnychodus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Headslope = new AdvancedModelRenderer(this, 34, 39);
        this.Headslope.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Headslope.addBox(-3.0F, 0.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.13613568498450906F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 41);
        this.Tail1.setRotationPoint(0.0F, 0.5F, 7.300000190734863F);
        this.Tail1.addBox(-2.5F, -2.5F, 0.0F, 5, 8, 7, 0.0F);
        this.setRotateAngle(Tail1, -0.021293017373673524F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 51, 33);
        this.Rightpelvicfin.setRotationPoint(-1.7000000476837158F, 0.0F, 7.0F);
        this.Rightpelvicfin.addBox(-6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.4881685797985891F, -0.8066912015770679F);
        this.Lowerjawmiddle = new AdvancedModelRenderer(this, 59, 76);
        this.Lowerjawmiddle.setRotationPoint(-0.009999999776482582F, -1.0F, -7.800000190734863F);
        this.Lowerjawmiddle.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Lowerfangsfront = new AdvancedModelRenderer(this, 0, 0);
        this.Lowerfangsfront.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Lowerfangsfront.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Lowerfangsfront, 0.7429866572476639F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRenderer(this, 27, 53);
        this.Upperjawback.setRotationPoint(0.0F, -1.2999999523162842F, -4.900000095367432F);
        this.Upperjawback.addBox(-3.0F, 0.0F, -5.0F, 6, 4, 5, 0.0F);
        this.setRotateAngle(Upperjawback, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 40, 27);
        this.Leftpelvicfin.setRotationPoint(1.7000000476837158F, 0.0F, 7.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, -0.46705011182842415F, 0.8066912015770679F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 58, 82);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -2.799999952316284F);
        this.Lowerjawfront.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.10611601718967469F, 0.0F, 0.0F);
        this.Leftmouthside = new AdvancedModelRenderer(this, 52, 66);
        this.Leftmouthside.setRotationPoint(2.9000000953674316F, 0.699999988079071F, -4.300000190734863F);
        this.Leftmouthside.addBox(-4.0F, -0.5F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Leftmouthside, -0.23352505591421208F, 0.10611601718967469F, -0.021293017373673524F);
        this.Leftpectoralarm = new AdvancedModelRenderer(this, 45, 33);
        this.Leftpectoralarm.setRotationPoint(3.5F, 5.699999809265137F, -6.199999809265137F);
        this.Leftpectoralarm.addBox(0.0F, -1.5F, 0.0F, 4, 3, 1, 0.0F);
        this.setRotateAngle(Leftpectoralarm, -0.40334560078853393F, -0.5613347421062016F, 0.31834805156902407F);
        this.Rightmouthside = new AdvancedModelRenderer(this, 52, 57);
        this.Rightmouthside.setRotationPoint(-2.9000000953674316F, 0.699999988079071F, -4.300000190734863F);
        this.Rightmouthside.addBox(0.0F, -0.5F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Rightmouthside, -0.23352505591421208F, -0.10611601718967469F, 0.021293017373673524F);
        this.Analfin = new AdvancedModelRenderer(this, 74, 1);
        this.Analfin.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F);
        this.setRotateAngle(Analfin, 0.33964105645913F, 0.0F, 0.0F);
        this.Dorsalfinfront = new AdvancedModelRenderer(this, 65, 2);
        this.Dorsalfinfront.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Dorsalfinfront.addBox(0.0F, -5.0F, 0.0F, 0, 5, 4, 0.0F);
        this.setRotateAngle(Dorsalfinfront, -0.2972295835988592F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 0, 58);
        this.Body2.setRotationPoint(0.0F, 0.5F, 4.300000190734863F);
        this.Body2.addBox(-3.0F, -2.5F, 0.0F, 6, 9, 8, 0.0F);
        this.setRotateAngle(Body2, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 14, 26);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 6.199999809265137F);
        this.Tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 6, 8, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 69, 33);
        this.Rightpectoralfin.setRotationPoint(-0.699999988079071F, 0.699999988079071F, 0.20000000298023224F);
        this.Rightpectoralfin.addBox(-8.0F, -3.5F, 0.0F, 8, 5, 0, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.0F, 0.06370451936226872F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 67, 39);
        this.Leftpectoralfin.setRotationPoint(0.699999988079071F, 0.699999988079071F, 0.20000000298023224F);
        this.Leftpectoralfin.addBox(0.0F, -3.5F, 0.0F, 8, 5, 0, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, 0.0F, -0.06370451936226872F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 20);
        this.Tail3.setRotationPoint(0.0F, 0.5099999904632568F, 7.0F);
        this.Tail3.addBox(-1.5F, -2.5F, 0.0F, 3, 6, 7, 0.0F);
        this.Back3 = new AdvancedModelRenderer(this, 37, 6);
        this.Back3.setRotationPoint(0.0F, -3.200000047683716F, 0.0F);
        this.Back3.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
        this.setRotateAngle(Back3, -0.1485275233394591F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRenderer(this, 76, 76);
        this.Upperjawfront.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjawfront.addBox(-2.5F, 0.0F, -4.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerteeth = new AdvancedModelRenderer(this, 71, 84);
        this.Lowerteeth.setRotationPoint(0.0F, 0.5F, -2.4000000953674316F);
        this.Lowerteeth.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F);
        this.setRotateAngle(Lowerteeth, 0.12740903872453743F, 0.0F, 0.0F);
        this.Belly3 = new AdvancedModelRenderer(this, 36, 17);
        this.Belly3.setRotationPoint(0.0F, 5.099999904632568F, 0.0F);
        this.Belly3.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 8, 0.0F);
        this.setRotateAngle(Belly3, 0.1485275233394591F, 0.0F, 0.0F);
        this.Back1 = new AdvancedModelRenderer(this, 0, 0);
        this.Back1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Back1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(Back1, -0.04241150198859518F, 0.0F, 0.0F);
        this.Rightpectoralarm = new AdvancedModelRenderer(this, 34, 27);
        this.Rightpectoralarm.setRotationPoint(-3.5F, 5.699999809265137F, -6.199999809265137F);
        this.Rightpectoralarm.addBox(-4.0F, -1.5F, 0.0F, 4, 3, 1, 0.0F);
        this.setRotateAngle(Rightpectoralarm, -0.40334560078853393F, 0.5613347421062016F, -0.31834805156902407F);
        this.Upperteeth = new AdvancedModelRenderer(this, 40, 89);
        this.Upperteeth.setRotationPoint(0.0F, 3.700000047683716F, -4.599999904632568F);
        this.Upperteeth.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Upperteeth, -0.1911135497644277F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRenderer(this, 27, 79);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.0F, -7.800000190734863F);
        this.Jawparting.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F);
        this.setRotateAngle(Jawparting, 0.2546435405291338F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 72, 62);
        this.Head.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Head.addBox(-3.5F, -1.0F, -5.0F, 7, 8, 5, 0.0F);
        this.Belly2 = new AdvancedModelRenderer(this, 70, 46);
        this.Belly2.setRotationPoint(0.0F, 6.099999904632568F, 0.0F);
        this.Belly2.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Belly2, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawback = new AdvancedModelRenderer(this, 29, 66);
        this.Lowerjawback.setRotationPoint(0.009999999776482582F, 6.5F, -1.100000023841858F);
        this.Lowerjawback.addBox(-3.0F, -1.0F, -8.0F, 6, 2, 10, 0.0F);
        this.setRotateAngle(Lowerjawback, -0.1485275233394591F, 0.0F, 0.0F);
        this.Lowerfangsback = new AdvancedModelRenderer(this, 47, 79);
        this.Lowerfangsback.setRotationPoint(0.0F, -1.600000023841858F, -1.5F);
        this.Lowerfangsback.addBox(-1.0F, -2.0F, -1.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Lowerfangsback, 0.40334560078853393F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRenderer(this, 57, 87);
        this.Upperfrontteeth.setRotationPoint(0.009999999776482582F, 0.4000000059604645F, -4.0F);
        this.Upperfrontteeth.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.27593656206399647F, 0.0F, 0.0F);
        this.Back2 = new AdvancedModelRenderer(this, 20, 3);
        this.Back2.setRotationPoint(0.0F, -3.0999999046325684F, 0.0F);
        this.Back2.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Back2, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailfinend = new AdvancedModelRenderer(this, 62, 0);
        this.Tailfinend.setRotationPoint(0.009999999776482582F, 0.0F, 0.0F);
        this.Tailfinend.addBox(0.0F, -9.5F, 0.0F, 0, 19, 13, 0.0F);
        this.Belly1 = new AdvancedModelRenderer(this, 0, 10);
        this.Belly1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Belly1.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(Belly1, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 20, 12);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 6.300000190734863F);
        this.Tail4.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 8, 0.0F);
        this.Tailfinstart = new AdvancedModelRenderer(this, 57, 39);
        this.Tailfinstart.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Tailfinstart.addBox(0.0F, -5.5F, 0.0F, 0, 11, 6, 0.0F);
        this.Dorsalfinback = new AdvancedModelRenderer(this, 54, 0);
        this.Dorsalfinback.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Dorsalfinback.addBox(0.0F, -6.0F, 0.0F, 0, 6, 5, 0.0F);
        this.setRotateAngle(Dorsalfinback, -0.2546435405291338F, 0.0F, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 0, 77);
        this.Body1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Body1.addBox(-3.5F, -2.5F, -7.0F, 7, 10, 12, 0.0F);
        this.setRotateAngle(Body1, 0.03368485456349056F, 0.0F, 0.0F);
        this.Throat = new AdvancedModelRenderer(this, 28, 46);
        this.Throat.setRotationPoint(0.0F, 7.900000095367432F, 0.0F);
        this.Throat.addBox(-3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Throat, -0.12740903872453743F, 0.0F, 0.0F);
        this.Head.addChild(this.Headslope);
        this.Body2.addChild(this.Tail1);
        this.Belly1.addChild(this.Rightpelvicfin);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Lowerfangsback.addChild(this.Lowerfangsfront);
        this.Head.addChild(this.Upperjawback);
        this.Belly1.addChild(this.Leftpelvicfin);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Upperjawback.addChild(this.Leftmouthside);
        this.Body1.addChild(this.Leftpectoralarm);
        this.Upperjawback.addChild(this.Rightmouthside);
        this.Belly3.addChild(this.Analfin);
        this.Back2.addChild(this.Dorsalfinfront);
        this.Body1.addChild(this.Body2);
        this.Tail1.addChild(this.Tail2);
        this.Rightpectoralarm.addChild(this.Rightpectoralfin);
        this.Leftpectoralarm.addChild(this.Leftpectoralfin);
        this.Tail2.addChild(this.Tail3);
        this.Tail2.addChild(this.Back3);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Lowerjawmiddle.addChild(this.Lowerteeth);
        this.Tail2.addChild(this.Belly3);
        this.Body2.addChild(this.Back1);
        this.Body1.addChild(this.Rightpectoralarm);
        this.Upperjawback.addChild(this.Upperteeth);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Body1.addChild(this.Head);
        this.Tail1.addChild(this.Belly2);
        this.Head.addChild(this.Lowerjawback);
        this.Lowerjawfront.addChild(this.Lowerfangsback);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Tail1.addChild(this.Back2);
        this.Tail4.addChild(this.Tailfinend);
        this.Body2.addChild(this.Belly1);
        this.Tail3.addChild(this.Tail4);
        this.Tail3.addChild(this.Tailfinstart);
        this.Back3.addChild(this.Dorsalfinback);
        this.Head.addChild(this.Throat);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body1.render(f5 * 0.750F);
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

        this.Body1.offsetY = 1F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        float speed = 0.25F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += (f3 / (180F / (float) Math.PI));
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.4F * still, -0.65, f2, 0.6F * still);
            this.swing(Body1, speed, 0.15F * still, true, 0, 0, f2, 1);
        }
        else {
            this.swing(Body1, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(Leftpectoralarm, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Leftpectoralarm, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.swing(Leftpectoralfin, (float) (speed * 0.65), 0.1F, true, 0.5F, 0, f2, 0.5F);
        this.flap(Rightpectoralarm, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Rightpectoralarm, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);
        this.swing(Rightpectoralfin, (float) (speed * 0.65), -0.1F, true, 0.5F, 0, f2, 0.5F);

        this.flap(Leftpelvicfin, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Leftpelvicfin, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(Rightpelvicfin, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Rightpelvicfin, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Body1.rotateAngleZ = (float) Math.toRadians(90);
            this.Body1.offsetY = 1.35F;
            this.bob(Body1, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.Head, 0, (float) Math.toRadians(f3 / (180F / (float) Math.PI)),0);
        animator.rotate(this.Head, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(1);

    }
}

