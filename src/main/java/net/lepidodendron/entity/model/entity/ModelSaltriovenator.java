package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaltriovenator;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSaltriovenator extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Hips_r1;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Bodyfront_r1;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neckbase_r1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neckmiddle_r1;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Neckfrontthroat_r1;
    private final AdvancedModelRendererExtended Neckfrontslope_r1;
    private final AdvancedModelRendererExtended Neckfront_r1;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Horn_r1;
    private final AdvancedModelRendererExtended Rightcrestextension_r1;
    private final AdvancedModelRendererExtended Rightcrestorbit_r1;
    private final AdvancedModelRendererExtended Rightcrestfront_r1;
    private final AdvancedModelRendererExtended Rightcrestbase_r1;
    private final AdvancedModelRendererExtended Leftcrestextension_r1;
    private final AdvancedModelRendererExtended Leftcrestorbit_r1;
    private final AdvancedModelRendererExtended Leftcrestfront_r1;
    private final AdvancedModelRendererExtended Leftcrestbase_r1;
    private final AdvancedModelRendererExtended Upperfrontteeth_r1;
    private final AdvancedModelRendererExtended Upperbackteeth_r1;
    private final AdvancedModelRendererExtended Upperjawslopefront_r1;
    private final AdvancedModelRendererExtended Upperjawslopemiddle_r1;
    private final AdvancedModelRendererExtended Upperjawslopebase_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r1;
    private final AdvancedModelRendererExtended Upperjawbase_r1;
    private final AdvancedModelRendererExtended Headslope_r1;
    private final AdvancedModelRendererExtended Lowerjaw;
    private final AdvancedModelRendererExtended Lowerfrontteeth_r1;
    private final AdvancedModelRendererExtended Lowerbackteeth_r1;
    private final AdvancedModelRendererExtended Lowerjawslope_r1;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r1;
    private final AdvancedModelRendererExtended Lowerjawbase_r1;
    private final AdvancedModelRendererExtended Throat;
    private final AdvancedModelRendererExtended Throat_r1;
    private final AdvancedModelRendererExtended Masseter;
    private final AdvancedModelRendererExtended Masseter_r1;
    private final AdvancedModelRendererExtended Leftarm1;
    private final AdvancedModelRendererExtended Leftarm2;
    private final AdvancedModelRendererExtended Leftarm3;
    private final AdvancedModelRendererExtended Rightarm1;
    private final AdvancedModelRendererExtended Rightarm2;
    private final AdvancedModelRendererExtended Rightarm3;
    private final AdvancedModelRendererExtended Leftleg1;
    private final AdvancedModelRendererExtended Leftleg2;
    private final AdvancedModelRendererExtended Leftleg3;
    private final AdvancedModelRendererExtended Leftleg4;
    private final AdvancedModelRendererExtended Leftleg5;
    private final AdvancedModelRendererExtended Rightleg1;
    private final AdvancedModelRendererExtended Rightleg2;
    private final AdvancedModelRendererExtended Rightleg3;
    private final AdvancedModelRendererExtended Rightleg4;
    private final AdvancedModelRendererExtended Rightleg5;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended Tail6;

    private ModelAnimator animator;

    public ModelSaltriovenator() {
        this.textureWidth = 145;
        this.textureHeight = 145;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, -10.75F, 0.0F);


        this.Hips_r1 = new AdvancedModelRendererExtended(this);
        this.Hips_r1.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1134F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 33, -6.0F, 0.0F, 0.0F, 12, 17, 15, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, 1.8F, -5.9F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -6.5F, -5.8F, -15.0F, 13, 17, 15, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.Bodymiddle.addChild(Bodyfront);


        this.Bodyfront_r1 = new AdvancedModelRendererExtended(this);
        this.Bodyfront_r1.setRotationPoint(-1.0F, -4.0F, -7.0F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1396F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 66, -4.5F, -0.8F, -2.0F, 11, 16, 9, 0.0F, false));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, -1.8F, -7.4F);
        this.Bodyfront.addChild(Neck1);


        this.Neckbase_r1 = new AdvancedModelRendererExtended(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -2.9F, -5.0F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 81, 47, -4.0F, -0.1F, 0.3F, 8, 11, 9, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck1.addChild(Neck2);


        this.Neckmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -5.0F, -5.0F);
        this.Neck2.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.4014F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 83, 94, -3.0F, 0.5F, 0.2F, 6, 8, 7, -0.003F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Neck2.addChild(Neck3);


        this.Neckfrontthroat_r1 = new AdvancedModelRendererExtended(this);
        this.Neckfrontthroat_r1.setRotationPoint(0.0F, 6.5999F, -3.937F);
        this.Neck3.addChild(Neckfrontthroat_r1);
        this.setRotateAngle(Neckfrontthroat_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckfrontthroat_r1.cubeList.add(new ModelBox(Neckfrontthroat_r1, 96, 115, -2.5F, -4.1458F, -3.0884F, 5, 4, 3, 0.1F, false));

        this.Neckfrontslope_r1 = new AdvancedModelRendererExtended(this);
        this.Neckfrontslope_r1.setRotationPoint(0.0F, -1.4F, -3.9F);
        this.Neck3.addChild(Neckfrontslope_r1);
        this.setRotateAngle(Neckfrontslope_r1, 0.8116F, 0.0F, 0.0F);
        this.Neckfrontslope_r1.cubeList.add(new ModelBox(Neckfrontslope_r1, 0, 9, -2.5F, 0.0003F, -2.0738F, 5, 2, 2, -0.002F, false));

        this.Neckfront_r1 = new AdvancedModelRendererExtended(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -2.4F, -3.9F);
        this.Neck3.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, 0.0087F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 21, 104, -3.0F, 1.0F, -0.1F, 6, 8, 4, -0.002F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.6F, -2.7F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.1309F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 96, 68, -3.0F, -1.9031F, -6.9948F, 6, 5, 7, 0.001F, false));

        this.Horn_r1 = new AdvancedModelRendererExtended(this);
        this.Horn_r1.setRotationPoint(0.0F, -1.4891F, -12.3617F);
        this.Head.addChild(Horn_r1);
        this.setRotateAngle(Horn_r1, -0.681F, 0.0F, 0.0F);
        this.Horn_r1.cubeList.add(new ModelBox(Horn_r1, 112, 115, -0.5F, -0.535F, -0.6862F, 1, 4, 2, 0.0F, false));

        this.Rightcrestextension_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestextension_r1.setRotationPoint(-1.0F, -0.5891F, -8.7617F);
        this.Head.addChild(Rightcrestextension_r1);
        this.setRotateAngle(Rightcrestextension_r1, -0.9096F, -0.2422F, -0.3746F);
        this.Rightcrestextension_r1.cubeList.add(new ModelBox(Rightcrestextension_r1, 21, 92, -0.4891F, -3.0729F, -0.8109F, 1, 4, 2, 0.0F, true));

        this.Rightcrestorbit_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestorbit_r1.setRotationPoint(-1.162F, 1.4878F, -7.8136F);
        this.Head.addChild(Rightcrestorbit_r1);
        this.setRotateAngle(Rightcrestorbit_r1, 0.3986F, -0.5861F, -0.2861F);
        this.Rightcrestorbit_r1.cubeList.add(new ModelBox(Rightcrestorbit_r1, 61, 0, -0.4167F, -1.6566F, 0.2671F, 1, 2, 2, 0.0F, true));

        this.Rightcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestfront_r1.setRotationPoint(-1.162F, -1.2122F, -11.8136F);
        this.Head.addChild(Rightcrestfront_r1);
        this.setRotateAngle(Rightcrestfront_r1, 0.1514F, -0.2737F, -0.1149F);
        this.Rightcrestfront_r1.cubeList.add(new ModelBox(Rightcrestfront_r1, 0, 33, -0.1171F, -0.0646F, -0.0923F, 2, 2, 5, -0.1F, true));

        this.Rightcrestbase_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestbase_r1.setRotationPoint(-1.162F, -1.3122F, -8.9136F);
        this.Head.addChild(Rightcrestbase_r1);
        this.setRotateAngle(Rightcrestbase_r1, 0.1883F, -0.5611F, -0.0181F);
        this.Rightcrestbase_r1.cubeList.add(new ModelBox(Rightcrestbase_r1, 70, 56, -0.4496F, -0.3289F, -0.4964F, 2, 2, 3, 0.0F, true));

        this.Leftcrestextension_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestextension_r1.setRotationPoint(1.0F, -0.5891F, -8.7617F);
        this.Head.addChild(Leftcrestextension_r1);
        this.setRotateAngle(Leftcrestextension_r1, -0.9096F, 0.2422F, 0.3746F);
        this.Leftcrestextension_r1.cubeList.add(new ModelBox(Leftcrestextension_r1, 21, 92, -0.5109F, -3.0729F, -0.8109F, 1, 4, 2, 0.0F, false));

        this.Leftcrestorbit_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestorbit_r1.setRotationPoint(1.162F, 1.4878F, -7.8136F);
        this.Head.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, 0.3986F, 0.5861F, 0.2861F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 61, 0, -0.5833F, -1.6566F, 0.2671F, 1, 2, 2, 0.0F, false));

        this.Leftcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r1.setRotationPoint(1.162F, -1.2122F, -11.8136F);
        this.Head.addChild(Leftcrestfront_r1);
        this.setRotateAngle(Leftcrestfront_r1, 0.1514F, 0.2737F, 0.1149F);
        this.Leftcrestfront_r1.cubeList.add(new ModelBox(Leftcrestfront_r1, 0, 33, -1.8829F, -0.0646F, -0.0923F, 2, 2, 5, -0.1F, false));

        this.Leftcrestbase_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestbase_r1.setRotationPoint(1.162F, -1.3122F, -8.9136F);
        this.Head.addChild(Leftcrestbase_r1);
        this.setRotateAngle(Leftcrestbase_r1, 0.1883F, 0.5611F, 0.0181F);
        this.Leftcrestbase_r1.cubeList.add(new ModelBox(Leftcrestbase_r1, 70, 56, -1.5504F, -0.3289F, -0.4964F, 2, 2, 3, 0.0F, false));

        this.Upperfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth_r1.setRotationPoint(0.0F, 3.1109F, -15.3617F);
        this.Head.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1368F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 91, 28, -1.0F, -1.4379F, 0.0076F, 2, 2, 4, 0.0F, false));

        this.Upperbackteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth_r1.setRotationPoint(0.0F, 3.2109F, -11.6617F);
        this.Head.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, 0.1309F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 87, 0, -1.5F, -0.9564F, -0.0295F, 3, 2, 5, 0.0F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, 1.1243F, -15.3298F);
        this.Head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.8671F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 0, 66, -1.0F, -0.0843F, 0.0379F, 2, 3, 2, 0.0F, false));

        this.Upperjawslopemiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopemiddle_r1.setRotationPoint(0.0F, -0.4757F, -14.0298F);
        this.Head.addChild(Upperjawslopemiddle_r1);
        this.setRotateAngle(Upperjawslopemiddle_r1, 0.4307F, 0.0F, 0.0F);
        this.Upperjawslopemiddle_r1.cubeList.add(new ModelBox(Upperjawslopemiddle_r1, 32, 66, -1.0F, -0.0037F, -0.1232F, 2, 3, 3, -0.001F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -1.5891F, -11.7617F);
        this.Head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.052F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 0, 0, -1.0F, 0.165F, 0.2138F, 2, 3, 5, 0.2F, false));

        this.Upperjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 3.0109F, -15.3617F);
        this.Head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.0496F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 115, 98, -1.5F, -1.9381F, -0.0874F, 3, 2, 4, 0.0F, false));

        this.Upperjawbase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, 3.1109F, -6.9617F);
        this.Head.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, 0.0175F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 59, 109, -2.0F, -3.9384F, -4.7305F, 4, 4, 5, 0.0F, false));

        this.Headslope_r1 = new AdvancedModelRendererExtended(this);
        this.Headslope_r1.setRotationPoint(0.0F, -1.7405F, -3.4923F);
        this.Head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.0873F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 81, 68, -2.5F, -0.1719F, -0.442F, 5, 2, 3, 0.001F, false));

        this.Lowerjaw = new AdvancedModelRendererExtended(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.9109F, 0.0383F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.1065F, 0.0F, 0.0F);


        this.Lowerfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth_r1.setRotationPoint(0.0F, 1.739F, -10.9003F);
        this.Lowerjaw.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, -0.0321F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 0, 41, -1.0F, -1.0374F, -4.3523F, 2, 1, 5, 0.0F, false));
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 0, 115, -1.5F, -0.6374F, -4.6523F, 3, 2, 5, -0.2F, false));

        this.Lowerbackteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerbackteeth_r1.setRotationPoint(0.0F, 0.739F, -11.5003F);
        this.Lowerjaw.addChild(Lowerbackteeth_r1);
        this.setRotateAngle(Lowerbackteeth_r1, 0.1651F, 0.0F, 0.0F);
        this.Lowerbackteeth_r1.cubeList.add(new ModelBox(Lowerbackteeth_r1, 73, 94, -1.5F, -0.1313F, -0.003F, 3, 1, 5, 0.0F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope_r1.setRotationPoint(0.0F, 0.139F, -6.9003F);
        this.Lowerjaw.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, 0.0168F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 109, 28, -2.0F, 0.8557F, -4.5821F, 4, 2, 6, -0.1F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.139F, -6.9003F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.2175F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 78, 111, -2.0F, -0.0379F, -4.7241F, 4, 2, 5, -0.05F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0F, 0.039F, -6.7003F);
        this.Lowerjaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, 0.2443F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 103, 87, -3.0F, 0.025F, -0.2132F, 6, 3, 7, 0.0F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(0.0F, 2.939F, -5.9003F);
        this.Lowerjaw.addChild(Throat);


        this.Throat_r1 = new AdvancedModelRendererExtended(this);
        this.Throat_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throat.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, -0.3229F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 53, 93, -2.0F, -4.0151F, 0.0207F, 4, 4, 11, 0.0F, false));

        this.Masseter = new AdvancedModelRendererExtended(this);
        this.Masseter.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Lowerjaw.addChild(Masseter);


        this.Masseter_r1 = new AdvancedModelRendererExtended(this);
        this.Masseter_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Masseter.addChild(Masseter_r1);
        this.setRotateAngle(Masseter_r1, -0.2007F, 0.0F, 0.0F);
        this.Masseter_r1.cubeList.add(new ModelBox(Masseter_r1, 42, 0, -3.0F, -4.0F, 0.0F, 6, 4, 6, -0.003F, false));

        this.Leftarm1 = new AdvancedModelRendererExtended(this);
        this.Leftarm1.setRotationPoint(5.5F, 8.4F, -3.7F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, -0.3491F, 0.0F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 102, 103, -0.7F, -1.5703F, -0.7949F, 2, 3, 8, 0.001F, false));

        this.Leftarm2 = new AdvancedModelRendererExtended(this);
        this.Leftarm2.setRotationPoint(0.3F, -1.5F, 7.2F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.309F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 112, 13, -1.0F, 0.0871F, 0.0457F, 2, 2, 6, 0.0F, false));
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 52, 85, -1.0F, 0.7871F, 0.0457F, 2, 2, 6, -0.001F, false));

        this.Leftarm3 = new AdvancedModelRendererExtended(this);
        this.Leftarm3.setRotationPoint(1.0F, 1.6226F, 5.963F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, -0.3491F, 0.0F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 76, 47, -1.0F, -1.7F, 0.0F, 1, 3, 5, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRendererExtended(this);
        this.Rightarm1.setRotationPoint(-5.5F, 8.4F, -3.7F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, -0.3491F, 0.0F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 102, 103, -1.3F, -1.5703F, -0.7949F, 2, 3, 8, 0.001F, true));

        this.Rightarm2 = new AdvancedModelRendererExtended(this);
        this.Rightarm2.setRotationPoint(-0.3F, -1.5F, 7.2F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.309F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 112, 13, -1.0F, 0.0871F, 0.0457F, 2, 2, 6, 0.0F, true));
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 52, 85, -1.0F, 0.7871F, 0.0457F, 2, 2, 6, -0.001F, true));

        this.Rightarm3 = new AdvancedModelRendererExtended(this);
        this.Rightarm3.setRotationPoint(-1.0F, 1.6226F, 5.963F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.3491F, 0.0F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 76, 47, 0.0F, -1.7F, 0.0F, 1, 3, 5, 0.0F, true));

        this.Leftleg1 = new AdvancedModelRendererExtended(this);
        this.Leftleg1.setRotationPoint(5.1F, 1.7F, 0.1F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.2618F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 44, 55, -3.5F, -2.0F, -5.1F, 7, 18, 11, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRendererExtended(this);
        this.Leftleg2.setRotationPoint(0.6F, 16.0F, -5.1F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 1.0472F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 0, 92, -2.7F, 0.0F, 0.0F, 5, 17, 5, 0.0F, false));
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 105, 0, -2.7F, 0.0F, 4.6F, 5, 17, 1, -0.001F, false));

        this.Leftleg3 = new AdvancedModelRendererExtended(this);
        this.Leftleg3.setRotationPoint(0.0F, 16.8174F, 5.362F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.9599F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 42, 109, -2.1F, 0.0F, -4.0F, 4, 9, 4, 0.0F, false));

        this.Leftleg4 = new AdvancedModelRendererExtended(this);
        this.Leftleg4.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.1745F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 55, 47, -3.1F, -0.6527F, -2.0304F, 6, 3, 4, 0.0F, false));

        this.Leftleg5 = new AdvancedModelRendererExtended(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.7473F, -2.0304F);
        this.Leftleg4.addChild(Leftleg5);
        this.Leftleg5.cubeList.add(new ModelBox(Leftleg5, 107, 45, -3.1F, -1.4F, -4.4F, 6, 3, 5, -0.001F, false));

        this.Rightleg1 = new AdvancedModelRendererExtended(this);
        this.Rightleg1.setRotationPoint(-5.1F, 1.7F, 0.1F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.2618F, 0.0F, 0.0F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 44, 55, -3.5F, -2.0F, -5.1F, 7, 18, 11, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRendererExtended(this);
        this.Rightleg2.setRotationPoint(-0.6F, 16.0F, -5.1F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.0472F, 0.0F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 0, 92, -2.3F, 0.0F, 0.0F, 5, 17, 5, 0.0F, true));
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 105, 0, -2.3F, 0.0F, 4.6F, 5, 17, 1, -0.001F, true));

        this.Rightleg3 = new AdvancedModelRendererExtended(this);
        this.Rightleg3.setRotationPoint(0.0F, 16.8174F, 5.362F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.9599F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 42, 109, -1.9F, 0.0F, -4.0F, 4, 9, 4, 0.0F, true));

        this.Rightleg4 = new AdvancedModelRendererExtended(this);
        this.Rightleg4.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.1745F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 55, 47, -2.9F, -0.6527F, -2.0304F, 6, 3, 4, 0.0F, true));

        this.Rightleg5 = new AdvancedModelRendererExtended(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.7473F, -2.0304F);
        this.Rightleg4.addChild(Rightleg5);
        this.Rightleg5.cubeList.add(new ModelBox(Rightleg5, 107, 45, -2.9F, -1.4F, -4.4F, 6, 3, 5, -0.001F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(-0.5F, 1.0F, 8.6F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1745F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 46, 22, -5.0F, -3.0304F, -2.6527F, 11, 13, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 1.9696F, 8.3473F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 57, 0, -4.0F, -5.0F, -2.0F, 9, 10, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 70, 74, -3.0F, -5.0F, -2.0F, 7, 8, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -2.0F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 29, 85, -2.0F, -3.0F, -1.0F, 5, 6, 12, -0.002F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1309F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 84, 8, -1.0F, -0.8017F, -0.9739F, 3, 5, 14, 0.0F, false));

        this.Tail6 = new AdvancedModelRendererExtended(this);
        this.Tail6.setRotationPoint(0.0F, 0.2F, 13.4F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1745F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 91, 28, -0.5F, -0.8093F, -0.9399F, 2, 3, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {

    }

    public void renderStaticFloor(float f) {

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

        EntityPrehistoricFloraSaltriovenator EntitySaltriovenator = (EntityPrehistoricFloraSaltriovenator) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        EntitySaltriovenator.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntitySaltriovenator.getAnimation() == EntitySaltriovenator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntitySaltriovenator.isReallyInWater()) {

                if (f3 == 0.0F || !EntitySaltriovenator.getIsMoving()) {
                    if (EntitySaltriovenator.getAnimation() != EntitySaltriovenator.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

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

                if (EntitySaltriovenator.getIsFast()) { //Running


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
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*20D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-2.5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*30) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*30D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*15D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*2.5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*15) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*15D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-2.5D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*2.5D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*1D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*10D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20D)));
            yy = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-20) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-20D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 20D) * (0D-(0D)));
            zz = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30) + (((tickAnim - 10D) / 20D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10) + (((tickAnim - 10D) / 5D) * (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin(1.5D*(Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*0.1) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-2D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*0.1D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-2) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*0.5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-2D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*0.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*0.5D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/2))*3D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*40D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25)*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*40) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*40D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25)*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25)*-5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*-10) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*-10D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*60))*-5D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*20D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*20) + (((tickAnim - 15D) / 10D) * (10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*100))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*20D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*30))*-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*100))*-10) + (((tickAnim - 25D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180))*100)*-10D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*100))*-2.5D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*30D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*30) + (((tickAnim - 15D) / 10D) * (10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*70))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*30D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25+((Math.PI/180)*60))*-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*70))*-10) + (((tickAnim - 25D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180))*70)*-10D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2-((Math.PI/180)*70))*-2.5D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*30D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*30) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30) + (((tickAnim - 15D) / 10D) * (15+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5) + (((tickAnim - 25D) / 10D) * (5+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5D-(15+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5) + (((tickAnim - 35D) / 5D) * (0D-(5+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30) + (((tickAnim - 15D) / 10D) * (5+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5) + (((tickAnim - 25D) / 15D) * (0D-(5+Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            zz = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*10) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*2) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*2D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-10) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*10) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-20D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*2) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*2D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-0.5D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*1.5D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-10) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*10D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin(2D*(Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-20))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*1));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = -0.25+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5) + (((tickAnim - 0D) / 7D) * (0.5+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D-(-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D)));
            zz = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 0.5+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25) + (((tickAnim - 7D) / 6D) * (-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D-(0.5+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D)));
            zz = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 7D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = -0.25+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5) + (((tickAnim - 13D) / 12D) * (-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D-(-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D)));
            zz = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 13D) / 12D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = -0.25+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5) + (((tickAnim - 25D) / 7D) * (0.5+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D-(-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D)));
            zz = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = 0.5+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25) + (((tickAnim - 32D) / 6D) * (-0.25+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+30))*-0.5D-(0.5+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D)));
            zz = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 32D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-1));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-30))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+40))*-1), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+40))*-1));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-60))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-40))*-3), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-40))*-1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+60))*10), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*3), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-10), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+50))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-60))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*2.5), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+70))*-5), Leftarm1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-60))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-80))*-5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+70))*5), Leftarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-50))*5), Leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-110))*5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*5), Rightarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+90))*5));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30D + (((tickAnim - 0D) / 13D) * (-12.5D-(-30D)));
            yy = -5D + (((tickAnim - 0D) / 13D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 13D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.5D + (((tickAnim - 13D) / 12D) * (12.5D-(-12.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 12D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 13D) / 12D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.5D + (((tickAnim - 25D) / 10D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (-5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7.5D + (((tickAnim - 35D) / 8D) * (-27.5D-(7.5D)));
            yy = -5D + (((tickAnim - 35D) / 8D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 35D) / 8D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5D + (((tickAnim - 43D) / 7D) * (-30D-(-27.5D)));
            yy = -5D + (((tickAnim - 43D) / 7D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 43D) / 7D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 7D) * (1+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 1+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5) + (((tickAnim - 7D) / 6D) * (0D-(1+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5) + (((tickAnim - 19D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 0D) / 13D) * (5D-(-10D)));
            yy = -2.5D + (((tickAnim - 0D) / 13D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 13D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 13D) / 12D) * (-2.5D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -2.5D + (((tickAnim - 25D) / 10D) * (20D-(-2.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20D + (((tickAnim - 35D) / 8D) * (25D-(20D)));
            yy = -2.5D + (((tickAnim - 35D) / 8D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 35D) / 8D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25D + (((tickAnim - 43D) / 7D) * (-10D-(25D)));
            yy = -2.5D + (((tickAnim - 43D) / 7D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 43D) / 7D) * (2.5D-(-2.5D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 19D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.5D + (((tickAnim - 0D) / 13D) * (17.5D-(27.5D)));
            yy = 2.5D + (((tickAnim - 0D) / 13D) * (2.5D-(2.5D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5D + (((tickAnim - 13D) / 12D) * (30D-(17.5D)));
            yy = 2.5D + (((tickAnim - 13D) / 12D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30D + (((tickAnim - 25D) / 10D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -10D + (((tickAnim - 35D) / 8D) * (-27.5D-(-10D)));
            yy = 2.5D + (((tickAnim - 35D) / 8D) * (5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 35D) / 8D) * (5D-(-2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5D + (((tickAnim - 43D) / 7D) * (27.5D-(-27.5D)));
            yy = 5D + (((tickAnim - 43D) / 7D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 43D) / 7D) * (0D-(5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 19D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 0D) / 13D) * (-10D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 13D) / 12D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 7.5D + (((tickAnim - 25D) / 10D) * (80D-(7.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 80D + (((tickAnim - 35D) / 8D) * (70D-(80D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 70D + (((tickAnim - 43D) / 7D) * (12.5D-(70D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (-47.5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -47.5D + (((tickAnim - 25D) / 10D) * (30D-(-47.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 30D + (((tickAnim - 35D) / 8D) * (50D-(30D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 50D + (((tickAnim - 43D) / 7D) * (0D-(50D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5D + (((tickAnim - 0D) / 10D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.5D + (((tickAnim - 10D) / 8D) * (-27.5D-(7.5D)));
            yy = 5D + (((tickAnim - 10D) / 8D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 10D) / 8D) * (5D-(5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5D + (((tickAnim - 18D) / 7D) * (-30D-(-27.5D)));
            yy = 5D + (((tickAnim - 18D) / 7D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 18D) / 7D) * (5D-(5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -30D + (((tickAnim - 25D) / 13D) * (-12.5D-(-30D)));
            yy = 5D + (((tickAnim - 25D) / 13D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 25D) / 13D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.5D + (((tickAnim - 38D) / 12D) * (12.5D-(-12.5D)));
            yy = 2.5D + (((tickAnim - 38D) / 12D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 38D) / 12D) * (0D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 25D) / 7D) * (1+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D-(1D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = 1+(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5) + (((tickAnim - 32D) / 6D) * (0D-(1+Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5) + (((tickAnim - 44D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 0D) / 10D) * (20D-(-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20D + (((tickAnim - 10D) / 8D) * (25D-(20D)));
            yy = 2.5D + (((tickAnim - 10D) / 8D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 8D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25D + (((tickAnim - 18D) / 7D) * (-10D-(25D)));
            yy = 2.5D + (((tickAnim - 18D) / 7D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 18D) / 7D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -10D + (((tickAnim - 25D) / 13D) * (5D-(-10D)));
            yy = 2.5D + (((tickAnim - 25D) / 13D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 25D) / 13D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5D + (((tickAnim - 38D) / 12D) * (-2.5D-(5D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 44D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30D + (((tickAnim - 0D) / 10D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 10D) / 8D) * (-27.5D-(-10D)));
            yy = -2.5D + (((tickAnim - 10D) / 8D) * (-5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 8D) * (-5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5D + (((tickAnim - 18D) / 7D) * (27.5D-(-27.5D)));
            yy = -5D + (((tickAnim - 18D) / 7D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 7D) * (0D-(-5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 27.5D + (((tickAnim - 25D) / 13D) * (17.5D-(27.5D)));
            yy = -2.5D + (((tickAnim - 25D) / 13D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.5D + (((tickAnim - 38D) / 12D) * (30D-(17.5D)));
            yy = -2.5D + (((tickAnim - 38D) / 12D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 44D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * (80D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 80D + (((tickAnim - 10D) / 8D) * (70D-(80D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 70D + (((tickAnim - 18D) / 7D) * (12.5D-(70D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 12.5D + (((tickAnim - 25D) / 13D) * (-10D-(12.5D)));
            yy = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10D + (((tickAnim - 38D) / 12D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -47.5D + (((tickAnim - 0D) / 10D) * (30D-(-47.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 30D + (((tickAnim - 10D) / 8D) * (50D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 50D + (((tickAnim - 18D) / 7D) * (0D-(50D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 38D) / 12D) * (-47.5D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+50))*-2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-4), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*3));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-10))*-2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-30))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-30))*3));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-30))*-2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-7.5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-3));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-60))*-2), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-70))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-70))*3));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin(2.5D*(Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-80))*-2), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-90))*-5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-90))*3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-100))*-2), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*-5), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*3));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+60))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+60))*2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75) + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2) + (((tickAnim - 3D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 3D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75) + (((tickAnim - 4D) / 6D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 4D) / 6D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75) + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2) + (((tickAnim - 12D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.75D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 12D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-1));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+10))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+80))*-1), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+80))*-1));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+50))*-5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-1), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+70))*5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-50))*-2), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-2), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-5), Leftarm1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-110))*5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*5), Leftarm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*5), Leftarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*5));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*5), Leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+70))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-80))*5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-50))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+70))*5), Rightarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-5));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720/2.5-50))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5D + (((tickAnim - 0D) / 4D) * (-12.5D-(-27.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5D + (((tickAnim - 4D) / 4D) * (10D-(-12.5D)));
            yy = -2.5D + (((tickAnim - 4D) / 4D) * (2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10D + (((tickAnim - 8D) / 2D) * (12.5D-(10D)));
            yy = 2.5D + (((tickAnim - 8D) / 2D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 10D) / 3D) * (-5D-(12.5D)));
            yy = 2.5D + (((tickAnim - 10D) / 3D) * (-5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 3D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5D + (((tickAnim - 13D) / 5D) * (-37.5D-(-5D)));
            yy = -5D + (((tickAnim - 13D) / 5D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 13D) / 5D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.5D + (((tickAnim - 18D) / 2D) * (-27.5D-(-37.5D)));
            yy = -5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (1+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 1+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5) + (((tickAnim - 3D) / 1D) * (-0.5D-(1+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 4D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5) + (((tickAnim - 6D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
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
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -25D + (((tickAnim - 0D) / 4D) * (5D-(-25D)));
            yy = 2.5D + (((tickAnim - 0D) / 4D) * (-2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 4D) / 4D) * (-2.5D-(5D)));
            yy = -2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 4D) / 4D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 8D) / 2D) * (12.5D-(-2.5D)));
            yy = -2.5D + (((tickAnim - 8D) / 2D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 8D) / 2D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 10D) / 3D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (2.5D-(0D)));
            zz = 2.5D + (((tickAnim - 10D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.5D + (((tickAnim - 13D) / 5D) * (22.5D-(22.5D)));
            yy = 2.5D + (((tickAnim - 13D) / 5D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 5D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 18D) / 2D) * (-25D-(22.5D)));
            yy = 2.5D + (((tickAnim - 18D) / 2D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-2.5D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35) + (((tickAnim - 3D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25) + (((tickAnim - 6D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20D + (((tickAnim - 0D) / 4D) * (15D-(20D)));
            yy = 2.5D + (((tickAnim - 0D) / 4D) * (2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 0D) / 4D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15D + (((tickAnim - 4D) / 4D) * (35D-(15D)));
            yy = 2.5D + (((tickAnim - 4D) / 4D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 4D) / 4D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35D + (((tickAnim - 8D) / 2D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25D + (((tickAnim - 10D) / 3D) * (-20D-(25D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -20D + (((tickAnim - 13D) / 5D) * (-22.5D-(-20D)));
            yy = 2.5D + (((tickAnim - 13D) / 5D) * (5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 5D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.5D + (((tickAnim - 18D) / 2D) * (20D-(-22.5D)));
            yy = 5D + (((tickAnim - 18D) / 2D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 18D) / 2D) * (5D-(5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35) + (((tickAnim - 3D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25) + (((tickAnim - 6D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35D + (((tickAnim - 0D) / 4D) * (-10D-(35D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10D + (((tickAnim - 4D) / 4D) * (22.5D-(-10D)));
            yy = 2.5D + (((tickAnim - 4D) / 4D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 8D) / 2D) * (67.5D-(22.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.5D + (((tickAnim - 10D) / 3D) * (87.5D-(67.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 87.5D + (((tickAnim - 13D) / 5D) * (77.5D-(87.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 77.5D + (((tickAnim - 18D) / 2D) * (35D-(77.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.5D + (((tickAnim - 0D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (-67.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -67.5D + (((tickAnim - 8D) / 2D) * (25D-(-67.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25D + (((tickAnim - 10D) / 3D) * (35D-(25D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35D + (((tickAnim - 13D) / 5D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25D + (((tickAnim - 18D) / 2D) * (-2.5D-(25D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5D + (((tickAnim - 0D) / 3D) * (-5D-(12.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 3D) * (5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 3D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5D + (((tickAnim - 3D) / 5D) * (-37.5D-(-5D)));
            yy = 5D + (((tickAnim - 3D) / 5D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 3D) / 5D) * (5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.5D + (((tickAnim - 8D) / 2D) * (-27.5D-(-37.5D)));
            yy = 5D + (((tickAnim - 8D) / 2D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 8D) / 2D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.5D + (((tickAnim - 10D) / 4D) * (-12.5D-(-27.5D)));
            yy = 2.5D + (((tickAnim - 10D) / 4D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5D + (((tickAnim - 14D) / 4D) * (10D-(-12.5D)));
            yy = 2.5D + (((tickAnim - 14D) / 4D) * (-2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 14D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 18D) / 2D) * (12.5D-(10D)));
            yy = -2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (2.5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


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
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (1+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = 1+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5) + (((tickAnim - 12D) / 2D) * (-0.5D-(1+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 14D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5D + (((tickAnim - 0D) / 3D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
            zz = -2.5D + (((tickAnim - 0D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.5D + (((tickAnim - 3D) / 5D) * (22.5D-(22.5D)));
            yy = -2.5D + (((tickAnim - 3D) / 5D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 3D) / 5D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 8D) / 2D) * (-25D-(22.5D)));
            yy = -2.5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 8D) / 2D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -25D + (((tickAnim - 10D) / 4D) * (5D-(-25D)));
            yy = -2.5D + (((tickAnim - 10D) / 4D) * (2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5D + (((tickAnim - 14D) / 4D) * (-2.5D-(5D)));
            yy = 2.5D + (((tickAnim - 14D) / 4D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 14D) / 4D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 18D) / 2D) * (12.5D-(-2.5D)));
            yy = 2.5D + (((tickAnim - 18D) / 2D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35) + (((tickAnim - 12D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25D + (((tickAnim - 0D) / 3D) * (-20D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20D + (((tickAnim - 3D) / 5D) * (-22.5D-(-20D)));
            yy = -2.5D + (((tickAnim - 3D) / 5D) * (-5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 3D) / 5D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5D + (((tickAnim - 8D) / 2D) * (20D-(-22.5D)));
            yy = -5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 8D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20D + (((tickAnim - 10D) / 4D) * (15D-(20D)));
            yy = -2.5D + (((tickAnim - 10D) / 4D) * (-2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 10D) / 4D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15D + (((tickAnim - 14D) / 4D) * (35D-(15D)));
            yy = -2.5D + (((tickAnim - 14D) / 4D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 14D) / 4D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35D + (((tickAnim - 18D) / 2D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35) + (((tickAnim - 12D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.25D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67.5D + (((tickAnim - 0D) / 3D) * (87.5D-(67.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 87.5D + (((tickAnim - 3D) / 5D) * (77.5D-(87.5D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5D + (((tickAnim - 8D) / 2D) * (35D-(77.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 35D + (((tickAnim - 10D) / 4D) * (-10D-(35D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 14D) / 4D) * (22.5D-(-10D)));
            yy = -2.5D + (((tickAnim - 14D) / 4D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 18D) / 2D) * (67.5D-(22.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25D + (((tickAnim - 0D) / 3D) * (35D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35D + (((tickAnim - 3D) / 5D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 8D) / 2D) * (-2.5D-(25D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -2.5D + (((tickAnim - 10D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (-67.5D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -67.5D + (((tickAnim - 18D) / 2D) * (25D-(-67.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*3), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*-3), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-120))*-3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-150))*7.5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-150))*-3));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-150))*-3), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-160))*7.5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-160))*-3));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.offsetX = (float) Math.toRadians(xx);
        this.Tail5.offsetY = (float) Math.toRadians(yy);
        this.Tail5.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-180))*-3), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-180))*7.5), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-180))*-3));


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2) + (((tickAnim - 20D) / 30D) * (0D-(-5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-60)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-60)*3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*3D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+30)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*60))*3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*60))*3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));
        



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10) + (((tickAnim - 10D) / 10D) * (5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2) + (((tickAnim - 20D) / 30D) * (0D-(5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -10+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30) + (((tickAnim - 20D) / 30D) * (0D-(-10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.25) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.25D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-0.25) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-0.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25) + (((tickAnim - 10D) / 10D) * (1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25) + (((tickAnim - 10D) / 10D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5) + (((tickAnim - 20D) / 30D) * (0D-(1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1) + (((tickAnim - 20D) / 30D) * (0D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10) + (((tickAnim - 20D) / 30D) * (0D-(10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (40+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30) + (((tickAnim - 20D) / 30D) * (0D-(40+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -30D + (((tickAnim - 10D) / 15D) * (-15D-(-30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -15D + (((tickAnim - 25D) / 15D) * (0D-(-15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-0.75D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-4D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            yy = -0.75D + (((tickAnim - 10D) / 15D) * (-0.37D-(-0.75D)));
            zz = -4D + (((tickAnim - 10D) / 15D) * (-2D-(-4D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = -0.37D + (((tickAnim - 25D) / 15D) * (0D-(-0.37D)));
            zz = -2D + (((tickAnim - 25D) / 15D) * (0D-(-2D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (11D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11D + (((tickAnim - 5D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 9.5D + (((tickAnim - 8D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11D + (((tickAnim - 12D) / 2D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 9.5D + (((tickAnim - 14D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 11D + (((tickAnim - 18D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 9.5D + (((tickAnim - 21D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11D + (((tickAnim - 25D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 9.5D + (((tickAnim - 28D) / 12D) * (0D-(9.5D)));
            yy = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30D + (((tickAnim - 10D) / 15D) * (15D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 25D) / 15D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (1D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 1D + (((tickAnim - 10D) / 30D) * (0D-(1D)));
            yy = 3D + (((tickAnim - 10D) / 30D) * (0D-(3D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 10D) / 15D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 25D) / 15D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30D + (((tickAnim - 10D) / 15D) * (15D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 25D) / 15D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-1D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -1D + (((tickAnim - 10D) / 30D) * (0D-(-1D)));
            yy = 3D + (((tickAnim - 10D) / 30D) * (0D-(3D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 10D) / 15D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 25D) / 15D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 5D) / 4D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 9D) / 4D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 13D) / 3D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 16D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 10D + (((tickAnim - 21D) / 2D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -10D + (((tickAnim - 27D) / 4D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 5D) / 4D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 9D) / 4D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 13D) / 3D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10D + (((tickAnim - 16D) / 2D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10D + (((tickAnim - 21D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10D + (((tickAnim - 27D) / 4D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -7D + (((tickAnim - 10D) / 15D) * (-3.5D-(-7D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.5D + (((tickAnim - 25D) / 15D) * (0D-(-3.5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -7D + (((tickAnim - 10D) / 15D) * (-3.5D-(-7D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.5D + (((tickAnim - 25D) / 15D) * (0D-(-3.5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 10D) / 10D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 20D) / 3D) * (4D-(5D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4D + (((tickAnim - 23D) / 5D) * (-4D-(4D)));
            yy = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -4D + (((tickAnim - 28D) / 2D) * (-1D-(-4D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -1D + (((tickAnim - 30D) / 3D) * (2D-(-1D)));
            yy = 5D + (((tickAnim - 30D) / 3D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2D + (((tickAnim - 33D) / 2D) * (1.33D-(2D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.33D + (((tickAnim - 35D) / 3D) * (0.67D-(1.33D)));
            yy = -2.5D + (((tickAnim - 35D) / 3D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.67D + (((tickAnim - 38D) / 2D) * (0D-(0.67D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (1.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
            yy = 1.5D + (((tickAnim - 40D) / 2D) * (0D-(1.5D)));
            zz = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 1D) * (-1.5D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 43D) / 2D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 45D) / 2D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 47D) / 1D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 10D) / 15D) * (2.5D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 25D) / 5D) * (1.67D-(2.5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 1.67D + (((tickAnim - 30D) / 3D) * (1.25D-(1.67D)));
            yy = 2.5D + (((tickAnim - 30D) / 3D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1.25D + (((tickAnim - 33D) / 2D) * (0.83D-(1.25D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.83D + (((tickAnim - 35D) / 3D) * (0.42D-(0.83D)));
            yy = -2.5D + (((tickAnim - 35D) / 3D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.42D + (((tickAnim - 38D) / 2D) * (0D-(0.42D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (1.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
            yy = 1.5D + (((tickAnim - 40D) / 2D) * (0D-(1.5D)));
            zz = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 1D) * (-1.5D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 43D) / 2D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 45D) / 2D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 47D) / 1D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 10D) / 15D) * (6.25D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.25D + (((tickAnim - 25D) / 5D) * (8D-(6.25D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8D + (((tickAnim - 30D) / 10D) * (0D-(8D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 10D) / 15D) * (6.25D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 6.25D + (((tickAnim - 25D) / 9D) * (2.78D-(6.25D)));
            yy = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.78D + (((tickAnim - 34D) / 6D) * (0D-(2.78D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 25D) / 5D) * (12.5D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.5D + (((tickAnim - 30D) / 10D) * (0D-(12.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 27D) / 3D) * (-10D-(5D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -10D + (((tickAnim - 30D) / 6D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 23D) / 5D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 10D + (((tickAnim - 28D) / 6D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 28D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 7.5D + (((tickAnim - 32D) / 6D) * (0D-(7.5D)));
            yy = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 9D) / 4D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 10D + (((tickAnim - 13D) / 17D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 33D) / 7D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 9D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 34D) / 6D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = (((tickAnim - 0D) / 9D) * (7.5D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.5D + (((tickAnim - 9D) / 4D) * (-10D-(7.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -10D + (((tickAnim - 13D) / 17D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 34D) / 6D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (8D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 8D + (((tickAnim - 9D) / 4D) * (-2D-(8D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -2D + (((tickAnim - 13D) / 3D) * (-2D-(-2D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -2D + (((tickAnim - 16D) / 3D) * (-2D-(-2D)));
            yy = 5D + (((tickAnim - 16D) / 3D) * (-5D-(5D)));
            zz = 0D + (((tickAnim - 16D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2D + (((tickAnim - 19D) / 4D) * (-2D-(-2D)));
            yy = -5D + (((tickAnim - 19D) / 4D) * (5D-(-5D)));
            zz = 0D + (((tickAnim - 19D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -2D + (((tickAnim - 23D) / 3D) * (-2D-(-2D)));
            yy = 5D + (((tickAnim - 23D) / 3D) * (-5D-(5D)));
            zz = 0D + (((tickAnim - 23D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2D + (((tickAnim - 26D) / 4D) * (0D-(-2D)));
            yy = -5D + (((tickAnim - 26D) / 4D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 26D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 33D) / 7D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 11D) / 3D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 25D + (((tickAnim - 14D) / 14D) * (25D-(25D)));
            yy = 0D + (((tickAnim - 14D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 25D + (((tickAnim - 28D) / 2D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaltriovenator entity = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.5D + (((tickAnim - 6D) / 7D) * (2D-(-0.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 2D + (((tickAnim - 13D) / 17D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.5D + (((tickAnim - 33D) / 7D) * (0D-(-0.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.5D + (((tickAnim - 6D) / 7D) * (0D-(-0.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.5D + (((tickAnim - 34D) / 6D) * (0D-(0.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (1.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.5D + (((tickAnim - 6D) / 7D) * (-1D-(1.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -1D + (((tickAnim - 13D) / 17D) * (0D-(-1D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 4D) / 6D) * (7.5D-(5D)));
            yy = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 7.5D + (((tickAnim - 10D) / 13D) * (5D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 5D + (((tickAnim - 23D) / 12D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 23D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (3D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3D + (((tickAnim - 6D) / 2D) * (-1D-(3D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1D + (((tickAnim - 8D) / 4D) * (-0.5D-(-1D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (2D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.5D + (((tickAnim - 12D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 12D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 12D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.5D + (((tickAnim - 15D) / 3D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 15D) / 3D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 15D) / 3D) * (2D-(-2D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.5D + (((tickAnim - 18D) / 4D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 18D) / 4D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 18D) / 4D) * (-2D-(2D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.5D + (((tickAnim - 22D) / 3D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 22D) / 3D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 22D) / 3D) * (2D-(-2D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -0.5D + (((tickAnim - 25D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 25D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 25D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -0.5D + (((tickAnim - 28D) / 4D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 28D) / 4D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 28D) / 4D) * (2D-(-2D)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -0.5D + (((tickAnim - 32D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 32D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 32D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.5D + (((tickAnim - 35D) / 5D) * (0D-(-0.5D)));
            yy = -1D + (((tickAnim - 35D) / 5D) * (0D-(-1D)));
            zz = -2D + (((tickAnim - 35D) / 5D) * (0D-(-2D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSaltriovenator ee = (EntityPrehistoricFloraSaltriovenator) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSaltriovenator e = (EntityPrehistoricFloraSaltriovenator) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
