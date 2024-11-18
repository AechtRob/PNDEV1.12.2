package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLesothosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLesothosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Lesothosaurus;
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

    public ModelLesothosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Lesothosaurus = new AdvancedModelRenderer(this);
        this.Lesothosaurus.setRotationPoint(0.5F, 6.75F, 2.5F);


        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(-0.5F, 0.3F, -1.0F);
        this.Lesothosaurus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1047F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 22, 9, -2.0F, -2.77F, -3.1972F, 5, 6, 7, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(-0.4F, -0.2F, -1.5F);
        this.Lesothosaurus.addChild(LegL);
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
        this.Lesothosaurus.addChild(LegR);
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
        this.Lesothosaurus.addChild(Tail1);


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
        this.Lesothosaurus.addChild(Body);


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
        this.Lesothosaurus.render(f5);
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
        this.Lesothosaurus.offsetY = -0.30F;
        this.Lesothosaurus.offsetX = 1.2F;
        this.Lesothosaurus.rotateAngleY = (float)Math.toRadians(130);
        this.Lesothosaurus.rotateAngleX = (float)Math.toRadians(0);
        this.Lesothosaurus.rotateAngleZ = (float)Math.toRadians(0);
        this.Lesothosaurus.scaleChildren = true;
        float scaler = 2.0F;
        this.Lesothosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Lesothosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Lesothosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Lesothosaurus.scaleChildren = false;
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

        EntityPrehistoricFloraLesothosaurus entityLesothosaurus = (EntityPrehistoricFloraLesothosaurus) e;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityLesothosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityLesothosaurus.getAnimation() == entityLesothosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityLesothosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityLesothosaurus.getIsMoving()) {
                    if (entityLesothosaurus.getAnimation() != entityLesothosaurus.EAT_ANIMATION
                            && entityLesothosaurus.getAnimation() != entityLesothosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityLesothosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraLesothosaurus ee = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        
    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLesothosaurus e = (EntityPrehistoricFloraLesothosaurus) entity;
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
