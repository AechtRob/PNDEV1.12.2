package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSphenacodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSphenacodon extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended sailbasehips;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended sailbasebodymiddle;
    public AdvancedModelRendererExtended Neckbase;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended sailbasebodyfront;
    public AdvancedModelRendererExtended Neckend;
    public AdvancedModelRendererExtended sailbaseneck;
    public AdvancedModelRendererExtended Head;
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
    public AdvancedModelRendererExtended sailbasetail;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelSphenacodon() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this, 83, 68);
        this.Rightupperfrontteeth.setRotationPoint(-1.2999999523162842F, -0.5F, -2.0F);
        this.Rightupperfrontteeth.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, 0.27593656206399647F, -0.06370451936226872F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 29, 47);
        this.Rightlowerarm.setRotationPoint(-0.5F, 3.9000000953674316F, 0.8999999761581421F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.7216936190680444F, -0.06370451936226872F, -0.21223203437934937F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 62, 49);
        this.Leftshin.setRotationPoint(0.7F, 3.0F, -1.0F);
        this.Leftshin.addBox(-1.0F, 0.0F, -0.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Leftshin, 0.8651597102135892F, -0.12740903539558604F, 0.08482300164692443F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 0, 20);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.2F, 1.5F);
        this.Lefthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.0F, 0.0F, 0.02129301687433082F);
        this.Head = new AdvancedModelRendererExtended(this, 33, 69);
        this.Head.setRotationPoint(0.01F, 0.1F, -2.2F);
        this.Head.addBox(-2.5F, -1.5F, -4.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Head, 0.045553093477052F, 0.0F, 0.0F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 74, 75);
        this.Leftlowerteeth.setRotationPoint(1.5F, 0.6000000238418579F, 0.0F);
        this.Leftlowerteeth.addBox(0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.06370451936226872F, 0.169820528229565F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 21, 38);
        this.Rightupperarm.setRotationPoint(-3.0F, 5.0F, -8.0F);
        this.Rightupperarm.addBox(-2.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.7740535232594852F, -0.10611601852125524F, 0.21223203704251048F);
        this.Forehead = new AdvancedModelRendererExtended(this, 46, 79);
        this.Forehead.setRotationPoint(-0.009999999776482582F, -1.350000023841858F, -4.5F);
        this.Forehead.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Forehead, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 13, 12);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Rightfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.0F, 0.22689280275926282F, 0.0F);
        this.Leftupperbackteeth = new AdvancedModelRendererExtended(this, 74, 69);
        this.Leftupperbackteeth.setRotationPoint(1.7999999523162842F, 1.7000000476837158F, 1.1699999570846558F);
        this.Leftupperbackteeth.addBox(0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(Leftupperbackteeth, -0.10611601718967469F, 0.021293017373673524F, 0.0F);
        this.Upperjawmiddle = new AdvancedModelRendererExtended(this, 66, 65);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawmiddle.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawmiddle, -0.5942845969882637F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 34, 38);
        this.Leftupperarm.setRotationPoint(3.0F, 5.0F, -8.0F);
        this.Leftupperarm.addBox(-1.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.7740535232594852F, 0.10611601852125524F, -0.21223203704251048F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 48, 38);
        this.Rightthigh.setRotationPoint(-2.5F, 1.7F, -0.5F);
        this.Rightthigh.addBox(-2.0F, -0.5F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Rightthigh, -0.5009094953223726F, 0.14852751934471745F, 0.2546435378659727F);
        this.sailbasehips = new AdvancedModelRendererExtended(this, 19, 24);
        this.sailbasehips.setRotationPoint(0.0F, -0.1F, 2.5F);
        this.sailbasehips.addBox(-1.01F, -2.5F, -8.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(sailbasehips, -0.18203784098300857F, 0.0F, 0.0F);
        this.sailbaseneck = new AdvancedModelRendererExtended(this, 65, 15);
        this.sailbaseneck.setRotationPoint(0.0F, 2.2F, -5.7F);
        this.sailbaseneck.addBox(-0.5F, -2.5F, 0.0F, 1, 3, 5, 0.0F);
        this.setRotateAngle(sailbaseneck, 0.40980330836826856F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 52, 0);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.4F, 6.5F);
        this.Tailmiddlebase.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.045553093477052F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 57);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -8.4F);
        this.Bodyfront.addBox(-3.5F, -1.0F, -8.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(Bodyfront, 0.136659280431156F, 0.0F, 0.0F);
        this.Neckend = new AdvancedModelRendererExtended(this, 66, 89);
        this.Neckend.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.Neckend.addBox(-2.0F, -1.0F, -4.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Neckend, 0.045553093477052F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 76, 0);
        this.Tailbase.setRotationPoint(0.0F, -0.9F, 1.5F);
        this.Tailbase.addBox(-2.0F, -1.0F, 0.0F, 4, 6, 7, 0.0F);
        this.setRotateAngle(Tailbase, -0.136659280431156F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 0, 0);
        this.Jawparting.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Jawparting.addBox(-1.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.31834805156902407F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 88, 71);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.Upperfrontteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.2972295835988592F, 0.0F, 0.0F);
        this.sailbasetail = new AdvancedModelRendererExtended(this, 3, 27);
        this.sailbasetail.setRotationPoint(0.0F, 0.6F, 0.4F);
        this.sailbasetail.addBox(-0.5F, -2.5F, 0.0F, 1, 3, 5, 0.0F);
        this.setRotateAngle(sailbasetail, -0.18203784098300857F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 51, 65);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.6499999761581421F, -3.0F);
        this.Lowerjawmiddle.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 13, 18);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Leftfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.0F, -0.22689280275926282F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 27, 0);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.Tailmiddleend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.21223203704251048F, 0.0F, 0.0F);
        this.Lowerjawslope = new AdvancedModelRendererExtended(this, 55, 59);
        this.Lowerjawslope.setRotationPoint(0.009999999776482582F, -0.10000000149011612F, -3.0F);
        this.Lowerjawslope.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawslope, 0.3768165881687368F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 40, 47);
        this.Leftlowerarm.setRotationPoint(0.5F, 3.9000000953674316F, 0.8999999761581421F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.7216936190680444F, 0.06370451936226872F, 0.21223203437934937F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 74, 72);
        this.Rightlowerteeth.setRotationPoint(-1.5F, 0.6000000238418579F, 0.0F);
        this.Rightlowerteeth.addBox(0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.06370451936226872F, -0.169820528229565F, 0.0F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 73, 52);
        this.Lowerjawback.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Lowerjawback.addBox(-2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 64, 70);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Lowerjawfront.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.23352505591421208F, 0.0F, 0.0F);
        this.sailbasebodyfront = new AdvancedModelRendererExtended(this, 32, 12);
        this.sailbasebodyfront.setRotationPoint(0.0F, -0.5F, -8.8F);
        this.sailbasebodyfront.addBox(-1.01F, -2.5F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(sailbasebodyfront, 0.045553093477052F, 0.0F, 0.0F);
        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this, 83, 71);
        this.Leftupperfrontteeth.setRotationPoint(1.2999999523162842F, -0.5F, -2.0F);
        this.Leftupperfrontteeth.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, 0.27593656206399647F, 0.06370451936226872F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 75);
        this.Bodymiddle.setRotationPoint(0.0F, -1.2F, -5.4F);
        this.Bodymiddle.addBox(-4.0F, -1.0F, -9.0F, 8, 9, 9, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.136659280431156F, 0.0F, 0.0F);
        this.Nosebridge = new AdvancedModelRendererExtended(this, 54, 72);
        this.Nosebridge.setRotationPoint(0.0F, -4.400000095367432F, -1.25F);
        this.Nosebridge.addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Nosebridge, 0.9976301977767977F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 65, 75);
        this.Upperjawfront.setRotationPoint(0.009999999776482582F, -2.0F, -2.799999952316284F);
        this.Upperjawfront.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.9128071854772289F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 0, 14);
        this.Righthindfoot.setRotationPoint(0.0F, 4.2F, 1.5F);
        this.Righthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.0F, 0.0F, -0.02129301687433082F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 85, 78);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerfrontteeth.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, 0.7005751510978795F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 51, 49);
        this.Rightshin.setRotationPoint(-0.7F, 3.0F, -1.0F);
        this.Rightshin.addBox(-1.0F, 0.0F, -0.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Rightshin, 0.8651597102135892F, 0.12740903539558604F, -0.08482300164692443F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 63, 38);
        this.Leftthigh.setRotationPoint(2.5F, 1.7F, -0.5F);
        this.Leftthigh.addBox(-1.0F, -0.5F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Leftthigh, -0.5009094953223726F, -0.14852751934471745F, -0.2546435378659727F);
        this.sailbasebodymiddle = new AdvancedModelRendererExtended(this, 46, 17);
        this.sailbasebodymiddle.setRotationPoint(0.0F, -0.3F, 0.8F);
        this.sailbasebodymiddle.addBox(-1.0F, -2.5F, -10.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(sailbasebodymiddle, -0.045553093477052F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 38, 58);
        this.Upperjawback.setRotationPoint(0.0F, 0.6499999761581421F, -4.0F);
        this.Upperjawback.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Upperjawback, 0.42446406875869874F, 0.0F, 0.0F);
        this.Neckbase = new AdvancedModelRendererExtended(this, 45, 87);
        this.Neckbase.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.Neckbase.addBox(-2.5F, 0.0F, -5.0F, 5, 8, 5, 0.0F);
        this.setRotateAngle(Neckbase, 0.045553093477052F, 0.0F, 0.0F);
        this.Rightupperteethback = new AdvancedModelRendererExtended(this, 74, 66);
        this.Rightupperteethback.setRotationPoint(-1.7999999523162842F, 1.7000000476837158F, 1.1699999570846558F);
        this.Rightupperteethback.addBox(0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(Rightupperteethback, -0.10611601718967469F, -0.021293017373673524F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 77, 40);
        this.Tailend.setRotationPoint(0.0F, 0.3F, 7.2F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tailend, 0.19111355309337907F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 40);
        this.Hips.setRotationPoint(0.0F, 13.8F, 10.0F);
        this.Hips.addBox(-3.0F, -2.0F, -6.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(Hips, -0.31869712141416456F, 0.0F, 0.0F);
        this.Upperjawmiddle.addChild(this.Rightupperfrontteeth);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Leftthigh.addChild(this.Leftshin);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Neckend.addChild(this.Head);
        this.Lowerjawslope.addChild(this.Leftlowerteeth);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Head.addChild(this.Forehead);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Upperjawback.addChild(this.Leftupperbackteeth);
        this.Upperjawback.addChild(this.Upperjawmiddle);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Hips.addChild(this.Rightthigh);
        this.Hips.addChild(this.sailbasehips);
        this.Neckbase.addChild(this.sailbaseneck);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Neckbase.addChild(this.Neckend);
        this.Hips.addChild(this.Tailbase);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Tailbase.addChild(this.sailbasetail);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Lowerjawback.addChild(this.Lowerjawslope);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Lowerjawslope.addChild(this.Rightlowerteeth);
        this.Head.addChild(this.Lowerjawback);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Bodyfront.addChild(this.sailbasebodyfront);
        this.Upperjawmiddle.addChild(this.Leftupperfrontteeth);
        this.Hips.addChild(this.Bodymiddle);
        this.Upperjawmiddle.addChild(this.Nosebridge);
        this.Upperjawmiddle.addChild(this.Upperjawfront);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Rightthigh.addChild(this.Rightshin);
        this.Hips.addChild(this.Leftthigh);
        this.Bodymiddle.addChild(this.sailbasebodymiddle);
        this.Head.addChild(this.Upperjawback);
        this.Bodyfront.addChild(this.Neckbase);
        this.Upperjawback.addChild(this.Rightupperteethback);
        this.Tailmiddleend.addChild(this.Tailend);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.75f);
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
        this.Hips.offsetY = 0.490F;
        this.Hips.offsetZ = 0.2F;

        EntityPrehistoricFloraSphenacodon Sphenacodon = (EntityPrehistoricFloraSphenacodon) e;
        float masterSpeed = Sphenacodon.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neckbase);
        this.faceTarget(f3, f4, 5, Neckend);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        if (Sphenacodon.getAnimation() == Sphenacodon.LAY_ANIMATION) {
            this.swing(Neckbase, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.walk(Leftupperarm, 0.6F, 0.40F, true, 5, 0.30F, f2, 1F);
            this.walk(Rightupperarm, 0.6F, 0.40F, true, 8, 0.30F, f2, 1F);
            this.walk(Leftlowerarm, 0.6F, 0.25F, true, 6, 0F, f2, 1F);
            this.walk(Rightlowerarm, 0.6F, 0.25F, true, 9, 0F, f2, 1F);
            this.walk(Leftfrontfoot, 0.6F, 0.30F, true, 2, -0.10F, f2, 1F);
            this.walk(Rightfrontfoot, 0.6F, 0.30F, true, 5, -0.10F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Sphenacodon.getIsMoving()) { //Not moving
            this.swing(Neckbase, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Sphenacodon.getIsFast()) {
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

        this.swing(Neckbase, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neckbase, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        //this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSphenacodon e = (EntityPrehistoricFloraSphenacodon) entity;
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
        animator.startKeyframe(2);
        animator.rotate(this.Neckbase, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.Neckbase, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
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
        animator.rotate(this.Head, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(22), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
