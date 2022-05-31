package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSuminia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSuminia extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Lowerjawbase;
    private final AdvancedModelRendererExtended Lowerjawmiddle;
    private final AdvancedModelRendererExtended Lowerjawfront;
    private final AdvancedModelRendererExtended Lowerfrontteeth;
    private final AdvancedModelRendererExtended Lowermiddleteeth;
    private final AdvancedModelRendererExtended Lowerbackteeth;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Upperjawback;
    private final AdvancedModelRendererExtended Upperjawfront;
    private final AdvancedModelRendererExtended Upperfrontteeth;
    private final AdvancedModelRendererExtended Uppermiddleteeth;
    private final AdvancedModelRendererExtended Upperbackteeth;
    private final AdvancedModelRendererExtended Browslope;
    private final AdvancedModelRendererExtended Snoutslope;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Lefthand;
    private final AdvancedModelRendererExtended Leftthumb;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Righthand;
    private final AdvancedModelRendererExtended Rightthumb;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;
    private final AdvancedModelRendererExtended Rightopposabletoe;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Leftopposabletoe;

    private ModelAnimator animator;

    public ModelSuminia() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 1.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 4.4F, 8.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0424F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 84, -3.0F, -1.5F, -4.0F, 6, 8, 8, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, 0.7F, 2.9F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0337F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 52, 20, -2.5F, -1.5F, 0.0F, 5, 5, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 7.8F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0898F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 54, 5, -2.0F, -1.5F, 0.0F, 4, 4, 10, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, -0.2F, 9.1F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1211F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 74, 13, -1.5F, -1.0F, 0.0F, 3, 3, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.2F, 8.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1722F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 12, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, 0.01F, 7.4F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1498F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 13, 10, -0.5F, -1.0F, 0.0F, 1, 2, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0424F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 61, -4.0F, -2.0F, -12.0F, 8, 10, 12, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3F, -11.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1061F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 41, -4.5F, -1.5F, -10.0F, 9, 9, 10, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.6F, -7.9F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.5732F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 23, -2.5F, -1.5F, -9.0F, 5, 7, 10, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(-0.01F, 1.0F, -7.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.4671F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 73, 50, -3.0F, -3.5F, -4.5F, 6, 5, 5, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.Head.addChild(Lowerjawbase);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 71, 73, -2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -4.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 68, 91, -2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0848F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 29, 91, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth.setRotationPoint(0.01F, 0.1F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.0637F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 88, 88, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Lowermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Lowermiddleteeth.setRotationPoint(-0.01F, 0.2F, -1.6F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);
        this.setRotateAngle(Lowermiddleteeth, -0.0848F, 0.0F, 0.0F);
        this.Lowermiddleteeth.cubeList.add(new ModelBox(Lowermiddleteeth, 82, 91, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Lowerbackteeth = new AdvancedModelRendererExtended(this);
        this.Lowerbackteeth.setRotationPoint(0.01F, 0.2F, -2.7F);
        this.Lowerjawmiddle.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.1698F, 0.0F, 0.0F);
        this.Lowerbackteeth.cubeList.add(new ModelBox(Lowerbackteeth, 46, 93, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.1F, -5.0F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 71, 63, -2.0F, -5.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.Upperjawback = new AdvancedModelRendererExtended(this);
        this.Upperjawback.setRotationPoint(0.01F, -2.5F, -4.37F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0637F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 71, 82, -2.0F, 0.0F, -3.3F, 4, 4, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRendererExtended(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -3.46F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0848F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 21, 84, -1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, 0.7F, -1.9F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.5732F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 88, 84, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.Uppermiddleteeth = new AdvancedModelRendererExtended(this);
        this.Uppermiddleteeth.setRotationPoint(0.01F, 1.0F, -1.7F);
        this.Upperjawfront.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, -0.0848F, 0.0F, 0.0F);
        this.Uppermiddleteeth.cubeList.add(new ModelBox(Uppermiddleteeth, 91, 91, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, 3.9F, -3.2F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1274F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 56, 96, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Browslope = new AdvancedModelRendererExtended(this);
        this.Browslope.setRotationPoint(0.0F, -3.5F, -4.5F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.2546F, 0.0F, 0.0F);
        this.Browslope.cubeList.add(new ModelBox(Browslope, 29, 67, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Snoutslope = new AdvancedModelRendererExtended(this);
        this.Snoutslope.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Browslope.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.536F, 0.0F, 0.0F);
        this.Snoutslope.cubeList.add(new ModelBox(Snoutslope, 38, 94, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(-4.0F, 5.5F, -7.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.3821F, -0.2122F, -0.2335F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 56, 67, -2.0F, -1.5F, -2.0F, 3, 8, 4, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(-0.49F, 5.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.5943F, -0.0213F, 0.2546F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 56, 80, -1.5F, 0.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.Lefthand = new AdvancedModelRendererExtended(this);
        this.Lefthand.setRotationPoint(0.0F, 8.1F, 0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.192F, 0.3609F, 0.1108F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 21, 13, -2.5F, -0.5F, -8.0F, 5, 2, 9, 0.0F, false));

        this.Leftthumb = new AdvancedModelRendererExtended(this);
        this.Leftthumb.setRotationPoint(2.2F, 0.7F, -1.5F);
        this.Lefthand.addChild(Leftthumb);
        this.setRotateAngle(Leftthumb, 0.0F, -0.6793F, 0.0F);
        this.Leftthumb.cubeList.add(new ModelBox(Leftthumb, 21, 27, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(4.0F, 5.5F, -7.0F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.3821F, 0.2122F, 0.2335F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 41, 67, -1.0F, -1.5F, -2.0F, 3, 8, 4, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(0.49F, 5.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5943F, 0.0213F, -0.2546F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 41, 80, -1.5F, 0.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.Righthand = new AdvancedModelRendererExtended(this);
        this.Righthand.setRotationPoint(0.0F, 8.1F, 0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.192F, -0.3609F, -0.1108F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 35, 1, -2.5F, -0.5F, -8.0F, 5, 2, 9, 0.0F, false));

        this.Rightthumb = new AdvancedModelRendererExtended(this);
        this.Rightthumb.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthand.addChild(Rightthumb);
        this.setRotateAngle(Rightthumb, 0.0F, 0.6793F, 0.0F);
        this.Rightthumb.cubeList.add(new ModelBox(Rightthumb, 0, 6, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(2.4F, 3.5F, 0.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.5519F, -0.5519F, 0.1061F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 30, 35, -1.0F, -1.0F, -2.3F, 4, 10, 5, 0.0F, false));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(1.0F, 9.0F, -2.0F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.7641F, 0.0F, -0.1061F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 39, 51, -1.5F, -0.4F, 0.0F, 3, 10, 5, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.2356F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 72, 38, -2.5F, -0.8F, -7.5F, 5, 2, 9, 0.0F, false));

        this.Rightopposabletoe = new AdvancedModelRendererExtended(this);
        this.Rightopposabletoe.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthindfoot.addChild(Rightopposabletoe);
        this.setRotateAngle(Rightopposabletoe, 0.0F, 0.6793F, 0.0F);
        this.Rightopposabletoe.cubeList.add(new ModelBox(Rightopposabletoe, 10, 5, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(-2.4F, 3.5F, 0.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.5519F, 0.5519F, -0.1061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 49, 35, -3.0F, -1.0F, -2.3F, 4, 10, 5, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(-1.0F, 9.0F, -2.0F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7641F, 0.0F, 0.1061F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 56, 51, -1.5F, -0.4F, 0.0F, 3, 10, 5, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.2356F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 72, 26, -2.5F, -0.8F, -7.5F, 5, 2, 9, 0.0F, false));

        this.Leftopposabletoe = new AdvancedModelRendererExtended(this);
        this.Leftopposabletoe.setRotationPoint(2.2F, 0.7F, -1.0F);
        this.Lefthindfoot.addChild(Leftopposabletoe);
        this.setRotateAngle(Leftopposabletoe, 0.0F, -0.6793F, 0.0F);
        this.Leftopposabletoe.cubeList.add(new ModelBox(Leftopposabletoe, 17, 0, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.15f);
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
        this.root.offsetY = 1.28F;

        EntityPrehistoricFloraSuminia Suminia = (EntityPrehistoricFloraSuminia) e;
        float masterSpeed = Suminia.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};

        if (Suminia.getAnimation() == Suminia.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Suminia.getScreaming()) {
            this.Neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(Lowerjawbase, 1.5F, 0.25F, false, 0, 1.5F, f2, 1F);
        }

        if ((f3 == 0.0F || !Suminia.getIsMoving()) && !Suminia.getIsClimbing()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.06F, 7.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (Suminia.getIsClimbing()) {
            //Pose for climbing:
            setRotateAngle(Tail1, 0, 0,0);
            setRotateAngle(Tail2, 0, 0,0);
            setRotateAngle(Tail3, -5, 0,0);
            setRotateAngle(Tail4, -5, 0,0);
            setRotateAngle(Tail5, -10, 0,0);
            setRotateAngle(Neck, (float)Math.toRadians(20), 0, 0);
            setRotateAngle(Head, (float)Math.toRadians(37), 0, 0);
            setRotateAngle(Rightupperarm, (float)Math.toRadians(21.89), (float)Math.toRadians(-12.16), (float)Math.toRadians(-36.62));
            setRotateAngle(Leftupperarm, (float)Math.toRadians(21.89), (float)Math.toRadians(12.16), (float)Math.toRadians(36.62));
            setRotateAngle(Rightlowerarm, (float)Math.toRadians(-34.05), (float)Math.toRadians(-1.22), (float)Math.toRadians(15.41));
            setRotateAngle(Leftlowerarm, (float)Math.toRadians(-34.05), (float)Math.toRadians(1.22), (float)Math.toRadians(-15.41));
            setRotateAngle(Rightthigh, (float)Math.toRadians(10.88), (float)Math.toRadians(19.12), (float)Math.toRadians(-33.92));
            setRotateAngle(Leftthigh, (float)Math.toRadians(10.88), (float)Math.toRadians(-19.12), (float)Math.toRadians(33.92));
            this.root.offsetY = 1.40F;
        }

        float speed = masterSpeed / 0.965F;
        if (Suminia.getIsFast()) {
            speed = speed * 1.5F;
        }

        if (Suminia.getIsClimbing()) {
            speed = speed * 2.0F;
        }

        float speedmodifier = 1;
        if (Suminia.getIsClimbing() && Suminia.getHeadCollided()) {
            speedmodifier = 0;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 0, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 3, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.walk(Leftupperarm, speed * speedmodifier, 0.5F, false, 0, -0.20F, f2, 1F);
        this.walk(Rightupperarm, speed * speedmodifier, 0.5F, false, 3, -0.20F, f2, 1F);
        this.flap(Leftupperarm, speed * speedmodifier, -0.15F, false, 1, 0.05F, f2, 1F);
        this.flap(Rightupperarm, speed * speedmodifier, 0.15F, false, 4, -0.05F, f2, 1F);

        this.walk(Leftlowerarm, speed * speedmodifier, -0.25F, false, 3, 0.10F, f2, 1F);
        this.walk(Rightlowerarm, speed * speedmodifier, -0.25F, false, 6, 0.10F, f2, 1F);
        this.flap(Leftlowerarm, speed * speedmodifier, -0.15F, false, 3, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed * speedmodifier, 0.15F, false, 6, -0.05F, f2, 1F);

        this.walk(Lefthand, speed * speedmodifier, 0.45F, false, 2, -0.08F, f2, 1F);
        this.walk(Righthand, speed * speedmodifier, 0.45F, false, 5, -0.08F, f2, 1F);


        this.walk(Leftthigh, speed * speedmodifier, 0.5F, true, 0, -0.20F, f2, 1F);
        this.walk(Rightthigh, speed * speedmodifier, 0.5F, true, 3, -0.20F, f2, 1F);
        this.flap(Leftthigh, speed * speedmodifier, 0.15F, true, 1, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed * speedmodifier, -0.15F, true, 4, 0.05F, f2, 1F);

        this.walk(Lefthindfoot, speed * speedmodifier, 0.45F, true, 3, 0.18F, f2, 1F);
        this.walk(Righthindfoot, speed * speedmodifier, 0.45F, true, 6, 0.18F, f2, 1F);

        this.bobExtended(root, speed * 2F * speedmodifier, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(root, speed * speedmodifier, 0.08F, false, 2.0F,0.04F, f2, 1.0F);
        this.flap(Bodymiddle, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);
        this.flap(Bodyfront, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2 * speedmodifier, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.10F, 7.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2 * speedmodifier, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSuminia e = (EntityPrehistoricFloraSuminia) entity;
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

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

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
