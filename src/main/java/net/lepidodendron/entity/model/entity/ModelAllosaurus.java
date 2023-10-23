package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAllosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraAllosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAllosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neckbaseextra_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Masseterlower_r1;
    private final AdvancedModelRenderer Masseterupper_r1;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Rightcrestorbit_r1;
    private final AdvancedModelRenderer Rightcrestfrontextra_r1;
    private final AdvancedModelRenderer Rightcrestmiddleextra_r1;
    private final AdvancedModelRenderer Rightcrestbaseextra_r1;
    private final AdvancedModelRenderer Leftcrestorbit_r1;
    private final AdvancedModelRenderer Leftcrestfrontextra_r1;
    private final AdvancedModelRenderer Leftcrestmiddleextra_r1;
    private final AdvancedModelRenderer Leftcrestbaseextra_r1;
    private final AdvancedModelRenderer Upperfrontteeth_r1;
    private final AdvancedModelRenderer Upperbackteeth_r1;
    private final AdvancedModelRenderer Upperjawslopefront_r1;
    private final AdvancedModelRenderer Upperjawslopebase_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjawslopefront_r1;
    private final AdvancedModelRenderer Lowerjawslopebase_r1;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Masseter_r1;
    private final AdvancedModelRenderer Throatpouch1;
    private final AdvancedModelRenderer Throatpouch2;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftleg4;
    private final AdvancedModelRenderer Leftleg5;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightleg4;
    private final AdvancedModelRenderer Rightleg5;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer bb_main;

    private ModelAnimator animator;

    public ModelAllosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -5.0F, -1.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.8F, 1.0F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 0, -5.5F, -6.3916F, -3.0257F, 11, 17, 15, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -3.3916F, -3.0257F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1745F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 33, -6.5F, -3.0F, -12.0F, 13, 18, 13, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1309F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 53, 44, -5.5F, -3.0F, -11.0F, 11, 15, 11, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.3054F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 29, 94, -4.0F, -4.0F, -5.0F, 8, 11, 5, 0.0F, false));

        this.Neckbaseextra_r1 = new AdvancedModelRenderer(this);
        this.Neckbaseextra_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Neck1.addChild(Neckbaseextra_r1);
        this.setRotateAngle(Neckbaseextra_r1, 0.3054F, 0.0F, 0.0F);
        this.Neckbaseextra_r1.cubeList.add(new ModelBox(Neckbaseextra_r1, 105, 50, -4.0F, -6.0F, 0.0F, 8, 6, 3, -0.001F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 56, 95, -3.0F, -4.0F, -5.0F, 6, 11, 5, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 72, 27, -3.0F, 3.0F, 0.0F, 6, 4, 1, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1309F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 97, 76, -2.5F, -4.0F, -5.0F, 5, 10, 5, 0.001F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.3491F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 79, 100, -2.5F, -4.0F, -5.0F, 5, 9, 5, 0.0F, false));
        this.Neck4.cubeList.add(new ModelBox(Neck4, 0, 33, -2.5F, -4.0F, 0.0F, 5, 4, 1, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3F, -4.0F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 98, 0, -3.0F, -3.0F, -4.0F, 6, 5, 5, 0.0F, false));

        this.Masseterlower_r1 = new AdvancedModelRenderer(this);
        this.Masseterlower_r1.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Head.addChild(Masseterlower_r1);
        this.setRotateAngle(Masseterlower_r1, 0.6379F, 0.0F, 0.0F);
        this.Masseterlower_r1.cubeList.add(new ModelBox(Masseterlower_r1, 64, 112, -2.0F, -0.3F, 0.0F, 4, 3, 3, -0.002F, false));

        this.Masseterupper_r1 = new AdvancedModelRenderer(this);
        this.Masseterupper_r1.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Head.addChild(Masseterupper_r1);
        this.setRotateAngle(Masseterupper_r1, -0.6981F, 0.0F, 0.0F);
        this.Masseterupper_r1.cubeList.add(new ModelBox(Masseterupper_r1, 114, 31, -2.0F, -2.0F, -2.0F, 4, 2, 2, -0.001F, false));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.3927F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 0, 11, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.0436F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 107, 22, -2.0F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.Rightcrestorbit_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestorbit_r1.setRotationPoint(-3.1117F, -0.3262F, 0.1559F);
        this.Upperjaw.addChild(Rightcrestorbit_r1);
        this.setRotateAngle(Rightcrestorbit_r1, 0.2523F, -0.4782F, -0.3646F);
        this.Rightcrestorbit_r1.cubeList.add(new ModelBox(Rightcrestorbit_r1, 38, 0, 0.0F, 0.0F, -2.15F, 1, 3, 2, -0.001F, false));

        this.Rightcrestfrontextra_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestfrontextra_r1.setRotationPoint(-1.5F, -0.7312F, -6.6181F);
        this.Upperjaw.addChild(Rightcrestfrontextra_r1);
        this.setRotateAngle(Rightcrestfrontextra_r1, 0.2037F, -0.244F, -0.0957F);
        this.Rightcrestfrontextra_r1.cubeList.add(new ModelBox(Rightcrestfrontextra_r1, 33, 65, 0.5F, 0.0F, 0.0F, 1, 2, 2, -0.001F, false));
        this.Rightcrestfrontextra_r1.cubeList.add(new ModelBox(Rightcrestfrontextra_r1, 51, 94, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Rightcrestmiddleextra_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestmiddleextra_r1.setRotationPoint(-2.0098F, -1.0888F, -4.7175F);
        this.Upperjaw.addChild(Rightcrestmiddleextra_r1);
        this.setRotateAngle(Rightcrestmiddleextra_r1, -0.0036F, 0.0197F, -0.1243F);
        this.Rightcrestmiddleextra_r1.cubeList.add(new ModelBox(Rightcrestmiddleextra_r1, 0, 65, 0.5F, 0.0F, 0.0F, 1, 2, 3, -0.001F, false));
        this.Rightcrestmiddleextra_r1.cubeList.add(new ModelBox(Rightcrestmiddleextra_r1, 0, 97, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Rightcrestbaseextra_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestbaseextra_r1.setRotationPoint(-0.4616F, -1.2715F, -1.7477F);
        this.Upperjaw.addChild(Rightcrestbaseextra_r1);
        this.setRotateAngle(Rightcrestbaseextra_r1, 0.5337F, -0.5029F, -0.1452F);
        this.Rightcrestbaseextra_r1.cubeList.add(new ModelBox(Rightcrestbaseextra_r1, 0, 71, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.001F, false));
        this.Rightcrestbaseextra_r1.cubeList.add(new ModelBox(Rightcrestbaseextra_r1, 0, 91, -1.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Leftcrestorbit_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestorbit_r1.setRotationPoint(3.1117F, -0.3262F, 0.1559F);
        this.Upperjaw.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, 0.2523F, 0.4782F, 0.3646F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 38, 0, -1.0F, 0.0F, -2.15F, 1, 3, 2, -0.001F, true));

        this.Leftcrestfrontextra_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestfrontextra_r1.setRotationPoint(1.5F, -0.7312F, -6.6181F);
        this.Upperjaw.addChild(Leftcrestfrontextra_r1);
        this.setRotateAngle(Leftcrestfrontextra_r1, 0.2037F, 0.244F, 0.0957F);
        this.Leftcrestfrontextra_r1.cubeList.add(new ModelBox(Leftcrestfrontextra_r1, 33, 65, -1.5F, 0.0F, 0.0F, 1, 2, 2, -0.001F, true));
        this.Leftcrestfrontextra_r1.cubeList.add(new ModelBox(Leftcrestfrontextra_r1, 51, 94, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.Leftcrestmiddleextra_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestmiddleextra_r1.setRotationPoint(2.0098F, -1.0888F, -4.7175F);
        this.Upperjaw.addChild(Leftcrestmiddleextra_r1);
        this.setRotateAngle(Leftcrestmiddleextra_r1, -0.0036F, -0.0197F, 0.1243F);
        this.Leftcrestmiddleextra_r1.cubeList.add(new ModelBox(Leftcrestmiddleextra_r1, 0, 65, -1.5F, 0.0F, 0.0F, 1, 2, 3, -0.001F, true));
        this.Leftcrestmiddleextra_r1.cubeList.add(new ModelBox(Leftcrestmiddleextra_r1, 0, 97, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.Leftcrestbaseextra_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestbaseextra_r1.setRotationPoint(0.4616F, -1.2715F, -1.7477F);
        this.Upperjaw.addChild(Leftcrestbaseextra_r1);
        this.setRotateAngle(Leftcrestbaseextra_r1, 0.5337F, 0.5029F, 0.1452F);
        this.Leftcrestbaseextra_r1.cubeList.add(new ModelBox(Leftcrestbaseextra_r1, 0, 71, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.001F, true));
        this.Leftcrestbaseextra_r1.cubeList.add(new ModelBox(Leftcrestbaseextra_r1, 0, 91, 0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.Upperfrontteeth_r1 = new AdvancedModelRenderer(this);
        this.Upperfrontteeth_r1.setRotationPoint(0.0F, 2.5432F, -8.4701F);
        this.Upperjaw.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1745F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 0, 39, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.001F, false));

        this.Upperbackteeth_r1 = new AdvancedModelRenderer(this);
        this.Upperbackteeth_r1.setRotationPoint(0.0F, 3.0031F, -4.5656F);
        this.Upperjaw.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, 0.1309F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 46, 11, -1.5F, -0.2629F, 0.0039F, 3, 1, 3, 0.001F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, 0.495F, -8.7047F);
        this.Upperjaw.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.6545F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 53, 49, -1.5F, 0.0F, 0.0F, 3, 2, 2, -0.001F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -0.7225F, -7.118F);
        this.Upperjaw.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.0175F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 33, 65, -1.5F, 0.0F, 0.0F, 3, 3, 8, -0.002F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.1309F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 111, 92, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.1641F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 107, -3.0F, 0.0F, -5.0F, 6, 2, 5, -0.001F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 87, 50, -1.5F, -0.4239F, -8.9679F, 3, 1, 3, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 53, 44, -1.0F, -0.4239F, -12.9679F, 2, 1, 3, 0.0F, false));

        this.Lowerjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslopefront_r1.setRotationPoint(0.0F, 2.9848F, -4.8264F);
        this.Lowerjaw.addChild(Lowerjawslopefront_r1);
        this.setRotateAngle(Lowerjawslopefront_r1, -0.1553F, 0.0F, 0.0F);
        this.Lowerjawslopefront_r1.cubeList.add(new ModelBox(Lowerjawslopefront_r1, 53, 11, -2.0F, -1.0F, -5.0F, 4, 1, 5, -0.003F, false));

        this.Lowerjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslopebase_r1.setRotationPoint(0.0F, 1.3054F, -1.0608F);
        this.Lowerjaw.addChild(Lowerjawslopebase_r1);
        this.setRotateAngle(Lowerjawslopebase_r1, 0.1745F, 0.0F, 0.0F);
        this.Lowerjawslopebase_r1.cubeList.add(new ModelBox(Lowerjawslopebase_r1, 60, 0, -3.0F, 0.0F, -4.0F, 6, 1, 5, -0.002F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 2.2151F, -9.633F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 34, 111, -1.5F, -2.0F, -4.0F, 3, 2, 4, -0.001F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 109, 11, -2.0F, 0.0F, -5.0F, 4, 2, 5, -0.002F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 2.6427F, -6.9175F);
        this.Lowerjaw.addChild(Throat);
        this.setRotateAngle(Throat, -0.288F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 17, 91, -1.5F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjaw.addChild(Masseter);


        this.Masseter_r1 = new AdvancedModelRenderer(this);
        this.Masseter_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Masseter.addChild(Masseter_r1);
        this.setRotateAngle(Masseter_r1, -0.6379F, 0.0F, 0.0F);
        this.Masseter_r1.cubeList.add(new ModelBox(Masseter_r1, 45, 77, -2.0F, -4.0F, 0.0F, 4, 4, 3, 0.0F, false));

        this.Throatpouch1 = new AdvancedModelRenderer(this);
        this.Throatpouch1.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.Neck4.addChild(Throatpouch1);
        this.setRotateAngle(Throatpouch1, 0.3927F, 0.0F, 0.0F);
        this.Throatpouch1.cubeList.add(new ModelBox(Throatpouch1, 113, 76, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.Throatpouch2 = new AdvancedModelRenderer(this);
        this.Throatpouch2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Throatpouch1.addChild(Throatpouch2);
        this.setRotateAngle(Throatpouch2, -0.4363F, 0.0F, 0.0F);
        this.Throatpouch2.cubeList.add(new ModelBox(Throatpouch2, 49, 112, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.001F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(5.5F, 9.5F, -9.0F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 1.0472F, 0.0436F, 0.0785F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 19, 111, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(-0.25F, 4.0F, 1.0F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.0472F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 73, 72, -1.5F, 0.0F, -3.0F, 3, 6, 4, 0.0F, true));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.5F, 5.5F, -0.5F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, 0.0F, 0.2182F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 0, 0, -2.0F, 0.0F, -3.0F, 2, 5, 5, 0.0F, true));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-5.5F, 9.5F, -9.0F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 1.0472F, -0.0436F, -0.0785F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 19, 111, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(0.25F, 4.0F, 1.0F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.0472F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 73, 72, -1.5F, 0.0F, -3.0F, 3, 6, 4, 0.0F, false));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.5F, 5.5F, -0.5F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.0F, -0.2182F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 0, 0, 0.0F, 0.0F, -3.0F, 2, 5, 5, 0.0F, false));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(6.0F, -1.3916F, 2.9743F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.1745F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 72, 0, -4.0F, -1.0F, -4.0F, 7, 15, 11, 0.0F, true));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.0F, 12.0F, -2.0F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.6545F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 87, 27, -3.5F, 0.0F, -2.0F, 6, 15, 7, 0.0F, true));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.5672F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 100, 100, -3.0F, 0.0F, -4.0F, 5, 8, 5, 0.0F, true));

        this.Leftleg4 = new AdvancedModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.0F, 7.75F, -1.0F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.2182F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 38, 0, -4.0F, -1.5F, -6.0F, 7, 3, 7, 0.0F, true));

        this.Leftleg5 = new AdvancedModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Leftleg4.addChild(Leftleg5);
        this.Leftleg5.cubeList.add(new ModelBox(Leftleg5, 105, 60, -4.0F, -1.5F, -4.0F, 7, 3, 4, -0.01F, true));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-6.0F, -1.3916F, 2.9743F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.1745F, 0.0F, 0.0F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 72, 0, -3.0F, -1.0F, -4.0F, 7, 15, 11, 0.0F, false));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(0.0F, 12.0F, -2.0F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.6545F, 0.0F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 87, 27, -2.5F, 0.0F, -2.0F, 6, 15, 7, 0.001F, false));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.5672F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 100, 100, -2.0F, 0.0F, -4.0F, 5, 8, 5, 0.0F, false));

        this.Rightleg4 = new AdvancedModelRenderer(this);
        this.Rightleg4.setRotationPoint(0.0F, 7.75F, -1.0F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.2182F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 38, 0, -3.0F, -1.5F, -6.0F, 7, 3, 7, 0.0F, false));

        this.Rightleg5 = new AdvancedModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Rightleg4.addChild(Rightleg5);
        this.Rightleg5.cubeList.add(new ModelBox(Rightleg5, 105, 60, -3.0F, -1.5F, -4.0F, 7, 3, 4, -0.01F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -2.3916F, 9.9743F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0436F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 65, -5.0F, -4.0F, 0.0F, 10, 13, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 40, 18, -4.0F, -4.0F, 0.0F, 8, 10, 15, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -1.0F, 13.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 45, 71, -3.0F, -3.0F, 0.0F, 6, 7, 15, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -1.0F, 14.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 74, 80, -2.0F, -2.0F, 0.0F, 4, 5, 14, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1309F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 85, 58, -1.5F, -2.0F, 0.0F, 3, 4, 13, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, -0.5F, 12.0F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.2182F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 0, 91, -1.0F, -1.5F, 0.0F, 2, 3, 12, 0.0F, false));

        this.bb_main = new AdvancedModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, -133, -133, 18.0F, -1.0F, -50.0F, 1, 1, 134, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

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


        EntityPrehistoricFloraAllosaurus EntityAllosaurus = (EntityPrehistoricFloraAllosaurus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Neck4);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Head};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        EntityAllosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAllosaurus.getAnimation() == EntityAllosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAllosaurus.isReallyInWater()) {
                this.Root.offsetY = -10F;

                if (f3 == 0.0F || !EntityAllosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.2F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.13F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Leftarm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.Leftarm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityAllosaurus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 10) * (-18.8408-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 10) * (2.64451-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10) + (((tickAnim - 15) / 10) * (0.43509-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -18.8408 + (((tickAnim - 25) / 5) * (0-(-18.8408)));
            yy = 2.64451 + (((tickAnim - 25) / 5) * (0-(2.64451)));
            zz = 0.43509 + (((tickAnim - 25) / 5) * (0-(0.43509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 10) * (-9.12983-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 10) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 10) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -9.12983 + (((tickAnim - 25) / 5) * (0-(-9.12983)));
            yy = 0.8262 + (((tickAnim - 25) / 5) * (0-(0.8262)));
            zz = 0.8262 + (((tickAnim - 25) / 5) * (0-(0.8262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15 + (((tickAnim - 15) / 10) * (18.96677-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 10) * (-0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5) + (((tickAnim - 15) / 10) * (0.10877-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5))));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.96677 + (((tickAnim - 25) / 5) * (0-(18.96677)));
            yy = -0.8262 + (((tickAnim - 25) / 5) * (0-(-0.8262)));
            zz = 0.10877 + (((tickAnim - 25) / 5) * (0-(0.10877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-29.83-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -29.83 + (((tickAnim - 10) / 10) * (15.33-(-29.83)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15.33 + (((tickAnim - 20) / 5) * (20.17-(15.33)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.17 + (((tickAnim - 25) / 5) * (0-(20.17)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (94.53-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 94.53 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(94.53)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 20) / 10) * (0-(12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*-10 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*1) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*1)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-1) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-30))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 20) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-1) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-1)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*1) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*1))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10 + (((tickAnim - 20) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-1))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-0.5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+150))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-0.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3))*5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-1) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+150))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+150))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*-10) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4+150))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-60))*-0.5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-60))*-0.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*-2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-60))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*-5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-60))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-120))*0.5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/3-120))*0.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*-2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3-120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-2.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-10 + (((tickAnim - 20) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5+90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5+90))*0.5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5+90))*0.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/3+90))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/4-90))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20 + (((tickAnim - 20) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5 + (((tickAnim - 30) / 40) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*-0.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5 + (((tickAnim - 70) / 10) * (0-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5 + (((tickAnim - 30) / 40) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5 + (((tickAnim - 70) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }






        if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20 + (((tickAnim - 20) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5) + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5) + (((tickAnim - 20) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*2.5))));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*2.5));
            zz = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5 + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-2.5));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4+30))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.1 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.4 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*0.4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.4)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*0.4 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*0.4)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.rotationPointX = this.Leftleg1.rotationPointX + (float)(xx);
        this.Leftleg1.rotationPointY = this.Leftleg1.rotationPointY - (float)(yy);
        this.Leftleg1.rotationPointZ = this.Leftleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5) + (((tickAnim - 0) / 20) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5) + (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5)+ (((tickAnim - 20) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5) + (((tickAnim - 30) / 40) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5) + (((tickAnim - 70) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.1)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.1 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.4 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-0.4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.4)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-0.4 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4))*-0.4)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 16) / 5) * (15-(10)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 15 + (((tickAnim - 21) / 15) * (10-(15)));
            yy = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 15) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 10 + (((tickAnim - 36) / 6) * (15-(10)));
            yy = 0 + (((tickAnim - 36) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 6) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 15 + (((tickAnim - 42) / 11) * (12.5-(15)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 53) / 7) * (15-(12.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 15 + (((tickAnim - 60) / 8) * (22.5-(15)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 22.5 + (((tickAnim - 68) / 5) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 17.5 + (((tickAnim - 73) / 4) * (5-(17.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 77) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch1, Throatpouch1.rotateAngleX + (float) Math.toRadians(xx), Throatpouch1.rotateAngleY + (float) Math.toRadians(yy), Throatpouch1.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30 + (((tickAnim - 15) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15 + (((tickAnim - 25) / 15) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10 + (((tickAnim - 15) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5 + (((tickAnim - 25) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2 + (((tickAnim - 20) / 30) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25 + (((tickAnim - 10) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25 + (((tickAnim - 10) / 10) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5 + (((tickAnim - 20) / 30) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1 + (((tickAnim - 20) / 30) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.rotationPointX = this.Leftleg1.rotationPointX + (float)(xx);
        this.Leftleg1.rotationPointY = this.Leftleg1.rotationPointY - (float)(yy);
        this.Leftleg1.rotationPointZ = this.Leftleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10 + (((tickAnim - 20) / 30) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30 + (((tickAnim - 20) / 30) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2 + (((tickAnim - 20) / 30) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (13-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            zz = 13 + (((tickAnim - 25) / 25) * (0-(13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 25) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 25) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 25) / 25) * (0-(-50)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 25) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 25) / 25) * (0-(25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 25) / 25) * (0-(-50)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 25) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 25) / 25) * (0-(25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 25) / 25) * (0-(7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.89092-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.03989-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.0312-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -4.89092 + (((tickAnim - 25) / 25) * (0-(-4.89092)));
            yy = 1.03989 + (((tickAnim - 25) / 25) * (0-(1.03989)));
            zz = -0.0312 + (((tickAnim - 25) / 25) * (0-(-0.0312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5) + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5 + (((tickAnim - 20) / 20) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 0) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 10) / 30) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch1, Throatpouch1.rotateAngleX + (float) Math.toRadians(xx), Throatpouch1.rotateAngleY + (float) Math.toRadians(yy), Throatpouch1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 0) / 8) * (-7-(-10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7 + (((tickAnim - 8) / 1) * (-5.5-(-7)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -5.5 + (((tickAnim - 9) / 2) * (-12-(-5.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12 + (((tickAnim - 11) / 2) * (-4-(-12)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -4 + (((tickAnim - 13) / 0) * (-5-(-4)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -5 + (((tickAnim - 13) / 1) * (-8-(-5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -8 + (((tickAnim - 14) / 1) * (-13-(-8)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -13 + (((tickAnim - 15) / 1) * (-15-(-13)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -15 + (((tickAnim - 16) / 1) * (-10.875-(-15)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -10.875 + (((tickAnim - 17) / 1) * (-6.5-(-10.875)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -6.5 + (((tickAnim - 18) / 1) * (-7.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 19) / 1) * (-12-(-7.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -12 + (((tickAnim - 20) / 1) * (-8-(-12)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 21) / 1) * (-7-(-8)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -7 + (((tickAnim - 22) / 1) * (-7-(-7)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -7 + (((tickAnim - 23) / 0) * (-11-(-7)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -11 + (((tickAnim - 23) / 1) * (-8-(-11)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 24) / 1) * (-10-(-8)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 25) / 2) * (-7-(-10)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 27) / 1) * (-11-(-7)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -11 + (((tickAnim - 28) / 3) * (-7-(-11)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 31) / 9) * (-10-(-7)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throatpouch2, Throatpouch2.rotateAngleX + (float) Math.toRadians(xx), Throatpouch2.rotateAngleY + (float) Math.toRadians(yy), Throatpouch2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animLookLeft(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;


    }

    public void animLookRight(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;


    }

    public void animLookDownLeft(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))-(0));
        }
        else if (tickAnim >= 15 && tickAnim < 102) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 87) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = -10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 15) / 87) * (-7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(-10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1) + (((tickAnim - 15) / 87) * (0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))-(0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1)));
        }
        else if (tickAnim >= 102 && tickAnim < 119) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 102) / 17) * (0-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = -7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 102) / 17) * (0-(-7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1) + (((tickAnim - 102) / 17) * (0-(0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.46971-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 113) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 98) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = -22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 98) * (-22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(-22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            zz = 0.46971 + (((tickAnim - 15) / 98) * (0.46971-(0.46971)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 113) / 7) * (0-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = -22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 113) / 7) * (0-(-22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            zz = 0.46971 + (((tickAnim - 113) / 7) * (0-(0.46971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 15) / 101) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            yy = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 15) / 101) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            zz = 0 + (((tickAnim - 15) / 101) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 116) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            yy = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 116) / 4) * (0-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 15) / 101) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            yy = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 15) / 101) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            zz = 0 + (((tickAnim - 15) / 101) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 116) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            yy = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 116) / 4) * (0-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-7-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 12) / 11) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(5)));
            yy = -7 + (((tickAnim - 12) / 11) * (-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(-7)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 116) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 23) / 93) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            yy = -12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 23) / 93) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            zz = 0 + (((tickAnim - 23) / 93) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 116) / 4) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            yy = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 116) / 4) * (0-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-4), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animLookDownRight(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))-(0));
        }
        else if (tickAnim >= 15 && tickAnim < 102) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 87) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = 10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 15) / 87) * (7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(10.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1) + (((tickAnim - 15) / 87) * (0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))-(0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1)));
        }
        else if (tickAnim >= 102 && tickAnim < 119) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 102) / 17) * (0-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = 7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 102) / 17) * (0-(7.0715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = 0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1) + (((tickAnim - 102) / 17) * (0-(0.4697-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+30))*-1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.46971-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 113) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 98) * (12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = 22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 15) / 98) * (22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3-(22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            zz = 0.46971 + (((tickAnim - 15) / 98) * (0.46971-(0.46971)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 113) / 7) * (0-(12.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            yy = 22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3 + (((tickAnim - 113) / 7) * (0-(22.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*-3)));
            zz = 0.46971 + (((tickAnim - 113) / 7) * (0-(0.46971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 15) / 101) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            yy = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 15) / 101) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            zz = 0 + (((tickAnim - 15) / 101) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 116) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            yy = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3 + (((tickAnim - 116) / 4) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*-3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 116) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 15) / 101) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            yy = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 15) / 101) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            zz = 0 + (((tickAnim - 15) / 101) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 116) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            yy = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3 + (((tickAnim - 116) / 4) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+90))*3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 12) / 11) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(5)));
            yy = 7 + (((tickAnim - 12) / 11) * (12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(7)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 116) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 23) / 93) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            yy = 12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 23) / 93) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3-(12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            zz = 0 + (((tickAnim - 23) / 93) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 116) / 4) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            yy = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3 + (((tickAnim - 116) / 4) * (0-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45+60))*3)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-4), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animSniff(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = -10 + (((tickAnim - 15) / 19) * (-8.21-(-10)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 58) {
            xx = -8.21 + (((tickAnim - 34) / 24) * (-8.21-(-8.21)));
            yy = 0 + (((tickAnim - 34) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 24) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = -8.21 + (((tickAnim - 58) / 15) * (-2.39-(-8.21)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = -2.39 + (((tickAnim - 73) / 47) * (0-(-2.39)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 18) / 11) * (-6.65578-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 11) * (-1.02359-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (-2.28097-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -6.65578 + (((tickAnim - 29) / 5) * (-6.31-(-6.65578)));
            yy = -1.02359 + (((tickAnim - 29) / 5) * (0-(-1.02359)));
            zz = -2.28097 + (((tickAnim - 29) / 5) * (0-(-2.28097)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -6.31 + (((tickAnim - 34) / 4) * (-4.03-(-6.31)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -4.03 + (((tickAnim - 38) / 7) * (-1.31-(-4.03)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = -1.31 + (((tickAnim - 45) / 7) * (1.19-(-1.31)));
            yy = 0 + (((tickAnim - 45) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 7) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 63) {
            xx = 1.19 + (((tickAnim - 52) / 11) * (-2.31-(1.19)));
            yy = 0 + (((tickAnim - 52) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 11) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 89) {
            xx = -2.31 + (((tickAnim - 63) / 26) * (-2.87442-(-2.31)));
            yy = 0 + (((tickAnim - 63) / 26) * (7.73316-(0)));
            zz = 0 + (((tickAnim - 63) / 26) * (2.49674-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 94) {
            xx = -2.87442 + (((tickAnim - 89) / 5) * (-2.97718-(-2.87442)));
            yy = 7.73316 + (((tickAnim - 89) / 5) * (6.92335-(7.73316)));
            zz = 2.49674 + (((tickAnim - 89) / 5) * (-2.56978-(2.49674)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -2.97718 + (((tickAnim - 94) / 9) * (-2.97718-(-2.97718)));
            yy = 6.92335 + (((tickAnim - 94) / 9) * (6.92335-(6.92335)));
            zz = -2.56978 + (((tickAnim - 94) / 9) * (-2.56978-(-2.56978)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = -2.97718 + (((tickAnim - 103) / 6) * (-2.29145-(-2.97718)));
            yy = 6.92335 + (((tickAnim - 103) / 6) * (2.72115-(6.92335)));
            zz = -2.56978 + (((tickAnim - 103) / 6) * (-6.35922-(-2.56978)));
        }
        else if (tickAnim >= 109 && tickAnim < 115) {
            xx = -2.29145 + (((tickAnim - 109) / 6) * (-0.62147-(-2.29145)));
            yy = 2.72115 + (((tickAnim - 109) / 6) * (3.54366-(2.72115)));
            zz = -6.35922 + (((tickAnim - 109) / 6) * (4.02003-(-6.35922)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -0.62147 + (((tickAnim - 115) / 5) * (0-(-0.62147)));
            yy = 3.54366 + (((tickAnim - 115) / 5) * (0-(3.54366)));
            zz = 4.02003 + (((tickAnim - 115) / 5) * (0-(4.02003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.57-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 3.57 + (((tickAnim - 12) / 6) * (7.58357-(3.57)));
            yy = 0 + (((tickAnim - 12) / 6) * (2.11089-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (4.53359-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 7.58357 + (((tickAnim - 18) / 9) * (8.39472-(7.58357)));
            yy = 2.11089 + (((tickAnim - 18) / 9) * (0.97426-(2.11089)));
            zz = 4.53359 + (((tickAnim - 18) / 9) * (2.09243-(4.53359)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 8.39472 + (((tickAnim - 27) / 7) * (14.09-(8.39472)));
            yy = 0.97426 + (((tickAnim - 27) / 7) * (0-(0.97426)));
            zz = 2.09243 + (((tickAnim - 27) / 7) * (0-(2.09243)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 14.09 + (((tickAnim - 34) / 11) * (11.59-(14.09)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 11.59 + (((tickAnim - 45) / 13) * (4.09-(11.59)));
            yy = 0 + (((tickAnim - 45) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 13) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 4.09 + (((tickAnim - 58) / 7) * (7.6-(4.09)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 7.6 + (((tickAnim - 65) / 8) * (6.73-(7.6)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = 6.73 + (((tickAnim - 73) / 9) * (3.97307-(6.73)));
            yy = 0 + (((tickAnim - 73) / 9) * (17.19612-(0)));
            zz = 0 + (((tickAnim - 73) / 9) * (-3.29725-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 94) {
            xx = 3.97307 + (((tickAnim - 82) / 12) * (2.7094-(3.97307)));
            yy = 17.19612 + (((tickAnim - 82) / 12) * (18.57204-(17.19612)));
            zz = -3.29725 + (((tickAnim - 82) / 12) * (-3.77204-(-3.29725)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 2.7094 + (((tickAnim - 94) / 9) * (3.35489-(2.7094)));
            yy = 18.57204 + (((tickAnim - 94) / 9) * (1.44645-(18.57204)));
            zz = -3.77204 + (((tickAnim - 94) / 9) * (-0.10078-(-3.77204)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = 3.35489 + (((tickAnim - 103) / 7) * (1.77759-(3.35489)));
            yy = 1.44645 + (((tickAnim - 103) / 7) * (-1.55286-(1.44645)));
            zz = -0.10078 + (((tickAnim - 103) / 7) * (0.73165-(-0.10078)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 1.77759 + (((tickAnim - 110) / 5) * (1.22587-(1.77759)));
            yy = -1.55286 + (((tickAnim - 110) / 5) * (-3.19173-(-1.55286)));
            zz = 0.73165 + (((tickAnim - 110) / 5) * (-9.34467-(0.73165)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 1.22587 + (((tickAnim - 115) / 5) * (0-(1.22587)));
            yy = -3.19173 + (((tickAnim - 115) / 5) * (0-(-3.19173)));
            zz = -9.34467 + (((tickAnim - 115) / 5) * (0-(-9.34467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (7.5-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 23) / 4) * (7.88-(7.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 7.88 + (((tickAnim - 27) / 7) * (0.35-(7.88)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0.35 + (((tickAnim - 34) / 11) * (2.84795-(0.35)));
            yy = 0 + (((tickAnim - 34) / 11) * (-2.49824-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0.09385-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 59) {
            xx = 2.84795 + (((tickAnim - 45) / 14) * (9.35-(2.84795)));
            yy = -2.49824 + (((tickAnim - 45) / 14) * (0-(-2.49824)));
            zz = 0.09385 + (((tickAnim - 45) / 14) * (0-(0.09385)));
        }
        else if (tickAnim >= 59 && tickAnim < 75) {
            xx = 9.35 + (((tickAnim - 59) / 16) * (9.02196-(9.35)));
            yy = 0 + (((tickAnim - 59) / 16) * (9.85974-(0)));
            zz = 0 + (((tickAnim - 59) / 16) * (2.06991-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 94) {
            xx = 9.02196 + (((tickAnim - 75) / 19) * (10.18775-(9.02196)));
            yy = 9.85974 + (((tickAnim - 75) / 19) * (9.70134-(9.85974)));
            zz = 2.06991 + (((tickAnim - 75) / 19) * (1.07885-(2.06991)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 10.18775 + (((tickAnim - 94) / 9) * (9.94016-(10.18775)));
            yy = 9.70134 + (((tickAnim - 94) / 9) * (-2.22025-(9.70134)));
            zz = 1.07885 + (((tickAnim - 94) / 9) * (-2.69452-(1.07885)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = 9.94016 + (((tickAnim - 103) / 7) * (5.77805-(9.94016)));
            yy = -2.22025 + (((tickAnim - 103) / 7) * (3.11065-(-2.22025)));
            zz = -2.69452 + (((tickAnim - 103) / 7) * (0.03977-(-2.69452)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 5.77805 + (((tickAnim - 110) / 10) * (0-(5.77805)));
            yy = 3.11065 + (((tickAnim - 110) / 10) * (0-(3.11065)));
            zz = 0.03977 + (((tickAnim - 110) / 10) * (0-(0.03977)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -15 + (((tickAnim - 30) / 4) * (-14.37-(-15)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -14.37 + (((tickAnim - 34) / 11) * (-24.72-(-14.37)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -24.72 + (((tickAnim - 45) / 9) * (-15-(-24.72)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -15 + (((tickAnim - 54) / 4) * (-14.37-(-15)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 94) {
            xx = -14.37 + (((tickAnim - 58) / 36) * (-6.97976-(-14.37)));
            yy = 0 + (((tickAnim - 58) / 36) * (-2.20518-(0)));
            zz = 0 + (((tickAnim - 58) / 36) * (9.04491-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -6.97976 + (((tickAnim - 94) / 9) * (-6.97976-(-6.97976)));
            yy = -2.20518 + (((tickAnim - 94) / 9) * (-2.20518-(-2.20518)));
            zz = 9.04491 + (((tickAnim - 94) / 9) * (9.04491-(9.04491)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = -6.97976 + (((tickAnim - 103) / 7) * (-4.16989-(-6.97976)));
            yy = -2.20518 + (((tickAnim - 103) / 7) * (-6.75303-(-2.20518)));
            zz = 9.04491 + (((tickAnim - 103) / 7) * (6.2019-(9.04491)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -4.16989 + (((tickAnim - 110) / 10) * (0-(-4.16989)));
            yy = -6.75303 + (((tickAnim - 110) / 10) * (0-(-6.75303)));
            zz = 6.2019 + (((tickAnim - 110) / 10) * (0-(6.2019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.92486-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.09656-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.73465-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 34) {
            xx = -15.92486 + (((tickAnim - 10) / 24) * (-19.99641-(-15.92486)));
            yy = -0.09656 + (((tickAnim - 10) / 24) * (-0.32588-(-0.09656)));
            zz = -0.73465 + (((tickAnim - 10) / 24) * (-2.47944-(-0.73465)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -19.99641 + (((tickAnim - 34) / 9) * (-19.55547-(-19.99641)));
            yy = -0.32588 + (((tickAnim - 34) / 9) * (2.56031-(-0.32588)));
            zz = -2.47944 + (((tickAnim - 34) / 9) * (7.84135-(-2.47944)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = -19.55547 + (((tickAnim - 43) / 6) * (-14.75898-(-19.55547)));
            yy = 2.56031 + (((tickAnim - 43) / 6) * (1.22822-(2.56031)));
            zz = 7.84135 + (((tickAnim - 43) / 6) * (9.53945-(7.84135)));
        }
        else if (tickAnim >= 49 && tickAnim < 58) {
            xx = -14.75898 + (((tickAnim - 49) / 9) * (-19.99641-(-14.75898)));
            yy = 1.22822 + (((tickAnim - 49) / 9) * (-0.32588-(1.22822)));
            zz = 9.53945 + (((tickAnim - 49) / 9) * (-2.47944-(9.53945)));
        }
        else if (tickAnim >= 58 && tickAnim < 69) {
            xx = -19.99641 + (((tickAnim - 58) / 11) * (-4.99641-(-19.99641)));
            yy = -0.32588 + (((tickAnim - 58) / 11) * (-0.32588-(-0.32588)));
            zz = -2.47944 + (((tickAnim - 58) / 11) * (-2.47944-(-2.47944)));
        }
        else if (tickAnim >= 69 && tickAnim < 77) {
            xx = -4.99641 + (((tickAnim - 69) / 8) * (-14.99641-(-4.99641)));
            yy = -0.32588 + (((tickAnim - 69) / 8) * (-0.32588-(-0.32588)));
            zz = -2.47944 + (((tickAnim - 69) / 8) * (-2.47944-(-2.47944)));
        }
        else if (tickAnim >= 77 && tickAnim < 84) {
            xx = -14.99641 + (((tickAnim - 77) / 7) * (-11.6602-(-14.99641)));
            yy = -0.32588 + (((tickAnim - 77) / 7) * (-0.37977-(-0.32588)));
            zz = -2.47944 + (((tickAnim - 77) / 7) * (11.06063-(-2.47944)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = -11.6602 + (((tickAnim - 84) / 10) * (-2.78558-(-11.6602)));
            yy = -0.37977 + (((tickAnim - 84) / 10) * (19.44402-(-0.37977)));
            zz = 11.06063 + (((tickAnim - 84) / 10) * (13.0291-(11.06063)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -2.78558 + (((tickAnim - 94) / 9) * (-2.78558-(-2.78558)));
            yy = 19.44402 + (((tickAnim - 94) / 9) * (19.44402-(19.44402)));
            zz = 13.0291 + (((tickAnim - 94) / 9) * (13.0291-(13.0291)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = -2.78558 + (((tickAnim - 103) / 7) * (-1.79592-(-2.78558)));
            yy = 19.44402 + (((tickAnim - 103) / 7) * (1.2873-(19.44402)));
            zz = 13.0291 + (((tickAnim - 103) / 7) * (5.56161-(13.0291)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -1.79592 + (((tickAnim - 110) / 10) * (0-(-1.79592)));
            yy = 1.2873 + (((tickAnim - 110) / 10) * (0-(1.2873)));
            zz = 5.56161 + (((tickAnim - 110) / 10) * (0-(5.56161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 120) {
            xx = 25 + (((tickAnim - 70) / 50) * (0-(25)));
            yy = 0 + (((tickAnim - 70) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 120) {
            xx = -30 + (((tickAnim - 70) / 50) * (0-(-30)));
            yy = 0 + (((tickAnim - 70) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 120) {
            xx = 25 + (((tickAnim - 70) / 50) * (0-(25)));
            yy = 0 + (((tickAnim - 70) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 5 + (((tickAnim - 0) / 75) * (-5-(5)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 120) {
            xx = -5 + (((tickAnim - 75) / 45) * (5-(-5)));
            yy = 0 + (((tickAnim - 75) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 2.5 + (((tickAnim - 0) / 60) * (-2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            yy = -2.5 + (((tickAnim - 60) / 60) * (2.5-(-2.5)));
            zz = 0 + (((tickAnim - 60) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 2.5 + (((tickAnim - 0) / 60) * (-2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            yy = -2.5 + (((tickAnim - 60) / 60) * (2.5-(-2.5)));
            zz = 0 + (((tickAnim - 60) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), Hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*3)), Hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2)), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.rotationPointX = this.Bodymiddle.rotationPointX + (float)(xx);
        this.Bodymiddle.rotationPointY = this.Bodymiddle.rotationPointY - (float)(yy);
        this.Bodymiddle.rotationPointZ = this.Bodymiddle.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3)), Bodyfront.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.rotationPointX = this.Bodyfront.rotationPointX + (float)(xx);
        this.Bodyfront.rotationPointY = this.Bodyfront.rotationPointY - (float)(yy);
        this.Bodyfront.rotationPointZ = this.Bodyfront.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+10))*3), Neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2)), Neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*3), Neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)), Neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), Neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3)), Neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2)));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*1), Head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)), Head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-2), Throat.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2)), Throat.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1)));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), Leftarm1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5)), Leftarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5)));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5)));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5), Rightarm1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2.5)), Rightarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2.5)));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5)));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 0) / 4) * (-10-(15)));
            yy = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
            zz = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-27.5-(-10)));
            yy = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
            zz = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 8) / 3) * (-10.52076-(-27.5)));
            yy = -5 + (((tickAnim - 8) / 3) * (-3.58007-(-5)));
            zz = -5 + (((tickAnim - 8) / 3) * (2.38188-(-5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.52076 + (((tickAnim - 11) / 2) * (-6.40321-(-10.52076)));
            yy = -3.58007 + (((tickAnim - 11) / 2) * (-2.4679-(-3.58007)));
            zz = 2.38188 + (((tickAnim - 11) / 2) * (3.65398-(2.38188)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -6.40321 + (((tickAnim - 13) / 1) * (-2.91291-(-6.40321)));
            yy = -2.4679 + (((tickAnim - 13) / 1) * (-0.53485-(-2.4679)));
            zz = 3.65398 + (((tickAnim - 13) / 1) * (-0.04391-(3.65398)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -2.91291 + (((tickAnim - 14) / 2) * (6.01333-(-2.91291)));
            yy = -0.53485 + (((tickAnim - 14) / 2) * (0.25142-(-0.53485)));
            zz = -0.04391 + (((tickAnim - 14) / 2) * (3.67282-(-0.04391)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 6.01333 + (((tickAnim - 16) / 2) * (15.084-(6.01333)));
            yy = 0.25142 + (((tickAnim - 16) / 2) * (1.28584-(0.25142)));
            zz = 3.67282 + (((tickAnim - 16) / 2) * (4.90277-(3.67282)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.084 + (((tickAnim - 18) / 2) * (15-(15.084)));
            yy = 1.28584 + (((tickAnim - 18) / 2) * (-5-(1.28584)));
            zz = 4.90277 + (((tickAnim - 18) / 2) * (-5-(4.90277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 13) / 1) * (-0.5-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-0.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 16) / 2) * (-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 18) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.rotationPointX = this.Leftleg1.rotationPointX + (float)(xx);
        this.Leftleg1.rotationPointY = this.Leftleg1.rotationPointY - (float)(yy);
        this.Leftleg1.rotationPointZ = this.Leftleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 0) / 4) * (42.5-(35)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 4) * (2.5-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 42.5 + (((tickAnim - 4) / 4) * (27.5-(42.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 4) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 8) / 3) * (-20-(27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (-2.5-(0)));
            zz = 2.5 + (((tickAnim - 8) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 11) / 3) * (7.5-(-20)));
            yy = -2.5 + (((tickAnim - 11) / 3) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 11) / 3) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 14) / 4) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 14) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 18) / 2) * (35-(12.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 18) / 2) * (5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.rotationPointX = this.Leftleg2.rotationPointX + (float)(xx);
        this.Leftleg2.rotationPointY = this.Leftleg2.rotationPointY - (float)(yy);
        this.Leftleg2.rotationPointZ = this.Leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-32.5-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -32.5 + (((tickAnim - 4) / 4) * (-27.5-(-32.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 8) / 3) * (27.5-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 11) / 3) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 14) / 4) * (25-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 18) / 2) * (10-(25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.rotationPointX = this.Leftleg3.rotationPointX + (float)(xx);
        this.Leftleg3.rotationPointY = this.Leftleg3.rotationPointY - (float)(yy);
        this.Leftleg3.rotationPointZ = this.Leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (90-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 90 + (((tickAnim - 4) / 4) * (60-(90)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 60 + (((tickAnim - 8) / 3) * (4.72913-(60)));
            yy = 0 + (((tickAnim - 8) / 3) * (3.99312-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-2.27967-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4.72913 + (((tickAnim - 11) / 2) * (0.97801-(4.72913)));
            yy = 3.99312 + (((tickAnim - 11) / 2) * (3.01774-(3.99312)));
            zz = -2.27967 + (((tickAnim - 11) / 2) * (-6.04405-(-2.27967)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.97801 + (((tickAnim - 13) / 1) * (-2.50933-(0.97801)));
            yy = 3.01774 + (((tickAnim - 13) / 1) * (0.43399-(3.01774)));
            zz = -6.04405 + (((tickAnim - 13) / 1) * (-2.46207-(-6.04405)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -2.50933 + (((tickAnim - 14) / 2) * (6.61239-(-2.50933)));
            yy = 0.43399 + (((tickAnim - 14) / 2) * (-2.15394-(0.43399)));
            zz = -2.46207 + (((tickAnim - 14) / 2) * (-6.64302-(-2.46207)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 6.61239 + (((tickAnim - 16) / 2) * (15.41291-(6.61239)));
            yy = -2.15394 + (((tickAnim - 16) / 2) * (-5.30188-(-2.15394)));
            zz = -6.64302 + (((tickAnim - 16) / 2) * (-5.09692-(-6.64302)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.41291 + (((tickAnim - 18) / 2) * (60-(15.41291)));
            yy = -5.30188 + (((tickAnim - 18) / 2) * (0-(-5.30188)));
            zz = -5.09692 + (((tickAnim - 18) / 2) * (0-(-5.09692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 0) / 4) * (47.5-(35)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 47.5 + (((tickAnim - 4) / 4) * (35-(47.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 35 + (((tickAnim - 8) / 3) * (2.5-(35)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 2.5 + (((tickAnim - 11) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-55-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -55 + (((tickAnim - 18) / 2) * (35-(-55)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.44872 + (((tickAnim - 0) / 3) * (-3.39838-(-10.44872)));
            yy = 4.26191 + (((tickAnim - 0) / 3) * (1.38934-(4.26191)));
            zz = -4.8031 + (((tickAnim - 0) / 3) * (-2.32639-(-4.8031)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.39838 + (((tickAnim - 3) / 4) * (14.44319-(-3.39838)));
            yy = 1.38934 + (((tickAnim - 3) / 4) * (-1.11587-(1.38934)));
            zz = -2.32639 + (((tickAnim - 3) / 4) * (-4.83277-(-2.32639)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 14.44319 + (((tickAnim - 7) / 2) * (15-(14.44319)));
            yy = -1.11587 + (((tickAnim - 7) / 2) * (5-(-1.11587)));
            zz = -4.83277 + (((tickAnim - 7) / 2) * (5-(-4.83277)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 9) / 4) * (-10-(15)));
            yy = 5 + (((tickAnim - 9) / 4) * (5-(5)));
            zz = 5 + (((tickAnim - 9) / 4) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (-27.5-(-10)));
            yy = 5 + (((tickAnim - 13) / 5) * (5-(5)));
            zz = 5 + (((tickAnim - 13) / 5) * (5-(5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5 + (((tickAnim - 18) / 2) * (-10.44872-(-27.5)));
            yy = 5 + (((tickAnim - 18) / 2) * (4.26191-(5)));
            zz = 5 + (((tickAnim - 18) / 2) * (-4.8031-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 2) / 1) * (-0.5-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 5) / 2) * (-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 5) * (0-(1)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 0) / 3) * (7.5-(-20)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 0) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 3) / 4) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 7) / 2) * (35-(12.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 7) / 2) * (-5-(-2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 9) / 4) * (42.5-(35)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 9) / 4) * (-2.5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5 + (((tickAnim - 13) / 5) * (27.5-(42.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 18) / 2) * (-20-(27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.5-(0)));
            zz = -2.5 + (((tickAnim - 18) / 2) * (2.5-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.rotationPointX = this.Rightleg2.rotationPointX + (float)(xx);
        this.Rightleg2.rotationPointY = this.Rightleg2.rotationPointY - (float)(yy);
        this.Rightleg2.rotationPointZ = this.Rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 3) / 4) * (25-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (10-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 9) / 4) * (-32.5-(10)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -32.5 + (((tickAnim - 13) / 5) * (-27.5-(-32.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5 + (((tickAnim - 18) / 2) * (27.5-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.rotationPointX = this.Rightleg3.rotationPointX + (float)(xx);
        this.Rightleg3.rotationPointY = this.Rightleg3.rotationPointY - (float)(yy);
        this.Rightleg3.rotationPointZ = this.Rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.5469 + (((tickAnim - 0) / 3) * (-2.58385-(4.5469)));
            yy = -4.72991 + (((tickAnim - 0) / 3) * (-1.29876-(-4.72991)));
            zz = 4.67558 + (((tickAnim - 0) / 3) * (7.38733-(4.67558)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.58385 + (((tickAnim - 3) / 4) * (16.05357-(-2.58385)));
            yy = -1.29876 + (((tickAnim - 3) / 4) * (4.41568-(-1.29876)));
            zz = 7.38733 + (((tickAnim - 3) / 4) * (6.01244-(7.38733)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 16.05357 + (((tickAnim - 7) / 2) * (60-(16.05357)));
            yy = 4.41568 + (((tickAnim - 7) / 2) * (0-(4.41568)));
            zz = 6.01244 + (((tickAnim - 7) / 2) * (0-(6.01244)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 60 + (((tickAnim - 9) / 4) * (90-(60)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 90 + (((tickAnim - 13) / 5) * (60-(90)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 60 + (((tickAnim - 18) / 2) * (4.5469-(60)));
            yy = 0 + (((tickAnim - 18) / 2) * (-4.72991-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (4.67558-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-55-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -55 + (((tickAnim - 7) / 2) * (35-(-55)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 9) / 4) * (47.5-(35)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 47.5 + (((tickAnim - 13) / 5) * (35-(47.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 18) / 2) * (2.5-(35)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-1), Tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3)), Tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*1), Tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5)), Tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+130))*1), Tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*5)), Tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*1), Tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5)), Tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.rotationPointX = this.Tail5.rotationPointX + (float)(xx);
        this.Tail5.rotationPointY = this.Tail5.rotationPointY - (float)(yy);
        this.Tail5.rotationPointZ = this.Tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+160))*1), Tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)), Tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2)));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAllosaurus entity = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+20))*-2), Hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3)), Hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 0) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 5) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3 + (((tickAnim - 10) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 10) / 17) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 27) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 32) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 32) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*1), Bodymiddle.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-20))*-3)), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.rotationPointX = this.Bodymiddle.rotationPointX + (float)(xx);
        this.Bodymiddle.rotationPointY = this.Bodymiddle.rotationPointY - (float)(yy);
        this.Bodymiddle.rotationPointZ = this.Bodymiddle.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*1), Bodyfront.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)), Bodyfront.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*3), Neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2)), Neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*1), Neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2)), Neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-1)));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-1), Neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*2)), Neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-1), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*-1), Head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*2)), Head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*-1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*1), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-5), Leftarm1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)), Leftarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*5)));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5)));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*5), Rightarm1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5)), Rightarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5)));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-5)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20.01859 + (((tickAnim - 0) / 10) * (5-(20.01859)));
            yy = 1.30541 + (((tickAnim - 0) / 10) * (-5-(1.30541)));
            zz = 9.89636 + (((tickAnim - 0) / 10) * (-5-(9.89636)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (-27.5-(5)));
            yy = -5 + (((tickAnim - 10) / 10) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.5 + (((tickAnim - 20) / 7) * (-22.61223-(-27.5)));
            yy = -5 + (((tickAnim - 20) / 7) * (-6.26128-(-5)));
            zz = -5 + (((tickAnim - 20) / 7) * (2.4035-(-5)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -22.61223 + (((tickAnim - 27) / 10) * (2.3333-(-22.61223)));
            yy = -6.26128 + (((tickAnim - 27) / 10) * (-2.96177-(-6.26128)));
            zz = 2.4035 + (((tickAnim - 27) / 10) * (2.4838-(2.4035)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.3333 + (((tickAnim - 37) / 13) * (20.01859-(2.3333)));
            yy = -2.96177 + (((tickAnim - 37) / 13) * (1.30541-(-2.96177)));
            zz = 2.4838 + (((tickAnim - 37) / 13) * (9.89636-(2.4838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 27) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.rotationPointX = this.Leftleg1.rotationPointX + (float)(xx);
        this.Leftleg1.rotationPointY = this.Leftleg1.rotationPointY - (float)(yy);
        this.Leftleg1.rotationPointZ = this.Leftleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 0) / 10) * (45-(5)));
            yy = -2.5 + (((tickAnim - 0) / 10) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 10) / 10) * (42.5-(45)));
            yy = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 42.5 + (((tickAnim - 20) / 7) * (-10-(42.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 27) / 10) * (5-(-10)));
            yy = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 37) / 13) * (5-(5)));
            yy = 0 + (((tickAnim - 37) / 13) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.rotationPointX = this.Leftleg2.rotationPointX + (float)(xx);
        this.Leftleg2.rotationPointY = this.Leftleg2.rotationPointY - (float)(yy);
        this.Leftleg2.rotationPointZ = this.Leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 0) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 10) / 10) * (-40-(-15)));
            yy = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -40 + (((tickAnim - 20) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 20) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 22.5 + (((tickAnim - 27) / 10) * (-10-(22.5)));
            yy = -2.5 + (((tickAnim - 27) / 10) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 37) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.rotationPointX = this.Leftleg3.rotationPointX + (float)(xx);
        this.Leftleg3.rotationPointY = this.Leftleg3.rotationPointY - (float)(yy);
        this.Leftleg3.rotationPointZ = this.Leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40.23749 + (((tickAnim - 0) / 7) * (52.5-(40.23749)));
            yy = -4.55749 + (((tickAnim - 0) / 7) * (0-(-4.55749)));
            zz = -5.96275 + (((tickAnim - 0) / 7) * (0-(-5.96275)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 52.5 + (((tickAnim - 7) / 13) * (45-(52.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 45 + (((tickAnim - 20) / 7) * (17.12165-(45)));
            yy = 0 + (((tickAnim - 20) / 7) * (4.98093-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-8.6822-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 17.12165 + (((tickAnim - 27) / 10) * (4.93745-(17.12165)));
            yy = 4.98093 + (((tickAnim - 27) / 10) * (1.50179-(4.98093)));
            zz = -8.6822 + (((tickAnim - 27) / 10) * (-4.76968-(-8.6822)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 4.93745 + (((tickAnim - 37) / 6) * (0-(4.93745)));
            yy = 1.50179 + (((tickAnim - 37) / 6) * (0-(1.50179)));
            zz = -4.76968 + (((tickAnim - 37) / 6) * (0-(-4.76968)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (40.23749-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-4.55749-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-5.96275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -87.5 + (((tickAnim - 0) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 7) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 50 + (((tickAnim - 20) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -5 + (((tickAnim - 27) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 43) / 7) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.40055 + (((tickAnim - 0) / 10) * (1.87952-(-22.40055)));
            yy = 6.56221 + (((tickAnim - 0) / 10) * (3.22569-(6.56221)));
            zz = -4.86702 + (((tickAnim - 0) / 10) * (-2.43914-(-4.86702)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 1.87952 + (((tickAnim - 10) / 13) * (19.91163-(1.87952)));
            yy = 3.22569 + (((tickAnim - 10) / 13) * (-1.91367-(3.22569)));
            zz = -2.43914 + (((tickAnim - 10) / 13) * (-9.93748-(-2.43914)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 19.91163 + (((tickAnim - 23) / 10) * (5-(19.91163)));
            yy = -1.91367 + (((tickAnim - 23) / 10) * (5-(-1.91367)));
            zz = -9.93748 + (((tickAnim - 23) / 10) * (5-(-9.93748)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 33) / 10) * (-27.5-(5)));
            yy = 5 + (((tickAnim - 33) / 10) * (5-(5)));
            zz = 5 + (((tickAnim - 33) / 10) * (5-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-22.40055-(-27.5)));
            yy = 5 + (((tickAnim - 43) / 7) * (6.56221-(5)));
            zz = 5 + (((tickAnim - 43) / 7) * (-4.86702-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 5) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 0) / 10) * (5-(-10)));
            yy = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 10) / 13) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 23) / 10) * (45-(5)));
            yy = 2.5 + (((tickAnim - 23) / 10) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 23) / 10) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 45 + (((tickAnim - 33) / 10) * (42.5-(45)));
            yy = 2.5 + (((tickAnim - 33) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 43) / 7) * (-10-(42.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.rotationPointX = this.Rightleg2.rotationPointX + (float)(xx);
        this.Rightleg2.rotationPointY = this.Rightleg2.rotationPointY - (float)(yy);
        this.Rightleg2.rotationPointZ = this.Rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (-10-(22.5)));
            yy = 2.5 + (((tickAnim - 0) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 10) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -15 + (((tickAnim - 33) / 10) * (-40-(-15)));
            yy = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 43) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 43) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.rotationPointX = this.Rightleg3.rotationPointX + (float)(xx);
        this.Rightleg3.rotationPointY = this.Rightleg3.rotationPointY - (float)(yy);
        this.Rightleg3.rotationPointZ = this.Rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.12165 + (((tickAnim - 0) / 10) * (5-(17.12165)));
            yy = -4.98093 + (((tickAnim - 0) / 10) * (0-(-4.98093)));
            zz = 8.6822 + (((tickAnim - 0) / 10) * (0-(8.6822)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 5 + (((tickAnim - 10) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (40.23749-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (4.55749-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (5.96275-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40.23749 + (((tickAnim - 23) / 7) * (52.5-(40.23749)));
            yy = 4.55749 + (((tickAnim - 23) / 7) * (0-(4.55749)));
            zz = 5.96275 + (((tickAnim - 23) / 7) * (0-(5.96275)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 52.5 + (((tickAnim - 30) / 13) * (45-(52.5)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 43) / 7) * (17.12165-(45)));
            yy = 0 + (((tickAnim - 43) / 7) * (-4.98093-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (8.6822-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 2.5 + (((tickAnim - 10) / 7) * (0-(2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -23.75 + (((tickAnim - 17) / 6) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 23) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40 + (((tickAnim - 30) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 43) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*2), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), Tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), Tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-90))*-2), Tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), Tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-120))*-1), Tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*-5)), Tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*2)));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), Tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-5)), Tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*2)));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), Tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*-5)), Tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*2)));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAllosaurus ee = (EntityPrehistoricFloraAllosaurus) entitylivingbaseIn;

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
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animLookLeft(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_RIGHT_ANIMATION) {
            animLookRight(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SNIFF_ANIMATION) {
            animSniff(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOKDOWNLEFT_ANIMATION) {
            animLookDownLeft(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOKDOWNRIGHT_ANIMATION) {
            animLookDownRight(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAllosaurus e = (EntityPrehistoricFloraAllosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
