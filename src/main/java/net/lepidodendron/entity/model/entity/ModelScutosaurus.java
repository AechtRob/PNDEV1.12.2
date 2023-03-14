package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraScutosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelScutosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tail1;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Scutes5;
    public AdvancedModelRendererExtended Scutes6;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Scutes3;
    public AdvancedModelRendererExtended Scutes4;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Scutes1;
    public AdvancedModelRendererExtended Scutes2;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Leftcheekfrill;
    public AdvancedModelRendererExtended Rightcheekfrill;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Jawparting1;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Jawparting2;
    public AdvancedModelRendererExtended Leftfemaletusk;
    public AdvancedModelRendererExtended Rightfemaletusk;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Nosebump;
    public AdvancedModelRendererExtended Nosehorn;
    public AdvancedModelRendererExtended Leftfrillspikes;
    public AdvancedModelRendererExtended Leftfrillspikepiece;
    public AdvancedModelRendererExtended Rightfrillspikes;
    public AdvancedModelRendererExtended Rightfrillspikepiece;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tail2;
    public AdvancedModelRendererExtended Tail3;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelScutosaurus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Upperjawback = new AdvancedModelRendererExtended(this, 64, 69);
        this.Upperjawback.setRotationPoint(0.0F, 4.599999904632568F, -5.199999809265137F);
        this.Upperjawback.addBox(-3.0F, -3.0F, -4.0F, 6, 3, 4, 0.0F);
        this.setRotateAngle(Upperjawback, -0.08482300397719036F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 80, 48);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Leftfrontfoot.addBox(-2.5F, -0.5F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.10611601718967469F, 0.021293017373673524F, 0.021293017373673524F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 60, 46);
        this.Rightlowerarm.setRotationPoint(0.10000000149011612F, 5.300000190734863F, 2.0F);
        this.Rightlowerarm.addBox(-2.0F, 0.0F, -3.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(Rightlowerarm, -1.35856422583652F, 0.27593656206399647F, -0.8278096695472326F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 80, 41);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Lowerjawmiddle.addBox(-3.0F, -3.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.08482300397719036F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 53, 0);
        this.Leftupperarm.setRotationPoint(4.199999809265137F, 8.800000190734863F, -6.300000190734863F);
        this.Leftupperarm.addBox(-1.5F, -1.0F, -1.5F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.7429866572476639F, 0.9128071854772289F, -0.38205256260891435F);
        this.Jawparting1 = new AdvancedModelRendererExtended(this, 78, 86);
        this.Jawparting1.setRotationPoint(0.009999999776482582F, 0.0F, -3.700000047683716F);
        this.Jawparting1.addBox(-3.5F, -3.0F, 0.0F, 7, 3, 4, 0.0F);
        this.setRotateAngle(Jawparting1, -0.21223203437934937F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 80, 65);
        this.Righthindfoot.setRotationPoint(0.5F, 8.100000381469727F, 2.0999999046325684F);
        this.Righthindfoot.addBox(-2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.08482300397719036F, 0.0F, 0.04241150198859518F);
        this.Rightfemaletusk = new AdvancedModelRendererExtended(this, 11, 0);
        this.Rightfemaletusk.setRotationPoint(-2.0F, -2.0F, 0.0F);
        this.Rightfemaletusk.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Rightfemaletusk, 0.7429866572476639F, -0.169820528229565F, 0.169820528229565F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 72, 0);
        this.Rightshin.setRotationPoint(0.0F, 6.0F, -0.800000011920929F);
        this.Rightshin.addBox(-1.5F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.7853981633974483F, -0.40334560078853393F, -0.5731661290180989F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 61, 33);
        this.Rightupperarm.setRotationPoint(-4.0F, 8.800000190734863F, -6.300000190734863F);
        this.Rightupperarm.addBox(-2.5F, -1.0F, -1.5F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.7429866572476639F, -0.9128071854772289F, 0.38205256260891435F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 81, 29);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerjawfront.addBox(-2.5F, -3.0F, -1.0F, 5, 2, 1, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Leftfrillspikepiece = new AdvancedModelRendererExtended(this, 0, 22);
        this.Leftfrillspikepiece.setRotationPoint(0.0F, 0.10000000149011612F, -1.0F);
        this.Leftfrillspikepiece.addBox(-1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Leftfrillspikepiece, 0.06370451936226872F, -0.31834805156902407F, 0.10611601718967469F);
        this.Neck = new AdvancedModelRendererExtended(this, 23, 0);
        this.Neck.setRotationPoint(0.0F, -0.699999988079071F, -7.5F);
        this.Neck.addBox(-3.0F, -1.5F, -7.5F, 6, 9, 8, 0.0F);
        this.setRotateAngle(Neck, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightcheekfrill = new AdvancedModelRendererExtended(this, 69, 78);
        this.Rightcheekfrill.setRotationPoint(-2.299999952316284F, 2.299999952316284F, -1.5F);
        this.Rightcheekfrill.addBox(-4.0F, -2.0F, -4.5F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Rightcheekfrill, 0.2972295835988592F, 0.1911135497644277F, -0.67928211291826F);
        this.Nosebump = new AdvancedModelRendererExtended(this, 0, 17);
        this.Nosebump.setRotationPoint(0.0F, 0.6000000238418579F, -2.799999952316284F);
        this.Nosebump.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Nosebump, -0.12740903872453743F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 68, 28);
        this.Upperjawfront.setRotationPoint(0.0F, -3.0F, -3.9000000953674316F);
        this.Upperjawfront.addBox(-2.5F, 0.0F, -1.0F, 5, 3, 1, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.04241150198859518F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRendererExtended(this, 53, 83);
        this.Headslope.setRotationPoint(0.009999999776482582F, -0.20000000298023224F, -5.900000095367432F);
        this.Headslope.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.23352505591421208F, 0.0F, 0.0F);
        this.Rightfrillspikes = new AdvancedModelRendererExtended(this, 11, 12);
        this.Rightfrillspikes.setRotationPoint(-4.099999904632568F, -1.0F, 0.5F);
        this.Rightfrillspikes.addBox(0.0F, -0.5F, -5.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Rightfrillspikes, -0.06370451936226872F, 0.33964105645913F, -0.21223203437934937F);
        this.Leftfrillspikes = new AdvancedModelRendererExtended(this, 14, 0);
        this.Leftfrillspikes.setRotationPoint(4.099999904632568F, -1.0F, 0.5F);
        this.Leftfrillspikes.addBox(-2.0F, -0.5F, -5.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Leftfrillspikes, -0.06370451936226872F, -0.33964105645913F, 0.21223203437934937F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 69);
        this.Bodymiddle.setRotationPoint(0.0F, -0.30000001192092896F, -3.5F);
        this.Bodymiddle.addBox(-6.0F, -2.0F, -13.5F, 12, 14, 14, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.1485275233394591F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRendererExtended(this, 54, 26);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 3.700000047683716F);
        this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(Tail3, -0.06370451936226872F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 23);
        this.Hips.setRotationPoint(0.0F, 6.0F, 10.0F);
        this.Hips.addBox(-5.0F, -2.0F, -4.0F, 10, 11, 10, 0.0F);
        this.setRotateAngle(Hips, -0.169820528229565F, 0.0F, 0.0F);
        this.Jawparting2 = new AdvancedModelRendererExtended(this, 86, 73);
        this.Jawparting2.setRotationPoint(0.0F, -2.799999952316284F, -1.5F);
        this.Jawparting2.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 2, 0.0F);
        this.setRotateAngle(Jawparting2, -0.12740903872453743F, 0.0F, 0.0F);
        this.Scutes4 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes4.setRotationPoint(-2.799999952316284F, -1.8600000143051147F, -12.800000190734863F);
        this.Scutes4.addBox(-2.0F, -13.0F, -1.0F, 4, 13, 1, 0.0F);
        this.setRotateAngle(Scutes4, -1.592089364974516F, 0.0F, -0.06370451936226872F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 31, 18);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail1.addBox(-3.0F, -1.5F, 0.0F, 6, 7, 4, 0.0F);
        this.setRotateAngle(Tail1, -0.31834805156902407F, 0.0F, 0.0F);
        this.Leftfemaletusk = new AdvancedModelRendererExtended(this, 1, 0);
        this.Leftfemaletusk.setRotationPoint(2.0F, -2.0F, 0.0F);
        this.Leftfemaletusk.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Leftfemaletusk, 0.7429866572476639F, 0.169820528229565F, -0.169820528229565F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 72, 14);
        this.Leftshin.setRotationPoint(0.0F, 6.0F, -0.800000011920929F);
        this.Leftshin.addBox(-2.5F, 0.0F, -0.5F, 4, 9, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.7853981633974483F, 0.40334560078853393F, 0.5731661290180989F);
        this.Leftcheekfrill = new AdvancedModelRendererExtended(this, 39, 74);
        this.Leftcheekfrill.setRotationPoint(2.299999952316284F, 2.299999952316284F, -1.5F);
        this.Leftcheekfrill.addBox(-2.0F, -2.0F, -4.5F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Leftcheekfrill, 0.2972295835988592F, -0.1911135497644277F, 0.67928211291826F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 40, 32);
        this.Leftthigh.setRotationPoint(4.5F, 4.0F, 1.5F);
        this.Leftthigh.addBox(-1.5F, -1.5F, -1.5F, 4, 8, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.27593656206399647F, -0.6368706733475028F, -0.33964105645913F);
        this.Head = new AdvancedModelRendererExtended(this, 39, 62);
        this.Head.setRotationPoint(0.0F, -1.399999976158142F, -5.5F);
        this.Head.addBox(-4.0F, -0.5F, -5.5F, 8, 5, 6, 0.0F);
        this.setRotateAngle(Head, 0.08482300397719036F, 0.0F, 0.0F);
        this.Scutes6 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes6.setRotationPoint(-1.2999999523162842F, -1.899999976158142F, -3.200000047683716F);
        this.Scutes6.addBox(-2.0F, -9.0F, -1.0F, 4, 9, 1, 0.0F);
        this.setRotateAngle(Scutes6, -1.6345008711243005F, 0.0F, -0.06370451936226872F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 63, 92);
        this.Lefthindfoot.setRotationPoint(-0.5F, 8.100000381469727F, 2.0999999046325684F);
        this.Lefthindfoot.addBox(-2.5F, -0.5F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.08482300397719036F, 0.0F, -0.04241150198859518F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 62, 59);
        this.Lowerjawback.setRotationPoint(0.0F, 4.5F, -1.5F);
        this.Lowerjawback.addBox(-4.0F, 0.0F, -4.0F, 8, 2, 4, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 45);
        this.Bodyfront.setRotationPoint(0.0F, 0.5F, -12.800000190734863F);
        this.Bodyfront.addBox(-5.0F, -2.5F, -9.0F, 10, 14, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.23352505591421208F, 0.0F, 0.0F);
        this.Scutes2 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes2.setRotationPoint(-1.2999999523162842F, -1.7999999523162842F, -8.899999618530273F);
        this.Scutes2.addBox(-2.0F, -9.0F, -1.0F, 4, 9, 1, 0.0F);
        this.setRotateAngle(Scutes2, -1.5283848206451123F, 0.0F, -0.04241150198859518F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 55, 13);
        this.Leftlowerarm.setRotationPoint(-0.10000000149011612F, 5.300000190734863F, 2.0F);
        this.Leftlowerarm.addBox(-2.0F, 0.0F, -3.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(Leftlowerarm, -1.35856422583652F, -0.27593656206399647F, 0.8278096695472326F);
        this.Scutes1 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes1.setRotationPoint(1.2999999523162842F, -1.7999999523162842F, -8.899999618530273F);
        this.Scutes1.addBox(-2.0F, -9.0F, -1.0F, 4, 9, 1, 0.0F);
        this.setRotateAngle(Scutes1, -1.5283848206451123F, 0.0F, 0.04241150198859518F);
        this.Nosehorn = new AdvancedModelRendererExtended(this, 26, 18);
        this.Nosehorn.setRotationPoint(0.0F, -0.30000001192092896F, 0.6000000238418579F);
        this.Nosehorn.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Nosehorn, -0.2972295835988592F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 80, 33);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Rightfrontfoot.addBox(-2.5F, -0.5F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.10611601718967469F, -0.021293017373673524F, -0.021293017373673524F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 39, 47);
        this.Rightthigh.setRotationPoint(-4.5F, 4.0F, 1.0F);
        this.Rightthigh.addBox(-2.5F, -1.5F, -1.5F, 4, 8, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.27593656206399647F, 0.6368706733475028F, 0.33964105645913F);
        this.Rightfrillspikepiece = new AdvancedModelRendererExtended(this, 0, 27);
        this.Rightfrillspikepiece.setRotationPoint(0.0F, 0.10000000149011612F, -1.0F);
        this.Rightfrillspikepiece.addBox(0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Rightfrillspikepiece, 0.06370451936226872F, 0.31834805156902407F, -0.10611601718967469F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 0, 5);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.799999952316284F);
        this.Tail2.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Tail2, -0.21223203437934937F, 0.0F, 0.0F);
        this.Scutes3 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes3.setRotationPoint(2.799999952316284F, -1.8600000143051147F, -12.800000190734863F);
        this.Scutes3.addBox(-2.0F, -13.0F, -1.0F, 4, 13, 1, 0.0F);
        this.setRotateAngle(Scutes3, -1.592089364974516F, 0.0F, 0.06370451936226872F);
        this.Scutes5 = new AdvancedModelRendererExtended(this, 0, 69);
        this.Scutes5.setRotationPoint(1.2999999523162842F, -1.899999976158142F, -3.200000047683716F);
        this.Scutes5.addBox(-2.0F, -9.0F, -1.0F, 4, 9, 1, 0.0F);
        this.setRotateAngle(Scutes5, -1.6345008711243005F, 0.0F, 0.04241150198859518F);
        this.Head.addChild(this.Upperjawback);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Lowerjawback.addChild(this.Jawparting1);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Lowerjawmiddle.addChild(this.Rightfemaletusk);
        this.Rightthigh.addChild(this.Rightshin);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Leftfrillspikes.addChild(this.Leftfrillspikepiece);
        this.Bodyfront.addChild(this.Neck);
        this.Head.addChild(this.Rightcheekfrill);
        this.Headslope.addChild(this.Nosebump);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Head.addChild(this.Headslope);
        this.Rightcheekfrill.addChild(this.Rightfrillspikes);
        this.Leftcheekfrill.addChild(this.Leftfrillspikes);
        this.Hips.addChild(this.Bodymiddle);
        this.Tail2.addChild(this.Tail3);
        this.Lowerjawmiddle.addChild(this.Jawparting2);
        this.Bodymiddle.addChild(this.Scutes4);
        this.Hips.addChild(this.Tail1);
        this.Lowerjawmiddle.addChild(this.Leftfemaletusk);
        this.Leftthigh.addChild(this.Leftshin);
        this.Head.addChild(this.Leftcheekfrill);
        this.Hips.addChild(this.Leftthigh);
        this.Neck.addChild(this.Head);
        this.Hips.addChild(this.Scutes6);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Head.addChild(this.Lowerjawback);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Bodyfront.addChild(this.Scutes2);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Bodyfront.addChild(this.Scutes1);
        this.Nosebump.addChild(this.Nosehorn);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Hips.addChild(this.Rightthigh);
        this.Rightfrillspikes.addChild(this.Rightfrillspikepiece);
        this.Tail1.addChild(this.Tail2);
        this.Bodymiddle.addChild(this.Scutes3);
        this.Hips.addChild(this.Scutes5);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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
        //this.Hips.offsetY = 0.125F;
        this.Hips.offsetZ = 0.1F;

        EntityPrehistoricFloraScutosaurus Scutosaurus = (EntityPrehistoricFloraScutosaurus) e;
        float masterSpeed = Scutosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        if (Scutosaurus.getAnimation() == Scutosaurus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Scutosaurus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.525F;
        if (Scutosaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.3F, true, 4, 0.25F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.3F, true, 7, -0.25F, f2, 1F);
        this.flap(Leftthigh, speed, 0.25F, false, 7, -0.20F, f2, 1F);
        this.flap(Rightthigh, speed, -0.25F, false, 4, 0.20F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.30F, true, 5, 0.20F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.30F, true, 8, 0.20F, f2, 1F);
        this.walk(Leftthigh, speed, 0.20F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.20F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.swing(Leftlowerarm, speed, -0.30F, true, 0, 0.10F, f2, 1F);
        this.swing(Rightlowerarm, speed, 0.30F, true, 3, -0.10F, f2, 1F);
        this.swing(Leftshin, speed, 0.22F, false, 0, -0.10F, f2, 1F);
        this.swing(Rightshin, speed, -0.22F, false, 3, 0.10F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 1, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 4, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 4, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 1, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Bodymiddle, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(3.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScutosaurus e = (EntityPrehistoricFloraScutosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(2);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(2);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(2);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Hips, 0 , 4,0);
        animator.rotate(this.Tail1, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Hips, (float) Math.toRadians(-18), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
