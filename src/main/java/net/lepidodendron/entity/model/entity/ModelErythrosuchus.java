package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraErythrosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelErythrosuchus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neckback;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer UpperteethmidfrontR_r1;
    private final AdvancedModelRenderer UpperteethmidfrontL_r1;
    private final AdvancedModelRenderer UpperteethmiddleR_r1;
    private final AdvancedModelRenderer UpperteethmiddleL_r1;
    private final AdvancedModelRenderer UpperteethbackR_r1;
    private final AdvancedModelRenderer UpperteethbackL_r1;
    private final AdvancedModelRenderer Snoutslope_r1;
    private final AdvancedModelRenderer Upperlipfront_r1;
    private final AdvancedModelRenderer Upperlipback_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Upperjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerteethfront_r1;
    private final AdvancedModelRenderer Lowerjawslope_r1;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawmiddlefront_r1;
    private final AdvancedModelRenderer Lowerjawmiddleback_r1;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightleg4;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftleg4;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;

    private ModelAnimator animator;

    public ModelErythrosuchus() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -19.95F, 15.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2536F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 51, 76, -4.5F, -2.0F, -7.0F, 9, 13, 11, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.1F, -6.8F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1463F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 71, -5.5F, -2.0F, -13.5F, 11, 15, 14, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -12.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2559F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 44, -5.0F, -2.0F, -12.0F, 10, 14, 12, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.9F, -10.7F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 45, 55, -3.5F, -1.0F, -7.0F, 7, 12, 8, 0.0F, false));

        this.Neckback = new AdvancedModelRenderer(this);
        this.Neckback.setRotationPoint(0.01F, 11.0F, 1.0F);
        this.Neck.addChild(Neckback);
        this.setRotateAngle(Neckback, 0.1698F, 0.0F, 0.0F);
        this.Neckback.cubeList.add(new ModelBox(Neckback, 0, 13, -3.5F, -7.0F, 0.0F, 7, 7, 3, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.05F, -3.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0024F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 68, 43, -4.5F, -2.5F, -7.0F, 9, 7, 7, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -2.4F, -7.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.4245F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 100, 0, -3.0F, 0.0F, -5.0F, 6, 5, 5, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 0, -1.51F, 2.6661F, -12.6045F, 3, 2, 0, 0.0F, false));

        this.UpperteethmidfrontR_r1 = new AdvancedModelRenderer(this);
        this.UpperteethmidfrontR_r1.setRotationPoint(-2.05F, 2.8916F, -12.1428F);
        this.Upperjaw.addChild(UpperteethmidfrontR_r1);
        this.setRotateAngle(UpperteethmidfrontR_r1, -0.1517F, -0.1149F, 0.0552F);
        this.UpperteethmidfrontR_r1.cubeList.add(new ModelBox(UpperteethmidfrontR_r1, 11, 4, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.UpperteethmidfrontL_r1 = new AdvancedModelRenderer(this);
        this.UpperteethmidfrontL_r1.setRotationPoint(2.05F, 2.8916F, -12.1428F);
        this.Upperjaw.addChild(UpperteethmidfrontL_r1);
        this.setRotateAngle(UpperteethmidfrontL_r1, -0.1517F, 0.1149F, -0.0552F);
        this.UpperteethmidfrontL_r1.cubeList.add(new ModelBox(UpperteethmidfrontL_r1, 11, 1, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.UpperteethmiddleR_r1 = new AdvancedModelRenderer(this);
        this.UpperteethmiddleR_r1.setRotationPoint(-2.61F, 3.8514F, -9.2443F);
        this.Upperjaw.addChild(UpperteethmiddleR_r1);
        this.setRotateAngle(UpperteethmiddleR_r1, -0.1707F, -0.0821F, 0.0214F);
        this.UpperteethmiddleR_r1.cubeList.add(new ModelBox(UpperteethmiddleR_r1, 18, 3, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.UpperteethmiddleL_r1 = new AdvancedModelRenderer(this);
        this.UpperteethmiddleL_r1.setRotationPoint(2.59F, 3.8514F, -9.2443F);
        this.Upperjaw.addChild(UpperteethmiddleL_r1);
        this.setRotateAngle(UpperteethmiddleL_r1, -0.1707F, 0.0821F, -0.0214F);
        this.UpperteethmiddleL_r1.cubeList.add(new ModelBox(UpperteethmiddleL_r1, 18, 0, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.UpperteethbackR_r1 = new AdvancedModelRenderer(this);
        this.UpperteethbackR_r1.setRotationPoint(-3.0375F, 5.2567F, -5.4165F);
        this.Upperjaw.addChild(UpperteethbackR_r1);
        this.setRotateAngle(UpperteethbackR_r1, -0.0915F, -0.1031F, 0.0252F);
        this.UpperteethbackR_r1.cubeList.add(new ModelBox(UpperteethbackR_r1, 0, 2, 0.0F, 0.0F, 0.0236F, 0, 1, 3, 0.0F, false));

        this.UpperteethbackL_r1 = new AdvancedModelRenderer(this);
        this.UpperteethbackL_r1.setRotationPoint(3.06F, 5.3559F, -5.4167F);
        this.Upperjaw.addChild(UpperteethbackL_r1);
        this.setRotateAngle(UpperteethbackL_r1, -0.0915F, 0.1031F, -0.0252F);
        this.UpperteethbackL_r1.cubeList.add(new ModelBox(UpperteethbackL_r1, 0, 0, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Snoutslope_r1 = new AdvancedModelRenderer(this);
        this.Snoutslope_r1.setRotationPoint(-0.01F, -0.1164F, -8.2115F);
        this.Upperjaw.addChild(Snoutslope_r1);
        this.setRotateAngle(Snoutslope_r1, -0.0372F, 0.0F, 0.0F);
        this.Snoutslope_r1.cubeList.add(new ModelBox(Snoutslope_r1, 92, 104, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.Upperlipfront_r1 = new AdvancedModelRenderer(this);
        this.Upperlipfront_r1.setRotationPoint(0.0F, 4.7224F, -9.471F);
        this.Upperjaw.addChild(Upperlipfront_r1);
        this.setRotateAngle(Upperlipfront_r1, -0.4458F, 0.0F, 0.0F);
        this.Upperlipfront_r1.cubeList.add(new ModelBox(Upperlipfront_r1, 52, 109, -2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Upperlipback_r1 = new AdvancedModelRenderer(this);
        this.Upperlipback_r1.setRotationPoint(0.01F, 5.65F, -5.9F);
        this.Upperjaw.addChild(Upperlipback_r1);
        this.setRotateAngle(Upperlipback_r1, -0.2388F, 0.0F, 0.0F);
        this.Upperlipback_r1.cubeList.add(new ModelBox(Upperlipback_r1, 96, 11, -3.5F, -5.0F, 0.0F, 7, 5, 4, 0.0F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(-0.01F, -0.1164F, -8.2115F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.1698F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 92, 87, -2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.Upperjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Upperjawmiddle_r1.setRotationPoint(-0.01F, 5.73F, -5.6F);
        this.Upperjaw.addChild(Upperjawmiddle_r1);
        this.setRotateAngle(Upperjawmiddle_r1, -0.2546F, 0.0F, 0.0F);
        this.Upperjawmiddle_r1.cubeList.add(new ModelBox(Upperjawmiddle_r1, 101, 43, -3.0F, -5.0F, -4.0F, 6, 5, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 68, 30, -4.0F, 0.0F, -7.0F, 8, 4, 8, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 27, 0, -2.0F, -0.3009F, -13.2335F, 4, 1, 5, 0.0F, false));

        this.Lowerteethfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerteethfront_r1.setRotationPoint(0.01F, 1.3144F, -16.3699F);
        this.Lowerjaw.addChild(Lowerteethfront_r1);
        this.setRotateAngle(Lowerteethfront_r1, 0.1698F, 0.0F, 0.0F);
        this.Lowerteethfront_r1.cubeList.add(new ModelBox(Lowerteethfront_r1, 24, 7, -2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslope_r1.setRotationPoint(-0.01F, 4.0F, -7.0F);
        this.Lowerjaw.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, -0.1114F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 0, 107, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.7246F, -13.6327F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.2122F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 69, 109, -2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.Lowerjawmiddlefront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddlefront_r1.setRotationPoint(0.0F, 3.4639F, -9.4498F);
        this.Lowerjaw.addChild(Lowerjawmiddlefront_r1);
        this.setRotateAngle(Lowerjawmiddlefront_r1, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront_r1.cubeList.add(new ModelBox(Lowerjawmiddlefront_r1, 52, 101, -2.5F, -3.0F, -4.0F, 5, 3, 4, 0.0F, false));

        this.Lowerjawmiddleback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddleback_r1.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Lowerjaw.addChild(Lowerjawmiddleback_r1);
        this.setRotateAngle(Lowerjawmiddleback_r1, 0.1698F, 0.0F, 0.0F);
        this.Lowerjawmiddleback_r1.cubeList.add(new ModelBox(Lowerjawmiddleback_r1, 14, 101, -3.0F, 0.0F, -3.0F, 6, 3, 3, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(-0.01F, 0.1F, -5.5F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.2759F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 101, 21, -3.5F, -6.0F, 0.0F, 7, 6, 4, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(3.8F, 9.27F, -9.0F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.2936F, 0.0F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 77, 0, -1.0F, -2.0F, -2.0F, 5, 8, 6, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(1.5F, 5.8F, 2.5F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -0.506F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 18, 19, -2.0F, -0.5F, -4.0F, 4, 8, 5, 0.0F, false));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.0F, 7.2F, -2.0F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0637F, 0.0F, 0.0F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 95, 53, -2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-3.8F, 9.27F, -9.0F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.2936F, 0.0F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 78, 15, -4.0F, -2.0F, -2.0F, 5, 8, 6, 0.0F, false));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-1.5F, 5.8F, 2.5F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -0.506F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 59, 9, -2.0F, -0.5F, -4.0F, 4, 8, 5, 0.0F, false));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(0.0F, 7.2F, -2.0F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0637F, 0.0F, 0.0F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 101, 63, -2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-3.5F, 4.41F, -3.0F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.0436F, 0.0F, 0.0F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 76, 58, -4.0F, -1.5F, -2.5F, 5, 10, 7, 0.0F, false));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-1.5F, 7.5F, -1.8F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.3183F, 0.0F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 38, 22, -2.0F, 0.0F, -0.5F, 4, 9, 5, 0.0F, false));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.0F, 8.5F, 2.3F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.0213F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 87, 96, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Rightleg4 = new AdvancedModelRenderer(this);
        this.Rightleg4.setRotationPoint(-0.01F, 0.49F, -2.8F);
        this.Rightleg3.addChild(Rightleg4);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 33, 101, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(3.5F, 4.41F, -3.0F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.0436F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 0, 26, -1.0F, -1.5F, -2.5F, 5, 10, 7, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(1.5F, 7.5F, -1.8F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.3183F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 57, 23, -2.0F, 0.0F, -0.5F, 4, 9, 5, 0.0F, false));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(0.0F, 8.5F, 2.3F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.0213F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 71, 101, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Leftleg4 = new AdvancedModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.01F, 0.49F, -2.8F);
        this.Leftleg3.addChild(Leftleg4);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 33, 108, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.2F, 2.5F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1108F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 33, 37, -3.5F, -2.0F, 0.0F, 7, 9, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.2F, 6.5F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0897F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 39, 0, -2.5F, -1.5F, 0.0F, 5, 6, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.2F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0696F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 101, 32, -2.0F, -1.5F, 0.0F, 4, 4, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.4F, 5.2F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0649F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 81, 76, -1.5F, -1.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.2F, 5.4F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1133F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 95, 73, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Neck.offsetY = -0.035F;
        this.Neck.offsetZ = -0.3F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.08F, -0.05F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.2F, -0.1F, 0.02F);
        this.setRotateAngle(Neck, -0.05F, 0.0F, -0.01F);
        this.setRotateAngle(Head, -0.08F, -0.05F, -0.15F);
        this.setRotateAngle(Lowerjaw, 0.47F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm1, 0.3F, -0.1F, -0.05F);
        this.setRotateAngle(Leftarm2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm1, 0.5F, 0.15F, 0.05F);
        this.setRotateAngle(Rightarm2, -1.15F, -0.05F, 0.1F);
        this.setRotateAngle(Rightarm3, 1.25F, -0.1F, 0.0F);
        this.setRotateAngle(Leftleg1, 0.3F, -0.1F, 0.0F);
        this.setRotateAngle(Leftleg2, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg4, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.02F, -0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(Tail5, 0.2F, -0.2F, 0.0F);
        this.Hips.offsetY = 0.099F;
        this.Hips.offsetX = 0.02F;
        this.Hips.render(0.01F);
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
        //this.resetToDefaultPose();
        this.Hips.offsetY = 1.5F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraErythrosuchus Erythrosuchus = (EntityPrehistoricFloraErythrosuchus) e;

        this.faceTarget(f3, f4, 6, Neck);
        this.faceTarget(f3, f4, 6, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] NeckF = {this.Neck, this.Head};
        Erythrosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};


        if (!Erythrosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Erythrosuchus.getIsMoving()) {
                this.chainSwing(NeckF, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(NeckF, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraErythrosuchus ee = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-3) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-1) + (((tickAnim - 20D) / 60D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*3) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*3D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.5D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*1) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*10) + (((tickAnim - 0D) / 20D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*10D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1) + (((tickAnim - 20D) / 60D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D)));
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-30))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+90))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-30))*1) + (((tickAnim - 20D) / 60D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+90))*3) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+90))*3D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/1))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/1))*-1) + (((tickAnim - 20D) / 60D) * (0D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/1))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5) + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5) + (((tickAnim - 20D) / 60D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.25) + (((tickAnim - 0D) / 20D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.25D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.1) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.1D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5) + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5) + (((tickAnim - 20D) / 60D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*2D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*-0.05D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*0.25D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*15D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*0.1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*0.1) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*0.1D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5))*0.5D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*-5) + (((tickAnim - 10D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*5D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-60))*3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-30))*-5D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*3) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-30))*-5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-30))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-3) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-3D)));
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5) + (((tickAnim - 10D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5))*2.5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5))*2.5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-2.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5) + (((tickAnim - 10D) / 10D) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*2.5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*2.5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5D-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-2.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-15) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+90))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-15D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-120))*3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+90))*10) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+90))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*-3) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+30))*-3D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-60))*10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.75-60))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*-3) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*-3D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-90))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-90))*-30) + (((tickAnim - 10D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-90))*-30D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10) + (((tickAnim - 20D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5) + (((tickAnim - 30D) / 10D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-20) + (((tickAnim - 10D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-100))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10) + (((tickAnim - 20D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.5+60))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5) + (((tickAnim - 30D) / 10D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-60))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-0.5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*1.5D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-1.75D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5) + (((tickAnim - 20D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.5-30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1-30))*5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10) + (((tickAnim - 20D) / 5D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+40))*-50D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*-10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*-10D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+40))*-50) + (((tickAnim - 25D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+40))*-50D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1+30))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1+30))*-5D)));
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-20) + (((tickAnim - 20D) / 5D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-20D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.37+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*1) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25-60))*1D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30) + (((tickAnim - 25D) / 3D) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*30D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.37+60))*-5) + (((tickAnim - 25D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1.37+60))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*3) + (((tickAnim - 25D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-60))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*3D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*30) + (((tickAnim - 28D) / 12D) * (0D-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*30D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-5) + (((tickAnim - 28D) / 12D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+60))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-60))*-3) + (((tickAnim - 28D) / 12D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-60))*-3D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-1) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37-90))*70D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37-90))*70) + (((tickAnim - 25D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37-90))*70D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*5) + (((tickAnim - 28D) / 12D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*5D)));
            yy = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-10) + (((tickAnim - 20D) / 5D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30) + (((tickAnim - 25D) / 3D) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-60))*30D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.37+90))*30D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-60))*30) + (((tickAnim - 28D) / 12D) * (0D-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-60))*30D)));
            yy = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*0.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*0.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*0.5D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-0.5D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10) + (((tickAnim - 20D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5) + (((tickAnim - 15D) / 25D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 40D) / 10D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3) + (((tickAnim - 15D) / 25D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3) + (((tickAnim - 40D) / 10D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3D)));
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*15D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 15D) / 25D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-60))*-50D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-60))*-50) + (((tickAnim - 40D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-60))*-50D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-120))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-120))*30) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1-120))*30D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 15D) / 25D) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*-30) + (((tickAnim - 40D) / 10D) * (0D-(30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*-30D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*5) + (((tickAnim - 15D) / 25D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 40D) / 10D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+90))*3D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-5) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 15D) / 25D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1) + (((tickAnim - 40D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10D + (((tickAnim - 0D) / 3D) * (0D-(-10D)));
            yy = -5D + (((tickAnim - 0D) / 3D) * (-2.5D-(-5D)));
            zz = -10D + (((tickAnim - 0D) / 3D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (20D-(0D)));
            yy = -2.5D + (((tickAnim - 3D) / 5D) * (0D-(-2.5D)));
            zz = -10D + (((tickAnim - 3D) / 5D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20D + (((tickAnim - 8D) / 2D) * (15D-(20D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (-5D-(0D)));
            zz = -5D + (((tickAnim - 8D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 15D + (((tickAnim - 10D) / 4D) * (0D-(15D)));
            yy = -5D + (((tickAnim - 10D) / 4D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 10D) / 4D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (-25D-(0D)));
            yy = -5D + (((tickAnim - 14D) / 4D) * (-10D-(-5D)));
            zz = -5D + (((tickAnim - 14D) / 4D) * (-10D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25D + (((tickAnim - 18D) / 2D) * (-10D-(-25D)));
            yy = -10D + (((tickAnim - 18D) / 2D) * (-5D-(-10D)));
            zz = -10D + (((tickAnim - 18D) / 2D) * (-10D-(-10D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -2D + (((tickAnim - 0D) / 2D) * (-1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D-(-2D)));
            zz = -1D + (((tickAnim - 0D) / 2D) * (-1D-(-1D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -1.6+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5) + (((tickAnim - 2D) / 1D) * (-1.2D-(-1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D)));
            zz = -1D + (((tickAnim - 2D) / 1D) * (-1D-(-1D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1.2D + (((tickAnim - 3D) / 2D) * (-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D-(-1.2D)));
            zz = -1D + (((tickAnim - 3D) / 2D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = -1.2+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5) + (((tickAnim - 5D) / 3D) * (-1.2D-(-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D)));
            zz = -0.5D + (((tickAnim - 5D) / 3D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = -1.2D + (((tickAnim - 8D) / 2D) * (-1.5D-(-1.2D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 10D) / 4D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (-1D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 18D) / 2D) * (-2D-(0.5D)));
            zz = -1D + (((tickAnim - 18D) / 2D) * (-1D-(-1D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5D + (((tickAnim - 0D) / 3D) * (2.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 3D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 3D) / 5D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 3D) / 5D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (27.5D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 8D) / 2D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27.5D + (((tickAnim - 10D) / 4D) * (50D-(27.5D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 50D + (((tickAnim - 14D) / 4D) * (40D-(50D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40D + (((tickAnim - 18D) / 2D) * (-17.5D-(40D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 5D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5D + (((tickAnim - 0D) / 3D) * (-2.5D-(27.5D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
            zz = 10D + (((tickAnim - 0D) / 3D) * (5D-(10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5D + (((tickAnim - 3D) / 5D) * (-20D-(-2.5D)));
            yy = 5D + (((tickAnim - 3D) / 5D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 3D) / 5D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20D + (((tickAnim - 8D) / 2D) * (42.5D-(-20D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (5D-(0D)));
            zz = 2.5D + (((tickAnim - 8D) / 2D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 42.5D + (((tickAnim - 10D) / 4D) * (60D-(42.5D)));
            yy = 5D + (((tickAnim - 10D) / 4D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 60D + (((tickAnim - 14D) / 4D) * (-15D-(60D)));
            yy = 5D + (((tickAnim - 14D) / 4D) * (5D-(5D)));
            zz = 2.5D + (((tickAnim - 14D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15D + (((tickAnim - 18D) / 2D) * (27.5D-(-15D)));
            yy = 5D + (((tickAnim - 18D) / 2D) * (5D-(5D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (10D-(2.5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 5D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -85D + (((tickAnim - 10D) / 4D) * (2.5D-(-85D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.5D + (((tickAnim - 14D) / 4D) * (47.5D-(2.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 47.5D + (((tickAnim - 18D) / 2D) * (0D-(47.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5D + (((tickAnim - 0D) / 5D) * (37.5D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37.5D + (((tickAnim - 5D) / 5D) * (15D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (-5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 10D) / 3D) * (-25D-(15D)));
            yy = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 10D) / 3D) * (-10D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25D + (((tickAnim - 13D) / 2D) * (-52.5D-(-25D)));
            yy = -5D + (((tickAnim - 13D) / 2D) * (-5D-(-5D)));
            zz = -10D + (((tickAnim - 13D) / 2D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -52.5D + (((tickAnim - 15D) / 3D) * (-12.5D-(-52.5D)));
            yy = -5D + (((tickAnim - 15D) / 3D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 15D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.5D + (((tickAnim - 18D) / 2D) * (5D-(-12.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 18D) / 2D) * (0D-(-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 0D) / 5D) * (-0.5D-(-0.5D)));
            zz = 0.5D + (((tickAnim - 0D) / 5D) * (0.5D-(0.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 5D) / 5D) * (0.5D-(-0.5D)));
            zz = 0.5D + (((tickAnim - 5D) / 5D) * (0.5D-(0.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 10D) / 3D) * (0.5D-(0.5D)));
            zz = 0.5D + (((tickAnim - 10D) / 3D) * (0.5D-(0.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 13D) / 2D) * (0D-(0.5D)));
            zz = 0.5D + (((tickAnim - 13D) / 2D) * (-1D-(0.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D-(0D)));
            zz = -1D + (((tickAnim - 15D) / 2D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5) + (((tickAnim - 17D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D)));
            zz = -0.5D + (((tickAnim - 17D) / 1D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 1D) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0.25D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
            yy = -0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5) + (((tickAnim - 19D) / 1D) * (-0.5D-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D)));
            zz = 0.25D + (((tickAnim - 19D) / 1D) * (0.5D-(0.25D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.5D + (((tickAnim - 0D) / 5D) * (-25D-(27.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25D + (((tickAnim - 5D) / 5D) * (-57.5D-(-25D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -57.5D + (((tickAnim - 10D) / 3D) * (-32.5D-(-57.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.5D + (((tickAnim - 13D) / 2D) * (25D-(-32.5D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 13D) / 2D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 25D + (((tickAnim - 15D) / 3D) * (2.5D-(25D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 15D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5D + (((tickAnim - 18D) / 2D) * (27.5D-(2.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (0D-(2.5D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25) + (((tickAnim - 17D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 19D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -32.5D + (((tickAnim - 0D) / 5D) * (82.5D-(-32.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 82.5D + (((tickAnim - 5D) / 5D) * (110D-(82.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 110D + (((tickAnim - 10D) / 3D) * (72.5D-(110D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-5D-(0D)));
            zz = 5D + (((tickAnim - 10D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 72.5D + (((tickAnim - 13D) / 2D) * (27.5D-(72.5D)));
            yy = -5D + (((tickAnim - 13D) / 2D) * (-2.5D-(-5D)));
            zz = 5D + (((tickAnim - 13D) / 2D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 27.5D + (((tickAnim - 15D) / 3D) * (10D-(27.5D)));
            yy = -2.5D + (((tickAnim - 15D) / 3D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 15D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 18D) / 2D) * (-32.5D-(10D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (0D-(2.5D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25) + (((tickAnim - 17D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 19D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
        }
        this.Leftarm3.offsetX = (float) Math.toRadians(xx);
        this.Leftarm3.offsetY = (float) Math.toRadians(yy);
        this.Leftarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15D + (((tickAnim - 0D) / 3D) * (-25D-(15D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (10D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25D + (((tickAnim - 3D) / 2D) * (-52.5D-(-25D)));
            yy = 5D + (((tickAnim - 3D) / 2D) * (5D-(5D)));
            zz = 10D + (((tickAnim - 3D) / 2D) * (5D-(10D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -52.5D + (((tickAnim - 5D) / 3D) * (-12.5D-(-52.5D)));
            yy = 5D + (((tickAnim - 5D) / 3D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 5D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.5D + (((tickAnim - 8D) / 2D) * (5D-(-12.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 8D) / 2D) * (0D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5D + (((tickAnim - 10D) / 5D) * (37.5D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 37.5D + (((tickAnim - 15D) / 5D) * (15D-(37.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (5D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 0D) / 3D) * (0.5D-(0.5D)));
            zz = 0.5D + (((tickAnim - 0D) / 3D) * (0.5D-(0.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 3D) / 2D) * (0D-(0.5D)));
            zz = 0.5D + (((tickAnim - 3D) / 2D) * (-1D-(0.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D-(0D)));
            zz = -1D + (((tickAnim - 5D) / 2D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5) + (((tickAnim - 7D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D)));
            zz = -0.5D + (((tickAnim - 7D) / 1D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0.25D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = -0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5) + (((tickAnim - 9D) / 1D) * (-0.5D-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D)));
            zz = 0.25D + (((tickAnim - 9D) / 1D) * (0.5D-(0.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 10D) / 5D) * (-0.5D-(-0.5D)));
            zz = 0.5D + (((tickAnim - 10D) / 5D) * (0.5D-(0.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 15D) / 5D) * (0.5D-(-0.5D)));
            zz = 0.5D + (((tickAnim - 15D) / 5D) * (0.5D-(0.5D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -57.5D + (((tickAnim - 0D) / 3D) * (-32.5D-(-57.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.5D + (((tickAnim - 3D) / 2D) * (25D-(-32.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 3D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25D + (((tickAnim - 5D) / 3D) * (2.5D-(25D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 5D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5D + (((tickAnim - 8D) / 2D) * (27.5D-(2.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.5D + (((tickAnim - 10D) / 5D) * (-25D-(27.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -25D + (((tickAnim - 15D) / 5D) * (-57.5D-(-25D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25) + (((tickAnim - 7D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 9D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 110D + (((tickAnim - 0D) / 3D) * (72.5D-(110D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (5D-(0D)));
            zz = -5D + (((tickAnim - 0D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 72.5D + (((tickAnim - 3D) / 2D) * (27.5D-(72.5D)));
            yy = 5D + (((tickAnim - 3D) / 2D) * (2.5D-(5D)));
            zz = -5D + (((tickAnim - 3D) / 2D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 27.5D + (((tickAnim - 5D) / 3D) * (10D-(27.5D)));
            yy = 2.5D + (((tickAnim - 5D) / 3D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 5D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10D + (((tickAnim - 8D) / 2D) * (-32.5D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -32.5D + (((tickAnim - 10D) / 5D) * (82.5D-(-32.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 82.5D + (((tickAnim - 15D) / 5D) * (110D-(82.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (-5D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25) + (((tickAnim - 7D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.25D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 9D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm3.offsetX = (float) Math.toRadians(xx);
        this.Rightarm3.offsetY = (float) Math.toRadians(yy);
        this.Rightarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15D + (((tickAnim - 0D) / 4D) * (0D-(15D)));
            yy = 5D + (((tickAnim - 0D) / 4D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (-25D-(0D)));
            yy = 5D + (((tickAnim - 4D) / 4D) * (10D-(5D)));
            zz = 5D + (((tickAnim - 4D) / 4D) * (10D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25D + (((tickAnim - 8D) / 2D) * (-10D-(-25D)));
            yy = 10D + (((tickAnim - 8D) / 2D) * (5D-(10D)));
            zz = 10D + (((tickAnim - 8D) / 2D) * (10D-(10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 10D) / 3D) * (0D-(-10D)));
            yy = 5D + (((tickAnim - 10D) / 3D) * (2.5D-(5D)));
            zz = 10D + (((tickAnim - 10D) / 3D) * (10D-(10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (20D-(0D)));
            yy = 2.5D + (((tickAnim - 13D) / 5D) * (0D-(2.5D)));
            zz = 10D + (((tickAnim - 13D) / 5D) * (5D-(10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20D + (((tickAnim - 18D) / 2D) * (15D-(20D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (5D-(0D)));
            zz = 5D + (((tickAnim - 18D) / 2D) * (5D-(5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 0D) / 4D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (-1D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 8D) / 2D) * (-2D-(0.5D)));
            zz = -1D + (((tickAnim - 8D) / 2D) * (-1D-(-1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = -2D + (((tickAnim - 10D) / 2D) * (-1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D-(-2D)));
            zz = -1D + (((tickAnim - 10D) / 2D) * (-1D-(-1D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = -1.6+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5) + (((tickAnim - 12D) / 1D) * (-1.2D-(-1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.5D)));
            zz = -1D + (((tickAnim - 12D) / 1D) * (-1D-(-1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = -1.2D + (((tickAnim - 13D) / 2D) * (-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D-(-1.2D)));
            zz = -1D + (((tickAnim - 13D) / 2D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            yy = -1.2+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5) + (((tickAnim - 15D) / 3D) * (-1.2D-(-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.5D)));
            zz = -0.5D + (((tickAnim - 15D) / 3D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = -1.2D + (((tickAnim - 18D) / 2D) * (-1.5D-(-1.2D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.5D + (((tickAnim - 0D) / 4D) * (50D-(27.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 50D + (((tickAnim - 4D) / 4D) * (40D-(50D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40D + (((tickAnim - 8D) / 2D) * (-17.5D-(40D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5D + (((tickAnim - 10D) / 3D) * (2.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 10D) / 3D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.5D + (((tickAnim - 13D) / 5D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 13D) / 5D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (27.5D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (0D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 15D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 42.5D + (((tickAnim - 0D) / 4D) * (60D-(42.5D)));
            yy = -5D + (((tickAnim - 0D) / 4D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 60D + (((tickAnim - 4D) / 4D) * (-15D-(60D)));
            yy = -5D + (((tickAnim - 4D) / 4D) * (-5D-(-5D)));
            zz = -2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15D + (((tickAnim - 8D) / 2D) * (27.5D-(-15D)));
            yy = -5D + (((tickAnim - 8D) / 2D) * (-5D-(-5D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (-10D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.5D + (((tickAnim - 10D) / 3D) * (-2.5D-(27.5D)));
            yy = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
            zz = -10D + (((tickAnim - 10D) / 3D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.5D + (((tickAnim - 13D) / 5D) * (-20D-(-2.5D)));
            yy = -5D + (((tickAnim - 13D) / 5D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 13D) / 5D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20D + (((tickAnim - 18D) / 2D) * (42.5D-(-20D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (-5D-(0D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (0D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.4D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25) + (((tickAnim - 15D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -85D + (((tickAnim - 0D) / 4D) * (2.5D-(-85D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 4D) / 4D) * (47.5D-(2.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 47.5D + (((tickAnim - 8D) / 2D) * (0D-(47.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*5), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3) + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75) + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3) + (((tickAnim - 2D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75) + (((tickAnim - 2D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3) + (((tickAnim - 6D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75) + (((tickAnim - 6D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3) + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75) + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3) + (((tickAnim - 12D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-30))*-0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75) + (((tickAnim - 12D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720-10))*0.75D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360))*-5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*-2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*2), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360))*-3), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*5));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*0.1D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.offsetX = (float) Math.toRadians(xx);
        this.Neck.offsetY = (float) Math.toRadians(yy);
        this.Neck.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*-2), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*3), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-3));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-7.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 2D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1) + (((tickAnim - 12D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.25))*-0.1D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-120))*5), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*3));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraErythrosuchus entity = (EntityPrehistoricFloraErythrosuchus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 0D) / 8D) * (30D-(5D)));
            yy = 2.5D + (((tickAnim - 0D) / 8D) * (2.5D-(2.5D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 30D + (((tickAnim - 8D) / 12D) * (30D-(30D)));
            yy = 2.5D + (((tickAnim - 8D) / 12D) * (-5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 8D) / 12D) * (-5D-(2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30D + (((tickAnim - 20D) / 10D) * (-15D-(30D)));
            yy = -5D + (((tickAnim - 20D) / 10D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 20D) / 10D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -15D + (((tickAnim - 30D) / 3D) * (-47.5D-(-15D)));
            yy = -5D + (((tickAnim - 30D) / 3D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 30D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = -47.5D + (((tickAnim - 33D) / 14D) * (-5D-(-47.5D)));
            yy = -5D + (((tickAnim - 33D) / 14D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 33D) / 14D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -5D + (((tickAnim - 47D) / 13D) * (5D-(-5D)));
            yy = -2.5D + (((tickAnim - 47D) / 13D) * (2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 47D) / 13D) * (0D-(-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 0D) / 8D) * (-0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 8D) / 12D) * (1D-(-0.5D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 20D) / 10D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 30D) / 3D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5) + (((tickAnim - 40D) / 7D) * (-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D)));
            zz = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
            yy = -0.25D + (((tickAnim - 47D) / 6D) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(-0.25D)));
            zz = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            yy = -0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 53D) / 7D) * (-0.5D-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 30D + (((tickAnim - 0D) / 8D) * (10D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 8D) / 12D) * (-40D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (5D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40D + (((tickAnim - 20D) / 10D) * (-27.5D-(-40D)));
            yy = 5D + (((tickAnim - 20D) / 10D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 20D) / 10D) * (5D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -27.5D + (((tickAnim - 30D) / 3D) * (20D-(-27.5D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 30D) / 3D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 20D + (((tickAnim - 33D) / 14D) * (-2.5D-(20D)));
            yy = 0D + (((tickAnim - 33D) / 14D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 33D) / 14D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -2.5D + (((tickAnim - 47D) / 13D) * (30D-(-2.5D)));
            yy = 0D + (((tickAnim - 47D) / 13D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 47D) / 13D) * (0D-(2.5D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25) + (((tickAnim - 40D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D)));
            zz = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 47D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 53D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -35D + (((tickAnim - 0D) / 8D) * (37.5D-(-35D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 37.5D + (((tickAnim - 8D) / 12D) * (115D-(37.5D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 115D + (((tickAnim - 20D) / 10D) * (72.5D-(115D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 72.5D + (((tickAnim - 30D) / 3D) * (27.5D-(72.5D)));
            yy = -5D + (((tickAnim - 30D) / 3D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (5D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 27.5D + (((tickAnim - 33D) / 14D) * (7.5D-(27.5D)));
            yy = 0D + (((tickAnim - 33D) / 14D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 33D) / 14D) * (5D-(5D)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 7.5D + (((tickAnim - 47D) / 13D) * (-35D-(7.5D)));
            yy = 0D + (((tickAnim - 47D) / 13D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 47D) / 13D) * (0D-(5D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 33D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25) + (((tickAnim - 40D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D)));
            zz = 0D + (((tickAnim - 40D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 47D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 47D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 53D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.Leftarm3.offsetX = (float) Math.toRadians(xx);
        this.Leftarm3.offsetY = (float) Math.toRadians(yy);
        this.Leftarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15D + (((tickAnim - 0D) / 3D) * (-47.5D-(-15D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = -47.5D + (((tickAnim - 3D) / 14D) * (-5D-(-47.5D)));
            yy = 5D + (((tickAnim - 3D) / 14D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 3D) / 14D) * (5D-(5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -5D + (((tickAnim - 17D) / 13D) * (5D-(-5D)));
            yy = 2.5D + (((tickAnim - 17D) / 13D) * (-2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 17D) / 13D) * (0D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 5D + (((tickAnim - 30D) / 8D) * (30D-(5D)));
            yy = -2.5D + (((tickAnim - 30D) / 8D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 30D) / 8D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 30D + (((tickAnim - 38D) / 12D) * (30D-(30D)));
            yy = -2.5D + (((tickAnim - 38D) / 12D) * (5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 38D) / 12D) * (5D-(-2.5D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 30D + (((tickAnim - 50D) / 10D) * (-15D-(30D)));
            yy = 5D + (((tickAnim - 50D) / 10D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 50D) / 10D) * (5D-(5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 3D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5) + (((tickAnim - 10D) / 7D) * (-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = -0.25D + (((tickAnim - 17D) / 6D) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(-0.25D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            yy = -0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 23D) / 7D) * (-0.5D-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 30D) / 8D) * (-0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 38D) / 12D) * (1D-(-0.5D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 50D) / 10D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.5D + (((tickAnim - 0D) / 3D) * (20D-(-27.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 0D) / 3D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 20D + (((tickAnim - 3D) / 14D) * (-2.5D-(20D)));
            yy = 0D + (((tickAnim - 3D) / 14D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 3D) / 14D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 17D) / 13D) * (30D-(-2.5D)));
            yy = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 17D) / 13D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 30D + (((tickAnim - 30D) / 8D) * (10D-(30D)));
            yy = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 10D + (((tickAnim - 38D) / 12D) * (-40D-(10D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (-5D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -40D + (((tickAnim - 50D) / 10D) * (-27.5D-(-40D)));
            yy = -5D + (((tickAnim - 50D) / 10D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 50D) / 10D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25) + (((tickAnim - 10D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 23D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.5D + (((tickAnim - 0D) / 3D) * (27.5D-(72.5D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 27.5D + (((tickAnim - 3D) / 14D) * (7.5D-(27.5D)));
            yy = 0D + (((tickAnim - 3D) / 14D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 3D) / 14D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 7.5D + (((tickAnim - 17D) / 13D) * (-35D-(7.5D)));
            yy = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 17D) / 13D) * (0D-(-5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -35D + (((tickAnim - 30D) / 8D) * (37.5D-(-35D)));
            yy = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 37.5D + (((tickAnim - 38D) / 12D) * (115D-(37.5D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 115D + (((tickAnim - 50D) / 10D) * (72.5D-(115D)));
            yy = 0D + (((tickAnim - 50D) / 10D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25) + (((tickAnim - 10D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.25D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 23D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm3.offsetX = (float) Math.toRadians(xx);
        this.Rightarm3.offsetY = (float) Math.toRadians(yy);
        this.Rightarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 0D) / 13D) * (-20D-(15D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -20D + (((tickAnim - 13D) / 12D) * (-40D-(-20D)));
            yy = 5D + (((tickAnim - 13D) / 12D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 13D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -40D + (((tickAnim - 25D) / 5D) * (-12.5D-(-40D)));
            yy = 5D + (((tickAnim - 25D) / 5D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 25D) / 5D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -12.5D + (((tickAnim - 30D) / 12D) * (-5D-(-12.5D)));
            yy = 5D + (((tickAnim - 30D) / 12D) * (2.5D-(5D)));
            zz = 2.5D + (((tickAnim - 30D) / 12D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -5D + (((tickAnim - 42D) / 11D) * (17.5D-(-5D)));
            yy = 2.5D + (((tickAnim - 42D) / 11D) * (0D-(2.5D)));
            zz = 5D + (((tickAnim - 42D) / 11D) * (0D-(5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 17.5D + (((tickAnim - 53D) / 7D) * (15D-(17.5D)));
            yy = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 13D) * (1D-(-1D)));
            zz = 1D + (((tickAnim - 0D) / 13D) * (0D-(1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 13D) / 12D) * (0.5D-(1D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 25D) / 5D) * (-1.5D-(0.5D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 30D) / 6D) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D-(-1.5D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = -0.6+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5) + (((tickAnim - 36D) / 6D) * (-0.6D-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = -0.6D + (((tickAnim - 42D) / 6D) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(-0.6D)));
            zz = 0D + (((tickAnim - 42D) / 6D) * (0.25D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = -0.6+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 48D) / 5D) * (-0.5D-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = 0.25D + (((tickAnim - 48D) / 5D) * (0.5D-(0.25D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 53D) / 7D) * (-1D-(-0.5D)));
            zz = 0.5D + (((tickAnim - 53D) / 7D) * (1D-(0.5D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.5D + (((tickAnim - 0D) / 13D) * (55D-(27.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 55D + (((tickAnim - 13D) / 12D) * (35D-(55D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 35D + (((tickAnim - 25D) / 5D) * (-17.5D-(35D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -17.5D + (((tickAnim - 30D) / 12D) * (2.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 30D) / 12D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 2.5D + (((tickAnim - 42D) / 11D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 42D) / 11D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (27.5D-(0D)));
            yy = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 48D) / 5D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -12.5D + (((tickAnim - 0D) / 12D) * (-5D-(-12.5D)));
            yy = -5D + (((tickAnim - 0D) / 12D) * (-2.5D-(-5D)));
            zz = -2.5D + (((tickAnim - 0D) / 12D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -5D + (((tickAnim - 12D) / 11D) * (17.5D-(-5D)));
            yy = -2.5D + (((tickAnim - 12D) / 11D) * (0D-(-2.5D)));
            zz = -5D + (((tickAnim - 12D) / 11D) * (0D-(-5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 17.5D + (((tickAnim - 23D) / 7D) * (15D-(17.5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 15D + (((tickAnim - 30D) / 13D) * (-20D-(15D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (-5D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -20D + (((tickAnim - 43D) / 12D) * (-40D-(-20D)));
            yy = -5D + (((tickAnim - 43D) / 12D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 43D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -40D + (((tickAnim - 55D) / 5D) * (-12.5D-(-40D)));
            yy = -5D + (((tickAnim - 55D) / 5D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 55D) / 5D) * (-2.5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 0D) / 6D) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D-(-1.5D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = -0.6+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5) + (((tickAnim - 6D) / 6D) * (-0.6D-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.5D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = -0.6D + (((tickAnim - 12D) / 6D) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(-0.6D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0.25D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = -0.5+(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 18D) / 5D) * (-0.6D-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = 0.25D + (((tickAnim - 18D) / 5D) * (0.5D-(0.25D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            yy = -0.6D + (((tickAnim - 23D) / 7D) * (-1D-(-0.6D)));
            zz = 0.5D + (((tickAnim - 23D) / 7D) * (1D-(0.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 30D) / 13D) * (1D-(-1D)));
            zz = 1D + (((tickAnim - 30D) / 13D) * (0D-(1D)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 43D) / 12D) * (0.5D-(1D)));
            zz = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 55D) / 5D) * (-1.5D-(0.5D)));
            zz = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -17.5D + (((tickAnim - 0D) / 12D) * (2.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 12D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 2.5D + (((tickAnim - 12D) / 11D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 12D) / 11D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (27.5D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 27.5D + (((tickAnim - 30D) / 13D) * (55D-(27.5D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 55D + (((tickAnim - 43D) / 12D) * (35D-(55D)));
            yy = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 35D + (((tickAnim - 55D) / 5D) * (-17.5D-(35D)));
            yy = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 55D) / 5D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 18D) / 5D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 42.5D + (((tickAnim - 0D) / 13D) * (82.5D-(42.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 82.5D + (((tickAnim - 13D) / 12D) * (22.5D-(82.5D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 22.5D + (((tickAnim - 25D) / 5D) * (30D-(22.5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 30D + (((tickAnim - 30D) / 12D) * (2.5D-(30D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (-2.5D-(0D)));
            zz = -2.5D + (((tickAnim - 30D) / 12D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 2.5D + (((tickAnim - 42D) / 11D) * (-17.5D-(2.5D)));
            yy = -2.5D + (((tickAnim - 42D) / 11D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 42D) / 11D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -17.5D + (((tickAnim - 53D) / 7D) * (42.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 48D) / 5D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 30D + (((tickAnim - 0D) / 12D) * (2.5D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (2.5D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 12D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 2.5D + (((tickAnim - 12D) / 11D) * (-17.5D-(2.5D)));
            yy = 2.5D + (((tickAnim - 12D) / 11D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 12D) / 11D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -17.5D + (((tickAnim - 23D) / 7D) * (42.5D-(-17.5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 42.5D + (((tickAnim - 30D) / 13D) * (82.5D-(42.5D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 82.5D + (((tickAnim - 43D) / 12D) * (22.5D-(82.5D)));
            yy = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 22.5D + (((tickAnim - 55D) / 5D) * (30D-(22.5D)));
            yy = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 55D) / 5D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.4D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15) + (((tickAnim - 18D) / 5D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.15D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -85D + (((tickAnim - 0D) / 13D) * (5D-(-85D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 13D) / 12D) * (42.5D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 42.5D + (((tickAnim - 25D) / 5D) * (0D-(42.5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -85D + (((tickAnim - 30D) / 13D) * (5D-(-85D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 5D + (((tickAnim - 43D) / 12D) * (42.5D-(5D)));
            yy = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 42.5D + (((tickAnim - 55D) / 5D) * (0D-(42.5D)));
            yy = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 55D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-30))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+30))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+30))*2));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75) + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75) + (((tickAnim - 6D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75) + (((tickAnim - 12D) / 18D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75) + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*0.3D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75) + (((tickAnim - 36D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720/3-10))*0.75D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3))*-3), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*-2));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+60))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-120))*3), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-120))*2));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 6D) / 11D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 11D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 36D) / 11D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 11D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 11D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-30))*2), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+60))*5), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*-3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 6D) / 11D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 11D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 36D) / 11D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 11D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 11D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.offsetX = (float) Math.toRadians(xx);
        this.Neck.offsetY = (float) Math.toRadians(yy);
        this.Neck.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-60))*-2), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+100))*-3), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+30))*3));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+70))*-1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+30))*-3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+90))*-6), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+90))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-30))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+30))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+30))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-90))*-5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-30))*-5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-30))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/60D)*720))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-150))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-60))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-60))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-210))*-5), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-90))*-10), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-90))*3));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}
