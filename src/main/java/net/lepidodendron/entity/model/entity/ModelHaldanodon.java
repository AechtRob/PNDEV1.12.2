package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDocodon;
import net.lepidodendron.entity.EntityPrehistoricFloraHaldanodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHaldanodon extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Eyeportion;
    private final AdvancedModelRendererExtended Snout;
    private final AdvancedModelRendererExtended Snout_r1;
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
    private final AdvancedModelRendererExtended UpperArmR;
    private final AdvancedModelRendererExtended LowerArmR;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended UpperArmL;
    private final AdvancedModelRendererExtended LowerArmL;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended UpperLegR;
    private final AdvancedModelRendererExtended LowerLegR;
    private final AdvancedModelRendererExtended FootR;
    private final AdvancedModelRendererExtended UpperLegL;
    private final AdvancedModelRendererExtended LowerLegL;
    private final AdvancedModelRendererExtended FootL;

    private ModelAnimator animator;

    public ModelHaldanodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 24.0F, 1.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, -6.2F, 7.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3183F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 13, -3.5F, -1.5F, -5.0F, 7, 5, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -0.9F, 0.5F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2759F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 32, -1.5F, -0.5F, 0.0F, 3, 2, 4, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.2122F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 19, 0, -2.0F, -0.5F, 0.0F, 4, 2, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 4.4F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.2759F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 24, -1.5F, -0.5F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.3396F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -1.0F, -7.0F, 6, 6, 7, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(-0.01F, 0.6F, -6.5F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0424F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 22, 9, -2.99F, -1.5F, -3.5F, 6, 6, 4, -0.01F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.2546F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 22, 20, -2.49F, -1.5F, -4.0F, 5, 4, 4, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.01F, -0.3F, -3.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.4033F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 32, 0, -2.0F, -1.5F, -3.0F, 4, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 24, -1.0F, -1.75F, -3.75F, 2, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -0.5F, -1.725F, -5.25F, 1, 1, 2, 0.0F, false));

        this.Eyeportion = new AdvancedModelRendererExtended(this);
        this.Eyeportion.setRotationPoint(0.0F, -1.5F, -1.9F);
        this.Head.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, -0.0424F, 0.0F, 0.0F);
        this.Eyeportion.cubeList.add(new ModelBox(Eyeportion, 38, 9, -1.5F, 0.025F, -2.5F, 3, 2, 2, 0.01F, false));

        this.Snout = new AdvancedModelRendererExtended(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.Eyeportion.addChild(Snout);
        this.setRotateAngle(Snout, -0.0424F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 39, 41, -1.5F, 0.1F, -3.0F, 3, 1, 2, 0.0F, false));

        this.Snout_r1 = new AdvancedModelRendererExtended(this);
        this.Snout_r1.setRotationPoint(0.0F, 1.1F, -3.0F);
        this.Snout.addChild(Snout_r1);
        this.setRotateAngle(Snout_r1, -0.2618F, 0.0F, 0.0F);
        this.Snout_r1.cubeList.add(new ModelBox(Snout_r1, 34, 38, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.Nose = new AdvancedModelRendererExtended(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Snout.addChild(Nose);
        this.setRotateAngle(Nose, 0.7217F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 0, 5, -1.0F, 0.25F, -0.9F, 2, 1, 1, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, 2.0F, -2.75F);
        this.Snout.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 1.2524F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 0, 17, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Leftupperfang = new AdvancedModelRendererExtended(this);
        this.Leftupperfang.setRotationPoint(-0.7F, 1.6F, -1.5F);
        this.Snout.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, 0.0F, 0.0F, -0.0213F);
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 4, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 4, 0, 1.4F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.Rightupperfang = new AdvancedModelRendererExtended(this);
        this.Rightupperfang.setRotationPoint(0.7F, 1.6F, -1.5F);
        this.Snout.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, 0.0F, 0.0F, 0.0213F);


        this.Uppermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Uppermiddleteeth.setRotationPoint(-0.01F, 1.9F, -3.0F);
        this.Eyeportion.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, 1.1463F, 0.0F, 0.0F);


        this.Upperbackteeth = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, 1.875F, -2.15F);
        this.Eyeportion.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.9917F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 0, 3, -1.0F, -0.25F, -0.05F, 2, 1, 1, 0.0F, false));

        this.Lefteye = new AdvancedModelRendererExtended(this);
        this.Lefteye.setRotationPoint(-1.0F, 1.0F, -1.8F);
        this.Eyeportion.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0213F, -0.1911F, 0.0F);


        this.Righteye = new AdvancedModelRendererExtended(this);
        this.Righteye.setRotationPoint(1.0F, 1.0F, -1.8F);
        this.Eyeportion.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0213F, 0.1911F, 0.0F);


        this.Lowerjawbase = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase.setRotationPoint(0.01F, 0.71F, -0.5F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, -0.0873F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 36, 19, -2.01F, -1.65F, -2.0F, 4, 3, 2, -0.01F, false));

        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, -0.27F, -3.67F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 21, 40, -1.51F, 0.0F, -0.3F, 3, 1, 2, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.25F, 0.2F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2122F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 0, 38, -1.01F, -1.125F, -2.4F, 2, 1, 3, 0.0F, false));

        this.Lowermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Lowermiddleteeth.setRotationPoint(0.0F, -0.9F, -0.3F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);
        this.setRotateAngle(Lowermiddleteeth, -0.5377F, 0.0F, 0.0F);
        this.Lowermiddleteeth.cubeList.add(new ModelBox(Lowermiddleteeth, 0, 15, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.675F, -2.425F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.7358F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 0, 13, -0.5F, -1.125F, -0.075F, 1, 1, 1, 0.0F, false));

        this.Leftlowerfang = new AdvancedModelRendererExtended(this);
        this.Leftlowerfang.setRotationPoint(-0.51F, -0.6F, -0.7F);
        this.Lowerjawfront.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, 0.0F, 0.0F, 0.1485F);
        this.Leftlowerfang.cubeList.add(new ModelBox(Leftlowerfang, 0, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.Leftlowerfang.cubeList.add(new ModelBox(Leftlowerfang, 0, 0, 1.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.Rightlowerfang = new AdvancedModelRendererExtended(this);
        this.Rightlowerfang.setRotationPoint(0.51F, -0.6F, -0.7F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, 0.0F, 0.0F, -0.1485F);


        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.Lowerjawmiddle.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 32, 34, -1.51F, -2.0F, 0.35F, 3, 2, 2, -0.01F, false));

        this.Lowerteethback = new AdvancedModelRendererExtended(this);
        this.Lowerteethback.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.Lowerjawmiddle.addChild(Lowerteethback);
        this.setRotateAngle(Lowerteethback, -1.3373F, 0.0F, 0.0F);


        this.Lowerjawfluff = new AdvancedModelRendererExtended(this);
        this.Lowerjawfluff.setRotationPoint(0.01F, 0.85F, -1.8F);
        this.Lowerjawmiddle.addChild(Lowerjawfluff);
        this.setRotateAngle(Lowerjawfluff, -0.2135F, 0.0F, 0.0F);
        this.Lowerjawfluff.cubeList.add(new ModelBox(Lowerjawfluff, 29, 41, -1.52F, -1.0F, 1.6F, 3, 1, 2, -0.01F, false));

        this.UpperArmR = new AdvancedModelRendererExtended(this);
        this.UpperArmR.setRotationPoint(-2.48F, 2.9F, -1.6F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.2972F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 11, 36, -2.0F, -1.0F, -1.5F, 3, 3, 3, 0.0F, false));

        this.LowerArmR = new AdvancedModelRendererExtended(this);
        this.LowerArmR.setRotationPoint(-0.5F, 1.3F, 0.9F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.0848F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 39, 26, -1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.1485F, 0.0637F, 0.0213F);
        this.HandR.cubeList.add(new ModelBox(HandR, 34, 5, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRendererExtended(this);
        this.UpperArmL.setRotationPoint(2.5F, 2.9F, -1.6F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.2972F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 11, 36, -1.0F, -1.0F, -1.5F, 3, 3, 3, 0.0F, true));

        this.LowerArmL = new AdvancedModelRendererExtended(this);
        this.LowerArmL.setRotationPoint(0.5F, 1.3F, 0.9F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.0848F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 39, 26, -1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F, true));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1485F, -0.0637F, -0.0213F);
        this.HandL.cubeList.add(new ModelBox(HandL, 34, 5, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        this.UpperLegR = new AdvancedModelRendererExtended(this);
        this.UpperLegR.setRotationPoint(-3.0F, 1.1F, -1.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.447F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 14, 28, -2.0F, -1.5F, -2.5F, 3, 4, 4, 0.0F, false));

        this.LowerLegR = new AdvancedModelRendererExtended(this);
        this.LowerLegR.setRotationPoint(-0.5F, 2.2F, -2.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -1.0177F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 24, 34, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.FootR = new AdvancedModelRendererExtended(this);
        this.FootR.setRotationPoint(0.0F, -0.25F, 3.6F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.9104F, 0.1485F, 0.2122F);
        this.FootR.cubeList.add(new ModelBox(FootR, 28, 28, -1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F, false));

        this.UpperLegL = new AdvancedModelRendererExtended(this);
        this.UpperLegL.setRotationPoint(3.0F, 1.1F, -1.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.447F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 14, 28, -1.0F, -1.5F, -2.5F, 3, 4, 4, 0.0F, true));

        this.LowerLegL = new AdvancedModelRendererExtended(this);
        this.LowerLegL.setRotationPoint(0.5F, 2.2F, -2.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -1.0177F, 0.0F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 24, 34, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.FootL = new AdvancedModelRendererExtended(this);
        this.FootL.setRotationPoint(0.0F, -0.25F, 3.6F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.9104F, -0.1485F, -0.2122F);
        this.FootL.cubeList.add(new ModelBox(FootL, 28, 28, -1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F, true));

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

        EntityPrehistoricFloraHaldanodon doco = (EntityPrehistoricFloraHaldanodon) e;
        float masterSpeed = doco.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Whole = {this.Head, this.Neck, this.Chest, this.Body, this.Hips, this.Tail1, this.Tail2, this.Tail3};

        AdvancedModelRenderer[] BackLeft = {this.UpperLegL, this.LowerLegL, this.FootL};
        AdvancedModelRenderer[] BackRight = {this.UpperLegR, this.LowerLegR, this.FootR};
        AdvancedModelRenderer[] FrontLeft = {this.UpperArmL, this.LowerArmL, this.HandL};
        AdvancedModelRenderer[] FrontRight = {this.UpperArmR, this.LowerArmR, this.HandR};


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

            this.UpperArmL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 0, f2, 1.5F);
            ;
            this.UpperArmR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 3, f2, 1.5F);
            ;
            this.UpperLegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);
            ;
            this.UpperLegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);
            ;

            this.walk(UpperArmL, speed * speedmodifier, 0.5F, false, 0, -0.20F, f2, 1F);
            this.walk(UpperArmR, speed * speedmodifier, 0.5F, false, 3, -0.20F, f2, 1F);
            this.flap(UpperArmL, speed * speedmodifier, -0.15F, false, 1, 0.05F, f2, 1F);
            this.flap(UpperArmR, speed * speedmodifier, 0.15F, false, 4, -0.05F, f2, 1F);

            this.walk(LowerArmL, speed * speedmodifier, -0.25F, false, 3, 0.10F, f2, 1F);
            this.walk(LowerArmR, speed * speedmodifier, -0.25F, false, 6, 0.10F, f2, 1F);
            this.flap(LowerArmL, speed * speedmodifier, -0.15F, false, 3, 0.05F, f2, 1F);
            this.flap(LowerArmR, speed * speedmodifier, 0.15F, false, 6, -0.05F, f2, 1F);

            this.walk(HandL, speed * speedmodifier, 0.45F, false, 2, -0.08F, f2, 1F);
            this.walk(HandR, speed * speedmodifier, 0.45F, false, 5, -0.08F, f2, 1F);


            this.walk(UpperLegL, speed * speedmodifier, 0.5F, true, 0, -0.20F, f2, 1F);
            this.walk(UpperLegR, speed * speedmodifier, 0.5F, true, 3, -0.20F, f2, 1F);
            this.flap(UpperLegL, speed * speedmodifier, 0.15F, true, 1, -0.05F, f2, 1F);
            this.flap(UpperLegR, speed * speedmodifier, -0.15F, true, 4, 0.05F, f2, 1F);

            this.walk(FootL, speed * speedmodifier, 0.45F, true, 3, 0.18F, f2, 1F);
            this.walk(FootR, speed * speedmodifier, 0.45F, true, 6, 0.18F, f2, 1F);

            this.bobExtended(Hips, speed * 2F * speedmodifier, 0.245F, false, 2.5F, f2, 1F);

            this.flap(Hips, speed * speedmodifier, 0.08F, false, 2.0F, 0.04F, f2, 1.0F);
            this.flap(Body, speed * speedmodifier, -0.08F, false, 2.0F, -0.04F, f2, 1.0F);
            this.flap(Tail1, speed * speedmodifier, -0.08F, false, 2.0F, -0.04F, f2, 1.0F);

            this.walk(Body, speed * 2 * speedmodifier, 0.05F, false, 2.5F, -0.01F, f2, 0.8F);

            this.swing(Neck, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neck, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
            this.chainWave(Tail, (speed * 0.6F), -0.20F, 6.2F, f2, 1F);
            this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

            this.Hips.offsetZ = this.moveBoxExtended(speed * 2 * speedmodifier, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);
        } else { //swimming
            this.setRotateAngle(Body, 0.3396F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0424F, 0.0F, 0.0F);
            this.setRotateAngle(Eyeportion, -0.0424F, 0.0F, 0.0F);
            this.setRotateAngle(FootL, 2.5937F, -0.0136F, 0.0131F);
            this.setRotateAngle(FootR, 2.5937F, 0.0136F, -0.0131F);
            this.setRotateAngle(HandL, 1.8066F, -0.0637F, -0.0213F);
            this.setRotateAngle(HandR, 1.8066F, 0.0637F, 0.0213F);
            this.setRotateAngle(Head, 0.4033F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3183F, 0.0F, 0.0F);
            this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);
            this.setRotateAngle(Lefteye, -0.0213F, -0.1911F, 0.0F);
            this.setRotateAngle(Leftlowerfang, 0.0F, 0.0F, 0.1485F);
            this.setRotateAngle(Leftupperfang, 0.0F, 0.0F, -0.0213F);
            this.setRotateAngle(LowerArmL, 0.303F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmR, 0.303F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerfrontteeth, -0.7358F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawbase, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawfluff, -0.2135F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerjawfront, -0.2122F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegL, -1.105F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegR, -1.105F, 0.0F, 0.0F);
            this.setRotateAngle(Lowermiddleteeth, -0.5377F, 0.0F, 0.0F);
            this.setRotateAngle(Lowerteethback, -1.3373F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2546F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.7217F, 0.0F, 0.0F);
            this.setRotateAngle(Righteye, -0.0213F, 0.1911F, 0.0F);
            this.setRotateAngle(Rightlowerfang, 0.0F, 0.0F, -0.1485F);
            this.setRotateAngle(Rightupperfang, 0.0F, 0.0F, 0.0213F);
            this.setRotateAngle(Snout_r1, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.0424F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.2759F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2122F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.2759F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmL, 0.7063F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmR, 0.7063F, 0.0F, 0.0F);
            this.setRotateAngle(Upperbackteeth, 0.9917F, 0.0F, 0.0F);
            this.setRotateAngle(Upperfrontteeth, 1.2524F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegL, 1.4069F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegR, 1.4069F, 0.0F, 0.0F);
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
            this.bob(Chest, speed, 0.15F, false, f2, 1);
            this.walk(Chest, speed, 0.08F, false, 0F, 0.04F, f2, 1);

            if (f3 == 0.0F) {
                return;
            }
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHaldanodon e = (EntityPrehistoricFloraHaldanodon) entity;
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
