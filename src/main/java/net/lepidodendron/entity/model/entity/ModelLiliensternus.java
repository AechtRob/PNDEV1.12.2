package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLiliensternus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.entity.Entity;

public class ModelLiliensternus extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Backquillsside;
    public AdvancedModelRendererExtended Backquills;
    public AdvancedModelRendererExtended Neckbase;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Shoulderquillsside;
    public AdvancedModelRendererExtended Shoulderquills;
    public AdvancedModelRendererExtended Neckmiddle;
    public AdvancedModelRendererExtended Neckend;
    public AdvancedModelRendererExtended Neckquillsbase;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Neckquillsend;
    public AdvancedModelRendererExtended Lowerjawbase;
    public AdvancedModelRendererExtended Upperjawbase;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Leftlowerteeth;
    public AdvancedModelRendererExtended Rightlowerteeth;
    public AdvancedModelRendererExtended Lowerjawunderside;
    public AdvancedModelRendererExtended Upperjawend;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Leftupperbackteeth;
    public AdvancedModelRendererExtended Rightupperbackteeth;
    public AdvancedModelRendererExtended Snout;
    public AdvancedModelRendererExtended Leftupperfrontteeth;
    public AdvancedModelRendererExtended Rightupperfrontteeth;
    public AdvancedModelRendererExtended Leftcrestbase;
    public AdvancedModelRendererExtended Rightcrestbase;
    public AdvancedModelRendererExtended Leftcrestfront;
    public AdvancedModelRendererExtended Rightcrestfront;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Lefthand;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Righthand;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Tailquillsdorsal;
    public AdvancedModelRendererExtended Tailquillsside;
    public AdvancedModelRendererExtended Tailquillsdorsalend;
    public AdvancedModelRendererExtended Tailquillssideend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Leftankle;
    public AdvancedModelRendererExtended Leftfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Rightankle;
    public AdvancedModelRendererExtended Rightfoot;

    private ModelAnimator animator;

    public ModelLiliensternus() {
        this.textureWidth = 160;
        this.textureHeight = 160;
        this.Rightupperbackteeth = new AdvancedModelRendererExtended(this, 22, 74);
        this.Rightupperbackteeth.setRotationPoint(-1.149999976158142F, 0.75F, -4.599999904632568F);
        this.Rightupperbackteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.setRotateAngle(Rightupperbackteeth, 0.08726646259971647F, -0.06370451936226872F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRendererExtended(this, 50, 107);
        this.Lowerjawbase.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Lowerjawbase.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.Tailquillsside = new AdvancedModelRendererExtended(this, 64, 0);
        this.Tailquillsside.setRotationPoint(0.0F, 0.30000001192092896F, 0.0F);
        this.Tailquillsside.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 18, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 60, 24);
        this.Leftshin.setRotationPoint(0.5F, 8.699999809265137F, -0.6000000238418579F);
        this.Leftshin.addBox(-1.0F, -0.5F, -0.5F, 2, 10, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.7216936190680444F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 44, 87);
        this.Head.setRotationPoint(0.0F, 0.15000000596046448F, -7.0F);
        this.Head.addBox(-2.0F, -1.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.40334560078853393F, 0.0F, 0.0F);
        this.Tailquillsdorsal = new AdvancedModelRendererExtended(this, 45, 0);
        this.Tailquillsdorsal.setRotationPoint(0.009999999776482582F, 0.4000000059604645F, 0.0F);
        this.Tailquillsdorsal.addBox(0.0F, -1.0F, 0.0F, 0, 2, 18, 0.0F);
        this.setRotateAngle(Tailquillsdorsal, 0.10611601718967469F, 0.0F, 0.0F);
        this.Upperjawend = new AdvancedModelRendererExtended(this, 22, 86);
        this.Upperjawend.setRotationPoint(0.0F, 0.550000011920929F, -4.5F);
        this.Upperjawend.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 102);
        this.Hips.setRotationPoint(0.0F, -0.8F, 1.0F);
        this.Hips.addBox(-3.0F, -1.5F, -6.0F, 6, 11, 12, 0.0F);
        this.setRotateAngle(Hips, -0.08482300164692443F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 91, 52);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.20000000298023224F, 15.399999618530273F);
        this.Tailmiddleend.addBox(-1.5F, -0.5F, 0.0F, 3, 3, 18, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawunderside = new AdvancedModelRendererExtended(this, 30, 14);
        this.Lowerjawunderside.setRotationPoint(0.009999999776482582F, 1.0F, 0.0F);
        this.Lowerjawunderside.addBox(-1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawunderside, -0.2546435405291338F, 0.0F, 0.0F);
        this.Tailquillssideend = new AdvancedModelRendererExtended(this, 82, 0);
        this.Tailquillssideend.setRotationPoint(0.0F, 0.20000000298023224F, 0.0F);
        this.Tailquillssideend.addBox(-2.5F, -0.5F, 0.0F, 5, 1, 20, 0.0F);
        this.setRotateAngle(Tailquillssideend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 0, 32);
        this.Tailbase.setRotationPoint(0.0F, -0.4000000059604645F, 5.0F);
        this.Tailbase.addBox(-2.5F, -1.0F, 0.0F, 5, 7, 14, 0.0F);
        this.setRotateAngle(Tailbase, -0.021293017373673524F, 0.0F, 0.0F);
        this.Shoulderquills = new AdvancedModelRendererExtended(this, 56, 61);
        this.Shoulderquills.setRotationPoint(0.0F, 0.6000000238418579F, -7.0F);
        this.Shoulderquills.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Shoulderquills, 0.169820528229565F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 71, 0);
        this.Leftupperarm.setRotationPoint(3.450000047683716F, 6.5F, -6.0F);
        this.Leftupperarm.addBox(-0.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 1.082627713706794F, 0.0F, 0.0F);
        this.Rightcrestfront = new AdvancedModelRendererExtended(this, 18, 3);
        this.Rightcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightcrestfront.addBox(-1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Rightcrestfront, 0.6117378895082071F, 0.04241150198859518F, -0.021293017373673524F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 62, 0);
        this.Leftlowerarm.setRotationPoint(0.49000000953674316F, 4.5F, 0.4000000059604645F);
        this.Leftlowerarm.addBox(-1.0F, -0.5F, -1.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.Snout = new AdvancedModelRendererExtended(this, 33, 80);
        this.Snout.setRotationPoint(0.0F, -2.4000000953674316F, -0.4000000059604645F);
        this.Snout.addBox(-0.5F, 0.0F, -3.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Snout, 0.21223203437934937F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRendererExtended(this, 44, 79);
        this.Headslope.setRotationPoint(0.0F, -3.049999952316284F, 0.10000000149011612F);
        this.Headslope.addBox(-1.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.23352505591421208F, 0.0F, 0.0F);
        this.Rightcrestbase = new AdvancedModelRendererExtended(this, 33, 4);
        this.Rightcrestbase.setRotationPoint(-0.800000011920929F, -0.4000000059604645F, -0.20000000298023224F);
        this.Rightcrestbase.addBox(-1.0F, 0.0F, -2.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(Rightcrestbase, -0.38205256260891435F, -0.1485275233394591F, -0.2546435405291338F);
        this.Backquills = new AdvancedModelRendererExtended(this, 61, 12);
        this.Backquills.setRotationPoint(0.0F, -1.600000023841858F, -9.0F);
        this.Backquills.addBox(0.0F, -2.0F, 0.0F, 0, 2, 9, 0.0F);
        this.setRotateAngle(Backquills, -0.169820528229565F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 74, 22);
        this.Leftthigh.setRotationPoint(3.0F, 2.5F, -1.0F);
        this.Leftthigh.addBox(-1.0F, -1.0F, -2.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.2972295835988592F, 0.0F, 0.0F);
        this.Righthand = new AdvancedModelRendererExtended(this, 56, 8);
        this.Righthand.setRotationPoint(-0.699999988079071F, 4.199999809265137F, -0.5F);
        this.Righthand.addBox(0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Righthand, 0.1485275233394591F, 0.0F, -0.4457571069383183F);
        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this, 22, 73);
        this.Leftupperfrontteeth.setRotationPoint(0.8999999761581421F, -0.800000011920929F, 0.20000000298023224F);
        this.Leftupperfrontteeth.addBox(0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, 0.1485275233394591F, 0.23352505591421208F, -0.1485275233394591F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 47, 33);
        this.Rightthigh.setRotationPoint(-3.0F, 2.5F, -1.0F);
        this.Rightthigh.addBox(-2.0F, -1.0F, -2.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.2972295835988592F, 0.0F, 0.0F);
        this.Neckend = new AdvancedModelRendererExtended(this, 113, 0);
        this.Neckend.setRotationPoint(-0.009999999776482582F, -0.10000000149011612F, -8.5F);
        this.Neckend.addBox(-1.5F, -1.0F, -8.0F, 3, 6, 8, 0.0F);
        this.setRotateAngle(Neckend, 0.5307546228683145F, 0.0F, 0.0F);
        this.Neckmiddle = new AdvancedModelRendererExtended(this, 0, 3);
        this.Neckmiddle.setRotationPoint(0.0F, 0.0F, -5.699999809265137F);
        this.Neckmiddle.addBox(-1.5F, -1.0F, -9.0F, 3, 5, 9, 0.0F);
        this.setRotateAngle(Neckmiddle, -0.4457571069383183F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 59, 99);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.Lowerjawfront.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.10611601718967469F, 0.0F, 0.0F);
        this.Lefthand = new AdvancedModelRendererExtended(this, 65, 8);
        this.Lefthand.setRotationPoint(0.699999988079071F, 4.199999809265137F, -0.5F);
        this.Lefthand.addBox(-1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Lefthand, 0.1485275233394591F, 0.0F, 0.4457571069383183F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 42, 0);
        this.Rightupperarm.setRotationPoint(-3.450000047683716F, 6.5F, -6.0F);
        this.Rightupperarm.addBox(-1.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 1.082627713706794F, 0.0F, 0.0F);
        this.Neckquillsend = new AdvancedModelRendererExtended(this, 32, 21);
        this.Neckquillsend.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.Neckquillsend.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 9, 0.0F);
        this.setRotateAngle(Neckquillsend, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 22, 77);
        this.Rightlowerteeth.setRotationPoint(-0.8299999833106995F, -0.20000000298023224F, -1.5F);
        this.Rightlowerteeth.addBox(0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.10611601718967469F, -0.134390349074612F, 0.0F);
        this.Leftankle = new AdvancedModelRendererExtended(this, 80, 40);
        this.Leftankle.setRotationPoint(-0.009999999776482582F, 9.0F, 2.5F);
        this.Leftankle.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftankle, -0.5942845969882637F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 58, 94);
        this.Lowerjawmiddle.setRotationPoint(-0.009999999776482582F, 1.0F, -3.9000000953674316F);
        this.Lowerjawmiddle.addBox(-1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 31, 87);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.20000000298023224F, -3.299999952316284F);
        this.Jawparting.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.23352505591421208F, 0.0F, 0.0F);
        this.Upperjawbase = new AdvancedModelRendererExtended(this, 62, 84);
        this.Upperjawbase.setRotationPoint(0.0F, 1.9700000286102295F, -3.7300000190734863F);
        this.Upperjawbase.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.10611601718967469F, 0.0F, 0.0F);
        this.Rightankle = new AdvancedModelRendererExtended(this, 80, 50);
        this.Rightankle.setRotationPoint(0.009999999776482582F, 9.0F, 2.5F);
        this.Rightankle.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightankle, -0.5942845969882637F, 0.0F, 0.0F);
        this.Rightfoot = new AdvancedModelRendererExtended(this, 74, 69);
        this.Rightfoot.setRotationPoint(0.0F, 5.300000190734863F, -1.2000000476837158F);
        this.Rightfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfoot, 0.2546435405291338F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 15, 55);
        this.Tailend.setRotationPoint(0.0F, 0.10000000149011612F, 17.5F);
        this.Tailend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 18, 0.0F);
        this.setRotateAngle(Tailend, -0.10611601718967469F, 0.0F, 0.0F);
        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this, 29, 73);
        this.Rightupperfrontteeth.setRotationPoint(-0.8999999761581421F, -0.800000011920929F, 0.20000000298023224F);
        this.Rightupperfrontteeth.addBox(0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, 0.1485275233394591F, -0.23352505591421208F, 0.1485275233394591F);
        this.Neckquillsbase = new AdvancedModelRendererExtended(this, 63, 46);
        this.Neckquillsbase.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.Neckquillsbase.addBox(0.0F, -2.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(Neckquillsbase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Shoulderquillsside = new AdvancedModelRendererExtended(this, 40, 56);
        this.Shoulderquillsside.setRotationPoint(0.0F, 0.8999999761581421F, -8.100000381469727F);
        this.Shoulderquillsside.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 8, 0.0F);
        this.setRotateAngle(Shoulderquillsside, 0.12740903872453743F, 0.0F, 0.0F);
        this.Tailquillsdorsalend = new AdvancedModelRendererExtended(this, 93, 0);
        this.Tailquillsdorsalend.setRotationPoint(0.0F, 0.4000000059604645F, 0.0F);
        this.Tailquillsdorsalend.addBox(0.0F, -3.5F, 0.0F, 0, 6, 23, 0.0F);
        this.Backquillsside = new AdvancedModelRendererExtended(this, 93, 30);
        this.Backquillsside.setRotationPoint(0.0F, -0.800000011920929F, -9.0F);
        this.Backquillsside.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 9, 0.0F);
        this.setRotateAngle(Backquillsside, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftcrestfront = new AdvancedModelRendererExtended(this, 26, 0);
        this.Leftcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftcrestfront.addBox(0.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Leftcrestfront, 0.6117378895082071F, -0.04241150198859518F, 0.021293017373673524F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 22, 79);
        this.Leftlowerteeth.setRotationPoint(0.8299999833106995F, -0.20000000298023224F, -1.5F);
        this.Leftlowerteeth.addBox(0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.10611601718967469F, 0.134390349074612F, 0.0F);
        this.Neckbase = new AdvancedModelRendererExtended(this, 0, 18);
        this.Neckbase.setRotationPoint(0.0F, 0.699999988079071F, -8.199999809265137F);
        this.Neckbase.addBox(-2.0F, -1.0F, -7.5F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Neckbase, -0.33964105645913F, 0.0F, 0.0F);
        this.Leftupperbackteeth = new AdvancedModelRendererExtended(this, 22, 76);
        this.Leftupperbackteeth.setRotationPoint(1.149999976158142F, 0.75F, -4.599999904632568F);
        this.Leftupperbackteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.setRotateAngle(Leftupperbackteeth, 0.08726646259971647F, 0.06370451936226872F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 66, 39);
        this.Rightshin.setRotationPoint(-0.5F, 8.699999809265137F, -0.6000000238418579F);
        this.Rightshin.addBox(-1.0F, -0.5F, -0.5F, 2, 10, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.7216936190680444F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 54);
        this.Bodyfront.setRotationPoint(0.0F, -1.0F, -8.199999809265137F);
        this.Bodyfront.addBox(-3.5F, -0.5F, -9.0F, 7, 9, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 82);
        this.Bodymiddle.setRotationPoint(0.009999999776482582F, -0.10000000149011612F, -5.099999904632568F);
        this.Bodymiddle.addBox(-3.0F, -1.5F, -9.0F, 6, 10, 9, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftcrestbase = new AdvancedModelRendererExtended(this, 21, 14);
        this.Leftcrestbase.setRotationPoint(0.800000011920929F, -0.4000000059604645F, -0.20000000298023224F);
        this.Leftcrestbase.addBox(0.0F, 0.0F, -2.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(Leftcrestbase, -0.38205256260891435F, 0.1485275233394591F, 0.2546435405291338F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 53, 0);
        this.Rightlowerarm.setRotationPoint(-0.49000000953674316F, 4.5F, 0.4000000059604645F);
        this.Rightlowerarm.addBox(-1.0F, -0.5F, -1.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 101, 30);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.30000001192092896F, 13.0F);
        this.Tailmiddlebase.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 16, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.08482300397719036F, 0.0F, 0.0F);
        this.Leftfoot = new AdvancedModelRendererExtended(this, 74, 60);
        this.Leftfoot.setRotationPoint(0.0F, 5.300000190734863F, -1.2000000476837158F);
        this.Leftfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfoot, 0.2546435405291338F, 0.0F, 0.0F);
        this.Upperjawbase.addChild(this.Rightupperbackteeth);
        this.Head.addChild(this.Lowerjawbase);
        this.Tailmiddleend.addChild(this.Tailquillsside);
        this.Leftthigh.addChild(this.Leftshin);
        this.Neckend.addChild(this.Head);
        this.Tailmiddleend.addChild(this.Tailquillsdorsal);
        this.Upperjawbase.addChild(this.Upperjawend);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Lowerjawmiddle.addChild(this.Lowerjawunderside);
        this.Tailend.addChild(this.Tailquillssideend);
        this.Hips.addChild(this.Tailbase);
        this.Bodyfront.addChild(this.Shoulderquills);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Rightcrestbase.addChild(this.Rightcrestfront);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjawend.addChild(this.Snout);
        this.Upperjawbase.addChild(this.Headslope);
        this.Headslope.addChild(this.Rightcrestbase);
        this.Bodymiddle.addChild(this.Backquills);
        this.Hips.addChild(this.Leftthigh);
        this.Rightlowerarm.addChild(this.Righthand);
        this.Upperjawend.addChild(this.Leftupperfrontteeth);
        this.Hips.addChild(this.Rightthigh);
        this.Neckmiddle.addChild(this.Neckend);
        this.Neckbase.addChild(this.Neckmiddle);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Leftlowerarm.addChild(this.Lefthand);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Neckend.addChild(this.Neckquillsend);
        this.Lowerjawmiddle.addChild(this.Rightlowerteeth);
        this.Leftshin.addChild(this.Leftankle);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Lowerjawbase.addChild(this.Jawparting);
        this.Head.addChild(this.Upperjawbase);
        this.Rightshin.addChild(this.Rightankle);
        this.Rightankle.addChild(this.Rightfoot);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Upperjawend.addChild(this.Rightupperfrontteeth);
        this.Neckmiddle.addChild(this.Neckquillsbase);
        this.Bodyfront.addChild(this.Shoulderquillsside);
        this.Tailend.addChild(this.Tailquillsdorsalend);
        this.Bodymiddle.addChild(this.Backquillsside);
        this.Leftcrestbase.addChild(this.Leftcrestfront);
        this.Lowerjawmiddle.addChild(this.Leftlowerteeth);
        this.Bodyfront.addChild(this.Neckbase);
        this.Upperjawbase.addChild(this.Leftupperbackteeth);
        this.Rightthigh.addChild(this.Rightshin);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Hips.addChild(this.Bodymiddle);
        this.Headslope.addChild(this.Leftcrestbase);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Leftankle.addChild(this.Leftfoot);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Lowerjawbase.rotateAngleX = (float) Math.toRadians(45);
        this.Neckbase.rotateAngleY = (float) Math.toRadians(20);
        this.Neckbase.rotateAngleX = (float) Math.toRadians(-30);
        this.Neckmiddle.rotateAngleY = (float) Math.toRadians(23);
        this.Neckmiddle.rotateAngleX = (float) Math.toRadians(10);
        this.Neckend.rotateAngleY = (float) Math.toRadians(18);
        this.Neckend.rotateAngleX = (float) Math.toRadians(40);
        this.Rightupperarm.rotateAngleX = (float) Math.toRadians(-50);
        this.Rightupperarm.rotateAngleZ = (float) Math.toRadians(30);
        this.Leftupperarm.rotateAngleX = (float) Math.toRadians(-20);
        this.Leftlowerarm.rotateAngleZ = (float) Math.toRadians(10);
        this.Head.rotateAngleX = (float) Math.toRadians(30);
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Upperjawbase, 0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Leftcrestfront, 0.6117378895082071F, -0.04241150198859518F, 0.021293017373673524F);
        this.setRotateAngle(Leftshin, 0.7216936190680444F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperbackteeth, 0.08726646259971647F, -0.06370451936226872F, 0.0F);
        this.setRotateAngle(Neckbase, -0.46705011182842415F, -0.23352505591421208F, -0.169820528229565F);
        this.setRotateAngle(Jawparting, -0.23352505591421208F, 0.0F, 0.0F);
        this.setRotateAngle(Rightfoot, 1.209862232156147F, 0.0F, 0.0F);
        this.setRotateAngle(Righthand, 0.1485275233394591F, 0.0F, -0.4457571069383183F);
        this.setRotateAngle(Shoulderquills, 0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.04241150198859518F, 0.169820528229565F, 0.0F);
        this.setRotateAngle(Tailquillsdorsal, 0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.2546435405291338F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Leftupperbackteeth, 0.08726646259971647F, 0.06370451936226872F, 0.0F);
        this.setRotateAngle(Neckmiddle, -0.5518731241279929F, -0.06370451936226872F, 0.04241150198859518F);
        this.setRotateAngle(Neckquillsbase, -0.08482300397719036F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawunderside, -0.2546435405291338F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.10611601718967469F, 0.134390349074612F, 0.0F);
        this.setRotateAngle(Head, 0.6155776351678833F, 0.0F, 0.06370451936226872F);
        this.setRotateAngle(Leftankle, -0.5942845969882637F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, 0.21223203437934937F, 0.0F, 0.0F);
        this.setRotateAngle(Rightshin, 1.35856422583652F, 0.0F, 0.0F);
        this.setRotateAngle(Shoulderquillsside, 0.12740903872453743F, 0.0F, 0.0F);
        this.setRotateAngle(Neckend, 0.7005751510978795F, -0.04241150198859518F, -0.04241150198859518F);
        this.setRotateAngle(Lowerjawfront, -0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.23352505591421208F, -0.1485275233394591F, 0.0F);
        this.setRotateAngle(Backquills, -0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawend, 0.021293017373673524F, 0.0F, 0.0F);
        this.setRotateAngle(Leftthigh, -0.12740903872453743F, 0.0F, 0.0F);
        this.setRotateAngle(Rightcrestfront, 0.6117378895082071F, 0.04241150198859518F, -0.021293017373673524F);
        this.setRotateAngle(Tailend, -0.10611601718967469F, -0.169820528229565F, 0.0F);
        this.setRotateAngle(Backquillsside, -0.12740903872453743F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, 0.1485275233394591F, -0.23352505591421208F, 0.1485275233394591F);
        this.setRotateAngle(Bodyfront, 0.10611601718967469F, 0.0F, 0.0F);
        this.setRotateAngle(Rightcrestbase, -0.38205256260891435F, -0.1485275233394591F, -0.2546435405291338F);
        this.setRotateAngle(Leftcrestbase, -0.38205256260891435F, 0.1485275233394591F, 0.2546435405291338F);
        this.setRotateAngle(Rightlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfoot, 0.2546435405291338F, 0.0F, 0.0F);
        this.setRotateAngle(Tailquillssideend, -0.021293017373673524F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase, 0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, 0.1485275233394591F, 0.23352505591421208F, -0.1485275233394591F);
        this.setRotateAngle(Rightupperarm, 0.8915142138766367F, -0.4881685797985891F, 0.4457571069383183F);
        this.setRotateAngle(Neckquillsend, -0.08482300397719036F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.10611601718967469F, -0.134390349074612F, 0.0F);
        this.setRotateAngle(Headslope, 0.23352505591421208F, 0.0F, 0.0F);
        this.setRotateAngle(Rightankle, -1.35856422583652F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthand, 0.1485275233394591F, 0.0F, 0.4457571069383183F);
        this.setRotateAngle(Tailmiddleend, 0.23352505591421208F, -0.1911135497644277F, 0.0F);
        this.setRotateAngle(Rightthigh, 0.0F, 0.2972295835988592F, 0.12740903872453743F);
        this.setRotateAngle(Leftupperarm, 0.67928211291826F, -0.1485275233394591F, -0.7641051252178287F);
        this.Hips.offsetY = -0.12F;
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
        this.Hips.offsetY = 0F;
        this.Hips.offsetZ = 0.2F;

        EntityPrehistoricFloraLiliensternus Liliensternus = (EntityPrehistoricFloraLiliensternus) e;
        float masterSpeed = Liliensternus.getTravelSpeed();

        this.faceTarget(f3, f4, 6, Neckbase);
        this.faceTarget(f3, f4, 6, Neckmiddle);
        this.faceTarget(f3, f4, 6, Neckend);
        this.faceTarget(f3, f4, 6, Head);

        //float speed = 0.2F;


        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Neck = {this.Neckbase, this.Neckmiddle, this.Neckend};
        Liliensternus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.Leftupperarm, this.Leftlowerarm};
        AdvancedModelRenderer[] ArmR = {this.Rightupperarm, this.Rightlowerarm};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Liliensternus.getAnimation() == Liliensternus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Liliensternus.isReallyInWater()) {

            if (f3 == 0.0F || !Liliensternus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);

                return;
           }

            if (Liliensternus.getIsFast()) { //Running
                float speed = masterSpeed / 2F;
                //this.Hips.offsetY = 0.55F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(Lefthand, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(Righthand, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(Leftthigh, speed, 0.60F, true, 8, 0.55F, f2, 1F);
                this.walk(Rightthigh, speed, 0.60F, true, 5, 0.55F, f2, 1F);

                this.walk(Leftshin, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                this.walk(Rightshin, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                this.walk(Leftankle, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(Rightankle, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(Leftfoot, speed, 1.2F, true, 7.5F, -0.5F, f2, 1F);
                this.walk(Rightfoot, speed, 1.2F, true, 4.5F, -0.5F, f2, 1F);

                this.bobExtended(Hips, speed * 2F, 1.0F, false, 2.5F, f2, 1F);

                this.flap(Hips, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
                this.flap(Bodymiddle, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
                this.flap(Neckbase, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                this.walk(Bodymiddle, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neckbase, speed * 2, -0.25F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Neckmiddle, speed * 2, -0.3F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Neckend, speed * 2, 0.2F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Head, speed * 2, 0.35F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1) + 0.2F;
            }
            else { //Walking
                float speed = masterSpeed / 2.00F;
                //this.Hips.offsetY = 0.55F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(Lefthand, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(Righthand, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(Leftthigh, speed, 0.40F, true, 8, 0.35F, f2, 1F);
                this.walk(Rightthigh, speed, 0.40F, true, 5, 0.35F, f2, 1F);

                this.walk(Leftshin, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                this.walk(Rightshin, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                this.bobExtended(Leftshin, speed, 1.5F, false, 7.0F, f2, 1F);
                this.bobExtended(Rightshin, speed, 1.5F, false, 4.0F, f2, 1F);

                this.walk(Leftankle, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(Rightankle, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(Leftfoot, speed, 0.5F, true, 5.0F, -0.45F, f2, 1F);
                this.walk(Rightfoot, speed, 0.5F, true, 2.0F, -0.45F, f2, 1F);

                this.bobExtended(Hips, speed * 2F, 1.33F, false, 3.5F, f2, 1F);

                this.flap(Hips, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
                this.flap(Bodymiddle, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Neckbase, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                this.walk(Bodymiddle, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neckbase, speed * 2, -0.25F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Neckmiddle, speed * 2, -0.3F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Neckend, speed * 2, 0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(Head, speed * 2, 0.35F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(4.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraLiliensternus e = (EntityPrehistoricFloraLiliensternus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(15);
        animator.move(this.Neckbase, (float) Math.toRadians(-30),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.Neckbase, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.Neckbase, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.Neckbase, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.Neckbase, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neckbase, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neckbase, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Neckbase, (float) Math.toRadians(10),0,0);
        animator.move(this.Neckmiddle, (float) Math.toRadians(10),0,0);
        animator.move(this.Neckend, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neckbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(10);
        animator.move(this.Neckbase, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neckmiddle, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neckend, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
