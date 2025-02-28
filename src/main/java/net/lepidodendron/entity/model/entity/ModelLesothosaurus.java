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
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer Metatarsals_r1;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer Pes_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer Metatarsals_r2;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer Pes_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer Humerus_r1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer Radio_Ulna_r1;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer Manus_r1;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer Humerus_r2;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer Radio_Ulna_r2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer Manus_r2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer CervicalDistal_r1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer mIliocostaliscapitis_r1;
    private final AdvancedModelRenderer CervicalProximal_r1;
    private final AdvancedModelRenderer CervicalProximal_r2;
    private final AdvancedModelRenderer mStermomandibularis_r1;
    private final AdvancedModelRenderer CervicalMedial_r1;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer CervicalProximal_r3;
    private final AdvancedModelRenderer CervicalProximal_r4;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Eye_r1;
    private final AdvancedModelRenderer Premaxillary_r1;
    private final AdvancedModelRenderer NasalCrestDistal_r1;
    private final AdvancedModelRenderer NasalCrestDistal_r2;
    private final AdvancedModelRenderer Squamosal_r1;
    private final AdvancedModelRenderer Squamosal_r2;
    private final AdvancedModelRenderer Squamosal_r3;
    private final AdvancedModelRenderer Squamosal_r4;
    private final AdvancedModelRenderer Quadratojugal_r1;
    private final AdvancedModelRenderer Quadratojugal_r2;
    private final AdvancedModelRenderer Quadratojugal_r3;
    private final AdvancedModelRenderer Quadratojugal_r4;
    private final AdvancedModelRenderer Quadratojugal_r5;
    private final AdvancedModelRenderer Quadratojugal_r6;
    private final AdvancedModelRenderer Quadratojugal_r7;
    private final AdvancedModelRenderer Quadratojugal_r8;
    private final AdvancedModelRenderer Quadratojugal_r9;
    private final AdvancedModelRenderer Teeth_r1;
    private final AdvancedModelRenderer Teeth_r2;
    private final AdvancedModelRenderer Palate_r1;
    private final AdvancedModelRenderer HeadslopeL;
    private final AdvancedModelRenderer AntiorbitalAirSinus_r1;
    private final AdvancedModelRenderer HeadslopeL2;
    private final AdvancedModelRenderer AntiorbitalAirSinus_r2;
    private final AdvancedModelRenderer BrowL;
    private final AdvancedModelRenderer Crestpostorbital_r1;
    private final AdvancedModelRenderer Crest_r1;
    private final AdvancedModelRenderer Crest_r2;
    private final AdvancedModelRenderer BrowL2;
    private final AdvancedModelRenderer Crestpostorbital_r2;
    private final AdvancedModelRenderer Crest_r3;
    private final AdvancedModelRenderer Crest_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Predentary_r1;
    private final AdvancedModelRenderer Digastricmuscles_r1;
    private final AdvancedModelRenderer Angular_r1;
    private final AdvancedModelRenderer Teeth_r3;
    private final AdvancedModelRenderer Teeth_r4;
    private final AdvancedModelRenderer Surangular_r1;
    private final AdvancedModelRenderer JawslopeL;
    private final AdvancedModelRenderer Dentary_r1;
    private final AdvancedModelRenderer JawslopeL2;
    private final AdvancedModelRenderer Dentary_r2;
    private final AdvancedModelRenderer MasseterL;
    private final AdvancedModelRenderer Massetersuperficialisinside_r1;
    private final AdvancedModelRenderer MasseterL2;
    private final AdvancedModelRenderer Massetersuperficialisinside_r2;
    private final AdvancedModelRenderer MasseterR;


    private ModelAnimator animator;

    public ModelLesothosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 37, -3.0F, -2.0F, -3.0F, 6, 7, 7, -0.004F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 56, -3.0F, 0.0791F, 0.0456F, 6, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 26, -3.0F, -0.2F, -0.2F, 6, 4, 4, 0.02F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.35F, 0.1F, 0.8F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 0, -1.35F, -0.9194F, -1.9666F, 3, 8, 4, 0.0F, false));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 17, 62, -1.35F, -0.9194F, 1.8334F, 3, 8, 1, -0.002F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.25F, 6.758F, -1.5603F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9687F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 19, 18, -1.0F, -0.0466F, 1.5217F, 2, 10, 1, -0.001F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 18, -1.0F, -0.0466F, -0.3783F, 2, 10, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.7979F, 2.0046F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.0F);


        this.Metatarsals_r1 = new AdvancedModelRenderer(this);
        this.Metatarsals_r1.setRotationPoint(-2.4977F, -15.7436F, 0.2981F);
        this.leftLeg3.addChild(Metatarsals_r1);
        this.setRotateAngle(Metatarsals_r1, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r1.cubeList.add(new ModelBox(Metatarsals_r1, 26, 62, 1.5F, 10.0767F, 10.2776F, 2, 5, 2, -0.002F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.0977F, 2.9564F, -3.3019F);
        this.leftLeg3.addChild(leftLeg4);


        this.Pes_r1 = new AdvancedModelRenderer(this);
        this.Pes_r1.setRotationPoint(-2.4F, -18.7F, 3.6F);
        this.leftLeg4.addChild(Pes_r1);
        this.setRotateAngle(Pes_r1, -0.576F, 0.0F, 0.0F);
        this.Pes_r1.cubeList.add(new ModelBox(Pes_r1, 0, 61, 1.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.35F, 0.1F, 0.8F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 0, -1.65F, -0.9194F, -1.9666F, 3, 8, 4, 0.0F, true));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 17, 62, -1.65F, -0.9194F, 1.8334F, 3, 8, 1, -0.002F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.25F, 6.758F, -1.5603F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9687F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 19, 18, -1.0F, -0.0466F, 1.5217F, 2, 10, 1, -0.001F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 18, -1.0F, -0.0466F, -0.3783F, 2, 10, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.7979F, 2.0046F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, 0.0F);


        this.Metatarsals_r2 = new AdvancedModelRenderer(this);
        this.Metatarsals_r2.setRotationPoint(2.4977F, -15.7436F, 0.2981F);
        this.rightLeg3.addChild(Metatarsals_r2);
        this.setRotateAngle(Metatarsals_r2, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r2.cubeList.add(new ModelBox(Metatarsals_r2, 26, 62, -3.5F, 10.0767F, 10.2776F, 2, 5, 2, -0.002F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0977F, 2.9564F, -3.3019F);
        this.rightLeg3.addChild(rightLeg4);


        this.Pes_r2 = new AdvancedModelRenderer(this);
        this.Pes_r2.setRotationPoint(2.4F, -18.7F, 3.6F);
        this.rightLeg4.addChild(Pes_r2);
        this.setRotateAngle(Pes_r2, -0.576F, 0.0F, 0.0F);
        this.Pes_r2.cubeList.add(new ModelBox(Pes_r2, 0, 61, -4.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.hips.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 48, 0, -2.5F, -2.0F, -1.0F, 5, 7, 5, -0.008F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 36, -1.5F, -2.0F, -1.0F, 3, 4, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -1.0F, -2.0F, -1.0F, 2, 2, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, -1.4F, 12.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.0F, -0.5329F, -0.2497F, 1, 1, 16, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 25, 27, -2.9986F, -1.1489F, -7.0326F, 6, 8, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0014F, -1.1489F, -7.8326F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2531F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 0, -3.0F, 0.1389F, -0.2122F, 6, 2, 5, 0.12F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0014F, -1.1489F, -7.8326F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 9, -3.0F, 0.1389F, -0.2122F, 6, 7, 9, 0.1F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0014F, 0.8511F, -7.0326F);
        this.body.addChild(chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.0F, -5.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 44, -3.0F, -1.8526F, -0.8428F, 5, 4, 7, -0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -5.5F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4887F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 52, -3.5F, 0.0017F, 1.8523F, 6, 4, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1054F, -5.735F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7156F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 13, -2.5F, -0.017F, 0.1093F, 5, 4, 3, 0.1F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.0F, 0.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 50, -3.0F, 0.0F, -6.0F, 5, 4, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.6F, 3.7F, -4.4F);
        this.chest.addChild(leftArm);


        this.Humerus_r1 = new AdvancedModelRenderer(this);
        this.Humerus_r1.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.leftArm.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 35, 57, 0.0F, -0.3F, 0.3F, 1, 1, 5, 0.003F, false));
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 61, 35, 0.0F, -0.6F, 0.3F, 1, 1, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 2.7F, 3.5F);
        this.leftArm.addChild(leftArm2);


        this.Radio_Ulna_r1 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(0.0F, 0.1F, -0.2F);
        this.leftArm2.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 22, 26, 0.0F, -1.0662F, -3.8486F, 1, 1, 4, -0.001F, false));
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 63, 21, 0.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 2.7F, -3.0F);
        this.leftArm2.addChild(leftArm3);


        this.Manus_r1 = new AdvancedModelRenderer(this);
        this.Manus_r1.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.leftArm3.addChild(Manus_r1);
        this.setRotateAngle(Manus_r1, 0.8574F, 0.1855F, 0.21F);
        this.Manus_r1.cubeList.add(new ModelBox(Manus_r1, 46, 0, -1.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.6F, 3.7F, -4.4F);
        this.chest.addChild(rightArm);


        this.Humerus_r2 = new AdvancedModelRenderer(this);
        this.Humerus_r2.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.rightArm.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 35, 57, -1.0F, -0.3F, 0.3F, 1, 1, 5, 0.003F, true));
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 61, 35, -1.0F, -0.6F, 0.3F, 1, 1, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 2.7F, 3.5F);
        this.rightArm.addChild(rightArm2);


        this.Radio_Ulna_r2 = new AdvancedModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.0F, 0.1F, -0.2F);
        this.rightArm2.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 22, 26, -1.0F, -1.0662F, -3.8486F, 1, 1, 4, -0.001F, true));
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 63, 21, -1.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 2.7F, -3.0F);
        this.rightArm2.addChild(rightArm3);


        this.Manus_r2 = new AdvancedModelRenderer(this);
        this.Manus_r2.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.rightArm3.addChild(Manus_r2);
        this.setRotateAngle(Manus_r2, 0.8574F, -0.1855F, -0.21F);
        this.Manus_r2.cubeList.add(new ModelBox(Manus_r2, 46, 0, 0.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.1F, 1.4F, -5.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);


        this.CervicalDistal_r1 = new AdvancedModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -0.4F, 0.1F);
        this.neck.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.1222F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 45, 61, -1.6F, -0.9F, -3.0F, 3, 3, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9F, -2.6F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);


        this.mIliocostaliscapitis_r1 = new AdvancedModelRenderer(this);
        this.mIliocostaliscapitis_r1.setRotationPoint(-0.5F, 1.7F, -1.3F);
        this.neck2.addChild(mIliocostaliscapitis_r1);
        this.setRotateAngle(mIliocostaliscapitis_r1, -0.5585F, 0.0F, 0.0F);
        this.mIliocostaliscapitis_r1.cubeList.add(new ModelBox(mIliocostaliscapitis_r1, 35, 68, -0.6F, -0.9986F, -0.0364F, 2, 1, 1, -0.001F, false));

        this.CervicalProximal_r1 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.1F, -2.8971F, -2.6509F);
        this.neck2.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.3142F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 0, 40, -0.5F, 0.358F, 0.9475F, 1, 1, 2, 0.02F, false));

        this.CervicalProximal_r2 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r2.setRotationPoint(-0.1F, -2.8971F, -2.6509F);
        this.neck2.addChild(CervicalProximal_r2);
        this.setRotateAngle(CervicalProximal_r2, -0.2269F, 0.0F, 0.0F);
        this.CervicalProximal_r2.cubeList.add(new ModelBox(CervicalProximal_r2, 67, 27, -0.5F, -0.042F, 0.0475F, 1, 1, 2, 0.023F, false));

        this.mStermomandibularis_r1 = new AdvancedModelRenderer(this);
        this.mStermomandibularis_r1.setRotationPoint(-0.5F, -2.9F, -2.7F);
        this.neck2.addChild(mStermomandibularis_r1);
        this.setRotateAngle(mStermomandibularis_r1, -0.6283F, 0.0F, 0.0F);
        this.mStermomandibularis_r1.cubeList.add(new ModelBox(mStermomandibularis_r1, 58, 61, -0.6F, 1.9F, 0.1F, 2, 1, 4, -0.0001F, false));

        this.CervicalMedial_r1 = new AdvancedModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(0.0F, -0.5F, 0.7F);
        this.neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.6458F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 19, 8, -1.1F, 0.0568F, -4.0613F, 2, 2, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.2F, -2.7F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0175F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 48, 13, -1.1F, -0.6994F, -1.9183F, 2, 2, 2, -0.002F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 35, 64, -1.1F, 1.0006F, -1.9183F, 2, 1, 2, -0.003F, false));

        this.CervicalProximal_r3 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r3.setRotationPoint(-0.1F, -0.6994F, -1.9183F);
        this.neck3.addChild(CervicalProximal_r3);
        this.setRotateAngle(CervicalProximal_r3, 0.1222F, 0.0F, 0.0F);
        this.CervicalProximal_r3.cubeList.add(new ModelBox(CervicalProximal_r3, 0, 13, -1.0F, 0.1F, 1.0F, 2, 1, 1, 0.02F, false));

        this.CervicalProximal_r4 = new AdvancedModelRenderer(this);
        this.CervicalProximal_r4.setRotationPoint(-0.1F, -0.6994F, -1.9183F);
        this.neck3.addChild(CervicalProximal_r4);
        this.setRotateAngle(CervicalProximal_r4, 0.2531F, 0.0F, 0.0F);
        this.CervicalProximal_r4.cubeList.add(new ModelBox(CervicalProximal_r4, 67, 31, -1.0F, 0.0F, -0.1F, 2, 2, 1, 0.02F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.6F, 0.1F, -1.6F);
        this.neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0349F, 0.0F, 0.0F);


        this.Eye_r1 = new AdvancedModelRenderer(this);
        this.Eye_r1.setRotationPoint(0.0F, -0.8585F, 3.4145F);
        this.Head.addChild(Eye_r1);
        this.setRotateAngle(Eye_r1, 0.384F, 0.0F, 0.0F);
        this.Eye_r1.cubeList.add(new ModelBox(Eye_r1, 7, 68, -0.5F, -1.1627F, -5.9534F, 2, 1, 1, 0.009F, false));

        this.Premaxillary_r1 = new AdvancedModelRenderer(this);
        this.Premaxillary_r1.setRotationPoint(0.5F, 2.1212F, -4.2059F);
        this.Head.addChild(Premaxillary_r1);
        this.setRotateAngle(Premaxillary_r1, 0.6458F, 0.0F, 0.0F);
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 9, 26, -0.5F, -0.5712F, -0.5F, 1, 1, 1, 0.0F, false));

        this.NasalCrestDistal_r1 = new AdvancedModelRenderer(this);
        this.NasalCrestDistal_r1.setRotationPoint(0.5F, 1.1032F, -3.5972F);
        this.Head.addChild(NasalCrestDistal_r1);
        this.setRotateAngle(NasalCrestDistal_r1, 0.733F, 0.0F, 0.0F);
        this.NasalCrestDistal_r1.cubeList.add(new ModelBox(NasalCrestDistal_r1, 20, 35, -0.5F, -0.0431F, -0.0264F, 1, 1, 1, -0.002F, false));

        this.NasalCrestDistal_r2 = new AdvancedModelRenderer(this);
        this.NasalCrestDistal_r2.setRotationPoint(0.5F, 1.5032F, -4.2972F);
        this.Head.addChild(NasalCrestDistal_r2);
        this.setRotateAngle(NasalCrestDistal_r2, 0.5236F, 0.0F, 0.0F);
        this.NasalCrestDistal_r2.cubeList.add(new ModelBox(NasalCrestDistal_r2, 43, 5, -0.5F, -0.0395F, 0.0798F, 1, 1, 1, 0.0F, false));

        this.Squamosal_r1 = new AdvancedModelRenderer(this);
        this.Squamosal_r1.setRotationPoint(0.5F, -0.0231F, -2.5791F);
        this.Head.addChild(Squamosal_r1);
        this.setRotateAngle(Squamosal_r1, 0.8639F, 0.0F, 0.0F);
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 9, 29, -0.7F, -0.0322F, -0.9699F, 1, 1, 1, -0.0005F, false));
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 20, 38, -0.3F, -0.0322F, -0.9699F, 1, 1, 1, -0.0001F, false));

        this.Squamosal_r2 = new AdvancedModelRenderer(this);
        this.Squamosal_r2.setRotationPoint(0.5F, -0.0231F, -0.9791F);
        this.Head.addChild(Squamosal_r2);
        this.setRotateAngle(Squamosal_r2, 0.2967F, 0.0F, 0.0F);
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 55, 61, -1.0F, -0.5F, -1.5F, 2, 1, 1, -0.0002F, false));
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 64, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.0001F, false));

        this.Squamosal_r3 = new AdvancedModelRenderer(this);
        this.Squamosal_r3.setRotationPoint(0.5F, -0.363F, -1.54F);
        this.Head.addChild(Squamosal_r3);
        this.setRotateAngle(Squamosal_r3, 0.4363F, 0.0F, 0.0F);
        this.Squamosal_r3.cubeList.add(new ModelBox(Squamosal_r3, 0, 68, -1.0F, -0.0972F, 0.1558F, 2, 2, 1, 0.006F, false));

        this.Squamosal_r4 = new AdvancedModelRenderer(this);
        this.Squamosal_r4.setRotationPoint(0.5F, -0.1231F, -2.3791F);
        this.Head.addChild(Squamosal_r4);
        this.setRotateAngle(Squamosal_r4, 0.5585F, 0.0F, 0.0F);
        this.Squamosal_r4.cubeList.add(new ModelBox(Squamosal_r4, 7, 13, -1.0F, -0.0069F, -0.0054F, 2, 1, 1, 0.008F, false));

        this.Quadratojugal_r1 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r1.setRotationPoint(-0.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r1);
        this.setRotateAngle(Quadratojugal_r1, 0.6853F, -0.2813F, 0.07F);
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 0, 0, 0.096F, -0.6504F, 0.07F, 0, 1, 1, 0.0F, true));

        this.Quadratojugal_r2 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r2.setRotationPoint(-0.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r2);
        this.setRotateAngle(Quadratojugal_r2, 0.3054F, -0.2985F, 0.028F);
        this.Quadratojugal_r2.cubeList.add(new ModelBox(Quadratojugal_r2, 9, 18, 0.096F, -0.4559F, -0.0629F, 0, 1, 2, 0.0F, true));

        this.Quadratojugal_r3 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r3.setRotationPoint(-0.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r3);
        this.setRotateAngle(Quadratojugal_r3, -0.1252F, -0.3397F, 0.0101F);
        this.Quadratojugal_r3.cubeList.add(new ModelBox(Quadratojugal_r3, 19, 0, 0.096F, -0.2883F, -0.0078F, 0, 1, 2, 0.0F, true));

        this.Quadratojugal_r4 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r4.setRotationPoint(-0.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r4);
        this.setRotateAngle(Quadratojugal_r4, -0.6055F, -0.3484F, 0.0113F);
        this.Quadratojugal_r4.cubeList.add(new ModelBox(Quadratojugal_r4, 11, 0, 0.096F, -0.2883F, -0.0078F, 0, 1, 2, 0.0F, true));

        this.Quadratojugal_r5 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r5.setRotationPoint(1.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r5);
        this.setRotateAngle(Quadratojugal_r5, 0.6853F, 0.2813F, -0.07F);
        this.Quadratojugal_r5.cubeList.add(new ModelBox(Quadratojugal_r5, 0, 0, -0.096F, -0.6504F, 0.07F, 0, 1, 1, 0.0F, false));

        this.Quadratojugal_r6 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r6.setRotationPoint(1.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r6);
        this.setRotateAngle(Quadratojugal_r6, 0.3054F, 0.2985F, -0.028F);
        this.Quadratojugal_r6.cubeList.add(new ModelBox(Quadratojugal_r6, 9, 18, -0.096F, -0.4559F, -0.0629F, 0, 1, 2, 0.0F, false));

        this.Quadratojugal_r7 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r7.setRotationPoint(1.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r7);
        this.setRotateAngle(Quadratojugal_r7, -0.6055F, 0.3484F, -0.0113F);
        this.Quadratojugal_r7.cubeList.add(new ModelBox(Quadratojugal_r7, 11, 0, -0.096F, -0.2883F, -0.0078F, 0, 1, 2, 0.0F, false));

        this.Quadratojugal_r8 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r8.setRotationPoint(1.6F, 0.7924F, -1.4416F);
        this.Head.addChild(Quadratojugal_r8);
        this.setRotateAngle(Quadratojugal_r8, -0.1252F, 0.3397F, -0.0101F);
        this.Quadratojugal_r8.cubeList.add(new ModelBox(Quadratojugal_r8, 19, 0, -0.096F, -0.2883F, -0.0078F, 0, 1, 2, 0.0F, false));

        this.Quadratojugal_r9 = new AdvancedModelRenderer(this);
        this.Quadratojugal_r9.setRotationPoint(0.5F, 1.6439F, -2.2814F);
        this.Head.addChild(Quadratojugal_r9);
        this.setRotateAngle(Quadratojugal_r9, 0.2269F, 0.0F, 0.0F);
        this.Quadratojugal_r9.cubeList.add(new ModelBox(Quadratojugal_r9, 63, 49, -1.0F, -1.0037F, 0.6447F, 2, 1, 2, 0.001F, false));
        this.Quadratojugal_r9.cubeList.add(new ModelBox(Quadratojugal_r9, 17, 52, -1.0F, -1.0037F, 0.0447F, 2, 1, 2, 0.0F, false));

        this.Teeth_r1 = new AdvancedModelRenderer(this);
        this.Teeth_r1.setRotationPoint(0.1F, 1.4415F, 1.1145F);
        this.Head.addChild(Teeth_r1);
        this.setRotateAngle(Teeth_r1, 0.4717F, -0.0478F, -0.0213F);
        this.Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 27, 44, -0.1734F, -2.1395F, -5.1937F, 0, 1, 3, 0.0001F, true));

        this.Teeth_r2 = new AdvancedModelRenderer(this);
        this.Teeth_r2.setRotationPoint(0.9F, 1.4415F, 1.1145F);
        this.Head.addChild(Teeth_r2);
        this.setRotateAngle(Teeth_r2, 0.4717F, 0.0478F, 0.0213F);
        this.Teeth_r2.cubeList.add(new ModelBox(Teeth_r2, 27, 44, 0.1734F, -2.1395F, -5.1937F, 0, 1, 3, 0.0001F, false));

        this.Palate_r1 = new AdvancedModelRenderer(this);
        this.Palate_r1.setRotationPoint(0.0F, 0.5415F, 1.1145F);
        this.Head.addChild(Palate_r1);
        this.setRotateAngle(Palate_r1, 0.4189F, 0.0F, 0.0F);
        this.Palate_r1.cubeList.add(new ModelBox(Palate_r1, 63, 67, 0.0F, -1.3455F, -5.3236F, 1, 1, 2, 0.0001F, false));

        this.HeadslopeL = new AdvancedModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL);


        this.AntiorbitalAirSinus_r1 = new AdvancedModelRenderer(this);
        this.AntiorbitalAirSinus_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r1);
        this.setRotateAngle(AntiorbitalAirSinus_r1, 0.4271F, 0.1911F, 0.0862F);
        this.AntiorbitalAirSinus_r1.cubeList.add(new ModelBox(AntiorbitalAirSinus_r1, 67, 59, 0.086F, -1.3455F, -5.2094F, 1, 1, 2, -0.0001F, false));

        this.HeadslopeL2 = new AdvancedModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(0.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL2);


        this.AntiorbitalAirSinus_r2 = new AdvancedModelRenderer(this);
        this.AntiorbitalAirSinus_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeL2.addChild(AntiorbitalAirSinus_r2);
        this.setRotateAngle(AntiorbitalAirSinus_r2, 0.4271F, -0.1911F, -0.0862F);
        this.AntiorbitalAirSinus_r2.cubeList.add(new ModelBox(AntiorbitalAirSinus_r2, 67, 59, -1.086F, -1.3455F, -5.2094F, 1, 1, 2, -0.0001F, true));

        this.BrowL = new AdvancedModelRenderer(this);
        this.BrowL.setRotationPoint(1.0147F, 0.5239F, -2.5201F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Crestpostorbital_r1 = new AdvancedModelRenderer(this);
        this.Crestpostorbital_r1.setRotationPoint(0.4853F, -1.8824F, 5.5347F);
        this.BrowL.addChild(Crestpostorbital_r1);
        this.setRotateAngle(Crestpostorbital_r1, 0.3423F, -0.0986F, 0.1059F);
        this.Crestpostorbital_r1.cubeList.add(new ModelBox(Crestpostorbital_r1, 29, 8, -1.2836F, -0.5869F, -5.297F, 1, 1, 1, -0.03F, false));

        this.Crest_r1 = new AdvancedModelRenderer(this);
        this.Crest_r1.setRotationPoint(0.4035F, 0.5983F, 0.198F);
        this.BrowL.addChild(Crest_r1);
        this.setRotateAngle(Crest_r1, 0.8918F, 0.1659F, 0.4239F);
        this.Crest_r1.cubeList.add(new ModelBox(Crest_r1, 0, 61, -1.0574F, -0.7315F, -0.8482F, 1, 1, 1, -0.03F, false));

        this.Crest_r2 = new AdvancedModelRenderer(this);
        this.Crest_r2.setRotationPoint(0.4853F, -1.7824F, 5.3347F);
        this.BrowL.addChild(Crest_r2);
        this.setRotateAngle(Crest_r2, 0.7246F, -0.1044F, 0.1225F);
        this.Crest_r2.cubeList.add(new ModelBox(Crest_r2, 12, 61, -1.2843F, -2.4556F, -5.4626F, 1, 1, 1, -0.03F, false));

        this.BrowL2 = new AdvancedModelRenderer(this);
        this.BrowL2.setRotationPoint(-0.0147F, 0.5239F, -2.5201F);
        this.Head.addChild(BrowL2);
        this.setRotateAngle(BrowL2, -0.0698F, 0.0F, 0.0F);


        this.Crestpostorbital_r2 = new AdvancedModelRenderer(this);
        this.Crestpostorbital_r2.setRotationPoint(-0.4853F, -1.8824F, 5.5347F);
        this.BrowL2.addChild(Crestpostorbital_r2);
        this.setRotateAngle(Crestpostorbital_r2, 0.3423F, 0.0986F, -0.1059F);
        this.Crestpostorbital_r2.cubeList.add(new ModelBox(Crestpostorbital_r2, 29, 8, 0.2836F, -0.5869F, -5.297F, 1, 1, 1, -0.03F, true));

        this.Crest_r3 = new AdvancedModelRenderer(this);
        this.Crest_r3.setRotationPoint(-0.4035F, 0.5983F, 0.198F);
        this.BrowL2.addChild(Crest_r3);
        this.setRotateAngle(Crest_r3, 0.8918F, -0.1659F, -0.4239F);
        this.Crest_r3.cubeList.add(new ModelBox(Crest_r3, 0, 61, 0.0574F, -0.7315F, -0.8482F, 1, 1, 1, -0.03F, true));

        this.Crest_r4 = new AdvancedModelRenderer(this);
        this.Crest_r4.setRotationPoint(-0.4853F, -1.7824F, 5.3347F);
        this.BrowL2.addChild(Crest_r4);
        this.setRotateAngle(Crest_r4, 0.7246F, 0.1044F, -0.1225F);
        this.Crest_r4.cubeList.add(new ModelBox(Crest_r4, 12, 61, 0.2843F, -2.4556F, -5.4626F, 1, 1, 1, -0.03F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.7415F, -0.0855F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.4712F, 0.0F, 0.0F);


        this.Predentary_r1 = new AdvancedModelRenderer(this);
        this.Predentary_r1.setRotationPoint(0.5F, 3.1896F, -2.9453F);
        this.Jaw.addChild(Predentary_r1);
        this.setRotateAngle(Predentary_r1, 0.5236F, 0.0F, 0.0F);
        this.Predentary_r1.cubeList.add(new ModelBox(Predentary_r1, 61, 35, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.02F, false));

        this.Digastricmuscles_r1 = new AdvancedModelRenderer(this);
        this.Digastricmuscles_r1.setRotationPoint(0.0F, -1.7587F, 2.599F);
        this.Jaw.addChild(Digastricmuscles_r1);
        this.setRotateAngle(Digastricmuscles_r1, 0.7418F, 0.0F, 0.0F);
        this.Digastricmuscles_r1.cubeList.add(new ModelBox(Digastricmuscles_r1, 37, 0, 0.0F, -0.3986F, -7.2191F, 1, 1, 3, -0.002F, false));

        this.Angular_r1 = new AdvancedModelRenderer(this);
        this.Angular_r1.setRotationPoint(0.0F, -1.8587F, 3.599F);
        this.Jaw.addChild(Angular_r1);
        this.setRotateAngle(Angular_r1, 0.6807F, 0.0F, 0.0F);
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 63, 53, -0.5F, -0.6095F, -6.2849F, 2, 1, 1, -0.002F, false));

        this.Teeth_r3 = new AdvancedModelRenderer(this);
        this.Teeth_r3.setRotationPoint(0.0F, -0.7587F, 1.299F);
        this.Jaw.addChild(Teeth_r3);
        this.setRotateAngle(Teeth_r3, 0.7517F, -0.051F, -0.0477F);
        this.Teeth_r3.cubeList.add(new ModelBox(Teeth_r3, 0, 35, -0.2695F, -0.5157F, -5.3091F, 0, 1, 3, -0.001F, true));

        this.Teeth_r4 = new AdvancedModelRenderer(this);
        this.Teeth_r4.setRotationPoint(1.0F, -0.7587F, 1.299F);
        this.Jaw.addChild(Teeth_r4);
        this.setRotateAngle(Teeth_r4, 0.7517F, 0.051F, 0.0477F);
        this.Teeth_r4.cubeList.add(new ModelBox(Teeth_r4, 0, 35, 0.2695F, -0.5157F, -5.3091F, 0, 1, 3, -0.001F, false));

        this.Surangular_r1 = new AdvancedModelRenderer(this);
        this.Surangular_r1.setRotationPoint(0.0F, -2.9587F, 3.999F);
        this.Jaw.addChild(Surangular_r1);
        this.setRotateAngle(Surangular_r1, 0.7505F, 0.0F, 0.0F);
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 57, 21, -0.5F, -0.4481F, -6.6971F, 2, 1, 2, -0.001F, false));

        this.JawslopeL = new AdvancedModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL);


        this.Dentary_r1 = new AdvancedModelRenderer(this);
        this.Dentary_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawslopeL.addChild(Dentary_r1);
        this.setRotateAngle(Dentary_r1, 0.751F, 0.1411F, 0.1306F);
        this.Dentary_r1.cubeList.add(new ModelBox(Dentary_r1, 56, 67, 0.0113F, -1.1177F, -5.2421F, 1, 1, 2, -0.03F, false));

        this.JawslopeL2 = new AdvancedModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL2);


        this.Dentary_r2 = new AdvancedModelRenderer(this);
        this.Dentary_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawslopeL2.addChild(Dentary_r2);
        this.setRotateAngle(Dentary_r2, 0.751F, -0.1411F, -0.1306F);
        this.Dentary_r2.cubeList.add(new ModelBox(Dentary_r2, 56, 67, -1.0113F, -1.1177F, -5.2421F, 1, 1, 2, -0.03F, true));

        this.MasseterL = new AdvancedModelRenderer(this);
        this.MasseterL.setRotationPoint(1.3F, -1.7587F, 2.399F);
        this.Jaw.addChild(MasseterL);


        this.Massetersuperficialisinside_r1 = new AdvancedModelRenderer(this);
        this.Massetersuperficialisinside_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MasseterL.addChild(Massetersuperficialisinside_r1);
        this.setRotateAngle(Massetersuperficialisinside_r1, 0.6538F, 0.0319F, -0.0416F);
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 19, 8, -0.0184F, -0.7171F, -5.4062F, 0, 1, 2, 0.0F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 40, 6, -0.0184F, -0.1171F, -5.4062F, 0, 0, 2, -0.001F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 9, 22, -0.0084F, -0.7171F, -5.4062F, 0, 1, 2, 0.0F, false));
        this.Massetersuperficialisinside_r1.cubeList.add(new ModelBox(Massetersuperficialisinside_r1, 20, 41, -0.0084F, -0.1171F, -5.4062F, 0, 0, 2, -0.001F, false));

        this.MasseterL2 = new AdvancedModelRenderer(this);
        this.MasseterL2.setRotationPoint(-0.3F, -1.7587F, 2.399F);
        this.Jaw.addChild(MasseterL2);


        this.Massetersuperficialisinside_r2 = new AdvancedModelRenderer(this);
        this.Massetersuperficialisinside_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MasseterL2.addChild(Massetersuperficialisinside_r2);
        this.setRotateAngle(Massetersuperficialisinside_r2, 0.6538F, -0.0319F, 0.0416F);
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 19, 8, 0.0184F, -0.7171F, -5.4062F, 0, 1, 2, 0.0F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 40, 6, 0.0184F, -0.1171F, -5.4062F, 0, 0, 2, -0.001F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 9, 22, 0.0084F, -0.7171F, -5.4062F, 0, 1, 2, 0.0F, true));
        this.Massetersuperficialisinside_r2.cubeList.add(new ModelBox(Massetersuperficialisinside_r2, 20, 41, 0.0084F, -0.1171F, -5.4062F, 0, 0, 2, -0.001F, true));

        this.MasseterR = new AdvancedModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -1.7587F, 2.399F);
        this.Jaw.addChild(MasseterR);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
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
        this.hips.offsetY = -1.20F;
        this.hips.offsetX = 0.15F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(-3);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 1.7F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.Head};
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

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 31) {
            xx = -12.5 + (((tickAnim - 6) / 25) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 6) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 25) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = -12.5 + (((tickAnim - 31) / 8) * (-11.7-(-12.5)));
            yy = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 8) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -11.7 + (((tickAnim - 39) / 10) * (-12.5-(-11.7)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = -12.5 + (((tickAnim - 49) / 21) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 70) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 6) / 25) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 6) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 25) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 13.5 + (((tickAnim - 31) / 8) * (12.75-(13.5)));
            yy = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 8) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 12.75 + (((tickAnim - 39) / 10) * (13.5-(12.75)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 13.5 + (((tickAnim - 49) / 21) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 13.5 + (((tickAnim - 70) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 31) {
            xx = 13 + (((tickAnim - 6) / 25) * (13-(13)));
            yy = 0 + (((tickAnim - 6) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 25) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 13 + (((tickAnim - 31) / 8) * (12-(13)));
            yy = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 8) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 12 + (((tickAnim - 39) / 10) * (13-(12)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 13 + (((tickAnim - 49) / 21) * (13-(13)));
            yy = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 13 + (((tickAnim - 70) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+150))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+150))*15 + (((tickAnim - 6) / 33) * (-5.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*10-(1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+150))*15)));
            yy = 0 + (((tickAnim - 6) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 33) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -5.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*10 + (((tickAnim - 39) / 10) * (-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*8-(-5.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*10)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = -8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*8 + (((tickAnim - 49) / 21) * (-10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*5-(-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*8)));
            yy = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*5 + (((tickAnim - 70) / 10) * (0-(-10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 6) / 33) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 33) * (-0.225-(-0.275)));
            zz = 0 + (((tickAnim - 6) / 33) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 39) / 10) * (-0.25-(-0.225)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            yy = -0.25 + (((tickAnim - 49) / 21) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 70) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = -11.25 + (((tickAnim - 6) / 33) * (-0.25-(-11.25)));
            yy = 0 + (((tickAnim - 6) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 33) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 70) {
            xx = -0.25 + (((tickAnim - 39) / 31) * (-1-(-0.25)));
            yy = 0 + (((tickAnim - 39) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 31) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -1 + (((tickAnim - 70) / 10) * (0-(-1)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 6) / 33) * (0-(0)));
            yy = -0.3 + (((tickAnim - 6) / 33) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 6) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 6.25 + (((tickAnim - 6) / 10) * (0.94-(6.25)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 39) {
            xx = 0.94 + (((tickAnim - 16) / 23) * (7.75-(0.94)));
            yy = 0 + (((tickAnim - 16) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 23) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 7.75 + (((tickAnim - 39) / 10) * (3-(7.75)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 3 + (((tickAnim - 49) / 21) * (-4.75-(3)));
            yy = 0 + (((tickAnim - 49) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 21) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = -4.75 + (((tickAnim - 70) / 4) * (-8.35-(-4.75)));
            yy = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 4) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -8.35 + (((tickAnim - 74) / 6) * (0-(-8.35)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 26.75 + (((tickAnim - 6) / 10) * (15.11-(26.75)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 15.11 + (((tickAnim - 16) / 8) * (-2.08-(15.11)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = -2.08 + (((tickAnim - 24) / 15) * (19.5-(-2.08)));
            yy = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 15) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 70) {
            xx = 19.5 + (((tickAnim - 39) / 31) * (8-(19.5)));
            yy = 0 + (((tickAnim - 39) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 31) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 8 + (((tickAnim - 70) / 4) * (-5.38-(8)));
            yy = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 4) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -5.38 + (((tickAnim - 74) / 6) * (0-(-5.38)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 6) / 25) * (-1-(0)));
            yy = 0 + (((tickAnim - 6) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 25) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = -1 + (((tickAnim - 31) / 8) * (7.5-(-1)));
            yy = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 8) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 7.5 + (((tickAnim - 39) / 10) * (-12.62032-(7.5)));
            yy = 0 + (((tickAnim - 39) / 10) * (-3.0929-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (-0.13266-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = -12.62032 + (((tickAnim - 49) / 21) * (-14.24245-(-12.62032)));
            yy = -3.0929 + (((tickAnim - 49) / 21) * (-3.28303-(-3.0929)));
            zz = -0.13266 + (((tickAnim - 49) / 21) * (0.09791-(-0.13266)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -14.24245 + (((tickAnim - 70) / 10) * (0-(-14.24245)));
            yy = -3.28303 + (((tickAnim - 70) / 10) * (0-(-3.28303)));
            zz = 0.09791 + (((tickAnim - 70) / 10) * (0-(0.09791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 31) {
            xx = 3 + (((tickAnim - 6) / 25) * (4.75-(3)));
            yy = 0 + (((tickAnim - 6) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 25) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 49) {
            xx = 4.75 + (((tickAnim - 31) / 18) * (16.28302-(4.75)));
            yy = 0 + (((tickAnim - 31) / 18) * (-3.59999-(0)));
            zz = 0 + (((tickAnim - 31) / 18) * (-1.05074-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 16.28302 + (((tickAnim - 49) / 21) * (17.78302-(16.28302)));
            yy = -3.59999 + (((tickAnim - 49) / 21) * (-3.59999-(-3.59999)));
            zz = -1.05074 + (((tickAnim - 49) / 21) * (-1.05074-(-1.05074)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 17.78302 + (((tickAnim - 70) / 10) * (0-(17.78302)));
            yy = -3.59999 + (((tickAnim - 70) / 10) * (0-(-3.59999)));
            zz = -1.05074 + (((tickAnim - 70) / 10) * (0-(-1.05074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.79702-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.00743-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.79117-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 30.79702 + (((tickAnim - 6) / 33) * (19.04702-(30.79702)));
            yy = 3.00743 + (((tickAnim - 6) / 33) * (3.00743-(3.00743)));
            zz = 1.79117 + (((tickAnim - 6) / 33) * (1.79117-(1.79117)));
        }
        else if (tickAnim >= 39 && tickAnim < 70) {
            xx = 19.04702 + (((tickAnim - 39) / 31) * (19.04702-(19.04702)));
            yy = 3.00743 + (((tickAnim - 39) / 31) * (3.00743-(3.00743)));
            zz = 1.79117 + (((tickAnim - 39) / 31) * (1.79117-(1.79117)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 19.04702 + (((tickAnim - 70) / 10) * (0-(19.04702)));
            yy = 3.00743 + (((tickAnim - 70) / 10) * (0-(3.00743)));
            zz = 1.79117 + (((tickAnim - 70) / 10) * (0-(1.79117)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (39.83699-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.45833-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-2.88098-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 39.83699 + (((tickAnim - 6) / 33) * (25.83699-(39.83699)));
            yy = -3.45833 + (((tickAnim - 6) / 33) * (-3.45833-(-3.45833)));
            zz = -2.88098 + (((tickAnim - 6) / 33) * (-2.88098-(-2.88098)));
        }
        else if (tickAnim >= 39 && tickAnim < 70) {
            xx = 25.83699 + (((tickAnim - 39) / 31) * (25.83699-(25.83699)));
            yy = -3.45833 + (((tickAnim - 39) / 31) * (-3.45833-(-3.45833)));
            zz = -2.88098 + (((tickAnim - 39) / 31) * (-2.88098-(-2.88098)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 25.83699 + (((tickAnim - 70) / 10) * (0-(25.83699)));
            yy = -3.45833 + (((tickAnim - 70) / 10) * (0-(-3.45833)));
            zz = -2.88098 + (((tickAnim - 70) / 10) * (0-(-2.88098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12.36318-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (13.99181-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.82863-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -12.36318 + (((tickAnim - 3) / 4) * (-20.70637-(-12.36318)));
            yy = 13.99181 + (((tickAnim - 3) / 4) * (16.11526-(13.99181)));
            zz = 3.82863 + (((tickAnim - 3) / 4) * (2.84766-(3.82863)));
        }
        else if (tickAnim >= 7 && tickAnim < 31) {
            xx = -20.70637 + (((tickAnim - 7) / 24) * (-20.70637-(-20.70637)));
            yy = 16.11526 + (((tickAnim - 7) / 24) * (16.11526-(16.11526)));
            zz = 2.84766 + (((tickAnim - 7) / 24) * (2.84766-(2.84766)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = -20.70637 + (((tickAnim - 31) / 8) * (17.09057-(-20.70637)));
            yy = 16.11526 + (((tickAnim - 31) / 8) * (-0.70071-(16.11526)));
            zz = 2.84766 + (((tickAnim - 31) / 8) * (-9.75451-(2.84766)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 17.09057 + (((tickAnim - 39) / 10) * (-17.4937-(17.09057)));
            yy = -0.70071 + (((tickAnim - 39) / 10) * (-8.45813-(-0.70071)));
            zz = -9.75451 + (((tickAnim - 39) / 10) * (-3.99329-(-9.75451)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = -17.4937 + (((tickAnim - 49) / 21) * (-17.4937-(-17.4937)));
            yy = -8.45813 + (((tickAnim - 49) / 21) * (-8.45813-(-8.45813)));
            zz = -3.99329 + (((tickAnim - 49) / 21) * (-3.99329-(-3.99329)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -17.4937 + (((tickAnim - 70) / 10) * (0-(-17.4937)));
            yy = -8.45813 + (((tickAnim - 70) / 10) * (0-(-8.45813)));
            zz = -3.99329 + (((tickAnim - 70) / 10) * (0-(-3.99329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 3) / 4) * (3.96734-(-4)));
            yy = 0 + (((tickAnim - 3) / 4) * (15.07861-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (10.36564-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 3.96734 + (((tickAnim - 7) / 1) * (3.84859-(3.96734)));
            yy = 15.07861 + (((tickAnim - 7) / 1) * (15.80015-(15.07861)));
            zz = 10.36564 + (((tickAnim - 7) / 1) * (10.86165-(10.36564)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.84859 + (((tickAnim - 8) / 2) * (3.96734-(3.84859)));
            yy = 15.80015 + (((tickAnim - 8) / 2) * (15.07861-(15.80015)));
            zz = 10.86165 + (((tickAnim - 8) / 2) * (10.36564-(10.86165)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.96734 + (((tickAnim - 10) / 2) * (3.84859-(3.96734)));
            yy = 15.07861 + (((tickAnim - 10) / 2) * (15.80015-(15.07861)));
            zz = 10.36564 + (((tickAnim - 10) / 2) * (10.86165-(10.36564)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 3.84859 + (((tickAnim - 12) / 1) * (3.96734-(3.84859)));
            yy = 15.80015 + (((tickAnim - 12) / 1) * (15.07861-(15.80015)));
            zz = 10.86165 + (((tickAnim - 12) / 1) * (10.36564-(10.86165)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 3.96734 + (((tickAnim - 13) / 2) * (3.84859-(3.96734)));
            yy = 15.07861 + (((tickAnim - 13) / 2) * (15.80015-(15.07861)));
            zz = 10.36564 + (((tickAnim - 13) / 2) * (10.86165-(10.36564)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 3.84859 + (((tickAnim - 15) / 16) * (3.96734-(3.84859)));
            yy = 15.80015 + (((tickAnim - 15) / 16) * (15.07861-(15.80015)));
            zz = 10.86165 + (((tickAnim - 15) / 16) * (10.36564-(10.86165)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 3.96734 + (((tickAnim - 31) / 8) * (-6.30725-(3.96734)));
            yy = 15.07861 + (((tickAnim - 31) / 8) * (-6.48149-(15.07861)));
            zz = 10.36564 + (((tickAnim - 31) / 8) * (2.2915-(10.36564)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -6.30725 + (((tickAnim - 39) / 10) * (-5.5803-(-6.30725)));
            yy = -6.48149 + (((tickAnim - 39) / 10) * (-15.83717-(-6.48149)));
            zz = 2.2915 + (((tickAnim - 39) / 10) * (-4.15628-(2.2915)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = -5.5803 + (((tickAnim - 49) / 21) * (-5.5803-(-5.5803)));
            yy = -15.83717 + (((tickAnim - 49) / 21) * (-15.83717-(-15.83717)));
            zz = -4.15628 + (((tickAnim - 49) / 21) * (-4.15628-(-4.15628)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5.5803 + (((tickAnim - 70) / 10) * (0-(-5.5803)));
            yy = -15.83717 + (((tickAnim - 70) / 10) * (0-(-15.83717)));
            zz = -4.15628 + (((tickAnim - 70) / 10) * (0-(-4.15628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 7) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 24) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 26.25 + (((tickAnim - 3) / 4) * (26.31092-(26.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (3.84329-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (1.81564-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 31) {
            xx = 26.31092 + (((tickAnim - 7) / 24) * (26.31092-(26.31092)));
            yy = 3.84329 + (((tickAnim - 7) / 24) * (3.84329-(3.84329)));
            zz = 1.81564 + (((tickAnim - 7) / 24) * (1.81564-(1.81564)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 26.31092 + (((tickAnim - 31) / 9) * (8.16665-(26.31092)));
            yy = 3.84329 + (((tickAnim - 31) / 9) * (-10.54627-(3.84329)));
            zz = 1.81564 + (((tickAnim - 31) / 9) * (0.02161-(1.81564)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 8.16665 + (((tickAnim - 40) / 4) * (3.73223-(8.16665)));
            yy = -10.54627 + (((tickAnim - 40) / 4) * (-4.00556-(-10.54627)));
            zz = 0.02161 + (((tickAnim - 40) / 4) * (0.83708-(0.02161)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 3.73223 + (((tickAnim - 44) / 5) * (27.56092-(3.73223)));
            yy = -4.00556 + (((tickAnim - 44) / 5) * (3.84329-(-4.00556)));
            zz = 0.83708 + (((tickAnim - 44) / 5) * (1.81564-(0.83708)));
        }
        else if (tickAnim >= 49 && tickAnim < 70) {
            xx = 27.56092 + (((tickAnim - 49) / 21) * (27.56092-(27.56092)));
            yy = 3.84329 + (((tickAnim - 49) / 21) * (3.84329-(3.84329)));
            zz = 1.81564 + (((tickAnim - 49) / 21) * (1.81564-(1.81564)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 27.56092 + (((tickAnim - 70) / 10) * (0-(27.56092)));
            yy = 3.84329 + (((tickAnim - 70) / 10) * (0-(3.84329)));
            zz = 1.81564 + (((tickAnim - 70) / 10) * (0-(1.81564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.25 + (((tickAnim - 7) / 1) * (-2.98-(0.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.98 + (((tickAnim - 8) / 2) * (0.25-(-2.98)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0.25 + (((tickAnim - 10) / 2) * (-2.98-(0.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.98 + (((tickAnim - 12) / 1) * (0.25-(-2.98)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 13) / 2) * (-2.98-(0.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -2.98 + (((tickAnim - 15) / 2) * (0.25-(-2.98)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0.25 + (((tickAnim - 17) / 4) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 21) / 4) * (1.06551-(0.25)));
            yy = 0 + (((tickAnim - 21) / 4) * (10.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (5.03773-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 1.06551 + (((tickAnim - 25) / 2) * (1.06551-(1.06551)));
            yy = 10.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 25) / 2) * (9.36983-(10.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 5.03773 + (((tickAnim - 25) / 2) * (5.03773-(5.03773)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 1.06551 + (((tickAnim - 27) / 4) * (1.06551-(1.06551)));
            yy = 9.36983 + (((tickAnim - 27) / 4) * (9.11983-(9.36983)));
            zz = 5.03773 + (((tickAnim - 27) / 4) * (5.03773-(5.03773)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 1.06551 + (((tickAnim - 31) / 4) * (0.14771-(1.06551)));
            yy = 9.11983 + (((tickAnim - 31) / 4) * (-18.3774-(9.11983)));
            zz = 5.03773 + (((tickAnim - 31) / 4) * (0.58491-(5.03773)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.14771 + (((tickAnim - 35) / 5) * (0.21876-(0.14771)));
            yy = -18.3774 + (((tickAnim - 35) / 5) * (-10.74493-(-18.3774)));
            zz = 0.58491 + (((tickAnim - 35) / 5) * (0.33219-(0.58491)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.21876 + (((tickAnim - 40) / 5) * (-4.53124-(0.21876)));
            yy = -10.74493 + (((tickAnim - 40) / 5) * (-10.74493-(-10.74493)));
            zz = 0.33219 + (((tickAnim - 40) / 5) * (0.33219-(0.33219)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -4.53124 + (((tickAnim - 45) / 4) * (5.25-(-4.53124)));
            yy = -10.74493 + (((tickAnim - 45) / 4) * (0-(-10.74493)));
            zz = 0.33219 + (((tickAnim - 45) / 4) * (0-(0.33219)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 5.25 + (((tickAnim - 49) / 2) * (3.75-(5.25)));
            yy = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 3.75 + (((tickAnim - 51) / 2) * (5.25-(3.75)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 5.25 + (((tickAnim - 53) / 1) * (3.75-(5.25)));
            yy = 0 + (((tickAnim - 53) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 1) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = 3.75 + (((tickAnim - 54) / 2) * (5.25-(3.75)));
            yy = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 2) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 5.25 + (((tickAnim - 56) / 14) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 56) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 14) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5.25 + (((tickAnim - 70) / 10) * (0-(5.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-5 + (((tickAnim - 11) / 4) * (1-(0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 15) / 6) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 21) / 9) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 3.25 + (((tickAnim - 11) / 4) * (12-(3.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 15) / 6) * (6-(12)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 21) / 9) * (0-(6)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (41.05297-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.64078-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (2.29783-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 41.05297 + (((tickAnim - 11) / 4) * (38.29848-(41.05297)));
            yy = 2.64078 + (((tickAnim - 11) / 4) * (2.82798-(2.64078)));
            zz = 2.29783 + (((tickAnim - 11) / 4) * (2.46073-(2.29783)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 38.29848 + (((tickAnim - 15) / 6) * (17.30297-(38.29848)));
            yy = 2.82798 + (((tickAnim - 15) / 6) * (2.64078-(2.82798)));
            zz = 2.46073 + (((tickAnim - 15) / 6) * (2.29783-(2.46073)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 17.30297 + (((tickAnim - 21) / 9) * (0-(17.30297)));
            yy = 2.64078 + (((tickAnim - 21) / 9) * (0-(2.64078)));
            zz = 2.29783 + (((tickAnim - 21) / 9) * (0-(2.29783)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (42.84827-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-3.48619-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-3.22829-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 42.84827 + (((tickAnim - 11) / 4) * (32.6464-(42.84827)));
            yy = -3.48619 + (((tickAnim - 11) / 4) * (-3.73333-(-3.48619)));
            zz = -3.22829 + (((tickAnim - 11) / 4) * (-3.45715-(-3.22829)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 32.6464 + (((tickAnim - 15) / 6) * (-13.90173-(32.6464)));
            yy = -3.73333 + (((tickAnim - 15) / 6) * (-3.48619-(-3.73333)));
            zz = -3.45715 + (((tickAnim - 15) / 6) * (-3.22829-(-3.45715)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -13.90173 + (((tickAnim - 21) / 9) * (0-(-13.90173)));
            yy = -3.48619 + (((tickAnim - 21) / 9) * (0-(-3.48619)));
            zz = -3.22829 + (((tickAnim - 21) / 9) * (0-(-3.22829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -12.75 + (((tickAnim - 11) / 4) * (9.5-(-12.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 9.5 + (((tickAnim - 15) / 6) * (-12.75-(9.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -12.75 + (((tickAnim - 21) / 9) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 11) / 4) * (-2-(-6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -2 + (((tickAnim - 15) / 6) * (-6.75-(-2)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 21) / 9) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.75 + (((tickAnim - 11) / 4) * (-22-(1.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -22 + (((tickAnim - 15) / 6) * (5.5-(-22)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 5.5 + (((tickAnim - 21) / 9) * (0-(5.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 15) / 15) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 11) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (27.25-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 27.25 + (((tickAnim - 21) / 3) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 27.25 + (((tickAnim - 24) / 6) * (0-(27.25)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12 + (((tickAnim - 13) / 7) * (31.25-(-12)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.25 + (((tickAnim - 20) / 10) * (-12-(31.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 30) / 10) * (31.25-(-12)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 31.25 + (((tickAnim - 40) / 10) * (0-(31.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 13) / 7) * (14.5-(-17.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14.5 + (((tickAnim - 20) / 5) * (-26.37-(14.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -26.37 + (((tickAnim - 25) / 5) * (-17.25-(-26.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.25 + (((tickAnim - 30) / 10) * (14.5-(-17.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 40) / 10) * (0-(14.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 6) * (0-(0.475)));
            zz = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (1.25-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 25) / 5) * (0-(1.25)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -33.5 + (((tickAnim - 7) / 6) * (0-(-33.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (12.25-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.25 + (((tickAnim - 20) / 5) * (-38.75-(12.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -38.75 + (((tickAnim - 25) / 5) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 12.25 + (((tickAnim - 40) / 5) * (-32.37-(12.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -32.37 + (((tickAnim - 45) / 5) * (0-(-32.37)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (69.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 69.75 + (((tickAnim - 7) / 6) * (30-(69.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 13) / 3) * (-9.72-(30)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -9.72 + (((tickAnim - 16) / 4) * (56.5-(-9.72)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 56.5 + (((tickAnim - 20) / 5) * (81.75-(56.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 81.75 + (((tickAnim - 25) / 5) * (30-(81.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 30) / 5) * (0.75-(30)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.75 + (((tickAnim - 35) / 5) * (56.5-(0.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 56.5 + (((tickAnim - 40) / 5) * (76.75-(56.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 76.75 + (((tickAnim - 45) / 5) * (0-(76.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 1.15 + (((tickAnim - 7) / 6) * (0.35-(1.15)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 3) * (0-(0.35)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (1.125-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 5) * (1.465-(1.125)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.465 + (((tickAnim - 25) / 5) * (0.35-(1.465)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 30) / 10) * (1.125-(0.35)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 5) * (1.76-(1.125)));
            zz = 0 + (((tickAnim - 40) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.76 + (((tickAnim - 45) / 5) * (0-(1.76)));
            zz = 0.45 + (((tickAnim - 45) / 5) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.75205-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.23545-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.19018-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.75205 + (((tickAnim - 13) / 7) * (2.04711-(3.75205)));
            yy = -1.23545 + (((tickAnim - 13) / 7) * (-0.85402-(-1.23545)));
            zz = -0.19018 + (((tickAnim - 13) / 7) * (-2.66133-(-0.19018)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.04711 + (((tickAnim - 20) / 10) * (3.75205-(2.04711)));
            yy = -0.85402 + (((tickAnim - 20) / 10) * (-1.23545-(-0.85402)));
            zz = -2.66133 + (((tickAnim - 20) / 10) * (-0.19018-(-2.66133)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.75205 + (((tickAnim - 30) / 10) * (2.04711-(3.75205)));
            yy = -1.23545 + (((tickAnim - 30) / 10) * (-0.85402-(-1.23545)));
            zz = -0.19018 + (((tickAnim - 30) / 10) * (-2.66133-(-0.19018)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.04711 + (((tickAnim - 40) / 10) * (0-(2.04711)));
            yy = -0.85402 + (((tickAnim - 40) / 10) * (0-(-0.85402)));
            zz = -2.66133 + (((tickAnim - 40) / 10) * (0-(-2.66133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9.01021-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.71612-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.43052-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 9.01021 + (((tickAnim - 13) / 7) * (12.32565-(9.01021)));
            yy = -2.71612 + (((tickAnim - 13) / 7) * (-2.39674-(-2.71612)));
            zz = -0.43052 + (((tickAnim - 13) / 7) * (-1.89758-(-0.43052)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.32565 + (((tickAnim - 20) / 10) * (9.01021-(12.32565)));
            yy = -2.39674 + (((tickAnim - 20) / 10) * (-2.71612-(-2.39674)));
            zz = -1.89758 + (((tickAnim - 20) / 10) * (-0.43052-(-1.89758)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.01021 + (((tickAnim - 30) / 10) * (12.32565-(9.01021)));
            yy = -2.71612 + (((tickAnim - 30) / 10) * (-2.39674-(-2.71612)));
            zz = -0.43052 + (((tickAnim - 30) / 10) * (-1.89758-(-0.43052)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.32565 + (((tickAnim - 40) / 10) * (0-(12.32565)));
            yy = -2.39674 + (((tickAnim - 40) / 10) * (0-(-2.39674)));
            zz = -1.89758 + (((tickAnim - 40) / 10) * (0-(-1.89758)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (19.68874-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-14.61657-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (8.47096-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.68874 + (((tickAnim - 13) / 7) * (15.01386-(19.68874)));
            yy = -14.61657 + (((tickAnim - 13) / 7) * (-14.56529-(-14.61657)));
            zz = 8.47096 + (((tickAnim - 13) / 7) * (7.18039-(8.47096)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.01386 + (((tickAnim - 20) / 10) * (19.68874-(15.01386)));
            yy = -14.56529 + (((tickAnim - 20) / 10) * (-14.61657-(-14.56529)));
            zz = 7.18039 + (((tickAnim - 20) / 10) * (8.47096-(7.18039)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 19.68874 + (((tickAnim - 30) / 10) * (15.01386-(19.68874)));
            yy = -14.61657 + (((tickAnim - 30) / 10) * (-14.56529-(-14.61657)));
            zz = 8.47096 + (((tickAnim - 30) / 10) * (7.18039-(8.47096)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 15.01386 + (((tickAnim - 40) / 10) * (0-(15.01386)));
            yy = -14.56529 + (((tickAnim - 40) / 10) * (0-(-14.56529)));
            zz = 7.18039 + (((tickAnim - 40) / 10) * (0-(7.18039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.31056-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-21.64389-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.1885-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.31056 + (((tickAnim - 13) / 7) * (18.81056-(10.31056)));
            yy = -21.64389 + (((tickAnim - 13) / 7) * (-21.64389-(-21.64389)));
            zz = 9.1885 + (((tickAnim - 13) / 7) * (9.1885-(9.1885)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.81056 + (((tickAnim - 20) / 10) * (10.31056-(18.81056)));
            yy = -21.64389 + (((tickAnim - 20) / 10) * (-21.64389-(-21.64389)));
            zz = 9.1885 + (((tickAnim - 20) / 10) * (9.1885-(9.1885)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10.31056 + (((tickAnim - 30) / 10) * (18.81056-(10.31056)));
            yy = -21.64389 + (((tickAnim - 30) / 10) * (-21.64389-(-21.64389)));
            zz = 9.1885 + (((tickAnim - 30) / 10) * (9.1885-(9.1885)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18.81056 + (((tickAnim - 40) / 10) * (0-(18.81056)));
            yy = -21.64389 + (((tickAnim - 40) / 10) * (0-(-21.64389)));
            zz = 9.1885 + (((tickAnim - 40) / 10) * (0-(9.1885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.93852-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-9.60886-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (5.57766-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -0.93852 + (((tickAnim - 13) / 27) * (-0.93852-(-0.93852)));
            yy = -9.60886 + (((tickAnim - 13) / 27) * (-9.60886-(-9.60886)));
            zz = 5.57766 + (((tickAnim - 13) / 27) * (5.57766-(5.57766)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.93852 + (((tickAnim - 40) / 10) * (0-(-0.93852)));
            yy = -9.60886 + (((tickAnim - 40) / 10) * (0-(-9.60886)));
            zz = 5.57766 + (((tickAnim - 40) / 10) * (0-(5.57766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.25 + (((tickAnim - 15) / 20) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 35) / 15) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.375 + (((tickAnim - 15) / 20) * (-7.375-(-7.375)));
            zz = 4.35 + (((tickAnim - 15) / 20) * (4.35-(4.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.375 + (((tickAnim - 35) / 15) * (0-(-7.375)));
            zz = 4.35 + (((tickAnim - 35) / 15) * (0-(4.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -35.75 + (((tickAnim - 15) / 20) * (-35.75-(-35.75)));
            yy = -9.25 + (((tickAnim - 15) / 20) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -35.75 + (((tickAnim - 35) / 15) * (0-(-35.75)));
            yy = -9.25 + (((tickAnim - 35) / 15) * (0-(-9.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 33 + (((tickAnim - 15) / 20) * (33-(33)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 35) / 15) * (0-(33)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -54.25 + (((tickAnim - 15) / 20) * (-54.25-(-54.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -54.25 + (((tickAnim - 35) / 15) * (0-(-54.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (64.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 64.5 + (((tickAnim - 15) / 20) * (64.5-(64.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 64.5 + (((tickAnim - 35) / 15) * (0-(64.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -35.75 + (((tickAnim - 15) / 20) * (-35.75-(-35.75)));
            yy = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -35.75 + (((tickAnim - 35) / 15) * (0-(-35.75)));
            yy = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 33 + (((tickAnim - 15) / 20) * (33-(33)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 35) / 15) * (0-(33)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -54.25 + (((tickAnim - 15) / 20) * (-54.25-(-54.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -54.25 + (((tickAnim - 35) / 15) * (0-(-54.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (64.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 64.5 + (((tickAnim - 15) / 20) * (64.5-(64.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 64.5 + (((tickAnim - 35) / 15) * (0-(64.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8 + (((tickAnim - 8) / 7) * (-7.5-(-8)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 15) / 20) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -7.5 + (((tickAnim - 35) / 8) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 43) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 15) / 20) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 35) / 15) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.37-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.37 + (((tickAnim - 8) / 7) * (-5.75-(-8.37)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 15) / 20) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.75 + (((tickAnim - 35) / 8) * (-10.12-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.12 + (((tickAnim - 43) / 7) * (0-(-10.12)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 15) / 20) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.87-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -4.87 + (((tickAnim - 8) / 7) * (-1.25-(-4.87)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.25 + (((tickAnim - 15) / 20) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -1.25 + (((tickAnim - 35) / 8) * (-8.62-(-1.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.62 + (((tickAnim - 43) / 7) * (0-(-8.62)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 15) / 20) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 22.75 + (((tickAnim - 35) / 8) * (27.63-(22.75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 27.63 + (((tickAnim - 43) / 3) * (-10.4-(27.63)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -10.4 + (((tickAnim - 46) / 4) * (0-(-10.4)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 15) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 35) / 15) * (0-(8.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.25 + (((tickAnim - 15) / 20) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15 + (((tickAnim - 15) / 20) * (-15-(-15)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 35) / 15) * (0-(-15)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 7) / 8) * (0-(11.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 7) / 8) * (0-(17.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26.00466-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (4.3831-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.3816-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 26.00466 + (((tickAnim - 7) / 8) * (0-(26.00466)));
            yy = 4.3831 + (((tickAnim - 7) / 8) * (0-(4.3831)));
            zz = 0.3816 + (((tickAnim - 7) / 8) * (0-(0.3816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26.00466-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-4.38309-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.38163-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 26.00466 + (((tickAnim - 7) / 8) * (0-(26.00466)));
            yy = -4.38309 + (((tickAnim - 7) / 8) * (0-(-4.38309)));
            zz = -0.38163 + (((tickAnim - 7) / 8) * (0-(-0.38163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 24.25 + (((tickAnim - 7) / 3) * (32.75-(24.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 32.75 + (((tickAnim - 10) / 5) * (0-(32.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (43.5-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 43.5 + (((tickAnim - 10) / 5) * (0-(43.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 5) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 14.25 + (((tickAnim - 7) / 3) * (-10.5-(14.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.5 + (((tickAnim - 10) / 5) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 7) / 3) * (7.5-(12.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (26.75-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 26.75 + (((tickAnim - 8) / 2) * (0-(26.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.06783 + (((tickAnim - 0) / 6) * (6.18327-(-18.06783)));
            yy = 3.63129 + (((tickAnim - 0) / 6) * (0.42871-(3.63129)));
            zz = 0.78568 + (((tickAnim - 0) / 6) * (5.52331-(0.78568)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 6.18327 + (((tickAnim - 6) / 5) * (26.16774-(6.18327)));
            yy = 0.42871 + (((tickAnim - 6) / 5) * (-8.89492-(0.42871)));
            zz = 5.52331 + (((tickAnim - 6) / 5) * (3.36727-(5.52331)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 26.16774 + (((tickAnim - 11) / 6) * (-1.4163-(26.16774)));
            yy = -8.89492 + (((tickAnim - 11) / 6) * (-2.86782-(-8.89492)));
            zz = 3.36727 + (((tickAnim - 11) / 6) * (-5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(3.36727)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.4163 + (((tickAnim - 17) / 3) * (-18.06783-(-1.4163)));
            yy = -2.86782 + (((tickAnim - 17) / 3) * (3.63129-(-2.86782)));
            zz = -5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 17) / 3) * (0.78568-(-5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -14 + (((tickAnim - 0) / 9) * (15.25-(-14)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 15.25 + (((tickAnim - 9) / 2) * (18.5-(15.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 18.5 + (((tickAnim - 11) / 6) * (-29.80386-(18.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (1.29795-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (3.73327-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -29.80386 + (((tickAnim - 17) / 3) * (-14-(-29.80386)));
            yy = 1.29795 + (((tickAnim - 17) / 3) * (0-(1.29795)));
            zz = 3.73327 + (((tickAnim - 17) / 3) * (0-(3.73327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0.675-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 17) / 3) * (0-(0.675)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.56205 + (((tickAnim - 0) / 3) * (9.83142-(14.56205)));
            yy = -1.13422 + (((tickAnim - 0) / 3) * (-0.78523-(-1.13422)));
            zz = -3.78661 + (((tickAnim - 0) / 3) * (-2.6215-(-3.78661)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 9.83142 + (((tickAnim - 3) / 6) * (13-(9.83142)));
            yy = -0.78523 + (((tickAnim - 3) / 6) * (0-(-0.78523)));
            zz = -2.6215 + (((tickAnim - 3) / 6) * (0-(-2.6215)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 13 + (((tickAnim - 9) / 2) * (-10.5-(13)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -10.5 + (((tickAnim - 11) / 3) * (-39.5-(-10.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -39.5 + (((tickAnim - 14) / 3) * (-43.75-(-39.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -43.75 + (((tickAnim - 17) / 3) * (14.56205-(-43.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (-1.13422-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-3.78661-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (-5.58-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.58 + (((tickAnim - 3) / 5) * (15.45-(-5.58)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 15.45 + (((tickAnim - 8) / 3) * (82.75-(15.45)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 82.75 + (((tickAnim - 11) / 3) * (77.59-(82.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 77.59 + (((tickAnim - 14) / 3) * (77.59-(77.59)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 77.59 + (((tickAnim - 17) / 3) * (22.5-(77.59)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 3) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (1.375-(0)));
            zz = -0.225 + (((tickAnim - 3) / 8) * (0-(-0.225)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 1.375 + (((tickAnim - 11) / 3) * (1.535-(1.375)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.535 + (((tickAnim - 14) / 3) * (1.535-(1.535)));
            zz = 0.4 + (((tickAnim - 14) / 3) * (0.4-(0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.535 + (((tickAnim - 17) / 3) * (0.675-(1.535)));
            zz = 0.4 + (((tickAnim - 17) / 3) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 26.09004 + (((tickAnim - 0) / 7) * (-1.4163-(26.09004)));
            yy = 8.96992 + (((tickAnim - 0) / 7) * (0.2428-(8.96992)));
            zz = -3.86771 + (((tickAnim - 0) / 7) * (0-(-3.86771)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.4163 + (((tickAnim - 7) / 3) * (-18.02678-(-1.4163)));
            yy = 0.2428 + (((tickAnim - 7) / 3) * (-4.0673-(0.2428)));
            zz = 0 + (((tickAnim - 7) / 3) * (-1.3973-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -18.02678 + (((tickAnim - 10) / 5) * (4.42133-(-18.02678)));
            yy = -4.0673 + (((tickAnim - 10) / 5) * (0.60073-(-4.0673)));
            zz = -1.3973 + (((tickAnim - 10) / 5) * (-4.74241-(-1.3973)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.42133 + (((tickAnim - 15) / 5) * (26.09004-(4.42133)));
            yy = 0.60073 + (((tickAnim - 15) / 5) * (8.96992-(0.60073)));
            zz = -4.74241 + (((tickAnim - 15) / 5) * (-3.86771-(-4.74241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 15.25 + (((tickAnim - 0) / 7) * (-19.30386-(15.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.2979-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-3.7333-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -19.30386 + (((tickAnim - 7) / 3) * (-23.75-(-19.30386)));
            yy = -1.2979 + (((tickAnim - 7) / 3) * (0-(-1.2979)));
            zz = -3.7333 + (((tickAnim - 7) / 3) * (0-(-3.7333)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.75 + (((tickAnim - 10) / 10) * (15.25-(-23.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.75 + (((tickAnim - 0) / 4) * (-39.5-(6.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -39.5 + (((tickAnim - 4) / 3) * (-43.75-(-39.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -43.75 + (((tickAnim - 7) / 3) * (27.75-(-43.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.75 + (((tickAnim - 10) / 10) * (6.75-(27.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 82.75 + (((tickAnim - 0) / 4) * (77.59-(82.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 77.59 + (((tickAnim - 4) / 3) * (77.59-(77.59)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 77.59 + (((tickAnim - 7) / 3) * (14.75-(77.59)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 14.75 + (((tickAnim - 10) / 4) * (-11.42-(14.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -11.42 + (((tickAnim - 14) / 3) * (4.69-(-11.42)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 4.69 + (((tickAnim - 17) / 3) * (82.75-(4.69)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.6 + (((tickAnim - 0) / 4) * (1.535-(1.6)));
            zz = 0.225 + (((tickAnim - 0) / 4) * (0.4-(0.225)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.535 + (((tickAnim - 4) / 3) * (1.535-(1.535)));
            zz = 0.4 + (((tickAnim - 4) / 3) * (0.4-(0.4)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.535 + (((tickAnim - 7) / 3) * (0.675-(1.535)));
            zz = 0.4 + (((tickAnim - 7) / 3) * (0-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 10) / 2) * (0.965-(0.675)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.58-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.965 + (((tickAnim - 12) / 2) * (0-(0.965)));
            zz = 0.58 + (((tickAnim - 12) / 2) * (0-(0.58)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.8-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 17) / 3) * (1.6-(0.8)));
            zz = 0.3 + (((tickAnim - 17) / 3) * (0.225-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-70))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*0.5);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*-4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*-4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*4.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+130))*-2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*0.2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-280))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*2));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-320))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+240))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+240))*1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-550))*6), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLesothosaurus entity = (EntityPrehistoricFloraLesothosaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.81783 + (((tickAnim - 0) / 3) * (6.18327-(-18.81783)));
            yy = 3.63129 + (((tickAnim - 0) / 3) * (0.42871-(3.63129)));
            zz = 0.78568 + (((tickAnim - 0) / 3) * (5.52331-(0.78568)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.18327 + (((tickAnim - 3) / 3) * (43.41774-(6.18327)));
            yy = 0.42871 + (((tickAnim - 3) / 3) * (-8.89492-(0.42871)));
            zz = 5.52331 + (((tickAnim - 3) / 3) * (3.36727-(5.52331)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 43.41774 + (((tickAnim - 6) / 3) * (-1.4163-(43.41774)));
            yy = -8.89492 + (((tickAnim - 6) / 3) * (-2.86782-(-8.89492)));
            zz = 3.36727 + (((tickAnim - 6) / 3) * (-5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(3.36727)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -1.4163 + (((tickAnim - 9) / 3) * (-18.81783-(-1.4163)));
            yy = -2.86782 + (((tickAnim - 9) / 3) * (3.63129-(-2.86782)));
            zz = -5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 9) / 3) * (0.78568-(-5.7804+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.25 + (((tickAnim - 0) / 5) * (18-(-22.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 18 + (((tickAnim - 5) / 1) * (3.5-(18)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 3.5 + (((tickAnim - 6) / 4) * (-29.80386-(3.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (1.29795-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (3.73327-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -29.80386 + (((tickAnim - 10) / 2) * (-22.25-(-29.80386)));
            yy = 1.29795 + (((tickAnim - 10) / 2) * (0-(1.29795)));
            zz = 3.73327 + (((tickAnim - 10) / 2) * (0-(3.73327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.975-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.225-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.975 + (((tickAnim - 10) / 2) * (0-(0.975)));
            zz = -0.225 + (((tickAnim - 10) / 2) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.75 + (((tickAnim - 0) / 2) * (9.83142-(22.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.78523-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.6215-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.83142 + (((tickAnim - 2) / 3) * (18.25-(9.83142)));
            yy = -0.78523 + (((tickAnim - 2) / 3) * (0-(-0.78523)));
            zz = -2.6215 + (((tickAnim - 2) / 3) * (0-(-2.6215)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 18.25 + (((tickAnim - 5) / 2) * (-22.25-(18.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.25 + (((tickAnim - 7) / 1) * (-39.5-(-22.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -39.5 + (((tickAnim - 8) / 2) * (-43.75-(-39.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -43.75 + (((tickAnim - 10) / 2) * (22.75-(-43.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.5 + (((tickAnim - 0) / 1) * (12.71-(22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 12.71 + (((tickAnim - 1) / 1) * (-1.83-(12.71)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -1.83 + (((tickAnim - 2) / 2) * (39.95-(-1.83)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 39.95 + (((tickAnim - 4) / 2) * (82.75-(39.95)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 82.75 + (((tickAnim - 6) / 2) * (77.59-(82.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.59 + (((tickAnim - 8) / 2) * (77.59-(77.59)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 77.59 + (((tickAnim - 10) / 2) * (22.5-(77.59)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 1) * (0.69-(0.675)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.49-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.69 + (((tickAnim - 1) / 1) * (0-(0.69)));
            zz = 0.49 + (((tickAnim - 1) / 1) * (-0.225-(0.49)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (1.375-(0)));
            zz = -0.225 + (((tickAnim - 2) / 4) * (0-(-0.225)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 6) / 2) * (1.535-(1.375)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 8) / 2) * (1.535-(1.535)));
            zz = 0.4 + (((tickAnim - 8) / 2) * (0.4-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 10) / 2) * (0.675-(1.535)));
            zz = 0.4 + (((tickAnim - 10) / 2) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*8), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*8), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40.84004 + (((tickAnim - 0) / 4) * (-1.4163-(40.84004)));
            yy = 8.96992 + (((tickAnim - 0) / 4) * (0.2428-(8.96992)));
            zz = -3.86771 + (((tickAnim - 0) / 4) * (0-(-3.86771)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -1.4163 + (((tickAnim - 4) / 2) * (-18.02678-(-1.4163)));
            yy = 0.2428 + (((tickAnim - 4) / 2) * (-4.0673-(0.2428)));
            zz = 0 + (((tickAnim - 4) / 2) * (-1.3973-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.02678 + (((tickAnim - 6) / 2) * (4.42133-(-18.02678)));
            yy = -4.0673 + (((tickAnim - 6) / 2) * (0.60073-(-4.0673)));
            zz = -1.3973 + (((tickAnim - 6) / 2) * (-4.74241-(-1.3973)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.42133 + (((tickAnim - 8) / 4) * (40.84004-(4.42133)));
            yy = 0.60073 + (((tickAnim - 8) / 4) * (8.96992-(0.60073)));
            zz = -4.74241 + (((tickAnim - 8) / 4) * (-3.86771-(-4.74241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.75 + (((tickAnim - 0) / 4) * (-32.80386-(5.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.2979-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.7333-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -32.80386 + (((tickAnim - 4) / 2) * (-30.25-(-32.80386)));
            yy = -1.2979 + (((tickAnim - 4) / 2) * (0-(-1.2979)));
            zz = -3.7333 + (((tickAnim - 4) / 2) * (0-(-3.7333)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -30.25 + (((tickAnim - 6) / 6) * (5.75-(-30.25)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.15-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.3-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 2.15 + (((tickAnim - 4) / 2) * (0-(2.15)));
            zz = -0.3 + (((tickAnim - 4) / 2) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 12.5 + (((tickAnim - 0) / 2) * (-39.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -39.5 + (((tickAnim - 2) / 2) * (-43.75-(-39.5)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -43.75 + (((tickAnim - 4) / 2) * (27.75-(-43.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 27.75 + (((tickAnim - 6) / 6) * (6.75-(27.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 82.75 + (((tickAnim - 0) / 2) * (77.59-(82.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 77.59 + (((tickAnim - 2) / 2) * (77.59-(77.59)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 77.59 + (((tickAnim - 4) / 2) * (26.25-(77.59)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.25 + (((tickAnim - 6) / 2) * (-11.42-(26.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -11.42 + (((tickAnim - 8) / 1) * (4.69-(-11.42)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 4.69 + (((tickAnim - 9) / 3) * (82.75-(4.69)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.6 + (((tickAnim - 0) / 2) * (1.535-(1.6)));
            zz = 0.225 + (((tickAnim - 0) / 2) * (0.4-(0.225)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 2) / 2) * (1.535-(1.535)));
            zz = 0.4 + (((tickAnim - 2) / 2) * (0.4-(0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 4) / 2) * (0.675-(1.535)));
            zz = 0.4 + (((tickAnim - 4) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 6) / 1) * (0.965-(0.675)));
            zz = 0 + (((tickAnim - 6) / 1) * (0.58-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.965 + (((tickAnim - 7) / 1) * (0-(0.965)));
            zz = 0.58 + (((tickAnim - 7) / 1) * (0-(0.58)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.8-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.3-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 9) / 3) * (1.6-(0.8)));
            zz = 0.3 + (((tickAnim - 9) / 3) * (0.225-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-70))*7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+50))*1);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-40))*-7), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*4));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-80))*-7), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*6));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-130))*-7), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*17), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+150))*5));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-180))*-7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+200))*5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-190))*5.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+130))*-5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*0.2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-280))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+190))*5));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*12), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*12), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(11.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-320))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+240))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-450))*7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+240))*1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-400))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-550))*9), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));

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
