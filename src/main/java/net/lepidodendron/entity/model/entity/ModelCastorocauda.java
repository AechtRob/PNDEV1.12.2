package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCastorocauda;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCastorocauda extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Tailbase;
    private final AdvancedModelRendererExtended Tailmiddlebase;
    private final AdvancedModelRendererExtended Tailmiddle;
    private final AdvancedModelRendererExtended Tailmiddleend;
    private final AdvancedModelRendererExtended Tailend;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Eyeportion;
    private final AdvancedModelRendererExtended Snout;
    private final AdvancedModelRendererExtended Nose;
    private final AdvancedModelRendererExtended Upperfrontteeth;
    private final AdvancedModelRendererExtended Leftupperfang;
    private final AdvancedModelRendererExtended Rightupperfang;
    private final AdvancedModelRendererExtended Uppermiddleteeth;
    private final AdvancedModelRendererExtended Upperbackteeth;
    private final AdvancedModelRendererExtended Lefteye;
    private final AdvancedModelRendererExtended Righteye;
    private final AdvancedModelRendererExtended Lowerjawbase;
    private final AdvancedModelRendererExtended Lowerjawmiddle;
    private final AdvancedModelRendererExtended Lowerjawfront;
    private final AdvancedModelRendererExtended Lowermiddleteeth;
    private final AdvancedModelRendererExtended Lowerfrontteeth;
    private final AdvancedModelRendererExtended Leftlowerfang;
    private final AdvancedModelRendererExtended Rightlowerfang;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Lowerteethback;
    private final AdvancedModelRendererExtended Lowerjawfluff;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelCastorocauda() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 17.8F, 6.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3609F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 40, -4.0F, -1.5F, -5.0F, 8, 5, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRendererExtended(this);
        this.Tailbase.setRotationPoint(0.0F, -0.4F, 0.5F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.2759F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 35, 42, -2.5F, -1.0F, 0.0F, 5, 3, 3, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRendererExtended(this);
        this.Tailmiddlebase.setRotationPoint(-0.01F, 0.1F, 2.4F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.2122F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 18, 31, -3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRendererExtended(this);
        this.Tailmiddle.setRotationPoint(-0.01F, 0.1F, 5.4F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.2759F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 28, 23, -3.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRendererExtended(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.01F, 4.4F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0637F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 16, 51, -2.5F, -1.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.Tailend = new AdvancedModelRendererExtended(this);
        this.Tailend.setRotationPoint(0.0F, 0.01F, 3.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1061F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 19, 58, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.4033F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 1, -3.5F, -1.0F, -7.0F, 7, 6, 7, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(-0.01F, 0.6F, -7.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0424F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 44, 32, -3.0F, -1.5F, -3.5F, 6, 6, 4, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2759F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 29, -2.5F, -1.5F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.01F, -0.3F, -2.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.4033F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 22, -2.5F, -1.5F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Eyeportion = new AdvancedModelRendererExtended(this);
        this.Eyeportion.setRotationPoint(0.0F, -1.51F, -2.87F);
        this.Head.addChild(Eyeportion);
        this.Eyeportion.cubeList.add(new ModelBox(Eyeportion, 38, 50, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Snout = new AdvancedModelRendererExtended(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.Eyeportion.addChild(Snout);
        this.setRotateAngle(Snout, 0.0213F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 23, 40, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Nose = new AdvancedModelRendererExtended(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Snout.addChild(Nose);
        this.setRotateAngle(Nose, 0.7217F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 49, 42, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, 2.0F, -1.95F);
        this.Snout.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 1.2524F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 21, 3, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Leftupperfang = new AdvancedModelRendererExtended(this);
        this.Leftupperfang.setRotationPoint(-0.7F, 1.6F, -0.7F);
        this.Snout.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, 0.0F, 0.0F, -0.0213F);
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 25, 2, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Rightupperfang = new AdvancedModelRendererExtended(this);
        this.Rightupperfang.setRotationPoint(0.7F, 1.6F, -0.7F);
        this.Snout.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, 0.0F, 0.0F, 0.0213F);
        this.Rightupperfang.cubeList.add(new ModelBox(Rightupperfang, 29, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Uppermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Uppermiddleteeth.setRotationPoint(-0.01F, 2.0F, -2.6F);
        this.Eyeportion.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, 1.1463F, 0.0F, 0.0F);
        this.Uppermiddleteeth.cubeList.add(new ModelBox(Uppermiddleteeth, 38, 0, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, 2.0F, -1.5F);
        this.Eyeportion.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 1.2099F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 0, 3, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Lefteye = new AdvancedModelRendererExtended(this);
        this.Lefteye.setRotationPoint(-1.0F, 1.0F, -1.6F);
        this.Eyeportion.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0213F, -0.1911F, 0.0F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 14, 28, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRendererExtended(this);
        this.Righteye.setRotationPoint(1.0F, 1.0F, -1.6F);
        this.Eyeportion.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0213F, 0.1911F, 0.0F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 14, 21, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase.setRotationPoint(0.01F, 0.61F, -0.5F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, -0.0201F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 0, 15, -2.5F, -1.5F, -2.0F, 5, 3, 2, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, -0.02F, -3.57F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0213F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 48, 45, -2.0F, 0.0F, -1.8F, 4, 1, 4, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -1.8F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2122F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 29, 45, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Lowermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Lowermiddleteeth.setRotationPoint(0.0F, -1.0F, 0.3F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);
        this.setRotateAngle(Lowermiddleteeth, -0.9765F, 0.0F, 0.0F);
        this.Lowermiddleteeth.cubeList.add(new ModelBox(Lowermiddleteeth, 44, 1, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.9F, -1.3F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.9976F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 49, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Leftlowerfang = new AdvancedModelRendererExtended(this);
        this.Leftlowerfang.setRotationPoint(-0.41F, -0.4F, -0.1F);
        this.Lowerjawfront.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, -0.5519F, 0.0F, 0.1485F);
        this.Leftlowerfang.cubeList.add(new ModelBox(Leftlowerfang, 3, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Rightlowerfang = new AdvancedModelRendererExtended(this);
        this.Rightlowerfang.setRotationPoint(0.41F, -0.4F, -0.1F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, -0.5519F, 0.0F, -0.1485F);
        this.Rightlowerfang.cubeList.add(new ModelBox(Rightlowerfang, 0, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.Lowerjawmiddle.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 31, 49, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.Lowerteethback = new AdvancedModelRendererExtended(this);
        this.Lowerteethback.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.Lowerjawmiddle.addChild(Lowerteethback);
        this.setRotateAngle(Lowerteethback, -1.3373F, 0.0F, 0.0F);
        this.Lowerteethback.cubeList.add(new ModelBox(Lowerteethback, 22, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Lowerjawfluff = new AdvancedModelRendererExtended(this);
        this.Lowerjawfluff.setRotationPoint(0.01F, 1.0F, -1.8F);
        this.Lowerjawmiddle.addChild(Lowerjawfluff);
        this.setRotateAngle(Lowerjawfluff, -0.1698F, 0.0F, 0.0F);
        this.Lowerjawfluff.cubeList.add(new ModelBox(Lowerjawfluff, 0, 52, -2.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(2.52F, 2.87F, -1.6F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3183F, 0.0F, 0.0F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 52, 0, -1.0F, -1.0F, -1.5F, 3, 3, 3, 0.0F, true));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(0.7F, 1.3F, 0.9F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.0848F, 0.0F, 0.0F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 37, 31, -1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F, true));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.1485F, -0.0637F, -0.0213F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 50, 26, -2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F, true));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(-2.48F, 2.87F, -1.6F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.3183F, 0.0F, 0.0F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 28, 2, -2.0F, -1.0F, -1.5F, 3, 3, 3, 0.0F, true));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(-0.7F, 1.3F, 0.9F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 0.0848F, 0.0F, 0.0F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 15, 15, -1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F, true));

        this.Rightfrontfoot = new AdvancedModelRendererExtended(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.1485F, 0.0637F, 0.0213F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 18, 24, -2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F, true));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(3.0F, 1.44F, -2.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.4458F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 38, 4, -1.0F, -1.5F, -2.5F, 3, 4, 4, 0.0F, true));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(0.7F, 2.2F, -2.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -1.0613F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 26, 11, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.9976F, -0.1485F, -0.2122F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 46, 18, -2.5F, -0.5F, -3.5F, 5, 1, 4, 0.0F, true));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(-3.0F, 1.44F, -2.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4458F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 35, 13, -2.0F, -1.5F, -2.5F, 3, 4, 4, 0.0F, true));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(-0.7F, 2.2F, -2.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -1.0613F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 49, 9, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.9976F, 0.1485F, 0.2122F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 20, 18, -2.5F, -0.5F, -3.5F, 5, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
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
        //this.body2.offsetY = 1.28F;

        EntityPrehistoricFloraCastorocauda doco = (EntityPrehistoricFloraCastorocauda) e;
        float masterSpeed = doco.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Whole = {this.Head, this.Neck, this.Bodyfront, this.Bodymiddle, this.Hips, this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};

        AdvancedModelRenderer[] BackRight = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        AdvancedModelRenderer[] BackLeft = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};
        AdvancedModelRenderer[] FrontRight = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        AdvancedModelRenderer[] FrontLeft = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};


        if (doco.getAnimation() == doco.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (!doco.isReallyInWater()) {
            if ((f3 == 0.0F || !doco.getIsMoving())) { //Not moving
                this.swing(Neck, 0.06F, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
                this.walk(Neck, 0.06F * 2F, -0.05F, false, 0.5F, 0.025F, f2, 0.8F);
                this.chainWave(Tail, (0.06F * 0.9F), -0.06F, 2.10F, f2, 1F);
                this.chainSwing(Tail, (0.06F * 0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
                return;
            }

            float speed = masterSpeed / 0.965F;
            if (doco.getIsFast()) {
                speed = speed * 1.5F;
            }


            float speedmodifier = 1;

            this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 0, f2, 1.5F);
            ;
            this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 3, f2, 1.5F);
            ;
            this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);
            ;
            this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);
            ;

            this.walk(Leftupperarm, speed * speedmodifier, 0.5F, false, 0, -0.20F, f2, 1F);
            this.walk(Rightupperarm, speed * speedmodifier, 0.5F, false, 3, -0.20F, f2, 1F);
            this.flap(Leftupperarm, speed * speedmodifier, -0.15F, false, 1, 0.05F, f2, 1F);
            this.flap(Rightupperarm, speed * speedmodifier, 0.15F, false, 4, -0.05F, f2, 1F);

            this.walk(Leftlowerarm, speed * speedmodifier, -0.25F, false, 3, 0.10F, f2, 1F);
            this.walk(Rightlowerarm, speed * speedmodifier, -0.25F, false, 6, 0.10F, f2, 1F);
            this.flap(Leftlowerarm, speed * speedmodifier, -0.15F, false, 3, 0.05F, f2, 1F);
            this.flap(Rightlowerarm, speed * speedmodifier, 0.15F, false, 6, -0.05F, f2, 1F);

            this.walk(Leftfrontfoot, speed * speedmodifier, 0.45F, false, 2, -0.08F, f2, 1F);
            this.walk(Rightfrontfoot, speed * speedmodifier, 0.45F, false, 5, -0.08F, f2, 1F);


            this.walk(Leftthigh, speed * speedmodifier, 0.5F, true, 0, -0.20F, f2, 1F);
            this.walk(Rightthigh, speed * speedmodifier, 0.5F, true, 3, -0.20F, f2, 1F);
            this.flap(Leftthigh, speed * speedmodifier, 0.15F, true, 1, -0.05F, f2, 1F);
            this.flap(Rightthigh, speed * speedmodifier, -0.15F, true, 4, 0.05F, f2, 1F);

            this.walk(Lefthindfoot, speed * speedmodifier, 0.45F, true, 3, 0.18F, f2, 1F);
            this.walk(Righthindfoot, speed * speedmodifier, 0.45F, true, 6, 0.18F, f2, 1F);

            this.bobExtended(Hips, speed * 2F * speedmodifier, 0.245F, false, 2.5F, f2, 1F);

            this.flap(Hips, speed * speedmodifier, 0.08F, false, 2.0F, 0.04F, f2, 1.0F);
            this.flap(Bodymiddle, speed * speedmodifier, -0.08F, false, 2.0F, -0.04F, f2, 1.0F);
            this.flap(Tailbase, speed * speedmodifier, -0.08F, false, 2.0F, -0.04F, f2, 1.0F);

            this.walk(Bodymiddle, speed * 2 * speedmodifier, 0.05F, false, 2.5F, -0.01F, f2, 0.8F);

            this.swing(Neck, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neck, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
            this.chainWave(Tail, (speed * 0.6F), -0.20F, 6.2F, f2, 1F);
            this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

            this.Hips.offsetZ = this.moveBoxExtended(speed * 2 * speedmodifier, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);
        } else { //swimming
            this.setRotateAngle(Bodyfront, 0.0424F, 0.0F, 0.0F);
            this.setRotateAngle(Bodymiddle, 0.1852F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4033F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1864F, 0.0F, 0.0F);
            this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);
            this.setRotateAngle(Lefteye, -0.0213F, -0.1911F, 0.0F);
            this.setRotateAngle(Leftfrontfoot, 1.4575F, -0.0637F, -0.0213F);
            this.setRotateAngle(Lefthindfoot, 2.9667F, -0.1007F, 0.0918F);
            this.setRotateAngle(Leftlowerarm, 0.303F, 0.0F, 0.0F);
            this.setRotateAngle(Leftlowerfang, -0.5519F, 0.0F, 0.1485F);
            this.setRotateAngle(Leftshin, -1.3231F, 0.0F, 0.0F);
            this.setRotateAngle(Leftthigh, 1.4493F, 0.0F, 0.0F);
            this.setRotateAngle(Leftupperarm, 0.947F, 0.0F, 0.0F);
            this.setRotateAngle(Leftupperfang, 0.0F, 0.0F, -0.0213F);
            this.setRotateAngle(Lowerfrontteeth, -0.9976F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawbase, -0.0201F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawfluff, -0.1698F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawfront, -0.2122F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawmiddle, 0.0213F, 0.0F, 0.0F);
            this.setRotateAngle(Lowermiddleteeth, -0.9765F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerteethback, -1.3373F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2759F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.7217F, 0.0F, 0.0F);
            this.setRotateAngle(Righteye, -0.0213F, 0.1911F, 0.0F);
            this.setRotateAngle(Rightfrontfoot, 1.4575F, 0.0637F, 0.0213F);
            this.setRotateAngle(Righthindfoot, 2.9667F, 0.1007F, -0.0918F);
            this.setRotateAngle(Rightlowerarm, 0.303F, 0.0F, 0.0F);
            this.setRotateAngle(Rightlowerfang, -0.5519F, 0.0F, -0.1485F);
            this.setRotateAngle(Rightshin, -1.3231F, 0.0F, 0.0F);
            this.setRotateAngle(Rightthigh, 1.4493F, 0.0F, 0.0F);
            this.setRotateAngle(Rightupperarm, 0.947F, 0.0F, 0.0F);
            this.setRotateAngle(Rightupperfang, 0.0F, 0.0F, 0.0213F);
            this.setRotateAngle(Snout, 0.0213F, 0.0F, 0.0F);
            this.setRotateAngle(Tailbase, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(Tailend, 0.1061F, 0.0F, 0.0F);
            this.setRotateAngle(Tailmiddle, 0.2759F, 0.0F, 0.0F);
            this.setRotateAngle(Tailmiddlebase, 0.2122F, 0.0F, 0.0F);
            this.setRotateAngle(Tailmiddleend, 0.0637F, 0.0F, 0.0F);
            this.setRotateAngle(Upperbackteeth, 1.2099F, 0.0F, 0.0F);
            this.setRotateAngle(Upperfrontteeth, 1.2524F, 0.0F, 0.0F);
            this.setRotateAngle(Uppermiddleteeth, 1.1463F, 0.0F, 0.0F);

            float speed = masterSpeed / 1.265F;
            if (doco.getIsFast()) {
                speed = speed * 1.5F;
            }

            speed = speed * 1.5F;

            this.chainWave(Whole, speed, 0.08F, -3.2, f2, 1);
            this.chainSwing(Whole, speed * 2, 0.02F, -3.2, f2, 1);
            this.walk(Neck, speed, -0.10F, false, 0F, -0.05F, f2, 1F);
            this.chainWaveExtended(BackLeft, speed, -0.05F, -0.05, 0F, f2, 1);
            this.chainWaveExtended(BackRight, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontLeft, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontRight, speed, -0.05F, -0.05, 0F, f2, 1);
            this.bob(Bodyfront, speed, 0.15F, false, f2, 1);
            this.walk(Bodyfront, speed, 0.08F, false, 0F, 0.04F, f2, 1);

            if (f3 == 0.0F) {
                return;
            }
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCastorocauda e = (EntityPrehistoricFloraCastorocauda) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
