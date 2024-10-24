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

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;

        

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;
       

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholiderpeton entity = (EntityPrehistoricFloraPholiderpeton) entitylivingbaseIn;


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
