package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRubidgea;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRubidgea extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Belly;
    private final AdvancedModelRendererExtended Belly_r1;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Head2browL_r1;
    private final AdvancedModelRendererExtended HeadFlangeR_r1;
    private final AdvancedModelRendererExtended HeadFlangeL_r1;
    private final AdvancedModelRendererExtended Upperjaw1;
    private final AdvancedModelRendererExtended Upperjaw1_r1;
    private final AdvancedModelRendererExtended eyeRB_r1;
    private final AdvancedModelRendererExtended eyeRT_r1;
    private final AdvancedModelRendererExtended eyeRTT_r1;
    private final AdvancedModelRendererExtended eyeLTT_r1;
    private final AdvancedModelRendererExtended eyeLT_r1;
    private final AdvancedModelRendererExtended eyeLB_r1;
    private final AdvancedModelRendererExtended Upperjaw1L_r1;
    private final AdvancedModelRendererExtended Upperjaw1L_r2;
    private final AdvancedModelRendererExtended Upperjaw3;
    private final AdvancedModelRendererExtended Nose;
    private final AdvancedModelRendererExtended Nose_r1;
    private final AdvancedModelRendererExtended Upperjawteeth2;
    private final AdvancedModelRendererExtended Leftsabre;
    private final AdvancedModelRendererExtended Upperjawteeth1;
    private final AdvancedModelRendererExtended Upperjawteeth1_r1;
    private final AdvancedModelRendererExtended Rightsabre;
    private final AdvancedModelRendererExtended Lowerjaw1;
    private final AdvancedModelRendererExtended Lowerjaw1b_r1;
    private final AdvancedModelRendererExtended Lowerjaw2;
    private final AdvancedModelRendererExtended Lowerjaw2_r1;
    private final AdvancedModelRendererExtended Lowerjaw3;
    private final AdvancedModelRendererExtended Lowerjaw3_r1;
    private final AdvancedModelRendererExtended Lowerjawteeth2;
    private final AdvancedModelRendererExtended Lowerjawteeth3;
    private final AdvancedModelRendererExtended Lowerjawteeth1;
    private final AdvancedModelRendererExtended Lowerjawteeth1_r1;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Leftupperarm2;
    private final AdvancedModelRendererExtended Leftlowerarm2;
    private final AdvancedModelRendererExtended Leftfrontfoot2;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Leftshin_r1;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Leftshin_r2;
    private final AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelRubidgea() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, -2.6435F, 2.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 4.2185F, 12.2116F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1274F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 32, -4.5F, -1.0087F, -5.5507F, 9, 11, 13, 0.0F, false));

        this.Belly = new AdvancedModelRendererExtended(this);
        this.Belly.setRotationPoint(0.0F, -0.111F, -4.4406F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.1061F, 0.0F, 0.0F);


        this.Belly_r1 = new AdvancedModelRendererExtended(this);
        this.Belly_r1.setRotationPoint(0.0F, 22.5359F, -7.771F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, 0.0524F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 0, 0, -5.5F, -23.4843F, -9.9913F, 11, 14, 18, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -14.9869F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0637F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 48, 22, -4.5F, -0.8986F, -12.2116F, 9, 12, 10, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(3.3304F, 8.2151F, -8.6591F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5F, 0.0F, 0.0F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 48, 70, -1.6696F, -1.0542F, -3.0603F, 5, 8, 6, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(1.1101F, 6.3907F, 0.5551F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.6074F, 0.0F, 0.0F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 43, 84, -1.3348F, -1.1188F, -3.0603F, 3, 10, 5, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.2159F, -0.333F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0649F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 70, 71, -2.7406F, 0.2203F, -5.8356F, 6, 2, 7, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 1.4432F, -9.4362F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.3644F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 32, 44, -4.0F, -1.6573F, -10.2762F, 8, 10, 12, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.8881F, -8.4371F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.4081F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 61, 8, -4.0F, -3.2246F, -6.6609F, 8, 6, 7, 0.0F, false));

        this.Head2browL_r1 = new AdvancedModelRendererExtended(this);
        this.Head2browL_r1.setRotationPoint(0.0F, -2.2203F, -6.1058F);
        this.Head.addChild(Head2browL_r1);
        this.setRotateAngle(Head2browL_r1, 0.2138F, 0.0F, 0.0F);
        this.Head2browL_r1.cubeList.add(new ModelBox(Head2browL_r1, 0, 0, -3.0F, -1.0251F, -1.9939F, 1, 3, 2, -0.01F, true));
        this.Head2browL_r1.cubeList.add(new ModelBox(Head2browL_r1, 0, 0, 2.0F, -1.0251F, -1.9939F, 1, 3, 2, -0.01F, false));
        this.Head2browL_r1.cubeList.add(new ModelBox(Head2browL_r1, 82, 50, -2.0F, -1.0251F, -6.9939F, 4, 3, 7, 0.0F, false));

        this.HeadFlangeR_r1 = new AdvancedModelRendererExtended(this);
        this.HeadFlangeR_r1.setRotationPoint(-2.0F, -0.2246F, -3.1609F);
        this.Head.addChild(HeadFlangeR_r1);
        this.setRotateAngle(HeadFlangeR_r1, 0.0F, -0.4363F, 0.0F);
        this.HeadFlangeR_r1.cubeList.add(new ModelBox(HeadFlangeR_r1, 80, 38, -3.3F, -3.0F, -2.4499F, 4, 6, 6, -0.01F, true));

        this.HeadFlangeL_r1 = new AdvancedModelRendererExtended(this);
        this.HeadFlangeL_r1.setRotationPoint(2.0F, -0.2246F, -3.1609F);
        this.Head.addChild(HeadFlangeL_r1);
        this.setRotateAngle(HeadFlangeL_r1, 0.0F, 0.4363F, 0.0F);
        this.HeadFlangeL_r1.cubeList.add(new ModelBox(HeadFlangeL_r1, 80, 38, -0.7F, -3.0F, -2.4499F, 4, 6, 6, -0.01F, false));

        this.Upperjaw1 = new AdvancedModelRendererExtended(this);
        this.Upperjaw1.setRotationPoint(0.0F, -1.6652F, -6.6609F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.1485F, 0.0F, 0.0F);


        this.Upperjaw1_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjaw1_r1.setRotationPoint(-0.1646F, 1.9206F, -3.3009F);
        this.Upperjaw1.addChild(Upperjaw1_r1);
        this.setRotateAngle(Upperjaw1_r1, -0.0175F, 0.0F, 0.0F);
        this.Upperjaw1_r1.cubeList.add(new ModelBox(Upperjaw1_r1, 63, 80, -1.8354F, -2.9144F, -3.3616F, 4, 3, 7, -0.01F, false));
        this.Upperjaw1_r1.cubeList.add(new ModelBox(Upperjaw1_r1, 40, 5, -3.1954F, -1.3707F, 1.68F, 2, 1, 2, 0.0F, true));
        this.Upperjaw1_r1.cubeList.add(new ModelBox(Upperjaw1_r1, 40, 5, 1.5246F, -1.3707F, 1.68F, 2, 1, 2, 0.0F, false));
        this.Upperjaw1_r1.cubeList.add(new ModelBox(Upperjaw1_r1, 24, 76, -2.8354F, -0.396F, -2.52F, 6, 3, 6, 0.0F, false));

        this.eyeRB_r1 = new AdvancedModelRendererExtended(this);
        this.eyeRB_r1.setRotationPoint(-2.52F, 2.0486F, -0.7827F);
        this.Upperjaw1.addChild(eyeRB_r1);
        this.setRotateAngle(eyeRB_r1, -0.0175F, -1.3526F, 0.0F);
        this.eyeRB_r1.cubeList.add(new ModelBox(eyeRB_r1, 0, 32, -0.88F, -0.4687F, -1.68F, 2, 2, 3, 0.0F, true));

        this.eyeRT_r1 = new AdvancedModelRendererExtended(this);
        this.eyeRT_r1.setRotationPoint(-2.7981F, -0.4628F, -0.9244F);
        this.Upperjaw1.addChild(eyeRT_r1);
        this.setRotateAngle(eyeRT_r1, 0.0654F, -1.3526F, 0.0F);
        this.eyeRT_r1.cubeList.add(new ModelBox(eyeRT_r1, 0, 56, -0.5019F, -0.9174F, -1.4255F, 1, 2, 3, 0.0F, true));

        this.eyeRTT_r1 = new AdvancedModelRendererExtended(this);
        this.eyeRTT_r1.setRotationPoint(-2.6238F, -0.8841F, 0.0792F);
        this.Upperjaw1.addChild(eyeRTT_r1);
        this.setRotateAngle(eyeRTT_r1, 0.0654F, -1.3526F, 0.0F);
        this.eyeRTT_r1.cubeList.add(new ModelBox(eyeRTT_r1, 60, 44, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, true));

        this.eyeLTT_r1 = new AdvancedModelRendererExtended(this);
        this.eyeLTT_r1.setRotationPoint(2.6238F, -0.8841F, 0.0792F);
        this.Upperjaw1.addChild(eyeLTT_r1);
        this.setRotateAngle(eyeLTT_r1, 0.0654F, 1.3526F, 0.0F);
        this.eyeLTT_r1.cubeList.add(new ModelBox(eyeLTT_r1, 60, 44, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

        this.eyeLT_r1 = new AdvancedModelRendererExtended(this);
        this.eyeLT_r1.setRotationPoint(2.7981F, -0.4628F, -0.9244F);
        this.Upperjaw1.addChild(eyeLT_r1);
        this.setRotateAngle(eyeLT_r1, 0.0654F, 1.3526F, 0.0F);
        this.eyeLT_r1.cubeList.add(new ModelBox(eyeLT_r1, 0, 56, -0.4981F, -0.9174F, -1.4255F, 1, 2, 3, 0.0F, false));

        this.eyeLB_r1 = new AdvancedModelRendererExtended(this);
        this.eyeLB_r1.setRotationPoint(2.52F, 2.0486F, -0.7827F);
        this.Upperjaw1.addChild(eyeLB_r1);
        this.setRotateAngle(eyeLB_r1, -0.0175F, 1.3526F, 0.0F);
        this.eyeLB_r1.cubeList.add(new ModelBox(eyeLB_r1, 0, 32, -1.12F, -0.4687F, -1.68F, 2, 2, 3, 0.0F, false));

        this.Upperjaw1L_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjaw1L_r1.setRotationPoint(-2.116F, 2.9725F, -6.2199F);
        this.Upperjaw1.addChild(Upperjaw1L_r1);
        this.setRotateAngle(Upperjaw1L_r1, -0.0175F, -0.2705F, 0.0F);
        this.Upperjaw1L_r1.cubeList.add(new ModelBox(Upperjaw1L_r1, 40, 0, -0.759F, -1.5F, -1.3799F, 2, 3, 2, -0.01F, true));

        this.Upperjaw1L_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjaw1L_r2.setRotationPoint(2.116F, 2.9725F, -6.2199F);
        this.Upperjaw1.addChild(Upperjaw1L_r2);
        this.setRotateAngle(Upperjaw1L_r2, -0.0175F, 0.2705F, 0.0F);
        this.Upperjaw1L_r2.cubeList.add(new ModelBox(Upperjaw1L_r2, 40, 0, -1.241F, -1.5F, -1.3799F, 2, 3, 2, -0.01F, false));

        this.Upperjaw3 = new AdvancedModelRendererExtended(this);
        this.Upperjaw3.setRotationPoint(0.0F, 0.0F, -6.2168F);
        this.Upperjaw1.addChild(Upperjaw3);
        this.setRotateAngle(Upperjaw3, -0.1061F, 0.0F, 0.0F);
        this.Upperjaw3.cubeList.add(new ModelBox(Upperjaw3, 31, 38, -2.5F, 1.5574F, -2.2203F, 5, 3, 3, 0.0F, false));

        this.Nose = new AdvancedModelRendererExtended(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -2.2203F);
        this.Upperjaw3.addChild(Nose);
        this.setRotateAngle(Nose, 0.2972F, 0.0F, 0.0F);


        this.Nose_r1 = new AdvancedModelRendererExtended(this);
        this.Nose_r1.setRotationPoint(0.0F, 1.6652F, -0.5551F);
        this.Nose.addChild(Nose_r1);
        this.setRotateAngle(Nose_r1, -0.8727F, 0.0F, 0.0F);
        this.Nose_r1.cubeList.add(new ModelBox(Nose_r1, 0, 37, -1.5F, -3.1954F, -0.0577F, 3, 3, 2, 0.0F, false));

        this.Upperjawteeth2 = new AdvancedModelRendererExtended(this);
        this.Upperjawteeth2.setRotationPoint(0.0F, 3.8855F, -1.9983F);
        this.Upperjaw3.addChild(Upperjawteeth2);
        this.setRotateAngle(Upperjawteeth2, 0.1061F, 0.0F, 0.0F);
        this.Upperjawteeth2.cubeList.add(new ModelBox(Upperjawteeth2, 0, 42, -1.5F, 0.3803F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Leftsabre = new AdvancedModelRendererExtended(this);
        this.Leftsabre.setRotationPoint(2.1093F, 4.4406F, -6.2168F);
        this.Upperjaw1.addChild(Leftsabre);
        this.setRotateAngle(Leftsabre, 0.0201F, 0.0F, 0.0F);
        this.Leftsabre.cubeList.add(new ModelBox(Leftsabre, 12, 0, -0.4449F, -0.0707F, -0.3371F, 1, 3, 2, 0.0F, false));

        this.Upperjawteeth1 = new AdvancedModelRendererExtended(this);
        this.Upperjawteeth1.setRotationPoint(0.0F, 4.4406F, -4.8846F);
        this.Upperjaw1.addChild(Upperjawteeth1);
        this.setRotateAngle(Upperjawteeth1, 0.1061F, 0.0F, 0.0F);


        this.Upperjawteeth1_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawteeth1_r1.setRotationPoint(-0.32F, 0.4693F, 1.5F);
        this.Upperjawteeth1.addChild(Upperjawteeth1_r1);
        this.setRotateAngle(Upperjawteeth1_r1, -0.0873F, 0.0F, 0.0F);
        this.Upperjawteeth1_r1.cubeList.add(new ModelBox(Upperjawteeth1_r1, 18, 56, -2.0F, -1.0F, -0.8652F, 4, 2, 3, 0.0F, false));

        this.Rightsabre = new AdvancedModelRendererExtended(this);
        this.Rightsabre.setRotationPoint(-2.1093F, 4.4406F, -6.2168F);
        this.Upperjaw1.addChild(Rightsabre);
        this.setRotateAngle(Rightsabre, 0.0201F, 0.0F, 0.0F);
        this.Rightsabre.cubeList.add(new ModelBox(Rightsabre, 12, 0, -0.5551F, -0.0707F, -0.3371F, 1, 3, 2, 0.0F, true));

        this.Lowerjaw1 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.7754F, -1.1101F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.0873F, 0.0F, 0.0F);


        this.Lowerjaw1b_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw1b_r1.setRotationPoint(0.0F, 1.4293F, -2.5507F);
        this.Lowerjaw1.addChild(Lowerjaw1b_r1);
        this.setRotateAngle(Lowerjaw1b_r1, -0.2182F, 0.0F, 0.0F);
        this.Lowerjaw1b_r1.cubeList.add(new ModelBox(Lowerjaw1b_r1, 40, 15, -4.0F, -2.8F, 1.0F, 8, 1, 2, -0.02F, false));
        this.Lowerjaw1b_r1.cubeList.add(new ModelBox(Lowerjaw1b_r1, 26, 66, -4.0F, -1.8F, -3.0F, 8, 4, 6, 0.0F, false));

        this.Lowerjaw2 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.5507F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);


        this.Lowerjaw2_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw2_r1.setRotationPoint(-0.1646F, 1.2304F, -2.6107F);
        this.Lowerjaw2.addChild(Lowerjaw2_r1);
        this.setRotateAngle(Lowerjaw2_r1, -0.0873F, 0.0F, 0.0F);
        this.Lowerjaw2_r1.cubeList.add(new ModelBox(Lowerjaw2_r1, 0, 75, -2.3354F, -1.74F, -2.94F, 5, 3, 7, 0.0F, false));

        this.Lowerjaw3 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 0.111F, -4.7736F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1274F, 0.0F, 0.0F);


        this.Lowerjaw3_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjaw3_r1.setRotationPoint(-0.2997F, 1.3803F, -1.6504F);
        this.Lowerjaw3.addChild(Lowerjaw3_r1);
        this.setRotateAngle(Lowerjaw3_r1, -0.1047F, 0.0F, 0.0F);
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 60, 0, -2.2003F, -2.3484F, -1.6816F, 5, 2, 3, -0.01F, false));

        this.Lowerjawteeth2 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth2.setRotationPoint(0.0F, 0.5551F, -3.5525F);
        this.Lowerjaw3.addChild(Lowerjawteeth2);
        this.setRotateAngle(Lowerjawteeth2, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawteeth2.cubeList.add(new ModelBox(Lowerjawteeth2, 7, 32, 1.0F, -2.7368F, 0.5551F, 1, 2, 1, 0.0F, false));

        this.Lowerjawteeth3 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth3.setRotationPoint(0.0F, 0.5551F, -3.5525F);
        this.Lowerjaw3.addChild(Lowerjawteeth3);
        this.setRotateAngle(Lowerjawteeth3, -0.0213F, 0.0F, 0.0F);
        this.Lowerjawteeth3.cubeList.add(new ModelBox(Lowerjawteeth3, 7, 32, -2.0F, -2.7368F, 0.5551F, 1, 2, 1, 0.0F, true));

        this.Lowerjawteeth1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth1.setRotationPoint(0.0F, 0.0F, -5.8985F);
        this.Lowerjaw2.addChild(Lowerjawteeth1);
        this.setRotateAngle(Lowerjawteeth1, -0.0377F, 0.0F, 0.0F);


        this.Lowerjawteeth1_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawteeth1_r1.setRotationPoint(0.0F, -0.5707F, 2.6887F);
        this.Lowerjawteeth1.addChild(Lowerjawteeth1_r1);
        this.setRotateAngle(Lowerjawteeth1_r1, -0.0436F, 0.0F, 0.0F);
        this.Lowerjawteeth1_r1.cubeList.add(new ModelBox(Lowerjawteeth1_r1, 25, 85, -2.0F, -1.0F, -2.0F, 4, 2, 5, 0.0F, false));

        this.Jawparting = new AdvancedModelRendererExtended(this);
        this.Jawparting.setRotationPoint(0.0F, 0.222F, -5.3287F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);
        this.Jawparting.cubeList.add(new ModelBox(Jawparting, 84, 0, -3.0F, -5.0F, 0.0F, 6, 5, 5, 0.0F, false));

        this.Leftupperarm2 = new AdvancedModelRendererExtended(this);
        this.Leftupperarm2.setRotationPoint(3.3304F, 8.2151F, -8.6591F);
        this.Bodyfront.addChild(Leftupperarm2);
        this.setRotateAngle(Leftupperarm2, 0.5F, 0.0F, 0.0F);
        this.Leftupperarm2.cubeList.add(new ModelBox(Leftupperarm2, 48, 70, -9.9913F, -1.0542F, -3.0603F, 5, 8, 6, 0.0F, true));

        this.Leftlowerarm2 = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm2.setRotationPoint(1.1101F, 6.3907F, 0.5551F);
        this.Leftupperarm2.addChild(Leftlowerarm2);
        this.setRotateAngle(Leftlowerarm2, -0.6074F, 0.0F, 0.0F);
        this.Leftlowerarm2.cubeList.add(new ModelBox(Leftlowerarm2, 43, 84, -10.5464F, -1.1188F, -3.0603F, 3, 10, 5, 0.0F, true));

        this.Leftfrontfoot2 = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot2.setRotationPoint(0.0F, 7.2159F, -0.333F);
        this.Leftlowerarm2.addChild(Leftfrontfoot2);
        this.setRotateAngle(Leftfrontfoot2, 0.0649F, 0.0F, 0.0F);
        this.Leftfrontfoot2.cubeList.add(new ModelBox(Leftfrontfoot2, 70, 71, -12.1406F, 0.2203F, -5.8356F, 6, 2, 7, 0.0F, true));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(3.3304F, 3.2194F, 2.4423F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1911F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 56, -1.6696F, -1.5638F, -3.3304F, 5, 11, 8, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(1.1101F, 9.5472F, -2.7754F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4458F, 0.0F, 0.0F);


        this.Leftshin_r1 = new AdvancedModelRendererExtended(this);
        this.Leftshin_r1.setRotationPoint(-4.4406F, 9.6583F, -11.8785F);
        this.Leftshin.addChild(Leftshin_r1);
        this.setRotateAngle(Leftshin_r1, -0.0873F, 0.0F, 0.0F);
        this.Leftshin_r1.cubeList.add(new ModelBox(Leftshin_r1, 0, 0, 3.1058F, -10.7771F, 11.3235F, 3, 10, 6, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 8.8812F, 2.9974F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 60, 44, -2.7406F, 0.2203F, -6.6609F, 6, 2, 8, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, 2.2203F, 7.2159F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4435F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 40, 0, -3.0F, -2.7554F, -1.6652F, 6, 7, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.111F, 6.1058F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1852F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 64, 58, -2.5F, -2.2246F, -1.1101F, 5, 5, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.222F, 5.5507F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 76, 21, -1.5F, -0.8907F, 0.5551F, 3, 3, 8, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 8.3261F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0213F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 77, 82, -1.0F, -0.4458F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(-3.3304F, 3.2194F, 2.4423F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1911F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 56, -3.3304F, -1.5638F, -3.3304F, 5, 11, 8, 0.0F, true));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(-1.1101F, 9.5472F, -2.7754F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4458F, 0.0F, 0.0F);


        this.Leftshin_r2 = new AdvancedModelRendererExtended(this);
        this.Leftshin_r2.setRotationPoint(4.4406F, 9.6583F, -11.8785F);
        this.Rightshin.addChild(Leftshin_r2);
        this.setRotateAngle(Leftshin_r2, -0.0873F, 0.0F, 0.0F);
        this.Leftshin_r2.cubeList.add(new ModelBox(Leftshin_r2, 0, 0, -6.1058F, -10.7771F, 11.3235F, 3, 10, 6, 0.0F, true));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 8.8812F, 2.9974F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 60, 44, -3.2594F, 0.2203F, -6.6609F, 6, 2, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    
    public void renderStaticWall(float f) {
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(50);
        this.Neck.offsetY = -0.04F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.1274F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Belly, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Belly_r1, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.7383F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.6758F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.7135F, 0.5236F, 0.0F);
        this.setRotateAngle(Head, 0.2335F, 0.1309F, -0.1745F);
        this.setRotateAngle(Head2browL_r1, 0.2138F, 0.0F, 0.0F);
        this.setRotateAngle(HeadFlangeR_r1, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(HeadFlangeL_r1, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw1_r1, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(eyeRB_r1, -0.0175F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeRT_r1, 0.0654F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeRTT_r1, 0.0654F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeLTT_r1, 0.0654F, 1.3526F, 0.0F);
        this.setRotateAngle(eyeLT_r1, 0.0654F, 1.3526F, 0.0F);
        this.setRotateAngle(eyeLB_r1, -0.0175F, 1.3526F, 0.0F);
        this.setRotateAngle(Upperjaw1L_r1, -0.0175F, -0.2705F, 0.0F);
        this.setRotateAngle(Upperjaw1L_r2, -0.0175F, 0.2705F, 0.0F);
        this.setRotateAngle(Upperjaw3, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Nose, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Nose_r1, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth2, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftsabre, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth1, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth1_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Rightsabre, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw1, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw1b_r1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw2_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw3, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw3_r1, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth2, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth3, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth1, -0.0377F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth1_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm2, -0.6074F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot2, 0.0649F, 0.0F, 0.0F);
        this.setRotateAngle(Leftthigh, 0.3325F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin, 0.4894F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.178F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.7053F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.033F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1958F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.1522F, 0.0F, 0.0F);
        this.setRotateAngle(Rightthigh, -0.3656F, 0.0F, 0.0F);
        this.setRotateAngle(Rightshin, 0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin_r2, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.1344F, 0.0F, 0.0F);
        this.root.offsetY = -0.08F;
        this.root.offsetX = 0.1F;
        this.root.offsetZ = -0.15F;
        this.root.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.2F;
        this.root.offsetX = -0.8F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 2.2F, 0.2F);
        this.setRotateAngle(Hips, -0.1274F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Belly, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Belly_r1, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.7383F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.6758F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.7135F, 0.5236F, 0.0F);
        this.setRotateAngle(Head, 0.2335F, 0.1309F, -0.1745F);
        this.setRotateAngle(Head2browL_r1, 0.2138F, 0.0F, 0.0F);
        this.setRotateAngle(HeadFlangeR_r1, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(HeadFlangeL_r1, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw1_r1, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(eyeRB_r1, -0.0175F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeRT_r1, 0.0654F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeRTT_r1, 0.0654F, -1.3526F, 0.0F);
        this.setRotateAngle(eyeLTT_r1, 0.0654F, 1.3526F, 0.0F);
        this.setRotateAngle(eyeLT_r1, 0.0654F, 1.3526F, 0.0F);
        this.setRotateAngle(eyeLB_r1, -0.0175F, 1.3526F, 0.0F);
        this.setRotateAngle(Upperjaw1L_r1, -0.0175F, -0.2705F, 0.0F);
        this.setRotateAngle(Upperjaw1L_r2, -0.0175F, 0.2705F, 0.0F);
        this.setRotateAngle(Upperjaw3, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Nose, 0.2972F, 0.0F, 0.0F);
        this.setRotateAngle(Nose_r1, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth2, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftsabre, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth1, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawteeth1_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Rightsabre, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw1, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw1b_r1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw2_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw3, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw3_r1, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth2, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth3, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth1, -0.0377F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawteeth1_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);
        this.setRotateAngle(Leftupperarm2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm2, -0.6074F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot2, 0.0649F, 0.0F, 0.0F);
        this.setRotateAngle(Leftthigh, 0.3325F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin, 0.4894F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.178F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.7053F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.033F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1958F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.1522F, 0.0F, 0.0F);
        this.setRotateAngle(Rightthigh, -0.3656F, 0.0F, 0.0F);
        this.setRotateAngle(Rightshin, 0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin_r2, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.1344F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraRubidgea Rubidgea = (EntityPrehistoricFloraRubidgea) e;
        float masterSpeed = Rubidgea.getTravelSpeed();

        //masterSpeed = 0.345F;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        if (Rubidgea.getAnimation() == Rubidgea.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Rubidgea.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Rubidgea.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Leftupperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.Leftlowerarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 2, f2, 1.5F);;
        this.Leftlowerarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 5, f2, 1.5F);;
        this.Leftshin.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 5, f2, 1.5F);;
        this.Rightshin.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 2, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(Leftupperarm2, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(Leftthigh, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0F, f2, 1F);
        this.walk(Leftupperarm2, speed, 0.40F, true, 8, 0F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(Leftlowerarm2, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Leftfrontfoot2, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(root, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(root, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRubidgea e = (EntityPrehistoricFloraRubidgea) entity;
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
        animator.rotate(this.Head, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.root, 0 , 5,0);
        animator.rotate(this.root, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot2, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lefthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Righthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
