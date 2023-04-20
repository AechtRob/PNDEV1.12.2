package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBishanopliosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBishanopliosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjawmiddlebase;
    private final AdvancedModelRenderer Lowerjawbackslopeslope;
    private final AdvancedModelRenderer Lowerjawmiddlefront;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Leftlowerfrontteeth;
    private final AdvancedModelRenderer Lowerfrontteeth;
    private final AdvancedModelRenderer Rightlowerfrontteeth;
    private final AdvancedModelRenderer Lowerjawmiddleslope;
    private final AdvancedModelRenderer Leftlowermiddleteeth;
    private final AdvancedModelRenderer Rightlowermiddleteeth;
    private final AdvancedModelRenderer Lowerbackteeth;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Leftupperfronttooth;
    private final AdvancedModelRenderer Rightupperfronttooth;
    private final AdvancedModelRenderer Leftuppermiddleteeth;
    private final AdvancedModelRenderer Rightuppermiddleteeth;
    private final AdvancedModelRenderer Upperjawslope;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Orbitflesh;
    private final AdvancedModelRenderer Upperbackteeth;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Leftfrontflipper1;
    private final AdvancedModelRenderer Leftfrontflipper2;
    private final AdvancedModelRenderer Leftfrontflipper3;
    private final AdvancedModelRenderer Rightfrontflipper1;
    private final AdvancedModelRenderer Rightfrontflipper2;
    private final AdvancedModelRenderer Rightfrontflipper3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tailfluke;
    private final AdvancedModelRenderer Tailflukeend;
    private final AdvancedModelRenderer Tailflukestart;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Lefthindflipper3;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Righthindflipper3;

    private ModelAnimator animator;

    public ModelBishanopliosaurus() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.0F, 11.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 95, -6.0F, -2.0F, 0.0F, 12, 8, 9, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.1F, 0.5F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0848F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 48, 41, -7.0F, -2.0F, -12.5F, 14, 10, 13, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -12.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1274F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 54, 22, -6.0F, -2.0F, -8.5F, 12, 9, 9, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.7F, -8.5F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.0213F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 81, -4.0F, -2.5F, -4.0F, 8, 8, 5, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.2F, -3.5F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0424F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 68, -3.0F, -2.0F, -5.5F, 6, 6, 6, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(-0.01F, -0.4F, -5.5F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0213F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 56, -2.5F, -1.5F, -5.5F, 5, 5, 6, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(-0.01F, 0.01F, -5.3F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0213F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 0, 45, -3.0F, -1.5F, -4.5F, 6, 5, 5, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.4F, -3.4F);
        this.Neck4.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 37, -3.5F, -1.0F, -3.5F, 7, 3, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 29, -3.5F, 0.0F, -4.0F, 7, 2, 5, 0.0F, false));

        this.Lowerjawmiddlebase = new AdvancedModelRenderer(this);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.Lowerjaw.addChild(Lowerjawmiddlebase);
        this.setRotateAngle(Lowerjawmiddlebase, 0.1061F, 0.0F, 0.0F);
        this.Lowerjawmiddlebase.cubeList.add(new ModelBox(Lowerjawmiddlebase, 0, 11, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.Lowerjawbackslopeslope = new AdvancedModelRenderer(this);
        this.Lowerjawbackslopeslope.setRotationPoint(0.01F, 1.0F, 0.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawbackslopeslope);
        this.setRotateAngle(Lowerjawbackslopeslope, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawbackslopeslope.cubeList.add(new ModelBox(Lowerjawbackslopeslope, 0, 6, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.Lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.94F, -4.02F);
        this.Lowerjawmiddlebase.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 14, 4, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -1.7F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0424F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 20, 28, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Leftlowerfrontteeth = new AdvancedModelRenderer(this);
        this.Leftlowerfrontteeth.setRotationPoint(-0.95F, 0.1F, -1.19F);
        this.Lowerjawfront.addChild(Leftlowerfrontteeth);
        this.setRotateAngle(Leftlowerfrontteeth, 0.1061F, 0.0F, -0.7641F);
        this.Leftlowerfrontteeth.cubeList.add(new ModelBox(Leftlowerfrontteeth, 0, 2, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.1F, -2.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 6, 0, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.Rightlowerfrontteeth = new AdvancedModelRenderer(this);
        this.Rightlowerfrontteeth.setRotationPoint(0.95F, 0.1F, -1.29F);
        this.Lowerjawfront.addChild(Rightlowerfrontteeth);
        this.setRotateAngle(Rightlowerfrontteeth, 0.1061F, 0.0F, 0.7641F);
        this.Rightlowerfrontteeth.cubeList.add(new ModelBox(Rightlowerfrontteeth, 0, 4, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Lowerjawmiddleslope = new AdvancedModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.1222F, 0.0F, 0.0F);
        this.Lowerjawmiddleslope.cubeList.add(new ModelBox(Lowerjawmiddleslope, 17, 9, -1.0F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.Leftlowermiddleteeth = new AdvancedModelRenderer(this);
        this.Leftlowermiddleteeth.setRotationPoint(-1.4F, -0.8F, -1.7F);
        this.Lowerjawmiddlefront.addChild(Leftlowermiddleteeth);
        this.setRotateAngle(Leftlowermiddleteeth, 0.0848F, 0.0F, -0.4671F);
        this.Leftlowermiddleteeth.cubeList.add(new ModelBox(Leftlowermiddleteeth, 18, 0, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Rightlowermiddleteeth = new AdvancedModelRenderer(this);
        this.Rightlowermiddleteeth.setRotationPoint(1.4F, -0.8F, -1.7F);
        this.Lowerjawmiddlefront.addChild(Rightlowermiddleteeth);
        this.setRotateAngle(Rightlowermiddleteeth, 0.0848F, 0.0F, 0.4671F);
        this.Rightlowermiddleteeth.cubeList.add(new ModelBox(Rightlowermiddleteeth, 13, 0, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Lowerbackteeth = new AdvancedModelRenderer(this);
        this.Lowerbackteeth.setRotationPoint(0.0F, 0.65F, -2.9F);
        this.Lowerjawmiddlebase.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.0213F, 0.0F, 0.0F);
        this.Lowerbackteeth.cubeList.add(new ModelBox(Lowerbackteeth, 36, 0, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.1F, -3.7F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.3396F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 1, 22, -2.5F, -3.0F, 0.0F, 5, 3, 3, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 2.05F, -3.8F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.1061F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 0, 16, -2.5F, -1.0F, -2.5F, 5, 1, 4, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Upperjawbase.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 28, 10, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -2.05F, -3.7F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 19, 17, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.8F, -0.83F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.7006F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 3, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.Leftupperfronttooth = new AdvancedModelRenderer(this);
        this.Leftupperfronttooth.setRotationPoint(-1.4F, 2.4F, -1.0F);
        this.Upperjawfront.addChild(Leftupperfronttooth);
        this.setRotateAngle(Leftupperfronttooth, -0.1061F, 0.0F, 0.7641F);
        this.Leftupperfronttooth.cubeList.add(new ModelBox(Leftupperfronttooth, 0, 6, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Rightupperfronttooth = new AdvancedModelRenderer(this);
        this.Rightupperfronttooth.setRotationPoint(1.4F, 2.4F, -1.0F);
        this.Upperjawfront.addChild(Rightupperfronttooth);
        this.setRotateAngle(Rightupperfronttooth, -0.1061F, 0.0F, -0.7641F);
        this.Rightupperfronttooth.cubeList.add(new ModelBox(Rightupperfronttooth, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Leftuppermiddleteeth = new AdvancedModelRenderer(this);
        this.Leftuppermiddleteeth.setRotationPoint(-1.4F, -0.2F, -2.0F);
        this.Upperjawmiddle.addChild(Leftuppermiddleteeth);
        this.setRotateAngle(Leftuppermiddleteeth, 0.0F, 0.0F, 0.4671F);
        this.Leftuppermiddleteeth.cubeList.add(new ModelBox(Leftuppermiddleteeth, 8, 0, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Rightuppermiddleteeth = new AdvancedModelRenderer(this);
        this.Rightuppermiddleteeth.setRotationPoint(1.4F, -0.2F, -2.0F);
        this.Upperjawmiddle.addChild(Rightuppermiddleteeth);
        this.setRotateAngle(Rightuppermiddleteeth, 0.0F, 0.0F, -0.4671F);
        this.Rightuppermiddleteeth.cubeList.add(new ModelBox(Rightuppermiddleteeth, 3, 0, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.Upperjawslope = new AdvancedModelRenderer(this);
        this.Upperjawslope.setRotationPoint(-0.01F, -2.55F, -1.2F);
        this.Upperjawbase.addChild(Upperjawslope);
        this.setRotateAngle(Upperjawslope, 0.0742F, 0.0F, 0.0F);
        this.Upperjawslope.cubeList.add(new ModelBox(Upperjawslope, 18, 22, -1.0F, 0.0F, -4.0F, 2, 2, 3, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.0F, -1.8F, -1.02F);
        this.Upperjawbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.1061F, -0.4245F, 0.1698F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 37, 18, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(1.0F, -1.8F, -1.02F);
        this.Upperjawbase.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.1061F, 0.4245F, -0.1698F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 28, 18, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.Orbitflesh = new AdvancedModelRenderer(this);
        this.Orbitflesh.setRotationPoint(0.0F, -1.9F, -0.2F);
        this.Upperjawbase.addChild(Orbitflesh);
        this.setRotateAngle(Orbitflesh, 0.1061F, 0.0F, 0.0F);
        this.Orbitflesh.cubeList.add(new ModelBox(Orbitflesh, 27, 5, -2.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, -0.65F, -2.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.0213F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 23, 0, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.01F, -1.0F, -3.5F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2847F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 29, 22, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(-5.0F, 3.5F, -6.0F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.1485F, 0.2972F, -0.1698F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 53, 65, -7.5F, -1.5F, -1.5F, 8, 3, 6, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(-6.8F, 0.0F, 0.0F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, 0.1061F, 0.0F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 23, 41, -7.5F, -1.0F, -2.0F, 8, 2, 8, 0.0F, false));

        this.Leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(-7.0F, 0.0F, -0.7F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, 0.1698F, 0.0F);
        this.Leftfrontflipper3.cubeList.add(new ModelBox(Leftfrontflipper3, 36, 22, -7.0F, -0.5F, -1.0F, 7, 1, 6, 0.0F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(5.0F, 3.5F, -6.0F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.1485F, -0.2972F, 0.1698F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 76, 71, -0.5F, -1.5F, -1.5F, 8, 3, 6, 0.0F, false));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(6.8F, 0.0F, 0.0F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, -0.1061F, 0.0F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 21, 30, -0.5F, -1.0F, -2.0F, 8, 2, 8, 0.0F, false));

        this.Rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(7.0F, 0.0F, -0.7F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, -0.1698F, 0.0F);
        this.Rightfrontflipper3.cubeList.add(new ModelBox(Rightfrontflipper3, 46, 14, 0.0F, -0.5F, -1.0F, 7, 1, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.4F, 8.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0213F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 43, 99, -3.5F, -1.5F, 0.0F, 7, 5, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 5.2F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0213F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 34, 89, -2.0F, -1.5F, 0.0F, 4, 4, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 4.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 37, 78, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0424F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 27, 81, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Tailfluke = new AdvancedModelRenderer(this);
        this.Tailfluke.setRotationPoint(0.0F, -2.05F, -0.3F);
        this.Tail4.addChild(Tailfluke);
        this.setRotateAngle(Tailfluke, 0.2972F, 0.0F, 0.0F);
        this.Tailfluke.cubeList.add(new ModelBox(Tailfluke, 25, 72, -0.5F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.Tailflukeend = new AdvancedModelRenderer(this);
        this.Tailflukeend.setRotationPoint(-0.01F, 0.0F, 3.0F);
        this.Tailfluke.addChild(Tailflukeend);
        this.setRotateAngle(Tailflukeend, -0.9976F, 0.0F, 0.0F);
        this.Tailflukeend.cubeList.add(new ModelBox(Tailflukeend, 47, 72, -0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Tailflukestart = new AdvancedModelRenderer(this);
        this.Tailflukestart.setRotationPoint(0.01F, -1.5F, -0.1F);
        this.Tail3.addChild(Tailflukestart);
        this.setRotateAngle(Tailflukestart, 0.2213F, 0.0F, 0.0F);
        this.Tailflukestart.cubeList.add(new ModelBox(Tailflukestart, 36, 72, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(-5.0F, 3.0F, 3.0F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.4671F, -0.1274F);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 48, 85, -6.5F, -1.5F, -1.0F, 7, 3, 5, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(-5.8F, 0.0F, 0.0F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, 0.1061F, 0.0F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 19, 62, -7.5F, -1.0F, -1.5F, 8, 2, 7, 0.0F, false));

        this.Lefthindflipper3 = new AdvancedModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(-7.0F, 0.0F, -0.1F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, 0.1698F, 0.0F);
        this.Lefthindflipper3.cubeList.add(new ModelBox(Lefthindflipper3, 44, 0, -7.0F, -0.5F, -1.0F, 7, 1, 5, 0.0F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(5.0F, 3.0F, 3.0F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, 0.0F, -0.4671F, 0.1274F);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 52, 76, -0.5F, -1.5F, -1.0F, 7, 3, 5, 0.0F, false));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(5.8F, 0.0F, 0.0F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, -0.1061F, 0.0F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 17, 52, -0.5F, -1.0F, -1.5F, 8, 2, 7, 0.0F, false));

        this.Righthindflipper3 = new AdvancedModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(7.0F, 0.0F, -0.1F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, -0.1698F, 0.0F);
        this.Righthindflipper3.cubeList.add(new ModelBox(Righthindflipper3, 41, 7, 0.0F, -0.5F, -1.0F, 7, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBishanopliosaurus ee = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBishanopliosaurus entity = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D)));
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*2.5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-60))*2.5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-2.5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-2.5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*10) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2))*-5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+50))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+60))*10) + (((tickAnim - 10D) / 10D) * (0D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+60))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+50))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+50))*-5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5D + (((tickAnim - 0D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*7.5D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*-5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*7.5) + (((tickAnim - 10D) / 10D) * (0D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*7.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+120))*-5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+180))*-5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*25) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+280))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*25D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+280))*15) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+280))*15D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2+240))*-10D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5) + (((tickAnim - 0D) / 10D) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+240))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+240))*15) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+240))*-1D-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+240))*15D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+240))*-1) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/2+240))*-1D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*1D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5) + (((tickAnim - 10D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/2-30))*5D)));
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));
    }


    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBishanopliosaurus entity = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.offsetX = (float) Math.toRadians(0);
        this.root.offsetY = (float) Math.toRadians(2);
        this.root.offsetZ = (float) Math.toRadians(0);


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45))*2.5), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90))*5), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90))*3));
        this.Hips.offsetX = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+120))*1);
        this.Hips.offsetY = (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+120))*3);
        this.Hips.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+90))*7.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+90))*5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+90))*3));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+180))*5), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+180))*5), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+180))*3));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+30))*-5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+30))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+30))*-3));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45))*-5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90))*-3));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-30))*5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-30))*7.5), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-30))*3));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-70))*5), Neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*2.5), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*3));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-70))*7.5), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*2.5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*3));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-120))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+120))*-20), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-120))*-5), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-120))*10));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+180))*-5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-180))*-5), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-180))*5));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+240))*-5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-240))*-5), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-240))*5));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+90))*-20), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-150))*5), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-150))*-10));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+150))*-5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-210))*5), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-210))*-5));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+210))*-5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-270))*5), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-270))*-5));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-60))*5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-60))*5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-60))*3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-80))*5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-80))*5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-80))*3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-100))*5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-100))*5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-100))*3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-120))*5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-120))*5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-120))*3));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+50))*-10), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*10), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*10));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+110))*-5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-110))*5), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-110))*5));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+190))*-5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-190))*5), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-190))*5));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+80))*-10), Righthindflipper1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-20))*-10), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-20))*-10));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+140))*-5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-80))*-5), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-80))*-5));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+220))*-5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-160))*-5), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-160))*-5));

    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBishanopliosaurus entity = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.offsetX = (float) Math.toRadians(0);
        this.root.offsetY = (float) Math.toRadians(0);
        this.root.offsetZ = (float) Math.toRadians(0);

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 20D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 0D) / 20D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 20D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 20D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*-1D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 20D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 30D) / 10D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*-1) + (((tickAnim - 30D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*-1D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 30D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1) + (((tickAnim - 40D) / 10D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720))*-1D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 40D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 40D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 50D) / 60D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 50D) / 60D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 50D) / 60D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 110D) / 30D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1) + (((tickAnim - 140D) / 10D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1D-(-5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-10) + (((tickAnim - 140D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*3) + (((tickAnim - 140D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*3D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1) + (((tickAnim - 150D) / 10D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(7.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720))*-1D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 150D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*1) + (((tickAnim - 150D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*1D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 0D) / 20D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 0D) / 20D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 0D) / 20D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 20D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+60))*-1D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 20D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 30D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+60))*-1) + (((tickAnim - 30D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+60))*-1D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 30D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1) + (((tickAnim - 40D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 40D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 40D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 50D) / 60D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 50D) / 60D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 50D) / 60D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 110D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-60))*1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*-10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-60))*1) + (((tickAnim - 140D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-60))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*-10) + (((tickAnim - 140D) / 10D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*3) + (((tickAnim - 140D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+60))*3D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1) + (((tickAnim - 150D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-90))*-1D)));
            yy = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 150D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*1) + (((tickAnim - 150D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-90))*1D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 0D) / 20D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 0D) / 20D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 0D) / 20D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 20D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 20D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+120))*-1D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 20D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 30D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+120))*-1) + (((tickAnim - 30D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+120))*-1D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 30D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1) + (((tickAnim - 40D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 40D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 40D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 50D) / 60D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 50D) / 60D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 50D) / 60D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 110D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-120))*-1D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*-5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-120))*-1) + (((tickAnim - 140D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360-120))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*-5) + (((tickAnim - 140D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*3) + (((tickAnim - 140D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+120))*3D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1) + (((tickAnim - 150D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-180))*-1D)));
            yy = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5) + (((tickAnim - 150D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*1) + (((tickAnim - 150D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-180))*1D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 0D) / 20D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 20D) / 10D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 20D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 30D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-1) + (((tickAnim - 30D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-1D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 30D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1) + (((tickAnim - 40D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 40D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 40D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 50D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 50D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 50D) / 60D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 110D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-180))*1) + (((tickAnim - 140D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360-180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-5) + (((tickAnim - 140D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*3) + (((tickAnim - 140D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*3D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1) + (((tickAnim - 150D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-190))*-1D)));
            yy = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5) + (((tickAnim - 150D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*1) + (((tickAnim - 150D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-190))*1D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 0D) / 20D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 0D) / 20D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 20D) / 10D) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 20D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 30D) / 10D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1D-(-20+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-5) + (((tickAnim - 30D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360+180))*-5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-3) + (((tickAnim - 30D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+180))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1) + (((tickAnim - 40D) / 10D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 40D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 40D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 50D) / 60D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 50D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 50D) / 60D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 110D) / 30D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*10D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 110D) / 30D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*10) + (((tickAnim - 140D) / 10D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1D-(-10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*10D)));
            yy = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*10) + (((tickAnim - 140D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*-3) + (((tickAnim - 140D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180+200))*-3D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1) + (((tickAnim - 150D) / 10D) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(-15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-200))*-1D)));
            yy = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5) + (((tickAnim - 150D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*1) + (((tickAnim - 150D) / 10D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*1D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 0D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 0D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = 2.5D + (((tickAnim - 0D) / 60D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 60D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 60D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = 2.5D + (((tickAnim - 60D) / 30D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D-(2.5D)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 90D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 90D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5) + (((tickAnim - 90D) / 30D) * (2.5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
            zz = 2.5D + (((tickAnim - 120D) / 40D) * (2.5D-(2.5D)));
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 0D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5) + (((tickAnim - 0D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D)));
            zz = -7.5D + (((tickAnim - 0D) / 60D) * (-7.5D-(-7.5D)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 60D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5) + (((tickAnim - 60D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D)));
            zz = -7.5D + (((tickAnim - 60D) / 30D) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D-(-7.5D)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 90D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5) + (((tickAnim - 90D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D)));
            zz = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5) + (((tickAnim - 90D) / 30D) * (-7.5D-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-2.5D)));
            zz = -7.5D + (((tickAnim - 120D) / 40D) * (-7.5D-(-7.5D)));
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 0D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5) + (((tickAnim - 0D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D)));
            zz = -2.5D + (((tickAnim - 0D) / 120D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 120D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5) + (((tickAnim - 120D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D)));
            zz = -2.5D + (((tickAnim - 120D) / 20D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D-(-2.5D)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 140D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5) + (((tickAnim - 140D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*5D)));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5) + (((tickAnim - 140D) / 20D) * (-2.5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D)));
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 0D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5) + (((tickAnim - 0D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D)));
            zz = 7.5D + (((tickAnim - 0D) / 120D) * (7.5D-(7.5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 120D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5) + (((tickAnim - 120D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D)));
            zz = 7.5D + (((tickAnim - 120D) / 20D) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D-(7.5D)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5) + (((tickAnim - 140D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5) + (((tickAnim - 140D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-2.5D)));
            zz = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5) + (((tickAnim - 140D) / 20D) * (7.5D-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D)));
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 30D) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-12.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 0D) / 30D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 30D) / 30D) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-12.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 30D) / 30D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 30D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 60D) / 70D) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-12.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*5) + (((tickAnim - 60D) / 70D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-3) + (((tickAnim - 60D) / 70D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-3D)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 130D) / 30D) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-12.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 130D) / 30D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 130D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 0D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 0D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 30D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 30D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*5D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 30D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 60D) / 70D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*5) + (((tickAnim - 60D) / 70D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*5D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*-3) + (((tickAnim - 60D) / 70D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-90))*-3D)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 130D) / 30D) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(-2.5+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 130D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3) + (((tickAnim - 130D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-90))*-3D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 0D) / 30D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 0D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 0D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 30D) / 30D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 30D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 30D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 60D) / 70D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*3) + (((tickAnim - 60D) / 70D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*-3) + (((tickAnim - 60D) / 70D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-180))*-3D)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 130D) / 30D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(15+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 130D) / 30D) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3) + (((tickAnim - 130D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-3D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10D + (((tickAnim - 0D) / 30D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 30D) / 30D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 30D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 30D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 60D) / 70D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*3) + (((tickAnim - 60D) / 70D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*-3) + (((tickAnim - 60D) / 70D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180-190))*-3D)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3) + (((tickAnim - 130D) / 30D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*3D-(10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*90))*3D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3) + (((tickAnim - 130D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*90))*-3D)));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3) + (((tickAnim - 130D) / 30D) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-190))*-3D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D)));
            zz = 5D + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D-(5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 20D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5) + (((tickAnim - 20D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D)));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5) + (((tickAnim - 20D) / 20D) * (5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 40D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5) + (((tickAnim - 40D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*5D)));
            zz = 5D + (((tickAnim - 40D) / 120D) * (5D-(5D)));
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D)));
            zz = -10D + (((tickAnim - 0D) / 20D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D-(-10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 20D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5) + (((tickAnim - 20D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D)));
            zz = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5) + (((tickAnim - 20D) / 20D) * (-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 40D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5) + (((tickAnim - 40D) / 120D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-270))*-2.5D)));
            zz = -10D + (((tickAnim - 40D) / 120D) * (-10D-(-10D)));
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 0D) / 79D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5) + (((tickAnim - 0D) / 79D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D)));
            zz = -5D + (((tickAnim - 0D) / 79D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 79D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5) + (((tickAnim - 79D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D)));
            zz = -5D + (((tickAnim - 79D) / 21D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D-(-5D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 100D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5) + (((tickAnim - 100D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D)));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5) + (((tickAnim - 100D) / 20D) * (-5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*5D)));
            zz = -5D + (((tickAnim - 120D) / 40D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 0D) / 79D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5) + (((tickAnim - 0D) / 79D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D)));
            zz = 10D + (((tickAnim - 0D) / 79D) * (10D-(10D)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 79D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5) + (((tickAnim - 79D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D)));
            zz = 10D + (((tickAnim - 79D) / 21D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D-(10D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 100D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5) + (((tickAnim - 100D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D)));
            zz = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5) + (((tickAnim - 100D) / 20D) * (10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360-60))*5D)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5) + (((tickAnim - 120D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-180))*-2.5D)));
            zz = 10D + (((tickAnim - 120D) / 40D) * (10D-(10D)));
        }
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 0D) / 20D) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(6+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1D-(6+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720))*-1) + (((tickAnim - 30D) / 10D) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2D-(10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 30D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 30D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2) + (((tickAnim - 40D) / 10D) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(2+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 40D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 40D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 50D) / 60D) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(6+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 50D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 50D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1) + (((tickAnim - 110D) / 30D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-10D-(6+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 110D) / 30D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-10) + (((tickAnim - 140D) / 10D) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2D-(10+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*180))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 140D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*5) + (((tickAnim - 140D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*5D)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2) + (((tickAnim - 150D) / 10D) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/160D)*180))*-1D-(2+Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*720-200))*-2D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1) + (((tickAnim - 150D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3) + (((tickAnim - 150D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45-200))*3D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Lefteye, Lefteye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*180))*5), Lefteye.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*360))*5), Lefteye.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*180))*5));
        this.setRotateAngle(Righteye, Righteye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*180))*-5), Righteye.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*360))*-5), Righteye.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*180))*-5));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*-1D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*-1) + (((tickAnim - 60D) / 40D) * (0D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*-1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 60D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 60D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0D + (((tickAnim - 100D) / 60D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3) + (((tickAnim - 100D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5) + (((tickAnim - 100D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 20D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*360))*1) + (((tickAnim - 60D) / 40D) * (0D-(Math.sin((Math.PI/180)*(Math.PI/180)*(((double)tickAnim/160D)*360))*1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 60D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 60D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0D + (((tickAnim - 100D) / 60D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3) + (((tickAnim - 100D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5) + (((tickAnim - 100D) / 60D) * (Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/160D)*45))*-5D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBishanopliosaurus entity = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-50))*30), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+70))*30), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*20));
        this.root.offsetX = (float) Math.toRadians(0);
        this.root.offsetY = (float) Math.toRadians(4);
        this.root.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+30))*2), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+30))*-3));
        this.Hips.offsetX = (float) Math.toRadians(0);
        this.Hips.offsetY = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-50))*-0.5);
        this.Hips.offsetZ = (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+50))*2);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*-2.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-60))*3));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-20))*-2), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-20))*3));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-30))*-3), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*2.5));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+30))*-2.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+30))*2.5));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+50))*-2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+50))*2.5));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+30))*-2.5), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+30))*2.5));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-90))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-90))*5));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-20))*5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+100))*5), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-90))*10));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+10))*5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+130))*5), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-120))*10));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-70))*30), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+50))*-30), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-80))*-20));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-40))*5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+80))*-5), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-110))*-10));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-10))*5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+110))*-5), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-140))*-10));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-10))*2.5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-10))*-3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-120))*5), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-120))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-130))*5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-130))*-3));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-80))*30), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-10))*25), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-150))*10));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-50))*5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+20))*5), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-180))*10));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-10))*5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+50))*5), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-210))*10));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*30), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+10))*-25), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-130))*-10));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-30))*5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+40))*-5), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-160))*-10));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+10))*5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+70))*-5), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-190))*-10));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBishanopliosaurus entity = (EntityPrehistoricFloraBishanopliosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.offsetX = (float) Math.toRadians(0);
        this.root.offsetY = (float) Math.toRadians(2);
        this.root.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+120))*6), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+80))*-3));
        this.Hips.offsetX = (float) Math.toRadians(0);
        this.Hips.offsetY = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+50))*-1);
        this.Hips.offsetZ = (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-10))*-2.5);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+60))*-2.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+60))*3));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+50))*-2.5), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+50))*2));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+30))*-2.5), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+30))*3));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*2.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-50))*-3));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-50))*-3));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-160))*-2.5), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-160))*3));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-190))*-2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-80))*3));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+260))*-20), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+190))*20), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+30))*20));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+290))*-5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+220))*10), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-10))*15));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+320))*-5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+250))*10), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*15));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+240))*-20), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+170))*-20), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+10))*-20));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+250))*-5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+200))*-10), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-30))*-15));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+300))*-5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+230))*-10), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*-15));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+30))*5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45+30))*-3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-10))*2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-10))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*2.5), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-50))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-70))*2.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*45-70))*-3));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+170))*-20), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+80))*20), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-50))*15));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+200))*-5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+110))*15), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-80))*10));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+230))*-5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+140))*15), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-110))*10));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+220))*-5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+130))*-15), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-60))*-10));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+190))*-20), Righthindflipper1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+100))*-20), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-30))*-15));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+250))*-5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90+160))*-15), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/160D)*8D)*90-90))*-10));


    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, Neck1);
        this.faceTarget(f3, f4, 5, Neck2);
        this.faceTarget(f3, f4, 5, Neck3);
        this.faceTarget(f3, f4, 5, Neck4);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraBishanopliosaurus ee = (EntityPrehistoricFloraBishanopliosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

