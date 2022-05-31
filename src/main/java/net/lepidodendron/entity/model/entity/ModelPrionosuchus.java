package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPrionosuchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrionosuchus extends AdvancedModelBaseExtended {
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
    public AdvancedModelRendererExtended Eyeportion;
    public AdvancedModelRendererExtended Leftupperlip1;
    public AdvancedModelRendererExtended Rightupperlip1;
    public AdvancedModelRendererExtended Lowerjawbase;
    public AdvancedModelRendererExtended Leftgills;
    public AdvancedModelRendererExtended Rightgills;
    public AdvancedModelRendererExtended Upperjaw1;
    public AdvancedModelRendererExtended Lefteye;
    public AdvancedModelRendererExtended Righteye;
    public AdvancedModelRendererExtended Upperjaw2;
    public AdvancedModelRendererExtended Upperjawslope1;
    public AdvancedModelRendererExtended Upperjawslope2;
    public AdvancedModelRendererExtended Leftupperteeth2;
    public AdvancedModelRendererExtended Rightupperteeth2;
    public AdvancedModelRendererExtended Leftupperlip2;
    public AdvancedModelRendererExtended Leftupperteeth1;
    public AdvancedModelRendererExtended Leftupperlip3;
    public AdvancedModelRendererExtended Rightupperlip2;
    public AdvancedModelRendererExtended Rightupperteeth1;
    public AdvancedModelRendererExtended Rightupperlip3;
    public AdvancedModelRendererExtended Lowerjawmiddlebase;
    public AdvancedModelRendererExtended Leftlowerlip1;
    public AdvancedModelRendererExtended Rightlowerlip1;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawmiddlefront;
    public AdvancedModelRendererExtended Lowerjawslope1;
    public AdvancedModelRendererExtended Leftlowerteeth1;
    public AdvancedModelRendererExtended Rightlowerteeth1;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Leftlowerlip3;
    public AdvancedModelRendererExtended Rightlowerlip3;
    public AdvancedModelRendererExtended Leftlowerteeth2;
    public AdvancedModelRendererExtended Rightlowerteeth2;
    public AdvancedModelRendererExtended Lowerjawslope2;
    public AdvancedModelRendererExtended Leftlowerlip2;
    public AdvancedModelRendererExtended Rightlowerlip2;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailfindorsal1;
    public AdvancedModelRendererExtended Tailfinventral1;
    public AdvancedModelRendererExtended Tailmiddle;
    public AdvancedModelRendererExtended Tailfindorsal2;
    public AdvancedModelRendererExtended Tailfinventral2;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailfindorsal3;
    public AdvancedModelRendererExtended Tailfinventral3;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Tailfindorsal4;
    public AdvancedModelRendererExtended Tailfinventral4;
    public AdvancedModelRendererExtended Tailfinend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelPrionosuchus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 42, 5);
        this.Lefthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Lefthindfoot.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.33964105645913F, 0.40334560078853393F, 0.021293017373673524F);
        this.Upperjaw2 = new AdvancedModelRendererExtended(this, 0, 79);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw2.addBox(-0.5F, -1.0F, -9.0F, 1, 1, 9, 0.0F);
        this.Tailmiddle = new AdvancedModelRendererExtended(this, 60, 87);
        this.Tailmiddle.setRotationPoint(0.0F, 0.0F, 7.300000190734863F);
        this.Tailmiddle.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 9, 0.0F);
        this.setRotateAngle(Tailmiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 76, 53);
        this.Neck.setRotationPoint(0.0F, -0.6000000238418579F, -12.0F);
        this.Neck.addBox(-3.5F, -1.0F, -4.0F, 7, 6, 5, 0.0F);
        this.setRotateAngle(Neck, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperlip2 = new AdvancedModelRendererExtended(this, 0, 31);
        this.Rightupperlip2.setRotationPoint(0.0F, 1.9900000095367432F, -4.0F);
        this.Rightupperlip2.addBox(0.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rightupperlip2, 0.0F, 0.04241150198859518F, 0.0F);
        this.Tailfindorsal1 = new AdvancedModelRendererExtended(this, 51, 40);
        this.Tailfindorsal1.setRotationPoint(0.0F, -0.30000001192092896F, 0.20000000298023224F);
        this.Tailfindorsal1.addBox(0.0F, -2.0F, 0.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(Tailfindorsal1, 0.21223203437934937F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 53, 0);
        this.Leftupperarm.setRotationPoint(3.5F, 3.700000047683716F, -10.699999809265137F);
        this.Leftupperarm.addBox(-0.20000000298023224F, -0.20000000298023224F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.0F, -0.27593656206399647F, -0.1911135497644277F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 88, 6);
        this.Rightthigh.setRotationPoint(-2.5F, 1.25F, 0.30000001192092896F);
        this.Rightthigh.addBox(-1.0F, -0.5F, -2.5F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rightthigh, -0.21223203437934937F, 1.273566776485551F, -0.06370451936226872F);
        this.Leftupperlip1 = new AdvancedModelRendererExtended(this, 0, 43);
        this.Leftupperlip1.setRotationPoint(3.5F, -0.019999999552965164F, -2.200000047683716F);
        this.Leftupperlip1.addBox(-3.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Leftupperlip1, 0.0F, 0.38205256260891435F, 0.0F);
        this.Tailfinventral4 = new AdvancedModelRendererExtended(this, 53, 23);
        this.Tailfinventral4.setRotationPoint(-0.009999999776482582F, 1.7999999523162842F, 0.0F);
        this.Tailfinventral4.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(Tailfinventral4, 0.08482300397719036F, 0.0F, 0.0F);
        this.Upperjaw1 = new AdvancedModelRendererExtended(this, 0, 59);
        this.Upperjaw1.setRotationPoint(0.0F, 2.700000047683716F, -2.0F);
        this.Upperjaw1.addBox(-1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Upperjaw1, -0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawslope1 = new AdvancedModelRendererExtended(this, 45, 81);
        this.Lowerjawslope1.setRotationPoint(0.009999999776482582F, 2.0F, -3.0F);
        this.Lowerjawslope1.addBox(-1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawslope1, -0.169820528229565F, 0.0F, 0.0F);
        this.Tailfindorsal4 = new AdvancedModelRendererExtended(this, 53, 19);
        this.Tailfindorsal4.setRotationPoint(-0.009999999776482582F, -0.800000011920929F, 0.0F);
        this.Tailfindorsal4.addBox(0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F);
        this.setRotateAngle(Tailfindorsal4, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightupperteeth2 = new AdvancedModelRendererExtended(this, 12, 86);
        this.Rightupperteeth2.setRotationPoint(-0.4000000059604645F, -0.5F, -5.300000190734863F);
        this.Rightupperteeth2.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightupperteeth2, 0.0F, -0.015707962851830046F, 0.0F);
        this.Rightlowerteeth1 = new AdvancedModelRendererExtended(this, 12, 90);
        this.Rightlowerteeth1.setRotationPoint(-1.7000000476837158F, 0.5F, -3.299999952316284F);
        this.Rightlowerteeth1.addBox(0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightlowerteeth1, 0.0F, -0.33964105645913F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 62, 0);
        this.Leftfrontfoot.setRotationPoint(-0.20000000298023224F, 1.0F, 0.0F);
        this.Leftfrontfoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.38205256260891435F, -0.169820528229565F, 0.31834805156902407F);
        this.Rightupperteeth1 = new AdvancedModelRendererExtended(this, 12, 79);
        this.Rightupperteeth1.setRotationPoint(0.10000000149011612F, 1.5F, -5.099999904632568F);
        this.Rightupperteeth1.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightupperteeth1, 0.0F, 0.04241150198859518F, 0.0F);
        this.Leftlowerlip2 = new AdvancedModelRendererExtended(this, 45, 68);
        this.Leftlowerlip2.setRotationPoint(0.0F, -0.009999999776482582F, -4.0F);
        this.Leftlowerlip2.addBox(-2.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Leftlowerlip2, 0.0F, -0.04241150198859518F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 52, 10);
        this.Rightshin.setRotationPoint(0.0F, 0.5F, -2.299999952316284F);
        this.Rightshin.addBox(-0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Rightshin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Tailfinend = new AdvancedModelRendererExtended(this, 54, 8);
        this.Tailfinend.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailfinend.addBox(0.0F, -3.5F, 0.0F, 0, 6, 12, 0.0F);
        this.Rightupperlip3 = new AdvancedModelRendererExtended(this, 0, 21);
        this.Rightupperlip3.setRotationPoint(0.0F, 0.009999999776482582F, -3.0F);
        this.Rightupperlip3.addBox(0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Rightupperlip3, 0.0F, 0.169820528229565F, 0.0F);
        this.Rightlowerteeth2 = new AdvancedModelRendererExtended(this, 12, 75);
        this.Rightlowerteeth2.setRotationPoint(-0.30000001192092896F, 0.5F, -4.0F);
        this.Rightlowerteeth2.addBox(0.0F, -1.0F, -4.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Rightlowerteeth2, 0.0F, -0.021293017373673524F, 0.0F);
        this.Leftupperteeth1 = new AdvancedModelRendererExtended(this, 12, 77);
        this.Leftupperteeth1.setRotationPoint(-0.10000000149011612F, 1.5F, -5.099999904632568F);
        this.Leftupperteeth1.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftupperteeth1, 0.0F, -0.04241150198859518F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 0, 66);
        this.Jawparting.setRotationPoint(0.0F, 0.20000000298023224F, -2.0999999046325684F);
        this.Jawparting.addBox(-3.0F, -3.0F, 0.0F, 6, 3, 2, 0.0F);
        this.setRotateAngle(Jawparting, -0.33964105645913F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 0, 90);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.009999999776482582F, -2.5999999046325684F);
        this.Lowerjawfront.addBox(-0.5F, 0.0F, -9.0F, 1, 1, 9, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 70, 20);
        this.Hips.setRotationPoint(0.0F, 19.5F, 11.5F);
        this.Hips.addBox(-3.0F, -3.0F, -5.5F, 6, 6, 9, 0.0F);
        this.setRotateAngle(Hips, -0.06370451769779302F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 42, 0);
        this.Righthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Righthindfoot.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.33964105645913F, -0.40334560078853393F, -0.021293017373673524F);
        this.Leftlowerlip3 = new AdvancedModelRendererExtended(this, 45, 63);
        this.Leftlowerlip3.setRotationPoint(1.0F, 0.019999999552965164F, -3.0F);
        this.Leftlowerlip3.addBox(-1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Leftlowerlip3, 0.0F, 0.169820528229565F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 62, 4);
        this.Rightfrontfoot.setRotationPoint(0.20000000298023224F, 1.0F, 0.0F);
        this.Rightfrontfoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.38205256260891435F, 0.169820528229565F, -0.31834805156902407F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 64, 8);
        this.Rightlowerarm.setRotationPoint(-1.899999976158142F, 0.5F, 0.0F);
        this.Rightlowerarm.addBox(-0.30000001192092896F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.4457571069383183F, -0.169820528229565F, 0.169820528229565F);
        this.Tailfindorsal3 = new AdvancedModelRendererExtended(this, 51, 25);
        this.Tailfindorsal3.setRotationPoint(0.0F, -1.100000023841858F, 0.0F);
        this.Tailfindorsal3.addBox(0.0F, -3.0F, 0.0F, 0, 3, 9, 0.0F);
        this.setRotateAngle(Tailfindorsal3, -0.021293017373673524F, 0.0F, 0.0F);
        this.Leftupperteeth2 = new AdvancedModelRendererExtended(this, 12, 73);
        this.Leftupperteeth2.setRotationPoint(0.4000000059604645F, -0.5F, -5.300000190734863F);
        this.Leftupperteeth2.addBox(0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftupperteeth2, 0.0F, 0.015707962851830046F, 0.0F);
        this.Rightlowerlip2 = new AdvancedModelRendererExtended(this, 37, 71);
        this.Rightlowerlip2.setRotationPoint(0.0F, -0.009999999776482582F, -4.0F);
        this.Rightlowerlip2.addBox(0.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Rightlowerlip2, 0.0F, 0.04241150198859518F, 0.0F);
        this.Tailfinventral1 = new AdvancedModelRendererExtended(this, 51, 44);
        this.Tailfinventral1.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.Tailfinventral1.addBox(0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F);
        this.setRotateAngle(Tailfinventral1, -0.169820528229565F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 66, 62);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 7.5F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Tailend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Leftlowerlip1 = new AdvancedModelRendererExtended(this, 33, 76);
        this.Leftlowerlip1.setRotationPoint(3.5F, 0.019999999552965164F, -2.200000047683716F);
        this.Leftlowerlip1.addBox(-3.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Leftlowerlip1, 0.0F, 0.38205256260891435F, 0.0F);
        this.Lowerjawmiddlefront = new AdvancedModelRendererExtended(this, 37, 83);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddlefront.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 68, 36);
        this.Bodymiddle.setRotationPoint(0.0F, -0.8999999761581421F, -4.5F);
        this.Bodymiddle.addBox(-3.5F, -2.5F, -9.0F, 7, 7, 9, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.06370451936226872F, 0.0F, 0.0F);
        this.Upperjawslope1 = new AdvancedModelRendererExtended(this, 13, 61);
        this.Upperjawslope1.setRotationPoint(-0.009999999776482582F, -2.0F, -4.0F);
        this.Upperjawslope1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawslope1, 0.19984019602439934F, 0.0F, 0.0F);
        this.Tailfinventral2 = new AdvancedModelRendererExtended(this, 51, 36);
        this.Tailfinventral2.setRotationPoint(-0.009999999776482582F, 2.0F, 0.0F);
        this.Tailfinventral2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(Tailfinventral2, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 63, 74);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.0F, 8.300000190734863F);
        this.Tailmiddleend.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 8, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 59, 0);
        this.Bodyfront.setRotationPoint(0.0F, -0.6000000238418579F, -8.0F);
        this.Bodyfront.addBox(-4.0F, -2.0F, -12.0F, 8, 7, 12, 0.0F);
        this.setRotateAngle(Bodyfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Eyeportion = new AdvancedModelRendererExtended(this, 17, 66);
        this.Eyeportion.setRotationPoint(0.0F, -0.8999999761581421F, -3.0F);
        this.Eyeportion.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Eyeportion, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftupperlip3 = new AdvancedModelRendererExtended(this, 0, 26);
        this.Leftupperlip3.setRotationPoint(0.0F, 0.009999999776482582F, -3.0F);
        this.Leftupperlip3.addBox(-1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Leftupperlip3, 0.0F, -0.169820528229565F, 0.0F);
        this.Rightgills = new AdvancedModelRendererExtended(this, 1, 1);
        this.Rightgills.setRotationPoint(-3.5F, 0.5F, 0.0F);
        this.Rightgills.addBox(-3.0F, -2.5F, 0.0F, 3, 5, 0, 0.0F);
        this.setRotateAngle(Rightgills, 0.0F, 0.9339256534473936F, 0.0F);
        this.Lowerjawmiddlebase = new AdvancedModelRendererExtended(this, 44, 87);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, -0.009999999776482582F, -3.0F);
        this.Lowerjawmiddlebase.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.Rightupperlip1 = new AdvancedModelRendererExtended(this, 0, 50);
        this.Rightupperlip1.setRotationPoint(-3.5F, -0.009999999776482582F, -2.200000047683716F);
        this.Rightupperlip1.addBox(0.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Rightupperlip1, 0.0F, -0.38205256260891435F, 0.0F);
        this.Tailfindorsal2 = new AdvancedModelRendererExtended(this, 51, 33);
        this.Tailfindorsal2.setRotationPoint(0.009999999776482582F, -1.7999999523162842F, 0.0F);
        this.Tailfindorsal2.addBox(0.0F, -2.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(Tailfindorsal2, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 76, 65);
        this.Tailbase.setRotationPoint(0.0F, -0.5F, 2.9000000953674316F);
        this.Tailbase.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 7, 0.0F);
        this.Leftgills = new AdvancedModelRendererExtended(this, 1, 7);
        this.Leftgills.setRotationPoint(3.5F, 0.5F, 0.0F);
        this.Leftgills.addBox(0.0F, -2.5F, 0.0F, 3, 5, 0, 0.0F);
        this.setRotateAngle(Leftgills, 0.0F, -0.9339256534473936F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 76, 78);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.009999999776482582F, 6.300000190734863F);
        this.Tailmiddlebase.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 53, 4);
        this.Rightupperarm.setRotationPoint(-3.5F, 3.700000047683716F, -10.699999809265137F);
        this.Rightupperarm.addBox(-1.7999999523162842F, -0.20000000298023224F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.0F, 0.27593656206399647F, 0.1911135497644277F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 57, 8);
        this.Leftlowerarm.setRotationPoint(1.899999976158142F, 0.5F, 0.0F);
        this.Leftlowerarm.addBox(-0.699999988079071F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.4457571069383183F, 0.169820528229565F, -0.169820528229565F);
        this.Leftlowerteeth2 = new AdvancedModelRendererExtended(this, 12, 88);
        this.Leftlowerteeth2.setRotationPoint(0.4000000059604645F, 0.5F, -4.099999904632568F);
        this.Leftlowerteeth2.addBox(0.0F, -1.0F, -4.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftlowerteeth2, 0.0F, 0.021293017373673524F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 72);
        this.Head.setRotationPoint(0.009999999776482582F, 0.20000000298023224F, -3.0F);
        this.Head.addBox(-3.5F, -1.0F, -3.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.04241150198859518F, 0.0F, 0.0F);
        this.Leftupperlip2 = new AdvancedModelRendererExtended(this, 0, 37);
        this.Leftupperlip2.setRotationPoint(0.0F, 1.9900000095367432F, -4.0F);
        this.Leftupperlip2.addBox(-2.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Leftupperlip2, 0.0F, -0.04241150198859518F, 0.0F);
        this.Rightlowerlip1 = new AdvancedModelRendererExtended(this, 44, 73);
        this.Rightlowerlip1.setRotationPoint(-3.5F, 0.009999999776482582F, -2.200000047683716F);
        this.Rightlowerlip1.addBox(0.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Rightlowerlip1, 0.0F, -0.38205256260891435F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 88, 0);
        this.Leftthigh.setRotationPoint(2.5F, 1.25F, 0.30000001192092896F);
        this.Leftthigh.addBox(-1.0F, -0.5F, -2.5F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Leftthigh, -0.21223203437934937F, -1.273566776485551F, 0.06370451936226872F);
        this.Tailfinventral3 = new AdvancedModelRendererExtended(this, 51, 29);
        this.Tailfinventral3.setRotationPoint(0.0F, 2.299999952316284F, 0.0F);
        this.Tailfinventral3.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
        this.setRotateAngle(Tailfinventral3, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawslope2 = new AdvancedModelRendererExtended(this, 36, 88);
        this.Lowerjawslope2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Lowerjawslope2.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjawslope2, 0.07260569421980302F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 45, 10);
        this.Leftshin.setRotationPoint(0.0F, 0.5F, -2.299999952316284F);
        this.Leftshin.addBox(-0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Leftshin, -0.1485275233394591F, 0.0F, 0.0F);
        this.Rightlowerlip3 = new AdvancedModelRendererExtended(this, 39, 66);
        this.Rightlowerlip3.setRotationPoint(-1.0F, 0.019999999552965164F, -3.0F);
        this.Rightlowerlip3.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Rightlowerlip3, 0.0F, -0.169820528229565F, 0.0F);
        this.Leftlowerteeth1 = new AdvancedModelRendererExtended(this, 12, 84);
        this.Leftlowerteeth1.setRotationPoint(1.7000000476837158F, 0.5F, -3.299999952316284F);
        this.Leftlowerteeth1.addBox(0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F);
        this.setRotateAngle(Leftlowerteeth1, 0.0F, 0.33964105645913F, 0.0F);
        this.Righteye = new AdvancedModelRendererExtended(this, 18, 57);
        this.Righteye.setRotationPoint(0.4000000059604645F, 0.0F, -1.899999976158142F);
        this.Righteye.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Righteye, 0.0F, 0.21223203437934937F, 0.2546435405291338F);
        this.Lowerjawbase = new AdvancedModelRendererExtended(this, 36, 95);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lowerjawbase.addBox(-3.5F, 0.0F, -3.0F, 7, 2, 3, 0.0F);
        this.Upperjawslope2 = new AdvancedModelRendererExtended(this, 21, 82);
        this.Upperjawslope2.setRotationPoint(0.009999999776482582F, -1.0F, -5.900000095367432F);
        this.Upperjawslope2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Upperjawslope2, 0.1663298730545277F, 0.0F, 0.0F);
        this.Lefteye = new AdvancedModelRendererExtended(this, 9, 57);
        this.Lefteye.setRotationPoint(-0.4000000059604645F, 0.0F, -1.899999976158142F);
        this.Lefteye.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Lefteye, -0.08482300397719036F, -0.21223203437934937F, -0.2546435405291338F);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Tailmiddlebase.addChild(this.Tailmiddle);
        this.Bodyfront.addChild(this.Neck);
        this.Rightupperlip1.addChild(this.Rightupperlip2);
        this.Tailbase.addChild(this.Tailfindorsal1);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Hips.addChild(this.Rightthigh);
        this.Head.addChild(this.Leftupperlip1);
        this.Tailmiddleend.addChild(this.Tailfinventral4);
        this.Eyeportion.addChild(this.Upperjaw1);
        this.Lowerjawmiddlebase.addChild(this.Lowerjawslope1);
        this.Tailmiddleend.addChild(this.Tailfindorsal4);
        this.Upperjaw2.addChild(this.Rightupperteeth2);
        this.Lowerjawmiddlebase.addChild(this.Rightlowerteeth1);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightupperlip1.addChild(this.Rightupperteeth1);
        this.Leftlowerlip1.addChild(this.Leftlowerlip2);
        this.Rightthigh.addChild(this.Rightshin);
        this.Tailend.addChild(this.Tailfinend);
        this.Rightupperlip2.addChild(this.Rightupperlip3);
        this.Lowerjawfront.addChild(this.Rightlowerteeth2);
        this.Leftupperlip1.addChild(this.Leftupperteeth1);
        this.Lowerjawbase.addChild(this.Jawparting);
        this.Lowerjawmiddlefront.addChild(this.Lowerjawfront);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Lowerjawmiddlefront.addChild(this.Leftlowerlip3);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Tailmiddle.addChild(this.Tailfindorsal3);
        this.Upperjaw2.addChild(this.Leftupperteeth2);
        this.Rightlowerlip1.addChild(this.Rightlowerlip2);
        this.Tailbase.addChild(this.Tailfinventral1);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Lowerjawbase.addChild(this.Leftlowerlip1);
        this.Lowerjawmiddlebase.addChild(this.Lowerjawmiddlefront);
        this.Hips.addChild(this.Bodymiddle);
        this.Upperjaw1.addChild(this.Upperjawslope1);
        this.Tailmiddlebase.addChild(this.Tailfinventral2);
        this.Tailmiddle.addChild(this.Tailmiddleend);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Head.addChild(this.Eyeportion);
        this.Leftupperlip2.addChild(this.Leftupperlip3);
        this.Head.addChild(this.Rightgills);
        this.Lowerjawbase.addChild(this.Lowerjawmiddlebase);
        this.Head.addChild(this.Rightupperlip1);
        this.Tailmiddlebase.addChild(this.Tailfindorsal2);
        this.Hips.addChild(this.Tailbase);
        this.Head.addChild(this.Leftgills);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Lowerjawfront.addChild(this.Leftlowerteeth2);
        this.Neck.addChild(this.Head);
        this.Leftupperlip1.addChild(this.Leftupperlip2);
        this.Lowerjawbase.addChild(this.Rightlowerlip1);
        this.Hips.addChild(this.Leftthigh);
        this.Tailmiddle.addChild(this.Tailfinventral3);
        this.Lowerjawslope1.addChild(this.Lowerjawslope2);
        this.Leftthigh.addChild(this.Leftshin);
        this.Lowerjawmiddlefront.addChild(this.Rightlowerlip3);
        this.Lowerjawmiddlebase.addChild(this.Leftlowerteeth1);
        this.Eyeportion.addChild(this.Righteye);
        this.Head.addChild(this.Lowerjawbase);
        this.Upperjaw2.addChild(this.Upperjawslope2);
        this.Eyeportion.addChild(this.Lefteye);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 1.455f);
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
        this.Hips.offsetY = -0.7F;
        this.Hips.offsetZ = 0.75F;

        EntityPrehistoricFloraPrionosuchus Prionosuchus = (EntityPrehistoricFloraPrionosuchus) e;

        this.faceTarget(f3, f4, 2, Head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Torso = {this.Head, this.Neck, this.Bodyfront, this.Bodymiddle, this.Hips};

        if (!Prionosuchus.isReallyInWater()) {
            if (f3 == 0.0F || !Prionosuchus.getIsMoving()) {
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

            //this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.18F, -1.5, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.08F, -2.5, f2, 1);
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
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
