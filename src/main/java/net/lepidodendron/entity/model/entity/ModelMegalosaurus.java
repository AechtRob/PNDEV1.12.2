package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMegalosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Neck4;
    private final AdvancedModelRendererExtended Headbase;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended Rightcrestorbit_r1;
    private final AdvancedModelRendererExtended Rightcrestfront_r1;
    private final AdvancedModelRendererExtended Rightcrestbase_r1;
    private final AdvancedModelRendererExtended Leftcrestorbit_r1;
    private final AdvancedModelRendererExtended Leftcrestfront_r1;
    private final AdvancedModelRendererExtended Leftcrestbase_r1;
    private final AdvancedModelRendererExtended Upperfrontteeth_r1;
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

    public ModelMegalosaurus() {
        this.textureWidth = 256;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, -9.6F, 0.0F);
        this.setRotateAngle(Hips, -0.0122F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 14, -6.0F, -8.9993F, -0.11F, 12, 20, 17, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRendererExtended(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0007F, 0.39F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0471F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 86, -7.5F, -8.99F, -19.576F, 15, 22, 20, 0.0F, false));

        this.Bodyfront = new AdvancedModelRendererExtended(this);
        this.Bodyfront.setRotationPoint(0.0F, -3.99F, -19.576F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1173F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 52, -6.0F, -4.9656F, -12.4149F, 12, 20, 13, 0.0F, false));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, 2.9344F, -10.0149F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.2737F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 75, 105, -3.5F, -7.5503F, -8.0035F, 7, 14, 9, 0.1F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -1.5503F, -7.0035F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2346F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 110, 107, -3.5F, -6.3005F, -7.4493F, 7, 13, 8, -0.1F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, -1.2005F, -6.9493F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0817F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 143, 109, -3.0F, -4.9833F, -6.408F, 6, 12, 7, -0.1F, false));

        this.Neck4 = new AdvancedModelRendererExtended(this);
        this.Neck4.setRotationPoint(0.0F, -4.8833F, -6.308F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.43F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 172, 113, -3.0F, -0.2F, -4.8F, 6, 10, 5, -0.2F, false));

        this.Headbase = new AdvancedModelRendererExtended(this);
        this.Headbase.setRotationPoint(0.0F, 5.8F, -3.1F);
        this.Neck4.addChild(Headbase);
        this.setRotateAngle(Headbase, 0.2346F, 0.0F, 0.0F);


        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headbase.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 197, 114, -3.0F, -6.0F, -8.0F, 6, 6, 8, 0.0F, false));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -4.0F, -8.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 228, 116, -2.0F, 0.0F, -8.0F, 4, 4, 8, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 92, 39, -2.0F, 3.9F, -7.9F, 4, 2, 8, -0.1F, false));

        this.Rightcrestorbit_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestorbit_r1.setRotationPoint(-2.0552F, -0.0882F, -0.5154F);
        this.Upperjaw.addChild(Rightcrestorbit_r1);
        this.setRotateAngle(Rightcrestorbit_r1, 0.4252F, -0.4349F, -0.4039F);
        this.Rightcrestorbit_r1.cubeList.add(new ModelBox(Rightcrestorbit_r1, 0, 0, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.Rightcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestfront_r1.setRotationPoint(-0.462F, -1.723F, -2.8519F);
        this.Upperjaw.addChild(Rightcrestfront_r1);
        this.setRotateAngle(Rightcrestfront_r1, 0.1393F, -0.1697F, -0.1122F);
        this.Rightcrestfront_r1.cubeList.add(new ModelBox(Rightcrestfront_r1, 220, 89, -1.6F, 0.0F, -4.0F, 2, 2, 7, -0.1F, true));

        this.Rightcrestbase_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcrestbase_r1.setRotationPoint(-2.0F, -0.9952F, 0.0627F);
        this.Upperjaw.addChild(Rightcrestbase_r1);
        this.setRotateAngle(Rightcrestbase_r1, 0.2006F, -0.5848F, -0.0461F);
        this.Rightcrestbase_r1.cubeList.add(new ModelBox(Rightcrestbase_r1, 244, 91, -1.0F, -1.0F, -2.0F, 2, 2, 3, 0.0F, true));

        this.Leftcrestorbit_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestorbit_r1.setRotationPoint(2.0552F, -0.0882F, -0.5154F);
        this.Upperjaw.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, 0.4252F, 0.4349F, 0.4039F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 0, 0, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.Leftcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r1.setRotationPoint(0.462F, -1.723F, -2.8519F);
        this.Upperjaw.addChild(Leftcrestfront_r1);
        this.setRotateAngle(Leftcrestfront_r1, 0.1393F, 0.1697F, 0.1122F);
        this.Leftcrestfront_r1.cubeList.add(new ModelBox(Leftcrestfront_r1, 220, 89, -0.4F, 0.0F, -4.0F, 2, 2, 7, -0.1F, false));

        this.Leftcrestbase_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestbase_r1.setRotationPoint(2.0F, -0.9952F, 0.0627F);
        this.Upperjaw.addChild(Leftcrestbase_r1);
        this.setRotateAngle(Leftcrestbase_r1, 0.2006F, 0.5848F, 0.0461F);
        this.Leftcrestbase_r1.cubeList.add(new ModelBox(Leftcrestbase_r1, 244, 91, -1.0F, -1.0F, -2.0F, 2, 2, 3, 0.0F, false));

        this.Upperfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Upperfrontteeth_r1.setRotationPoint(0.0F, 3.4847F, -11.3982F);
        this.Upperjaw.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1107F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 120, 41, -1.5F, -0.2F, 0.0F, 3, 2, 4, -0.25F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -1.1865F, -9.0681F);
        this.Upperjaw.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.6402F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 244, 99, -1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -1.9F, 0.1F);
        this.Upperjaw.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.0695F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 216, 100, -1.0F, 0.2F, -9.0F, 2, 3, 9, 0.2F, false));

        this.Upperjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 1.0F, -7.5F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.1107F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 241, 107, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRendererExtended(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headbase.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0716F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 190, 94, -3.0F, 0.0F, -8.0F, 6, 4, 8, -0.05F, false));

        this.Lowerfrontteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerfrontteeth_r1.setRotationPoint(0.0F, -0.2992F, -19.4592F);
        this.Lowerjaw.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.0552F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 118, 30, -1.5F, 0.0F, 0.0F, 3, 2, 5, -0.3F, false));

        this.Lowerbackteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerbackteeth_r1.setRotationPoint(0.0F, -0.8854F, -15.1261F);
        this.Lowerjaw.addChild(Lowerbackteeth_r1);
        this.setRotateAngle(Lowerbackteeth_r1, 0.1564F, 0.0F, 0.0F);
        this.Lowerbackteeth_r1.cubeList.add(new ModelBox(Lowerbackteeth_r1, 93, 28, -2.0F, 0.2F, 0.2F, 4, 2, 7, -0.15F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope_r1.setRotationPoint(0.0F, 2.0F, -7.6F);
        this.Lowerjaw.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, -0.0094F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 199, 71, -2.0F, -0.1F, -7.1F, 4, 2, 7, -0.1F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.8341F, -14.5893F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0552F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 219, 77, -1.5F, 0.1F, -4.9F, 3, 3, 5, -0.2F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.0F, -7.9F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1564F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 195, 82, -2.0F, 0.0F, -7.0F, 4, 2, 7, -0.05F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(0.0F, 4.1F, -8.0F);
        this.Lowerjaw.addChild(Throat);
        this.setRotateAngle(Throat, -0.3163F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 166, 98, -2.5F, -4.0F, -0.1F, 5, 4, 10, -0.1F, false));

        this.Masseter = new AdvancedModelRendererExtended(this);
        this.Masseter.setRotationPoint(0.0F, -0.1F, -7.0F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.5473F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 236, 79, -2.5F, -4.7167F, 0.0531F, 5, 5, 5, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRendererExtended(this);
        this.Leftarm1.setRotationPoint(5.5F, 8.2344F, -10.8149F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.9156F, 0.1955F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 62, 86, -1.5F, 0.0F, -2.5F, 3, 8, 5, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRendererExtended(this);
        this.Leftarm2.setRotationPoint(-0.1F, 8.0F, 2.5F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.0475F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 82, 89, -1.5F, 0.0F, -4.0F, 3, 6, 4, 0.0F, false));

        this.Leftarm3 = new AdvancedModelRendererExtended(this);
        this.Leftarm3.setRotationPoint(1.4F, 5.8F, -2.0F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.1173F, 0.0F, 0.1955F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 99, 91, -2.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRendererExtended(this);
        this.Rightarm1.setRotationPoint(-5.5F, 8.2344F, -10.8149F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.9156F, -0.1955F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 62, 86, -1.5F, 0.0F, -2.5F, 3, 8, 5, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRendererExtended(this);
        this.Rightarm2.setRotationPoint(0.1F, 8.0F, 2.5F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.0475F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 82, 89, -1.5F, 0.0F, -4.0F, 3, 6, 4, 0.0F, true));

        this.Rightarm3 = new AdvancedModelRendererExtended(this);
        this.Rightarm3.setRotationPoint(-1.4F, 5.8F, -2.0F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.1173F, 0.0F, -0.1955F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 99, 91, 0.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, true));

        this.Leftleg1 = new AdvancedModelRendererExtended(this);
        this.Leftleg1.setRotationPoint(5.5F, -2.9993F, 7.39F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.2482F, -0.0436F, -0.0175F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 119, 71, -3.5F, -2.0F, -6.0F, 7, 19, 13, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRendererExtended(this);
        this.Leftleg2.setRotationPoint(0.0F, 17.0F, -6.0F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.6828F, 0.0F, 0.0175F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 162, 73, -2.5F, 0.0F, 0.0F, 5, 15, 9, 0.1F, false));

        this.Leftleg3 = new AdvancedModelRendererExtended(this);
        this.Leftleg3.setRotationPoint(0.0F, 15.0F, 8.2F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.7083F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 127, 51, -2.5F, 0.0F, -6.0F, 5, 11, 6, 0.0F, false));

        this.Leftleg4 = new AdvancedModelRendererExtended(this);
        this.Leftleg4.setRotationPoint(0.0F, 11.0F, -2.2F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.2754F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 158, 60, -3.5F, -1.0F, -4.0F, 7, 3, 6, 0.0F, false));

        this.Leftleg5 = new AdvancedModelRendererExtended(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.Leftleg4.addChild(Leftleg5);
        this.Leftleg5.cubeList.add(new ModelBox(Leftleg5, 158, 48, -3.5F, -1.5F, -7.0F, 7, 3, 7, -0.05F, false));

        this.Rightleg1 = new AdvancedModelRendererExtended(this);
        this.Rightleg1.setRotationPoint(-5.5F, -2.9993F, 7.39F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.2482F, 0.0436F, 0.0175F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 119, 71, -3.5F, -2.0F, -6.0F, 7, 19, 13, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRendererExtended(this);
        this.Rightleg2.setRotationPoint(0.0F, 17.0F, -6.0F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.6828F, 0.0F, -0.0175F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 162, 73, -2.5F, 0.0F, 0.0F, 5, 15, 9, 0.1F, true));

        this.Rightleg3 = new AdvancedModelRendererExtended(this);
        this.Rightleg3.setRotationPoint(0.0F, 15.0F, 8.2F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.7083F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 127, 51, -2.5F, 0.0F, -6.0F, 5, 11, 6, 0.0F, true));

        this.Rightleg4 = new AdvancedModelRendererExtended(this);
        this.Rightleg4.setRotationPoint(0.0F, 11.0F, -2.2F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.2754F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 158, 60, -3.5F, -1.2343F, -3.6904F, 7, 3, 6, 0.0F, true));

        this.Rightleg5 = new AdvancedModelRendererExtended(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.2657F, -3.5904F);
        this.Rightleg4.addChild(Rightleg5);
        this.Rightleg5.cubeList.add(new ModelBox(Rightleg5, 158, 48, -3.5F, -1.5F, -7.0F, 7, 3, 7, -0.05F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -3.9993F, 16.89F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0443F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 45, 0, -5.0F, -4.9951F, -0.2216F, 10, 15, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.1049F, 11.2784F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0122F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 92, 0, -4.0F, -4.9996F, 0.0611F, 8, 13, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.1004F, 12.5611F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0216F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 136, 0, -3.5F, -4.9988F, 0.1082F, 7, 11, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.8988F, 12.6082F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0279F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 182, 0, -3.0F, -3.9984F, -0.1117F, 6, 8, 16, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, -0.8984F, 15.3883F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0471F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 62, 33, -2.5F, -2.9967F, -0.1413F, 5, 6, 17, 0.0F, false));

        this.Tail6 = new AdvancedModelRendererExtended(this);
        this.Tail6.setRotationPoint(0.0F, 0.1033F, 16.3587F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0782F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 195, 31, -1.5F, -2.9908F, -0.2343F, 3, 5, 19, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
       // animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();



        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        EntityPrehistoricFloraMegalosaurus EntityMegalosaurus = (EntityPrehistoricFloraMegalosaurus) e;

        //if (EntityMegalosaurus.getAnimation() != EntityMegalosaurus.EAT_ANIMATION) {
            this.faceTarget(f3, f4, 8, Neck1);
            this.faceTarget(f3, f4, 8, Neck2);
            this.faceTarget(f3, f4, 8, Neck3);
            this.faceTarget(f3, f4, 8, Neck4);
            this.faceTarget(f3, f4, 8, Headbase);
       // }

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Headbase};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!EntityMegalosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                this.chainWaveExtended(ArmL, 0.175F, 0.05F, 0.1F, 3F, f2, 1F);
                this.chainWave(ArmR, 0.175F, 0.05F, 0.1F, f2, 1F);
                this.chainFlapExtended(ArmL, 0.175F, 0.05F, 0.1F, 3F, f2, 1F);
                this.chainFlap(ArmR, 0.175F, -0.05F, -0.1F, f2, 1F);
                this.walk(this.Leftarm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                this.walk(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                this.flap(this.Leftarm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                this.flap(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                return;
            }

            if (EntityMegalosaurus.getIsFast()) { //Running


            }
            else { //Walking
                
            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegalosaurus entity = (EntityPrehistoricFloraMegalosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*50))*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*50))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*50))*10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))-10D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+30)*5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+30)*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*30))*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*30))*5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*30))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*30))*-5D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-10D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*20D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-10D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-2.5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*20D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-2.5D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-60)*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-30)*2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+60)*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*15D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-2.5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*15) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*15D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*2.5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-2.5D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*90))*5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*90))*5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*90))*15D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*90))*5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*90))*15) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*90))*15D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(xx), Headbase.rotateAngleY + (float) Math.toRadians(yy), Headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*1D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-60D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-50D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-60) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/20+((Math.PI/180)*60))*-50D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-60D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-50) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*-50D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/20+((Math.PI/180)*60))*-50) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/20+((Math.PI/180)*60))*-50D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*10D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*-30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*10D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-60D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*50D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-30)*-((Math.PI/180)*60)) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-50D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*30))*-60D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-60)*50) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75-((Math.PI/180)*60))*50D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-50) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2+((Math.PI/180)*60))*-50D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2)*-5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-60)*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*30))*30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-60)*-10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if(tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*30D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75+((Math.PI/180)*60))*30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/2-((Math.PI/180)*30))*-10D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegalosaurus entity = (EntityPrehistoricFloraMegalosaurus) entitylivingbaseIn;
        //System.err.println("Animating: EAT " + animTick);

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-1) + (((tickAnim - 0D) / 15D) * (5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*30D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-1D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*30) + (((tickAnim - 15D) / 10D) * (10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-10D-(5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*30))*30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-10) + (((tickAnim - 25D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2)*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25)*2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2)*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2)*-2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
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
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(xx), Headbase.rotateAngleY + (float) Math.toRadians(yy), Headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*1) + (((tickAnim - 0D) / 15D) * (5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*1D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*-10) + (((tickAnim - 15D) / 10D) * (-5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5D-(5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5) + (((tickAnim - 25D) / 15D) * (0D-(-5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*100))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*2.5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-2.5D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25-((Math.PI/180)*60))*-5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.25-((Math.PI/180)*30))*2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2+((Math.PI/180)*60))*5D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*2.5D)));
            zz = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/2+((Math.PI/180)*60))*-2.5D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*90))*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/0.75)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*90))*5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*180/1.25+((Math.PI/180)*90))*5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-10) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*720/2-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegalosaurus entity = (EntityPrehistoricFloraMegalosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*20))*-2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*80))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1) + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25) + (((tickAnim - 0D) / 5D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 5D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25) + (((tickAnim - 5D) / 5D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1) + (((tickAnim - 10D) / 17D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25) + (((tickAnim - 10D) / 17D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1) + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25) + (((tickAnim - 27D) / 5D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 32D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*40))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25) + (((tickAnim - 32D) / 5D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/2.5-((Math.PI/180)*30))*1.25D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*80))*1), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*20))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*50))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*70))*1), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*50))*-2), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*50))*-2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*50))*3), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*90))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.offsetX = (float) Math.toRadians(xx);
        this.Neck1.offsetY = (float) Math.toRadians(yy);
        this.Neck1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*30))*1), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*50))*2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*60))*-1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*60))*-1), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*150))*2), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*90))*-1));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5)*-1), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*60))*-1), Headbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*60))*2), Headbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*90))*-1));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5)*-1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5)*1), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -25D + (((tickAnim - 0D) / 10D) * (2.5D-(-25D)));
            yy = -5D + (((tickAnim - 0D) / 10D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 10D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 2.5D + (((tickAnim - 10D) / 13D) * (15D-(2.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 13D) * (2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 13D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15D + (((tickAnim - 23D) / 10D) * (5D-(15D)));
            yy = 2.5D + (((tickAnim - 23D) / 10D) * (-5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 23D) / 10D) * (-5D-(2.5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 5D + (((tickAnim - 33D) / 10D) * (-27.5D-(5D)));
            yy = -5D + (((tickAnim - 33D) / 10D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 33D) / 10D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5D + (((tickAnim - 43D) / 7D) * (-25D-(-27.5D)));
            yy = -5D + (((tickAnim - 43D) / 7D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 43D) / 7D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 5D) / 5D) * (-0.75D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = -0.75D + (((tickAnim - 10D) / 7D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(-0.75D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 17D) / 6D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 23D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 33D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 33D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.5D + (((tickAnim - 0D) / 10D) * (5D-(-7.5D)));
            yy = 5D + (((tickAnim - 0D) / 10D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 10D) * (0D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 10D) / 13D) * (7.5D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.5D + (((tickAnim - 23D) / 10D) * (45D-(7.5D)));
            yy = -2.5D + (((tickAnim - 23D) / 10D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 23D) / 10D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 45D + (((tickAnim - 33D) / 10D) * (42.5D-(45D)));
            yy = -2.5D + (((tickAnim - 33D) / 10D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 33D) / 10D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 42.5D + (((tickAnim - 43D) / 7D) * (-7.5D-(42.5D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (5D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 7D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 17D) / 6D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 0D) / 10D) * (-10D-(22.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 10D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 10D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10D + (((tickAnim - 10D) / 13D) * (27.5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5D + (((tickAnim - 23D) / 10D) * (-5D-(27.5D)));
            yy = 0D + (((tickAnim - 23D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -5D + (((tickAnim - 33D) / 10D) * (-22.5D-(-5D)));
            yy = 2.5D + (((tickAnim - 33D) / 10D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 33D) / 10D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -22.5D + (((tickAnim - 43D) / 7D) * (22.5D-(-22.5D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 7D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 17D) / 6D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 17D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 27D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 15D + (((tickAnim - 0D) / 10D) * (5D-(15D)));
            yy = -2.5D + (((tickAnim - 0D) / 10D) * (5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 10D) * (5D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * (-27.5D-(5D)));
            yy = 5D + (((tickAnim - 10D) / 10D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 10D) / 10D) * (5D-(5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.5D + (((tickAnim - 20D) / 7D) * (-25D-(-27.5D)));
            yy = 5D + (((tickAnim - 20D) / 7D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 20D) / 7D) * (5D-(5D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -25D + (((tickAnim - 27D) / 10D) * (2.5D-(-25D)));
            yy = 5D + (((tickAnim - 27D) / 10D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 27D) / 10D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.5D + (((tickAnim - 37D) / 13D) * (15D-(2.5D)));
            yy = 2.5D + (((tickAnim - 37D) / 13D) * (-2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 37D) / 13D) * (-2.5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 32D) / 5D) * (-0.75D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
            yy = -0.75D + (((tickAnim - 37D) / 6D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D-(-0.75D)));
            zz = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5) + (((tickAnim - 43D) / 7D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * (45D-(7.5D)));
            yy = 2.5D + (((tickAnim - 0D) / 10D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 10D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 45D + (((tickAnim - 10D) / 10D) * (42.5D-(45D)));
            yy = 2.5D + (((tickAnim - 10D) / 10D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 10D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 42.5D + (((tickAnim - 20D) / 7D) * (-7.5D-(42.5D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (-5D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -7.5D + (((tickAnim - 27D) / 10D) * (5D-(-7.5D)));
            yy = -5D + (((tickAnim - 27D) / 10D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 27D) / 10D) * (0D-(-5D)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 5D + (((tickAnim - 37D) / 13D) * (7.5D-(5D)));
            yy = 0D + (((tickAnim - 37D) / 13D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 13D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 37D) / 6D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 43D) / 7D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5D + (((tickAnim - 0D) / 10D) * (-5D-(27.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 10D) / 10D) * (-22.5D-(-5D)));
            yy = -2.5D + (((tickAnim - 10D) / 10D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 10D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -22.5D + (((tickAnim - 20D) / 7D) * (22.5D-(-22.5D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 22.5D + (((tickAnim - 27D) / 10D) * (-10D-(22.5D)));
            yy = 2.5D + (((tickAnim - 27D) / 10D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 27D) / 10D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -10D + (((tickAnim - 37D) / 13D) * (27.5D-(-10D)));
            yy = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 37D) / 6D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25) + (((tickAnim - 43D) / 7D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.5D + (((tickAnim - 0D) / 10D) * (5D-(17.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 10D) / 13D) * (40D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40D + (((tickAnim - 23D) / 7D) * (25D-(40D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 25D + (((tickAnim - 30D) / 13D) * (32.5D-(25D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 32.5D + (((tickAnim - 43D) / 7D) * (17.5D-(32.5D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5D + (((tickAnim - 0D) / 10D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 10D) / 13D) * (-87.5D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5D + (((tickAnim - 23D) / 7D) * (40D-(-87.5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40D + (((tickAnim - 30D) / 13D) * (62.5D-(40D)));
            yy = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 62.5D + (((tickAnim - 43D) / 7D) * (-5D-(62.5D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40D + (((tickAnim - 0D) / 7D) * (25D-(40D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 25D + (((tickAnim - 7D) / 13D) * (32.5D-(25D)));
            yy = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 32.5D + (((tickAnim - 20D) / 7D) * (17.5D-(32.5D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 17.5D + (((tickAnim - 27D) / 10D) * (5D-(17.5D)));
            yy = 0D + (((tickAnim - 27D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 5D + (((tickAnim - 37D) / 13D) * (40D-(5D)));
            yy = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -87.5D + (((tickAnim - 0D) / 7D) * (40D-(-87.5D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 40D + (((tickAnim - 7D) / 13D) * (62.5D-(40D)));
            yy = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 62.5D + (((tickAnim - 20D) / 7D) * (-5D-(62.5D)));
            yy = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -5D + (((tickAnim - 27D) / 10D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 27D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 37D) / 13D) * (-87.5D-(0D)));
            yy = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 13D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*30))*2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*60))*-2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*90))*-2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*90))*-5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*90))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*120))*-1), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*120))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*120))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*140))*-1), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*150))*-5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*150))*2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1) + (((tickAnim - 32D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.offsetX = (float) Math.toRadians(xx);
        this.Tail5.offsetY = (float) Math.toRadians(yy);
        this.Tail5.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*140))*-1), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*170))*-5), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*170))*2));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5)*5), Leftarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*60))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*60))*-5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*60))*5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*60))*-5));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*60))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*-5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*60))*-5));

        //He seems to be floating a little:
        //this.Hips.offsetY = 0.05F;
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegalosaurus entity = (EntityPrehistoricFloraMegalosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720-90)*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+80)*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+80)*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1) + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D)));
            zz = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1) + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-30)*1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25) + (((tickAnim - 2D) / 1D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D)));
            zz = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1) + (((tickAnim - 2D) / 1D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1) + (((tickAnim - 3D) / 8D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D)));
            zz = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1) + (((tickAnim - 3D) / 8D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1) + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D)));
            zz = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1) + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25) + (((tickAnim - 13D) / 1D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*90))*-1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D)));
            zz = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1) + (((tickAnim - 13D) / 1D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720-((Math.PI/180)*30))*1D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720-((Math.PI/180)*20))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*60))*-2), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*60))*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*50))*2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*90))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*90))*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.1) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.1) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*10))*3), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*30))*2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*30))*-2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*80))*3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*30))*1), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*30))*1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*30))*-3), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*60))*-3), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*60))*-2));


        this.setRotateAngle(Headbase, Headbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*90))*1), Headbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*50))*-2), Headbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*50))*1));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*100))*-2), Throat.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*50))*2), Throat.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*50))*-1));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5D + (((tickAnim - 0D) / 3D) * (-2.5D-(-22.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 3D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 3D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5D + (((tickAnim - 3D) / 4D) * (15D-(-2.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (2.5D-(0D)));
            zz = -5D + (((tickAnim - 3D) / 4D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15D + (((tickAnim - 7D) / 2D) * (15D-(15D)));
            yy = 2.5D + (((tickAnim - 7D) / 2D) * (-5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 7D) / 2D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 9D) / 4D) * (-10D-(15D)));
            yy = -5D + (((tickAnim - 9D) / 4D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 9D) / 4D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 13D) / 5D) * (-27.5D-(-10D)));
            yy = -5D + (((tickAnim - 13D) / 5D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 13D) / 5D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5D + (((tickAnim - 18D) / 2D) * (-22.5D-(-27.5D)));
            yy = -5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (-0.5+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -0.5+(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5) + (((tickAnim - 2D) / 1D) * (-1D-(-0.5+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 2D) * (-1+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = -1+(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5) + (((tickAnim - 5D) / 2D) * (-1D-(-1+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 7D) / 2D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 13D) / 5D) * (0D-(1D)));
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



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5D + (((tickAnim - 0D) / 3D) * (7.5D-(-22.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 3D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 3D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 7.5D + (((tickAnim - 3D) / 4D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 3D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5D + (((tickAnim - 7D) / 2D) * (35D-(12.5D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 7D) / 2D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35D + (((tickAnim - 9D) / 4D) * (42.5D-(35D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 9D) / 4D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5D + (((tickAnim - 13D) / 5D) * (27.5D-(42.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 13D) / 5D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27.5D + (((tickAnim - 18D) / 2D) * (-22.5D-(27.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (-2.5D-(0D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(2.5D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40D + (((tickAnim - 0D) / 3D) * (-2.5D-(40D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5D + (((tickAnim - 3D) / 4D) * (25D-(-2.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25D + (((tickAnim - 7D) / 2D) * (10D-(25D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 9D) / 4D) * (-32.5D-(10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -32.5D + (((tickAnim - 13D) / 5D) * (-27.5D-(-32.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5D + (((tickAnim - 18D) / 2D) * (40D-(-27.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 13D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (-2.5D-(5D)));
            yy = 2.5D + (((tickAnim - 0D) / 3D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 3D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5D + (((tickAnim - 3D) / 4D) * (15D-(-2.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15D + (((tickAnim - 7D) / 2D) * (60D-(15D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 60D + (((tickAnim - 9D) / 4D) * (90D-(60D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 90D + (((tickAnim - 13D) / 5D) * (60D-(90D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 60D + (((tickAnim - 18D) / 2D) * (5D-(60D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (2.5D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5D + (((tickAnim - 0D) / 3D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (-55D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -55D + (((tickAnim - 7D) / 2D) * (35D-(-55D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35D + (((tickAnim - 9D) / 4D) * (47.5D-(35D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 47.5D + (((tickAnim - 13D) / 5D) * (35D-(47.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35D + (((tickAnim - 18D) / 2D) * (2.5D-(35D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15D + (((tickAnim - 0D) / 4D) * (-10D-(15D)));
            yy = 5D + (((tickAnim - 0D) / 4D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10D + (((tickAnim - 4D) / 4D) * (-27.5D-(-10D)));
            yy = 5D + (((tickAnim - 4D) / 4D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 4D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5D + (((tickAnim - 8D) / 3D) * (-22.5D-(-27.5D)));
            yy = 5D + (((tickAnim - 8D) / 3D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 8D) / 3D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -22.5D + (((tickAnim - 11D) / 3D) * (-2.5D-(-22.5D)));
            yy = 2.5D + (((tickAnim - 11D) / 3D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 11D) / 3D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5D + (((tickAnim - 14D) / 4D) * (15D-(-2.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (-2.5D-(0D)));
            zz = 5D + (((tickAnim - 14D) / 4D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15D + (((tickAnim - 18D) / 2D) * (15D-(15D)));
            yy = -2.5D + (((tickAnim - 18D) / 2D) * (5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 4D) / 4D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (-0.5+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = -0.5+(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5) + (((tickAnim - 13D) / 1D) * (-1D-(-0.5+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 14D) / 2D) * (-1+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D-(-1D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = -1+(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5) + (((tickAnim - 16D) / 2D) * (-1D-(-1+Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 18D) / 2D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35D + (((tickAnim - 0D) / 4D) * (42.5D-(35D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 42.5D + (((tickAnim - 4D) / 4D) * (27.5D-(42.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5D + (((tickAnim - 8D) / 3D) * (-22.5D-(27.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (2.5D-(0D)));
            zz = -2.5D + (((tickAnim - 8D) / 3D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -22.5D + (((tickAnim - 11D) / 3D) * (7.5D-(-22.5D)));
            yy = 2.5D + (((tickAnim - 11D) / 3D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 11D) / 3D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 7.5D + (((tickAnim - 14D) / 4D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 14D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5D + (((tickAnim - 18D) / 2D) * (35D-(12.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (-5D-(-2.5D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.5D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.5D)));
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



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10D + (((tickAnim - 0D) / 4D) * (-32.5D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -32.5D + (((tickAnim - 4D) / 4D) * (-27.5D-(-32.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5D + (((tickAnim - 8D) / 3D) * (40D-(-27.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 40D + (((tickAnim - 11D) / 3D) * (-2.5D-(40D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5D + (((tickAnim - 14D) / 4D) * (25D-(-2.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25D + (((tickAnim - 18D) / 2D) * (10D-(25D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.25D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*-0.25D)));
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



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60D + (((tickAnim - 0D) / 4D) * (90D-(60D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 90D + (((tickAnim - 4D) / 4D) * (60D-(90D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 60D + (((tickAnim - 8D) / 3D) * (5D-(60D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5D + (((tickAnim - 11D) / 3D) * (-2.5D-(5D)));
            yy = -2.5D + (((tickAnim - 11D) / 3D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 11D) / 3D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5D + (((tickAnim - 14D) / 4D) * (15D-(-2.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15D + (((tickAnim - 18D) / 2D) * (60D-(15D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35D + (((tickAnim - 0D) / 4D) * (47.5D-(35D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 47.5D + (((tickAnim - 4D) / 4D) * (35D-(47.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 35D + (((tickAnim - 8D) / 3D) * (2.5D-(35D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 2.5D + (((tickAnim - 11D) / 3D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (-55D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -55D + (((tickAnim - 18D) / 2D) * (35D-(-55D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720)*-2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360)*2), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360)*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720-30)*-1), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-30)*2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-30)*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+100)*1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-50)*2), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-50)*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+130)*1), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-70)*3), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-70)*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+150)*1), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-90)*3), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-90)*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05) + (((tickAnim - 13D) / 1D) * (0D-(Math.sin((Math.PI/180)*1D*((double)tickAnim/20D)*720/0.3)*0.05D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.offsetX = (float) Math.toRadians(xx);
        this.Tail5.offsetY = (float) Math.toRadians(yy);
        this.Tail5.offsetZ = (float) Math.toRadians(zz);


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720+((Math.PI/180)*160))*1), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D))*360-((Math.PI/180)*120)*3), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*120))*-2));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*90))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720-((Math.PI/180)*60))*-2.5), Leftarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*30))*2.5), Leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*30))*-2.5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*30))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(0), Leftarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*60))*-5));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*720)*2.5), Rightarm1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*60))*-2.5), Rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*60))*2.5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360+((Math.PI/180)*60))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(0), Rightarm3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*1D)*360-((Math.PI/180)*60))*5));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMegalosaurus ee = (EntityPrehistoricFloraMegalosaurus) entitylivingbaseIn;

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
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMegalosaurus e = (EntityPrehistoricFloraMegalosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
