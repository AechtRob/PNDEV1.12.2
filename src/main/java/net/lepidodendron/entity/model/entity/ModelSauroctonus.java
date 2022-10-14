package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSauroctonus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSauroctonus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Belly;
    private final AdvancedModelRendererExtended Belly_r1;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Head2_r1;
    private final AdvancedModelRendererExtended Upperjaw1;
    private final AdvancedModelRendererExtended Upperjaw3;
    private final AdvancedModelRendererExtended Nose;
    private final AdvancedModelRendererExtended Nose_r1;
    private final AdvancedModelRendererExtended Upperjawteeth2;
    private final AdvancedModelRendererExtended Leftsabre;
    private final AdvancedModelRendererExtended Rightsabre;
    private final AdvancedModelRendererExtended Upperjawteeth1;
    private final AdvancedModelRendererExtended Lowerjaw1;
    private final AdvancedModelRendererExtended Lowerjaw2;
    private final AdvancedModelRendererExtended Lowerjaw3;
    private final AdvancedModelRendererExtended Lowerjawteeth2;
    private final AdvancedModelRendererExtended Lowerjawslope;
    private final AdvancedModelRendererExtended Lowerjawslope2_r1;
    private final AdvancedModelRendererExtended Lowerjawslope_r1;
    private final AdvancedModelRendererExtended Lowerjawteeth1;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Leftshin_r1;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Rightshin_r1;
    private final AdvancedModelRendererExtended Righthindfoot;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;

    private ModelAnimator animator;

    public ModelSauroctonus() {
        this.textureWidth = 128;
        this.textureHeight = 92;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 1.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 3.8F, 11.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1274F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 29, -4.0F, -1.0F, -5.0F, 8, 10, 12, 0.0F, false));

        this.Belly = new AdvancedModelRendererExtended(this);
        this.Belly.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.1061F, 0.0F, 0.0F);


        this.Belly_r1 = new AdvancedModelRendererExtended(this);
        this.Belly_r1.setRotationPoint(0.0F, 20.3F, -7.0F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, 0.0524F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 0, 0, -4.5F, -21.3F, -9.0F, 9, 12, 17, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -13.5F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0637F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 40, 29, -4.0F, 0.0F, -11.0F, 8, 10, 9, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 7.3F, -7.8F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.0637F, 0.0F, 0.0F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 69, 69, -3.0F, -1.5F, -2.0F, 4, 7, 5, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(-1.0F, 5.0F, 0.5F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.1274F, 0.0F, 0.0F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 32, 76, -1.5F, -1.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 6.5F, -0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0213F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 73, 5, -2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(3.0F, 7.4F, -7.8F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.0637F, 0.0F, 0.0F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 69, 43, -1.0F, -1.5F, -2.0F, 4, 7, 5, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(1.0F, 5.0F, 0.5F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.1274F, 0.0F, 0.0F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 18, 74, -1.5F, -1.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRendererExtended(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 6.5F, -0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.0213F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 68, 57, -2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 1.3F, -8.5F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.3644F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 30, 48, -3.0F, -1.0F, -8.5F, 6, 8, 10, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.8F, -7.6F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.4081F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 52, 11, -3.5F, -2.5F, -6.0F, 7, 5, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 51, -1.88F, -1.6F, -11.8F, 4, 1, 6, 0.0F, false));

        this.Head2_r1 = new AdvancedModelRendererExtended(this);
        this.Head2_r1.setRotationPoint(0.0F, -2.0F, -5.5F);
        this.Head.addChild(Head2_r1);
        this.setRotateAngle(Head2_r1, 0.2182F, 0.0F, 0.0F);
        this.Head2_r1.cubeList.add(new ModelBox(Head2_r1, 15, 51, -1.89F, -0.6F, -6.3F, 4, 1, 6, 0.0F, false));

        this.Upperjaw1 = new AdvancedModelRendererExtended(this);
        this.Upperjaw1.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.1485F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 0, 68, -2.5F, 0.0F, -6.0F, 5, 4, 6, 0.0F, false));

        this.Upperjaw3 = new AdvancedModelRendererExtended(this);
        this.Upperjaw3.setRotationPoint(0.0F, 0.0F, -5.6F);
        this.Upperjaw1.addChild(Upperjaw3);
        this.setRotateAngle(Upperjaw3, -0.1061F, 0.0F, 0.0F);
        this.Upperjaw3.cubeList.add(new ModelBox(Upperjaw3, 0, 35, -2.0F, 1.0F, -2.0F, 4, 3, 2, 0.0F, false));

        this.Nose = new AdvancedModelRendererExtended(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw3.addChild(Nose);
        this.setRotateAngle(Nose, 0.2972F, 0.0F, 0.0F);


        this.Nose_r1 = new AdvancedModelRendererExtended(this);
        this.Nose_r1.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.Nose.addChild(Nose_r1);
        this.setRotateAngle(Nose_r1, -1.1345F, 0.0F, 0.0F);
        this.Nose_r1.cubeList.add(new ModelBox(Nose_r1, 0, 14, -1.5F, -3.35F, -0.3F, 3, 3, 1, 0.0F, false));

        this.Upperjawteeth2 = new AdvancedModelRendererExtended(this);
        this.Upperjawteeth2.setRotationPoint(0.0F, 3.5F, -1.8F);
        this.Upperjaw3.addChild(Upperjawteeth2);
        this.setRotateAngle(Upperjawteeth2, 0.1061F, 0.0F, 0.0F);
        this.Upperjawteeth2.cubeList.add(new ModelBox(Upperjawteeth2, 29, 51, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.Leftsabre = new AdvancedModelRendererExtended(this);
        this.Leftsabre.setRotationPoint(-1.9F, 4.0F, -5.6F);
        this.Upperjaw1.addChild(Leftsabre);
        this.setRotateAngle(Leftsabre, 0.0637F, 0.0F, 0.0F);
        this.Leftsabre.cubeList.add(new ModelBox(Leftsabre, 11, 0, -0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.Rightsabre = new AdvancedModelRendererExtended(this);
        this.Rightsabre.setRotationPoint(1.9F, 4.0F, -5.6F);
        this.Upperjaw1.addChild(Rightsabre);
        this.setRotateAngle(Rightsabre, 0.0637F, 0.0F, 0.0F);
        this.Rightsabre.cubeList.add(new ModelBox(Rightsabre, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.Upperjawteeth1 = new AdvancedModelRendererExtended(this);
        this.Upperjawteeth1.setRotationPoint(0.0F, 4.0F, -4.4F);
        this.Upperjaw1.addChild(Upperjawteeth1);
        this.setRotateAngle(Upperjawteeth1, 0.1061F, 0.0F, 0.0F);
        this.Upperjawteeth1.cubeList.add(new ModelBox(Upperjawteeth1, 72, 13, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Lowerjaw1 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.Head.addChild(Lowerjaw1);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 17, 66, -3.5F, 0.0F, -5.0F, 7, 3, 5, 0.0F, false));

        this.Lowerjaw2 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 28, 29, -2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.Lowerjaw3 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 0.1F, -4.3F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1274F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 73, 0, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Lowerjawteeth2 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth2.setRotationPoint(0.0F, 0.5F, -3.2F);
        this.Lowerjaw3.addChild(Lowerjawteeth2);
        this.setRotateAngle(Lowerjawteeth2, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawteeth2.cubeList.add(new ModelBox(Lowerjawteeth2, 22, 58, -1.0F, -3.0F, 0.5F, 2, 3, 2, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, 3.1F, -4.8F);
        this.Lowerjaw2.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.4458F, 0.0F, 0.0F);


        this.Lowerjawslope2_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope2_r1.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.Lowerjawslope.addChild(Lowerjawslope2_r1);
        this.setRotateAngle(Lowerjawslope2_r1, 0.6981F, 0.0F, 0.0F);
        this.Lowerjawslope2_r1.cubeList.add(new ModelBox(Lowerjawslope2_r1, 86, 62, -1.98F, -2.9F, -5.1F, 4, 2, 5, 0.0F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope_r1.setRotationPoint(0.0F, -0.3528F, -1.5987F);
        this.Lowerjawslope.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, -0.6981F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 89, 71, -2.01F, -0.9072F, -0.3013F, 4, 2, 2, 0.0F, false));
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 89, 71, -2.0F, -0.8972F, -1.0F, 4, 2, 2, 0.0F, false));

        this.Lowerjawteeth1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth1.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.Lowerjaw2.addChild(Lowerjawteeth1);
        this.setRotateAngle(Lowerjawteeth1, -0.2122F, 0.0F, 0.0F);
        this.Lowerjawteeth1.cubeList.add(new ModelBox(Lowerjawteeth1, 28, 37, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.2F, -4.8F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 74, 31, -2.5F, -4.0F, 0.0F, 5, 4, 4, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(-3.0F, 2.9F, 2.2F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1911F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 51, -3.0F, -1.5F, -3.0F, 4, 10, 7, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(-1.0F, 8.6F, -2.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4458F, 0.0F, 0.0F);


        this.Leftshin_r1 = new AdvancedModelRendererExtended(this);
        this.Leftshin_r1.setRotationPoint(4.0F, 8.7F, -10.7F);
        this.Leftshin.addChild(Leftshin_r1);
        this.setRotateAngle(Leftshin_r1, -0.0873F, 0.0F, 0.0F);
        this.Leftshin_r1.cubeList.add(new ModelBox(Leftshin_r1, 53, 69, -5.5F, -9.7F, 10.2F, 3, 9, 5, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 8.0F, 2.7F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 65, 22, -2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(3.0F, 2.9F, 2.2F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1911F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 35, 0, -1.0F, -1.5F, -3.0F, 4, 10, 7, 0.0F, false));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(1.0F, 8.6F, -2.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4458F, 0.0F, 0.0F);


        this.Rightshin_r1 = new AdvancedModelRendererExtended(this);
        this.Rightshin_r1.setRotationPoint(-4.0F, 8.7F, -10.7F);
        this.Rightshin.addChild(Rightshin_r1);
        this.setRotateAngle(Rightshin_r1, -0.0873F, 0.0F, 0.0F);
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 0, 0, 2.5F, -9.7F, 10.2F, 3, 9, 5, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 8.0F, 2.7F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 52, 48, -2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, 2.0F, 6.5F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4435F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 83, 15, -2.5F, -2.5F, -1.5F, 5, 6, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 5.5F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1852F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 86, 33, -2.0F, -1.5F, -1.0F, 4, 4, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.2F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 100, 21, -1.5F, -1.1F, 0.5F, 3, 3, 8, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0213F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 88, 44, -1.0F, -0.6F, 0.0F, 2, 2, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.43f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neck.offsetY = -0.001F;
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(35);
        this.Neck.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.root.offsetY = 0.85F;

        EntityPrehistoricFloraSauroctonus Sauroctonus = (EntityPrehistoricFloraSauroctonus) e;
        float masterSpeed = Sauroctonus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        if (Sauroctonus.getAnimation() == Sauroctonus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Sauroctonus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.005F;
        if (Sauroctonus.getIsFast()) {
            speed = speed * 1.9F;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(Leftthigh, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        //this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Belly, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.9), false, 1.5F, f2, 1);
        this.root.offsetY = 0.90F;
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSauroctonus e = (EntityPrehistoricFloraSauroctonus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Belly, 0 , 5,0);
        animator.rotate(this.Belly, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lefthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Righthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
