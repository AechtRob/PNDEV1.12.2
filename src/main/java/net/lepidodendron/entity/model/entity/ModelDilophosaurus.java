package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDilophosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraDilophosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animClean(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;
    }



    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDilophosaurus entity = (EntityPrehistoricFloraDilophosaurus) entitylivingbaseIn;
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

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDilophosaurus e = (EntityPrehistoricFloraDilophosaurus) entity;

        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);



    }
}
