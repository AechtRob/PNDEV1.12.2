package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDilophosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDilophosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer Dilophosaurus;
    private final AdvancedModelRenderer CervicalProximal_r1;
    private final AdvancedModelRenderer CervicalProximal_r2;
    private final AdvancedModelRenderer basin_r1;
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
    private final AdvancedModelRenderer CaudalDistalmost_r2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Thorax_r1;
    private final AdvancedModelRenderer Scapulo_coracoid_r1;
    private final AdvancedModelRenderer CervicalProximal_r3;
    private final AdvancedModelRenderer Scapulo_coracoid_r2;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Scapulo_coracoid_r3;
    private final AdvancedModelRenderer Scapulo_coracoid_r4;
    private final AdvancedModelRenderer Scapulo_coracoid_r5;
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
    private final AdvancedModelRenderer CervicalDistal_r2;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer CervicalMedialcontinuation_r1;
    private final AdvancedModelRenderer CervicalMedial_r1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer MStenothyrohyoidNeck_r1;
    private final AdvancedModelRenderer CervicalProximal_r4;
    private final AdvancedModelRenderer Atlas_r1;
    private final AdvancedModelRenderer Atlas_r2;
    private final AdvancedModelRenderer ThroatPouch;
    private final AdvancedModelRenderer TrhoatPouch_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer ParasagittalCrest;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer ParasagittalCrest2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private ModelAnimator animator;

    public ModelDilophosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Dilophosaurus = new AdvancedModelRenderer(this);
        this.Dilophosaurus.setRotationPoint(0.0F, 2.0F, 8.0F);


        this.CervicalProximal_r1 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.5F, -4.539F, -1.0901F);
        this.Dilophosaurus.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.1571F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 85, 41, 0.5F, -0.3947F, -0.0598F, 0, 1, 4, 0.0F, false));

        this.CervicalProximal_r2 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r2.setRotationPoint(-0.5F, -4.539F, -5.0901F);
        this.Dilophosaurus.addChild(CervicalProximal_r2);
        this.setRotateAngle(CervicalProximal_r2, -0.1047F, 0.0F, 0.0F);
        this.CervicalProximal_r2.cubeList.add(new ModelBox(CervicalProximal_r2, 85, 41, 0.5F, -0.9738F, -0.0695F, 0, 1, 4, 0.0F, false));

        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -5.0F, -3.2F);
        this.Dilophosaurus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0873F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 30, 12, -3.5F, 0.3F, -3.0F, 7, 10, 11, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 0.4F, -0.7F);
        this.Dilophosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.0873F, 0.0F, 0.0F);


        this.Femur_r1 = new AdvancedModelRenderer(this);
        this.Femur_r1.setRotationPoint(0.0F, -1.3908F, -1.2F);
        this.LegL.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, -0.3491F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 52, 60, -1.5F, -1.6905F, -1.5364F, 4, 12, 7, 0.0F, false));

        this.TibiaL = new AdvancedModelRenderer(this);
        this.TibiaL.setRotationPoint(0.0F, 7.5092F, -4.9F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.096F, 0.0F, 0.0F);


        this.TibioFibula_r1 = new AdvancedModelRenderer(this);
        this.TibioFibula_r1.setRotationPoint(0.5F, 1.091F, -3.3856F);
        this.TibiaL.addChild(TibioFibula_r1);
        this.setRotateAngle(TibioFibula_r1, 0.3927F, 0.0F, 0.0F);
        this.TibioFibula_r1.cubeList.add(new ModelBox(TibioFibula_r1, 0, 64, -1.5F, 0.0746F, 6.0868F, 3, 10, 1, -0.01F, false));
        this.TibioFibula_r1.cubeList.add(new ModelBox(TibioFibula_r1, 0, 78, -1.5F, 0.0746F, 2.6868F, 3, 10, 4, 0.0F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 7.491F, 6.4144F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.0873F, 0.0F, 0.0F);


        this.Metatarsal_r1 = new AdvancedModelRenderer(this);
        this.Metatarsal_r1.setRotationPoint(0.5F, 0.3381F, -5.686F);
        this.MetatarsalL.addChild(Metatarsal_r1);
        this.setRotateAngle(Metatarsal_r1, -0.2182F, 0.0F, 0.0F);
        this.Metatarsal_r1.cubeList.add(new ModelBox(Metatarsal_r1, 0, 0, -1.0F, -1.4329F, 2.9526F, 2, 7, 3, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 5.3881F, -1.236F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 0.0873F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 74, 30, -1.5F, -0.25F, -6.5F, 4, 2, 7, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-3.0F, 0.4F, -0.7F);
        this.Dilophosaurus.addChild(LegR);
        this.setRotateAngle(LegR, -0.0873F, 0.0F, 0.0F);


        this.Femur_r2 = new AdvancedModelRenderer(this);
        this.Femur_r2.setRotationPoint(0.0F, -1.3908F, -1.2F);
        this.LegR.addChild(Femur_r2);
        this.setRotateAngle(Femur_r2, -0.3491F, 0.0F, 0.0F);
        this.Femur_r2.cubeList.add(new ModelBox(Femur_r2, 52, 60, -2.5F, -1.6905F, -1.5364F, 4, 12, 7, 0.0F, true));

        this.TibiaR = new AdvancedModelRenderer(this);
        this.TibiaR.setRotationPoint(0.0F, 7.5092F, -4.9F);
        this.LegR.addChild(TibiaR);
        this.setRotateAngle(TibiaR, 0.096F, 0.0F, 0.0F);


        this.TibioFibula_r2 = new AdvancedModelRenderer(this);
        this.TibioFibula_r2.setRotationPoint(-0.5F, 1.091F, -3.3856F);
        this.TibiaR.addChild(TibioFibula_r2);
        this.setRotateAngle(TibioFibula_r2, 0.3927F, 0.0F, 0.0F);
        this.TibioFibula_r2.cubeList.add(new ModelBox(TibioFibula_r2, 0, 64, -1.5F, 0.0746F, 6.0868F, 3, 10, 1, -0.01F, true));
        this.TibioFibula_r2.cubeList.add(new ModelBox(TibioFibula_r2, 0, 78, -1.5F, 0.0746F, 2.6868F, 3, 10, 4, 0.0F, true));

        this.MetatarsalR = new AdvancedModelRenderer(this);
        this.MetatarsalR.setRotationPoint(0.0F, 7.491F, 6.4144F);
        this.TibiaR.addChild(MetatarsalR);
        this.setRotateAngle(MetatarsalR, -0.0873F, 0.0F, 0.0F);


        this.Metatarsal_r2 = new AdvancedModelRenderer(this);
        this.Metatarsal_r2.setRotationPoint(-0.5F, 0.3381F, -5.686F);
        this.MetatarsalR.addChild(Metatarsal_r2);
        this.setRotateAngle(Metatarsal_r2, -0.2182F, 0.0F, 0.0F);
        this.Metatarsal_r2.cubeList.add(new ModelBox(Metatarsal_r2, 0, 0, -1.0F, -1.4329F, 2.9526F, 2, 7, 3, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 5.3881F, -1.236F);
        this.MetatarsalR.addChild(FootR);
        this.setRotateAngle(FootR, 0.0873F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 74, 30, -2.5F, -0.25F, -6.5F, 4, 2, 7, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.2F, -2.6F, 4.8F);
        this.Dilophosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0785F, 0.0F, 0.0F);


        this.CaudalProximal_r1 = new AdvancedModelRenderer(this);
        this.CaudalProximal_r1.setRotationPoint(0.7F, -0.2F, 0.2F);
        this.Tail1.addChild(CaudalProximal_r1);
        this.setRotateAngle(CaudalProximal_r1, -0.0436F, 0.0F, 0.0F);
        this.CaudalProximal_r1.cubeList.add(new ModelBox(CaudalProximal_r1, 0, 23, -3.0F, -1.0F, -2.0F, 5, 7, 14, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.2F, 0.5F, 11.6F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);


        this.CaudalMedioproximal_r1 = new AdvancedModelRenderer(this);
        this.CaudalMedioproximal_r1.setRotationPoint(0.0F, -1.1F, -0.4F);
        this.Tail2.addChild(CaudalMedioproximal_r1);
        this.setRotateAngle(CaudalMedioproximal_r1, 0.0349F, 0.0F, 0.0F);
        this.CaudalMedioproximal_r1.cubeList.add(new ModelBox(CaudalMedioproximal_r1, 26, 34, -2.0F, 0.0F, -1.0F, 4, 5, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, -0.4F, 11.6F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);


        this.CaudalMediodistal_r1 = new AdvancedModelRenderer(this);
        this.CaudalMediodistal_r1.setRotationPoint(-0.6F, -0.9F, -0.9F);
        this.Tail3.addChild(CaudalMediodistal_r1);
        this.setRotateAngle(CaudalMediodistal_r1, -0.0698F, 0.0F, 0.0F);
        this.CaudalMediodistal_r1.cubeList.add(new ModelBox(CaudalMediodistal_r1, 16, 69, -0.5F, -0.8F, 1.0F, 2, 1, 11, 0.0F, false));
        this.CaudalMediodistal_r1.cubeList.add(new ModelBox(CaudalMediodistal_r1, 21, 53, -1.0F, 0.0F, 0.0F, 3, 3, 12, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(-0.3F, 0.7F, 10.7F);
        this.Tail3.addChild(Tail4);


        this.CaudalDistal_r1 = new AdvancedModelRenderer(this);
        this.CaudalDistal_r1.setRotationPoint(0.2F, -0.6F, -0.1F);
        this.Tail4.addChild(CaudalDistal_r1);
        this.setRotateAngle(CaudalDistal_r1, -0.2705F, 0.0F, 0.0F);
        this.CaudalDistal_r1.cubeList.add(new ModelBox(CaudalDistal_r1, 0, 64, -0.5F, -1.0F, 0.0F, 1, 1, 12, 0.0F, false));
        this.CaudalDistal_r1.cubeList.add(new ModelBox(CaudalDistal_r1, 56, 0, -1.0F, 0.0F, 0.0F, 2, 2, 12, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.2F, 3.3F, 11.1F);
        this.Tail4.addChild(Tail5);


        this.CaudalDistalmost_r1 = new AdvancedModelRenderer(this);
        this.CaudalDistalmost_r1.setRotationPoint(0.5F, -0.6F, 0.1F);
        this.Tail5.addChild(CaudalDistalmost_r1);
        this.setRotateAngle(CaudalDistalmost_r1, -0.48F, 0.0F, 0.0F);
        this.CaudalDistalmost_r1.cubeList.add(new ModelBox(CaudalDistalmost_r1, 67, 15, -1.0F, -1.9F, 0.0F, 1, 3, 11, -0.1F, false));

        this.CaudalDistalmost_r2 = new AdvancedModelRenderer(this);
        this.CaudalDistalmost_r2.setRotationPoint(0.5F, -0.6F, 0.1F);
        this.Tail5.addChild(CaudalDistalmost_r2);
        this.setRotateAngle(CaudalDistalmost_r2, -0.48F, 0.0F, 0.0F);
        this.CaudalDistalmost_r2.cubeList.add(new ModelBox(CaudalDistalmost_r2, 34, 73, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -3.9F, -3.15F);
        this.Dilophosaurus.addChild(Body);


        this.Thorax_r1 = new AdvancedModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, -0.0262F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 50, 47, -3.5F, -1.6F, -13.0F, 7, 1, 11, 0.0F, false));
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 0, 0, -4.5F, -1.0F, -13.0F, 9, 11, 11, 0.0F, false));

        this.Scapulo_coracoid_r1 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r1.setRotationPoint(0.0F, -0.4F, -12.75F);
        this.Body.addChild(Scapulo_coracoid_r1);
        this.setRotateAngle(Scapulo_coracoid_r1, -0.0698F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r1.cubeList.add(new ModelBox(Scapulo_coracoid_r1, 107, 10, -0.5F, -2.1663F, -0.0234F, 1, 2, 7, 0.0F, false));

        this.CervicalProximal_r3 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r3.setRotationPoint(-0.5F, -0.639F, -6.3401F);
        this.Body.addChild(CervicalProximal_r3);
        this.setRotateAngle(CervicalProximal_r3, -0.0698F, 0.0F, 0.0F);
        this.CervicalProximal_r3.cubeList.add(new ModelBox(CervicalProximal_r3, 85, 41, 0.5F, -1.3807F, 0.3197F, 0, 1, 4, 0.0F, false));

        this.Scapulo_coracoid_r2 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r2.setRotationPoint(0.0F, -0.4F, -11.15F);
        this.Body.addChild(Scapulo_coracoid_r2);
        this.setRotateAngle(Scapulo_coracoid_r2, -0.1134F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r2.cubeList.add(new ModelBox(Scapulo_coracoid_r2, 98, 0, -2.0F, -2.1256F, 0.3899F, 4, 2, 7, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.6F, -13.65F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);


        this.Scapulo_coracoid_r3 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r3.setRotationPoint(0.0F, 0.2F, -5.1F);
        this.Chest.addChild(Scapulo_coracoid_r3);
        this.setRotateAngle(Scapulo_coracoid_r3, 0.0175F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r3.cubeList.add(new ModelBox(Scapulo_coracoid_r3, 107, 10, -0.5F, -2.0616F, -0.0243F, 1, 2, 7, 0.0F, false));

        this.Scapulo_coracoid_r4 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r4.setRotationPoint(0.0F, 0.2F, -6.1F);
        this.Chest.addChild(Scapulo_coracoid_r4);
        this.setRotateAngle(Scapulo_coracoid_r4, 0.0611F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r4.cubeList.add(new ModelBox(Scapulo_coracoid_r4, 98, 0, -2.0F, -1.6006F, 0.9738F, 4, 2, 7, 0.0F, false));
        this.Scapulo_coracoid_r4.cubeList.add(new ModelBox(Scapulo_coracoid_r4, 73, 0, -3.0F, -1.5006F, -0.0262F, 6, 2, 7, 0.0F, false));

        this.Scapulo_coracoid_r5 = new AdvancedModelRenderer(this);
        this.Scapulo_coracoid_r5.setRotationPoint(0.0F, 0.8F, -6.1F);
        this.Chest.addChild(Scapulo_coracoid_r5);
        this.setRotateAngle(Scapulo_coracoid_r5, 0.0436F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r5.cubeList.add(new ModelBox(Scapulo_coracoid_r5, 30, 0, -3.0F, 9.0F, 0.0F, 6, 1, 8, 0.0F, false));
        this.Scapulo_coracoid_r5.cubeList.add(new ModelBox(Scapulo_coracoid_r5, 0, 45, -4.0F, -1.0F, 0.0F, 8, 10, 8, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(4.0F, 7.6F, -4.0F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.3054F, 0.0873F, 0.0F);


        this.Humerus_r1 = new AdvancedModelRenderer(this);
        this.Humerus_r1.setRotationPoint(0.9F, 1.3F, 0.9F);
        this.ArmL.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, 0.829F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 48, 34, -2.0F, -2.0F, 0.0F, 2, 5, 2, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.9F, 1.9F, 4.1F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, 0.0087F, 0.0F, 0.0F);


        this.Radio_Ulna_r1 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(0.0F, 0.3853F, -1.9503F);
        this.ElbowL.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, -0.2618F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 89, 85, -2.0F, -1.0F, 0.1F, 2, 4, 2, -0.01F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.1F, 3.5853F, -2.3503F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0852F, 0.0189F, 0.3221F);
        this.HandL.cubeList.add(new ModelBox(HandL, 30, 0, -1.1F, -0.2F, -0.3F, 1, 4, 2, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-4.0F, 7.6F, -4.0F);
        this.Chest.addChild(ArmR);
        this.setRotateAngle(ArmR, -0.3054F, -0.0873F, 0.0F);


        this.Humerus_r2 = new AdvancedModelRenderer(this);
        this.Humerus_r2.setRotationPoint(-0.9F, 1.3F, 0.9F);
        this.ArmR.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, 0.829F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 48, 34, 0.0F, -2.0F, 0.0F, 2, 5, 2, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(-0.9F, 1.9F, 4.1F);
        this.ArmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, 0.0087F, 0.0F, 0.0F);


        this.Radio_Ulna_r2 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.0F, 0.3853F, -1.9503F);
        this.ElbowR.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, -0.2618F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 89, 85, 0.0F, -1.0F, 0.1F, 2, 4, 2, -0.01F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.1F, 3.5853F, -2.3503F);
        this.ElbowR.addChild(HandR);
        this.setRotateAngle(HandR, -0.0852F, -0.0189F, -0.3221F);
        this.HandR.cubeList.add(new ModelBox(HandR, 30, 0, 0.1F, -0.2F, -0.3F, 1, 4, 2, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 3.1F, -4.6F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.1309F, 0.0F, 0.0F);


        this.CervicalDistal_r1 = new AdvancedModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -5.4131F, -3.7265F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.5236F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 86, 48, -0.5F, -0.7883F, 0.75F, 1, 1, 5, 0.0F, false));
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 56, 15, -1.5F, -0.7883F, -0.25F, 3, 1, 5, 0.0F, false));

        this.CervicalDistal_r2 = new AdvancedModelRenderer(this);
        this.CervicalDistal_r2.setRotationPoint(0.0F, -8.1131F, -3.7265F);
        this.Neck1.addChild(CervicalDistal_r2);
        this.setRotateAngle(CervicalDistal_r2, -0.5236F, 0.0F, 0.0F);
        this.CervicalDistal_r2.cubeList.add(new ModelBox(CervicalDistal_r2, 73, 47, -1.5F, 8.25F, 1.1F, 3, 1, 7, 0.0F, false));
        this.CervicalDistal_r2.cubeList.add(new ModelBox(CervicalDistal_r2, 68, 73, -2.0F, 2.25F, 1.1F, 4, 6, 7, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -4.8131F, -3.8765F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);


        this.CervicalMedialcontinuation_r1 = new AdvancedModelRenderer(this);
        this.CervicalMedialcontinuation_r1.setRotationPoint(-0.5F, 3.8741F, -2.9637F);
        this.Neck2.addChild(CervicalMedialcontinuation_r1);
        this.setRotateAngle(CervicalMedialcontinuation_r1, -0.5149F, 0.0F, 0.0F);
        this.CervicalMedialcontinuation_r1.cubeList.add(new ModelBox(CervicalMedialcontinuation_r1, 32, 69, -1.0F, -3.1492F, 0.5977F, 3, 3, 2, 0.0F, false));

        this.CervicalMedial_r1 = new AdvancedModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(-0.5F, -3.7259F, -3.3637F);
        this.Neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.7418F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 85, 74, 0.5F, -0.9161F, 1.0271F, 0, 1, 4, 0.01F, false));
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 84, 72, -0.5F, -0.9161F, 0.0271F, 2, 1, 4, 0.01F, false));
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 68, 60, -0.5F, 5.0839F, 2.0271F, 2, 1, 4, 0.01F, false));
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 75, 60, -1.0F, 0.0839F, 0.0271F, 3, 5, 6, 0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.6259F, -3.3637F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1309F, 0.0F, 0.0F);


        this.MStenothyrohyoidNeck_r1 = new AdvancedModelRenderer(this);
        this.MStenothyrohyoidNeck_r1.setRotationPoint(-0.5F, -1.5F, -3.85F);
        this.Neck3.addChild(MStenothyrohyoidNeck_r1);
        this.setRotateAngle(MStenothyrohyoidNeck_r1, -0.1309F, 0.0F, 0.0F);
        this.MStenothyrohyoidNeck_r1.cubeList.add(new ModelBox(MStenothyrohyoidNeck_r1, 15, 69, -0.5F, 4.9914F, 1.1305F, 2, 2, 3, 0.0F, false));

        this.CervicalProximal_r4 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r4.setRotationPoint(-0.5F, -0.7F, -3.85F);
        this.Neck3.addChild(CervicalProximal_r4);
        this.setRotateAngle(CervicalProximal_r4, -0.2007F, 0.0F, 0.0F);
        this.CervicalProximal_r4.cubeList.add(new ModelBox(CervicalProximal_r4, 85, 41, 0.5F, -1.0866F, 0.8542F, 0, 1, 4, 0.0F, false));
        this.CervicalProximal_r4.cubeList.add(new ModelBox(CervicalProximal_r4, 85, 40, -0.5F, -0.8866F, -0.0458F, 2, 1, 4, 0.0F, false));
        this.CervicalProximal_r4.cubeList.add(new ModelBox(CervicalProximal_r4, 51, 80, -1.0F, -0.0866F, -0.0458F, 3, 5, 4, 0.0F, false));

        this.Atlas_r1 = new AdvancedModelRenderer(this);
        this.Atlas_r1.setRotationPoint(0.0F, -0.6F, -4.85F);
        this.Neck3.addChild(Atlas_r1);
        this.setRotateAngle(Atlas_r1, -0.1309F, 0.0F, 0.0F);
        this.Atlas_r1.cubeList.add(new ModelBox(Atlas_r1, 72, 30, 0.0F, -1.021F, -0.0065F, 0, 2, 1, -0.001F, false));

        this.Atlas_r2 = new AdvancedModelRenderer(this);
        this.Atlas_r2.setRotationPoint(-0.5F, -0.6F, -4.85F);
        this.Neck3.addChild(Atlas_r2);
        this.setRotateAngle(Atlas_r2, 0.1309F, 0.0F, 0.0F);
        this.Atlas_r2.cubeList.add(new ModelBox(Atlas_r2, 67, 30, -0.5F, -0.621F, -0.0065F, 2, 2, 1, -0.001F, false));
        this.Atlas_r2.cubeList.add(new ModelBox(Atlas_r2, 68, 15, -1.0F, -0.021F, -0.0065F, 3, 3, 1, -0.001F, false));

        this.ThroatPouch = new AdvancedModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 3.95F, -4.35F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, 0.8378F, 0.0F, 0.0F);


        this.TrhoatPouch_r1 = new AdvancedModelRenderer(this);
        this.TrhoatPouch_r1.setRotationPoint(0.0F, 1.8338F, 0.4514F);
        this.ThroatPouch.addChild(TrhoatPouch_r1);
        this.setRotateAngle(TrhoatPouch_r1, 0.3927F, 0.0F, 0.0F);
        this.TrhoatPouch_r1.cubeList.add(new ModelBox(TrhoatPouch_r1, 15, 82, -1.0F, -3.0F, 0.0F, 2, 4, 4, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2741F, -4.5363F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.1658F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 51, 0, -2.0F, -0.4287F, -4.1362F, 4, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 63, 87, -1.5F, 0.4918F, -7.099F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.1918F, -8.999F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.192F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 34, -0.4F, -0.3286F, -0.4155F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 34, 0.4F, -0.3286F, -0.4155F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.2918F, -7.399F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 34, -0.99F, -0.1434F, -0.5459F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 34, 0.99F, -0.1434F, -0.5459F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.4918F, -7.099F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 31, -1.3F, -2.0F, 0.3F, 0, 2, 3, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 31, 1.3F, -2.0F, 0.3F, 0, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.1918F, -9.599F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0996F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -1.0F, -0.04F, -0.8341F, 1, 1, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.4918F, -8.699F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6021F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 23, -1.0F, -0.0239F, -1.0158F, 1, 1, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.0082F, -7.099F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2705F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 69, -1.0F, 0.0501F, -1.6804F, 1, 1, 2, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.2F, -0.3082F, -4.199F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1854F, 0.4532F, 0.2388F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 26, -0.5F, -0.0037F, -0.6955F, 1, 1, 1, -0.02F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.2F, -0.3082F, -4.199F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1854F, -0.4532F, -0.2388F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 26, -0.5F, -0.0037F, -0.6955F, 1, 1, 1, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4082F, -3.099F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 86, -1.0F, 0.0F, -4.0F, 2, 1, 4, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.3918F, -7.099F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 53, -0.5F, -0.9698F, -2.0024F, 1, 1, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 40, -1.1F, -0.9698F, -2.0024F, 1, 1, 3, -0.01F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 40, 0.1F, -0.9698F, -2.0024F, 1, 1, 3, -0.01F, false));

        this.ParasagittalCrest = new AdvancedModelRenderer(this);
        this.ParasagittalCrest.setRotationPoint(0.0F, 0.6918F, -8.899F);
        this.Head.addChild(ParasagittalCrest);
        this.setRotateAngle(ParasagittalCrest, 0.0038F, 0.0697F, 0.2183F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1F, -4.5F, 5.9F);
        this.ParasagittalCrest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 27, 0.2F, -1.4333F, 0.8392F, 1, 3, 3, -0.2F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.1F, -4.3F, 3.0F);
        this.ParasagittalCrest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 23, 0.2F, -0.2813F, -0.2543F, 1, 5, 5, -0.202F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.ParasagittalCrest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9687F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 54, 0.2F, -0.2909F, -0.5499F, 1, 3, 6, -0.2F, false));

        this.ParasagittalCrest2 = new AdvancedModelRenderer(this);
        this.ParasagittalCrest2.setRotationPoint(0.0F, 0.6918F, -8.899F);
        this.Head.addChild(ParasagittalCrest2);
        this.setRotateAngle(ParasagittalCrest2, 0.0038F, -0.0697F, -0.2183F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1F, -4.5F, 5.9F);
        this.ParasagittalCrest2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 90, 27, -1.2F, -1.4333F, 0.8392F, 1, 3, 3, -0.2F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.1F, -4.3F, 3.0F);
        this.ParasagittalCrest2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 23, -1.2F, -0.2813F, -0.2543F, 1, 5, 5, -0.202F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.ParasagittalCrest2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9687F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 54, -1.2F, -0.2909F, -0.5499F, 1, 3, 6, -0.2F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.5918F, -0.099F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 81, 17, -2.0F, -0.1F, -4.0F, 4, 1, 4, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 81, 11, -2.0F, 0.7F, -4.0F, 4, 1, 4, -0.002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 88, 56, -1.5F, -0.1F, -7.0F, 3, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 67, 22, 0.1F, -0.1F, -9.0F, 1, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 67, 22, -1.1F, -0.1F, -9.0F, 1, 1, 2, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 8, -0.5F, -0.1F, -9.0F, 1, 1, 2, 0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 23, 1.2F, -0.6F, -6.8F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 25, 29, 0.9F, -0.6F, -8.0F, 0, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 23, -1.2F, -0.6F, -6.8F, 0, 1, 2, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 25, 29, -0.9F, -0.6F, -8.0F, 0, 1, 1, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 84, -1.5F, -3.0F, -3.1F, 3, 3, 3, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.9F, -8.7F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 45, 0.0F, -0.9994F, -0.0049F, 1, 1, 2, -0.002F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 76, 87, -1.0F, -0.9994F, 1.9951F, 3, 1, 3, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.9F, -8.0F);
        this.Jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2793F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 0, -0.4F, -1.44F, -1.6F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 0, 0.4F, -1.44F, -1.6F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 23, -0.5F, -0.84F, -1.6F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Dilophosaurus.render(f5);
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
        this.setRotateAngle(Dilophosaurus, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.05F, -0.01F, 0.0F);
        this.setRotateAngle(Chest, 0.05F, -0.18F, 0.0F);
        this.setRotateAngle(Neck1, 0.4F, -0.2F, 0.0F);
        this.setRotateAngle(Neck2, 0.1F, -0.28F, 0.0F);
        this.setRotateAngle(Neck3, -0.2F, -0.35F, 0.15F);
        this.setRotateAngle(Head, -0.F, -0.1F, 0.2F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(ThroatPouch, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(LegL, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(TibiaL, -0.2F, 0.0F, 0.05F);
        this.setRotateAngle(MetatarsalL, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.39F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(TibiaR, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.2F, 0.0F, 0.0F);
        this.Dilophosaurus.offsetY = -0.16F;
        this.Dilophosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Dilophosaurus.offsetY = 0.3F;
        this.Dilophosaurus.offsetX = 0.0F;
        this.Dilophosaurus.rotateAngleY = (float)Math.toRadians(150);
        this.Dilophosaurus.rotateAngleX = (float)Math.toRadians(5);
        this.Dilophosaurus.rotateAngleZ = (float)Math.toRadians(0);
        this.Dilophosaurus.scaleChildren = true;
        float scaler = 0.6F;
        this.Dilophosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Dilophosaurus, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.05F, -0.01F, 0.0F);
        this.setRotateAngle(Chest, 0.05F, -0.18F, 0.0F);
        this.setRotateAngle(Neck1, 0.4F, -0.2F, 0.0F);
        this.setRotateAngle(Neck2, 0.1F, -0.28F, 0.0F);
        this.setRotateAngle(Neck3, -0.2F, -0.35F, 0.15F);
        this.setRotateAngle(Head, -0.F, -0.1F, 0.2F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(ThroatPouch, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(LegL, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(TibiaL, -0.2F, 0.0F, 0.05F);
        this.setRotateAngle(MetatarsalL, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.35F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(TibiaR, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Dilophosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Dilophosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Dilophosaurus.scaleChildren = false;
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

        EntityPrehistoricFloraDilophosaurus EntityMegalosaurus = (EntityPrehistoricFloraDilophosaurus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ElbowL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ElbowR, this.HandR};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.ArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.ArmL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraDilophosaurus ee = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

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
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.CLEAN_ANIMATION) { //The idle noise/anim
            animClean(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle noise/anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

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
        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(xx), Dilophosaurus.rotateAngleY + (float) Math.toRadians(yy), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.325 + (((tickAnim - 20) / 10) * (-8.325-(-8.325)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.325 + (((tickAnim - 30) / 20) * (0-(-8.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Dilophosaurus.rotationPointX = this.Dilophosaurus.rotationPointX + (float)(xx);
        this.Dilophosaurus.rotationPointY = this.Dilophosaurus.rotationPointY - (float)(yy);
        this.Dilophosaurus.rotationPointZ = this.Dilophosaurus.rotationPointZ + (float)(zz);




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

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

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
        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(xx), Dilophosaurus.rotateAngleY + (float) Math.toRadians(yy), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(zz));




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

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 18) / 12) * (0-(-16)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ThroatPouch, ThroatPouch.rotateAngleX + (float) Math.toRadians(xx), ThroatPouch.rotateAngleY + (float) Math.toRadians(yy), ThroatPouch.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*3.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 16) / 12) * (0-(15)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (-12.5-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 20) / 20) * (-15-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 40) / 10) * (-17.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 50) / 30) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(xx), Dilophosaurus.rotateAngleY + (float) Math.toRadians(yy), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 15) / 15) * (15-(10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (18-(15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 50) / 30) * (0-(18)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 15) / 15) * (15-(10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (18-(15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 50) / 30) * (0-(18)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 10) / 10) * (5-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 20) / 20) * (10-(5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 40) / 20) * (5-(10)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 60) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 10) / 10) * (-5-(1.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 40) / 7) * (-6.67-(-5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -6.67 + (((tickAnim - 47) / 13) * (-2.5-(-6.67)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.13712-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (20.8597-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-18.5844-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.13712 + (((tickAnim - 5) / 5) * (-15.79642-(-9.13712)));
            yy = 20.8597 + (((tickAnim - 5) / 5) * (10.7761-(20.8597)));
            zz = -18.5844 + (((tickAnim - 5) / 5) * (-37.1075-(-18.5844)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.79642 + (((tickAnim - 10) / 4) * (-16.6917-(-15.79642)));
            yy = 10.7761 + (((tickAnim - 10) / 4) * (14.9347-(10.7761)));
            zz = -37.1075 + (((tickAnim - 10) / 4) * (-40.0248-(-37.1075)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -16.6917 + (((tickAnim - 14) / 7) * (-14.14737-(-16.6917)));
            yy = 14.9347 + (((tickAnim - 14) / 7) * (19.0157-(14.9347)));
            zz = -40.0248 + (((tickAnim - 14) / 7) * (-33.2367-(-40.0248)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -14.14737 + (((tickAnim - 21) / 3) * (-14.14737-(-14.14737)));
            yy = 19.0157 + (((tickAnim - 21) / 3) * (19.0157-(19.0157)));
            zz = -33.2367 + (((tickAnim - 21) / 3) * (-33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-6-(-33.2367)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = -14.14737 + (((tickAnim - 24) / 31) * (0-(-14.14737)));
            yy = 19.0157 + (((tickAnim - 24) / 31) * (0-(19.0157)));
            zz = -33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-6 + (((tickAnim - 24) / 31) * (-22.5-(-33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = -22.5 + (((tickAnim - 55) / 25) * (0-(-22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = -7.5 + (((tickAnim - 10) / 15) * (4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10-(-7.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 25) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 55) * (0-(0)));
            zz = 4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10 + (((tickAnim - 25) / 55) * (0-(4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.13712-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-20.8597-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (18.58441-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.13712 + (((tickAnim - 5) / 5) * (-15.79642-(-9.13712)));
            yy = -20.8597 + (((tickAnim - 5) / 5) * (-10.7761-(-20.8597)));
            zz = 18.58441 + (((tickAnim - 5) / 5) * (37.10747-(18.58441)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.79642 + (((tickAnim - 10) / 4) * (-16.6917-(-15.79642)));
            yy = -10.7761 + (((tickAnim - 10) / 4) * (-14.93467-(-10.7761)));
            zz = 37.10747 + (((tickAnim - 10) / 4) * (40.02483-(37.10747)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -16.6917 + (((tickAnim - 14) / 7) * (-14.14737-(-16.6917)));
            yy = -14.93467 + (((tickAnim - 14) / 7) * (-19.01574-(-14.93467)));
            zz = 40.02483 + (((tickAnim - 14) / 7) * (33.23669-(40.02483)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -14.14737 + (((tickAnim - 21) / 3) * (-14.14737-(-14.14737)));
            yy = -19.01574 + (((tickAnim - 21) / 3) * (-19.01574-(-19.01574)));
            zz = 33.23669 + (((tickAnim - 21) / 3) * (33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*6-(33.23669)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = -14.14737 + (((tickAnim - 24) / 31) * (0-(-14.14737)));
            yy = -19.01574 + (((tickAnim - 24) / 31) * (0-(-19.01574)));
            zz = 33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*6 + (((tickAnim - 24) / 31) * (22.5-(33.2367+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 22.5 + (((tickAnim - 55) / 25) * (0-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = -7.5 + (((tickAnim - 10) / 15) * (4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10-(-7.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 25) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 55) * (0-(0)));
            zz = 4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10 + (((tickAnim - 25) / 55) * (0-(4.2633+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 12) / 3) * (-9.76-(-5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -9.76 + (((tickAnim - 15) / 5) * (-16.50923-(-9.76)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.50923 + (((tickAnim - 20) / 10) * (-21.26-(-16.50923)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -21.26 + (((tickAnim - 30) / 50) * (0-(-21.26)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 10) / 5) * (-10.62-(1.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.62 + (((tickAnim - 15) / 5) * (0-(-10.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 25) / 15) * (7.5-(3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 40) / 20) * (-2.5-(7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -3.75 + (((tickAnim - 10) / 1) * (-0.31-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.31 + (((tickAnim - 11) / 4) * (-15.62-(-0.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.62 + (((tickAnim - 15) / 5) * (5-(-15.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 20) / 5) * (10.63-(5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10.63 + (((tickAnim - 25) / 15) * (20-(10.63)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 20 + (((tickAnim - 40) / 20) * (-17.5-(20)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 60) / 20) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-102.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*9.9-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -102.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*9.9 + (((tickAnim - 40) / 40) * (0-(-102.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*9.9)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ThroatPouch, ThroatPouch.rotateAngleX + (float) Math.toRadians(xx), ThroatPouch.rotateAngleY + (float) Math.toRadians(yy), ThroatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 10) / 5) * (25.63-(8.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.63 + (((tickAnim - 15) / 5) * (25-(25.63)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 20) / 5) * (5.63-(25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5.63 + (((tickAnim - 25) / 15) * (0-(5.63)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 37.5 + (((tickAnim - 20) / 20) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(37.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 40) / 20) * (2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 60) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.12 + (((tickAnim - 10) / 10) * (-5.25-(-5.12)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5.25 + (((tickAnim - 20) / 20) * (4.5-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 4.5 + (((tickAnim - 40) / 20) * (1.5-(4.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 60) / 20) * (0-(1.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -1.25 + (((tickAnim - 0) / 10) * (9.25-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (-1.25-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.25 + (((tickAnim - 20) / 10) * (-3.5-(-1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 30) / 10) * (7.25-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 40) / 10) * (7.44-(7.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 7.44 + (((tickAnim - 50) / 10) * (-3.37-(7.44)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -3.37 + (((tickAnim - 60) / 10) * (-4.43-(-3.37)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -4.43 + (((tickAnim - 70) / 10) * (0-(-4.43)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.13 + (((tickAnim - 10) / 10) * (15.75-(16.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 20) / 10) * (-3.12-(15.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.12 + (((tickAnim - 30) / 10) * (9.5-(-3.12)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 40) / 10) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 17.5 + (((tickAnim - 50) / 10) * (-1.5-(17.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.5 + (((tickAnim - 60) / 10) * (-5-(-1.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.25 + (((tickAnim - 10) / 10) * (16.5-(18.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.5 + (((tickAnim - 20) / 10) * (2.5-(16.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 30) / 10) * (-2-(2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 40) / 10) * (22.38-(-2)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 22.38 + (((tickAnim - 50) / 10) * (-11.75-(22.38)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -11.75 + (((tickAnim - 60) / 10) * (-11.37-(-11.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -11.37 + (((tickAnim - 70) / 10) * (0-(-11.37)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animClean(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -113.5274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2 + (((tickAnim - 28) / 20) * (-120.8929+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2-(-113.5274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2)));
            yy = -12.06946 + (((tickAnim - 28) / 20) * (-7.96421-(-12.06946)));
            zz = -1.66089 + (((tickAnim - 28) / 20) * (-6.0544-(-1.66089)));
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

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 18) / 32) * (-3.47217-(4)));
            yy = 0 + (((tickAnim - 18) / 32) * (6.73348-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0.47304-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -3.47217 + (((tickAnim - 50) / 10) * (-3.47217-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 50) / 10) * (6.73348-(6.73348)));
            zz = 0.47304 + (((tickAnim - 50) / 10) * (0.47304-(0.47304)));
        }
        else if (tickAnim >= 60 && tickAnim < 91) {
            xx = -3.47217 + (((tickAnim - 60) / 31) * (-3.47217-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 60) / 31) * (6.73348-(6.73348)));
            zz = 0.47304 + (((tickAnim - 60) / 31) * (0.47304-(0.47304)));
        }
        else if (tickAnim >= 91 && tickAnim < 120) {
            xx = -3.47217 + (((tickAnim - 91) / 29) * (0-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 91) / 29) * (0-(6.73348)));
            zz = 0.47304 + (((tickAnim - 91) / 29) * (0-(0.47304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(xx), Dilophosaurus.rotateAngleY + (float) Math.toRadians(yy), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-12.125-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 9) / 9) * (-10-(-17)));
            yy = -12.125 + (((tickAnim - 9) / 9) * (-24.25-(-12.125)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 18) / 32) * (1.05802-(-10)));
            yy = -24.25 + (((tickAnim - 18) / 32) * (-29.96421-(-24.25)));
            zz = 0 + (((tickAnim - 18) / 32) * (-8.3173-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 1.05802 + (((tickAnim - 50) / 41) * (1.05802-(1.05802)));
            yy = -29.96421 + (((tickAnim - 50) / 41) * (-29.96421-(-29.96421)));
            zz = -8.3173 + (((tickAnim - 50) / 41) * (-8.3173-(-8.3173)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 1.05802 + (((tickAnim - 91) / 7) * (6.3505-(1.05802)));
            yy = -29.96421 + (((tickAnim - 91) / 7) * (-17.00671-(-29.96421)));
            zz = -8.3173 + (((tickAnim - 91) / 7) * (-4.72063-(-8.3173)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 6.3505 + (((tickAnim - 98) / 7) * (11-(6.3505)));
            yy = -17.00671 + (((tickAnim - 98) / 7) * (0-(-17.00671)));
            zz = -4.72063 + (((tickAnim - 98) / 7) * (0-(-4.72063)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 11 + (((tickAnim - 105) / 15) * (0-(11)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.74-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (-1.225-(0)));
            yy = 0.74 + (((tickAnim - 9) / 9) * (-0.525-(0.74)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = -1.225 + (((tickAnim - 18) / 32) * (-1.225-(-1.225)));
            yy = -0.525 + (((tickAnim - 18) / 32) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = -1.225 + (((tickAnim - 50) / 41) * (-1.225-(-1.225)));
            yy = -0.525 + (((tickAnim - 50) / 41) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = -1.225 + (((tickAnim - 91) / 7) * (-0.7-(-1.225)));
            yy = -0.525 + (((tickAnim - 91) / 7) * (1.175-(-0.525)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = -0.7 + (((tickAnim - 98) / 7) * (0-(-0.7)));
            yy = 1.175 + (((tickAnim - 98) / 7) * (0-(1.175)));
            zz = 0 + (((tickAnim - 98) / 7) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (19.63-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 19.63 + (((tickAnim - 9) / 9) * (0-(19.63)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (-7.56987-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (-1.32571-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (3.79567-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = -7.56987 + (((tickAnim - 50) / 41) * (-7.56987-(-7.56987)));
            yy = -1.32571 + (((tickAnim - 50) / 41) * (-1.32571-(-1.32571)));
            zz = 3.79567 + (((tickAnim - 50) / 41) * (3.79567-(3.79567)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = -7.56987 + (((tickAnim - 91) / 7) * (15.45359-(-7.56987)));
            yy = -1.32571 + (((tickAnim - 91) / 7) * (-0.75243-(-1.32571)));
            zz = 3.79567 + (((tickAnim - 91) / 7) * (2.1543-(3.79567)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 15.45359 + (((tickAnim - 98) / 7) * (-13.00133-(15.45359)));
            yy = -0.75243 + (((tickAnim - 98) / 7) * (-1.65031-(-0.75243)));
            zz = 2.1543 + (((tickAnim - 98) / 7) * (-1.04351-(2.1543)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -13.00133 + (((tickAnim - 105) / 15) * (0-(-13.00133)));
            yy = -1.65031 + (((tickAnim - 105) / 15) * (0-(-1.65031)));
            zz = -1.04351 + (((tickAnim - 105) / 15) * (0-(-1.04351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaL, TibiaL.rotateAngleX + (float) Math.toRadians(xx), TibiaL.rotateAngleY + (float) Math.toRadians(yy), TibiaL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = -0.05 + (((tickAnim - 18) / 32) * (0.425-(-0.05)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            yy = 0.425 + (((tickAnim - 50) / 41) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = 0.425 + (((tickAnim - 91) / 14) * (0.9-(0.425)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 105) / 15) * (0-(0.9)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.TibiaL.rotationPointX = this.TibiaL.rotationPointX + (float)(xx);
        this.TibiaL.rotationPointY = this.TibiaL.rotationPointY - (float)(yy);
        this.TibiaL.rotationPointZ = this.TibiaL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 9) / 9) * (-4.75-(-17)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 18) / 32) * (10.5-(-4.75)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 10.5 + (((tickAnim - 50) / 41) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 10.5 + (((tickAnim - 91) / 7) * (-18.29-(10.5)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = -18.29 + (((tickAnim - 98) / 7) * (0-(-18.29)));
            yy = 0 + (((tickAnim - 98) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 7) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = -0.125 + (((tickAnim - 50) / 41) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = -0.125 + (((tickAnim - 91) / 14) * (0-(-0.125)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.MetatarsalL.rotationPointX = this.MetatarsalL.rotationPointX + (float)(xx);
        this.MetatarsalL.rotationPointY = this.MetatarsalL.rotationPointY - (float)(yy);
        this.MetatarsalL.rotationPointZ = this.MetatarsalL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (35.13-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 35.13 + (((tickAnim - 9) / 6) * (15.22-(35.13)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 15.22 + (((tickAnim - 15) / 3) * (10.5-(15.22)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 18) / 32) * (1.75-(10.5)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 1.75 + (((tickAnim - 50) / 41) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 1.75 + (((tickAnim - 91) / 7) * (29.74-(1.75)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 29.74 + (((tickAnim - 98) / 7) * (4.5-(29.74)));
            yy = 0 + (((tickAnim - 98) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 7) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 4.5 + (((tickAnim - 105) / 15) * (0-(4.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.86-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.18 + (((tickAnim - 9) / 9) * (-0.125-(0.18)));
            zz = -0.86 + (((tickAnim - 9) / 9) * (-0.425-(-0.86)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = -0.125 + (((tickAnim - 18) / 32) * (0.4-(-0.125)));
            zz = -0.425 + (((tickAnim - 18) / 32) * (0.05-(-0.425)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            yy = 0.4 + (((tickAnim - 50) / 41) * (0.4-(0.4)));
            zz = 0.05 + (((tickAnim - 50) / 41) * (0.05-(0.05)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 91) / 14) * (0.25-(0.4)));
            zz = 0.05 + (((tickAnim - 91) / 14) * (0-(0.05)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0.25 + (((tickAnim - 105) / 15) * (0-(0.25)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = -4.5 + (((tickAnim - 21) / 21) * (5.75-(-4.5)));
            yy = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 42) / 8) * (16.5-(5.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 16.5 + (((tickAnim - 50) / 41) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 16.5 + (((tickAnim - 91) / 14) * (15.2745-(16.5)));
            yy = 0 + (((tickAnim - 91) / 14) * (3.93606-(0)));
            zz = 0 + (((tickAnim - 91) / 14) * (0.7129-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 15.2745 + (((tickAnim - 105) / 7) * (4.63725-(15.2745)));
            yy = 3.93606 + (((tickAnim - 105) / 7) * (1.96803-(3.93606)));
            zz = 0.7129 + (((tickAnim - 105) / 7) * (0.35645-(0.7129)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 4.63725 + (((tickAnim - 112) / 8) * (0-(4.63725)));
            yy = 1.96803 + (((tickAnim - 112) / 8) * (0-(1.96803)));
            zz = 0.35645 + (((tickAnim - 112) / 8) * (0-(0.35645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            yy = -0.15 + (((tickAnim - 21) / 21) * (1.125-(-0.15)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 1.125 + (((tickAnim - 42) / 8) * (-0.12-(1.125)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            yy = -0.12 + (((tickAnim - 50) / 41) * (-0.12-(-0.12)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = -0.12 + (((tickAnim - 91) / 14) * (-0.12-(-0.12)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            yy = -0.12 + (((tickAnim - 105) / 7) * (1.365-(-0.12)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            yy = 1.365 + (((tickAnim - 112) / 8) * (0-(1.365)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 21) / 21) * (30.25-(0)));
            yy = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 30.25 + (((tickAnim - 42) / 8) * (0.25-(30.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0.25 + (((tickAnim - 50) / 41) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0.25 + (((tickAnim - 91) / 14) * (-0.5-(0.25)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = -0.5 + (((tickAnim - 105) / 7) * (12.88-(-0.5)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 12.88 + (((tickAnim - 112) / 8) * (0-(12.88)));
            yy = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TibiaR, TibiaR.rotateAngleX + (float) Math.toRadians(xx), TibiaR.rotateAngleY + (float) Math.toRadians(yy), TibiaR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 21) / 21) * (-16-(0)));
            yy = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 42) / 8) * (-1.5-(-16)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = -1.5 + (((tickAnim - 50) / 41) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = -1.5 + (((tickAnim - 91) / 14) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = -1.5 + (((tickAnim - 105) / 7) * (-32.5-(-1.5)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -32.5 + (((tickAnim - 112) / 8) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 21) / 21) * (29-(0)));
            yy = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 42) / 8) * (-12.25-(29)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = -12.25 + (((tickAnim - 50) / 41) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 41) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = -12.25 + (((tickAnim - 91) / 14) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = -12.25 + (((tickAnim - 105) / 7) * (26.63-(-12.25)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 26.63 + (((tickAnim - 112) / 8) * (0-(26.63)));
            yy = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 21) * (-1-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (-0.525-(0)));
            zz = -1 + (((tickAnim - 42) / 8) * (0.05-(-1)));
        }
        else if (tickAnim >= 50 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 50) / 41) * (0-(0)));
            yy = -0.525 + (((tickAnim - 50) / 41) * (-0.525-(-0.525)));
            zz = 0.05 + (((tickAnim - 50) / 41) * (0.05-(0.05)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = -0.525 + (((tickAnim - 91) / 14) * (-0.525-(-0.525)));
            zz = 0.05 + (((tickAnim - 91) / 14) * (0.05-(0.05)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            yy = -0.525 + (((tickAnim - 105) / 7) * (-0.26-(-0.525)));
            zz = 0.05 + (((tickAnim - 105) / 7) * (-1.02-(0.05)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            yy = -0.26 + (((tickAnim - 112) / 8) * (0-(-0.26)));
            zz = -1.02 + (((tickAnim - 112) / 8) * (0-(-1.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 15) / 10) * (4-(1.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 4 + (((tickAnim - 25) / 11) * (0.9997-(4)));
            yy = 0 + (((tickAnim - 25) / 11) * (0.7486-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (-0.04579-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0.9997 + (((tickAnim - 36) / 14) * (-5.50646-(0.9997)));
            yy = 0.7486 + (((tickAnim - 36) / 14) * (2.22527-(0.7486)));
            zz = -0.04579 + (((tickAnim - 36) / 14) * (-0.33274-(-0.04579)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = -5.50646 + (((tickAnim - 50) / 11) * (-4.27856-(-5.50646)));
            yy = 2.22527 + (((tickAnim - 50) / 11) * (-3.0368-(2.22527)));
            zz = -0.33274 + (((tickAnim - 50) / 11) * (0.42977-(-0.33274)));
        }
        else if (tickAnim >= 61 && tickAnim < 92) {
            xx = -4.27856 + (((tickAnim - 61) / 31) * (-3.05058-(-4.27856)));
            yy = -3.0368 + (((tickAnim - 61) / 31) * (-15.84441-(-3.0368)));
            zz = 0.42977 + (((tickAnim - 61) / 31) * (2.24798-(0.42977)));
        }
        else if (tickAnim >= 92 && tickAnim < 103) {
            xx = -3.05058 + (((tickAnim - 92) / 11) * (3.92223-(-3.05058)));
            yy = -15.84441 + (((tickAnim - 92) / 11) * (-4.88815-(-15.84441)));
            zz = 2.24798 + (((tickAnim - 92) / 11) * (0.71079-(2.24798)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = 3.92223 + (((tickAnim - 103) / 6) * (0.36773-(3.92223)));
            yy = -4.88815 + (((tickAnim - 103) / 6) * (-2.32769-(-4.88815)));
            zz = 0.71079 + (((tickAnim - 103) / 6) * (0.33847-(0.71079)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = 0.36773 + (((tickAnim - 109) / 11) * (0-(0.36773)));
            yy = -2.32769 + (((tickAnim - 109) / 11) * (0-(-2.32769)));
            zz = 0.33847 + (((tickAnim - 109) / 11) * (0-(0.33847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 15) / 10) * (2.25-(1)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 2.25 + (((tickAnim - 25) / 11) * (-5.50046-(2.25)));
            yy = 0 + (((tickAnim - 25) / 11) * (0.99863-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (-0.05234-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -5.50046 + (((tickAnim - 36) / 7) * (-8.25213-(-5.50046)));
            yy = 0.99863 + (((tickAnim - 36) / 7) * (1.49108-(0.99863)));
            zz = -0.05234 + (((tickAnim - 36) / 7) * (-0.16334-(-0.05234)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.25213 + (((tickAnim - 43) / 7) * (-5.00402-(-8.25213)));
            yy = 1.49108 + (((tickAnim - 43) / 7) * (3.2469-(1.49108)));
            zz = -0.16334 + (((tickAnim - 43) / 7) * (-0.14191-(-0.16334)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = -5.00402 + (((tickAnim - 50) / 11) * (-5.02402-(-5.00402)));
            yy = 3.2469 + (((tickAnim - 50) / 11) * (6.64067-(3.2469)));
            zz = -0.14191 + (((tickAnim - 50) / 11) * (-0.2919-(-0.14191)));
        }
        else if (tickAnim >= 61 && tickAnim < 92) {
            xx = -5.02402 + (((tickAnim - 61) / 31) * (-5.00954-(-5.02402)));
            yy = 6.64067 + (((tickAnim - 61) / 31) * (-4.99523-(6.64067)));
            zz = -0.2919 + (((tickAnim - 61) / 31) * (0.21865-(-0.2919)));
        }
        else if (tickAnim >= 92 && tickAnim < 103) {
            xx = -5.00954 + (((tickAnim - 92) / 11) * (2.6974-(-5.00954)));
            yy = -4.99523 + (((tickAnim - 92) / 11) * (-2.52461-(-4.99523)));
            zz = 0.21865 + (((tickAnim - 92) / 11) * (0.11057-(0.21865)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = 2.6974 + (((tickAnim - 103) / 6) * (-0.88931-(2.6974)));
            yy = -2.52461 + (((tickAnim - 103) / 6) * (-1.03955-(-2.52461)));
            zz = 0.11057 + (((tickAnim - 103) / 6) * (0.04553-(0.11057)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = -0.88931 + (((tickAnim - 109) / 11) * (0-(-0.88931)));
            yy = -1.03955 + (((tickAnim - 109) / 11) * (0-(-1.03955)));
            zz = 0.04553 + (((tickAnim - 109) / 11) * (0-(0.04553)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 15) / 10) * (-6.75-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -6.75 + (((tickAnim - 25) / 11) * (6.50266-(-6.75)));
            yy = 0 + (((tickAnim - 25) / 11) * (1.2249-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0.24925-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 6.50266 + (((tickAnim - 36) / 7) * (3.25843-(6.50266)));
            yy = 1.2249 + (((tickAnim - 36) / 7) * (2.98446-(1.2249)));
            zz = 0.24925 + (((tickAnim - 36) / 7) * (0.21551-(0.24925)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.25843 + (((tickAnim - 43) / 7) * (0-(3.25843)));
            yy = 2.98446 + (((tickAnim - 43) / 7) * (3-(2.98446)));
            zz = 0.21551 + (((tickAnim - 43) / 7) * (0-(0.21551)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (0-(0)));
            yy = 3 + (((tickAnim - 50) / 11) * (2.13-(3)));
            zz = 0 + (((tickAnim - 50) / 11) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = 2.13 + (((tickAnim - 61) / 10) * (-6.28-(2.13)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 71) / 21) * (0-(0)));
            yy = -6.28 + (((tickAnim - 71) / 21) * (-5.75-(-6.28)));
            zz = 0 + (((tickAnim - 71) / 21) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 92) / 11) * (-6.75-(0)));
            yy = -5.75 + (((tickAnim - 92) / 11) * (-3.21622-(-5.75)));
            zz = 0 + (((tickAnim - 92) / 11) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = -6.75 + (((tickAnim - 103) / 6) * (5.40809-(-6.75)));
            yy = -3.21622 + (((tickAnim - 103) / 6) * (-1.32432-(-3.21622)));
            zz = 0 + (((tickAnim - 103) / 6) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = 5.40809 + (((tickAnim - 109) / 11) * (0-(5.40809)));
            yy = -1.32432 + (((tickAnim - 109) / 11) * (0-(-1.32432)));
            zz = 0 + (((tickAnim - 109) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 15) / 10) * (-7.25-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -7.25 + (((tickAnim - 25) / 11) * (16.75376-(-7.25)));
            yy = 0 + (((tickAnim - 25) / 11) * (1.19696-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0.3603-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 16.75376 + (((tickAnim - 36) / 7) * (13.38442-(16.75376)));
            yy = 1.19696 + (((tickAnim - 36) / 7) * (1.45928-(1.19696)));
            zz = 0.3603 + (((tickAnim - 36) / 7) * (0.34719-(0.3603)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 13.38442 + (((tickAnim - 43) / 7) * (0-(13.38442)));
            yy = 1.45928 + (((tickAnim - 43) / 7) * (0-(1.45928)));
            zz = 0.34719 + (((tickAnim - 43) / 7) * (0-(0.34719)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 11) * (0.66-(0)));
            zz = 0 + (((tickAnim - 50) / 11) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = 0.66 + (((tickAnim - 61) / 10) * (3.57-(0.66)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 71) / 21) * (0-(0)));
            yy = 3.57 + (((tickAnim - 71) / 21) * (-16.5-(3.57)));
            zz = 0 + (((tickAnim - 71) / 21) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 92) / 11) * (-7.25-(0)));
            yy = -16.5 + (((tickAnim - 92) / 11) * (-3.44595-(-16.5)));
            zz = 0 + (((tickAnim - 92) / 11) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = -7.25 + (((tickAnim - 103) / 6) * (13.82721-(-7.25)));
            yy = -3.44595 + (((tickAnim - 103) / 6) * (-1.41892-(-3.44595)));
            zz = 0 + (((tickAnim - 103) / 6) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = 13.82721 + (((tickAnim - 109) / 11) * (0-(13.82721)));
            yy = -1.41892 + (((tickAnim - 109) / 11) * (0-(-1.41892)));
            zz = 0 + (((tickAnim - 109) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -6 + (((tickAnim - 15) / 10) * (-12.75-(-6)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -12.75 + (((tickAnim - 25) / 11) * (10.75-(-12.75)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.75 + (((tickAnim - 36) / 7) * (17.13-(10.75)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 17.13 + (((tickAnim - 43) / 7) * (0-(17.13)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (1.17027-(0)));
            yy = 0 + (((tickAnim - 50) / 11) * (4.82157-(0)));
            zz = 0 + (((tickAnim - 50) / 11) * (-0.39137-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 1.17027 + (((tickAnim - 61) / 10) * (2.13937-(1.17027)));
            yy = 4.82157 + (((tickAnim - 61) / 10) * (11.83502-(4.82157)));
            zz = -0.39137 + (((tickAnim - 61) / 10) * (-0.29047-(-0.39137)));
        }
        else if (tickAnim >= 71 && tickAnim < 92) {
            xx = 2.13937 + (((tickAnim - 71) / 21) * (3.18761-(2.13937)));
            yy = 11.83502 + (((tickAnim - 71) / 21) * (-32.69544-(11.83502)));
            zz = -0.29047 + (((tickAnim - 71) / 21) * (-2.33048-(-0.29047)));
        }
        else if (tickAnim >= 92 && tickAnim < 103) {
            xx = 3.18761 + (((tickAnim - 92) / 11) * (-4.1846-(3.18761)));
            yy = -32.69544 + (((tickAnim - 92) / 11) * (-9.40161-(-32.69544)));
            zz = -2.33048 + (((tickAnim - 92) / 11) * (-0.73925-(-2.33048)));
        }
        else if (tickAnim >= 103 && tickAnim < 109) {
            xx = -4.1846 + (((tickAnim - 103) / 6) * (2.24568-(-4.1846)));
            yy = -9.40161 + (((tickAnim - 103) / 6) * (-3.87125-(-9.40161)));
            zz = -0.73925 + (((tickAnim - 103) / 6) * (-0.3044-(-0.73925)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = 2.24568 + (((tickAnim - 109) / 11) * (0-(2.24568)));
            yy = -3.87125 + (((tickAnim - 109) / 11) * (0-(-3.87125)));
            zz = -0.3044 + (((tickAnim - 109) / 11) * (0-(-0.3044)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.9571-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.26383-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.40108-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 3.9571 + (((tickAnim - 18) / 20) * (2.8321-(3.9571)));
            yy = 3.26383 + (((tickAnim - 18) / 20) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 18) / 20) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = 2.8321 + (((tickAnim - 38) / 13) * (-1.7929-(2.8321)));
            yy = 3.26383 + (((tickAnim - 38) / 13) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 38) / 13) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -1.7929 + (((tickAnim - 51) / 10) * (-1.7929-(-1.7929)));
            yy = 3.26383 + (((tickAnim - 51) / 10) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 51) / 10) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = -1.7929 + (((tickAnim - 61) / 5) * (2.951-(-1.7929)));
            yy = 3.26383 + (((tickAnim - 61) / 5) * (-2.7124-(3.26383)));
            zz = -0.40108 + (((tickAnim - 61) / 5) * (-0.21362-(-0.40108)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 2.951 + (((tickAnim - 66) / 6) * (-1.80336-(2.951)));
            yy = -2.7124 + (((tickAnim - 66) / 6) * (-6.98115-(-2.7124)));
            zz = -0.21362 + (((tickAnim - 66) / 6) * (-0.07971-(-0.21362)));
        }
        else if (tickAnim >= 72 && tickAnim < 94) {
            xx = -1.80336 + (((tickAnim - 72) / 22) * (-1.80336-(-1.80336)));
            yy = -6.98115 + (((tickAnim - 72) / 22) * (-6.98115-(-6.98115)));
            zz = -0.07971 + (((tickAnim - 72) / 22) * (-0.07971-(-0.07971)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = -1.80336 + (((tickAnim - 94) / 26) * (0-(-1.80336)));
            yy = -6.98115 + (((tickAnim - 94) / 26) * (0-(-6.98115)));
            zz = -0.07971 + (((tickAnim - 94) / 26) * (0-(-0.07971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.66371-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.53698-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.82046-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 2.66371 + (((tickAnim - 18) / 20) * (-4.83629-(2.66371)));
            yy = 1.53698 + (((tickAnim - 18) / 20) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 18) / 20) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -4.83629 + (((tickAnim - 38) / 13) * (0.16371-(-4.83629)));
            yy = 1.53698 + (((tickAnim - 38) / 13) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 38) / 13) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 0.16371 + (((tickAnim - 51) / 10) * (0.16371-(0.16371)));
            yy = 1.53698 + (((tickAnim - 51) / 10) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 51) / 10) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0.16371 + (((tickAnim - 61) / 5) * (3.19149-(0.16371)));
            yy = 1.53698 + (((tickAnim - 61) / 5) * (-5.08077-(1.53698)));
            zz = -0.82046 + (((tickAnim - 61) / 5) * (-1.13209-(-0.82046)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = 3.19149 + (((tickAnim - 66) / 2) * (-1.66961-(3.19149)));
            yy = -5.08077 + (((tickAnim - 66) / 2) * (-8.38965-(-5.08077)));
            zz = -1.13209 + (((tickAnim - 66) / 2) * (-1.2879-(-1.13209)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = -1.66961 + (((tickAnim - 68) / 4) * (0.21928-(-1.66961)));
            yy = -8.38965 + (((tickAnim - 68) / 4) * (-11.69853-(-8.38965)));
            zz = -1.2879 + (((tickAnim - 68) / 4) * (-1.44372-(-1.2879)));
        }
        else if (tickAnim >= 72 && tickAnim < 94) {
            xx = 0.21928 + (((tickAnim - 72) / 22) * (0.21928-(0.21928)));
            yy = -11.69853 + (((tickAnim - 72) / 22) * (-11.69853-(-11.69853)));
            zz = -1.44372 + (((tickAnim - 72) / 22) * (-1.44372-(-1.44372)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = 0.21928 + (((tickAnim - 94) / 26) * (0-(0.21928)));
            yy = -11.69853 + (((tickAnim - 94) / 26) * (0-(-11.69853)));
            zz = -1.44372 + (((tickAnim - 94) / 26) * (0-(-1.44372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13.0318-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (7.96247-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.45413-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 13.0318 + (((tickAnim - 18) / 20) * (14.6568-(13.0318)));
            yy = 7.96247 + (((tickAnim - 18) / 20) * (7.96247-(7.96247)));
            zz = -2.45413 + (((tickAnim - 18) / 20) * (-2.45413-(-2.45413)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = 14.6568 + (((tickAnim - 38) / 13) * (1.7818-(14.6568)));
            yy = 7.96247 + (((tickAnim - 38) / 13) * (7.96247-(7.96247)));
            zz = -2.45413 + (((tickAnim - 38) / 13) * (-2.45413-(-2.45413)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 1.7818 + (((tickAnim - 51) / 10) * (1.7818-(1.7818)));
            yy = 7.96247 + (((tickAnim - 51) / 10) * (7.96247-(7.96247)));
            zz = -2.45413 + (((tickAnim - 51) / 10) * (-2.45413-(-2.45413)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 1.7818 + (((tickAnim - 61) / 5) * (5.1646-(1.7818)));
            yy = 7.96247 + (((tickAnim - 61) / 5) * (-2.31749-(7.96247)));
            zz = -2.45413 + (((tickAnim - 61) / 5) * (-4.15461-(-2.45413)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 5.1646 + (((tickAnim - 66) / 6) * (2.10051-(5.1646)));
            yy = -2.31749 + (((tickAnim - 66) / 6) * (-16.70943-(-2.31749)));
            zz = -4.15461 + (((tickAnim - 66) / 6) * (-6.53528-(-4.15461)));
        }
        else if (tickAnim >= 72 && tickAnim < 86) {
            xx = 2.10051 + (((tickAnim - 72) / 14) * (2.97284-(2.10051)));
            yy = -16.70943 + (((tickAnim - 72) / 14) * (-16.18646-(-16.70943)));
            zz = -6.53528 + (((tickAnim - 72) / 14) * (-9.61544-(-6.53528)));
        }
        else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 2.97284 + (((tickAnim - 86) / 7) * (-7.27716-(2.97284)));
            yy = -16.18646 + (((tickAnim - 86) / 7) * (-16.18646-(-16.18646)));
            zz = -9.61544 + (((tickAnim - 86) / 7) * (-9.61544-(-9.61544)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = -7.27716 + (((tickAnim - 93) / 2) * (-7.27716-(-7.27716)));
            yy = -16.18646 + (((tickAnim - 93) / 2) * (-16.18646-(-16.18646)));
            zz = -9.61544 + (((tickAnim - 93) / 2) * (-9.61544-(-9.61544)));
        }
        else if (tickAnim >= 95 && tickAnim < 99) {
            xx = -7.27716 + (((tickAnim - 95) / 4) * (-3.45167-(-7.27716)));
            yy = -16.18646 + (((tickAnim - 95) / 4) * (-14.53589-(-16.18646)));
            zz = -9.61544 + (((tickAnim - 95) / 4) * (-1.35473-(-9.61544)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = -3.45167 + (((tickAnim - 99) / 4) * (-2.47116-(-3.45167)));
            yy = -14.53589 + (((tickAnim - 99) / 4) * (-12.04226-(-14.53589)));
            zz = -1.35473 + (((tickAnim - 99) / 4) * (-3.1764-(-1.35473)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -2.47116 + (((tickAnim - 103) / 3) * (-2.47723-(-2.47116)));
            yy = -12.04226 + (((tickAnim - 103) / 3) * (-10.00071-(-12.04226)));
            zz = -3.1764 + (((tickAnim - 103) / 3) * (0.20823-(-3.1764)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -2.47723 + (((tickAnim - 106) / 3) * (-1.6959-(-2.47723)));
            yy = -10.00071 + (((tickAnim - 106) / 3) * (-7.49849-(-10.00071)));
            zz = 0.20823 + (((tickAnim - 106) / 3) * (-1.34647-(0.20823)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -1.6959 + (((tickAnim - 109) / 3) * (-1.21948-(-1.6959)));
            yy = -7.49849 + (((tickAnim - 109) / 3) * (-5.24616-(-7.49849)));
            zz = -1.34647 + (((tickAnim - 109) / 3) * (-0.43313-(-1.34647)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -1.21948 + (((tickAnim - 112) / 8) * (0-(-1.21948)));
            yy = -5.24616 + (((tickAnim - 112) / 8) * (0-(-5.24616)));
            zz = -0.43313 + (((tickAnim - 112) / 8) * (0-(-0.43313)));
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



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 10.5 + (((tickAnim - 18) / 20) * (-3.125-(10.5)));
            yy = 7.5 + (((tickAnim - 18) / 20) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -3.125 + (((tickAnim - 38) / 13) * (-4.5-(-3.125)));
            yy = 7.5 + (((tickAnim - 38) / 13) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 38) / 13) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -4.5 + (((tickAnim - 51) / 10) * (-4.5-(-4.5)));
            yy = 7.5 + (((tickAnim - 51) / 10) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 51) / 10) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = -4.5 + (((tickAnim - 61) / 3) * (-1.42671-(-4.5)));
            yy = 7.5 + (((tickAnim - 61) / 3) * (4.03295-(7.5)));
            zz = 0 + (((tickAnim - 61) / 3) * (0.21878-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 66) {
            xx = -1.42671 + (((tickAnim - 64) / 2) * (-1.5244-(-1.42671)));
            yy = 4.03295 + (((tickAnim - 64) / 2) * (-2.51518-(4.03295)));
            zz = 0.21878 + (((tickAnim - 64) / 2) * (1.1212-(0.21878)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = -1.5244 + (((tickAnim - 66) / 2) * (3.88472-(-1.5244)));
            yy = -2.51518 + (((tickAnim - 66) / 2) * (-0.61829-(-2.51518)));
            zz = 1.1212 + (((tickAnim - 66) / 2) * (1.05824-(1.1212)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 3.88472 + (((tickAnim - 68) / 4) * (-4.23463-(3.88472)));
            yy = -0.61829 + (((tickAnim - 68) / 4) * (-8.57414-(-0.61829)));
            zz = 1.05824 + (((tickAnim - 68) / 4) * (2.40011-(1.05824)));
        }
        else if (tickAnim >= 72 && tickAnim < 86) {
            xx = -4.23463 + (((tickAnim - 72) / 14) * (2.69422-(-4.23463)));
            yy = -8.57414 + (((tickAnim - 72) / 14) * (-8.86064-(-8.57414)));
            zz = 2.40011 + (((tickAnim - 72) / 14) * (-0.37383-(2.40011)));
        }
        else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 2.69422 + (((tickAnim - 86) / 7) * (-9.30578-(2.69422)));
            yy = -8.86064 + (((tickAnim - 86) / 7) * (-8.86064-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 86) / 7) * (-0.37383-(-0.37383)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = -9.30578 + (((tickAnim - 93) / 2) * (-9.30578-(-9.30578)));
            yy = -8.86064 + (((tickAnim - 93) / 2) * (-8.86064-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 93) / 2) * (-0.37383-(-0.37383)));
        }
        else if (tickAnim >= 95 && tickAnim < 99) {
            xx = -9.30578 + (((tickAnim - 95) / 4) * (-2.30158-(-9.30578)));
            yy = -8.86064 + (((tickAnim - 95) / 4) * (-5.3718-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 95) / 4) * (0.49353-(-0.37383)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = -2.30158 + (((tickAnim - 99) / 4) * (-1.30362-(-2.30158)));
            yy = -5.3718 + (((tickAnim - 99) / 4) * (-2.75213-(-5.3718)));
            zz = 0.49353 + (((tickAnim - 99) / 4) * (3.28773-(0.49353)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -1.30362 + (((tickAnim - 103) / 3) * (-2.30158-(-1.30362)));
            yy = -2.75213 + (((tickAnim - 103) / 3) * (-5.3718-(-2.75213)));
            zz = 3.28773 + (((tickAnim - 103) / 3) * (0.49353-(3.28773)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -2.30158 + (((tickAnim - 106) / 3) * (-1.30362-(-2.30158)));
            yy = -5.3718 + (((tickAnim - 106) / 3) * (-2.75213-(-5.3718)));
            zz = 0.49353 + (((tickAnim - 106) / 3) * (3.28773-(0.49353)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -1.30362 + (((tickAnim - 109) / 3) * (-2.30158-(-1.30362)));
            yy = -2.75213 + (((tickAnim - 109) / 3) * (-5.3718-(-2.75213)));
            zz = 3.28773 + (((tickAnim - 109) / 3) * (0.49353-(3.28773)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -2.30158 + (((tickAnim - 112) / 8) * (0-(-2.30158)));
            yy = -5.3718 + (((tickAnim - 112) / 8) * (0-(-5.3718)));
            zz = 0.49353 + (((tickAnim - 112) / 8) * (0-(0.49353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 38) / 23) * (0-(0)));
            yy = 0.375 + (((tickAnim - 38) / 23) * (0-(0.375)));
            zz = 0 + (((tickAnim - 38) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 12 + (((tickAnim - 18) / 20) * (-9.62-(12)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -9.62 + (((tickAnim - 38) / 13) * (15.25-(-9.62)));
            yy = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 13) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 15.25 + (((tickAnim - 51) / 2) * (11.25-(15.25)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 11.25 + (((tickAnim - 53) / 3) * (15.25-(11.25)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 15.25 + (((tickAnim - 56) / 2) * (11.25-(15.25)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 11.25 + (((tickAnim - 58) / 3) * (15.25-(11.25)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = 15.25 + (((tickAnim - 61) / 3) * (20.34303-(15.25)));
            yy = 0 + (((tickAnim - 61) / 3) * (-10.2535-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (-2.46358-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 20.34303 + (((tickAnim - 64) / 4) * (11.90484-(20.34303)));
            yy = -10.2535 + (((tickAnim - 64) / 4) * (-18.79064-(-10.2535)));
            zz = -2.46358 + (((tickAnim - 64) / 4) * (-3.31637-(-2.46358)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 11.90484 + (((tickAnim - 68) / 4) * (23.41137-(11.90484)));
            yy = -18.79064 + (((tickAnim - 68) / 4) * (-12.94037-(-18.79064)));
            zz = -3.31637 + (((tickAnim - 68) / 4) * (-1.74181-(-3.31637)));
        }
        else if (tickAnim >= 72 && tickAnim < 86) {
            xx = 23.41137 + (((tickAnim - 72) / 14) * (23.16945-(23.41137)));
            yy = -12.94037 + (((tickAnim - 72) / 14) * (-12.44111-(-12.94037)));
            zz = -1.74181 + (((tickAnim - 72) / 14) * (-2.91648-(-1.74181)));
        }
        else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 23.16945 + (((tickAnim - 86) / 7) * (32.91945-(23.16945)));
            yy = -12.44111 + (((tickAnim - 86) / 7) * (-12.44111-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 86) / 7) * (-2.91648-(-2.91648)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 32.91945 + (((tickAnim - 93) / 2) * (32.91945-(32.91945)));
            yy = -12.44111 + (((tickAnim - 93) / 2) * (-12.44111-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 93) / 2) * (-2.91648-(-2.91648)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 32.91945 + (((tickAnim - 95) / 8) * (13.28482-(32.91945)));
            yy = -12.44111 + (((tickAnim - 95) / 8) * (-4.99832-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 95) / 8) * (-6.40472-(-2.91648)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 13.28482 + (((tickAnim - 103) / 3) * (7.36913-(13.28482)));
            yy = -4.99832 + (((tickAnim - 103) / 3) * (-4.97175-(-4.99832)));
            zz = -6.40472 + (((tickAnim - 103) / 3) * (3.11209-(-6.40472)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 7.36913 + (((tickAnim - 106) / 3) * (2.28482-(7.36913)));
            yy = -4.97175 + (((tickAnim - 106) / 3) * (-4.99832-(-4.97175)));
            zz = 3.11209 + (((tickAnim - 106) / 3) * (-6.40472-(3.11209)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = 2.28482 + (((tickAnim - 109) / 3) * (-0.88087-(2.28482)));
            yy = -4.99832 + (((tickAnim - 109) / 3) * (-4.97175-(-4.99832)));
            zz = -6.40472 + (((tickAnim - 109) / 3) * (3.11209-(-6.40472)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -0.88087 + (((tickAnim - 112) / 8) * (0-(-0.88087)));
            yy = -4.97175 + (((tickAnim - 112) / 8) * (0-(-4.97175)));
            zz = 3.11209 + (((tickAnim - 112) / 8) * (0-(3.11209)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = -1.5 + (((tickAnim - 18) / 20) * (-18.87-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -18.87 + (((tickAnim - 38) / 13) * (-3.75-(-18.87)));
            yy = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 13) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = -3.75 + (((tickAnim - 51) / 2) * (-1.07-(-3.75)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = -1.07 + (((tickAnim - 53) / 3) * (-9.69-(-1.07)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = -9.69 + (((tickAnim - 56) / 2) * (-1.07-(-9.69)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -1.07 + (((tickAnim - 58) / 3) * (-3.75-(-1.07)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = -3.75 + (((tickAnim - 61) / 4) * (1.60349-(-3.75)));
            yy = 0 + (((tickAnim - 61) / 4) * (-6.57184-(0)));
            zz = 0 + (((tickAnim - 61) / 4) * (-1.63109-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = 1.60349 + (((tickAnim - 65) / 4) * (-10.98847-(1.60349)));
            yy = -6.57184 + (((tickAnim - 65) / 4) * (-6.02419-(-6.57184)));
            zz = -1.63109 + (((tickAnim - 65) / 4) * (-1.49516-(-1.63109)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -10.98847 + (((tickAnim - 69) / 4) * (-3.75-(-10.98847)));
            yy = -6.02419 + (((tickAnim - 69) / 4) * (0-(-6.02419)));
            zz = -1.49516 + (((tickAnim - 69) / 4) * (0-(-1.49516)));
        }
        else if (tickAnim >= 73 && tickAnim < 83) {
            xx = -3.75 + (((tickAnim - 73) / 10) * (-3.79567-(-3.75)));
            yy = 0 + (((tickAnim - 73) / 10) * (0.72445-(0)));
            zz = 0 + (((tickAnim - 73) / 10) * (-7.21391-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -3.79567 + (((tickAnim - 83) / 3) * (-3.79567-(-3.79567)));
            yy = 0.72445 + (((tickAnim - 83) / 3) * (0.72445-(0.72445)));
            zz = -7.21391 + (((tickAnim - 83) / 3) * (-7.21391-(-7.21391)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = -3.79567 + (((tickAnim - 86) / 4) * (1.85967-(-3.79567)));
            yy = 0.72445 + (((tickAnim - 86) / 4) * (-2.45795-(0.72445)));
            zz = -7.21391 + (((tickAnim - 86) / 4) * (12.16975-(-7.21391)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 1.85967 + (((tickAnim - 90) / 3) * (6.83466-(1.85967)));
            yy = -2.45795 + (((tickAnim - 90) / 3) * (-1.41113-(-2.45795)));
            zz = 12.16975 + (((tickAnim - 90) / 3) * (10.03223-(12.16975)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 6.83466 + (((tickAnim - 93) / 2) * (6.83466-(6.83466)));
            yy = -1.41113 + (((tickAnim - 93) / 2) * (-1.41113-(-1.41113)));
            zz = 10.03223 + (((tickAnim - 93) / 2) * (10.03223-(10.03223)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 6.83466 + (((tickAnim - 95) / 8) * (2.42259-(6.83466)));
            yy = -1.41113 + (((tickAnim - 95) / 8) * (10.72032-(-1.41113)));
            zz = 10.03223 + (((tickAnim - 95) / 8) * (-9.4392-(10.03223)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 2.42259 + (((tickAnim - 103) / 3) * (0.56007-(2.42259)));
            yy = 10.72032 + (((tickAnim - 103) / 3) * (2.44701-(10.72032)));
            zz = -9.4392 + (((tickAnim - 103) / 3) * (13.69335-(-9.4392)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 0.56007 + (((tickAnim - 106) / 3) * (-6.82741-(0.56007)));
            yy = 2.44701 + (((tickAnim - 106) / 3) * (10.72032-(2.44701)));
            zz = 13.69335 + (((tickAnim - 106) / 3) * (-9.4392-(13.69335)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -6.82741 + (((tickAnim - 109) / 3) * (-6.68993-(-6.82741)));
            yy = 10.72032 + (((tickAnim - 109) / 3) * (2.44701-(10.72032)));
            zz = -9.4392 + (((tickAnim - 109) / 3) * (13.69335-(-9.4392)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -6.68993 + (((tickAnim - 112) / 8) * (0-(-6.68993)));
            yy = 2.44701 + (((tickAnim - 112) / 8) * (0-(2.44701)));
            zz = 13.69335 + (((tickAnim - 112) / 8) * (0-(13.69335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0.6-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            zz = 0.6 + (((tickAnim - 38) / 13) * (0-(0.6)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0.25-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0.25 + (((tickAnim - 56) / 5) * (0-(0.25)));
        }
        else if (tickAnim >= 61 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 61) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = 11.5 + (((tickAnim - 20) / 32) * (0-(11.5)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 32) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (7.25-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 7.25 + (((tickAnim - 66) / 6) * (0-(7.25)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 23) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (11.25-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 11.25 + (((tickAnim - 108) / 12) * (0-(11.25)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = -18 + (((tickAnim - 20) / 32) * (0-(-18)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 32) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (-14-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = -14 + (((tickAnim - 66) / 6) * (0-(-14)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 23) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = -14.25 + (((tickAnim - 108) / 12) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = 11.5 + (((tickAnim - 20) / 32) * (0-(11.5)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 32) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (7.25-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 7.25 + (((tickAnim - 66) / 6) * (0-(7.25)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 23) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (8.75-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 8.75 + (((tickAnim - 108) / 12) * (0-(8.75)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = -18 + (((tickAnim - 20) / 32) * (0-(-18)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 32) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = -7.25 + (((tickAnim - 66) / 6) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 23) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = -12.75 + (((tickAnim - 108) / 12) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (-19-(0)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -19 + (((tickAnim - 56) / 4) * (0-(-19)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 71) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 12) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 83) / 4) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -24.5 + (((tickAnim - 87) / 2) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 87) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 2) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 89) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 2) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 91) / 2) * (-39.5-(0)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = -39.5 + (((tickAnim - 93) / 2) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (8-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 8 + (((tickAnim - 108) / 12) * (0-(8)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ThroatPouch, ThroatPouch.rotateAngleX + (float) Math.toRadians(xx), ThroatPouch.rotateAngleY + (float) Math.toRadians(yy), ThroatPouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            yy = 0.125 + (((tickAnim - 50) / 6) * (0-(0.125)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (0.125-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 0.125 + (((tickAnim - 60) / 11) * (0-(0.125)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 71) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 12) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 83) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ThroatPouch.rotationPointX = this.ThroatPouch.rotationPointX + (float)(xx);
        this.ThroatPouch.rotationPointY = this.ThroatPouch.rotationPointY - (float)(yy);
        this.ThroatPouch.rotationPointZ = this.ThroatPouch.rotationPointZ + (float)(zz);




        if (tickAnim >= 73 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 73) / 12) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 73) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 12) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -1.5 + (((tickAnim - 85) / 8) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -1.5 + (((tickAnim - 93) / 9) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = 15.75 + (((tickAnim - 20) / 32) * (0-(15.75)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (14-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 14 + (((tickAnim - 66) / 6) * (0-(14)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 18) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 90) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 18) * (11.25-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 11.25 + (((tickAnim - 108) / 12) * (0-(11.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 32) * (0-(0)));
            zz = -9.5 + (((tickAnim - 20) / 32) * (0-(-9.5)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 9) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (-14-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = -14 + (((tickAnim - 66) / 6) * (0-(-14)));
        }
        else if (tickAnim >= 72 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 23) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (-12.25-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = -12.25 + (((tickAnim - 108) / 12) * (0-(-12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*4), Dilophosaurus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));
        this.Dilophosaurus.rotationPointX = this.Dilophosaurus.rotationPointX + (float)(0);
        this.Dilophosaurus.rotationPointY = this.Dilophosaurus.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*1);
        this.Dilophosaurus.rotationPointZ = this.Dilophosaurus.rotationPointZ + (float)(0);



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
    }



    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Dilophosaurus, Dilophosaurus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-20))*2), Dilophosaurus.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*3)), Dilophosaurus.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*1)));

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
        this.Dilophosaurus.rotationPointX = this.Dilophosaurus.rotationPointX + (float)(xx);
        this.Dilophosaurus.rotationPointY = this.Dilophosaurus.rotationPointY - (float)(yy);
        this.Dilophosaurus.rotationPointZ = this.Dilophosaurus.rotationPointZ + (float)(zz);




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
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDilophosaurus e = (EntityPrehistoricFloraDilophosaurus) entity;



    }
}
