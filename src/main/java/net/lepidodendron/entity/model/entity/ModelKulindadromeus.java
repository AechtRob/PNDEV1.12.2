package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKulindadromeus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKulindadromeus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hipunderside_r1;
    private final AdvancedModelRenderer Lefthipfeathers;
    private final AdvancedModelRenderer Righthipfeathers;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Leftbackfeathers;
    private final AdvancedModelRenderer Rightbackfeathers;
    private final AdvancedModelRenderer Bellyfluff;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Leftbackfrontfluff;
    private final AdvancedModelRenderer Rightbackfrontfluff;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neckfluffbase;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neckfeathersmiddle;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neckflufffront;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Righteyeridgebase_r1;
    private final AdvancedModelRenderer Righteyeridgemiddle_r1;
    private final AdvancedModelRenderer Righteyeridgefront_r1;
    private final AdvancedModelRenderer Lefteyeridgefront_r1;
    private final AdvancedModelRenderer Lefteyeridgemiddle_r1;
    private final AdvancedModelRenderer Lefteyeridgebase_r1;
    private final AdvancedModelRenderer Uppermouthflesh_r1;
    private final AdvancedModelRenderer Rightupperteeth_r1;
    private final AdvancedModelRenderer Leftnostril_r1;
    private final AdvancedModelRenderer Rightnostril_r1;
    private final AdvancedModelRenderer Noseslopefront_r1;
    private final AdvancedModelRenderer Noseslopebase_r1;
    private final AdvancedModelRenderer Foreheadfront_r1;
    private final AdvancedModelRenderer Foreheadbase_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowermouthflesh_r1;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjawteeth;
    private final AdvancedModelRenderer Masseterfront;
    private final AdvancedModelRenderer Leftmasseter_r1;
    private final AdvancedModelRenderer Rightmasseter_r1;
    private final AdvancedModelRenderer Masseterback;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftthighfeathers;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftshinfeathers;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftleg4;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightthighfeathers;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightshinfeathers;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightleg4;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelKulindadromeus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 8.5F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2972F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 86, -3.0F, -1.3022F, -0.9854F, 6, 5, 9, 0.0F, false));

        this.Hipunderside_r1 = new AdvancedModelRenderer(this);
        this.Hipunderside_r1.setRotationPoint(-0.01F, 3.6978F, -0.4854F);
        this.Hips.addChild(Hipunderside_r1);
        this.setRotateAngle(Hipunderside_r1, 0.3609F, 0.0F, 0.0F);
        this.Hipunderside_r1.cubeList.add(new ModelBox(Hipunderside_r1, 37, 89, -2.5F, 0.0F, 0.0F, 5, 3, 8, 0.0F, false));

        this.Lefthipfeathers = new AdvancedModelRenderer(this);
        this.Lefthipfeathers.setRotationPoint(-2.5F, -0.4022F, -0.9854F);
        this.Hips.addChild(Lefthipfeathers);
        this.setRotateAngle(Lefthipfeathers, 0.0637F, 0.0424F, -0.1274F);
        this.Lefthipfeathers.cubeList.add(new ModelBox(Lefthipfeathers, 74, 0, 0.0F, -3.0F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Righthipfeathers = new AdvancedModelRenderer(this);
        this.Righthipfeathers.setRotationPoint(2.5F, -0.4022F, -0.9854F);
        this.Hips.addChild(Righthipfeathers);
        this.setRotateAngle(Righthipfeathers, 0.0637F, -0.0424F, 0.1274F);
        this.Righthipfeathers.cubeList.add(new ModelBox(Righthipfeathers, 47, 0, -2.0F, -3.0F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.3396F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 71, -3.5F, -1.5022F, -5.9854F, 7, 8, 6, 0.0F, false));

        this.Leftbackfeathers = new AdvancedModelRenderer(this);
        this.Leftbackfeathers.setRotationPoint(-3.1F, -0.8022F, -5.7854F);
        this.Bodymiddle.addChild(Leftbackfeathers);
        this.setRotateAngle(Leftbackfeathers, 0.0637F, -0.0213F, -0.2122F);
        this.Leftbackfeathers.cubeList.add(new ModelBox(Leftbackfeathers, 59, 15, 0.0F, -2.0F, 0.0F, 3, 2, 7, 0.0F, false));

        this.Rightbackfeathers = new AdvancedModelRenderer(this);
        this.Rightbackfeathers.setRotationPoint(3.1F, -0.8022F, -5.7854F);
        this.Bodymiddle.addChild(Rightbackfeathers);
        this.setRotateAngle(Rightbackfeathers, 0.0637F, 0.0213F, 0.2122F);
        this.Rightbackfeathers.cubeList.add(new ModelBox(Rightbackfeathers, 64, 0, -3.0F, -2.0F, 0.0F, 3, 2, 7, 0.0F, false));

        this.Bellyfluff = new AdvancedModelRenderer(this);
        this.Bellyfluff.setRotationPoint(0.0F, 5.2978F, -5.8854F);
        this.Bodymiddle.addChild(Bellyfluff);
        this.setRotateAngle(Bellyfluff, -0.1911F, 0.0F, 0.0F);
        this.Bellyfluff.cubeList.add(new ModelBox(Bellyfluff, 80, 15, -1.5F, 0.0F, 0.0F, 3, 2, 7, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -1.0022F, -5.4854F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.3821F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 22, 82, -3.0F, -0.5F, -5.0F, 6, 7, 5, 0.0F, false));

        this.Leftbackfrontfluff = new AdvancedModelRenderer(this);
        this.Leftbackfrontfluff.setRotationPoint(-1.6F, 0.8F, -4.9F);
        this.Bodyfront.addChild(Leftbackfrontfluff);
        this.setRotateAngle(Leftbackfrontfluff, 0.1061F, -0.0848F, -0.3396F);
        this.Leftbackfrontfluff.cubeList.add(new ModelBox(Leftbackfrontfluff, 48, 19, 0.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Rightbackfrontfluff = new AdvancedModelRenderer(this);
        this.Rightbackfrontfluff.setRotationPoint(1.6F, 0.8F, -4.9F);
        this.Bodyfront.addChild(Rightbackfrontfluff);
        this.setRotateAngle(Rightbackfrontfluff, 0.1061F, 0.0848F, 0.3396F);
        this.Rightbackfrontfluff.cubeList.add(new ModelBox(Rightbackfrontfluff, 36, 9, -2.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.4882F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 42, 76, -1.5F, -1.0F, -3.0F, 3, 5, 5, 0.0F, false));

        this.Neckfluffbase = new AdvancedModelRenderer(this);
        this.Neckfluffbase.setRotationPoint(-0.01F, 0.0F, -2.7F);
        this.Neck1.addChild(Neckfluffbase);
        this.setRotateAngle(Neckfluffbase, 0.1911F, 0.0F, 0.0F);
        this.Neckfluffbase.cubeList.add(new ModelBox(Neckfluffbase, 30, 0, -1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.4F, -2.5F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.4882F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 21, 68, -1.0F, -1.25F, -3.0F, 2, 4, 4, 0.0F, false));

        this.Neckfeathersmiddle = new AdvancedModelRenderer(this);
        this.Neckfeathersmiddle.setRotationPoint(0.0F, -0.6F, -2.8F);
        this.Neck2.addChild(Neckfeathersmiddle);
        this.setRotateAngle(Neckfeathersmiddle, 0.1485F, 0.0F, 0.0F);
        this.Neckfeathersmiddle.cubeList.add(new ModelBox(Neckfeathersmiddle, 28, 13, -0.5F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.4671F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 21, 60, -1.0F, -1.5F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Neckflufffront = new AdvancedModelRenderer(this);
        this.Neckflufffront.setRotationPoint(0.0F, -0.2F, -2.6F);
        this.Neck3.addChild(Neckflufffront);
        this.setRotateAngle(Neckflufffront, 0.2546F, 0.0F, 0.0F);
        this.Neckflufffront.cubeList.add(new ModelBox(Neckflufffront, 54, 12, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.1061F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 39, 70, -1.5F, -1.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.1485F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 32, 64, -1.0F, -2.0F, -2.0F, 2, 2, 3, 0.0F, false));

        this.Righteyeridgebase_r1 = new AdvancedModelRenderer(this);
        this.Righteyeridgebase_r1.setRotationPoint(-1.6137F, -3.0019F, 0.5135F);
        this.Upperjaw.addChild(Righteyeridgebase_r1);
        this.setRotateAngle(Righteyeridgebase_r1, -0.2247F, -0.0317F, -0.2111F);
        this.Righteyeridgebase_r1.cubeList.add(new ModelBox(Righteyeridgebase_r1, 78, 61, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Righteyeridgemiddle_r1 = new AdvancedModelRenderer(this);
        this.Righteyeridgemiddle_r1.setRotationPoint(-1.3258F, -2.9077F, -0.4395F);
        this.Upperjaw.addChild(Righteyeridgemiddle_r1);
        this.setRotateAngle(Righteyeridgemiddle_r1, 0.1572F, -0.2656F, -0.2269F);
        this.Righteyeridgemiddle_r1.cubeList.add(new ModelBox(Righteyeridgemiddle_r1, 79, 64, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Righteyeridgefront_r1 = new AdvancedModelRenderer(this);
        this.Righteyeridgefront_r1.setRotationPoint(-0.8F, -1.96F, -2.0F);
        this.Upperjaw.addChild(Righteyeridgefront_r1);
        this.setRotateAngle(Righteyeridgefront_r1, 0.5732F, -0.2122F, -0.1911F);
        this.Righteyeridgefront_r1.cubeList.add(new ModelBox(Righteyeridgefront_r1, 73, 69, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lefteyeridgefront_r1 = new AdvancedModelRenderer(this);
        this.Lefteyeridgefront_r1.setRotationPoint(0.8F, -1.96F, -2.0F);
        this.Upperjaw.addChild(Lefteyeridgefront_r1);
        this.setRotateAngle(Lefteyeridgefront_r1, 0.5732F, 0.2122F, 0.1911F);
        this.Lefteyeridgefront_r1.cubeList.add(new ModelBox(Lefteyeridgefront_r1, 66, 69, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lefteyeridgemiddle_r1 = new AdvancedModelRenderer(this);
        this.Lefteyeridgemiddle_r1.setRotationPoint(1.3258F, -2.9077F, -0.4395F);
        this.Upperjaw.addChild(Lefteyeridgemiddle_r1);
        this.setRotateAngle(Lefteyeridgemiddle_r1, 0.1572F, 0.2656F, 0.2269F);
        this.Lefteyeridgemiddle_r1.cubeList.add(new ModelBox(Lefteyeridgemiddle_r1, 76, 66, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Lefteyeridgebase_r1 = new AdvancedModelRenderer(this);
        this.Lefteyeridgebase_r1.setRotationPoint(1.6137F, -3.0019F, 0.5135F);
        this.Upperjaw.addChild(Lefteyeridgebase_r1);
        this.setRotateAngle(Lefteyeridgebase_r1, -0.2247F, 0.0317F, 0.2111F);
        this.Lefteyeridgebase_r1.cubeList.add(new ModelBox(Lefteyeridgebase_r1, 79, 68, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Uppermouthflesh_r1 = new AdvancedModelRenderer(this);
        this.Uppermouthflesh_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw.addChild(Uppermouthflesh_r1);
        this.setRotateAngle(Uppermouthflesh_r1, -0.0213F, 0.0F, 0.0F);
        this.Uppermouthflesh_r1.cubeList.add(new ModelBox(Uppermouthflesh_r1, 67, 61, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.Rightupperteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightupperteeth_r1.setRotationPoint(0.49F, -0.65F, -2.8F);
        this.Upperjaw.addChild(Rightupperteeth_r1);
        this.setRotateAngle(Rightupperteeth_r1, 0.0848F, 0.0F, 0.0F);
        this.Rightupperteeth_r1.cubeList.add(new ModelBox(Rightupperteeth_r1, 59, 63, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.Rightupperteeth_r1.cubeList.add(new ModelBox(Rightupperteeth_r1, 59, 65, -0.98F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Leftnostril_r1 = new AdvancedModelRenderer(this);
        this.Leftnostril_r1.setRotationPoint(-0.15F, -0.8048F, -2.0489F);
        this.Upperjaw.addChild(Leftnostril_r1);
        this.setRotateAngle(Leftnostril_r1, -0.0681F, -0.3602F, 0.024F);
        this.Leftnostril_r1.cubeList.add(new ModelBox(Leftnostril_r1, 60, 78, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Rightnostril_r1 = new AdvancedModelRenderer(this);
        this.Rightnostril_r1.setRotationPoint(0.15F, -0.8048F, -2.0489F);
        this.Upperjaw.addChild(Rightnostril_r1);
        this.setRotateAngle(Rightnostril_r1, -0.0681F, 0.3602F, -0.024F);
        this.Rightnostril_r1.cubeList.add(new ModelBox(Rightnostril_r1, 64, 79, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Noseslopefront_r1 = new AdvancedModelRenderer(this);
        this.Noseslopefront_r1.setRotationPoint(-0.01F, -1.0616F, -2.9343F);
        this.Upperjaw.addChild(Noseslopefront_r1);
        this.setRotateAngle(Noseslopefront_r1, 0.8915F, 0.0F, 0.0F);
        this.Noseslopefront_r1.cubeList.add(new ModelBox(Noseslopefront_r1, 73, 64, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Noseslopebase_r1 = new AdvancedModelRenderer(this);
        this.Noseslopebase_r1.setRotationPoint(0.0F, -1.8396F, -2.3061F);
        this.Upperjaw.addChild(Noseslopebase_r1);
        this.setRotateAngle(Noseslopebase_r1, 0.4644F, 0.0F, 0.0F);
        this.Noseslopebase_r1.cubeList.add(new ModelBox(Noseslopebase_r1, 73, 61, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Foreheadfront_r1 = new AdvancedModelRenderer(this);
        this.Foreheadfront_r1.setRotationPoint(0.01F, -2.0F, -2.0F);
        this.Upperjaw.addChild(Foreheadfront_r1);
        this.setRotateAngle(Foreheadfront_r1, 0.5095F, 0.0F, 0.0F);
        this.Foreheadfront_r1.cubeList.add(new ModelBox(Foreheadfront_r1, 66, 65, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Foreheadbase_r1 = new AdvancedModelRenderer(this);
        this.Foreheadbase_r1.setRotationPoint(-0.01F, -2.9754F, -0.254F);
        this.Upperjaw.addChild(Foreheadbase_r1);
        this.setRotateAngle(Foreheadbase_r1, -0.0424F, 0.0F, 0.0F);
        this.Foreheadbase_r1.cubeList.add(new ModelBox(Foreheadbase_r1, 69, 73, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.0637F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 66, 76, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 56, 61, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Lowermouthflesh_r1 = new AdvancedModelRenderer(this);
        this.Lowermouthflesh_r1.setRotationPoint(0.0F, 0.2861F, -3.9794F);
        this.Lowerjaw.addChild(Lowermouthflesh_r1);
        this.setRotateAngle(Lowermouthflesh_r1, 0.1485F, 0.0F, 0.0F);
        this.Lowermouthflesh_r1.cubeList.add(new ModelBox(Lowermouthflesh_r1, 64, 61, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 1.285F, -3.83F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0848F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 64, 73, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1485F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 61, 57, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Lowerjawteeth = new AdvancedModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, 0.9388F, -3.8818F);
        this.Lowerjaw.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, 0.1485F, 0.0F, 0.0F);
        this.Lowerjawteeth.cubeList.add(new ModelBox(Lowerjawteeth, 50, 71, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Masseterfront = new AdvancedModelRenderer(this);
        this.Masseterfront.setRotationPoint(-0.62F, 0.3386F, -3.5873F);
        this.Lowerjaw.addChild(Masseterfront);


        this.Leftmasseter_r1 = new AdvancedModelRenderer(this);
        this.Leftmasseter_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Masseterfront.addChild(Leftmasseter_r1);
        this.setRotateAngle(Leftmasseter_r1, -0.1252F, -0.2061F, -0.1507F);
        this.Leftmasseter_r1.cubeList.add(new ModelBox(Leftmasseter_r1, 61, 68, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Rightmasseter_r1 = new AdvancedModelRenderer(this);
        this.Rightmasseter_r1.setRotationPoint(1.22F, 0.0F, 0.0F);
        this.Masseterfront.addChild(Rightmasseter_r1);
        this.setRotateAngle(Rightmasseter_r1, -0.1252F, 0.2061F, 0.1507F);
        this.Rightmasseter_r1.cubeList.add(new ModelBox(Rightmasseter_r1, 56, 68, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Masseterback = new AdvancedModelRenderer(this);
        this.Masseterback.setRotationPoint(-0.01F, 0.2F, -1.95F);
        this.Lowerjaw.addChild(Masseterback);
        this.setRotateAngle(Masseterback, -0.4492F, 0.0F, 0.0F);
        this.Masseterback.cubeList.add(new ModelBox(Masseterback, 50, 65, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-0.27F, 0.3F, -1.9F);
        this.Head.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.2759F, -0.1911F, -0.1274F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 59, 74, -1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(0.27F, 0.3F, -1.9F);
        this.Head.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.1698F, 0.1911F, 0.1274F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 54, 76, 0.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(2.5F, 3.2F, -3.8F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.0637F, 0.1061F, -0.1274F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 39, 56, -0.5F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.8F, 2.4F, 0.4F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -0.6156F, 0.0213F, 0.2122F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 48, 59, -0.5F, 0.0F, -1.5F, 1, 3, 2, 0.0F, true));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.49F, 2.7F, -0.51F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.1485F, 0.0F, 0.2759F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 54, 56, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-2.5F, 3.2F, -3.8F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.0637F, -0.1061F, 0.1274F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 30, 56, -1.5F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-0.8F, 2.4F, 0.4F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -0.6156F, -0.0213F, -0.2122F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 43, 63, -0.5F, 0.0F, -1.5F, 1, 3, 2, 0.0F, true));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(-0.49F, 2.7F, -0.51F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.1485F, 0.0F, -0.2759F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 48, 54, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(2.0F, 0.6978F, 2.0146F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.0637F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 15, 49, -0.5F, -0.5F, -1.5F, 3, 6, 4, 0.0F, true));

        this.Leftthighfeathers = new AdvancedModelRenderer(this);
        this.Leftthighfeathers.setRotationPoint(1.4F, 0.5F, 0.9F);
        this.Leftleg1.addChild(Leftthighfeathers);
        this.setRotateAngle(Leftthighfeathers, 0.2122F, 0.0F, 0.0848F);
        this.Leftthighfeathers.cubeList.add(new ModelBox(Leftthighfeathers, 27, 20, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, true));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(1.1F, 5.2F, -0.7F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.6369F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 11, 37, -1.0F, -0.5F, -0.5F, 2, 8, 3, 0.0F, true));

        this.Leftshinfeathers = new AdvancedModelRenderer(this);
        this.Leftshinfeathers.setRotationPoint(-0.1F, 0.0F, 2.5F);
        this.Leftleg2.addChild(Leftshinfeathers);
        this.setRotateAngle(Leftshinfeathers, -0.1911F, 0.0213F, 0.0637F);
        this.Leftshinfeathers.cubeList.add(new ModelBox(Leftshinfeathers, 37, 18, 0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F, true));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.01F, 7.5F, 1.2F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.6156F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 9, 30, -1.0F, -0.5F, -1.5F, 2, 4, 2, 0.0F, true));

        this.Leftleg4 = new AdvancedModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.0F, 3.5F, -0.6F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.3396F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 26, 46, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-2.0F, 0.6978F, 2.0146F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.0637F, 0.0F, 0.0F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 0, 49, -2.5F, -0.5F, -1.5F, 3, 6, 4, 0.0F, true));

        this.Rightthighfeathers = new AdvancedModelRenderer(this);
        this.Rightthighfeathers.setRotationPoint(-1.4F, 0.5F, 0.9F);
        this.Rightleg1.addChild(Rightthighfeathers);
        this.setRotateAngle(Rightthighfeathers, 0.2122F, 0.0F, -0.0848F);
        this.Rightthighfeathers.cubeList.add(new ModelBox(Rightthighfeathers, 24, 6, -1.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-1.1F, 5.2F, -0.7F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.6369F, 0.0F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 0, 37, -1.0F, -0.5F, -0.5F, 2, 8, 3, 0.0F, true));

        this.Rightshinfeathers = new AdvancedModelRenderer(this);
        this.Rightshinfeathers.setRotationPoint(0.1F, 0.0F, 2.5F);
        this.Rightleg2.addChild(Rightshinfeathers);
        this.setRotateAngle(Rightshinfeathers, -0.1911F, -0.0213F, -0.0637F);
        this.Rightshinfeathers.cubeList.add(new ModelBox(Rightshinfeathers, 47, 0, -1.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F, true));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.01F, 7.5F, 1.2F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.6156F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 0, 30, -1.0F, -0.5F, -1.5F, 2, 4, 2, 0.0F, true));

        this.Rightleg4 = new AdvancedModelRenderer(this);
        this.Rightleg4.setRotationPoint(0.0F, 3.5F, -0.6F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.3396F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 23, 40, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.0022F, 7.0146F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0213F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 60, -2.0F, -1.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 5.4F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1274F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 56, 87, -1.5F, -1.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.2F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0637F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 27, 71, -1.0F, -0.75F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 6.4F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0637F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 67, 90, -0.5F, -0.75F, 0.0F, 1, 2, 8, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticFloor(float f) {

        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.054F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraKulindadromeus EntityKul = (EntityPrehistoricFloraKulindadromeus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        EntityKul.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityKul.getAnimation() == EntityKul.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityKul.isReallyInWater()) {

                if (f3 == 0.0F || !EntityKul.getIsMoving()) {
                    if (EntityKul.getAnimation() != EntityKul.EAT_ANIMATION
                        && EntityKul.getAnimation() != EntityKul.DRINK_ANIMATION) {
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
                    this.flap(this.Leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.Rightarm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityKul.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKulindadromeus ee = (EntityPrehistoricFloraKulindadromeus) entitylivingbaseIn;

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
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
           // animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKulindadromeus entity = (EntityPrehistoricFloraKulindadromeus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-1) + (((tickAnim - 0D) / 10D) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-1D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-1.1) + (((tickAnim - 0D) / 10D) * (-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-1.1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = -1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1) + (((tickAnim - 10D) / 10D) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5D-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1D)));
            zz = -1.1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1) + (((tickAnim - 10D) / 10D) * (-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5D-(-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.1D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = -1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5) + (((tickAnim - 20D) / 10D) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1D-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5D)));
            zz = -1.1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5) + (((tickAnim - 20D) / 10D) * (-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1.1D-(-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-0.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = -1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1) + (((tickAnim - 30D) / 10D) * (0D-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1D)));
            zz = -1.1+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1.1) + (((tickAnim - 30D) / 10D) * (0D-(-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-1.1D)));
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1) + (((tickAnim - 10D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*5) + (((tickAnim - 20D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10) + (((tickAnim - 30D) / 10D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-1) + (((tickAnim - 10D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-5D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-5) + (((tickAnim - 20D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10) + (((tickAnim - 30D) / 10D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*40) + (((tickAnim - 0D) / 10D) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*40D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1) + (((tickAnim - 10D) / 10D) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10D-(40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 40+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10) + (((tickAnim - 20D) / 10D) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10D-(40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*40) + (((tickAnim - 0D) / 10D) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*40D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1) + (((tickAnim - 10D) / 10D) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*10D-(40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 40+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*10) + (((tickAnim - 20D) / 10D) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10D-(40+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-30) + (((tickAnim - 0D) / 10D) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1) + (((tickAnim - 10D) / 10D) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10D-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10) + (((tickAnim - 20D) / 10D) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-10D-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5+120))*10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -30+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5) + (((tickAnim - 20D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5) + (((tickAnim - 30D) / 10D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5) + (((tickAnim - 20D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5) + (((tickAnim - 30D) / 10D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5) + (((tickAnim - 20D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5) + (((tickAnim - 30D) / 10D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*0.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5) + (((tickAnim - 20D) / 10D) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-2.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5) + (((tickAnim - 30D) / 10D) * (0D-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-60))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5) + (((tickAnim - 20D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.5))*10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-90))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5))*1D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-90))*-10) + (((tickAnim - 20D) / 10D) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/2-90))*-10D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/0.5-90))*-10D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/2-90))*-10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/2-90))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKulindadromeus entity = (EntityPrehistoricFloraKulindadromeus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*2.5), Hips.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*5), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-2.5));
        this.Hips.offsetX = (float) Math.toRadians(0);
        this.Hips.offsetY = (float) Math.toRadians(-0.7+(Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720-190))*0.5);
        this.Hips.offsetZ = (float) Math.toRadians(-0.5+(Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+65))*-0.5);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 0) / 3) * (-10-(-20)));
            yy = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
            zz = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 3) / 4) * (10-(-10)));
            yy = -5 + (((tickAnim - 3) / 4) * (0-(-5)));
            zz = -5 + (((tickAnim - 3) / 4) * (-2.5-(-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 7) / 3) * (25-(10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 7) / 3) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 25 + (((tickAnim - 13) / 3) * (10-(25)));
            yy = -2.5 + (((tickAnim - 13) / 3) * (-5-(-2.5)));
            zz = 2.5 + (((tickAnim - 13) / 3) * (-5-(2.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 16) / 2) * (-12.5-(10)));
            yy = -5 + (((tickAnim - 16) / 2) * (-5-(-5)));
            zz = -5 + (((tickAnim - 16) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -12.5 + (((tickAnim - 18) / 1) * (-27.5-(-12.5)));
            yy = -5 + (((tickAnim - 18) / 1) * (-5-(-5)));
            zz = -5 + (((tickAnim - 18) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -27.5 + (((tickAnim - 19) / 1) * (-20-(-27.5)));
            yy = -5 + (((tickAnim - 19) / 1) * (-5-(-5)));
            zz = -5 + (((tickAnim - 19) / 1) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2 + (((tickAnim - 2) / 1) * (0.5-(0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 16) / 2) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 1) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 19) / 1) * (0-(0.5)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.5 + (((tickAnim - 0) / 3) * (10-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 3) / 4) * (5-(10)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 7) / 3) * (-5-(5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 7) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 10) / 3) * (12.5-(-5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 12.5 + (((tickAnim - 13) / 3) * (32.5-(12.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 16) / 2) * (27.5-(32.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 27.5 + (((tickAnim - 18) / 1) * (15-(27.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (2.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 19) / 1) * (-7.5-(15)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 19) / 1) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1 + (((tickAnim - 2) / 1) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (15-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 13) / 3) * (-55-(15)));
            yy = 0 + (((tickAnim - 13) / 3) * (5-(0)));
            zz = -2.5 + (((tickAnim - 13) / 3) * (-5-(-2.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -55 + (((tickAnim - 16) / 2) * (-45-(-55)));
            yy = 5 + (((tickAnim - 16) / 2) * (5-(5)));
            zz = -5 + (((tickAnim - 16) / 2) * (-2.5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -45 + (((tickAnim - 18) / 1) * (-17.5-(-45)));
            yy = 5 + (((tickAnim - 18) / 1) * (2.5-(5)));
            zz = -2.5 + (((tickAnim - 18) / 1) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 19) / 1) * (27.5-(-17.5)));
            yy = 2.5 + (((tickAnim - 19) / 1) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 19) / 1) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1 + (((tickAnim - 2) / 1) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 5 + (((tickAnim - 0) / 3) * (2.5-(5)));
            zz = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-15-(0)));
            yy = 2.5 + (((tickAnim - 3) / 4) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 4) * (0-(2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 7) / 3) * (-40-(-15)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 10) / 3) * (30-(-40)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = -2.5 + (((tickAnim - 10) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 13) / 3) * (80-(30)));
            yy = -2.5 + (((tickAnim - 13) / 3) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 80 + (((tickAnim - 16) / 2) * (87.5-(80)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 87.5 + (((tickAnim - 18) / 1) * (62.5-(87.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 5 + (((tickAnim - 18) / 1) * (0-(5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 62.5 + (((tickAnim - 19) / 1) * (0-(62.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthipfeathers, Righthipfeathers.rotateAngleX + (float) Math.toRadians(xx), Righthipfeathers.rotateAngleY + (float) Math.toRadians(yy), Righthipfeathers.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*-5), Bodymiddle.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*-5), Bodymiddle.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*2.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftbackfeathers, Leftbackfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftbackfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftbackfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightbackfeathers, Rightbackfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightbackfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightbackfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bellyfluff, Bellyfluff.rotateAngleX + (float) Math.toRadians(xx), Bellyfluff.rotateAngleY + (float) Math.toRadians(yy), Bellyfluff.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-10+(Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*-2.5), Bodyfront.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*2.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftbackfrontfluff, Leftbackfrontfluff.rotateAngleX + (float) Math.toRadians(xx), Leftbackfrontfluff.rotateAngleY + (float) Math.toRadians(yy), Leftbackfrontfluff.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightbackfrontfluff, Rightbackfrontfluff.rotateAngleX + (float) Math.toRadians(xx), Rightbackfrontfluff.rotateAngleY + (float) Math.toRadians(yy), Rightbackfrontfluff.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(10+(Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*20), Neck1.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*5), Neck1.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfluffbase, Neckfluffbase.rotateAngleX + (float) Math.toRadians(xx), Neckfluffbase.rotateAngleY + (float) Math.toRadians(yy), Neckfluffbase.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*10), Neck2.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360))*-5), Neck2.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360))*5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfeathersmiddle, Neckfeathersmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckfeathersmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckfeathersmiddle.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+120))*20), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2 + (((tickAnim - 10) / 10) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckflufffront, Neckflufffront.rotateAngleX + (float) Math.toRadians(xx), Neckflufffront.rotateAngleY + (float) Math.toRadians(yy), Neckflufffront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*2), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthighfeathers, Leftthighfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftthighfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftthighfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthighfeathers.offsetX = (float) Math.toRadians(xx);
        this.Leftthighfeathers.offsetY = (float) Math.toRadians(yy);
        this.Leftthighfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshinfeathers, Leftshinfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftshinfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftshinfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshinfeathers.offsetX = (float) Math.toRadians(xx);
        this.Leftshinfeathers.offsetY = (float) Math.toRadians(yy);
        this.Leftshinfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 3) / 3) * (10-(25)));
            yy = 2.5 + (((tickAnim - 3) / 3) * (5-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 3) * (5-(-2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 6) / 2) * (-12.5-(10)));
            yy = 5 + (((tickAnim - 6) / 2) * (5-(5)));
            zz = 5 + (((tickAnim - 6) / 2) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 8) / 1) * (-27.5-(-12.5)));
            yy = 5 + (((tickAnim - 8) / 1) * (5-(5)));
            zz = 5 + (((tickAnim - 8) / 1) * (5-(5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -27.5 + (((tickAnim - 9) / 1) * (-20-(-27.5)));
            yy = 5 + (((tickAnim - 9) / 1) * (5-(5)));
            zz = 5 + (((tickAnim - 9) / 1) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (-10-(-20)));
            yy = 5 + (((tickAnim - 10) / 3) * (5-(5)));
            zz = 5 + (((tickAnim - 10) / 3) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 13) / 4) * (10-(-10)));
            yy = 5 + (((tickAnim - 13) / 4) * (0-(5)));
            zz = 5 + (((tickAnim - 13) / 4) * (2.5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 17) / 3) * (25-(10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 17) / 3) * (-2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0-(0.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2 + (((tickAnim - 12) / 1) * (0.5-(0.5+(Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.2)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthighfeathers, Rightthighfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightthighfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightthighfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthighfeathers.offsetX = (float) Math.toRadians(xx);
        this.Rightthighfeathers.offsetY = (float) Math.toRadians(yy);
        this.Rightthighfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (12.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 3) / 3) * (32.5-(12.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 6) / 2) * (27.5-(32.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27.5 + (((tickAnim - 8) / 1) * (15-(27.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-2.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 9) / 1) * (-7.5-(15)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 9) / 1) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (10-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 10) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 13) / 4) * (5-(10)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 13) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (-5-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 17) / 3) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1 + (((tickAnim - 12) / 1) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshinfeathers, Rightshinfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightshinfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightshinfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 2) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1 + (((tickAnim - 12) / 8) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshinfeathers.offsetX = (float) Math.toRadians(xx);
        this.Rightshinfeathers.offsetY = (float) Math.toRadians(yy);
        this.Rightshinfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (15-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 3) / 3) * (-55-(15)));
            yy = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
            zz = 2.5 + (((tickAnim - 3) / 3) * (5-(2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -55 + (((tickAnim - 6) / 2) * (-45-(-55)));
            yy = -5 + (((tickAnim - 6) / 2) * (-5-(-5)));
            zz = 5 + (((tickAnim - 6) / 2) * (2.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -45 + (((tickAnim - 8) / 1) * (-17.5-(-45)));
            yy = -5 + (((tickAnim - 8) / 1) * (-2.5-(-5)));
            zz = 2.5 + (((tickAnim - 8) / 1) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 9) / 1) * (27.5-(-17.5)));
            yy = -2.5 + (((tickAnim - 9) / 1) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 9) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 10) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = (Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1 + (((tickAnim - 12) / 1) * (0-((Math.sin(Math.PI/180)*(((double)tickAnim/20)*720/0.25))*-0.1)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
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
            xx = -40 + (((tickAnim - 0) / 3) * (30-(-40)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 30 + (((tickAnim - 3) / 3) * (80-(30)));
            yy = 2.5 + (((tickAnim - 3) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 80 + (((tickAnim - 6) / 2) * (87.5-(80)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 87.5 + (((tickAnim - 8) / 1) * (62.5-(87.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 1) * (0-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 62.5 + (((tickAnim - 9) / 1) * (0-(62.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-5-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -5 + (((tickAnim - 10) / 3) * (-2.5-(-5)));
            zz = -2.5 + (((tickAnim - 10) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-15-(0)));
            yy = -2.5 + (((tickAnim - 13) / 4) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 13) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 17) / 3) * (-40-(-15)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+90))*-5), Tail1.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*-5), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*2.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-5), Tail2.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*2.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-5), Tail3.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-5), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*2.5));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*-5), Tail4.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*-5), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*2.5));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*5), Leftarm1.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+90))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*5), Rightarm1.rotateAngleY + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*5), Rightarm1.rotateAngleZ + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*-5));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians((Math.sin(Math.PI/180)*((((double)tickAnim/20D)*1D)*720+90))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKulindadromeus entity = (EntityPrehistoricFloraKulindadromeus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(5+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+120))*-3)), Hips.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)), Hips.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)));
        this.Hips.offsetX = (float) Math.toRadians(0);
        this.Hips.offsetY = (float) Math.toRadians(-1.5+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+160))*-0.5));
        this.Hips.offsetZ = (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440-150))*1));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 0) / 3) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 0) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 3) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 3) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 5) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 5) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 10) / 3) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 13) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 13) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 15) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 15) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(20+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440-100))*10)), Leftleg2.rotateAngleY + (float) Math.toRadians(0), Leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*30)), Leftleg3.rotateAngleY + (float) Math.toRadians(0), Leftleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70) + (((tickAnim - 0) / 5) * (40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70)-(20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70))));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70) + (((tickAnim - 5) / 5) * (20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70)-(40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70))));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70) + (((tickAnim - 10) / 5) * (40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70)-(20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70))));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70) + (((tickAnim - 15) / 5) * (20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70)-(40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*-70))));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthipfeathers, Lefthipfeathers.rotateAngleX + (float) Math.toRadians(xx), Lefthipfeathers.rotateAngleY + (float) Math.toRadians(yy), Lefthipfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthipfeathers, Righthipfeathers.rotateAngleX + (float) Math.toRadians(xx), Righthipfeathers.rotateAngleY + (float) Math.toRadians(yy), Righthipfeathers.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+60))*3)), Bodymiddle.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*5)), Bodymiddle.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*5)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftbackfeathers, Leftbackfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftbackfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftbackfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightbackfeathers, Rightbackfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightbackfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightbackfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bellyfluff, Bellyfluff.rotateAngleX + (float) Math.toRadians(xx), Bellyfluff.rotateAngleY + (float) Math.toRadians(yy), Bellyfluff.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440))*3)), Bodyfront.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*5)), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*5)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftbackfrontfluff, Leftbackfrontfluff.rotateAngleX + (float) Math.toRadians(xx), Leftbackfrontfluff.rotateAngleY + (float) Math.toRadians(yy), Leftbackfrontfluff.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightbackfrontfluff, Rightbackfrontfluff.rotateAngleX + (float) Math.toRadians(xx), Rightbackfrontfluff.rotateAngleY + (float) Math.toRadians(yy), Rightbackfrontfluff.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440))*-15)), Neck1.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*5)), Neck1.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*5)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfluffbase, Neckfluffbase.rotateAngleX + (float) Math.toRadians(xx), Neckfluffbase.rotateAngleY + (float) Math.toRadians(yy), Neckfluffbase.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+90))*-10)), Neck2.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+120))*5)), Neck2.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+120))*5)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckfeathersmiddle, Neckfeathersmiddle.rotateAngleX + (float) Math.toRadians(xx), Neckfeathersmiddle.rotateAngleY + (float) Math.toRadians(yy), Neckfeathersmiddle.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+30))*10)), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*2))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neckflufffront, Neckflufffront.rotateAngleX + (float) Math.toRadians(xx), Neckflufffront.rotateAngleY + (float) Math.toRadians(yy), Neckflufffront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthighfeathers, Leftthighfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftthighfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftthighfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthighfeathers.offsetX = (float) Math.toRadians(xx);
        this.Leftthighfeathers.offsetY = (float) Math.toRadians(yy);
        this.Leftthighfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshinfeathers, Leftshinfeathers.rotateAngleX + (float) Math.toRadians(xx), Leftshinfeathers.rotateAngleY + (float) Math.toRadians(yy), Leftshinfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshinfeathers.offsetX = (float) Math.toRadians(xx);
        this.Leftshinfeathers.offsetY = (float) Math.toRadians(yy);
        this.Leftshinfeathers.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 0) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 5) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 10) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+10))*-40))));
            yy = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
            zz = (Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5) + (((tickAnim - 15) / 5) * ((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5)-((Math.cos((Math.PI/180)*(((double)tickAnim/20)*720))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 0) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 0) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 5) / 3) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 5) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 8) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 8) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 10) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 10) / 5) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 15) / 3) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 15) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1) + (((tickAnim - 18) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5) + (((tickAnim - 18) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-30))*-0.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthighfeathers, Rightthighfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightthighfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightthighfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthighfeathers.offsetX = (float) Math.toRadians(xx);
        this.Rightthighfeathers.offsetY = (float) Math.toRadians(yy);
        this.Rightthighfeathers.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(20+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440-100))*10)), Rightleg2.rotateAngleY + (float) Math.toRadians(0), Rightleg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2)-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*2))));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshinfeathers, Rightshinfeathers.rotateAngleX + (float) Math.toRadians(xx), Rightshinfeathers.rotateAngleY + (float) Math.toRadians(yy), Rightshinfeathers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 2) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1)-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1) + (((tickAnim - 12) / 8) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.25))*0.1))));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshinfeathers.offsetX = (float) Math.toRadians(xx);
        this.Rightshinfeathers.offsetY = (float) Math.toRadians(yy);
        this.Rightshinfeathers.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*-30)), Rightleg3.rotateAngleY + (float) Math.toRadians(0), Rightleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70) + (((tickAnim - 0) / 5) * (20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70)-(40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70))));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70) + (((tickAnim - 5) / 5) * (40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70)-(20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70))));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70) + (((tickAnim - 10) / 5) * (20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70)-(40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70))));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70) + (((tickAnim - 15) / 5) * (40+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70)-(20+(Math.cos((Math.PI/180)*(((double)tickAnim/20)*720+85))*70))));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(5+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+180))*5)), Tail1.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*10)), Tail1.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+60))*5)));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-5+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+120))*7.5)), Tail2.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*10)), Tail2.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*5)));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+60))*10)), Tail3.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*10)), Tail3.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*5)));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440))*10)), Tail4.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*10)), Tail4.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*5)));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(20+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440))*-6)), Leftarm1.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)), Leftarm1.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(-30+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+60))*-6)), Leftarm2.rotateAngleY + (float) Math.toRadians(0), Leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(20+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440))*-6)), Rightarm1.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)), Rightarm1.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*-5)));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(-30+(Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+60))*-6)), Rightarm2.rotateAngleY + (float) Math.toRadians(0), Rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*1440+60))*5)), Head.rotateAngleY + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-5)), Head.rotateAngleZ + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-5)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians((Math.cos((Math.PI/180)*((((double)tickAnim/20D)*1D)*360))*-5)), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animHop(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKulindadromeus entity = (EntityPrehistoricFloraKulindadromeus) entitylivingbaseIn;
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            EntityPrehistoricFloraKulindadromeus e = (EntityPrehistoricFloraKulindadromeus) entity;
        animator.update(entity);

    }
}
