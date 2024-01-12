package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDubreuillosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDubreuillosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Throat_r1;
    private final AdvancedModelRendererExtended Neck4;
    private final AdvancedModelRendererExtended Headbase;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended Leftcrestfront_r1;
    private final AdvancedModelRendererExtended Leftcrestbase_r1;
    private final AdvancedModelRendererExtended Leftcrestorbit_r1;
    private final AdvancedModelRendererExtended Leftcrestorbit_r2;
    private final AdvancedModelRendererExtended Leftcrestfront_r2;
    private final AdvancedModelRendererExtended Leftcrestbase_r2;
    private final AdvancedModelRendererExtended Upperfrontteeth_r1;
    private final AdvancedModelRendererExtended Upperbackteeth_r1;
    private final AdvancedModelRendererExtended Upperjawslopefront_r1;
    private final AdvancedModelRendererExtended Upperjawslopebase_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r1;
    private final AdvancedModelRendererExtended Lowerjaw;
    private final AdvancedModelRendererExtended Lowerfrontteeth_r1;
    private final AdvancedModelRendererExtended Lowerbackteeth_r1;
    private final AdvancedModelRendererExtended Lowerjawslope_r1;
    private final AdvancedModelRendererExtended Lowerjawfront_r1;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r1;
    private final AdvancedModelRendererExtended Throat;
    private final AdvancedModelRendererExtended Masseter;
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

    public ModelDubreuillosaurus() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, -16.6F, 8.0F);
        this.setRotateAngle(Hips, -0.0122F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 44, -7.5F, -5.9018F, -8.0727F, 15, 20, 17, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, 2.8982F, -7.5727F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0471F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -8.5F, -8.99F, -19.576F, 17, 22, 21, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, -3.99F, -19.576F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1173F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 65, 30, -7.0F, -4.9656F, -12.4149F, 14, 20, 14, 0.0F, false));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, 2.9344F, -10.0149F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.2737F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 117, -4.5F, -7.5503F, -8.0035F, 9, 14, 9, 0.1F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -1.5503F, -7.0035F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2346F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 116, 72, -4.5F, -6.3005F, -7.4493F, 9, 13, 8, -0.1F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, -1.2005F, -6.9493F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0817F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 113, 119, -3.5F, -4.9833F, -6.408F, 7, 12, 7, -0.1F, false));

        this.Throat_r1 = new AdvancedModelRendererExtended(this);
        this.Throat_r1.setRotationPoint(0.0F, 7.5167F, -6.808F);
        this.Neck3.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, 0.1396F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 112, 0, -2.5F, -3.3F, -0.8F, 5, 4, 8, -0.1F, false));

        this.Neck4 = new AdvancedModelRendererExtended(this);
        this.Neck4.setRotationPoint(0.0F, -4.8833F, -6.308F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.3864F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 133, 40, -3.6F, -0.2F, -4.8F, 7, 10, 5, -0.25F, false));

        this.Headbase = new AdvancedModelRendererExtended(this);
        this.Headbase.setRotationPoint(0.0F, 1.8F, -4.1F);
        this.Neck4.addChild(Headbase);
        this.setRotateAngle(Headbase, 0.2782F, 0.0F, 0.0F);


        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 4.1171F, 0.2227F);
        this.Headbase.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 152, -3.0F, -6.0F, -11.0F, 6, 6, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 77, 97, -3.6F, -6.0F, -8.0F, 7, 6, 8, 0.0F, false));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -4.3645F, -9.9665F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 134, 131, -2.0F, 0.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.Leftcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r1.setRotationPoint(-1.7252F, -0.2916F, -7.1536F);
        this.Upperjaw.addChild(Leftcrestfront_r1);
        this.setRotateAngle(Leftcrestfront_r1, 0.2217F, -0.1645F, -0.0827F);
        this.Leftcrestfront_r1.cubeList.add(new ModelBox(Leftcrestfront_r1, 122, 142, -0.2393F, -0.1443F, -0.7918F, 2, 2, 7, -0.1F, true));

        this.Leftcrestbase_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestbase_r1.setRotationPoint(-1.7252F, -0.2916F, -7.1536F);
        this.Upperjaw.addChild(Leftcrestbase_r1);
        this.setRotateAngle(Leftcrestbase_r1, 0.0829F, -0.102F, -0.0298F);
        this.Leftcrestbase_r1.cubeList.add(new ModelBox(Leftcrestbase_r1, 80, 0, -0.7684F, -0.8814F, 5.9291F, 2, 2, 3, 0.0F, true));

        this.Leftcrestorbit_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestorbit_r1.setRotationPoint(-2.0552F, -0.0882F, -0.5154F);
        this.Upperjaw.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, 0.4252F, -0.4349F, -0.4039F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 12, 0, -1.0F, -0.2F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Leftcrestorbit_r2 = new AdvancedModelRendererExtended(this);
        this.Leftcrestorbit_r2.setRotationPoint(2.0552F, -0.0882F, -0.5154F);
        this.Upperjaw.addChild(Leftcrestorbit_r2);
        this.setRotateAngle(Leftcrestorbit_r2, 0.4252F, 0.4349F, 0.4039F);
        this.Leftcrestorbit_r2.cubeList.add(new ModelBox(Leftcrestorbit_r2, 12, 0, 0.0F, -0.2F, -2.0F, 1, 2, 2, 0.0F, false));

        this.Leftcrestfront_r2 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r2.setRotationPoint(1.7252F, -0.2916F, -7.1536F);
        this.Upperjaw.addChild(Leftcrestfront_r2);
        this.setRotateAngle(Leftcrestfront_r2, 0.2217F, 0.1645F, 0.0827F);
        this.Leftcrestfront_r2.cubeList.add(new ModelBox(Leftcrestfront_r2, 122, 142, -1.7607F, -0.1443F, -0.7918F, 2, 2, 7, -0.1F, false));

        this.Leftcrestbase_r2 = new AdvancedModelRendererExtended(this);
        this.Leftcrestbase_r2.setRotationPoint(1.7252F, -0.2916F, -7.1536F);
        this.Upperjaw.addChild(Leftcrestbase_r2);
        this.setRotateAngle(Leftcrestbase_r2, 0.0829F, 0.102F, 0.0298F);
        this.Leftcrestbase_r2.cubeList.add(new ModelBox(Leftcrestbase_r2, 80, 0, -1.2316F, -0.8814F, 5.9291F, 2, 2, 3, 0.0F, false));

        this.Upperfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth_r1.setRotationPoint(0.0F, 3.4847F, -11.3982F);
        this.Upperjaw.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1543F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 48, 52, -1.5F, -0.4F, -0.3F, 3, 2, 5, -0.25F, false));

        this.Upperbackteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Upperbackteeth_r1.setRotationPoint(0.0F, 4.0F, -7.8F);
        this.Upperjaw.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 139, 0, -2.0F, -0.4F, 7.4F, 4, 2, 8, -0.13F, false));
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 139, 0, -2.0F, -0.4F, 0.9F, 4, 2, 8, -0.13F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, 0.0135F, -8.0681F);
        this.Upperjaw.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.4482F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 43, 101, -1.0F, -0.0056F, -3.868F, 2, 2, 5, -0.005F, false));
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 43, 101, -1.0F, -0.3056F, -4.468F, 2, 2, 5, 0.0F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopebase_r1.setRotationPoint(1.7252F, -1.4916F, -0.8536F);
        this.Upperjaw.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1742F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 0, 141, -2.7252F, 0.0472F, -6.8032F, 2, 3, 7, 0.2F, false));

        this.Upperjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 1.0F, -7.5F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.1107F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 43, 93, -1.5F, 1.0F, -4.6F, 3, 2, 5, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRendererExtended(this);
        this.Lowerjaw.setRotationPoint(0.0F, 4.5395F, 9.8165F);
        this.Upperjaw.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.137F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 164, -3.0F, 0.0F, -10.9F, 6, 3, 3, -0.05F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 122, 97, -3.6F, 0.0F, -8.0F, 7, 3, 8, -0.05F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 57, 1, -3.6F, 2.4F, -8.0F, 7, 2, 8, -0.054F, false));

        this.Lowerfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth_r1.setRotationPoint(0.0F, -0.2992F, -21.4592F);
        this.Lowerjaw.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.0028F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 48, 44, -1.5F, 0.0F, -0.3F, 3, 2, 5, -0.3F, false));

        this.Lowerbackteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerbackteeth_r1.setRotationPoint(0.0F, 0.9146F, -15.9261F);
        this.Lowerjaw.addChild(Lowerbackteeth_r1);
        this.setRotateAngle(Lowerbackteeth_r1, -0.0007F, 0.0F, 0.0F);
        this.Lowerbackteeth_r1.cubeList.add(new ModelBox(Lowerbackteeth_r1, 56, 12, -2.0F, -1.3434F, -0.3166F, 4, 2, 5, -0.15F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope_r1.setRotationPoint(0.0F, 4.3F, -9.0F);
        this.Lowerjaw.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, -0.0531F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 134, 110, -2.0F, -2.9263F, -7.6219F, 4, 3, 9, -0.1F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.8341F, -16.5893F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0552F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 143, 11, -1.5F, 0.1F, -5.5F, 3, 3, 6, -0.2F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.0F, -9.9F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1564F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 106, 139, -2.0F, 0.0F, -7.0F, 4, 2, 7, -0.05F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.Lowerjaw.addChild(Throat);
        this.setRotateAngle(Throat, -0.3163F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 31, 139, -2.5F, -4.0F, -0.1F, 5, 4, 6, -0.14F, false));

        this.Masseter = new AdvancedModelRendererExtended(this);
        this.Masseter.setRotationPoint(0.0F, -0.1F, -7.0F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.5473F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 60, 121, -3.1F, -4.7167F, 0.0531F, 6, 5, 5, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRendererExtended(this);
        this.Leftarm1.setRotationPoint(7.5F, 8.2344F, -9.8149F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.5665F, 0.1955F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 0, 0, -1.5F, 0.0F, -2.5F, 3, 11, 5, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRendererExtended(this);
        this.Leftarm2.setRotationPoint(-0.3483F, 10.5457F, 2.3668F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.0475F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 0, 44, -1.5F, 0.0F, -4.0F, 3, 9, 4, 0.0F, false));

        this.Leftarm3 = new AdvancedModelRendererExtended(this);
        this.Leftarm3.setRotationPoint(1.3418F, 8.7246F, -1.8841F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.1173F, 0.0F, 0.1955F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 65, 65, -2.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRendererExtended(this);
        this.Rightarm1.setRotationPoint(-7.5F, 8.2344F, -9.8149F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.5665F, -0.1955F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 0, 0, -1.5F, 0.0F, -2.5F, 3, 11, 5, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRendererExtended(this);
        this.Rightarm2.setRotationPoint(0.3483F, 10.5457F, 2.3668F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.0475F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 0, 44, -1.5F, 0.0F, -4.0F, 3, 9, 4, 0.0F, true));

        this.Rightarm3 = new AdvancedModelRendererExtended(this);
        this.Rightarm3.setRotationPoint(-1.3418F, 8.7246F, -1.8841F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.1173F, 0.0F, -0.1955F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 65, 65, 0.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, true));

        this.Leftleg1 = new AdvancedModelRendererExtended(this);
        this.Leftleg1.setRotationPoint(7.5F, 0.0982F, -0.5727F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.2482F, -0.0436F, -0.0175F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 0, 82, -4.5F, -2.0F, -6.0F, 8, 21, 13, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRendererExtended(this);
        this.Leftleg2.setRotationPoint(0.0F, 19.0F, -5.0F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.6828F, 0.0F, 0.0175F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 84, 119, -3.5F, 0.0F, 0.0F, 6, 16, 8, 0.1F, false));

        this.Leftleg3 = new AdvancedModelRendererExtended(this);
        this.Leftleg3.setRotationPoint(0.0F, 15.7F, 8.6F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.7083F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 37, 121, -3.5F, 0.0F, -6.0F, 6, 12, 5, 0.0F, false));

        this.Leftleg4 = new AdvancedModelRendererExtended(this);
        this.Leftleg4.setRotationPoint(-0.0393F, 12.2825F, -3.1585F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.2754F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 54, 133, -4.5F, -1.0F, -4.0F, 8, 3, 6, 0.0F, false));

        this.Leftleg5 = new AdvancedModelRendererExtended(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.Leftleg4.addChild(Leftleg5);
        this.Leftleg5.cubeList.add(new ModelBox(Leftleg5, 30, 82, -4.5F, -1.5F, -7.0F, 8, 3, 7, -0.05F, false));

        this.Rightleg1 = new AdvancedModelRendererExtended(this);
        this.Rightleg1.setRotationPoint(-7.5F, 0.0982F, -0.5727F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.2482F, 0.0436F, 0.0175F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 0, 82, -3.5F, -2.0F, -6.0F, 8, 21, 13, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRendererExtended(this);
        this.Rightleg2.setRotationPoint(0.0F, 19.0F, -5.0F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.6828F, 0.0F, -0.0175F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 84, 119, -2.5F, 0.0F, 0.0F, 6, 16, 8, 0.1F, true));

        this.Rightleg3 = new AdvancedModelRendererExtended(this);
        this.Rightleg3.setRotationPoint(0.0F, 15.7F, 8.6F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.7083F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 37, 121, -2.5F, 0.0F, -6.0F, 6, 12, 5, 0.0F, true));

        this.Rightleg4 = new AdvancedModelRendererExtended(this);
        this.Rightleg4.setRotationPoint(0.0393F, 12.2825F, -3.1585F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.2754F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 54, 133, -3.5F, -1.0F, -4.0F, 8, 3, 6, 0.0F, true));

        this.Rightleg5 = new AdvancedModelRendererExtended(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.Rightleg4.addChild(Rightleg5);
        this.Rightleg5.cubeList.add(new ModelBox(Rightleg5, 30, 82, -3.5F, -1.5F, -7.0F, 8, 3, 7, -0.05F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -0.9018F, 8.9273F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0443F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 65, 65, -6.0F, -4.9951F, -1.2216F, 12, 15, 13, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.1049F, 11.2784F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0122F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 77, 0, -5.0F, -4.9996F, -0.9389F, 10, 13, 14, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.1004F, 12.5611F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0216F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 112, 14, -4.0F, -4.9988F, -0.8918F, 8, 11, 14, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.8988F, 12.6082F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0279F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 43, 94, -3.0F, -3.9984F, -2.1117F, 6, 8, 18, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, -0.8984F, 15.3883F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0471F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 104, 47, -2.5F, -2.9967F, -1.1413F, 5, 6, 18, 0.0F, false));

        this.Tail6 = new AdvancedModelRendererExtended(this);
        this.Tail6.setRotationPoint(0.0F, 0.1033F, 16.3587F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0782F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 92, 94, -1.5F, -2.9908F, -1.2343F, 3, 4, 20, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Upperjawslopefront_r1, 0.4482F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1742F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront_r1, -0.1107F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1543F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Throat, -0.3599F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Neck4, 0.3431F, -0.0411F, -0.0147F);
        this.setRotateAngle(Neck3, -0.0813F, -0.311F, -0.0635F);
        this.setRotateAngle(Masseter, -0.5473F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope_r1, -0.0531F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1564F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, 0.0552F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.0061F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.0028F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerbackteeth_r1, -0.0007F, 0.0F, 0.0F);
        this.setRotateAngle(Leftcrestorbit_r2, 0.4252F, 0.4349F, 0.4039F);
        this.setRotateAngle(Leftcrestorbit_r1, 0.4252F, -0.4349F, -0.4039F);
        this.setRotateAngle(Leftcrestfront_r2, 0.2217F, 0.1645F, 0.0827F);
        this.setRotateAngle(Leftcrestfront_r1, 0.2217F, -0.1645F, -0.0827F);
        this.setRotateAngle(Leftcrestbase_r2, 0.0829F, 0.102F, 0.0298F);
        this.setRotateAngle(Leftcrestbase_r1, 0.0829F, -0.102F, -0.0298F);
        this.setRotateAngle(Headbase, 0.3658F, -0.0407F, -0.0156F);
        this.setRotateAngle(Head, -0.0399F, 0.1271F, -0.0942F);
        this.Neck3.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Upperjawslopefront_r1, 0.4482F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1742F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront_r1, -0.1107F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1543F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Throat, -0.3599F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Tail6, -0.0785F, 0.087F, -0.0068F);
        this.setRotateAngle(Tail5, -0.1393F, 0.4358F, -0.022F);
        this.setRotateAngle(Tail4, -0.1225F, 0.6542F, -0.0214F);
        this.setRotateAngle(Tail3, -0.0638F, 0.3926F, 0.009F);
        this.setRotateAngle(Tail2, -0.0748F, 0.2181F, 0.0027F);
        this.setRotateAngle(Tail1, -0.1323F, 0.1744F, -0.0078F);
        this.setRotateAngle(Rightleg4, 0.2754F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg3, -0.7083F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg2, 0.6828F, 0.0F, -0.0175F);
        this.setRotateAngle(Rightleg1, -0.2482F, 0.0436F, 0.0175F);
        this.setRotateAngle(Rightarm3, 0.1173F, 0.0F, -0.1955F);
        this.setRotateAngle(Rightarm2, -1.0475F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm1, 0.5665F, -0.1955F, 0.0F);
        this.setRotateAngle(Neck4, 0.3431F, -0.0411F, -0.0147F);
        this.setRotateAngle(Neck3, -0.0813F, -0.311F, -0.0635F);
        this.setRotateAngle(Neck2, -0.2685F, -0.2765F, -0.017F);
        this.setRotateAngle(Neck1, -0.3961F, -0.2921F, -0.0186F);
        this.setRotateAngle(Masseter, -0.5473F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope_r1, -0.0531F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1564F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, 0.0552F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.0061F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.0028F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerbackteeth_r1, -0.0007F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg4, 0.2754F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg3, -0.7083F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg2, 0.6828F, 0.0F, 0.0175F);
        this.setRotateAngle(Leftleg1, -0.2482F, -0.0436F, -0.0175F);
        this.setRotateAngle(Leftcrestorbit_r2, 0.4252F, 0.4349F, 0.4039F);
        this.setRotateAngle(Leftcrestorbit_r1, 0.4252F, -0.4349F, -0.4039F);
        this.setRotateAngle(Leftcrestfront_r2, 0.2217F, 0.1645F, 0.0827F);
        this.setRotateAngle(Leftcrestfront_r1, 0.2217F, -0.1645F, -0.0827F);
        this.setRotateAngle(Leftcrestbase_r2, 0.0829F, 0.102F, 0.0298F);
        this.setRotateAngle(Leftcrestbase_r1, 0.0829F, -0.102F, -0.0298F);
        this.setRotateAngle(Leftarm3, 0.1173F, 0.0F, 0.1955F);
        this.setRotateAngle(Leftarm2, -1.0475F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm1, 0.5665F, 0.1955F, 0.0F);
        this.setRotateAngle(Hips, -0.0128F, 0.3054F, -0.0039F);
        this.setRotateAngle(Headbase, 0.3658F, -0.0407F, -0.0156F);
        this.setRotateAngle(Head, -0.0399F, 0.1271F, -0.0942F);
        this.setRotateAngle(Bodymiddle, 0.0483F, -0.2179F, -0.0104F);
        this.setRotateAngle(Bodyfront, 0.0209F, -0.2622F, 0.0254F);
        this.Hips.offsetY = -0.102F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        this.setRotateAngle(Upperjawslopefront_r1, 0.4482F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1742F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront_r1, -0.1107F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1543F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Throat, -0.3599F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Tail6, -0.0785F, 0.087F, -0.0068F);
        this.setRotateAngle(Tail5, -0.1393F, 0.4358F, -0.022F);
        this.setRotateAngle(Tail4, -0.1225F, 0.6542F, -0.0214F);
        this.setRotateAngle(Tail3, -0.0638F, 0.3926F, 0.009F);
        this.setRotateAngle(Tail2, -0.0748F, 0.2181F, 0.0027F);
        this.setRotateAngle(Tail1, -0.1323F, 0.1744F, -0.0078F);
        this.setRotateAngle(Rightleg4, 0.2754F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg3, -0.7083F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg2, 0.6828F, 0.0F, -0.0175F);
        this.setRotateAngle(Rightleg1, -0.2482F, 0.0436F, 0.0175F);
        this.setRotateAngle(Rightarm3, 0.1173F, 0.0F, -0.1955F);
        this.setRotateAngle(Rightarm2, -1.0475F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm1, 0.5665F, -0.1955F, 0.0F);
        this.setRotateAngle(Neck4, 0.3431F, -0.0411F, -0.0147F);
        this.setRotateAngle(Neck3, -0.0813F, -0.311F, -0.0635F);
        this.setRotateAngle(Neck2, -0.2685F, -0.2765F, -0.017F);
        this.setRotateAngle(Neck1, -0.3961F, -0.2921F, -0.0186F);
        this.setRotateAngle(Masseter, -0.5473F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope_r1, -0.0531F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1564F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, 0.0552F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.0061F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.0028F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerbackteeth_r1, -0.0007F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg4, 0.2754F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg3, -0.7083F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg2, 0.6828F, 0.0F, 0.0175F);
        this.setRotateAngle(Leftleg1, -0.2482F, -0.0436F, -0.0175F);
        this.setRotateAngle(Leftcrestorbit_r2, 0.4252F, 0.4349F, 0.4039F);
        this.setRotateAngle(Leftcrestorbit_r1, 0.4252F, -0.4349F, -0.4039F);
        this.setRotateAngle(Leftcrestfront_r2, 0.2217F, 0.1645F, 0.0827F);
        this.setRotateAngle(Leftcrestfront_r1, 0.2217F, -0.1645F, -0.0827F);
        this.setRotateAngle(Leftcrestbase_r2, 0.0829F, 0.102F, 0.0298F);
        this.setRotateAngle(Leftcrestbase_r1, 0.0829F, -0.102F, -0.0298F);
        this.setRotateAngle(Leftarm3, 0.1173F, 0.0F, 0.1955F);
        this.setRotateAngle(Leftarm2, -1.0475F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm1, 0.5665F, 0.1955F, 0.0F);
        this.setRotateAngle(Hips, -0.0128F, 0.3054F, -0.0039F);
        this.setRotateAngle(Headbase, 0.3658F, -0.0407F, -0.0156F);
        this.setRotateAngle(Head, -0.0399F, 0.1271F, -0.0942F);
        this.setRotateAngle(Bodymiddle, 0.0483F, -0.2179F, -0.0104F);
        this.setRotateAngle(Bodyfront, 0.0209F, -0.2622F, 0.0254F);
        this.Hips.offsetY = -0.102F;
        this.Hips.render(0.01F);
        this.Hips.rotateAngleY = (float)Math.toRadians(0);
        this.Hips.rotateAngleX = (float)Math.toRadians(50);
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

        EntityPrehistoricFloraDubreuillosaurus EntityDubreuillosaurus = (EntityPrehistoricFloraDubreuillosaurus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Neck4);
        this.faceTarget(f3, f4, 8, Headbase);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Headbase};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        EntityDubreuillosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityDubreuillosaurus.getAnimation() == EntityDubreuillosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityDubreuillosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityDubreuillosaurus.getIsMoving()) { //Is moving at all
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

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

                if (EntityDubreuillosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10 + (((tickAnim - 15) / 15) * (0-(-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*45-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*45 + (((tickAnim - 12) / 4) * (1.07-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*45)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 1.07 + (((tickAnim - 16) / 14) * (0-(1.07)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-12 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-12)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*8 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*8)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-15 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*8 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.95 + (((tickAnim - 15) / 15) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.rotationPointX = this.Bodyfront.rotationPointX + (float)(xx);
        this.Bodyfront.rotationPointY = this.Bodyfront.rotationPointY - (float)(yy);
        this.Bodyfront.rotationPointZ = this.Bodyfront.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-12.1152-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*0.0329-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*30 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-12.1152 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-12.1152)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*0.0329 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*0.0329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(0);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(-0.1);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*25 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*25 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-90))*5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-90))*5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*15 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*15)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(xx), Headbase.rotateAngleY + (float) Math.toRadians(yy), Headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
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
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 10) / 5) * (-9.25-(5.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 15) / 15) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5 + (((tickAnim - 15) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10 + (((tickAnim - 25) / 15) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(xx), Headbase.rotateAngleY + (float) Math.toRadians(yy), Headbase.rotateAngleZ + (float) Math.toRadians(zz));




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

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(4), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-720))*-1));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-0.60681), Neck1.rotateAngleY + (float) Math.toRadians(-2.28+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), Neck1.rotateAngleZ + (float) Math.toRadians(10.2559+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-0.28486), Neck2.rotateAngleY + (float) Math.toRadians(-8.0037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-150))*-1), Neck2.rotateAngleZ + (float) Math.toRadians(4.6499+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-0.8609), Neck3.rotateAngleY + (float) Math.toRadians(-18.2291+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-155))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(-0.9738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-0.8609), Head.rotateAngleY + (float) Math.toRadians(-18.2291+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-155))*-1), Head.rotateAngleZ + (float) Math.toRadians(-0.9738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.36999 + (((tickAnim - 0) / 10) * (3.06056-(-24.36999)));
            yy = 7.24367 + (((tickAnim - 0) / 10) * (7.70231-(7.24367)));
            zz = -3.33913 + (((tickAnim - 0) / 10) * (2.55731-(-3.33913)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 3.06056 + (((tickAnim - 10) / 13) * (15.16083-(3.06056)));
            yy = 7.70231 + (((tickAnim - 10) / 13) * (7.16096-(7.70231)));
            zz = 2.55731 + (((tickAnim - 10) / 13) * (8.82222-(2.55731)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15.16083 + (((tickAnim - 23) / 10) * (0.6622-(15.16083)));
            yy = 7.16096 + (((tickAnim - 23) / 10) * (-3.82648-(7.16096)));
            zz = 8.82222 + (((tickAnim - 23) / 10) * (1.95166-(8.82222)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0.6622 + (((tickAnim - 33) / 9) * (-27.80583-(0.6622)));
            yy = -3.82648 + (((tickAnim - 33) / 9) * (-2.49644-(-3.82648)));
            zz = 1.95166 + (((tickAnim - 33) / 9) * (-2.19118-(1.95166)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -27.80583 + (((tickAnim - 42) / 8) * (-24.36999-(-27.80583)));
            yy = -2.49644 + (((tickAnim - 42) / 8) * (7.24367-(-2.49644)));
            zz = -2.19118 + (((tickAnim - 42) / 8) * (-3.33913-(-2.19118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -2.175 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(-2.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 5) / 5) * (-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (-2.175-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
            xx = -7.02521 + (((tickAnim - 0) / 10) * (5-(-7.02521)));
            yy = -2.21147 + (((tickAnim - 0) / 10) * (0-(-2.21147)));
            zz = 11.40943 + (((tickAnim - 0) / 10) * (0-(11.40943)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 10) / 13) * (7.9416-(5)));
            yy = 0 + (((tickAnim - 10) / 13) * (-6.13139-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-4.91718-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.9416 + (((tickAnim - 23) / 10) * (45-(7.9416)));
            yy = -6.13139 + (((tickAnim - 23) / 10) * (-2.5-(-6.13139)));
            zz = -4.91718 + (((tickAnim - 23) / 10) * (2.5-(-4.91718)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 45 + (((tickAnim - 33) / 9) * (34.4874-(45)));
            yy = -2.5 + (((tickAnim - 33) / 9) * (-2.35574-(-2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (6.95472-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 34.4874 + (((tickAnim - 42) / 8) * (-7.02521-(34.4874)));
            yy = -2.35574 + (((tickAnim - 42) / 8) * (-2.21147-(-2.35574)));
            zz = 6.95472 + (((tickAnim - 42) / 8) * (11.40943-(6.95472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0.5)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.225-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -0.225 + (((tickAnim - 23) / 27) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 23) / 27) * (0.5-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0.225-(0)));
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
            xx = 23.20653 + (((tickAnim - 0) / 10) * (-10-(23.20653)));
            yy = -0.15664 + (((tickAnim - 0) / 10) * (0-(-0.15664)));
            zz = -8.21488 + (((tickAnim - 0) / 10) * (0-(-8.21488)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 10) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-5-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = -5 + (((tickAnim - 33) / 9) * (-22.5-(-5)));
            yy = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 42) / 8) * (23.20653-(-22.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (-0.15664-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-8.21488-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.1 + (((tickAnim - 0) / 5) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.1 + (((tickAnim - 5) / 5) * (0-(-0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.rotationPointX = this.Leftleg3.rotationPointX + (float)(xx);
        this.Leftleg3.rotationPointY = this.Leftleg3.rotationPointY - (float)(yy);
        this.Leftleg3.rotationPointZ = this.Leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.00629 + (((tickAnim - 0) / 10) * (5.69304-(14.00629)));
            yy = -8.35841 + (((tickAnim - 0) / 10) * (-5.43278-(-8.35841)));
            zz = -3.66616 + (((tickAnim - 0) / 10) * (-7.45396-(-3.66616)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5.69304 + (((tickAnim - 10) / 13) * (40.04972-(5.69304)));
            yy = -5.43278 + (((tickAnim - 10) / 13) * (-1.96746-(-5.43278)));
            zz = -7.45396 + (((tickAnim - 10) / 13) * (-2.89523-(-7.45396)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40.04972 + (((tickAnim - 23) / 7) * (25-(40.04972)));
            yy = -1.96746 + (((tickAnim - 23) / 7) * (0-(-1.96746)));
            zz = -2.89523 + (((tickAnim - 23) / 7) * (0-(-2.89523)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 25 + (((tickAnim - 30) / 12) * (32.5-(25)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 32.5 + (((tickAnim - 42) / 8) * (14.00629-(32.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (-8.35841-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-3.66616-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-0.825-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.425 + (((tickAnim - 23) / 27) * (0-(-0.425)));
            zz = -0.825 + (((tickAnim - 23) / 27) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg4.rotationPointX = this.Leftleg4.rotationPointX + (float)(xx);
        this.Leftleg4.rotationPointY = this.Leftleg4.rotationPointY - (float)(yy);
        this.Leftleg4.rotationPointZ = this.Leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 23) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40 + (((tickAnim - 30) / 13) * (62.5-(40)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 62.5 + (((tickAnim - 43) / 7) * (-5-(62.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0.775-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 43) / 7) * (0-(0.525)));
            zz = 0.775 + (((tickAnim - 43) / 7) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg5.rotationPointX = this.Leftleg5.rotationPointX + (float)(xx);
        this.Leftleg5.rotationPointY = this.Leftleg5.rotationPointY - (float)(yy);
        this.Leftleg5.rotationPointZ = this.Leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*4), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*7), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*10), Tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 25) / 25) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -6.5 + (((tickAnim - 15) / 10) * (-12.75-(-6.5)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -12.75 + (((tickAnim - 25) / 13) * (-4.95-(-12.75)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -4.95 + (((tickAnim - 38) / 12) * (0-(-4.95)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.875-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0.875 + (((tickAnim - 25) / 25) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 25) / 25) * (0-(-42.5)));
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
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 25) / 25) * (0-(-42.5)));
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
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




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
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(xx), Headbase.rotateAngleY + (float) Math.toRadians(yy), Headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5 + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5 + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
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
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 10) / 5) * (-8-(-15)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8 + (((tickAnim - 15) / 5) * (0-(-8)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 26) / 14) * (0-(-5)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 10) / 3) * (3-(-10)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 3 + (((tickAnim - 13) / 2) * (-10-(3)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (3-(-10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3 + (((tickAnim - 18) / 2) * (-5-(3)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 20) / 3) * (3-(-5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 3 + (((tickAnim - 23) / 2) * (-4-(3)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 25) / 3) * (3-(-4)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 28) / 2) * (-5-(3)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 30) / 3) * (3-(-5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 33) / 2) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0.3 + (((tickAnim - 26) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+20))*-2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 0) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 5) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1 + (((tickAnim - 10) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 10) / 17) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25 + (((tickAnim - 27) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*1.25)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
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



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*1), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-20))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
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



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*1), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*3), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
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



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*1), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-1), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*2), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-1), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*-1), Headbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*2), Headbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*-0.3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*1), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.36999 + (((tickAnim - 0) / 10) * (3.06056-(-24.36999)));
            yy = 7.24367 + (((tickAnim - 0) / 10) * (7.70231-(7.24367)));
            zz = -3.33913 + (((tickAnim - 0) / 10) * (2.55731-(-3.33913)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 3.06056 + (((tickAnim - 10) / 13) * (15.16083-(3.06056)));
            yy = 7.70231 + (((tickAnim - 10) / 13) * (7.16096-(7.70231)));
            zz = 2.55731 + (((tickAnim - 10) / 13) * (8.82222-(2.55731)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15.16083 + (((tickAnim - 23) / 10) * (0.6622-(15.16083)));
            yy = 7.16096 + (((tickAnim - 23) / 10) * (-3.82648-(7.16096)));
            zz = 8.82222 + (((tickAnim - 23) / 10) * (1.95166-(8.82222)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0.6622 + (((tickAnim - 33) / 9) * (-27.80583-(0.6622)));
            yy = -3.82648 + (((tickAnim - 33) / 9) * (-2.49644-(-3.82648)));
            zz = 1.95166 + (((tickAnim - 33) / 9) * (-2.19118-(1.95166)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -27.80583 + (((tickAnim - 42) / 8) * (-24.36999-(-27.80583)));
            yy = -2.49644 + (((tickAnim - 42) / 8) * (7.24367-(-2.49644)));
            zz = -2.19118 + (((tickAnim - 42) / 8) * (-3.33913-(-2.19118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -2.175 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-2.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 5) / 5) * (-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
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
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (-2.175-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
            xx = -7.02521 + (((tickAnim - 0) / 10) * (5-(-7.02521)));
            yy = -2.21147 + (((tickAnim - 0) / 10) * (0-(-2.21147)));
            zz = 11.40943 + (((tickAnim - 0) / 10) * (0-(11.40943)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 10) / 13) * (7.9416-(5)));
            yy = 0 + (((tickAnim - 10) / 13) * (-6.13139-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-4.91718-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.9416 + (((tickAnim - 23) / 10) * (45-(7.9416)));
            yy = -6.13139 + (((tickAnim - 23) / 10) * (-2.5-(-6.13139)));
            zz = -4.91718 + (((tickAnim - 23) / 10) * (2.5-(-4.91718)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 45 + (((tickAnim - 33) / 9) * (34.4874-(45)));
            yy = -2.5 + (((tickAnim - 33) / 9) * (-2.35574-(-2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (6.95472-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 34.4874 + (((tickAnim - 42) / 8) * (-7.02521-(34.4874)));
            yy = -2.35574 + (((tickAnim - 42) / 8) * (-2.21147-(-2.35574)));
            zz = 6.95472 + (((tickAnim - 42) / 8) * (11.40943-(6.95472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(0.5)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.225-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -0.225 + (((tickAnim - 23) / 27) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 23) / 27) * (0.5-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0.225-(0)));
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
            xx = 23.20653 + (((tickAnim - 0) / 10) * (-10-(23.20653)));
            yy = -0.15664 + (((tickAnim - 0) / 10) * (0-(-0.15664)));
            zz = -8.21488 + (((tickAnim - 0) / 10) * (0-(-8.21488)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 10) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-5-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = -5 + (((tickAnim - 33) / 9) * (-22.5-(-5)));
            yy = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 42) / 8) * (23.20653-(-22.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (-0.15664-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-8.21488-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.1 + (((tickAnim - 0) / 5) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.1 + (((tickAnim - 5) / 5) * (0-(-0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
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
            xx = 0 + (((tickAnim - 23) / 27) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.rotationPointX = this.Leftleg3.rotationPointX + (float)(xx);
        this.Leftleg3.rotationPointY = this.Leftleg3.rotationPointY - (float)(yy);
        this.Leftleg3.rotationPointZ = this.Leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.00629 + (((tickAnim - 0) / 10) * (5.69304-(14.00629)));
            yy = -8.35841 + (((tickAnim - 0) / 10) * (-5.43278-(-8.35841)));
            zz = -3.66616 + (((tickAnim - 0) / 10) * (-7.45396-(-3.66616)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5.69304 + (((tickAnim - 10) / 13) * (40.04972-(5.69304)));
            yy = -5.43278 + (((tickAnim - 10) / 13) * (-1.96746-(-5.43278)));
            zz = -7.45396 + (((tickAnim - 10) / 13) * (-2.89523-(-7.45396)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40.04972 + (((tickAnim - 23) / 7) * (25-(40.04972)));
            yy = -1.96746 + (((tickAnim - 23) / 7) * (0-(-1.96746)));
            zz = -2.89523 + (((tickAnim - 23) / 7) * (0-(-2.89523)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 25 + (((tickAnim - 30) / 12) * (32.5-(25)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 32.5 + (((tickAnim - 42) / 8) * (14.00629-(32.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (-8.35841-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-3.66616-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-0.825-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.425 + (((tickAnim - 23) / 27) * (0-(-0.425)));
            zz = -0.825 + (((tickAnim - 23) / 27) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg4.rotationPointX = this.Leftleg4.rotationPointX + (float)(xx);
        this.Leftleg4.rotationPointY = this.Leftleg4.rotationPointY - (float)(yy);
        this.Leftleg4.rotationPointZ = this.Leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 23) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40 + (((tickAnim - 30) / 13) * (62.5-(40)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 62.5 + (((tickAnim - 43) / 7) * (-5-(62.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0.775-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 43) / 7) * (0-(0.525)));
            zz = 0.775 + (((tickAnim - 43) / 7) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg5.rotationPointX = this.Leftleg5.rotationPointX + (float)(xx);
        this.Leftleg5.rotationPointY = this.Leftleg5.rotationPointY - (float)(yy);
        this.Leftleg5.rotationPointZ = this.Leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*2));

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



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2));

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



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-90))*-2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2));

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



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-120))*-1), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*2));

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
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*2));

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
        this.Tail5.rotationPointX = this.Tail5.rotationPointX + (float)(xx);
        this.Tail5.rotationPointY = this.Tail5.rotationPointY - (float)(yy);
        this.Tail5.rotationPointZ = this.Tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-1), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*-5), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*2));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*5), Leftarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-5));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*-5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 15.20377 + (((tickAnim - 0) / 10) * (5-(15.20377)));
            yy = -4.92297 + (((tickAnim - 0) / 10) * (5-(-4.92297)));
            zz = -7.53806 + (((tickAnim - 0) / 10) * (5-(-7.53806)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (-27.5-(5)));
            yy = 5 + (((tickAnim - 10) / 10) * (5-(5)));
            zz = 5 + (((tickAnim - 10) / 10) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.5 + (((tickAnim - 20) / 7) * (-24.36999-(-27.5)));
            yy = 5 + (((tickAnim - 20) / 7) * (-7.2437-(5)));
            zz = 5 + (((tickAnim - 20) / 7) * (3.3391-(5)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -24.36999 + (((tickAnim - 27) / 23) * (15.20377-(-24.36999)));
            yy = -7.2437 + (((tickAnim - 27) / 23) * (-4.92297-(-7.2437)));
            zz = 3.3391 + (((tickAnim - 27) / 23) * (-7.53806-(3.3391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


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
            yy = 0 + (((tickAnim - 20) / 7) * (-2.175-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -2.175 + (((tickAnim - 27) / 5) * (-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-2.175)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 5) * (-0.75-(-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
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
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 0) / 10) * (45-(7.5)));
            yy = 2.5 + (((tickAnim - 0) / 10) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 0) / 10) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 10) / 10) * (42.5-(45)));
            yy = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 42.5 + (((tickAnim - 20) / 7) * (-7.02521-(42.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (2.2115-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-11.4094-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -7.02521 + (((tickAnim - 27) / 10) * (4.75109-(-7.02521)));
            yy = 2.2115 + (((tickAnim - 27) / 10) * (-0.94786-(2.2115)));
            zz = -11.4094 + (((tickAnim - 27) / 10) * (-4.04157-(-11.4094)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 4.75109 + (((tickAnim - 37) / 13) * (7.5-(4.75109)));
            yy = -0.94786 + (((tickAnim - 37) / 13) * (2.5-(-0.94786)));
            zz = -4.04157 + (((tickAnim - 37) / 13) * (2.5-(-4.04157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.225-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(0.5)));
            zz = 0.225 + (((tickAnim - 27) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
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
        this.Rightleg2.rotationPointX = this.Rightleg2.rotationPointX + (float)(xx);
        this.Rightleg2.rotationPointY = this.Rightleg2.rotationPointY - (float)(yy);
        this.Rightleg2.rotationPointZ = this.Rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 0) / 10) * (-5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (-22.5-(-5)));
            yy = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -22.5 + (((tickAnim - 20) / 7) * (23.20653-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (-0.15664-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (8.2149-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 23.20653 + (((tickAnim - 27) / 10) * (-1-(23.20653)));
            yy = -0.15664 + (((tickAnim - 27) / 10) * (0-(-0.15664)));
            zz = 8.2149 + (((tickAnim - 27) / 10) * (0-(8.2149)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 37) / 13) * (27.5-(-1)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.1 + (((tickAnim - 27) / 5) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -0.1 + (((tickAnim - 32) / 5) * (0-(-0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
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
        this.Rightleg3.rotationPointX = this.Rightleg3.rotationPointX + (float)(xx);
        this.Rightleg3.rotationPointY = this.Rightleg3.rotationPointY - (float)(yy);
        this.Rightleg3.rotationPointZ = this.Rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40 + (((tickAnim - 0) / 7) * (25-(40)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 7) / 13) * (32.5-(25)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 32.5 + (((tickAnim - 20) / 7) * (14.00629-(32.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (8.3584-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (3.6662-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 14.00629 + (((tickAnim - 27) / 10) * (5.69304-(14.00629)));
            yy = 8.3584 + (((tickAnim - 27) / 10) * (5.4328-(8.3584)));
            zz = 3.6662 + (((tickAnim - 27) / 10) * (7.454-(3.6662)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 5.69304 + (((tickAnim - 37) / 13) * (40-(5.69304)));
            yy = 5.4328 + (((tickAnim - 37) / 13) * (0-(5.4328)));
            zz = 7.454 + (((tickAnim - 37) / 13) * (0-(7.454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.Rightleg4.rotationPointX = this.Rightleg4.rotationPointX + (float)(0);
        this.Rightleg4.rotationPointY = this.Rightleg4.rotationPointY - (float)(0);
        this.Rightleg4.rotationPointZ = this.Rightleg4.rotationPointZ + (float)(-0.825);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -87.5 + (((tickAnim - 0) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 7) / 13) * (62.5-(40)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 62.5 + (((tickAnim - 20) / 7) * (-5-(62.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -5 + (((tickAnim - 27) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.925-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 20) / 7) * (0-(0.55)));
            zz = 0.925 + (((tickAnim - 20) / 7) * (0-(0.925)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg5.rotationPointX = this.Rightleg5.rotationPointX + (float)(xx);
        this.Rightleg5.rotationPointY = this.Rightleg5.rotationPointY - (float)(yy);
        this.Rightleg5.rotationPointZ = this.Rightleg5.rotationPointZ + (float)(zz);


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2));

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



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-2));

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



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+10))*3), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2));


        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*1), Headbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2), Headbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-2), Throat.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), Throat.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22.76863 + (((tickAnim - 0) / 7) * (15.06195-(-22.76863)));
            yy = 1.10081 + (((tickAnim - 0) / 7) * (3.62921-(1.10081)));
            zz = 2.30769 + (((tickAnim - 0) / 7) * (6.26677-(2.30769)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 15.06195 + (((tickAnim - 7) / 6) * (-10-(15.06195)));
            yy = 3.62921 + (((tickAnim - 7) / 6) * (-5-(3.62921)));
            zz = 6.26677 + (((tickAnim - 7) / 6) * (-5-(6.26677)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (-27.78932-(-10)));
            yy = -5 + (((tickAnim - 13) / 5) * (-2.66378-(-5)));
            zz = -5 + (((tickAnim - 13) / 5) * (-2.37765-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.78932 + (((tickAnim - 18) / 2) * (-22.76863-(-27.78932)));
            yy = -2.66378 + (((tickAnim - 18) / 2) * (1.10081-(-2.66378)));
            zz = -2.37765 + (((tickAnim - 18) / 2) * (2.30769-(-2.37765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 2) / 1) * (-1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 2) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 5) / 2) * (-1-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 6) * (1-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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
        this.Leftleg1.rotationPointX = this.Leftleg1.rotationPointX + (float)(xx);
        this.Leftleg1.rotationPointY = this.Leftleg1.rotationPointY - (float)(yy);
        this.Leftleg1.rotationPointZ = this.Leftleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5 + (((tickAnim - 0) / 3) * (12.62423-(-22.5)));
            yy = -2.5 + (((tickAnim - 0) / 3) * (-1.35479-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-5.49779-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.62423 + (((tickAnim - 3) / 4) * (12.44888-(12.62423)));
            yy = -1.35479 + (((tickAnim - 3) / 4) * (-3.81478-(-1.35479)));
            zz = -5.49779 + (((tickAnim - 3) / 4) * (0.10644-(-5.49779)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.44888 + (((tickAnim - 7) / 2) * (35-(12.44888)));
            yy = -3.81478 + (((tickAnim - 7) / 2) * (0-(-3.81478)));
            zz = 0.10644 + (((tickAnim - 7) / 2) * (5-(0.10644)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 9) / 4) * (42.5-(35)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 9) / 4) * (2.5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5 + (((tickAnim - 13) / 5) * (27.5-(42.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 13) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 18) / 2) * (-22.5-(27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-2.5-(0)));
            zz = 2.5 + (((tickAnim - 18) / 2) * (-2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Leftleg2.rotationPointX = this.Leftleg2.rotationPointX + (float)(xx);
        this.Leftleg2.rotationPointY = this.Leftleg2.rotationPointY - (float)(yy);
        this.Leftleg2.rotationPointZ = this.Leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 0) / 3) * (-2.5-(40)));
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
            xx = -27.5 + (((tickAnim - 18) / 2) * (40-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Leftleg3.rotationPointX = this.Leftleg3.rotationPointX + (float)(xx);
        this.Leftleg3.rotationPointY = this.Leftleg3.rotationPointY - (float)(yy);
        this.Leftleg3.rotationPointZ = this.Leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.80609 + (((tickAnim - 0) / 3) * (-2.5-(9.80609)));
            yy = 3.82491 + (((tickAnim - 0) / 3) * (0-(3.82491)));
            zz = -1.01358 + (((tickAnim - 0) / 3) * (0-(-1.01358)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 3) / 4) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 7) / 2) * (60-(15)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
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
            xx = 60 + (((tickAnim - 18) / 2) * (5-(60)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.5-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.7-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 9) / 11) * (0-(0.275)));
            zz = 0.7 + (((tickAnim - 9) / 11) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg5.rotationPointX = this.Leftleg5.rotationPointX + (float)(xx);
        this.Leftleg5.rotationPointY = this.Leftleg5.rotationPointY - (float)(yy);
        this.Leftleg5.rotationPointZ = this.Leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));

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



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2));

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



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2));

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



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+130))*1), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*3), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-2));

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



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*1), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2));

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



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+160))*1), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*3), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*0.5), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5), Leftarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2.5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2.5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), Rightarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 0) / 4) * (-10-(15)));
            yy = 5 + (((tickAnim - 0) / 4) * (5-(5)));
            zz = 5 + (((tickAnim - 0) / 4) * (5-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-27.78932-(-10)));
            yy = 5 + (((tickAnim - 4) / 4) * (2.66378-(5)));
            zz = 5 + (((tickAnim - 4) / 4) * (2.37765-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.78932 + (((tickAnim - 8) / 3) * (-22.7809-(-27.78932)));
            yy = 2.66378 + (((tickAnim - 8) / 3) * (-1.55212-(2.66378)));
            zz = 2.37765 + (((tickAnim - 8) / 3) * (-2.90683-(2.37765)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -22.7809 + (((tickAnim - 11) / 7) * (15.70639-(-22.7809)));
            yy = -1.55212 + (((tickAnim - 11) / 7) * (-8.36554-(-1.55212)));
            zz = -2.90683 + (((tickAnim - 11) / 7) * (-4.36703-(-2.90683)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.70639 + (((tickAnim - 18) / 2) * (15-(15.70639)));
            yy = -8.36554 + (((tickAnim - 18) / 2) * (5-(-8.36554)));
            zz = -4.36703 + (((tickAnim - 18) / 2) * (5-(-4.36703)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


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
            yy = 0 + (((tickAnim - 11) / 2) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 13) / 1) * (-1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 14) / 2) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 16) / 2) * (-1-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
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
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 0) / 4) * (42.5-(35)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 4) * (-2.5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 42.5 + (((tickAnim - 4) / 4) * (27.5-(42.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 4) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 8) / 3) * (-22.5-(27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (2.5-(0)));
            zz = -2.5 + (((tickAnim - 8) / 3) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -22.5 + (((tickAnim - 11) / 3) * (7.5-(-22.5)));
            yy = 2.5 + (((tickAnim - 11) / 3) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 11) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 14) / 4) * (12.6797-(7.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (4.03035-(0)));
            zz = -2.5 + (((tickAnim - 14) / 4) * (2.60385-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.6797 + (((tickAnim - 18) / 2) * (35-(12.6797)));
            yy = 4.03035 + (((tickAnim - 18) / 2) * (0-(4.03035)));
            zz = 2.60385 + (((tickAnim - 18) / 2) * (-5-(2.60385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Rightleg2.rotationPointX = this.Rightleg2.rotationPointX + (float)(xx);
        this.Rightleg2.rotationPointY = this.Rightleg2.rotationPointY - (float)(yy);
        this.Rightleg2.rotationPointZ = this.Rightleg2.rotationPointZ + (float)(zz);




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
            xx = -27.5 + (((tickAnim - 8) / 3) * (40-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 40 + (((tickAnim - 11) / 3) * (-2.5-(40)));
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
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Rightleg3.rotationPointX = this.Rightleg3.rotationPointX + (float)(xx);
        this.Rightleg3.rotationPointY = this.Rightleg3.rotationPointY - (float)(yy);
        this.Rightleg3.rotationPointZ = this.Rightleg3.rotationPointZ + (float)(zz);




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
            xx = 60 + (((tickAnim - 8) / 3) * (7.89298-(60)));
            yy = 0 + (((tickAnim - 8) / 3) * (-2.8361-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (3.36141-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 7.89298 + (((tickAnim - 11) / 3) * (-2.5-(7.89298)));
            yy = -2.8361 + (((tickAnim - 11) / 3) * (0-(-2.8361)));
            zz = 3.36141 + (((tickAnim - 11) / 3) * (0-(3.36141)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 14) / 4) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 18) / 2) * (60-(15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 11) * (0-(0.45)));
            zz = 0.825 + (((tickAnim - 0) / 11) * (0-(0.825)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0.45-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0.825-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg5.rotationPointX = this.Rightleg5.rotationPointX + (float)(xx);
        this.Rightleg5.rotationPointY = this.Rightleg5.rotationPointY - (float)(yy);
        this.Rightleg5.rotationPointZ = this.Rightleg5.rotationPointZ + (float)(zz);


    }

    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDubreuillosaurus entity = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

        int animCycle = 551;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (1.50716-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-5.99724-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (-0.08587-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 69) {
            xx = 1.50716 + (((tickAnim - 36) / 33) * (1.49552-(1.50716)));
            yy = -5.99724 + (((tickAnim - 36) / 33) * (-3.00268-(-5.99724)));
            zz = -0.08587 + (((tickAnim - 36) / 33) * (0.07334-(-0.08587)));
        }
        else if (tickAnim >= 69 && tickAnim < 123) {
            xx = 1.49552 + (((tickAnim - 69) / 54) * (12.27154-(1.49552)));
            yy = -3.00268 + (((tickAnim - 69) / 54) * (8.92893-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 69) / 54) * (-2.19284-(0.07334)));
        }
        else if (tickAnim >= 123 && tickAnim < 175) {
            xx = 12.27154 + (((tickAnim - 123) / 52) * (-2.52884-(12.27154)));
            yy = 8.92893 + (((tickAnim - 123) / 52) * (12.79145-(8.92893)));
            zz = -2.19284 + (((tickAnim - 123) / 52) * (-1.13399-(-2.19284)));
        }
        else if (tickAnim >= 175 && tickAnim < 222) {
            xx = -2.52884 + (((tickAnim - 175) / 47) * (4.75034-(-2.52884)));
            yy = 12.79145 + (((tickAnim - 175) / 47) * (21.74013-(12.79145)));
            zz = -1.13399 + (((tickAnim - 175) / 47) * (3.51775-(-1.13399)));
        }
        else if (tickAnim >= 222 && tickAnim < 257) {
            xx = 4.75034 + (((tickAnim - 222) / 35) * (2.70874-(4.75034)));
            yy = 21.74013 + (((tickAnim - 222) / 35) * (19.88141-(21.74013)));
            zz = 3.51775 + (((tickAnim - 222) / 35) * (-1.53905-(3.51775)));
        }
        else if (tickAnim >= 257 && tickAnim < 300) {
            xx = 2.70874 + (((tickAnim - 257) / 43) * (-10.99284-(2.70874)));
            yy = 19.88141 + (((tickAnim - 257) / 43) * (-5.99724-(19.88141)));
            zz = -1.53905 + (((tickAnim - 257) / 43) * (-0.08587-(-1.53905)));
        }
        else if (tickAnim >= 300 && tickAnim < 333) {
            xx = -10.99284 + (((tickAnim - 300) / 33) * (-6.24838-(-10.99284)));
            yy = -5.99724 + (((tickAnim - 300) / 33) * (-3.00268-(-5.99724)));
            zz = -0.08587 + (((tickAnim - 300) / 33) * (0.07334-(-0.08587)));
        }
        else if (tickAnim >= 333 && tickAnim < 367) {
            xx = -6.24838 + (((tickAnim - 333) / 34) * (-8.50448-(-6.24838)));
            yy = -3.00268 + (((tickAnim - 333) / 34) * (-3.00268-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 333) / 34) * (0.07334-(0.07334)));
        }
        else if (tickAnim >= 367 && tickAnim < 442) {
            xx = -8.50448 + (((tickAnim - 367) / 75) * (0.89573-(-8.50448)));
            yy = -3.00268 + (((tickAnim - 367) / 75) * (-1.90753-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 367) / 75) * (2.53338-(0.07334)));
        }
        else if (tickAnim >= 442 && tickAnim < 445) {
            xx = 0.89573 + (((tickAnim - 442) / 3) * (9.4438-(0.89573)));
            yy = -1.90753 + (((tickAnim - 442) / 3) * (-3.00268-(-1.90753)));
            zz = 2.53338 + (((tickAnim - 442) / 3) * (0.07334-(2.53338)));
        }
        else if (tickAnim >= 445 && tickAnim < 449) {
            xx = 9.4438 + (((tickAnim - 445) / 4) * (12.99552-(9.4438)));
            yy = -3.00268 + (((tickAnim - 445) / 4) * (-3.00268-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 445) / 4) * (0.07334-(0.07334)));
        }
        else if (tickAnim >= 449 && tickAnim < 468) {
            xx = 12.99552 + (((tickAnim - 449) / 19) * (0.49552-(12.99552)));
            yy = -3.00268 + (((tickAnim - 449) / 19) * (-3.00268-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 449) / 19) * (0.07334-(0.07334)));
        }
        else if (tickAnim >= 468 && tickAnim < 532) {
            xx = 0.49552 + (((tickAnim - 468) / 64) * (0-(0.49552)));
            yy = -3.00268 + (((tickAnim - 468) / 64) * (0-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 468) / 64) * (0-(0.07334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 0) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 69) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 69) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 54) * (0.6-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 123) / 210) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 210) * (0-(0)));
            zz = 0.6 + (((tickAnim - 123) / 210) * (0-(0.6)));
        }
        else if (tickAnim >= 333 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 333) / 199) * (0-(0)));
            yy = 0 + (((tickAnim - 333) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 199) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.rotationPointX = this.Bodymiddle.rotationPointX + (float)(xx);
        this.Bodymiddle.rotationPointY = this.Bodymiddle.rotationPointY - (float)(yy);
        this.Bodymiddle.rotationPointZ = this.Bodymiddle.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (1.50716-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-5.99724-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (-0.08587-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 69) {
            xx = 1.50716 + (((tickAnim - 36) / 33) * (1.49552-(1.50716)));
            yy = -5.99724 + (((tickAnim - 36) / 33) * (-3.00268-(-5.99724)));
            zz = -0.08587 + (((tickAnim - 36) / 33) * (0.07334-(-0.08587)));
        }
        else if (tickAnim >= 69 && tickAnim < 123) {
            xx = 1.49552 + (((tickAnim - 69) / 54) * (-5.22846-(1.49552)));
            yy = -3.00268 + (((tickAnim - 69) / 54) * (8.92893-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 69) / 54) * (-2.19284-(0.07334)));
        }
        else if (tickAnim >= 123 && tickAnim < 175) {
            xx = -5.22846 + (((tickAnim - 123) / 52) * (12.47116-(-5.22846)));
            yy = 8.92893 + (((tickAnim - 123) / 52) * (12.79145-(8.92893)));
            zz = -2.19284 + (((tickAnim - 123) / 52) * (-1.13399-(-2.19284)));
        }
        else if (tickAnim >= 175 && tickAnim < 222) {
            xx = 12.47116 + (((tickAnim - 175) / 47) * (-0.04167-(12.47116)));
            yy = 12.79145 + (((tickAnim - 175) / 47) * (9.26227-(12.79145)));
            zz = -1.13399 + (((tickAnim - 175) / 47) * (4.29133-(-1.13399)));
        }
        else if (tickAnim >= 222 && tickAnim < 257) {
            xx = -0.04167 + (((tickAnim - 222) / 35) * (-6.88231-(-0.04167)));
            yy = 9.26227 + (((tickAnim - 222) / 35) * (10.89422-(9.26227)));
            zz = 4.29133 + (((tickAnim - 222) / 35) * (0.58858-(4.29133)));
        }
        else if (tickAnim >= 257 && tickAnim < 300) {
            xx = -6.88231 + (((tickAnim - 257) / 43) * (1.50716-(-6.88231)));
            yy = 10.89422 + (((tickAnim - 257) / 43) * (-5.99724-(10.89422)));
            zz = 0.58858 + (((tickAnim - 257) / 43) * (-0.08587-(0.58858)));
        }
        else if (tickAnim >= 300 && tickAnim < 333) {
            xx = 1.50716 + (((tickAnim - 300) / 33) * (1.49552-(1.50716)));
            yy = -5.99724 + (((tickAnim - 300) / 33) * (-3.00268-(-5.99724)));
            zz = -0.08587 + (((tickAnim - 300) / 33) * (0.07334-(-0.08587)));
        }
        else if (tickAnim >= 333 && tickAnim < 367) {
            xx = 1.49552 + (((tickAnim - 333) / 34) * (-2.5-(1.49552)));
            yy = -3.00268 + (((tickAnim - 333) / 34) * (0-(-3.00268)));
            zz = 0.07334 + (((tickAnim - 333) / 34) * (0-(0.07334)));
        }
        else if (tickAnim >= 367 && tickAnim < 442) {
            xx = -2.5 + (((tickAnim - 367) / 75) * (-6.67-(-2.5)));
            yy = 0 + (((tickAnim - 367) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 75) * (0-(0)));
        }
        else if (tickAnim >= 442 && tickAnim < 443) {
            xx = -6.67 + (((tickAnim - 442) / 1) * (-9.34-(-6.67)));
            yy = 0 + (((tickAnim - 442) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 442) / 1) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 445) {
            xx = -9.34 + (((tickAnim - 443) / 2) * (-1.42-(-9.34)));
            yy = 0 + (((tickAnim - 443) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 2) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 446) {
            xx = -1.42 + (((tickAnim - 445) / 1) * (5.66-(-1.42)));
            yy = 0 + (((tickAnim - 445) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 1) * (0-(0)));
        }
        else if (tickAnim >= 446 && tickAnim < 447) {
            xx = 5.66 + (((tickAnim - 446) / 1) * (17.61-(5.66)));
            yy = 0 + (((tickAnim - 446) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 446) / 1) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 448) {
            xx = 17.61 + (((tickAnim - 447) / 1) * (17.61-(17.61)));
            yy = 0 + (((tickAnim - 447) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 1) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 453) {
            xx = 17.61 + (((tickAnim - 448) / 5) * (-7.6-(17.61)));
            yy = 0 + (((tickAnim - 448) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 5) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 532) {
            xx = -7.6 + (((tickAnim - 453) / 79) * (0-(-7.6)));
            yy = 0 + (((tickAnim - 453) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 79) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));

        this.Bodyfront.rotationPointX = this.Bodyfront.rotationPointX + (float)(0);
        this.Bodyfront.rotationPointY = this.Bodyfront.rotationPointY - (float)(0);
        this.Bodyfront.rotationPointZ = this.Bodyfront.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (1.32468-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-10.84328-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (1.15915-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 69) {
            xx = 1.32468 + (((tickAnim - 36) / 33) * (1.51291-(1.32468)));
            yy = -10.84328 + (((tickAnim - 36) / 33) * (-1.06357-(-10.84328)));
            zz = 1.15915 + (((tickAnim - 36) / 33) * (-0.41675-(1.15915)));
        }
        else if (tickAnim >= 69 && tickAnim < 123) {
            xx = 1.51291 + (((tickAnim - 69) / 54) * (7.23856-(1.51291)));
            yy = -1.06357 + (((tickAnim - 69) / 54) * (11.92358-(-1.06357)));
            zz = -0.41675 + (((tickAnim - 69) / 54) * (-2.37505-(-0.41675)));
        }
        else if (tickAnim >= 123 && tickAnim < 175) {
            xx = 7.23856 + (((tickAnim - 123) / 52) * (12.47116-(7.23856)));
            yy = 11.92358 + (((tickAnim - 123) / 52) * (12.79145-(11.92358)));
            zz = -2.37505 + (((tickAnim - 123) / 52) * (-1.13399-(-2.37505)));
        }
        else if (tickAnim >= 175 && tickAnim < 222) {
            xx = 12.47116 + (((tickAnim - 175) / 47) * (17.50289-(12.47116)));
            yy = 12.79145 + (((tickAnim - 175) / 47) * (16.79247-(12.79145)));
            zz = -1.13399 + (((tickAnim - 175) / 47) * (4.28242-(-1.13399)));
        }
        else if (tickAnim >= 222 && tickAnim < 257) {
            xx = 17.50289 + (((tickAnim - 222) / 35) * (10.20874-(17.50289)));
            yy = 16.79247 + (((tickAnim - 222) / 35) * (19.88141-(16.79247)));
            zz = 4.28242 + (((tickAnim - 222) / 35) * (-1.53905-(4.28242)));
        }
        else if (tickAnim >= 257 && tickAnim < 300) {
            xx = 10.20874 + (((tickAnim - 257) / 43) * (1.32468-(10.20874)));
            yy = 19.88141 + (((tickAnim - 257) / 43) * (-10.84328-(19.88141)));
            zz = -1.53905 + (((tickAnim - 257) / 43) * (1.15915-(-1.53905)));
        }
        else if (tickAnim >= 300 && tickAnim < 333) {
            xx = 1.32468 + (((tickAnim - 300) / 33) * (11.51291-(1.32468)));
            yy = -10.84328 + (((tickAnim - 300) / 33) * (-1.06357-(-10.84328)));
            zz = 1.15915 + (((tickAnim - 300) / 33) * (-0.41675-(1.15915)));
        }
        else if (tickAnim >= 333 && tickAnim < 367) {
            xx = 11.51291 + (((tickAnim - 333) / 34) * (3.13038-(11.51291)));
            yy = -1.06357 + (((tickAnim - 333) / 34) * (-0.44316-(-1.06357)));
            zz = -0.41675 + (((tickAnim - 333) / 34) * (-0.17364-(-0.41675)));
        }
        else if (tickAnim >= 367 && tickAnim < 404) {
            xx = 3.13038 + (((tickAnim - 367) / 37) * (13.12731-(3.13038)));
            yy = -0.44316 + (((tickAnim - 367) / 37) * (-0.18992-(-0.44316)));
            zz = -0.17364 + (((tickAnim - 367) / 37) * (-0.07442-(-0.17364)));
        }
        else if (tickAnim >= 404 && tickAnim < 443) {
            xx = 13.12731 + (((tickAnim - 404) / 39) * (22.5-(13.12731)));
            yy = -0.18992 + (((tickAnim - 404) / 39) * (0-(-0.18992)));
            zz = -0.07442 + (((tickAnim - 404) / 39) * (0-(-0.07442)));
        }
        else if (tickAnim >= 443 && tickAnim < 444) {
            xx = 22.5 + (((tickAnim - 443) / 1) * (5-(22.5)));
            yy = 0 + (((tickAnim - 443) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 1) * (0-(0)));
        }
        else if (tickAnim >= 444 && tickAnim < 446) {
            xx = 5 + (((tickAnim - 444) / 2) * (8.83-(5)));
            yy = 0 + (((tickAnim - 444) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 444) / 2) * (0-(0)));
        }
        else if (tickAnim >= 446 && tickAnim < 448) {
            xx = 8.83 + (((tickAnim - 446) / 2) * (10.59-(8.83)));
            yy = 0 + (((tickAnim - 446) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 446) / 2) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = 10.59 + (((tickAnim - 448) / 0) * (10.5-(10.59)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 449) {
            xx = 10.5 + (((tickAnim - 448) / 1) * (11.06-(10.5)));
            yy = 0 + (((tickAnim - 448) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 1) * (0-(0)));
        }
        else if (tickAnim >= 449 && tickAnim < 452) {
            xx = 11.06 + (((tickAnim - 449) / 3) * (13.56-(11.06)));
            yy = 0 + (((tickAnim - 449) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 449) / 3) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = 13.56 + (((tickAnim - 452) / 1) * (1.01942-(13.56)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 454) {
            xx = 1.01942 + (((tickAnim - 453) / 1) * (3.45876-(1.01942)));
            yy = 0 + (((tickAnim - 453) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 1) * (0.41221-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 455) {
            xx = 3.45876 + (((tickAnim - 454) / 1) * (5.95878-(3.45876)));
            yy = 0 + (((tickAnim - 454) / 1) * (0-(0)));
            zz = 0.41221 + (((tickAnim - 454) / 1) * (1.58779-(0.41221)));
        }
        else if (tickAnim >= 455 && tickAnim < 456) {
            xx = 5.95878 + (((tickAnim - 455) / 1) * (8.14326-(5.95878)));
            yy = 0 + (((tickAnim - 455) / 1) * (0-(0)));
            zz = 1.58779 + (((tickAnim - 455) / 1) * (2-(1.58779)));
        }
        else if (tickAnim >= 456 && tickAnim < 457) {
            xx = 8.14326 + (((tickAnim - 456) / 1) * (11.19933-(8.14326)));
            yy = 0 + (((tickAnim - 456) / 1) * (0-(0)));
            zz = 2 + (((tickAnim - 456) / 1) * (1.61803-(2)));
        }
        else if (tickAnim >= 457 && tickAnim < 458) {
            xx = 11.19933 + (((tickAnim - 457) / 1) * (11.82659-(11.19933)));
            yy = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            zz = 1.61803 + (((tickAnim - 457) / 1) * (0.61803-(1.61803)));
        }
        else if (tickAnim >= 458 && tickAnim < 458) {
            xx = 11.82659 + (((tickAnim - 458) / 0) * (10.71449-(11.82659)));
            yy = 0 + (((tickAnim - 458) / 0) * (0-(0)));
            zz = 0.61803 + (((tickAnim - 458) / 0) * (-0.61803-(0.61803)));
        }
        else if (tickAnim >= 458 && tickAnim < 459) {
            xx = 10.71449 + (((tickAnim - 458) / 1) * (10.35483-(10.71449)));
            yy = 0 + (((tickAnim - 458) / 1) * (0-(0)));
            zz = -0.61803 + (((tickAnim - 458) / 1) * (-1.61803-(-0.61803)));
        }
        else if (tickAnim >= 459 && tickAnim < 460) {
            xx = 10.35483 + (((tickAnim - 459) / 1) * (10.40778-(10.35483)));
            yy = 0 + (((tickAnim - 459) / 1) * (0-(0)));
            zz = -1.61803 + (((tickAnim - 459) / 1) * (-2-(-1.61803)));
        }
        else if (tickAnim >= 460 && tickAnim < 461) {
            xx = 10.40778 + (((tickAnim - 460) / 1) * (11.58145-(10.40778)));
            yy = 0 + (((tickAnim - 460) / 1) * (0-(0)));
            zz = -2 + (((tickAnim - 460) / 1) * (-1.90211-(-2)));
        }
        else if (tickAnim >= 461 && tickAnim < 462) {
            xx = 11.58145 + (((tickAnim - 461) / 1) * (12.55992-(11.58145)));
            yy = 0 + (((tickAnim - 461) / 1) * (0-(0)));
            zz = -1.90211 + (((tickAnim - 461) / 1) * (-1.17557-(-1.90211)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = 12.55992 + (((tickAnim - 462) / 1) * (12.63214-(12.55992)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = -1.17557 + (((tickAnim - 462) / 1) * (0-(-1.17557)));
        }
        else if (tickAnim >= 463 && tickAnim < 463) {
            xx = 12.63214 + (((tickAnim - 463) / 0) * (12.84137-(12.63214)));
            yy = 0 + (((tickAnim - 463) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 0) * (1.17557-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 464) {
            xx = 12.84137 + (((tickAnim - 463) / 1) * (13.21207-(12.84137)));
            yy = 0 + (((tickAnim - 463) / 1) * (0-(0)));
            zz = 1.17557 + (((tickAnim - 463) / 1) * (1.90211-(1.17557)));
        }
        else if (tickAnim >= 464 && tickAnim < 465) {
            xx = 13.21207 + (((tickAnim - 464) / 1) * (13.33905-(13.21207)));
            yy = 0 + (((tickAnim - 464) / 1) * (0-(0)));
            zz = 1.90211 + (((tickAnim - 464) / 1) * (2-(1.90211)));
        }
        else if (tickAnim >= 465 && tickAnim < 466) {
            xx = 13.33905 + (((tickAnim - 465) / 1) * (13.48-(13.33905)));
            yy = 0 + (((tickAnim - 465) / 1) * (0-(0)));
            zz = 2 + (((tickAnim - 465) / 1) * (1.52585-(2)));
        }
        else if (tickAnim >= 466 && tickAnim < 468) {
            xx = 13.48 + (((tickAnim - 466) / 2) * (13.48-(13.48)));
            yy = 0 + (((tickAnim - 466) / 2) * (0-(0)));
            zz = 1.52585 + (((tickAnim - 466) / 2) * (-0.20601-(1.52585)));
        }
        else if (tickAnim >= 468 && tickAnim < 468) {
            xx = 13.48 + (((tickAnim - 468) / 0) * (11.91565-(13.48)));
            yy = 0 + (((tickAnim - 468) / 0) * (0-(0)));
            zz = -0.20601 + (((tickAnim - 468) / 0) * (-1.54429-(-0.20601)));
        }
        else if (tickAnim >= 468 && tickAnim < 469) {
            xx = 11.91565 + (((tickAnim - 468) / 1) * (10.38983-(11.91565)));
            yy = 0 + (((tickAnim - 468) / 1) * (0-(0)));
            zz = -1.54429 + (((tickAnim - 468) / 1) * (-2-(-1.54429)));
        }
        else if (tickAnim >= 469 && tickAnim < 470) {
            xx = 10.38983 + (((tickAnim - 469) / 1) * (8.94009-(10.38983)));
            yy = 0 + (((tickAnim - 469) / 1) * (0-(0)));
            zz = -2 + (((tickAnim - 469) / 1) * (-1.25242-(-2)));
        }
        else if (tickAnim >= 470 && tickAnim < 471) {
            xx = 8.94009 + (((tickAnim - 470) / 1) * (7.60215-(8.94009)));
            yy = 0 + (((tickAnim - 470) / 1) * (0-(0)));
            zz = -1.25242 + (((tickAnim - 470) / 1) * (0.37964-(-1.25242)));
        }
        else if (tickAnim >= 471 && tickAnim < 472) {
            xx = 7.60215 + (((tickAnim - 471) / 1) * (6.70724-(7.60215)));
            yy = 0 + (((tickAnim - 471) / 1) * (0-(0)));
            zz = 0.37964 + (((tickAnim - 471) / 1) * (0.5-(0.37964)));
        }
        else if (tickAnim >= 472 && tickAnim < 473) {
            xx = 6.70724 + (((tickAnim - 472) / 1) * (5.84843-(6.70724)));
            yy = 0 + (((tickAnim - 472) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 472) / 1) * (0.20611-(0.5)));
        }
        else if (tickAnim >= 473 && tickAnim < 473) {
            xx = 5.84843 + (((tickAnim - 473) / 0) * (4.93889-(5.84843)));
            yy = 0 + (((tickAnim - 473) / 0) * (0-(0)));
            zz = 0.20611 + (((tickAnim - 473) / 0) * (0.00616-(0.20611)));
        }
        else if (tickAnim >= 473 && tickAnim < 474) {
            xx = 4.93889 + (((tickAnim - 473) / 1) * (4.77491-(4.93889)));
            yy = 0 + (((tickAnim - 473) / 1) * (0-(0)));
            zz = 0.00616 + (((tickAnim - 473) / 1) * (0-(0.00616)));
        }
        else if (tickAnim >= 474 && tickAnim < 532) {
            xx = 4.77491 + (((tickAnim - 474) / 58) * (0-(4.77491)));
            yy = 0 + (((tickAnim - 474) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 474) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(0);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(0);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (1.212-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-13.2871-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (1.69811-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 69) {
            xx = 1.212 + (((tickAnim - 36) / 33) * (1.51291-(1.212)));
            yy = -13.2871 + (((tickAnim - 36) / 33) * (-1.06357-(-13.2871)));
            zz = 1.69811 + (((tickAnim - 36) / 33) * (-0.41675-(1.69811)));
        }
        else if (tickAnim >= 69 && tickAnim < 123) {
            xx = 1.51291 + (((tickAnim - 69) / 54) * (7.09814-(1.51291)));
            yy = -1.06357 + (((tickAnim - 69) / 54) * (16.89369-(-1.06357)));
            zz = -0.41675 + (((tickAnim - 69) / 54) * (-2.93883-(-0.41675)));
        }
        else if (tickAnim >= 123 && tickAnim < 175) {
            xx = 7.09814 + (((tickAnim - 123) / 52) * (12.47116-(7.09814)));
            yy = 16.89369 + (((tickAnim - 123) / 52) * (12.79145-(16.89369)));
            zz = -2.93883 + (((tickAnim - 123) / 52) * (-1.13399-(-2.93883)));
        }
        else if (tickAnim >= 175 && tickAnim < 222) {
            xx = 12.47116 + (((tickAnim - 175) / 47) * (12.50289-(12.47116)));
            yy = 12.79145 + (((tickAnim - 175) / 47) * (16.79247-(12.79145)));
            zz = -1.13399 + (((tickAnim - 175) / 47) * (4.28242-(-1.13399)));
        }
        else if (tickAnim >= 222 && tickAnim < 257) {
            xx = 12.50289 + (((tickAnim - 222) / 35) * (0.69993-(12.50289)));
            yy = 16.79247 + (((tickAnim - 222) / 35) * (12.57262-(16.79247)));
            zz = 4.28242 + (((tickAnim - 222) / 35) * (0.215-(4.28242)));
        }
        else if (tickAnim >= 257 && tickAnim < 300) {
            xx = 0.69993 + (((tickAnim - 257) / 43) * (1.212-(0.69993)));
            yy = 12.57262 + (((tickAnim - 257) / 43) * (-13.2871-(12.57262)));
            zz = 0.215 + (((tickAnim - 257) / 43) * (1.69811-(0.215)));
        }
        else if (tickAnim >= 300 && tickAnim < 333) {
            xx = 1.212 + (((tickAnim - 300) / 33) * (19.01291-(1.212)));
            yy = -13.2871 + (((tickAnim - 300) / 33) * (-1.06357-(-13.2871)));
            zz = 1.69811 + (((tickAnim - 300) / 33) * (-0.41675-(1.69811)));
        }
        else if (tickAnim >= 333 && tickAnim < 442) {
            xx = 19.01291 + (((tickAnim - 333) / 109) * (0-(19.01291)));
            yy = -1.06357 + (((tickAnim - 333) / 109) * (0-(-1.06357)));
            zz = -0.41675 + (((tickAnim - 333) / 109) * (0-(-0.41675)));
        }
        else if (tickAnim >= 442 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 442) / 1) * (-15-(0)));
            yy = 0 + (((tickAnim - 442) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 442) / 1) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 445) {
            xx = -15 + (((tickAnim - 443) / 2) * (-23.16-(-15)));
            yy = 0 + (((tickAnim - 443) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 2) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 447) {
            xx = -23.16 + (((tickAnim - 445) / 2) * (-16.33-(-23.16)));
            yy = 0 + (((tickAnim - 445) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 2) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 448) {
            xx = -16.33 + (((tickAnim - 447) / 1) * (6.83-(-16.33)));
            yy = 0 + (((tickAnim - 447) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 1) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = 6.83 + (((tickAnim - 448) / 0) * (17.33-(6.83)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 453) {
            xx = 17.33 + (((tickAnim - 448) / 5) * (0.76306-(17.33)));
            yy = 0 + (((tickAnim - 448) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 5) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 454) {
            xx = 0.76306 + (((tickAnim - 453) / 1) * (2.58894-(0.76306)));
            yy = 0 + (((tickAnim - 453) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 1) * (0.20611-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 455) {
            xx = 2.58894 + (((tickAnim - 454) / 1) * (4.46025-(2.58894)));
            yy = 0 + (((tickAnim - 454) / 1) * (0-(0)));
            zz = 0.20611 + (((tickAnim - 454) / 1) * (0.79389-(0.20611)));
        }
        else if (tickAnim >= 455 && tickAnim < 456) {
            xx = 4.46025 + (((tickAnim - 455) / 1) * (6.09537-(4.46025)));
            yy = 0 + (((tickAnim - 455) / 1) * (0-(0)));
            zz = 0.79389 + (((tickAnim - 455) / 1) * (1-(0.79389)));
        }
        else if (tickAnim >= 456 && tickAnim < 457) {
            xx = 6.09537 + (((tickAnim - 456) / 1) * (8.38288-(6.09537)));
            yy = 0 + (((tickAnim - 456) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 456) / 1) * (0.80902-(1)));
        }
        else if (tickAnim >= 457 && tickAnim < 458) {
            xx = 8.38288 + (((tickAnim - 457) / 1) * (8.8524-(8.38288)));
            yy = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            zz = 0.80902 + (((tickAnim - 457) / 1) * (0.30902-(0.80902)));
        }
        else if (tickAnim >= 458 && tickAnim < 458) {
            xx = 8.8524 + (((tickAnim - 458) / 0) * (8.01997-(8.8524)));
            yy = 0 + (((tickAnim - 458) / 0) * (0-(0)));
            zz = 0.30902 + (((tickAnim - 458) / 0) * (-0.30902-(0.30902)));
        }
        else if (tickAnim >= 458 && tickAnim < 459) {
            xx = 8.01997 + (((tickAnim - 458) / 1) * (7.75076-(8.01997)));
            yy = 0 + (((tickAnim - 458) / 1) * (0-(0)));
            zz = -0.30902 + (((tickAnim - 458) / 1) * (-0.80902-(-0.30902)));
        }
        else if (tickAnim >= 459 && tickAnim < 460) {
            xx = 7.75076 + (((tickAnim - 459) / 1) * (7.7904-(7.75076)));
            yy = 0 + (((tickAnim - 459) / 1) * (0-(0)));
            zz = -0.80902 + (((tickAnim - 459) / 1) * (-1-(-0.80902)));
        }
        else if (tickAnim >= 460 && tickAnim < 461) {
            xx = 7.7904 + (((tickAnim - 460) / 1) * (8.66891-(7.7904)));
            yy = 0 + (((tickAnim - 460) / 1) * (0-(0)));
            zz = -1 + (((tickAnim - 460) / 1) * (-0.95106-(-1)));
        }
        else if (tickAnim >= 461 && tickAnim < 462) {
            xx = 8.66891 + (((tickAnim - 461) / 1) * (9.40131-(8.66891)));
            yy = 0 + (((tickAnim - 461) / 1) * (0-(0)));
            zz = -0.95106 + (((tickAnim - 461) / 1) * (-0.58779-(-0.95106)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = 9.40131 + (((tickAnim - 462) / 1) * (9.45536-(9.40131)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = -0.58779 + (((tickAnim - 462) / 1) * (0-(-0.58779)));
        }
        else if (tickAnim >= 463 && tickAnim < 463) {
            xx = 9.45536 + (((tickAnim - 463) / 0) * (9.61198-(9.45536)));
            yy = 0 + (((tickAnim - 463) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 0) * (0.58779-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 464) {
            xx = 9.61198 + (((tickAnim - 463) / 1) * (9.88945-(9.61198)));
            yy = 0 + (((tickAnim - 463) / 1) * (0-(0)));
            zz = 0.58779 + (((tickAnim - 463) / 1) * (0.95106-(0.58779)));
        }
        else if (tickAnim >= 464 && tickAnim < 465) {
            xx = 9.88945 + (((tickAnim - 464) / 1) * (9.9845-(9.88945)));
            yy = 0 + (((tickAnim - 464) / 1) * (0-(0)));
            zz = 0.95106 + (((tickAnim - 464) / 1) * (1-(0.95106)));
        }
        else if (tickAnim >= 465 && tickAnim < 466) {
            xx = 9.9845 + (((tickAnim - 465) / 1) * (10.09-(9.9845)));
            yy = 0 + (((tickAnim - 465) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 465) / 1) * (0.76293-(1)));
        }
        else if (tickAnim >= 466 && tickAnim < 468) {
            xx = 10.09 + (((tickAnim - 466) / 2) * (10.09-(10.09)));
            yy = 0 + (((tickAnim - 466) / 2) * (0-(0)));
            zz = 0.76293 + (((tickAnim - 466) / 2) * (-0.10301-(0.76293)));
        }
        else if (tickAnim >= 468 && tickAnim < 468) {
            xx = 10.09 + (((tickAnim - 468) / 0) * (9.93357-(10.09)));
            yy = 0 + (((tickAnim - 468) / 0) * (0-(0)));
            zz = -0.10301 + (((tickAnim - 468) / 0) * (-0.77215-(-0.10301)));
        }
        else if (tickAnim >= 468 && tickAnim < 469) {
            xx = 9.93357 + (((tickAnim - 468) / 1) * (9.78098-(9.93357)));
            yy = 0 + (((tickAnim - 468) / 1) * (0-(0)));
            zz = -0.77215 + (((tickAnim - 468) / 1) * (-1-(-0.77215)));
        }
        else if (tickAnim >= 469 && tickAnim < 470) {
            xx = 9.78098 + (((tickAnim - 469) / 1) * (9.63601-(9.78098)));
            yy = 0 + (((tickAnim - 469) / 1) * (0-(0)));
            zz = -1 + (((tickAnim - 469) / 1) * (-0.70097-(-1)));
        }
        else if (tickAnim >= 470 && tickAnim < 471) {
            xx = 9.63601 + (((tickAnim - 470) / 1) * (9.50221-(9.63601)));
            yy = 0 + (((tickAnim - 470) / 1) * (0-(0)));
            zz = -0.70097 + (((tickAnim - 470) / 1) * (-0.04814-(-0.70097)));
        }
        else if (tickAnim >= 471 && tickAnim < 473) {
            xx = 9.50221 + (((tickAnim - 471) / 2) * (9.38289-(9.50221)));
            yy = 0 + (((tickAnim - 471) / 2) * (0-(0)));
            zz = -0.04814 + (((tickAnim - 471) / 2) * (0-(-0.04814)));
        }
        else if (tickAnim >= 473 && tickAnim < 473) {
            xx = 9.38289 + (((tickAnim - 473) / 0) * (9.28098-(9.38289)));
            yy = 0 + (((tickAnim - 473) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 0) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 474) {
            xx = 9.28098 + (((tickAnim - 473) / 1) * (9.19899-(9.28098)));
            yy = 0 + (((tickAnim - 473) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 1) * (0-(0)));
        }
        else if (tickAnim >= 474 && tickAnim < 532) {
            xx = 9.19899 + (((tickAnim - 474) / 58) * (0-(9.19899)));
            yy = 0 + (((tickAnim - 474) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 474) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(0);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(0);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.26937-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-8.99689-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.15887-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 78) {
            xx = -2.26937 + (((tickAnim - 40) / 38) * (-2.24451-(-2.26937)));
            yy = -8.99689 + (((tickAnim - 40) / 38) * (-3.00154-(-8.99689)));
            zz = 0.15887 + (((tickAnim - 40) / 38) * (-0.07861-(0.15887)));
        }
        else if (tickAnim >= 78 && tickAnim < 115) {
            xx = -2.24451 + (((tickAnim - 78) / 37) * (-7.56704-(-2.24451)));
            yy = -3.00154 + (((tickAnim - 78) / 37) * (25.05514-(-3.00154)));
            zz = -0.07861 + (((tickAnim - 78) / 37) * (0.92013-(-0.07861)));
        }
        else if (tickAnim >= 115 && tickAnim < 166) {
            xx = -7.56704 + (((tickAnim - 115) / 51) * (-13.56439-(-7.56704)));
            yy = 25.05514 + (((tickAnim - 115) / 51) * (31.99446-(25.05514)));
            zz = 0.92013 + (((tickAnim - 115) / 51) * (-0.12324-(0.92013)));
        }
        else if (tickAnim >= 166 && tickAnim < 213) {
            xx = -13.56439 + (((tickAnim - 166) / 47) * (10-(-13.56439)));
            yy = 31.99446 + (((tickAnim - 166) / 47) * (10-(31.99446)));
            zz = -0.12324 + (((tickAnim - 166) / 47) * (0-(-0.12324)));
        }
        else if (tickAnim >= 213 && tickAnim < 249) {
            xx = 10 + (((tickAnim - 213) / 36) * (9.06687-(10)));
            yy = 10 + (((tickAnim - 213) / 36) * (14.03392-(10)));
            zz = 0 + (((tickAnim - 213) / 36) * (0.26677-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 303) {
            xx = 9.06687 + (((tickAnim - 249) / 54) * (5.23063-(9.06687)));
            yy = 14.03392 + (((tickAnim - 249) / 54) * (-8.99689-(14.03392)));
            zz = 0.26677 + (((tickAnim - 249) / 54) * (0.15887-(0.26677)));
        }
        else if (tickAnim >= 303 && tickAnim < 340) {
            xx = 5.23063 + (((tickAnim - 303) / 37) * (12.75549-(5.23063)));
            yy = -8.99689 + (((tickAnim - 303) / 37) * (-3.00154-(-8.99689)));
            zz = 0.15887 + (((tickAnim - 303) / 37) * (-0.07861-(0.15887)));
        }
        else if (tickAnim >= 340 && tickAnim < 443) {
            xx = 12.75549 + (((tickAnim - 340) / 103) * (6.5-(12.75549)));
            yy = -3.00154 + (((tickAnim - 340) / 103) * (0-(-3.00154)));
            zz = -0.07861 + (((tickAnim - 340) / 103) * (0-(-0.07861)));
        }
        else if (tickAnim >= 443 && tickAnim < 444) {
            xx = 6.5 + (((tickAnim - 443) / 1) * (9.17-(6.5)));
            yy = 0 + (((tickAnim - 443) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 1) * (0-(0)));
        }
        else if (tickAnim >= 444 && tickAnim < 446) {
            xx = 9.17 + (((tickAnim - 444) / 2) * (9.5-(9.17)));
            yy = 0 + (((tickAnim - 444) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 444) / 2) * (0-(0)));
        }
        else if (tickAnim >= 446 && tickAnim < 448) {
            xx = 9.5 + (((tickAnim - 446) / 2) * (19.83-(9.5)));
            yy = 0 + (((tickAnim - 446) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 446) / 2) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = 19.83 + (((tickAnim - 448) / 0) * (0.34-(19.83)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 449) {
            xx = 0.34 + (((tickAnim - 448) / 1) * (4.84-(0.34)));
            yy = 0 + (((tickAnim - 448) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 1) * (0-(0)));
        }
        else if (tickAnim >= 449 && tickAnim < 453) {
            xx = 4.84 + (((tickAnim - 449) / 4) * (0-(4.84)));
            yy = 0 + (((tickAnim - 449) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 449) / 4) * (2.38729-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 454) {
            xx = 0 + (((tickAnim - 453) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 453) / 1) * (0-(0)));
            zz = 2.38729 + (((tickAnim - 453) / 1) * (16.36271-(2.38729)));
        }
        else if (tickAnim >= 454 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 454) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 454) / 1) * (0-(0)));
            zz = 16.36271 + (((tickAnim - 454) / 1) * (25-(16.36271)));
        }
        else if (tickAnim >= 455 && tickAnim < 456) {
            xx = 0 + (((tickAnim - 455) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 455) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 455) / 1) * (23.77641-(25)));
        }
        else if (tickAnim >= 456 && tickAnim < 457) {
            xx = 0 + (((tickAnim - 456) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 456) / 1) * (0-(0)));
            zz = 23.77641 + (((tickAnim - 456) / 1) * (14.69463-(23.77641)));
        }
        else if (tickAnim >= 457 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            zz = 14.69463 + (((tickAnim - 457) / 1) * (0-(14.69463)));
        }
        else if (tickAnim >= 458 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 458) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 458) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 458) / 0) * (-14.69463-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 459) {
            xx = 0 + (((tickAnim - 458) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 458) / 1) * (0-(0)));
            zz = -14.69463 + (((tickAnim - 458) / 1) * (-23.77641-(-14.69463)));
        }
        else if (tickAnim >= 459 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 459) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 459) / 1) * (0-(0)));
            zz = -23.77641 + (((tickAnim - 459) / 1) * (-25-(-23.77641)));
        }
        else if (tickAnim >= 460 && tickAnim < 461) {
            xx = 0 + (((tickAnim - 460) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 1) * (0-(0)));
            zz = -25 + (((tickAnim - 460) / 1) * (-20.22542-(-25)));
        }
        else if (tickAnim >= 461 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 461) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 461) / 1) * (0-(0)));
            zz = -20.22542 + (((tickAnim - 461) / 1) * (0-(-20.22542)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 1) * (14.69463-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 463) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 0) * (0-(0)));
            zz = 14.69463 + (((tickAnim - 463) / 0) * (23.77641-(14.69463)));
        }
        else if (tickAnim >= 463 && tickAnim < 464) {
            xx = 0 + (((tickAnim - 463) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 1) * (0-(0)));
            zz = 23.77641 + (((tickAnim - 463) / 1) * (25-(23.77641)));
        }
        else if (tickAnim >= 464 && tickAnim < 465) {
            xx = 0 + (((tickAnim - 464) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 464) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 464) / 1) * (20.22542-(25)));
        }
        else if (tickAnim >= 465 && tickAnim < 466) {
            xx = 0 + (((tickAnim - 465) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 465) / 1) * (0-(0)));
            zz = 20.22542 + (((tickAnim - 465) / 1) * (7.72542-(20.22542)));
        }
        else if (tickAnim >= 466 && tickAnim < 467) {
            xx = 0 + (((tickAnim - 466) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 466) / 1) * (0-(0)));
            zz = 7.72542 + (((tickAnim - 466) / 1) * (-7.72542-(7.72542)));
        }
        else if (tickAnim >= 467 && tickAnim < 468) {
            xx = 0 + (((tickAnim - 467) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 467) / 1) * (0-(0)));
            zz = -7.72542 + (((tickAnim - 467) / 1) * (-20.22542-(-7.72542)));
        }
        else if (tickAnim >= 468 && tickAnim < 468) {
            xx = 0 + (((tickAnim - 468) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 468) / 0) * (0-(0)));
            zz = -20.22542 + (((tickAnim - 468) / 0) * (-25-(-20.22542)));
        }
        else if (tickAnim >= 468 && tickAnim < 469) {
            xx = 0 + (((tickAnim - 468) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 468) / 1) * (0-(0)));
            zz = -25 + (((tickAnim - 468) / 1) * (-18.19846-(-25)));
        }
        else if (tickAnim >= 469 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 469) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 469) / 1) * (0-(0)));
            zz = -18.19846 + (((tickAnim - 469) / 1) * (1.19846-(-18.19846)));
        }
        else if (tickAnim >= 470 && tickAnim < 471) {
            xx = 0 + (((tickAnim - 470) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 1) * (0-(0)));
            zz = 1.19846 + (((tickAnim - 470) / 1) * (8-(1.19846)));
        }
        else if (tickAnim >= 471 && tickAnim < 472) {
            xx = 0 + (((tickAnim - 471) / 1) * (-3.8425-(0)));
            yy = 0 + (((tickAnim - 471) / 1) * (0-(0)));
            zz = 8 + (((tickAnim - 471) / 1) * (3.29772-(8)));
        }
        else if (tickAnim >= 472 && tickAnim < 473) {
            xx = -3.8425 + (((tickAnim - 472) / 1) * (-7.3225-(-3.8425)));
            yy = 0 + (((tickAnim - 472) / 1) * (0-(0)));
            zz = 3.29772 + (((tickAnim - 472) / 1) * (0.39155-(3.29772)));
        }
        else if (tickAnim >= 473 && tickAnim < 473) {
            xx = -7.3225 + (((tickAnim - 473) / 0) * (-8.7-(-7.3225)));
            yy = 0 + (((tickAnim - 473) / 0) * (0-(0)));
            zz = 0.39155 + (((tickAnim - 473) / 0) * (0-(0.39155)));
        }
        else if (tickAnim >= 473 && tickAnim < 532) {
            xx = -8.7 + (((tickAnim - 473) / 59) * (0-(-8.7)));
            yy = 0 + (((tickAnim - 473) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 431 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 431) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 431) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 431) / 12) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 443) / 89) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 89) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.28915-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-5.19646-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-4.7452-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 84) {
            xx = 9.28915 + (((tickAnim - 40) / 44) * (15.74255-(9.28915)));
            yy = -5.19646 + (((tickAnim - 40) / 44) * (7.56551-(-5.19646)));
            zz = -4.7452 + (((tickAnim - 40) / 44) * (-6.77573-(-4.7452)));
        }
        else if (tickAnim >= 84 && tickAnim < 137) {
            xx = 15.74255 + (((tickAnim - 84) / 53) * (10-(15.74255)));
            yy = 7.56551 + (((tickAnim - 84) / 53) * (0-(7.56551)));
            zz = -6.77573 + (((tickAnim - 84) / 53) * (0-(-6.77573)));
        }
        else if (tickAnim >= 137 && tickAnim < 190) {
            xx = 10 + (((tickAnim - 137) / 53) * (-5-(10)));
            yy = 0 + (((tickAnim - 137) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 53) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 222) {
            xx = -5 + (((tickAnim - 190) / 32) * (3.47165-(-5)));
            yy = 0 + (((tickAnim - 190) / 32) * (-4.35378-(0)));
            zz = 0 + (((tickAnim - 190) / 32) * (6.18513-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 303) {
            xx = 3.47165 + (((tickAnim - 222) / 81) * (9.28915-(3.47165)));
            yy = -4.35378 + (((tickAnim - 222) / 81) * (-5.19646-(-4.35378)));
            zz = 6.18513 + (((tickAnim - 222) / 81) * (-4.7452-(6.18513)));
        }
        else if (tickAnim >= 303 && tickAnim < 369) {
            xx = 9.28915 + (((tickAnim - 303) / 66) * (-0.88911-(9.28915)));
            yy = -5.19646 + (((tickAnim - 303) / 66) * (-3.69821-(-5.19646)));
            zz = -4.7452 + (((tickAnim - 303) / 66) * (-3.37706-(-4.7452)));
        }
        else if (tickAnim >= 369 && tickAnim < 457) {
            xx = -0.88911 + (((tickAnim - 369) / 88) * (19.53493-(-0.88911)));
            yy = -3.69821 + (((tickAnim - 369) / 88) * (-1.93445-(-3.69821)));
            zz = -3.37706 + (((tickAnim - 369) / 88) * (-1.76646-(-3.37706)));
        }
        else if (tickAnim >= 457 && tickAnim < 465) {
            xx = 19.53493 + (((tickAnim - 457) / 8) * (9.74696-(19.53493)));
            yy = -1.93445 + (((tickAnim - 457) / 8) * (-1.46032-(-1.93445)));
            zz = -1.76646 + (((tickAnim - 457) / 8) * (-1.3335-(-1.76646)));
        }
        else if (tickAnim >= 465 && tickAnim < 532) {
            xx = 9.74696 + (((tickAnim - 465) / 67) * (0-(9.74696)));
            yy = -1.46032 + (((tickAnim - 465) / 67) * (0-(-1.46032)));
            zz = -1.3335 + (((tickAnim - 465) / 67) * (0-(-1.3335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm1.rotationPointX = this.Leftarm1.rotationPointX + (float)(xx);
        this.Leftarm1.rotationPointY = this.Leftarm1.rotationPointY - (float)(yy);
        this.Leftarm1.rotationPointZ = this.Leftarm1.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-0.03089-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.33408-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.24897-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 110) {
            xx = -0.03089 + (((tickAnim - 33) / 77) * (-17.53089-(-0.03089)));
            yy = -0.33408 + (((tickAnim - 33) / 77) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 33) / 77) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = -17.53089 + (((tickAnim - 110) / 35) * (-5.03089-(-17.53089)));
            yy = -0.33408 + (((tickAnim - 110) / 35) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 110) / 35) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 145 && tickAnim < 196) {
            xx = -5.03089 + (((tickAnim - 145) / 51) * (9.96911-(-5.03089)));
            yy = -0.33408 + (((tickAnim - 145) / 51) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 145) / 51) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 196 && tickAnim < 228) {
            xx = 9.96911 + (((tickAnim - 196) / 32) * (25.16433-(9.96911)));
            yy = -0.33408 + (((tickAnim - 196) / 32) * (3.96687-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 196) / 32) * (7.39776-(1.24897)));
        }
        else if (tickAnim >= 228 && tickAnim < 296) {
            xx = 25.16433 + (((tickAnim - 228) / 68) * (-0.03089-(25.16433)));
            yy = 3.96687 + (((tickAnim - 228) / 68) * (-0.33408-(3.96687)));
            zz = 7.39776 + (((tickAnim - 228) / 68) * (1.24897-(7.39776)));
        }
        else if (tickAnim >= 296 && tickAnim < 369) {
            xx = -0.03089 + (((tickAnim - 296) / 73) * (9.97871-(-0.03089)));
            yy = -0.33408 + (((tickAnim - 296) / 73) * (-0.23019-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 296) / 73) * (0.8606-(1.24897)));
        }
        else if (tickAnim >= 369 && tickAnim < 457) {
            xx = 9.97871 + (((tickAnim - 369) / 88) * (-9.78037-(9.97871)));
            yy = -0.23019 + (((tickAnim - 369) / 88) * (-0.12041-(-0.23019)));
            zz = 0.8606 + (((tickAnim - 369) / 88) * (0.45016-(0.8606)));
        }
        else if (tickAnim >= 457 && tickAnim < 465) {
            xx = -9.78037 + (((tickAnim - 457) / 8) * (12.61678-(-9.78037)));
            yy = -0.12041 + (((tickAnim - 457) / 8) * (-0.0909-(-0.12041)));
            zz = 0.45016 + (((tickAnim - 457) / 8) * (0.33983-(0.45016)));
        }
        else if (tickAnim >= 465 && tickAnim < 532) {
            xx = 12.61678 + (((tickAnim - 465) / 67) * (0-(12.61678)));
            yy = -0.0909 + (((tickAnim - 465) / 67) * (0-(-0.0909)));
            zz = 0.33983 + (((tickAnim - 465) / 67) * (0-(0.33983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm2.rotationPointX = this.Leftarm2.rotationPointX + (float)(xx);
        this.Leftarm2.rotationPointY = this.Leftarm2.rotationPointY - (float)(yy);
        this.Leftarm2.rotationPointZ = this.Leftarm2.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 28) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 28) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 28) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5 + (((tickAnim - 48) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5 + (((tickAnim - 48) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5)));
        }
        else if (tickAnim >= 63 && tickAnim < 101) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5 + (((tickAnim - 63) / 38) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5)));
            yy = 0 + (((tickAnim - 63) / 38) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5 + (((tickAnim - 63) / 38) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5)));
        }
        else if (tickAnim >= 101 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 101) / 37) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 101) / 37) * (6-(0)));
            zz = 0 + (((tickAnim - 101) / 37) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 182) {
            xx = -7.5 + (((tickAnim - 138) / 44) * (0-(-7.5)));
            yy = 6 + (((tickAnim - 138) / 44) * (11-(6)));
            zz = 0 + (((tickAnim - 138) / 44) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 217) {
            xx = 0 + (((tickAnim - 182) / 35) * (0-(0)));
            yy = 11 + (((tickAnim - 182) / 35) * (2-(11)));
            zz = 0 + (((tickAnim - 182) / 35) * (0-(0)));
        }
        else if (tickAnim >= 217 && tickAnim < 257) {
            xx = 0 + (((tickAnim - 217) / 40) * (-0.15564-(0)));
            yy = 2 + (((tickAnim - 217) / 40) * (-1.40433-(2)));
            zz = 0 + (((tickAnim - 217) / 40) * (-4.73232-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 292) {
            xx = -0.15564 + (((tickAnim - 257) / 35) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(-0.15564)));
            yy = -1.40433 + (((tickAnim - 257) / 35) * (0-(-1.40433)));
            zz = -4.73232 + (((tickAnim - 257) / 35) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(-4.73232)));
        }
        else if (tickAnim >= 292 && tickAnim < 309) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 292) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 292) / 17) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 292) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 309 && tickAnim < 328) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5 + (((tickAnim - 309) / 19) * (17.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5)));
            yy = 0 + (((tickAnim - 309) / 19) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5 + (((tickAnim - 309) / 19) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-120))*5)));
        }
        else if (tickAnim >= 328 && tickAnim < 442) {
            xx = 17.5 + (((tickAnim - 328) / 114) * (0-(17.5)));
            yy = 0 + (((tickAnim - 328) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 114) * (0-(0)));
        }
        else if (tickAnim >= 442 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 442) / 1) * (6.67-(0)));
            yy = 0 + (((tickAnim - 442) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 442) / 1) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 445) {
            xx = 6.67 + (((tickAnim - 443) / 2) * (4-(6.67)));
            yy = 0 + (((tickAnim - 443) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 2) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 447) {
            xx = 4 + (((tickAnim - 445) / 2) * (-2.41-(4)));
            yy = 0 + (((tickAnim - 445) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 2) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 448) {
            xx = -2.41 + (((tickAnim - 447) / 1) * (2.33-(-2.41)));
            yy = 0 + (((tickAnim - 447) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 1) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = 2.33 + (((tickAnim - 448) / 0) * (8.34-(2.33)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 450) {
            xx = 8.34 + (((tickAnim - 448) / 2) * (8.67-(8.34)));
            yy = 0 + (((tickAnim - 448) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 2) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 452) {
            xx = 8.67 + (((tickAnim - 450) / 2) * (6.33-(8.67)));
            yy = 0 + (((tickAnim - 450) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 2) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = 6.33 + (((tickAnim - 452) / 1) * (3-(6.33)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 455) {
            xx = 3 + (((tickAnim - 453) / 2) * (0.75-(3)));
            yy = 0 + (((tickAnim - 453) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 2) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 457) {
            xx = 0.75 + (((tickAnim - 455) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 455) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 2) * (0-(0)));
        }
        else if (tickAnim >= 457 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 457) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 457) / 1) * (0-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 458) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 458) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 458) / 74) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);





        if (tickAnim >= 249 && tickAnim < 313) {
            xx = 2.5 + (((tickAnim - 249) / 64) * (0-(2.5)));
            yy = 0 + (((tickAnim - 249) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 64) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 313) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 313) / 27) * (-10-(0)));
            zz = 0 + (((tickAnim - 313) / 27) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 382) {
            xx = 0 + (((tickAnim - 340) / 42) * (0-(0)));
            yy = -10 + (((tickAnim - 340) / 42) * (5.55-(-10)));
            zz = 0 + (((tickAnim - 340) / 42) * (0-(0)));
        }
        else if (tickAnim >= 382 && tickAnim < 442) {
            xx = 0 + (((tickAnim - 382) / 60) * (12.54202-(0)));
            yy = 5.55 + (((tickAnim - 382) / 60) * (-0.48254-(5.55)));
            zz = 0 + (((tickAnim - 382) / 60) * (0.82281-(0)));
        }
        else if (tickAnim >= 442 && tickAnim < 443) {
            xx = 12.54202 + (((tickAnim - 442) / 1) * (15-(12.54202)));
            yy = -0.48254 + (((tickAnim - 442) / 1) * (0-(-0.48254)));
            zz = 0.82281 + (((tickAnim - 442) / 1) * (0-(0.82281)));
        }
        else if (tickAnim >= 443 && tickAnim < 445) {
            xx = 15 + (((tickAnim - 443) / 2) * (11.67-(15)));
            yy = 0 + (((tickAnim - 443) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 2) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 447) {
            xx = 11.67 + (((tickAnim - 445) / 2) * (1.67-(11.67)));
            yy = 0 + (((tickAnim - 445) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 2) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 448) {
            xx = 1.67 + (((tickAnim - 447) / 1) * (-15-(1.67)));
            yy = 0 + (((tickAnim - 447) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 1) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = -15 + (((tickAnim - 448) / 0) * (0.28-(-15)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 451) {
            xx = 0.28 + (((tickAnim - 448) / 3) * (0-(0.28)));
            yy = 0 + (((tickAnim - 448) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 3) * (0-(0)));
        }
        else if (tickAnim >= 451 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 451) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 451) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 451) / 81) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(0);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(0);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(0);




        if (tickAnim >= 443 && tickAnim < 444) {
            xx = 0 + (((tickAnim - 443) / 1) * (30-(0)));
            yy = 0 + (((tickAnim - 443) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 1) * (0-(0)));
        }
        else if (tickAnim >= 444 && tickAnim < 446) {
            xx = 30 + (((tickAnim - 444) / 2) * (50.84-(30)));
            yy = 0 + (((tickAnim - 444) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 444) / 2) * (0-(0)));
        }
        else if (tickAnim >= 446 && tickAnim < 448) {
            xx = 50.84 + (((tickAnim - 446) / 2) * (49.17-(50.84)));
            yy = 0 + (((tickAnim - 446) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 446) / 2) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 448) {
            xx = 49.17 + (((tickAnim - 448) / 0) * (8.34-(49.17)));
            yy = 0 + (((tickAnim - 448) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 0) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 532) {
            xx = 8.34 + (((tickAnim - 448) / 84) * (0-(8.34)));
            yy = 0 + (((tickAnim - 448) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 84) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.Lowerjaw.rotationPointX = this.Lowerjaw.rotationPointX + (float)(0);
        this.Lowerjaw.rotationPointY = this.Lowerjaw.rotationPointY - (float)(0);
        this.Lowerjaw.rotationPointZ = this.Lowerjaw.rotationPointZ + (float)(0);




        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -10 + (((tickAnim - 48) / 4) * (3-(-10)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 3 + (((tickAnim - 52) / 2) * (-10-(3)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 54) / 6) * (3-(-10)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 3 + (((tickAnim - 60) / 3) * (-5-(3)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -5 + (((tickAnim - 63) / 5) * (3-(-5)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 3 + (((tickAnim - 68) / 5) * (-4-(3)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = -4 + (((tickAnim - 73) / 6) * (3-(-4)));
            yy = 0 + (((tickAnim - 73) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 6) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 3 + (((tickAnim - 79) / 4) * (-5-(3)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = -5 + (((tickAnim - 83) / 5) * (3-(-5)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 3 + (((tickAnim - 88) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 101) / 431) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 431) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 431) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 28) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 44) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0.3 + (((tickAnim - 74) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 79 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 79) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 22) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 101) / 431) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 431) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 431) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (9.28915-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-5.19646-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-4.7452-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 68) {
            xx = 9.28915 + (((tickAnim - 33) / 35) * (15.74255-(9.28915)));
            yy = -5.19646 + (((tickAnim - 33) / 35) * (7.56551-(-5.19646)));
            zz = -4.7452 + (((tickAnim - 33) / 35) * (-6.77573-(-4.7452)));
        }
        else if (tickAnim >= 68 && tickAnim < 111) {
            xx = 15.74255 + (((tickAnim - 68) / 43) * (10-(15.74255)));
            yy = 7.56551 + (((tickAnim - 68) / 43) * (0-(7.56551)));
            zz = -6.77573 + (((tickAnim - 68) / 43) * (0-(-6.77573)));
        }
        else if (tickAnim >= 111 && tickAnim < 153) {
            xx = 10 + (((tickAnim - 111) / 42) * (-5-(10)));
            yy = 0 + (((tickAnim - 111) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 42) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 181) {
            xx = -5 + (((tickAnim - 153) / 28) * (3.47165-(-5)));
            yy = 0 + (((tickAnim - 153) / 28) * (-4.35378-(0)));
            zz = 0 + (((tickAnim - 153) / 28) * (6.18513-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 237) {
            xx = 3.47165 + (((tickAnim - 181) / 56) * (4.28207-(3.47165)));
            yy = -4.35378 + (((tickAnim - 181) / 56) * (0.75834-(-4.35378)));
            zz = 6.18513 + (((tickAnim - 181) / 56) * (-1.01164-(6.18513)));
        }
        else if (tickAnim >= 237 && tickAnim < 348) {
            xx = 4.28207 + (((tickAnim - 237) / 111) * (2.41591-(4.28207)));
            yy = 0.75834 + (((tickAnim - 237) / 111) * (2.51932-(0.75834)));
            zz = -1.01164 + (((tickAnim - 237) / 111) * (0.82593-(-1.01164)));
        }
        else if (tickAnim >= 348 && tickAnim < 393) {
            xx = 2.41591 + (((tickAnim - 348) / 45) * (-5.6661-(2.41591)));
            yy = 2.51932 + (((tickAnim - 348) / 45) * (1.91239-(2.51932)));
            zz = 0.82593 + (((tickAnim - 348) / 45) * (0.62695-(0.82593)));
        }
        else if (tickAnim >= 393 && tickAnim < 451) {
            xx = -5.6661 + (((tickAnim - 393) / 58) * (-8.43206-(-5.6661)));
            yy = 1.91239 + (((tickAnim - 393) / 58) * (6.69404-(1.91239)));
            zz = 0.62695 + (((tickAnim - 393) / 58) * (0.61418-(0.62695)));
        }
        else if (tickAnim >= 451 && tickAnim < 532) {
            xx = -8.43206 + (((tickAnim - 451) / 81) * (0-(-8.43206)));
            yy = 6.69404 + (((tickAnim - 451) / 81) * (0-(6.69404)));
            zz = 0.61418 + (((tickAnim - 451) / 81) * (0-(0.61418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm1.rotationPointX = this.Rightarm1.rotationPointX + (float)(xx);
        this.Rightarm1.rotationPointY = this.Rightarm1.rotationPointY - (float)(yy);
        this.Rightarm1.rotationPointZ = this.Rightarm1.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-0.03089-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.33408-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.24897-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 110) {
            xx = -0.03089 + (((tickAnim - 33) / 77) * (-17.53089-(-0.03089)));
            yy = -0.33408 + (((tickAnim - 33) / 77) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 33) / 77) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = -17.53089 + (((tickAnim - 110) / 35) * (-5.03089-(-17.53089)));
            yy = -0.33408 + (((tickAnim - 110) / 35) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 110) / 35) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 145 && tickAnim < 196) {
            xx = -5.03089 + (((tickAnim - 145) / 51) * (9.96911-(-5.03089)));
            yy = -0.33408 + (((tickAnim - 145) / 51) * (-0.33408-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 145) / 51) * (1.24897-(1.24897)));
        }
        else if (tickAnim >= 196 && tickAnim < 228) {
            xx = 9.96911 + (((tickAnim - 196) / 32) * (25.16433-(9.96911)));
            yy = -0.33408 + (((tickAnim - 196) / 32) * (3.96687-(-0.33408)));
            zz = 1.24897 + (((tickAnim - 196) / 32) * (7.39776-(1.24897)));
        }
        else if (tickAnim >= 228 && tickAnim < 263) {
            xx = 25.16433 + (((tickAnim - 228) / 35) * (22.14346-(25.16433)));
            yy = 3.96687 + (((tickAnim - 228) / 35) * (-1.09194-(3.96687)));
            zz = 7.39776 + (((tickAnim - 228) / 35) * (0.62174-(7.39776)));
        }
        else if (tickAnim >= 263 && tickAnim < 348) {
            xx = 22.14346 + (((tickAnim - 263) / 85) * (15.09135-(22.14346)));
            yy = -1.09194 + (((tickAnim - 263) / 85) * (6.32209-(-1.09194)));
            zz = 0.62174 + (((tickAnim - 263) / 85) * (3.97089-(0.62174)));
        }
        else if (tickAnim >= 348 && tickAnim < 393) {
            xx = 15.09135 + (((tickAnim - 348) / 45) * (-1.04429-(15.09135)));
            yy = 6.32209 + (((tickAnim - 348) / 45) * (4.79904-(6.32209)));
            zz = 3.97089 + (((tickAnim - 348) / 45) * (3.01426-(3.97089)));
        }
        else if (tickAnim >= 393 && tickAnim < 464) {
            xx = -1.04429 + (((tickAnim - 393) / 71) * (16.99349-(-1.04429)));
            yy = 4.79904 + (((tickAnim - 393) / 71) * (2.32768-(4.79904)));
            zz = 3.01426 + (((tickAnim - 393) / 71) * (1.46201-(3.01426)));
        }
        else if (tickAnim >= 464 && tickAnim < 532) {
            xx = 16.99349 + (((tickAnim - 464) / 68) * (0-(16.99349)));
            yy = 2.32768 + (((tickAnim - 464) / 68) * (0-(2.32768)));
            zz = 1.46201 + (((tickAnim - 464) / 68) * (0-(1.46201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.rotationPointX = this.Rightarm2.rotationPointX + (float)(xx);
        this.Rightarm2.rotationPointY = this.Rightarm2.rotationPointY - (float)(yy);
        this.Rightarm2.rotationPointZ = this.Rightarm2.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 337) {
            xx = 0 + (((tickAnim - 0) / 337) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 337) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 337) * (0-(0)));
        }
        else if (tickAnim >= 337 && tickAnim < 490) {
            xx = -17.5 + (((tickAnim - 337) / 153) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 337) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 337) / 153) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 490) {
            xx = 0 + (((tickAnim - 0) / 490) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 490) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 490) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 40) / 20) * (3-(2)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 3 + (((tickAnim - 60) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 3 + (((tickAnim - 80) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 3 + (((tickAnim - 100) / 21) * (6-(3)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 141) {
            xx = 6 + (((tickAnim - 121) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 20) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 179) {
            xx = 6 + (((tickAnim - 141) / 38) * (8-(6)));
            yy = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 38) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 214) {
            xx = 8 + (((tickAnim - 179) / 35) * (11-(8)));
            yy = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 35) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 233) {
            xx = 11 + (((tickAnim - 214) / 19) * (10-(11)));
            yy = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 19) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 281) {
            xx = 10 + (((tickAnim - 233) / 48) * (15-(10)));
            yy = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 48) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 338) {
            xx = 15 + (((tickAnim - 281) / 57) * (17.5-(15)));
            yy = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 57) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 370) {
            xx = 17.5 + (((tickAnim - 338) / 32) * (13-(17.5)));
            yy = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 32) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 405) {
            xx = 13 + (((tickAnim - 370) / 35) * (11-(13)));
            yy = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 35) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 470) {
            xx = 11 + (((tickAnim - 405) / 65) * (3-(11)));
            yy = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 65) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 528) {
            xx = 3 + (((tickAnim - 470) / 58) * (0-(3)));
            yy = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 20) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 179) {
            xx = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 38) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 35) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 19) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 48) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 57) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 32) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 405) {
            xx = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 35) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 65) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 528) {
            xx = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 58) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 40) / 20) * (3-(2)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 3 + (((tickAnim - 60) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 3 + (((tickAnim - 80) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 3 + (((tickAnim - 100) / 21) * (6-(3)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 141) {
            xx = 6 + (((tickAnim - 121) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 20) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 179) {
            xx = 6 + (((tickAnim - 141) / 38) * (8-(6)));
            yy = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 38) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 214) {
            xx = 8 + (((tickAnim - 179) / 35) * (11-(8)));
            yy = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 35) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 233) {
            xx = 11 + (((tickAnim - 214) / 19) * (10-(11)));
            yy = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 19) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 281) {
            xx = 10 + (((tickAnim - 233) / 48) * (15-(10)));
            yy = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 48) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 338) {
            xx = 15 + (((tickAnim - 281) / 57) * (17.5-(15)));
            yy = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 57) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 370) {
            xx = 17.5 + (((tickAnim - 338) / 32) * (13-(17.5)));
            yy = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 32) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 405) {
            xx = 13 + (((tickAnim - 370) / 35) * (11-(13)));
            yy = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 35) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 470) {
            xx = 11 + (((tickAnim - 405) / 65) * (3-(11)));
            yy = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 65) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 528) {
            xx = 3 + (((tickAnim - 470) / 58) * (0-(3)));
            yy = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 20) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 179) {
            xx = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 38) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 179) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 35) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 214) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 19) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 233) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 48) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 281) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 57) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 338) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 32) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 405) {
            xx = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 35) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 405) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 65) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 528) {
            xx = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.rotationPointX = this.Rightleg1.rotationPointX + (float)(xx);
        this.Rightleg1.rotationPointY = this.Rightleg1.rotationPointY - (float)(yy);
        this.Rightleg1.rotationPointZ = this.Rightleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 39) / 34) * (0-(0)));
            yy = -10 + (((tickAnim - 39) / 34) * (5-(-10)));
            zz = 0 + (((tickAnim - 39) / 34) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 73) / 68) * (12.46298-(0)));
            yy = 5 + (((tickAnim - 73) / 68) * (-0.91007-(5)));
            zz = 0 + (((tickAnim - 73) / 68) * (-1.03606-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 173) {
            xx = 12.46298 + (((tickAnim - 141) / 32) * (2.46298-(12.46298)));
            yy = -0.91007 + (((tickAnim - 141) / 32) * (-0.91007-(-0.91007)));
            zz = -1.03606 + (((tickAnim - 141) / 32) * (-1.03606-(-1.03606)));
        }
        else if (tickAnim >= 173 && tickAnim < 240) {
            xx = 2.46298 + (((tickAnim - 173) / 67) * (2.46298-(2.46298)));
            yy = -0.91007 + (((tickAnim - 173) / 67) * (1.08993-(-0.91007)));
            zz = -1.03606 + (((tickAnim - 173) / 67) * (-1.03874-(-1.03606)));
        }
        else if (tickAnim >= 240 && tickAnim < 310) {
            xx = 2.46298 + (((tickAnim - 240) / 70) * (2.46225-(2.46298)));
            yy = 1.08993 + (((tickAnim - 240) / 70) * (-7.91006-(1.08993)));
            zz = -1.03874 + (((tickAnim - 240) / 70) * (-1.02658-(-1.03874)));
        }
        else if (tickAnim >= 310 && tickAnim < 383) {
            xx = 2.46225 + (((tickAnim - 310) / 73) * (2.46288-(2.46225)));
            yy = -7.91006 + (((tickAnim - 310) / 73) * (3.08993-(-7.91006)));
            zz = -1.02658 + (((tickAnim - 310) / 73) * (-1.04144-(-1.02658)));
        }
        else if (tickAnim >= 383 && tickAnim < 443) {
            xx = 2.46288 + (((tickAnim - 383) / 60) * (0-(2.46288)));
            yy = 3.08993 + (((tickAnim - 383) / 60) * (0-(3.08993)));
            zz = -1.04144 + (((tickAnim - 383) / 60) * (0-(-1.04144)));
        }
        else if (tickAnim >= 443 && tickAnim < 447) {
            xx = 0 + (((tickAnim - 443) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 443) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 4) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 454) {
            xx = 12.5 + (((tickAnim - 447) / 7) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 447) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 7) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 462) {
            xx = 2.5 + (((tickAnim - 454) / 8) * (10-(2.5)));
            yy = 0 + (((tickAnim - 454) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 8) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 489) {
            xx = 10 + (((tickAnim - 462) / 27) * (0-(10)));
            yy = 0 + (((tickAnim - 462) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 27) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 443) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 489) {
            xx = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 46) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);


        if (tickAnim >= 489 && tickAnim < 532) {
            xx = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 489) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tail1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 47) / 41) * (0-(0)));
            yy = -10 + (((tickAnim - 47) / 41) * (2.5-(-10)));
            zz = 0 + (((tickAnim - 47) / 41) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 88) / 65) * (4.99478-(0)));
            yy = 2.5 + (((tickAnim - 88) / 65) * (0.50988-(2.5)));
            zz = 0 + (((tickAnim - 88) / 65) * (-0.19861-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 178) {
            xx = 4.99478 + (((tickAnim - 153) / 25) * (-2.50522-(4.99478)));
            yy = 0.50988 + (((tickAnim - 153) / 25) * (0.50988-(0.50988)));
            zz = -0.19861 + (((tickAnim - 153) / 25) * (-0.19861-(-0.19861)));
        }
        else if (tickAnim >= 178 && tickAnim < 255) {
            xx = -2.50522 + (((tickAnim - 178) / 77) * (-2.50688-(-2.50522)));
            yy = 0.50988 + (((tickAnim - 178) / 77) * (2.50888-(0.50988)));
            zz = -0.19861 + (((tickAnim - 178) / 77) * (-0.26166-(-0.19861)));
        }
        else if (tickAnim >= 255 && tickAnim < 322) {
            xx = -2.50688 + (((tickAnim - 255) / 67) * (-2.50685-(-2.50688)));
            yy = 2.50888 + (((tickAnim - 255) / 67) * (-2.48863-(2.50888)));
            zz = -0.26166 + (((tickAnim - 255) / 67) * (-0.10406-(-0.26166)));
        }
        else if (tickAnim >= 322 && tickAnim < 443) {
            xx = -2.50685 + (((tickAnim - 322) / 121) * (0-(-2.50685)));
            yy = -2.48863 + (((tickAnim - 322) / 121) * (0-(-2.48863)));
            zz = -0.10406 + (((tickAnim - 322) / 121) * (0-(-0.10406)));
        }
        else if (tickAnim >= 443 && tickAnim < 447) {
            xx = 0 + (((tickAnim - 443) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 443) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 4) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 451) {
            xx = -10 + (((tickAnim - 447) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 447) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 4) * (0-(0)));
        }
        else if (tickAnim >= 451 && tickAnim < 454) {
            xx = 0 + (((tickAnim - 451) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 451) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 451) / 3) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 457) {
            xx = -5 + (((tickAnim - 454) / 3) * (-10-(-5)));
            yy = 0 + (((tickAnim - 454) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 3) * (0-(0)));
        }
        else if (tickAnim >= 457 && tickAnim < 462) {
            xx = -10 + (((tickAnim - 457) / 5) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 457) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 457) / 5) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 489) {
            xx = -2.5 + (((tickAnim - 462) / 27) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 462) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 27) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 443) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 489) {
            xx = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 46) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);


        if (tickAnim >= 489 && tickAnim < 532) {
            xx = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 489) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tail2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 55) / 44) * (0-(0)));
            yy = -10 + (((tickAnim - 55) / 44) * (2.5-(-10)));
            zz = 0 + (((tickAnim - 55) / 44) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 99) / 61) * (-3-(0)));
            yy = 2.5 + (((tickAnim - 99) / 61) * (-2.49764-(2.5)));
            zz = 0 + (((tickAnim - 99) / 61) * (0.15352-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 182) {
            xx = -3 + (((tickAnim - 160) / 22) * (-0.5-(-3)));
            yy = -2.49764 + (((tickAnim - 160) / 22) * (-2.49764-(-2.49764)));
            zz = 0.15352 + (((tickAnim - 160) / 22) * (0.15352-(0.15352)));
        }
        else if (tickAnim >= 182 && tickAnim < 271) {
            xx = -0.5 + (((tickAnim - 182) / 89) * (-0.50067-(-0.5)));
            yy = -2.49764 + (((tickAnim - 182) / 89) * (0.50211-(-2.49764)));
            zz = 0.15352 + (((tickAnim - 182) / 89) * (0.19225-(0.15352)));
        }
        else if (tickAnim >= 271 && tickAnim < 333) {
            xx = -0.50067 + (((tickAnim - 271) / 62) * (-0.49728-(-0.50067)));
            yy = 0.50211 + (((tickAnim - 271) / 62) * (-5.49739-(0.50211)));
            zz = 0.19225 + (((tickAnim - 271) / 62) * (0.11461-(0.19225)));
        }
        else if (tickAnim >= 333 && tickAnim < 443) {
            xx = -0.49728 + (((tickAnim - 333) / 110) * (0-(-0.49728)));
            yy = -5.49739 + (((tickAnim - 333) / 110) * (0-(-5.49739)));
            zz = 0.11461 + (((tickAnim - 333) / 110) * (0-(0.11461)));
        }
        else if (tickAnim >= 443 && tickAnim < 447) {
            xx = 0 + (((tickAnim - 443) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 443) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 4) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 451) {
            xx = -7.5 + (((tickAnim - 447) / 4) * (2.5-(-7.5)));
            yy = 0 + (((tickAnim - 447) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 4) * (0-(0)));
        }
        else if (tickAnim >= 451 && tickAnim < 454) {
            xx = 2.5 + (((tickAnim - 451) / 3) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 451) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 451) / 3) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 457) {
            xx = -2.5 + (((tickAnim - 454) / 3) * (-7.5-(-2.5)));
            yy = 0 + (((tickAnim - 454) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 3) * (0-(0)));
        }
        else if (tickAnim >= 457 && tickAnim < 462) {
            xx = -7.5 + (((tickAnim - 457) / 5) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 457) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 457) / 5) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 489) {
            xx = -10 + (((tickAnim - 462) / 27) * (0-(-10)));
            yy = 0 + (((tickAnim - 462) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 27) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 443) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 489) {
            xx = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 46) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);


        if (tickAnim >= 489 && tickAnim < 532) {
            xx = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 489) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tail3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 64) / 46) * (0-(0)));
            yy = -7.5 + (((tickAnim - 64) / 46) * (5-(-7.5)));
            zz = 0 + (((tickAnim - 64) / 46) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 172) {
            xx = 0 + (((tickAnim - 110) / 62) * (-5.97091-(0)));
            yy = 5 + (((tickAnim - 110) / 62) * (0.0437-(5)));
            zz = 0 + (((tickAnim - 110) / 62) * (0.66046-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 188) {
            xx = -5.97091 + (((tickAnim - 172) / 16) * (-0.97091-(-5.97091)));
            yy = 0.0437 + (((tickAnim - 172) / 16) * (0.0437-(0.0437)));
            zz = 0.66046 + (((tickAnim - 172) / 16) * (0.66046-(0.66046)));
        }
        else if (tickAnim >= 188 && tickAnim < 283) {
            xx = -0.97091 + (((tickAnim - 188) / 95) * (-1.56024-(-0.97091)));
            yy = 0.0437 + (((tickAnim - 188) / 95) * (5.0038-(0.0437)));
            zz = 0.66046 + (((tickAnim - 188) / 95) * (0.86039-(0.66046)));
        }
        else if (tickAnim >= 283 && tickAnim < 343) {
            xx = -1.56024 + (((tickAnim - 283) / 60) * (-1.55008-(-1.56024)));
            yy = 5.0038 + (((tickAnim - 283) / 60) * (-1.98562-(5.0038)));
            zz = 0.86039 + (((tickAnim - 283) / 60) * (1.24556-(0.86039)));
        }
        else if (tickAnim >= 343 && tickAnim < 443) {
            xx = -1.55008 + (((tickAnim - 343) / 100) * (0-(-1.55008)));
            yy = -1.98562 + (((tickAnim - 343) / 100) * (0-(-1.98562)));
            zz = 1.24556 + (((tickAnim - 343) / 100) * (0-(1.24556)));
        }
        else if (tickAnim >= 443 && tickAnim < 447) {
            xx = 0 + (((tickAnim - 443) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 443) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 4) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 451) {
            xx = -5 + (((tickAnim - 447) / 4) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 447) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 4) * (0-(0)));
        }
        else if (tickAnim >= 451 && tickAnim < 454) {
            xx = 17.5 + (((tickAnim - 451) / 3) * (15-(17.5)));
            yy = 0 + (((tickAnim - 451) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 451) / 3) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 457) {
            xx = 15 + (((tickAnim - 454) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 454) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 3) * (0-(0)));
        }
        else if (tickAnim >= 457 && tickAnim < 462) {
            xx = 5 + (((tickAnim - 457) / 5) * (-7.5-(5)));
            yy = 0 + (((tickAnim - 457) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 457) / 5) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 489) {
            xx = -7.5 + (((tickAnim - 462) / 27) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 462) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 27) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 443) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 489) {
            xx = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 46) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);


        if (tickAnim >= 489 && tickAnim < 532) {
            xx = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 489) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tail4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 76) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 76) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 76) / 44) * (0-(0)));
            yy = -15 + (((tickAnim - 76) / 44) * (0-(-15)));
            zz = 0 + (((tickAnim - 76) / 44) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (-4.02536-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (-4.96577-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0.58482-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = -4.02536 + (((tickAnim - 180) / 13) * (0.97464-(-4.02536)));
            yy = -4.96577 + (((tickAnim - 180) / 13) * (-4.96577-(-4.96577)));
            zz = 0.58482 + (((tickAnim - 180) / 13) * (0.58482-(0.58482)));
        }
        else if (tickAnim >= 193 && tickAnim < 357) {
            xx = 0.97464 + (((tickAnim - 193) / 164) * (0.94295-(0.97464)));
            yy = -4.96577 + (((tickAnim - 193) / 164) * (-11.96254-(-4.96577)));
            zz = 0.58482 + (((tickAnim - 193) / 164) * (0.79972-(0.58482)));
        }
        else if (tickAnim >= 357 && tickAnim < 443) {
            xx = 0.94295 + (((tickAnim - 357) / 86) * (0-(0.94295)));
            yy = -11.96254 + (((tickAnim - 357) / 86) * (0-(-11.96254)));
            zz = 0.79972 + (((tickAnim - 357) / 86) * (0-(0.79972)));
        }
        else if (tickAnim >= 443 && tickAnim < 447) {
            xx = 0 + (((tickAnim - 443) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 443) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 4) * (0-(0)));
        }
        else if (tickAnim >= 447 && tickAnim < 451) {
            xx = -5 + (((tickAnim - 447) / 4) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 447) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 447) / 4) * (0-(0)));
        }
        else if (tickAnim >= 451 && tickAnim < 454) {
            xx = 17.5 + (((tickAnim - 451) / 3) * (15-(17.5)));
            yy = 0 + (((tickAnim - 451) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 451) / 3) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 457) {
            xx = 15 + (((tickAnim - 454) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 454) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 3) * (0-(0)));
        }
        else if (tickAnim >= 457 && tickAnim < 462) {
            xx = 5 + (((tickAnim - 457) / 5) * (-7.5-(5)));
            yy = 0 + (((tickAnim - 457) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 457) / 5) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 489) {
            xx = -7.5 + (((tickAnim - 462) / 27) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 462) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 27) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 443) {
            xx = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 443) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 443) * (0-(0)));
        }
        else if (tickAnim >= 443 && tickAnim < 489) {
            xx = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 443) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 443) / 46) * (0-(0)));
        }
        else if (tickAnim >= 489 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 489) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 489) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.rotationPointX = this.Tail5.rotationPointX + (float)(xx);
        this.Tail5.rotationPointY = this.Tail5.rotationPointY - (float)(yy);
        this.Tail5.rotationPointZ = this.Tail5.rotationPointZ + (float)(zz);


        if (tickAnim >= 489 && tickAnim < 532) {
            xx = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 489) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 489) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tail5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 83) / 47) * (0-(0)));
            yy = -7.5 + (((tickAnim - 83) / 47) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 83) / 47) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 130) / 53) * (0-(0)));
            yy = 7.5 + (((tickAnim - 130) / 53) * (-3.5-(7.5)));
            zz = 0 + (((tickAnim - 130) / 53) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 183) / 16) * (2.5-(0)));
            yy = -3.5 + (((tickAnim - 183) / 16) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 183) / 16) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 532) {
            xx = 2.5 + (((tickAnim - 199) / 333) * (0-(2.5)));
            yy = -3.5 + (((tickAnim - 199) / 333) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 199) / 333) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 532) {
            xx = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 532) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 532) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail6.rotationPointX = this.Tail6.rotationPointX + (float)(xx);
        this.Tail6.rotationPointY = this.Tail6.rotationPointY - (float)(yy);
        this.Tail6.rotationPointZ = this.Tail6.rotationPointZ + (float)(zz);

    }

    public void animGraze2(double tickAnim) {
        double xx = 0;
        double yy = 0;
        double zz = 0;

    }

    public void animGraze3(double tickAnim) {
        double xx = 0;
        double yy = 0;
        double zz = 0;

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDubreuillosaurus ee = (EntityPrehistoricFloraDubreuillosaurus) entitylivingbaseIn;

//        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
//        }
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            //moving in water
//            //
//        }
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Ambient
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animFishing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDubreuillosaurus e = (EntityPrehistoricFloraDubreuillosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Headbase, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
