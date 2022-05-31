package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPholiderpeton;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPholiderpeton extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Hipslope;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Shoulderslope;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperjawbase;
    public AdvancedModelRendererExtended Lowerjawmidbase;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawmidfront;
    public AdvancedModelRendererExtended Lowerjawslopeback;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerjawslopemiddle;
    public AdvancedModelRendererExtended Leftlowerteeth;
    public AdvancedModelRendererExtended Rightlowerteeth;
    public AdvancedModelRendererExtended Lowerjawslopefront;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Upperjawmiddle;
    public AdvancedModelRendererExtended Snoutbase;
    public AdvancedModelRendererExtended Lefteye;
    public AdvancedModelRendererExtended Righteye;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Snoutmiddle;
    public AdvancedModelRendererExtended Leftupperteeth;
    public AdvancedModelRendererExtended Rightupperteeth;
    public AdvancedModelRendererExtended Snoutfront;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailfinbase;
    public AdvancedModelRendererExtended Tailmiddle;
    public AdvancedModelRendererExtended Tailfinmidbase;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailfinmiddle;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Tailfinmidend;
    public AdvancedModelRendererExtended Tailfinend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelPholiderpeton() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailfinmidend = new AdvancedModelRendererExtended(this, 79, 54);
        this.Tailfinmidend.setRotationPoint(0.0F, -4.800000190734863F, 0.0F);
        this.Tailfinmidend.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.Lowerjawmidfront = new AdvancedModelRendererExtended(this, 25, 5);
        this.Lowerjawmidfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmidfront.addBox(-3.0F, 0.0F, -2.0F, 6, 2, 2, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 69);
        this.Bodymiddle.setRotationPoint(0.0F, -0.8999999761581421F, -7.0F);
        this.Bodymiddle.addBox(-5.0F, -3.0F, -21.0F, 10, 10, 21, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 43, 57);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.399999976158142F, 9.0F);
        this.Tailmiddlebase.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 92, 19);
        this.Leftlowerarm.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.Leftlowerarm.addBox(-1.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.4457571069383183F, 0.169820528229565F, -0.169820528229565F);
        this.Snoutfront = new AdvancedModelRendererExtended(this, 0, 14);
        this.Snoutfront.setRotationPoint(0.0F, -2.0199999809265137F, -0.10000000149011612F);
        this.Snoutfront.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Snoutfront, 0.2972295835988592F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 57, 18);
        this.Leftfrontfoot.setRotationPoint(-0.5F, 3.799999952316284F, 0.0F);
        this.Leftfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.38205256260891435F, -0.169820528229565F, 0.31834805156902407F);
        this.Lowerjawslopemiddle = new AdvancedModelRendererExtended(this, 5, 0);
        this.Lowerjawslopemiddle.setRotationPoint(0.009999999776482582F, 3.0F, 0.0F);
        this.Lowerjawslopemiddle.addBox(-2.5F, -1.0F, -2.0F, 5, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawslopemiddle, -0.4881685797985891F, 0.0F, 0.0F);
        this.Lowerjawslopefront = new AdvancedModelRendererExtended(this, 13, 13);
        this.Lowerjawslopefront.setRotationPoint(0.0F, 1.0F, 0.10000000149011612F);
        this.Lowerjawslopefront.addBox(-2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, -0.33964105645913F, 0.0F, 0.0F);
        this.Tailfinmiddle = new AdvancedModelRendererExtended(this, 79, 58);
        this.Tailfinmiddle.setRotationPoint(-0.009999999776482582F, -4.300000190734863F, 0.0F);
        this.Tailfinmiddle.addBox(0.0F, 0.0F, 0.0F, 0, 4, 10, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 56, 30);
        this.Lefthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.33964105645913F, 0.40334560078853393F, 0.12740903872453743F);
        this.Lowerjawslopeback = new AdvancedModelRendererExtended(this, 21, 0);
        this.Lowerjawslopeback.setRotationPoint(0.0F, 3.9000000953674316F, 0.0F);
        this.Lowerjawslopeback.addBox(-3.5F, -1.0F, -3.0F, 7, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawslopeback, -0.2972295835988592F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 28);
        this.Hips.setRotationPoint(0.0F, 17.0F, 15.0F);
        this.Hips.addBox(-4.0F, -1.0F, -8.0F, 8, 7, 12, 0.0F);
        this.setRotateAngle(Hips, -0.02129301687433082F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRendererExtended(this, 65, 87);
        this.Tailmiddle.setRotationPoint(0.0F, 0.4000000059604645F, 9.0F);
        this.Tailmiddle.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 10, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 56, 24);
        this.Righthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.33964105645913F, -0.40334560078853393F, -0.12740903872453743F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 92, 44);
        this.Rightshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Rightshin.addBox(-1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Rightshin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Shoulderslope = new AdvancedModelRendererExtended(this, 29, 26);
        this.Shoulderslope.setRotationPoint(0.0F, -3.299999952316284F, 0.0F);
        this.Shoulderslope.addBox(-4.0F, 0.0F, -11.0F, 8, 2, 11, 0.0F);
        this.setRotateAngle(Shoulderslope, 0.17715091241952172F, 0.0F, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 20, 19);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.5F, -2.5999999046325684F);
        this.Lowerfrontteeth.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 0, 0.0F);
        this.Snoutmiddle = new AdvancedModelRendererExtended(this, 0, 5);
        this.Snoutmiddle.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Snoutmiddle.addBox(-2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F);
        this.setRotateAngle(Snoutmiddle, 0.42446406875869874F, 0.0F, 0.0F);
        this.Lefteye = new AdvancedModelRendererExtended(this, 0, 28);
        this.Lefteye.setRotationPoint(0.6000000238418579F, 0.6000000238418579F, -1.2999999523162842F);
        this.Lefteye.addBox(0.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lefteye, 0.0F, -0.169820528229565F, -0.33964105645913F);
        this.Head = new AdvancedModelRendererExtended(this, 71, 0);
        this.Head.setRotationPoint(0.0F, 0.5F, -11.0F);
        this.Head.addBox(-5.0F, -2.0F, -4.0F, 10, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.021293017373673524F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 71, 20);
        this.Leftupperarm.setRotationPoint(3.5F, 4.0F, -7.5F);
        this.Leftupperarm.addBox(-0.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.0F, -0.27593656206399647F, -0.1911135497644277F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 26, 10);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Lowerjawfront.addBox(-2.5F, -1.0F, -3.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.021293017373673524F, 0.0F, 0.0F);
        this.Righteye = new AdvancedModelRendererExtended(this, 0, 34);
        this.Righteye.setRotationPoint(-0.6000000238418579F, 0.6000000238418579F, -1.2999999523162842F);
        this.Righteye.addBox(-2.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Righteye, 0.0F, 0.169820528229565F, 0.33964105645913F);
        this.Tailfinbase = new AdvancedModelRendererExtended(this, 56, 40);
        this.Tailfinbase.setRotationPoint(0.0F, -2.799999952316284F, -0.019999999552965164F);
        this.Tailfinbase.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(Tailfinbase, -0.04241150198859518F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 42, 73);
        this.Tailbase.setRotationPoint(0.0F, 1.899999976158142F, 3.0F);
        this.Tailbase.addBox(-3.0F, -2.0F, 0.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(Tailbase, -0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperteeth = new AdvancedModelRendererExtended(this, 38, 17);
        this.Rightupperteeth.setRotationPoint(-2.450000047683716F, 1.5F, -1.100000023841858F);
        this.Rightupperteeth.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightupperteeth, 0.0F, -0.1911135497644277F, 0.0F);
        this.Upperjawmiddle = new AdvancedModelRendererExtended(this, 0, 9);
        this.Upperjawmiddle.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Upperjawmiddle.addBox(-3.0F, 0.0F, -2.0F, 6, 2, 2, 0.0F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 42, 0);
        this.Lowerjawback.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lowerjawback.addBox(-5.0F, 0.0F, -4.0F, 10, 4, 4, 0.0F);
        this.Upperjawbase = new AdvancedModelRendererExtended(this, 34, 16);
        this.Upperjawbase.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Upperjawbase.addBox(-4.0F, 0.0F, -3.0F, 8, 3, 3, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 82, 34);
        this.Rightthigh.setRotationPoint(-3.0F, 3.5F, 0.0F);
        this.Rightthigh.addBox(-1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.169820528229565F, 1.2524483085153861F, 0.0F);
        this.Leftupperteeth = new AdvancedModelRendererExtended(this, 23, 19);
        this.Leftupperteeth.setRotationPoint(2.450000047683716F, 1.5F, -1.100000023841858F);
        this.Leftupperteeth.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftupperteeth, 0.0F, 0.1911135497644277F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 48);
        this.Bodyfront.setRotationPoint(0.0F, 0.30000001192092896F, -20.0F);
        this.Bodyfront.addBox(-4.5F, -1.5F, -12.0F, 9, 8, 12, 0.0F);
        this.setRotateAngle(Bodyfront, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 70, 9);
        this.Rightfrontfoot.setRotationPoint(0.5F, 3.799999952316284F, 0.0F);
        this.Rightfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.38205256260891435F, 0.169820528229565F, -0.31834805156902407F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 85, 13);
        this.Rightlowerarm.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.Rightlowerarm.addBox(-0.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.4457571069383183F, -0.169820528229565F, 0.169820528229565F);
        this.Lowerjawmidbase = new AdvancedModelRendererExtended(this, 43, 9);
        this.Lowerjawmidbase.setRotationPoint(0.0F, 0.0F, -3.9000000953674316F);
        this.Lowerjawmidbase.addBox(-4.0F, 0.0F, -3.0F, 8, 3, 3, 0.0F);
        this.setRotateAngle(Lowerjawmidbase, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 65, 64);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.8999999761581421F, 9.300000190734863F);
        this.Tailmiddleend.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 81, 27);
        this.Rightupperarm.setRotationPoint(-3.5F, 4.0F, -7.5F);
        this.Rightupperarm.addBox(-4.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.021702286976569857F, 0.2717477592091949F, 0.19704767188436953F);
        this.Tailfinend = new AdvancedModelRendererExtended(this, 64, 45);
        this.Tailfinend.setRotationPoint(-0.009999999776482582F, -4.800000190734863F, 0.0F);
        this.Tailfinend.addBox(0.0F, 0.0F, 0.0F, 0, 5, 12, 0.0F);
        this.setRotateAngle(Tailfinend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 68, 30);
        this.Leftthigh.setRotationPoint(3.0F, 3.5F, 0.0F);
        this.Leftthigh.addBox(-1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.169820528229565F, -1.2524483085153861F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 0, 20);
        this.Jawparting.setRotationPoint(0.0F, 0.10000000149011612F, -3.950000047683716F);
        this.Jawparting.addBox(-4.0F, -4.0F, 0.0F, 8, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.6368706733475028F, 0.0F, 0.0F);
        this.Snoutbase = new AdvancedModelRendererExtended(this, 0, 74);
        this.Snoutbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Snoutbase.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Snoutbase, 0.3186971254089062F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 75, 76);
        this.Tailend.setRotationPoint(0.0F, 0.4000000059604645F, 8.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 0, 69);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Upperjawfront.addBox(-2.5F, -1.0F, -3.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.021293017373673524F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 27, 19);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.5F, -2.700000047683716F);
        this.Upperfrontteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 20, 14);
        this.Rightlowerteeth.setRotationPoint(-2.450000047683716F, 0.5F, -1.0F);
        this.Rightlowerteeth.addBox(0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightlowerteeth, 0.0F, -0.1911135497644277F, 0.0F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 23, 17);
        this.Leftlowerteeth.setRotationPoint(2.450000047683716F, 0.5F, -1.0F);
        this.Leftlowerteeth.addBox(0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftlowerteeth, 0.0F, 0.1911135497644277F, 0.0F);
        this.Tailfinmidbase = new AdvancedModelRendererExtended(this, 71, 43);
        this.Tailfinmidbase.setRotationPoint(0.009999999776482582F, -4.699999809265137F, 0.0F);
        this.Tailfinmidbase.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        this.setRotateAngle(Tailfinmidbase, -0.04241150198859518F, 0.0F, 0.0F);
        this.Hipslope = new AdvancedModelRendererExtended(this, 31, 41);
        this.Hipslope.setRotationPoint(0.0F, -3.799999952316284F, -8.0F);
        this.Hipslope.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 12, 0.0F);
        this.setRotateAngle(Hipslope, -0.169820528229565F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 83, 44);
        this.Leftshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Leftshin.addBox(-1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Leftshin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Tailmiddleend.addChild(this.Tailfinmidend);
        this.Lowerjawmidbase.addChild(this.Lowerjawmidfront);
        this.Hips.addChild(this.Bodymiddle);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjawfront.addChild(this.Snoutfront);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Lowerjawmidfront.addChild(this.Lowerjawslopemiddle);
        this.Lowerjawfront.addChild(this.Lowerjawslopefront);
        this.Tailmiddle.addChild(this.Tailfinmiddle);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Lowerjawmidbase.addChild(this.Lowerjawslopeback);
        this.Tailmiddlebase.addChild(this.Tailmiddle);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Bodyfront.addChild(this.Shoulderslope);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Upperjawmiddle.addChild(this.Snoutmiddle);
        this.Upperjawbase.addChild(this.Lefteye);
        this.Bodyfront.addChild(this.Head);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Lowerjawmidfront.addChild(this.Lowerjawfront);
        this.Upperjawbase.addChild(this.Righteye);
        this.Tailbase.addChild(this.Tailfinbase);
        this.Hips.addChild(this.Tailbase);
        this.Upperjawmiddle.addChild(this.Rightupperteeth);
        this.Upperjawbase.addChild(this.Upperjawmiddle);
        this.Head.addChild(this.Lowerjawback);
        this.Head.addChild(this.Upperjawbase);
        this.Hips.addChild(this.Rightthigh);
        this.Upperjawmiddle.addChild(this.Leftupperteeth);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Lowerjawback.addChild(this.Lowerjawmidbase);
        this.Tailmiddle.addChild(this.Tailmiddleend);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Tailend.addChild(this.Tailfinend);
        this.Hips.addChild(this.Leftthigh);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Upperjawbase.addChild(this.Snoutbase);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Upperjawmiddle.addChild(this.Upperjawfront);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Lowerjawmidfront.addChild(this.Rightlowerteeth);
        this.Lowerjawmidfront.addChild(this.Leftlowerteeth);
        this.Tailmiddlebase.addChild(this.Tailfinmidbase);
        this.Hips.addChild(this.Hipslope);
        this.Leftthigh.addChild(this.Leftshin);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.632f);
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
        this.Hips.offsetY = 0.485F;
        this.Hips.offsetZ = 0.45F;

        EntityPrehistoricFloraPholiderpeton Pholiderpeton = (EntityPrehistoricFloraPholiderpeton) e;

        this.faceTarget(f3, f4, 4, Head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Torso = {this.Head, this.Bodyfront, this.Bodymiddle, this.Hips};

        if (!Pholiderpeton.isReallyInWater()) {
            if (f3 == 0.0F || !Pholiderpeton.getIsMoving()) {
                return;
            }
            ////this.flap(Leftthigh, speed, 0.65F, false, -3, -0.35F, f2, 0.5F);
            this.flap(Leftthigh, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            ////this.swing(Leftthigh, speed, -0.3F, true, -1, 0.25F, f2, 0.5F);
            this.swing(Leftthigh, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(Leftshin, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Lefthindfoot, speed, 0.5F, false, 3, 0.4F, f2, 0.3F);
            //this.walk(Lefthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            //this.swing(Lefthindfoot, speed, 0.4F, false, 3, 0F, f2, 0.5F);
            this.flap(Lefthindfoot, speed, 0.5F, false, 0, 0.4F, f2, 0.3F);
            this.walk(Lefthindfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Lefthindfoot, speed, 0.4F, false, 0, 0F, f2, 0.5F);

            ////this.flap(Rightthigh, speed, -0.65F, false, 0, 0.35F, f2, 0.5F);
            this.flap(Rightthigh, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            ////this.swing(Rightthigh, speed, 0.3F, true, 2, -0.25F, f2, 0.5F);
            this.swing(Rightthigh, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(Rightshin, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Righthindfoot, speed, -0.5F, false, 6, -0.4F, f2, 0.3F);
            //this.walk(Righthindfoot, speed, 0.8F, false, 6, 0.4F, f2, 0.5F);
            //this.swing(Righthindfoot, speed, -0.4F, false, 6, 0F, f2, 0.5F);
            this.flap(Righthindfoot, speed, -0.5F, false, 3, -0.4F, f2, 0.3F);
            this.walk(Righthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            this.swing(Righthindfoot, speed, -0.4F, false, 3, 0F, f2, 0.5F);

            this.flap(Leftupperarm, speed, 0.25F, false, 0, -0.18F, f2, 0.5F);
            this.swing(Leftupperarm, speed, -0.15F, true, 2, 0.1F, f2, 0.5F);
            this.walk(Leftlowerarm, speed, -0.3F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.walk(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.swing(Leftfrontfoot, speed, 0.15F, true, 6, 0F, f2, 0.3F);
            this.flap(Leftfrontfoot, speed, 0.3F, false, -3, 0.4F, f2, 0.3F);
            this.walk(Leftfrontfoot, speed, 0.5F, false, -3, 0.4F, f2, 0.5F);
            this.swing(Leftfrontfoot, speed, 0.3F, false, -3, 0F, f2, 0.5F);

            this.flap(Rightupperarm, speed, -0.25F, false, -3, 0.18F, f2, 0.5F);
            this.swing(Rightupperarm, speed, 0.15F, true, -1, -0.1F, f2, 0.5F);
            this.walk(Rightlowerarm, speed, -0.3F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Rightfrontfoot, speed, -0.25F, true, 3, -0.2F, f2, 0.3F);
            //this.walk(Rightfrontfoot, speed, 0.25F, true, 3, 0.2F, f2, 0.3F);
            //this.swing(Rightfrontfoot, speed, -0.15F, true, 3, 0F, f2, 0.3F);
            this.flap(Rightfrontfoot, speed, -0.5F, false, 0, -0.4F, f2, 0.3F);
            this.walk(Rightfrontfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Rightfrontfoot, speed, -0.4F, false, 0, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
            this.Lefthindfoot.rotateAngleX = (float) Math.toRadians(45);
            this.Righthindfoot.rotateAngleX = (float) Math.toRadians(45);

            this.Leftthigh.rotateAngleZ= (float) Math.toRadians(30);
            this.Leftshin.rotateAngleZ= (float) Math.toRadians(-40);
            this.Leftthigh.rotateAngleY= (float) Math.toRadians(-40);
            //if (!Limnoscelis.isInWater()) {
            //    this.Leftthigh.rotateAngleX= (float) Math.toRadians(10);}
           // else {
                this.Leftthigh.rotateAngleX = (float) Math.toRadians(70);
           // }

            this.Rightthigh.rotateAngleZ= (float) Math.toRadians(-30);
            this.Rightshin.rotateAngleZ= (float) Math.toRadians(40);
            this.Rightthigh.rotateAngleY= (float) Math.toRadians(40);
            //if (!Limnoscelis.isInWater()) {
                this.Rightthigh.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
            //    this.Rightthigh.rotateAngleX= (float) Math.toRadians(70);
            //}

            this.Leftfrontfoot.rotateAngleX = (float) Math.toRadians(45);
            this.Rightfrontfoot.rotateAngleX = (float) Math.toRadians(45);

            this.Leftupperarm.rotateAngleZ= (float) Math.toRadians(30);
            //if (!Limnoscelis.isInWater()) {
            //    this.Leftupperarm.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
                this.Leftupperarm.rotateAngleX = (float) Math.toRadians(70);
            //}

            this.Rightupperarm.rotateAngleZ= (float) Math.toRadians(-30);
            //if (!Limnoscelis.isInWater()) {
            //    this.Rightupperarm.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
                this.Rightupperarm.rotateAngleX = (float) Math.toRadians(70);
            //}

            this.Leftlowerarm.rotateAngleY= (float) Math.toRadians(25);
            this.Leftlowerarm.rotateAngleZ= (float) Math.toRadians(-25);
            this.Rightlowerarm.rotateAngleY= (float) Math.toRadians(-25);
            this.Rightlowerarm.rotateAngleZ= (float) Math.toRadians(25);

            AdvancedModelRenderer[] BackL = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};
            AdvancedModelRenderer[] BackR = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
            AdvancedModelRenderer[] FrontL = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
            AdvancedModelRenderer[] FrontR = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};

            this.chainWave(BackL, speed * 0.5F, 0.3F, -3, f2, 1);
            this.chainWave(BackR, speed * 0.5F, 0.3F, 0, f2, 1);
            this.chainWave(FrontL, speed * 0.5F, 0.3F, 0, f2, 1);
            this.chainWave(FrontR, speed * 0.5F, 0.3F, -3, f2, 1);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed * 0.5F, 0.05F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
