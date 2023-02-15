package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDimetrodon extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Sailend;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Sailmiddle;
    public AdvancedModelRendererExtended Neckbase;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Sailmiddlefront;
    public AdvancedModelRendererExtended Neckend;
    public AdvancedModelRendererExtended Sailfrontbase;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Sailfrontend;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Forehead;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Lowerjawslope;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Leftlowerteeth;
    public AdvancedModelRendererExtended Rightlowerteeth;
    public AdvancedModelRendererExtended Upperjawmiddle;
    public AdvancedModelRendererExtended Leftupperbackteeth;
    public AdvancedModelRendererExtended Rightupperteethback;
    public AdvancedModelRendererExtended Nosebridge;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Leftupperfrontteeth;
    public AdvancedModelRendererExtended Rightupperfrontteeth;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelDimetrodon() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftupperbackteeth = new AdvancedModelRendererExtended(this, 74, 69);
        this.Leftupperbackteeth.setRotationPoint(1.7999999523162842F, 1.7000000476837158F, 1.1699999570846558F);
        this.Leftupperbackteeth.addBox(0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(Leftupperbackteeth, -0.10611601718967469F, 0.021293017373673524F, 0.0F);
        this.Sailmiddle = new AdvancedModelRendererExtended(this, 51, 1);
        this.Sailmiddle.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.Sailmiddle.addBox(0.0F, -20.0F, 0.0F, 0, 20, 13, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 85, 78);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerfrontteeth.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, 0.7005751510978795F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 29, 47);
        this.Rightlowerarm.setRotationPoint(-0.5F, 3.9000000953674316F, 0.8999999761581421F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.7216936190680444F, -0.06370451936226872F, -0.21223203437934937F);
        this.Tailend = new AdvancedModelRendererExtended(this, 70, 38);
        this.Tailend.setRotationPoint(0.0F, 0.30000001192092896F, 10.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(Tailend, 0.1911135497644277F, 0.0F, 0.0F);
        this.Upperjawmiddle = new AdvancedModelRendererExtended(this, 66, 65);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawmiddle.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawmiddle, -0.5942845969882637F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 64, 70);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Lowerjawfront.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.23352505591421208F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 13, 12);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.400000095367432F, -0.5F);
        this.Rightfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.06370451936226872F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 65, 75);
        this.Upperjawfront.setRotationPoint(0.009999999776482582F, -2.0F, -2.799999952316284F);
        this.Upperjawfront.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.9128071854772289F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 48, 38);
        this.Rightthigh.setRotationPoint(-2.5F, 1.5F, -0.5F);
        this.Rightthigh.addBox(-2.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rightthigh, -0.42446406875869874F, 0.1485275233394591F, 0.2546435405291338F);
        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this, 83, 71);
        this.Leftupperfrontteeth.setRotationPoint(1.2999999523162842F, -0.5F, -2.0F);
        this.Leftupperfrontteeth.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, 0.27593656206399647F, 0.06370451936226872F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 51, 49);
        this.Rightshin.setRotationPoint(-0.699999988079071F, 4.900000095367432F, -0.699999988079071F);
        this.Rightshin.addBox(-1.0F, 0.0F, -0.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightshin, 0.9552186916270132F, 0.12740903872453743F, -0.08482300397719036F);
        this.Lowerjawslope = new AdvancedModelRendererExtended(this, 55, 59);
        this.Lowerjawslope.setRotationPoint(0.009999999776482582F, -0.10000000149011612F, -3.0F);
        this.Lowerjawslope.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawslope, 0.3768165881687368F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 0, 0);
        this.Jawparting.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Jawparting.addBox(-1.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.31834805156902407F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 63, 38);
        this.Leftthigh.setRotationPoint(2.5F, 1.5F, -0.5F);
        this.Leftthigh.addBox(-1.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Leftthigh, -0.42446406875869874F, -0.1485275233394591F, -0.2546435405291338F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 21, 38);
        this.Rightupperarm.setRotationPoint(-3.0F, 5.699999809265137F, -8.0F);
        this.Rightupperarm.addBox(-2.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.5942845969882637F, -0.10611601718967469F, 0.21223203437934937F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 62, 49);
        this.Leftshin.setRotationPoint(0.699999988079071F, 4.900000095367432F, -0.699999988079071F);
        this.Leftshin.addBox(-1.0F, 0.0F, -0.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftshin, 0.9552186916270132F, -0.12740903872453743F, 0.08482300397719036F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 74, 72);
        this.Rightlowerteeth.setRotationPoint(-1.5F, 0.6000000238418579F, 0.0F);
        this.Rightlowerteeth.addBox(0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.06370451936226872F, -0.169820528229565F, 0.0F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 74, 75);
        this.Leftlowerteeth.setRotationPoint(1.5F, 0.6000000238418579F, 0.0F);
        this.Leftlowerteeth.addBox(0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.06370451936226872F, 0.169820528229565F, 0.0F);
        this.Sailfrontbase = new AdvancedModelRendererExtended(this, 18, 19);
        this.Sailfrontbase.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.Sailfrontbase.addBox(0.0F, -13.0F, -2.5F, 0, 13, 5, 0.0F);
        this.setRotateAngle(Sailfrontbase, 0.08482300397719036F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 33, 69);
        this.Head.setRotationPoint(0.009999999776482582F, 0.10000000149011612F, -2.200000047683716F);
        this.Head.addBox(-2.5F, -1.5F, -4.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Head, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this, 83, 68);
        this.Rightupperfrontteeth.setRotationPoint(-1.2999999523162842F, -0.5F, -2.0F);
        this.Rightupperfrontteeth.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, 0.27593656206399647F, -0.06370451936226872F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 52, 0);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.10000000149011612F, 7.0F);
        this.Tailmiddlebase.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.06370451936226872F, 0.0F, 0.0F);
        this.Sailfrontend = new AdvancedModelRendererExtended(this, 7, 30);
        this.Sailfrontend.setRotationPoint(0.0F, -2.299999952316284F, -1.2999999523162842F);
        this.Sailfrontend.addBox(-0.5F, -0.0F, -2.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(Sailfrontend, 0.36093409463874954F, 0.0F, 0.0F);
        this.Neckbase = new AdvancedModelRendererExtended(this, 45, 87);
        this.Neckbase.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.Neckbase.addBox(-2.5F, 0.0F, -5.0F, 5, 8, 5, 0.0F);
        this.setRotateAngle(Neckbase, -0.10611601718967469F, 0.0F, 0.0F);
        this.Sailend = new AdvancedModelRendererExtended(this, 78, 6);
        this.Sailend.setRotationPoint(-0.009999999776482582F, -2.0F, -6.5F);
        this.Sailend.addBox(0.0F, -16.0F, 0.0F, 0, 20, 10, 0.0F);
        this.setRotateAngle(Sailend, 0.38205256260891435F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 75);
        this.Bodymiddle.setRotationPoint(0.0F, -1.2000000476837158F, -5.5F);
        this.Bodymiddle.addBox(-4.0F, -1.0F, -13.0F, 8, 9, 13, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.38205256260891435F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 88, 71);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.Upperfrontteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.2972295835988592F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 13, 18);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.400000095367432F, -0.5F);
        this.Leftfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.06370451936226872F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 55);
        this.Bodyfront.setRotationPoint(0.0F, 0.10000000149011612F, -12.0F);
        this.Bodyfront.addBox(-3.5F, -1.0F, -10.0F, 7, 9, 10, 0.0F);
        this.setRotateAngle(Bodyfront, 0.10611601718967469F, 0.0F, 0.0F);
        this.Neckend = new AdvancedModelRendererExtended(this, 66, 89);
        this.Neckend.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.Neckend.addBox(-2.0F, -1.0F, -4.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Neckend, 0.06370451936226872F, 0.0F, 0.0F);
        this.Nosebridge = new AdvancedModelRendererExtended(this, 54, 72);
        this.Nosebridge.setRotationPoint(0.0F, -4.400000095367432F, -1.25F);
        this.Nosebridge.addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Nosebridge, 0.9976301977767977F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 27, 0);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4000000059604645F, 7.5F);
        this.Tailmiddleend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 11, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.21223203437934937F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 40, 47);
        this.Leftlowerarm.setRotationPoint(0.5F, 3.9000000953674316F, 0.8999999761581421F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.7216936190680444F, 0.06370451936226872F, 0.21223203437934937F);
        this.Sailmiddlefront = new AdvancedModelRendererExtended(this, 30, 4);
        this.Sailmiddlefront.setRotationPoint(0.009999999776482582F, -1.0F, -7.599999904632568F);
        this.Sailmiddlefront.addBox(0.0F, -21.0F, -1.0F, 0, 21, 10, 0.0F);
        this.setRotateAngle(Sailmiddlefront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Forehead = new AdvancedModelRendererExtended(this, 46, 79);
        this.Forehead.setRotationPoint(-0.009999999776482582F, -1.350000023841858F, -4.5F);
        this.Forehead.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Forehead, 0.31834805156902407F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 34, 38);
        this.Leftupperarm.setRotationPoint(3.0F, 5.699999809265137F, -8.0F);
        this.Leftupperarm.addBox(-1.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.5942845969882637F, 0.10611601718967469F, -0.21223203437934937F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 39);
        this.Hips.setRotationPoint(0.0F, 13.8F, 10.0F);
        this.Hips.addBox(-3.0F, -2.0F, -6.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(Hips, -0.42446407408502096F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 0, 14);
        this.Righthindfoot.setRotationPoint(0.0F, 5.699999809265137F, 1.5F);
        this.Righthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.06370451936226872F, 0.0F, -0.021293017373673524F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 73, 52);
        this.Lowerjawback.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Lowerjawback.addBox(-2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 38, 58);
        this.Upperjawback.setRotationPoint(0.0F, 0.6499999761581421F, -4.0F);
        this.Upperjawback.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Upperjawback, 0.42446406875869874F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 51, 65);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.6499999761581421F, -3.0F);
        this.Lowerjawmiddle.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.1911135497644277F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 0, 20);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.699999809265137F, 1.5F);
        this.Lefthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.06370451936226872F, 0.0F, 0.021293017373673524F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 76, 0);
        this.Tailbase.setRotationPoint(0.0F, -0.8999999761581421F, 1.5F);
        this.Tailbase.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Tailbase, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperteethback = new AdvancedModelRendererExtended(this, 74, 66);
        this.Rightupperteethback.setRotationPoint(-1.7999999523162842F, 1.7000000476837158F, 1.1699999570846558F);
        this.Rightupperteethback.addBox(0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(Rightupperteethback, -0.10611601718967469F, -0.021293017373673524F, 0.0F);
        this.Upperjawback.addChild(this.Leftupperbackteeth);
        this.Bodymiddle.addChild(this.Sailmiddle);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Upperjawback.addChild(this.Upperjawmiddle);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Upperjawmiddle.addChild(this.Upperjawfront);
        this.Hips.addChild(this.Rightthigh);
        this.Upperjawmiddle.addChild(this.Leftupperfrontteeth);
        this.Rightthigh.addChild(this.Rightshin);
        this.Lowerjawback.addChild(this.Lowerjawslope);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Hips.addChild(this.Leftthigh);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Leftthigh.addChild(this.Leftshin);
        this.Lowerjawslope.addChild(this.Rightlowerteeth);
        this.Lowerjawslope.addChild(this.Leftlowerteeth);
        this.Neckbase.addChild(this.Sailfrontbase);
        this.Neckend.addChild(this.Head);
        this.Upperjawmiddle.addChild(this.Rightupperfrontteeth);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Neckend.addChild(this.Sailfrontend);
        this.Bodyfront.addChild(this.Neckbase);
        this.Hips.addChild(this.Sailend);
        this.Hips.addChild(this.Bodymiddle);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Neckbase.addChild(this.Neckend);
        this.Upperjawmiddle.addChild(this.Nosebridge);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Bodyfront.addChild(this.Sailmiddlefront);
        this.Head.addChild(this.Forehead);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Head.addChild(this.Lowerjawback);
        this.Head.addChild(this.Upperjawback);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Hips.addChild(this.Tailbase);
        this.Upperjawback.addChild(this.Rightupperteethback);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(26);
        this.Neckbase.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.4245F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Bodymiddle, 0.3834F, -0.081F, -0.0326F);
        this.setRotateAngle(Bodyfront, 0.1077F, -0.1735F, -0.0187F);
        this.setRotateAngle(Neckbase, -0.2915F, -0.4337F, 0.0493F);
        this.setRotateAngle(Neckend, 0.0241F, -0.3483F, -0.0232F);
        this.setRotateAngle(Head, -0.3278F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, 0.1698F, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, -0.1698F, 0.0F);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawmiddle, -0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(Nosebridge, 0.9976F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.9128F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, 0.2759F, -0.0637F, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, 0.2759F, 0.0637F, 0.0F);
        this.setRotateAngle(Leftupperbackteeth, -0.1061F, -0.0213F, 0.0F);
        this.setRotateAngle(Rightupperteethback, -0.1061F, 0.0213F, 0.0F);
        this.setRotateAngle(Forehead, 0.3183F, 0.0F, 0.0F);
        this.setRotateAngle(Sailfrontend, 0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(Sailfrontbase, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm, 1.3797F, 0.1061F, -0.2122F);
        this.setRotateAngle(Leftlowerarm, -1.6816F, 0.0637F, 0.2122F);
        this.setRotateAngle(Leftfrontfoot, 1.4163F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.5943F, -0.1061F, 0.2122F);
        this.setRotateAngle(Rightlowerarm, -0.64F, 0.0046F, -0.2051F);
        this.setRotateAngle(Rightfrontfoot, -0.0236F, 0.0F, 0.0F);
        this.setRotateAngle(Sailmiddlefront, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0216F, -0.1745F, -0.0038F);
        this.setRotateAngle(Tailmiddlebase, -0.0659F, -0.2613F, 0.0171F);
        this.setRotateAngle(Tailmiddleend, 0.2195F, -0.2558F, -0.0564F);
        this.setRotateAngle(Tailend, 0.2031F, -0.3424F, -0.069F);
        this.setRotateAngle(Leftthigh, -0.5117F, -0.1485F, -0.2546F);
        this.setRotateAngle(Leftshin, 0.868F, -0.1274F, 0.0848F);
        this.setRotateAngle(Lefthindfoot, 0.1108F, 0.0F, -0.0213F);
        this.setRotateAngle(Rightthigh, -0.0754F, 0.1485F, 0.2546F);
        this.setRotateAngle(Rightshin, 1.3043F, 0.1274F, -0.0848F);
        this.setRotateAngle(Righthindfoot, -0.4128F, 0.0F, 0.0213F);
        this.setRotateAngle(Sailend, 0.3821F, 0.0F, 0.0F);
        this.Hips.offsetY = -0.14F;
        this.Hips.offsetX = 0.08F;
        this.Hips.offsetZ = -0.09F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
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
        this.Hips.offsetY = 0.013F;

        EntityPrehistoricFloraDimetrodon Dimetrodon = (EntityPrehistoricFloraDimetrodon) e;
        float masterSpeed = Dimetrodon.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neckbase);
        this.faceTarget(f3, f4, 5, Neckend);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        Dimetrodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (Dimetrodon.getAnimation() == Dimetrodon.LAY_ANIMATION) {
            this.swing(Neckbase, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Dimetrodon.getIsMoving()) { //Not moving
            this.swing(Neckbase, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Dimetrodon.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Bodymiddle, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        if (Dimetrodon.getAnimation() != Dimetrodon.ATTACK_ANIMATION
                && Dimetrodon.getAnimation() != Dimetrodon.EAT_ANIMATION) {
            this.swing(Neckbase, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neckbase, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }

        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDimetrodon e = (EntityPrehistoricFloraDimetrodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neckbase, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.Neckbase, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neckbase, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neckbase, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
