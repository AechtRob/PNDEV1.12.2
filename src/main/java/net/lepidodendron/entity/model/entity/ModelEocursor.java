package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEocursor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEocursor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Eocursor;
    private final AdvancedModelRenderer basin_r1;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer Metatarsals_r1;
    private final AdvancedModelRenderer PesL;
    private final AdvancedModelRenderer Pes_r1;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer KneeR;
    private final AdvancedModelRenderer MetatarsalR;
    private final AdvancedModelRenderer Metatarsals_r2;
    private final AdvancedModelRenderer PesR;
    private final AdvancedModelRenderer Pes_r2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Caudalproximal_r1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Caudalmedialproximal_r1;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Caudalmedialdistal_r1;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Caudaldistal_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Thorax_r1;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Plexus_r1;
    private final AdvancedModelRenderer Scapulo_Coracoid_r1;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer Humerus_r1;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer Radio_Ulna_r1;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer Manus_r1;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer Humerus_r2;
    private final AdvancedModelRenderer ElbowR;
    private final AdvancedModelRenderer Radio_Ulna_r2;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer Manus_r2;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer CervicalDistal_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer mIliocostaliscapitis_r1;
    private final AdvancedModelRenderer StemothyrohyoidDistal_r1;
    private final AdvancedModelRenderer mStermomandibularis_r1;
    private final AdvancedModelRenderer FilamentsDistal_r1;
    private final AdvancedModelRenderer Filamentsmedial_r1;
    private final AdvancedModelRenderer FilamentsProximal_r1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer StemothyrohyoidProximal_r1;
    private final AdvancedModelRenderer StemothyrohyoidDistal_r2;
    private final AdvancedModelRenderer FilamentDistal_r1;
    private final AdvancedModelRenderer FilamentProximal_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Premaxillary_r1;
    private final AdvancedModelRenderer NasalCrestDistal_r1;
    private final AdvancedModelRenderer Lacrimal_r1;
    private final AdvancedModelRenderer Orbit_r1;
    private final AdvancedModelRenderer Squamosal_r1;
    private final AdvancedModelRenderer Quadratojugal_r1;
    private final AdvancedModelRenderer Teeth_r1;
    private final AdvancedModelRenderer Teeth_r2;
    private final AdvancedModelRenderer Palate_r1;
    private final AdvancedModelRenderer HeadslopeL;
    private final AdvancedModelRenderer AntiorbitalAirSinus_r1;
    private final AdvancedModelRenderer HeadslopeR;
    private final AdvancedModelRenderer AntiorbitalAirSinus_r2;
    private final AdvancedModelRenderer BrowL;
    private final AdvancedModelRenderer Crestpostorbital_r1;
    private final AdvancedModelRenderer Crest_r1;
    private final AdvancedModelRenderer BrowR;
    private final AdvancedModelRenderer Crestpostorbital_r2;
    private final AdvancedModelRenderer Crest_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer StemothyrohyoidDistal_r3;
    private final AdvancedModelRenderer StemothyrohyoidProximal_r2;
    private final AdvancedModelRenderer Predentary_r1;
    private final AdvancedModelRenderer Digastricmuscles_r1;
    private final AdvancedModelRenderer Angular_r1;
    private final AdvancedModelRenderer Teeth_r3;
    private final AdvancedModelRenderer Teeth_r4;
    private final AdvancedModelRenderer Surangular_r1;
    private final AdvancedModelRenderer JawslopeL;
    private final AdvancedModelRenderer Dentary_r1;
    private final AdvancedModelRenderer JawslopeR;
    private final AdvancedModelRenderer Dentary_r2;
    private final AdvancedModelRenderer MasseterL;
    private final AdvancedModelRenderer Massetersuperficialisinside_r1;
    private final AdvancedModelRenderer MasseterR;
    private final AdvancedModelRenderer Massetersuperficialisinside_r2;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer Eye_r1;


    private ModelAnimator animator;

    public ModelEocursor() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Eocursor = new AdvancedModelRenderer(this);
        this.Eocursor.setRotationPoint(0.5F, 6.75F, 2.5F);


        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(-0.5F, 0.3F, -1.0F);
        this.Eocursor.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1047F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 22, 9, -2.0F, -2.77F, -3.1972F, 5, 6, 7, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(-0.4F, -0.2F, -1.5F);
        this.Eocursor.addChild(LegL);
        this.setRotateAngle(LegL, -0.3491F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 18, 37, 0.9F, -1.0F, -2.0F, 3, 8, 5, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 6.7F, -1.6F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.925F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 48, 47, 1.5F, -0.3F, 1.7F, 2, 10, 1, -0.001F, false));
        this.KneeL.cubeList.add(new ModelBox(KneeL, 47, 10, 1.5F, -0.3F, -0.1F, 2, 10, 2, 0.0F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 9.4F, 2.4F);
        this.KneeL.addChild(MetatarsalL);


        this.Metatarsals_r1 = new AdvancedModelRenderer(this);
        this.Metatarsals_r1.setRotationPoint(0.0F, -0.4F, -1.0F);
        this.MetatarsalL.addChild(Metatarsals_r1);
        this.setRotateAngle(Metatarsals_r1, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r1.cubeList.add(new ModelBox(Metatarsals_r1, 0, 16, 1.5F, -0.5429F, -0.6936F, 2, 5, 2, -0.002F, false));

        this.PesL = new AdvancedModelRenderer(this);
        this.PesL.setRotationPoint(2.4F, 2.6F, -3.7F);
        this.MetatarsalL.addChild(PesL);


        this.Pes_r1 = new AdvancedModelRenderer(this);
        this.Pes_r1.setRotationPoint(-2.4F, -0.2F, -0.5F);
        this.PesL.addChild(Pes_r1);
        this.setRotateAngle(Pes_r1, -0.576F, 0.0F, 0.0F);
        this.Pes_r1.cubeList.add(new ModelBox(Pes_r1, 35, 40, 1.0F, -0.0357F, -3.5923F, 3, 1, 5, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(0.4F, -0.2F, -1.5F);
        this.Eocursor.addChild(LegR);
        this.setRotateAngle(LegR, -0.3491F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 18, 37, -3.9F, -1.0F, -2.0F, 3, 8, 5, 0.0F, true));

        this.KneeR = new AdvancedModelRenderer(this);
        this.KneeR.setRotationPoint(0.0F, 6.7F, -1.6F);
        this.LegR.addChild(KneeR);
        this.setRotateAngle(KneeR, 0.925F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 48, 47, -3.5F, -0.3F, 1.7F, 2, 10, 1, -0.001F, true));
        this.KneeR.cubeList.add(new ModelBox(KneeR, 47, 10, -3.5F, -0.3F, -0.1F, 2, 10, 2, 0.0F, true));

        this.MetatarsalR = new AdvancedModelRenderer(this);
        this.MetatarsalR.setRotationPoint(0.0F, 9.4F, 2.4F);
        this.KneeR.addChild(MetatarsalR);


        this.Metatarsals_r2 = new AdvancedModelRenderer(this);
        this.Metatarsals_r2.setRotationPoint(0.0F, -0.4F, -1.0F);
        this.MetatarsalR.addChild(Metatarsals_r2);
        this.setRotateAngle(Metatarsals_r2, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r2.cubeList.add(new ModelBox(Metatarsals_r2, 0, 16, -3.5F, -0.5429F, -0.6936F, 2, 5, 2, -0.002F, true));

        this.PesR = new AdvancedModelRenderer(this);
        this.PesR.setRotationPoint(-2.4F, 2.6F, -3.7F);
        this.MetatarsalR.addChild(PesR);


        this.Pes_r2 = new AdvancedModelRenderer(this);
        this.Pes_r2.setRotationPoint(2.4F, -0.2F, -0.5F);
        this.PesR.addChild(Pes_r2);
        this.setRotateAngle(Pes_r2, -0.576F, 0.0F, 0.0F);
        this.Pes_r2.cubeList.add(new ModelBox(Pes_r2, 35, 40, -4.0F, -0.0357F, -3.5923F, 3, 1, 5, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -1.0F, 2.8F);
        this.Eocursor.addChild(Tail1);


        this.Caudalproximal_r1 = new AdvancedModelRenderer(this);
        this.Caudalproximal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(Caudalproximal_r1);
        this.setRotateAngle(Caudalproximal_r1, -0.0873F, 0.0F, 0.0F);
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 33, 28, -1.5F, -0.9F, -0.7F, 4, 4, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 5.9F);
        this.Tail1.addChild(Tail2);


        this.Caudalmedialproximal_r1 = new AdvancedModelRenderer(this);
        this.Caudalmedialproximal_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(Caudalmedialproximal_r1);
        this.setRotateAngle(Caudalmedialproximal_r1, -0.0175F, 0.0F, 0.0F);
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 0, 16, -1.5F, -1.3F, 0.1F, 3, 3, 10, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.1F);
        this.Tail2.addChild(Tail3);


        this.Caudalmedialdistal_r1 = new AdvancedModelRenderer(this);
        this.Caudalmedialdistal_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail3.addChild(Caudalmedialdistal_r1);
        this.setRotateAngle(Caudalmedialdistal_r1, -0.1222F, 0.0F, 0.0F);
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 0, 30, -1.0F, -1.1F, -0.1F, 2, 2, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.4F, 0.4F, 9.0F);
        this.Tail3.addChild(Tail4);


        this.Caudaldistal_r1 = new AdvancedModelRenderer(this);
        this.Caudaldistal_r1.setRotationPoint(0.1F, -0.4F, 0.0F);
        this.Tail4.addChild(Caudaldistal_r1);
        this.setRotateAngle(Caudaldistal_r1, -0.2269F, 0.0F, 0.0F);
        this.Caudaldistal_r1.cubeList.add(new ModelBox(Caudaldistal_r1, 17, 23, -0.5F, 0.0F, -0.1F, 1, 1, 10, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(-0.5F, -0.9F, -3.8F);
        this.Eocursor.addChild(Body);


        this.Thorax_r1 = new AdvancedModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, -1.2F, -7.7F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, 0.0873F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 0, 0, -2.5F, -0.0743F, -0.0171F, 6, 7, 8, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.6F, 0.3F, -7.2F);
        this.Body.addChild(Chest);


        this.Plexus_r1 = new AdvancedModelRenderer(this);
        this.Plexus_r1.setRotationPoint(-0.5F, 4.2F, -3.1F);
        this.Chest.addChild(Plexus_r1);
        this.setRotateAngle(Plexus_r1, -0.2967F, 0.0F, 0.0F);
        this.Plexus_r1.cubeList.add(new ModelBox(Plexus_r1, 21, 0, -2.1F, -2.0301F, 0.0653F, 5, 2, 4, -0.002F, false));

        this.Scapulo_Coracoid_r1 = new AdvancedModelRenderer(this);
        this.Scapulo_Coracoid_r1.setRotationPoint(-0.5F, 1.0F, -3.1F);
        this.Chest.addChild(Scapulo_Coracoid_r1);
        this.setRotateAngle(Scapulo_Coracoid_r1, 0.2094F, 0.0F, 0.0F);
        this.Scapulo_Coracoid_r1.cubeList.add(new ModelBox(Scapulo_Coracoid_r1, 40, 0, -2.1F, -1.9F, -0.6F, 5, 5, 4, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(2.5F, 3.4F, -1.9F);
        this.Chest.addChild(ArmL);


        this.Humerus_r1 = new AdvancedModelRenderer(this);
        this.Humerus_r1.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.ArmL.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 49, 29, 0.0F, -0.6F, 0.3F, 1, 1, 4, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(-0.5F, 2.3F, 2.6F);
        this.ArmL.addChild(ElbowL);


        this.Radio_Ulna_r1 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.ElbowL.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 11, 47, 0.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.001F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.0F, 2.6F, -2.7F);
        this.ElbowL.addChild(HandL);


        this.Manus_r1 = new AdvancedModelRenderer(this);
        this.Manus_r1.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandL.addChild(Manus_r1);
        this.setRotateAngle(Manus_r1, 0.8574F, 0.1855F, 0.21F);
        this.Manus_r1.cubeList.add(new ModelBox(Manus_r1, 36, 0, -1.1F, -0.8083F, -1.8051F, 1, 1, 2, -0.002F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-2.7F, 3.4F, -1.9F);
        this.Chest.addChild(ArmR);


        this.Humerus_r2 = new AdvancedModelRenderer(this);
        this.Humerus_r2.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.ArmR.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 49, 29, -1.0F, -0.6F, 0.3F, 1, 1, 4, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(0.5F, 2.3F, 2.6F);
        this.ArmR.addChild(ElbowR);


        this.Radio_Ulna_r2 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.ElbowR.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 11, 47, -1.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.001F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-1.0F, 2.6F, -2.7F);
        this.ElbowR.addChild(HandR);


        this.Manus_r2 = new AdvancedModelRenderer(this);
        this.Manus_r2.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandR.addChild(Manus_r2);
        this.setRotateAngle(Manus_r2, 0.8574F, -0.1855F, -0.21F);
        this.Manus_r2.cubeList.add(new ModelBox(Manus_r2, 36, 0, 0.1F, -0.8083F, -1.8051F, 1, 1, 2, -0.002F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.3F, -3.4F);
        this.Chest.addChild(Neck1);


        this.CervicalDistal_r1 = new AdvancedModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.1222F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 35, 47, -1.6F, -0.9F, -3.0F, 3, 3, 3, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.2F, -1.1F);
        this.Neck1.addChild(Neck2);


        this.mIliocostaliscapitis_r1 = new AdvancedModelRenderer(this);
        this.mIliocostaliscapitis_r1.setRotationPoint(-0.5F, 1.0F, -1.5F);
        this.Neck2.addChild(mIliocostaliscapitis_r1);
        this.setRotateAngle(mIliocostaliscapitis_r1, -0.5585F, 0.0F, 0.0F);
        this.mIliocostaliscapitis_r1.cubeList.add(new ModelBox(mIliocostaliscapitis_r1, 0, 5, -0.6F, -0.9986F, -0.0364F, 2, 1, 1, -0.001F, false));

        this.StemothyrohyoidDistal_r1 = new AdvancedModelRenderer(this);
        this.StemothyrohyoidDistal_r1.setRotationPoint(0.0F, 0.6F, -2.0F);
        this.Neck2.addChild(StemothyrohyoidDistal_r1);
        this.setRotateAngle(StemothyrohyoidDistal_r1, -0.4363F, 0.0F, 0.0F);
        this.StemothyrohyoidDistal_r1.cubeList.add(new ModelBox(StemothyrohyoidDistal_r1, 0, 30, -0.6F, -0.9689F, -2.9968F, 1, 1, 3, -0.002F, false));

        this.mStermomandibularis_r1 = new AdvancedModelRenderer(this);
        this.mStermomandibularis_r1.setRotationPoint(-0.5F, -3.6F, -2.9F);
        this.Neck2.addChild(mStermomandibularis_r1);
        this.setRotateAngle(mStermomandibularis_r1, -0.6283F, 0.0F, 0.0F);
        this.mStermomandibularis_r1.cubeList.add(new ModelBox(mStermomandibularis_r1, 49, 23, -0.6F, 1.9F, 0.1F, 2, 1, 4, -0.0001F, false));

        this.FilamentsDistal_r1 = new AdvancedModelRenderer(this);
        this.FilamentsDistal_r1.setRotationPoint(0.0F, -1.2F, 0.5F);
        this.Neck2.addChild(FilamentsDistal_r1);
        this.setRotateAngle(FilamentsDistal_r1, -1.1694F, 0.0F, 0.0F);
        this.FilamentsDistal_r1.cubeList.add(new ModelBox(FilamentsDistal_r1, 21, 0, -0.1F, -0.5432F, -1.4613F, 0, 2, 1, 0.0F, false));

        this.Filamentsmedial_r1 = new AdvancedModelRenderer(this);
        this.Filamentsmedial_r1.setRotationPoint(0.0F, -1.2F, 0.5F);
        this.Neck2.addChild(Filamentsmedial_r1);
        this.setRotateAngle(Filamentsmedial_r1, -0.8901F, 0.0F, 0.0F);
        this.Filamentsmedial_r1.cubeList.add(new ModelBox(Filamentsmedial_r1, 49, 29, -0.1F, -1.1432F, -2.6613F, 0, 2, 1, 0.0F, false));

        this.FilamentsProximal_r1 = new AdvancedModelRenderer(this);
        this.FilamentsProximal_r1.setRotationPoint(0.0F, -1.2F, 0.5F);
        this.Neck2.addChild(FilamentsProximal_r1);
        this.setRotateAngle(FilamentsProximal_r1, -0.6458F, 0.0F, 0.0F);
        this.FilamentsProximal_r1.cubeList.add(new ModelBox(FilamentsProximal_r1, 19, 55, -0.1F, -1.7432F, -3.8613F, 0, 2, 1, 0.0F, false));
        this.FilamentsProximal_r1.cubeList.add(new ModelBox(FilamentsProximal_r1, 0, 42, -1.1F, 0.0568F, -4.0613F, 2, 2, 5, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.2F, -2.9F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0611F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 30, 23, -1.1F, -0.4F, -1.9F, 2, 2, 2, -0.002F, false));
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 35, -1.1F, 1.3F, -1.9F, 2, 1, 2, -0.003F, false));

        this.StemothyrohyoidProximal_r1 = new AdvancedModelRenderer(this);
        this.StemothyrohyoidProximal_r1.setRotationPoint(-0.6F, 3.015F, -1.9266F);
        this.Neck3.addChild(StemothyrohyoidProximal_r1);
        this.setRotateAngle(StemothyrohyoidProximal_r1, -0.0873F, 0.0F, 0.0F);
        this.StemothyrohyoidProximal_r1.cubeList.add(new ModelBox(StemothyrohyoidProximal_r1, 21, 30, 0.0F, -0.988F, -0.4362F, 1, 1, 1, 0.0F, false));

        this.StemothyrohyoidDistal_r2 = new AdvancedModelRenderer(this);
        this.StemothyrohyoidDistal_r2.setRotationPoint(-0.6F, 2.215F, 0.0734F);
        this.Neck3.addChild(StemothyrohyoidDistal_r2);
        this.setRotateAngle(StemothyrohyoidDistal_r2, -0.0698F, 0.0F, 0.0F);
        this.StemothyrohyoidDistal_r2.cubeList.add(new ModelBox(StemothyrohyoidDistal_r2, 40, 10, 0.0F, -0.0504F, -1.9755F, 1, 1, 2, 0.001F, false));

        this.FilamentDistal_r1 = new AdvancedModelRenderer(this);
        this.FilamentDistal_r1.setRotationPoint(-0.6F, -0.3F, -2.0F);
        this.Neck3.addChild(FilamentDistal_r1);
        this.setRotateAngle(FilamentDistal_r1, -0.5323F, 0.0F, 0.0F);
        this.FilamentDistal_r1.cubeList.add(new ModelBox(FilamentDistal_r1, 22, 55, 0.5F, -2.4F, 0.8F, 0, 2, 1, -0.001F, false));

        this.FilamentProximal_r1 = new AdvancedModelRenderer(this);
        this.FilamentProximal_r1.setRotationPoint(-0.6F, -0.3F, -2.0F);
        this.Neck3.addChild(FilamentProximal_r1);
        this.setRotateAngle(FilamentProximal_r1, 0.0436F, 0.0F, 0.0F);
        this.FilamentProximal_r1.cubeList.add(new ModelBox(FilamentProximal_r1, 0, 0, 0.5F, -0.9F, 0.1F, 0, 1, 1, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.6F, -0.2F, -1.9F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0349F, 0.0F, 0.0F);


        this.Premaxillary_r1 = new AdvancedModelRenderer(this);
        this.Premaxillary_r1.setRotationPoint(0.0F, 1.715F, -3.9266F);
        this.Head.addChild(Premaxillary_r1);
        this.setRotateAngle(Premaxillary_r1, 0.8203F, 0.0F, 0.0F);
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 38, 54, 0.0F, 0.08F, -1.2156F, 1, 1, 1, 0.0F, false));

        this.NasalCrestDistal_r1 = new AdvancedModelRenderer(this);
        this.NasalCrestDistal_r1.setRotationPoint(0.0F, 0.715F, -2.4266F);
        this.Head.addChild(NasalCrestDistal_r1);
        this.setRotateAngle(NasalCrestDistal_r1, 0.6632F, 0.0F, 0.0F);
        this.NasalCrestDistal_r1.cubeList.add(new ModelBox(NasalCrestDistal_r1, 43, 54, 0.0F, -0.0127F, -2.0364F, 1, 1, 1, 0.0F, false));
        this.NasalCrestDistal_r1.cubeList.add(new ModelBox(NasalCrestDistal_r1, 55, 0, 0.0F, -0.0127F, -1.0364F, 1, 1, 1, 0.0F, false));

        this.Lacrimal_r1 = new AdvancedModelRenderer(this);
        this.Lacrimal_r1.setRotationPoint(-0.5F, 0.415F, -2.0266F);
        this.Head.addChild(Lacrimal_r1);
        this.setRotateAngle(Lacrimal_r1, 0.6109F, 0.0F, 0.0F);
        this.Lacrimal_r1.cubeList.add(new ModelBox(Lacrimal_r1, 27, 51, 0.0F, 0.0175F, -0.9812F, 2, 1, 1, -0.001F, false));

        this.Orbit_r1 = new AdvancedModelRenderer(this);
        this.Orbit_r1.setRotationPoint(-0.5F, 0.515F, -1.4266F);
        this.Head.addChild(Orbit_r1);
        this.setRotateAngle(Orbit_r1, 0.384F, 0.0F, 0.0F);
        this.Orbit_r1.cubeList.add(new ModelBox(Orbit_r1, 13, 53, 0.0F, -0.3F, -0.5F, 2, 1, 1, 0.0F, false));

        this.Squamosal_r1 = new AdvancedModelRenderer(this);
        this.Squamosal_r1.setRotationPoint(-0.5F, 0.115F, -1.0266F);
        this.Head.addChild(Squamosal_r1);
        this.setRotateAngle(Squamosal_r1, 0.2094F, 0.0F, 0.0F);
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 6, 53, 0.0F, -0.079F, 0.1793F, 2, 1, 1, -0.0001F, false));
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 26, 54, 0.0F, -0.079F, -0.1207F, 2, 1, 1, -0.001F, false));

        this.Quadratojugal_r1 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r1.setRotationPoint(0.0F, 1.915F, -1.5266F);
        this.Head.addChild(Quadratojugal_r1);
        this.setRotateAngle(Quadratojugal_r1, 0.1571F, 0.0F, 0.0F);
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 14, 35, -0.5F, -0.8494F, -0.0257F, 2, 1, 2, 0.001F, false));
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 47, 40, -0.5F, -0.8494F, -0.5257F, 2, 1, 2, 0.0F, false));

        this.Teeth_r1 = new AdvancedModelRenderer(this);
        this.Teeth_r1.setRotationPoint(-0.9F, 3.215F, -3.8266F);
        this.Head.addChild(Teeth_r1);
        this.setRotateAngle(Teeth_r1, 0.4717F, -0.0478F, -0.0213F);
        this.Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 0, 0, 1.0F, -0.9222F, -0.0339F, 0, 1, 3, 0.0001F, true));

        this.Teeth_r2 = new AdvancedModelRenderer(this);
        this.Teeth_r2.setRotationPoint(0.9F, 3.215F, -3.8266F);
        this.Head.addChild(Teeth_r2);
        this.setRotateAngle(Teeth_r2, 0.4717F, 0.0478F, 0.0213F);
        this.Teeth_r2.cubeList.add(new ModelBox(Teeth_r2, 0, 0, 0.0F, -0.9222F, -0.0339F, 0, 1, 3, 0.0001F, false));

        this.Palate_r1 = new AdvancedModelRenderer(this);
        this.Palate_r1.setRotationPoint(0.0F, 2.315F, -3.8266F);
        this.Head.addChild(Palate_r1);
        this.setRotateAngle(Palate_r1, 0.4189F, 0.0F, 0.0F);
        this.Palate_r1.cubeList.add(new ModelBox(Palate_r1, 20, 51, 0.0F, -0.4F, -0.1F, 1, 1, 2, 0.0001F, false));

        this.HeadslopeL = new AdvancedModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 2.315F, -3.8266F);
        this.Head.addChild(HeadslopeL);


        this.AntiorbitalAirSinus_r1 = new AdvancedModelRenderer(this);
        this.AntiorbitalAirSinus_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r1);
        this.setRotateAngle(AntiorbitalAirSinus_r1, 0.4271F, 0.1911F, 0.0862F);
        this.AntiorbitalAirSinus_r1.cubeList.add(new ModelBox(AntiorbitalAirSinus_r1, 0, 50, -1.0F, -0.4F, -0.1F, 1, 1, 2, -0.0001F, false));

        this.HeadslopeR = new AdvancedModelRenderer(this);
        this.HeadslopeR.setRotationPoint(0.0F, 2.315F, -3.8266F);
        this.Head.addChild(HeadslopeR);


        this.AntiorbitalAirSinus_r2 = new AdvancedModelRenderer(this);
        this.AntiorbitalAirSinus_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeR.addChild(AntiorbitalAirSinus_r2);
        this.setRotateAngle(AntiorbitalAirSinus_r2, 0.4271F, -0.1911F, -0.0862F);
        this.AntiorbitalAirSinus_r2.cubeList.add(new ModelBox(AntiorbitalAirSinus_r2, 0, 50, 0.0F, -0.4F, -0.1F, 1, 1, 2, -0.0001F, true));

        this.BrowL = new AdvancedModelRenderer(this);
        this.BrowL.setRotationPoint(1.5F, 0.415F, -2.0266F);
        this.Head.addChild(BrowL);


        this.Crestpostorbital_r1 = new AdvancedModelRenderer(this);
        this.Crestpostorbital_r1.setRotationPoint(0.0F, -0.1F, 0.2F);
        this.BrowL.addChild(Crestpostorbital_r1);
        this.setRotateAngle(Crestpostorbital_r1, 0.3423F, -0.0986F, 0.1059F);
        this.Crestpostorbital_r1.cubeList.add(new ModelBox(Crestpostorbital_r1, 48, 23, -0.9087F, -0.0409F, -0.03F, 1, 1, 1, -0.01F, false));

        this.Crest_r1 = new AdvancedModelRenderer(this);
        this.Crest_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrowL.addChild(Crest_r1);
        this.setRotateAngle(Crest_r1, 0.7246F, -0.1044F, 0.1225F);
        this.Crest_r1.cubeList.add(new ModelBox(Crest_r1, 0, 54, -0.9F, 0.0175F, -0.7812F, 1, 1, 1, 0.0F, false));

        this.BrowR = new AdvancedModelRenderer(this);
        this.BrowR.setRotationPoint(-0.5F, 0.415F, -2.0266F);
        this.Head.addChild(BrowR);


        this.Crestpostorbital_r2 = new AdvancedModelRenderer(this);
        this.Crestpostorbital_r2.setRotationPoint(0.0F, -0.1F, 0.2F);
        this.BrowR.addChild(Crestpostorbital_r2);
        this.setRotateAngle(Crestpostorbital_r2, 0.3423F, 0.0986F, -0.1059F);
        this.Crestpostorbital_r2.cubeList.add(new ModelBox(Crestpostorbital_r2, 48, 23, -0.0913F, -0.0409F, -0.03F, 1, 1, 1, -0.01F, true));

        this.Crest_r2 = new AdvancedModelRenderer(this);
        this.Crest_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrowR.addChild(Crest_r2);
        this.setRotateAngle(Crest_r2, 0.7246F, 0.1044F, -0.1225F);
        this.Crest_r2.cubeList.add(new ModelBox(Crest_r2, 0, 54, -0.1F, 0.0175F, -0.7812F, 1, 1, 1, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.415F, 0.3734F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.4451F, 0.0F, 0.0F);


        this.StemothyrohyoidDistal_r3 = new AdvancedModelRenderer(this);
        this.StemothyrohyoidDistal_r3.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.Jaw.addChild(StemothyrohyoidDistal_r3);
        this.setRotateAngle(StemothyrohyoidDistal_r3, 0.3316F, 0.0F, 0.0F);
        this.StemothyrohyoidDistal_r3.cubeList.add(new ModelBox(StemothyrohyoidDistal_r3, 35, 40, 0.0F, -0.9593F, -0.0211F, 1, 1, 1, 0.0001F, false));

        this.StemothyrohyoidProximal_r2 = new AdvancedModelRenderer(this);
        this.StemothyrohyoidProximal_r2.setRotationPoint(0.0F, 2.0F, -0.9F);
        this.Jaw.addChild(StemothyrohyoidProximal_r2);
        this.setRotateAngle(StemothyrohyoidProximal_r2, 0.1745F, 0.0F, 0.0F);
        this.StemothyrohyoidProximal_r2.cubeList.add(new ModelBox(StemothyrohyoidProximal_r2, 0, 42, 0.0F, -1.0F, -0.1F, 1, 1, 1, 0.0F, false));

        this.Predentary_r1 = new AdvancedModelRenderer(this);
        this.Predentary_r1.setRotationPoint(0.0F, 3.4589F, -2.6014F);
        this.Jaw.addChild(Predentary_r1);
        this.setRotateAngle(Predentary_r1, 0.3054F, 0.0F, 0.0F);
        this.Predentary_r1.cubeList.add(new ModelBox(Predentary_r1, 33, 54, 0.0F, -0.9856F, -1.0104F, 1, 1, 1, -0.001F, false));

        this.Digastricmuscles_r1 = new AdvancedModelRenderer(this);
        this.Digastricmuscles_r1.setRotationPoint(0.0F, 1.5589F, -1.8014F);
        this.Jaw.addChild(Digastricmuscles_r1);
        this.setRotateAngle(Digastricmuscles_r1, 0.7418F, 0.0F, 0.0F);
        this.Digastricmuscles_r1.cubeList.add(new ModelBox(Digastricmuscles_r1, 30, 28, 0.0F, -0.0967F, -1.9192F, 1, 1, 3, -0.002F, false));

        this.Angular_r1 = new AdvancedModelRenderer(this);
        this.Angular_r1.setRotationPoint(0.0F, 1.4589F, -0.8014F);
        this.Jaw.addChild(Angular_r1);
        this.setRotateAngle(Angular_r1, 0.6807F, 0.0F, 0.0F);
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 14, 30, -0.5F, -0.6317F, -0.9765F, 2, 1, 1, -0.002F, false));

        this.Teeth_r3 = new AdvancedModelRenderer(this);
        this.Teeth_r3.setRotationPoint(-1.0F, 2.5589F, -3.1014F);
        this.Jaw.addChild(Teeth_r3);
        this.setRotateAngle(Teeth_r3, 0.7517F, -0.051F, -0.0477F);
        this.Teeth_r3.cubeList.add(new ModelBox(Teeth_r3, 17, 20, 1.1F, -0.1676F, -0.0249F, 0, 1, 3, -0.001F, true));

        this.Teeth_r4 = new AdvancedModelRenderer(this);
        this.Teeth_r4.setRotationPoint(1.0F, 2.5589F, -3.1014F);
        this.Jaw.addChild(Teeth_r4);
        this.setRotateAngle(Teeth_r4, 0.7517F, 0.051F, 0.0477F);
        this.Teeth_r4.cubeList.add(new ModelBox(Teeth_r4, 17, 20, -0.1F, -0.1676F, -0.0249F, 0, 1, 3, -0.001F, false));

        this.Surangular_r1 = new AdvancedModelRenderer(this);
        this.Surangular_r1.setRotationPoint(0.0F, 0.3589F, -0.4014F);
        this.Jaw.addChild(Surangular_r1);
        this.setRotateAngle(Surangular_r1, 0.7505F, 0.0F, 0.0F);
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 39, 23, -0.5F, -0.1F, -1.4F, 2, 1, 2, -0.001F, false));

        this.JawslopeL = new AdvancedModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, 3.3589F, -2.7014F);
        this.Jaw.addChild(JawslopeL);


        this.Dentary_r1 = new AdvancedModelRenderer(this);
        this.Dentary_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawslopeL.addChild(Dentary_r1);
        this.setRotateAngle(Dentary_r1, 0.751F, 0.1411F, 0.1306F);
        this.Dentary_r1.cubeList.add(new ModelBox(Dentary_r1, 10, 42, -1.0F, -0.8158F, -0.0396F, 1, 1, 2, -0.002F, false));

        this.JawslopeR = new AdvancedModelRenderer(this);
        this.JawslopeR.setRotationPoint(-0.2F, 3.3589F, -2.7014F);
        this.Jaw.addChild(JawslopeR);


        this.Dentary_r2 = new AdvancedModelRenderer(this);
        this.Dentary_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawslopeR.addChild(Dentary_r2);
        this.setRotateAngle(Dentary_r2, 0.751F, -0.1411F, -0.1306F);
        this.Dentary_r2.cubeList.add(new ModelBox(Dentary_r2, 10, 42, 0.2F, -0.8158F, -0.0396F, 1, 1, 2, -0.002F, true));

        this.MasseterL = new AdvancedModelRenderer(this);
        this.MasseterL.setRotationPoint(1.3F, 1.5589F, -2.0014F);
        this.Jaw.addChild(MasseterL);


        this.Massetersuperficialisinside_r1 = new AdvancedModelRenderer(this);
        this.Massetersuperficialisinside_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MasseterL.addChild(Massetersuperficialisinside_r1);
        this.setRotateAngle(Massetersuperficialisinside_r1, 0.6538F, 0.0319F, -0.0416F);
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 38, 56, -0.01F, -0.878F, -0.1001F, 0, 1, 2, 0.0F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 43, 56, -0.01F, -1.278F, -0.1001F, 0, 1, 2, -0.001F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 30, 38, 0.0F, -0.878F, -0.1001F, 0, 1, 2, 0.0F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 17, 16, 0.0F, -1.278F, -0.1001F, 0, 1, 2, -0.001F, false));

        this.MasseterR = new AdvancedModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, 1.5589F, -2.0014F);
        this.Jaw.addChild(MasseterR);


        this.Massetersuperficialisinside_r2 = new AdvancedModelRenderer(this);
        this.Massetersuperficialisinside_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MasseterR.addChild(Massetersuperficialisinside_r2);
        this.setRotateAngle(Massetersuperficialisinside_r2, 0.6538F, -0.0319F, 0.0416F);
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 38, 56, 0.01F, -0.878F, -0.1001F, 0, 1, 2, 0.0F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 43, 56, 0.01F, -1.278F, -0.1001F, 0, 1, 2, -0.001F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 30, 38, 0.0F, -0.878F, -0.1001F, 0, 1, 2, 0.0F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 17, 16, 0.0F, -1.278F, -0.1001F, 0, 1, 2, -0.001F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 1.1379F, -1.5444F);
        this.Head.addChild(eye);


        this.Eye_r1 = new AdvancedModelRenderer(this);
        this.Eye_r1.setRotationPoint(-0.5F, -0.2229F, 0.0178F);
        this.eye.addChild(Eye_r1);
        this.setRotateAngle(Eye_r1, 0.384F, 0.0F, 0.0F);
        this.Eye_r1.cubeList.add(new ModelBox(Eye_r1, 52, 44, -0.5F, -0.3F, -0.6F, 2, 1, 1, 0.002F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Eocursor.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Eocursor.offsetY = -1.20F;
        this.Eocursor.offsetX = -0.30F;
        this.Eocursor.rotateAngleY = (float)Math.toRadians(135);
        this.Eocursor.rotateAngleX = (float)Math.toRadians(2);
        this.Eocursor.rotateAngleZ = (float)Math.toRadians(3);
        this.Eocursor.scaleChildren = true;
        float scaler = 1.60F;
        this.Eocursor.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Eocursor.render(f);
        //Reset rotations, positions and sizing:
        this.Eocursor.setScale(1.0F, 1.0F, 1.0F);
        this.Eocursor.scaleChildren = false;
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

        EntityPrehistoricFloraEocursor entityEocursor = (EntityPrehistoricFloraEocursor) e;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityEocursor.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityEocursor.getAnimation() == entityEocursor.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityEocursor.isReallyInWater()) {

                if (f3 == 0.0F || !entityEocursor.getIsMoving()) {
                    if (entityEocursor.getAnimation() != entityEocursor.EAT_ANIMATION
                            && entityEocursor.getAnimation() != entityEocursor.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityEocursor.getIsFast()) { //Running


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
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraEocursor ee = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 15) / 25) * (0-(-2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 15) / 25) * (0-(-2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5 + (((tickAnim - 15) / 25) * (0-(-6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 15) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 15) / 25) * (0-(12.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 15) / 12) * (-9.02-(-7.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -9.02 + (((tickAnim - 27) / 13) * (0-(-9.02)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 15) / 12) * (32.67-(30)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 32.67 + (((tickAnim - 27) / 3) * (0-(32.67)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (15.75-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 33) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (15.75-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 15.75 + (((tickAnim - 38) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.2975-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 15) / 12) * (1-(1)));
            yy = 0.2975 + (((tickAnim - 15) / 12) * (1-(0.2975)));
            zz = 1 + (((tickAnim - 15) / 12) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 27) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 27) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 27) / 13) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = -13.25 + (((tickAnim - 20) / 77) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -13.25 + (((tickAnim - 97) / 13) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eocursor, Eocursor.rotateAngleX + (float) Math.toRadians(xx), Eocursor.rotateAngleY + (float) Math.toRadians(yy), Eocursor.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = -6.25 + (((tickAnim - 20) / 77) * (-8.75-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -8.75 + (((tickAnim - 97) / 13) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.88 + (((tickAnim - 10) / 10) * (-10.75-(0.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = -10.75 + (((tickAnim - 20) / 77) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = -10.75 + (((tickAnim - 97) / 6) * (24.36-(-10.75)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = 24.36 + (((tickAnim - 103) / 7) * (0-(24.36)));
            yy = 0 + (((tickAnim - 103) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -36 + (((tickAnim - 10) / 10) * (14.5-(-36)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = 14.5 + (((tickAnim - 20) / 77) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 14.5 + (((tickAnim - 97) / 6) * (-11.8-(14.5)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = -11.8 + (((tickAnim - 103) / 7) * (0-(-11.8)));
            yy = 0 + (((tickAnim - 103) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (74.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 74.25 + (((tickAnim - 10) / 10) * (17.5-(74.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = 17.5 + (((tickAnim - 20) / 77) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 17.5 + (((tickAnim - 97) / 6) * (73.84-(17.5)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = 73.84 + (((tickAnim - 103) / 7) * (0-(73.84)));
            yy = 0 + (((tickAnim - 103) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesL.rotationPointX = this.PesL.rotationPointX + (float)(xx);
        this.PesL.rotationPointY = this.PesL.rotationPointY - (float)(yy);
        this.PesL.rotationPointZ = this.PesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = 16 + (((tickAnim - 20) / 77) * (16-(16)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 16 + (((tickAnim - 97) / 13) * (0-(16)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = -4 + (((tickAnim - 20) / 77) * (-4-(-4)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -4 + (((tickAnim - 97) / 13) * (0-(-4)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(0), MetatarsalR.rotateAngleY + (float) Math.toRadians(0), MetatarsalR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 97) {
            xx = 0.75 + (((tickAnim - 20) / 77) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 20) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.79028-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (9.1095-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.89151-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -9.79028 + (((tickAnim - 20) / 16) * (-10.67799-(-9.79028)));
            yy = 9.1095 + (((tickAnim - 20) / 16) * (-1.7655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*20-(9.1095)));
            zz = -0.89151 + (((tickAnim - 20) / 16) * (-1.13403-(-0.89151)));
        }
        else if (tickAnim >= 36 && tickAnim < 64) {
            xx = -10.67799 + (((tickAnim - 36) / 28) * (-11.86369-(-10.67799)));
            yy = -1.7655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*20 + (((tickAnim - 36) / 28) * (-22.11525-(-1.7655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*20)));
            zz = -1.13403 + (((tickAnim - 36) / 28) * (4.44137-(-1.13403)));
        }
        else if (tickAnim >= 64 && tickAnim < 97) {
            xx = -11.86369 + (((tickAnim - 64) / 33) * (-9.97266-(-11.86369)));
            yy = -22.11525 + (((tickAnim - 64) / 33) * (-12.07038-(-22.11525)));
            zz = 4.44137 + (((tickAnim - 64) / 33) * (2.10578-(4.44137)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -9.97266 + (((tickAnim - 97) / 13) * (0-(-9.97266)));
            yy = -12.07038 + (((tickAnim - 97) / 13) * (0-(-12.07038)));
            zz = 2.10578 + (((tickAnim - 97) / 13) * (0-(2.10578)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.51656-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.4095-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.67989-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 8.51656 + (((tickAnim - 20) / 16) * (9.33705-(8.51656)));
            yy = 8.4095 + (((tickAnim - 20) / 16) * (15.16493-(8.4095)));
            zz = 6.67989 + (((tickAnim - 20) / 16) * (7.16342-(6.67989)));
        }
        else if (tickAnim >= 36 && tickAnim < 64) {
            xx = 9.33705 + (((tickAnim - 36) / 28) * (9.64767-(9.33705)));
            yy = 15.16493 + (((tickAnim - 36) / 28) * (-11.77264-(15.16493)));
            zz = 7.16342 + (((tickAnim - 36) / 28) * (2.98538-(7.16342)));
        }
        else if (tickAnim >= 64 && tickAnim < 97) {
            xx = 9.64767 + (((tickAnim - 64) / 33) * (8.40104-(9.64767)));
            yy = -11.77264 + (((tickAnim - 64) / 33) * (-11.58374-(-11.77264)));
            zz = 2.98538 + (((tickAnim - 64) / 33) * (2.77829-(2.98538)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 8.40104 + (((tickAnim - 97) / 13) * (0-(8.40104)));
            yy = -11.58374 + (((tickAnim - 97) / 13) * (0-(-11.58374)));
            zz = 2.77829 + (((tickAnim - 97) / 13) * (0-(2.77829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.68415-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.7345-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.04656-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 5.68415 + (((tickAnim - 20) / 16) * (6.25906-(5.68415)));
            yy = 1.7345 + (((tickAnim - 20) / 16) * (13.94065-(1.7345)));
            zz = 2.04656 + (((tickAnim - 20) / 16) * (2.3432-(2.04656)));
        }
        else if (tickAnim >= 36 && tickAnim < 64) {
            xx = 6.25906 + (((tickAnim - 36) / 28) * (6.5701-(6.25906)));
            yy = 13.94065 + (((tickAnim - 36) / 28) * (-14.47478-(13.94065)));
            zz = 2.3432 + (((tickAnim - 36) / 28) * (-0.70246-(2.3432)));
        }
        else if (tickAnim >= 64 && tickAnim < 97) {
            xx = 6.5701 + (((tickAnim - 64) / 33) * (5.68196-(6.5701)));
            yy = -14.47478 + (((tickAnim - 64) / 33) * (-12.14077-(-14.47478)));
            zz = -0.70246 + (((tickAnim - 64) / 33) * (-0.3613-(-0.70246)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 5.68196 + (((tickAnim - 97) / 13) * (0-(5.68196)));
            yy = -12.14077 + (((tickAnim - 97) / 13) * (0-(-12.14077)));
            zz = -0.3613 + (((tickAnim - 97) / 13) * (0-(-0.3613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.03015-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-18.4874-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.88752-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 2.03015 + (((tickAnim - 8) / 12) * (5.45057-(2.03015)));
            yy = -18.4874 + (((tickAnim - 8) / 12) * (1.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(-18.4874)));
            zz = -0.88752 + (((tickAnim - 8) / 12) * (-2.89967-(-0.88752)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 5.45057 + (((tickAnim - 20) / 16) * (5.82765-(5.45057)));
            yy = 1.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 20) / 16) * (0.6046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(1.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            zz = -2.89967 + (((tickAnim - 20) / 16) * (-0.36816-(-2.89967)));
        }
        else if (tickAnim >= 36 && tickAnim < 64) {
            xx = 5.82765 + (((tickAnim - 36) / 28) * (6.16734-(5.82765)));
            yy = 0.6046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 36) / 28) * (-13.82398-(0.6046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -0.36816 + (((tickAnim - 36) / 28) * (-3.23696-(-0.36816)));
        }
        else if (tickAnim >= 64 && tickAnim < 97) {
            xx = 6.16734 + (((tickAnim - 64) / 33) * (5.44455-(6.16734)));
            yy = -13.82398 + (((tickAnim - 64) / 33) * (-14.11743-(-13.82398)));
            zz = -3.23696 + (((tickAnim - 64) / 33) * (-2.87518-(-3.23696)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 5.44455 + (((tickAnim - 97) / 13) * (0-(5.44455)));
            yy = -14.11743 + (((tickAnim - 97) / 13) * (0-(-14.11743)));
            zz = -2.87518 + (((tickAnim - 97) / 13) * (0-(-2.87518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.6268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.4937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.13728-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.6268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 20) / 20) * (-1.00179-(-0.6268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 1.4937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3 + (((tickAnim - 20) / 20) * (3.7687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1.4937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3)));
            zz = -0.13728 + (((tickAnim - 20) / 20) * (-0.13728-(-0.13728)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -1.00179 + (((tickAnim - 40) / 8) * (-15.2977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-88))*-25-(-1.00179)));
            yy = 3.7687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 40) / 8) * (-9.38023-(3.7687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = -0.13728 + (((tickAnim - 40) / 8) * (-0.01546-(-0.13728)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -15.2977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-88))*-25 + (((tickAnim - 48) / 7) * (-1.0248-(-15.2977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-88))*-25)));
            yy = -9.38023 + (((tickAnim - 48) / 7) * (-12.25416-(-9.38023)));
            zz = -0.01546 + (((tickAnim - 48) / 7) * (0.10637-(-0.01546)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -1.0248 + (((tickAnim - 55) / 17) * (0.9752-(-1.0248)));
            yy = -12.25416 + (((tickAnim - 55) / 17) * (-12.25416-(-12.25416)));
            zz = 0.10637 + (((tickAnim - 55) / 17) * (0.10637-(0.10637)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0.9752 + (((tickAnim - 72) / 8) * (2.7252-(0.9752)));
            yy = -12.25416 + (((tickAnim - 72) / 8) * (-12.25416-(-12.25416)));
            zz = 0.10637 + (((tickAnim - 72) / 8) * (0.10637-(0.10637)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 2.7252 + (((tickAnim - 80) / 10) * (-5.58202-(2.7252)));
            yy = -12.25416 + (((tickAnim - 80) / 10) * (-1.5964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(-12.25416)));
            zz = 0.10637 + (((tickAnim - 80) / 10) * (0.8472-(0.10637)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = -5.58202 + (((tickAnim - 90) / 7) * (-7.83202-(-5.58202)));
            yy = -1.5964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 90) / 7) * (3.47862-(-1.5964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            zz = 0.8472 + (((tickAnim - 90) / 7) * (0.8472-(0.8472)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -7.83202 + (((tickAnim - 97) / 13) * (0-(-7.83202)));
            yy = 3.47862 + (((tickAnim - 97) / 13) * (0-(3.47862)));
            zz = 0.8472 + (((tickAnim - 97) / 13) * (0-(0.8472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.30525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.9039-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.07146-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10.30525 + (((tickAnim - 20) / 20) * (5.05525-(10.30525)));
            yy = 5.9039 + (((tickAnim - 20) / 20) * (5.9039-(5.9039)));
            zz = 1.07146 + (((tickAnim - 20) / 20) * (1.07146-(1.07146)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 5.05525 + (((tickAnim - 40) / 8) * (8.97002-(5.05525)));
            yy = 5.9039 + (((tickAnim - 40) / 8) * (0.9232-(5.9039)));
            zz = 1.07146 + (((tickAnim - 40) / 8) * (0.63199-(1.07146)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 8.97002 + (((tickAnim - 48) / 7) * (5.04104-(8.97002)));
            yy = 0.9232 + (((tickAnim - 48) / 7) * (-4.05751-(0.9232)));
            zz = 0.63199 + (((tickAnim - 48) / 7) * (0.19252-(0.63199)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 5.04104 + (((tickAnim - 55) / 17) * (9.29104-(5.04104)));
            yy = -4.05751 + (((tickAnim - 55) / 17) * (-4.05751-(-4.05751)));
            zz = 0.19252 + (((tickAnim - 55) / 17) * (0.19252-(0.19252)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 9.29104 + (((tickAnim - 72) / 8) * (9.80755-(9.29104)));
            yy = -4.05751 + (((tickAnim - 72) / 8) * (-5.29108-(-4.05751)));
            zz = 0.19252 + (((tickAnim - 72) / 8) * (-0.01014-(0.19252)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 9.80755 + (((tickAnim - 80) / 10) * (3.51593-(9.80755)));
            yy = -5.29108 + (((tickAnim - 80) / 10) * (0.62176-(-5.29108)));
            zz = -0.01014 + (((tickAnim - 80) / 10) * (1.01015-(-0.01014)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 3.51593 + (((tickAnim - 90) / 7) * (6.76593-(3.51593)));
            yy = 0.62176 + (((tickAnim - 90) / 7) * (0.62176-(0.62176)));
            zz = 1.01015 + (((tickAnim - 90) / 7) * (1.01015-(1.01015)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 6.76593 + (((tickAnim - 97) / 13) * (0-(6.76593)));
            yy = 0.62176 + (((tickAnim - 97) / 13) * (0-(0.62176)));
            zz = 1.01015 + (((tickAnim - 97) / 13) * (0-(1.01015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.52067-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (21.10684-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.96968-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.52067 + (((tickAnim - 20) / 20) * (-0.9793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(2.52067)));
            yy = 21.10684 + (((tickAnim - 20) / 20) * (21.10684-(21.10684)));
            zz = 6.96968 + (((tickAnim - 20) / 20) * (6.96968-(6.96968)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -0.9793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 40) / 8) * (-9.3918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*25-(-0.9793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 21.10684 + (((tickAnim - 40) / 8) * (2.7308-(21.10684)));
            zz = 6.96968 + (((tickAnim - 40) / 8) * (1.91329-(6.96968)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -9.3918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*25 + (((tickAnim - 48) / 7) * (-4.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-9.3918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*25)));
            yy = 2.7308 + (((tickAnim - 48) / 7) * (-8.18174-(2.7308)));
            zz = 1.91329 + (((tickAnim - 48) / 7) * (-3.8846-(1.91329)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -4.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 55) / 17) * (-8.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-4.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -8.18174 + (((tickAnim - 55) / 17) * (-8.18174-(-8.18174)));
            zz = -3.8846 + (((tickAnim - 55) / 17) * (-3.8846-(-3.8846)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = -8.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 72) / 8) * (-3.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7-(-8.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = -8.18174 + (((tickAnim - 72) / 8) * (-8.18174-(-8.18174)));
            zz = -3.8846 + (((tickAnim - 72) / 8) * (-3.8846-(-3.8846)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -3.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7 + (((tickAnim - 80) / 10) * (-13.251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-3.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7)));
            yy = -8.18174 + (((tickAnim - 80) / 10) * (6.36932-(-8.18174)));
            zz = -3.8846 + (((tickAnim - 80) / 10) * (-3.50552-(-3.8846)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = -13.251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 90) / 7) * (-13.90097-(-13.251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 6.36932 + (((tickAnim - 90) / 7) * (6.36932-(6.36932)));
            zz = -3.50552 + (((tickAnim - 90) / 7) * (-3.50552-(-3.50552)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -13.90097 + (((tickAnim - 97) / 13) * (0-(-13.90097)));
            yy = 6.36932 + (((tickAnim - 97) / 13) * (0-(6.36932)));
            zz = -3.50552 + (((tickAnim - 97) / 13) * (0-(-3.50552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (16.25-(0)));
            yy = 5.75 + (((tickAnim - 20) / 20) * (5.75-(5.75)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 16.25 + (((tickAnim - 40) / 8) * (-5.37174-(16.25)));
            yy = 5.75 + (((tickAnim - 40) / 8) * (-5.8832-(5.75)));
            zz = 0 + (((tickAnim - 40) / 8) * (-3.46104-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -5.37174 + (((tickAnim - 48) / 7) * (16.97527-(-5.37174)));
            yy = -5.8832 + (((tickAnim - 48) / 7) * (-17.51641-(-5.8832)));
            zz = -3.46104 + (((tickAnim - 48) / 7) * (-6.92208-(-3.46104)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 16.97527 + (((tickAnim - 55) / 17) * (17.22527-(16.97527)));
            yy = -17.51641 + (((tickAnim - 55) / 17) * (-17.51641-(-17.51641)));
            zz = -6.92208 + (((tickAnim - 55) / 17) * (-6.92208-(-6.92208)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 17.22527 + (((tickAnim - 72) / 8) * (10.47527-(17.22527)));
            yy = -17.51641 + (((tickAnim - 72) / 8) * (-17.51641-(-17.51641)));
            zz = -6.92208 + (((tickAnim - 72) / 8) * (-6.92208-(-6.92208)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 10.47527 + (((tickAnim - 80) / 10) * (6.13828-(10.47527)));
            yy = -17.51641 + (((tickAnim - 80) / 10) * (-9.1354-(-17.51641)));
            zz = -6.92208 + (((tickAnim - 80) / 10) * (7.00678-(-6.92208)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 6.13828 + (((tickAnim - 90) / 7) * (16.38828-(6.13828)));
            yy = -9.1354 + (((tickAnim - 90) / 7) * (-9.1354-(-9.1354)));
            zz = 7.00678 + (((tickAnim - 90) / 7) * (7.00678-(7.00678)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 16.38828 + (((tickAnim - 97) / 13) * (0-(16.38828)));
            yy = -9.1354 + (((tickAnim - 97) / 13) * (0-(-9.1354)));
            zz = 7.00678 + (((tickAnim - 97) / 13) * (0-(7.00678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.17281-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (19.76833-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.44731-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -1.17281 + (((tickAnim - 20) / 20) * (-1.17281-(-1.17281)));
            yy = 19.76833 + (((tickAnim - 20) / 20) * (19.76833-(19.76833)));
            zz = -3.44731 + (((tickAnim - 20) / 20) * (-3.44731-(-3.44731)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -1.17281 + (((tickAnim - 40) / 8) * (-12.29379-(-1.17281)));
            yy = 19.76833 + (((tickAnim - 40) / 8) * (7.30636-(19.76833)));
            zz = -3.44731 + (((tickAnim - 40) / 8) * (-2.4568-(-3.44731)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -12.29379 + (((tickAnim - 48) / 7) * (-8.91477-(-12.29379)));
            yy = 7.30636 + (((tickAnim - 48) / 7) * (-5.15562-(7.30636)));
            zz = -2.4568 + (((tickAnim - 48) / 7) * (-1.46628-(-2.4568)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -8.91477 + (((tickAnim - 55) / 25) * (1.87504-(-8.91477)));
            yy = -5.15562 + (((tickAnim - 55) / 25) * (2.65189-(-5.15562)));
            zz = -1.46628 + (((tickAnim - 55) / 25) * (-3.76891-(-1.46628)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 1.87504 + (((tickAnim - 80) / 10) * (5.97073-(1.87504)));
            yy = 2.65189 + (((tickAnim - 80) / 10) * (9.25001-(2.65189)));
            zz = -3.76891 + (((tickAnim - 80) / 10) * (-4.64538-(-3.76891)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 5.97073 + (((tickAnim - 90) / 7) * (-9.77927-(5.97073)));
            yy = 9.25001 + (((tickAnim - 90) / 7) * (9.25001-(9.25001)));
            zz = -4.64538 + (((tickAnim - 90) / 7) * (-4.64538-(-4.64538)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -9.77927 + (((tickAnim - 97) / 13) * (0-(-9.77927)));
            yy = 9.25001 + (((tickAnim - 97) / 13) * (0-(9.25001)));
            zz = -4.64538 + (((tickAnim - 97) / 13) * (0-(-4.64538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.25 + (((tickAnim - 20) / 5) * (-4.2-(4.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -4.2 + (((tickAnim - 25) / 5) * (4.25-(-4.2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.25 + (((tickAnim - 30) / 5) * (-4.2-(4.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.2 + (((tickAnim - 35) / 5) * (4.25-(-4.2)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 4.25 + (((tickAnim - 40) / 15) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 4.25 + (((tickAnim - 55) / 4) * (0.5-(4.25)));
            yy = 0 + (((tickAnim - 55) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 4) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 0.5 + (((tickAnim - 59) / 4) * (4.25-(0.5)));
            yy = 0 + (((tickAnim - 59) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 4.25 + (((tickAnim - 63) / 5) * (0.5-(4.25)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 0.5 + (((tickAnim - 68) / 4) * (4.25-(0.5)));
            yy = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 97) {
            xx = 4.25 + (((tickAnim - 72) / 25) * (13.5-(4.25)));
            yy = 0 + (((tickAnim - 72) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 25) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 13.5 + (((tickAnim - 97) / 13) * (0-(13.5)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 45) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 5) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 45) / 5) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 50) / 5) * (1-(1)));
            yy = -0.01 + (((tickAnim - 50) / 5) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 50) / 5) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 55) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 55) / 23) * (1-(1)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 78) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 78) / 5) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 78) / 5) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 83) / 5) * (1-(1)));
            yy = -0.01 + (((tickAnim - 83) / 5) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 83) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 7) / 13) * (0-(15.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 16.5 + (((tickAnim - 7) / 13) * (0-(16.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 7) / 13) * (0-(15)));
            yy = 11 + (((tickAnim - 7) / 13) * (0-(11)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(0), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-11-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 7) / 13) * (0-(15)));
            yy = -11 + (((tickAnim - 7) / 13) * (0-(-11)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(0), ElbowR.rotateAngleY + (float) Math.toRadians(0), ElbowR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 20.5 + (((tickAnim - 7) / 5) * (32.75-(20.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 32.75 + (((tickAnim - 12) / 5) * (20.5-(32.75)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 20.5 + (((tickAnim - 17) / 3) * (0-(20.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -0.175 + (((tickAnim - 12) / 8) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -7 + (((tickAnim - 7) / 5) * (30-(-7)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 30 + (((tickAnim - 12) / 5) * (-7-(30)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 17) / 3) * (0-(-7)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 15.25 + (((tickAnim - 7) / 5) * (-9-(15.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -9 + (((tickAnim - 12) / 5) * (15.25-(-9)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 15.25 + (((tickAnim - 17) / 3) * (0-(15.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 7 + (((tickAnim - 7) / 5) * (-10.5-(7)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -10.5 + (((tickAnim - 12) / 1) * (6.08-(-10.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.08 + (((tickAnim - 13) / 4) * (7-(6.08)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 17) / 3) * (0-(7)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (19.25-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.25 + (((tickAnim - 12) / 1) * (0-(19.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 8) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 27.25 + (((tickAnim - 15) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 22) / 6) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 27.25 + (((tickAnim - 28) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -12.25 + (((tickAnim - 35) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 42) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.25 + (((tickAnim - 8) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.75 + (((tickAnim - 15) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -29.25 + (((tickAnim - 22) / 6) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 28) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 35) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 42) / 8) * (0-(14.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -30.75 + (((tickAnim - 4) / 4) * (11.5-(-30.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 8) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 15) / 3) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -48.12 + (((tickAnim - 18) / 4) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 22) / 6) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 20.25 + (((tickAnim - 28) / 4) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -48.12 + (((tickAnim - 32) / 3) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 11.5 + (((tickAnim - 35) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 42) / 8) * (0-(20.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (68.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 68.75 + (((tickAnim - 4) / 4) * (29-(68.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29 + (((tickAnim - 8) / 4) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.37 + (((tickAnim - 12) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 56.75 + (((tickAnim - 15) / 3) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 66.13 + (((tickAnim - 18) / 4) * (29-(66.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29 + (((tickAnim - 22) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -17.37 + (((tickAnim - 25) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 56.75 + (((tickAnim - 28) / 4) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 66.13 + (((tickAnim - 32) / 3) * (29-(66.13)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 29 + (((tickAnim - 35) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.37 + (((tickAnim - 38) / 4) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 56.75 + (((tickAnim - 42) / 8) * (0-(56.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 4) * (0.475-(0.575)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 2) * (1.58-(0.475)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.29-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.58 + (((tickAnim - 10) / 2) * (0.48-(1.58)));
            zz = 0.29 + (((tickAnim - 10) / 2) * (0.575-(0.29)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.48 + (((tickAnim - 12) / 3) * (0.475-(0.48)));
            zz = 0.575 + (((tickAnim - 12) / 3) * (0-(0.575)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 15) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 22) / 1) * (1.58-(0.475)));
            zz = 0 + (((tickAnim - 22) / 1) * (0.29-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.58 + (((tickAnim - 23) / 5) * (0.475-(1.58)));
            zz = 0.29 + (((tickAnim - 23) / 5) * (0-(0.29)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 35) / 2) * (1.58-(0.475)));
            zz = 0 + (((tickAnim - 35) / 2) * (0.29-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 1.58 + (((tickAnim - 37) / 5) * (0.475-(1.58)));
            zz = 0.29 + (((tickAnim - 37) / 5) * (0-(0.29)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 42) / 3) * (1.58-(0.475)));
            zz = 0 + (((tickAnim - 42) / 3) * (0.29-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.58 + (((tickAnim - 45) / 5) * (0-(1.58)));
            zz = 0.29 + (((tickAnim - 45) / 5) * (0-(0.29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesL.rotationPointX = this.PesL.rotationPointX + (float)(xx);
        this.PesL.rotationPointY = this.PesL.rotationPointY - (float)(yy);
        this.PesL.rotationPointZ = this.PesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 8) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 15) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 4.25 + (((tickAnim - 22) / 6) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 28) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 35) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -12 + (((tickAnim - 42) / 6) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 4.25 + (((tickAnim - 48) / 2) * (0-(4.25)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 8) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 5.75 + (((tickAnim - 22) / 6) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 35) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 6) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 5.75 + (((tickAnim - 48) / 2) * (0-(5.75)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 11 + (((tickAnim - 8) / 4) * (14.56-(11)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 14.56 + (((tickAnim - 12) / 3) * (-11.5-(14.56)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 3) * (-13.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -13.5 + (((tickAnim - 18) / 4) * (11-(-13.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 22) / 3) * (14.63-(11)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 14.63 + (((tickAnim - 25) / 3) * (-11.5-(14.63)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 5) * (-9.53-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -9.53 + (((tickAnim - 33) / 2) * (11-(-9.53)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 35) / 3) * (15.63-(11)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 15.63 + (((tickAnim - 38) / 4) * (-11.5-(15.63)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 2) * (-16.22-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -16.22 + (((tickAnim - 44) / 4) * (11-(-16.22)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 11 + (((tickAnim - 48) / 2) * (0-(11)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 8) / 7) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 8) / 7) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0.21279 + (((tickAnim - 15) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 15) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 15) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 22) / 6) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 22) / 6) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.21279 + (((tickAnim - 28) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 28) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 28) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
            zz = -2.5 + (((tickAnim - 35) / 15) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 8) / 7) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 15) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -2.75 + (((tickAnim - 22) / 6) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 28) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.95309-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.98898-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.26034-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13.95309 + (((tickAnim - 8) / 7) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 8) / 7) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 8) / 7) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.26259 + (((tickAnim - 15) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 15) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 15) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 13.95309 + (((tickAnim - 22) / 6) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 22) / 6) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 22) / 6) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.26259 + (((tickAnim - 28) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 28) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 28) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.95309 + (((tickAnim - 35) / 15) * (0-(13.95309)));
            yy = -3.98898 + (((tickAnim - 35) / 15) * (0-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 35) / 15) * (0-(4.26034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.76159-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-13.08238-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.3118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.76159 + (((tickAnim - 8) / 7) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 8) / 7) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 8) / 7) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.66984 + (((tickAnim - 15) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 15) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 15) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.76159 + (((tickAnim - 22) / 6) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 22) / 6) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 22) / 6) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.66984 + (((tickAnim - 28) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 28) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 28) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.76159 + (((tickAnim - 35) / 15) * (0-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 35) / 15) * (0-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 35) / 15) * (0-(3.3118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 15) / 20) * (-8-(-8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 35) / 15) * (0-(-8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Eocursor, Eocursor.rotateAngleX + (float) Math.toRadians(xx), Eocursor.rotateAngleY + (float) Math.toRadians(yy), Eocursor.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.175 + (((tickAnim - 15) / 20) * (-8.175-(-8.175)));
            zz = 2.475 + (((tickAnim - 15) / 20) * (2.475-(2.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.175 + (((tickAnim - 35) / 15) * (0-(-8.175)));
            zz = 2.475 + (((tickAnim - 35) / 15) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eocursor.rotationPointX = this.Eocursor.rotationPointX + (float)(xx);
        this.Eocursor.rotationPointY = this.Eocursor.rotationPointY - (float)(yy);
        this.Eocursor.rotationPointZ = this.Eocursor.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-28.73717-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-14.25362-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.54179-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -28.73717 + (((tickAnim - 15) / 20) * (-28.73717-(-28.73717)));
            yy = -14.25362 + (((tickAnim - 15) / 20) * (-14.25362-(-14.25362)));
            zz = -4.54179 + (((tickAnim - 15) / 20) * (-4.54179-(-4.54179)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.73717 + (((tickAnim - 35) / 15) * (0-(-28.73717)));
            yy = -14.25362 + (((tickAnim - 35) / 15) * (0-(-14.25362)));
            zz = -4.54179 + (((tickAnim - 35) / 15) * (0-(-4.54179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 37.5 + (((tickAnim - 15) / 20) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 35) / 15) * (0-(37.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-71.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -71.25 + (((tickAnim - 15) / 20) * (-71.25-(-71.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -71.25 + (((tickAnim - 35) / 15) * (0-(-71.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.725 + (((tickAnim - 15) / 20) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.725 + (((tickAnim - 35) / 15) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalL.rotationPointX = this.MetatarsalL.rotationPointX + (float)(xx);
        this.MetatarsalL.rotationPointY = this.MetatarsalL.rotationPointY - (float)(yy);
        this.MetatarsalL.rotationPointZ = this.MetatarsalL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (72-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 72 + (((tickAnim - 15) / 20) * (72-(72)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 72 + (((tickAnim - 35) / 15) * (0-(72)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 20) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 15) * (0-(0.425)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesL.rotationPointX = this.PesL.rotationPointX + (float)(xx);
        this.PesL.rotationPointY = this.PesL.rotationPointY - (float)(yy);
        this.PesL.rotationPointZ = this.PesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-28.73717-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (14.2536-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.5418-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -28.73717 + (((tickAnim - 15) / 20) * (-28.73717-(-28.73717)));
            yy = 14.2536 + (((tickAnim - 15) / 20) * (14.2536-(14.2536)));
            zz = 4.5418 + (((tickAnim - 15) / 20) * (4.5418-(4.5418)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.73717 + (((tickAnim - 35) / 15) * (0-(-28.73717)));
            yy = 14.2536 + (((tickAnim - 35) / 15) * (0-(14.2536)));
            zz = 4.5418 + (((tickAnim - 35) / 15) * (0-(4.5418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 37.5 + (((tickAnim - 15) / 20) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 35) / 15) * (0-(37.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-71.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -71.25 + (((tickAnim - 15) / 20) * (-71.25-(-71.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -71.25 + (((tickAnim - 35) / 15) * (0-(-71.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.725 + (((tickAnim - 15) / 20) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.725 + (((tickAnim - 35) / 15) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalR.rotationPointX = this.MetatarsalR.rotationPointX + (float)(xx);
        this.MetatarsalR.rotationPointY = this.MetatarsalR.rotationPointY - (float)(yy);
        this.MetatarsalR.rotationPointZ = this.MetatarsalR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (72-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 72 + (((tickAnim - 15) / 20) * (72-(72)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 72 + (((tickAnim - 35) / 15) * (0-(72)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 20) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 15) * (0-(0.425)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesR.rotationPointX = this.PesR.rotationPointX + (float)(xx);
        this.PesR.rotationPointY = this.PesR.rotationPointY - (float)(yy);
        this.PesR.rotationPointZ = this.PesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20.25 + (((tickAnim - 15) / 20) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20.25 + (((tickAnim - 35) / 5) * (-7.87891-(-20.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (-1.21039-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0.01441-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.87891 + (((tickAnim - 40) / 10) * (0-(-7.87891)));
            yy = -1.21039 + (((tickAnim - 40) / 10) * (0-(-1.21039)));
            zz = 0.01441 + (((tickAnim - 40) / 10) * (0-(0.01441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 15) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 35) / 5) * (-9-(3)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 40) / 10) * (0-(-9)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.83-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.83 + (((tickAnim - 10) / 5) * (19.25-(24.83)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19.25 + (((tickAnim - 15) / 20) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 19.25 + (((tickAnim - 35) / 5) * (-0.42-(19.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -0.42 + (((tickAnim - 40) / 4) * (-4.33-(-0.42)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = -4.33 + (((tickAnim - 44) / 3) * (-5.58-(-4.33)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -5.58 + (((tickAnim - 47) / 3) * (0-(-5.58)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 10) / 5) * (15.75-(21.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 15) / 20) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15.75 + (((tickAnim - 35) / 5) * (18-(15.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 18 + (((tickAnim - 40) / 4) * (-11.25-(18)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = -11.25 + (((tickAnim - 44) / 3) * (-15.79-(-11.25)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -15.79 + (((tickAnim - 47) / 3) * (0-(-15.79)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.9381-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7.14378-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.01264-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.9381 + (((tickAnim - 15) / 20) * (22.9381-(22.9381)));
            yy = 7.14378 + (((tickAnim - 15) / 20) * (7.14378-(7.14378)));
            zz = 3.01264 + (((tickAnim - 15) / 20) * (3.01264-(3.01264)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.9381 + (((tickAnim - 35) / 15) * (0-(22.9381)));
            yy = 7.14378 + (((tickAnim - 35) / 15) * (0-(7.14378)));
            zz = 3.01264 + (((tickAnim - 35) / 15) * (0-(3.01264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.9381-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.1438-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.0126-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.9381 + (((tickAnim - 15) / 20) * (22.9381-(22.9381)));
            yy = -7.1438 + (((tickAnim - 15) / 20) * (-7.1438-(-7.1438)));
            zz = -3.0126 + (((tickAnim - 15) / 20) * (-3.0126-(-3.0126)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.9381 + (((tickAnim - 35) / 15) * (0-(22.9381)));
            yy = -7.1438 + (((tickAnim - 35) / 15) * (0-(-7.1438)));
            zz = -3.0126 + (((tickAnim - 35) / 15) * (0-(-3.0126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 15) / 20) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 35) / 15) * (0-(15)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.5 + (((tickAnim - 15) / 20) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 35) / 15) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.25 + (((tickAnim - 3) / 7) * (-9-(1.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 10) / 10) * (0-(-9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 3) / 7) * (-5.25-(1.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.25 + (((tickAnim - 10) / 10) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 10) / 10) * (0-(35)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 10) / 10) * (0-(35)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 5.75 + (((tickAnim - 3) / 7) * (-7.75-(5.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -7.75 + (((tickAnim - 10) / 4) * (-9.31-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -9.31 + (((tickAnim - 14) / 6) * (0-(-9.31)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 5.25 + (((tickAnim - 3) / 7) * (-2.25-(5.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -2.25 + (((tickAnim - 10) / 4) * (-5.4-(-2.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -5.4 + (((tickAnim - 14) / 6) * (0-(-5.4)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-7.12-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.12 + (((tickAnim - 2) / 1) * (-18.75-(-7.12)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -18.75 + (((tickAnim - 3) / 7) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-14-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 14) / 6) * (0-(-14)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.5 + (((tickAnim - 2) / 1) * (-12-(1.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 3) / 7) * (8.5-(-12)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 8.5 + (((tickAnim - 10) / 4) * (19.52-(8.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 19.52 + (((tickAnim - 14) / 6) * (0-(19.52)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (29.5-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 29.5 + (((tickAnim - 10) / 4) * (31.04-(29.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 31.04 + (((tickAnim - 14) / 6) * (0-(31.04)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Eocursor, Eocursor.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*2), Eocursor.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+20))*7), Eocursor.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*7));
        this.Eocursor.rotationPointX = this.Eocursor.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*0.5);
        this.Eocursor.rotationPointY = this.Eocursor.rotationPointY - (float)(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*-1.2);
        this.Eocursor.rotationPointZ = this.Eocursor.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-80))*-1);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18.75 + (((tickAnim - 0) / 1) * (-30.4826-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.35745-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (1.46892-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -30.4826 + (((tickAnim - 1) / 5) * (31.14577-(-30.4826)));
            yy = 1.35745 + (((tickAnim - 1) / 5) * (-11.27845-(1.35745)));
            zz = 1.46892 + (((tickAnim - 1) / 5) * (-1.19602-(1.46892)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 31.14577 + (((tickAnim - 6) / 6) * (-18.75-(31.14577)));
            yy = -11.27845 + (((tickAnim - 6) / 6) * (0-(-11.27845)));
            zz = -1.19602 + (((tickAnim - 6) / 6) * (0-(-1.19602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -24.25 + (((tickAnim - 0) / 1) * (-27.5-(-24.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -27.5 + (((tickAnim - 1) / 5) * (11.5-(-27.5)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 6) / 2) * (31.2-(11.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 31.2 + (((tickAnim - 8) / 4) * (-24.25-(31.2)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.825-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -1.075 + (((tickAnim - 1) / 1) * (0-(-1.075)));
            zz = 0.825 + (((tickAnim - 1) / 1) * (0-(0.825)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -32.25 + (((tickAnim - 0) / 1) * (8.56419-(-32.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.12928-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.35369-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 8.56419 + (((tickAnim - 1) / 5) * (21.75-(8.56419)));
            yy = 0.12928 + (((tickAnim - 1) / 5) * (0-(0.12928)));
            zz = -0.35369 + (((tickAnim - 1) / 5) * (0-(-0.35369)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 21.75 + (((tickAnim - 6) / 2) * (-37.45-(21.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.45 + (((tickAnim - 8) / 2) * (-40.83-(-37.45)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -40.83 + (((tickAnim - 10) / 2) * (-32.25-(-40.83)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 77 + (((tickAnim - 0) / 1) * (43.57772-(77)));
            yy = 0 + (((tickAnim - 0) / 1) * (-9.03628-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-6.48725-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 43.57772 + (((tickAnim - 1) / 1) * (23.23185-(43.57772)));
            yy = -9.03628 + (((tickAnim - 1) / 1) * (-5.80544-(-9.03628)));
            zz = -6.48725 + (((tickAnim - 1) / 1) * (-7.95998-(-6.48725)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.23185 + (((tickAnim - 2) / 1) * (4.7317-(23.23185)));
            yy = -5.80544 + (((tickAnim - 2) / 1) * (-7.64426-(-5.80544)));
            zz = -7.95998 + (((tickAnim - 2) / 1) * (-3.36385-(-7.95998)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 4.7317 + (((tickAnim - 3) / 0) * (-15.91-(4.7317)));
            yy = -7.64426 + (((tickAnim - 3) / 0) * (0-(-7.64426)));
            zz = -3.36385 + (((tickAnim - 3) / 0) * (0-(-3.36385)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15.91 + (((tickAnim - 3) / 1) * (16.45-(-15.91)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 16.45 + (((tickAnim - 4) / 2) * (76-(16.45)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 76 + (((tickAnim - 6) / 6) * (77-(76)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.725 + (((tickAnim - 1) / 1) * (2.075-(0.725)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.075 + (((tickAnim - 2) / 1) * (2.435-(2.075)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.75-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.435 + (((tickAnim - 3) / 0) * (0.85-(2.435)));
            zz = 0.75 + (((tickAnim - 3) / 0) * (0-(0.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 1) * (1.215-(0.85)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 4) / 2) * (0.875-(1.215)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 2) * (1.23-(0.875)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.23 + (((tickAnim - 8) / 4) * (0-(1.23)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesL.rotationPointX = this.PesL.rotationPointX + (float)(xx);
        this.PesL.rotationPointY = this.PesL.rotationPointY - (float)(yy);
        this.PesL.rotationPointZ = this.PesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 32.62501 + (((tickAnim - 0) / 6) * (-18.75-(32.62501)));
            yy = 8.8552 + (((tickAnim - 0) / 6) * (0-(8.8552)));
            zz = 1.61437 + (((tickAnim - 0) / 6) * (0-(1.61437)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -18.75 + (((tickAnim - 6) / 1) * (-21.93945-(-18.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (-2.42196-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-2.86383-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -21.93945 + (((tickAnim - 7) / 5) * (32.62501-(-21.93945)));
            yy = -2.42196 + (((tickAnim - 7) / 5) * (8.8552-(-2.42196)));
            zz = -2.86383 + (((tickAnim - 7) / 5) * (1.61437-(-2.86383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 19.25 + (((tickAnim - 0) / 2) * (24.42-(19.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 24.42 + (((tickAnim - 2) / 4) * (-24.25-(24.42)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -24.25 + (((tickAnim - 6) / 1) * (-27.5-(-24.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -27.5 + (((tickAnim - 7) / 5) * (19.25-(-27.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.25 + (((tickAnim - 0) / 3) * (-38.83-(21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -38.83 + (((tickAnim - 3) / 1) * (-39.54-(-38.83)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -39.54 + (((tickAnim - 4) / 2) * (-32.25-(-39.54)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -32.25 + (((tickAnim - 6) / 1) * (8.25-(-32.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 8.25 + (((tickAnim - 7) / 5) * (21.25-(8.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.25-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 8) / 4) * (0-(1.25)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalR.rotationPointX = this.MetatarsalR.rotationPointX + (float)(xx);
        this.MetatarsalR.rotationPointY = this.MetatarsalR.rotationPointY - (float)(yy);
        this.MetatarsalR.rotationPointZ = this.MetatarsalR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 76 + (((tickAnim - 0) / 4) * (66.92-(76)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 66.92 + (((tickAnim - 4) / 2) * (77-(66.92)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 77 + (((tickAnim - 6) / 1) * (38.48344-(77)));
            yy = 0 + (((tickAnim - 6) / 1) * (4.49231-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (9.62365-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 38.48344 + (((tickAnim - 7) / 1) * (16.85825-(38.48344)));
            yy = 4.49231 + (((tickAnim - 7) / 1) * (7.35042-(4.49231)));
            zz = 9.62365 + (((tickAnim - 7) / 1) * (6.49359-(9.62365)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 16.85825 + (((tickAnim - 8) / 0) * (0.68338-(16.85825)));
            yy = 7.35042 + (((tickAnim - 8) / 0) * (3.29559-(7.35042)));
            zz = 6.49359 + (((tickAnim - 8) / 0) * (3.45501-(6.49359)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.68338 + (((tickAnim - 8) / 2) * (41.34169-(0.68338)));
            yy = 3.29559 + (((tickAnim - 8) / 2) * (1.6478-(3.29559)));
            zz = 3.45501 + (((tickAnim - 8) / 2) * (1.72751-(3.45501)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 41.34169 + (((tickAnim - 10) / 2) * (76-(41.34169)));
            yy = 1.6478 + (((tickAnim - 10) / 2) * (0-(1.6478)));
            zz = 1.72751 + (((tickAnim - 10) / 2) * (0-(1.72751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 2) * (1.13-(0.875)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.13 + (((tickAnim - 2) / 2) * (1.07-(1.13)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.07 + (((tickAnim - 4) / 2) * (0-(1.07)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (1.6-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.6 + (((tickAnim - 7) / 1) * (1.81-(1.6)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.81 + (((tickAnim - 8) / 0) * (1.74-(1.81)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.74 + (((tickAnim - 8) / 4) * (0.875-(1.74)));
            zz = 0.75 + (((tickAnim - 8) / 4) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesR.rotationPointX = this.PesR.rotationPointX + (float)(xx);
        this.PesR.rotationPointY = this.PesR.rotationPointY - (float)(yy);
        this.PesR.rotationPointZ = this.PesR.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-290))*-3), Neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-80))*7));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-340))*-5), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-220))*7));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*0.2), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+240))*10), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*-7));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*0.2), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+240))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*-7));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*0.2), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+200))*18), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*-7));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-20))*0.2), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+370))*-15), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*-7));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-130))*-2), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+10))*-5), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-30))*7));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-250))*2.5), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+70))*-5), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+80))*7));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(18.57303), ArmL.rotateAngleY + (float) Math.toRadians(16.73671), ArmL.rotateAngleZ + (float) Math.toRadians(-2.34958));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(18.57303), ArmR.rotateAngleY + (float) Math.toRadians(-16.7367), ArmR.rotateAngleZ + (float) Math.toRadians(-2.34958));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-370))*-7), Neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-5), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-220))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.585-370))*9), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEocursor entity = (EntityPrehistoricFloraEocursor) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Eocursor, Eocursor.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-1), Eocursor.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-2), Eocursor.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*2));
        this.Eocursor.rotationPointX = this.Eocursor.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.18);
        this.Eocursor.rotationPointY = this.Eocursor.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.3);
        this.Eocursor.rotationPointZ = this.Eocursor.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.2);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -17.22372 + (((tickAnim - 0) / 10) * (21.25211-(-17.22372)));
            yy = 1.51293 + (((tickAnim - 0) / 10) * (-4.8252-(1.51293)));
            zz = 1.99047 + (((tickAnim - 0) / 10) * (3.3955-(1.99047)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 21.25211 + (((tickAnim - 10) / 7) * (-4.1057-(21.25211)));
            yy = -4.8252 + (((tickAnim - 10) / 7) * (-5.16022-(-4.8252)));
            zz = 3.3955 + (((tickAnim - 10) / 7) * (-0.97363-(3.3955)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -4.1057 + (((tickAnim - 17) / 3) * (-17.22372-(-4.1057)));
            yy = -5.16022 + (((tickAnim - 17) / 3) * (1.51293-(-5.16022)));
            zz = -0.97363 + (((tickAnim - 17) / 3) * (1.99047-(-0.97363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27 + (((tickAnim - 0) / 10) * (7.5-(-27)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 10) / 3) * (21.87-(7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 21.87 + (((tickAnim - 13) / 2) * (-12.16-(21.87)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -12.16 + (((tickAnim - 15) / 3) * (-30.39-(-12.16)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30.39 + (((tickAnim - 18) / 2) * (-27-(-30.39)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 15) / 5) * (0-(0.65)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 0) / 10) * (16.5-(11)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.5 + (((tickAnim - 10) / 3) * (-15.45-(16.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.45 + (((tickAnim - 13) / 2) * (-40.34-(-15.45)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -40.34 + (((tickAnim - 15) / 3) * (-34.59-(-40.34)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -34.59 + (((tickAnim - 18) / 2) * (11-(-34.59)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 3) / 7) * (0-(0.475)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalL.rotationPointX = this.MetatarsalL.rotationPointX + (float)(xx);
        this.MetatarsalL.rotationPointY = this.MetatarsalL.rotationPointY - (float)(yy);
        this.MetatarsalL.rotationPointZ = this.MetatarsalL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.5 + (((tickAnim - 0) / 3) * (8.33-(33.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 8.33 + (((tickAnim - 3) / 4) * (-8.46-(8.33)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.46 + (((tickAnim - 7) / 3) * (87.25-(-8.46)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 87.25 + (((tickAnim - 10) / 3) * (85.36-(87.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 85.36 + (((tickAnim - 13) / 2) * (88.68-(85.36)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 88.68 + (((tickAnim - 15) / 3) * (96.15-(88.68)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 96.15 + (((tickAnim - 18) / 2) * (33.5-(96.15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 3) * (1.475-(0.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 1.475 + (((tickAnim - 3) / 7) * (0.6-(1.475)));
            zz = -0.12 + (((tickAnim - 3) / 7) * (-0.35-(-0.12)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 10) / 5) * (1.03-(0.6)));
            zz = -0.35 + (((tickAnim - 10) / 5) * (-0.22-(-0.35)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.03 + (((tickAnim - 15) / 5) * (0-(1.03)));
            zz = -0.22 + (((tickAnim - 15) / 5) * (0-(-0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesL.rotationPointX = this.PesL.rotationPointX + (float)(xx);
        this.PesL.rotationPointY = this.PesL.rotationPointY - (float)(yy);
        this.PesL.rotationPointZ = this.PesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 21.25211 + (((tickAnim - 0) / 6) * (-3.18106-(21.25211)));
            yy = 4.82518 + (((tickAnim - 0) / 6) * (8.27914-(4.82518)));
            zz = -3.39549 + (((tickAnim - 0) / 6) * (-3.87644-(-3.39549)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -3.18106 + (((tickAnim - 6) / 3) * (-17.21215-(-3.18106)));
            yy = 8.27914 + (((tickAnim - 6) / 3) * (-1.81536-(8.27914)));
            zz = -3.87644 + (((tickAnim - 6) / 3) * (-2.38881-(-3.87644)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -17.21215 + (((tickAnim - 9) / 11) * (21.25211-(-17.21215)));
            yy = -1.81536 + (((tickAnim - 9) / 11) * (4.82518-(-1.81536)));
            zz = -2.38881 + (((tickAnim - 9) / 11) * (-3.39549-(-2.38881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (16.87-(7.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 16.87 + (((tickAnim - 2) / 2) * (-12.16-(16.87)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.16 + (((tickAnim - 4) / 3) * (-30.39-(-12.16)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -30.39 + (((tickAnim - 7) / 2) * (-27-(-30.39)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -27 + (((tickAnim - 9) / 11) * (7.5-(-27)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 4) / 5) * (0-(0.65)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeR.rotationPointX = this.KneeR.rotationPointX + (float)(xx);
        this.KneeR.rotationPointY = this.KneeR.rotationPointY - (float)(yy);
        this.KneeR.rotationPointZ = this.KneeR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 16.5 + (((tickAnim - 0) / 2) * (-6.2-(16.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -6.2 + (((tickAnim - 2) / 2) * (-40.34-(-6.2)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -40.34 + (((tickAnim - 4) / 3) * (-34.59-(-40.34)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -34.59 + (((tickAnim - 7) / 2) * (11-(-34.59)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 9) / 11) * (16.5-(11)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.425-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 7) * (0-(0.425)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalR.rotationPointX = this.MetatarsalR.rotationPointX + (float)(xx);
        this.MetatarsalR.rotationPointY = this.MetatarsalR.rotationPointY - (float)(yy);
        this.MetatarsalR.rotationPointZ = this.MetatarsalR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 87.25 + (((tickAnim - 0) / 2) * (85.36-(87.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 85.36 + (((tickAnim - 2) / 1) * (88.68-(85.36)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 88.68 + (((tickAnim - 3) / 4) * (96.15-(88.68)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 96.15 + (((tickAnim - 7) / 2) * (33.5-(96.15)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 33.5 + (((tickAnim - 9) / 4) * (11.21-(33.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.21 + (((tickAnim - 13) / 3) * (-9.86-(11.21)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -9.86 + (((tickAnim - 16) / 4) * (87.25-(-9.86)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (1.03-(0.6)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (-0.22-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.03 + (((tickAnim - 3) / 6) * (0.4-(1.03)));
            zz = -0.22 + (((tickAnim - 3) / 6) * (0-(-0.22)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 9) / 4) * (1.78-(0.4)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.11-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.78 + (((tickAnim - 13) / 7) * (0.6-(1.78)));
            zz = -0.11 + (((tickAnim - 13) / 7) * (-0.35-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.PesR.rotationPointX = this.PesR.rotationPointX + (float)(xx);
        this.PesR.rotationPointY = this.PesR.rotationPointY - (float)(yy);
        this.PesR.rotationPointZ = this.PesR.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.1), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.1), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-4));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.1), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-7), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-6));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.1), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+130))*-9));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-160))*-1.5), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-230))*-2), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*2));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*-4), ArmL.rotateAngleY + (float) Math.toRadians(15.75), ArmL.rotateAngleZ + (float) Math.toRadians(-9.5));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*4), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*-4), ArmR.rotateAngleY + (float) Math.toRadians(-15.75), ArmR.rotateAngleZ + (float) Math.toRadians(9.5));


        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*4), ElbowR.rotateAngleY + (float) Math.toRadians(0), ElbowR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-270))*-2), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-2), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*2));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-390))*-4), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEocursor e = (EntityPrehistoricFloraEocursor) entity;
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
