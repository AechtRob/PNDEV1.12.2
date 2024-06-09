package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCtenospondylus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCtenospondylus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neckbase;
    private final AdvancedModelRendererExtended Neckend;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Lowerjawback;
    private final AdvancedModelRendererExtended Lowerjawmiddle;
    private final AdvancedModelRendererExtended Lowerjawfront;
    private final AdvancedModelRendererExtended Lowerfrontteeth;
    private final AdvancedModelRendererExtended Lowerjawslope;
    private final AdvancedModelRendererExtended Leftlowerteeth;
    private final AdvancedModelRendererExtended Rightlowerteeth;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Upperjawback;
    private final AdvancedModelRendererExtended Upperjawmiddle;
    private final AdvancedModelRendererExtended Nosebridge;
    private final AdvancedModelRendererExtended Upperjawfront;
    private final AdvancedModelRendererExtended Upperfrontteeth;
    private final AdvancedModelRendererExtended Leftupperfrontteeth;
    private final AdvancedModelRendererExtended Rightupperfrontteeth;
    private final AdvancedModelRendererExtended Leftupperbackteeth;
    private final AdvancedModelRendererExtended Rightupperteethback;
    private final AdvancedModelRendererExtended Forehead;
    private final AdvancedModelRendererExtended Sailfrontend;
    private final AdvancedModelRendererExtended Sailfrontbase;
    private final AdvancedModelRendererExtended Sailfrontendbase;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Sailmiddlefront;
    private final AdvancedModelRendererExtended Sailmiddlefrontbase;
    private final AdvancedModelRendererExtended Sailmiddle;
    private final AdvancedModelRendererExtended Sailmiddlebase;
    private final AdvancedModelRendererExtended Tailbase;
    private final AdvancedModelRendererExtended Tailmiddlebase;
    private final AdvancedModelRendererExtended Tailmiddleend;
    private final AdvancedModelRendererExtended Tailend;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;
    private final AdvancedModelRendererExtended Sailend;
    private final AdvancedModelRendererExtended Sailendbase;

    private ModelAnimator animator;

    public ModelCtenospondylus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 11.9F, 11.7F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4554F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 41, -3.0F, -2.0F, -6.0F, 6, 7, 8, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.2F, -5.5F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.4554F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -4.0F, -1.0F, -13.0F, 8, 9, 13, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -12.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1061F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 22, -3.5F, -1.0F, -10.0F, 7, 9, 10, 0.0F, false));

        this.Neckbase = new AdvancedModelRendererExtended(this);
        this.Neckbase.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.0848F, 0.0F, 0.0F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 50, 18, -2.5F, 0.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.Neckend = new AdvancedModelRendererExtended(this);
        this.Neckend.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.Neckbase.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.1274F, 0.0F, 0.0F);
        this.Neckend.cubeList.add(new ModelBox(Neckend, 54, 44, -2.0F, -1.0F, -4.0F, 4, 7, 4, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(-0.01F, 0.1F, -2.2F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.0213F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 50, 31, -2.5F, -1.5F, -4.5F, 5, 4, 5, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRendererExtended(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 16, 66, -2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 42, 66, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.8F, -4.3F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 0, 72, -1.0F, -2.0F, -2.0F, 2, 2, 3, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 42, 16, -0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 66, 43, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Leftlowerteeth = new AdvancedModelRendererExtended(this);
        this.Leftlowerteeth.setRotationPoint(-1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, -0.1698F, 0.0F);
        this.Leftlowerteeth.cubeList.add(new ModelBox(Leftlowerteeth, 20, 36, 0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRendererExtended(this);
        this.Rightlowerteeth.setRotationPoint(1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.1698F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 0, 5, 0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 67, 69, -1.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F, false));

        this.Upperjawback = new AdvancedModelRendererExtended(this);
        this.Upperjawback.setRotationPoint(0.0F, 0.65F, -4.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 0, 66, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRendererExtended(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.5943F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 70, 62, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Nosebridge = new AdvancedModelRendererExtended(this);
        this.Nosebridge.setRotationPoint(0.0F, -4.1F, -0.75F);
        this.Upperjawmiddle.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.6374F, 0.0F, 0.0F);
        this.Nosebridge.cubeList.add(new ModelBox(Nosebridge, 71, 10, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRendererExtended(this);
        this.Upperjawfront.setRotationPoint(-0.01F, -2.5F, -2.8F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.9128F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 44, 5, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.2972F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.3F, -0.5F, -3.0F);
        this.Upperjawmiddle.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, 0.2759F, -0.0637F, 0.0F);
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 0, 42, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Rightupperfrontteeth.setRotationPoint(1.3F, -0.5F, -3.0F);
        this.Upperjawmiddle.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, 0.2759F, 0.0637F, 0.0F);
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 0, 40, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Leftupperbackteeth = new AdvancedModelRendererExtended(this);
        this.Leftupperbackteeth.setRotationPoint(-1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, -0.1061F, -0.0213F, 0.0F);
        this.Leftupperbackteeth.cubeList.add(new ModelBox(Leftupperbackteeth, 36, 37, 0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F, false));

        this.Rightupperteethback = new AdvancedModelRendererExtended(this);
        this.Rightupperteethback.setRotationPoint(1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Rightupperteethback);
        this.setRotateAngle(Rightupperteethback, -0.1061F, 0.0213F, 0.0F);
        this.Rightupperteethback.cubeList.add(new ModelBox(Rightupperteethback, 0, 37, 0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F, false));

        this.Forehead = new AdvancedModelRendererExtended(this);
        this.Forehead.setRotationPoint(0.01F, -1.55F, -4.3F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.5009F, 0.0F, 0.0F);
        this.Forehead.cubeList.add(new ModelBox(Forehead, 66, 27, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.Sailfrontend = new AdvancedModelRendererExtended(this);
        this.Sailfrontend.setRotationPoint(0.0F, -2.0F, -1.3F);
        this.Neckend.addChild(Sailfrontend);
        this.setRotateAngle(Sailfrontend, 0.3609F, 0.0F, 0.0F);
        this.Sailfrontend.cubeList.add(new ModelBox(Sailfrontend, 70, 48, -0.5F, 0.0F, -2.0F, 1, 3, 4, -0.01F, false));

        this.Sailfrontbase = new AdvancedModelRendererExtended(this);
        this.Sailfrontbase.setRotationPoint(0.0F, 0.6F, -4.1F);
        this.Neckbase.addChild(Sailfrontbase);
        this.setRotateAngle(Sailfrontbase, 0.0848F, 0.0F, 0.0F);
        this.Sailfrontbase.cubeList.add(new ModelBox(Sailfrontbase, 60, 60, 0.0F, -7.5F, -2.5F, 0, 7, 5, 0.0F, false));

        this.Sailfrontendbase = new AdvancedModelRendererExtended(this);
        this.Sailfrontendbase.setRotationPoint(0.5F, -2.2F, -0.1F);
        this.Sailfrontbase.addChild(Sailfrontendbase);
        this.Sailfrontendbase.cubeList.add(new ModelBox(Sailfrontendbase, 52, 68, -1.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 5.7F, -8.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5943F, -0.1061F, 0.2122F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 63, 0, -2.0F, -0.5F, -2.0F, 3, 6, 4, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(-0.5F, 4.2F, 0.4F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.7217F, -0.0637F, -0.2122F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 36, 31, -1.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.2F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 64, 55, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(3.0F, 5.7F, -8.0F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.5943F, 0.1061F, -0.2122F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 28, 56, -1.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(0.5F, 4.2F, 0.4F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.7217F, 0.0637F, 0.2122F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 0, -1.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRendererExtended(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.2F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 42, 60, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, false));

        this.Sailmiddlefront = new AdvancedModelRendererExtended(this);
        this.Sailmiddlefront.setRotationPoint(-0.01F, -0.9F, -8.4F);
        this.Bodyfront.addChild(Sailmiddlefront);
        this.setRotateAngle(Sailmiddlefront, -0.0637F, 0.0F, 0.0F);
        this.Sailmiddlefront.cubeList.add(new ModelBox(Sailmiddlefront, 28, 37, 0.0F, -9.1F, -1.0F, 0, 9, 10, 0.0F, false));

        this.Sailmiddlefrontbase = new AdvancedModelRendererExtended(this);
        this.Sailmiddlefrontbase.setRotationPoint(0.5F, -2.1F, 1.7F);
        this.Sailmiddlefront.addChild(Sailmiddlefrontbase);
        this.Sailmiddlefrontbase.cubeList.add(new ModelBox(Sailmiddlefrontbase, 55, 55, -1.0F, 0.0F, -1.0F, 1, 3, 7, 0.0F, false));

        this.Sailmiddle = new AdvancedModelRendererExtended(this);
        this.Sailmiddle.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.Bodymiddle.addChild(Sailmiddle);
        this.Sailmiddle.cubeList.add(new ModelBox(Sailmiddle, 24, 9, 0.0F, -8.5F, 0.0F, 0, 9, 13, 0.0F, false));

        this.Sailmiddlebase = new AdvancedModelRendererExtended(this);
        this.Sailmiddlebase.setRotationPoint(0.5F, -1.3F, -1.0F);
        this.Sailmiddle.addChild(Sailmiddlebase);
        this.Sailmiddlebase.cubeList.add(new ModelBox(Sailmiddlebase, 21, 31, -1.0F, 0.0F, 0.0F, 1, 3, 13, 0.0F, false));

        this.Tailbase = new AdvancedModelRendererExtended(this);
        this.Tailbase.setRotationPoint(0.0F, -0.9F, 1.5F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0911F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 47, 5, -2.0F, -1.0F, 0.0F, 4, 5, 8, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRendererExtended(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0637F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 40, 48, -1.5F, -1.0F, 0.0F, 3, 3, 8, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRendererExtended(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4F, 7.5F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.2731F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 29, 0, -1.0F, -0.5F, 0.0F, 2, 2, 11, 0.0F, false));

        this.Tailend = new AdvancedModelRendererExtended(this);
        this.Tailend.setRotationPoint(0.0F, 0.3F, 10.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.2731F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 36, 31, -0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(-2.5F, 2.8F, -0.5F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.4245F, 0.1485F, 0.2546F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 14, 56, -2.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(-0.7F, 5.1F, -1.0F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.9552F, 0.1274F, -0.0848F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 32, 66, -1.0F, 0.0F, -0.5F, 2, 8, 3, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.0F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 65, 18, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(2.5F, 2.8F, -0.5F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.4245F, -0.1485F, -0.2546F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 56, -1.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F, false));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(0.7F, 5.1F, -1.0F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.9552F, -0.1274F, 0.0848F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 29, 0, -1.0F, 0.0F, -0.5F, 2, 8, 3, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, 0.0F, 0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 44, 0, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Sailend = new AdvancedModelRendererExtended(this);
        this.Sailend.setRotationPoint(0.01F, -1.9F, -6.4F);
        this.Hips.addChild(Sailend);
        this.setRotateAngle(Sailend, 0.2276F, 0.0F, 0.0F);
        this.Sailend.cubeList.add(new ModelBox(Sailend, 0, 17, 0.0F, -6.5F, 0.0F, 0, 9, 5, 0.0F, false));

        this.Sailendbase = new AdvancedModelRendererExtended(this);
        this.Sailendbase.setRotationPoint(0.5F, -1.1F, 0.4F);
        this.Sailend.addChild(Sailendbase);
        this.setRotateAngle(Sailendbase, -0.6283F, 0.0F, 0.0F);
        this.Sailendbase.cubeList.add(new ModelBox(Sailendbase, 65, 35, -1.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neckbase.offsetY = -0.05F;
        this.Neckbase.offsetZ = 0.08F;
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(23);
        this.Neckbase.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.25F, 0.2F, 0.05F);
        this.setRotateAngle(Bodyfront, 0.1F, 0.2F, 0.05F);
        this.setRotateAngle(Neckbase, 0.05F, 0.15F, 0.0F);
        this.setRotateAngle(Neckend, 0.05F, 0.15F, 0.F);
        this.setRotateAngle(Head, -0.1F, 0.15F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, -0.2F, -0.1F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.15F, -0.2F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.15F, -0.2F, 0.0F);
        this.setRotateAngle(Tailend, 0.13F, -0.2F, 0.0F);
        this.setRotateAngle(Leftthigh, -0.7F, 0.8F, 0.5F);
        this.setRotateAngle(Leftshin, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Rightthigh, 0.3F, -0.2F, 0.0F);
        this.setRotateAngle(Rightshin, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(Righthindfoot, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.5F, -0.3F, 0.8F);
        this.setRotateAngle(Leftlowerarm, -0.6F, -0.3F, -0.5F);
        this.setRotateAngle(Leftfrontfoot, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperarm, -0.3F, 0.3F, -0.3F);
        this.setRotateAngle(Rightlowerarm, 0.2F, 0.0F, 0.35F);
        this.setRotateAngle(Rightfrontfoot, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.07F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
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
        //this.root.offsetY = 0.68F;

        EntityPrehistoricFloraCtenospondylus Ctenospondylus = (EntityPrehistoricFloraCtenospondylus) e;
        float masterSpeed = Ctenospondylus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neckbase);
        this.faceTarget(f3, f4, 5, Neckend);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        Ctenospondylus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Ctenospondylus.getAnimation() == Ctenospondylus.LAY_ANIMATION) {
            this.swing(Neckbase, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Ctenospondylus.getIsMoving()) { //Not moving
            this.swing(Neckbase, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neckbase, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.425F;
        if (Ctenospondylus.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.17F, true, 4, 0.15F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.17F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.085F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.085F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.35F, true, 5, 0.30F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.35F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.26F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.26F, true, 5, 0F, f2, 1F);

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

        this.bobExtended(Hips, speed * 2F, 0.18F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Bodymiddle, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        if (Ctenospondylus.getAnimation() != Ctenospondylus.ATTACK_ANIMATION
                && Ctenospondylus.getAnimation() != Ctenospondylus.EAT_ANIMATION) {
            this.swing(Neckbase, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neckbase, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }

        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.1), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCtenospondylus e = (EntityPrehistoricFloraCtenospondylus) entity;
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
