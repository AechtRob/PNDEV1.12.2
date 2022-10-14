package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPristerognathus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPristerognathus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Tail1;
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
    public AdvancedModelRendererExtended Upperjaw1;
    public AdvancedModelRendererExtended Lowerjaw1;
    public AdvancedModelRendererExtended Upperjaw2;
    public AdvancedModelRendererExtended Leftsabre;
    public AdvancedModelRendererExtended Rightsabre;
    public AdvancedModelRendererExtended Nose;
    public AdvancedModelRendererExtended Rightupperlip;
    public AdvancedModelRendererExtended Leftupperlip;
    public AdvancedModelRendererExtended Upperlipmiddle;
    public AdvancedModelRendererExtended Upperjawteeth;
    public AdvancedModelRendererExtended Rightupperteeth;
    public AdvancedModelRendererExtended Leftupperteeth;
    public AdvancedModelRendererExtended Lowerjaw2;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjaw3;
    public AdvancedModelRendererExtended Lowerjawteeth;
    public AdvancedModelRendererExtended Lowerjaw4;
    public AdvancedModelRendererExtended Lowerjawslopefront;
    public AdvancedModelRendererExtended Rightlowerfang;
    public AdvancedModelRendererExtended Leftlowerfang;
    public AdvancedModelRendererExtended Lowerjawteeth_1;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;
    public AdvancedModelRendererExtended Tail2;
    public AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelPristerognathus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Rightshin = new AdvancedModelRendererExtended(this, 78, 74);
        this.Rightshin.setRotationPoint(-1.0F, 6.599999904632568F, -2.5F);
        this.Rightshin.addBox(-1.5F, 0.0F, -0.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(Rightshin, 0.4457571069383183F, 0.0F, 0.0F);
        this.Lowerjawslopefront = new AdvancedModelRendererExtended(this, 58, 0);
        this.Lowerjawslopefront.setRotationPoint(0.009999999776482582F, -3.0F, -4.699999809265137F);
        this.Lowerjawslopefront.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 45, 19);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.5F, -0.30000001192092896F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerjaw1 = new AdvancedModelRendererExtended(this, 64, 11);
        this.Lowerjaw1.setRotationPoint(0.0F, 1.0F, -0.8999999761581421F);
        this.Lowerjaw1.addBox(-4.5F, 0.0F, -4.0F, 9, 3, 4, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 81, 60);
        this.Leftupperarm.setRotationPoint(4.0F, 6.400000095367432F, -7.300000190734863F);
        this.Leftupperarm.addBox(-1.0F, -1.5F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.40334560078853393F, 0.0F, 0.0F);
        this.Rightsabre = new AdvancedModelRendererExtended(this, 91, 0);
        this.Rightsabre.setRotationPoint(-1.399999976158142F, 2.9000000953674316F, -9.0F);
        this.Rightsabre.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Rightsabre, 0.1911135497644277F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 17, 6);
        this.Tail2.setRotationPoint(0.0F, 0.10000000149011612F, 3.5F);
        this.Tail2.addBox(-1.5F, -0.5F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Tail2, -0.31834805156902407F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 48);
        this.Hips.setRotationPoint(0.0F, 4.6F, 11.0F);
        this.Hips.addBox(-4.0F, -1.0F, -5.5F, 8, 10, 12, 0.0F);
        this.setRotateAngle(Hips, -0.3183480555637657F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 65, 51);
        this.Rightupperarm.setRotationPoint(-4.0F, 6.400000095367432F, -7.300000190734863F);
        this.Rightupperarm.addBox(-3.0F, -1.5F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.40334560078853393F, 0.0F, 0.0F);
        this.Neckmuscles = new AdvancedModelRendererExtended(this, 51, 39);
        this.Neckmuscles.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Neckmuscles.addBox(-2.5F, 0.0F, -10.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(Neckmuscles, -0.07609635771721872F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 42, 52);
        this.Rightthigh.setRotationPoint(-3.5F, 2.799999952316284F, 1.7000000476837158F);
        this.Rightthigh.addBox(-3.0F, -1.5F, -3.0F, 4, 9, 7, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRendererExtended(this, 77, 0);
        this.Lowerjaw3.setRotationPoint(0.009999999776482582F, 3.0F, -4.0F);
        this.Lowerjaw3.addBox(-2.0F, -3.0F, -5.0F, 4, 3, 5, 0.0F);
        this.Lowerjaw4 = new AdvancedModelRendererExtended(this, 21, 0);
        this.Lowerjaw4.setRotationPoint(-0.009999999776482582F, 0.0F, -4.699999809265137F);
        this.Lowerjaw4.addBox(-1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjaw4, -0.2972295835988592F, 0.0F, 0.0F);
        this.Lowerjawteeth_1 = new AdvancedModelRendererExtended(this, 57, 6);
        this.Lowerjawteeth_1.setRotationPoint(0.0F, -0.10000000149011612F, -3.4000000953674316F);
        this.Lowerjawteeth_1.addBox(-1.0F, -1.0F, 0.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawteeth_1, -0.21223203437934937F, 0.0F, 0.0F);
        this.Leftlowerfang = new AdvancedModelRendererExtended(this, 42, 18);
        this.Leftlowerfang.setRotationPoint(-1.25F, -3.0F, -5.5F);
        this.Leftlowerfang.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Leftlowerfang, 0.12234758455954413F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 25);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -12.5F);
        this.Bodyfront.addBox(-4.5F, -1.0F, -10.0F, 9, 11, 10, 0.0F);
        this.setRotateAngle(Bodyfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjawteeth = new AdvancedModelRendererExtended(this, 48, 5);
        this.Upperjawteeth.setRotationPoint(0.0F, 1.0F, 0.10000000149011612F);
        this.Upperjawteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Upperjawteeth, 0.33964105645913F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 0, 17);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail1.addBox(-2.0F, -0.5F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Tail1, -0.5307546228683145F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 0, 8);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.5F, -0.30000001192092896F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.04241150198859518F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 31, 46);
        this.Rightlowerarm.setRotationPoint(-1.0F, 5.0F, 0.5F);
        this.Rightlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5094616179782085F, 0.0F, 0.0F);
        this.Upperjaw2 = new AdvancedModelRendererExtended(this, 79, 33);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Upperjaw2.addBox(-2.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(Upperjaw2, -0.10611601718967469F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 60, 65);
        this.Leftshin.setRotationPoint(1.0F, 6.599999904632568F, -2.5F);
        this.Leftshin.addBox(-1.5F, 0.0F, -0.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(Leftshin, 0.4457571069383183F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 28, 25);
        this.Lefthindfoot.setRotationPoint(0.0F, 9.0F, 2.200000047683716F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRendererExtended(this, 30, 2);
        this.Tail3.setRotationPoint(0.0F, 0.20000000298023224F, 3.5F);
        this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Tail3, -0.1911135497644277F, 0.0F, 0.0F);
        this.Rightupperlip = new AdvancedModelRendererExtended(this, 68, 2);
        this.Rightupperlip.setRotationPoint(-1.4900000095367432F, 3.799999952316284F, -5.949999809265137F);
        this.Rightupperlip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Rightupperlip, 0.27209683304907706F, -0.06736970729605787F, 0.23352505591421208F);
        this.Leftsabre = new AdvancedModelRendererExtended(this, 43, 5);
        this.Leftsabre.setRotationPoint(1.399999976158142F, 2.9000000953674316F, -9.0F);
        this.Leftsabre.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Leftsabre, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftupperteeth = new AdvancedModelRendererExtended(this, 61, 8);
        this.Leftupperteeth.setRotationPoint(-0.20000000298023224F, 1.2999999523162842F, 2.9000000953674316F);
        this.Leftupperteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftupperteeth, -0.169820528229565F, 0.0F, 0.21223203437934937F);
        this.Upperjaw1 = new AdvancedModelRendererExtended(this, 68, 19);
        this.Upperjaw1.setRotationPoint(0.0F, -3.0F, -4.900000095367432F);
        this.Upperjaw1.addBox(-3.5F, 0.0F, -4.0F, 7, 4, 5, 0.0F);
        this.setRotateAngle(Upperjaw1, -0.169820528229565F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 36, 69);
        this.Leftthigh.setRotationPoint(3.5F, 2.799999952316284F, 1.7000000476837158F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -3.0F, 4, 9, 7, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 49, 81);
        this.Neck.setRotationPoint(0.0F, 0.30000001192092896F, -7.0F);
        this.Neck.addBox(-3.5F, -1.0F, -11.0F, 7, 8, 11, 0.0F);
        this.setRotateAngle(Neck, -0.21223203437934937F, 0.0F, 0.0F);
        this.Rightlowerfang = new AdvancedModelRendererExtended(this, 17, 0);
        this.Rightlowerfang.setRotationPoint(1.25F, -3.0F, -5.5F);
        this.Rightlowerfang.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Rightlowerfang, 0.12234758455954413F, 0.0F, 0.0F);
        this.Rightupperteeth = new AdvancedModelRendererExtended(this, 50, 0);
        this.Rightupperteeth.setRotationPoint(0.20000000298023224F, 1.2999999523162842F, 2.9000000953674316F);
        this.Rightupperteeth.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightupperteeth, -0.169820528229565F, 0.0F, -0.21223203437934937F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 19, 15);
        this.Righthindfoot.setRotationPoint(0.0F, 9.0F, 2.200000047683716F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRendererExtended(this, 41, 10);
        this.Lowerjaw2.setRotationPoint(0.0F, -0.10000000149011612F, -4.449999809265137F);
        this.Lowerjaw2.addBox(-3.0F, 0.0F, -4.0F, 6, 3, 5, 0.0F);
        this.setRotateAngle(Lowerjaw2, -0.169820528229565F, 0.0F, 0.0F);
        this.Lowerjawteeth = new AdvancedModelRendererExtended(this, 61, 19);
        this.Lowerjawteeth.setRotationPoint(0.0F, 0.0F, -7.800000190734863F);
        this.Lowerjawteeth.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawteeth, -0.08482300397719036F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 79, 48);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.10000000149011612F, -4.0F);
        this.Jawparting.addBox(-3.5F, -4.0F, 0.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.4881685797985891F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRendererExtended(this, 34, 9);
        this.Nose.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Nose.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Nose, 0.1485275233394591F, 0.0F, 0.0F);
        this.Upperlipmiddle = new AdvancedModelRendererExtended(this, 39, 0);
        this.Upperlipmiddle.setRotationPoint(0.009999999776482582F, 3.700000047683716F, -2.0999999046325684F);
        this.Upperlipmiddle.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Upperlipmiddle, -0.1485275233394591F, 0.0F, 0.0F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 72);
        this.Belly.setRotationPoint(0.0F, -0.10000000149011612F, -4.5F);
        this.Belly.addBox(-5.0F, -1.0F, -14.0F, 10, 11, 14, 0.0F);
        this.setRotateAngle(Belly, 0.33964105645913F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 42, 35);
        this.Leftlowerarm.setRotationPoint(1.0F, 5.0F, 0.5F);
        this.Leftlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.5094616179782085F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 53, 28);
        this.Head.setRotationPoint(0.0F, 1.399999976158142F, -9.0F);
        this.Head.addBox(-4.5F, -3.0F, -5.0F, 9, 4, 6, 0.0F);
        this.setRotateAngle(Head, 0.36093409463874954F, 0.0F, 0.0F);
        this.Leftupperlip = new AdvancedModelRendererExtended(this, 1, 0);
        this.Leftupperlip.setRotationPoint(1.4900000095367432F, 3.799999952316284F, -5.949999809265137F);
        this.Leftupperlip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Leftupperlip, 0.27209683304907706F, 0.06736970729605787F, -0.23352505591421208F);
        this.Rightthigh.addChild(this.Rightshin);
        this.Lowerjaw3.addChild(this.Lowerjawslopefront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Head.addChild(this.Lowerjaw1);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Upperjaw1.addChild(this.Rightsabre);
        this.Tail1.addChild(this.Tail2);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Neck.addChild(this.Neckmuscles);
        this.Hips.addChild(this.Rightthigh);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Lowerjaw3.addChild(this.Lowerjaw4);
        this.Lowerjawslopefront.addChild(this.Lowerjawteeth_1);
        this.Lowerjaw3.addChild(this.Leftlowerfang);
        this.Belly.addChild(this.Bodyfront);
        this.Upperlipmiddle.addChild(this.Upperjawteeth);
        this.Hips.addChild(this.Tail1);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Leftthigh.addChild(this.Leftshin);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Tail2.addChild(this.Tail3);
        this.Upperjaw2.addChild(this.Rightupperlip);
        this.Upperjaw1.addChild(this.Leftsabre);
        this.Leftupperlip.addChild(this.Leftupperteeth);
        this.Head.addChild(this.Upperjaw1);
        this.Hips.addChild(this.Leftthigh);
        this.Bodyfront.addChild(this.Neck);
        this.Lowerjaw3.addChild(this.Rightlowerfang);
        this.Rightupperlip.addChild(this.Rightupperteeth);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Lowerjaw2.addChild(this.Lowerjawteeth);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Upperjaw2.addChild(this.Nose);
        this.Nose.addChild(this.Upperlipmiddle);
        this.Hips.addChild(this.Belly);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Neck.addChild(this.Head);
        this.Upperjaw2.addChild(this.Leftupperlip);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.415f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neck.offsetY = -0.001F;
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(35);
        this.Neck.render(0.01F);
        GlStateManager.enableCull();
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
        this.Hips.offsetY = 0.885F;

        EntityPrehistoricFloraPristerognathus Pristerognathus = (EntityPrehistoricFloraPristerognathus) e;
        float masterSpeed = Pristerognathus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        if (Pristerognathus.getAnimation() == Pristerognathus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Pristerognathus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.105F;
        if (Pristerognathus.getIsFast()) {
            speed = speed * 1.9F;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 1, f2, 1.5F);;

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
        EntityPrehistoricFloraPristerognathus e = (EntityPrehistoricFloraPristerognathus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

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
        animator.rotate(this.Tail1, (float) Math.toRadians(22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail3, (float) Math.toRadians(22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
