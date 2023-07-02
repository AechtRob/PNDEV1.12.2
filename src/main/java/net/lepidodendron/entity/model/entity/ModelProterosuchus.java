package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProterosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProterosuchus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodymiddle_r1;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neckbaseunderside_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neckfrontslope_r1;
    private final AdvancedModelRenderer Neckfrontunderside_r1;
    private final AdvancedModelRenderer Neckfront_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Headslopefront_r1;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Rightupperfrontteeth_r1;
    private final AdvancedModelRenderer Rightuppermiddleteeth_r1;
    private final AdvancedModelRenderer Upperjawslope_r1;
    private final AdvancedModelRenderer Upperjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Rightlowerfrontteeth_r1;
    private final AdvancedModelRenderer Rightlowerbackteeth_r1;
    private final AdvancedModelRenderer Lowerjawbackslope_r1;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawbase_r1;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throat_r1;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Masseter_r1;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftupperarm_r1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftlowerarm_r1;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Lefthand_r1;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightupperarm_r1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightlowerarm_r1;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Righthand_r1;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftthigh_r1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftshin_r1;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftankle_r1;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightthigh_r1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightshin_r1;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightankle_r1;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tailmiddlebase_r1;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tailmiddleend_r1;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tailend_r1;

    private ModelAnimator animator;

    public ModelProterosuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -16.0F, 10.0F);
        this.root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 50, 31, -4.0F, -3.0F, -1.0F, 8, 9, 8, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0436F, 0.0F, 0.0F);


        this.Bodymiddle_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0873F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 0, -4.5F, -3.0834F, -14.909F, 9, 11, 15, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 2.0F, -15.0F);
        this.Bodymiddle.addChild(Bodyfront);


        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.2269F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 54, 0, -4.0F, -2.3F, -1.8F, 8, 10, 8, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.4F, -5.7F);
        this.Bodyfront.addChild(Neck1);


        this.Neckbaseunderside_r1 = new AdvancedModelRenderer(this);
        this.Neckbaseunderside_r1.setRotationPoint(0.0F, -4.4F, -4.3F);
        this.Neck1.addChild(Neckbaseunderside_r1);
        this.setRotateAngle(Neckbaseunderside_r1, -0.0873F, 0.0F, 0.0F);
        this.Neckbaseunderside_r1.cubeList.add(new ModelBox(Neckbaseunderside_r1, 19, 69, -2.0F, 5.6F, -0.7F, 4, 2, 6, 0.0F, false));
        this.Neckbaseunderside_r1.cubeList.add(new ModelBox(Neckbaseunderside_r1, 35, 56, -3.0F, 0.1F, -0.7F, 6, 7, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.7F, -4.4F);
        this.Neck1.addChild(Neck2);


        this.Neckfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Neckfrontslope_r1.setRotationPoint(0.0F, -5.0F, -5.9F);
        this.Neck2.addChild(Neckfrontslope_r1);
        this.setRotateAngle(Neckfrontslope_r1, 0.1396F, 0.0F, 0.0F);
        this.Neckfrontslope_r1.cubeList.add(new ModelBox(Neckfrontslope_r1, 83, 52, -1.5F, 0.2F, -2.05F, 3, 3, 2, 0.1F, false));

        this.Neckfrontunderside_r1 = new AdvancedModelRenderer(this);
        this.Neckfrontunderside_r1.setRotationPoint(0.0F, 3.3F, -6.0F);
        this.Neck2.addChild(Neckfrontunderside_r1);
        this.setRotateAngle(Neckfrontunderside_r1, -0.0785F, 0.0F, 0.0F);
        this.Neckfrontunderside_r1.cubeList.add(new ModelBox(Neckfrontunderside_r1, 70, 70, -1.5F, -2.8935F, -1.0302F, 3, 3, 6, -0.001F, false));

        this.Neckfront_r1 = new AdvancedModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -5.0F, -5.9F);
        this.Neck2.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.2094F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 60, 49, -2.0F, 0.0F, 0.0F, 4, 7, 7, -0.07F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.7F, -6.5F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 53, 64, -2.0F, -1.7497F, -6.846F, 4, 4, 7, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 73, 80, -2.0F, -3.2404F, -2.2302F, 4, 3, 3, -0.1F, false));

        this.Headslopefront_r1 = new AdvancedModelRenderer(this);
        this.Headslopefront_r1.setRotationPoint(0.0598F, -1.6168F, -7.4746F);
        this.Head.addChild(Headslopefront_r1);
        this.setRotateAngle(Headslopefront_r1, 0.2967F, 0.0F, 0.0F);
        this.Headslopefront_r1.cubeList.add(new ModelBox(Headslopefront_r1, 40, 70, -1.5598F, 0.038F, -0.4028F, 3, 4, 6, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(-0.0598F, 1.7536F, -13.1906F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 54, 19, -1.4402F, -1.5032F, 2.1528F, 3, 2, 5, 0.001F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 77, 58, 1.196F, -1.0892F, 2.1528F, 0, 2, 6, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 77, 58, -1.0764F, -1.0892F, 2.1528F, 0, 2, 6, 0.0F, true));

        this.Rightupperfrontteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightupperfrontteeth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(Rightupperfrontteeth_r1);
        this.setRotateAngle(Rightupperfrontteeth_r1, 1.2828F, 0.0F, 0.0F);
        this.Rightupperfrontteeth_r1.cubeList.add(new ModelBox(Rightupperfrontteeth_r1, 0, 0, -0.6624F, 0.2664F, -1.7984F, 0, 2, 1, 0.0F, true));
        this.Rightupperfrontteeth_r1.cubeList.add(new ModelBox(Rightupperfrontteeth_r1, 0, 0, 0.782F, 0.2664F, -1.7984F, 0, 2, 1, 0.0F, false));
        this.Rightupperfrontteeth_r1.cubeList.add(new ModelBox(Rightupperfrontteeth_r1, 0, 39, -0.9402F, -0.4053F, -1.7983F, 2, 2, 2, 0.001F, false));

        this.Rightuppermiddleteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightuppermiddleteeth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(Rightuppermiddleteeth_r1);
        this.setRotateAngle(Rightuppermiddleteeth_r1, 1.1257F, 0.0F, 0.0F);
        this.Rightuppermiddleteeth_r1.cubeList.add(new ModelBox(Rightuppermiddleteeth_r1, 11, 0, -0.6624F, 0.5148F, -0.3564F, 0, 2, 1, 0.0F, true));
        this.Rightuppermiddleteeth_r1.cubeList.add(new ModelBox(Rightuppermiddleteeth_r1, 11, 0, 0.782F, 0.5148F, -0.3564F, 0, 2, 1, 0.0F, false));

        this.Upperjawslope_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslope_r1.setRotationPoint(0.1196F, -1.1592F, 2.1528F);
        this.Upperjaw.addChild(Upperjawslope_r1);
        this.setRotateAngle(Upperjawslope_r1, 0.3403F, 0.0F, 0.0F);
        this.Upperjawslope_r1.cubeList.add(new ModelBox(Upperjawslope_r1, 78, 44, -1.0598F, -0.7581F, 0.0001F, 2, 2, 5, 0.001F, false));

        this.Upperjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Upperjawmiddle_r1.setRotationPoint(0.1196F, -1.5732F, 2.1528F);
        this.Upperjaw.addChild(Upperjawmiddle_r1);
        this.setRotateAngle(Upperjawmiddle_r1, 0.6196F, 0.0F, 0.0F);
        this.Upperjawmiddle_r1.cubeList.add(new ModelBox(Upperjawmiddle_r1, 69, 64, -1.0598F, -0.3654F, -2.8086F, 2, 2, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.12F, -0.1432F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0262F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 79, 0, -1.5F, 0.6285F, -8.25F, 3, 2, 4, -0.001F, false));

        this.Rightlowerfrontteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerfrontteeth_r1.setRotationPoint(-0.0598F, 0.044F, -11.3394F);
        this.Lowerjaw.addChild(Rightlowerfrontteeth_r1);
        this.setRotateAngle(Rightlowerfrontteeth_r1, -0.2094F, 0.0F, 0.0F);
        this.Rightlowerfrontteeth_r1.cubeList.add(new ModelBox(Rightlowerfrontteeth_r1, 0, 49, -0.6624F, -0.4442F, -0.0193F, 0, 2, 5, 0.0F, true));
        this.Rightlowerfrontteeth_r1.cubeList.add(new ModelBox(Rightlowerfrontteeth_r1, 0, 49, 0.782F, -0.4442F, -0.0193F, 0, 2, 5, 0.0F, false));

        this.Rightlowerbackteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerbackteeth_r1.setRotationPoint(0.3542F, 0.2096F, -4.7982F);
        this.Lowerjaw.addChild(Rightlowerbackteeth_r1);
        this.setRotateAngle(Rightlowerbackteeth_r1, 0.2443F, 0.0F, 0.0F);
        this.Rightlowerbackteeth_r1.cubeList.add(new ModelBox(Rightlowerbackteeth_r1, 47, 81, -1.0764F, -0.6518F, -3.2391F, 0, 2, 4, 0.0F, true));
        this.Rightlowerbackteeth_r1.cubeList.add(new ModelBox(Rightlowerbackteeth_r1, 47, 81, 0.368F, -0.6518F, -3.2391F, 0, 2, 4, 0.0F, false));
        this.Rightlowerbackteeth_r1.cubeList.add(new ModelBox(Rightlowerbackteeth_r1, 32, 81, -1.8542F, -0.4034F, -3.2391F, 3, 2, 4, 0.0F, false));

        this.Lowerjawbackslope_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbackslope_r1.setRotationPoint(0.0598F, 0.044F, 0.1698F);
        this.Lowerjaw.addChild(Lowerjawbackslope_r1);
        this.setRotateAngle(Lowerjawbackslope_r1, 0.2618F, 0.0F, 0.0F);
        this.Lowerjawbackslope_r1.cubeList.add(new ModelBox(Lowerjawbackslope_r1, 54, 76, -2.0598F, -0.6658F, -4.9682F, 4, 2, 5, -0.001F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0598F, 0.9548F, -8.1102F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, -0.0698F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 34, 7, -1.0598F, -0.4908F, -3.4644F, 2, 2, 5, -0.05F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0598F, 0.044F, 0.1698F);
        this.Lowerjaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, 0.1047F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 75, 28, -2.0598F, -0.758F, -5.0692F, 4, 2, 5, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0598F, 2.2796F, -4.053F);
        this.Lowerjaw.addChild(Throat);


        this.Throat_r1 = new AdvancedModelRenderer(this);
        this.Throat_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throat.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, -0.1222F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 24, 31, -1.5598F, -2.9172F, 0.1656F, 3, 3, 5, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0598F, 0.044F, -4.8302F);
        this.Lowerjaw.addChild(Masseter);


        this.Masseter_r1 = new AdvancedModelRenderer(this);
        this.Masseter_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Masseter.addChild(Masseter_r1);
        this.setRotateAngle(Masseter_r1, 0.0698F, 0.0F, 0.0F);
        this.Masseter_r1.cubeList.add(new ModelBox(Masseter_r1, 71, 19, -2.0598F, -2.6509F, 0.0195F, 4, 3, 5, -0.01F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(3.55F, 4.0F, -5.5F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.4276F, 0.0F, 0.0F);


        this.Leftupperarm_r1 = new AdvancedModelRenderer(this);
        this.Leftupperarm_r1.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.Leftarm1.addChild(Leftupperarm_r1);
        this.setRotateAngle(Leftupperarm_r1, 0.0436F, 0.0F, 0.0F);
        this.Leftupperarm_r1.cubeList.add(new ModelBox(Leftupperarm_r1, 0, 0, -1.3F, -0.7F, -1.3F, 3, 8, 4, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.0F, 7.0F, 1.0F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, 0.1833F, 0.0F, 0.0F);


        this.Leftlowerarm_r1 = new AdvancedModelRenderer(this);
        this.Leftlowerarm_r1.setRotationPoint(0.0F, -0.0587F, 1.31F);
        this.Leftarm2.addChild(Leftlowerarm_r1);
        this.setRotateAngle(Leftlowerarm_r1, -0.8901F, 0.0F, 0.0F);
        this.Leftlowerarm_r1.cubeList.add(new ModelBox(Leftlowerarm_r1, 19, 78, -1.3F, -0.4F, -2.0F, 3, 6, 3, -0.001F, false));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.0F, 2.9413F, -2.69F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, -0.0873F, 0.0F, 0.0F);


        this.Lefthand_r1 = new AdvancedModelRenderer(this);
        this.Lefthand_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftarm3.addChild(Lefthand_r1);
        this.setRotateAngle(Lefthand_r1, 1.0908F, 0.0F, 0.0F);
        this.Lefthand_r1.cubeList.add(new ModelBox(Lefthand_r1, 83, 36, -1.8F, -3.8F, -1.2F, 4, 5, 2, -0.001F, false));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-3.55F, 4.0F, -5.5F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.4276F, 0.0F, 0.0F);


        this.Rightupperarm_r1 = new AdvancedModelRenderer(this);
        this.Rightupperarm_r1.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.Rightarm1.addChild(Rightupperarm_r1);
        this.setRotateAngle(Rightupperarm_r1, 0.0436F, 0.0F, 0.0F);
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 0, 0, -1.7F, -0.7F, -1.3F, 3, 8, 4, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(0.0F, 7.0F, 1.0F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, 0.1833F, 0.0F, 0.0F);


        this.Rightlowerarm_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerarm_r1.setRotationPoint(0.0F, -0.0587F, 1.31F);
        this.Rightarm2.addChild(Rightlowerarm_r1);
        this.setRotateAngle(Rightlowerarm_r1, -0.8901F, 0.0F, 0.0F);
        this.Rightlowerarm_r1.cubeList.add(new ModelBox(Rightlowerarm_r1, 19, 78, -1.7F, -0.4F, -2.0F, 3, 6, 3, -0.001F, true));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(0.0F, 2.9413F, -2.69F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, -0.0873F, 0.0F, 0.0F);


        this.Righthand_r1 = new AdvancedModelRenderer(this);
        this.Righthand_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightarm3.addChild(Righthand_r1);
        this.setRotateAngle(Righthand_r1, 1.0908F, 0.0F, 0.0F);
        this.Righthand_r1.cubeList.add(new ModelBox(Righthand_r1, 83, 36, -2.2F, -3.8F, -1.2F, 4, 5, 2, -0.001F, true));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(4.0F, 1.0F, 2.0F);
        this.Hips.addChild(Leftleg1);


        this.Leftthigh_r1 = new AdvancedModelRenderer(this);
        this.Leftthigh_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftleg1.addChild(Leftthigh_r1);
        this.setRotateAngle(Leftthigh_r1, -0.0934F, -0.185F, -0.1693F);
        this.Leftthigh_r1.cubeList.add(new ModelBox(Leftthigh_r1, 0, 69, -3.1988F, -2.0258F, -2.4527F, 4, 9, 5, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.4912F, 6.0F, -2.2855F);
        this.Leftleg1.addChild(Leftleg2);


        this.Leftshin_r1 = new AdvancedModelRenderer(this);
        this.Leftshin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftleg2.addChild(Leftshin_r1);
        this.setRotateAngle(Leftshin_r1, 0.8717F, 1.5033F, 0.8723F);
        this.Leftshin_r1.cubeList.add(new ModelBox(Leftshin_r1, 0, 27, -3.5F, 0.0F, -2.0F, 4, 8, 3, 0.0F, false));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.5654F, 7.543F, 2.2063F);
        this.Leftleg2.addChild(Leftleg3);


        this.Leftankle_r1 = new AdvancedModelRenderer(this);
        this.Leftankle_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftleg3.addChild(Leftankle_r1);
        this.setRotateAngle(Leftankle_r1, -1.3064F, 1.5567F, -1.2933F);
        this.Leftankle_r1.cubeList.add(new ModelBox(Leftankle_r1, 34, 0, -2.1788F, -0.1255F, -2.0432F, 7, 2, 4, 0.0F, false));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-4.0F, 1.0F, 2.0F);
        this.Hips.addChild(Rightleg1);


        this.Rightthigh_r1 = new AdvancedModelRenderer(this);
        this.Rightthigh_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightleg1.addChild(Rightthigh_r1);
        this.setRotateAngle(Rightthigh_r1, -0.0934F, 0.185F, 0.1693F);
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 0, 69, -0.8012F, -2.0258F, -2.4527F, 4, 9, 5, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-0.4912F, 6.0F, -2.2855F);
        this.Rightleg1.addChild(Rightleg2);


        this.Rightshin_r1 = new AdvancedModelRenderer(this);
        this.Rightshin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightleg2.addChild(Rightshin_r1);
        this.setRotateAngle(Rightshin_r1, 0.8717F, -1.5033F, -0.8723F);
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 0, 27, -0.5F, 0.0F, -2.0F, 4, 8, 3, 0.0F, true));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.5654F, 7.543F, 2.2063F);
        this.Rightleg2.addChild(Rightleg3);


        this.Rightankle_r1 = new AdvancedModelRenderer(this);
        this.Rightankle_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightleg3.addChild(Rightankle_r1);
        this.setRotateAngle(Rightankle_r1, -1.3064F, -1.5567F, 1.2933F);
        this.Rightankle_r1.cubeList.add(new ModelBox(Rightankle_r1, 34, 0, -4.8212F, -0.1255F, -2.0432F, 7, 2, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3F, 7.0F);
        this.Hips.addChild(Tail1);


        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.1309F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 0, 49, -3.0F, -2.9F, -1.5F, 6, 8, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.9F, 8.8F);
        this.Tail1.addChild(Tail2);


        this.Tailmiddlebase_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.Tail2.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.2618F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 27, 35, -2.0F, -1.6F, -0.7F, 4, 6, 14, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 2.9F, 12.2F);
        this.Tail2.addChild(Tail3);


        this.Tailmiddleend_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.2967F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 0, 27, -1.5F, -2.0F, -0.9F, 3, 4, 17, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 4.4F, 15.4F);
        this.Tail3.addChild(Tail4);


        this.Tailend_r1 = new AdvancedModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.1571F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 32, 10, -1.0F, -1.3F, -0.7F, 2, 3, 17, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0436F, 0.0F);
        this.setRotateAngle(Bodymiddle_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2182F, 0.0873F, 0.0F);
        this.setRotateAngle(Headslopefront_r1, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(Leftankle_r1, -1.3064F, 1.5567F, -1.2933F);
        this.setRotateAngle(Leftarm1, 0.6021F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm2, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm3, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthand_r1, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm_r1, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin_r1, 0.8717F, 1.5033F, 0.8723F);
        this.setRotateAngle(Leftthigh_r1, -0.0934F, -0.185F, -0.1693F);
        this.setRotateAngle(Leftupperarm_r1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbackslope_r1, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase_r1, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Masseter_r1, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.1745F, 0.0436F, 0.0F);
        this.setRotateAngle(Neck2, -0.0873F, 0.0873F, -0.0436F);
        this.setRotateAngle(Neckbaseunderside_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfront_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontslope_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontunderside_r1, -0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(Rightankle_r1, -1.3064F, -1.5567F, 1.2933F);
        this.setRotateAngle(Rightarm1, 0.6021F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm2, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm3, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Righthand_r1, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerarm_r1, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerbackteeth_r1, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerfrontteeth_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Rightshin_r1, 0.8717F, -1.5033F, -0.8723F);
        this.setRotateAngle(Rightthigh_r1, -0.0934F, 0.185F, 0.1693F);
        this.setRotateAngle(Rightupperarm_r1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth_r1, 1.2828F, 0.0F, 0.0F);
        this.setRotateAngle(Rightuppermiddleteeth_r1, 1.1257F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail4, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tailbase_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend_r1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddlebase_r1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddleend_r1, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawmiddle_r1, 0.6196F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope_r1, 0.3403F, 0.0F, 0.0F);
        this.Hips.offsetY = 0.13F;
        this.Hips.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Bodyfront_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Headslopefront_r1, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbackslope_r1, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase_r1, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Masseter_r1, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neckbaseunderside_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfront_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontslope_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontunderside_r1, -0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerbackteeth_r1, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerfrontteeth_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperfrontteeth_r1, 1.2828F, 0.0F, 0.0F);
        this.setRotateAngle(Rightuppermiddleteeth_r1, 1.1257F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawmiddle_r1, 0.6196F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope_r1, 0.3403F, 0.0F, 0.0F);
        this.Neck2.offsetZ = 0.05F;
        this.Neck2.render(0.01f);
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

        EntityPrehistoricFloraProterosuchus proteros = (EntityPrehistoricFloraProterosuchus) e;

        this.faceTarget(f3, f4, 10, Neck1);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraProterosuchus ee = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;

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
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            zz = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5)-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5))));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3) + (((tickAnim - 15D) / 25D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3) + (((tickAnim - 40D) / 10D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*-3D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1))*3))));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*2.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5))));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5) + (((tickAnim - 15D) / 25D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 40D) / 10D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5)-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5))));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5)-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75+30))*10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-5))));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/2-60))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 15D) / 25D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*2D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1-30))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3)) + (((tickAnim - 40D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1+30))*-3))));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30) + (((tickAnim - 10D) / 5D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5) + (((tickAnim - 15D) / 25D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*50D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*50) + (((tickAnim - 40D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*50D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*-30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*-30) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*-30D)));
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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5) + (((tickAnim - 15D) / 25D) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-0) + (((tickAnim - 40D) / 10D) * (0D-(30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-0D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 15D) / 25D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*-50D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*-50) + (((tickAnim - 40D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-60))*-50D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5) + (((tickAnim - 15D) / 25D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*-1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*30) + (((tickAnim - 40D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5-120))*30D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5) + (((tickAnim - 15D) / 25D) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/1+30))*1.5D)));
            yy = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-30) + (((tickAnim - 40D) / 10D) * (0D-(30+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/1.5+90))*-30D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*1.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*1.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*15) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*15D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*1.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*1.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*0.75D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-2D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-0.5D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*15) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*15D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*-30D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-12.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*20D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-60))*5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-60))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1))*-5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1))*-5D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+30))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+30))*20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-120))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+30))*20D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*20D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-120))*10) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1-120))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+60))*-5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+60))*-5D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1-60))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1-60))*-20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1-60))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*20) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*20D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-10) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*40D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*40) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*40D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*5) + (((tickAnim - 20D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*-5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+60))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1+120))*5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*-5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1+60))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*360/1+120))*-5D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/1))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5) + (((tickAnim - 20D) / 10D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*720/1))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1) + (((tickAnim - 20D) / 60D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1) + (((tickAnim - 20D) / 60D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 60D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+30))*3D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5) + (((tickAnim - 0D) / 20D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-90))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*5D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5+90))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-90))*1) + (((tickAnim - 20D) / 60D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5-90))*1D)));
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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1D)));
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
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.1D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5) + (((tickAnim - 0D) / 20D) * (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/1))*0.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*360/0.5))*-0.25D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*720/0.5+180))*-0.05D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1) + (((tickAnim - 20D) / 60D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*180/4))*1D)));
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
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




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
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*30) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*10D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-10D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*1) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*0.5D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*30) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-40D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*40D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+60))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+60))*20) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+60))*20D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66-60))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66-60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-20) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-20D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+120))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+120))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66+120))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+60))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+60))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*10D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+120))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.5))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+120))*10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*360/0.66+120))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1))*10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1+120))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*10D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*50D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*50) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*50D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-120))*-5D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*2.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-120))*5D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-20) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-2.5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1D + (((tickAnim - 0D) / 10D) * (1D-(1D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.1) + (((tickAnim - 0D) / 10D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*0.5D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-0.1D)));
            zz = 1D + (((tickAnim - 0D) / 10D) * (1D-(1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1D + (((tickAnim - 10D) / 3D) * (1D-(1D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*0.5) + (((tickAnim - 10D) / 3D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-0.1D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66-60))*0.5D)));
            zz = 1D + (((tickAnim - 10D) / 3D) * (1D-(1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1D + (((tickAnim - 13D) / 7D) * (1D-(1D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-0.1) + (((tickAnim - 13D) / 7D) * (1D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/1-60))*-0.1D)));
            zz = 1D + (((tickAnim - 13D) / 7D) * (1D-(1D)));
        }
        this.Masseter.offsetX = (float) Math.toRadians(xx);
        this.Masseter.offsetY = (float) Math.toRadians(yy);
        this.Masseter.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.66))*20D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75))*2.5), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*5), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*-2.5));
        this.Hips.offsetX = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75-60))*0.5);
        this.Hips.offsetY = (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75))*-0.5);
        this.Hips.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75+60))*1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 60D + (((tickAnim - 0D) / 5D) * (60D-(60D)));
            yy = 5D + (((tickAnim - 0D) / 5D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 60D + (((tickAnim - 5D) / 2D) * (37.5D-(60D)));
            yy = 5D + (((tickAnim - 5D) / 2D) * (2.5D-(5D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 37.5D + (((tickAnim - 7D) / 1D) * (-5D-(37.5D)));
            yy = 2.5D + (((tickAnim - 7D) / 1D) * (10D-(2.5D)));
            zz = 2.5D + (((tickAnim - 7D) / 1D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5D + (((tickAnim - 8D) / 1D) * (22.5D-(-5D)));
            yy = 10D + (((tickAnim - 8D) / 1D) * (5D-(10D)));
            zz = 5D + (((tickAnim - 8D) / 1D) * (7.5D-(5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 9D) / 1D) * (15D-(22.5D)));
            yy = 5D + (((tickAnim - 9D) / 1D) * (5D-(5D)));
            zz = 7.5D + (((tickAnim - 9D) / 1D) * (0D-(7.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 10D) / 3D) * (30D-(15D)));
            yy = 5D + (((tickAnim - 10D) / 3D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 30D + (((tickAnim - 13D) / 2D) * (60D-(30D)));
            yy = 5D + (((tickAnim - 13D) / 2D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2) + (((tickAnim - 8D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.5D + (((tickAnim - 0D) / 5D) * (-42.5D-(2.5D)));
            yy = -5D + (((tickAnim - 0D) / 5D) * (5D-(-5D)));
            zz = 25D + (((tickAnim - 0D) / 5D) * (32.5D-(25D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -42.5D + (((tickAnim - 5D) / 2D) * (-45D-(-42.5D)));
            yy = 5D + (((tickAnim - 5D) / 2D) * (7.5D-(5D)));
            zz = 32.5D + (((tickAnim - 5D) / 2D) * (15D-(32.5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45D + (((tickAnim - 7D) / 1D) * (-20D-(-45D)));
            yy = 7.5D + (((tickAnim - 7D) / 1D) * (0D-(7.5D)));
            zz = 15D + (((tickAnim - 7D) / 1D) * (7.5D-(15D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20D + (((tickAnim - 8D) / 1D) * (-7.5D-(-20D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (-2.5D-(0D)));
            zz = 7.5D + (((tickAnim - 8D) / 1D) * (2.5D-(7.5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -7.5D + (((tickAnim - 9D) / 1D) * (20D-(-7.5D)));
            yy = -2.5D + (((tickAnim - 9D) / 1D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 9D) / 1D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20D + (((tickAnim - 10D) / 3D) * (25D-(20D)));
            yy = -2.5D + (((tickAnim - 10D) / 3D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25D + (((tickAnim - 13D) / 2D) * (2.5D-(25D)));
            yy = -2.5D + (((tickAnim - 13D) / 2D) * (-5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 2D) * (25D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4) + (((tickAnim - 8D) / 1D) * (0D-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20D + (((tickAnim - 0D) / 2D) * (-7.5D-(-20D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (2.5D-(0D)));
            zz = -7.5D + (((tickAnim - 0D) / 2D) * (-2.5D-(-7.5D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.5D + (((tickAnim - 2D) / 1D) * (20D-(-7.5D)));
            yy = 2.5D + (((tickAnim - 2D) / 1D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 2D) / 1D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20D + (((tickAnim - 3D) / 2D) * (25D-(20D)));
            yy = 2.5D + (((tickAnim - 3D) / 2D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 3D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25D + (((tickAnim - 5D) / 3D) * (2.5D-(25D)));
            yy = 2.5D + (((tickAnim - 5D) / 3D) * (5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 5D) / 3D) * (-25D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5D + (((tickAnim - 8D) / 5D) * (-42.5D-(2.5D)));
            yy = 5D + (((tickAnim - 8D) / 5D) * (-5D-(5D)));
            zz = -25D + (((tickAnim - 8D) / 5D) * (-32.5D-(-25D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -42.5D + (((tickAnim - 13D) / 1D) * (-45D-(-42.5D)));
            yy = -5D + (((tickAnim - 13D) / 1D) * (-7.5D-(-5D)));
            zz = -32.5D + (((tickAnim - 13D) / 1D) * (-15D-(-32.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -45D + (((tickAnim - 14D) / 1D) * (-20D-(-45D)));
            yy = -7.5D + (((tickAnim - 14D) / 1D) * (0D-(-7.5D)));
            zz = -15D + (((tickAnim - 14D) / 1D) * (-7.5D-(-15D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4) + (((tickAnim - 1D) / 1D) * (0D-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*0.4D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5D + (((tickAnim - 0D) / 2D) * (22.5D-(-5D)));
            yy = -10D + (((tickAnim - 0D) / 2D) * (-5D-(-10D)));
            zz = -5D + (((tickAnim - 0D) / 2D) * (-7.5D-(-5D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.5D + (((tickAnim - 2D) / 1D) * (15D-(22.5D)));
            yy = -5D + (((tickAnim - 2D) / 1D) * (-5D-(-5D)));
            zz = -7.5D + (((tickAnim - 2D) / 1D) * (0D-(-7.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 15D + (((tickAnim - 3D) / 2D) * (30D-(15D)));
            yy = -5D + (((tickAnim - 3D) / 2D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30D + (((tickAnim - 5D) / 3D) * (60D-(30D)));
            yy = -5D + (((tickAnim - 5D) / 3D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 60D + (((tickAnim - 8D) / 5D) * (60D-(60D)));
            yy = -5D + (((tickAnim - 8D) / 5D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 60D + (((tickAnim - 13D) / 1D) * (37.5D-(60D)));
            yy = -5D + (((tickAnim - 13D) / 1D) * (-2.5D-(-5D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 37.5D + (((tickAnim - 14D) / 1D) * (-5D-(37.5D)));
            yy = -2.5D + (((tickAnim - 14D) / 1D) * (-10D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 14D) / 1D) * (-5D-(-2.5D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2) + (((tickAnim - 1D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.5D + (((tickAnim - 0D) / 2D) * (-12.5D-(27.5D)));
            yy = 7.5D + (((tickAnim - 0D) / 2D) * (2.5D-(7.5D)));
            zz = 12.5D + (((tickAnim - 0D) / 2D) * (7.5D-(12.5D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.5D + (((tickAnim - 2D) / 1D) * (-7.5D-(-12.5D)));
            yy = 2.5D + (((tickAnim - 2D) / 1D) * (2.5D-(2.5D)));
            zz = 7.5D + (((tickAnim - 2D) / 1D) * (2.5D-(7.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.5D + (((tickAnim - 3D) / 2D) * (32.5D-(-7.5D)));
            yy = 2.5D + (((tickAnim - 3D) / 2D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 3D) / 2D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5D + (((tickAnim - 5D) / 3D) * (40D-(32.5D)));
            yy = 2.5D + (((tickAnim - 5D) / 3D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 5D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40D + (((tickAnim - 8D) / 5D) * (17.5D-(40D)));
            yy = 2.5D + (((tickAnim - 8D) / 5D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 8D) / 5D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 17.5D + (((tickAnim - 13D) / 1D) * (10D-(17.5D)));
            yy = 2.5D + (((tickAnim - 13D) / 1D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 1D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 10D + (((tickAnim - 14D) / 1D) * (27.5D-(10D)));
            yy = 2.5D + (((tickAnim - 14D) / 1D) * (7.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 14D) / 1D) * (12.5D-(2.5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2) + (((tickAnim - 1D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 40D + (((tickAnim - 0D) / 5D) * (17.5D-(40D)));
            yy = -2.5D + (((tickAnim - 0D) / 5D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 5D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 17.5D + (((tickAnim - 5D) / 2D) * (10D-(17.5D)));
            yy = -2.5D + (((tickAnim - 5D) / 2D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 5D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10D + (((tickAnim - 7D) / 1D) * (27.5D-(10D)));
            yy = -2.5D + (((tickAnim - 7D) / 1D) * (-7.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 7D) / 1D) * (-12.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27.5D + (((tickAnim - 8D) / 1D) * (-12.5D-(27.5D)));
            yy = -7.5D + (((tickAnim - 8D) / 1D) * (-2.5D-(-7.5D)));
            zz = -12.5D + (((tickAnim - 8D) / 1D) * (-7.5D-(-12.5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -12.5D + (((tickAnim - 9D) / 1D) * (-7.5D-(-12.5D)));
            yy = -2.5D + (((tickAnim - 9D) / 1D) * (-2.5D-(-2.5D)));
            zz = -7.5D + (((tickAnim - 9D) / 1D) * (-2.5D-(-7.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5D + (((tickAnim - 10D) / 3D) * (32.5D-(-7.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 3D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5D + (((tickAnim - 13D) / 2D) * (40D-(32.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 2D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 13D) / 2D) * (-2.5D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2) + (((tickAnim - 8D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.25))*-0.2D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75-60))*-2.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+30))*-5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+30))*2.5));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75+60))*-2.5), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*-10), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*2.5));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75+60))*-2.5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+150))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+150))*2.5));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75+90))*2.5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+210))*-10), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+210))*2.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(10), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+90))*5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+90))*2.5));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75))*-2), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5D + (((tickAnim - 0D) / 3D) * (42.5D-(27.5D)));
            yy = 10D + (((tickAnim - 0D) / 3D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-10D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 42.5D + (((tickAnim - 3D) / 3D) * (22.5D-(42.5D)));
            yy = 10D + (((tickAnim - 3D) / 3D) * (22.5D-(10D)));
            zz = -10D + (((tickAnim - 3D) / 3D) * (-20D-(-10D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.5D + (((tickAnim - 6D) / 2D) * (-30D-(22.5D)));
            yy = 22.5D + (((tickAnim - 6D) / 2D) * (22.5D-(22.5D)));
            zz = -20D + (((tickAnim - 6D) / 2D) * (-25D-(-20D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -30D + (((tickAnim - 8D) / 0D) * (-52.5D-(-30D)));
            yy = 22.5D + (((tickAnim - 8D) / 0D) * (-12.5D-(22.5D)));
            zz = -25D + (((tickAnim - 8D) / 0D) * (-15D-(-25D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -52.5D + (((tickAnim - 8D) / 3D) * (-5D-(-52.5D)));
            yy = -12.5D + (((tickAnim - 8D) / 3D) * (0D-(-12.5D)));
            zz = -15D + (((tickAnim - 8D) / 3D) * (-15D-(-15D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 11D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (5D-(0D)));
            zz = -15D + (((tickAnim - 11D) / 2D) * (-5D-(-15D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10D + (((tickAnim - 13D) / 2D) * (27.5D-(10D)));
            yy = 5D + (((tickAnim - 13D) / 2D) * (10D-(5D)));
            zz = -5D + (((tickAnim - 13D) / 2D) * (0D-(-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 8D) / 3D) * (0D-(0.5D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5D + (((tickAnim - 0D) / 3D) * (-2.5D-(27.5D)));
            yy = -7.5D + (((tickAnim - 0D) / 3D) * (-10D-(-7.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.5D + (((tickAnim - 3D) / 3D) * (-55D-(-2.5D)));
            yy = -10D + (((tickAnim - 3D) / 3D) * (-15D-(-10D)));
            zz = 2.5D + (((tickAnim - 3D) / 3D) * (15D-(2.5D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -55D + (((tickAnim - 6D) / 2D) * (-37.5D-(-55D)));
            yy = -15D + (((tickAnim - 6D) / 2D) * (-22.5D-(-15D)));
            zz = 15D + (((tickAnim - 6D) / 2D) * (15D-(15D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -37.5D + (((tickAnim - 8D) / 0D) * (17.5D-(-37.5D)));
            yy = -22.5D + (((tickAnim - 8D) / 0D) * (-10D-(-22.5D)));
            zz = 15D + (((tickAnim - 8D) / 0D) * (10D-(15D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.5D + (((tickAnim - 8D) / 3D) * (-30D-(17.5D)));
            yy = -10D + (((tickAnim - 8D) / 3D) * (0D-(-10D)));
            zz = 10D + (((tickAnim - 8D) / 3D) * (10D-(10D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -30D + (((tickAnim - 11D) / 2D) * (20D-(-30D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 11D) / 2D) * (0D-(10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 20D + (((tickAnim - 13D) / 2D) * (27.5D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (-7.5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (50D-(5D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 50D + (((tickAnim - 3D) / 3D) * (32.5D-(50D)));
            yy = 2.5D + (((tickAnim - 3D) / 3D) * (2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 3D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32.5D + (((tickAnim - 6D) / 2D) * (36D-(32.5D)));
            yy = 2.5D + (((tickAnim - 6D) / 2D) * (2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 6D) / 2D) * (5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 36D + (((tickAnim - 8D) / 0D) * (37.5D-(36D)));
            yy = 2.5D + (((tickAnim - 8D) / 0D) * (17.5D-(2.5D)));
            zz = 5D + (((tickAnim - 8D) / 0D) * (0D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 37.5D + (((tickAnim - 8D) / 3D) * (35D-(37.5D)));
            yy = 17.5D + (((tickAnim - 8D) / 3D) * (2.5D-(17.5D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (5D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 35D + (((tickAnim - 11D) / 2D) * (-30D-(35D)));
            yy = 2.5D + (((tickAnim - 11D) / 2D) * (2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 11D) / 2D) * (5D-(5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30D + (((tickAnim - 13D) / 2D) * (5D-(-30D)));
            yy = 2.5D + (((tickAnim - 13D) / 2D) * (5D-(2.5D)));
            zz = 5D + (((tickAnim - 13D) / 2D) * (5D-(5D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm3.offsetX = (float) Math.toRadians(xx);
        this.Leftarm3.offsetY = (float) Math.toRadians(yy);
        this.Leftarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -30D + (((tickAnim - 0D) / 1D) * (-52.5D-(-30D)));
            yy = -22.5D + (((tickAnim - 0D) / 1D) * (12.5D-(-22.5D)));
            zz = 25D + (((tickAnim - 0D) / 1D) * (15D-(25D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -52.5D + (((tickAnim - 1D) / 2D) * (-5D-(-52.5D)));
            yy = 12.5D + (((tickAnim - 1D) / 2D) * (0D-(12.5D)));
            zz = 15D + (((tickAnim - 1D) / 2D) * (15D-(15D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5D + (((tickAnim - 3D) / 2D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (-5D-(0D)));
            zz = 15D + (((tickAnim - 3D) / 2D) * (5D-(15D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10D + (((tickAnim - 5D) / 3D) * (27.5D-(10D)));
            yy = -5D + (((tickAnim - 5D) / 3D) * (-10D-(-5D)));
            zz = 5D + (((tickAnim - 5D) / 3D) * (0D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5D + (((tickAnim - 8D) / 3D) * (42.5D-(27.5D)));
            yy = -10D + (((tickAnim - 8D) / 3D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (10D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 42.5D + (((tickAnim - 11D) / 2D) * (22.5D-(42.5D)));
            yy = -10D + (((tickAnim - 11D) / 2D) * (-22.5D-(-10D)));
            zz = 10D + (((tickAnim - 11D) / 2D) * (20D-(10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.5D + (((tickAnim - 13D) / 2D) * (-30D-(22.5D)));
            yy = -22.5D + (((tickAnim - 13D) / 2D) * (-22.5D-(-22.5D)));
            zz = 20D + (((tickAnim - 13D) / 2D) * (25D-(20D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 1D) / 2D) * (0D-(0.5D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3) + (((tickAnim - 4D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -37.5D + (((tickAnim - 0D) / 1D) * (17.5D-(-37.5D)));
            yy = 22.5D + (((tickAnim - 0D) / 1D) * (10D-(22.5D)));
            zz = -15D + (((tickAnim - 0D) / 1D) * (-10D-(-15D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 17.5D + (((tickAnim - 1D) / 2D) * (-30D-(17.5D)));
            yy = 10D + (((tickAnim - 1D) / 2D) * (0D-(10D)));
            zz = -10D + (((tickAnim - 1D) / 2D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -30D + (((tickAnim - 3D) / 2D) * (20D-(-30D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 3D) / 2D) * (0D-(-10D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20D + (((tickAnim - 5D) / 3D) * (27.5D-(20D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (7.5D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5D + (((tickAnim - 8D) / 3D) * (-2.5D-(27.5D)));
            yy = 7.5D + (((tickAnim - 8D) / 3D) * (10D-(7.5D)));
            zz = -2.5D + (((tickAnim - 8D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 11D) / 2D) * (-55D-(-2.5D)));
            yy = 10D + (((tickAnim - 11D) / 2D) * (15D-(10D)));
            zz = -2.5D + (((tickAnim - 11D) / 2D) * (-15D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -55D + (((tickAnim - 13D) / 2D) * (-37.5D-(-55D)));
            yy = 15D + (((tickAnim - 13D) / 2D) * (22.5D-(15D)));
            zz = -15D + (((tickAnim - 13D) / 2D) * (-15D-(-15D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15) + (((tickAnim - 4D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 36D + (((tickAnim - 0D) / 1D) * (37.5D-(36D)));
            yy = -2.5D + (((tickAnim - 0D) / 1D) * (-17.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 0D) / 1D) * (0D-(-5D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 37.5D + (((tickAnim - 1D) / 2D) * (35D-(37.5D)));
            yy = -17.5D + (((tickAnim - 1D) / 2D) * (-2.5D-(-17.5D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (-5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 35D + (((tickAnim - 3D) / 2D) * (-30D-(35D)));
            yy = -2.5D + (((tickAnim - 3D) / 2D) * (-2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 3D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30D + (((tickAnim - 5D) / 3D) * (5D-(-30D)));
            yy = -2.5D + (((tickAnim - 5D) / 3D) * (-5D-(-2.5D)));
            zz = -5D + (((tickAnim - 5D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5D + (((tickAnim - 8D) / 3D) * (50D-(5D)));
            yy = -5D + (((tickAnim - 8D) / 3D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 8D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 50D + (((tickAnim - 11D) / 2D) * (32.5D-(50D)));
            yy = -2.5D + (((tickAnim - 11D) / 2D) * (-2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 11D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5D + (((tickAnim - 13D) / 2D) * (36D-(32.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 2D) * (-2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 13D) / 2D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15) + (((tickAnim - 4D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/15D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm3.offsetX = (float) Math.toRadians(xx);
        this.Rightarm3.offsetY = (float) Math.toRadians(yy);
        this.Rightarm3.offsetZ = (float) Math.toRadians(zz);
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75))*-2.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*-10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75+60))*2.5));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75-60))*-2.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75))*-15), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75))*2.5));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*720/0.75-120))*-2.5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75-30))*-20), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/15D)*0.75D)*360/0.75-30))*2.5));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-90))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-30))*5), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-30))*-3));
        this.Hips.offsetX = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+60))*0.5);
        this.Hips.offsetY = (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-30))*-0.25);
        this.Hips.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360))*1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25D + (((tickAnim - 0D) / 5D) * (37.5D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (10D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37.5D + (((tickAnim - 5D) / 5D) * (47.5D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (5D-(0D)));
            zz = 10D + (((tickAnim - 5D) / 5D) * (10D-(10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 47.5D + (((tickAnim - 10D) / 4D) * (57.5D-(47.5D)));
            yy = 5D + (((tickAnim - 10D) / 4D) * (-5D-(5D)));
            zz = 10D + (((tickAnim - 10D) / 4D) * (10D-(10D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 57.5D + (((tickAnim - 14D) / 4D) * (35D-(57.5D)));
            yy = -5D + (((tickAnim - 14D) / 4D) * (0D-(-5D)));
            zz = 10D + (((tickAnim - 14D) / 4D) * (0D-(10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35D + (((tickAnim - 18D) / 2D) * (7.5D-(35D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 7.5D + (((tickAnim - 20D) / 7D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 12.5D + (((tickAnim - 27D) / 6D) * (17.5D-(12.5D)));
            yy = -2.5D + (((tickAnim - 27D) / 6D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 27D) / 6D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.5D + (((tickAnim - 33D) / 7D) * (25D-(17.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 23D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 30D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.5D + (((tickAnim - 0D) / 5D) * (20D-(27.5D)));
            yy = -5D + (((tickAnim - 0D) / 5D) * (-5D-(-5D)));
            zz = 5D + (((tickAnim - 0D) / 5D) * (10D-(5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20D + (((tickAnim - 5D) / 5D) * (0D-(20D)));
            yy = -5D + (((tickAnim - 5D) / 5D) * (-10D-(-5D)));
            zz = 10D + (((tickAnim - 5D) / 5D) * (10D-(10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (-25D-(0D)));
            yy = -10D + (((tickAnim - 10D) / 4D) * (0D-(-10D)));
            zz = 10D + (((tickAnim - 10D) / 4D) * (10D-(10D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -25D + (((tickAnim - 14D) / 4D) * (-40D-(-25D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (10D-(0D)));
            zz = 10D + (((tickAnim - 14D) / 4D) * (10D-(10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -40D + (((tickAnim - 18D) / 2D) * (-27.5D-(-40D)));
            yy = 10D + (((tickAnim - 18D) / 2D) * (5D-(10D)));
            zz = 10D + (((tickAnim - 18D) / 2D) * (5D-(10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.5D + (((tickAnim - 20D) / 7D) * (5D-(-27.5D)));
            yy = 5D + (((tickAnim - 20D) / 7D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 20D) / 7D) * (5D-(5D)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 5D + (((tickAnim - 27D) / 6D) * (22.5D-(5D)));
            yy = 5D + (((tickAnim - 27D) / 6D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 27D) / 6D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 22.5D + (((tickAnim - 33D) / 7D) * (27.5D-(22.5D)));
            yy = 2.5D + (((tickAnim - 33D) / 7D) * (-5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 33D) / 7D) * (5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0.5D-(0D)));
            zz = 1D + (((tickAnim - 0D) / 5D) * (0D-(1D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 5D) / 5D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 10D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 14D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 18D) / 2D) * (-0.5D-(1D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 20D) / 3D) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D-(-0.5D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = 0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3) + (((tickAnim - 23D) / 4D) * (0D-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3) + (((tickAnim - 30D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (1D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.5D + (((tickAnim - 0D) / 7D) * (5D-(-27.5D)));
            yy = -5D + (((tickAnim - 0D) / 7D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 7D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 5D + (((tickAnim - 7D) / 6D) * (22.5D-(5D)));
            yy = -5D + (((tickAnim - 7D) / 6D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 7D) / 6D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 13D) / 7D) * (27.5D-(22.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 7D) * (5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 13D) / 7D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 27.5D + (((tickAnim - 20D) / 5D) * (20D-(27.5D)));
            yy = 5D + (((tickAnim - 20D) / 5D) * (5D-(5D)));
            zz = -5D + (((tickAnim - 20D) / 5D) * (-10D-(-5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20D + (((tickAnim - 25D) / 5D) * (0D-(20D)));
            yy = 5D + (((tickAnim - 25D) / 5D) * (10D-(5D)));
            zz = -10D + (((tickAnim - 25D) / 5D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (-25D-(0D)));
            yy = 10D + (((tickAnim - 30D) / 4D) * (0D-(10D)));
            zz = -10D + (((tickAnim - 30D) / 4D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -25D + (((tickAnim - 34D) / 4D) * (-40D-(-25D)));
            yy = 0D + (((tickAnim - 34D) / 4D) * (-10D-(0D)));
            zz = -10D + (((tickAnim - 34D) / 4D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -40D + (((tickAnim - 38D) / 2D) * (-27.5D-(-40D)));
            yy = -10D + (((tickAnim - 38D) / 2D) * (-5D-(-10D)));
            zz = -10D + (((tickAnim - 38D) / 2D) * (-5D-(-10D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 0D) / 3D) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D-(-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = 0.25+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3) + (((tickAnim - 3D) / 4D) * (0D-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3) + (((tickAnim - 10D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (1D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0.5D-(0D)));
            zz = 1D + (((tickAnim - 20D) / 5D) * (0D-(1D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 25D) / 5D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 30D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 34D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 34D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 34D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 38D) / 2D) * (-0.5D-(1D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7.5D + (((tickAnim - 0D) / 7D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 7D) / 6D) * (17.5D-(12.5D)));
            yy = 2.5D + (((tickAnim - 7D) / 6D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 7D) / 6D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.5D + (((tickAnim - 13D) / 7D) * (25D-(17.5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25D + (((tickAnim - 20D) / 5D) * (37.5D-(25D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (-10D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 37.5D + (((tickAnim - 25D) / 5D) * (47.5D-(37.5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (-5D-(0D)));
            zz = -10D + (((tickAnim - 25D) / 5D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 47.5D + (((tickAnim - 30D) / 4D) * (57.5D-(47.5D)));
            yy = -5D + (((tickAnim - 30D) / 4D) * (5D-(-5D)));
            zz = -10D + (((tickAnim - 30D) / 4D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 57.5D + (((tickAnim - 34D) / 4D) * (35D-(57.5D)));
            yy = 5D + (((tickAnim - 34D) / 4D) * (0D-(5D)));
            zz = -10D + (((tickAnim - 34D) / 4D) * (0D-(-10D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 35D + (((tickAnim - 38D) / 2D) * (7.5D-(35D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 3D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 10D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 20D + (((tickAnim - 0D) / 7D) * (-17.5D-(20D)));
            yy = 5D + (((tickAnim - 0D) / 7D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 7D) * (0D-(5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -17.5D + (((tickAnim - 7D) / 6D) * (0D-(-17.5D)));
            yy = 0D + (((tickAnim - 7D) / 6D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 13D) / 7D) * (70D-(0D)));
            yy = 2.5D + (((tickAnim - 13D) / 7D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 7D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 70D + (((tickAnim - 20D) / 5D) * (35D-(70D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (5D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 35D + (((tickAnim - 25D) / 5D) * (30D-(35D)));
            yy = 5D + (((tickAnim - 25D) / 5D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 25D) / 5D) * (5D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 30D + (((tickAnim - 30D) / 4D) * (15D-(30D)));
            yy = 5D + (((tickAnim - 30D) / 4D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 30D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 15D + (((tickAnim - 34D) / 4D) * (12.5D-(15D)));
            yy = 5D + (((tickAnim - 34D) / 4D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 34D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 12.5D + (((tickAnim - 38D) / 2D) * (20D-(12.5D)));
            yy = 5D + (((tickAnim - 38D) / 2D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 38D) / 2D) * (5D-(5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 3D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 10D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 27D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 70D + (((tickAnim - 0D) / 5D) * (35D-(70D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (-5D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 35D + (((tickAnim - 5D) / 5D) * (30D-(35D)));
            yy = -5D + (((tickAnim - 5D) / 5D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 5D) / 5D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 30D + (((tickAnim - 10D) / 4D) * (15D-(30D)));
            yy = -5D + (((tickAnim - 10D) / 4D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 10D) / 4D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15D + (((tickAnim - 14D) / 4D) * (12.5D-(15D)));
            yy = -5D + (((tickAnim - 14D) / 4D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 14D) / 4D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5D + (((tickAnim - 18D) / 2D) * (20D-(12.5D)));
            yy = -5D + (((tickAnim - 18D) / 2D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 20D + (((tickAnim - 20D) / 7D) * (-17.5D-(20D)));
            yy = -5D + (((tickAnim - 20D) / 7D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 20D) / 7D) * (0D-(-5D)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -17.5D + (((tickAnim - 27D) / 6D) * (0D-(-17.5D)));
            yy = 0D + (((tickAnim - 27D) / 6D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 6D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 33D) / 7D) * (70D-(0D)));
            yy = -2.5D + (((tickAnim - 33D) / 7D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 33D) / 7D) * (0D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 23D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 30D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-120))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-90))*-5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-90))*3));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-60))*-3), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+15))*-5), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+15))*3));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360+30))*-3), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+30))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+30))*3));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360+120))*-3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+120))*-7.5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+120))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360+60))*3), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+60))*7.5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+60))*-3));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-1), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 32.5D + (((tickAnim - 0D) / 7D) * (47.5D-(32.5D)));
            yy = 5D + (((tickAnim - 0D) / 7D) * (20D-(5D)));
            zz = -10D + (((tickAnim - 0D) / 7D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 47.5D + (((tickAnim - 7D) / 5D) * (40D-(47.5D)));
            yy = 20D + (((tickAnim - 7D) / 5D) * (20D-(20D)));
            zz = -10D + (((tickAnim - 7D) / 5D) * (-15D-(-10D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 40D + (((tickAnim - 12D) / 4D) * (5D-(40D)));
            yy = 20D + (((tickAnim - 12D) / 4D) * (20D-(20D)));
            zz = -15D + (((tickAnim - 12D) / 4D) * (-20D-(-15D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 16D) / 4D) * (-42.5D-(5D)));
            yy = 20D + (((tickAnim - 16D) / 4D) * (10D-(20D)));
            zz = -20D + (((tickAnim - 16D) / 4D) * (-20D-(-20D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -42.5D + (((tickAnim - 20D) / 3D) * (-52.5D-(-42.5D)));
            yy = 10D + (((tickAnim - 20D) / 3D) * (0D-(10D)));
            zz = -20D + (((tickAnim - 20D) / 3D) * (-15D-(-20D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -52.5D + (((tickAnim - 23D) / 7D) * (-10D-(-52.5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (-10D-(0D)));
            zz = -15D + (((tickAnim - 23D) / 7D) * (-10D-(-15D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -10D + (((tickAnim - 30D) / 7D) * (22.5D-(-10D)));
            yy = -10D + (((tickAnim - 30D) / 7D) * (0D-(-10D)));
            zz = -10D + (((tickAnim - 30D) / 7D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 22.5D + (((tickAnim - 37D) / 3D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 37D) / 3D) * (5D-(0D)));
            zz = -10D + (((tickAnim - 37D) / 3D) * (-10D-(-10D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 7D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 5D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 12D) / 4D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 16D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 20D) / 3D) * (-0.5D-(1D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 23D) / 4D) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D-(-0.5D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = 0.75+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3) + (((tickAnim - 27D) / 3D) * (0.75D-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = 0.75D + (((tickAnim - 30D) / 3D) * (0.38+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D-(0.75D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
            yy = 0.38+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3) + (((tickAnim - 33D) / 4D) * (-1D-(0.38+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 37D) / 3D) * (-1D-(-1D)));
            zz = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25D + (((tickAnim - 0D) / 7D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -7.5D + (((tickAnim - 7D) / 5D) * (-32.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 7D) / 5D) * (-10D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -32.5D + (((tickAnim - 12D) / 4D) * (-35D-(-32.5D)));
            yy = -10D + (((tickAnim - 12D) / 4D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -35D + (((tickAnim - 16D) / 4D) * (-17.5D-(-35D)));
            yy = -10D + (((tickAnim - 16D) / 4D) * (-10D-(-10D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (-10D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -17.5D + (((tickAnim - 20D) / 3D) * (7.5D-(-17.5D)));
            yy = -10D + (((tickAnim - 20D) / 3D) * (0D-(-10D)));
            zz = -10D + (((tickAnim - 20D) / 3D) * (5D-(-10D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7.5D + (((tickAnim - 23D) / 7D) * (-10D-(7.5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 23D) / 7D) * (-2.5D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -10D + (((tickAnim - 30D) / 7D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 30D) / 7D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 7.5D + (((tickAnim - 37D) / 3D) * (25D-(7.5D)));
            yy = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 27D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 33D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 30D + (((tickAnim - 0D) / 7D) * (77.5D-(30D)));
            yy = 10D + (((tickAnim - 0D) / 7D) * (5D-(10D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (10D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 77.5D + (((tickAnim - 7D) / 5D) * (100D-(77.5D)));
            yy = 5D + (((tickAnim - 7D) / 5D) * (-10D-(5D)));
            zz = 10D + (((tickAnim - 7D) / 5D) * (20D-(10D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 100D + (((tickAnim - 12D) / 4D) * (57.5D-(100D)));
            yy = -10D + (((tickAnim - 12D) / 4D) * (-10D-(-10D)));
            zz = 20D + (((tickAnim - 12D) / 4D) * (20D-(20D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 57.5D + (((tickAnim - 16D) / 4D) * (57.5D-(57.5D)));
            yy = -10D + (((tickAnim - 16D) / 4D) * (-10D-(-10D)));
            zz = 20D + (((tickAnim - 16D) / 4D) * (30D-(20D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 57.5D + (((tickAnim - 20D) / 3D) * (45D-(57.5D)));
            yy = -10D + (((tickAnim - 20D) / 3D) * (0D-(-10D)));
            zz = 30D + (((tickAnim - 20D) / 3D) * (10D-(30D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 45D + (((tickAnim - 23D) / 7D) * (20D-(45D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (10D-(0D)));
            zz = 10D + (((tickAnim - 23D) / 7D) * (10D-(10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 20D + (((tickAnim - 30D) / 7D) * (-7.5D-(20D)));
            yy = 10D + (((tickAnim - 30D) / 7D) * (5D-(10D)));
            zz = 10D + (((tickAnim - 30D) / 7D) * (10D-(10D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -7.5D + (((tickAnim - 37D) / 3D) * (30D-(-7.5D)));
            yy = 5D + (((tickAnim - 37D) / 3D) * (10D-(5D)));
            zz = 10D + (((tickAnim - 37D) / 3D) * (0D-(10D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 27D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 33D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 33D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm3.offsetX = (float) Math.toRadians(xx);
        this.Leftarm3.offsetY = (float) Math.toRadians(yy);
        this.Leftarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -42.5D + (((tickAnim - 0D) / 3D) * (-52.5D-(-42.5D)));
            yy = -10D + (((tickAnim - 0D) / 3D) * (0D-(-10D)));
            zz = 20D + (((tickAnim - 0D) / 3D) * (15D-(20D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -52.5D + (((tickAnim - 3D) / 7D) * (-10D-(-52.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (10D-(0D)));
            zz = 15D + (((tickAnim - 3D) / 7D) * (10D-(15D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -10D + (((tickAnim - 10D) / 7D) * (22.5D-(-10D)));
            yy = 10D + (((tickAnim - 10D) / 7D) * (0D-(10D)));
            zz = 10D + (((tickAnim - 10D) / 7D) * (10D-(10D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 17D) / 3D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (-5D-(0D)));
            zz = 10D + (((tickAnim - 17D) / 3D) * (10D-(10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 32.5D + (((tickAnim - 20D) / 7D) * (47.5D-(32.5D)));
            yy = -5D + (((tickAnim - 20D) / 7D) * (-20D-(-5D)));
            zz = 10D + (((tickAnim - 20D) / 7D) * (10D-(10D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 47.5D + (((tickAnim - 27D) / 5D) * (40D-(47.5D)));
            yy = -20D + (((tickAnim - 27D) / 5D) * (-20D-(-20D)));
            zz = 10D + (((tickAnim - 27D) / 5D) * (15D-(10D)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 40D + (((tickAnim - 32D) / 4D) * (5D-(40D)));
            yy = -20D + (((tickAnim - 32D) / 4D) * (-20D-(-20D)));
            zz = 15D + (((tickAnim - 32D) / 4D) * (20D-(15D)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 36D) / 4D) * (-42.5D-(5D)));
            yy = -20D + (((tickAnim - 36D) / 4D) * (-10D-(-20D)));
            zz = 20D + (((tickAnim - 36D) / 4D) * (20D-(20D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 3D) * (-0.5D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 3D) / 4D) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D-(-0.5D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0.75+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3) + (((tickAnim - 7D) / 3D) * (0.75D-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*0.3D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0.75D + (((tickAnim - 10D) / 3D) * (0.38+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D-(0.75D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = 0.38+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3) + (((tickAnim - 13D) / 4D) * (-1D-(0.38+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*0.3D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 17D) / 3D) * (-1D-(-1D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 20D) / 7D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 32D) / 4D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 32D) / 4D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 32D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 36D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 36D) / 4D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 36D) / 4D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5D + (((tickAnim - 0D) / 3D) * (7.5D-(-17.5D)));
            yy = 10D + (((tickAnim - 0D) / 3D) * (0D-(10D)));
            zz = 10D + (((tickAnim - 0D) / 3D) * (-5D-(10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 3D) / 7D) * (-10D-(7.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 3D) / 7D) * (2.5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -10D + (((tickAnim - 10D) / 7D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 10D) / 7D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 7.5D + (((tickAnim - 17D) / 3D) * (25D-(7.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 25D + (((tickAnim - 20D) / 7D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -7.5D + (((tickAnim - 27D) / 5D) * (-32.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (10D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -32.5D + (((tickAnim - 32D) / 4D) * (-35D-(-32.5D)));
            yy = 10D + (((tickAnim - 32D) / 4D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 32D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -35D + (((tickAnim - 36D) / 4D) * (-17.5D-(-35D)));
            yy = 10D + (((tickAnim - 36D) / 4D) * (10D-(10D)));
            zz = 0D + (((tickAnim - 36D) / 4D) * (10D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 7D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 13D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.5D + (((tickAnim - 0D) / 3D) * (45D-(57.5D)));
            yy = 10D + (((tickAnim - 0D) / 3D) * (0D-(10D)));
            zz = -30D + (((tickAnim - 0D) / 3D) * (-10D-(-30D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 45D + (((tickAnim - 3D) / 7D) * (20D-(45D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (-10D-(0D)));
            zz = -10D + (((tickAnim - 3D) / 7D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 20D + (((tickAnim - 10D) / 7D) * (-7.5D-(20D)));
            yy = -10D + (((tickAnim - 10D) / 7D) * (-5D-(-10D)));
            zz = -10D + (((tickAnim - 10D) / 7D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -7.5D + (((tickAnim - 17D) / 3D) * (30D-(-7.5D)));
            yy = -5D + (((tickAnim - 17D) / 3D) * (-10D-(-5D)));
            zz = -10D + (((tickAnim - 17D) / 3D) * (0D-(-10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 30D + (((tickAnim - 20D) / 7D) * (77.5D-(30D)));
            yy = -10D + (((tickAnim - 20D) / 7D) * (-5D-(-10D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (-10D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 77.5D + (((tickAnim - 27D) / 5D) * (100D-(77.5D)));
            yy = -5D + (((tickAnim - 27D) / 5D) * (10D-(-5D)));
            zz = -10D + (((tickAnim - 27D) / 5D) * (-20D-(-10D)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 100D + (((tickAnim - 32D) / 4D) * (57.5D-(100D)));
            yy = 10D + (((tickAnim - 32D) / 4D) * (10D-(10D)));
            zz = -20D + (((tickAnim - 32D) / 4D) * (-20D-(-20D)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 57.5D + (((tickAnim - 36D) / 4D) * (57.5D-(57.5D)));
            yy = 10D + (((tickAnim - 36D) / 4D) * (10D-(10D)));
            zz = -20D + (((tickAnim - 36D) / 4D) * (-30D-(-20D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15) + (((tickAnim - 7D) / 3D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.3))*-0.15D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15) + (((tickAnim - 13D) / 4D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.15D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm3.offsetX = (float) Math.toRadians(xx);
        this.Rightarm3.offsetY = (float) Math.toRadians(yy);
        this.Rightarm3.offsetZ = (float) Math.toRadians(zz);
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360))*-2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+60))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+60))*5));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-90))*-4), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*5));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-210))*-4), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-60))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-60))*5));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*360-210))*-2), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-120))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-120))*5));


}

    public void animWarn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterosuchus entity = (EntityPrehistoricFloraProterosuchus) entitylivingbaseIn;
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProterosuchus e = (EntityPrehistoricFloraProterosuchus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
