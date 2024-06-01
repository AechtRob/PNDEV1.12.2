package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraShunosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelShunosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hip;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer Throatpouch;
    private final AdvancedModelRenderer Throatwattle;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Upperbackteeth;
    private final AdvancedModelRenderer Nosebase;
    private final AdvancedModelRenderer Nosefront;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawtruefront;
    private final AdvancedModelRenderer Lowerjawteeth;
    private final AdvancedModelRenderer Lowerjawslope;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Bodyfrontslope;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer Leftclaw;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer Rightclaw;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tailclub;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer Hipslope;

    private ModelAnimator animator;

    public ModelShunosaurus() {
        this.textureWidth = 200;
        this.textureHeight = 200;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hip = new AdvancedModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -14.1F, 15.0F);
        this.root.addChild(Hip);
        this.setRotateAngle(Hip, -0.1911F, 0.0F, 0.0F);
        this.Hip.cubeList.add(new ModelBox(Hip, 0, 118, -8.0F, -4.0F, -6.0F, 16, 20, 18, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.1F, -4.5F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 157, -10.0F, -4.0F, -18.0F, 20, 25, 18, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -16.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1274F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 84, -8.0F, -4.0F, -14.0F, 16, 19, 14, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.4056F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 69, 139, -4.5F, -4.0F, -11.0F, 9, 14, 11, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1F, -9.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1485F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 116, 158, -4.0F, -3.5F, -9.0F, 8, 11, 9, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2F, -7.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0637F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 28, -3.5F, -3.0F, -8.0F, 7, 9, 8, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1274F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 120, 64, -2.5F, -2.5F, -9.0F, 5, 8, 9, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.0F, -7.8F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2335F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 128, 48, -2.0F, -2.5F, -8.0F, 4, 7, 8, 0.0F, false));

        this.Throatpouch = new AdvancedModelRenderer(this);
        this.Throatpouch.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.neck5.addChild(Throatpouch);
        this.setRotateAngle(Throatpouch, 0.1911F, 0.0F, 0.0F);
        this.Throatpouch.cubeList.add(new ModelBox(Throatpouch, 0, 13, -1.5F, -5.0F, -8.0F, 3, 5, 8, 0.0F, false));

        this.Throatwattle = new AdvancedModelRenderer(this);
        this.Throatwattle.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Throatpouch.addChild(Throatwattle);
        this.setRotateAngle(Throatwattle, 0.1061F, 0.0F, 0.0F);
        this.Throatwattle.cubeList.add(new ModelBox(Throatwattle, 132, 73, 0.0F, -6.0F, -9.0F, 0, 7, 9, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 0.3609F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 101, 13, -2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -0.63F, -5.0F);
        this.head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.2972F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 126, 18, -2.0F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.3821F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 134, 5, -1.5F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, -0.5F, -3.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.1911F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 116, 34, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(0.0F, 2.8F, -4.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.2546F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 109, 34, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Nosebase = new AdvancedModelRenderer(this);
        this.Nosebase.setRotationPoint(0.01F, -2.4F, -5.0F);
        this.head.addChild(Nosebase);
        this.setRotateAngle(Nosebase, 0.1485F, 0.0F, 0.0F);
        this.Nosebase.cubeList.add(new ModelBox(Nosebase, 131, 26, -2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.Nosefront = new AdvancedModelRenderer(this);
        this.Nosefront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Nosebase.addChild(Nosefront);
        this.setRotateAngle(Nosefront, 0.4033F, 0.0F, 0.0F);
        this.Nosefront.cubeList.add(new ModelBox(Nosefront, 129, 33, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 117, 9, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.2972F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 143, 22, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.3396F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 115, 41, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Lowerjawtruefront = new AdvancedModelRenderer(this);
        this.Lowerjawtruefront.setRotationPoint(-0.01F, 0.0F, -3.7F);
        this.Lowerjawfront.addChild(Lowerjawtruefront);
        this.setRotateAngle(Lowerjawtruefront, -0.0087F, 0.0F, 0.0F);
        this.Lowerjawtruefront.cubeList.add(new ModelBox(Lowerjawtruefront, 126, 41, -1.5F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.Lowerjawteeth = new AdvancedModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, -1.7F, -4.3F);
        this.Lowerjawfront.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, -0.0424F, 0.0F, 0.0F);
        this.Lowerjawteeth.cubeList.add(new ModelBox(Lowerjawteeth, 115, 48, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(0.01F, 2.0F, -2.8F);
        this.Lowerjawmiddle.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 115, 0, -2.0F, -1.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(-0.01F, 0.0F, -4.2F);
        this.jaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 139, 13, -2.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.Bodyfrontslope = new AdvancedModelRenderer(this);
        this.Bodyfrontslope.setRotationPoint(0.0F, 15.0F, -14.0F);
        this.chest.addChild(Bodyfrontslope);
        this.setRotateAngle(Bodyfrontslope, -0.4458F, 0.0F, 0.0F);
        this.Bodyfrontslope.cubeList.add(new ModelBox(Bodyfrontslope, 116, 180, -7.0F, -6.0F, 0.0F, 14, 6, 14, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(8.0F, 14.3F, -10.0F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.1061F, 0.0F, 0.0F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 59, 36, -4.0F, -3.0F, -1.5F, 7, 16, 8, 0.0F, false));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(-0.5F, 11.5F, 3.3F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.1061F, 0.0F, 0.0F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 90, 36, -3.0F, 0.0F, -4.0F, 6, 12, 6, 0.0F, false));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(-0.01F, 10.8F, -2.49F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.0424F, 0.0F, 0.0F);
        this.handleft.cubeList.add(new ModelBox(handleft, 90, 0, -3.0F, 0.0F, -1.5F, 6, 6, 6, 0.0F, false));

        this.Leftclaw = new AdvancedModelRenderer(this);
        this.Leftclaw.setRotationPoint(-2.98F, 2.3F, 0.25F);
        this.handleft.addChild(Leftclaw);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);
        this.Leftclaw.cubeList.add(new ModelBox(Leftclaw, 118, 63, 0.0F, -1.0F, -0.5F, 2, 4, 2, 0.0F, true));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-8.0F, 14.3F, -10.0F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.1061F, 0.0F, 0.0F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 59, 36, -3.0F, -3.0F, -1.5F, 7, 16, 8, 0.0F, true));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(0.5F, 11.5F, 3.3F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -0.1061F, 0.0F, 0.0F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 90, 36, -3.0F, 0.0F, -4.0F, 6, 12, 6, 0.0F, true));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(0.01F, 10.8F, -2.49F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.0424F, 0.0F, 0.0F);
        this.handright.cubeList.add(new ModelBox(handright, 90, 0, -3.0F, 0.0F, -1.5F, 6, 6, 6, 0.0F, true));

        this.Rightclaw = new AdvancedModelRenderer(this);
        this.Rightclaw.setRotationPoint(2.98F, 2.3F, 0.25F);
        this.handright.addChild(Rightclaw);
        this.setRotateAngle(Rightclaw, 0.3183F, -0.2122F, -0.5732F);
        this.Rightclaw.cubeList.add(new ModelBox(Rightclaw, 118, 63, -2.0F, -1.0F, -0.5F, 2, 4, 2, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.6F, 11.0F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0637F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 61, 86, -6.0F, -4.5F, -0.5F, 12, 15, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.4F, 7.5F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1698F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 47, 61, -5.0F, -4.0F, -1.0F, 10, 12, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.7F, 10.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 104, 93, -3.5F, -3.0F, 0.0F, 7, 9, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.4F, 10.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1061F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 95, 74, -2.5F, -2.0F, 0.0F, 5, 6, 12, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.6F, 11.05F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0637F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 44, 20, -2.0F, -1.0F, 0.0F, 4, 4, 11, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.1F, 10.5F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0213F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 21, 5, -1.5F, -1.0F, 0.0F, 3, 3, 10, 0.0F, false));

        this.Tailclub = new AdvancedModelRenderer(this);
        this.Tailclub.setRotationPoint(0.0F, 0.2F, 9.5F);
        this.Tail6.addChild(Tailclub);
        this.setRotateAngle(Tailclub, -0.0424F, 0.0F, 0.0F);
        this.Tailclub.cubeList.add(new ModelBox(Tailclub, 110, 24, -2.5F, -1.5F, 0.0F, 5, 4, 5, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(9.0F, 5.42F, 3.5F);
        this.Hip.addChild(upperlegleft);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 77, 168, -5.0F, -3.0F, -5.0F, 8, 21, 11, 0.0F, false));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(-1.0F, 17.3F, -4.0F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.2335F, 0.0F, 0.0F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 118, 114, -3.5F, 0.0F, -0.5F, 7, 14, 7, 0.0F, false));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 13.0F, 2.5F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.0424F, 0.0F, 0.0F);
        this.footleft.cubeList.add(new ModelBox(footleft, 64, 8, -4.0F, -1.0F, -6.0F, 8, 4, 9, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-9.0F, 5.42F, 3.5F);
        this.Hip.addChild(upperlegright);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 77, 168, -3.0F, -3.0F, -5.0F, 8, 21, 11, 0.0F, true));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(1.0F, 17.3F, -4.0F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.2335F, 0.0F, 0.0F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 118, 114, -3.5F, 0.0F, -0.5F, 7, 14, 7, 0.0F, true));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 13.0F, 2.5F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.0424F, 0.0F, 0.0F);
        this.footright.cubeList.add(new ModelBox(footright, 64, 8, -4.0F, -1.0F, -6.0F, 8, 4, 9, 0.0F, true));

        this.Hipslope = new AdvancedModelRenderer(this);
        this.Hipslope.setRotationPoint(0.0F, 21.9F, -6.2F);
        this.Hip.addChild(Hipslope);
        this.setRotateAngle(Hipslope, 0.2546F, 0.0F, 0.0F);
        this.Hipslope.cubeList.add(new ModelBox(Hipslope, 51, 111, -7.0F, -6.0F, 0.0F, 14, 5, 19, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Upperjawfront, -0.3821F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmleft, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatwattle, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatpouch, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Tailclub, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tail6, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, -0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Rightclaw, 0.3183F, -0.2122F, -0.5732F);
        this.setRotateAngle(Nosefront, 0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(Nosebase, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.1463F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.2147F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, 0.0236F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.0613F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.4056F, 0.0F, 0.0F);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegright, 0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawtruefront, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmleft, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(Hip, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2737F, 0.0F, 0.0F);
        this.setRotateAngle(handright, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(handleft, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(footright, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontslope, -0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        this.neck3.offsetY = -0.01F;
        this.neck3.offsetZ = 0.04F;
        this.neck3.render(0.01F);
        resetToDefaultPose();
    }


    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.30F;
        this.root.offsetX = 0.25F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(-1);
        this.root.rotateAngleZ = (float)Math.toRadians(-1);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(upperlegleft, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.3821F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, 0.1497F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmleft, -0.3302F, 0.0F, 0.0F);
        this.setRotateAngle(Throatwattle, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatpouch, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Tailclub, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tail6, -0.0227F, 0.349F, -0.0077F);
        this.setRotateAngle(Tail5, 0.0652F, 0.2177F, 0.0141F);
        this.setRotateAngle(Tail4, 0.1098F, 0.2603F, 0.0284F);
        this.setRotateAngle(Tail3, -0.0216F, 0.1745F, -0.0038F);
        this.setRotateAngle(Tail2, -0.1724F, 0.172F, -0.0298F);
        this.setRotateAngle(Tail1, 0.0647F, 0.1742F, 0.0112F);
        this.setRotateAngle(Rightclaw, 0.3183F, -0.2122F, -0.5732F);
        this.setRotateAngle(Nosefront, 0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(Nosebase, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.2378F, -0.0747F, -0.0628F);
        this.setRotateAngle(neck4, 0.1294F, -0.1731F, -0.0224F);
        this.setRotateAngle(neck3, -0.057F, -0.1768F, -0.033F);
        this.setRotateAngle(neck2, -0.1431F, -0.179F, -0.0178F);
        this.setRotateAngle(neck1, -0.4044F, -0.1775F, 0.0288F);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegright, 0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 0.2772F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawtruefront, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -0.1497F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmleft, 0.1121F, 0.0F, 0.0F);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(Hip, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.4049F, -0.0408F, -0.0154F);
        this.setRotateAngle(handright, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(handleft, 0.2606F, 0.0F, 0.0F);
        this.setRotateAngle(footright, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.3478F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontslope, -0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperlegleft, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.3821F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, 0.1497F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmleft, -0.3302F, 0.0F, 0.0F);
        this.setRotateAngle(Throatwattle, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Throatpouch, 0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Tailclub, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tail6, -0.0227F, 0.349F, -0.0077F);
        this.setRotateAngle(Tail5, 0.0652F, 0.2177F, 0.0141F);
        this.setRotateAngle(Tail4, 0.1098F, 0.2603F, 0.0284F);
        this.setRotateAngle(Tail3, -0.0216F, 0.1745F, -0.0038F);
        this.setRotateAngle(Tail2, -0.1724F, 0.172F, -0.0298F);
        this.setRotateAngle(Tail1, 0.0647F, 0.1742F, 0.0112F);
        this.setRotateAngle(Rightclaw, 0.3183F, -0.2122F, -0.5732F);
        this.setRotateAngle(Nosefront, 0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(Nosebase, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.2378F, -0.0747F, -0.0628F);
        this.setRotateAngle(neck4, 0.1294F, -0.1731F, -0.0224F);
        this.setRotateAngle(neck3, -0.057F, -0.1768F, -0.033F);
        this.setRotateAngle(neck2, -0.1431F, -0.179F, -0.0178F);
        this.setRotateAngle(neck1, -0.4044F, -0.1775F, 0.0288F);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegright, 0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegleft, 0.2772F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawtruefront, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmright, -0.1497F, 0.0F, 0.0F);
        this.setRotateAngle(lowerarmleft, 0.1121F, 0.0F, 0.0F);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(Hip, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.4049F, -0.0408F, -0.0154F);
        this.setRotateAngle(handright, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(handleft, 0.2606F, 0.0F, 0.0F);
        this.setRotateAngle(footright, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, -0.3478F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfrontslope, -0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        this.root.offsetY = -0.155F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraShunosaurus mob = (EntityPrehistoricFloraShunosaurus) e;

        if (mob.getIsSneaking()) {
            this.faceTarget(f3, f4, 1, root);
        }
        this.faceTarget(f3, f4, 14, neck1);
        this.faceTarget(f3, f4, 14, neck2);
        this.faceTarget(f3, f4, 14, neck3);
        this.faceTarget(f3, f4, 14, neck4);
        this.faceTarget(f3, f4, 14, head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        mob.tailBuffer.applyChainSwingBuffer(Tail);

        if (mob.getAnimation() == mob.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!mob.isReallyInWater()) {

                if (f3 == 0.0F || !mob.getIsMoving()) {
                    if (mob.getAnimation() != mob.EAT_ANIMATION
                            && mob.getAnimation() != mob.DRINK_ANIMATION
                            && mob.getAnimation() != mob.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.01F, 0.2F, f2, 0.8F);
                    }

                    if (mob.getAnimation() != mob.ATTACK_ANIMATION
                        && !mob.isSneaking()) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.05F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.025F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (mob.getIsFast()) { //Running
                    if (mob.getIsSneaking()) {

                    }
                    else { //normal run:

                    }

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

        EntityPrehistoricFloraShunosaurus ee = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animSneaking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
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
            else {
                //moving in water
                //
            }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The ambient noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_1) { //The Tail Idle
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_2) { //The Display Idle
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*0.1), Hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5), Hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-115))*1.2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-1.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(9+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-55))*1), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-115))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-2), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+20))*-1), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*1), neck4.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-12), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-2), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360/1-200))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13 + (((tickAnim - 0) / 3) * (-0.38-(-13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.38 + (((tickAnim - 3) / 3) * (7.69-(-0.38)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 7.69 + (((tickAnim - 6) / 4) * (16.24-(7.69)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.24 + (((tickAnim - 10) / 3) * (23.41-(16.24)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 23.41 + (((tickAnim - 13) / 1) * (21-(23.41)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 21 + (((tickAnim - 14) / 3) * (17-(21)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 17) / 1) * (1.14-(17)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.14 + (((tickAnim - 18) / 2) * (-13-(1.14)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (-1.44-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.44 + (((tickAnim - 3) / 3) * (-0.66232-(-1.44)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.17773-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.02121-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.66232 + (((tickAnim - 6) / 4) * (-0.61082-(-0.66232)));
            yy = -0.17773 + (((tickAnim - 6) / 4) * (-0.03201-(-0.17773)));
            zz = 0.02121 + (((tickAnim - 6) / 4) * (-0.08595-(0.02121)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.61082 + (((tickAnim - 10) / 3) * (-12.2-(-0.61082)));
            yy = -0.03201 + (((tickAnim - 10) / 3) * (0-(-0.03201)));
            zz = -0.08595 + (((tickAnim - 10) / 3) * (0-(-0.08595)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -12.2 + (((tickAnim - 13) / 1) * (-24.5-(-12.2)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -24.5 + (((tickAnim - 14) / 3) * (-24-(-24.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 17) / 1) * (-16.29-(-24)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.29 + (((tickAnim - 18) / 2) * (15-(-16.29)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 0) / 3) * (2.17-(-4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.17 + (((tickAnim - 3) / 3) * (-3.78835-(2.17)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.12684-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.01638-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -3.78835 + (((tickAnim - 6) / 4) * (-11.89949-(-3.78835)));
            yy = 0.12684 + (((tickAnim - 6) / 4) * (0.00606-(0.12684)));
            zz = 0.01638 + (((tickAnim - 6) / 4) * (0.05471-(0.01638)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.89949 + (((tickAnim - 10) / 3) * (5.03-(-11.89949)));
            yy = 0.00606 + (((tickAnim - 10) / 3) * (0-(0.00606)));
            zz = 0.05471 + (((tickAnim - 10) / 3) * (0-(0.05471)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 5.03 + (((tickAnim - 13) / 1) * (14-(5.03)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 14 + (((tickAnim - 14) / 3) * (22-(14)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 17) / 1) * (14.86-(22)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.86 + (((tickAnim - 18) / 2) * (-4-(14.86)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-22.5181+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+50))*2), Tail1.rotateAngleY + (float) Math.toRadians(0.4112+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+50))*3), Tail1.rotateAngleZ + (float) Math.toRadians(-0.9965+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+50))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1))*1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-6.9713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-50))*1), Tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*4), Tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-70))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-90))*5), Tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-90))*4), Tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-90))*3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(20.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-50))*10), Tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*2), Tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (9-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 3) / 2) * (18-(9)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 5) / 3) * (19.00006-(18)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.0136-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.00817-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 19.00006 + (((tickAnim - 8) / 1) * (5-(19.00006)));
            yy = 0.0136 + (((tickAnim - 8) / 1) * (0-(0.0136)));
            zz = -0.00817 + (((tickAnim - 8) / 1) * (0-(-0.00817)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 9) / 2) * (-13-(5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -13 + (((tickAnim - 11) / 2) * (-21.36-(-13)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.36 + (((tickAnim - 13) / 1) * (-15-(-21.36)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 14) / 4) * (-11-(-15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 18) / 2) * (-5-(-11)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 18) * (-1.75-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -1.75 + (((tickAnim - 18) / 2) * (-1.25-(-1.75)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (1-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (-6-(1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 5) / 3) * (1.99977-(-6)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.02983-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.04679-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.99977 + (((tickAnim - 8) / 1) * (25-(1.99977)));
            yy = -0.02983 + (((tickAnim - 8) / 1) * (0-(-0.02983)));
            zz = 0.04679 + (((tickAnim - 8) / 1) * (0-(0.04679)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 25 + (((tickAnim - 9) / 2) * (23-(25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 23 + (((tickAnim - 11) / 3) * (-10-(23)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (-13-(-10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13 + (((tickAnim - 18) / 2) * (3-(-13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (-10-(2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (-11-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11 + (((tickAnim - 5) / 3) * (-4.5-(-11)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -4.5 + (((tickAnim - 8) / 1) * (-3-(-4.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -3 + (((tickAnim - 9) / 2) * (8-(-3)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8 + (((tickAnim - 11) / 3) * (3-(8)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 14) / 4) * (24-(3)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 18) / 2) * (2-(24)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1 + (((tickAnim - 0) / 2) * (-14-(-1)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -14 + (((tickAnim - 2) / 3) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.75 + (((tickAnim - 5) / 3) * (-13-(-18.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -13 + (((tickAnim - 8) / 3) * (-7.37998-(-13)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.00532-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.00312-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.37998 + (((tickAnim - 11) / 4) * (-1.99993-(-7.37998)));
            yy = -0.00532 + (((tickAnim - 11) / 4) * (-0.01-(-0.00532)));
            zz = 0.00312 + (((tickAnim - 11) / 4) * (0.00588-(0.00312)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.99993 + (((tickAnim - 15) / 3) * (7-(-1.99993)));
            yy = -0.01 + (((tickAnim - 15) / 3) * (0-(-0.01)));
            zz = 0.00588 + (((tickAnim - 15) / 3) * (0-(0.00588)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 7 + (((tickAnim - 18) / 1) * (8.2-(7)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 8.2 + (((tickAnim - 19) / 1) * (-1-(8.2)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 11) * (-1.5-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -1.5 + (((tickAnim - 11) / 9) * (-0.75-(-1.5)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17 + (((tickAnim - 0) / 2) * (9-(17)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 2) / 3) * (-3.07-(9)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.07 + (((tickAnim - 5) / 3) * (-9-(-3.07)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 8) / 3) * (-0.92006-(-9)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.01569-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.00981-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.92006 + (((tickAnim - 11) / 4) * (4.99958-(-0.92006)));
            yy = 0.01569 + (((tickAnim - 11) / 4) * (0.05629-(0.01569)));
            zz = -0.00981 + (((tickAnim - 11) / 4) * (-0.04085-(-0.00981)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.99958 + (((tickAnim - 15) / 3) * (4.5-(4.99958)));
            yy = 0.05629 + (((tickAnim - 15) / 3) * (0-(0.05629)));
            zz = -0.04085 + (((tickAnim - 15) / 3) * (0-(-0.04085)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 4.5 + (((tickAnim - 18) / 1) * (7-(4.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 19) / 1) * (17-(7)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 13.5 + (((tickAnim - 2) / 3) * (13.93-(13.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 13.93 + (((tickAnim - 5) / 1) * (8.53-(13.93)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.53 + (((tickAnim - 6) / 2) * (20-(8.53)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 8) / 3) * (7.85004-(20)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.00863-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.00882-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.85004 + (((tickAnim - 11) / 4) * (-2.99956-(7.85004)));
            yy = -0.00863 + (((tickAnim - 11) / 4) * (-0.04482-(-0.00863)));
            zz = 0.00882 + (((tickAnim - 11) / 4) * (0.06762-(0.00882)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.99956 + (((tickAnim - 15) / 3) * (-9.44-(-2.99956)));
            yy = -0.04482 + (((tickAnim - 15) / 3) * (0-(-0.04482)));
            zz = 0.06762 + (((tickAnim - 15) / 3) * (0-(0.06762)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -9.44 + (((tickAnim - 18) / 1) * (-6.98-(-9.44)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -6.98 + (((tickAnim - 19) / 1) * (-5-(-6.98)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17 + (((tickAnim - 0) / 4) * (25-(17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 4) / 2) * (32-(25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32 + (((tickAnim - 6) / 2) * (21-(32)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 8) / 2) * (-4-(21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4 + (((tickAnim - 10) / 2) * (-7-(-4)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -7 + (((tickAnim - 12) / 5) * (6-(-7)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 17) / 3) * (17-(6)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 17) * (-1.25-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -1.25 + (((tickAnim - 17) / 3) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(xx);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(yy);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.00137 + (((tickAnim - 0) / 4) * (-12.50389-(-4.00137)));
            yy = 0.07119 + (((tickAnim - 0) / 4) * (-0.1703-(0.07119)));
            zz = 0.1562 + (((tickAnim - 0) / 4) * (0.1901-(0.1562)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.50389 + (((tickAnim - 4) / 2) * (-29.5-(-12.50389)));
            yy = -0.1703 + (((tickAnim - 4) / 2) * (0-(-0.1703)));
            zz = 0.1901 + (((tickAnim - 4) / 2) * (0-(0.1901)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.5 + (((tickAnim - 6) / 2) * (-33-(-29.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33 + (((tickAnim - 8) / 2) * (-8-(-33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8 + (((tickAnim - 10) / 2) * (9-(-8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 9 + (((tickAnim - 12) / 5) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 12) / 5) * (0.1968-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-0.00956-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2.49756 + (((tickAnim - 17) / 3) * (-4.00137-(2.49756)));
            yy = 0.1968 + (((tickAnim - 17) / 3) * (0.07119-(0.1968)));
            zz = -0.00956 + (((tickAnim - 17) / 3) * (0.1562-(-0.00956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -9.99865 + (((tickAnim - 0) / 4) * (-9-(-9.99865)));
            yy = -0.02017 + (((tickAnim - 0) / 4) * (0-(-0.02017)));
            zz = -0.1532 + (((tickAnim - 0) / 4) * (0-(-0.1532)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -9 + (((tickAnim - 4) / 2) * (9-(-9)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 6) / 2) * (14-(9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14 + (((tickAnim - 8) / 2) * (11-(14)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11 + (((tickAnim - 10) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (-0.0973-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-0.01579-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 17) / 3) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = -0.0973 + (((tickAnim - 17) / 3) * (-0.02017-(-0.0973)));
            zz = -0.01579 + (((tickAnim - 17) / 3) * (-0.1532-(-0.01579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*-0.3), Hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+100))*1.5), Hip.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5))));
        this.Hip.rotationPointX = this.Hip.rotationPointX + (float)(0);
        this.Hip.rotationPointY = this.Hip.rotationPointY - (float)(-1.5);
        this.Hip.rotationPointZ = this.Hip.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*-0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*1), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*-2.8)));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*1.2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+180))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+180))*-1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*0.8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+180))*-1.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+100))*0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+180))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+120))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5+120))*-0.3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3 + (((tickAnim - 0) / 8) * (15.5-(3)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 15.5 + (((tickAnim - 8) / 4) * (-0.44-(15.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.44 + (((tickAnim - 12) / 3) * (-9.25-(-0.44)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 15) / 15) * (3-(-9.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.505-(0)));
            zz = 1 + (((tickAnim - 0) / 7) * (0.27-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.505 + (((tickAnim - 7) / 1) * (0.02-(-0.505)));
            zz = 0.27 + (((tickAnim - 7) / 1) * (0.16-(0.27)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.02 + (((tickAnim - 8) / 4) * (1.415-(0.02)));
            zz = 0.16 + (((tickAnim - 8) / 4) * (0.55-(0.16)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.415 + (((tickAnim - 12) / 3) * (-0.325-(1.415)));
            zz = 0.55 + (((tickAnim - 12) / 3) * (0.94-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 15) / 15) * (0-(-0.325)));
            zz = 0.94 + (((tickAnim - 15) / 15) * (1-(0.94)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(xx);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(yy);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 0) / 8) * (-15.9-(-16)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -15.9 + (((tickAnim - 8) / 4) * (-28.81-(-15.9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -28.81 + (((tickAnim - 12) / 3) * (-13-(-28.81)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 15) / 15) * (-16-(-13)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (0.31-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.31 + (((tickAnim - 5) / 3) * (0.21-(0.31)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.21 + (((tickAnim - 8) / 4) * (-0.17-(0.21)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.27-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.17 + (((tickAnim - 12) / 3) * (-0.85-(-0.17)));
            zz = -0.27 + (((tickAnim - 12) / 3) * (-0.275-(-0.27)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.85 + (((tickAnim - 15) / 15) * (-0.125-(-0.85)));
            zz = -0.275 + (((tickAnim - 15) / 15) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmleft.rotationPointX = this.lowerarmleft.rotationPointX + (float)(xx);
        this.lowerarmleft.rotationPointY = this.lowerarmleft.rotationPointY - (float)(yy);
        this.lowerarmleft.rotationPointZ = this.lowerarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.75 + (((tickAnim - 0) / 5) * (3.5-(13.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 5) / 2) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 3.5 + (((tickAnim - 7) / 2) * (38.07-(3.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 38.07 + (((tickAnim - 9) / 3) * (39.63866-(38.07)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.05396-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0.04465-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 39.63866 + (((tickAnim - 12) / 1) * (22.27921-(39.63866)));
            yy = -0.05396 + (((tickAnim - 12) / 1) * (-0.09892-(-0.05396)));
            zz = 0.04465 + (((tickAnim - 12) / 1) * (0.08185-(0.04465)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.27921 + (((tickAnim - 13) / 2) * (21.56-(22.27921)));
            yy = -0.09892 + (((tickAnim - 13) / 2) * (0-(-0.09892)));
            zz = 0.08185 + (((tickAnim - 13) / 2) * (0-(0.08185)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 21.56 + (((tickAnim - 15) / 15) * (13.75-(21.56)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 5) * (-0.395-(0.025)));
            zz = -0.025 + (((tickAnim - 0) / 5) * (0.04-(-0.025)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.395 + (((tickAnim - 5) / 2) * (-0.395-(-0.395)));
            zz = 0.04 + (((tickAnim - 5) / 2) * (0.015-(0.04)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.395 + (((tickAnim - 7) / 2) * (1.07-(-0.395)));
            zz = 0.015 + (((tickAnim - 7) / 2) * (-0.715-(0.015)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.07 + (((tickAnim - 9) / 3) * (1.09-(1.07)));
            zz = -0.715 + (((tickAnim - 9) / 3) * (-0.74-(-0.715)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.09 + (((tickAnim - 12) / 1) * (0.405-(1.09)));
            zz = -0.74 + (((tickAnim - 12) / 1) * (-0.26-(-0.74)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.405 + (((tickAnim - 13) / 2) * (0.37-(0.405)));
            zz = -0.26 + (((tickAnim - 13) / 2) * (-0.26-(-0.26)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.37 + (((tickAnim - 15) / 15) * (0.025-(0.37)));
            zz = -0.26 + (((tickAnim - 15) / 15) * (-0.025-(-0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -9.25 + (((tickAnim - 0) / 22) * (15.5-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 15.5 + (((tickAnim - 22) / 4) * (-0.44-(15.5)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.44 + (((tickAnim - 26) / 4) * (-9.25-(-0.44)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 9) * (-0.155-(-0.45)));
            zz = 0.94 + (((tickAnim - 0) / 9) * (0.64-(0.94)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = -0.155 + (((tickAnim - 9) / 13) * (0.02-(-0.155)));
            zz = 0.64 + (((tickAnim - 9) / 13) * (0.16-(0.64)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.02 + (((tickAnim - 22) / 4) * (1.415-(0.02)));
            zz = 0.16 + (((tickAnim - 22) / 4) * (0.55-(0.16)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1.415 + (((tickAnim - 26) / 4) * (-0.45-(1.415)));
            zz = 0.55 + (((tickAnim - 26) / 4) * (0.94-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(xx);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(yy);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -13.5 + (((tickAnim - 0) / 22) * (-15.9-(-13.5)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -15.9 + (((tickAnim - 22) / 4) * (-36.06-(-15.9)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -36.06 + (((tickAnim - 26) / 4) * (-13.5-(-36.06)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 8) * (0.17-(-0.775)));
            zz = -0.275 + (((tickAnim - 0) / 8) * (-0.14-(-0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.17 + (((tickAnim - 8) / 14) * (0.21-(0.17)));
            zz = -0.14 + (((tickAnim - 8) / 14) * (0-(-0.14)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.21 + (((tickAnim - 22) / 4) * (0.955-(0.21)));
            zz = 0 + (((tickAnim - 22) / 4) * (-0.27-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.955 + (((tickAnim - 26) / 4) * (-0.775-(0.955)));
            zz = -0.27 + (((tickAnim - 26) / 4) * (-0.275-(-0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmright.rotationPointX = this.lowerarmright.rotationPointX + (float)(xx);
        this.lowerarmright.rotationPointY = this.lowerarmright.rotationPointY - (float)(yy);
        this.lowerarmright.rotationPointZ = this.lowerarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 21.81 + (((tickAnim - 0) / 22) * (1.5-(21.81)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 1.5 + (((tickAnim - 22) / 2) * (34.83533-(1.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.0332-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0.02747-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 34.83533 + (((tickAnim - 24) / 2) * (34.13866-(34.83533)));
            yy = -0.0332 + (((tickAnim - 24) / 2) * (-0.05396-(-0.0332)));
            zz = 0.02747 + (((tickAnim - 24) / 2) * (0.04465-(0.02747)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 34.13866 + (((tickAnim - 26) / 2) * (21.77921-(34.13866)));
            yy = -0.05396 + (((tickAnim - 26) / 2) * (-0.09892-(-0.05396)));
            zz = 0.04465 + (((tickAnim - 26) / 2) * (0.08185-(0.04465)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 21.77921 + (((tickAnim - 28) / 2) * (21.81-(21.77921)));
            yy = -0.09892 + (((tickAnim - 28) / 2) * (0-(-0.09892)));
            zz = 0.08185 + (((tickAnim - 28) / 2) * (0-(0.08185)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.52 + (((tickAnim - 0) / 8) * (0.045-(0.52)));
            zz = -0.335 + (((tickAnim - 0) / 8) * (-0.23-(-0.335)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.045 + (((tickAnim - 8) / 7) * (-0.035-(0.045)));
            zz = -0.23 + (((tickAnim - 8) / 7) * (0.005-(-0.23)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.035 + (((tickAnim - 15) / 7) * (-0.395-(-0.035)));
            zz = 0.005 + (((tickAnim - 15) / 7) * (-0.06-(0.005)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.395 + (((tickAnim - 22) / 2) * (0.77-(-0.395)));
            zz = -0.06 + (((tickAnim - 22) / 2) * (-0.615-(-0.06)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.77 + (((tickAnim - 24) / 2) * (0.765-(0.77)));
            zz = -0.615 + (((tickAnim - 24) / 2) * (-0.64-(-0.615)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.765 + (((tickAnim - 26) / 2) * (0.355-(0.765)));
            zz = -0.64 + (((tickAnim - 26) / 2) * (-0.31-(-0.64)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 28) / 2) * (0.52-(0.355)));
            zz = -0.31 + (((tickAnim - 28) / 2) * (-0.335-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handright.rotationPointX = this.handright.rotationPointX + (float)(xx);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(yy);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*1), Tail1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*0.8)));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*-1), Tail2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*0.8)));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*-1), Tail3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*0.5)));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*-0.5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*1.5), Tail4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*0.5)));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*-3), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*-3), Tail5.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*1)));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+150))*-6), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*-5), Tail6.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*1)));


        this.setRotateAngle(Tailclub, Tailclub.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/0.75+50))*-8), Tailclub.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-100))*-5.5), Tailclub.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.75/1.5)*195/1.5-180)*1)));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.5 + (((tickAnim - 0) / 3) * (-7.5-(8.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 3) / 5) * (-14.5-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -14.5 + (((tickAnim - 8) / 22) * (8.5-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 3) / 5) * (-0.5-(1.525)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 22) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.25 + (((tickAnim - 0) / 3) * (21.25-(17.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 21.25 + (((tickAnim - 3) / 5) * (13.5-(21.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 8) / 22) * (17.25-(13.5)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegleft.rotationPointX = this.lowerlegleft.rotationPointX + (float)(xx);
        this.lowerlegleft.rotationPointY = this.lowerlegleft.rotationPointY - (float)(yy);
        this.lowerlegleft.rotationPointZ = this.lowerlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.75 + (((tickAnim - 0) / 3) * (0.75-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.75 + (((tickAnim - 3) / 4) * (-9.25-(0.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.25 + (((tickAnim - 7) / 1) * (2.25-(-9.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 8) / 22) * (-23.75-(2.25)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 3) * (1.775-(-0.475)));
            zz = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.775 + (((tickAnim - 3) / 4) * (0.405-(1.775)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.02-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.405 + (((tickAnim - 7) / 1) * (0.185-(0.405)));
            zz = 0.02 + (((tickAnim - 7) / 1) * (0.22-(0.02)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0.185 + (((tickAnim - 8) / 22) * (-0.475-(0.185)));
            zz = 0.22 + (((tickAnim - 8) / 22) * (0.225-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -10.25 + (((tickAnim - 0) / 13) * (8.5-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.5 + (((tickAnim - 13) / 5) * (-4.56-(8.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.56 + (((tickAnim - 18) / 5) * (-16.5-(-4.56)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -16.5 + (((tickAnim - 23) / 7) * (-10.25-(-16.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.9-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.9 + (((tickAnim - 18) / 5) * (-0.375-(1.9)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.375 + (((tickAnim - 23) / 7) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 0) / 13) * (16-(18.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16 + (((tickAnim - 13) / 5) * (21.25-(16)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 21.25 + (((tickAnim - 18) / 5) * (13.5-(21.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 23) / 7) * (18.25-(13.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 8) * (-0.87-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.87 + (((tickAnim - 8) / 5) * (-0.925-(-0.87)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.925 + (((tickAnim - 13) / 5) * (-0.225-(-0.925)));
            zz = -0.25 + (((tickAnim - 13) / 5) * (-0.245-(-0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 5) * (-0.775-(-0.225)));
            zz = -0.245 + (((tickAnim - 18) / 5) * (0-(-0.245)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.775 + (((tickAnim - 23) / 7) * (-0.5-(-0.775)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 0) / 8) * (-16.5-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 8) / 5) * (-23.75-(-16.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -23.75 + (((tickAnim - 13) / 5) * (5.25-(-23.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.25 + (((tickAnim - 18) / 3) * (-10.62-(5.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10.62 + (((tickAnim - 21) / 2) * (3-(-10.62)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 23) / 7) * (-7.75-(3)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 8) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.475-(0)));
            zz = 0.225 + (((tickAnim - 8) / 5) * (0.225-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 5) * (1.2-(-0.475)));
            zz = 0.225 + (((tickAnim - 13) / 5) * (0.12-(0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.2 + (((tickAnim - 18) / 3) * (0.01-(1.2)));
            zz = 0.12 + (((tickAnim - 18) / 3) * (0.1-(0.12)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 21) / 2) * (-0.975-(0.01)));
            zz = 0.1 + (((tickAnim - 21) / 2) * (0-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.975 + (((tickAnim - 23) / 7) * (-0.875-(-0.975)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);

    }

    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(0), Hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*135/0.75-55))*1), Hip.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*135/0.75-55))*1), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*135/0.75+50))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*135/0.75-120))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(9.25), neck1.rotateAngleY + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180-150))*3), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(9.84047), neck2.rotateAngleY + (float) Math.toRadians(-8.8889+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180-150))*-3), neck2.rotateAngleZ + (float) Math.toRadians(4.5969));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(6.0891), neck3.rotateAngleY + (float) Math.toRadians(-22.1668+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180-150))*3), neck3.rotateAngleZ + (float) Math.toRadians(2.23879));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-1.26425), neck4.rotateAngleY + (float) Math.toRadians(-16.0807+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180-120))*3.5), neck4.rotateAngleZ + (float) Math.toRadians(-4.4026+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180+50))*1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-2.10374), neck5.rotateAngleY + (float) Math.toRadians(-9.77198), neck5.rotateAngleZ + (float) Math.toRadians(0.53493));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-12.25), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.5);


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.0/1.50)*180-150))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 10.5 + (((tickAnim - 0) / 4) * (12-(10.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (-0.04148-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0.08452-(0)));
            zz = 12 + (((tickAnim - 4) / 12) * (-0.00047-(12)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -0.04148 + (((tickAnim - 16) / 14) * (0-(-0.04148)));
            yy = 0.08452 + (((tickAnim - 16) / 14) * (0-(0.08452)));
            zz = -0.00047 + (((tickAnim - 16) / 14) * (10.5-(-0.00047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (2.02-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 2.02 + (((tickAnim - 9) / 7) * (-1-(2.02)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = -1 + (((tickAnim - 16) / 14) * (0-(-1)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(xx);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(yy);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -3.75 + (((tickAnim - 4) / 5) * (-12.83466-(-3.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (6.99551-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-0.34286-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -12.83466 + (((tickAnim - 9) / 7) * (0-(-12.83466)));
            yy = 6.99551 + (((tickAnim - 9) / 7) * (0-(6.99551)));
            zz = -0.34286 + (((tickAnim - 9) / 7) * (-0.5-(-0.34286)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = -0.5 + (((tickAnim - 16) / 14) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmleft.rotationPointX = this.lowerarmleft.rotationPointX + (float)(xx);
        this.lowerarmleft.rotationPointY = this.lowerarmleft.rotationPointY - (float)(yy);
        this.lowerarmleft.rotationPointZ = this.lowerarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -12.75 + (((tickAnim - 0) / 4) * (-12.75-(-12.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.25 + (((tickAnim - 4) / 5) * (18.9809-(3.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (-3.7803-(0)));
            zz = -12.75 + (((tickAnim - 4) / 5) * (1.38141-(-12.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 18.9809 + (((tickAnim - 9) / 5) * (-3.31357-(18.9809)));
            yy = -3.7803 + (((tickAnim - 9) / 5) * (-6.86102-(-3.7803)));
            zz = 1.38141 + (((tickAnim - 9) / 5) * (-4.49519-(1.38141)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -3.31357 + (((tickAnim - 14) / 2) * (0-(-3.31357)));
            yy = -6.86102 + (((tickAnim - 14) / 2) * (0-(-6.86102)));
            zz = -4.49519 + (((tickAnim - 14) / 2) * (0-(-4.49519)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (-12.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -20.50132 + (((tickAnim - 0) / 17) * (-0.13309-(-20.50132)));
            yy = 3.85955 + (((tickAnim - 0) / 17) * (-0.14546-(3.85955)));
            zz = -6.19152 + (((tickAnim - 0) / 17) * (-5.99873-(-6.19152)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -0.13309 + (((tickAnim - 17) / 13) * (-20.50132-(-0.13309)));
            yy = -0.14546 + (((tickAnim - 17) / 13) * (3.85955-(-0.14546)));
            zz = -5.99873 + (((tickAnim - 17) / 13) * (-6.19152-(-5.99873)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = -1.675 + (((tickAnim - 17) / 7) * (1.18-(-1.675)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 1.18 + (((tickAnim - 24) / 6) * (-1.675-(1.18)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(xx);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(yy);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 11.25 + (((tickAnim - 0) / 17) * (0-(11.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (-1.29978-(0)));
            yy = 0 + (((tickAnim - 17) / 7) * (-7.23939-(0)));
            zz = 1 + (((tickAnim - 17) / 7) * (-2.64745-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -1.29978 + (((tickAnim - 24) / 6) * (11.25-(-1.29978)));
            yy = -7.23939 + (((tickAnim - 24) / 6) * (0-(-7.23939)));
            zz = -2.64745 + (((tickAnim - 24) / 6) * (0-(-2.64745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -0.195 + (((tickAnim - 0) / 17) * (0.375-(-0.195)));
            yy = 0.73 + (((tickAnim - 0) / 17) * (0.725-(0.73)));
            zz = -0.32 + (((tickAnim - 0) / 17) * (-0.325-(-0.32)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0.375 + (((tickAnim - 17) / 7) * (-0.195-(0.375)));
            yy = 0.725 + (((tickAnim - 17) / 7) * (0.73-(0.725)));
            zz = -0.325 + (((tickAnim - 17) / 7) * (-0.32-(-0.325)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.195 + (((tickAnim - 24) / 6) * (-0.195-(-0.195)));
            yy = 0.73 + (((tickAnim - 24) / 6) * (0.73-(0.73)));
            zz = -0.32 + (((tickAnim - 24) / 6) * (-0.32-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmright.rotationPointX = this.lowerarmright.rotationPointX + (float)(xx);
        this.lowerarmright.rotationPointY = this.lowerarmright.rotationPointY - (float)(yy);
        this.lowerarmright.rotationPointZ = this.lowerarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 12.72741 + (((tickAnim - 0) / 17) * (0-(12.72741)));
            yy = -3.72251 + (((tickAnim - 0) / 17) * (0-(-3.72251)));
            zz = 5.17051 + (((tickAnim - 0) / 17) * (0-(5.17051)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (39.886-(0)));
            yy = 0 + (((tickAnim - 17) / 7) * (4.187-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (2.2465-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 39.886 + (((tickAnim - 24) / 6) * (12.72741-(39.886)));
            yy = 4.187 + (((tickAnim - 24) / 6) * (-3.72251-(4.187)));
            zz = 2.2465 + (((tickAnim - 24) / 6) * (5.17051-(2.2465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1 + (((tickAnim - 0) / 12) * (2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3 + (((tickAnim - 0) / 12) * (3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1 + (((tickAnim - 0) / 12) * (0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1 + (((tickAnim - 12) / 18) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1-(2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1)));
            yy = 3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3 + (((tickAnim - 12) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3-(3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+150))*-3)));
            zz = 0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1 + (((tickAnim - 12) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1-(0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1 + (((tickAnim - 0) / 18) * (-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5 + (((tickAnim - 0) / 18) * (4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3 + (((tickAnim - 0) / 18) * (-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1-(-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-1)));
            yy = 4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5-(4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*2.5)));
            zz = -0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3-(-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75-170))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.09895-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5 + (((tickAnim - 0) / 14) * (5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3 + (((tickAnim - 0) / 14) * (-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -0.09895 + (((tickAnim - 14) / 16) * (0-(-0.09895)));
            yy = 5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5 + (((tickAnim - 14) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5-(5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*2.5)));
            zz = -1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3 + (((tickAnim - 14) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3-(-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+190))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 0) / 18) * (6.48796-(3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5 + (((tickAnim - 0) / 18) * (3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5 + (((tickAnim - 0) / 18) * (-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 6.48796 + (((tickAnim - 18) / 12) * (3-(6.48796)));
            yy = 3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5-(3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*3.5)));
            zz = -0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5 + (((tickAnim - 18) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5-(-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+200))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 4 + (((tickAnim - 0) / 16) * (8.52947-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3 + (((tickAnim - 0) / 16) * (7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5 + (((tickAnim - 0) / 16) * (0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 8.52947 + (((tickAnim - 16) / 14) * (4-(8.52947)));
            yy = 7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3 + (((tickAnim - 16) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3-(7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*3)));
            zz = 0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5 + (((tickAnim - 16) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5-(0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+220))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 12.5 + (((tickAnim - 0) / 17) * (13.5957-(12.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1 + (((tickAnim - 0) / 17) * (4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1 + (((tickAnim - 0) / 17) * (-1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 13.5957 + (((tickAnim - 17) / 13) * (12.5-(13.5957)));
            yy = 4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1 + (((tickAnim - 17) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1-(4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*1)));
            zz = -1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1 + (((tickAnim - 17) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1-(-1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*(2.0/1.50)*135/0.75+250))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.23341 + (((tickAnim - 0) / 6) * (-9.61051-(8.23341)));
            yy = 0.67714 + (((tickAnim - 0) / 6) * (-5.39444-(0.67714)));
            zz = 1.65386 + (((tickAnim - 0) / 6) * (0.00362-(1.65386)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -9.61051 + (((tickAnim - 6) / 6) * (0.58702-(-9.61051)));
            yy = -5.39444 + (((tickAnim - 6) / 6) * (-2.54087-(-5.39444)));
            zz = 0.00362 + (((tickAnim - 6) / 6) * (-2.18328-(0.00362)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0.58702 + (((tickAnim - 12) / 18) * (8.23341-(0.58702)));
            yy = -2.54087 + (((tickAnim - 12) / 18) * (0.67714-(-2.54087)));
            zz = -2.18328 + (((tickAnim - 12) / 18) * (1.65386-(-2.18328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.375-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 2.375 + (((tickAnim - 6) / 6) * (0-(2.375)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -16 + (((tickAnim - 0) / 6) * (6-(-16)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 6 + (((tickAnim - 6) / 6) * (-10.35803-(6)));
            yy = 0 + (((tickAnim - 6) / 6) * (-2.7878-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (1.46324-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -10.35803 + (((tickAnim - 12) / 18) * (-16-(-10.35803)));
            yy = -2.7878 + (((tickAnim - 12) / 18) * (0-(-2.7878)));
            zz = 1.46324 + (((tickAnim - 12) / 18) * (0-(1.46324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.71801 + (((tickAnim - 0) / 2) * (5.29815-(13.71801)));
            yy = 2.1352 + (((tickAnim - 0) / 2) * (2.43762-(2.1352)));
            zz = 4.37576 + (((tickAnim - 0) / 2) * (-5.09426-(4.37576)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 5.29815 + (((tickAnim - 2) / 4) * (19.5-(5.29815)));
            yy = 2.43762 + (((tickAnim - 2) / 4) * (0-(2.43762)));
            zz = -5.09426 + (((tickAnim - 2) / 4) * (0-(-5.09426)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 19.5 + (((tickAnim - 6) / 6) * (10-(19.5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 12) / 18) * (13.71801-(10)));
            yy = 0 + (((tickAnim - 12) / 18) * (2.1352-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (4.37576-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 12) * (0-(0.15)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0.15-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 7.49882 + (((tickAnim - 0) / 12) * (0-(7.49882)));
            yy = 0.10894 + (((tickAnim - 0) / 12) * (0-(0.10894)));
            zz = -1.24524 + (((tickAnim - 0) / 12) * (0.75-(-1.24524)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (3.49009-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (-2.27627-(0)));
            zz = 0.75 + (((tickAnim - 12) / 7) * (3.13319-(0.75)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 3.49009 + (((tickAnim - 19) / 7) * (7.47594-(3.49009)));
            yy = -2.27627 + (((tickAnim - 19) / 7) * (-0.31594-(-2.27627)));
            zz = 3.13319 + (((tickAnim - 19) / 7) * (4.48926-(3.13319)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 7.47594 + (((tickAnim - 26) / 4) * (7.49882-(7.47594)));
            yy = -0.31594 + (((tickAnim - 26) / 4) * (0.10894-(-0.31594)));
            zz = 4.48926 + (((tickAnim - 26) / 4) * (-1.24524-(4.48926)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0.675-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (3.75-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0.675 + (((tickAnim - 19) / 7) * (0-(0.675)));
            yy = 3.75 + (((tickAnim - 19) / 7) * (0-(3.75)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -9.25 + (((tickAnim - 0) / 12) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (14.16667-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = -1.25 + (((tickAnim - 12) / 7) * (-3.08333-(-1.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 14.16667 + (((tickAnim - 19) / 7) * (-8.78944-(14.16667)));
            yy = 0 + (((tickAnim - 19) / 7) * (0.60369-(0)));
            zz = -3.08333 + (((tickAnim - 19) / 7) * (-1.2258-(-3.08333)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -8.78944 + (((tickAnim - 26) / 4) * (-9.25-(-8.78944)));
            yy = 0.60369 + (((tickAnim - 26) / 4) * (0-(0.60369)));
            zz = -1.2258 + (((tickAnim - 26) / 4) * (0-(-1.2258)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.25 + (((tickAnim - 0) / 12) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0.25 + (((tickAnim - 12) / 14) * (0.25-(0.25)));
            yy = -0.65 + (((tickAnim - 12) / 14) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.25 + (((tickAnim - 26) / 4) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (22.25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 22.25 + (((tickAnim - 19) / 7) * (0-(22.25)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.52941-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 10) / 18) * (0-(10)));
            yy = 3.52941 + (((tickAnim - 10) / 18) * (10-(3.52941)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            yy = 10 + (((tickAnim - 28) / 7) * (10-(10)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 2.5 + (((tickAnim - 35) / 6) * (0.62579-(2.5)));
            yy = 10 + (((tickAnim - 35) / 6) * (8.10607-(10)));
            zz = 0 + (((tickAnim - 35) / 6) * (-4.68605-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0.62579 + (((tickAnim - 41) / 8) * (0-(0.62579)));
            yy = 8.10607 + (((tickAnim - 41) / 8) * (10-(8.10607)));
            zz = -4.68605 + (((tickAnim - 41) / 8) * (0-(-4.68605)));
        }
        else if (tickAnim >= 49 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 49) / 42) * (-0.37329-(0)));
            yy = 10 + (((tickAnim - 49) / 42) * (-8.17558-(10)));
            zz = 0 + (((tickAnim - 49) / 42) * (-3.016-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 106) {
            xx = -0.37329 + (((tickAnim - 91) / 15) * (-0.37329-(-0.37329)));
            yy = -8.17558 + (((tickAnim - 91) / 15) * (-8.17558-(-8.17558)));
            zz = -3.016 + (((tickAnim - 91) / 15) * (-3.016-(-3.016)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = -0.37329 + (((tickAnim - 106) / 7) * (-0.30145-(-0.37329)));
            yy = -8.17558 + (((tickAnim - 106) / 7) * (-6.75224-(-8.17558)));
            zz = -3.016 + (((tickAnim - 106) / 7) * (-0.6438-(-3.016)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -0.30145 + (((tickAnim - 113) / 7) * (0-(-0.30145)));
            yy = -6.75224 + (((tickAnim - 113) / 7) * (0-(-6.75224)));
            zz = -0.6438 + (((tickAnim - 113) / 7) * (0-(-0.6438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (2.06102-(0)));
            yy = -0.15 + (((tickAnim - 6) / 12) * (4.77248-(-0.15)));
            zz = 0 + (((tickAnim - 6) / 12) * (-4.98979-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 2.06102 + (((tickAnim - 18) / 10) * (0-(2.06102)));
            yy = 4.77248 + (((tickAnim - 18) / 10) * (0-(4.77248)));
            zz = -4.98979 + (((tickAnim - 18) / 10) * (0-(-4.98979)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (-0.31716-(0)));
            yy = 0 + (((tickAnim - 28) / 8) * (7.12314-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (-2.4917-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 49) {
            xx = -0.31716 + (((tickAnim - 36) / 13) * (0-(-0.31716)));
            yy = 7.12314 + (((tickAnim - 36) / 13) * (0-(7.12314)));
            zz = -2.4917 + (((tickAnim - 36) / 13) * (0-(-2.4917)));
        }
        else if (tickAnim >= 49 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 49) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 14) * (4.19-(0)));
            zz = 0 + (((tickAnim - 49) / 14) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (7.5-(0)));
            yy = 4.19 + (((tickAnim - 63) / 10) * (3.31739-(4.19)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 91) {
            xx = 7.5 + (((tickAnim - 73) / 18) * (0-(7.5)));
            yy = 3.31739 + (((tickAnim - 73) / 18) * (-2.5-(3.31739)));
            zz = 0 + (((tickAnim - 73) / 18) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 91) / 15) * (0-(0)));
            yy = -2.5 + (((tickAnim - 91) / 15) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 91) / 15) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 106) / 7) * (5-(0)));
            yy = -2.5 + (((tickAnim - 106) / 7) * (-3.86-(-2.5)));
            zz = 0 + (((tickAnim - 106) / 7) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 5 + (((tickAnim - 113) / 7) * (0-(5)));
            yy = -3.86 + (((tickAnim - 113) / 7) * (0-(-3.86)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-4.41-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            yy = -4.41 + (((tickAnim - 11) / 17) * (2.5-(-4.41)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 28) / 21) * (0-(0)));
            yy = 2.5 + (((tickAnim - 28) / 21) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 28) / 21) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            yy = 2.5 + (((tickAnim - 49) / 21) * (3.75-(2.5)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (5-(0)));
            yy = 3.75 + (((tickAnim - 70) / 10) * (-0.36765-(3.75)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 5 + (((tickAnim - 80) / 11) * (0-(5)));
            yy = -0.36765 + (((tickAnim - 80) / 11) * (-5-(-0.36765)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 91) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 91) / 15) * (-5-(-5)));
            zz = 0 + (((tickAnim - 91) / 15) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 106) / 7) * (2.5-(0)));
            yy = -5 + (((tickAnim - 106) / 7) * (-5.23-(-5)));
            zz = 0 + (((tickAnim - 106) / 7) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 113) / 7) * (0-(2.5)));
            yy = -5.23 + (((tickAnim - 113) / 7) * (0-(-5.23)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.21-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = -2.21 + (((tickAnim - 15) / 13) * (2.5-(-2.21)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-7.5-(0)));
            yy = 2.5 + (((tickAnim - 28) / 12) * (6.91176-(2.5)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -7.5 + (((tickAnim - 40) / 9) * (0-(-7.5)));
            yy = 6.91176 + (((tickAnim - 40) / 9) * (2.5-(6.91176)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            yy = 2.5 + (((tickAnim - 49) / 26) * (5.96-(2.5)));
            zz = 0 + (((tickAnim - 49) / 26) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 75) / 6) * (-7.5-(0)));
            yy = 5.96 + (((tickAnim - 75) / 6) * (4.12615-(5.96)));
            zz = 0 + (((tickAnim - 75) / 6) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = -7.5 + (((tickAnim - 81) / 10) * (0-(-7.5)));
            yy = 4.12615 + (((tickAnim - 81) / 10) * (0-(4.12615)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 91) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 15) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 106) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 7) * (-5-(0)));
            zz = 0 + (((tickAnim - 106) / 7) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = -5 + (((tickAnim - 113) / 7) * (0-(-5)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.01229-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.4321-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (6.03878-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.01229 + (((tickAnim - 18) / 3) * (0.08607-(0.01229)));
            yy = -2.4321 + (((tickAnim - 18) / 3) * (0.70628-(-2.4321)));
            zz = 6.03878 + (((tickAnim - 18) / 3) * (-1.53378-(6.03878)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.08607 + (((tickAnim - 21) / 7) * (0-(0.08607)));
            yy = 0.70628 + (((tickAnim - 21) / 7) * (0-(0.70628)));
            zz = -1.53378 + (((tickAnim - 21) / 7) * (12.5-(-1.53378)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 12.5 + (((tickAnim - 28) / 12) * (0-(12.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (12.5-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 49) / 19) * (-12.48676-(0)));
            yy = 0 + (((tickAnim - 49) / 19) * (1.8455-(0)));
            zz = 12.5 + (((tickAnim - 49) / 19) * (4.11594-(12.5)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -12.48676 + (((tickAnim - 68) / 12) * (0.02206-(-12.48676)));
            yy = 1.8455 + (((tickAnim - 68) / 12) * (3.07583-(1.8455)));
            zz = 4.11594 + (((tickAnim - 68) / 12) * (-1.47343-(4.11594)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0.02206 + (((tickAnim - 80) / 11) * (0.01229-(0.02206)));
            yy = 3.07583 + (((tickAnim - 80) / 11) * (-2.4321-(3.07583)));
            zz = -1.47343 + (((tickAnim - 80) / 11) * (-8.07887-(-1.47343)));
        }
        else if (tickAnim >= 91 && tickAnim < 99) {
            xx = 0.01229 + (((tickAnim - 91) / 8) * (-2.48283-(0.01229)));
            yy = -2.4321 + (((tickAnim - 91) / 8) * (0.32186-(-2.4321)));
            zz = -8.07887 + (((tickAnim - 91) / 8) * (-4.77615-(-8.07887)));
        }
        else if (tickAnim >= 99 && tickAnim < 106) {
            xx = -2.48283 + (((tickAnim - 99) / 7) * (0.02206-(-2.48283)));
            yy = 0.32186 + (((tickAnim - 99) / 7) * (3.07583-(0.32186)));
            zz = -4.77615 + (((tickAnim - 99) / 7) * (-1.47343-(-4.77615)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = 0.02206 + (((tickAnim - 106) / 7) * (-12.48797-(0.02206)));
            yy = 3.07583 + (((tickAnim - 106) / 7) * (1.67772-(3.07583)));
            zz = -1.47343 + (((tickAnim - 106) / 7) * (-0.80369-(-1.47343)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -12.48797 + (((tickAnim - 113) / 7) * (0-(-12.48797)));
            yy = 1.67772 + (((tickAnim - 113) / 7) * (0-(1.67772)));
            zz = -0.80369 + (((tickAnim - 113) / 7) * (0-(-0.80369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-4.74705-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (6.87296-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-10.62886-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -4.74705 + (((tickAnim - 6) / 10) * (-10.32047-(-4.74705)));
            yy = 6.87296 + (((tickAnim - 6) / 10) * (9.69986-(6.87296)));
            zz = -10.62886 + (((tickAnim - 6) / 10) * (-3.2516-(-10.62886)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -10.32047 + (((tickAnim - 16) / 5) * (0.13475-(-10.32047)));
            yy = 9.69986 + (((tickAnim - 16) / 5) * (10.24604-(9.69986)));
            zz = -3.2516 + (((tickAnim - 16) / 5) * (5.05813-(-3.2516)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.13475 + (((tickAnim - 21) / 7) * (-15.09163-(0.13475)));
            yy = 10.24604 + (((tickAnim - 21) / 7) * (10.97427-(10.24604)));
            zz = 5.05813 + (((tickAnim - 21) / 7) * (16.13776-(5.05813)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -15.09163 + (((tickAnim - 28) / 6) * (-20.09163-(-15.09163)));
            yy = 10.97427 + (((tickAnim - 28) / 6) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 28) / 6) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -20.09163 + (((tickAnim - 34) / 10) * (-21.7583-(-20.09163)));
            yy = 10.97427 + (((tickAnim - 34) / 10) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 34) / 10) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -21.7583 + (((tickAnim - 44) / 5) * (-15.09163-(-21.7583)));
            yy = 10.97427 + (((tickAnim - 44) / 5) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 44) / 5) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 49 && tickAnim < 78) {
            xx = -15.09163 + (((tickAnim - 49) / 29) * (0.7579-(-15.09163)));
            yy = 10.97427 + (((tickAnim - 49) / 29) * (-6.85846-(10.97427)));
            zz = 16.13776 + (((tickAnim - 49) / 29) * (-3.25679-(16.13776)));
        }
        else if (tickAnim >= 78 && tickAnim < 91) {
            xx = 0.7579 + (((tickAnim - 78) / 13) * (8.09442-(0.7579)));
            yy = -6.85846 + (((tickAnim - 78) / 13) * (-1.19703-(-6.85846)));
            zz = -3.25679 + (((tickAnim - 78) / 13) * (-3.42315-(-3.25679)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 8.09442 + (((tickAnim - 91) / 7) * (-11.19105-(8.09442)));
            yy = -1.19703 + (((tickAnim - 91) / 7) * (12.14022-(-1.19703)));
            zz = -3.42315 + (((tickAnim - 91) / 7) * (-1.68796-(-3.42315)));
        }
        else if (tickAnim >= 98 && tickAnim < 106) {
            xx = -11.19105 + (((tickAnim - 98) / 8) * (8.09442-(-11.19105)));
            yy = 12.14022 + (((tickAnim - 98) / 8) * (-1.19703-(12.14022)));
            zz = -1.68796 + (((tickAnim - 98) / 8) * (-3.42315-(-1.68796)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 8.09442 + (((tickAnim - 106) / 14) * (0-(8.09442)));
            yy = -1.19703 + (((tickAnim - 106) / 14) * (0-(-1.19703)));
            zz = -3.42315 + (((tickAnim - 106) / 14) * (0-(-3.42315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (17.5-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 17.5 + (((tickAnim - 34) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 44) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 5) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 49) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 42) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 91) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 101) {
            xx = 17.5 + (((tickAnim - 96) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 96) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 5) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 33) / 17) * (0-(-9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(xx), Hip.rotateAngleY + (float) Math.toRadians(yy), Hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            zz = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hip.rotationPointX = this.Hip.rotationPointX + (float)(xx);
        this.Hip.rotationPointY = this.Hip.rotationPointY - (float)(yy);
        this.Hip.rotationPointZ = this.Hip.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.98791-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-25.49175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 12.98791 + (((tickAnim - 18) / 14) * (12.98791-(12.98791)));
            yy = -25.49175 + (((tickAnim - 18) / 14) * (-25.49175-(-25.49175)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 12.98791 + (((tickAnim - 32) / 18) * (0-(12.98791)));
            yy = -25.49175 + (((tickAnim - 32) / 18) * (0-(-25.49175)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.9136-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-13.25655-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0.9136 + (((tickAnim - 18) / 14) * (0.9136-(0.9136)));
            yy = -13.25655 + (((tickAnim - 18) / 14) * (-13.25655-(-13.25655)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.9136 + (((tickAnim - 32) / 18) * (0-(0.9136)));
            yy = -13.25655 + (((tickAnim - 32) / 18) * (0-(-13.25655)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.13873-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.90474-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.13873 + (((tickAnim - 18) / 14) * (-0.13873-(-0.13873)));
            yy = -10.90474 + (((tickAnim - 18) / 14) * (-10.90474-(-10.90474)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.13873 + (((tickAnim - 32) / 18) * (0-(-0.13873)));
            yy = -10.90474 + (((tickAnim - 32) / 18) * (0-(-10.90474)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.42932-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-22.90748-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.42932 + (((tickAnim - 18) / 14) * (-0.42932-(-0.42932)));
            yy = -22.90748 + (((tickAnim - 18) / 14) * (-22.90748-(-22.90748)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.42932 + (((tickAnim - 32) / 18) * (0-(-0.42932)));
            yy = -22.90748 + (((tickAnim - 32) / 18) * (0-(-22.90748)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.68717-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.65616-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0.68717 + (((tickAnim - 18) / 14) * (0.68717-(0.68717)));
            yy = -3.65616 + (((tickAnim - 18) / 14) * (-3.65616-(-3.65616)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.68717 + (((tickAnim - 32) / 18) * (0-(0.68717)));
            yy = -3.65616 + (((tickAnim - 32) / 18) * (0-(-3.65616)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 13) / 20) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 33) / 8) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 7) / 4) * (3-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 11) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 33) / 4) * (-20-(3)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 37) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 37 + (((tickAnim - 7) / 4) * (-8-(37)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 11) / 22) * (-8-(-8)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -8 + (((tickAnim - 33) / 4) * (45.33-(-8)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 45.33 + (((tickAnim - 37) / 4) * (0-(45.33)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10 + (((tickAnim - 18) / 15) * (10-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 33) / 17) * (0-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (17-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 33) / 17) * (0-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (17-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 33) / 17) * (0-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 13) / 28) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 28) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 41) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (-24-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 13) / 5) * (3-(-24)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 18) / 23) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 41) / 5) * (-20.33-(3)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.33 + (((tickAnim - 46) / 4) * (0-(-20.33)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (35-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 13) / 5) * (-8-(35)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 18) / 23) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -8 + (((tickAnim - 41) / 5) * (41.22-(-8)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 41.22 + (((tickAnim - 46) / 4) * (0-(41.22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*1.5));

        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3));

        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 3 + (((tickAnim - 9) / 5) * (11.45-(3)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.45 + (((tickAnim - 14) / 5) * (17.87-(11.45)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17.87 + (((tickAnim - 19) / 9) * (3.14-(17.87)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3.14 + (((tickAnim - 28) / 7) * (-0.62-(3.14)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -0.62 + (((tickAnim - 35) / 7) * (-11.21-(-0.62)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.21 + (((tickAnim - 42) / 8) * (0-(-11.21)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 11 + (((tickAnim - 9) / 5) * (16.98-(11)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 16.98 + (((tickAnim - 14) / 5) * (18.16-(16.98)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 18.16 + (((tickAnim - 19) / 9) * (35.73-(18.16)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 35.73 + (((tickAnim - 28) / 7) * (32.54-(35.73)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 32.54 + (((tickAnim - 35) / 7) * (-13.15-(32.54)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -13.15 + (((tickAnim - 42) / 8) * (0-(-13.15)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 4 + (((tickAnim - 9) / 5) * (11.27-(4)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.27 + (((tickAnim - 14) / 5) * (21.73-(11.27)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 21.73 + (((tickAnim - 19) / 4) * (28.54-(21.73)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 28.54 + (((tickAnim - 23) / 5) * (13.36-(28.54)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 13.36 + (((tickAnim - 28) / 7) * (-9.38-(13.36)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -9.38 + (((tickAnim - 35) / 7) * (-9.13-(-9.38)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -9.13 + (((tickAnim - 42) / 3) * (10.52-(-9.13)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.52 + (((tickAnim - 45) / 5) * (0-(10.52)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 93;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 11 + (((tickAnim - 18) / 45) * (11-(11)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 11 + (((tickAnim - 63) / 23) * (0-(11)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(xx), Hip.rotateAngleY + (float) Math.toRadians(yy), Hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            yy = -5.7 + (((tickAnim - 18) / 45) * (-5.7-(-5.7)));
            zz = 7.1 + (((tickAnim - 18) / 45) * (7.1-(7.1)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            yy = -5.7 + (((tickAnim - 63) / 23) * (0-(-5.7)));
            zz = 7.1 + (((tickAnim - 63) / 23) * (0-(7.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hip.rotationPointX = this.Hip.rotationPointX + (float)(xx);
        this.Hip.rotationPointY = this.Hip.rotationPointY - (float)(yy);
        this.Hip.rotationPointZ = this.Hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = -7 + (((tickAnim - 18) / 12) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (31.5-(0)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 59) {
            xx = 31.5 + (((tickAnim - 41) / 18) * (39-(31.5)));
            yy = 0 + (((tickAnim - 41) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 18) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 39 + (((tickAnim - 59) / 14) * (18.71-(39)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 18.71 + (((tickAnim - 73) / 11) * (0-(18.71)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (16.6-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = 16.6 + (((tickAnim - 43) / 16) * (4.1-(16.6)));
            yy = 0 + (((tickAnim - 43) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 16) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 4.1 + (((tickAnim - 59) / 14) * (-2.19-(4.1)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -2.19 + (((tickAnim - 73) / 11) * (0-(-2.19)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (7.5-(0)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 7.5 + (((tickAnim - 48) / 4) * (2.5-(7.5)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 59) {
            xx = 2.5 + (((tickAnim - 52) / 7) * (15-(2.5)));
            yy = 0 + (((tickAnim - 52) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 7) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 15 + (((tickAnim - 59) / 14) * (-5.94-(15)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -5.94 + (((tickAnim - 73) / 11) * (0-(-5.94)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (-8-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 59) {
            xx = -8 + (((tickAnim - 52) / 7) * (2-(-8)));
            yy = 0 + (((tickAnim - 52) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 7) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 2 + (((tickAnim - 59) / 14) * (-15.06-(2)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -15.06 + (((tickAnim - 73) / 11) * (0-(-15.06)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 44 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 44) / 12) * (-8-(0)));
            yy = 0 + (((tickAnim - 44) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 12) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = -8 + (((tickAnim - 56) / 3) * (-8-(-8)));
            yy = 0 + (((tickAnim - 56) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = -8 + (((tickAnim - 59) / 14) * (1.71-(-8)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 1.71 + (((tickAnim - 73) / 11) * (-1-(1.71)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (-9-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -9 + (((tickAnim - 53) / 6) * (-11.75-(-9)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -11.75 + (((tickAnim - 59) / 11) * (-24-(-11.75)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -24 + (((tickAnim - 70) / 14) * (0-(-24)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (35-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 35 + (((tickAnim - 53) / 6) * (0-(35)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 35 + (((tickAnim - 18) / 4) * (17.84519-(35)));
            yy = 0 + (((tickAnim - 18) / 4) * (-9.1121-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (-2.10278-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 17.84519 + (((tickAnim - 22) / 2) * (21.7346-(17.84519)));
            yy = -9.1121 + (((tickAnim - 22) / 2) * (-15.62074-(-9.1121)));
            zz = -2.10278 + (((tickAnim - 22) / 2) * (-3.60477-(-2.10278)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 21.7346 + (((tickAnim - 24) / 1) * (22.13474-(21.7346)));
            yy = -15.62074 + (((tickAnim - 24) / 1) * (-17.2944-(-15.62074)));
            zz = -3.60477 + (((tickAnim - 24) / 1) * (-3.991-(-3.60477)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 22.13474 + (((tickAnim - 25) / 5) * (3.53556-(22.13474)));
            yy = -17.2944 + (((tickAnim - 25) / 5) * (-27.3363-(-17.2944)));
            zz = -3.991 + (((tickAnim - 25) / 5) * (-6.30835-(-3.991)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 3.53556 + (((tickAnim - 30) / 3) * (4.38028-(3.53556)));
            yy = -27.3363 + (((tickAnim - 30) / 3) * (-33.15961-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 30) / 3) * (-7.983-(-6.30835)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 4.38028 + (((tickAnim - 33) / 1) * (3.19904-(4.38028)));
            yy = -33.15961 + (((tickAnim - 33) / 1) * (-24.41753-(-33.15961)));
            zz = -7.983 + (((tickAnim - 33) / 1) * (-5.53757-(-7.983)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 3.19904 + (((tickAnim - 34) / 2) * (3.53556-(3.19904)));
            yy = -24.41753 + (((tickAnim - 34) / 2) * (-27.3363-(-24.41753)));
            zz = -5.53757 + (((tickAnim - 34) / 2) * (-6.30835-(-5.53757)));
        }
        else if (tickAnim >= 36 && tickAnim < 63) {
            xx = 3.53556 + (((tickAnim - 36) / 27) * (3.53556-(3.53556)));
            yy = -27.3363 + (((tickAnim - 36) / 27) * (-27.3363-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 36) / 27) * (-6.30835-(-6.30835)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 3.53556 + (((tickAnim - 63) / 10) * (1.9642-(3.53556)));
            yy = -27.3363 + (((tickAnim - 63) / 10) * (-15.18683-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 63) / 10) * (-3.50464-(-6.30835)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 1.9642 + (((tickAnim - 73) / 5) * (13.30947-(1.9642)));
            yy = -15.18683 + (((tickAnim - 73) / 5) * (-10.12456-(-15.18683)));
            zz = -3.50464 + (((tickAnim - 73) / 5) * (-2.33643-(-3.50464)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 13.30947 + (((tickAnim - 78) / 3) * (16.98568-(13.30947)));
            yy = -10.12456 + (((tickAnim - 78) / 3) * (-6.07473-(-10.12456)));
            zz = -2.33643 + (((tickAnim - 78) / 3) * (-1.40186-(-2.33643)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 16.98568 + (((tickAnim - 81) / 5) * (0-(16.98568)));
            yy = -6.07473 + (((tickAnim - 81) / 5) * (0-(-6.07473)));
            zz = -1.40186 + (((tickAnim - 81) / 5) * (0-(-1.40186)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 88) / 1) * (0-(0)));
            yy = -5 + (((tickAnim - 88) / 1) * (1-(-5)));
            zz = 0 + (((tickAnim - 88) / 1) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 89) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 89) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 89) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-83.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -83.5 + (((tickAnim - 18) / 4) * (-76.67-(-83.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -76.67 + (((tickAnim - 22) / 2) * (-83.43-(-76.67)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -83.43 + (((tickAnim - 24) / 1) * (-89.37-(-83.43)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -89.37 + (((tickAnim - 25) / 5) * (-79.5-(-89.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -79.5 + (((tickAnim - 30) / 3) * (-81.94365-(-79.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (4.81771-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (1.33935-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -81.94365 + (((tickAnim - 33) / 1) * (-76.99101-(-81.94365)));
            yy = 4.81771 + (((tickAnim - 33) / 1) * (-1.92723-(4.81771)));
            zz = 1.33935 + (((tickAnim - 33) / 1) * (-0.53468-(1.33935)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = -76.99101 + (((tickAnim - 34) / 2) * (-79.5-(-76.99101)));
            yy = -1.92723 + (((tickAnim - 34) / 2) * (0-(-1.92723)));
            zz = -0.53468 + (((tickAnim - 34) / 2) * (0-(-0.53468)));
        }
        else if (tickAnim >= 36 && tickAnim < 63) {
            xx = -79.5 + (((tickAnim - 36) / 27) * (-79.5-(-79.5)));
            yy = 0 + (((tickAnim - 36) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 27) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -79.5 + (((tickAnim - 63) / 10) * (-51.94444-(-79.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -51.94444 + (((tickAnim - 73) / 5) * (-45.96-(-51.94444)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = -45.96 + (((tickAnim - 78) / 3) * (-47.58-(-45.96)));
            yy = 0 + (((tickAnim - 78) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 3) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = -47.58 + (((tickAnim - 81) / 5) * (0-(-47.58)));
            yy = 0 + (((tickAnim - 81) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (-0.12907-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (3.56488-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (-1.95636-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 89) {
            xx = -0.12907 + (((tickAnim - 88) / 1) * (-0.24475-(-0.12907)));
            yy = 3.56488 + (((tickAnim - 88) / 1) * (-4.99788-(3.56488)));
            zz = -1.95636 + (((tickAnim - 88) / 1) * (0.99126-(-1.95636)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = -0.24475 + (((tickAnim - 89) / 2) * (0-(-0.24475)));
            yy = -4.99788 + (((tickAnim - 89) / 2) * (0-(-4.99788)));
            zz = 0.99126 + (((tickAnim - 89) / 2) * (0-(0.99126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (36.7203-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.49739-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (5.82089-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 36.7203 + (((tickAnim - 18) / 4) * (55.7203-(36.7203)));
            yy = -5.49739 + (((tickAnim - 18) / 4) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 18) / 4) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 55.7203 + (((tickAnim - 22) / 8) * (54.7203-(55.7203)));
            yy = -5.49739 + (((tickAnim - 22) / 8) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 22) / 8) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 54.7203 + (((tickAnim - 30) / 33) * (54.7203-(54.7203)));
            yy = -5.49739 + (((tickAnim - 30) / 33) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 30) / 33) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 54.7203 + (((tickAnim - 63) / 10) * (30.40016-(54.7203)));
            yy = -5.49739 + (((tickAnim - 63) / 10) * (-3.05411-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 63) / 10) * (3.23383-(5.82089)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 30.40016 + (((tickAnim - 73) / 5) * (49.26678-(30.40016)));
            yy = -3.05411 + (((tickAnim - 73) / 5) * (-2.03607-(-3.05411)));
            zz = 3.23383 + (((tickAnim - 73) / 5) * (2.15589-(3.23383)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 49.26678 + (((tickAnim - 78) / 3) * (42.56007-(49.26678)));
            yy = -2.03607 + (((tickAnim - 78) / 3) * (-1.22164-(-2.03607)));
            zz = 2.15589 + (((tickAnim - 78) / 3) * (1.29353-(2.15589)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 42.56007 + (((tickAnim - 81) / 5) * (0-(42.56007)));
            yy = -1.22164 + (((tickAnim - 81) / 5) * (0-(-1.22164)));
            zz = 1.29353 + (((tickAnim - 81) / 5) * (0-(1.29353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (18.76103-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.87455-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (2.64424-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 18.76103 + (((tickAnim - 6) / 5) * (20.80467-(18.76103)));
            yy = 5.87455 + (((tickAnim - 6) / 5) * (11.35747-(5.87455)));
            zz = 2.64424 + (((tickAnim - 6) / 5) * (5.1122-(2.64424)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 20.80467 + (((tickAnim - 11) / 7) * (12.9511-(20.80467)));
            yy = 11.35747 + (((tickAnim - 11) / 7) * (17.0013-(11.35747)));
            zz = 5.1122 + (((tickAnim - 11) / 7) * (15.57186-(5.1122)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.9511 + (((tickAnim - 18) / 2) * (12.86097-(12.9511)));
            yy = 17.0013 + (((tickAnim - 18) / 2) * (21.42505-(17.0013)));
            zz = 15.57186 + (((tickAnim - 18) / 2) * (15.23441-(15.57186)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 12.86097 + (((tickAnim - 20) / 2) * (11.81437-(12.86097)));
            yy = 21.42505 + (((tickAnim - 20) / 2) * (17.58946-(21.42505)));
            zz = 15.23441 + (((tickAnim - 20) / 2) * (12.05653-(15.23441)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 11.81437 + (((tickAnim - 22) / 1) * (12.9511-(11.81437)));
            yy = 17.58946 + (((tickAnim - 22) / 1) * (17.0013-(17.58946)));
            zz = 12.05653 + (((tickAnim - 22) / 1) * (15.57186-(12.05653)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.9511 + (((tickAnim - 23) / 7) * (9.76723-(12.9511)));
            yy = 17.0013 + (((tickAnim - 23) / 7) * (20.65288-(17.0013)));
            zz = 15.57186 + (((tickAnim - 23) / 7) * (5.73266-(15.57186)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 9.76723 + (((tickAnim - 30) / 33) * (9.76723-(9.76723)));
            yy = 20.65288 + (((tickAnim - 30) / 33) * (20.65288-(20.65288)));
            zz = 5.73266 + (((tickAnim - 30) / 33) * (5.73266-(5.73266)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 9.76723 + (((tickAnim - 63) / 4) * (14.21761-(9.76723)));
            yy = 20.65288 + (((tickAnim - 63) / 4) * (14.377-(20.65288)));
            zz = 5.73266 + (((tickAnim - 63) / 4) * (4.00045-(5.73266)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 14.21761 + (((tickAnim - 67) / 2) * (17.8054-(14.21761)));
            yy = 14.377 + (((tickAnim - 67) / 2) * (9.67009-(14.377)));
            zz = 4.00045 + (((tickAnim - 67) / 2) * (2.70129-(4.00045)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 17.8054 + (((tickAnim - 69) / 4) * (5.11838-(17.8054)));
            yy = 9.67009 + (((tickAnim - 69) / 4) * (1.82524-(9.67009)));
            zz = 2.70129 + (((tickAnim - 69) / 4) * (0.53603-(2.70129)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 5.11838 + (((tickAnim - 73) / 2) * (4.52346-(5.11838)));
            yy = 1.82524 + (((tickAnim - 73) / 2) * (6.42325-(1.82524)));
            zz = 0.53603 + (((tickAnim - 73) / 2) * (1.71743-(0.53603)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = 4.52346 + (((tickAnim - 75) / 2) * (3.76487-(4.52346)));
            yy = 6.42325 + (((tickAnim - 75) / 2) * (0.57913-(6.42325)));
            zz = 1.71743 + (((tickAnim - 75) / 2) * (0.25958-(1.71743)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 3.76487 + (((tickAnim - 77) / 1) * (3.10331-(3.76487)));
            yy = 0.57913 + (((tickAnim - 77) / 1) * (3.3959-(0.57913)));
            zz = 0.25958 + (((tickAnim - 77) / 1) * (0.89223-(0.25958)));
        }
        else if (tickAnim >= 78 && tickAnim < 86) {
            xx = 3.10331 + (((tickAnim - 78) / 8) * (0-(3.10331)));
            yy = 3.3959 + (((tickAnim - 78) / 8) * (0-(3.3959)));
            zz = 0.89223 + (((tickAnim - 78) / 8) * (0-(0.89223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-50.07001-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.97113-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.8843-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -50.07001 + (((tickAnim - 6) / 5) * (-63.93535-(-50.07001)));
            yy = 3.97113 + (((tickAnim - 6) / 5) * (7.67751-(3.97113)));
            zz = 3.8843 + (((tickAnim - 6) / 5) * (7.50964-(3.8843)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -63.93535 + (((tickAnim - 11) / 7) * (-84.33063-(-63.93535)));
            yy = 7.67751 + (((tickAnim - 11) / 7) * (15.29169-(7.67751)));
            zz = 7.50964 + (((tickAnim - 11) / 7) * (9.46625-(7.50964)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -84.33063 + (((tickAnim - 18) / 2) * (-86.56542-(-84.33063)));
            yy = 15.29169 + (((tickAnim - 18) / 2) * (8.80841-(15.29169)));
            zz = 9.46625 + (((tickAnim - 18) / 2) * (9.48811-(9.46625)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -86.56542 + (((tickAnim - 20) / 2) * (-84.09539-(-86.56542)));
            yy = 8.80841 + (((tickAnim - 20) / 2) * (13.2987-(8.80841)));
            zz = 9.48811 + (((tickAnim - 20) / 2) * (11.40054-(9.48811)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -84.09539 + (((tickAnim - 22) / 1) * (-84.09157-(-84.09539)));
            yy = 13.2987 + (((tickAnim - 22) / 1) * (8.82852-(13.2987)));
            zz = 11.40054 + (((tickAnim - 22) / 1) * (9.54329-(11.40054)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -84.09157 + (((tickAnim - 23) / 7) * (-78.53921-(-84.09157)));
            yy = 8.82852 + (((tickAnim - 23) / 7) * (7.5889-(8.82852)));
            zz = 9.54329 + (((tickAnim - 23) / 7) * (15.19189-(9.54329)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = -78.53921 + (((tickAnim - 30) / 33) * (-78.53921-(-78.53921)));
            yy = 7.5889 + (((tickAnim - 30) / 33) * (7.5889-(7.5889)));
            zz = 15.19189 + (((tickAnim - 30) / 33) * (15.19189-(15.19189)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -78.53921 + (((tickAnim - 63) / 4) * (-69.58648-(-78.53921)));
            yy = 7.5889 + (((tickAnim - 63) / 4) * (2.08609-(7.5889)));
            zz = 15.19189 + (((tickAnim - 63) / 4) * (13.76069-(15.19189)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -69.58648 + (((tickAnim - 67) / 6) * (-55.71105-(-69.58648)));
            yy = 2.08609 + (((tickAnim - 67) / 6) * (-2.27501-(2.08609)));
            zz = 13.76069 + (((tickAnim - 67) / 6) * (6.00164-(13.76069)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -55.71105 + (((tickAnim - 73) / 2) * (-32.94974-(-55.71105)));
            yy = -2.27501 + (((tickAnim - 73) / 2) * (-4.82687-(-2.27501)));
            zz = 6.00164 + (((tickAnim - 73) / 2) * (2.39478-(6.00164)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = -32.94974 + (((tickAnim - 75) / 2) * (-27.97197-(-32.94974)));
            yy = -4.82687 + (((tickAnim - 75) / 2) * (-2.78726-(-4.82687)));
            zz = 2.39478 + (((tickAnim - 75) / 2) * (3.55154-(2.39478)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = -27.97197 + (((tickAnim - 77) / 1) * (-22.84955-(-27.97197)));
            yy = -2.78726 + (((tickAnim - 77) / 1) * (-2.85932-(-2.78726)));
            zz = 3.55154 + (((tickAnim - 77) / 1) * (2.08954-(3.55154)));
        }
        else if (tickAnim >= 78 && tickAnim < 86) {
            xx = -22.84955 + (((tickAnim - 78) / 8) * (0-(-22.84955)));
            yy = -2.85932 + (((tickAnim - 78) / 8) * (0-(-2.85932)));
            zz = 2.08954 + (((tickAnim - 78) / 8) * (0-(2.08954)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (33.55656-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.29752-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.61672-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 33.55656 + (((tickAnim - 6) / 5) * (49.40936-(33.55656)));
            yy = 5.29752 + (((tickAnim - 6) / 5) * (10.24188-(5.29752)));
            zz = -5.61672 + (((tickAnim - 6) / 5) * (-10.85899-(-5.61672)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 49.40936 + (((tickAnim - 11) / 7) * (62.31549-(49.40936)));
            yy = 10.24188 + (((tickAnim - 11) / 7) * (16.95208-(10.24188)));
            zz = -10.85899 + (((tickAnim - 11) / 7) * (-17.97349-(-10.85899)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 62.31549 + (((tickAnim - 18) / 12) * (50.14337-(62.31549)));
            yy = 16.95208 + (((tickAnim - 18) / 12) * (14.73488-(16.95208)));
            zz = -17.97349 + (((tickAnim - 18) / 12) * (-16.77278-(-17.97349)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 50.14337 + (((tickAnim - 30) / 33) * (50.14337-(50.14337)));
            yy = 14.73488 + (((tickAnim - 30) / 33) * (14.73488-(14.73488)));
            zz = -16.77278 + (((tickAnim - 30) / 33) * (-16.77278-(-16.77278)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 50.14337 + (((tickAnim - 63) / 4) * (53.91261-(50.14337)));
            yy = 14.73488 + (((tickAnim - 63) / 4) * (10.81297-(14.73488)));
            zz = -16.77278 + (((tickAnim - 63) / 4) * (-12.25592-(-16.77278)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 53.91261 + (((tickAnim - 67) / 6) * (40.95109-(53.91261)));
            yy = 10.81297 + (((tickAnim - 67) / 6) * (2.96915-(10.81297)));
            zz = -12.25592 + (((tickAnim - 67) / 6) * (-3.22218-(-12.25592)));
        }
        else if (tickAnim >= 73 && tickAnim < 86) {
            xx = 40.95109 + (((tickAnim - 73) / 13) * (0-(40.95109)));
            yy = 2.96915 + (((tickAnim - 73) / 13) * (0-(2.96915)));
            zz = -3.22218 + (((tickAnim - 73) / 13) * (0-(-3.22218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*3), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*1.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-6.9713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-50))*1), Tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-50))*4), Tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-50))*3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(-1.1287+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-90))*5), Tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-90))*4), Tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-90))*3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/4.6667-50))*10), Tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-50))*2), Tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-50))*2));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = -30 + (((tickAnim - 18) / 45) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = -30 + (((tickAnim - 63) / 23) * (0-(-30)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 17 + (((tickAnim - 18) / 45) * (17-(17)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 17 + (((tickAnim - 63) / 23) * (0-(17)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 2 + (((tickAnim - 18) / 45) * (2-(2)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 2 + (((tickAnim - 63) / 23) * (0-(2)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = -30 + (((tickAnim - 18) / 45) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = -30 + (((tickAnim - 63) / 23) * (0-(-30)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 17 + (((tickAnim - 18) / 45) * (17-(17)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 17 + (((tickAnim - 63) / 23) * (0-(17)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 2 + (((tickAnim - 18) / 45) * (2-(2)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 2 + (((tickAnim - 63) / 23) * (0-(2)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.06177-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.62999-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.99344-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.06177 + (((tickAnim - 5) / 4) * (0.3948-(0.06177)));
            yy = -3.62999 + (((tickAnim - 5) / 4) * (-0.86995-(-3.62999)));
            zz = -0.99344 + (((tickAnim - 5) / 4) * (0.3434-(-0.99344)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0.3948 + (((tickAnim - 9) / 6) * (0.13931-(0.3948)));
            yy = -0.86995 + (((tickAnim - 9) / 6) * (4.50918-(-0.86995)));
            zz = 0.3434 + (((tickAnim - 9) / 6) * (1.95136-(0.3434)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.13931 + (((tickAnim - 15) / 10) * (0-(0.13931)));
            yy = 4.50918 + (((tickAnim - 15) / 10) * (0-(4.50918)));
            zz = 1.95136 + (((tickAnim - 15) / 10) * (0-(1.95136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(xx), Hip.rotateAngleY + (float) Math.toRadians(yy), Hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 0) / 5) * (2.51515-(2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.90998-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.69846-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.51515 + (((tickAnim - 5) / 3) * (2.5148-(2.51515)));
            yy = 1.90998 + (((tickAnim - 5) / 3) * (0.48964-(1.90998)));
            zz = 1.69846 + (((tickAnim - 5) / 3) * (0.93875-(1.69846)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.5148 + (((tickAnim - 8) / 7) * (2.53201-(2.5148)));
            yy = 0.48964 + (((tickAnim - 8) / 7) * (-1.48411-(0.48964)));
            zz = 0.93875 + (((tickAnim - 8) / 7) * (-0.48939-(0.93875)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.53201 + (((tickAnim - 15) / 10) * (2.5-(2.53201)));
            yy = -1.48411 + (((tickAnim - 15) / 10) * (0-(-1.48411)));
            zz = -0.48939 + (((tickAnim - 15) / 10) * (0-(-0.48939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.34252 + (((tickAnim - 0) / 5) * (9.68368-(9.34252)));
            yy = -12.61323 + (((tickAnim - 0) / 5) * (-4.29884-(-12.61323)));
            zz = -0.02574 + (((tickAnim - 0) / 5) * (-0.0296-(-0.02574)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 9.68368 + (((tickAnim - 5) / 10) * (10.41394-(9.68368)));
            yy = -4.29884 + (((tickAnim - 5) / 10) * (-2.66989-(-4.29884)));
            zz = -0.0296 + (((tickAnim - 5) / 10) * (-0.09478-(-0.0296)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 10.41394 + (((tickAnim - 15) / 10) * (9.34252-(10.41394)));
            yy = -2.66989 + (((tickAnim - 15) / 10) * (-12.61323-(-2.66989)));
            zz = -0.09478 + (((tickAnim - 15) / 10) * (-0.02574-(-0.09478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.40711 + (((tickAnim - 0) / 25) * (0.40711-(0.40711)));
            yy = -14.39011 + (((tickAnim - 0) / 25) * (-14.39011-(-14.39011)));
            zz = -4.27708 + (((tickAnim - 0) / 25) * (-4.27708-(-4.27708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.24658 + (((tickAnim - 0) / 15) * (0.18523-(0.24658)));
            yy = -9.07363 + (((tickAnim - 0) / 15) * (-14.06467-(-9.07363)));
            zz = -4.22026 + (((tickAnim - 0) / 15) * (-3.91464-(-4.22026)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.18523 + (((tickAnim - 15) / 10) * (0.24658-(0.18523)));
            yy = -14.06467 + (((tickAnim - 15) / 10) * (-9.07363-(-14.06467)));
            zz = -3.91464 + (((tickAnim - 15) / 10) * (-4.22026-(-3.91464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.27996 + (((tickAnim - 0) / 25) * (0.27996-(0.27996)));
            yy = -8.78676 + (((tickAnim - 0) / 25) * (-8.78676-(-8.78676)));
            zz = -4.79223 + (((tickAnim - 0) / 25) * (-4.79223-(-4.79223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.35463 + (((tickAnim - 0) / 25) * (0.35463-(0.35463)));
            yy = -11.65094 + (((tickAnim - 0) / 25) * (-11.65094-(-11.65094)));
            zz = -4.5586 + (((tickAnim - 0) / 25) * (-4.5586-(-4.5586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -12.25 + (((tickAnim - 0) / 25) * (-12.25-(-12.25)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 15) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.66667-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.33333-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.66667 + (((tickAnim - 6) / 2) * (2.56764-(1.66667)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.37613-(0)));
            zz = -0.33333 + (((tickAnim - 6) / 2) * (-2.98671-(-0.33333)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.56764 + (((tickAnim - 8) / 7) * (4.95887-(2.56764)));
            yy = 0.37613 + (((tickAnim - 8) / 7) * (0.95972-(0.37613)));
            zz = -2.98671 + (((tickAnim - 8) / 7) * (-5.90726-(-2.98671)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.95887 + (((tickAnim - 15) / 10) * (0-(4.95887)));
            yy = 0.95972 + (((tickAnim - 15) / 10) * (0-(0.95972)));
            zz = -5.90726 + (((tickAnim - 15) / 10) * (0-(-5.90726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(xx);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(yy);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 6) / 9) * (-10-(-5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 15) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmleft.rotationPointX = this.lowerarmleft.rotationPointX + (float)(xx);
        this.lowerarmleft.rotationPointY = this.lowerarmleft.rotationPointY - (float)(yy);
        this.lowerarmleft.rotationPointZ = this.lowerarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 6) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (-5.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -5.75 + (((tickAnim - 15) / 10) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(xx);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(yy);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmright.rotationPointX = this.lowerarmright.rotationPointX + (float)(xx);
        this.lowerarmright.rotationPointY = this.lowerarmright.rotationPointY - (float)(yy);
        this.lowerarmright.rotationPointZ = this.lowerarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 15) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handright.rotationPointX = this.handright.rotationPointX + (float)(xx);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(yy);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 4) / 4) * (-5.70434-(-4)));
            yy = -7.25 + (((tickAnim - 4) / 4) * (6.78797-(-7.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (-1.85663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.70434 + (((tickAnim - 8) / 7) * (-1.69041-(-5.70434)));
            yy = 6.78797 + (((tickAnim - 8) / 7) * (26.44113-(6.78797)));
            zz = -1.85663 + (((tickAnim - 8) / 7) * (-4.4559-(-1.85663)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.69041 + (((tickAnim - 15) / 10) * (0-(-1.69041)));
            yy = 26.44113 + (((tickAnim - 15) / 10) * (0-(26.44113)));
            zz = -4.4559 + (((tickAnim - 15) / 10) * (0-(-4.4559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 4) / 4) * (-5.48098-(-2.75)));
            yy = -4.75 + (((tickAnim - 4) / 4) * (5.50068-(-4.75)));
            zz = 0 + (((tickAnim - 4) / 4) * (-4.25562-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.48098 + (((tickAnim - 8) / 7) * (1.24564-(-5.48098)));
            yy = 5.50068 + (((tickAnim - 8) / 7) * (19.85164-(5.50068)));
            zz = -4.25562 + (((tickAnim - 8) / 7) * (-10.21348-(-4.25562)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.24564 + (((tickAnim - 15) / 10) * (0-(1.24564)));
            yy = 19.85164 + (((tickAnim - 15) / 10) * (0-(19.85164)));
            zz = -10.21348 + (((tickAnim - 15) / 10) * (0-(-10.21348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 10) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.72708-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.66379-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.76669-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.72708 + (((tickAnim - 8) / 7) * (-8.86394-(-3.72708)));
            yy = -10.66379 + (((tickAnim - 8) / 7) * (23.74028-(-10.66379)));
            zz = 5.76669 + (((tickAnim - 8) / 7) * (0.74387-(5.76669)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -8.86394 + (((tickAnim - 15) / 10) * (0-(-8.86394)));
            yy = 23.74028 + (((tickAnim - 15) / 10) * (0-(23.74028)));
            zz = 0.74387 + (((tickAnim - 15) / 10) * (0-(0.74387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (2.81055-(0)));
            yy = -9.5 + (((tickAnim - 4) / 5) * (-8.01914-(-9.5)));
            zz = 0 + (((tickAnim - 4) / 5) * (6.59715-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 2.81055 + (((tickAnim - 9) / 6) * (-10.55194-(2.81055)));
            yy = -8.01914 + (((tickAnim - 9) / 6) * (17.8274-(-8.01914)));
            zz = 6.59715 + (((tickAnim - 9) / 6) * (-1.86514-(6.59715)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.55194 + (((tickAnim - 15) / 3) * (7.71788-(-10.55194)));
            yy = 17.8274 + (((tickAnim - 15) / 3) * (13.33315-(17.8274)));
            zz = -1.86514 + (((tickAnim - 15) / 3) * (-0.04349-(-1.86514)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.71788 + (((tickAnim - 18) / 7) * (0-(7.71788)));
            yy = 13.33315 + (((tickAnim - 18) / 7) * (0-(13.33315)));
            zz = -0.04349 + (((tickAnim - 18) / 7) * (0-(-0.04349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0.275-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.275 + (((tickAnim - 15) / 10) * (0-(0.275)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.5806-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.41562-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.08104-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 1.5806 + (((tickAnim - 2) / 2) * (3.1395-(1.5806)));
            yy = 0.41562 + (((tickAnim - 2) / 2) * (-9.15091-(0.41562)));
            zz = -0.08104 + (((tickAnim - 2) / 2) * (0.4355-(-0.08104)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.1395 + (((tickAnim - 4) / 5) * (5.84525-(3.1395)));
            yy = -9.15091 + (((tickAnim - 4) / 5) * (-3.71637-(-9.15091)));
            zz = 0.4355 + (((tickAnim - 4) / 5) * (7.38393-(0.4355)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 5.84525 + (((tickAnim - 9) / 3) * (8.20563-(5.84525)));
            yy = -3.71637 + (((tickAnim - 9) / 3) * (1.20879-(-3.71637)));
            zz = 7.38393 + (((tickAnim - 9) / 3) * (-0.04504-(7.38393)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.20563 + (((tickAnim - 12) / 3) * (-5.96093-(8.20563)));
            yy = 1.20879 + (((tickAnim - 12) / 3) * (14.24121-(1.20879)));
            zz = -0.04504 + (((tickAnim - 12) / 3) * (0.15047-(-0.04504)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5.96093 + (((tickAnim - 15) / 4) * (-5.25676-(-5.96093)));
            yy = 14.24121 + (((tickAnim - 15) / 4) * (11.57186-(14.24121)));
            zz = 0.15047 + (((tickAnim - 15) / 4) * (0.25973-(0.15047)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -5.25676 + (((tickAnim - 19) / 6) * (0-(-5.25676)));
            yy = 11.57186 + (((tickAnim - 19) / 6) * (0-(11.57186)));
            zz = 0.25973 + (((tickAnim - 19) / 6) * (0-(0.25973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.18307-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.93444-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.40674-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 3.18307 + (((tickAnim - 2) / 2) * (6.13847-(3.18307)));
            yy = 1.93444 + (((tickAnim - 2) / 2) * (-16.19475-(1.93444)));
            zz = -0.40674 + (((tickAnim - 2) / 2) * (3.40526-(-0.40674)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 6.13847 + (((tickAnim - 4) / 5) * (11.94642-(6.13847)));
            yy = -16.19475 + (((tickAnim - 4) / 5) * (-7.52543-(-16.19475)));
            zz = 3.40526 + (((tickAnim - 4) / 5) * (7.58462-(3.40526)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.94642 + (((tickAnim - 9) / 3) * (16.54501-(11.94642)));
            yy = -7.52543 + (((tickAnim - 9) / 3) * (-11.12794-(-7.52543)));
            zz = 7.58462 + (((tickAnim - 9) / 3) * (0.37246-(7.58462)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 16.54501 + (((tickAnim - 12) / 3) * (-2.56277-(16.54501)));
            yy = -11.12794 + (((tickAnim - 12) / 3) * (19.06311-(-11.12794)));
            zz = 0.37246 + (((tickAnim - 12) / 3) * (-0.85724-(0.37246)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -2.56277 + (((tickAnim - 15) / 4) * (3.69424-(-2.56277)));
            yy = 19.06311 + (((tickAnim - 15) / 4) * (21.23588-(19.06311)));
            zz = -0.85724 + (((tickAnim - 15) / 4) * (-1.30454-(-0.85724)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 3.69424 + (((tickAnim - 19) / 6) * (0-(3.69424)));
            yy = 21.23588 + (((tickAnim - 19) / 6) * (0-(21.23588)));
            zz = -1.30454 + (((tickAnim - 19) / 6) * (0-(-1.30454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.61615-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-18.16673-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.41459-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 21.61615 + (((tickAnim - 15) / 4) * (4.55807-(21.61615)));
            yy = -18.16673 + (((tickAnim - 15) / 4) * (-9.08336-(-18.16673)));
            zz = -8.41459 + (((tickAnim - 15) / 4) * (-4.2073-(-8.41459)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 4.55807 + (((tickAnim - 19) / 6) * (0-(4.55807)));
            yy = -9.08336 + (((tickAnim - 19) / 6) * (0-(-9.08336)));
            zz = -4.2073 + (((tickAnim - 19) / 6) * (0-(-4.2073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (2.075-(0)));
            zz = 1.625 + (((tickAnim - 15) / 4) * (0-(1.625)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 2.075 + (((tickAnim - 19) / 6) * (0-(2.075)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -11.25 + (((tickAnim - 15) / 4) * (2.875-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 6 + (((tickAnim - 15) / 4) * (3-(6)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 2.875 + (((tickAnim - 19) / 6) * (0-(2.875)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 3 + (((tickAnim - 19) / 6) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 15) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 19) / 4) * (-0.71-(13.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.71 + (((tickAnim - 23) / 2) * (0-(-0.71)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2.29488-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.73091-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.30961-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 2.29488 + (((tickAnim - 4) / 11) * (-1.27167-(2.29488)));
            yy = 2.73091 + (((tickAnim - 4) / 11) * (-28.10503-(2.73091)));
            zz = 0.30961 + (((tickAnim - 4) / 11) * (-3.67888-(0.30961)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.27167 + (((tickAnim - 15) / 10) * (0-(-1.27167)));
            yy = -28.10503 + (((tickAnim - 15) / 10) * (0-(-28.10503)));
            zz = -3.67888 + (((tickAnim - 15) / 10) * (0-(-3.67888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 15) / 10) * (0-(-0.55)));
            zz = -2.275 + (((tickAnim - 15) / 10) * (0-(-2.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.40478-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5571-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.10573-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.40478 + (((tickAnim - 15) / 10) * (0-(1.40478)));
            yy = 0.5571 + (((tickAnim - 15) / 10) * (0-(0.5571)));
            zz = -3.10573 + (((tickAnim - 15) / 10) * (0-(-3.10573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 15) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));

        this.footright.rotationPointX = this.footright.rotationPointX + (float)(0);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(-0.575);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(0);


    }
    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 3 + (((tickAnim - 33) / 68) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 3 + (((tickAnim - 101) / 14) * (0-(3)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 115) / 13) * (-2-(0)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = -2 + (((tickAnim - 128) / 32) * (0-(-2)));
            yy = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(xx), Hip.rotateAngleY + (float) Math.toRadians(yy), Hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 101) {
            xx = 8 + (((tickAnim - 24) / 77) * (8-(8)));
            yy = 0 + (((tickAnim - 24) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 77) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 8 + (((tickAnim - 101) / 14) * (11-(8)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 11 + (((tickAnim - 115) / 13) * (8-(11)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 8 + (((tickAnim - 128) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 6) / 5) * (0-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (3.8533-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.22141-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.98771-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.8533 + (((tickAnim - 18) / 5) * (6-(3.8533)));
            yy = 0.22141 + (((tickAnim - 18) / 5) * (0-(0.22141)));
            zz = -1.98771 + (((tickAnim - 18) / 5) * (0-(-1.98771)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 23) / 10) * (10-(6)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 10 + (((tickAnim - 33) / 68) * (10-(10)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 10 + (((tickAnim - 101) / 8) * (10-(10)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = 10 + (((tickAnim - 109) / 4) * (1.66098-(10)));
            yy = 0 + (((tickAnim - 109) / 4) * (0.21787-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (-0.99209-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 1.66098 + (((tickAnim - 113) / 4) * (-5-(1.66098)));
            yy = 0.21787 + (((tickAnim - 113) / 4) * (0-(0.21787)));
            zz = -0.99209 + (((tickAnim - 113) / 4) * (0-(-0.99209)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -5 + (((tickAnim - 117) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -5 + (((tickAnim - 128) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (14.69611-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.68061-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (4.95358-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 14.69611 + (((tickAnim - 18) / 30) * (44-(14.69611)));
            yy = 0.68061 + (((tickAnim - 18) / 30) * (0-(0.68061)));
            zz = 4.95358 + (((tickAnim - 18) / 30) * (0-(4.95358)));
        }
        else if (tickAnim >= 48 && tickAnim < 101) {
            xx = 44 + (((tickAnim - 48) / 53) * (44-(44)));
            yy = 0 + (((tickAnim - 48) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 53) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 44 + (((tickAnim - 101) / 8) * (33-(44)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 33 + (((tickAnim - 109) / 8) * (25-(33)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 25 + (((tickAnim - 117) / 20) * (-7-(25)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 160) {
            xx = -7 + (((tickAnim - 137) / 23) * (0-(-7)));
            yy = 0 + (((tickAnim - 137) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (8.90366-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0.42549-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (3.97734-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 8.90366 + (((tickAnim - 30) / 21) * (20-(8.90366)));
            yy = 0.42549 + (((tickAnim - 30) / 21) * (0-(0.42549)));
            zz = 3.97734 + (((tickAnim - 30) / 21) * (0-(3.97734)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 20 + (((tickAnim - 51) / 50) * (20-(20)));
            yy = 0 + (((tickAnim - 51) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 50) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 20 + (((tickAnim - 101) / 8) * (14-(20)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 14 + (((tickAnim - 109) / 8) * (9-(14)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 9 + (((tickAnim - 117) / 20) * (1-(9)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 146) {
            xx = 1 + (((tickAnim - 137) / 9) * (-3.58-(1)));
            yy = 0 + (((tickAnim - 137) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 9) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 158) {
            xx = -3.58 + (((tickAnim - 146) / 12) * (0-(-3.58)));
            yy = 0 + (((tickAnim - 146) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 22) / 34) * (8.93728-(0)));
            yy = 0 + (((tickAnim - 22) / 34) * (-0.90272-(0)));
            zz = 0 + (((tickAnim - 22) / 34) * (7.94923-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 101) {
            xx = 8.93728 + (((tickAnim - 56) / 45) * (9-(8.93728)));
            yy = -0.90272 + (((tickAnim - 56) / 45) * (0-(-0.90272)));
            zz = 7.94923 + (((tickAnim - 56) / 45) * (0-(7.94923)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 9 + (((tickAnim - 101) / 8) * (2-(9)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 2 + (((tickAnim - 109) / 8) * (12-(2)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 12 + (((tickAnim - 117) / 20) * (-5-(12)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 158) {
            xx = -5 + (((tickAnim - 137) / 21) * (0-(-5)));
            yy = 0 + (((tickAnim - 137) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0.92702-(0)));
            yy = 0 + (((tickAnim - 25) / 26) * (1.78986-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (-4.66942-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 0.92702 + (((tickAnim - 51) / 50) * (1-(0.92702)));
            yy = 1.78986 + (((tickAnim - 51) / 50) * (0-(1.78986)));
            zz = -4.66942 + (((tickAnim - 51) / 50) * (0-(-4.66942)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 1 + (((tickAnim - 101) / 8) * (-9-(1)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -9 + (((tickAnim - 109) / 8) * (-10-(-9)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -10 + (((tickAnim - 117) / 11) * (-4.38-(-10)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 142) {
            xx = -4.38 + (((tickAnim - 128) / 14) * (0-(-4.38)));
            yy = 0 + (((tickAnim - 128) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 14) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 142) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 31) / 27) * (-7-(0)));
            yy = 0 + (((tickAnim - 31) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 27) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 101) {
            xx = -7 + (((tickAnim - 58) / 43) * (-8-(-7)));
            yy = 0 + (((tickAnim - 58) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 43) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -8 + (((tickAnim - 101) / 8) * (-13-(-8)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -13 + (((tickAnim - 109) / 8) * (-4-(-13)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -4 + (((tickAnim - 117) / 11) * (10-(-4)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 144) {
            xx = 10 + (((tickAnim - 128) / 16) * (4-(10)));
            yy = 0 + (((tickAnim - 128) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 16) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 159) {
            xx = 4 + (((tickAnim - 144) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 144) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (-17-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 101) {
            xx = -17 + (((tickAnim - 27) / 74) * (-17-(-17)));
            yy = 0 + (((tickAnim - 27) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 74) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -17 + (((tickAnim - 101) / 8) * (-4.5-(-17)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 124) {
            xx = -4.5 + (((tickAnim - 109) / 15) * (4.5-(-4.5)));
            yy = 0 + (((tickAnim - 109) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 15) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 4.5 + (((tickAnim - 124) / 4) * (0.5-(4.5)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 0.5 + (((tickAnim - 128) / 9) * (7.5-(0.5)));
            yy = 0 + (((tickAnim - 128) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 9) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 7.5 + (((tickAnim - 137) / 5) * (9.67-(7.5)));
            yy = 0 + (((tickAnim - 137) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 5) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 148) {
            xx = 9.67 + (((tickAnim - 142) / 6) * (0.83-(9.67)));
            yy = 0 + (((tickAnim - 142) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 6) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0.83 + (((tickAnim - 148) / 5) * (0-(0.83)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.60252-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.60097-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.05978-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.60252 + (((tickAnim - 6) / 5) * (1.14553-(0.60252)));
            yy = 0.60097 + (((tickAnim - 6) / 5) * (0.43216-(0.60097)));
            zz = -4.05978 + (((tickAnim - 6) / 5) * (-3.88871-(-4.05978)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.14553 + (((tickAnim - 11) / 4) * (-0.32406-(1.14553)));
            yy = 0.43216 + (((tickAnim - 11) / 4) * (-11.84141-(0.43216)));
            zz = -3.88871 + (((tickAnim - 11) / 4) * (-6.72711-(-3.88871)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -0.32406 + (((tickAnim - 15) / 4) * (1.90326-(-0.32406)));
            yy = -11.84141 + (((tickAnim - 15) / 4) * (-17.10152-(-11.84141)));
            zz = -6.72711 + (((tickAnim - 15) / 4) * (-7.94357-(-6.72711)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1.90326 + (((tickAnim - 19) / 5) * (-13.64209-(1.90326)));
            yy = -17.10152 + (((tickAnim - 19) / 5) * (-27.62172-(-17.10152)));
            zz = -7.94357 + (((tickAnim - 19) / 5) * (-10.37649-(-7.94357)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -13.64209 + (((tickAnim - 24) / 9) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 24) / 9) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 24) / 9) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -13.64209 + (((tickAnim - 33) / 68) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 33) / 68) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 33) / 68) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -13.64209 + (((tickAnim - 101) / 2) * (-5.02873-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 101) / 2) * (-19.51372-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 101) / 2) * (-9.35613-(-10.37649)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -5.02873 + (((tickAnim - 103) / 4) * (6.19131-(-5.02873)));
            yy = -19.51372 + (((tickAnim - 103) / 4) * (-7.35172-(-19.51372)));
            zz = -9.35613 + (((tickAnim - 103) / 4) * (-7.8256-(-9.35613)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 6.19131 + (((tickAnim - 107) / 2) * (-5.99533-(6.19131)));
            yy = -7.35172 + (((tickAnim - 107) / 2) * (0.75628-(-7.35172)));
            zz = -7.8256 + (((tickAnim - 107) / 2) * (-6.80525-(-7.8256)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = -5.99533 + (((tickAnim - 109) / 4) * (-1.19591-(-5.99533)));
            yy = 0.75628 + (((tickAnim - 109) / 4) * (-0.08461-(0.75628)));
            zz = -6.80525 + (((tickAnim - 109) / 4) * (-1.17794-(-6.80525)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -1.19591 + (((tickAnim - 113) / 3) * (2.84263-(-1.19591)));
            yy = -0.08461 + (((tickAnim - 113) / 3) * (0.6343-(-0.08461)));
            zz = -1.17794 + (((tickAnim - 113) / 3) * (-5.70763-(-1.17794)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 2.84263 + (((tickAnim - 116) / 9) * (7.69269-(2.84263)));
            yy = 0.6343 + (((tickAnim - 116) / 9) * (0.46353-(0.6343)));
            zz = -5.70763 + (((tickAnim - 116) / 9) * (-4.17096-(-5.70763)));
        }
        else if (tickAnim >= 125 && tickAnim < 153) {
            xx = 7.69269 + (((tickAnim - 125) / 28) * (0-(7.69269)));
            yy = 0.46353 + (((tickAnim - 125) / 28) * (0-(0.46353)));
            zz = -4.17096 + (((tickAnim - 125) / 28) * (0-(-4.17096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-23.06703-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.78822-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (4.92614-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -23.06703 + (((tickAnim - 11) / 4) * (-44.35657-(-23.06703)));
            yy = 4.78822 + (((tickAnim - 11) / 4) * (6.99957-(4.78822)));
            zz = 4.92614 + (((tickAnim - 11) / 4) * (5.93843-(4.92614)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -44.35657 + (((tickAnim - 15) / 4) * (-51.26637-(-44.35657)));
            yy = 6.99957 + (((tickAnim - 15) / 4) * (7.94729-(6.99957)));
            zz = 5.93843 + (((tickAnim - 15) / 4) * (6.37227-(5.93843)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -51.26637 + (((tickAnim - 19) / 5) * (-30.58598-(-51.26637)));
            yy = 7.94729 + (((tickAnim - 19) / 5) * (9.84273-(7.94729)));
            zz = 6.37227 + (((tickAnim - 19) / 5) * (7.23996-(6.37227)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -30.58598 + (((tickAnim - 24) / 9) * (-36.58598-(-30.58598)));
            yy = 9.84273 + (((tickAnim - 24) / 9) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 24) / 9) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.58598 + (((tickAnim - 33) / 68) * (-36.58598-(-36.58598)));
            yy = 9.84273 + (((tickAnim - 33) / 68) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 33) / 68) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -36.58598 + (((tickAnim - 101) / 2) * (-51.38064-(-36.58598)));
            yy = 9.84273 + (((tickAnim - 101) / 2) * (9.42463-(9.84273)));
            zz = 7.23996 + (((tickAnim - 101) / 2) * (7.63447-(7.23996)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -51.38064 + (((tickAnim - 103) / 4) * (-57.17264-(-51.38064)));
            yy = 9.42463 + (((tickAnim - 103) / 4) * (8.79749-(9.42463)));
            zz = 7.63447 + (((tickAnim - 103) / 4) * (8.22623-(7.63447)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = -57.17264 + (((tickAnim - 107) / 2) * (-49.3673-(-57.17264)));
            yy = 8.79749 + (((tickAnim - 107) / 2) * (8.37939-(8.79749)));
            zz = 8.22623 + (((tickAnim - 107) / 2) * (8.62074-(8.22623)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = -49.3673 + (((tickAnim - 109) / 7) * (-34.53387-(-49.3673)));
            yy = 8.37939 + (((tickAnim - 109) / 7) * (7.02788-(8.37939)));
            zz = 8.62074 + (((tickAnim - 109) / 7) * (7.2303-(8.62074)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = -34.53387 + (((tickAnim - 116) / 7) * (-25.9312-(-34.53387)));
            yy = 7.02788 + (((tickAnim - 116) / 7) * (5.67636-(7.02788)));
            zz = 7.2303 + (((tickAnim - 116) / 7) * (5.83986-(7.2303)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = -25.9312 + (((tickAnim - 123) / 30) * (0-(-25.9312)));
            yy = 5.67636 + (((tickAnim - 123) / 30) * (0-(5.67636)));
            zz = 5.83986 + (((tickAnim - 123) / 30) * (0-(5.83986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (18.54915-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.13563-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.28444-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18.54915 + (((tickAnim - 11) / 4) * (31.83041-(18.54915)));
            yy = 1.13563 + (((tickAnim - 11) / 4) * (-1.66184-(1.13563)));
            zz = -1.28444 + (((tickAnim - 11) / 4) * (1.3125-(-1.28444)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 31.83041 + (((tickAnim - 15) / 4) * (43.64142-(31.83041)));
            yy = -1.66184 + (((tickAnim - 15) / 4) * (-2.86076-(-1.66184)));
            zz = 1.3125 + (((tickAnim - 15) / 4) * (2.42547-(1.3125)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 43.64142 + (((tickAnim - 19) / 5) * (39.76345-(43.64142)));
            yy = -2.86076 + (((tickAnim - 19) / 5) * (-5.25859-(-2.86076)));
            zz = 2.42547 + (((tickAnim - 19) / 5) * (4.65142-(2.42547)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 39.76345 + (((tickAnim - 24) / 9) * (29.76345-(39.76345)));
            yy = -5.25859 + (((tickAnim - 24) / 9) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 24) / 9) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 29.76345 + (((tickAnim - 33) / 68) * (29.76345-(29.76345)));
            yy = -5.25859 + (((tickAnim - 33) / 68) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 33) / 68) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 29.76345 + (((tickAnim - 101) / 2) * (47.53418-(29.76345)));
            yy = -5.25859 + (((tickAnim - 101) / 2) * (-3.18832-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 101) / 2) * (2.68022-(4.65142)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = 47.53418 + (((tickAnim - 103) / 4) * (46.59028-(47.53418)));
            yy = -3.18832 + (((tickAnim - 103) / 4) * (-0.08292-(-3.18832)));
            zz = 2.68022 + (((tickAnim - 103) / 4) * (-0.27657-(2.68022)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 46.59028 + (((tickAnim - 107) / 2) * (35.96101-(46.59028)));
            yy = -0.08292 + (((tickAnim - 107) / 2) * (1.98735-(-0.08292)));
            zz = -0.27657 + (((tickAnim - 107) / 2) * (-2.24777-(-0.27657)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = 35.96101 + (((tickAnim - 109) / 7) * (27.64472-(35.96101)));
            yy = 1.98735 + (((tickAnim - 109) / 7) * (1.66681-(1.98735)));
            zz = -2.24777 + (((tickAnim - 109) / 7) * (-1.88523-(-2.24777)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 27.64472 + (((tickAnim - 116) / 7) * (18.63612-(27.64472)));
            yy = 1.66681 + (((tickAnim - 116) / 7) * (1.34627-(1.66681)));
            zz = -1.88523 + (((tickAnim - 116) / 7) * (-1.52268-(-1.88523)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = 18.63612 + (((tickAnim - 123) / 30) * (0-(18.63612)));
            yy = 1.34627 + (((tickAnim - 123) / 30) * (0-(1.34627)));
            zz = -1.52268 + (((tickAnim - 123) / 30) * (0-(-1.52268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*2), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*3), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-6.9713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-50))*1), Tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-50))*4), Tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-50))*3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-90))*5), Tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-90))*4), Tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-90))*3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(20.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/8-50))*10), Tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-50))*2), Tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-50))*2));



        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (2-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 2 + (((tickAnim - 117) / 11) * (2-(2)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (-1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (1-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (1-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 117) / 11) * (2-(1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 117) / 11) * (1-(1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.54777-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.72187-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.9817-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.54777 + (((tickAnim - 3) / 4) * (13.53998-(9.54777)));
            yy = -0.72187 + (((tickAnim - 3) / 4) * (-1.44374-(-0.72187)));
            zz = 2.9817 + (((tickAnim - 3) / 4) * (5.96341-(2.9817)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.53998 + (((tickAnim - 7) / 4) * (6.85189-(13.53998)));
            yy = -1.44374 + (((tickAnim - 7) / 4) * (19.75338-(-1.44374)));
            zz = 5.96341 + (((tickAnim - 7) / 4) * (9.26051-(5.96341)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 6.85189 + (((tickAnim - 11) / 7) * (-3.01808-(6.85189)));
            yy = 19.75338 + (((tickAnim - 11) / 7) * (22.1444-(19.75338)));
            zz = 9.26051 + (((tickAnim - 11) / 7) * (12.36935-(9.26051)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -3.01808 + (((tickAnim - 18) / 6) * (-12.87029-(-3.01808)));
            yy = 22.1444 + (((tickAnim - 18) / 6) * (24.59597-(22.1444)));
            zz = 12.36935 + (((tickAnim - 18) / 6) * (9.05791-(12.36935)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -12.87029 + (((tickAnim - 24) / 9) * (-15.87029-(-12.87029)));
            yy = 24.59597 + (((tickAnim - 24) / 9) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 24) / 9) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -15.87029 + (((tickAnim - 33) / 68) * (-15.87029-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 33) / 68) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 33) / 68) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -15.87029 + (((tickAnim - 101) / 5) * (-9.97519-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 101) / 5) * (24.69403-(24.59597)));
            zz = 9.05791 + (((tickAnim - 101) / 5) * (14.55832-(9.05791)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -9.97519 + (((tickAnim - 106) / 3) * (-3.87029-(-9.97519)));
            yy = 24.69403 + (((tickAnim - 106) / 3) * (24.59597-(24.69403)));
            zz = 14.55832 + (((tickAnim - 106) / 3) * (9.05791-(14.55832)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -3.87029 + (((tickAnim - 109) / 3) * (4.06514-(-3.87029)));
            yy = 24.59597 + (((tickAnim - 109) / 3) * (17.07198-(24.59597)));
            zz = 9.05791 + (((tickAnim - 109) / 3) * (7.87966-(9.05791)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 4.06514 + (((tickAnim - 112) / 1) * (13.00057-(4.06514)));
            yy = 17.07198 + (((tickAnim - 112) / 1) * (9.54798-(17.07198)));
            zz = 7.87966 + (((tickAnim - 112) / 1) * (6.7014-(7.87966)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 13.00057 + (((tickAnim - 113) / 4) * (3.90373-(13.00057)));
            yy = 9.54798 + (((tickAnim - 113) / 4) * (-1.73801-(9.54798)));
            zz = 6.7014 + (((tickAnim - 113) / 4) * (4.93402-(6.7014)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 3.90373 + (((tickAnim - 117) / 6) * (5.84189-(3.90373)));
            yy = -1.73801 + (((tickAnim - 117) / 6) * (-5.63614-(-1.73801)));
            zz = 4.93402 + (((tickAnim - 117) / 6) * (4.03284-(4.93402)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 5.84189 + (((tickAnim - 123) / 5) * (7.04552-(5.84189)));
            yy = -5.63614 + (((tickAnim - 123) / 5) * (-8.55973-(-5.63614)));
            zz = 4.03284 + (((tickAnim - 123) / 5) * (3.35695-(4.03284)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 7.04552 + (((tickAnim - 128) / 25) * (0-(7.04552)));
            yy = -8.55973 + (((tickAnim - 128) / 25) * (0-(-8.55973)));
            zz = 3.35695 + (((tickAnim - 128) / 25) * (0-(3.35695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-32.72492-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.90604-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.89938-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -32.72492 + (((tickAnim - 3) / 4) * (-37.00539-(-32.72492)));
            yy = 3.90604 + (((tickAnim - 3) / 4) * (7.81208-(3.90604)));
            zz = -1.89938 + (((tickAnim - 3) / 4) * (-3.79876-(-1.89938)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -37.00539 + (((tickAnim - 7) / 4) * (-17.35597-(-37.00539)));
            yy = 7.81208 + (((tickAnim - 7) / 4) * (12.69463-(7.81208)));
            zz = -3.79876 + (((tickAnim - 7) / 4) * (-6.17298-(-3.79876)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -17.35597 + (((tickAnim - 11) / 7) * (-29.29392-(-17.35597)));
            yy = 12.69463 + (((tickAnim - 11) / 7) * (4.36081-(12.69463)));
            zz = -6.17298 + (((tickAnim - 11) / 7) * (-3.65573-(-6.17298)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -29.29392 + (((tickAnim - 18) / 6) * (-31.72102-(-29.29392)));
            yy = 4.36081 + (((tickAnim - 18) / 6) * (-5.39515-(4.36081)));
            zz = -3.65573 + (((tickAnim - 18) / 6) * (-5.91574-(-3.65573)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -31.72102 + (((tickAnim - 24) / 9) * (-36.72102-(-31.72102)));
            yy = -5.39515 + (((tickAnim - 24) / 9) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 24) / 9) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.72102 + (((tickAnim - 33) / 68) * (-36.72102-(-36.72102)));
            yy = -5.39515 + (((tickAnim - 33) / 68) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 33) / 68) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -36.72102 + (((tickAnim - 101) / 5) * (-37.82447-(-36.72102)));
            yy = -5.39515 + (((tickAnim - 101) / 5) * (-3.85689-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 101) / 5) * (-4.63333-(-5.91574)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -37.82447 + (((tickAnim - 106) / 3) * (-48.72102-(-37.82447)));
            yy = -3.85689 + (((tickAnim - 106) / 3) * (-5.39515-(-3.85689)));
            zz = -4.63333 + (((tickAnim - 106) / 3) * (-5.91574-(-4.63333)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -48.72102 + (((tickAnim - 109) / 3) * (-55.57817-(-48.72102)));
            yy = -5.39515 + (((tickAnim - 109) / 3) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 109) / 3) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = -55.57817 + (((tickAnim - 112) / 1) * (-63.23531-(-55.57817)));
            yy = -5.39515 + (((tickAnim - 112) / 1) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 112) / 1) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = -63.23531 + (((tickAnim - 113) / 4) * (-34.72102-(-63.23531)));
            yy = -5.39515 + (((tickAnim - 113) / 4) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 113) / 4) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = -34.72102 + (((tickAnim - 117) / 6) * (-27.00674-(-34.72102)));
            yy = -5.39515 + (((tickAnim - 117) / 6) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 117) / 6) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -27.00674 + (((tickAnim - 123) / 5) * (-21.72102-(-27.00674)));
            yy = -5.39515 + (((tickAnim - 123) / 5) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 123) / 5) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -21.72102 + (((tickAnim - 128) / 25) * (0-(-21.72102)));
            yy = -5.39515 + (((tickAnim - 128) / 25) * (0-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 128) / 25) * (0-(-5.91574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18.72111-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.14292-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04603-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 18.72111 + (((tickAnim - 3) / 4) * (45.3311-(18.72111)));
            yy = -0.14292 + (((tickAnim - 3) / 4) * (-0.28584-(-0.14292)));
            zz = -0.04603 + (((tickAnim - 3) / 4) * (-0.09206-(-0.04603)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 45.3311 + (((tickAnim - 7) / 4) * (12.8436-(45.3311)));
            yy = -0.28584 + (((tickAnim - 7) / 4) * (-0.4645-(-0.28584)));
            zz = -0.09206 + (((tickAnim - 7) / 4) * (-0.1496-(-0.09206)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12.8436 + (((tickAnim - 11) / 7) * (29.97238-(12.8436)));
            yy = -0.4645 + (((tickAnim - 11) / 7) * (1.09866-(-0.4645)));
            zz = -0.1496 + (((tickAnim - 11) / 7) * (-1.13942-(-0.1496)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 29.97238 + (((tickAnim - 18) / 6) * (37.96143-(29.97238)));
            yy = 1.09866 + (((tickAnim - 18) / 6) * (2.31445-(1.09866)));
            zz = -1.13942 + (((tickAnim - 18) / 6) * (-1.90927-(-1.13942)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 37.96143 + (((tickAnim - 24) / 9) * (37.84544-(37.96143)));
            yy = 2.31445 + (((tickAnim - 24) / 9) * (4.62632-(2.31445)));
            zz = -1.90927 + (((tickAnim - 24) / 9) * (-3.82479-(-1.90927)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 37.84544 + (((tickAnim - 33) / 68) * (37.84544-(37.84544)));
            yy = 4.62632 + (((tickAnim - 33) / 68) * (4.62632-(4.62632)));
            zz = -3.82479 + (((tickAnim - 33) / 68) * (-3.82479-(-3.82479)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 37.84544 + (((tickAnim - 101) / 5) * (37.78945-(37.84544)));
            yy = 4.62632 + (((tickAnim - 101) / 5) * (5.39592-(4.62632)));
            zz = -3.82479 + (((tickAnim - 101) / 5) * (-4.46577-(-3.82479)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 37.78945 + (((tickAnim - 106) / 3) * (37.84544-(37.78945)));
            yy = 5.39592 + (((tickAnim - 106) / 3) * (4.62632-(5.39592)));
            zz = -4.46577 + (((tickAnim - 106) / 3) * (-3.82479-(-4.46577)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = 37.84544 + (((tickAnim - 109) / 3) * (16.74675-(37.84544)));
            yy = 4.62632 + (((tickAnim - 109) / 3) * (3.30451-(4.62632)));
            zz = -3.82479 + (((tickAnim - 109) / 3) * (-2.73199-(-3.82479)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 16.74675 + (((tickAnim - 112) / 1) * (44.84805-(16.74675)));
            yy = 3.30451 + (((tickAnim - 112) / 1) * (1.98271-(3.30451)));
            zz = -2.73199 + (((tickAnim - 112) / 1) * (-1.6392-(-2.73199)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 44.84805 + (((tickAnim - 113) / 4) * (27-(44.84805)));
            yy = 1.98271 + (((tickAnim - 113) / 4) * (0-(1.98271)));
            zz = -1.6392 + (((tickAnim - 113) / 4) * (0-(-1.6392)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 27 + (((tickAnim - 117) / 6) * (20.29-(27)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 20.29 + (((tickAnim - 123) / 5) * (13-(20.29)));
            yy = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 5) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 13 + (((tickAnim - 128) / 25) * (0-(13)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 17.5 + (((tickAnim - 58) / 7) * (1.22-(17.5)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 1.22 + (((tickAnim - 65) / 10) * (13.59-(1.22)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 13.59 + (((tickAnim - 75) / 7) * (2.52-(13.59)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 2.52 + (((tickAnim - 82) / 7) * (12.28-(2.52)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 7) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 107) {
            xx = 12.28 + (((tickAnim - 89) / 18) * (1.75-(12.28)));
            yy = 0 + (((tickAnim - 89) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 18) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 160) {
            xx = 1.75 + (((tickAnim - 107) / 53) * (0-(1.75)));
            yy = 0 + (((tickAnim - 107) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 7.5 + (((tickAnim - 21) / 7) * (6.88-(7.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 6.88 + (((tickAnim - 28) / 7) * (9.38-(6.88)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 9.38 + (((tickAnim - 35) / 6) * (12.5-(9.38)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 41) / 19) * (0-(12.5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 2.5 + (((tickAnim - 21) / 7) * (4.06-(2.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 4.06 + (((tickAnim - 28) / 7) * (-0.94-(4.06)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -0.94 + (((tickAnim - 35) / 6) * (0-(-0.94)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 2.5 + (((tickAnim - 21) / 7) * (-1.87-(2.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -1.87 + (((tickAnim - 28) / 7) * (0.63-(-1.87)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0.63 + (((tickAnim - 35) / 6) * (-2.5-(0.63)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 41) / 19) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -7.5 + (((tickAnim - 21) / 7) * (-5.94-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -5.94 + (((tickAnim - 28) / 7) * (-13.44-(-5.94)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -13.44 + (((tickAnim - 35) / 6) * (-10-(-13.44)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 41) / 19) * (0-(-10)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 41) {
            xx = -7.5 + (((tickAnim - 21) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 20) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 41) / 19) * (0-(-5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-4.1-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -4.1 + (((tickAnim - 11) / 10) * (-17.5-(-4.1)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 41) {
            xx = -17.5 + (((tickAnim - 21) / 20) * (-12.5-(-17.5)));
            yy = 0 + (((tickAnim - 21) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 20) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 41) / 9) * (8.48-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 8.48 + (((tickAnim - 50) / 10) * (0-(8.48)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 12.5 + (((tickAnim - 26) / 6) * (10.14-(12.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 10.14 + (((tickAnim - 32) / 6) * (8.69-(10.14)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 8.69 + (((tickAnim - 38) / 3) * (0-(8.69)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 20) / 15) * (2.5-(-5)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.5 + (((tickAnim - 35) / 15) * (5-(2.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 5 + (((tickAnim - 50) / 13) * (0.28-(5)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 0.28 + (((tickAnim - 63) / 17) * (0-(0.28)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = -7.5 + (((tickAnim - 20) / 18) * (3.75-(-7.5)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 3.75 + (((tickAnim - 38) / 12) * (7.5-(3.75)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            yy = 7.5 + (((tickAnim - 50) / 16) * (6.04-(7.5)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 6.04 + (((tickAnim - 66) / 14) * (0-(6.04)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = -2.5 + (((tickAnim - 22) / 31) * (2.5-(-2.5)));
            yy = -7.5 + (((tickAnim - 22) / 31) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 31) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 53) / 27) * (0-(2.5)));
            yy = 7.5 + (((tickAnim - 53) / 27) * (0-(7.5)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -5 + (((tickAnim - 22) / 33) * (5-(-5)));
            yy = -7.5 + (((tickAnim - 22) / 33) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 55) / 25) * (0-(5)));
            yy = 7.5 + (((tickAnim - 55) / 25) * (0-(7.5)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 57) {
            xx = -5 + (((tickAnim - 23) / 34) * (5-(-5)));
            yy = -7.5 + (((tickAnim - 23) / 34) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 23) / 34) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 57) / 23) * (0-(5)));
            yy = 7.5 + (((tickAnim - 57) / 23) * (0-(7.5)));
            zz = 0 + (((tickAnim - 57) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 59) {
            xx = -5 + (((tickAnim - 26) / 33) * (10-(-5)));
            yy = -7.5 + (((tickAnim - 26) / 33) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 26) / 33) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 59) / 21) * (0-(10)));
            yy = 7.5 + (((tickAnim - 59) / 21) * (0-(7.5)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 28) / 33) * (0-(0)));
            yy = -10 + (((tickAnim - 28) / 33) * (10-(-10)));
            zz = 0 + (((tickAnim - 28) / 33) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 61) / 19) * (0-(0)));
            yy = 10 + (((tickAnim - 61) / 19) * (0-(10)));
            zz = 0 + (((tickAnim - 61) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailclub, Tailclub.rotateAngleX + (float) Math.toRadians(xx), Tailclub.rotateAngleY + (float) Math.toRadians(yy), Tailclub.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShunosaurus entity = (EntityPrehistoricFloraShunosaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 13) / 20) * (-4.59122-(-5)));
            yy = 0 + (((tickAnim - 13) / 20) * (11.16508-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (-0.29609-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 66) {
            xx = -4.59122 + (((tickAnim - 33) / 33) * (-4.59122-(-4.59122)));
            yy = 11.16508 + (((tickAnim - 33) / 33) * (11.16508-(11.16508)));
            zz = -0.29609 + (((tickAnim - 33) / 33) * (-0.29609-(-0.29609)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = -4.59122 + (((tickAnim - 66) / 27) * (-4.94249-(-4.59122)));
            yy = 11.16508 + (((tickAnim - 66) / 27) * (-3.94776-(11.16508)));
            zz = -0.29609 + (((tickAnim - 66) / 27) * (2.30681-(-0.29609)));
        }
        else if (tickAnim >= 93 && tickAnim < 138) {
            xx = -4.94249 + (((tickAnim - 93) / 45) * (-4.94249-(-4.94249)));
            yy = -3.94776 + (((tickAnim - 93) / 45) * (-3.94776-(-3.94776)));
            zz = 2.30681 + (((tickAnim - 93) / 45) * (2.30681-(2.30681)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = -4.94249 + (((tickAnim - 138) / 22) * (0-(-4.94249)));
            yy = -3.94776 + (((tickAnim - 138) / 22) * (0-(-3.94776)));
            zz = 2.30681 + (((tickAnim - 138) / 22) * (0-(2.30681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 13) / 20) * (-9.75256-(-5)));
            yy = 0 + (((tickAnim - 13) / 20) * (17.50143-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (6.0115-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 66) {
            xx = -9.75256 + (((tickAnim - 33) / 33) * (-9.75256-(-9.75256)));
            yy = 17.50143 + (((tickAnim - 33) / 33) * (17.50143-(17.50143)));
            zz = 6.0115 + (((tickAnim - 33) / 33) * (6.0115-(6.0115)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = -9.75256 + (((tickAnim - 66) / 27) * (-3.58068-(-9.75256)));
            yy = 17.50143 + (((tickAnim - 66) / 27) * (-13.89631-(17.50143)));
            zz = 6.0115 + (((tickAnim - 66) / 27) * (-4.81607-(6.0115)));
        }
        else if (tickAnim >= 93 && tickAnim < 138) {
            xx = -3.58068 + (((tickAnim - 93) / 45) * (-3.58068-(-3.58068)));
            yy = -13.89631 + (((tickAnim - 93) / 45) * (-13.89631-(-13.89631)));
            zz = -4.81607 + (((tickAnim - 93) / 45) * (-4.81607-(-4.81607)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = -3.58068 + (((tickAnim - 138) / 22) * (0-(-3.58068)));
            yy = -13.89631 + (((tickAnim - 138) / 22) * (0-(-13.89631)));
            zz = -4.81607 + (((tickAnim - 138) / 22) * (0-(-4.81607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 13) / 20) * (-4.16664-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (17.78154-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (14.8514-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = -4.16664 + (((tickAnim - 33) / 14) * (-6.46282-(-4.16664)));
            yy = 17.78154 + (((tickAnim - 33) / 14) * (16.61098-(17.78154)));
            zz = 14.8514 + (((tickAnim - 33) / 14) * (7.09597-(14.8514)));
        }
        else if (tickAnim >= 47 && tickAnim < 66) {
            xx = -6.46282 + (((tickAnim - 47) / 19) * (-4.16664-(-6.46282)));
            yy = 16.61098 + (((tickAnim - 47) / 19) * (17.78154-(16.61098)));
            zz = 7.09597 + (((tickAnim - 47) / 19) * (14.8514-(7.09597)));
        }
        else if (tickAnim >= 66 && tickAnim < 83) {
            xx = -4.16664 + (((tickAnim - 66) / 17) * (-2.15699-(-4.16664)));
            yy = 17.78154 + (((tickAnim - 66) / 17) * (0.86858-(17.78154)));
            zz = 14.8514 + (((tickAnim - 66) / 17) * (-2.36986-(14.8514)));
        }
        else if (tickAnim >= 83 && tickAnim < 93) {
            xx = -2.15699 + (((tickAnim - 83) / 10) * (-4.97572-(-2.15699)));
            yy = 0.86858 + (((tickAnim - 83) / 10) * (-10.12484-(0.86858)));
            zz = -2.36986 + (((tickAnim - 83) / 10) * (-13.56368-(-2.36986)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -4.97572 + (((tickAnim - 93) / 22) * (-6.16144-(-4.97572)));
            yy = -10.12484 + (((tickAnim - 93) / 22) * (-6.45463-(-10.12484)));
            zz = -13.56368 + (((tickAnim - 93) / 22) * (-6.48884-(-13.56368)));
        }
        else if (tickAnim >= 115 && tickAnim < 138) {
            xx = -6.16144 + (((tickAnim - 115) / 23) * (-4.97572-(-6.16144)));
            yy = -6.45463 + (((tickAnim - 115) / 23) * (-10.12484-(-6.45463)));
            zz = -6.48884 + (((tickAnim - 115) / 23) * (-13.56368-(-6.48884)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = -4.97572 + (((tickAnim - 138) / 22) * (0-(-4.97572)));
            yy = -10.12484 + (((tickAnim - 138) / 22) * (0-(-10.12484)));
            zz = -13.56368 + (((tickAnim - 138) / 22) * (0-(-13.56368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -12.5 + (((tickAnim - 13) / 20) * (-5.34463-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (10.0013-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (14.27031-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = -5.34463 + (((tickAnim - 33) / 14) * (-6.245-(-5.34463)));
            yy = 10.0013 + (((tickAnim - 33) / 14) * (5.13412-(10.0013)));
            zz = 14.27031 + (((tickAnim - 33) / 14) * (9.10044-(14.27031)));
        }
        else if (tickAnim >= 47 && tickAnim < 66) {
            xx = -6.245 + (((tickAnim - 47) / 19) * (-5.34463-(-6.245)));
            yy = 5.13412 + (((tickAnim - 47) / 19) * (10.0013-(5.13412)));
            zz = 9.10044 + (((tickAnim - 47) / 19) * (14.27031-(9.10044)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = -5.34463 + (((tickAnim - 66) / 12) * (-5.73321-(-5.34463)));
            yy = 10.0013 + (((tickAnim - 66) / 12) * (0.45246-(10.0013)));
            zz = 14.27031 + (((tickAnim - 66) / 12) * (2.14186-(14.27031)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -5.73321 + (((tickAnim - 78) / 15) * (-0.6995-(-5.73321)));
            yy = 0.45246 + (((tickAnim - 78) / 15) * (-11.00615-(0.45246)));
            zz = 2.14186 + (((tickAnim - 78) / 15) * (-12.41227-(2.14186)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -0.6995 + (((tickAnim - 93) / 22) * (-3.32163-(-0.6995)));
            yy = -11.00615 + (((tickAnim - 93) / 22) * (-7.18205-(-11.00615)));
            zz = -12.41227 + (((tickAnim - 93) / 22) * (0.64813-(-12.41227)));
        }
        else if (tickAnim >= 115 && tickAnim < 138) {
            xx = -3.32163 + (((tickAnim - 115) / 23) * (-0.6995-(-3.32163)));
            yy = -7.18205 + (((tickAnim - 115) / 23) * (-11.00615-(-7.18205)));
            zz = 0.64813 + (((tickAnim - 115) / 23) * (-12.41227-(0.64813)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = -0.6995 + (((tickAnim - 138) / 22) * (0-(-0.6995)));
            yy = -11.00615 + (((tickAnim - 138) / 22) * (0-(-11.00615)));
            zz = -12.41227 + (((tickAnim - 138) / 22) * (0-(-12.41227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 13) / 20) * (-6.88113-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (4.1624-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (7.99337-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 66) {
            xx = -6.88113 + (((tickAnim - 33) / 33) * (-6.88113-(-6.88113)));
            yy = 4.1624 + (((tickAnim - 33) / 33) * (4.1624-(4.1624)));
            zz = 7.99337 + (((tickAnim - 33) / 33) * (7.99337-(7.99337)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = -6.88113 + (((tickAnim - 66) / 27) * (-7.22187-(-6.88113)));
            yy = 4.1624 + (((tickAnim - 66) / 27) * (-6.50956-(4.1624)));
            zz = 7.99337 + (((tickAnim - 66) / 27) * (-9.994-(7.99337)));
        }
        else if (tickAnim >= 93 && tickAnim < 138) {
            xx = -7.22187 + (((tickAnim - 93) / 45) * (-7.22187-(-7.22187)));
            yy = -6.50956 + (((tickAnim - 93) / 45) * (-6.50956-(-6.50956)));
            zz = -9.994 + (((tickAnim - 93) / 45) * (-9.994-(-9.994)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = -7.22187 + (((tickAnim - 138) / 22) * (0-(-7.22187)));
            yy = -6.50956 + (((tickAnim - 138) / 22) * (0-(-6.50956)));
            zz = -9.994 + (((tickAnim - 138) / 22) * (0-(-9.994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 20 + (((tickAnim - 13) / 31) * (13.85-(20)));
            yy = 0 + (((tickAnim - 13) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 93) {
            xx = 13.85 + (((tickAnim - 44) / 49) * (22.5-(13.85)));
            yy = 0 + (((tickAnim - 44) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 49) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 138) {
            xx = 22.5 + (((tickAnim - 93) / 45) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 93) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 45) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 22.5 + (((tickAnim - 138) / 22) * (0-(22.5)));
            yy = 0 + (((tickAnim - 138) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(xx), Throatpouch.rotateAngleY + (float) Math.toRadians(yy), Throatpouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = -15 + (((tickAnim - 13) / 26) * (-20.02147-(-15)));
            yy = 0 + (((tickAnim - 13) / 26) * (-0.49424-(0)));
            zz = 0 + (((tickAnim - 13) / 26) * (4.97557-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 63) {
            xx = -20.02147 + (((tickAnim - 39) / 24) * (-8.40089-(-20.02147)));
            yy = -0.49424 + (((tickAnim - 39) / 24) * (-0.37448-(-0.49424)));
            zz = 4.97557 + (((tickAnim - 39) / 24) * (3.76995-(4.97557)));
        }
        else if (tickAnim >= 63 && tickAnim < 93) {
            xx = -8.40089 + (((tickAnim - 63) / 30) * (-16.25939-(-8.40089)));
            yy = -0.37448 + (((tickAnim - 63) / 30) * (-0.21623-(-0.37448)));
            zz = 3.76995 + (((tickAnim - 63) / 30) * (2.17681-(3.76995)));
        }
        else if (tickAnim >= 93 && tickAnim < 108) {
            xx = -16.25939 + (((tickAnim - 93) / 15) * (-9.77223-(-16.25939)));
            yy = -0.21623 + (((tickAnim - 93) / 15) * (-2.62349-(-0.21623)));
            zz = 2.17681 + (((tickAnim - 93) / 15) * (14.44751-(2.17681)));
        }
        else if (tickAnim >= 108 && tickAnim < 138) {
            xx = -9.77223 + (((tickAnim - 108) / 30) * (3.74061-(-9.77223)));
            yy = -2.62349 + (((tickAnim - 108) / 30) * (-0.21623-(-2.62349)));
            zz = 14.44751 + (((tickAnim - 108) / 30) * (2.17681-(14.44751)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 3.74061 + (((tickAnim - 138) / 22) * (0-(3.74061)));
            yy = -0.21623 + (((tickAnim - 138) / 22) * (0-(-0.21623)));
            zz = 2.17681 + (((tickAnim - 138) / 22) * (0-(2.17681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 41) / 31) * (5-(0)));
            yy = 0 + (((tickAnim - 41) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 31) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 99) {
            xx = 5 + (((tickAnim - 72) / 27) * (7.5-(5)));
            yy = 0 + (((tickAnim - 72) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 27) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 127) {
            xx = 7.5 + (((tickAnim - 99) / 28) * (0-(7.5)));
            yy = 0 + (((tickAnim - 99) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 28) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraShunosaurus e = (EntityPrehistoricFloraShunosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(10);

    }
}
