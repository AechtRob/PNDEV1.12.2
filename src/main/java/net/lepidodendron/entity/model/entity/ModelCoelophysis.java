package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCoelophysis;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCoelophysis extends AdvancedModelBaseExtended {
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
    public AdvancedModelRendererExtended Upperjawend;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Leftupperbackteeth;
    public AdvancedModelRendererExtended Rightupperbackteeth;
    public AdvancedModelRendererExtended Snout;
    public AdvancedModelRendererExtended Leftupperfrontteeth;
    public AdvancedModelRendererExtended Rightupperfrontteeth;
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

    public ModelCoelophysis() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailquillsside = new AdvancedModelRendererExtended(this, 64, 0);
        this.Tailquillsside.setRotationPoint(0.0F, 0.30000001192092896F, 0.0F);
        this.Tailquillsside.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 15, 0.0F);
        this.Snout = new AdvancedModelRendererExtended(this, 33, 80);
        this.Snout.setRotationPoint(0.0F, -2.700000047683716F, -0.20000000298023224F);
        this.Snout.addBox(-0.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.31834805156902407F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 74, 24);
        this.Leftthigh.setRotationPoint(2.5F, 1.0F, 0.0F);
        this.Leftthigh.addBox(-1.0F, -0.5F, -2.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.2972295835988592F, 0.0F, 0.0F);
        this.Leftupperbackteeth = new AdvancedModelRendererExtended(this, 22, 76);
        this.Leftupperbackteeth.setRotationPoint(1.25F, 0.550000011920929F, -4.099999904632568F);
        this.Leftupperbackteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.setRotateAngle(Leftupperbackteeth, 0.08726646259971647F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 22, 37);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4000000059604645F, 12.399999618530273F);
        this.Tailmiddleend.addBox(-1.0F, -0.5F, 0.0F, 2, 3, 15, 0.0F);
        this.Shoulderquillsside = new AdvancedModelRendererExtended(this, 40, 56);
        this.Shoulderquillsside.setRotationPoint(0.0F, 0.800000011920929F, -7.599999904632568F);
        this.Shoulderquillsside.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 8, 0.0F);
        this.setRotateAngle(Shoulderquillsside, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 19, 19);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.20000000298023224F, 9.0F);
        this.Tailmiddlebase.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 13, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.1485275233394591F, 0.0F, 0.0F);
        this.Neckmiddle = new AdvancedModelRendererExtended(this, 0, 5);
        this.Neckmiddle.setRotationPoint(0.0F, 0.0F, -5.199999809265137F);
        this.Neckmiddle.addBox(-1.5F, -1.0F, -8.0F, 3, 4, 8, 0.0F);
        this.setRotateAngle(Neckmiddle, -0.4457571069383183F, 0.0F, 0.0F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 22, 79);
        this.Leftlowerteeth.setRotationPoint(0.8999999761581421F, -0.20000000298023224F, -1.899999976158142F);
        this.Leftlowerteeth.addBox(0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.04241150198859518F, 0.134390349074612F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 47, 33);
        this.Rightthigh.setRotationPoint(-2.5F, 1.0F, 0.0F);
        this.Rightthigh.addBox(-2.0F, -0.5F, -2.0F, 3, 9, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.2972295835988592F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 58, 94);
        this.Lowerjawmiddle.setRotationPoint(-0.009999999776482582F, 1.0F, -3.9000000953674316F);
        this.Lowerjawmiddle.addBox(-1.0F, -1.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Rightankle = new AdvancedModelRendererExtended(this, 80, 50);
        this.Rightankle.setRotationPoint(0.009999999776482582F, 9.0F, 2.5F);
        this.Rightankle.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightankle, -0.67928211291826F, 0.0F, 0.0F);
        this.Rightfoot = new AdvancedModelRendererExtended(this, 74, 69);
        this.Rightfoot.setRotationPoint(0.0F, 6.4F, -1.2F);
        this.Rightfoot.addBox(-2.5F, -1.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfoot, 0.23352505391684128F, 0.0F, 0.0F);
        this.Tailquillsdorsalend = new AdvancedModelRendererExtended(this, 50, 0);
        this.Tailquillsdorsalend.setRotationPoint(0.0F, 0.20000000298023224F, 0.0F);
        this.Tailquillsdorsalend.addBox(0.0F, -2.5F, 0.0F, 0, 4, 19, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 21, 56);
        this.Tailend.setRotationPoint(0.0F, 0.10000000149011612F, 14.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 2, 16, 0.0F);
        this.setRotateAngle(Tailend, -0.10611601718967469F, 0.0F, 0.0F);
        this.Leftfoot = new AdvancedModelRendererExtended(this, 74, 60);
        this.Leftfoot.setRotationPoint(0.0F, 6.4F, -1.2F);
        this.Leftfoot.addBox(-2.5F, -1.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfoot, 0.23352505391684128F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 47);
        this.Bodyfront.setRotationPoint(0.0F, -1.0F, -4.199999809265137F);
        this.Bodyfront.addBox(-3.0F, -0.5F, -9.0F, 6, 8, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.13613568498450906F, 0.0F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRendererExtended(this, 46, 91);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lowerjawbase.addBox(-2.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 65);
        this.Bodymiddle.setRotationPoint(0.009999999776482582F, -0.10000000149011612F, -4.599999904632568F);
        this.Bodymiddle.addBox(-2.5F, -1.5F, -5.0F, 5, 9, 5, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.02844886672428379F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 59, 0);
        this.Leftupperarm.setRotationPoint(2.75F, 5.0F, -6.5F);
        this.Leftupperarm.addBox(-0.5F, -1.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.5307546228683145F, 0.0F, 0.0F);
        this.Neckend = new AdvancedModelRendererExtended(this, 15, 2);
        this.Neckend.setRotationPoint(-0.009999999776482582F, 0.0F, -7.5F);
        this.Neckend.addBox(-1.5F, -1.0F, -6.0F, 3, 4, 6, 0.0F);
        this.setRotateAngle(Neckend, 0.46705011182842415F, 0.0F, 0.0F);
        this.Tailquillssideend = new AdvancedModelRendererExtended(this, 53, 0);
        this.Tailquillssideend.setRotationPoint(0.0F, 0.20000000298023224F, 0.0F);
        this.Tailquillssideend.addBox(-2.0F, -0.5F, 0.0F, 4, 1, 17, 0.0F);
        this.setRotateAngle(Tailquillssideend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Neckquillsbase = new AdvancedModelRendererExtended(this, 65, 52);
        this.Neckquillsbase.setRotationPoint(0.0F, -0.6000000238418579F, -8.0F);
        this.Neckquillsbase.addBox(0.0F, -2.0F, 0.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(Neckquillsbase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Upperjawend = new AdvancedModelRendererExtended(this, 22, 86);
        this.Upperjawend.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Upperjawend.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawend, -0.12740903872453743F, 0.0F, 0.0F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 22, 77);
        this.Rightlowerteeth.setRotationPoint(-0.8999999761581421F, -0.20000000298023224F, -1.899999976158142F);
        this.Rightlowerteeth.addBox(0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.04241150198859518F, -0.134390349074612F, 0.0F);
        this.Lefthand = new AdvancedModelRendererExtended(this, 45, 7);
        this.Lefthand.setRotationPoint(0.699999988079071F, 4.199999809265137F, -0.5F);
        this.Lefthand.addBox(-1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Lefthand, 0.1485275233394591F, 0.0F, 0.4457571069383183F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 33, 86);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.20000000298023224F, -3.5F);
        this.Jawparting.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.23352505591421208F, 0.0F, 0.0F);
        this.Rightupperbackteeth = new AdvancedModelRendererExtended(this, 22, 74);
        this.Rightupperbackteeth.setRotationPoint(-1.25F, 0.550000011920929F, -4.099999904632568F);
        this.Rightupperbackteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.setRotateAngle(Rightupperbackteeth, 0.08726646259971647F, 0.0F, 0.0F);
        this.Righthand = new AdvancedModelRendererExtended(this, 34, 7);
        this.Righthand.setRotationPoint(-0.699999988079071F, 4.199999809265137F, -0.5F);
        this.Righthand.addBox(0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Righthand, 0.1485275233394591F, 0.0F, -0.4457571069383183F);
        this.Backquills = new AdvancedModelRendererExtended(this, 50, 18);
        this.Backquills.setRotationPoint(0.0F, -1.2000000476837158F, -5.0F);
        this.Backquills.addBox(0.0F, -2.0F, 0.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(Backquills, -0.2546435405291338F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 21, 15);
        this.Rightupperarm.setRotationPoint(-2.75F, 5.0F, -6.5F);
        this.Rightupperarm.addBox(-1.5F, -1.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.5747369280080549F, 0.0F, 0.0F);
        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this, 29, 73);
        this.Rightupperfrontteeth.setRotationPoint(-1.0F, -0.5F, 0.5F);
        this.Rightupperfrontteeth.addBox(0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, -0.04241150198859518F, -0.23352505591421208F, 0.1485275233394591F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 50, 0);
        this.Leftlowerarm.setRotationPoint(0.49000000953674316F, 3.5F, 0.4000000059604645F);
        this.Leftlowerarm.addBox(-1.0F, -0.5F, -1.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 0, 30);
        this.Tailbase.setRotationPoint(0.0F, -0.4000000059604645F, 4.5F);
        this.Tailbase.addBox(-2.0F, -1.0F, 0.0F, 4, 6, 10, 0.0F);
        this.setRotateAngle(Tailbase, 0.04241150198859518F, 0.0F, 0.0F);
        this.Backquillsside = new AdvancedModelRendererExtended(this, 39, 23);
        this.Backquillsside.setRotationPoint(0.0F, -0.800000011920929F, -5.0F);
        this.Backquillsside.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Backquillsside, -0.1485275233394591F, 0.0F, 0.0F);
        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this, 22, 73);
        this.Leftupperfrontteeth.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.Leftupperfrontteeth.addBox(0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, -0.04241150198859518F, 0.23352505591421208F, -0.1485275233394591F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 60, 24);
        this.Leftshin.setRotationPoint(0.5F, 8.199999809265137F, -0.6000000238418579F);
        this.Leftshin.addBox(-1.0F, -0.5F, -0.5F, 2, 10, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.8066912015770679F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRendererExtended(this, 42, 79);
        this.Headslope.setRotationPoint(0.0F, -1.850000023841858F, 0.0F);
        this.Headslope.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.017453292519943295F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 45, 86);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Lowerjawfront.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Neckquillsend = new AdvancedModelRendererExtended(this, 56, 49);
        this.Neckquillsend.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Neckquillsend.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Neckquillsend, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 66, 39);
        this.Rightshin.setRotationPoint(-0.5F, 8.199999809265137F, -0.6000000238418579F);
        this.Rightshin.addBox(-1.0F, -0.5F, -0.5F, 2, 10, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.8066912015770679F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 80);
        this.Hips.setRotationPoint(0.0F, 1.600000023841858F, 0.0F);
        this.Hips.addBox(-2.5F, -1.5F, -5.5F, 5, 9, 11, 0.0F);
        this.setRotateAngle(Hips, -0.06370451936226872F, 0.0F, 0.0F);
        this.Neckbase = new AdvancedModelRendererExtended(this, 0, 18);
        this.Neckbase.setRotationPoint(0.0F, 0.699999988079071F, -8.199999809265137F);
        this.Neckbase.addBox(-2.0F, -1.0F, -6.5F, 4, 4, 7, 0.0F);
        this.setRotateAngle(Neckbase, -0.33964105645913F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 39, 0);
        this.Rightlowerarm.setRotationPoint(-0.49000000953674316F, 3.5F, 0.4000000059604645F);
        this.Rightlowerarm.addBox(-1.0F, -0.5F, -1.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.9976301977767977F, 0.0F, 0.0F);
        this.Upperjawbase = new AdvancedModelRendererExtended(this, 52, 83);
        this.Upperjawbase.setRotationPoint(0.0F, 1.100000023841858F, -3.8299999237060547F);
        this.Upperjawbase.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.06370451936226872F, 0.0F, 0.0F);
        this.Tailquillsdorsal = new AdvancedModelRendererExtended(this, 39, 0);
        this.Tailquillsdorsal.setRotationPoint(0.009999999776482582F, 0.4000000059604645F, 0.0F);
        this.Tailquillsdorsal.addBox(0.0F, -1.0F, 0.0F, 0, 1, 15, 0.0F);
        this.setRotateAngle(Tailquillsdorsal, 0.04241150198859518F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 33, 93);
        this.Head.setRotationPoint(0.0F, -0.05000000074505806F, -5.0F);
        this.Head.addBox(-2.0F, -1.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.36093409463874954F, 0.0F, 0.0F);
        this.Shoulderquills = new AdvancedModelRendererExtended(this, 56, 61);
        this.Shoulderquills.setRotationPoint(0.0F, 0.699999988079071F, -6.5F);
        this.Shoulderquills.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Shoulderquills, 0.169820528229565F, 0.0F, 0.0F);
        this.Leftankle = new AdvancedModelRendererExtended(this, 80, 40);
        this.Leftankle.setRotationPoint(-0.009999999776482582F, 9.0F, 2.5F);
        this.Leftankle.addBox(-1.0F, 0.0F, -2.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftankle, -0.67928211291826F, 0.0F, 0.0F);
        this.Tailmiddleend.addChild(this.Tailquillsside);
        this.Upperjawend.addChild(this.Snout);
        this.Hips.addChild(this.Leftthigh);
        this.Upperjawbase.addChild(this.Leftupperbackteeth);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Bodyfront.addChild(this.Shoulderquillsside);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Neckbase.addChild(this.Neckmiddle);
        this.Lowerjawmiddle.addChild(this.Leftlowerteeth);
        this.Hips.addChild(this.Rightthigh);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Rightshin.addChild(this.Rightankle);
        this.Rightankle.addChild(this.Rightfoot);
        this.Tailend.addChild(this.Tailquillsdorsalend);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Leftankle.addChild(this.Leftfoot);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Head.addChild(this.Lowerjawbase);
        this.Hips.addChild(this.Bodymiddle);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Neckmiddle.addChild(this.Neckend);
        this.Tailend.addChild(this.Tailquillssideend);
        this.Neckmiddle.addChild(this.Neckquillsbase);
        this.Upperjawbase.addChild(this.Upperjawend);
        this.Lowerjawmiddle.addChild(this.Rightlowerteeth);
        this.Leftlowerarm.addChild(this.Lefthand);
        this.Lowerjawbase.addChild(this.Jawparting);
        this.Upperjawbase.addChild(this.Rightupperbackteeth);
        this.Rightlowerarm.addChild(this.Righthand);
        this.Bodymiddle.addChild(this.Backquills);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Upperjawend.addChild(this.Rightupperfrontteeth);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Hips.addChild(this.Tailbase);
        this.Bodymiddle.addChild(this.Backquillsside);
        this.Upperjawend.addChild(this.Leftupperfrontteeth);
        this.Leftthigh.addChild(this.Leftshin);
        this.Upperjawbase.addChild(this.Headslope);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Neckend.addChild(this.Neckquillsend);
        this.Rightthigh.addChild(this.Rightshin);
        this.Bodyfront.addChild(this.Neckbase);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Head.addChild(this.Upperjawbase);
        this.Tailmiddleend.addChild(this.Tailquillsdorsal);
        this.Neckend.addChild(this.Head);
        this.Bodyfront.addChild(this.Shoulderquills);
        this.Leftshin.addChild(this.Leftankle);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.495f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neckbase.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Hips.offsetY = 0.75F;
        this.Hips.offsetZ = 0.2F;

        EntityPrehistoricFloraCoelophysis Coelophysis = (EntityPrehistoricFloraCoelophysis) e;
        float masterSpeed = Coelophysis.getTravelSpeed();

        this.faceTarget(f3, f4, 10, Neckbase);
        this.faceTarget(f3, f4, 10, Neckmiddle);
        this.faceTarget(f3, f4, 10, Neckend);
        this.faceTarget(f3, f4, 10, Head);

        //float speed = 0.2F;


        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Neck = {this.Neckbase, this.Neckmiddle, this.Neckend};

        AdvancedModelRenderer[] ArmL = {this.Leftupperarm, this.Leftlowerarm};
        AdvancedModelRenderer[] ArmR = {this.Rightupperarm, this.Rightlowerarm};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Coelophysis.getAnimation() == Coelophysis.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Coelophysis.isReallyInWater()) {

            if (f3 == 0.0F || !Coelophysis.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);

                return;
           }

            if (Coelophysis.getIsFast()) { //Running
                float speed = masterSpeed / 2F;
                this.Hips.offsetY = 0.75F;
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
                this.Hips.offsetY = 0.815F;
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
        EntityPrehistoricFloraCoelophysis e = (EntityPrehistoricFloraCoelophysis) entity;
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
