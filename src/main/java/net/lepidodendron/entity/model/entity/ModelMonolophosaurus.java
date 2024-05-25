package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMonolophosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMonolophosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer Monolophosaurus;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer Femur_r1;
    private final AdvancedModelRenderer TibiaL;
    private final AdvancedModelRenderer TibioFibula_r1;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer Metatarsal_r1;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer Femur_r2;
    private final AdvancedModelRenderer TibiaR;
    private final AdvancedModelRenderer TibioFibula_r2;
    private final AdvancedModelRenderer MetatarsalR;
    private final AdvancedModelRenderer Metatarsal_r2;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer CaudalProximal_r1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer CaudalMedioproximal_r1;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer CaudalMediodistal_r1;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer CaudalDistal_r1;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer CaudalDistalmost_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Thorax_r1;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Scapulo_coracoid_r1;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer Humerus_r1;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer Radio_Ulna_r1;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer Humerus_r2;
    private final AdvancedModelRenderer ElbowR;
    private final AdvancedModelRenderer Radio_Ulna_r2;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer CervicalDistal_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer CervicalMedialcontinuation_r1;
    private final AdvancedModelRenderer CervicalMedial_r1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer MStenothyrohyoidNeck_r1;
    private final AdvancedModelRenderer CervicalProximal_r1;
    private final AdvancedModelRenderer Atlas_r1;
    private final AdvancedModelRenderer ThroatPouch;
    private final AdvancedModelRenderer TrhoatPouch_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer PremaxillaryTeeth_r1;
    private final AdvancedModelRenderer MaxillaryTeeth_r1;
    private final AdvancedModelRenderer Premaxilla_r1;
    private final AdvancedModelRenderer PremaxillaryCrest_r1;
    private final AdvancedModelRenderer NasalCrest_r1;
    private final AdvancedModelRenderer nares_r1;
    private final AdvancedModelRenderer NasalCrest_r2;
    private final AdvancedModelRenderer LacrimalCrestL_r1;
    private final AdvancedModelRenderer LacrimalCrestL_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer DentaryProximalVentral_r1;
    private final AdvancedModelRenderer DentaryDistal_r1;
    private final AdvancedModelRenderer DentaryTeethDistal_r1;
    private final AdvancedModelRenderer MMasseter_r1;
    private final AdvancedModelRenderer DentaryProximalDorsal_r1;
    private final AdvancedModelRenderer DentaryTeethProximal_r1;
    private final AdvancedModelRenderer MStenothyrohyoid_r1;
    private ModelAnimator animator;

    public ModelMonolophosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Monolophosaurus = new AdvancedModelRenderer(this);
        this.Monolophosaurus.setRotationPoint(0.0F, -0.9F, 6.3F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-2.0F, -2.0F, -2.0F);
        this.Monolophosaurus.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1484F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 39, 34, -1.5F, 0.0F, -1.0F, 7, 10, 8, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 2.1F, -0.2F);
        this.Monolophosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.0873F, 0.0F, 0.0F);


        this.Femur_r1 = new AdvancedModelRenderer(this);
        this.Femur_r1.setRotationPoint(0.0F, -0.3F, 0.1F);
        this.LegL.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, -0.3491F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 61, 52, -1.5F, -0.8452F, -3.349F, 4, 12, 7, 0.0F, false));

        this.TibiaL = new AdvancedModelRenderer(this);
        this.TibiaL.setRotationPoint(0.0F, 8.5F, -6.5F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.2618F, 0.0F, 0.0F);


        this.TibioFibula_r1 = new AdvancedModelRenderer(this);
        this.TibioFibula_r1.setRotationPoint(0.5F, 1.5F, -0.7F);
        this.TibiaL.addChild(TibioFibula_r1);
        this.setRotateAngle(TibioFibula_r1, 0.3927F, 0.0F, 0.0F);
        this.TibioFibula_r1.cubeList.add(new ModelBox(TibioFibula_r1, 19, 69, -1.5F, -1.0F, 1.5F, 3, 10, 4, -0.001F, false));
        this.TibioFibula_r1.cubeList.add(new ModelBox(TibioFibula_r1, 19, 69, -1.5F, -1.0F, 1.0F, 3, 10, 4, 0.0F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 7.5F, 6.8F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.1745F, 0.0F, 0.0F);


        this.Metatarsal_r1 = new AdvancedModelRenderer(this);
        this.Metatarsal_r1.setRotationPoint(0.5F, 0.35F, -3.45F);
        this.MetatarsalL.addChild(Metatarsal_r1);
        this.setRotateAngle(Metatarsal_r1, -0.2182F, 0.0F, 0.0F);
        this.Metatarsal_r1.cubeList.add(new ModelBox(Metatarsal_r1, 0, 0, -1.0F, -1.0F, 1.0F, 2, 8, 3, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 6.8F, -1.8F);
        this.MetatarsalL.addChild(FootL);
        this.FootL.cubeList.add(new ModelBox(FootL, 31, 0, -1.5F, -0.65F, -7.1F, 4, 2, 8, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-3.0F, 2.1F, -0.2F);
        this.Monolophosaurus.addChild(LegR);
        this.setRotateAngle(LegR, -0.0873F, 0.0F, 0.0F);


        this.Femur_r2 = new AdvancedModelRenderer(this);
        this.Femur_r2.setRotationPoint(0.0F, -0.3F, 0.1F);
        this.LegR.addChild(Femur_r2);
        this.setRotateAngle(Femur_r2, -0.3491F, 0.0F, 0.0F);
        this.Femur_r2.cubeList.add(new ModelBox(Femur_r2, 61, 52, -2.5F, -0.8452F, -3.349F, 4, 12, 7, 0.0F, true));

        this.TibiaR = new AdvancedModelRenderer(this);
        this.TibiaR.setRotationPoint(0.0F, 8.5F, -6.5F);
        this.LegR.addChild(TibiaR);
        this.setRotateAngle(TibiaR, 0.2618F, 0.0F, 0.0F);


        this.TibioFibula_r2 = new AdvancedModelRenderer(this);
        this.TibioFibula_r2.setRotationPoint(-0.5F, 1.5F, -0.7F);
        this.TibiaR.addChild(TibioFibula_r2);
        this.setRotateAngle(TibioFibula_r2, 0.3927F, 0.0F, 0.0F);
        this.TibioFibula_r2.cubeList.add(new ModelBox(TibioFibula_r2, 19, 69, -1.5F, -1.0F, 1.5F, 3, 10, 4, -0.001F, true));
        this.TibioFibula_r2.cubeList.add(new ModelBox(TibioFibula_r2, 19, 69, -1.5F, -1.0F, 1.0F, 3, 10, 4, 0.0F, true));

        this.MetatarsalR = new AdvancedModelRenderer(this);
        this.MetatarsalR.setRotationPoint(0.0F, 7.5F, 6.8F);
        this.TibiaR.addChild(MetatarsalR);
        this.setRotateAngle(MetatarsalR, -0.1745F, 0.0F, 0.0F);


        this.Metatarsal_r2 = new AdvancedModelRenderer(this);
        this.Metatarsal_r2.setRotationPoint(-0.5F, 0.35F, -3.45F);
        this.MetatarsalR.addChild(Metatarsal_r2);
        this.setRotateAngle(Metatarsal_r2, -0.2182F, 0.0F, 0.0F);
        this.Metatarsal_r2.cubeList.add(new ModelBox(Metatarsal_r2, 0, 0, -1.0F, -1.0F, 1.0F, 2, 8, 3, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 6.8F, -1.8F);
        this.MetatarsalR.addChild(FootR);
        this.FootR.cubeList.add(new ModelBox(FootR, 31, 0, -2.5F, -0.65F, -7.1F, 4, 2, 8, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.2F, 0.2F, 4.6F);
        this.Monolophosaurus.addChild(Tail1);


        this.CaudalProximal_r1 = new AdvancedModelRenderer(this);
        this.CaudalProximal_r1.setRotationPoint(0.7F, -0.2F, 0.2F);
        this.Tail1.addChild(CaudalProximal_r1);
        this.setRotateAngle(CaudalProximal_r1, -0.0436F, 0.0F, 0.0F);
        this.CaudalProximal_r1.cubeList.add(new ModelBox(CaudalProximal_r1, 0, 27, -3.0F, -1.0F, -2.0F, 5, 8, 14, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.2F, 0.5F, 11.6F);
        this.Tail1.addChild(Tail2);


        this.CaudalMedioproximal_r1 = new AdvancedModelRenderer(this);
        this.CaudalMedioproximal_r1.setRotationPoint(0.0F, -1.1F, -0.4F);
        this.Tail2.addChild(CaudalMedioproximal_r1);
        this.setRotateAngle(CaudalMedioproximal_r1, 0.0349F, 0.0F, 0.0F);
        this.CaudalMedioproximal_r1.cubeList.add(new ModelBox(CaudalMedioproximal_r1, 32, 14, -2.0F, 0.0F, -1.0F, 4, 6, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, -0.4F, 11.6F);
        this.Tail2.addChild(Tail3);


        this.CaudalMediodistal_r1 = new AdvancedModelRenderer(this);
        this.CaudalMediodistal_r1.setRotationPoint(-0.6F, -0.9F, -0.9F);
        this.Tail3.addChild(CaudalMediodistal_r1);
        this.setRotateAngle(CaudalMediodistal_r1, -0.0698F, 0.0F, 0.0F);
        this.CaudalMediodistal_r1.cubeList.add(new ModelBox(CaudalMediodistal_r1, 31, 53, -1.0F, 0.0F, 0.0F, 3, 4, 12, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(-0.3F, 0.8F, 10.7F);
        this.Tail3.addChild(Tail4);


        this.CaudalDistal_r1 = new AdvancedModelRenderer(this);
        this.CaudalDistal_r1.setRotationPoint(0.2F, -0.6F, -0.1F);
        this.Tail4.addChild(CaudalDistal_r1);
        this.setRotateAngle(CaudalDistal_r1, -0.2705F, 0.0F, 0.0F);
        this.CaudalDistal_r1.cubeList.add(new ModelBox(CaudalDistal_r1, 54, 0, -1.0F, 0.0F, 0.0F, 2, 3, 12, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.2F, 3.3F, 11.1F);
        this.Tail4.addChild(Tail5);


        this.CaudalDistalmost_r1 = new AdvancedModelRenderer(this);
        this.CaudalDistalmost_r1.setRotationPoint(0.5F, -0.6F, 0.1F);
        this.Tail5.addChild(CaudalDistalmost_r1);
        this.setRotateAngle(CaudalDistalmost_r1, -0.48F, 0.0F, 0.0F);
        this.CaudalDistalmost_r1.cubeList.add(new ModelBox(CaudalDistalmost_r1, 67, 16, -1.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.1F, -2.65F);
        this.Monolophosaurus.addChild(Body);


        this.Thorax_r1 = new AdvancedModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, -0.0262F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 0, 0, -4.0F, -1.0F, -14.0F, 8, 12, 14, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.6F, -13.65F);
        this.Body.addChild(Chest);


        this.Scapulo_coracoid_r1 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r1.setRotationPoint(0.0F, 0.8F, -6.1F);
        this.Chest.addChild(Scapulo_coracoid_r1);
        this.setRotateAngle(Scapulo_coracoid_r1, 0.0436F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r1.cubeList.add(new ModelBox(Scapulo_coracoid_r1, 0, 50, -3.5F, -1.0F, 0.0F, 7, 10, 8, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.5F, 7.3F, -4.5F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.0F, 0.0873F, 0.0F);


        this.Humerus_r1 = new AdvancedModelRenderer(this);
        this.Humerus_r1.setRotationPoint(0.9F, 1.3F, 0.9F);
        this.ArmL.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, 0.829F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 0, 27, -2.0F, -2.0F, -1.0F, 2, 6, 3, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.9F, 2.7F, 4.5F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.1309F, 0.0F, 0.0F);


        this.Radio_Ulna_r1 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(0.0F, 0.3F, -1.6F);
        this.ElbowL.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, -0.2618F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 76, 49, -2.0F, -1.0F, -0.9F, 2, 5, 3, -0.01F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.1F, 4.1F, -2.2F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1047F);
        this.HandL.cubeList.add(new ModelBox(HandL, 24, 26, -1.1F, -0.2F, -1.3F, 1, 5, 3, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-3.5F, 7.3F, -4.5F);
        this.Chest.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.0F, -0.0873F, 0.0F);


        this.Humerus_r2 = new AdvancedModelRenderer(this);
        this.Humerus_r2.setRotationPoint(-0.9F, 1.3F, 0.9F);
        this.ArmR.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, 0.829F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 0, 27, 0.0F, -2.0F, -1.0F, 2, 6, 3, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(-0.9F, 2.7F, 4.5F);
        this.ArmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, -0.1309F, 0.0F, 0.0F);


        this.Radio_Ulna_r2 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.0F, 0.3F, -1.6F);
        this.ElbowR.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, -0.2618F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 76, 49, 0.0F, -1.0F, -0.9F, 2, 5, 3, -0.01F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.1F, 4.1F, -2.2F);
        this.ElbowR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, -0.1047F);
        this.HandR.cubeList.add(new ModelBox(HandR, 24, 26, 0.1F, -0.2F, -1.3F, 1, 5, 3, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 2.3F, -5.1F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.1309F, 0.0F, 0.0F);


        this.CervicalDistal_r1 = new AdvancedModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -3.2F, -1.65F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.5236F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 62, 28, -2.0F, -0.15F, -0.5F, 4, 7, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -2.3F, -1.8F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);


        this.CervicalMedialcontinuation_r1 = new AdvancedModelRenderer(this);
        this.CervicalMedialcontinuation_r1.setRotationPoint(-0.5F, 3.8741F, -2.9637F);
        this.Neck2.addChild(CervicalMedialcontinuation_r1);
        this.setRotateAngle(CervicalMedialcontinuation_r1, -0.5149F, 0.0F, 0.0F);
        this.CervicalMedialcontinuation_r1.cubeList.add(new ModelBox(CervicalMedialcontinuation_r1, 50, 59, -1.0F, -2.8492F, 0.0977F, 3, 3, 2, 0.0F, false));

        this.CervicalMedial_r1 = new AdvancedModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(-0.5F, -4.4259F, -3.3637F);
        this.Neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.7418F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 0, 69, -1.0F, 0.0F, 0.0F, 3, 6, 6, 0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.6259F, -3.3637F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1309F, 0.0F, 0.0F);


        this.MStenothyrohyoidNeck_r1 = new AdvancedModelRenderer(this);
        this.MStenothyrohyoidNeck_r1.setRotationPoint(-0.5F, -1.5F, -3.85F);
        this.Neck3.addChild(MStenothyrohyoidNeck_r1);
        this.setRotateAngle(MStenothyrohyoidNeck_r1, -0.1309F, 0.0F, 0.0F);
        this.MStenothyrohyoidNeck_r1.cubeList.add(new ModelBox(MStenothyrohyoidNeck_r1, 71, 6, -0.5F, 4.9914F, 0.1305F, 2, 1, 4, 0.0F, false));

        this.CervicalProximal_r1 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.5F, -1.5F, -3.85F);
        this.Neck3.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.1833F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 51, 70, -1.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F, false));

        this.Atlas_r1 = new AdvancedModelRenderer(this);
        this.Atlas_r1.setRotationPoint(-0.5F, -1.5F, -3.85F);
        this.Neck3.addChild(Atlas_r1);
        this.setRotateAngle(Atlas_r1, 0.2531F, 0.0F, 0.0F);
        this.Atlas_r1.cubeList.add(new ModelBox(Atlas_r1, 37, 34, -1.0F, 0.0F, -1.0F, 3, 3, 1, -0.001F, false));

        this.ThroatPouch = new AdvancedModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 4.35F, -4.35F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, -0.2967F, 0.0F, 0.0F);


        this.TrhoatPouch_r1 = new AdvancedModelRenderer(this);
        this.TrhoatPouch_r1.setRotationPoint(0.0F, 1.7F, 0.6F);
        this.ThroatPouch.addChild(TrhoatPouch_r1);
        this.setRotateAngle(TrhoatPouch_r1, 0.3927F, 0.0F, 0.0F);
        this.TrhoatPouch_r1.cubeList.add(new ModelBox(TrhoatPouch_r1, 31, 57, -1.0F, -3.0F, 0.0F, 2, 3, 3, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2F, -3.85F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 70, 41, -2.0F, -1.3F, -4.0F, 4, 4, 4, 0.0F, false));

        this.PremaxillaryTeeth_r1 = new AdvancedModelRenderer(this);
        this.PremaxillaryTeeth_r1.setRotationPoint(1.5F, 1.5F, -3.75F);
        this.Head.addChild(PremaxillaryTeeth_r1);
        this.setRotateAngle(PremaxillaryTeeth_r1, -0.0873F, 0.0F, 0.0F);
        this.PremaxillaryTeeth_r1.cubeList.add(new ModelBox(PremaxillaryTeeth_r1, 8, 0, -2.0F, 1.6F, -5.95F, 1, 1, 1, 0.01F, false));

        this.MaxillaryTeeth_r1 = new AdvancedModelRenderer(this);
        this.MaxillaryTeeth_r1.setRotationPoint(1.5F, 1.5F, -3.75F);
        this.Head.addChild(MaxillaryTeeth_r1);
        this.setRotateAngle(MaxillaryTeeth_r1, 0.1745F, 0.0F, 0.0F);
        this.MaxillaryTeeth_r1.cubeList.add(new ModelBox(MaxillaryTeeth_r1, 65, 16, -2.5F, 0.4F, -4.35F, 2, 1, 3, 0.0F, false));

        this.Premaxilla_r1 = new AdvancedModelRenderer(this);
        this.Premaxilla_r1.setRotationPoint(1.5F, 1.7F, -3.75F);
        this.Head.addChild(Premaxilla_r1);
        this.setRotateAngle(Premaxilla_r1, 0.0436F, 0.0F, 0.0F);
        this.Premaxilla_r1.cubeList.add(new ModelBox(Premaxilla_r1, 66, 77, -2.5F, -1.0F, -6.75F, 2, 2, 2, 0.01F, false));
        this.Premaxilla_r1.cubeList.add(new ModelBox(Premaxilla_r1, 48, 0, -3.0F, -1.0F, -4.75F, 3, 2, 5, 0.0F, false));

        this.PremaxillaryCrest_r1 = new AdvancedModelRenderer(this);
        this.PremaxillaryCrest_r1.setRotationPoint(0.5F, -0.95F, -10.1F);
        this.Head.addChild(PremaxillaryCrest_r1);
        this.setRotateAngle(PremaxillaryCrest_r1, 1.3526F, 0.0F, 0.0F);
        this.PremaxillaryCrest_r1.cubeList.add(new ModelBox(PremaxillaryCrest_r1, 31, 0, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.NasalCrest_r1 = new AdvancedModelRenderer(this);
        this.NasalCrest_r1.setRotationPoint(0.5F, -2.55F, -3.4F);
        this.Head.addChild(NasalCrest_r1);
        this.setRotateAngle(NasalCrest_r1, 0.2356F, 0.0F, 0.0F);
        this.NasalCrest_r1.cubeList.add(new ModelBox(NasalCrest_r1, 34, 70, -1.0F, 0.0F, -6.9F, 1, 2, 7, 0.0F, false));

        this.nares_r1 = new AdvancedModelRenderer(this);
        this.nares_r1.setRotationPoint(1.0F, 0.25F, -9.8F);
        this.Head.addChild(nares_r1);
        this.setRotateAngle(nares_r1, 0.829F, 0.0F, 0.0F);
        this.nares_r1.cubeList.add(new ModelBox(nares_r1, 31, 4, -2.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.NasalCrest_r2 = new AdvancedModelRenderer(this);
        this.NasalCrest_r2.setRotationPoint(1.0F, -1.3F, -4.0F);
        this.Head.addChild(NasalCrest_r2);
        this.setRotateAngle(NasalCrest_r2, 0.2618F, 0.0F, 0.0F);
        this.NasalCrest_r2.cubeList.add(new ModelBox(NasalCrest_r2, 54, 16, -2.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.LacrimalCrestL_r1 = new AdvancedModelRenderer(this);
        this.LacrimalCrestL_r1.setRotationPoint(0.15F, 0.55F, -4.15F);
        this.Head.addChild(LacrimalCrestL_r1);
        this.setRotateAngle(LacrimalCrestL_r1, 0.3678F, 0.7783F, 0.4229F);
        this.LacrimalCrestL_r1.cubeList.add(new ModelBox(LacrimalCrestL_r1, 56, 8, -1.5F, -1.45F, -1.75F, 2, 1, 2, 0.0F, true));

        this.LacrimalCrestL_r2 = new AdvancedModelRenderer(this);
        this.LacrimalCrestL_r2.setRotationPoint(-0.15F, 0.55F, -4.15F);
        this.Head.addChild(LacrimalCrestL_r2);
        this.setRotateAngle(LacrimalCrestL_r2, 0.3678F, -0.7783F, -0.4229F);
        this.LacrimalCrestL_r2.cubeList.add(new ModelBox(LacrimalCrestL_r2, 56, 8, -0.5F, -1.45F, -1.75F, 2, 1, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 1.85F, -0.55F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 23, 50, -1.5F, -0.044F, -3.4511F, 4, 2, 4, -0.01F, false));

        this.DentaryProximalVentral_r1 = new AdvancedModelRenderer(this);
        this.DentaryProximalVentral_r1.setRotationPoint(0.0F, 1.606F, -6.7011F);
        this.Jaw.addChild(DentaryProximalVentral_r1);
        this.setRotateAngle(DentaryProximalVentral_r1, -0.1309F, 0.0F, 0.0F);
        this.DentaryProximalVentral_r1.cubeList.add(new ModelBox(DentaryProximalVentral_r1, 25, 34, -1.0F, -1.15F, -1.35F, 3, 1, 5, -0.02F, false));

        this.DentaryDistal_r1 = new AdvancedModelRenderer(this);
        this.DentaryDistal_r1.setRotationPoint(0.0F, 1.606F, -6.7011F);
        this.Jaw.addChild(DentaryDistal_r1);
        this.setRotateAngle(DentaryDistal_r1, -0.1745F, 0.0F, 0.0F);
        this.DentaryDistal_r1.cubeList.add(new ModelBox(DentaryDistal_r1, 0, 37, -0.5F, -1.1F, -3.1F, 2, 1, 2, -0.02F, false));

        this.DentaryTeethDistal_r1 = new AdvancedModelRenderer(this);
        this.DentaryTeethDistal_r1.setRotationPoint(0.0F, 1.806F, -6.7011F);
        this.Jaw.addChild(DentaryTeethDistal_r1);
        this.setRotateAngle(DentaryTeethDistal_r1, -0.0873F, 0.0F, 0.0F);
        this.DentaryTeethDistal_r1.cubeList.add(new ModelBox(DentaryTeethDistal_r1, 8, 27, 0.0F, -2.05F, -2.6F, 1, 1, 1, -0.02F, false));

        this.MMasseter_r1 = new AdvancedModelRenderer(this);
        this.MMasseter_r1.setRotationPoint(0.0F, 0.206F, -3.3511F);
        this.Jaw.addChild(MMasseter_r1);
        this.setRotateAngle(MMasseter_r1, 1.1345F, 0.0F, 0.0F);
        this.MMasseter_r1.cubeList.add(new ModelBox(MMasseter_r1, 66, 71, -1.5F, -0.2F, 0.05F, 4, 3, 3, -0.03F, false));

        this.DentaryProximalDorsal_r1 = new AdvancedModelRenderer(this);
        this.DentaryProximalDorsal_r1.setRotationPoint(0.0F, 0.206F, -3.3511F);
        this.Jaw.addChild(DentaryProximalDorsal_r1);
        this.setRotateAngle(DentaryProximalDorsal_r1, 0.1047F, 0.0F, 0.0F);
        this.DentaryProximalDorsal_r1.cubeList.add(new ModelBox(DentaryProximalDorsal_r1, 50, 53, -1.0F, -0.25F, -4.0F, 3, 1, 4, -0.03F, false));

        this.DentaryTeethProximal_r1 = new AdvancedModelRenderer(this);
        this.DentaryTeethProximal_r1.setRotationPoint(0.0F, 1.806F, -6.7011F);
        this.Jaw.addChild(DentaryTeethProximal_r1);
        this.setRotateAngle(DentaryTeethProximal_r1, -0.0436F, 0.0F, 0.0F);
        this.DentaryTeethProximal_r1.cubeList.add(new ModelBox(DentaryTeethProximal_r1, 77, 28, -0.5F, -2.1F, -0.85F, 2, 1, 3, -0.02F, false));

        this.MStenothyrohyoid_r1 = new AdvancedModelRenderer(this);
        this.MStenothyrohyoid_r1.setRotationPoint(0.0F, 2.4574F, -3.0524F);
        this.Jaw.addChild(MStenothyrohyoid_r1);
        this.setRotateAngle(MStenothyrohyoid_r1, -0.2705F, 0.0F, 0.0F);
        this.MStenothyrohyoid_r1.cubeList.add(new ModelBox(MStenothyrohyoid_r1, 71, 0, -0.5F, -1.4341F, -0.2736F, 2, 1, 4, 0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Monolophosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Chest.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(Chest, 0.1F, -0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.25F, 0.0F, -0.1F);
        this.setRotateAngle(Neck2, -0.45F, 0.3F, 0.0F);
        this.setRotateAngle(Neck3, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.3F, -0.5F, 0.0F);
        this.setRotateAngle(Jaw, 0.4F, 0.0F, 0.0F);
        this.Chest.offsetY = -0.02F;
        this.Chest.offsetX = 0.0F;
        this.Chest.offsetZ = 0.05F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Monolophosaurus, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.1F, 0.2F, 0.1F);
        this.setRotateAngle(Neck2, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Neck3, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(ThroatPouch, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(LegL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(TibiaL, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TibiaR, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.4F, 0.0F, 0.0F);
        this.Monolophosaurus.offsetY = -0.13F;
        this.Monolophosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Monolophosaurus.offsetY = 0.3F;
        this.Monolophosaurus.offsetX = -0.3F;
        this.Monolophosaurus.rotateAngleY = (float)Math.toRadians(0);
        this.Monolophosaurus.rotateAngleX = (float)Math.toRadians(0);
        this.Monolophosaurus.rotateAngleZ = (float)Math.toRadians(0);
        this.Monolophosaurus.scaleChildren = true;
        float scaler = 0.6F;
        this.Monolophosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Monolophosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Monolophosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Monolophosaurus.scaleChildren = false;
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

        EntityPrehistoricFloraMonolophosaurus EntityMonolophosaurus = (EntityPrehistoricFloraMonolophosaurus) e;
        this.Monolophosaurus.offsetZ = 0.5F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ElbowL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ElbowR, this.HandR};

        EntityMonolophosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMonolophosaurus.getAnimation() == EntityMonolophosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMonolophosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMonolophosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Jaw, 0.1F, 0.05F, false, 3F, 0.05F, f2, 1F);

                    this.walk(this.ArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.ArmL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMonolophosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraMonolophosaurus ee = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else {
                this.Monolophosaurus.offsetY = 0.06F;
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
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 4) / 4) * (1.96-(7.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.96 + (((tickAnim - 8) / 7) * (3.3-(1.96)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.3 + (((tickAnim - 15) / 5) * (0-(3.3)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 4) / 4) * (-8.04-(5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -8.04 + (((tickAnim - 8) / 12) * (0-(-8.04)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 4) / 4) * (11.07-(-15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.07 + (((tickAnim - 8) / 3) * (11.6-(11.07)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.6 + (((tickAnim - 11) / 4) * (-1.49-(11.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.49 + (((tickAnim - 15) / 5) * (0-(-1.49)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (26.61-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 26.61 + (((tickAnim - 8) / 3) * (29.35-(26.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29.35 + (((tickAnim - 11) / 4) * (15.89-(29.35)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.89 + (((tickAnim - 15) / 5) * (0-(15.89)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (-18.57-(27.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -18.57 + (((tickAnim - 8) / 3) * (-8.31-(-18.57)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.31 + (((tickAnim - 11) / 4) * (-3.62-(-8.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.62 + (((tickAnim - 15) / 5) * (0-(-3.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 4) / 2) * (-20.36-(12.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.36 + (((tickAnim - 6) / 2) * (-6.4-(-20.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.4 + (((tickAnim - 8) / 3) * (6.71-(-6.4)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.71 + (((tickAnim - 11) / 2) * (18.44-(6.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.44 + (((tickAnim - 13) / 4) * (11.5-(18.44)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 17) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.5 + (((tickAnim - 3) / 3) * (48.45-(17.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 48.45 + (((tickAnim - 6) / 3) * (0-(48.45)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
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
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Monolophosaurus, Monolophosaurus.rotateAngleX + (float) Math.toRadians(xx), Monolophosaurus.rotateAngleY + (float) Math.toRadians(yy), Monolophosaurus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10 + (((tickAnim - 15) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10 + (((tickAnim - 25) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-22.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9 + (((tickAnim - 15) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*15 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-9)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*9 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*9)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.82509-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.95571-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.73521-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.82509 + (((tickAnim - 15) / 20) * (11.82509-(11.82509)));
            yy = -4.95571 + (((tickAnim - 15) / 20) * (-4.95571-(-4.95571)));
            zz = -1.73521 + (((tickAnim - 15) / 20) * (-1.73521-(-1.73521)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.82509 + (((tickAnim - 35) / 15) * (0-(11.82509)));
            yy = -4.95571 + (((tickAnim - 35) / 15) * (0-(-4.95571)));
            zz = -1.73521 + (((tickAnim - 35) / 15) * (0-(-1.73521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.44784-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.98925-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.33013-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 7.44784 + (((tickAnim - 15) / 10) * (4.94784-(7.44784)));
            yy = -12.98925 + (((tickAnim - 15) / 10) * (-12.98925-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 15) / 10) * (4.33013-(4.33013)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.94784 + (((tickAnim - 25) / 10) * (7.44784-(4.94784)));
            yy = -12.98925 + (((tickAnim - 25) / 10) * (-12.98925-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 25) / 10) * (4.33013-(4.33013)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.44784 + (((tickAnim - 35) / 15) * (0-(7.44784)));
            yy = -12.98925 + (((tickAnim - 35) / 15) * (0-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 35) / 15) * (0-(4.33013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.28938-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.53425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.48093-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.28938 + (((tickAnim - 15) / 10) * (0.96062-(-0.28938)));
            yy = -4.53425 + (((tickAnim - 15) / 10) * (-4.53425-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 15) / 10) * (3.48093-(3.48093)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0.96062 + (((tickAnim - 25) / 10) * (-0.28938-(0.96062)));
            yy = -4.53425 + (((tickAnim - 25) / 10) * (-4.53425-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 25) / 10) * (3.48093-(3.48093)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.28938 + (((tickAnim - 35) / 15) * (0-(-0.28938)));
            yy = -4.53425 + (((tickAnim - 35) / 15) * (0-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 35) / 15) * (0-(3.48093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-14-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (2.25-(0)));
            yy = -14 + (((tickAnim - 15) / 10) * (-14-(-14)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 25) / 10) * (0-(2.25)));
            yy = -14 + (((tickAnim - 25) / 10) * (-14-(-14)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -14 + (((tickAnim - 35) / 15) * (0-(-14)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -10.25 + (((tickAnim - 0) / 25) * (33.51465-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 25) * (-7.48138-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-4.04625-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 33.51465 + (((tickAnim - 25) / 13) * (-4.75323-(33.51465)));
            yy = -7.48138 + (((tickAnim - 25) / 13) * (-7.9636-(-7.48138)));
            zz = -4.04625 + (((tickAnim - 25) / 13) * (0.76475-(-4.04625)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4.75323 + (((tickAnim - 38) / 12) * (-10.25-(-4.75323)));
            yy = -7.9636 + (((tickAnim - 38) / 12) * (0-(-7.9636)));
            zz = 0.76475 + (((tickAnim - 38) / 12) * (0-(0.76475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (1.37-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 1.37 + (((tickAnim - 25) / 13) * (1.025-(1.37)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 38) / 12) * (0-(1.025)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -17.25 + (((tickAnim - 0) / 18) * (12.63-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12.63 + (((tickAnim - 18) / 7) * (18-(12.63)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 18 + (((tickAnim - 25) / 13) * (1.75783-(18)));
            yy = 0 + (((tickAnim - 25) / 13) * (2.33816-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-2.68802-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.75783 + (((tickAnim - 38) / 12) * (-17.25-(1.75783)));
            yy = 2.33816 + (((tickAnim - 38) / 12) * (0-(2.33816)));
            zz = -2.68802 + (((tickAnim - 38) / 12) * (0-(-2.68802)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaL, TibiaL.rotateAngleX + (float) Math.toRadians(xx), TibiaL.rotateAngleY + (float) Math.toRadians(yy), TibiaL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 13.75 + (((tickAnim - 0) / 12) * (-6.6-(13.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.6 + (((tickAnim - 12) / 13) * (-9.5-(-6.6)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -9.5 + (((tickAnim - 25) / 6) * (-35.29-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -35.29 + (((tickAnim - 31) / 7) * (-45.6-(-35.29)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -45.6 + (((tickAnim - 38) / 12) * (13.75-(-45.6)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.75 + (((tickAnim - 0) / 5) * (4.88-(13.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.88 + (((tickAnim - 5) / 7) * (0.05-(4.88)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.05 + (((tickAnim - 12) / 13) * (54.75-(0.05)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 54.75 + (((tickAnim - 25) / 6) * (54.68-(54.75)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 54.68 + (((tickAnim - 31) / 7) * (61.05-(54.68)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 61.05 + (((tickAnim - 38) / 12) * (13.75-(61.05)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 5) * (0.625-(0.325)));
            zz = -0.475 + (((tickAnim - 0) / 5) * (-0.08-(-0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 5) / 7) * (0.03-(0.625)));
            zz = -0.08 + (((tickAnim - 5) / 7) * (-0.48-(-0.08)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0.03 + (((tickAnim - 12) / 13) * (0-(0.03)));
            zz = -0.48 + (((tickAnim - 12) / 13) * (-1.85-(-0.48)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 6) * (0.685-(0)));
            zz = -1.85 + (((tickAnim - 25) / 6) * (-0.78-(-1.85)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0.685 + (((tickAnim - 31) / 7) * (0.24-(0.685)));
            zz = -0.78 + (((tickAnim - 31) / 7) * (-1.28-(-0.78)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.24 + (((tickAnim - 38) / 12) * (0.325-(0.24)));
            zz = -1.28 + (((tickAnim - 38) / 12) * (-0.475-(-1.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.5 + (((tickAnim - 20) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 30) / 20) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Monolophosaurus, Monolophosaurus.rotateAngleX + (float) Math.toRadians(xx), Monolophosaurus.rotateAngleY + (float) Math.toRadians(yy), Monolophosaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -10.325 + (((tickAnim - 20) / 10) * (-10.325-(-10.325)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -10.325 + (((tickAnim - 30) / 20) * (0-(-10.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Monolophosaurus.rotationPointX = this.Monolophosaurus.rotationPointX + (float)(xx);
        this.Monolophosaurus.rotationPointY = this.Monolophosaurus.rotationPointY - (float)(yy);
        this.Monolophosaurus.rotationPointZ = this.Monolophosaurus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 30) / 20) * (0-(5.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 20) / 10) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 20) / 10) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 20) / 10) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 30) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 20) / 10) * (-14-(-14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 20) / 10) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 30) / 20) * (0-(10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (-7.48605-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (6.74587-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0.23667-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -7.48605 + (((tickAnim - 25) / 15) * (-6.47583-(-7.48605)));
            yy = 6.74587 + (((tickAnim - 25) / 15) * (-5.55594-(6.74587)));
            zz = 0.23667 + (((tickAnim - 25) / 15) * (-10.2516-(0.23667)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.47583 + (((tickAnim - 40) / 10) * (0-(-6.47583)));
            yy = -5.55594 + (((tickAnim - 40) / 10) * (0-(-5.55594)));
            zz = -10.2516 + (((tickAnim - 40) / 10) * (0-(-10.2516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41.85307-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-26.71769-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.13433-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.85307 + (((tickAnim - 20) / 10) * (-41.85307-(-41.85307)));
            yy = -26.71769 + (((tickAnim - 20) / 10) * (-26.71769-(-26.71769)));
            zz = -6.13433 + (((tickAnim - 20) / 10) * (-6.13433-(-6.13433)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.85307 + (((tickAnim - 30) / 20) * (0-(-41.85307)));
            yy = -26.71769 + (((tickAnim - 30) / 20) * (0-(-26.71769)));
            zz = -6.13433 + (((tickAnim - 30) / 20) * (0-(-6.13433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42 + (((tickAnim - 20) / 10) * (42-(42)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 30) / 20) * (0-(42)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaL, TibiaL.rotateAngleX + (float) Math.toRadians(xx), TibiaL.rotateAngleY + (float) Math.toRadians(yy), TibiaL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 20) / 10) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 30) / 20) * (0-(-15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.75 + (((tickAnim - 20) / 10) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 30) / 20) * (0-(29.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 10) * (-1-(-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -1 + (((tickAnim - 30) / 20) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41.78194-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (20.09323-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.03933-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.78194 + (((tickAnim - 20) / 10) * (-41.78194-(-41.78194)));
            yy = 20.09323 + (((tickAnim - 20) / 10) * (20.09323-(20.09323)));
            zz = 5.03933 + (((tickAnim - 20) / 10) * (5.03933-(5.03933)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.78194 + (((tickAnim - 30) / 20) * (0-(-41.78194)));
            yy = 20.09323 + (((tickAnim - 30) / 20) * (0-(20.09323)));
            zz = 5.03933 + (((tickAnim - 30) / 20) * (0-(5.03933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 10) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.6 + (((tickAnim - 30) / 20) * (0-(0.6)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.5 + (((tickAnim - 20) / 10) * (42.5-(42.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 30) / 20) * (0-(42.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaR, TibiaR.rotateAngleX + (float) Math.toRadians(xx), TibiaR.rotateAngleY + (float) Math.toRadians(yy), TibiaR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.75 + (((tickAnim - 20) / 10) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 30) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 20) / 10) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 30) / 20) * (0-(21.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 30) / 20) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.06-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -6.06 + (((tickAnim - 13) / 7) * (-6.5-(-6.06)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 30) / 5) * (-12-(-6.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 35) / 5) * (-12.12-(-12)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -12.12 + (((tickAnim - 40) / 10) * (0-(-12.12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.41-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.41 + (((tickAnim - 13) / 7) * (8.5-(10.41)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 20) / 10) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 30) / 5) * (-2-(8.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 35) / 5) * (-3.85-(-2)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.85 + (((tickAnim - 40) / 10) * (0-(-3.85)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26.85-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 26.85 + (((tickAnim - 13) / 7) * (25.75-(26.85)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 25.75 + (((tickAnim - 20) / 2) * (34.75-(25.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 34.75 + (((tickAnim - 22) / 8) * (25.75-(34.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.75 + (((tickAnim - 30) / 5) * (30.25-(25.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 30.25 + (((tickAnim - 35) / 5) * (6.85-(30.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.85 + (((tickAnim - 40) / 10) * (0-(6.85)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.21 + (((tickAnim - 13) / 7) * (10.5-(22.21)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 10.5 + (((tickAnim - 20) / 2) * (-6.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -6.5 + (((tickAnim - 22) / 3) * (24.05-(-6.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 24.05 + (((tickAnim - 25) / 5) * (10.5-(24.05)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 30) / 5) * (20.5-(10.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20.5 + (((tickAnim - 35) / 5) * (35.55-(20.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 35.55 + (((tickAnim - 40) / 5) * (-8.6-(35.55)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -8.6 + (((tickAnim - 45) / 5) * (0-(-8.6)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5 + (((tickAnim - 28) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5 + (((tickAnim - 44) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8 + (((tickAnim - 28) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8 + (((tickAnim - 44) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 6) / 17) * (-113.52744-(0)));
            yy = 0 + (((tickAnim - 6) / 17) * (-12.4463-(0)));
            zz = 0 + (((tickAnim - 6) / 17) * (-1.66995-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -113.52744 + (((tickAnim - 23) / 5) * (-113.5274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2-(-113.52744)));
            yy = -12.4463 + (((tickAnim - 23) / 5) * (-12.06946-(-12.4463)));
            zz = -1.66995 + (((tickAnim - 23) / 5) * (-1.66089-(-1.66995)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -113.5274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2 + (((tickAnim - 28) / 8) * (-118.06662-(-113.5274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2)));
            yy = -12.06946 + (((tickAnim - 28) / 8) * (-12.92354-(-12.06946)));
            zz = -1.66089 + (((tickAnim - 28) / 8) * (-3.43446-(-1.66089)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = -118.06662 + (((tickAnim - 36) / 5) * (-119.70392-(-118.06662)));
            yy = -12.92354 + (((tickAnim - 36) / 5) * (-13.43299-(-12.92354)));
            zz = -3.43446 + (((tickAnim - 36) / 5) * (-4.50571-(-3.43446)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -119.70392 + (((tickAnim - 41) / 4) * (-120.12851-(-119.70392)));
            yy = -13.43299 + (((tickAnim - 41) / 4) * (-12.88377-(-13.43299)));
            zz = -4.50571 + (((tickAnim - 41) / 4) * (-5.39338-(-4.50571)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -120.12851 + (((tickAnim - 45) / 3) * (-120.8929+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2-(-120.12851)));
            yy = -12.88377 + (((tickAnim - 45) / 3) * (-7.96421-(-12.88377)));
            zz = -5.39338 + (((tickAnim - 45) / 3) * (-6.0544-(-5.39338)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -120.8929+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2 + (((tickAnim - 48) / 17) * (0-(-120.8929+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2)));
            yy = -7.96421 + (((tickAnim - 48) / 17) * (0-(-7.96421)));
            zz = -6.0544 + (((tickAnim - 48) / 17) * (0-(-6.0544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 6) / 13) * (-8.33447-(0)));
            yy = 0 + (((tickAnim - 6) / 13) * (1.62406-(0)));
            zz = 0 + (((tickAnim - 6) / 13) * (11.63878-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -8.33447 + (((tickAnim - 19) / 4) * (-16.15894-(-8.33447)));
            yy = 1.62406 + (((tickAnim - 19) / 4) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 19) / 4) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -16.15894 + (((tickAnim - 23) / 3) * (1.53145-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 23) / 3) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 23) / 3) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 1.53145 + (((tickAnim - 26) / 2) * (-16.15894-(1.53145)));
            yy = 1.62406 + (((tickAnim - 26) / 2) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 26) / 2) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -16.15894 + (((tickAnim - 28) / 3) * (1.53145-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 28) / 3) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 28) / 3) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 1.53145 + (((tickAnim - 31) / 2) * (-16.15894-(1.53145)));
            yy = 1.62406 + (((tickAnim - 31) / 2) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 31) / 2) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -16.15894 + (((tickAnim - 33) / 3) * (1.53145-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 33) / 3) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 33) / 3) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 1.53145 + (((tickAnim - 36) / 2) * (-16.15894-(1.53145)));
            yy = 1.62406 + (((tickAnim - 36) / 2) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 36) / 2) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -16.15894 + (((tickAnim - 38) / 3) * (1.53145-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 38) / 3) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 38) / 3) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 1.53145 + (((tickAnim - 41) / 2) * (-16.15894-(1.53145)));
            yy = 1.62406 + (((tickAnim - 41) / 2) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 41) / 2) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -16.15894 + (((tickAnim - 43) / 3) * (1.53145-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 43) / 3) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 43) / 3) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 1.53145 + (((tickAnim - 46) / 2) * (-16.15894-(1.53145)));
            yy = 1.62406 + (((tickAnim - 46) / 2) * (1.62406-(1.62406)));
            zz = 11.63878 + (((tickAnim - 46) / 2) * (11.63878-(11.63878)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -16.15894 + (((tickAnim - 48) / 17) * (0-(-16.15894)));
            yy = 1.62406 + (((tickAnim - 48) / 17) * (0-(1.62406)));
            zz = 11.63878 + (((tickAnim - 48) / 17) * (0-(11.63878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*-1-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (19.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*-1 + (((tickAnim - 13) / 6) * (0-(-0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*-1)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 19.25 + (((tickAnim - 13) / 6) * (-28-(19.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (-8.93043-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 19) / 4) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -8.93043 + (((tickAnim - 23) / 3) * (2.37615-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 23) / 3) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 23) / 3) * (-28-(-35.52592)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.37615 + (((tickAnim - 26) / 2) * (-8.93043-(2.37615)));
            yy = 0 + (((tickAnim - 26) / 2) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 26) / 2) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -8.93043 + (((tickAnim - 28) / 3) * (2.37615-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 28) / 3) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 28) / 3) * (-28-(-35.52592)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 2.37615 + (((tickAnim - 31) / 2) * (-8.93043-(2.37615)));
            yy = 0 + (((tickAnim - 31) / 2) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 31) / 2) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -8.93043 + (((tickAnim - 33) / 3) * (2.37615-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 33) / 3) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 33) / 3) * (-28-(-35.52592)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 2.37615 + (((tickAnim - 36) / 2) * (-8.93043-(2.37615)));
            yy = 0 + (((tickAnim - 36) / 2) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 36) / 2) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -8.93043 + (((tickAnim - 38) / 3) * (2.37615-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 38) / 3) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 38) / 3) * (-28-(-35.52592)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 2.37615 + (((tickAnim - 41) / 2) * (-8.93043-(2.37615)));
            yy = 0 + (((tickAnim - 41) / 2) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 41) / 2) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -8.93043 + (((tickAnim - 43) / 3) * (2.37615-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 43) / 3) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 43) / 3) * (-28-(-35.52592)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 2.37615 + (((tickAnim - 46) / 2) * (-8.93043-(2.37615)));
            yy = 0 + (((tickAnim - 46) / 2) * (-1.8516-(0)));
            zz = -28 + (((tickAnim - 46) / 2) * (-35.52592-(-28)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -8.93043 + (((tickAnim - 48) / 17) * (0-(-8.93043)));
            yy = -1.8516 + (((tickAnim - 48) / 17) * (0-(-1.8516)));
            zz = -35.52592 + (((tickAnim - 48) / 17) * (0-(-35.52592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 14.25 + (((tickAnim - 19) / 9) * (14.25-(14.25)));
            yy = -15 + (((tickAnim - 19) / 9) * (-15-(-15)));
            zz = 0 + (((tickAnim - 19) / 9) * (-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 14.25 + (((tickAnim - 28) / 16) * (17.25-(14.25)));
            yy = -15 + (((tickAnim - 28) / 16) * (-15-(-15)));
            zz = -1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2 + (((tickAnim - 28) / 16) * (-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1-(-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2)));
        }
        else if (tickAnim >= 44 && tickAnim < 65) {
            xx = 17.25 + (((tickAnim - 44) / 21) * (0-(17.25)));
            yy = -15 + (((tickAnim - 44) / 21) * (0-(-15)));
            zz = -1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1 + (((tickAnim - 44) / 21) * (0-(-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (25.09763-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.80566-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-1.64185-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 25.09763 + (((tickAnim - 19) / 9) * (25.09763-(25.09763)));
            yy = -6.80566 + (((tickAnim - 19) / 9) * (-6.80566-(-6.80566)));
            zz = -1.64185 + (((tickAnim - 19) / 9) * (-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1449))*3.5-(-1.64185)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 25.09763 + (((tickAnim - 28) / 17) * (17.09763-(25.09763)));
            yy = -6.80566 + (((tickAnim - 28) / 17) * (-6.80566-(-6.80566)));
            zz = -1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1449))*3.5 + (((tickAnim - 28) / 17) * (-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2-(-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1449))*3.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 17.09763 + (((tickAnim - 45) / 20) * (0-(17.09763)));
            yy = -6.80566 + (((tickAnim - 45) / 20) * (0-(-6.80566)));
            zz = -1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2 + (((tickAnim - 45) / 20) * (0-(-1.6418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*-6-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.90924-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-1 + (((tickAnim - 8) / 11) * (-11.44414-(-0.4624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-1)));
            yy = 7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*-6 + (((tickAnim - 8) / 11) * (9.75927-(7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*-6)));
            zz = 1.90924 + (((tickAnim - 8) / 11) * (3.99205-(1.90924)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -11.44414 + (((tickAnim - 19) / 9) * (-11.4441-(-11.44414)));
            yy = 9.75927 + (((tickAnim - 19) / 9) * (8.41642-(9.75927)));
            zz = 3.99205 + (((tickAnim - 19) / 9) * (-1.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3.8-(3.99205)));
        }
        else if (tickAnim >= 28 && tickAnim < 46) {
            xx = -11.4441 + (((tickAnim - 28) / 18) * (-24.70166-(-11.4441)));
            yy = 8.41642 + (((tickAnim - 28) / 18) * (6.46124-(8.41642)));
            zz = -1.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3.8 + (((tickAnim - 28) / 18) * (-1.3713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2.8-(-1.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3.8)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = -24.70166 + (((tickAnim - 46) / 19) * (0-(-24.70166)));
            yy = 6.46124 + (((tickAnim - 46) / 19) * (0-(6.46124)));
            zz = -1.3713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2.8 + (((tickAnim - 46) / 19) * (0-(-1.3713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 65) {
            xx = 0.125 + (((tickAnim - 19) / 46) * (0-(0.125)));
            yy = 0 + (((tickAnim - 19) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = -17.25 + (((tickAnim - 36) / 8) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ThroatPouch, ThroatPouch.rotateAngleX + (float) Math.toRadians(xx), ThroatPouch.rotateAngleY + (float) Math.toRadians(yy), ThroatPouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 8) * (0.075-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 36) / 8) * (0-(0.075)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ThroatPouch.rotationPointX = this.ThroatPouch.rotationPointX + (float)(xx);
        this.ThroatPouch.rotationPointY = this.ThroatPouch.rotationPointY - (float)(yy);
        this.ThroatPouch.rotationPointZ = this.ThroatPouch.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5376+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*6-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.93299-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 1.5376+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-2 + (((tickAnim - 8) / 11) * (-9.77823-(1.5376+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-2)));
            yy = 7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*6 + (((tickAnim - 8) / 11) * (12.88821-(7.2096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*230))*6)));
            zz = 1.93299 + (((tickAnim - 8) / 11) * (6.32389-(1.93299)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -9.77823 + (((tickAnim - 19) / 9) * (-9.77823-(-9.77823)));
            yy = 12.88821 + (((tickAnim - 19) / 9) * (12.88821-(12.88821)));
            zz = 6.32389 + (((tickAnim - 19) / 9) * (6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1-(6.32389)));
        }
        else if (tickAnim >= 28 && tickAnim < 47) {
            xx = -9.77823 + (((tickAnim - 28) / 19) * (-24.77823-(-9.77823)));
            yy = 12.88821 + (((tickAnim - 28) / 19) * (12.88821-(12.88821)));
            zz = 6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1 + (((tickAnim - 28) / 19) * (6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1-(6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1)));
        }
        else if (tickAnim >= 47 && tickAnim < 65) {
            xx = -24.77823 + (((tickAnim - 47) / 18) * (0-(-24.77823)));
            yy = 12.88821 + (((tickAnim - 47) / 18) * (0-(12.88821)));
            zz = 6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1 + (((tickAnim - 47) / 18) * (0-(6.3239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.725-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 19) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 28) * (0-(0)));
            zz = 0.725 + (((tickAnim - 19) / 28) * (1.335-(0.725)));
        }
        else if (tickAnim >= 47 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 47) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 18) * (0-(0)));
            zz = 1.335 + (((tickAnim - 47) / 18) * (0-(1.335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 6.25 + (((tickAnim - 36) / 8) * (0-(6.25)));
            yy = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Monolophosaurus, Monolophosaurus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-20))*2), Monolophosaurus.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*3)), Monolophosaurus.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 0) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 7) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 7) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 25) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 32) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 32) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Monolophosaurus.rotationPointX = this.Monolophosaurus.rotationPointX + (float)(xx);
        this.Monolophosaurus.rotationPointY = this.Monolophosaurus.rotationPointY - (float)(yy);
        this.Monolophosaurus.rotationPointZ = this.Monolophosaurus.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-2), Body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-3)), Body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-1), Chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)), Chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-5), ArmL.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), ArmL.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-110))*5)));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), ElbowL.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*5), ElbowL.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*5)));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0), HandL.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*5), HandL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*-5), ArmR.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5), ArmR.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-80))*-5)));


        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-5), ElbowR.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+70))*5), ElbowR.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0), HandR.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5), HandR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*5), Neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-3)), Neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-1)));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*10), Neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*3)), Neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*1)));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-10), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 0) / 10) * (7.5-(25)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 10) / 8) * (-27.5-(7.5)));
            yy = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (-29.5-(-27.5)));
            yy = -5 + (((tickAnim - 18) / 7) * (0-(-5)));
            zz = -5 + (((tickAnim - 18) / 7) * (0-(-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -29.5 + (((tickAnim - 25) / 13) * (-12.5-(-29.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-2.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 38) / 12) * (25-(-12.5)));
            yy = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 10) * (1.325-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 1.325 + (((tickAnim - 10) / 8) * (0-(1.325)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -1.6 + (((tickAnim - 25) / 7) * (-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1.6)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 6) * (-0.55-(-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = -0.55 + (((tickAnim - 38) / 6) * (-0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5-(-0.55)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5 + (((tickAnim - 44) / 6) * (-1.225-(-0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 0) / 10) * (32.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 10) / 8) * (25-(32.5)));
            yy = -2.5 + (((tickAnim - 10) / 8) * (-2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 8) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 18) / 7) * (-10-(25)));
            yy = -2.5 + (((tickAnim - 18) / 7) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 18) / 7) * (0-(-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 25) / 13) * (5-(-10)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 38) / 12) * (-2.5-(5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaL, TibiaL.rotateAngleX + (float) Math.toRadians(xx), TibiaL.rotateAngleY + (float) Math.toRadians(yy), TibiaL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.125-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.275)));
            zz = 0.125 + (((tickAnim - 25) / 7) * (0-(0.125)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.TibiaL.rotationPointX = this.TibiaL.rotationPointX + (float)(xx);
        this.TibiaL.rotationPointY = this.TibiaL.rotationPointY - (float)(yy);
        this.TibiaL.rotationPointZ = this.TibiaL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.75 + (((tickAnim - 0) / 10) * (-17.5-(12.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -17.5 + (((tickAnim - 10) / 8) * (-27.5-(-17.5)));
            yy = 2.5 + (((tickAnim - 10) / 8) * (5-(2.5)));
            zz = -2.5 + (((tickAnim - 10) / 8) * (5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (27.5-(-27.5)));
            yy = 5 + (((tickAnim - 18) / 7) * (0-(5)));
            zz = 5 + (((tickAnim - 18) / 7) * (0-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 27.5 + (((tickAnim - 25) / 13) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 38) / 12) * (12.75-(17.5)));
            yy = 2.5 + (((tickAnim - 38) / 12) * (0-(2.5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalL.rotationPointX = this.MetatarsalL.rotationPointX + (float)(xx);
        this.MetatarsalL.rotationPointY = this.MetatarsalL.rotationPointY - (float)(yy);
        this.MetatarsalL.rotationPointZ = this.MetatarsalL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -36.5 + (((tickAnim - 0) / 10) * (80-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 80 + (((tickAnim - 10) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 70 + (((tickAnim - 18) / 7) * (12.5-(70)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 12.5 + (((tickAnim - 25) / 7) * (-0.5-(12.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -0.5 + (((tickAnim - 32) / 6) * (-10-(-0.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 38) / 12) * (-36.5-(-10)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 10) * (-0.28-(-0.275)));
            zz = -0.225 + (((tickAnim - 0) / 10) * (-1.845-(-0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.28 + (((tickAnim - 10) / 8) * (-0.28-(-0.28)));
            zz = -1.845 + (((tickAnim - 10) / 8) * (-1.535-(-1.845)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.28 + (((tickAnim - 18) / 7) * (0-(-0.28)));
            zz = -1.535 + (((tickAnim - 18) / 7) * (0-(-1.535)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -25 + (((tickAnim - 0) / 13) * (-12.5-(-25)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 13) / 12) * (25-(-12.5)));
            yy = 2.5 + (((tickAnim - 13) / 12) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 13) / 12) * (0-(2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 25 + (((tickAnim - 25) / 10) * (7.5-(25)));
            yy = 0 + (((tickAnim - 25) / 10) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7.5 + (((tickAnim - 35) / 8) * (-27.5-(7.5)));
            yy = 5 + (((tickAnim - 35) / 8) * (5-(5)));
            zz = 5 + (((tickAnim - 35) / 8) * (5-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-25-(-27.5)));
            yy = 5 + (((tickAnim - 43) / 7) * (0-(5)));
            zz = 5 + (((tickAnim - 43) / 7) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.975 + (((tickAnim - 0) / 7) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.975)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 7) / 6) * (-0.725-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -0.725 + (((tickAnim - 13) / 6) * (-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5-(-0.725)));
            zz = 0.65 + (((tickAnim - 13) / 6) * (0-(0.65)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5 + (((tickAnim - 19) / 6) * (-1.225-(-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -1.225 + (((tickAnim - 25) / 10) * (1.2-(-1.225)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.2 + (((tickAnim - 35) / 8) * (0-(1.2)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 0) / 13) * (5-(-10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 13) / 12) * (-2.5-(5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 25) / 10) * (38.25-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 38.25 + (((tickAnim - 35) / 8) * (25-(38.25)));
            yy = 2.5 + (((tickAnim - 35) / 8) * (2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 8) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 43) / 7) * (-10-(25)));
            yy = 2.5 + (((tickAnim - 43) / 7) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 43) / 7) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaR, TibiaR.rotateAngleX + (float) Math.toRadians(xx), TibiaR.rotateAngleY + (float) Math.toRadians(yy), TibiaR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.275)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.TibiaR.rotationPointX = this.TibiaR.rotationPointX + (float)(xx);
        this.TibiaR.rotationPointY = this.TibiaR.rotationPointY - (float)(yy);
        this.TibiaR.rotationPointZ = this.TibiaR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 0) / 13) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 13) / 12) * (12.75-(17.5)));
            yy = -2.5 + (((tickAnim - 13) / 12) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 25) / 10) * (-17.5-(12.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -17.5 + (((tickAnim - 35) / 8) * (-27.5-(-17.5)));
            yy = -2.5 + (((tickAnim - 35) / 8) * (-5-(-2.5)));
            zz = 2.5 + (((tickAnim - 35) / 8) * (-5-(2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (27.5-(-27.5)));
            yy = -5 + (((tickAnim - 43) / 7) * (0-(-5)));
            zz = -5 + (((tickAnim - 43) / 7) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalR.rotationPointX = this.MetatarsalR.rotationPointX + (float)(xx);
        this.MetatarsalR.rotationPointY = this.MetatarsalR.rotationPointY - (float)(yy);
        this.MetatarsalR.rotationPointZ = this.MetatarsalR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7.25 + (((tickAnim - 0) / 7) * (-3.37-(7.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3.37 + (((tickAnim - 7) / 6) * (-10-(-3.37)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -10 + (((tickAnim - 13) / 6) * (-21.25-(-10)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -21.25 + (((tickAnim - 19) / 6) * (-36.5-(-21.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -36.5 + (((tickAnim - 25) / 10) * (80-(-36.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 80 + (((tickAnim - 35) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 70 + (((tickAnim - 43) / 7) * (7.25-(70)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-0.225-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 10) * (-0.16-(-0.275)));
            zz = -0.225 + (((tickAnim - 25) / 10) * (-1.705-(-0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = -0.16 + (((tickAnim - 35) / 8) * (-0.07-(-0.16)));
            zz = -1.705 + (((tickAnim - 35) / 8) * (-1.76-(-1.705)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -0.07 + (((tickAnim - 43) / 7) * (0-(-0.07)));
            zz = -1.76 + (((tickAnim - 43) / 7) * (0-(-1.76)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*-2), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-4)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-10))*-2), Tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), Tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-2), Tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-7.5)), Tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), Tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*-5)), Tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*-2), Tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), Tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*3)));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMonolophosaurus entity = (EntityPrehistoricFloraMonolophosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Monolophosaurus, Monolophosaurus.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*4), Monolophosaurus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1), Monolophosaurus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));
        this.Monolophosaurus.rotationPointX = this.Monolophosaurus.rotationPointX + (float)(0);
        this.Monolophosaurus.rotationPointY = this.Monolophosaurus.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*1);
        this.Monolophosaurus.rotationPointZ = this.Monolophosaurus.rotationPointZ + (float)(0);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*6), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-2), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*8), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-3), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*2));

        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5), ArmL.rotateAngleY + (float) Math.toRadians(0), ArmL.rotateAngleZ + (float) Math.toRadians(5-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*5)));

        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-16), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+190))*10));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-100))*8)));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5), ArmR.rotateAngleY + (float) Math.toRadians(0), ArmR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5));


        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-16), ElbowR.rotateAngleY + (float) Math.toRadians(0), ElbowR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+220))*-5));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-220))*12), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-130))*8));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-4), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*4), Neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-10), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*4), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*1), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*4), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-1), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -39.97365 + (((tickAnim - 0) / 3) * (-17.48956-(-39.97365)));
            yy = 1.5216 + (((tickAnim - 0) / 3) * (0.90566-(1.5216)));
            zz = 1.98385 + (((tickAnim - 0) / 3) * (3.82021-(1.98385)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.48956 + (((tickAnim - 3) / 5) * (12.47864-(-17.48956)));
            yy = 0.90566 + (((tickAnim - 3) / 5) * (-0.32621-(0.90566)));
            zz = 3.82021 + (((tickAnim - 3) / 5) * (7.49294-(3.82021)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12.47864 + (((tickAnim - 8) / 1) * (13.74881-(12.47864)));
            yy = -0.32621 + (((tickAnim - 8) / 1) * (-0.05452-(-0.32621)));
            zz = 7.49294 + (((tickAnim - 8) / 1) * (2.49941-(7.49294)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 13.74881 + (((tickAnim - 9) / 1) * (6.53-(13.74881)));
            yy = -0.05452 + (((tickAnim - 9) / 1) * (0-(-0.05452)));
            zz = 2.49941 + (((tickAnim - 9) / 1) * (0-(2.49941)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.53 + (((tickAnim - 10) / 3) * (-33-(6.53)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -33 + (((tickAnim - 13) / 2) * (-39.97365-(-33)));
            yy = 0 + (((tickAnim - 13) / 2) * (1.5216-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (1.98385-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.33 + (((tickAnim - 0) / 3) * (-1.2-(-1.33)));
            zz = -2 + (((tickAnim - 0) / 3) * (-0.34-(-2)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -1.2 + (((tickAnim - 3) / 0) * (-2.26-(-1.2)));
            zz = -0.34 + (((tickAnim - 3) / 0) * (0-(-0.34)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2.26 + (((tickAnim - 3) / 2) * (-2.02-(-2.26)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.33-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -2.02 + (((tickAnim - 5) / 2) * (0.22-(-2.02)));
            zz = 0.33 + (((tickAnim - 5) / 2) * (1.83-(0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.22 + (((tickAnim - 7) / 1) * (0-(0.22)));
            zz = 1.83 + (((tickAnim - 7) / 1) * (2-(1.83)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (1-(0)));
            zz = 2 + (((tickAnim - 8) / 3) * (0-(2)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 11) / 4) * (-1.33-(1)));
            zz = 0 + (((tickAnim - 11) / 4) * (-2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (-16.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.25 + (((tickAnim - 2) / 1) * (10-(-16.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 3) / 5) * (22.5-(10)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (45-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 45 + (((tickAnim - 11) / 2) * (26.25-(45)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.25 + (((tickAnim - 13) / 2) * (7.5-(26.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaL, TibiaL.rotateAngleX + (float) Math.toRadians(xx), TibiaL.rotateAngleY + (float) Math.toRadians(yy), TibiaL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (10-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-7.5-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 3) / 5) * (22.5-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 8) / 0) * (18.05-(22.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.05 + (((tickAnim - 8) / 1) * (8.33-(18.05)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 8.33 + (((tickAnim - 9) / 2) * (-57.5-(8.33)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -57.5 + (((tickAnim - 11) / 2) * (-42.5-(-57.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -42.5 + (((tickAnim - 13) / 2) * (-5-(-42.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.5 + (((tickAnim - 0) / 2) * (19.89247-(22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (3.21154-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.83424-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.89247 + (((tickAnim - 2) / 1) * (0-(19.89247)));
            yy = 3.21154 + (((tickAnim - 2) / 1) * (0-(3.21154)));
            zz = -3.83424 + (((tickAnim - 2) / 1) * (-5-(-3.83424)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-20.82684-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.07234-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-4.99948-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -20.82684 + (((tickAnim - 5) / 1) * (24.82613-(-20.82684)));
            yy = -0.07234 + (((tickAnim - 5) / 1) * (-5.33449-(-0.07234)));
            zz = -4.99948 + (((tickAnim - 5) / 1) * (-5.27956-(-4.99948)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.82613 + (((tickAnim - 6) / 2) * (20-(24.82613)));
            yy = -5.33449 + (((tickAnim - 6) / 2) * (0-(-5.33449)));
            zz = -5.27956 + (((tickAnim - 6) / 2) * (0-(-5.27956)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 8) / 3) * (80-(20)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 80 + (((tickAnim - 11) / 4) * (22.5-(80)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.97864 + (((tickAnim - 0) / 2) * (13.74881-(14.97864)));
            yy = 0.32621 + (((tickAnim - 0) / 2) * (0.05452-(0.32621)));
            zz = -7.49294 + (((tickAnim - 0) / 2) * (-2.49941-(-7.49294)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.74881 + (((tickAnim - 2) / 1) * (6.53-(13.74881)));
            yy = 0.05452 + (((tickAnim - 2) / 1) * (0-(0.05452)));
            zz = -2.49941 + (((tickAnim - 2) / 1) * (0-(-2.49941)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.53 + (((tickAnim - 3) / 3) * (-33-(6.53)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -33 + (((tickAnim - 6) / 2) * (-39.97365-(-33)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.5216-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-1.98385-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -39.97365 + (((tickAnim - 8) / 1) * (-25.26203-(-39.97365)));
            yy = -1.5216 + (((tickAnim - 8) / 1) * (-1.11097-(-1.5216)));
            zz = -1.98385 + (((tickAnim - 8) / 1) * (-3.20809-(-1.98385)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -25.26203 + (((tickAnim - 9) / 6) * (14.97864-(-25.26203)));
            yy = -1.11097 + (((tickAnim - 9) / 6) * (0.32621-(-1.11097)));
            zz = -3.20809 + (((tickAnim - 9) / 6) * (-7.49294-(-3.20809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 2 + (((tickAnim - 0) / 3) * (0-(2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 5) * (-1.33-(1)));
            zz = 0 + (((tickAnim - 3) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.33 + (((tickAnim - 8) / 2) * (-1.2-(-1.33)));
            zz = -2 + (((tickAnim - 8) / 2) * (-0.34-(-2)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1.2 + (((tickAnim - 10) / 1) * (-2.26-(-1.2)));
            zz = -0.34 + (((tickAnim - 10) / 1) * (0-(-0.34)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -2.26 + (((tickAnim - 11) / 2) * (-2.02-(-2.26)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.33-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -2.02 + (((tickAnim - 13) / 1) * (0.22-(-2.02)));
            zz = 0.33 + (((tickAnim - 13) / 1) * (1.83-(0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.22 + (((tickAnim - 14) / 1) * (0-(0.22)));
            zz = 1.83 + (((tickAnim - 14) / 1) * (2-(1.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (45-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 45 + (((tickAnim - 3) / 3) * (26.25-(45)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.25 + (((tickAnim - 6) / 2) * (7.5-(26.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 7.5 + (((tickAnim - 8) / 1) * (-16.25-(7.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -16.25 + (((tickAnim - 9) / 2) * (10-(-16.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 11) / 4) * (22.5-(10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaR, TibiaR.rotateAngleX + (float) Math.toRadians(xx), TibiaR.rotateAngleY + (float) Math.toRadians(yy), TibiaR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.5 + (((tickAnim - 0) / 1) * (18.05-(22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 18.05 + (((tickAnim - 1) / 1) * (8.33-(18.05)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.33 + (((tickAnim - 2) / 1) * (-35-(8.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -35 + (((tickAnim - 3) / 3) * (-42.5-(-35)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -42.5 + (((tickAnim - 6) / 2) * (-5-(-42.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 8) / 1) * (10-(-5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 9) / 2) * (-7.5-(10)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 11) / 4) * (22.5-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (80-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 80 + (((tickAnim - 3) / 3) * (78-(80)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 78 + (((tickAnim - 6) / 2) * (22.5-(78)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 8) / 1) * (19.89247-(22.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-3.21154-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (3.83424-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 19.89247 + (((tickAnim - 9) / 2) * (0-(19.89247)));
            yy = -3.21154 + (((tickAnim - 9) / 2) * (0-(-3.21154)));
            zz = 3.83424 + (((tickAnim - 9) / 2) * (5-(3.83424)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-20.82684-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.07234-(0)));
            zz = 5 + (((tickAnim - 11) / 2) * (4.99948-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -20.82684 + (((tickAnim - 13) / 0) * (24.82613-(-20.82684)));
            yy = 0.07234 + (((tickAnim - 13) / 0) * (5.33449-(0.07234)));
            zz = 4.99948 + (((tickAnim - 13) / 0) * (5.27956-(4.99948)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 24.82613 + (((tickAnim - 13) / 2) * (20-(24.82613)));
            yy = 5.33449 + (((tickAnim - 13) / 2) * (0-(5.33449)));
            zz = 5.27956 + (((tickAnim - 13) / 2) * (0-(5.27956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-4), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-9), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-4), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-7), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-7), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-190))*-10), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-190))*-15), Tail5.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMonolophosaurus e = (EntityPrehistoricFloraMonolophosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Neck1, (float) Math.toRadians(10),0,0);
        animator.move(this.Neck2, (float) Math.toRadians(10),0,0);
        animator.move(this.Neck3, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
