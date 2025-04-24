package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOphthalmothule;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOphthalmothule extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck5;
    private final AdvancedModelRenderer Neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer LeftIris_r1;
    private final AdvancedModelRenderer Lefteye_r1;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Rightiris_r1;
    private final AdvancedModelRenderer Righteye_r1;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Upperjawslopefront_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Masseter;
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
    private final AdvancedModelRenderer Tailflukerudderend_r1;
    private final AdvancedModelRenderer Tailflukerudderfront_r1;
    private final AdvancedModelRenderer Tailflukeend_r1;
    private final AdvancedModelRenderer Tailflukemiddle_r1;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Lefthindflipper3;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Righthindflipper3;

    private ModelAnimator animator;

    public ModelOphthalmothule() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 15.0F, 12.0F);


        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0873F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 38, 32, -5.0F, -3.4745F, -1.857F, 10, 10, 8, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -7.0F, -4.0F, -19.0F, 13, 13, 19, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.5F, 1.0F, -17.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 32, -5.5F, -4.5F, -8.0F, 11, 10, 8, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0436F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 45, 0, -4.0F, -3.4564F, -8.001F, 8, 8, 9, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.4564F, -7.001F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 32, 50, -3.5F, -2.5436F, -8.001F, 7, 7, 9, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.2936F, -7.001F);
        this.Neck2.addChild(Neck3);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 54, 56, -3.0F, -2.0F, -9.0F, 6, 6, 10, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.25F, -8.0F);
        this.Neck3.addChild(Neck4);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 0, 50, -2.5F, -1.5F, -10.0F, 5, 5, 11, 0.01F, false));

        this.Neck5 = new AdvancedModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.25F, -9.0F);
        this.Neck4.addChild(Neck5);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 48, 72, -2.0F, -1.5F, -8.0F, 4, 4, 8, 0.0F, false));

        this.Neck6 = new AdvancedModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.Neck5.addChild(Neck6);
        this.Neck6.cubeList.add(new ModelBox(Neck6, 65, 78, -1.5F, -0.525F, -7.0F, 3, 2, 7, -0.01F, false));
        this.Neck6.cubeList.add(new ModelBox(Neck6, 0, 8, -1.5F, -1.5F, -6.0F, 3, 1, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.625F, -5.5F);
        this.Neck6.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 64, 52, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(-0.5F, -1.0F, -3.0F);
        this.head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.1047F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 0, 15, -1.5F, 0.325F, -0.125F, 3, 1, 3, 0.01F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(0.75F, -0.325F, -3.0F);
        this.head.addChild(Lefteye);


        this.LeftIris_r1 = new AdvancedModelRenderer(this);
        this.LeftIris_r1.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.Lefteye.addChild(LeftIris_r1);
        this.setRotateAngle(LeftIris_r1, 0.1083F, 0.2717F, -0.0683F);
        this.LeftIris_r1.cubeList.add(new ModelBox(LeftIris_r1, 16, 93, -0.8653F, -0.4492F, -0.5897F, 1, 1, 1, -0.01F, false));

        this.Lefteye_r1 = new AdvancedModelRenderer(this);
        this.Lefteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lefteye.addChild(Lefteye_r1);
        this.setRotateAngle(Lefteye_r1, 0.1083F, 0.2717F, -0.0683F);
        this.Lefteye_r1.cubeList.add(new ModelBox(Lefteye_r1, 0, 3, -0.675F, -0.425F, -1.025F, 1, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(-1.75F, -0.325F, -3.0F);
        this.head.addChild(Righteye);


        this.Rightiris_r1 = new AdvancedModelRenderer(this);
        this.Rightiris_r1.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.Righteye.addChild(Rightiris_r1);
        this.setRotateAngle(Rightiris_r1, 0.1083F, -0.2717F, 0.0683F);
        this.Rightiris_r1.cubeList.add(new ModelBox(Rightiris_r1, 0, 0, -0.0847F, -0.4492F, -1.0897F, 1, 1, 2, 0.0F, false));

        this.Righteye_r1 = new AdvancedModelRenderer(this);
        this.Righteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Righteye.addChild(Righteye_r1);
        this.setRotateAngle(Righteye_r1, 0.1083F, -0.2717F, 0.0683F);
        this.Righteye_r1.cubeList.add(new ModelBox(Righteye_r1, 16, 93, -0.375F, -0.425F, -0.525F, 1, 1, 1, -0.01F, true));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(-0.5F, 1.0F, -3.0F);
        this.head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 50, -1.0F, -1.005F, -2.0F, 2, 1, 2, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 11, -0.5F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Upperjaw.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.1047F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 12, 0, -0.5F, 0.325F, -3.125F, 1, 1, 1, 0.01F, false));
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 45, 4, -1.0F, 0.325F, -2.125F, 2, 1, 2, 0.01F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(-0.5F, 1.025F, 0.0083F);
        this.head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 55, 50, -1.5F, -0.025F, -3.0121F, 3, 1, 3, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 9, 15, -1.0F, -0.025F, -5.0121F, 2, 1, 2, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 12, 2, -0.5F, -0.025F, -6.0121F, 1, 1, 1, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.1F, -2.2583F);
        this.Lowerjaw.addChild(Masseter);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 0, 91, -1.0F, -1.525F, -0.05F, 2, 2, 1, -0.01F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(5.0F, 3.0F, -3.5F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.0F, 0.2182F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 24, 77, -0.5F, -1.5F, -2.5F, 6, 3, 5, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(5.425F, 0.0F, -2.375F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1745F, 0.0F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 66, 30, 0.0543F, -1.0F, -0.0363F, 9, 2, 7, 0.0F, false));

        this.Leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(9.1043F, -0.5F, 0.4637F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.2182F, 0.0F);
        this.Leftfrontflipper3.cubeList.add(new ModelBox(Leftfrontflipper3, 64, 72, -1.0988F, 0.0F, 0.0044F, 9, 1, 5, 0.0F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-5.0F, 3.0F, -3.5F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0F, -0.2182F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 24, 77, -5.5F, -1.5F, -2.5F, 6, 3, 5, 0.0F, true));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-5.425F, 0.0F, -2.375F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1745F, 0.0F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 66, 30, -9.0543F, -1.0F, -0.0363F, 9, 2, 7, 0.0F, true));

        this.Rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-9.1043F, -0.5F, 0.4637F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.2182F, 0.0F);
        this.Rightfrontflipper3.cubeList.add(new ModelBox(Rightfrontflipper3, 64, 72, -7.9012F, 0.0F, 0.0044F, 9, 1, 5, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.65F, 6.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1309F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 64, 17, -4.0F, -3.0F, 0.0F, 8, 6, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.75F, 6.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 75, -3.0F, -2.0F, 0.0F, 6, 4, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 21, 50, -2.0F, -1.5F, 0.0F, 4, 3, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.025F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -1.5F, -1.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Tailfluke = new AdvancedModelRenderer(this);
        this.Tailfluke.setRotationPoint(0.0F, -0.5407F, 4.9381F);
        this.Tail4.addChild(Tailfluke);
        this.setRotateAngle(Tailfluke, -0.0873F, 0.0F, 0.0F);


        this.Tailflukerudderend_r1 = new AdvancedModelRenderer(this);
        this.Tailflukerudderend_r1.setRotationPoint(0.0F, 0.358F, 2.1673F);
        this.Tailfluke.addChild(Tailflukerudderend_r1);
        this.setRotateAngle(Tailflukerudderend_r1, 0.8116F, 0.0F, 0.0F);
        this.Tailflukerudderend_r1.cubeList.add(new ModelBox(Tailflukerudderend_r1, 0, 8, -0.5F, -1.0F, -0.9F, 1, 2, 1, -0.02F, false));

        this.Tailflukerudderfront_r1 = new AdvancedModelRenderer(this);
        this.Tailflukerudderfront_r1.setRotationPoint(0.0F, -0.0454F, 0.1456F);
        this.Tailfluke.addChild(Tailflukerudderfront_r1);
        this.setRotateAngle(Tailflukerudderfront_r1, 0.048F, 0.0F, 0.0F);
        this.Tailflukerudderfront_r1.cubeList.add(new ModelBox(Tailflukerudderfront_r1, 0, 32, -0.5F, -1.5F, -1.5F, 1, 3, 3, -0.01F, false));

        this.Tailflukeend_r1 = new AdvancedModelRenderer(this);
        this.Tailflukeend_r1.setRotationPoint(0.0F, -0.7664F, 1.0871F);
        this.Tailfluke.addChild(Tailflukeend_r1);
        this.setRotateAngle(Tailflukeend_r1, -0.0393F, 0.0F, 0.0F);
        this.Tailflukeend_r1.cubeList.add(new ModelBox(Tailflukeend_r1, 30, 32, -0.5F, 1.5F, -2.475F, 1, 1, 5, 0.0F, false));

        this.Tailflukemiddle_r1 = new AdvancedModelRenderer(this);
        this.Tailflukemiddle_r1.setRotationPoint(0.0F, -0.6593F, 0.0619F);
        this.Tailfluke.addChild(Tailflukemiddle_r1);
        this.setRotateAngle(Tailflukemiddle_r1, 0.3491F, 0.0F, 0.0F);
        this.Tailflukemiddle_r1.cubeList.add(new ModelBox(Tailflukemiddle_r1, 45, 0, -0.5F, -1.35F, -0.95F, 1, 1, 3, 0.0F, false));
        this.Tailflukemiddle_r1.cubeList.add(new ModelBox(Tailflukemiddle_r1, 37, 32, -0.5F, -1.35F, -3.95F, 1, 2, 3, 0.0F, false));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(4.5F, 4.0F, 1.5F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, 0.2182F);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 79, 6, -1.0F, -1.5F, -1.5F, 6, 3, 4, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(4.925F, 0.0F, -1.375F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1745F, 0.0F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 26, 69, 0.0543F, -1.0F, -0.0363F, 9, 2, 6, 0.0F, false));

        this.Lefthindflipper3 = new AdvancedModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(9.1043F, -0.5F, 0.4637F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.2182F, 0.0F);
        this.Lefthindflipper3.cubeList.add(new ModelBox(Lefthindflipper3, 76, 60, -1.0988F, 0.0F, 0.0044F, 7, 1, 4, 0.0F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-4.5F, 4.0F, 1.5F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0F, -0.2182F);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 79, 6, -5.0F, -1.5F, -1.5F, 6, 3, 4, 0.0F, true));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-4.925F, 0.0F, -1.375F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1745F, 0.0F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 26, 69, -9.0543F, -1.0F, -0.0363F, 9, 2, 6, 0.0F, true));

        this.Righthindflipper3 = new AdvancedModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-9.1043F, -0.5F, 0.4637F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.2182F, 0.0F);
        this.Righthindflipper3.cubeList.add(new ModelBox(Righthindflipper3, 76, 60, -5.9012F, 0.0F, 0.0044F, 7, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -1.2F;
        this.Hips.offsetX = -0.75F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(1);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 0.65F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, 0.14F, 0.0F);
        this.setRotateAngle(Neck4, 0.0F, 0.16F, 0.0F);
        this.setRotateAngle(Neck5, 0.0F, 0.18F, 0.0F);
        this.setRotateAngle(Neck6, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.22F, 0.0F);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.0F, 0.25F);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0F, -0.25F);
        this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.11F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.12F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, -0.25F);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0F, 0.25F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.2F, -0.2F);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, -0.2F, 0.2F);
        this.setRotateAngle(Neck1, 0.1F, -0.05F, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, -0.06F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, -0.07F, 0.0F);
        this.setRotateAngle(Neck4, -0.05F, 0.07F, 0.0F);
        this.setRotateAngle(Neck5, -0.10F, 0.06F, 0.0F);
        this.setRotateAngle(Neck6, -0.15F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.04F, 0.0F);
        this.Bodyfront.offsetY = -0.04F;
        this.Bodyfront.offsetX = 0.0F;
        this.Bodyfront.offsetZ = -0.13F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.08F, -0.1F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.1F, -0.15F, 0.0F);
        this.setRotateAngle(Neck1, 0.1F, -0.05F, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, -0.06F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, -0.07F, 0.0F);
        this.setRotateAngle(Neck4, -0.05F, 0.07F, 0.0F);
        this.setRotateAngle(Neck5, -0.10F, 0.06F, 0.0F);
        this.setRotateAngle(Neck6, -0.15F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Tail1, -0.2F, -0.1F, 0.0F);
        this.setRotateAngle(Tail2, -0.05F, -0.15F, 0.0F);
        this.setRotateAngle(Tail3, -0.08F, -0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0F, -0.2F);
        this.Hips.offsetY = -0.32F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, 0.14F, 0.0F);
        this.setRotateAngle(Neck4, 0.0F, 0.16F, 0.0F);
        this.setRotateAngle(Neck5, 0.0F, 0.18F, 0.0F);
        this.setRotateAngle(Neck6, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.22F, 0.0F);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.0F, 0.25F);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0F, -0.25F);
        this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.11F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.12F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, -0.25F);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0F, 0.25F);
        this.Hips.offsetY = 0.0F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
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
        EntityPrehistoricFloraOphthalmothule ee = (EntityPrehistoricFloraOphthalmothule) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOphthalmothule entity = (EntityPrehistoricFloraOphthalmothule) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5)-(2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)))-(0));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)) + (((tickAnim - 10) / 3) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5))));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)) + (((tickAnim - 13) / 7) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * (25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)-(25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(xx), Neck6.rotateAngleY + (float) Math.toRadians(yy), Neck6.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOphthalmothule entity = (EntityPrehistoricFloraOphthalmothule) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-2);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*-1-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*-1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*-1)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*1-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5) + (((tickAnim - 20) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*1)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5) + (((tickAnim - 60) / 40) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3))));
            zz = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5) + (((tickAnim - 100) / 60) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45)*-1), Neck1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45)*3), Neck1.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45)*-3));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-60)*1), Neck2.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45)*-5), Neck2.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-90)*-3));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90-120)*1), Neck3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*3), Neck3.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-180)*-3));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90+120)*1), Neck4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*-1)), Neck4.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-190)*-3));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*1), Neck5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*-1)), Neck5.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-190)*-3));


        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*1), Neck6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*90)*-2)), Neck6.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-190)*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*360)*1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-190)*5)), head.rotateAngleZ + (float) Math.toRadians(3+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-190)*-3));


        this.setRotateAngle(Lefteye, Lefteye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*180)*5), Lefteye.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*360)*5)), Lefteye.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*180)*5)));


        this.setRotateAngle(Righteye, Righteye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*180)*-5), Righteye.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*360)*-5)), Righteye.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*180)*-5)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*(((double)tickAnim/20D))*180)*-1), Lowerjaw.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-200)*1)), Lowerjaw.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*(((double)tickAnim/20D))*45-200)*3)));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)));
            zz = 2.5 + (((tickAnim - 0) / 60) * (2.5-(2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)));
            zz = 2.5 + (((tickAnim - 60) / 30) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5-(2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)));
            zz = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5 + (((tickAnim - 90) / 30) * (2.5-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*5)));
            zz = 2.5 + (((tickAnim - 120) / 40) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5)));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5)));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5)));
            zz = -7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5 + (((tickAnim - 90) / 30) * (-7.5-(-7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-2.5)));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5)));
            zz = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5)));
            zz = -2.5 + (((tickAnim - 120) / 20) * (5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5-(-2.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*5)));
            zz = 5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5 + (((tickAnim - 140) / 20) * (-2.5-(5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5)));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5)));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5-(7.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-2.5)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-2.5)));
            zz = 7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5 + (((tickAnim - 140) / 20) * (7.5-(7.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            yy = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            yy = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*5-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 60) / 70) * (-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            yy = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*5 + (((tickAnim - 60) / 70) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*5)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 130) / 30) * (-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-12.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            yy = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 130) / 30) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*5-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 60) / 70) * (-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*5 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*5)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-90)*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3 + (((tickAnim - 130) / 30) * (-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3-(-2.5+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45)*-3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-90)*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3-(15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3-(15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3 + (((tickAnim - 60) / 70) * (15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3-(15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*3 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-180)*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3 + (((tickAnim - 130) / 30) * (15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3-(15+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)));
            yy = -3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(-3+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(10)));
            yy = 0 + (((tickAnim - 0) / 30) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3) + (((tickAnim - 30) / 30) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3))));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 60) / 70) * (10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*3) + (((tickAnim - 60) / 70) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*3))));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*-3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*180-190)*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3 + (((tickAnim - 130) / 30) * (10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3-(10+Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*3)));
            yy = -(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3) + (((tickAnim - 130) / 30) * (-(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3)-(-(Math.sin((Math.PI/180)*((double)tickAnim/20)*90)*-3))));
            zz = 3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3-(3+Math.sin((Math.PI/180)*((double)tickAnim/20)*45-190)*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5)));
            zz = 5 + (((tickAnim - 0) / 20) * (-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5)));
            zz = -5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5 + (((tickAnim - 20) / 20) * (5-(-5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*5)));
            zz = 5 + (((tickAnim - 40) / 120) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5)));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5 + (((tickAnim - 20) / 20) * (-10-(-10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-270)*-2.5)));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5)));
            zz = -5 + (((tickAnim - 0) / 79) * (-5-(-5)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5)));
            zz = -5 + (((tickAnim - 79) / 21) * (5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5-(-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5)));
            zz = 5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5 + (((tickAnim - 100) / 20) * (-5-(5+Math.sin((Math.PI/180)*((double)tickAnim/20)*360)*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*5)));
            zz = -5 + (((tickAnim - 120) / 40) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5)));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5)));
            zz = 10 + (((tickAnim - 79) / 21) * (10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5)));
            zz = 10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5 + (((tickAnim - 100) / 20) * (10-(10+Math.sin((Math.PI/180)*((double)tickAnim/20)*360-60)*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1-(Math.sin((Math.PI/180)*((double)tickAnim/20)*180)*-1)));
            yy = Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5-(Math.sin((Math.PI/180)*((double)tickAnim/20)*45-180)*-2.5)));
            zz = 10 + (((tickAnim - 120) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOphthalmothule entity = (EntityPrehistoricFloraOphthalmothule) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-5)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3))));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3)));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1)), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1)), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*1)));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2)), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-3)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*3)));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*2)), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*2)));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2)), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2.5)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5)));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*40)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10)));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5)), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*5)), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-40)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10)));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5)), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5)), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10)));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-30)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-35)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-10)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-10)));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-5)), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-5)), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*-10)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*35)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10)));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-5)), Righthindflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5)), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3)));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOphthalmothule entity = (EntityPrehistoricFloraOphthalmothule) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3.5));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3)));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2)));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-1)), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3)));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1)), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*1)), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-180))*-1)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*3)));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5)), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*3)));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-220))*3)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-1)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*3)));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15)));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+320))*-5)), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*10)), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15)));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5)), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10)), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3)));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*20)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*-20)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-15)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*-15)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*-10)));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*5)), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+140))*-15)), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-110))*-10)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*20)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10)));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*5)), Righthindflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*15)), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*10)));

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
        this.faceTarget(f3, f4, 5, Neck5);
        this.faceTarget(f3, f4, 5, Neck6);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraOphthalmothule ee = (EntityPrehistoricFloraOphthalmothule) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

