package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraErythrosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.entity.Entity;

public class ModelErythrosuchus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Neckback;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperlipback;
    public AdvancedModelRendererExtended Upperjawmiddle;
    public AdvancedModelRendererExtended UpperteethbackL;
    public AdvancedModelRendererExtended UpperteethbackR;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Snoutslope;
    public AdvancedModelRendererExtended Upperlipfront;
    public AdvancedModelRendererExtended UpperteethmiddleL;
    public AdvancedModelRendererExtended UpperteethmiddleR;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended UpperteethmidfrontL;
    public AdvancedModelRendererExtended UpperteethmidfrontR;
    public AdvancedModelRendererExtended Lowerjawmiddleback;
    public AdvancedModelRendererExtended Lowerjawslope;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawmiddlefront;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerteethback;
    public AdvancedModelRendererExtended Lowerteethfront;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailmiddle;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Rightankle;
    public AdvancedModelRendererExtended Righttoes;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Leftankle;
    public AdvancedModelRendererExtended Lefttoes;

    private ModelAnimator animator;

    public ModelErythrosuchus() {
        this.textureWidth = 150;
        this.textureHeight = 150;
        this.Lowerjawslope = new AdvancedModelRendererExtended(this, 0, 107);
        this.Lowerjawslope.setRotationPoint(-0.009999999776482582F, 4.0F, -7.0F);
        this.Lowerjawslope.addBox(-2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.11135200827460905F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 68, 43);
        this.Head.setRotationPoint(0.0F, 1.2999999523162842F, -3.5F);
        this.Head.addBox(-4.5F, -2.5F, -7.0F, 9, 7, 7, 0.0F);
        this.setRotateAngle(Head, -0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 69, 109);
        this.Lowerjawfront.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.Lowerjawfront.addBox(-2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.1485275233394591F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRendererExtended(this, 101, 32);
        this.Tailmiddle.setRotationPoint(0.0F, 0.20000000298023224F, 6.0F);
        this.Tailmiddle.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(Tailmiddle, -0.1485275233394591F, 0.0F, 0.0F);
        this.Upperlipback = new AdvancedModelRendererExtended(this, 96, 11);
        this.Upperlipback.setRotationPoint(0.009999999776482582F, 5.650000095367432F, -5.900000095367432F);
        this.Upperlipback.addBox(-3.5F, -5.0F, 0.0F, 7, 5, 4, 0.0F);
        this.setRotateAngle(Upperlipback, -0.23876104699914646F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 59, 9);
        this.Rightlowerarm.setRotationPoint(1.5F, 5.800000190734863F, 2.5F);
        this.Rightlowerarm.addBox(-2.0F, -0.5F, -4.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.6368706733475028F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 0, 0);
        this.Upperfrontteeth.setRotationPoint(0.0F, 2.0F, -4.800000190734863F);
        this.Upperfrontteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.169820528229565F, 0.0F, 0.0F);
        this.Rightankle = new AdvancedModelRendererExtended(this, 87, 96);
        this.Rightankle.setRotationPoint(0.0F, 8.5F, 2.299999952316284F);
        this.Rightankle.addBox(-2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Rightankle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 68, 30);
        this.Lowerjawback.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Lowerjawback.addBox(-4.0F, 0.0F, -7.0F, 8, 4, 8, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 51, 76);
        this.Hips.setRotationPoint(0.0F, 4.3F, 15.0F);
        this.Hips.addBox(-4.5F, -2.0F, -7.0F, 9, 13, 11, 0.0F);
        this.setRotateAngle(Hips, -0.2972295716146343F, 0.0F, 0.0F);
        this.Leftankle = new AdvancedModelRendererExtended(this, 71, 101);
        this.Leftankle.setRotationPoint(0.0F, 8.5F, 2.299999952316284F);
        this.Leftankle.addBox(-2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Leftankle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 44);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -12.5F);
        this.Bodyfront.addBox(-5.0F, -2.0F, -12.0F, 10, 14, 12, 0.0F);
        this.setRotateAngle(Bodyfront, 0.21223203437934937F, 0.0F, 0.0F);
        this.Snoutslope = new AdvancedModelRendererExtended(this, 92, 104);
        this.Snoutslope.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Snoutslope.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(Snoutslope, 0.21746802546428376F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 33, 37);
        this.Tailbase.setRotationPoint(0.0F, 0.20000000298023224F, 2.5F);
        this.Tailbase.addBox(-3.5F, -2.0F, 0.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(Tailbase, 0.06370451936226872F, 0.0F, 0.0F);
        this.UpperteethmiddleR = new AdvancedModelRendererExtended(this, 18, 3);
        this.UpperteethmiddleR.setRotationPoint(-2.5999999046325684F, -0.8999999761581421F, -4.0F);
        this.UpperteethmiddleR.addBox(0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(UpperteethmiddleR, 0.08482300397719036F, -0.08482300397719036F, 0.0F);
        this.UpperteethmidfrontL = new AdvancedModelRendererExtended(this, 11, 1);
        this.UpperteethmidfrontL.setRotationPoint(2.049999952316284F, -0.5F, -3.200000047683716F);
        this.UpperteethmidfrontL.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(UpperteethmidfrontL, 0.2972295835988592F, 0.12740903872453743F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 45, 55);
        this.Neck.setRotationPoint(0.0F, -0.8999999761581421F, -10.699999809265137F);
        this.Neck.addBox(-3.5F, -1.0F, -7.0F, 7, 12, 8, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 100, 0);
        this.Upperjawback.setRotationPoint(0.0F, -2.4000000953674316F, -7.0F);
        this.Upperjawback.addBox(-3.0F, 0.0F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(Upperjawback, 0.42446406875869874F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 39, 0);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.20000000298023224F, 6.5F);
        this.Tailmiddlebase.addBox(-2.5F, -1.5F, 0.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 0, 26);
        this.Rightthigh.setRotationPoint(-3.5F, 4.159999847412109F, -3.0F);
        this.Rightthigh.addBox(-4.0F, -1.5F, -2.5F, 5, 10, 7, 0.0F);
        this.UpperteethmiddleL = new AdvancedModelRendererExtended(this, 18, 0);
        this.UpperteethmiddleL.setRotationPoint(2.5999999046325684F, -0.8999999761581421F, -4.0F);
        this.UpperteethmiddleL.addBox(0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(UpperteethmiddleL, 0.08482300397719036F, 0.08482300397719036F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 101, 21);
        this.Jawparting.setRotationPoint(-0.009999999776482582F, 0.10000000149011612F, -5.5F);
        this.Jawparting.addBox(-3.5F, -6.0F, 0.0F, 7, 6, 4, 0.0F);
        this.setRotateAngle(Jawparting, -0.27593656206399647F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 92, 87);
        this.Upperjawfront.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Upperjawfront.addBox(-2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.42446406875869874F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 95, 53);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.199999809265137F, -2.0F);
        this.Leftfrontfoot.addBox(-2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.06370451936226872F, 0.0F, 0.0F);
        this.UpperteethbackL = new AdvancedModelRendererExtended(this, 0, 0);
        this.UpperteethbackL.setRotationPoint(3.049999952316284F, -0.4000000059604645F, 0.4000000059604645F);
        this.UpperteethbackL.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(UpperteethbackL, 0.1485275233394591F, 0.10611601718967469F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 57, 23);
        this.Leftshin.setRotationPoint(1.5F, 7.5F, -1.7999999523162842F);
        this.Leftshin.addBox(-2.0F, 0.0F, -0.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Leftshin, 0.31834805156902407F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 78, 15);
        this.Leftupperarm.setRotationPoint(-3.799999952316284F, 9.270000457763672F, -9.0F);
        this.Leftupperarm.addBox(-4.0F, -2.0F, -2.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.42446406875869874F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront = new AdvancedModelRendererExtended(this, 52, 101);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Lowerjawmiddlefront.addBox(-2.5F, -3.0F, -4.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddlefront, -0.10611601718967469F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 77, 0);
        this.Rightupperarm.setRotationPoint(3.799999952316284F, 9.270000457763672F, -9.0F);
        this.Rightupperarm.addBox(-1.0F, -2.0F, -2.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.42446406875869874F, 0.0F, 0.0F);
        this.Lowerteethback = new AdvancedModelRendererExtended(this, 27, 0);
        this.Lowerteethback.setRotationPoint(0.0F, -3.0F, -3.5999999046325684F);
        this.Lowerteethback.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(Lowerteethback, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawmiddleback = new AdvancedModelRendererExtended(this, 14, 101);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Lowerjawmiddleback.addBox(-3.0F, 0.0F, -3.0F, 6, 3, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddleback, 0.169820528229565F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 101, 63);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.199999809265137F, -2.0F);
        this.Rightfrontfoot.addBox(-2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 76, 58);
        this.Leftthigh.setRotationPoint(3.5F, 4.159999847412109F, -3.0F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -2.5F, 5, 10, 7, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 38, 22);
        this.Rightshin.setRotationPoint(-1.5F, 7.5F, -1.7999999523162842F);
        this.Rightshin.addBox(-2.0F, 0.0F, -0.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Rightshin, 0.31834805156902407F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 81, 76);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4000000059604645F, 5.199999809265137F);
        this.Tailmiddleend.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(Tailmiddleend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Lowerteethfront = new AdvancedModelRendererExtended(this, 24, 7);
        this.Lowerteethfront.setRotationPoint(0.009999999776482582F, 0.0F, -2.799999952316284F);
        this.Lowerteethfront.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Lowerteethfront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 18, 19);
        this.Leftlowerarm.setRotationPoint(-1.5F, 5.800000190734863F, 2.5F);
        this.Leftlowerarm.addBox(-2.0F, -0.5F, -4.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.6368706733475028F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 95, 73);
        this.Tailend.setRotationPoint(0.0F, 0.20000000298023224F, 5.400000095367432F);
        this.Tailend.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Tailend, 0.1485275233394591F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 71);
        this.Bodymiddle.setRotationPoint(0.0F, -0.10000000149011612F, -6.800000190734863F);
        this.Bodymiddle.addBox(-5.5F, -2.0F, -13.5F, 11, 15, 14, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.23352505591421208F, 0.0F, 0.0F);
        this.Righttoes = new AdvancedModelRendererExtended(this, 33, 101);
        this.Righttoes.setRotationPoint(-0.009999999776482582F, 0.49000000953674316F, -2.799999952316284F);
        this.Righttoes.addBox(-2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F);
        this.Lefttoes = new AdvancedModelRendererExtended(this, 33, 108);
        this.Lefttoes.setRotationPoint(0.009999999776482582F, 0.49000000953674316F, -2.799999952316284F);
        this.Lefttoes.addBox(-2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F);
        this.Neckback = new AdvancedModelRendererExtended(this, 0, 13);
        this.Neckback.setRotationPoint(0.009999999776482582F, 11.0F, 1.0F);
        this.Neckback.addBox(-3.5F, -7.0F, 0.0F, 7, 7, 3, 0.0F);
        this.setRotateAngle(Neckback, 0.169820528229565F, 0.0F, 0.0F);
        this.UpperteethbackR = new AdvancedModelRendererExtended(this, 0, 2);
        this.UpperteethbackR.setRotationPoint(-3.049999952316284F, -0.5F, 0.4000000059604645F);
        this.UpperteethbackR.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(UpperteethbackR, 0.1485275233394591F, -0.10611601718967469F, 0.0F);
        this.Upperlipfront = new AdvancedModelRendererExtended(this, 52, 109);
        this.Upperlipfront.setRotationPoint(0.009999999776482582F, 0.0F, -4.0F);
        this.Upperlipfront.addBox(-2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(Upperlipfront, -0.1911135497644277F, 0.0F, 0.0F);
        this.UpperteethmidfrontR = new AdvancedModelRendererExtended(this, 11, 4);
        this.UpperteethmidfrontR.setRotationPoint(-2.049999952316284F, -0.5F, -3.200000047683716F);
        this.UpperteethmidfrontR.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(UpperteethmidfrontR, 0.2972295835988592F, -0.12740903872453743F, 0.0F);
        this.Upperjawmiddle = new AdvancedModelRendererExtended(this, 101, 43);
        this.Upperjawmiddle.setRotationPoint(-0.009999999776482582F, 5.730000019073486F, -5.599999904632568F);
        this.Upperjawmiddle.addBox(-3.0F, -5.0F, -4.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(Upperjawmiddle, -0.2546435405291338F, 0.0F, 0.0F);
        this.Lowerjawback.addChild(this.Lowerjawslope);
        this.Neck.addChild(this.Head);
        this.Lowerjawmiddlefront.addChild(this.Lowerjawfront);
        this.Tailmiddlebase.addChild(this.Tailmiddle);
        this.Upperjawback.addChild(this.Upperlipback);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Rightshin.addChild(this.Rightankle);
        this.Head.addChild(this.Lowerjawback);
        this.Leftshin.addChild(this.Leftankle);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Upperjawmiddle.addChild(this.Snoutslope);
        this.Hips.addChild(this.Tailbase);
        this.Upperjawmiddle.addChild(this.UpperteethmiddleR);
        this.Upperlipfront.addChild(this.UpperteethmidfrontL);
        this.Bodyfront.addChild(this.Neck);
        this.Head.addChild(this.Upperjawback);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Hips.addChild(this.Rightthigh);
        this.Upperjawmiddle.addChild(this.UpperteethmiddleL);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Upperjawmiddle.addChild(this.Upperjawfront);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Upperlipback.addChild(this.UpperteethbackL);
        this.Leftthigh.addChild(this.Leftshin);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Lowerjawmiddleback.addChild(this.Lowerjawmiddlefront);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Lowerjawmiddlefront.addChild(this.Lowerteethback);
        this.Lowerjawback.addChild(this.Lowerjawmiddleback);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Hips.addChild(this.Leftthigh);
        this.Rightthigh.addChild(this.Rightshin);
        this.Tailmiddle.addChild(this.Tailmiddleend);
        this.Lowerjawfront.addChild(this.Lowerteethfront);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Hips.addChild(this.Bodymiddle);
        this.Rightankle.addChild(this.Righttoes);
        this.Leftankle.addChild(this.Lefttoes);
        this.Neck.addChild(this.Neckback);
        this.Upperlipback.addChild(this.UpperteethbackR);
        this.Upperjawmiddle.addChild(this.Upperlipfront);
        this.Upperlipfront.addChild(this.UpperteethmidfrontR);
        this.Upperjawback.addChild(this.Upperjawmiddle);
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Neck.offsetY = -0.035F;
        this.Neck.offsetZ = -0.3F;
        this.Lowerjawback.rotateAngleX = (float)Math.toRadians(52.5);
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(UpperteethmiddleR, 0.08482300397719036F, -0.08482300397719036F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.21223203437934937F, 0.10611601718967469F, 0.0F);
        this.setRotateAngle(UpperteethmidfrontR, 0.2972295835988592F, -0.12740903872453743F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.7005751510978795F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.8491027077268521F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.1485275233394591F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.42446406875869874F, 0.0F, 0.0F);
        this.setRotateAngle(Lefttoes, -0.9339256534473936F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.08482300397719036F, -0.1485275233394591F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.021293017373673524F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.1485275233394591F, 0.31834805156902407F, 0.0F);
        this.setRotateAngle(Hips, -0.2972295835988592F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Upperlipback, -0.23876104699914646F, 0.0F, 0.0F);
        this.setRotateAngle(UpperteethbackR, 0.1485275233394591F, -0.10611601718967469F, 0.0F);
        this.setRotateAngle(Snoutslope, 0.21746802546428376F, 0.0F, 0.0F);
        this.setRotateAngle(Righttoes, -0.021293017373673524F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.23352505591421208F, 0.04241150198859518F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, 0.23352505591421208F, -0.021293017373673524F);
        this.setRotateAngle(Lowerteethfront, -0.04241150198859518F, 0.0F, 0.0F);
        this.setRotateAngle(UpperteethbackL, 0.1485275233394591F, 0.10611601718967469F, 0.0F);
        this.setRotateAngle(Leftankle, 0.31834805156902407F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin, 0.6368706733475028F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.1911135497644277F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddlefront, -0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Rightankle, 0.1911135497644277F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.1911135497644277F, 0.12740903872453743F, -0.021293017373673524F);
        this.setRotateAngle(Tailmiddleend, -0.021293017373673524F, 0.169820528229565F, 0.0F);
        this.setRotateAngle(Tailbase, 0.06370451936226872F, -0.06370451936226872F, 0.0F);
        this.setRotateAngle(UpperteethmidfrontL, 0.2972295835988592F, 0.12740903872453743F, 0.0F);
        this.setRotateAngle(Rightthigh, -0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddleback, 0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(UpperteethmiddleL, 0.08482300397719036F, 0.08482300397719036F, 0.0F);
        this.setRotateAngle(Lowerteethback, -0.06370451936226872F, 0.0F, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.21223203437934937F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.5518731241279929F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.11135200827460905F, 0.0F, 0.0F);
        this.setRotateAngle(Jawparting, -0.27593656206399647F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5518731241279929F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddle, -0.1485275233394591F, -0.10611601718967469F, 0.0F);
        this.setRotateAngle(Rightshin, 0.23352505591421208F, 0.0F, 0.0F);
        this.setRotateAngle(Leftthigh, 0.31834805156902407F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawback, 0.42446406875869874F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawmiddle, -0.2546435405291338F, 0.0F, 0.0F);
        this.setRotateAngle(Upperlipfront, -0.1911135497644277F, 0.0F, 0.0F);
        this.setRotateAngle(Neckback, 0.169820528229565F, 0.0F, 0.0F);
        this.Hips.offsetX = 0.14F;
        this.Hips.offsetZ = -0.14F;
        this.Hips.offsetY = -0.135F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
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
        //this.Hips.offsetY = 0.30F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraErythrosuchus Erythrosuchus = (EntityPrehistoricFloraErythrosuchus) e;
        float masterSpeed = Erythrosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 6, Neck);
        this.faceTarget(f3, f4, 6, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] NeckF = {this.Neck, this.Head};
        Erythrosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Erythrosuchus.getAnimation() == Erythrosuchus.LAY_ANIMATION) {
            this.chainSwing(NeckF, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(NeckF, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Erythrosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Erythrosuchus.getIsMoving()) {
                this.chainSwing(NeckF, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(NeckF, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Erythrosuchus.getIsFast()) { //Running
                float speed = masterSpeed / 1.8F;
                //this.Hips.offsetY = 0.25F;
                //this.basin.offsetY = 0.75F;
                //this.basin.offsetY = 0.815F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.1825), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.1825), false, 0, f2, 1.5F);



                this.walk(Rightupperarm, speed, (float)Math.toRadians(18), true, 5.0F, (float)Math.toRadians(9), f2, 1.0F);
                this.walk(Leftupperarm, speed, (float)Math.toRadians(18), true, 8.0F, (float)Math.toRadians(9), f2, 1.0F);

                this.walk(Rightlowerarm, speed, 0.46F, true, 3.5F, 0F, f2, 1F);
                this.walk(Leftlowerarm, speed, 0.46F, true, 6.5F, 0F, f2, 1F);

                this.walk(Rightfrontfoot, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(Leftfrontfoot, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(Leftthigh, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
                this.walk(Rightthigh, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);

                this.walk(Leftshin, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(Rightshin, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(Leftankle, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(Rightankle, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(Lefttoes, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(Righttoes, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(Hips, speed * 2F, 0.53F, false, 3.5F, f2, 1F);

                this.bobExtended(Leftthigh, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(Rightthigh, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Hips, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Bodymiddle, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Bodymiddle, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neck, speed * 0.5F, -0.20F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

            }
            else { //Walking
                float speed = masterSpeed / 2.50F;
                //this.Hips.offsetY = 0.25F;
                //this.basin.offsetY = 0.815F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.1825), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.1825), false, 0, f2, 1.5F);



                this.walk(Rightupperarm, speed, (float)Math.toRadians(18), true, 5.0F, (float)Math.toRadians(9), f2, 1.0F);
                this.walk(Leftupperarm, speed, (float)Math.toRadians(18), true, 8.0F, (float)Math.toRadians(9), f2, 1.0F);

                this.walk(Rightlowerarm, speed, 0.46F, true, 3.5F, 0F, f2, 1F);
                this.walk(Leftlowerarm, speed, 0.46F, true, 6.5F, 0F, f2, 1F);

                this.walk(Rightfrontfoot, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(Leftfrontfoot, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(Leftthigh, speed, (float)Math.toRadians(25), true, 8.0F, -(float)Math.toRadians(5), f2, 1.0F);
                this.walk(Rightthigh, speed, (float)Math.toRadians(25), true, 5.0F, -(float)Math.toRadians(5), f2, 1.0F);

                this.walk(Leftshin, speed, 0.26F, true, 6.5F, 0F, f2, 1F);
                this.walk(Rightshin, speed, 0.26F, true, 3.5F, 0F, f2, 1F);

                this.walk(Leftankle, speed, (float)Math.toRadians(35), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(Rightankle, speed, (float)Math.toRadians(35), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(Lefttoes, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(Righttoes, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(Hips, speed * 2F, 0.53F, false, 3.5F, f2, 1F);

                this.bobExtended(Leftthigh, speed, 0.4F, false, 3.0F, f2, 1F);
                this.bobExtended(Rightthigh, speed, 0.4F, false, 0.0F, f2, 1F);

                this.flap(Hips, speed, 0.06F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Bodymiddle, speed, -0.06F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.04F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.04F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.06F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.06F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Bodymiddle, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neck, speed * 0.5F, -0.20F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraErythrosuchus e = (EntityPrehistoricFloraErythrosuchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tailbase, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Leftthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Rightthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodymiddle, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodyfront, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
         animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tailbase, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Leftthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Rightthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodymiddle, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodyfront, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tailbase, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Leftthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Rightthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodymiddle, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodyfront, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tailbase, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Leftthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Rightthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodymiddle, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodyfront, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tailbase, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Leftthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Rightthigh, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodymiddle, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Bodyfront, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lowerjawback, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lowerjawback, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Neck, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lowerjawback, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
