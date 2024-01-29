package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGuanlong;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGuanlong extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neckbase;
    private final AdvancedModelRenderer Neckmiddle;
    private final AdvancedModelRenderer Neckfront;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Headcrest;
    private final AdvancedModelRenderer Rightupperfrontteeth;
    private final AdvancedModelRenderer Leftupperfrontteeth;
    private final AdvancedModelRenderer Upperbackteeth;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawmiddleslope;
    private final AdvancedModelRenderer Leftlowerteeth;
    private final AdvancedModelRenderer Rightlowerteeth;
    private final AdvancedModelRenderer Lowerjawchinslope;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Righteyebrowfront;
    private final AdvancedModelRenderer Righteyebrowmiddle;
    private final AdvancedModelRenderer Righteyebrowback;
    private final AdvancedModelRenderer Lefteyebrowfront;
    private final AdvancedModelRenderer Lefteyebrowmiddle;
    private final AdvancedModelRenderer Lefteyebrowback;
    private final AdvancedModelRenderer Throatpouch;
    private final AdvancedModelRenderer Neckfeathersfront;
    private final AdvancedModelRenderer Neckfeathersmiddle;
    private final AdvancedModelRenderer Neckfeathersbase;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Righthand;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Lefthand;
    private final AdvancedModelRenderer Bodyfrontfeathers;
    private final AdvancedModelRenderer Bodyfrontunderfluff;
    private final AdvancedModelRenderer Bodyfrontchestfluff;
    private final AdvancedModelRenderer Belly;
    private final AdvancedModelRenderer Bellyfluff;
    private final AdvancedModelRenderer Bodymiddlefeathers;
    private final AdvancedModelRenderer Bodymiddlemohawk;
    private final AdvancedModelRenderer Leftflankfluff;
    private final AdvancedModelRenderer Rightflankfluff;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfluffend;
    private final AdvancedModelRenderer Tailendsidefluff;
    private final AdvancedModelRenderer Tailfluffmiddleend;
    private final AdvancedModelRenderer Tailmidendsidefluff;
    private final AdvancedModelRenderer Flufftailmidbase;
    private final AdvancedModelRenderer Tailbasemohawk;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Leftankle;
    private final AdvancedModelRenderer Leftfoot;
    private final AdvancedModelRenderer Leftthighfluff;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Rightankle;
    private final AdvancedModelRenderer Rightfoot;
    private final AdvancedModelRenderer Rightthighfluff;
    private final AdvancedModelRenderer Hipfeathers;
    private final AdvancedModelRenderer Hipmohawk;
    private ModelAnimator animator;

    public ModelGuanlong() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 4.9F, -1.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 81, -2.5F, -2.5F, -3.5F, 5, 10, 9, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.9F, -2.8F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1061F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 64, -3.0F, -1.5F, -8.0F, 6, 8, 8, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -7.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1061F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 51, -2.5F, -1.5F, -5.0F, 5, 7, 5, 0.0F, false));

        this.Neckbase = new AdvancedModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.4882F, 0.0F, 0.0F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 0, 30, -1.5F, -1.0F, -5.0F, 3, 4, 5, 0.0F, false));

        this.Neckmiddle = new AdvancedModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.4033F, 0.0F, 0.0F);
        this.Neckmiddle.cubeList.add(new ModelBox(Neckmiddle, 17, 30, -1.0F, -1.0F, -5.0F, 2, 4, 5, 0.0F, false));

        this.Neckfront = new AdvancedModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, -0.3F, -4.15F);
        this.Neckmiddle.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.5519F, 0.0F, 0.0F);
        this.Neckfront.cubeList.add(new ModelBox(Neckfront, 0, 21, -1.0F, -1.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3F, -3.3F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.2335F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 14, -1.5F, -0.75F, -3.0F, 3, 3, 3, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 0.02F, -2.9F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.4245F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 0, 7, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0424F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 13, 11, -0.5F, 0.0F, -2.0F, 1, 2, 7, 0.0F, false));

        this.Headcrest = new AdvancedModelRenderer(this);
        this.Headcrest.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.Upperjawfront.addChild(Headcrest);
        this.setRotateAngle(Headcrest, 0.0848F, 0.0F, 0.0F);
        this.Headcrest.cubeList.add(new ModelBox(Headcrest, 13, 12, 0.0F, -3.0F, 0.0F, 0, 4, 9, 0.0F, false));

        this.Rightupperfrontteeth = new AdvancedModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(-0.35F, 1.4F, -1.85F);
        this.Upperjawfront.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, -0.0424F, 0.0F);
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 94, 8, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Leftupperfrontteeth = new AdvancedModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(0.35F, 1.4F, -1.85F);
        this.Upperjawfront.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, 0.0424F, 0.0F);
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 94, 6, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 76, 7, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.0873F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 28, 1, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.4245F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 65, 18, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0546F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 84, 12, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjawmiddleslope = new AdvancedModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.01F, 0.1F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawmiddleslope.cubeList.add(new ModelBox(Lowerjawmiddleslope, 73, 12, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Leftlowerteeth = new AdvancedModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.2F, 0.4F, -4.8F);
        this.Lowerjawmiddle.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.1061F, -0.1061F, 0.0F);
        this.Leftlowerteeth.cubeList.add(new ModelBox(Leftlowerteeth, 91, 11, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.22F, 0.4F, -4.8F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.1061F, 0.1061F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 91, 9, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Lowerjawchinslope = new AdvancedModelRenderer(this);
        this.Lowerjawchinslope.setRotationPoint(-0.01F, 0.9F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawchinslope);
        this.setRotateAngle(Lowerjawchinslope, 0.2759F, 0.0F, 0.0F);
        this.Lowerjawchinslope.cubeList.add(new ModelBox(Lowerjawchinslope, 15, 0, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.2F, -2.9F);
        this.Lowerjawback.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.4458F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 17, 5, -1.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.Righteyebrowfront = new AdvancedModelRenderer(this);
        this.Righteyebrowfront.setRotationPoint(-1.6F, -0.7F, -2.0F);
        this.Head.addChild(Righteyebrowfront);
        this.setRotateAngle(Righteyebrowfront, 0.4458F, -0.3396F, 0.3396F);
        this.Righteyebrowfront.cubeList.add(new ModelBox(Righteyebrowfront, 80, 19, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.Righteyebrowmiddle = new AdvancedModelRenderer(this);
        this.Righteyebrowmiddle.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Righteyebrowfront.addChild(Righteyebrowmiddle);
        this.setRotateAngle(Righteyebrowmiddle, -0.2122F, -0.0848F, 0.0F);
        this.Righteyebrowmiddle.cubeList.add(new ModelBox(Righteyebrowmiddle, 85, 18, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.Righteyebrowback = new AdvancedModelRenderer(this);
        this.Righteyebrowback.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Righteyebrowfront.addChild(Righteyebrowback);
        this.setRotateAngle(Righteyebrowback, -0.4033F, -0.1061F, 0.0F);
        this.Righteyebrowback.cubeList.add(new ModelBox(Righteyebrowback, 87, 17, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.Lefteyebrowfront = new AdvancedModelRenderer(this);
        this.Lefteyebrowfront.setRotationPoint(1.6F, -0.7F, -2.0F);
        this.Head.addChild(Lefteyebrowfront);
        this.setRotateAngle(Lefteyebrowfront, 0.4458F, 0.3396F, -0.3396F);
        this.Lefteyebrowfront.cubeList.add(new ModelBox(Lefteyebrowfront, 77, 19, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.Lefteyebrowmiddle = new AdvancedModelRenderer(this);
        this.Lefteyebrowmiddle.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Lefteyebrowfront.addChild(Lefteyebrowmiddle);
        this.setRotateAngle(Lefteyebrowmiddle, -0.2122F, 0.0848F, 0.0F);
        this.Lefteyebrowmiddle.cubeList.add(new ModelBox(Lefteyebrowmiddle, 82, 18, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.Lefteyebrowback = new AdvancedModelRenderer(this);
        this.Lefteyebrowback.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Lefteyebrowfront.addChild(Lefteyebrowback);
        this.setRotateAngle(Lefteyebrowback, -0.4033F, 0.1061F, 0.0F);
        this.Lefteyebrowback.cubeList.add(new ModelBox(Lefteyebrowback, 90, 17, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.Throatpouch = new AdvancedModelRenderer(this);
        this.Throatpouch.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Neckfront.addChild(Throatpouch);
        this.setRotateAngle(Throatpouch, -0.4671F, 0.0F, 0.0F);
        this.Throatpouch.cubeList.add(new ModelBox(Throatpouch, 32, 35, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Neckfeathersfront = new AdvancedModelRenderer(this);
        this.Neckfeathersfront.setRotationPoint(0.0F, -0.4F, -3.2F);
        this.Neckfront.addChild(Neckfeathersfront);
        this.setRotateAngle(Neckfeathersfront, 0.1274F, 0.0F, 0.0F);
        this.Neckfeathersfront.cubeList.add(new ModelBox(Neckfeathersfront, 85, 7, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Neckfeathersmiddle = new AdvancedModelRenderer(this);
        this.Neckfeathersmiddle.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.Neckmiddle.addChild(Neckfeathersmiddle);
        this.setRotateAngle(Neckfeathersmiddle, 0.0424F, 0.0F, 0.0F);
        this.Neckfeathersmiddle.cubeList.add(new ModelBox(Neckfeathersmiddle, 57, 0, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Neckfeathersbase = new AdvancedModelRenderer(this);
        this.Neckfeathersbase.setRotationPoint(-0.01F, -0.8F, -4.5F);
        this.Neckbase.addChild(Neckfeathersbase);
        this.Neckfeathersbase.cubeList.add(new ModelBox(Neckfeathersbase, 44, 0, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-2.0F, 3.75F, -3.0F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8278F, -0.1485F, 0.1911F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 23, 9, -1.5F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.5F, 3.8F, 0.5F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.3373F, 0.0F, -0.3396F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 9, 3, -0.5F, 0.0F, -1.5F, 1, 5, 2, 0.0F, false));

        this.Righthand = new AdvancedModelRenderer(this);
        this.Righthand.setRotationPoint(-0.4F, 4.5F, -0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.2546F, -0.0424F, -0.2759F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 27, 41, 0.0F, 0.0F, -2.5F, 1, 5, 4, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(2.0F, 3.75F, -3.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.8278F, 0.1485F, -0.1911F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 34, 6, -0.5F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.5F, 3.8F, 0.5F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.3373F, 0.0F, 0.3396F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 13, 10, -0.5F, 0.0F, -1.5F, 1, 5, 2, 0.0F, false));

        this.Lefthand = new AdvancedModelRenderer(this);
        this.Lefthand.setRotationPoint(0.4F, 4.5F, -0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.2546F, 0.0424F, 0.2759F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 32, 24, -1.0F, 0.0F, -2.5F, 1, 5, 4, 0.0F, false));

        this.Bodyfrontfeathers = new AdvancedModelRenderer(this);
        this.Bodyfrontfeathers.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Bodyfront.addChild(Bodyfrontfeathers);
        this.setRotateAngle(Bodyfrontfeathers, 0.0213F, 0.0F, 0.0F);
        this.Bodyfrontfeathers.cubeList.add(new ModelBox(Bodyfrontfeathers, 85, 0, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.Bodyfrontunderfluff = new AdvancedModelRenderer(this);
        this.Bodyfrontunderfluff.setRotationPoint(0.0F, 4.5F, -4.7F);
        this.Bodyfront.addChild(Bodyfrontunderfluff);
        this.setRotateAngle(Bodyfrontunderfluff, -0.1274F, 0.0F, 0.0F);
        this.Bodyfrontunderfluff.cubeList.add(new ModelBox(Bodyfrontunderfluff, 26, 101, -1.0F, 0.0F, 0.0F, 2, 3, 6, 0.0F, false));

        this.Bodyfrontchestfluff = new AdvancedModelRenderer(this);
        this.Bodyfrontchestfluff.setRotationPoint(0.0F, 3.5F, -5.0F);
        this.Bodyfront.addChild(Bodyfrontchestfluff);
        this.setRotateAngle(Bodyfrontchestfluff, -0.2972F, 0.0F, 0.0F);
        this.Bodyfrontchestfluff.cubeList.add(new ModelBox(Bodyfrontchestfluff, 0, 101, -2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(-0.01F, 6.5F, -8.0F);
        this.Bodymiddle.addChild(Belly);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 40, -2.5F, -2.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.Bellyfluff = new AdvancedModelRenderer(this);
        this.Bellyfluff.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.Belly.addChild(Bellyfluff);
        this.setRotateAngle(Bellyfluff, -0.0637F, 0.0F, 0.0F);
        this.Bellyfluff.cubeList.add(new ModelBox(Bellyfluff, 11, 103, -1.5F, 0.0F, 0.0F, 3, 2, 8, 0.0F, false));

        this.Bodymiddlefeathers = new AdvancedModelRenderer(this);
        this.Bodymiddlefeathers.setRotationPoint(0.0F, -1.2F, -7.5F);
        this.Bodymiddle.addChild(Bodymiddlefeathers);
        this.setRotateAngle(Bodymiddlefeathers, 0.0424F, 0.0F, 0.0F);
        this.Bodymiddlefeathers.cubeList.add(new ModelBox(Bodymiddlefeathers, 40, 45, -1.5F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.Bodymiddlemohawk = new AdvancedModelRenderer(this);
        this.Bodymiddlemohawk.setRotationPoint(0.01F, -0.5F, -8.0F);
        this.Bodymiddle.addChild(Bodymiddlemohawk);
        this.setRotateAngle(Bodymiddlemohawk, 0.0637F, 0.0F, 0.0F);
        this.Bodymiddlemohawk.cubeList.add(new ModelBox(Bodymiddlemohawk, 13, 17, 0.0F, -3.0F, 0.0F, 0, 3, 9, 0.0F, false));

        this.Leftflankfluff = new AdvancedModelRenderer(this);
        this.Leftflankfluff.setRotationPoint(-2.3F, 4.8F, -3.7F);
        this.Bodymiddle.addChild(Leftflankfluff);
        this.setRotateAngle(Leftflankfluff, -0.1061F, -0.1911F, -0.7641F);
        this.Leftflankfluff.cubeList.add(new ModelBox(Leftflankfluff, 108, 10, -2.0F, -0.5F, -4.0F, 2, 1, 8, 0.0F, false));

        this.Rightflankfluff = new AdvancedModelRenderer(this);
        this.Rightflankfluff.setRotationPoint(2.3F, 4.8F, -3.7F);
        this.Bodymiddle.addChild(Rightflankfluff);
        this.setRotateAngle(Rightflankfluff, -0.1061F, 0.1911F, 0.7641F);
        this.Rightflankfluff.cubeList.add(new ModelBox(Rightflankfluff, 108, 0, 0.0F, -0.5F, -4.0F, 2, 1, 8, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.7F, 4.7F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 29, 84, -2.0F, -1.5F, 0.0F, 4, 6, 10, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.3F, 9.2F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1061F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 29, 66, -1.5F, -1.0F, 0.0F, 3, 5, 12, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.01F, -0.3F, 11.3F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1274F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 58, 83, -1.0F, -0.5F, 0.0F, 2, 4, 13, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.01F, 12.3F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1061F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 60, 66, -1.0F, -0.5F, 0.0F, 2, 3, 13, 0.0F, false));

        this.Tailfluffend = new AdvancedModelRenderer(this);
        this.Tailfluffend.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.Tailend.addChild(Tailfluffend);
        this.setRotateAngle(Tailfluffend, -0.0213F, 0.0F, 0.0F);
        this.Tailfluffend.cubeList.add(new ModelBox(Tailfluffend, 59, 17, -0.5F, -2.5F, 0.0F, 1, 5, 17, 0.0F, false));

        this.Tailendsidefluff = new AdvancedModelRenderer(this);
        this.Tailendsidefluff.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.Tailend.addChild(Tailendsidefluff);
        this.setRotateAngle(Tailendsidefluff, -0.0424F, 0.0F, 0.0F);
        this.Tailendsidefluff.cubeList.add(new ModelBox(Tailendsidefluff, 82, 15, -2.5F, -0.5F, 0.0F, 5, 1, 15, 0.0F, false));

        this.Tailfluffmiddleend = new AdvancedModelRenderer(this);
        this.Tailfluffmiddleend.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.Tailmiddleend.addChild(Tailfluffmiddleend);
        this.setRotateAngle(Tailfluffmiddleend, 0.0424F, 0.0F, 0.0F);
        this.Tailfluffmiddleend.cubeList.add(new ModelBox(Tailfluffmiddleend, 98, 34, -0.5F, -2.0F, 0.0F, 1, 2, 14, 0.0F, false));

        this.Tailmidendsidefluff = new AdvancedModelRenderer(this);
        this.Tailmidendsidefluff.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Tailmiddleend.addChild(Tailmidendsidefluff);
        this.setRotateAngle(Tailmidendsidefluff, -0.0213F, 0.0F, 0.0F);
        this.Tailmidendsidefluff.cubeList.add(new ModelBox(Tailmidendsidefluff, 86, 0, -2.0F, 0.0F, 0.0F, 4, 0, 14, 0.0F, false));

        this.Flufftailmidbase = new AdvancedModelRenderer(this);
        this.Flufftailmidbase.setRotationPoint(-0.01F, -0.4F, 0.0F);
        this.Tailmiddlebase.addChild(Flufftailmidbase);
        this.setRotateAngle(Flufftailmidbase, 0.0424F, 0.0F, 0.0F);
        this.Flufftailmidbase.cubeList.add(new ModelBox(Flufftailmidbase, 83, 20, 0.0F, -1.0F, 0.0F, 0, 1, 12, 0.0F, false));

        this.Tailbasemohawk = new AdvancedModelRenderer(this);
        this.Tailbasemohawk.setRotationPoint(0.01F, -1.5F, 0.0F);
        this.Tailbase.addChild(Tailbasemohawk);
        this.setRotateAngle(Tailbasemohawk, -0.0637F, 0.0F, 0.0F);
        this.Tailbasemohawk.cubeList.add(new ModelBox(Tailbasemohawk, 108, 22, 0.0F, -1.0F, 0.0F, 0, 1, 10, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.3F, 0.5F, 0.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2546F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 41, 30, -2.0F, -1.0F, -1.5F, 3, 9, 6, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.7F, 7.5F, -1.0F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.0189F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 32, 52, -1.0F, 0.0F, -0.5F, 2, 10, 4, 0.0F, false));

        this.Leftankle = new AdvancedModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 9.3F, 2.5F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.9339F, 0.0F, 0.0F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 45, 7, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, false));

        this.Leftfoot = new AdvancedModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.2759F, 0.0F, 0.0F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 32, 15, -1.5F, -0.5F, -5.0F, 3, 2, 6, 0.0F, false));

        this.Leftthighfluff = new AdvancedModelRenderer(this);
        this.Leftthighfluff.setRotationPoint(-1.9F, 4.5F, 1.0F);
        this.Leftthigh.addChild(Leftthighfluff);
        this.setRotateAngle(Leftthighfluff, 0.1061F, -0.0637F, -0.3183F);
        this.Leftthighfluff.cubeList.add(new ModelBox(Leftthighfluff, 108, 15, 0.0F, 0.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 0.5F, 0.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.2546F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 53, 18, -1.0F, -1.0F, -1.5F, 3, 9, 6, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.7F, 7.5F, -1.0F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.0189F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 20, 58, -1.0F, 0.0F, -0.5F, 2, 10, 4, 0.0F, false));

        this.Rightankle = new AdvancedModelRenderer(this);
        this.Rightankle.setRotationPoint(0.01F, 9.3F, 2.5F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.9339F, 0.0F, 0.0F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 66, 7, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, false));

        this.Rightfoot = new AdvancedModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.2759F, 0.0F, 0.0F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 50, 9, -1.5F, -0.5F, -5.0F, 3, 2, 6, 0.0F, false));

        this.Rightthighfluff = new AdvancedModelRenderer(this);
        this.Rightthighfluff.setRotationPoint(1.9F, 4.5F, 1.0F);
        this.Rightthigh.addChild(Rightthighfluff);
        this.setRotateAngle(Rightthighfluff, 0.1061F, 0.0637F, 0.3183F);
        this.Rightthighfluff.cubeList.add(new ModelBox(Rightthighfluff, 108, 18, 0.0F, 0.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.Hipfeathers = new AdvancedModelRenderer(this);
        this.Hipfeathers.setRotationPoint(0.0F, -2.3F, -3.5F);
        this.Hips.addChild(Hipfeathers);
        this.setRotateAngle(Hipfeathers, -0.1061F, 0.0F, 0.0F);
        this.Hipfeathers.cubeList.add(new ModelBox(Hipfeathers, 70, 0, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.Hipmohawk = new AdvancedModelRenderer(this);
        this.Hipmohawk.setRotationPoint(0.0F, -2.5F, -3.5F);
        this.Hips.addChild(Hipmohawk);
        this.setRotateAngle(Hipmohawk, -0.1061F, 0.0F, 0.0F);
        this.Hipmohawk.cubeList.add(new ModelBox(Hipmohawk, 108, 17, 0.0F, -2.0F, 0.0F, 0, 2, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Upperjawfront, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.4245F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatpouch, -0.3798F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmidendsidefluff, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend, -0.1374F, 0.3487F, -0.0171F);
        this.setRotateAngle(Tailmiddlebase, -0.1124F, 0.1745F, -0.0044F);
        this.setRotateAngle(Tailfluffmiddleend, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfluffend, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailendsidefluff, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, -0.0634F, 0.3054F, -0.0059F);
        this.setRotateAngle(Tailbasemohawk, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, -0.1531F, 0.1301F, -0.0143F);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, -0.0424F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.1635F, -0.2516F, 0.6699F);
        this.setRotateAngle(Rightthighfluff, 0.1061F, 0.0637F, 0.3183F);
        this.setRotateAngle(Rightthigh, -0.4732F, -0.0587F, -0.019F);
        this.setRotateAngle(Rightshin, 1.0189F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.1061F, 0.1061F, 0.0F);
        this.setRotateAngle(Rightlowerarm, -1.2452F, 0.2845F, -0.0042F);
        this.setRotateAngle(Righthand, 0.2448F, 0.1481F, -0.3172F);
        this.setRotateAngle(Rightfoot, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Rightflankfluff, -0.1061F, 0.1911F, 0.7641F);
        this.setRotateAngle(Righteyebrowmiddle, -0.2187F, -0.2553F, 0.0378F);
        this.setRotateAngle(Righteyebrowfront, 0.8821F, -0.3396F, 0.3396F);
        this.setRotateAngle(Righteyebrowback, -0.4217F, -0.3061F, 0.0892F);
        this.setRotateAngle(Rightankle, -0.9339F, 0.0F, 0.0F);
        this.setRotateAngle(Neckmiddle, -0.1852F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfront, 0.3337F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfeathersmiddle, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfeathersfront, 0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Neckbase, -0.3163F, 0.014F, 0.0431F);
        this.setRotateAngle(Masseter, -0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.4245F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.0546F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawchinslope, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, 0.0424F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.1635F, 0.2516F, -0.6699F);
        this.setRotateAngle(Leftthighfluff, 0.1061F, -0.0637F, -0.3183F);
        this.setRotateAngle(Leftthigh, -0.5169F, 0.0379F, -0.0216F);
        this.setRotateAngle(Leftshin, 1.0189F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.1061F, -0.1061F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -1.2452F, -0.2845F, 0.0042F);
        this.setRotateAngle(Lefthand, 0.2448F, -0.1481F, 0.3172F);
        this.setRotateAngle(Leftfoot, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Leftflankfluff, -0.1061F, -0.1911F, -0.7641F);
        this.setRotateAngle(Lefteyebrowmiddle, -0.2187F, 0.2553F, -0.0378F);
        this.setRotateAngle(Lefteyebrowfront, 0.8821F, 0.3396F, -0.3396F);
        this.setRotateAngle(Lefteyebrowback, -0.4217F, 0.3061F, -0.0892F);
        this.setRotateAngle(Leftankle, -0.9339F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Hipmohawk, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Hipfeathers, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Headcrest, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.1488F, -0.0485F, -0.0465F);
        this.setRotateAngle(Flufftailmidbase, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddlemohawk, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddlefeathers, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.0684F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontunderfluff, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontfeathers, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontchestfluff, -0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.1497F, 0.0F, 0.0F);
        this.setRotateAngle(Bellyfluff, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);
        this.Bodymiddle.offsetY = -0.01F;
        this.Bodymiddle.offsetZ = 0.04F;
        this.Bodymiddle.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Upperjawfront, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.4245F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatpouch, -0.118F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmidendsidefluff, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend, -0.1374F, 0.3487F, -0.0171F);
        this.setRotateAngle(Tailmiddlebase, -0.1124F, 0.1745F, -0.0044F);
        this.setRotateAngle(Tailfluffmiddleend, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfluffend, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailendsidefluff, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, -0.0634F, 0.3054F, -0.0059F);
        this.setRotateAngle(Tailbasemohawk, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, -0.1531F, 0.1301F, -0.0143F);
        this.setRotateAngle(root, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, -0.0424F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.6096F, -0.1485F, 0.1911F);
        this.setRotateAngle(Rightthighfluff, 0.1061F, 0.0637F, 0.3183F);
        this.setRotateAngle(Rightthigh, -0.4732F, -0.0587F, -0.019F);
        this.setRotateAngle(Rightshin, 1.0189F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.1061F, 0.1061F, 0.0F);
        this.setRotateAngle(Rightlowerarm, -1.3373F, 0.0F, -0.3396F);
        this.setRotateAngle(Righthand, 0.2546F, -0.0424F, -0.2759F);
        this.setRotateAngle(Rightfoot, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Rightflankfluff, -0.1061F, 0.1911F, 0.7641F);
        this.setRotateAngle(Righteyebrowmiddle, -0.2122F, -0.0848F, 0.0F);
        this.setRotateAngle(Righteyebrowfront, 0.4458F, -0.3396F, 0.3396F);
        this.setRotateAngle(Righteyebrowback, -0.4033F, -0.1061F, 0.0F);
        this.setRotateAngle(Rightankle, -0.9339F, 0.0F, 0.0F);
        this.setRotateAngle(Neckmiddle, 0.0341F, -0.2617F, -0.0088F);
        this.setRotateAngle(Neckfront, -0.0159F, -0.2618F, 0.0041F);
        this.setRotateAngle(Neckfeathersmiddle, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfeathersfront, 0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Neckbase, -0.1435F, -0.1587F, 0.0679F);
        this.setRotateAngle(Masseter, -0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.4245F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.0546F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawchinslope, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, 0.0424F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.8278F, 0.1485F, -0.1911F);
        this.setRotateAngle(Leftthighfluff, 0.1061F, -0.0637F, -0.3183F);
        this.setRotateAngle(Leftthigh, -0.5169F, 0.0379F, -0.0216F);
        this.setRotateAngle(Leftshin, 1.0189F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.1061F, -0.1061F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -1.5554F, 0.0F, 0.3396F);
        this.setRotateAngle(Lefthand, 0.2546F, 0.0424F, 0.2759F);
        this.setRotateAngle(Leftfoot, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Leftflankfluff, -0.1061F, -0.1911F, -0.7641F);
        this.setRotateAngle(Lefteyebrowmiddle, -0.2122F, 0.0848F, 0.0F);
        this.setRotateAngle(Lefteyebrowfront, 0.4458F, 0.3396F, -0.3396F);
        this.setRotateAngle(Lefteyebrowback, -0.4033F, 0.1061F, 0.0F);
        this.setRotateAngle(Leftankle, -0.9339F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Hipmohawk, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Hipfeathers, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Headcrest, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.078F, -0.0509F, 0.1283F);
        this.setRotateAngle(Flufftailmidbase, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddlemohawk, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddlefeathers, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.239F, -0.1272F, -0.0309F);
        this.setRotateAngle(Bodyfrontunderfluff, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontfeathers, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontchestfluff, -0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.3289F, -0.1654F, -0.0561F);
        this.setRotateAngle(Bellyfluff, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);
        this.root.offsetY = -0.115F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.50F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(0);
        this.root.rotateAngleX = (float)Math.toRadians(-88);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGuanlong EntityMegalosaurus = (EntityPrehistoricFloraGuanlong) e;
        this.root.offsetZ = 0.5F;

        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Neck = {this.Neckbase, this.Neckmiddle, this.Neckfront, this.Head};
        AdvancedModelRenderer[] ArmL = {this.Leftupperarm, this.Leftlowerarm, this.Lefthand};
        AdvancedModelRenderer[] ArmR = {this.Rightupperarm, this.Rightlowerarm, this.Righthand};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Lowerjawback, 0.1F, 0.05F, true, 3F, 0.05F, f2, 1F);

                    this.walk(this.Leftupperarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.Rightupperarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.Leftupperarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.Rightupperarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }
    



    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGuanlong ee = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17 + (((tickAnim - 3) / 1) * (-15-(-17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 4) / 4) * (11.07-(-15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.07 + (((tickAnim - 8) / 3) * (11.6-(11.07)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.6 + (((tickAnim - 11) / 4) * (-1.49-(11.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.49 + (((tickAnim - 15) / 15) * (0-(-1.49)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (26.61-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 26.61 + (((tickAnim - 8) / 3) * (29.35-(26.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29.35 + (((tickAnim - 11) / 4) * (15.89-(29.35)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 15.89 + (((tickAnim - 15) / 15) * (0-(15.89)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (-18.57-(27.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -18.57 + (((tickAnim - 8) / 3) * (-8.31-(-18.57)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.31 + (((tickAnim - 11) / 4) * (-3.62-(-8.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.62 + (((tickAnim - 15) / 15) * (0-(-3.62)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(xx), Neckfront.rotateAngleY + (float) Math.toRadians(yy), Neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 4) / 2) * (-20.36-(12.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.36 + (((tickAnim - 6) / 2) * (-6.4-(-20.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.4 + (((tickAnim - 8) / 3) * (6.71-(-6.4)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.71 + (((tickAnim - 11) / 2) * (18.44-(6.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.44 + (((tickAnim - 13) / 4) * (11.5-(18.44)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 17) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 3) / 4) * (48.45-(17.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 48.45 + (((tickAnim - 7) / 2) * (0-(48.45)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.06028-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.97637-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.69063-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -10.06028 + (((tickAnim - 10) / 20) * (-10.06028-(-10.06028)));
            yy = 9.97637 + (((tickAnim - 10) / 20) * (9.97637-(9.97637)));
            zz = -0.69063 + (((tickAnim - 10) / 20) * (-0.69063-(-0.69063)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -10.06028 + (((tickAnim - 30) / 5) * (-2.56-(-10.06028)));
            yy = 9.97637 + (((tickAnim - 30) / 5) * (0-(9.97637)));
            zz = -0.69063 + (((tickAnim - 30) / 5) * (0-(-0.69063)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.56 + (((tickAnim - 35) / 5) * (-10.06028-(-2.56)));
            yy = 0 + (((tickAnim - 35) / 5) * (-9.97637-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0.69063-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 59) {
            xx = -10.06028 + (((tickAnim - 40) / 19) * (-10.06028-(-10.06028)));
            yy = -9.97637 + (((tickAnim - 40) / 19) * (-9.97637-(-9.97637)));
            zz = 0.69063 + (((tickAnim - 40) / 19) * (0.69063-(0.69063)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -10.06028 + (((tickAnim - 59) / 10) * (0-(-10.06028)));
            yy = -9.97637 + (((tickAnim - 59) / 10) * (0-(-9.97637)));
            zz = 0.69063 + (((tickAnim - 59) / 10) * (0-(0.69063)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 10) / 3) * (-10.0949-(-10)));
            yy = 27.5 + (((tickAnim - 10) / 3) * (29.99401-(27.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.19727-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -10.0949 + (((tickAnim - 13) / 17) * (-10-(-10.0949)));
            yy = 29.99401 + (((tickAnim - 13) / 17) * (27.5-(29.99401)));
            zz = -0.19727 + (((tickAnim - 13) / 17) * (0-(-0.19727)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 30) / 5) * (5.03764-(-10)));
            yy = 27.5 + (((tickAnim - 30) / 5) * (-4.92293-(27.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.87557-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5.03764 + (((tickAnim - 35) / 5) * (-2.5-(5.03764)));
            yy = -4.92293 + (((tickAnim - 35) / 5) * (-27.5-(-4.92293)));
            zz = -0.87557 + (((tickAnim - 35) / 5) * (0-(-0.87557)));
        }
        else if (tickAnim >= 40 && tickAnim < 59) {
            xx = -2.5 + (((tickAnim - 40) / 19) * (-10-(-2.5)));
            yy = -27.5 + (((tickAnim - 40) / 19) * (-27.5-(-27.5)));
            zz = 0 + (((tickAnim - 40) / 19) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -10 + (((tickAnim - 59) / 5) * (1-(-10)));
            yy = -27.5 + (((tickAnim - 59) / 5) * (-11-(-27.5)));
            zz = 0 + (((tickAnim - 59) / 5) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 1 + (((tickAnim - 64) / 5) * (0-(1)));
            yy = -11 + (((tickAnim - 64) / 5) * (0-(-11)));
            zz = 0 + (((tickAnim - 64) / 5) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.67009-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (13.01476-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (10.58805-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.67009 + (((tickAnim - 5) / 8) * (-4.08852-(-1.67009)));
            yy = 13.01476 + (((tickAnim - 5) / 8) * (21.09316-(13.01476)));
            zz = 10.58805 + (((tickAnim - 5) / 8) * (20.71387-(10.58805)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -4.08852 + (((tickAnim - 13) / 17) * (-4.08852-(-4.08852)));
            yy = 21.09316 + (((tickAnim - 13) / 17) * (21.09316-(21.09316)));
            zz = 20.71387 + (((tickAnim - 13) / 17) * (20.71387-(20.71387)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -4.08852 + (((tickAnim - 30) / 5) * (8.41-(-4.08852)));
            yy = 21.09316 + (((tickAnim - 30) / 5) * (0-(21.09316)));
            zz = 20.71387 + (((tickAnim - 30) / 5) * (0-(20.71387)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8.41 + (((tickAnim - 35) / 5) * (0.91148-(8.41)));
            yy = 0 + (((tickAnim - 35) / 5) * (-21.09316-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-20.71387-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 59) {
            xx = 0.91148 + (((tickAnim - 40) / 19) * (-4.08852-(0.91148)));
            yy = -21.09316 + (((tickAnim - 40) / 19) * (-21.09316-(-21.09316)));
            zz = -20.71387 + (((tickAnim - 40) / 19) * (-20.71387-(-20.71387)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -4.08852 + (((tickAnim - 59) / 5) * (8.63449-(-4.08852)));
            yy = -21.09316 + (((tickAnim - 59) / 5) * (-13.77262-(-21.09316)));
            zz = -20.71387 + (((tickAnim - 59) / 5) * (-22.57926-(-20.71387)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 8.63449 + (((tickAnim - 64) / 5) * (0-(8.63449)));
            yy = -13.77262 + (((tickAnim - 64) / 5) * (0-(-13.77262)));
            zz = -22.57926 + (((tickAnim - 64) / 5) * (0-(-22.57926)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.78145-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (15.28831-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.02856-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.78145 + (((tickAnim - 5) / 8) * (0-(0.78145)));
            yy = 15.28831 + (((tickAnim - 5) / 8) * (22.5-(15.28831)));
            zz = 3.02856 + (((tickAnim - 5) / 8) * (0-(3.02856)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 22.5 + (((tickAnim - 13) / 17) * (22.5-(22.5)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (7.93814-(0)));
            yy = 22.5 + (((tickAnim - 30) / 5) * (-6.92337-(22.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (-7.23341-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.93814 + (((tickAnim - 35) / 5) * (5-(7.93814)));
            yy = -6.92337 + (((tickAnim - 35) / 5) * (-22.5-(-6.92337)));
            zz = -7.23341 + (((tickAnim - 35) / 5) * (0-(-7.23341)));
        }
        else if (tickAnim >= 40 && tickAnim < 59) {
            xx = 5 + (((tickAnim - 40) / 19) * (0-(5)));
            yy = -22.5 + (((tickAnim - 40) / 19) * (-22.5-(-22.5)));
            zz = 0 + (((tickAnim - 40) / 19) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 59) / 5) * (8.66507-(0)));
            yy = -22.5 + (((tickAnim - 59) / 5) * (-6.6126-(-22.5)));
            zz = 0 + (((tickAnim - 59) / 5) * (9.80264-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 8.66507 + (((tickAnim - 64) / 5) * (0-(8.66507)));
            yy = -6.6126 + (((tickAnim - 64) / 5) * (20-(-6.6126)));
            zz = 9.80264 + (((tickAnim - 64) / 5) * (0-(9.80264)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 69) / 4) * (-0.42349-(0)));
            yy = 20 + (((tickAnim - 69) / 4) * (-2.02719-(20)));
            zz = 0 + (((tickAnim - 69) / 4) * (6.89943-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -0.42349 + (((tickAnim - 73) / 7) * (0-(-0.42349)));
            yy = -2.02719 + (((tickAnim - 73) / 7) * (0-(-2.02719)));
            zz = 6.89943 + (((tickAnim - 73) / 7) * (0-(6.89943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.56446-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (22.45261-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (31.00134-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.56446 + (((tickAnim - 5) / 8) * (15.1964-(12.56446)));
            yy = 22.45261 + (((tickAnim - 5) / 8) * (5.19305-(22.45261)));
            zz = 31.00134 + (((tickAnim - 5) / 8) * (16.81163-(31.00134)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 15.1964 + (((tickAnim - 13) / 17) * (15.1964-(15.1964)));
            yy = 5.19305 + (((tickAnim - 13) / 17) * (5.19305-(5.19305)));
            zz = 16.81163 + (((tickAnim - 13) / 17) * (16.81163-(16.81163)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 15.1964 + (((tickAnim - 30) / 5) * (15.2668-(15.1964)));
            yy = 5.19305 + (((tickAnim - 30) / 5) * (-18.75899-(5.19305)));
            zz = 16.81163 + (((tickAnim - 30) / 5) * (-17.31691-(16.81163)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15.2668 + (((tickAnim - 35) / 5) * (7.6964-(15.2668)));
            yy = -18.75899 + (((tickAnim - 35) / 5) * (-5.19305-(-18.75899)));
            zz = -17.31691 + (((tickAnim - 35) / 5) * (-16.81163-(-17.31691)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 7.6964 + (((tickAnim - 40) / 15) * (15.1964-(7.6964)));
            yy = -5.19305 + (((tickAnim - 40) / 15) * (-5.19305-(-5.19305)));
            zz = -16.81163 + (((tickAnim - 40) / 15) * (-16.81163-(-16.81163)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = 15.1964 + (((tickAnim - 55) / 9) * (7.28309-(15.1964)));
            yy = -5.19305 + (((tickAnim - 55) / 9) * (14.15304-(-5.19305)));
            zz = -16.81163 + (((tickAnim - 55) / 9) * (9.1911-(-16.81163)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 7.28309 + (((tickAnim - 64) / 5) * (0-(7.28309)));
            yy = 14.15304 + (((tickAnim - 64) / 5) * (22.5-(14.15304)));
            zz = 9.1911 + (((tickAnim - 64) / 5) * (0-(9.1911)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            yy = 22.5 + (((tickAnim - 69) / 4) * (0-(22.5)));
            zz = 0 + (((tickAnim - 69) / 4) * (2.5-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 73) / 2) * (5-(2.5)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 75) / 3) * (-5.83-(5)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = -5.83 + (((tickAnim - 78) / 2) * (0-(-5.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(xx), Neckfront.rotateAngleY + (float) Math.toRadians(yy), Neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.88112-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (30.49797-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.06912-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.88112 + (((tickAnim - 5) / 8) * (0-(4.88112)));
            yy = 30.49797 + (((tickAnim - 5) / 8) * (0-(30.49797)));
            zz = 15.06912 + (((tickAnim - 5) / 8) * (7.5-(15.06912)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 7.5 + (((tickAnim - 13) / 4) * (7.5-(7.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 7.5 + (((tickAnim - 17) / 3) * (-15-(7.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = -15 + (((tickAnim - 20) / 7) * (-15-(-15)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (-34.39979-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (-21.22999-(0)));
            zz = -15 + (((tickAnim - 27) / 8) * (11.38596-(-15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -34.39979 + (((tickAnim - 35) / 5) * (-2.66143-(-34.39979)));
            yy = -21.22999 + (((tickAnim - 35) / 5) * (-1.87829-(-21.22999)));
            zz = 11.38596 + (((tickAnim - 35) / 5) * (2.32378-(11.38596)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -2.66143 + (((tickAnim - 40) / 15) * (2.5-(-2.66143)));
            yy = -1.87829 + (((tickAnim - 40) / 15) * (0-(-1.87829)));
            zz = 2.32378 + (((tickAnim - 40) / 15) * (-7.5-(2.32378)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = 2.5 + (((tickAnim - 55) / 9) * (-9.72224-(2.5)));
            yy = 0 + (((tickAnim - 55) / 9) * (22.45872-(0)));
            zz = -7.5 + (((tickAnim - 55) / 9) * (-1.60105-(-7.5)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = -9.72224 + (((tickAnim - 64) / 5) * (0-(-9.72224)));
            yy = 22.45872 + (((tickAnim - 64) / 5) * (0-(22.45872)));
            zz = -1.60105 + (((tickAnim - 64) / 5) * (0-(-1.60105)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 4) * (7.5-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 73) / 2) * (-17.5-(7.5)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = -17.5 + (((tickAnim - 75) / 3) * (0-(-17.5)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowmiddle, Righteyebrowmiddle.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowmiddle.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 5) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (12.5-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 12.5 + (((tickAnim - 12) / 1) * (0-(12.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (5.77501-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (-16.43502-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (9.15895-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 5.77501 + (((tickAnim - 21) / 6) * (5.77501-(5.77501)));
            yy = -16.43502 + (((tickAnim - 21) / 6) * (-16.43502-(-16.43502)));
            zz = 9.15895 + (((tickAnim - 21) / 6) * (9.15895-(9.15895)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 5.77501 + (((tickAnim - 27) / 6) * (5.57721-(5.77501)));
            yy = -16.43502 + (((tickAnim - 27) / 6) * (-24.24165-(-16.43502)));
            zz = 9.15895 + (((tickAnim - 27) / 6) * (21.97886-(9.15895)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5.57721 + (((tickAnim - 33) / 2) * (22.04113-(5.57721)));
            yy = -24.24165 + (((tickAnim - 33) / 2) * (-41.44819-(-24.24165)));
            zz = 21.97886 + (((tickAnim - 33) / 2) * (17.54996-(21.97886)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 22.04113 + (((tickAnim - 35) / 3) * (17.7886-(22.04113)));
            yy = -41.44819 + (((tickAnim - 35) / 3) * (-12.12083-(-41.44819)));
            zz = 17.54996 + (((tickAnim - 35) / 3) * (10.98943-(17.54996)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 17.7886 + (((tickAnim - 38) / 5) * (0-(17.7886)));
            yy = -12.12083 + (((tickAnim - 38) / 5) * (0-(-12.12083)));
            zz = 10.98943 + (((tickAnim - 38) / 5) * (0-(10.98943)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (-4.14746-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (16.19569-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (34.54559-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = -4.14746 + (((tickAnim - 63) / 9) * (10.50397-(-4.14746)));
            yy = 16.19569 + (((tickAnim - 63) / 9) * (-17.71736-(16.19569)));
            zz = 34.54559 + (((tickAnim - 63) / 9) * (8.96959-(34.54559)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = 10.50397 + (((tickAnim - 72) / 1) * (4.36131-(10.50397)));
            yy = -17.71736 + (((tickAnim - 72) / 1) * (1.15259-(-17.71736)));
            zz = 8.96959 + (((tickAnim - 72) / 1) * (33.06889-(8.96959)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 4.36131 + (((tickAnim - 73) / 2) * (9.0013-(4.36131)));
            yy = 1.15259 + (((tickAnim - 73) / 2) * (-0.41577-(1.15259)));
            zz = 33.06889 + (((tickAnim - 73) / 2) * (12.1578-(33.06889)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 9.0013 + (((tickAnim - 75) / 3) * (2.61105-(9.0013)));
            yy = -0.41577 + (((tickAnim - 75) / 3) * (-3.01855-(-0.41577)));
            zz = 12.1578 + (((tickAnim - 75) / 3) * (25.84784-(12.1578)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 2.61105 + (((tickAnim - 78) / 2) * (0-(2.61105)));
            yy = -3.01855 + (((tickAnim - 78) / 2) * (0-(-3.01855)));
            zz = 25.84784 + (((tickAnim - 78) / 2) * (0-(25.84784)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (11.13653-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-22.9795-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-22.79177-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 29) {
            xx = 11.13653 + (((tickAnim - 11) / 18) * (26.01672-(11.13653)));
            yy = -22.9795 + (((tickAnim - 11) / 18) * (-8.96541-(-22.9795)));
            zz = -22.79177 + (((tickAnim - 11) / 18) * (-18.48895-(-22.79177)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 26.01672 + (((tickAnim - 29) / 8) * (28.63653-(26.01672)));
            yy = -8.96541 + (((tickAnim - 29) / 8) * (-22.9795-(-8.96541)));
            zz = -18.48895 + (((tickAnim - 29) / 8) * (-22.79177-(-18.48895)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 28.63653 + (((tickAnim - 37) / 7) * (14.19711-(28.63653)));
            yy = -22.9795 + (((tickAnim - 37) / 7) * (-12.12911-(-22.9795)));
            zz = -22.79177 + (((tickAnim - 37) / 7) * (-29.71944-(-22.79177)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 14.19711 + (((tickAnim - 44) / 14) * (13.21682-(14.19711)));
            yy = -12.12911 + (((tickAnim - 44) / 14) * (-2.0763-(-12.12911)));
            zz = -29.71944 + (((tickAnim - 44) / 14) * (-23.94608-(-29.71944)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 13.21682 + (((tickAnim - 58) / 6) * (3.34421-(13.21682)));
            yy = -2.0763 + (((tickAnim - 58) / 6) * (-7.77611-(-2.0763)));
            zz = -23.94608 + (((tickAnim - 58) / 6) * (8.05547-(-23.94608)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 3.34421 + (((tickAnim - 64) / 8) * (8.71274-(3.34421)));
            yy = -7.77611 + (((tickAnim - 64) / 8) * (-12.74469-(-7.77611)));
            zz = 8.05547 + (((tickAnim - 64) / 8) * (-15.11201-(8.05547)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 8.71274 + (((tickAnim - 72) / 8) * (0-(8.71274)));
            yy = -12.74469 + (((tickAnim - 72) / 8) * (0-(-12.74469)));
            zz = -15.11201 + (((tickAnim - 72) / 8) * (0-(-15.11201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = -27.5 + (((tickAnim - 11) / 26) * (-37.5-(-27.5)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 26) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -37.5 + (((tickAnim - 37) / 7) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -37.5 + (((tickAnim - 44) / 36) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 37.5 + (((tickAnim - 11) / 8) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 19) / 6) * (37.16244-(37.5)));
            yy = 0 + (((tickAnim - 19) / 6) * (9.85444-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-7.70715-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 37.16244 + (((tickAnim - 25) / 12) * (37.16244-(37.16244)));
            yy = 9.85444 + (((tickAnim - 25) / 12) * (9.85444-(9.85444)));
            zz = -7.70715 + (((tickAnim - 25) / 12) * (-7.70715-(-7.70715)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 37.16244 + (((tickAnim - 37) / 7) * (50-(37.16244)));
            yy = 9.85444 + (((tickAnim - 37) / 7) * (0-(9.85444)));
            zz = -7.70715 + (((tickAnim - 37) / 7) * (0-(-7.70715)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 50 + (((tickAnim - 44) / 36) * (0-(50)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthand, Righthand.rotateAngleX + (float) Math.toRadians(xx), Righthand.rotateAngleY + (float) Math.toRadians(yy), Righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 5) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (12.5-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 12.5 + (((tickAnim - 12) / 1) * (0-(12.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-0.65795-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (-13.90628-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (-3.7576-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -0.65795 + (((tickAnim - 22) / 5) * (-0.65795-(-0.65795)));
            yy = -13.90628 + (((tickAnim - 22) / 5) * (-13.90628-(-13.90628)));
            zz = -3.7576 + (((tickAnim - 22) / 5) * (-3.7576-(-3.7576)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -0.65795 + (((tickAnim - 27) / 6) * (5.57721-(-0.65795)));
            yy = -13.90628 + (((tickAnim - 27) / 6) * (-24.24165-(-13.90628)));
            zz = -3.7576 + (((tickAnim - 27) / 6) * (21.97886-(-3.7576)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 5.57721 + (((tickAnim - 33) / 5) * (17.7886-(5.57721)));
            yy = -24.24165 + (((tickAnim - 33) / 5) * (-12.12083-(-24.24165)));
            zz = 21.97886 + (((tickAnim - 33) / 5) * (10.98943-(21.97886)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 17.7886 + (((tickAnim - 38) / 5) * (0-(17.7886)));
            yy = -12.12083 + (((tickAnim - 38) / 5) * (0-(-12.12083)));
            zz = 10.98943 + (((tickAnim - 38) / 5) * (0-(10.98943)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (-4.14746-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (16.19569-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (34.54559-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -4.14746 + (((tickAnim - 63) / 7) * (-10.50397-(-4.14746)));
            yy = 16.19569 + (((tickAnim - 63) / 7) * (-17.71736-(16.19569)));
            zz = 34.54559 + (((tickAnim - 63) / 7) * (-8.96959-(34.54559)));
        }
        else if (tickAnim >= 70 && tickAnim < 72) {
            xx = -10.50397 + (((tickAnim - 70) / 2) * (-20.64607-(-10.50397)));
            yy = -17.71736 + (((tickAnim - 70) / 2) * (-12.30108-(-17.71736)));
            zz = -8.96959 + (((tickAnim - 70) / 2) * (-17.78041-(-8.96959)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -20.64607 + (((tickAnim - 72) / 1) * (4.21183-(-20.64607)));
            yy = -12.30108 + (((tickAnim - 72) / 1) * (-6.88479-(-12.30108)));
            zz = -17.78041 + (((tickAnim - 72) / 1) * (-26.59122-(-17.78041)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 4.21183 + (((tickAnim - 73) / 3) * (2.0753-(4.21183)));
            yy = -6.88479 + (((tickAnim - 73) / 3) * (-12.77329-(-6.88479)));
            zz = -26.59122 + (((tickAnim - 73) / 3) * (-25.701-(-26.59122)));
        }
        else if (tickAnim >= 76 && tickAnim < 80) {
            xx = 2.0753 + (((tickAnim - 76) / 4) * (0-(2.0753)));
            yy = -12.77329 + (((tickAnim - 76) / 4) * (0-(-12.77329)));
            zz = -25.701 + (((tickAnim - 76) / 4) * (0-(-25.701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));



        //this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(-5), Lowerjawback.rotateAngleY + (float) Math.toRadians(0), Lowerjawback.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(22.5), Throatpouch.rotateAngleY + (float) Math.toRadians(0), Throatpouch.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (20.84588-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.98614-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (14.9328-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 31) {
            xx = 20.84588 + (((tickAnim - 11) / 20) * (26.01672-(20.84588)));
            yy = 1.98614 + (((tickAnim - 11) / 20) * (8.96541-(1.98614)));
            zz = 14.9328 + (((tickAnim - 11) / 20) * (18.48895-(14.9328)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 26.01672 + (((tickAnim - 31) / 7) * (31.13653-(26.01672)));
            yy = 8.96541 + (((tickAnim - 31) / 7) * (22.9795-(8.96541)));
            zz = 18.48895 + (((tickAnim - 31) / 7) * (22.79177-(18.48895)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 31.13653 + (((tickAnim - 38) / 7) * (4.67748-(31.13653)));
            yy = 22.9795 + (((tickAnim - 38) / 7) * (18.79552-(22.9795)));
            zz = 22.79177 + (((tickAnim - 38) / 7) * (-3.9741-(22.79177)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 4.67748 + (((tickAnim - 45) / 8) * (-2.60623-(4.67748)));
            yy = 18.79552 + (((tickAnim - 45) / 8) * (17.10423-(18.79552)));
            zz = -3.9741 + (((tickAnim - 45) / 8) * (-3.75971-(-3.9741)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = -2.60623 + (((tickAnim - 53) / 10) * (-6.18083-(-2.60623)));
            yy = 17.10423 + (((tickAnim - 53) / 10) * (22.39389-(17.10423)));
            zz = -3.75971 + (((tickAnim - 53) / 10) * (4.51912-(-3.75971)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -6.18083 + (((tickAnim - 63) / 8) * (22.85666-(-6.18083)));
            yy = 22.39389 + (((tickAnim - 63) / 8) * (13.9209-(22.39389)));
            zz = 4.51912 + (((tickAnim - 63) / 8) * (17.25078-(4.51912)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 22.85666 + (((tickAnim - 71) / 6) * (8.29522-(22.85666)));
            yy = 13.9209 + (((tickAnim - 71) / 6) * (-1.88112-(13.9209)));
            zz = 17.25078 + (((tickAnim - 71) / 6) * (4.93704-(17.25078)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 8.29522 + (((tickAnim - 77) / 3) * (0-(8.29522)));
            yy = -1.88112 + (((tickAnim - 77) / 3) * (0-(-1.88112)));
            zz = 4.93704 + (((tickAnim - 77) / 3) * (0-(4.93704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 37) {
            xx = -27.5 + (((tickAnim - 11) / 26) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 11) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 26) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -27.5 + (((tickAnim - 37) / 7) * (-37.5-(-27.5)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -37.5 + (((tickAnim - 44) / 36) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 37.5 + (((tickAnim - 11) / 8) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 37.5 + (((tickAnim - 19) / 18) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 37.5 + (((tickAnim - 37) / 7) * (64.97015-(37.5)));
            yy = 0 + (((tickAnim - 37) / 7) * (-7.37654-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (1.35649-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 64.97015 + (((tickAnim - 44) / 36) * (0-(64.97015)));
            yy = -7.37654 + (((tickAnim - 44) / 36) * (0-(-7.37654)));
            zz = 1.35649 + (((tickAnim - 44) / 36) * (0-(1.35649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthand, Lefthand.rotateAngleX + (float) Math.toRadians(xx), Lefthand.rotateAngleY + (float) Math.toRadians(yy), Lefthand.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.02696-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.232-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-8.02037-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 18.02696 + (((tickAnim - 20) / 13) * (13.02696-(18.02696)));
            yy = -0.232 + (((tickAnim - 20) / 13) * (-0.232-(-0.232)));
            zz = -8.02037 + (((tickAnim - 20) / 13) * (-8.02037-(-8.02037)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 13.02696 + (((tickAnim - 33) / 5) * (-4.10166-(13.02696)));
            yy = -0.232 + (((tickAnim - 33) / 5) * (-0.06052-(-0.232)));
            zz = -8.02037 + (((tickAnim - 33) / 5) * (-2.09227-(-8.02037)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -4.10166 + (((tickAnim - 38) / 5) * (-4.36818-(-4.10166)));
            yy = -0.06052 + (((tickAnim - 38) / 5) * (-27.47119-(-0.06052)));
            zz = -2.09227 + (((tickAnim - 38) / 5) * (-3.13901-(-2.09227)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = -4.36818 + (((tickAnim - 43) / 21) * (-1.86818-(-4.36818)));
            yy = -27.47119 + (((tickAnim - 43) / 21) * (-27.47119-(-27.47119)));
            zz = -3.13901 + (((tickAnim - 43) / 21) * (-3.13901-(-3.13901)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = -1.86818 + (((tickAnim - 64) / 7) * (0-(-1.86818)));
            yy = -27.47119 + (((tickAnim - 64) / 7) * (-7.5-(-27.47119)));
            zz = -3.13901 + (((tickAnim - 64) / 7) * (0-(-3.13901)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = -7.5 + (((tickAnim - 71) / 9) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-56.46533-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.68063-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.67102-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -56.46533 + (((tickAnim - 20) / 12) * (-56.46533-(-56.46533)));
            yy = -19.68063 + (((tickAnim - 20) / 12) * (-19.68063-(-19.68063)));
            zz = 4.67102 + (((tickAnim - 20) / 12) * (4.67102-(4.67102)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -56.46533 + (((tickAnim - 32) / 18) * (26.19402-(-56.46533)));
            yy = -19.68063 + (((tickAnim - 32) / 18) * (-9.34054-(-19.68063)));
            zz = 4.67102 + (((tickAnim - 32) / 18) * (-26.61213-(4.67102)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 26.19402 + (((tickAnim - 50) / 30) * (0-(26.19402)));
            yy = -9.34054 + (((tickAnim - 50) / 30) * (0-(-9.34054)));
            zz = -26.61213 + (((tickAnim - 50) / 30) * (0-(-26.61213)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -10 + (((tickAnim - 20) / 13) * (-10-(-10)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (15-(0)));
            yy = -10 + (((tickAnim - 33) / 9) * (0-(-10)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 15 + (((tickAnim - 42) / 22) * (13.7-(15)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 13.7 + (((tickAnim - 64) / 16) * (0-(13.7)));
            yy = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3.8 + (((tickAnim - 20) / 13) * (3.8-(3.8)));
            yy = -0.3 + (((tickAnim - 20) / 13) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 3.8 + (((tickAnim - 33) / 9) * (0-(3.8)));
            yy = -0.3 + (((tickAnim - 33) / 9) * (-1-(-0.3)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            yy = -1 + (((tickAnim - 42) / 22) * (-1-(-1)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            yy = -1 + (((tickAnim - 64) / 16) * (0-(-1)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 7.5 + (((tickAnim - 20) / 13) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (10-(0)));
            yy = 7.5 + (((tickAnim - 33) / 10) * (-14.29-(7.5)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 43) / 7) * (10.19306-(10)));
            yy = -14.29 + (((tickAnim - 43) / 7) * (-16.69105-(-14.29)));
            zz = 0 + (((tickAnim - 43) / 7) * (-0.7227-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 10.19306 + (((tickAnim - 50) / 14) * (10-(10.19306)));
            yy = -16.69105 + (((tickAnim - 50) / 14) * (-14.29-(-16.69105)));
            zz = -0.7227 + (((tickAnim - 50) / 14) * (0-(-0.7227)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = 10 + (((tickAnim - 64) / 7) * (0-(10)));
            yy = -14.29 + (((tickAnim - 64) / 7) * (-5-(-14.29)));
            zz = 0 + (((tickAnim - 64) / 7) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = -5 + (((tickAnim - 71) / 9) * (0-(-5)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.27315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (17.349-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.27256-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.27315 + (((tickAnim - 10) / 10) * (37.15128-(18.27315)));
            yy = 17.349 + (((tickAnim - 10) / 10) * (19.90506-(17.349)));
            zz = -2.27256 + (((tickAnim - 10) / 10) * (-1.9871-(-2.27256)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 37.15128 + (((tickAnim - 20) / 13) * (37.15128-(37.15128)));
            yy = 19.90506 + (((tickAnim - 20) / 13) * (19.90506-(19.90506)));
            zz = -1.9871 + (((tickAnim - 20) / 13) * (-1.9871-(-1.9871)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 37.15128 + (((tickAnim - 33) / 5) * (23.03151-(37.15128)));
            yy = 19.90506 + (((tickAnim - 33) / 5) * (0.82183-(19.90506)));
            zz = -1.9871 + (((tickAnim - 33) / 5) * (-0.17733-(-1.9871)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 23.03151 + (((tickAnim - 38) / 5) * (23.51893-(23.03151)));
            yy = 0.82183 + (((tickAnim - 38) / 5) * (-19.67871-(0.82183)));
            zz = -0.17733 + (((tickAnim - 38) / 5) * (6.66613-(-0.17733)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = 23.51893 + (((tickAnim - 43) / 21) * (25.78647-(23.51893)));
            yy = -19.67871 + (((tickAnim - 43) / 21) * (-20.55297-(-19.67871)));
            zz = 6.66613 + (((tickAnim - 43) / 21) * (14.59976-(6.66613)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = 25.78647 + (((tickAnim - 64) / 7) * (0-(25.78647)));
            yy = -20.55297 + (((tickAnim - 64) / 7) * (0-(-20.55297)));
            zz = 14.59976 + (((tickAnim - 64) / 7) * (0-(14.59976)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.43727-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (24.16323-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.52025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.43727 + (((tickAnim - 10) / 10) * (11.43193-(4.43727)));
            yy = 24.16323 + (((tickAnim - 10) / 10) * (24.54406-(24.16323)));
            zz = -6.52025 + (((tickAnim - 10) / 10) * (-4.90726-(-6.52025)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 11.43193 + (((tickAnim - 20) / 13) * (11.43193-(11.43193)));
            yy = 24.54406 + (((tickAnim - 20) / 13) * (24.54406-(24.54406)));
            zz = -4.90726 + (((tickAnim - 20) / 13) * (-4.90726-(-4.90726)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 11.43193 + (((tickAnim - 33) / 5) * (9.65842-(11.43193)));
            yy = 24.54406 + (((tickAnim - 33) / 5) * (-13.93117-(24.54406)));
            zz = -4.90726 + (((tickAnim - 33) / 5) * (4.32845-(-4.90726)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 9.65842 + (((tickAnim - 38) / 5) * (19.77687-(9.65842)));
            yy = -13.93117 + (((tickAnim - 38) / 5) * (-12.80522-(-13.93117)));
            zz = 4.32845 + (((tickAnim - 38) / 5) * (4.65605-(4.32845)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = 19.77687 + (((tickAnim - 43) / 21) * (13.68828-(19.77687)));
            yy = -12.80522 + (((tickAnim - 43) / 21) * (-12.03311-(-12.80522)));
            zz = 4.65605 + (((tickAnim - 43) / 21) * (9.71455-(4.65605)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = 13.68828 + (((tickAnim - 64) / 7) * (0-(13.68828)));
            yy = -12.03311 + (((tickAnim - 64) / 7) * (0-(-12.03311)));
            zz = 9.71455 + (((tickAnim - 64) / 7) * (0-(9.71455)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.78058-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (25.79442-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.60721-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.78058 + (((tickAnim - 10) / 10) * (-43.3724-(-20.78058)));
            yy = 25.79442 + (((tickAnim - 10) / 10) * (22.07405-(25.79442)));
            zz = 0.60721 + (((tickAnim - 10) / 10) * (-4.47051-(0.60721)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -43.3724 + (((tickAnim - 20) / 13) * (-43.3724-(-43.3724)));
            yy = 22.07405 + (((tickAnim - 20) / 13) * (22.07405-(22.07405)));
            zz = -4.47051 + (((tickAnim - 20) / 13) * (-4.47051-(-4.47051)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -43.3724 + (((tickAnim - 33) / 5) * (-30.39986-(-43.3724)));
            yy = 22.07405 + (((tickAnim - 33) / 5) * (-17.90869-(22.07405)));
            zz = -4.47051 + (((tickAnim - 33) / 5) * (-1.18139-(-4.47051)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -30.39986 + (((tickAnim - 38) / 5) * (-37.53164-(-30.39986)));
            yy = -17.90869 + (((tickAnim - 38) / 5) * (-18.33845-(-17.90869)));
            zz = -1.18139 + (((tickAnim - 38) / 5) * (-5.37803-(-1.18139)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = -37.53164 + (((tickAnim - 43) / 21) * (-40.03164-(-37.53164)));
            yy = -18.33845 + (((tickAnim - 43) / 21) * (-18.33845-(-18.33845)));
            zz = -5.37803 + (((tickAnim - 43) / 21) * (-5.37803-(-5.37803)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = -40.03164 + (((tickAnim - 64) / 4) * (-19.57865-(-40.03164)));
            yy = -18.33845 + (((tickAnim - 64) / 4) * (15.46522-(-18.33845)));
            zz = -5.37803 + (((tickAnim - 64) / 4) * (0.90918-(-5.37803)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -19.57865 + (((tickAnim - 68) / 3) * (0-(-19.57865)));
            yy = 15.46522 + (((tickAnim - 68) / 3) * (15-(15.46522)));
            zz = 0.90918 + (((tickAnim - 68) / 3) * (0-(0.90918)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            yy = 15 + (((tickAnim - 71) / 6) * (0-(15)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(xx), Neckfront.rotateAngleY + (float) Math.toRadians(yy), Neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.59145-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-17.13745-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (6.83529-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -5.59145 + (((tickAnim - 3) / 7) * (-11.38998-(-5.59145)));
            yy = -17.13745 + (((tickAnim - 3) / 7) * (35.6464-(-17.13745)));
            zz = 6.83529 + (((tickAnim - 3) / 7) * (-4.05093-(6.83529)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.38998 + (((tickAnim - 10) / 10) * (-23.40127-(-11.38998)));
            yy = 35.6464 + (((tickAnim - 10) / 10) * (31.31275-(35.6464)));
            zz = -4.05093 + (((tickAnim - 10) / 10) * (-9.51531-(-4.05093)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -23.40127 + (((tickAnim - 20) / 1) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 20) / 1) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 20) / 1) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -22.93277 + (((tickAnim - 21) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 21) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 21) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -23.40127 + (((tickAnim - 22) / 4) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 22) / 4) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 22) / 4) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -22.93277 + (((tickAnim - 26) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 26) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 26) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -23.40127 + (((tickAnim - 27) / 3) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 27) / 3) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 27) / 3) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -22.93277 + (((tickAnim - 30) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 30) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 30) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -23.40127 + (((tickAnim - 31) / 2) * (-23.40127-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 31) / 2) * (31.31275-(31.31275)));
            zz = -9.51531 + (((tickAnim - 31) / 2) * (-9.51531-(-9.51531)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -23.40127 + (((tickAnim - 33) / 5) * (-5.08769-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 33) / 5) * (-19.21001-(31.31275)));
            zz = -9.51531 + (((tickAnim - 33) / 5) * (-8.86833-(-9.51531)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -5.08769 + (((tickAnim - 38) / 5) * (-20.66291-(-5.08769)));
            yy = -19.21001 + (((tickAnim - 38) / 5) * (-11.84936-(-19.21001)));
            zz = -8.86833 + (((tickAnim - 38) / 5) * (1.93994-(-8.86833)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = -20.66291 + (((tickAnim - 43) / 21) * (-24.58962-(-20.66291)));
            yy = -11.84936 + (((tickAnim - 43) / 21) * (-12.86792-(-11.84936)));
            zz = 1.93994 + (((tickAnim - 43) / 21) * (-3.07149-(1.93994)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = -24.58962 + (((tickAnim - 64) / 4) * (-9.20397-(-24.58962)));
            yy = -12.86792 + (((tickAnim - 64) / 4) * (25.17288-(-12.86792)));
            zz = -3.07149 + (((tickAnim - 64) / 4) * (7.75344-(-3.07149)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -9.20397 + (((tickAnim - 68) / 3) * (5.39583-(-9.20397)));
            yy = 25.17288 + (((tickAnim - 68) / 3) * (18.31916-(25.17288)));
            zz = 7.75344 + (((tickAnim - 68) / 3) * (15.38097-(7.75344)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 5.39583 + (((tickAnim - 71) / 6) * (3.83679-(5.39583)));
            yy = 18.31916 + (((tickAnim - 71) / 6) * (27.76291-(18.31916)));
            zz = 15.38097 + (((tickAnim - 71) / 6) * (10.1607-(15.38097)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 3.83679 + (((tickAnim - 77) / 3) * (0-(3.83679)));
            yy = 27.76291 + (((tickAnim - 77) / 3) * (0-(27.76291)));
            zz = 10.1607 + (((tickAnim - 77) / 3) * (0-(10.1607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 20) / 12) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 32) / 18) * (-26.58366-(-12.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (8.34764-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (12.50715-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -26.58366 + (((tickAnim - 50) / 30) * (0-(-26.58366)));
            yy = 8.34764 + (((tickAnim - 50) / 30) * (0-(8.34764)));
            zz = 12.50715 + (((tickAnim - 50) / 30) * (0-(12.50715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.83289-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.14878-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.80362-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 39.83289 + (((tickAnim - 20) / 12) * (39.83289-(39.83289)));
            yy = 8.14878 + (((tickAnim - 20) / 12) * (8.14878-(8.14878)));
            zz = -5.80362 + (((tickAnim - 20) / 12) * (-5.80362-(-5.80362)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 39.83289 + (((tickAnim - 32) / 18) * (0-(39.83289)));
            yy = 8.14878 + (((tickAnim - 32) / 18) * (0-(8.14878)));
            zz = -5.80362 + (((tickAnim - 32) / 18) * (0-(-5.80362)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthand, Righthand.rotateAngleX + (float) Math.toRadians(xx), Righthand.rotateAngleY + (float) Math.toRadians(yy), Righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36.94369-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.13168-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-45.23096-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -36.94369 + (((tickAnim - 20) / 4) * (-36.83233-(-36.94369)));
            yy = -5.13168 + (((tickAnim - 20) / 4) * (-5.54115-(-5.13168)));
            zz = -45.23096 + (((tickAnim - 20) / 4) * (-43.04407-(-45.23096)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -36.83233 + (((tickAnim - 24) / 4) * (-37.27291-(-36.83233)));
            yy = -5.54115 + (((tickAnim - 24) / 4) * (-4.23525-(-5.54115)));
            zz = -43.04407 + (((tickAnim - 24) / 4) * (-50.161-(-43.04407)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -37.27291 + (((tickAnim - 28) / 4) * (-36.94369-(-37.27291)));
            yy = -4.23525 + (((tickAnim - 28) / 4) * (-5.13168-(-4.23525)));
            zz = -50.161 + (((tickAnim - 28) / 4) * (-45.23096-(-50.161)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -36.94369 + (((tickAnim - 32) / 18) * (37.46703-(-36.94369)));
            yy = -5.13168 + (((tickAnim - 32) / 18) * (1.6653-(-5.13168)));
            zz = -45.23096 + (((tickAnim - 32) / 18) * (15.10941-(-45.23096)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 37.46703 + (((tickAnim - 50) / 30) * (0-(37.46703)));
            yy = 1.6653 + (((tickAnim - 50) / 30) * (0-(1.6653)));
            zz = 15.10941 + (((tickAnim - 50) / 30) * (0-(15.10941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -35 + (((tickAnim - 50) / 30) * (0-(-35)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.0593-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.29741-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (16.557-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 19.0593 + (((tickAnim - 20) / 12) * (19.0593-(19.0593)));
            yy = -11.29741 + (((tickAnim - 20) / 12) * (-11.29741-(-11.29741)));
            zz = 16.557 + (((tickAnim - 20) / 12) * (16.557-(16.557)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 19.0593 + (((tickAnim - 32) / 18) * (0-(19.0593)));
            yy = -11.29741 + (((tickAnim - 32) / 18) * (0-(-11.29741)));
            zz = 16.557 + (((tickAnim - 32) / 18) * (0-(16.557)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthand, Lefthand.rotateAngleX + (float) Math.toRadians(xx), Lefthand.rotateAngleY + (float) Math.toRadians(yy), Lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.75523-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.84389-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.30919-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.75523 + (((tickAnim - 10) / 10) * (-88.77392-(0.75523)));
            yy = 6.84389 + (((tickAnim - 10) / 10) * (19.61041-(6.84389)));
            zz = 7.30919 + (((tickAnim - 10) / 10) * (3.30735-(7.30919)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -88.77392 + (((tickAnim - 20) / 3) * (-52.63394-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 20) / 3) * (16.09108-(19.61041)));
            zz = 3.30735 + (((tickAnim - 20) / 3) * (6.44096-(3.30735)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -52.63394 + (((tickAnim - 23) / 2) * (-88.77392-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 23) / 2) * (19.61041-(16.09108)));
            zz = 6.44096 + (((tickAnim - 23) / 2) * (3.30735-(6.44096)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -88.77392 + (((tickAnim - 25) / 3) * (-52.63394-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 25) / 3) * (16.09108-(19.61041)));
            zz = 3.30735 + (((tickAnim - 25) / 3) * (6.44096-(3.30735)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -52.63394 + (((tickAnim - 28) / 0) * (-52.63394-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 28) / 0) * (16.09108-(16.09108)));
            zz = 6.44096 + (((tickAnim - 28) / 0) * (6.44096-(6.44096)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -52.63394 + (((tickAnim - 28) / 2) * (-88.77392-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 28) / 2) * (19.61041-(16.09108)));
            zz = 6.44096 + (((tickAnim - 28) / 2) * (3.30735-(6.44096)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -88.77392 + (((tickAnim - 30) / 5) * (-15.33054-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 30) / 5) * (23.2367-(19.61041)));
            zz = 3.30735 + (((tickAnim - 30) / 5) * (12.41119-(3.30735)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -15.33054 + (((tickAnim - 35) / 3) * (-16.29783-(-15.33054)));
            yy = 23.2367 + (((tickAnim - 35) / 3) * (17.06345-(23.2367)));
            zz = 12.41119 + (((tickAnim - 35) / 3) * (5.93381-(12.41119)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -16.29783 + (((tickAnim - 38) / 4) * (-23.86521-(-16.29783)));
            yy = 17.06345 + (((tickAnim - 38) / 4) * (12.47542-(17.06345)));
            zz = 5.93381 + (((tickAnim - 38) / 4) * (-0.20404-(5.93381)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = -23.86521 + (((tickAnim - 42) / 22) * (-22.86521-(-23.86521)));
            yy = 12.47542 + (((tickAnim - 42) / 22) * (12.47542-(12.47542)));
            zz = -0.20404 + (((tickAnim - 42) / 22) * (-0.20404-(-0.20404)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = -22.86521 + (((tickAnim - 64) / 3) * (-23.79075-(-22.86521)));
            yy = 12.47542 + (((tickAnim - 64) / 3) * (7.79714-(12.47542)));
            zz = -0.20404 + (((tickAnim - 64) / 3) * (-0.12753-(-0.20404)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = -23.79075 + (((tickAnim - 67) / 4) * (-12-(-23.79075)));
            yy = 7.79714 + (((tickAnim - 67) / 4) * (0-(7.79714)));
            zz = -0.12753 + (((tickAnim - 67) / 4) * (0-(-0.12753)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -12 + (((tickAnim - 71) / 9) * (0-(-12)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (33.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 33.75 + (((tickAnim - 15) / 5) * (17.5-(33.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 17.5 + (((tickAnim - 20) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 23) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 25) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 28) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 30) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 33) / 2) * (20.23-(30)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 20.23 + (((tickAnim - 35) / 3) * (10-(20.23)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 10 + (((tickAnim - 38) / 4) * (12.5-(10)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 12.5 + (((tickAnim - 42) / 22) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = 12.5 + (((tickAnim - 64) / 3) * (22.56-(12.5)));
            yy = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 3) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 22.56 + (((tickAnim - 67) / 4) * (6-(22.56)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 6 + (((tickAnim - 71) / 9) * (0-(6)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 25) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 30) / 5) * (-5.43-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -5.43 + (((tickAnim - 35) / 3) * (4-(-5.43)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 4 + (((tickAnim - 38) / 4) * (-1-(4)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = -1 + (((tickAnim - 42) / 22) * (-1-(-1)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = -1 + (((tickAnim - 64) / 3) * (-16-(-1)));
            yy = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 3) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = -16 + (((tickAnim - 67) / 4) * (-1-(-16)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -1 + (((tickAnim - 71) / 9) * (0-(-1)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftankle, Leftankle.rotateAngleX + (float) Math.toRadians(xx), Leftankle.rotateAngleY + (float) Math.toRadians(yy), Leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (120-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 120 + (((tickAnim - 15) / 5) * (45-(120)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45 + (((tickAnim - 20) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 105 + (((tickAnim - 23) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 120 + (((tickAnim - 24) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 45 + (((tickAnim - 25) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 105 + (((tickAnim - 28) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 120 + (((tickAnim - 29) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 45 + (((tickAnim - 30) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 105 + (((tickAnim - 33) / 2) * (23.18-(105)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 23.18 + (((tickAnim - 35) / 3) * (-5.06505-(23.18)));
            yy = 0 + (((tickAnim - 35) / 3) * (1.56899-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-4.74804-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -5.06505 + (((tickAnim - 38) / 4) * (-2.51222-(-5.06505)));
            yy = 1.56899 + (((tickAnim - 38) / 4) * (0.57538-(1.56899)));
            zz = -4.74804 + (((tickAnim - 38) / 4) * (-2.43293-(-4.74804)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = -2.51222 + (((tickAnim - 42) / 22) * (-1.73-(-2.51222)));
            yy = 0.57538 + (((tickAnim - 42) / 22) * (0-(0.57538)));
            zz = -2.43293 + (((tickAnim - 42) / 22) * (0-(-2.43293)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = -1.73 + (((tickAnim - 64) / 3) * (28.36-(-1.73)));
            yy = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 3) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 28.36 + (((tickAnim - 67) / 4) * (-1.5-(28.36)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -1.5 + (((tickAnim - 71) / 9) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 12.5 + (((tickAnim - 20) / 13) * (12.5-(12.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 12.5 + (((tickAnim - 33) / 9) * (0-(12.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = -22.5 + (((tickAnim - 42) / 22) * (-14.7-(-22.5)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = -14.7 + (((tickAnim - 64) / 16) * (0-(-14.7)));
            yy = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.23144-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (9.61804-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.74963-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0.23144 + (((tickAnim - 20) / 13) * (0.23144-(0.23144)));
            yy = 9.61804 + (((tickAnim - 20) / 13) * (9.61804-(9.61804)));
            zz = -9.74963 + (((tickAnim - 20) / 13) * (-9.74963-(-9.74963)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0.23144 + (((tickAnim - 33) / 9) * (0-(0.23144)));
            yy = 9.61804 + (((tickAnim - 33) / 9) * (0-(9.61804)));
            zz = -9.74963 + (((tickAnim - 33) / 9) * (0-(-9.74963)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 42) / 22) * (5-(0)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 64) / 16) * (0-(5)));
            yy = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -2.5 + (((tickAnim - 20) / 13) * (-7.5-(-2.5)));
            yy = 4 + (((tickAnim - 20) / 13) * (5-(4)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 33) / 17) * (-10.13393-(-7.5)));
            yy = 5 + (((tickAnim - 33) / 17) * (3.21429-(5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = -10.13393 + (((tickAnim - 50) / 20) * (-5.35714-(-10.13393)));
            yy = 3.21429 + (((tickAnim - 50) / 20) * (1.07143-(3.21429)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5.35714 + (((tickAnim - 70) / 10) * (0-(-5.35714)));
            yy = 1.07143 + (((tickAnim - 70) / 10) * (0-(1.07143)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.12-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -3.12 + (((tickAnim - 20) / 13) * (5-(-3.12)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            yy = 5 + (((tickAnim - 33) / 11) * (9.42-(5)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            yy = 9.42 + (((tickAnim - 44) / 36) * (0-(9.42)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -3.75 + (((tickAnim - 20) / 13) * (-7.5-(-3.75)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            yy = -7.5 + (((tickAnim - 33) / 11) * (6.74-(-7.5)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            yy = 6.74 + (((tickAnim - 44) / 36) * (0-(6.74)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (5.26-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 5.26 + (((tickAnim - 11) / 9) * (-8.75-(5.26)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -8.75 + (((tickAnim - 20) / 13) * (-7.5-(-8.75)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (5.76665-(0)));
            yy = -7.5 + (((tickAnim - 33) / 6) * (-7.70139-(-7.5)));
            zz = 0 + (((tickAnim - 33) / 6) * (0.05446-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 5.76665 + (((tickAnim - 39) / 5) * (12.5-(5.76665)));
            yy = -7.70139 + (((tickAnim - 39) / 5) * (13.73-(-7.70139)));
            zz = 0.05446 + (((tickAnim - 39) / 5) * (0-(0.05446)));
        }
        else if (tickAnim >= 44 && tickAnim < 64) {
            xx = 12.5 + (((tickAnim - 44) / 20) * (12.5-(12.5)));
            yy = 13.73 + (((tickAnim - 44) / 20) * (21.58-(13.73)));
            zz = 0 + (((tickAnim - 44) / 20) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 64) / 16) * (0-(12.5)));
            yy = 21.58 + (((tickAnim - 64) / 16) * (0-(21.58)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(xx), Tailend.rotateAngleY + (float) Math.toRadians(yy), Tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 7) / 3) * (0-(17.5)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 21) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 26) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 31) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 38) / 5) * (0-(5)));
            yy = -17.5 + (((tickAnim - 38) / 5) * (25-(-17.5)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 25 + (((tickAnim - 43) / 3) * (0-(25)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 46) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 18) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 4) * (22.5-(0)));
            zz = 0 + (((tickAnim - 64) / 4) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 22.5 + (((tickAnim - 68) / 3) * (0-(22.5)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 2) * (-10-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -10 + (((tickAnim - 73) / 4) * (0-(-10)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 7) / 3) * (0-(17.5)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 21) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 26) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 31) / 2) * (0-(5)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 38) / 5) * (0-(5)));
            yy = -17.5 + (((tickAnim - 38) / 5) * (25-(-17.5)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 25 + (((tickAnim - 43) / 3) * (0-(25)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 46) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 18) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 4) * (22.5-(0)));
            zz = 0 + (((tickAnim - 64) / 4) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 22.5 + (((tickAnim - 68) / 3) * (0-(22.5)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 2) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -7.5 + (((tickAnim - 73) / 7) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (11.5-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 80) {
            xx = 11.5 + (((tickAnim - 42) / 38) * (0-(11.5)));
            yy = 0 + (((tickAnim - 42) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = -2.5 + (((tickAnim - 42) / 22) * (-9.53-(-2.5)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = -9.53 + (((tickAnim - 64) / 16) * (0-(-9.53)));
            yy = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightankle, Rightankle.rotateAngleX + (float) Math.toRadians(xx), Rightankle.rotateAngleY + (float) Math.toRadians(yy), Rightankle.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (15-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 40) / 20) * (10-(15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 10) / 10) * (-2.5-(1.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 20) / 20) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 40) / 7) * (-6.67-(-5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -6.67 + (((tickAnim - 47) / 13) * (-2.5-(-6.67)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (4.62307-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (1.44914-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (2.43049-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 4.62307 + (((tickAnim - 20) / 20) * (7.5-(4.62307)));
            yy = 1.44914 + (((tickAnim - 20) / 20) * (0-(1.44914)));
            zz = 2.43049 + (((tickAnim - 20) / 20) * (0-(2.43049)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 40) / 20) * (-5-(7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 10) / 5) * (1.25-(15)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 15) / 5) * (-5-(1.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-10-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 40) / 20) * (-15-(-10)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -15 + (((tickAnim - 60) / 20) * (0-(-15)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 10) / 5) * (-10.62-(1.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.62 + (((tickAnim - 15) / 5) * (-2.5-(-10.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (-3.75-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 25) / 15) * (2.5-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 40) / 20) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -3.75 + (((tickAnim - 10) / 1) * (-5.31-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -5.31 + (((tickAnim - 11) / 4) * (-13.12-(-5.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.12 + (((tickAnim - 15) / 3) * (-10.31-(-13.12)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10.31 + (((tickAnim - 18) / 2) * (-17.5-(-10.31)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-19.37-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -19.37 + (((tickAnim - 25) / 15) * (-22.5-(-19.37)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -22.5 + (((tickAnim - 40) / 20) * (-17.5-(-22.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 60) / 20) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(xx), Neckfront.rotateAngleY + (float) Math.toRadians(yy), Neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.88 + (((tickAnim - 5) / 5) * (8.75-(21.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 10) / 5) * (-9.37-(8.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -9.37 + (((tickAnim - 15) / 4) * (11.57-(-9.37)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 11.57 + (((tickAnim - 19) / 4) * (-2.5-(11.57)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 23) / 3) * (0.63-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0.63 + (((tickAnim - 26) / 14) * (0-(0.63)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*2 + (((tickAnim - 40) / 40) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*2)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20 + (((tickAnim - 40) / 40) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25 + (((tickAnim - 40) / 40) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25 + (((tickAnim - 40) / 40) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-25-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20 + (((tickAnim - 40) / 40) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-25 + (((tickAnim - 40) / 40) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25 + (((tickAnim - 40) / 40) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10 + (((tickAnim - 40) / 40) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(xx), Throatpouch.rotateAngleY + (float) Math.toRadians(yy), Throatpouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 12) / 9) * (17.5-(7.5)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 17.5 + (((tickAnim - 21) / 11) * (5-(17.5)));
            yy = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 32) / 14) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 46) / 34) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.5 + (((tickAnim - 12) / 7) * (12.5-(17.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 19) / 4) * (5-(12.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = 5 + (((tickAnim - 23) / 18) * (-10-(5)));
            yy = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -10 + (((tickAnim - 41) / 7) * (-5-(-10)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 48) / 32) * (0-(-5)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 12) / 9) * (17.5-(7.5)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 17.5 + (((tickAnim - 21) / 11) * (5-(17.5)));
            yy = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 32) / 14) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 46) / 34) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.5 + (((tickAnim - 12) / 7) * (12.5-(17.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 19) / 4) * (5-(12.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = 5 + (((tickAnim - 23) / 18) * (-10-(5)));
            yy = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -10 + (((tickAnim - 41) / 7) * (-5-(-10)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 48) / 32) * (0-(-5)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-15-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-10-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 60) / 19) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-15-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-10-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 60) / 19) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*14-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*14 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*14)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*80 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*80)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-40 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-40)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(xx), Neckfront.rotateAngleY + (float) Math.toRadians(yy), Neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 5) * (-19.53-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.53 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(-19.53)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40 + (((tickAnim - 15) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 7) / 5) * (27.5-(17.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 12) / 3) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 15) / 2) * (-10-(32.5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 17) / 3) * (-27.5-(-10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -27.5 + (((tickAnim - 20) / 3) * (-12.5-(-27.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -12.5 + (((tickAnim - 23) / 3) * (15-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 15 + (((tickAnim - 26) / 5) * (5-(15)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 31) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 7) / 5) * (27.5-(17.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 12) / 3) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 15) / 2) * (-10-(32.5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 17) / 3) * (-27.5-(-10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -27.5 + (((tickAnim - 20) / 3) * (-12.5-(-27.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -12.5 + (((tickAnim - 23) / 3) * (15-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 15 + (((tickAnim - 26) / 5) * (5-(15)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 31) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(22.5), Throatpouch.rotateAngleY + (float) Math.toRadians(0), Throatpouch.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.60681 + (((tickAnim - 0) / 50) * (-0.60681-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 0) / 50) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(xx), Tailend.rotateAngleY + (float) Math.toRadians(yy), Tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftankle, Leftankle.rotateAngleX + (float) Math.toRadians(xx), Leftankle.rotateAngleY + (float) Math.toRadians(yy), Leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -18.19162 + (((tickAnim - 0) / 25) * (9.6812-(-18.19162)));
            yy = 1.58774 + (((tickAnim - 0) / 25) * (9.51868-(1.58774)));
            zz = 4.21113 + (((tickAnim - 0) / 25) * (4.87018-(4.21113)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 9.6812 + (((tickAnim - 25) / 15) * (-1.77073-(9.6812)));
            yy = 9.51868 + (((tickAnim - 25) / 15) * (-11.08171-(9.51868)));
            zz = 4.87018 + (((tickAnim - 25) / 15) * (-1.95086-(4.87018)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.77073 + (((tickAnim - 40) / 10) * (-18.19162-(-1.77073)));
            yy = -11.08171 + (((tickAnim - 40) / 10) * (1.58774-(-11.08171)));
            zz = -1.95086 + (((tickAnim - 40) / 10) * (4.21113-(-1.95086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.57-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -2.57 + (((tickAnim - 25) / 8) * (0.745-(-2.57)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.745 + (((tickAnim - 33) / 7) * (1.395-(0.745)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.395 + (((tickAnim - 40) / 10) * (0-(1.395)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-16.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.5 + (((tickAnim - 5) / 6) * (0.25-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 11) / 14) * (15.3741-(0.25)));
            yy = 0 + (((tickAnim - 11) / 14) * (-13.55214-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (-1.2506-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 15.3741 + (((tickAnim - 25) / 18) * (22.69-(15.3741)));
            yy = -13.55214 + (((tickAnim - 25) / 18) * (0-(-13.55214)));
            zz = -1.2506 + (((tickAnim - 25) / 18) * (0-(-1.2506)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.69 + (((tickAnim - 43) / 7) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));

        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(0.325);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(0);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (19.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 5) / 3) * (7.95-(19.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.95 + (((tickAnim - 8) / 3) * (0.75-(7.95)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.75 + (((tickAnim - 11) / 7) * (-1.54-(0.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.54 + (((tickAnim - 18) / 4) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0.48 + (((tickAnim - 22) / 6) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 14.7 + (((tickAnim - 28) / 3) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 20.39 + (((tickAnim - 31) / 13) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 31) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -54.58 + (((tickAnim - 44) / 6) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightankle, Rightankle.rotateAngleX + (float) Math.toRadians(xx), Rightankle.rotateAngleY + (float) Math.toRadians(yy), Rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (3.5-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.5 + (((tickAnim - 8) / 3) * (6.24024-(3.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-1.91268-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.24024 + (((tickAnim - 11) / 2) * (1.39-(6.24024)));
            yy = 0.58463 + (((tickAnim - 11) / 2) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 11) / 2) * (0-(-1.91268)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1.39 + (((tickAnim - 13) / 1) * (6.65-(1.39)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 6.65 + (((tickAnim - 14) / 8) * (39.75-(6.65)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 39.75 + (((tickAnim - 22) / 3) * (70.99002-(39.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.18287-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-6.24733-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 70.99002 + (((tickAnim - 25) / 3) * (76.75-(70.99002)));
            yy = 0.18287 + (((tickAnim - 25) / 3) * (0-(0.18287)));
            zz = -6.24733 + (((tickAnim - 25) / 3) * (0-(-6.24733)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 76.75 + (((tickAnim - 28) / 3) * (71-(76.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 71 + (((tickAnim - 31) / 9) * (56-(71)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 56 + (((tickAnim - 40) / 10) * (16.75-(56)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 10) * (1.705-(0.375)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 1.705 + (((tickAnim - 18) / 7) * (0.15-(1.705)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 25) / 15) * (0-(0.15)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightfoot.rotationPointX = this.Rightfoot.rotationPointX + (float)(xx);
        this.Rightfoot.rotationPointY = this.Rightfoot.rotationPointY - (float)(yy);
        this.Rightfoot.rotationPointZ = this.Rightfoot.rotationPointZ + (float)(zz);

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-2.625-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -2.625 + (((tickAnim - 9) / 9) * (-4.72-(-2.625)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -4.72 + (((tickAnim - 18) / 13) * (-4.72-(-4.72)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 31) / 11) * (0-(0)));
            yy = -4.72 + (((tickAnim - 31) / 11) * (-2.425-(-4.72)));
            zz = 0 + (((tickAnim - 31) / 11) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.425 + (((tickAnim - 42) / 8) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(xx), Neckbase.rotateAngleY + (float) Math.toRadians(yy), Neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.66-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66 + (((tickAnim - 4) / 5) * (12.12-(5.66)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.12 + (((tickAnim - 9) / 5) * (17.84-(12.12)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.84 + (((tickAnim - 14) / 5) * (21.5-(17.84)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.83 + (((tickAnim - 4) / 5) * (-19.66-(-9.83)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.66 + (((tickAnim - 9) / 5) * (-28.91-(-19.66)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -28.91 + (((tickAnim - 14) / 5) * (-34.75-(-28.91)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftankle, Leftankle.rotateAngleX + (float) Math.toRadians(xx), Leftankle.rotateAngleY + (float) Math.toRadians(yy), Leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.175 + (((tickAnim - 18) / 1) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftankle.rotationPointX = this.Leftankle.rotationPointX + (float)(xx);
        this.Leftankle.rotationPointY = this.Leftankle.rotationPointY - (float)(yy);
        this.Leftankle.rotationPointZ = this.Leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.52-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.52 + (((tickAnim - 4) / 5) * (7.25-(3.52)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 9) / 4) * (9.67-(7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.67 + (((tickAnim - 13) / 1) * (10.76-(9.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.76 + (((tickAnim - 14) / 3) * (11-(10.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 11 + (((tickAnim - 17) / 2) * (13.75-(11)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftfoot.rotationPointX = this.Leftfoot.rotationPointX + (float)(xx);
        this.Leftfoot.rotationPointY = this.Leftfoot.rotationPointY - (float)(yy);
        this.Leftfoot.rotationPointZ = this.Leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightankle, Rightankle.rotateAngleX + (float) Math.toRadians(xx), Rightankle.rotateAngleY + (float) Math.toRadians(yy), Rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightankle.rotationPointX = this.Rightankle.rotationPointX + (float)(xx);
        this.Rightankle.rotationPointY = this.Rightankle.rotationPointY - (float)(yy);
        this.Rightankle.rotationPointZ = this.Rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightfoot.rotationPointX = this.Rightfoot.rotationPointX + (float)(xx);
        this.Rightfoot.rotationPointY = this.Rightfoot.rotationPointY - (float)(yy);
        this.Rightfoot.rotationPointZ = this.Rightfoot.rotationPointZ + (float)(zz);

    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));

        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*6), Neckbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+200))*3), Neckbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-11), Neckmiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-3), Neckmiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));


        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), Lowerjawback.rotateAngleY + (float) Math.toRadians(0), Lowerjawback.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (22.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 5) / 3) * (-15-(22.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (5-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 11) / 4) * (-10-(5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (22.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 5) / 3) * (-15-(22.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (5-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 11) / 4) * (-10-(5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*5), Throatpouch.rotateAngleY + (float) Math.toRadians(0), Throatpouch.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), Rightupperarm.rotateAngleY + (float) Math.toRadians(5), Rightupperarm.rotateAngleZ + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), Rightlowerarm.rotateAngleY + (float) Math.toRadians(0), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Righthand, Righthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5+10.5), Righthand.rotateAngleY + (float) Math.toRadians(0), Righthand.rotateAngleZ + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-170))*4));


        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), Leftupperarm.rotateAngleY + (float) Math.toRadians(5), Leftupperarm.rotateAngleZ + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), Leftlowerarm.rotateAngleY + (float) Math.toRadians(0), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lefthand, Lefthand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5+10.5), Lefthand.rotateAngleY + (float) Math.toRadians(0), Lefthand.rotateAngleZ + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-170))*4));


        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*-7), Tailbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*8), Tailbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-3));


        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-3), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-1), Tailmiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*8), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-3));


        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*-5), Tailend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*2), Tailend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-3));


        this.setRotateAngle(Tailmidendsidefluff, Tailmidendsidefluff.rotateAngleX + (float) Math.toRadians(-2.5), Tailmidendsidefluff.rotateAngleY + (float) Math.toRadians(0), Tailmidendsidefluff.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.33724 + (((tickAnim - 8) / 2) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 2) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 2) * (0-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -25 + (((tickAnim - 10) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.99476 + (((tickAnim - 12) / 2) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 12) / 2) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 12) / 2) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.05131 + (((tickAnim - 14) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 14) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 14) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-1-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 10) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 1) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 14) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 14) / 1) * (1-(0.56)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.94 + (((tickAnim - 3) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.08 + (((tickAnim - 8) / 2) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 10) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 12) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.94 + (((tickAnim - 13) / 1) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 34.72 + (((tickAnim - 14) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshin.rotationPointX = this.Leftshin.rotationPointX + (float)(xx);
        this.Leftshin.rotationPointY = this.Leftshin.rotationPointY - (float)(yy);
        this.Leftshin.rotationPointZ = this.Leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -54.44 + (((tickAnim - 4) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 7) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -52.16 + (((tickAnim - 8) / 1) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -24.89 + (((tickAnim - 9) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.72 + (((tickAnim - 12) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.56 + (((tickAnim - 13) / 1) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 14) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftankle, Leftankle.rotateAngleX + (float) Math.toRadians(xx), Leftankle.rotateAngleY + (float) Math.toRadians(yy), Leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 75.83 + (((tickAnim - 4) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.21 + (((tickAnim - 8) / 2) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (30.83-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.83 + (((tickAnim - 12) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.17 + (((tickAnim - 13) / 1) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.41 + (((tickAnim - 14) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.33724 + (((tickAnim - 0) / 3) * (-25-(-16.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 3) * (0-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 3) * (0-(1.31992)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-3.94898-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-2.05397-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15.99476 + (((tickAnim - 4) / 3) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 3) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 3) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 7) / 1) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 7) / 1) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 7) / 1) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.67448 + (((tickAnim - 13) / 2) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 2) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 2) * (1.31992-(2.63984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1-(0)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.56-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 2) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 7) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 7) / 1) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (-1-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.08 + (((tickAnim - 0) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33.72 + (((tickAnim - 4) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.94 + (((tickAnim - 5) / 2) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 7) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 11) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 55.16 + (((tickAnim - 13) / 1) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(xx);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(yy);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -52.16 + (((tickAnim - 0) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.89 + (((tickAnim - 2) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.72 + (((tickAnim - 4) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.56 + (((tickAnim - 5) / 2) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 7) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 8) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.44 + (((tickAnim - 12) / 2) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -50.23 + (((tickAnim - 14) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightankle, Rightankle.rotateAngleX + (float) Math.toRadians(xx), Rightankle.rotateAngleY + (float) Math.toRadians(yy), Rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (30.83-(45)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30.83 + (((tickAnim - 4) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.17 + (((tickAnim - 5) / 2) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 7) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 60 + (((tickAnim - 8) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 75.83 + (((tickAnim - 12) / 3) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGuanlong entity = (EntityPrehistoricFloraGuanlong) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*1), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));

        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*2), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neckbase, Neckbase.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), Neckbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+200))*3), Neckbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(Neckmiddle, Neckmiddle.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), Neckmiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), Neckmiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(Neckfront, Neckfront.rotateAngleX + (float) Math.toRadians(17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-5), Neckfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-1), Neckfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-0));

        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-1), Lowerjawback.rotateAngleY + (float) Math.toRadians(0), Lowerjawback.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 6) / 8) * (-17.5-(10)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -17.5 + (((tickAnim - 14) / 7) * (17.5-(-17.5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 21) / 9) * (0-(17.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteyebrowfront, Righteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Righteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Righteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 6) / 8) * (-17.5-(10)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -17.5 + (((tickAnim - 14) / 7) * (17.5-(-17.5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 21) / 9) * (0-(17.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteyebrowfront, Lefteyebrowfront.rotateAngleX + (float) Math.toRadians(xx), Lefteyebrowfront.rotateAngleY + (float) Math.toRadians(yy), Lefteyebrowfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 7) / 8) * (12.5-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 15) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(xx), Throatpouch.rotateAngleY + (float) Math.toRadians(yy), Throatpouch.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), Rightupperarm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3-10), Rightupperarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), Rightlowerarm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*1), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Righthand, Righthand.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), Righthand.rotateAngleY + (float) Math.toRadians(0), Righthand.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-4)));


        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), Leftupperarm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-3+10), Leftupperarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), Leftlowerarm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*-1), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lefthand, Lefthand.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), Lefthand.rotateAngleY + (float) Math.toRadians(0), Lefthand.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4)));


        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), Tailbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-4), Tailbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-2), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));


        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-50))*-1), Tailmiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-3));


        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(-6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-70))*-3), Tailend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-4), Tailend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.04292 + (((tickAnim - 0) / 8) * (-8.7679-(15.04292)));
            yy = 7.4713 + (((tickAnim - 0) / 8) * (9.1645-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 8) * (-1.22035-(0.6574)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.7679 + (((tickAnim - 8) / 7) * (-27.5-(-8.7679)));
            yy = 9.1645 + (((tickAnim - 8) / 7) * (0-(9.1645)));
            zz = -1.22035 + (((tickAnim - 8) / 7) * (0-(-1.22035)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 15) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (3.15693-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (2.43893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -15.57952 + (((tickAnim - 19) / 11) * (15.04292-(-15.57952)));
            yy = 3.15693 + (((tickAnim - 19) / 11) * (7.4713-(3.15693)));
            zz = 2.43893 + (((tickAnim - 19) / 11) * (0.6574-(2.43893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.42-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 8) / 7) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 15) / 4) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 19) / 4) * (0.38-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.38 + (((tickAnim - 23) / 7) * (0-(0.38)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 40.7 + (((tickAnim - 4) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 46.39 + (((tickAnim - 8) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 15) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.03 + (((tickAnim - 19) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15.56 + (((tickAnim - 23) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshin.rotationPointX = this.Leftshin.rotationPointX + (float)(xx);
        this.Leftshin.rotationPointY = this.Leftshin.rotationPointY - (float)(yy);
        this.Leftshin.rotationPointZ = this.Leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-13.61-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -13.61 + (((tickAnim - 4) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -47.22 + (((tickAnim - 8) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.71 + (((tickAnim - 13) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 15) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 4.03 + (((tickAnim - 19) / 11) * (10-(4.03)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftankle, Leftankle.rotateAngleX + (float) Math.toRadians(xx), Leftankle.rotateAngleY + (float) Math.toRadians(yy), Leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.7495 + (((tickAnim - 0) / 4) * (57.22-(4.7495)));
            yy = -6.63927 + (((tickAnim - 0) / 4) * (0-(-6.63927)));
            zz = 2.43531 + (((tickAnim - 0) / 4) * (0-(2.43531)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.22 + (((tickAnim - 4) / 4) * (84.44-(57.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 84.44 + (((tickAnim - 8) / 4) * (55.97-(84.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 55.97 + (((tickAnim - 12) / 3) * (22.5-(55.97)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 15) / 8) * (-14.85-(22.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -14.85 + (((tickAnim - 23) / 7) * (4.7495-(-14.85)));
            yy = 0 + (((tickAnim - 23) / 7) * (-6.63927-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (2.43531-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.15693-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.43893-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = -15.57952 + (((tickAnim - 4) / 11) * (15.04292-(-15.57952)));
            yy = -3.15693 + (((tickAnim - 4) / 11) * (-7.4713-(-3.15693)));
            zz = -2.43893 + (((tickAnim - 4) / 11) * (-0.6574-(-2.43893)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15.04292 + (((tickAnim - 15) / 8) * (-8.7679-(15.04292)));
            yy = -7.4713 + (((tickAnim - 15) / 8) * (-9.1645-(-7.4713)));
            zz = -0.6574 + (((tickAnim - 15) / 8) * (1.22035-(-0.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.7679 + (((tickAnim - 23) / 7) * (-27.5-(-8.7679)));
            yy = -9.1645 + (((tickAnim - 23) / 7) * (0-(-9.1645)));
            zz = 1.22035 + (((tickAnim - 23) / 7) * (0-(1.22035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 4) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 4) / 4) * (0.38-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.38 + (((tickAnim - 8) / 7) * (0-(0.38)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.42-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 23) / 7) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.03 + (((tickAnim - 4) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.56 + (((tickAnim - 8) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 15) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 40.7 + (((tickAnim - 19) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 46.39 + (((tickAnim - 23) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(xx);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(yy);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.5 + (((tickAnim - 0) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 4.03 + (((tickAnim - 4) / 11) * (0-(4.03)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-13.61-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -13.61 + (((tickAnim - 19) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -47.22 + (((tickAnim - 23) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -25.71 + (((tickAnim - 28) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightankle, Rightankle.rotateAngleX + (float) Math.toRadians(xx), Rightankle.rotateAngleY + (float) Math.toRadians(yy), Rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 0) / 8) * (-14.83043-(22.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.97976-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.44995-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.83043 + (((tickAnim - 8) / 7) * (4.7495-(-14.83043)));
            yy = 4.97976 + (((tickAnim - 8) / 7) * (6.63927-(4.97976)));
            zz = 0.44995 + (((tickAnim - 8) / 7) * (-2.43531-(0.44995)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.7495 + (((tickAnim - 15) / 4) * (57.22-(4.7495)));
            yy = 6.63927 + (((tickAnim - 15) / 4) * (0-(6.63927)));
            zz = -2.43531 + (((tickAnim - 15) / 4) * (0-(-2.43531)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 57.22 + (((tickAnim - 19) / 4) * (81.94-(57.22)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 81.94 + (((tickAnim - 23) / 4) * (55.97-(81.94)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 55.97 + (((tickAnim - 27) / 3) * (22.5-(55.97)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGuanlong e = (EntityPrehistoricFloraGuanlong) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Neckbase, (float) Math.toRadians(10),0,0);
        animator.move(this.Neckmiddle, (float) Math.toRadians(10),0,0);
        animator.move(this.Neckfront, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
