package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNothosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelNothosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neckbase;
    private final AdvancedModelRendererExtended Neckmiddlebase;
    private final AdvancedModelRendererExtended Neckmiddlefront;
    private final AdvancedModelRendererExtended Neckfront;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Lowerjawback;
    private final AdvancedModelRendererExtended Lowerjawmiddlebase;
    private final AdvancedModelRendererExtended Lowerjawmiddlefront;
    private final AdvancedModelRendererExtended Lowerjawfront;
    private final AdvancedModelRendererExtended Leftlowerfrontteeth;
    private final AdvancedModelRendererExtended Lowerfrontteeth;
    private final AdvancedModelRendererExtended Rightlowerfrontteeth;
    private final AdvancedModelRendererExtended Leftlowermidteeth;
    private final AdvancedModelRendererExtended Rightlowerteeth;
    private final AdvancedModelRendererExtended Lowerjawteethback;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Throat;
    private final AdvancedModelRendererExtended Upperjawback;
    private final AdvancedModelRendererExtended Upperjawmiddle;
    private final AdvancedModelRendererExtended Upperjawfront;
    private final AdvancedModelRendererExtended Upperfrontteeth;
    private final AdvancedModelRendererExtended Leftupperfrontteeth;
    private final AdvancedModelRendererExtended Rightupperfrontteeth;
    private final AdvancedModelRendererExtended Leftupperfang;
    private final AdvancedModelRendererExtended Leftuppermidteeth;
    private final AdvancedModelRendererExtended Rightupperfang;
    private final AdvancedModelRendererExtended Rightuppermidteeth;
    private final AdvancedModelRendererExtended Nosebridge;
    private final AdvancedModelRendererExtended Upperbackteeth;
    private final AdvancedModelRendererExtended Neckflab;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Tailbase;
    private final AdvancedModelRendererExtended Tailmiddlebase;
    private final AdvancedModelRendererExtended Tailmiddle;
    private final AdvancedModelRendererExtended Tailmiddleend;
    private final AdvancedModelRendererExtended Tailend;
    private final AdvancedModelRendererExtended Tailfinend;
    private final AdvancedModelRendererExtended Tailfinbase;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;
    private final AdvancedModelRendererExtended Bellyflab;

    private ModelAnimator animator;

    public ModelNothosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 17.4F, 15.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1911F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 57, -5.0F, -1.5F, -9.0F, 10, 7, 13, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.4F, -7.5F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2122F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 78, -5.5F, -1.5F, -13.0F, 11, 9, 13, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.01F, 0.2F, -11.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0637F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 49, 80, -5.5F, -1.5F, -12.0F, 11, 8, 12, 0.0F, false));

        this.Neckbase = new AdvancedModelRendererExtended(this);
        this.Neckbase.setRotationPoint(0.0F, 0.1F, -11.0F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.1485F, 0.0F, 0.0F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 34, 48, -3.0F, -1.5F, -8.5F, 6, 5, 9, 0.0F, false));

        this.Neckmiddlebase = new AdvancedModelRendererExtended(this);
        this.Neckmiddlebase.setRotationPoint(0.0F, 0.1F, -7.5F);
        this.Neckbase.addChild(Neckmiddlebase);
        this.setRotateAngle(Neckmiddlebase, -0.0637F, 0.0F, 0.0F);
        this.Neckmiddlebase.cubeList.add(new ModelBox(Neckmiddlebase, 0, 43, -2.5F, -1.5F, -8.5F, 5, 4, 9, 0.0F, false));

        this.Neckmiddlefront = new AdvancedModelRendererExtended(this);
        this.Neckmiddlefront.setRotationPoint(-0.01F, 0.0F, -8.2F);
        this.Neckmiddlebase.addChild(Neckmiddlefront);
        this.setRotateAngle(Neckmiddlefront, 0.0848F, 0.0F, 0.0F);
        this.Neckmiddlefront.cubeList.add(new ModelBox(Neckmiddlefront, 45, 35, -3.0F, -1.5F, -7.5F, 6, 4, 8, 0.0F, false));

        this.Neckfront = new AdvancedModelRendererExtended(this);
        this.Neckfront.setRotationPoint(0.0F, -0.1F, -7.2F);
        this.Neckmiddlefront.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.0848F, 0.0F, 0.0F);
        this.Neckfront.cubeList.add(new ModelBox(Neckfront, 0, 30, -3.5F, -1.5F, -5.5F, 7, 5, 6, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.0424F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 20, -4.0F, -1.5F, -6.0F, 8, 3, 6, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRendererExtended(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 94, 45, -4.0F, 0.0F, -6.0F, 8, 1, 6, 0.0F, false));

        this.Lowerjawmiddlebase = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Lowerjawback.addChild(Lowerjawmiddlebase);
        this.setRotateAngle(Lowerjawmiddlebase, -0.0424F, 0.0F, 0.0F);
        this.Lowerjawmiddlebase.cubeList.add(new ModelBox(Lowerjawmiddlebase, 101, 53, -3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F, false));

        this.Lowerjawmiddlefront = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 13, 6, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 17, 0, -1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Leftlowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Leftlowerfrontteeth.setRotationPoint(-1.4F, -0.7F, -1.8F);
        this.Lowerjawfront.addChild(Leftlowerfrontteeth);
        this.setRotateAngle(Leftlowerfrontteeth, 0.1911F, 0.0F, -0.4882F);
        this.Leftlowerfrontteeth.cubeList.add(new ModelBox(Leftlowerfrontteeth, 0, 4, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.8F, -4.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7854F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 14, 0, -1.5F, -2.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.Rightlowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Rightlowerfrontteeth.setRotationPoint(1.4F, -0.7F, -1.8F);
        this.Lowerjawfront.addChild(Rightlowerfrontteeth);
        this.setRotateAngle(Rightlowerfrontteeth, 0.1911F, 0.0F, 0.4882F);
        this.Rightlowerfrontteeth.cubeList.add(new ModelBox(Rightlowerfrontteeth, 7, 0, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Leftlowermidteeth = new AdvancedModelRendererExtended(this);
        this.Leftlowermidteeth.setRotationPoint(-2.0F, -0.9F, -1.1F);
        this.Lowerjawmiddlefront.addChild(Leftlowermidteeth);
        this.setRotateAngle(Leftlowermidteeth, 0.1698F, 0.0F, -0.3396F);
        this.Leftlowermidteeth.cubeList.add(new ModelBox(Leftlowermidteeth, 8, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRendererExtended(this);
        this.Rightlowerteeth.setRotationPoint(2.0F, -0.9F, -1.1F);
        this.Lowerjawmiddlefront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.1698F, 0.0F, 0.3396F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 11, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Lowerjawteethback = new AdvancedModelRendererExtended(this);
        this.Lowerjawteethback.setRotationPoint(0.0F, -0.9F, -4.9F);
        this.Lowerjawmiddlebase.addChild(Lowerjawteethback);
        this.setRotateAngle(Lowerjawteethback, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawteethback.cubeList.add(new ModelBox(Lowerjawteethback, 23, 19, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.05F, -5.0F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.1911F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 75, 0, -3.0F, -3.0F, 0.0F, 6, 3, 6, 0.0F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(-0.01F, 1.8F, 0.0F);
        this.Lowerjawback.addChild(Throat);
        this.setRotateAngle(Throat, -0.1253F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 34, 101, -3.5F, -1.0F, -6.0F, 7, 1, 6, 0.0F, false));

        this.Upperjawback = new AdvancedModelRendererExtended(this);
        this.Upperjawback.setRotationPoint(0.0F, 1.5F, -6.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, -0.0424F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 36, 80, -3.0F, -3.0F, -5.0F, 6, 3, 5, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRendererExtended(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.0213F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 71, 28, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRendererExtended(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.0F, -1.93F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0262F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 60, 0, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.6F, -4.2F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.7854F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 0, 10, -0.5F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.Leftupperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.4F, -0.2F, -2.5F);
        this.Upperjawfront.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.1061F, 0.0F, 0.4882F);
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 7, 3, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Rightupperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Rightupperfrontteeth.setRotationPoint(1.4F, -0.2F, -2.5F);
        this.Upperjawfront.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.1061F, 0.0F, -0.4882F);
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 0, 1, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Leftupperfang = new AdvancedModelRendererExtended(this);
        this.Leftupperfang.setRotationPoint(-1.97F, -0.2F, -0.7F);
        this.Upperjawmiddle.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, -0.0848F, 0.0F, 0.2122F);
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 14, 2, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.Leftuppermidteeth = new AdvancedModelRendererExtended(this);
        this.Leftuppermidteeth.setRotationPoint(-2.0F, -0.1F, -1.5F);
        this.Upperjawmiddle.addChild(Leftuppermidteeth);
        this.setRotateAngle(Leftuppermidteeth, -0.1698F, 0.0F, 0.3609F);
        this.Leftuppermidteeth.cubeList.add(new ModelBox(Leftuppermidteeth, 2, 1, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Rightupperfang = new AdvancedModelRendererExtended(this);
        this.Rightupperfang.setRotationPoint(1.97F, -0.2F, -0.7F);
        this.Upperjawmiddle.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.0848F, 0.0F, -0.2122F);
        this.Rightupperfang.cubeList.add(new ModelBox(Rightupperfang, 5, 0, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.Rightuppermidteeth = new AdvancedModelRendererExtended(this);
        this.Rightuppermidteeth.setRotationPoint(2.0F, -0.1F, -1.5F);
        this.Upperjawmiddle.addChild(Rightuppermidteeth);
        this.setRotateAngle(Rightuppermidteeth, -0.1698F, 0.0F, -0.3609F);
        this.Rightuppermidteeth.cubeList.add(new ModelBox(Rightuppermidteeth, 0, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Nosebridge = new AdvancedModelRendererExtended(this);
        this.Nosebridge.setRotationPoint(-0.01F, -2.8F, -5.0F);
        this.Upperjawback.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.1698F, 0.0F, 0.0F);
        this.Nosebridge.cubeList.add(new ModelBox(Nosebridge, 22, 9, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, -0.2F, -4.5F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.0424F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 34, 63, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Neckflab = new AdvancedModelRendererExtended(this);
        this.Neckflab.setRotationPoint(-0.01F, 2.5F, 0.5F);
        this.Neckmiddlefront.addChild(Neckflab);
        this.setRotateAngle(Neckflab, 0.0986F, 0.0F, 0.0F);
        this.Neckflab.cubeList.add(new ModelBox(Neckflab, 53, 101, -3.0F, -1.0F, -8.0F, 6, 1, 8, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(-5.2F, 3.5F, -8.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.1274F, 0.5732F, 0.0F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 32, 0, -7.0F, -1.5F, -1.5F, 8, 4, 5, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(-6.0F, 0.3F, 1.01F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.0F, -0.2122F, 0.9765F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 54, 23, -2.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -0.1061F, 0.3609F, -1.0826F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 94, 21, -7.5F, -0.5F, -3.5F, 8, 1, 7, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(5.2F, 3.5F, -8.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.1274F, -0.5732F, 0.0F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 0, 10, -1.0F, -1.5F, -1.5F, 8, 4, 5, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(6.0F, 0.3F, 1.01F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 0.0F, 0.2122F, -0.9765F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 37, 24, -1.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRendererExtended(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.1061F, -0.3609F, 1.0826F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 98, 2, -0.5F, -0.5F, -3.5F, 8, 1, 7, 0.0F, false));

        this.Tailbase = new AdvancedModelRendererExtended(this);
        this.Tailbase.setRotationPoint(0.0F, 0.2F, 2.9F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 72, 46, -3.5F, -1.5F, 0.0F, 7, 6, 7, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRendererExtended(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.3F, 6.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1911F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 74, 33, -2.5F, -1.5F, 0.0F, 5, 5, 7, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRendererExtended(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0424F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 20, 34, -2.0F, -1.5F, 0.0F, 4, 5, 8, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRendererExtended(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.6F, 7.0F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0637F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 72, 60, -1.5F, -1.5F, 0.0F, 3, 4, 11, 0.0F, false));

        this.Tailend = new AdvancedModelRendererExtended(this);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 10.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 47, 63, -1.0F, -1.5F, 0.0F, 2, 3, 13, 0.0F, false));

        this.Tailfinend = new AdvancedModelRendererExtended(this);
        this.Tailfinend.setRotationPoint(-0.01F, -0.6F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, 0.0424F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 66, 5, 0.0F, -2.0F, 0.0F, 0, 5, 17, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRendererExtended(this);
        this.Tailfinbase.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Tailmiddleend.addChild(Tailfinbase);
        this.setRotateAngle(Tailfinbase, 0.0213F, 0.0F, 0.0F);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 73, 2, 0.0F, -3.0F, 0.0F, 0, 5, 11, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(-4.1F, 2.1F, 0.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.5095F, 0.5732F, 0.1274F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 90, 60, -7.0F, -1.5F, -2.0F, 8, 4, 5, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(-6.0F, 0.3F, 0.51F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4245F, -0.0424F, 1.0613F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 54, 7, -1.5F, 0.0F, -2.5F, 3, 6, 5, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.8F, 0.0F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.3183F, 0.2546F, -1.5921F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 98, 11, -7.5F, -0.5F, -3.5F, 8, 1, 7, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(4.1F, 2.1F, 0.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.5095F, -0.5732F, -0.1274F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 84, 76, -1.0F, -1.5F, -2.0F, 8, 4, 5, 0.0F, false));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(6.0F, 0.3F, 0.51F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4245F, 0.0424F, -1.0613F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 37, 12, -1.5F, 0.0F, -2.5F, 3, 6, 5, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.8F, 0.0F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.3183F, -0.2546F, 1.5921F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 92, 30, -0.5F, -0.5F, -3.5F, 8, 1, 7, 0.0F, false));

        this.Bellyflab = new AdvancedModelRendererExtended(this);
        this.Bellyflab.setRotationPoint(-0.01F, 5.5F, 4.0F);
        this.Hips.addChild(Bellyflab);
        this.setRotateAngle(Bellyflab, 0.1274F, 0.0F, 0.0F);
        this.Bellyflab.cubeList.add(new ModelBox(Bellyflab, 0, 101, -5.0F, -2.0F, -13.0F, 10, 2, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.6f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(10);
        this.Neckfront.rotateAngleY = (float) Math.toRadians(18);
        this.Neckbase.rotateAngleY = (float) Math.toRadians(15);
        this.Head.rotateAngleY = (float) Math.toRadians(10);
        this.Hips.rotateAngleY = (float) Math.toRadians(10);
        this.Tailbase.rotateAngleY = (float) Math.toRadians(10);
        this.Tailmiddle.rotateAngleY = (float) Math.toRadians(20);
        this.Tailend.rotateAngleY = (float) Math.toRadians(15);
        this.Hips.offsetZ = -0.1F;
        this.Hips.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Hips.offsetY = 0.6F;

        EntityPrehistoricFloraNothosaurus Nothosaurus = (EntityPrehistoricFloraNothosaurus) e;

        this.faceTarget(f3, f4, 5, Neckbase);
        this.faceTarget(f3, f4, 5, Neckmiddlebase);
        this.faceTarget(f3, f4, 5, Neckmiddlefront);
        this.faceTarget(f3, f4, 5, Neckfront);
        this.faceTarget(f3, f4, 5, Head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};

        AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        if (!Nothosaurus.isReallyInWater()) { //will never happen as it should not be on land
            //this.leftarm.rotateAngleZ = (float) Math.toRadians(15.6125);
            //this.rightarm3.rotateAngleZ = (float) Math.toRadians(-18.662);

            //this.leftleg.rotateAngleX = -(float) Math.toRadians(22.9232);
            //this.rightleg3.rotateAngleX = -(float) Math.toRadians(22.9232);

            if (f3 == 0.0F || !Nothosaurus.getIsMoving()) {
                return;
            }

            this.swing(this.Leftupperarm, speed * 0.6F, 0.2F,false, -0.8F,0, f2, 1F);
            this.swing(this.Rightupperarm, speed * 0.6F, 0.2F,true, 0.8F,0, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.swing(this.Rightthigh, speed * 0.6F, -0.3F,false, 0,0, f2, 1F);
            this.swing(this.Leftthigh, speed * 0.6F, -0.3F,true, 0,0, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;

            this.Rightupperarm.rotateAngleX = -(float) Math.toRadians(-55.2);
            this.Leftupperarm.rotateAngleX = -(float) Math.toRadians(-50.6725);

            this.Rightupperarm.rotateAngleZ = (float) Math.toRadians(33.1584);
            this.Leftupperarm.rotateAngleZ = (float) Math.toRadians(-32.9211);

            this.Rightlowerarm.rotateAngleZ = (float) Math.toRadians(-82.7576);
            this.Leftlowerarm.rotateAngleZ = (float) Math.toRadians(83.2599);

            this.Rightfrontfoot.rotateAngleZ = (float) Math.toRadians(105.2436);
            this.Leftfrontfoot.rotateAngleZ = (float) Math.toRadians(-105.2436);

            this.Rightthigh.rotateAngleY = (float) Math.toRadians(-49.5047);
            this.Leftthigh.rotateAngleY = (float) Math.toRadians(49.5047);

            this.chainSwingExtended(BR, speed * 0.5F, 0.15F, 0, 2, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.5F, 0.15F, 0, -2, f2, 0.8F);



            if (f3 == 0.0F) {
                this.chainSwing(Torso, speed * 0.1F, 0.07F, -3, f2, 1);
                this.chainFlapExtended(FR, speed * 0.2F, 0.1F, -3, -3, f2, 0.8F);
                this.chainFlapExtended(FL, speed * 0.2F, 0.1F, -3, 2.5F, f2, 0.8F);
                this.chainWave(Tail, speed *0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.1F, 0.35F, -3, f2, 1F);
                return;
            }
            this.chainSwing(Torso, speed*0.5F, 0.07F, -3, f2, 1);
           // this.chainFlapExtended(FR, speed * 0.5F, 0.1F, -3, -3, f2, 0.8F);
           // this.chainFlapExtended(FL, speed * 0.5F, 0.1F, -3, 2.5F, f2, 0.8F);
            this.chainSwingExtended(FR, speed * 0.5F, 0.5F, 0, -3, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.5F, 0.5F, 0, 2.5F, f2, 0.8F);


            this.chainWave(Tail, speed *0.5F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.5F, 0.25F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
       // animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, -(float) Math.toRadians(12.57), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, -(float) Math.toRadians(-32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, -(float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, -(float) Math.toRadians(-32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
