package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnteosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAnteosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Browslope;
    public AdvancedModelRendererExtended Leftbrowhornfront;
    public AdvancedModelRendererExtended Rightbrowhornfront;
    public AdvancedModelRendererExtended Lowerjawbase;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Upperbackteeth;
    public AdvancedModelRendererExtended Leftupperfang;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Uppersecondfrontteeth;
    public AdvancedModelRendererExtended Rightupperfang;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Snoutslopebase;
    public AdvancedModelRendererExtended Snoutslopefront;
    public AdvancedModelRendererExtended Leftbrowhornback;
    public AdvancedModelRendererExtended Rightbrowhornback;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawslope;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerbackteeth;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Lowersecondfrontteeth;
    public AdvancedModelRendererExtended Leftlowerfang;
    public AdvancedModelRendererExtended Rightlowerfang;
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

    public ModelAnteosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Leftbrowhornfront = new AdvancedModelRendererExtended(this, 18, 1);
        this.Leftbrowhornfront.setRotationPoint(0.8500000238418579F, 1.7999999523162842F, -4.0F);
        this.Leftbrowhornfront.addBox(-0.5F, -3.0F, -1.600000023841858F, 1, 3, 5, 0.0F);
        this.setRotateAngle(Leftbrowhornfront, 0.9765117298066328F, 0.12740903872453743F, 0.31834805156902407F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 47, 83);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.10000000149011612F, 11.100000381469727F);
        this.Tailmiddleend.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 13, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 39, 63);
        this.Rightupperarm.setRotationPoint(-3.5F, 6.630000114440918F, -5.0F);
        this.Rightupperarm.addBox(-3.0F, -1.5F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.5678115773303856F, 0.0F, 0.10611601718967469F);
        this.Leftlowerfang = new AdvancedModelRendererExtended(this, 6, 0);
        this.Leftlowerfang.setRotationPoint(1.7000000476837158F, 0.30000001192092896F, -0.5F);
        this.Leftlowerfang.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Leftlowerfang, -0.12740903872453743F, -0.04241150198859518F, 0.04241150198859518F);
        this.Headslope = new AdvancedModelRendererExtended(this, 111, 14);
        this.Headslope.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headslope.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Headslope, -0.7853981633974483F, 0.0F, 0.0F);
        this.Rightbrowhornback = new AdvancedModelRendererExtended(this, 60, 23);
        this.Rightbrowhornback.setRotationPoint(-0.3499999940395355F, -3.0999999046325684F, 3.0999999046325684F);
        this.Rightbrowhornback.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Rightbrowhornback, -0.8702211756970171F, 0.8278096695472326F, -0.8066912015770679F);
        this.Browslope = new AdvancedModelRendererExtended(this, 98, 13);
        this.Browslope.setRotationPoint(0.0F, -2.5F, -3.0999999046325684F);
        this.Browslope.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Browslope, 0.2972295835988592F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 51, 40);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.5F, 2.200000047683716F);
        this.Lefthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.07784168530473737F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 43, 75);
        this.Leftupperarm.setRotationPoint(3.5F, 6.630000114440918F, -5.0F);
        this.Leftupperarm.addBox(-1.0F, -1.5F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.5731661290180989F, 0.0F, -0.10611601718967469F);
        this.Snoutslopebase = new AdvancedModelRendererExtended(this, 109, 7);
        this.Snoutslopebase.setRotationPoint(-0.009999999776482582F, 0.0F, -3.0F);
        this.Snoutslopebase.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snoutslopebase, 0.5307546228683145F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 66, 8);
        this.Upperjawfront.setRotationPoint(0.009999999776482582F, 0.0F, -4.0F);
        this.Upperjawfront.addBox(-2.5F, -3.0F, -3.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.31834805156902407F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 0, 15);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.699999988079071F, 9.0F);
        this.Tailmiddlebase.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 12, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.10611601718967469F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 27, 21);
        this.Tailend.setRotationPoint(0.0F, -0.20000000298023224F, 12.300000190734863F);
        this.Tailend.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 14, 0.0F);
        this.setRotateAngle(Tailend, 0.2546435405291338F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 35, 39);
        this.Rightshin.setRotationPoint(-1.0F, 7.0F, -2.299999952316284F);
        this.Rightshin.addBox(-1.5F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.46705011182842415F, 0.0F, 0.0F);
        this.Upperbackteeth = new AdvancedModelRendererExtended(this, 46, 19);
        this.Upperbackteeth.setRotationPoint(0.009999999776482582F, -0.4000000059604645F, -3.9000000953674316F);
        this.Upperbackteeth.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawslope = new AdvancedModelRendererExtended(this, 84, 19);
        this.Lowerjawslope.setRotationPoint(0.009999999776482582F, 2.0F, -2.9000000953674316F);
        this.Lowerjawslope.addBox(-2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawslope, 0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 46, 28);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.699999988079071F, -2.75F);
        this.Lowerfrontteeth.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, 0.04241150198859518F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 72, 53);
        this.Righthindfoot.setRotationPoint(0.0F, 6.5F, 2.200000047683716F);
        this.Righthindfoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.07784168530473737F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 33);
        this.Bodyfront.setRotationPoint(0.0F, 0.30000001192092896F, -10.5F);
        this.Bodyfront.addBox(-4.5F, -3.0F, -8.0F, 9, 12, 8, 0.0F);
        this.setRotateAngle(Bodyfront, 0.021293017373673524F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 23, 4);
        this.Neck.setRotationPoint(0.0F, -1.2000000476837158F, -7.699999809265137F);
        this.Neck.addBox(-3.0F, -1.5F, -6.0F, 6, 8, 7, 0.0F);
        this.setRotateAngle(Neck, -0.1911135497644277F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 79, 11);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddle.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.33964105645913F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 50, 10);
        this.Upperjawback.setRotationPoint(0.0F, 3.430000066757202F, -3.799999952316284F);
        this.Upperjawback.addBox(-2.5F, -3.0F, -4.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(Upperjawback, 0.33964105645913F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 43, 0);
        this.Head.setRotationPoint(0.0F, -0.4000000059604645F, -4.5F);
        this.Head.addBox(-4.0F, -1.5F, -4.0F, 8, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.23352505591421208F, 0.0F, 0.0F);
        this.Leftupperfang = new AdvancedModelRendererExtended(this, 0, 4);
        this.Leftupperfang.setRotationPoint(1.850000023841858F, -0.30000001192092896F, -0.6000000238418579F);
        this.Leftupperfang.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Leftupperfang, 0.1485275233394591F, -0.04241150198859518F, -0.04241150198859518F);
        this.Lowersecondfrontteeth = new AdvancedModelRendererExtended(this, 23, 23);
        this.Lowersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowersecondfrontteeth.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Lowersecondfrontteeth, -0.04241150198859518F, 0.0F, 0.0F);
        this.Snoutslopefront = new AdvancedModelRendererExtended(this, 94, 6);
        this.Snoutslopefront.setRotationPoint(0.009999999776482582F, 2.0F, -2.9000000953674316F);
        this.Snoutslopefront.addBox(-1.5F, -2.0F, -3.5F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Snoutslopefront, -0.3186971254089062F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 54);
        this.Hips.setRotationPoint(0.0F, 7.7F, 10.0F);
        this.Hips.addBox(-4.5F, -3.0F, -6.5F, 9, 10, 10, 0.0F);
        this.setRotateAngle(Hips, -0.2546435378659727F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 75, 61);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.199999809265137F, -1.7000000476837158F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 32, 52);
        this.Leftlowerarm.setRotationPoint(1.0F, 5.5F, 1.0F);
        this.Leftlowerarm.addBox(-1.5F, -1.0F, -3.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.5942845969882637F, 0.0F, 0.10611601718967469F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 53, 28);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.699999988079071F, -2.799999952316284F);
        this.Upperfrontteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 0.21223203437934937F, 0.0F, 0.0F);
        this.Rightupperfang = new AdvancedModelRendererExtended(this, 11, 0);
        this.Rightupperfang.setRotationPoint(-1.850000023841858F, -0.30000001192092896F, -0.6000000238418579F);
        this.Rightupperfang.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Rightupperfang, 0.1485275233394591F, 0.04241150198859518F, 0.04241150198859518F);
        this.Lowerjawbase = new AdvancedModelRendererExtended(this, 68, 0);
        this.Lowerjawbase.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.Lowerjawbase.addBox(-3.5F, 0.0F, -3.0F, 7, 3, 4, 0.0F);
        this.Leftbrowhornback = new AdvancedModelRendererExtended(this, 60, 19);
        this.Leftbrowhornback.setRotationPoint(0.3499999940395355F, -3.0999999046325684F, 3.0999999046325684F);
        this.Leftbrowhornback.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Leftbrowhornback, -0.8702211756970171F, -0.8278096695472326F, 0.8066912015770679F);
        this.Rightlowerfang = new AdvancedModelRendererExtended(this, 1, 0);
        this.Rightlowerfang.setRotationPoint(-1.7000000476837158F, 0.30000001192092896F, -0.5F);
        this.Rightlowerfang.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Rightlowerfang, -0.12740903872453743F, 0.04241150198859518F, -0.04241150198859518F);
        this.Uppersecondfrontteeth = new AdvancedModelRendererExtended(this, 23, 20);
        this.Uppersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -1.7000000476837158F);
        this.Uppersecondfrontteeth.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Uppersecondfrontteeth, 0.169820528229565F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 67, 80);
        this.Leftthigh.setRotationPoint(4.5F, 2.559999942779541F, -0.5F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -2.5F, 4, 9, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.12740903872453743F, -0.06370451936226872F, -0.021293017373673524F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 45, 52);
        this.Rightlowerarm.setRotationPoint(-1.0F, 5.5F, 1.0F);
        this.Rightlowerarm.addBox(-1.5F, -1.0F, -3.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5942845969882637F, 0.0F, -0.12740903872453743F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 58, 51);
        this.Leftshin.setRotationPoint(1.0F, 7.0F, -2.299999952316284F);
        this.Leftshin.addBox(-1.5F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.46705011182842415F, 0.0F, 0.0F);
        this.Lowerbackteeth = new AdvancedModelRendererExtended(this, 47, 24);
        this.Lowerbackteeth.setRotationPoint(0.0F, 0.30000001192092896F, -3.0F);
        this.Lowerbackteeth.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(Lowerbackteeth, -0.2972295835988592F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 91, 0);
        this.Lowerjawfront.setRotationPoint(-0.009999999776482582F, 0.0F, -3.450000047683716F);
        this.Lowerjawfront.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.27593656206399647F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 75);
        this.Bodymiddle.setRotationPoint(0.0F, -0.5F, -5.5F);
        this.Bodymiddle.addBox(-5.5F, -3.0F, -11.5F, 11, 13, 12, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.2546435405291338F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 59, 19);
        this.Tailbase.setRotationPoint(0.0F, -0.8999999761581421F, 2.9000000953674316F);
        this.Tailbase.addBox(-3.5F, -1.5F, 0.0F, 7, 6, 10, 0.0F);
        this.setRotateAngle(Tailbase, -0.21223203437934937F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 60, 64);
        this.Rightthigh.setRotationPoint(-4.5F, 2.559999942779541F, -0.5F);
        this.Rightthigh.addBox(-3.0F, -1.5F, -2.5F, 4, 9, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.12740903872453743F, 0.06370451936226872F, 0.021293017373673524F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 108, 0);
        this.Jawparting.setRotationPoint(0.0F, 0.0F, -2.8499999046325684F);
        this.Jawparting.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.5003858978783547F, 0.0F, 0.0F);
        this.Rightbrowhornfront = new AdvancedModelRendererExtended(this, 0, 6);
        this.Rightbrowhornfront.setRotationPoint(-0.8500000238418579F, 1.7999999523162842F, -4.0F);
        this.Rightbrowhornfront.addBox(-0.5F, -3.0F, -1.600000023841858F, 1, 3, 5, 0.0F);
        this.setRotateAngle(Rightbrowhornfront, 0.9765117298066328F, -0.12740903872453743F, -0.31834805156902407F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 72, 36);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.199999809265137F, -1.7000000476837158F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Head.addChild(this.Leftbrowhornfront);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Lowerjawfront.addChild(this.Leftlowerfang);
        this.Browslope.addChild(this.Headslope);
        this.Rightbrowhornfront.addChild(this.Rightbrowhornback);
        this.Head.addChild(this.Browslope);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Browslope.addChild(this.Snoutslopebase);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Rightthigh.addChild(this.Rightshin);
        this.Upperjawback.addChild(this.Upperbackteeth);
        this.Lowerjawbase.addChild(this.Lowerjawslope);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Bodyfront.addChild(this.Neck);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Head.addChild(this.Upperjawback);
        this.Neck.addChild(this.Head);
        this.Upperjawfront.addChild(this.Leftupperfang);
        this.Lowerjawfront.addChild(this.Lowersecondfrontteeth);
        this.Snoutslopebase.addChild(this.Snoutslopefront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Upperjawfront.addChild(this.Rightupperfang);
        this.Head.addChild(this.Lowerjawbase);
        this.Leftbrowhornfront.addChild(this.Leftbrowhornback);
        this.Lowerjawfront.addChild(this.Rightlowerfang);
        this.Upperjawfront.addChild(this.Uppersecondfrontteeth);
        this.Hips.addChild(this.Leftthigh);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Leftthigh.addChild(this.Leftshin);
        this.Lowerjawmiddle.addChild(this.Lowerbackteeth);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Hips.addChild(this.Bodymiddle);
        this.Hips.addChild(this.Tailbase);
        this.Hips.addChild(this.Rightthigh);
        this.Lowerjawbase.addChild(this.Jawparting);
        this.Head.addChild(this.Rightbrowhornfront);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 1.08f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Lowerjawbase.rotateAngleX = (float)Math.toRadians(45);
        this.Head.rotateAngleX = (float)Math.toRadians(-15);
        this.Neck.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.Hips.offsetY = -0.1F;

        EntityPrehistoricFloraAnteosaurus Anteosaurus = (EntityPrehistoricFloraAnteosaurus) e;
        float masterSpeed = Anteosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        if (Anteosaurus.getAnimation() == Anteosaurus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Anteosaurus.getAnimation() == Anteosaurus.GRAPPLE_ANIMATION) {
            this.chainSwing(Tail, 0.4F, 0.10F, 0.12F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Anteosaurus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Anteosaurus.getIsFast()) {
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

        if (Anteosaurus.getAnimation() != Anteosaurus.ATTACK_ANIMATION
                && Anteosaurus.getAnimation() != Anteosaurus.EAT_ANIMATION) {
            this.swing(Neck, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neck, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }

        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnteosaurus e = (EntityPrehistoricFloraAnteosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(40), (float) Math.toRadians(23.0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(36.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.rotate(this.Neck, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(55.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.Neck, (float) Math.toRadians(-30), (float) Math.toRadians(-23.0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-46), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(55.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(-6), (float) Math.toRadians(0.0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(14), (float) Math.toRadians(0.0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(14), (float) Math.toRadians(0.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(5);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

        animator.setAnimation(e.GRAPPLE_ANIMATION); //200-ish
        animator.startKeyframe(10); //hunch
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20); //up to tick 30: 120 tick left
        animator.startKeyframe(10); //do a little jump up:
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(10); //ground pos
        animator.startKeyframe(10); //and hunch again, this time with a head sway
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10); //up to tick 60: 90 tick left
        animator.startKeyframe(4); //Sway head threaten
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4); //Sway head threaten
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4); //Sway head threaten
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(20), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4); //Sway head threaten
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1); //up to tick 80, 70 ticks left
        animator.startKeyframe(5); //do another little jump up:
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(5); //ground pos
        animator.startKeyframe(10); //and hunch again, this time with a roar //110
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(10); //with a roar....
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10); // 110 ticks, 40 left
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.Head, 0,0,-0.5F);
        animator.endKeyframe();
        animator.setStaticKeyframe(25); //20 ticks left
        animator.resetKeyframe(5); //ambient
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5); //headbut
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(10.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(10.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);
    }
}
