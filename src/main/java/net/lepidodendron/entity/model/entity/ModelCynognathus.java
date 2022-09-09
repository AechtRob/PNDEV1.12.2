package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCynognathus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCynognathus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Neckmuscles;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Leftupperfang;
    public AdvancedModelRendererExtended Rightupperfang;
    public AdvancedModelRendererExtended Upperjawteeth;
    public AdvancedModelRendererExtended Lefteye;
    public AdvancedModelRendererExtended Righteye;
    public AdvancedModelRendererExtended Nose;
    public AdvancedModelRendererExtended Innernoseslope;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Lowerjawmiddleback;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Leftmasseter;
    public AdvancedModelRendererExtended Rightmasseter;
    public AdvancedModelRendererExtended Lowerjawmiddlefront;
    public AdvancedModelRendererExtended Lowerjawteeth;
    public AdvancedModelRendererExtended Lowerjawbackslope;
    public AdvancedModelRendererExtended Lowerjawmiddleslope;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Forehead;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;

    private ModelAnimator animator;

    public ModelCynognathus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftthigh = new AdvancedModelRendererExtended(this, 36, 69);
        this.Leftthigh.setRotationPoint(2.5F, 4.0F, 0.10000000149011612F);
        this.Leftthigh.addBox(-0.5F, -1.0F, -2.0F, 3, 7, 5, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 0, 8);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.0F, -0.30000001192092896F);
        this.Leftfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Leftmasseter = new AdvancedModelRendererExtended(this, 41, 82);
        this.Leftmasseter.setRotationPoint(2.490000009536743F, 0.0F, -4.0F);
        this.Leftmasseter.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(Leftmasseter, -0.38205256260891435F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 64, 49);
        this.Rightupperarm.setRotationPoint(-2.5F, 6.599999904632568F, -6.800000190734863F);
        this.Rightupperarm.addBox(-2.5F, -1.0F, -1.5F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.42446406875869874F, 0.0F, 0.0F);
        this.Lowerjawbackslope = new AdvancedModelRendererExtended(this, 38, 31);
        this.Lowerjawbackslope.setRotationPoint(0.009999999776482582F, 2.700000047683716F, -2.0F);
        this.Lowerjawbackslope.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjawbackslope, -0.10611601718967469F, 0.0F, 0.0F);
        this.Righteye = new AdvancedModelRendererExtended(this, 1, 0);
        this.Righteye.setRotationPoint(-1.600000023841858F, 1.100000023841858F, -1.850000023841858F);
        this.Righteye.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Righteye, -0.12740903872453743F, -0.04241150198859518F, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 54, 2);
        this.Lowerfrontteeth.setRotationPoint(-0.009999999776482582F, -1.7999999523162842F, -1.2999999523162842F);
        this.Lowerfrontteeth.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, -0.021293017373673524F, 0.0F, 0.0F);
        this.Neckmuscles = new AdvancedModelRendererExtended(this, 77, 0);
        this.Neckmuscles.setRotationPoint(0.0F, -1.0F, 0.30000001192092896F);
        this.Neckmuscles.addBox(-2.0F, 0.0F, -7.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Neckmuscles, -0.13980087707948743F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRendererExtended(this, 56, 60);
        this.Headslope.setRotationPoint(0.009999999776482582F, -1.5F, -4.5F);
        this.Headslope.addBox(-3.0F, -0.699999988079071F, 0.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.2972295835988592F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRendererExtended(this, 35, 15);
        this.Nose.setRotationPoint(0.0F, 2.0F, -2.700000047683716F);
        this.Nose.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Nose, 0.12740903872453743F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront = new AdvancedModelRendererExtended(this, 65, 17);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -1.600000023841858F);
        this.Lowerjawmiddlefront.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddlefront, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperfang = new AdvancedModelRendererExtended(this, 49, 4);
        this.Rightupperfang.setRotationPoint(-1.100000023841858F, 2.4000000953674316F, -6.5F);
        this.Rightupperfang.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Rightupperfang, -0.021293017373673524F, 0.0F, 0.10611601718967469F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 48, 38);
        this.Leftlowerarm.setRotationPoint(1.0F, 4.5F, 1.5F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.4881685797985891F, 0.0F, 0.0F);
        this.Lefteye = new AdvancedModelRendererExtended(this, 1, 4);
        this.Lefteye.setRotationPoint(1.600000023841858F, 1.100000023841858F, -1.850000023841858F);
        this.Lefteye.addBox(0.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Lefteye, -0.12740903872453743F, 0.04241150198859518F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 19, 16);
        this.Righthindfoot.setRotationPoint(0.0F, 5.0F, 2.0999999046325684F);
        this.Righthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Upperjawteeth = new AdvancedModelRendererExtended(this, 60, 12);
        this.Upperjawteeth.setRotationPoint(0.009999999776482582F, 2.799999952316284F, -5.400000095367432F);
        this.Upperjawteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawteeth, 0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawmiddleback = new AdvancedModelRendererExtended(this, 46, 15);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.05000000074505806F, -4.0F);
        this.Lowerjawmiddleback.addBox(-2.5F, 0.0F, -2.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddleback, 0.31834805156902407F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 82, 49);
        this.Jawparting.setRotationPoint(-0.009999999776482582F, 0.6000000238418579F, -5.300000190734863F);
        this.Jawparting.addBox(-2.5F, -4.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Jawparting, -0.33964105645913F, 0.0F, 0.0F);
        this.Lowerjawmiddleslope = new AdvancedModelRendererExtended(this, 23, 0);
        this.Lowerjawmiddleslope.setRotationPoint(-0.009999999776482582F, 2.7799999713897705F, -1.5499999523162842F);
        this.Lowerjawmiddleslope.addBox(-2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2227040165492181F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 48);
        this.Hips.setRotationPoint(0.0F, 8.0F, 11.0F);
        this.Hips.addBox(-3.5F, -0.5F, -7.0F, 7, 8, 12, 0.0F);
        this.setRotateAngle(Hips, -0.10611601852125524F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 59, 67);
        this.Leftshin.setRotationPoint(1.0F, 5.5F, -1.399999976158142F);
        this.Leftshin.addBox(-1.0F, 0.0F, -0.5F, 2, 6, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.23352505591421208F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 11, 2);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0899999141693115F, -2.9000000953674316F);
        this.Lowerjawfront.addBox(-1.5F, -2.0F, -2.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.1911135497644277F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 31, 2);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.20000000298023224F, 6.5F);
        this.Tailmiddleend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawteeth = new AdvancedModelRendererExtended(this, 60, 7);
        this.Lowerjawteeth.setRotationPoint(0.0F, 0.699999988079071F, -4.199999809265137F);
        this.Lowerjawteeth.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawteeth, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 76, 63);
        this.Leftupperarm.setRotationPoint(2.5F, 6.599999904632568F, -6.800000190734863F);
        this.Leftupperarm.addBox(-0.5F, -1.0F, -1.5F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.42446406875869874F, 0.0F, 0.0F);
        this.Leftupperfang = new AdvancedModelRendererExtended(this, 44, 4);
        this.Leftupperfang.setRotationPoint(1.100000023841858F, 2.4000000953674316F, -6.5F);
        this.Leftupperfang.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Leftupperfang, -0.021293017373673524F, 0.0F, -0.10611601718967469F);
        this.Innernoseslope = new AdvancedModelRendererExtended(this, 61, 0);
        this.Innernoseslope.setRotationPoint(0.009999999776482582F, 0.4399999976158142F, -2.0999999046325684F);
        this.Innernoseslope.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Innernoseslope, -0.2546435405291338F, 0.0F, 0.0F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 76, 19);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.Lowerjawback.addBox(-3.5F, 0.0F, -4.0F, 7, 2, 4, 0.0F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 71);
        this.Belly.setRotationPoint(0.0F, -0.30000001192092896F, -6.0F);
        this.Belly.addBox(-4.5F, -0.5F, -11.0F, 9, 10, 11, 0.0F);
        this.setRotateAngle(Belly, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 17, 5);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.10000000149011612F, 5.5F);
        this.Tailmiddlebase.addBox(-1.5F, -0.5F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.1485275233394591F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 41, 50);
        this.Rightthigh.setRotationPoint(-2.5F, 4.0F, 0.10000000149011612F);
        this.Rightthigh.addBox(-2.5F, -1.0F, -2.0F, 3, 7, 5, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 52, 82);
        this.Neck.setRotationPoint(0.0F, 0.699999988079071F, -7.0F);
        this.Neck.addBox(-3.0F, -1.0F, -7.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(Neck, -0.36093409463874954F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 78, 9);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Tailend, 0.12740903872453743F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 63, 38);
        this.Head.setRotationPoint(0.0F, 1.2000000476837158F, -4.900000095367432F);
        this.Head.addBox(-3.5F, -1.5F, -4.5F, 7, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.21223203437934937F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 33, 44);
        this.Rightlowerarm.setRotationPoint(-1.0F, 4.5F, 1.5F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.4881685797985891F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 0, 17);
        this.Tailbase.setRotationPoint(0.0F, 0.20000000298023224F, 4.5F);
        this.Tailbase.addBox(-2.5F, -0.5F, 0.0F, 5, 4, 6, 0.0F);
        this.setRotateAngle(Tailbase, -0.169820528229565F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 28);
        this.Bodyfront.setRotationPoint(0.0F, -0.10000000149011612F, -10.0F);
        this.Bodyfront.addBox(-3.5F, -0.5F, -9.0F, 7, 10, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 47, 24);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.0F, -0.30000001192092896F);
        this.Rightfrontfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Forehead = new AdvancedModelRendererExtended(this, 36, 20);
        this.Forehead.setRotationPoint(0.0F, -0.699999988079071F, 0.0F);
        this.Forehead.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Forehead, 0.21223203437934937F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 80, 27);
        this.Upperjawback.setRotationPoint(0.0F, -1.600000023841858F, -4.5F);
        this.Upperjawback.addBox(-2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Upperjawback, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 77, 77);
        this.Rightshin.setRotationPoint(-1.0F, 5.5F, -1.399999976158142F);
        this.Rightshin.addBox(-1.0F, 0.0F, -0.5F, 2, 6, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.23352505591421208F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 65, 27);
        this.Upperjawfront.setRotationPoint(0.0F, 0.029999999329447746F, -3.0F);
        this.Upperjawfront.addBox(-2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.021293017373673524F, 0.0F, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 53, 10);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.4000000059604645F, 0.05000000074505806F);
        this.Upperfrontteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 0.23352505591421208F, 0.0F, 0.0F);
        this.Rightmasseter = new AdvancedModelRendererExtended(this, 37, 90);
        this.Rightmasseter.setRotationPoint(-2.490000009536743F, 0.0F, -4.0F);
        this.Rightmasseter.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(Rightmasseter, -0.38205256260891435F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 26, 26);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.0F, 2.0999999046325684F);
        this.Lefthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Hips.addChild(this.Leftthigh);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Lowerjawback.addChild(this.Leftmasseter);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Lowerjawmiddleback.addChild(this.Lowerjawbackslope);
        this.Upperjawback.addChild(this.Righteye);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Neck.addChild(this.Neckmuscles);
        this.Head.addChild(this.Headslope);
        this.Upperjawfront.addChild(this.Nose);
        this.Lowerjawmiddleback.addChild(this.Lowerjawmiddlefront);
        this.Upperjawback.addChild(this.Rightupperfang);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjawback.addChild(this.Lefteye);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Upperjawback.addChild(this.Upperjawteeth);
        this.Lowerjawback.addChild(this.Lowerjawmiddleback);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Lowerjawmiddleback.addChild(this.Lowerjawmiddleslope);
        this.Leftthigh.addChild(this.Leftshin);
        this.Lowerjawmiddlefront.addChild(this.Lowerjawfront);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Lowerjawmiddleback.addChild(this.Lowerjawteeth);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Upperjawback.addChild(this.Leftupperfang);
        this.Nose.addChild(this.Innernoseslope);
        this.Head.addChild(this.Lowerjawback);
        this.Hips.addChild(this.Belly);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Hips.addChild(this.Rightthigh);
        this.Bodyfront.addChild(this.Neck);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Neck.addChild(this.Head);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Hips.addChild(this.Tailbase);
        this.Belly.addChild(this.Bodyfront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Headslope.addChild(this.Forehead);
        this.Head.addChild(this.Upperjawback);
        this.Rightthigh.addChild(this.Rightshin);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Innernoseslope.addChild(this.Upperfrontteeth);
        this.Lowerjawback.addChild(this.Rightmasseter);
        this.Leftshin.addChild(this.Lefthindfoot);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.595f);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(23);
        this.Neck.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Hips.offsetY = 0.61F;

        EntityPrehistoricFloraCynognathus Cynognathus = (EntityPrehistoricFloraCynognathus) e;
        float masterSpeed = Cynognathus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        if (Cynognathus.getAnimation() == Cynognathus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Cynognathus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.105F;
        if (Cynognathus.getIsFast()) {
            speed = speed * 1.9F;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(Leftthigh, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        //this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Belly, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.9), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCynognathus e = (EntityPrehistoricFloraCynognathus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(5);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Belly, 0 , 5,0);
        animator.rotate(this.Belly, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lefthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Righthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tailbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tailmiddlebase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tailmiddleend, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tailend, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
