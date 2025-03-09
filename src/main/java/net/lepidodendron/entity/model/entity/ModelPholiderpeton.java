package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPholiderpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPholiderpeton extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawmidbase;
    private final AdvancedModelRenderer Lowerjawmidfront;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawslopefront;
    private final AdvancedModelRenderer Lowerfrontteeth;
    private final AdvancedModelRenderer Lowerjawslopemiddle;
    private final AdvancedModelRenderer Leftlowerteeth;
    private final AdvancedModelRenderer Rightlowerteeth;
    private final AdvancedModelRenderer Lowerjawslopeback;
    private final AdvancedModelRenderer Lowerjawslopeback2;
    private final AdvancedModelRenderer jawslope;
    private final AdvancedModelRenderer jawslope6;
    private final AdvancedModelRenderer jawslope2;
    private final AdvancedModelRenderer jawslope5;
    private final AdvancedModelRenderer jawslope3;
    private final AdvancedModelRenderer jawslope4;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Snoutfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer skullslope;
    private final AdvancedModelRenderer skullslope4;
    private final AdvancedModelRenderer skullslope2;
    private final AdvancedModelRenderer skullslope5;
    private final AdvancedModelRenderer skullslope3;
    private final AdvancedModelRenderer skullslope6;
    private final AdvancedModelRenderer Snoutmiddle;
    private final AdvancedModelRenderer Leftupperteeth;
    private final AdvancedModelRenderer Rightupperteeth;
    private final AdvancedModelRenderer Snoutbase;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Shoulderslope;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmidend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinmidbase;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Hipslope;
    private final AdvancedModelRenderer Hipslope2;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;

    private ModelAnimator animator;

    public ModelPholiderpeton() {
        this.textureWidth = 132;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 17.0F, 24.0F);
        this.root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 28, -4.0F, -1.0F, -8.0F, 8, 7, 12, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 5, 33, -4.0F, -1.0F, -15.0F, 8, 7, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.9F, -14.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0213F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 69, -5.0F, -3.0F, -21.0F, 10, 10, 21, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.3F, -20.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0213F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 2, 50, -4.5F, -1.5F, -10.0F, 9, 8, 10, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.6F, -10.0F);
        this.Bodyfront.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 9, 37, -4.0F, -2.9F, -2.0F, 8, 7, 3, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.15F, -2.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0436F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 112, 0, -3.5F, -3.0F, -2.1F, 7, 3, 3, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, -0.0262F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 112, 51, -3.5F, 0.0F, -3.1F, 7, 3, 3, -0.01F, false));

        this.Lowerjawmidbase = new AdvancedModelRenderer(this);
        this.Lowerjawmidbase.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.Lowerjawback.addChild(Lowerjawmidbase);
        this.setRotateAngle(Lowerjawmidbase, 0.0213F, 0.0F, 0.0F);
        this.Lowerjawmidbase.cubeList.add(new ModelBox(Lowerjawmidbase, 116, 88, -2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F, false));

        this.Lowerjawmidfront = new AdvancedModelRenderer(this);
        this.Lowerjawmidfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmidbase.addChild(Lowerjawmidfront);
        this.Lowerjawmidfront.cubeList.add(new ModelBox(Lowerjawmidfront, 122, 85, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Lowerjawmidfront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 122, 82, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Lowerjawslopefront = new AdvancedModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, 1.075F, 0.0F);
        this.Lowerjawfront.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.4269F, 0.0F, 0.0F);
        this.Lowerjawslopefront.cubeList.add(new ModelBox(Lowerjawslopefront, 120, 70, -1.5F, -1.15F, -2.75F, 3, 1, 3, 0.01F, false));

        this.Lowerfrontteeth = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.5F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 20, 19, -1.5F, -1.0F, 0.5F, 3, 1, 0, 0.0F, false));

        this.Lowerjawslopemiddle = new AdvancedModelRenderer(this);
        this.Lowerjawslopemiddle.setRotationPoint(-0.01F, 2.6F, 0.05F);
        this.Lowerjawmidfront.addChild(Lowerjawslopemiddle);
        this.setRotateAngle(Lowerjawslopemiddle, -0.3005F, 0.0F, 0.0F);
        this.Lowerjawslopemiddle.cubeList.add(new ModelBox(Lowerjawslopemiddle, 122, 79, -1.49F, -1.0F, -1.9F, 3, 1, 2, 0.0F, false));

        this.Leftlowerteeth = new AdvancedModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-1.95F, 0.5F, -0.5F);
        this.Lowerjawmidfront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.2347F, 0.0F);
        this.Leftlowerteeth.cubeList.add(new ModelBox(Leftlowerteeth, 23, 17, 0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(1.95F, 0.5F, -0.5F);
        this.Lowerjawmidfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.2347F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 20, 14, 0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Lowerjawslopeback = new AdvancedModelRenderer(this);
        this.Lowerjawslopeback.setRotationPoint(0.0F, 1.375F, -0.075F);
        this.Lowerjawmidbase.addChild(Lowerjawslopeback);
        this.setRotateAngle(Lowerjawslopeback, -0.21F, 0.0F, 0.0F);
        this.Lowerjawslopeback.cubeList.add(new ModelBox(Lowerjawslopeback, 116, 74, -2.0F, 0.9561F, -2.5832F, 4, 1, 4, 0.0F, false));
        this.Lowerjawslopeback.cubeList.add(new ModelBox(Lowerjawslopeback, 116, 74, -2.0F, -0.0439F, -2.5832F, 4, 1, 4, 0.0F, false));

        this.Lowerjawslopeback2 = new AdvancedModelRenderer(this);
        this.Lowerjawslopeback2.setRotationPoint(0.0F, 1.9311F, 4.1668F);
        this.Lowerjawslopeback.addChild(Lowerjawslopeback2);
        this.setRotateAngle(Lowerjawslopeback2, 0.03F, 0.0F, 0.0F);
        this.Lowerjawslopeback2.cubeList.add(new ModelBox(Lowerjawslopeback2, 117, 75, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.jawslope = new AdvancedModelRenderer(this);
        this.jawslope.setRotationPoint(-2.725F, 2.1F, -5.95F);
        this.Lowerjawback.addChild(jawslope);
        this.setRotateAngle(jawslope, 0.0F, -0.2225F, 0.0F);
        this.jawslope.cubeList.add(new ModelBox(jawslope, 120, 57, 0.025F, -2.0F, -1.075F, 2, 2, 4, 0.0F, false));

        this.jawslope6 = new AdvancedModelRenderer(this);
        this.jawslope6.setRotationPoint(2.725F, 2.1F, -5.95F);
        this.Lowerjawback.addChild(jawslope6);
        this.setRotateAngle(jawslope6, 0.0F, 0.2225F, 0.0F);
        this.jawslope6.cubeList.add(new ModelBox(jawslope6, 120, 57, -2.025F, -2.0F, -1.075F, 2, 2, 4, 0.0F, true));

        this.jawslope2 = new AdvancedModelRenderer(this);
        this.jawslope2.setRotationPoint(-2.225F, 2.1F, -7.875F);
        this.Lowerjawback.addChild(jawslope2);
        this.setRotateAngle(jawslope2, 0.0F, -0.2793F, 0.0F);
        this.jawslope2.cubeList.add(new ModelBox(jawslope2, 124, 63, 0.025F, -2.0F, -1.075F, 2, 2, 2, 0.0F, false));

        this.jawslope5 = new AdvancedModelRenderer(this);
        this.jawslope5.setRotationPoint(2.225F, 2.1F, -7.875F);
        this.Lowerjawback.addChild(jawslope5);
        this.setRotateAngle(jawslope5, 0.0F, 0.2793F, 0.0F);
        this.jawslope5.cubeList.add(new ModelBox(jawslope5, 124, 63, -2.025F, -2.0F, -1.075F, 2, 2, 2, 0.0F, true));

        this.jawslope3 = new AdvancedModelRenderer(this);
        this.jawslope3.setRotationPoint(-1.4F, 1.1F, -10.725F);
        this.Lowerjawback.addChild(jawslope3);
        this.setRotateAngle(jawslope3, 0.0F, -0.2836F, 0.0F);
        this.jawslope3.cubeList.add(new ModelBox(jawslope3, 124, 67, 0.025F, -1.0F, -0.075F, 2, 1, 2, 0.0F, false));

        this.jawslope4 = new AdvancedModelRenderer(this);
        this.jawslope4.setRotationPoint(1.4F, 1.1F, -10.725F);
        this.Lowerjawback.addChild(jawslope4);
        this.setRotateAngle(jawslope4, 0.0F, 0.2836F, 0.0F);
        this.jawslope4.cubeList.add(new ModelBox(jawslope4, 124, 67, -2.025F, -1.0F, -0.075F, 2, 1, 2, 0.0F, true));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.1F, -3.95F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.6369F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 114, 45, -3.0F, -3.0F, 0.0F, 6, 3, 3, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Head.addChild(Upperjawbase);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 102, 16, -2.0F, 1.0F, -3.0F, 4, 2, 4, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Upperjawbase.addChild(Upperjawmiddle);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 122, 24, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 126, 22, -1.0F, -1.0F, -0.95F, 2, 1, 1, 0.01F, false));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 122, 19, -1.5F, -1.0F, -2.95F, 3, 1, 2, 0.02F, false));

        this.Snoutfront = new AdvancedModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.0F, -1.97F, -0.3F);
        this.Upperjawfront.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, 0.3496F, 0.0F, 0.0F);
        this.Snoutfront.cubeList.add(new ModelBox(Snoutfront, 122, 33, -1.0F, 0.025F, -2.675F, 2, 1, 3, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 27, 19, -1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.skullslope = new AdvancedModelRenderer(this);
        this.skullslope.setRotationPoint(-1.4F, 0.1F, -1.725F);
        this.Upperjawfront.addChild(skullslope);
        this.setRotateAngle(skullslope, 0.0F, -0.2836F, 0.0F);
        this.skullslope.cubeList.add(new ModelBox(skullslope, 124, 16, 0.0F, -1.1F, -0.075F, 2, 1, 2, 0.0F, false));

        this.skullslope4 = new AdvancedModelRenderer(this);
        this.skullslope4.setRotationPoint(1.4F, 0.1F, -1.725F);
        this.Upperjawfront.addChild(skullslope4);
        this.setRotateAngle(skullslope4, 0.0F, 0.2836F, 0.0F);
        this.skullslope4.cubeList.add(new ModelBox(skullslope4, 124, 16, -2.0F, -1.1F, -0.075F, 2, 1, 2, 0.0F, true));

        this.skullslope2 = new AdvancedModelRenderer(this);
        this.skullslope2.setRotationPoint(-2.225F, 0.1F, 1.125F);
        this.Upperjawfront.addChild(skullslope2);
        this.setRotateAngle(skullslope2, 0.0F, -0.2793F, 0.0F);
        this.skullslope2.cubeList.add(new ModelBox(skullslope2, 124, 12, 0.0006F, -2.1F, -1.073F, 2, 2, 2, 0.0F, false));

        this.skullslope5 = new AdvancedModelRenderer(this);
        this.skullslope5.setRotationPoint(2.225F, 0.1F, 1.125F);
        this.Upperjawfront.addChild(skullslope5);
        this.setRotateAngle(skullslope5, 0.0F, 0.2793F, 0.0F);
        this.skullslope5.cubeList.add(new ModelBox(skullslope5, 124, 12, -2.0006F, -2.1F, -1.073F, 2, 2, 2, 0.0F, true));

        this.skullslope3 = new AdvancedModelRenderer(this);
        this.skullslope3.setRotationPoint(-2.725F, 0.1F, 3.05F);
        this.Upperjawfront.addChild(skullslope3);
        this.setRotateAngle(skullslope3, 0.0F, -0.2225F, 0.0F);
        this.skullslope3.cubeList.add(new ModelBox(skullslope3, 120, 6, 0.0005F, -2.1F, -1.0729F, 2, 2, 4, 0.0F, false));

        this.skullslope6 = new AdvancedModelRenderer(this);
        this.skullslope6.setRotationPoint(2.725F, 0.1F, 3.05F);
        this.Upperjawfront.addChild(skullslope6);
        this.setRotateAngle(skullslope6, 0.0F, 0.2225F, 0.0F);
        this.skullslope6.cubeList.add(new ModelBox(skullslope6, 120, 6, -2.0005F, -2.1F, -1.0729F, 2, 2, 4, 0.0F, true));

        this.Snoutmiddle = new AdvancedModelRenderer(this);
        this.Snoutmiddle.setRotationPoint(0.0F, -0.525F, 0.0F);
        this.Upperjawmiddle.addChild(Snoutmiddle);
        this.setRotateAngle(Snoutmiddle, 0.2281F, 0.0F, 0.0F);
        this.Snoutmiddle.cubeList.add(new ModelBox(Snoutmiddle, 124, 37, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Leftupperteeth = new AdvancedModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-1.95F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.2784F, 0.0F);
        this.Leftupperteeth.cubeList.add(new ModelBox(Leftupperteeth, 23, 19, 0.0F, 0.0F, -3.15F, 0, 1, 7, 0.0F, false));

        this.Rightupperteeth = new AdvancedModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(1.95F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.2784F, 0.0F);
        this.Rightupperteeth.cubeList.add(new ModelBox(Rightupperteeth, 23, 19, 0.0F, 0.0F, -3.15F, 0, 1, 7, 0.0F, true));

        this.Snoutbase = new AdvancedModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, 0.125F, -0.25F);
        this.Upperjawbase.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.1136F, 0.0F, 0.0F);
        this.Snoutbase.cubeList.add(new ModelBox(Snoutbase, 118, 40, -1.5F, 0.0F, -2.8F, 3, 1, 4, -0.01F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-0.1F, 1.6F, 0.2F);
        this.Upperjawbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.0F, 0.1698F, 0.3396F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 0, 34, -2.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(0.1F, 1.6F, 0.2F);
        this.Upperjawbase.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0F, -0.1698F, -0.3396F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 0, 28, 0.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.Shoulderslope = new AdvancedModelRenderer(this);
        this.Shoulderslope.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.Bodyfront.addChild(Shoulderslope);
        this.setRotateAngle(Shoulderslope, 0.2033F, 0.0F, 0.0F);
        this.Shoulderslope.cubeList.add(new ModelBox(Shoulderslope, 31, 28, -4.0F, 0.0F, -9.0F, 8, 2, 9, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.5F, 4.0F, -7.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.0F, 0.2759F, 0.322F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 71, 20, -4.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.4458F, -0.1698F, 0.0389F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 92, 19, -0.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.5F, 3.8F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.3821F, 0.1698F, -0.3183F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 57, 18, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.5F, 4.0F, -7.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.0217F, -0.2717F, -0.3279F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 81, 27, -0.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.4458F, 0.1698F, -0.0389F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 85, 13, -1.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.5F, 3.8F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.3821F, -0.1698F, 0.3183F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 70, 9, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.9F, 3.0F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 42, 73, -3.0F, -2.0F, 0.0F, 6, 6, 10, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.4F, 9.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 43, 57, -2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.4F, 9.0F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 65, 87, -1.5F, -1.0F, 0.0F, 3, 3, 10, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.9F, 9.3F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0213F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 65, 64, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.4F, 8.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 75, 76, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.01F, -4.8F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, -0.0213F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 64, 45, 0.0F, 0.0F, 0.0F, 0, 5, 12, 0.0F, false));

        this.Tailfinmidend = new AdvancedModelRenderer(this);
        this.Tailfinmidend.setRotationPoint(0.0F, -4.8F, 0.0F);
        this.Tailmiddleend.addChild(Tailfinmidend);
        this.Tailfinmidend.cubeList.add(new ModelBox(Tailfinmidend, 79, 54, 0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.01F, -4.3F, 0.0F);
        this.Tailmiddle.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 79, 58, 0.0F, 0.0F, 0.0F, 0, 4, 10, 0.0F, false));

        this.Tailfinmidbase = new AdvancedModelRenderer(this);
        this.Tailfinmidbase.setRotationPoint(-0.01F, -4.7F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinmidbase);
        this.setRotateAngle(Tailfinmidbase, -0.0424F, 0.0F, 0.0F);
        this.Tailfinmidbase.cubeList.add(new ModelBox(Tailfinmidbase, 71, 43, -0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.0F, -2.8F, -0.02F);
        this.Tailbase.addChild(Tailfinbase);
        this.setRotateAngle(Tailfinbase, -0.0424F, 0.0F, 0.0F);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 56, 40, -1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F, false));

        this.Hipslope = new AdvancedModelRenderer(this);
        this.Hipslope.setRotationPoint(0.0F, -3.55F, -8.0F);
        this.Hips.addChild(Hipslope);
        this.setRotateAngle(Hipslope, -0.1262F, 0.0F, 0.0F);
        this.Hipslope.cubeList.add(new ModelBox(Hipslope, 31, 41, -3.0F, 0.0F, 0.0F, 6, 3, 12, 0.0F, false));

        this.Hipslope2 = new AdvancedModelRenderer(this);
        this.Hipslope2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hipslope.addChild(Hipslope2);
        this.setRotateAngle(Hipslope2, 0.092F, 0.0F, 0.0F);
        this.Hipslope2.cubeList.add(new ModelBox(Hipslope2, 36, 46, -3.0F, 0.0F, -7.0F, 6, 3, 7, -0.01F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.0F, 3.5F, 0.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1698F, 1.2524F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 68, 30, -1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.1485F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 83, 44, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.3396F, -0.4033F, -0.1274F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 56, 30, -2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.0F, 3.5F, 0.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1698F, -1.2524F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 82, 34, -1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.1485F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 92, 44, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.3396F, 0.4033F, 0.1274F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 56, 24, -2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinmidbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinend, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutmiddle, 0.2281F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutfront, 0.3496F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutbase, 0.1136F, 0.0F, 0.0F);
        this.setRotateAngle(skullslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(skullslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(skullslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(skullslope3, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(skullslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(skullslope, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(Shoulderslope, 0.2033F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.2784F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.0628F, -1.2311F, -0.3813F);
        this.setRotateAngle(Rightthigh, -0.1698F, -1.2524F, 0.0F);
        this.setRotateAngle(Rightshin, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.2347F, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.4458F, 0.1698F, -0.0389F);
        this.setRotateAngle(Righthindfoot, 0.3396F, 0.4033F, 0.1274F);
        this.setRotateAngle(Rightfrontfoot, 0.3821F, -0.1698F, 0.3183F);
        this.setRotateAngle(Righteye, 0.0F, -0.1698F, -0.3396F);
        this.setRotateAngle(Lowerjawslopemiddle, -0.3005F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, -0.4269F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback2, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback, -0.21F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmidbase, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.2784F, 0.0F);
        this.setRotateAngle(Leftupperarm, 3.1416F, -0.2323F, -2.8196F);
        this.setRotateAngle(Leftthigh, -0.1698F, 1.2524F, 0.0F);
        this.setRotateAngle(Leftshin, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.2347F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.4458F, -0.1698F, 0.0389F);
        this.setRotateAngle(Lefthindfoot, 0.3396F, -0.4033F, -0.1274F);
        this.setRotateAngle(Leftfrontfoot, 0.3821F, 0.1698F, -0.3183F);
        this.setRotateAngle(Lefteye, 0.0F, 0.1698F, 0.3396F);
        this.setRotateAngle(jawslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(jawslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(jawslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(jawslope3, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(jawslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(jawslope, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(Jawparting, -0.6369F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope2, 0.092F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, -0.1262F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0213F, 0.0F, 0.0F);
        this.Neck.offsetY = -0.03F;
        this.Neck.offsetZ = -0.02F;
        this.Neck.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.023F, 0.3926F, 0.0088F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Tailfinmidbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinend, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(Tailbase, -0.022F, 0.2617F, -0.0057F);
        this.setRotateAngle(Snoutmiddle, 0.2281F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutfront, 0.3496F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutbase, 0.1136F, 0.0F, 0.0F);
        this.setRotateAngle(skullslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(skullslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(skullslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(skullslope3, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(skullslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(skullslope, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(Shoulderslope, 0.2033F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.2784F, 0.0F);
        this.setRotateAngle(Rightupperarm, -0.2602F, -0.7651F, 0.045F);
        this.setRotateAngle(Rightthigh, -3.0662F, -0.7926F, 2.9264F);
        this.setRotateAngle(Rightshin, -1.4459F, -0.4333F, -0.0527F);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.2347F, 0.0F);
        this.setRotateAngle(Rightlowerarm, 0.4198F, -0.4643F, -1.7211F);
        this.setRotateAngle(Righthindfoot, 1.2722F, 0.0723F, 0.0129F);
        this.setRotateAngle(Rightfrontfoot, 1.4785F, -0.1634F, 0.0804F);
        this.setRotateAngle(Righteye, 0.0F, -0.1698F, -0.3396F);
        this.setRotateAngle(Neck, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Lowerjawslopemiddle, -0.3005F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, -0.4269F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback2, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback, -0.21F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmidbase, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.2784F, 0.0F);
        this.setRotateAngle(Leftupperarm, -0.2602F, 0.7651F, -0.045F);
        this.setRotateAngle(Leftthigh, -3.0662F, 0.7926F, -2.9264F);
        this.setRotateAngle(Leftshin, -1.4459F, 0.4333F, 0.0527F);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.2347F, 0.0F);
        this.setRotateAngle(Leftlowerarm, 0.4198F, 0.4643F, 1.7211F);
        this.setRotateAngle(Lefthindfoot, 1.2722F, -0.0723F, -0.0129F);
        this.setRotateAngle(Leftfrontfoot, 1.4785F, 0.1634F, -0.0804F);
        this.setRotateAngle(Lefteye, 0.0F, 0.1698F, 0.3396F);
        this.setRotateAngle(jawslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(jawslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(jawslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(jawslope3, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(jawslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(jawslope, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(Jawparting, -0.6369F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope2, 0.092F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, -0.1262F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.2472F, 0.3594F, -0.0043F);
        this.setRotateAngle(Head, 0.0F, -0.0436F, -0.0019F);
        this.setRotateAngle(Bodymiddle, 0.0213F, -0.0436F, -0.0009F);
        this.setRotateAngle(Bodyfront, -0.0659F, -0.0872F, -0.0019F);
        this.Hips.rotateAngleY = (float) Math.toRadians(-20);
        this.Hips.offsetY = -0.258F;
        this.Hips.offsetX = -0.06F;
        this.Hips.offsetZ = -0.03F;
        this.Hips.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.4F;
        this.Hips.offsetX = 0.285F;
        this.Hips.rotateAngleY = (float) Math.toRadians(210);
        this.Hips.rotateAngleX = (float) Math.toRadians(8);
        this.Hips.rotateAngleZ = (float) Math.toRadians(-4);
        this.Hips.scaleChildren = true;
        float scaler = 0.5F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.023F, 0.3926F, 0.0088F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Tailfinmidbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinend, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Tailfinbase, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(Tailbase, -0.022F, 0.2617F, -0.0057F);
        this.setRotateAngle(Snoutmiddle, 0.2281F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutfront, 0.3496F, 0.0F, 0.0F);
        this.setRotateAngle(Snoutbase, 0.1136F, 0.0F, 0.0F);
        this.setRotateAngle(skullslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(skullslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(skullslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(skullslope3, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(skullslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(skullslope, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(Shoulderslope, 0.2033F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.2784F, 0.0F);
        this.setRotateAngle(Rightupperarm, -0.2602F, -0.7651F, 0.045F);
        this.setRotateAngle(Rightthigh, -3.0662F, -0.7926F, 2.9264F);
        this.setRotateAngle(Rightshin, -1.4459F, -0.4333F, -0.0527F);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.2347F, 0.0F);
        this.setRotateAngle(Rightlowerarm, 0.4198F, -0.4643F, -1.7211F);
        this.setRotateAngle(Righthindfoot, 1.2722F, 0.0723F, 0.0129F);
        this.setRotateAngle(Rightfrontfoot, 1.4785F, -0.1634F, 0.0804F);
        this.setRotateAngle(Righteye, 0.0F, -0.1698F, -0.3396F);
        this.setRotateAngle(Neck, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Lowerjawslopemiddle, -0.3005F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, -0.4269F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback2, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslopeback, -0.21F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmidbase, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.2784F, 0.0F);
        this.setRotateAngle(Leftupperarm, -0.2602F, 0.7651F, -0.045F);
        this.setRotateAngle(Leftthigh, -3.0662F, 0.7926F, -2.9264F);
        this.setRotateAngle(Leftshin, -1.4459F, 0.4333F, 0.0527F);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.2347F, 0.0F);
        this.setRotateAngle(Leftlowerarm, 0.4198F, 0.4643F, 1.7211F);
        this.setRotateAngle(Lefthindfoot, 1.2722F, -0.0723F, -0.0129F);
        this.setRotateAngle(Leftfrontfoot, 1.4785F, 0.1634F, -0.0804F);
        this.setRotateAngle(Lefteye, 0.0F, 0.1698F, 0.3396F);
        this.setRotateAngle(jawslope6, 0.0F, 0.2225F, 0.0F);
        this.setRotateAngle(jawslope5, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(jawslope4, 0.0F, 0.2836F, 0.0F);
        this.setRotateAngle(jawslope3, 0.0F, -0.2836F, 0.0F);
        this.setRotateAngle(jawslope2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(jawslope, 0.0F, -0.2225F, 0.0F);
        this.setRotateAngle(Jawparting, -0.6369F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope2, 0.092F, 0.0F, 0.0F);
        this.setRotateAngle(Hipslope, -0.1262F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.2472F, 3.5F, -0.0043F);
        this.setRotateAngle(Head, 0.0F, -0.0436F, -0.0019F);
        this.setRotateAngle(Bodymiddle, 0.0213F, -0.0436F, -0.0009F);
        this.setRotateAngle(Bodyfront, -0.0659F, -0.0872F, -0.0019F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, Neck);
        this.faceTarget(f3, f4, 6, Head);

        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        EntityPrehistoricFloraPholiderpeton entitySilesaurus = (EntityPrehistoricFloraPholiderpeton) e;
        ((EntityPrehistoricFloraPholiderpeton)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraPholiderpeton ee = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-0.25), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+20))*1.5), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-15))*1));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0.325+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-0.15);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*0.1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.51346 + (((tickAnim - 0) / 8) * (4.93538-(0.51346)));
            yy = -26.98992 + (((tickAnim - 0) / 8) * (-5.21008-(-26.98992)));
            zz = -7.04248 + (((tickAnim - 0) / 8) * (-9.15001-(-7.04248)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 4.93538 + (((tickAnim - 8) / 12) * (14.32662-(4.93538)));
            yy = -5.21008 + (((tickAnim - 8) / 12) * (24.381-(-5.21008)));
            zz = -9.15001 + (((tickAnim - 8) / 12) * (12.1943-(-9.15001)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 14.32662 + (((tickAnim - 20) / 11) * (8.78322-(14.32662)));
            yy = 24.381 + (((tickAnim - 20) / 11) * (-14.90835-(24.381)));
            zz = 12.1943 + (((tickAnim - 20) / 11) * (13.81633-(12.1943)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 8.78322 + (((tickAnim - 31) / 8) * (0-(8.78322)));
            yy = -14.90835 + (((tickAnim - 31) / 8) * (-37.5-(-14.90835)));
            zz = 13.81633 + (((tickAnim - 31) / 8) * (-4.75-(13.81633)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0.51346-(0)));
            yy = -37.5 + (((tickAnim - 39) / 4) * (-26.98992-(-37.5)));
            zz = -4.75 + (((tickAnim - 39) / 4) * (-7.04248-(-4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -11.83284 + (((tickAnim - 0) / 8) * (5.25851-(-11.83284)));
            yy = 27.17789 + (((tickAnim - 0) / 8) * (17.72946-(27.17789)));
            zz = -0.3754 + (((tickAnim - 0) / 8) * (20.84011-(-0.3754)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 5.25851 + (((tickAnim - 8) / 12) * (28.03447-(5.25851)));
            yy = 17.72946 + (((tickAnim - 8) / 12) * (1.13506-(17.72946)));
            zz = 20.84011 + (((tickAnim - 8) / 12) * (41.4778-(20.84011)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 28.03447 + (((tickAnim - 20) / 11) * (2.06168-(28.03447)));
            yy = 1.13506 + (((tickAnim - 20) / 11) * (35.55633-(1.13506)));
            zz = 41.4778 + (((tickAnim - 20) / 11) * (42.02361-(41.4778)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 2.06168 + (((tickAnim - 31) / 8) * (-11.83284-(2.06168)));
            yy = 35.55633 + (((tickAnim - 31) / 8) * (27.17789-(35.55633)));
            zz = 42.02361 + (((tickAnim - 31) / 8) * (-0.3754-(42.02361)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -11.83284 + (((tickAnim - 39) / 4) * (-11.83284-(-11.83284)));
            yy = 27.17789 + (((tickAnim - 39) / 4) * (27.17789-(27.17789)));
            zz = -0.3754 + (((tickAnim - 39) / 4) * (-0.3754-(-0.3754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.85085 + (((tickAnim - 0) / 8) * (-4.48862-(12.85085)));
            yy = -5.7551 + (((tickAnim - 0) / 8) * (-17.33547-(-5.7551)));
            zz = 4.22515 + (((tickAnim - 0) / 8) * (-21.87207-(4.22515)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -4.48862 + (((tickAnim - 8) / 12) * (27.77713-(-4.48862)));
            yy = -17.33547 + (((tickAnim - 8) / 12) * (-51.75193-(-17.33547)));
            zz = -21.87207 + (((tickAnim - 8) / 12) * (-38.28704-(-21.87207)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 27.77713 + (((tickAnim - 20) / 11) * (68.84512-(27.77713)));
            yy = -51.75193 + (((tickAnim - 20) / 11) * (-24.77948-(-51.75193)));
            zz = -38.28704 + (((tickAnim - 20) / 11) * (-43.13512-(-38.28704)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 68.84512 + (((tickAnim - 31) / 8) * (12.82909-(68.84512)));
            yy = -24.77948 + (((tickAnim - 31) / 8) * (-3.60484-(-24.77948)));
            zz = -43.13512 + (((tickAnim - 31) / 8) * (4.19476-(-43.13512)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 12.82909 + (((tickAnim - 39) / 4) * (12.85085-(12.82909)));
            yy = -3.60484 + (((tickAnim - 39) / 4) * (-5.7551-(-3.60484)));
            zz = 4.19476 + (((tickAnim - 39) / 4) * (4.22515-(4.19476)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.225 + (((tickAnim - 8) / 12) * (0-(-0.225)));
            yy = 0.1 + (((tickAnim - 8) / 12) * (0-(0.1)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftfrontfoot.rotationPointX = this.Leftfrontfoot.rotationPointX + (float)(xx);
        this.Leftfrontfoot.rotationPointY = this.Leftfrontfoot.rotationPointY - (float)(yy);
        this.Leftfrontfoot.rotationPointZ = this.Leftfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-48.12231-(0)));
            yy = 56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 0) / 14) * (-43.17782-(56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0 + (((tickAnim - 0) / 14) * (-38.28553-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -48.12231 + (((tickAnim - 14) / 6) * (9.8906-(-48.12231)));
            yy = -43.17782 + (((tickAnim - 14) / 6) * (-37.51718-(-43.17782)));
            zz = -38.28553 + (((tickAnim - 14) / 6) * (8.67909-(-38.28553)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 9.8906 + (((tickAnim - 20) / 23) * (0-(9.8906)));
            yy = -37.51718 + (((tickAnim - 20) / 23) * (59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-37.51718)));
            zz = 8.67909 + (((tickAnim - 20) / 23) * (0-(8.67909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -53.47031 + (((tickAnim - 0) / 14) * (-25.31881-(-53.47031)));
            yy = 10.63826 + (((tickAnim - 0) / 14) * (4.19382-(10.63826)));
            zz = 8.35963 + (((tickAnim - 0) / 14) * (7.97029-(8.35963)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -25.31881 + (((tickAnim - 14) / 6) * (-7.5-(-25.31881)));
            yy = 4.19382 + (((tickAnim - 14) / 6) * (0-(4.19382)));
            zz = 7.97029 + (((tickAnim - 14) / 6) * (0-(7.97029)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-15.05553-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (-5.43023-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-13.73472-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -15.05553 + (((tickAnim - 30) / 13) * (-53.47031-(-15.05553)));
            yy = -5.43023 + (((tickAnim - 30) / 13) * (10.63826-(-5.43023)));
            zz = -13.73472 + (((tickAnim - 30) / 13) * (8.35963-(-13.73472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 139.03566 + (((tickAnim - 0) / 14) * (136.76371-(139.03566)));
            yy = -5.79392 + (((tickAnim - 0) / 14) * (-9.55852-(-5.79392)));
            zz = -113.20003 + (((tickAnim - 0) / 14) * (-36.25469-(-113.20003)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 136.76371 + (((tickAnim - 14) / 6) * (-0.48438-(136.76371)));
            yy = -9.55852 + (((tickAnim - 14) / 6) * (2.19568-(-9.55852)));
            zz = -36.25469 + (((tickAnim - 14) / 6) * (-8.01444-(-36.25469)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.48438 + (((tickAnim - 20) / 8) * (46.22194-(-0.48438)));
            yy = 2.19568 + (((tickAnim - 20) / 8) * (-29.5441-(2.19568)));
            zz = -8.01444 + (((tickAnim - 20) / 8) * (-40.23219-(-8.01444)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 46.22194 + (((tickAnim - 28) / 2) * (65.03289-(46.22194)));
            yy = -29.5441 + (((tickAnim - 28) / 2) * (-33.54962-(-29.5441)));
            zz = -40.23219 + (((tickAnim - 28) / 2) * (-56.05458-(-40.23219)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 65.03289 + (((tickAnim - 30) / 13) * (139.03566-(65.03289)));
            yy = -33.54962 + (((tickAnim - 30) / 13) * (-5.79392-(-33.54962)));
            zz = -56.05458 + (((tickAnim - 30) / 13) * (-113.20003-(-56.05458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0.25), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-10))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-20))*0.9));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-0.25), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+30))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*-2));


        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(-2.25), Tailbase.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*2), Tailbase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(-1), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*1.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-3));


        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(2.75), Tailmiddle.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*1.8), Tailmiddle.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-5));


        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0.25), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*2), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-5));


        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(-1), Tailend.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-200))*4.5), Tailend.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-3));


        this.Hipslope.rotationPointX = this.Hipslope.rotationPointX + (float)(0);
        this.Hipslope.rotationPointY = this.Hipslope.rotationPointY - (float)(0);
        this.Hipslope.rotationPointZ = this.Hipslope.rotationPointZ + (float)(0);

        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-0.25), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+30))*5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-15))*-1));


        this.Lowerjawslopeback.setScale((float)1,(float)(0.9375-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5))*-0.02),(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.32662 + (((tickAnim - 0) / 8) * (11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2-(14.32662)));
            yy = -24.38096 + (((tickAnim - 0) / 8) * (0.97968-(-24.38096)));
            zz = -12.19431 + (((tickAnim - 0) / 8) * (-11.5308-(-12.19431)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2 + (((tickAnim - 8) / 9) * (0-(11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2)));
            yy = 0.97968 + (((tickAnim - 8) / 9) * (37.5-(0.97968)));
            zz = -11.5308 + (((tickAnim - 8) / 9) * (4.75-(-11.5308)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (5.61925-(0)));
            yy = 37.5 + (((tickAnim - 17) / 11) * (1.15008-(37.5)));
            zz = 4.75 + (((tickAnim - 17) / 11) * (6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(4.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 5.61925 + (((tickAnim - 28) / 15) * (14.32662-(5.61925)));
            yy = 1.15008 + (((tickAnim - 28) / 15) * (-24.38096-(1.15008)));
            zz = 6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 28) / 15) * (-12.19431-(6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.03447 + (((tickAnim - 0) / 8) * (-0.65518-(28.03447)));
            yy = 1.13506 + (((tickAnim - 0) / 8) * (-14.78787-(1.13506)));
            zz = -41.47781 + (((tickAnim - 0) / 8) * (-43.20264-(-41.47781)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.65518 + (((tickAnim - 8) / 9) * (-3.06322-(-0.65518)));
            yy = -14.78787 + (((tickAnim - 8) / 9) * (-24.04777-(-14.78787)));
            zz = -43.20264 + (((tickAnim - 8) / 9) * (-10.71323-(-43.20264)));
        }
        else if (tickAnim >= 17 && tickAnim < 43) {
            xx = -3.06322 + (((tickAnim - 17) / 26) * (28.03447-(-3.06322)));
            yy = -24.04777 + (((tickAnim - 17) / 26) * (1.13506-(-24.04777)));
            zz = -10.71323 + (((tickAnim - 17) / 26) * (-41.47781-(-10.71323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 36.61723 + (((tickAnim - 0) / 8) * (69.44192-(36.61723)));
            yy = 50.68233 + (((tickAnim - 0) / 8) * (-14.68123-(50.68233)));
            zz = 47.04838 + (((tickAnim - 0) / 8) * (42.97662-(47.04838)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 69.44192 + (((tickAnim - 8) / 9) * (4.15003-(69.44192)));
            yy = -14.68123 + (((tickAnim - 8) / 9) * (-10.40166-(-14.68123)));
            zz = 42.97662 + (((tickAnim - 8) / 9) * (0.55698-(42.97662)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 4.15003 + (((tickAnim - 17) / 6) * (-4.91185-(4.15003)));
            yy = -10.40166 + (((tickAnim - 17) / 6) * (1.89226-(-10.40166)));
            zz = 0.55698 + (((tickAnim - 17) / 6) * (14.44206-(0.55698)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -4.91185 + (((tickAnim - 23) / 5) * (-11.98811-(-4.91185)));
            yy = 1.89226 + (((tickAnim - 23) / 5) * (14.07445-(1.89226)));
            zz = 14.44206 + (((tickAnim - 23) / 5) * (20.97566-(14.44206)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -11.98811 + (((tickAnim - 28) / 15) * (36.61723-(-11.98811)));
            yy = 14.07445 + (((tickAnim - 28) / 15) * (50.68233-(14.07445)));
            zz = 20.97566 + (((tickAnim - 28) / 15) * (47.04838-(20.97566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 7.15622 + (((tickAnim - 0) / 16) * (-53.28758-(7.15622)));
            yy = 39.64972 + (((tickAnim - 0) / 16) * (3.20635-(39.64972)));
            zz = -5.26373 + (((tickAnim - 0) / 16) * (55.15508-(-5.26373)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -53.28758 + (((tickAnim - 16) / 12) * (-184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(-53.28758)));
            yy = 3.20635 + (((tickAnim - 16) / 12) * (10.15343-(3.20635)));
            zz = 55.15508 + (((tickAnim - 16) / 12) * (177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(55.15508)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 28) / 5) * (-110.53176-(-184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 10.15343 + (((tickAnim - 28) / 5) * (10.2814-(10.15343)));
            zz = 177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 28) / 5) * (102.38444-(177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -110.53176 + (((tickAnim - 33) / 4) * (-51.17537-(-110.53176)));
            yy = 10.2814 + (((tickAnim - 33) / 4) * (34.85704-(10.2814)));
            zz = 102.38444 + (((tickAnim - 33) / 4) * (44.15662-(102.38444)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -51.17537 + (((tickAnim - 37) / 6) * (7.15622-(-51.17537)));
            yy = 34.85704 + (((tickAnim - 37) / 6) * (39.64972-(34.85704)));
            zz = 44.15662 + (((tickAnim - 37) / 6) * (-5.26373-(44.15662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-20-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -9.75 + (((tickAnim - 16) / 12) * (-36.14337-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (-16.44668-(0)));
            zz = -20 + (((tickAnim - 16) / 12) * (-20.69841-(-20)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -36.14337 + (((tickAnim - 28) / 9) * (-40.8798-(-36.14337)));
            yy = -16.44668 + (((tickAnim - 28) / 9) * (-7.04807-(-16.44668)));
            zz = -20.69841 + (((tickAnim - 28) / 9) * (-6.00578-(-20.69841)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -40.8798 + (((tickAnim - 37) / 6) * (0-(-40.8798)));
            yy = -7.04807 + (((tickAnim - 37) / 6) * (0-(-7.04807)));
            zz = -6.00578 + (((tickAnim - 37) / 6) * (0-(-6.00578)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.25 + (((tickAnim - 0) / 8) * (21.59826-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (24.55268-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (19.40023-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 21.59826 + (((tickAnim - 8) / 8) * (42.38816-(21.59826)));
            yy = 24.55268 + (((tickAnim - 8) / 8) * (37.20836-(24.55268)));
            zz = 19.40023 + (((tickAnim - 8) / 8) * (52.02707-(19.40023)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 42.38816 + (((tickAnim - 16) / 12) * (141.91117-(42.38816)));
            yy = 37.20836 + (((tickAnim - 16) / 12) * (13.75524-(37.20836)));
            zz = 52.02707 + (((tickAnim - 16) / 12) * (108.89896-(52.02707)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 141.91117 + (((tickAnim - 28) / 10) * (156.58059-(141.91117)));
            yy = 13.75524 + (((tickAnim - 28) / 10) * (6.87762-(13.75524)));
            zz = 108.89896 + (((tickAnim - 28) / 10) * (54.44948-(108.89896)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 156.58059 + (((tickAnim - 38) / 5) * (-3.25-(156.58059)));
            yy = 6.87762 + (((tickAnim - 38) / 5) * (0-(6.87762)));
            zz = 54.44948 + (((tickAnim - 38) / 5) * (0-(54.44948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.595-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = -0.595 + (((tickAnim - 7) / 12) * (0-(-0.595)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 19) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfoot.rotationPointX = this.Righthindfoot.rotationPointX + (float)(xx);
        this.Righthindfoot.rotationPointY = this.Righthindfoot.rotationPointY - (float)(yy);
        this.Righthindfoot.rotationPointZ = this.Righthindfoot.rotationPointZ + (float)(zz);
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-10))*1), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*1));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-40))*-1.5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*-0.8), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(-23.11032), Leftupperarm.rotateAngleY + (float) Math.toRadians(34.3548+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*1), Leftupperarm.rotateAngleZ + (float) Math.toRadians(-67.74593));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(46.6548), Leftlowerarm.rotateAngleY + (float) Math.toRadians(8.20197), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(72.78624));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(69.9364+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*-2), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(-5.50272), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0.05643));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-10))*4), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*5.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*6), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-120))*9.5), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-150))*11), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(99.148+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*3), Leftthigh.rotateAngleY + (float) Math.toRadians(-46.36725), Leftthigh.rotateAngleZ + (float) Math.toRadians(14.26811));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*5), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(41.7502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*8), Lefthindfoot.rotateAngleY + (float) Math.toRadians(18.9738), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(-7.3199));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-80))*1), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(-28.05714), Rightupperarm.rotateAngleY + (float) Math.toRadians(-32.305+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-1), Rightupperarm.rotateAngleZ + (float) Math.toRadians(63.71111));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(46.75604), Rightlowerarm.rotateAngleY + (float) Math.toRadians(-4.74174), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-70.07658));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(69.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*2), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(7.74585), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0.25498));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(103.5221+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-3), Rightthigh.rotateAngleY + (float) Math.toRadians(46.62715), Rightthigh.rotateAngleZ + (float) Math.toRadians(-24.49475));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-11.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*-5), Rightshin.rotateAngleY + (float) Math.toRadians(0), Rightshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(10.7502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*-9), Righthindfoot.rotateAngleY + (float) Math.toRadians(-18.97376), Righthindfoot.rotateAngleZ + (float) Math.toRadians(7.31989));
        

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-40))*5), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*3));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*-7), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*2));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*3));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(-9.35362), Leftupperarm.rotateAngleY + (float) Math.toRadians(25.091+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Leftupperarm.rotateAngleZ + (float) Math.toRadians(-54.4354));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(46.6548+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*5), Leftlowerarm.rotateAngleY + (float) Math.toRadians(8.20197), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(72.78624));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(69.9364+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*8), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(-5.50272), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0.05643));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-10))*6), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*7.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*10), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-120))*15), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-150))*20), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(117.9223+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*2), Leftthigh.rotateAngleY + (float) Math.toRadians(-57.59931), Leftthigh.rotateAngleZ + (float) Math.toRadians(26.11358));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-18.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*3), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(64.5002+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*7), Lefthindfoot.rotateAngleY + (float) Math.toRadians(18.9738), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(-7.3199));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*2));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(-9.35362), Rightupperarm.rotateAngleY + (float) Math.toRadians(-25.091+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Rightupperarm.rotateAngleZ + (float) Math.toRadians(54.43544));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(46.756+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-5), Rightlowerarm.rotateAngleY + (float) Math.toRadians(-4.74174), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-70.07658));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(69.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*-8), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(7.74585), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0.25498));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.2438+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-2), Rightthigh.rotateAngleY + (float) Math.toRadians(59.95795), Rightthigh.rotateAngleZ + (float) Math.toRadians(-25.75035));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-30.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*-5), Rightshin.rotateAngleY + (float) Math.toRadians(0), Rightshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(64.5002+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*-7), Righthindfoot.rotateAngleY + (float) Math.toRadians(-18.97376), Righthindfoot.rotateAngleZ + (float) Math.toRadians(7.31989));
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 6) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
            zz = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.Bodymiddle.rotationPointX = this.Bodymiddle.rotationPointX + (float)(0);
        this.Bodymiddle.rotationPointY = this.Bodymiddle.rotationPointY - (float)(0);
        this.Bodymiddle.rotationPointZ = this.Bodymiddle.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.81853-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (10.6985-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.3755-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.81853 + (((tickAnim - 6) / 7) * (0-(-1.81853)));
            yy = 10.6985 + (((tickAnim - 6) / 7) * (0-(10.6985)));
            zz = -14.3755 + (((tickAnim - 6) / 7) * (0-(-14.3755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 6) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 14.5 + (((tickAnim - 6) / 7) * (0-(14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 12.75 + (((tickAnim - 6) / 7) * (0-(12.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.75 + (((tickAnim - 6) / 7) * (0-(1.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5.49813-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.14375-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.4931-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -5.49813 + (((tickAnim - 6) / 7) * (0-(-5.49813)));
            yy = -0.14375 + (((tickAnim - 6) / 7) * (0-(-0.14375)));
            zz = -1.4931 + (((tickAnim - 6) / 7) * (0-(-1.4931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-16.47497-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.50031-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.72827-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -16.47497 + (((tickAnim - 6) / 7) * (0-(-16.47497)));
            yy = -0.50031 + (((tickAnim - 6) / 7) * (0-(-0.50031)));
            zz = -5.72827 + (((tickAnim - 6) / 7) * (0-(-5.72827)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 34.75 + (((tickAnim - 6) / 3) * (-1.05-(34.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.05 + (((tickAnim - 9) / 4) * (0-(-1.05)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.81853-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-10.6985-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.37552-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.81853 + (((tickAnim - 6) / 7) * (0-(-1.81853)));
            yy = -10.6985 + (((tickAnim - 6) / 7) * (0-(-10.6985)));
            zz = 14.37552 + (((tickAnim - 6) / 7) * (0-(14.37552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 6) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -14.5 + (((tickAnim - 6) / 7) * (0-(-14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -12.75 + (((tickAnim - 6) / 7) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));
       

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            yy = 1.25 + (((tickAnim - 31) / 69) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 31) / 69) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            yy = 1.25 + (((tickAnim - 100) / 16) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 100) / 16) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 1.25 + (((tickAnim - 116) / 62) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 116) / 62) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 1.25 + (((tickAnim - 178) / 42) * (0-(1.25)));
            zz = 0 + (((tickAnim - 178) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.4-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            zz = -1.4 + (((tickAnim - 31) / 69) * (-1.4-(-1.4)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            zz = -1.4 + (((tickAnim - 100) / 16) * (-1.525-(-1.4)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            zz = -1.525 + (((tickAnim - 116) / 62) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            zz = -1.525 + (((tickAnim - 178) / 42) * (0-(-1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0.03121-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-2.7282-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.02207-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0.03121 + (((tickAnim - 31) / 69) * (0.03121-(0.03121)));
            yy = -2.7282 + (((tickAnim - 31) / 69) * (-2.7282-(-2.7282)));
            zz = -1.02207 + (((tickAnim - 31) / 69) * (-1.02207-(-1.02207)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0.03121 + (((tickAnim - 100) / 16) * (0.0321-(0.03121)));
            yy = -2.7282 + (((tickAnim - 100) / 16) * (-3.47803-(-2.7282)));
            zz = -1.02207 + (((tickAnim - 100) / 16) * (-1.03848-(-1.02207)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0.0321 + (((tickAnim - 116) / 62) * (0.0321-(0.0321)));
            yy = -3.47803 + (((tickAnim - 116) / 62) * (-3.47803-(-3.47803)));
            zz = -1.03848 + (((tickAnim - 116) / 62) * (-1.03848-(-1.03848)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0.0321 + (((tickAnim - 178) / 42) * (0-(0.0321)));
            yy = -3.47803 + (((tickAnim - 178) / 42) * (0-(-3.47803)));
            zz = -1.03848 + (((tickAnim - 178) / 42) * (0-(-1.03848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-0.04925-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-3.76565-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0.75145-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = -0.04925 + (((tickAnim - 31) / 69) * (-0.04925-(-0.04925)));
            yy = -3.76565 + (((tickAnim - 31) / 69) * (-3.76565-(-3.76565)));
            zz = 0.75145 + (((tickAnim - 31) / 69) * (0.75145-(0.75145)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = -0.04925 + (((tickAnim - 100) / 16) * (-0.04853-(-0.04925)));
            yy = -3.76565 + (((tickAnim - 100) / 16) * (-4.26554-(-3.76565)));
            zz = 0.75145 + (((tickAnim - 100) / 16) * (0.74121-(0.75145)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = -0.04853 + (((tickAnim - 116) / 62) * (-0.04853-(-0.04853)));
            yy = -4.26554 + (((tickAnim - 116) / 62) * (-4.26554-(-4.26554)));
            zz = 0.74121 + (((tickAnim - 116) / 62) * (0.74121-(0.74121)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -0.04853 + (((tickAnim - 178) / 42) * (0-(-0.04853)));
            yy = -4.26554 + (((tickAnim - 178) / 42) * (0-(-4.26554)));
            zz = 0.74121 + (((tickAnim - 178) / 42) * (0-(0.74121)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.23325-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (17.36854-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.43225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 5.23325 + (((tickAnim - 12) / 10) * (6.93785-(5.23325)));
            yy = 17.36854 + (((tickAnim - 12) / 10) * (-4.26659-(17.36854)));
            zz = -0.43225 + (((tickAnim - 12) / 10) * (17.89167-(-0.43225)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 6.93785 + (((tickAnim - 22) / 8) * (0.06011-(6.93785)));
            yy = -4.26659 + (((tickAnim - 22) / 8) * (-19.24948-(-4.26659)));
            zz = 17.89167 + (((tickAnim - 22) / 8) * (-1.0018-(17.89167)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0.06011 + (((tickAnim - 30) / 69) * (0.06011-(0.06011)));
            yy = -19.24948 + (((tickAnim - 30) / 69) * (-19.24948-(-19.24948)));
            zz = -1.0018 + (((tickAnim - 30) / 69) * (-1.0018-(-1.0018)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 0.06011 + (((tickAnim - 99) / 17) * (0.06021-(0.06011)));
            yy = -19.24948 + (((tickAnim - 99) / 17) * (-10.99948-(-19.24948)));
            zz = -1.0018 + (((tickAnim - 99) / 17) * (-0.99315-(-1.0018)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0.06021 + (((tickAnim - 116) / 62) * (0.06021-(0.06021)));
            yy = -10.99948 + (((tickAnim - 116) / 62) * (-10.99948-(-10.99948)));
            zz = -0.99315 + (((tickAnim - 116) / 62) * (-0.99315-(-0.99315)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = 0.06021 + (((tickAnim - 178) / 10) * (5.53454-(0.06021)));
            yy = -10.99948 + (((tickAnim - 178) / 10) * (12.5554-(-10.99948)));
            zz = -0.99315 + (((tickAnim - 178) / 10) * (9.54654-(-0.99315)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 5.53454 + (((tickAnim - 188) / 10) * (-3.49818-(5.53454)));
            yy = 12.5554 + (((tickAnim - 188) / 10) * (36.99821-(12.5554)));
            zz = 9.54654 + (((tickAnim - 188) / 10) * (-10.09625-(9.54654)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -3.49818 + (((tickAnim - 198) / 22) * (0-(-3.49818)));
            yy = 36.99821 + (((tickAnim - 198) / 22) * (0-(36.99821)));
            zz = -10.09625 + (((tickAnim - 198) / 22) * (0-(-10.09625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (28.71891-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (13.32742-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (48.31389-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 28.71891 + (((tickAnim - 12) / 10) * (10.06502-(28.71891)));
            yy = 13.32742 + (((tickAnim - 12) / 10) * (9.67403-(13.32742)));
            zz = 48.31389 + (((tickAnim - 12) / 10) * (40.15664-(48.31389)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 10.06502 + (((tickAnim - 22) / 8) * (-4.43609-(10.06502)));
            yy = 9.67403 + (((tickAnim - 22) / 8) * (-0.98123-(9.67403)));
            zz = 40.15664 + (((tickAnim - 22) / 8) * (5.47946-(40.15664)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -4.43609 + (((tickAnim - 30) / 69) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 30) / 69) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 30) / 69) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -4.43609 + (((tickAnim - 99) / 14) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 99) / 14) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 99) / 14) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 113 && tickAnim < 178) {
            xx = -4.43609 + (((tickAnim - 113) / 65) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 113) / 65) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 113) / 65) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = -4.43609 + (((tickAnim - 178) / 10) * (0.581-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 178) / 10) * (21.35487-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 178) / 10) * (40.25599-(5.47946)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 0.581 + (((tickAnim - 188) / 10) * (-15.48756-(0.581)));
            yy = 21.35487 + (((tickAnim - 188) / 10) * (2.3493-(21.35487)));
            zz = 40.25599 + (((tickAnim - 188) / 10) * (9.39494-(40.25599)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -15.48756 + (((tickAnim - 198) / 22) * (0-(-15.48756)));
            yy = 2.3493 + (((tickAnim - 198) / 22) * (0-(2.3493)));
            zz = 9.39494 + (((tickAnim - 198) / 22) * (0-(9.39494)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (2.1662-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-38.28623-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-36.51275-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 2.1662 + (((tickAnim - 12) / 10) * (54.04706-(2.1662)));
            yy = -38.28623 + (((tickAnim - 12) / 10) * (-16.53178-(-38.28623)));
            zz = -36.51275 + (((tickAnim - 12) / 10) * (-42.58982-(-36.51275)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 54.04706 + (((tickAnim - 22) / 8) * (0-(54.04706)));
            yy = -16.53178 + (((tickAnim - 22) / 8) * (0-(-16.53178)));
            zz = -42.58982 + (((tickAnim - 22) / 8) * (-2.75-(-42.58982)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            zz = -2.75 + (((tickAnim - 30) / 69) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = -2.75 + (((tickAnim - 99) / 14) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 113) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 65) * (0-(0)));
            zz = -2.75 + (((tickAnim - 113) / 65) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 178) / 10) * (61.17209-(0)));
            yy = 0 + (((tickAnim - 178) / 10) * (-3.78768-(0)));
            zz = -2.75 + (((tickAnim - 178) / 10) * (-52.83779-(-2.75)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 61.17209 + (((tickAnim - 188) / 10) * (22.20218-(61.17209)));
            yy = -3.78768 + (((tickAnim - 188) / 10) * (-1.21551-(-3.78768)));
            zz = -52.83779 + (((tickAnim - 188) / 10) * (-0.66604-(-52.83779)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 22.20218 + (((tickAnim - 198) / 22) * (0-(22.20218)));
            yy = -1.21551 + (((tickAnim - 198) / 22) * (0-(-1.21551)));
            zz = -0.66604 + (((tickAnim - 198) / 22) * (0-(-0.66604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-3.50022-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.5558-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-0.04114-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3.50022 + (((tickAnim - 33) / 69) * (-3.50022-(-3.50022)));
            yy = 0.5558 + (((tickAnim - 33) / 69) * (0.5558-(0.5558)));
            zz = -0.04114 + (((tickAnim - 33) / 69) * (-0.04114-(-0.04114)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -3.50022 + (((tickAnim - 102) / 14) * (-3.5008-(-3.50022)));
            yy = 0.5558 + (((tickAnim - 102) / 14) * (1.05411-(0.5558)));
            zz = -0.04114 + (((tickAnim - 102) / 14) * (-0.0823-(-0.04114)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -3.5008 + (((tickAnim - 116) / 64) * (-3.5008-(-3.5008)));
            yy = 1.05411 + (((tickAnim - 116) / 64) * (1.05411-(1.05411)));
            zz = -0.0823 + (((tickAnim - 116) / 64) * (-0.0823-(-0.0823)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3.5008 + (((tickAnim - 180) / 40) * (0-(-3.5008)));
            yy = 1.05411 + (((tickAnim - 180) / 40) * (0-(1.05411)));
            zz = -0.0823 + (((tickAnim - 180) / 40) * (0-(-0.0823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-2.5129-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.70555-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.03184-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2.5129 + (((tickAnim - 33) / 69) * (-2.5129-(-2.5129)));
            yy = -0.70555 + (((tickAnim - 33) / 69) * (-0.70555-(-0.70555)));
            zz = 1.03184 + (((tickAnim - 33) / 69) * (1.03184-(1.03184)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -2.5129 + (((tickAnim - 102) / 14) * (-2.51279-(-2.5129)));
            yy = -0.70555 + (((tickAnim - 102) / 14) * (-0.45579-(-0.70555)));
            zz = 1.03184 + (((tickAnim - 102) / 14) * (1.02088-(1.03184)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -2.51279 + (((tickAnim - 116) / 64) * (-2.51279-(-2.51279)));
            yy = -0.45579 + (((tickAnim - 116) / 64) * (-0.45579-(-0.45579)));
            zz = 1.02088 + (((tickAnim - 116) / 64) * (1.02088-(1.02088)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -2.51279 + (((tickAnim - 180) / 40) * (0-(-2.51279)));
            yy = -0.45579 + (((tickAnim - 180) / 40) * (0-(-0.45579)));
            zz = 1.02088 + (((tickAnim - 180) / 40) * (0-(1.02088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.73359-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.58314-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.72408-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 2.73359 + (((tickAnim - 33) / 69) * (2.73359-(2.73359)));
            yy = -0.58314 + (((tickAnim - 33) / 69) * (-0.58314-(-0.58314)));
            zz = 1.72408 + (((tickAnim - 33) / 69) * (1.72408-(1.72408)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 2.73359 + (((tickAnim - 102) / 14) * (2.73352-(2.73359)));
            yy = -0.58314 + (((tickAnim - 102) / 14) * (0.41572-(-0.58314)));
            zz = 1.72408 + (((tickAnim - 102) / 14) * (1.77178-(1.72408)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 2.73352 + (((tickAnim - 116) / 64) * (2.73352-(2.73352)));
            yy = 0.41572 + (((tickAnim - 116) / 64) * (0.41572-(0.41572)));
            zz = 1.77178 + (((tickAnim - 116) / 64) * (1.77178-(1.77178)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2.73352 + (((tickAnim - 180) / 40) * (0-(2.73352)));
            yy = 0.41572 + (((tickAnim - 180) / 40) * (0-(0.41572)));
            zz = 1.77178 + (((tickAnim - 180) / 40) * (0-(1.77178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(xx), Tailmiddle.rotateAngleY + (float) Math.toRadians(yy), Tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (3.40474-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.98855-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (2.84757-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 3.40474 + (((tickAnim - 33) / 69) * (3.40474-(3.40474)));
            yy = -1.98855 + (((tickAnim - 33) / 69) * (-1.98855-(-1.98855)));
            zz = 2.84757 + (((tickAnim - 33) / 69) * (2.84757-(2.84757)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 3.40474 + (((tickAnim - 102) / 14) * (3.41316-(3.40474)));
            yy = -1.98855 + (((tickAnim - 102) / 14) * (-3.98203-(-1.98855)));
            zz = 2.84757 + (((tickAnim - 102) / 14) * (2.68595-(2.84757)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 3.41316 + (((tickAnim - 116) / 64) * (3.41316-(3.41316)));
            yy = -3.98203 + (((tickAnim - 116) / 64) * (-3.98203-(-3.98203)));
            zz = 2.68595 + (((tickAnim - 116) / 64) * (2.68595-(2.68595)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 3.41316 + (((tickAnim - 180) / 40) * (0-(3.41316)));
            yy = -3.98203 + (((tickAnim - 180) / 40) * (0-(-3.98203)));
            zz = 2.68595 + (((tickAnim - 180) / 40) * (0-(2.68595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-2.15069-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-4.21177-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (2.07942-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2.15069 + (((tickAnim - 33) / 69) * (-2.15069-(-2.15069)));
            yy = -4.21177 + (((tickAnim - 33) / 69) * (-4.21177-(-4.21177)));
            zz = 2.07942 + (((tickAnim - 33) / 69) * (2.07942-(2.07942)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -2.15069 + (((tickAnim - 102) / 14) * (-2.15654-(-2.15069)));
            yy = -4.21177 + (((tickAnim - 102) / 14) * (-5.96053-(-4.21177)));
            zz = 2.07942 + (((tickAnim - 102) / 14) * (2.14544-(2.07942)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -2.15654 + (((tickAnim - 116) / 64) * (-2.15654-(-2.15654)));
            yy = -5.96053 + (((tickAnim - 116) / 64) * (-5.96053-(-5.96053)));
            zz = 2.14544 + (((tickAnim - 116) / 64) * (2.14544-(2.14544)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -2.15654 + (((tickAnim - 180) / 40) * (0-(-2.15654)));
            yy = -5.96053 + (((tickAnim - 180) / 40) * (0-(-5.96053)));
            zz = 2.14544 + (((tickAnim - 180) / 40) * (0-(2.14544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(xx), Tailend.rotateAngleY + (float) Math.toRadians(yy), Tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (24-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            yy = 24 + (((tickAnim - 30) / 69) * (24-(24)));
            zz = 0 + (((tickAnim - 30) / 69) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 99) / 17) * (0-(0)));
            yy = 24 + (((tickAnim - 99) / 17) * (26.75-(24)));
            zz = 0 + (((tickAnim - 99) / 17) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 26.75 + (((tickAnim - 116) / 62) * (26.75-(26.75)));
            zz = 0 + (((tickAnim - 116) / 62) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 26.75 + (((tickAnim - 178) / 42) * (0-(26.75)));
            zz = 0 + (((tickAnim - 178) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.00855-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.74085-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.26196-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -7.00855 + (((tickAnim - 30) / 69) * (-7.00855-(-7.00855)));
            yy = -3.74085 + (((tickAnim - 30) / 69) * (-3.74085-(-3.74085)));
            zz = 0.26196 + (((tickAnim - 30) / 69) * (0.26196-(0.26196)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = -7.00855 + (((tickAnim - 99) / 17) * (-9.29583-(-7.00855)));
            yy = -3.74085 + (((tickAnim - 99) / 17) * (-6.96645-(-3.74085)));
            zz = 0.26196 + (((tickAnim - 99) / 17) * (0.66125-(0.26196)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = -9.29583 + (((tickAnim - 116) / 62) * (-9.29583-(-9.29583)));
            yy = -6.96645 + (((tickAnim - 116) / 62) * (-6.96645-(-6.96645)));
            zz = 0.66125 + (((tickAnim - 116) / 62) * (0.66125-(0.66125)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -9.29583 + (((tickAnim - 178) / 42) * (0-(-9.29583)));
            yy = -6.96645 + (((tickAnim - 178) / 42) * (0-(-6.96645)));
            zz = 0.66125 + (((tickAnim - 178) / 42) * (0-(0.66125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-7.72856-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.57785-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 30) / 1) * (4.289-(4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = -7.72856 + (((tickAnim - 30) / 1) * (-7.72856-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 30) / 1) * (-0.57785-(-0.57785)));
        }
        else if (tickAnim >= 31 && tickAnim < 99) {
            xx = 4.289 + (((tickAnim - 31) / 68) * (4.28903-(4.289)));
            yy = -7.72856 + (((tickAnim - 31) / 68) * (-7.72856-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 31) / 68) * (-0.57785-(-0.57785)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 4.28903 + (((tickAnim - 99) / 17) * (-0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4-(4.28903)));
            yy = -7.72856 + (((tickAnim - 99) / 17) * (-10.72009-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 99) / 17) * (-0.80609-(-0.57785)));
        }
        else if (tickAnim >= 116 && tickAnim < 117) {
            xx = -0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4 + (((tickAnim - 116) / 1) * (0.0006-(-0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4)));
            yy = -10.72009 + (((tickAnim - 116) / 1) * (-10.72009-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 116) / 1) * (-0.80609-(-0.80609)));
        }
        else if (tickAnim >= 117 && tickAnim < 178) {
            xx = 0.0006 + (((tickAnim - 117) / 61) * (0.32563-(0.0006)));
            yy = -10.72009 + (((tickAnim - 117) / 61) * (-10.72009-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 117) / 61) * (-0.80609-(-0.80609)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0.32563 + (((tickAnim - 178) / 42) * (0-(0.32563)));
            yy = -10.72009 + (((tickAnim - 178) / 42) * (0-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 178) / 42) * (0-(-0.80609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 69) {
            xx = 1 + (((tickAnim - 0) / 69) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 0) / 69) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 0) / 69) * (1-(1)));
        }
        else if (tickAnim >= 69 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 69) / 29) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 69) / 29) * (1-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 69) / 29) * (1-(1)));
        }
        else if (tickAnim >= 98 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 98) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 98) / 10) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(1)));
            zz = 1 + (((tickAnim - 98) / 10) * (1-(1)));
        }
        else if (tickAnim >= 108 && tickAnim < 152) {
            xx = 1 + (((tickAnim - 108) / 44) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 108) / 44) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 108) / 44) * (1-(1)));
        }
        else if (tickAnim >= 152 && tickAnim < 163) {
            xx = 1 + (((tickAnim - 152) / 11) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 152) / 11) * (1-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 152) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Lowerjawslopeback.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14.03864-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-29.70252-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.85422-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 14.03864 + (((tickAnim - 30) / 69) * (14.03864-(14.03864)));
            yy = -29.70252 + (((tickAnim - 30) / 69) * (-29.70252-(-29.70252)));
            zz = -1.85422 + (((tickAnim - 30) / 69) * (-1.85422-(-1.85422)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 14.03864 + (((tickAnim - 99) / 17) * (17.9602-(14.03864)));
            yy = -29.70252 + (((tickAnim - 99) / 17) * (-12.83594-(-29.70252)));
            zz = -1.85422 + (((tickAnim - 99) / 17) * (-10.70128-(-1.85422)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 17.9602 + (((tickAnim - 116) / 7) * (11.54143-(17.9602)));
            yy = -12.83594 + (((tickAnim - 116) / 7) * (-3.39636-(-12.83594)));
            zz = -10.70128 + (((tickAnim - 116) / 7) * (1.30945-(-10.70128)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = 11.54143 + (((tickAnim - 123) / 55) * (11.54143-(11.54143)));
            yy = -3.39636 + (((tickAnim - 123) / 55) * (-3.39636-(-3.39636)));
            zz = 1.30945 + (((tickAnim - 123) / 55) * (1.30945-(1.30945)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 11.54143 + (((tickAnim - 178) / 42) * (0-(11.54143)));
            yy = -3.39636 + (((tickAnim - 178) / 42) * (0-(-3.39636)));
            zz = 1.30945 + (((tickAnim - 178) / 42) * (0-(1.30945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (18.73664-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.41581-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-14.35844-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 18.73664 + (((tickAnim - 30) / 69) * (18.73664-(18.73664)));
            yy = -1.41581 + (((tickAnim - 30) / 69) * (-1.41581-(-1.41581)));
            zz = -14.35844 + (((tickAnim - 30) / 69) * (-14.35844-(-14.35844)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 18.73664 + (((tickAnim - 99) / 17) * (12.71838-(18.73664)));
            yy = -1.41581 + (((tickAnim - 99) / 17) * (-5.66519-(-1.41581)));
            zz = -14.35844 + (((tickAnim - 99) / 17) * (-36.54447-(-14.35844)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 12.71838 + (((tickAnim - 116) / 7) * (12.39822-(12.71838)));
            yy = -5.66519 + (((tickAnim - 116) / 7) * (-0.65742-(-5.66519)));
            zz = -36.54447 + (((tickAnim - 116) / 7) * (-13.46785-(-36.54447)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = 12.39822 + (((tickAnim - 123) / 55) * (12.39822-(12.39822)));
            yy = -0.65742 + (((tickAnim - 123) / 55) * (-0.65742-(-0.65742)));
            zz = -13.46785 + (((tickAnim - 123) / 55) * (-13.46785-(-13.46785)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 12.39822 + (((tickAnim - 178) / 42) * (0-(12.39822)));
            yy = -0.65742 + (((tickAnim - 178) / 42) * (0-(-0.65742)));
            zz = -13.46785 + (((tickAnim - 178) / 42) * (0-(-13.46785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-23.58243-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-2.44622-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (12.22787-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -23.58243 + (((tickAnim - 30) / 69) * (-23.58243-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 30) / 69) * (-2.44622-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 30) / 69) * (12.22787-(12.22787)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = -23.58243 + (((tickAnim - 99) / 17) * (20.56699-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 99) / 17) * (-0.36915-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 99) / 17) * (39.42044-(12.22787)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 20.56699 + (((tickAnim - 116) / 7) * (-23.58243-(20.56699)));
            yy = -0.36915 + (((tickAnim - 116) / 7) * (-2.44622-(-0.36915)));
            zz = 39.42044 + (((tickAnim - 116) / 7) * (12.22787-(39.42044)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = -23.58243 + (((tickAnim - 123) / 55) * (-23.58243-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 123) / 55) * (-2.44622-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 123) / 55) * (12.22787-(12.22787)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -23.58243 + (((tickAnim - 178) / 42) * (0-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 178) / 42) * (0-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 178) / 42) * (0-(12.22787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-31.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-22.55103-(0)));
            yy = -31.25 + (((tickAnim - 20) / 8) * (18.32208-(-31.25)));
            zz = 0 + (((tickAnim - 20) / 8) * (9.68268-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.55103 + (((tickAnim - 28) / 5) * (0-(-22.55103)));
            yy = 18.32208 + (((tickAnim - 28) / 5) * (35-(18.32208)));
            zz = 9.68268 + (((tickAnim - 28) / 5) * (0-(9.68268)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 35 + (((tickAnim - 33) / 69) * (35-(35)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 35 + (((tickAnim - 102) / 14) * (33-(35)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 33 + (((tickAnim - 116) / 64) * (33-(33)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (-15.75-(0)));
            yy = 33 + (((tickAnim - 180) / 9) * (1.73381-(33)));
            zz = 0 + (((tickAnim - 180) / 9) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = -15.75 + (((tickAnim - 189) / 9) * (0-(-15.75)));
            yy = 1.73381 + (((tickAnim - 189) / 9) * (-26.69-(1.73381)));
            zz = 0 + (((tickAnim - 189) / 9) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            yy = -26.69 + (((tickAnim - 198) / 22) * (0-(-26.69)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-32-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -32 + (((tickAnim - 20) / 8) * (-34.25-(-32)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -34.25 + (((tickAnim - 28) / 5) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (-33.6-(0)));
            yy = 0 + (((tickAnim - 180) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 9) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = -33.6 + (((tickAnim - 189) / 9) * (-4-(-33.6)));
            yy = 0 + (((tickAnim - 189) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 9) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -4 + (((tickAnim - 198) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (52.36741-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (15.9705-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (44.387-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 52.36741 + (((tickAnim - 12) / 8) * (92.12278-(52.36741)));
            yy = 15.9705 + (((tickAnim - 12) / 8) * (17.15723-(15.9705)));
            zz = 44.387 + (((tickAnim - 12) / 8) * (80.07492-(44.387)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 92.12278 + (((tickAnim - 20) / 8) * (115.06139-(92.12278)));
            yy = 17.15723 + (((tickAnim - 20) / 8) * (8.57861-(17.15723)));
            zz = 80.07492 + (((tickAnim - 20) / 8) * (40.03746-(80.07492)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 115.06139 + (((tickAnim - 28) / 5) * (0-(115.06139)));
            yy = 8.57861 + (((tickAnim - 28) / 5) * (0-(8.57861)));
            zz = 40.03746 + (((tickAnim - 28) / 5) * (0-(40.03746)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (146.22553-(0)));
            yy = 0 + (((tickAnim - 180) / 9) * (12.92411-(0)));
            zz = 0 + (((tickAnim - 180) / 9) * (73.54551-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = 146.22553 + (((tickAnim - 189) / 9) * (4.25-(146.22553)));
            yy = 12.92411 + (((tickAnim - 189) / 9) * (0-(12.92411)));
            zz = 73.54551 + (((tickAnim - 189) / 9) * (0-(73.54551)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 4.25 + (((tickAnim - 198) / 22) * (0-(4.25)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPholiderpeton e = (EntityPrehistoricFloraPholiderpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
