package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMecistotrachelos;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelMecistotrachelos extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Mecistotrachelos;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer upperBody;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightWing1;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer leftWing1;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelMecistotrachelos() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.Mecistotrachelos = new AdvancedModelRenderer(this);
        this.Mecistotrachelos.setRotationPoint(0.0F, 22.8F, 0.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -1.3222F, 3.268F);
        this.Mecistotrachelos.addChild(hip);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2627F, -0.0601F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 16, -1.5F, -1.6F, -5.0F, 3, 3, 6, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0627F, 2.4399F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -1.0F, -1.0F, -2.5F, 2, 2, 4, 0.0F, false));

        this.upperBody = new AdvancedModelRenderer(this);
        this.upperBody.setRotationPoint(0.0F, -1.7778F, -4.868F);
        this.hip.addChild(upperBody);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.4391F, -4.8403F);
        this.upperBody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, -1.5F, -2.0F, -1.0F, 3, 3, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.8406F, -5.2921F);
        this.upperBody.addChild(neck1);
        this.setRotateAngle(neck1, 0.0873F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 13, 26, -1.0F, -1.0F, -3.9F, 2, 2, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 24, 8, -1.0F, -1.0F, -3.9F, 2, 2, 4, -0.05F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 24, 0, -1.0F, -1.0F, -3.6F, 2, 2, 4, -0.1F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0982F, -3.2597F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 19, 0.1815F, -0.9729F, -1.2403F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 16, -1.1816F, -0.9729F, -1.2403F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 39, -1.0F, -1.0982F, -1.3403F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 26, -0.5F, -0.0982F, -4.1403F, 1, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5017F, 0.3918F, -4.1751F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1676F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -0.0026F, -0.5F, 0.024F, 1, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5017F, 0.3918F, -4.1751F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1676F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 39, -0.9974F, -0.5F, 0.024F, 1, 1, 3, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1354F, -2.547F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 34, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.3112F, 0.6372F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 33, 3, -0.5F, -0.0023F, -4.7155F, 1, 1, 4, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 22, 26, -1.0F, 0.0106F, -1.9775F, 2, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 20, 16, -0.5F, -0.6094F, -1.426F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5117F, 0.5177F, -4.7708F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1676F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 9, -0.9974F, -0.5F, 0.024F, 1, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5117F, 0.5177F, -4.7708F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1676F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 37, -0.0026F, -0.5F, 0.024F, 1, 1, 3, -0.02F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(0.6F, 1.7406F, -5.2921F);
        this.upperBody.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0846F, -0.2013F, 0.4449F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 33, 0, -0.1F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(2.5F, 0.0F, 0.5F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, 0.0227F, 0.4795F, 0.0492F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 39, 29, 0.0F, -0.5F, -1.0F, 3, 1, 1, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(2.9993F, -0.0916F, -0.6083F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 1.2174F, -0.4986F, -0.3316F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.frontLeftLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.1423F, -0.2841F, 0.1656F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 15, -0.9821F, 0.3224F, -1.8973F, 3, 0, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-0.6F, 1.7406F, -5.2921F);
        this.upperBody.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, -0.0846F, 0.2013F, -0.4449F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 33, 0, -2.9F, -0.5F, -0.5F, 3, 1, 1, 0.01F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-2.5F, 0.0F, 0.5F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, 0.0227F, -0.4795F, -0.0492F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 39, 29, -3.0F, -0.5F, -1.0F, 3, 1, 1, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-2.9993F, -0.0916F, -0.6083F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 1.2174F, 0.4986F, 0.3316F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.frontRightLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.1423F, 0.2841F, -0.1656F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 15, -2.0179F, 0.3224F, -1.8973F, 3, 0, 3, 0.0F, true));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.5F, 1.6406F, -4.1921F);
        this.upperBody.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.0436F, 0.0F, 0.0F);


        this.rightWing1 = new AdvancedModelRenderer(this);
        this.rightWing1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightWing.addChild(rightWing1);
        this.setRotateAngle(rightWing1, 0.0F, 1.0908F, 0.0F);
        this.rightWing1.cubeList.add(new ModelBox(rightWing1, 0, 7, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0F, 0.0194F, 2.0F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, 0.0F, 0.9512F, 0.0F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 0, 5, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(0.0F, 0.0294F, 4.0F);
        this.rightWing.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.0F, 0.8116F, 0.0F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 0, 3, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.0F, 0.0394F, 6.0F);
        this.rightWing.addChild(rightWing4);
        this.setRotateAngle(rightWing4, 0.0F, 0.6109F, 0.0F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 0, 1, -10.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(1.5F, 1.6406F, -4.1921F);
        this.upperBody.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.0436F, 0.0F, 0.0F);


        this.leftWing1 = new AdvancedModelRenderer(this);
        this.leftWing1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftWing.addChild(leftWing1);
        this.setRotateAngle(leftWing1, 0.0F, -1.0908F, 0.0F);
        this.leftWing1.cubeList.add(new ModelBox(leftWing1, 0, 7, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(0.0F, 0.0194F, 2.0F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, 0.0F, -0.9512F, 0.0F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 0, 5, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(0.0F, 0.0294F, 4.0F);
        this.leftWing.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.0F, -0.8116F, 0.0F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 0, 3, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(0.0F, 0.0394F, 6.0F);
        this.leftWing.addChild(leftWing4);
        this.setRotateAngle(leftWing4, 0.0F, -0.6109F, 0.0F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 0, 1, 0.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-0.7F, -0.0373F, 0.2399F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.1022F, 0.2415F, -0.4051F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 27, 33, -2.8F, -0.5F, -0.3F, 3, 1, 2, 0.01F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-2.58F, 0.0558F, 0.391F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.0F, 0.6545F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 32, 19, -3.7539F, -0.5558F, -0.5821F, 4, 1, 1, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-3.2539F, 0.4442F, -0.0821F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2449F, 0.0597F, 0.273F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 0, 33, -2.5105F, 0.0167F, -2.511F, 3, 0, 3, 0.0F, true));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(0.7F, -0.0373F, 0.2399F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1022F, -0.2415F, 0.4051F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 27, 33, -0.2F, -0.5F, -0.3F, 3, 1, 2, 0.01F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(2.58F, 0.0558F, 0.391F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.0F, -0.6545F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 32, 19, -0.2461F, -0.5558F, -0.5821F, 4, 1, 1, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(3.2539F, 0.4442F, -0.0821F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2449F, -0.0597F, -0.273F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 0, 33, -0.4895F, 0.0167F, -2.511F, 3, 0, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.3627F, 3.8399F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 35, 23, -0.5F, -1.0F, -0.5F, 1, 2, 3, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 2.2F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 16, -0.5F, -0.5F, -0.6F, 1, 1, 4, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 33, -0.5F, -0.5F, 0.1F, 1, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1F, 3.7F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3491F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 24, 38, 0.0F, -0.5F, -0.4F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Mecistotrachelos.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.Mecistotrachelos.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Mecistotrachelos.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Mecistotrachelos.offsetY = -2.30F;
        this.Mecistotrachelos.offsetX = -0.05F;
        this.Mecistotrachelos.rotateAngleY = (float)Math.toRadians(210);
        this.Mecistotrachelos.rotateAngleX = (float)Math.toRadians(8);
        this.Mecistotrachelos.rotateAngleZ = (float)Math.toRadians(-8);
        this.Mecistotrachelos.scaleChildren = true;
        float scaler = 2.9F;
        this.Mecistotrachelos.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Mecistotrachelos.render(f);
        //Reset rotations, positions and sizing:
        this.Mecistotrachelos.setScale(1.0F, 1.0F, 1.0F);
        this.Mecistotrachelos.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraMecistotrachelos ee = (EntityPrehistoricFloraMecistotrachelos) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
            this.chainSwing(Tail, 0.2F, -0.1F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMecistotrachelos ee = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //Is gliding:
                    animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
            }
        }
        else {
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMecistotrachelos entity = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 8) / 5) * (-9-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 13) / 7) * (0-(-9)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -2.75 + (((tickAnim - 8) / 5) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 13) / 7) * (0-(1.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 13) / 7) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (18.45785-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.84851-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.68726-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 18.45785 + (((tickAnim - 8) / 5) * (23.70785-(18.45785)));
            yy = 0.84851 + (((tickAnim - 8) / 5) * (0.84851-(0.84851)));
            zz = -5.68726 + (((tickAnim - 8) / 5) * (-5.68726-(-5.68726)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 23.70785 + (((tickAnim - 13) / 7) * (0-(23.70785)));
            yy = 0.84851 + (((tickAnim - 13) / 7) * (0-(0.84851)));
            zz = -5.68726 + (((tickAnim - 13) / 7) * (0-(-5.68726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.89492-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.14678-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.60411-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 10.89492 + (((tickAnim - 8) / 9) * (-11.34469-(10.89492)));
            yy = 2.14678 + (((tickAnim - 8) / 9) * (0.57248-(2.14678)));
            zz = -5.60411 + (((tickAnim - 8) / 9) * (-1.49443-(-5.60411)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -11.34469 + (((tickAnim - 17) / 3) * (0-(-11.34469)));
            yy = 0.57248 + (((tickAnim - 17) / 3) * (0-(0.57248)));
            zz = -1.49443 + (((tickAnim - 17) / 3) * (0-(-1.49443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 8) / 5) * (0-(16.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (11.25-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 17) / 3) * (0-(11.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMecistotrachelos entity = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.4);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);
        this.setRotateAngle(upperBody, upperBody.rotateAngleX + (float) Math.toRadians(0), upperBody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2), upperBody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-1));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-2), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(4.17302), frontLeftLeg.rotateAngleY + (float) Math.toRadians(-2.71), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(-22.57624));
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(89.99057), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(14.34357), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(-4.73195));
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(0);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(0);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(-0.3);
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(4.17302), frontRightLeg.rotateAngleY + (float) Math.toRadians(2.71), frontRightLeg.rotateAngleZ + (float) Math.toRadians(22.57624));
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(89.99057), frontRightLeg3.rotateAngleY + (float) Math.toRadians(-14.34357), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(4.73195));
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(0);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(0);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(-0.3);
        this.rightWing.rotationPointX = this.rightWing.rotationPointX + (float)(0.15);
        this.rightWing.rotationPointY = this.rightWing.rotationPointY - (float)(0);
        this.rightWing.rotationPointZ = this.rightWing.rotationPointZ + (float)(0);
        this.setRotateAngle(rightWing1, rightWing1.rotateAngleX + (float) Math.toRadians(0), rightWing1.rotateAngleY + (float) Math.toRadians(-63.75), rightWing1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(0), rightWing2.rotateAngleY + (float) Math.toRadians(-55.75), rightWing2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(0), rightWing3.rotateAngleY + (float) Math.toRadians(-47.5), rightWing3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(0), rightWing4.rotateAngleY + (float) Math.toRadians(-38), rightWing4.rotateAngleZ + (float) Math.toRadians(0));
        this.leftWing.rotationPointX = this.leftWing.rotationPointX + (float)(-0.15);
        this.leftWing.rotationPointY = this.leftWing.rotationPointY - (float)(0);
        this.leftWing.rotationPointZ = this.leftWing.rotationPointZ + (float)(0);
        this.setRotateAngle(leftWing1, leftWing1.rotateAngleX + (float) Math.toRadians(0), leftWing1.rotateAngleY + (float) Math.toRadians(63.75), leftWing1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(0), leftWing2.rotateAngleY + (float) Math.toRadians(55.75), leftWing2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(0), leftWing3.rotateAngleY + (float) Math.toRadians(47.5), leftWing3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(0), leftWing4.rotateAngleY + (float) Math.toRadians(38), leftWing4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(9.25), backRightLeg.rotateAngleY + (float) Math.toRadians(0), backRightLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(91.8968), backRightLeg3.rotateAngleY + (float) Math.toRadians(4.45512), backRightLeg3.rotateAngleZ + (float) Math.toRadians(19.08268));
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(0);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(0.425);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(0);
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(9.25), backLeftLeg.rotateAngleY + (float) Math.toRadians(0), backLeftLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(91.8968), backLeftLeg3.rotateAngleY + (float) Math.toRadians(-4.45512), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(-19.08268));
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(0);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(0.425);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(0);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-5.25), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*-6), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-13.25), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-13.25), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+200))*10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(0);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(-0.075);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(0);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMecistotrachelos entity = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*10), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.5);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(upperBody, upperBody.rotateAngleX + (float) Math.toRadians(0), upperBody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-10), upperBody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-10), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*10), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*10), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.95402 + (((tickAnim - 0) / 5) * (-0.55946-(18.95402)));
            yy = 30.85193 + (((tickAnim - 0) / 5) * (-48.52634-(30.85193)));
            zz = 2.8377 + (((tickAnim - 0) / 5) * (-0.1372-(2.8377)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.55946 + (((tickAnim - 5) / 3) * (19.26131-(-0.55946)));
            yy = -48.52634 + (((tickAnim - 5) / 3) * (-3.64133-(-48.52634)));
            zz = -0.1372 + (((tickAnim - 5) / 3) * (-30.79808-(-0.1372)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.26131 + (((tickAnim - 8) / 2) * (18.95402-(19.26131)));
            yy = -3.64133 + (((tickAnim - 8) / 2) * (30.85193-(-3.64133)));
            zz = -30.79808 + (((tickAnim - 8) / 2) * (2.8377-(-30.79808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.76358 + (((tickAnim - 0) / 3) * (-0.08787-(15.76358)));
            yy = 22.19512 + (((tickAnim - 0) / 3) * (5.769-(22.19512)));
            zz = 3.14889 + (((tickAnim - 0) / 3) * (-16.36122-(3.14889)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.08787 + (((tickAnim - 3) / 2) * (-0.66469-(-0.08787)));
            yy = 5.769 + (((tickAnim - 3) / 2) * (-33.35998-(5.769)));
            zz = -16.36122 + (((tickAnim - 3) / 2) * (6.53294-(-16.36122)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.66469 + (((tickAnim - 5) / 3) * (-4.54675-(-0.66469)));
            yy = -33.35998 + (((tickAnim - 5) / 3) * (41.84491-(-33.35998)));
            zz = 6.53294 + (((tickAnim - 5) / 3) * (-5.06628-(6.53294)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.54675 + (((tickAnim - 8) / 2) * (15.76358-(-4.54675)));
            yy = 41.84491 + (((tickAnim - 8) / 2) * (22.19512-(41.84491)));
            zz = -5.06628 + (((tickAnim - 8) / 2) * (3.14889-(-5.06628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 8) / 2) * (0-(0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.05887 + (((tickAnim - 0) / 3) * (-3.83727-(-6.05887)));
            yy = -1.92816 + (((tickAnim - 0) / 3) * (55.42245-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 0) / 3) * (14.45494-(2.68165)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.83727 + (((tickAnim - 3) / 2) * (64-(-3.83727)));
            yy = 55.42245 + (((tickAnim - 3) / 2) * (0-(55.42245)));
            zz = 14.45494 + (((tickAnim - 3) / 2) * (0-(14.45494)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 64 + (((tickAnim - 5) / 1) * (84.41203-(64)));
            yy = 0 + (((tickAnim - 5) / 1) * (-23.1703-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (35.21273-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 84.41203 + (((tickAnim - 6) / 2) * (-12.77666-(84.41203)));
            yy = -23.1703 + (((tickAnim - 6) / 2) * (7.1294-(-23.1703)));
            zz = 35.21273 + (((tickAnim - 6) / 2) * (43.24693-(35.21273)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.77666 + (((tickAnim - 8) / 2) * (-6.05887-(-12.77666)));
            yy = 7.1294 + (((tickAnim - 8) / 2) * (-1.92816-(7.1294)));
            zz = 43.24693 + (((tickAnim - 8) / 2) * (2.68165-(43.24693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (0.175-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 3) * (-0.45-(0.175)));
            zz = 0.09 + (((tickAnim - 3) / 3) * (0.25-(0.09)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 6) / 4) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 6) / 4) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.55946 + (((tickAnim - 0) / 3) * (19.26131-(-0.55946)));
            yy = 48.52634 + (((tickAnim - 0) / 3) * (3.64133-(48.52634)));
            zz = 0.1372 + (((tickAnim - 0) / 3) * (30.79808-(0.1372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.26131 + (((tickAnim - 3) / 2) * (18.95402-(19.26131)));
            yy = 3.64133 + (((tickAnim - 3) / 2) * (-30.85193-(3.64133)));
            zz = 30.79808 + (((tickAnim - 3) / 2) * (-2.8377-(30.79808)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.95402 + (((tickAnim - 5) / 5) * (-0.55946-(18.95402)));
            yy = -30.85193 + (((tickAnim - 5) / 5) * (48.52634-(-30.85193)));
            zz = -2.8377 + (((tickAnim - 5) / 5) * (0.1372-(-2.8377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.66469 + (((tickAnim - 0) / 3) * (-4.54675-(-0.66469)));
            yy = 33.35998 + (((tickAnim - 0) / 3) * (-41.84491-(33.35998)));
            zz = -6.53294 + (((tickAnim - 0) / 3) * (5.06628-(-6.53294)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.54675 + (((tickAnim - 3) / 2) * (15.76358-(-4.54675)));
            yy = -41.84491 + (((tickAnim - 3) / 2) * (-22.19512-(-41.84491)));
            zz = 5.06628 + (((tickAnim - 3) / 2) * (-3.14889-(5.06628)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.76358 + (((tickAnim - 5) / 5) * (-0.66469-(15.76358)));
            yy = -22.19512 + (((tickAnim - 5) / 5) * (33.35998-(-22.19512)));
            zz = -3.14889 + (((tickAnim - 5) / 5) * (-6.53294-(-3.14889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 64 + (((tickAnim - 0) / 1) * (74.84736-(64)));
            yy = 0 + (((tickAnim - 0) / 1) * (32.08689-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-11.34172-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 74.84736 + (((tickAnim - 1) / 2) * (-12.77666-(74.84736)));
            yy = 32.08689 + (((tickAnim - 1) / 2) * (-7.1294-(32.08689)));
            zz = -11.34172 + (((tickAnim - 1) / 2) * (-43.24693-(-11.34172)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.77666 + (((tickAnim - 3) / 2) * (-7.55887-(-12.77666)));
            yy = -7.1294 + (((tickAnim - 3) / 2) * (-1.92816-(-7.1294)));
            zz = -43.24693 + (((tickAnim - 3) / 2) * (2.68165-(-43.24693)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.55887 + (((tickAnim - 5) / 3) * (-0.97737-(-7.55887)));
            yy = -1.92816 + (((tickAnim - 5) / 3) * (-73.44131-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 5) / 3) * (5.6899-(2.68165)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.97737 + (((tickAnim - 8) / 2) * (64-(-0.97737)));
            yy = -73.44131 + (((tickAnim - 8) / 2) * (0-(-73.44131)));
            zz = 5.6899 + (((tickAnim - 8) / 2) * (0-(5.6899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 1) / 4) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 1) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0.475-(0)));
            yy = 0.25 + (((tickAnim - 5) / 3) * (0.6-(0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.475 + (((tickAnim - 8) / 2) * (0-(0.475)));
            yy = 0.6 + (((tickAnim - 8) / 2) * (0-(0.6)));
            zz = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4.9103 + (((tickAnim - 0) / 6) * (-11.65947-(-4.9103)));
            yy = -52.68758 + (((tickAnim - 0) / 6) * (32.93383-(-52.68758)));
            zz = 14.51389 + (((tickAnim - 0) / 6) * (5.91489-(14.51389)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.65947 + (((tickAnim - 6) / 2) * (-2.51057-(-11.65947)));
            yy = 32.93383 + (((tickAnim - 6) / 2) * (0.99855-(32.93383)));
            zz = 5.91489 + (((tickAnim - 6) / 2) * (28.76334-(5.91489)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.51057 + (((tickAnim - 8) / 2) * (-4.9103-(-2.51057)));
            yy = 0.99855 + (((tickAnim - 8) / 2) * (-52.68758-(0.99855)));
            zz = 28.76334 + (((tickAnim - 8) / 2) * (14.51389-(28.76334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.29848 + (((tickAnim - 0) / 6) * (16.91576-(19.29848)));
            yy = -3.74885 + (((tickAnim - 0) / 6) * (21.15-(-3.74885)));
            zz = -5.29491 + (((tickAnim - 0) / 6) * (7.81086-(-5.29491)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.91576 + (((tickAnim - 6) / 2) * (28.21762-(16.91576)));
            yy = 21.15 + (((tickAnim - 6) / 2) * (5.48668-(21.15)));
            zz = 7.81086 + (((tickAnim - 6) / 2) * (16.21744-(7.81086)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.21762 + (((tickAnim - 8) / 2) * (19.29848-(28.21762)));
            yy = 5.48668 + (((tickAnim - 8) / 2) * (-3.74885-(5.48668)));
            zz = 16.21744 + (((tickAnim - 8) / 2) * (-5.29491-(16.21744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.94716 + (((tickAnim - 0) / 3) * (-16.64662-(0.94716)));
            yy = -29.80469 + (((tickAnim - 0) / 3) * (-58.99737-(-29.80469)));
            zz = 10.29656 + (((tickAnim - 0) / 3) * (25.4688-(10.29656)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -16.64662 + (((tickAnim - 3) / 3) * (54.28635-(-16.64662)));
            yy = -58.99737 + (((tickAnim - 3) / 3) * (-24.69615-(-58.99737)));
            zz = 25.4688 + (((tickAnim - 3) / 3) * (-5.51886-(25.4688)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 54.28635 + (((tickAnim - 6) / 2) * (65.45697-(54.28635)));
            yy = -24.69615 + (((tickAnim - 6) / 2) * (20.28231-(-24.69615)));
            zz = -5.51886 + (((tickAnim - 6) / 2) * (-0.09855-(-5.51886)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 65.45697 + (((tickAnim - 8) / 2) * (0.94716-(65.45697)));
            yy = 20.28231 + (((tickAnim - 8) / 2) * (-29.80469-(20.28231)));
            zz = -0.09855 + (((tickAnim - 8) / 2) * (10.29656-(-0.09855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.65 + (((tickAnim - 6) / 4) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 6) / 4) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.65947 + (((tickAnim - 0) / 3) * (-2.51057-(-11.65947)));
            yy = -32.93383 + (((tickAnim - 0) / 3) * (-0.99855-(-32.93383)));
            zz = -5.91489 + (((tickAnim - 0) / 3) * (-28.76334-(-5.91489)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.51057 + (((tickAnim - 3) / 2) * (-4.9103-(-2.51057)));
            yy = -0.99855 + (((tickAnim - 3) / 2) * (52.68758-(-0.99855)));
            zz = -28.76334 + (((tickAnim - 3) / 2) * (-14.51389-(-28.76334)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.9103 + (((tickAnim - 5) / 5) * (-11.65947-(-4.9103)));
            yy = 52.68758 + (((tickAnim - 5) / 5) * (-32.93383-(52.68758)));
            zz = -14.51389 + (((tickAnim - 5) / 5) * (-5.91489-(-14.51389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.91576 + (((tickAnim - 0) / 3) * (28.21762-(16.91576)));
            yy = -21.15 + (((tickAnim - 0) / 3) * (-5.48668-(-21.15)));
            zz = -7.81086 + (((tickAnim - 0) / 3) * (-16.21744-(-7.81086)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 28.21762 + (((tickAnim - 3) / 2) * (19.29848-(28.21762)));
            yy = -5.48668 + (((tickAnim - 3) / 2) * (3.74885-(-5.48668)));
            zz = -16.21744 + (((tickAnim - 3) / 2) * (5.29491-(-16.21744)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.29848 + (((tickAnim - 5) / 5) * (16.91576-(19.29848)));
            yy = 3.74885 + (((tickAnim - 5) / 5) * (-21.15-(3.74885)));
            zz = 5.29491 + (((tickAnim - 5) / 5) * (-7.81086-(5.29491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54.28635 + (((tickAnim - 0) / 3) * (65.45697-(54.28635)));
            yy = 24.69615 + (((tickAnim - 0) / 3) * (20.28231-(24.69615)));
            zz = 5.51886 + (((tickAnim - 0) / 3) * (-0.09855-(5.51886)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 65.45697 + (((tickAnim - 3) / 2) * (7.46876-(65.45697)));
            yy = 20.28231 + (((tickAnim - 3) / 2) * (-14.4173-(20.28231)));
            zz = -0.09855 + (((tickAnim - 3) / 2) * (-1.82195-(-0.09855)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.46876 + (((tickAnim - 5) / 3) * (-16.64662-(7.46876)));
            yy = -14.4173 + (((tickAnim - 5) / 3) * (58.99737-(-14.4173)));
            zz = -1.82195 + (((tickAnim - 5) / 3) * (-25.4688-(-1.82195)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.64662 + (((tickAnim - 8) / 2) * (54.28635-(-16.64662)));
            yy = 58.99737 + (((tickAnim - 8) / 2) * (24.69615-(58.99737)));
            zz = -25.4688 + (((tickAnim - 8) / 2) * (5.51886-(-25.4688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 5) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 0) / 5) * (0-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMecistotrachelos entity = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*3));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.1);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(upperBody, upperBody.rotateAngleX + (float) Math.toRadians(0), upperBody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-5), upperBody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-5), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*5), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-8), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 18.95402 + (((tickAnim - 0) / 10) * (-0.55946-(18.95402)));
            yy = 30.85193 + (((tickAnim - 0) / 10) * (-48.52634-(30.85193)));
            zz = 2.8377 + (((tickAnim - 0) / 10) * (-0.1372-(2.8377)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.55946 + (((tickAnim - 10) / 5) * (19.26131-(-0.55946)));
            yy = -48.52634 + (((tickAnim - 10) / 5) * (-3.64133-(-48.52634)));
            zz = -0.1372 + (((tickAnim - 10) / 5) * (-30.79808-(-0.1372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.26131 + (((tickAnim - 15) / 5) * (18.95402-(19.26131)));
            yy = -3.64133 + (((tickAnim - 15) / 5) * (30.85193-(-3.64133)));
            zz = -30.79808 + (((tickAnim - 15) / 5) * (2.8377-(-30.79808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.76358 + (((tickAnim - 0) / 4) * (-0.08787-(15.76358)));
            yy = 22.19512 + (((tickAnim - 0) / 4) * (5.769-(22.19512)));
            zz = 3.14889 + (((tickAnim - 0) / 4) * (-16.36122-(3.14889)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.08787 + (((tickAnim - 4) / 6) * (-0.66469-(-0.08787)));
            yy = 5.769 + (((tickAnim - 4) / 6) * (-33.35998-(5.769)));
            zz = -16.36122 + (((tickAnim - 4) / 6) * (6.53294-(-16.36122)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.66469 + (((tickAnim - 10) / 5) * (-4.54675-(-0.66469)));
            yy = -33.35998 + (((tickAnim - 10) / 5) * (41.84491-(-33.35998)));
            zz = 6.53294 + (((tickAnim - 10) / 5) * (-5.06628-(6.53294)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.54675 + (((tickAnim - 15) / 5) * (15.76358-(-4.54675)));
            yy = 41.84491 + (((tickAnim - 15) / 5) * (22.19512-(41.84491)));
            zz = -5.06628 + (((tickAnim - 15) / 5) * (3.14889-(-5.06628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.05887 + (((tickAnim - 0) / 4) * (-3.83727-(-6.05887)));
            yy = -1.92816 + (((tickAnim - 0) / 4) * (55.42245-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 0) / 4) * (14.45494-(2.68165)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.83727 + (((tickAnim - 4) / 6) * (64-(-3.83727)));
            yy = 55.42245 + (((tickAnim - 4) / 6) * (0-(55.42245)));
            zz = 14.45494 + (((tickAnim - 4) / 6) * (0-(14.45494)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 64 + (((tickAnim - 10) / 2) * (84.41203-(64)));
            yy = 0 + (((tickAnim - 10) / 2) * (-23.1703-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (35.21273-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 84.41203 + (((tickAnim - 12) / 3) * (-12.77666-(84.41203)));
            yy = -23.1703 + (((tickAnim - 12) / 3) * (7.1294-(-23.1703)));
            zz = 35.21273 + (((tickAnim - 12) / 3) * (43.24693-(35.21273)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.77666 + (((tickAnim - 15) / 5) * (-6.05887-(-12.77666)));
            yy = 7.1294 + (((tickAnim - 15) / 5) * (-1.92816-(7.1294)));
            zz = 43.24693 + (((tickAnim - 15) / 5) * (2.68165-(43.24693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 4) * (0.175-(0.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.09-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 4) / 8) * (-0.45-(0.175)));
            zz = 0.09 + (((tickAnim - 4) / 8) * (0.25-(0.09)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 8) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 12) / 8) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.55946 + (((tickAnim - 0) / 5) * (19.26131-(-0.55946)));
            yy = 48.52634 + (((tickAnim - 0) / 5) * (3.64133-(48.52634)));
            zz = 0.1372 + (((tickAnim - 0) / 5) * (30.79808-(0.1372)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.26131 + (((tickAnim - 5) / 5) * (18.95402-(19.26131)));
            yy = 3.64133 + (((tickAnim - 5) / 5) * (-30.85193-(3.64133)));
            zz = 30.79808 + (((tickAnim - 5) / 5) * (-2.8377-(30.79808)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.95402 + (((tickAnim - 10) / 10) * (-0.55946-(18.95402)));
            yy = -30.85193 + (((tickAnim - 10) / 10) * (48.52634-(-30.85193)));
            zz = -2.8377 + (((tickAnim - 10) / 10) * (0.1372-(-2.8377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.66469 + (((tickAnim - 0) / 5) * (-4.54675-(-0.66469)));
            yy = 33.35998 + (((tickAnim - 0) / 5) * (-41.84491-(33.35998)));
            zz = -6.53294 + (((tickAnim - 0) / 5) * (5.06628-(-6.53294)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.54675 + (((tickAnim - 5) / 5) * (15.76358-(-4.54675)));
            yy = -41.84491 + (((tickAnim - 5) / 5) * (-22.19512-(-41.84491)));
            zz = 5.06628 + (((tickAnim - 5) / 5) * (-3.14889-(5.06628)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.76358 + (((tickAnim - 10) / 10) * (-0.66469-(15.76358)));
            yy = -22.19512 + (((tickAnim - 10) / 10) * (33.35998-(-22.19512)));
            zz = -3.14889 + (((tickAnim - 10) / 10) * (-6.53294-(-3.14889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 5) / 5) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64 + (((tickAnim - 0) / 2) * (74.84736-(64)));
            yy = 0 + (((tickAnim - 0) / 2) * (32.08689-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-11.34172-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 74.84736 + (((tickAnim - 2) / 3) * (-12.77666-(74.84736)));
            yy = 32.08689 + (((tickAnim - 2) / 3) * (-7.1294-(32.08689)));
            zz = -11.34172 + (((tickAnim - 2) / 3) * (-43.24693-(-11.34172)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.77666 + (((tickAnim - 5) / 5) * (-7.55887-(-12.77666)));
            yy = -7.1294 + (((tickAnim - 5) / 5) * (-1.92816-(-7.1294)));
            zz = -43.24693 + (((tickAnim - 5) / 5) * (2.68165-(-43.24693)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.55887 + (((tickAnim - 10) / 5) * (-0.97737-(-7.55887)));
            yy = -1.92816 + (((tickAnim - 10) / 5) * (-73.44131-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 10) / 5) * (5.6899-(2.68165)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.97737 + (((tickAnim - 15) / 5) * (64-(-0.97737)));
            yy = -73.44131 + (((tickAnim - 15) / 5) * (0-(-73.44131)));
            zz = 5.6899 + (((tickAnim - 15) / 5) * (0-(5.6899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 2) / 8) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 2) / 8) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.475-(0)));
            yy = 0.25 + (((tickAnim - 10) / 5) * (0.6-(0.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.475 + (((tickAnim - 15) / 5) * (0-(0.475)));
            yy = 0.6 + (((tickAnim - 15) / 5) * (0-(0.6)));
            zz = -0.2 + (((tickAnim - 15) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.9103 + (((tickAnim - 0) / 11) * (-11.65947-(-4.9103)));
            yy = -52.68758 + (((tickAnim - 0) / 11) * (32.93383-(-52.68758)));
            zz = 14.51389 + (((tickAnim - 0) / 11) * (5.91489-(14.51389)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.65947 + (((tickAnim - 11) / 4) * (-2.51057-(-11.65947)));
            yy = 32.93383 + (((tickAnim - 11) / 4) * (0.99855-(32.93383)));
            zz = 5.91489 + (((tickAnim - 11) / 4) * (28.76334-(5.91489)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.51057 + (((tickAnim - 15) / 5) * (-4.9103-(-2.51057)));
            yy = 0.99855 + (((tickAnim - 15) / 5) * (-52.68758-(0.99855)));
            zz = 28.76334 + (((tickAnim - 15) / 5) * (14.51389-(28.76334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.29848 + (((tickAnim - 0) / 11) * (16.91576-(19.29848)));
            yy = -3.74885 + (((tickAnim - 0) / 11) * (21.15-(-3.74885)));
            zz = -5.29491 + (((tickAnim - 0) / 11) * (7.81086-(-5.29491)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 16.91576 + (((tickAnim - 11) / 4) * (28.21762-(16.91576)));
            yy = 21.15 + (((tickAnim - 11) / 4) * (5.48668-(21.15)));
            zz = 7.81086 + (((tickAnim - 11) / 4) * (16.21744-(7.81086)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 28.21762 + (((tickAnim - 15) / 5) * (19.29848-(28.21762)));
            yy = 5.48668 + (((tickAnim - 15) / 5) * (-3.74885-(5.48668)));
            zz = 16.21744 + (((tickAnim - 15) / 5) * (-5.29491-(16.21744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.94716 + (((tickAnim - 0) / 5) * (-16.64662-(0.94716)));
            yy = -29.80469 + (((tickAnim - 0) / 5) * (-58.99737-(-29.80469)));
            zz = 10.29656 + (((tickAnim - 0) / 5) * (25.4688-(10.29656)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.64662 + (((tickAnim - 5) / 6) * (54.28635-(-16.64662)));
            yy = -58.99737 + (((tickAnim - 5) / 6) * (-24.69615-(-58.99737)));
            zz = 25.4688 + (((tickAnim - 5) / 6) * (-5.51886-(25.4688)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 54.28635 + (((tickAnim - 11) / 4) * (65.45697-(54.28635)));
            yy = -24.69615 + (((tickAnim - 11) / 4) * (20.28231-(-24.69615)));
            zz = -5.51886 + (((tickAnim - 11) / 4) * (-0.09855-(-5.51886)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 65.45697 + (((tickAnim - 15) / 5) * (0.94716-(65.45697)));
            yy = 20.28231 + (((tickAnim - 15) / 5) * (-29.80469-(20.28231)));
            zz = -0.09855 + (((tickAnim - 15) / 5) * (10.29656-(-0.09855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.65-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0.125-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 11) / 9) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 11) / 9) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.65947 + (((tickAnim - 0) / 4) * (-2.51057-(-11.65947)));
            yy = -32.93383 + (((tickAnim - 0) / 4) * (-0.99855-(-32.93383)));
            zz = -5.91489 + (((tickAnim - 0) / 4) * (-28.76334-(-5.91489)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -2.51057 + (((tickAnim - 4) / 5) * (-4.9103-(-2.51057)));
            yy = -0.99855 + (((tickAnim - 4) / 5) * (52.68758-(-0.99855)));
            zz = -28.76334 + (((tickAnim - 4) / 5) * (-14.51389-(-28.76334)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -4.9103 + (((tickAnim - 9) / 11) * (-11.65947-(-4.9103)));
            yy = 52.68758 + (((tickAnim - 9) / 11) * (-32.93383-(52.68758)));
            zz = -14.51389 + (((tickAnim - 9) / 11) * (-5.91489-(-14.51389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.91576 + (((tickAnim - 0) / 4) * (28.21762-(16.91576)));
            yy = -21.15 + (((tickAnim - 0) / 4) * (-5.48668-(-21.15)));
            zz = -7.81086 + (((tickAnim - 0) / 4) * (-16.21744-(-7.81086)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 28.21762 + (((tickAnim - 4) / 5) * (19.29848-(28.21762)));
            yy = -5.48668 + (((tickAnim - 4) / 5) * (3.74885-(-5.48668)));
            zz = -16.21744 + (((tickAnim - 4) / 5) * (5.29491-(-16.21744)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.29848 + (((tickAnim - 9) / 11) * (16.91576-(19.29848)));
            yy = 3.74885 + (((tickAnim - 9) / 11) * (-21.15-(3.74885)));
            zz = 5.29491 + (((tickAnim - 9) / 11) * (-7.81086-(5.29491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54.28635 + (((tickAnim - 0) / 4) * (65.45697-(54.28635)));
            yy = 24.69615 + (((tickAnim - 0) / 4) * (20.28231-(24.69615)));
            zz = 5.51886 + (((tickAnim - 0) / 4) * (-0.09855-(5.51886)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 65.45697 + (((tickAnim - 4) / 5) * (7.46876-(65.45697)));
            yy = 20.28231 + (((tickAnim - 4) / 5) * (-14.4173-(20.28231)));
            zz = -0.09855 + (((tickAnim - 4) / 5) * (-1.82195-(-0.09855)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 7.46876 + (((tickAnim - 9) / 6) * (-16.64662-(7.46876)));
            yy = -14.4173 + (((tickAnim - 9) / 6) * (58.99737-(-14.4173)));
            zz = -1.82195 + (((tickAnim - 9) / 6) * (-25.4688-(-1.82195)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -16.64662 + (((tickAnim - 15) / 5) * (54.28635-(-16.64662)));
            yy = 58.99737 + (((tickAnim - 15) / 5) * (24.69615-(58.99737)));
            zz = -25.4688 + (((tickAnim - 15) / 5) * (5.51886-(-25.4688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 9) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 0) / 9) * (0-(0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraMecistotrachelos entity = (EntityPrehistoricFloraMecistotrachelos) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Mecistotrachelos, Mecistotrachelos.rotateAngleX + (float) Math.toRadians(-90), Mecistotrachelos.rotateAngleY + (float) Math.toRadians(0), Mecistotrachelos.rotateAngleZ + (float) Math.toRadians(0));
        this.Mecistotrachelos.rotationPointX = this.Mecistotrachelos.rotationPointX + (float)(0);
        this.Mecistotrachelos.rotationPointY = this.Mecistotrachelos.rotationPointY - (float)(16);
        this.Mecistotrachelos.rotationPointZ = this.Mecistotrachelos.rotationPointZ + (float)(-6.825);


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*3));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.1);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(upperBody, upperBody.rotateAngleX + (float) Math.toRadians(0), upperBody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-5), upperBody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-5), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*5), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-8), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 18.95402 + (((tickAnim - 0) / 10) * (-0.55946-(18.95402)));
            yy = 30.85193 + (((tickAnim - 0) / 10) * (-48.52634-(30.85193)));
            zz = 2.8377 + (((tickAnim - 0) / 10) * (-0.1372-(2.8377)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.55946 + (((tickAnim - 10) / 5) * (19.26131-(-0.55946)));
            yy = -48.52634 + (((tickAnim - 10) / 5) * (-3.64133-(-48.52634)));
            zz = -0.1372 + (((tickAnim - 10) / 5) * (-30.79808-(-0.1372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.26131 + (((tickAnim - 15) / 5) * (18.95402-(19.26131)));
            yy = -3.64133 + (((tickAnim - 15) / 5) * (30.85193-(-3.64133)));
            zz = -30.79808 + (((tickAnim - 15) / 5) * (2.8377-(-30.79808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.76358 + (((tickAnim - 0) / 4) * (-0.08787-(15.76358)));
            yy = 22.19512 + (((tickAnim - 0) / 4) * (5.769-(22.19512)));
            zz = 3.14889 + (((tickAnim - 0) / 4) * (-16.36122-(3.14889)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.08787 + (((tickAnim - 4) / 6) * (-0.66469-(-0.08787)));
            yy = 5.769 + (((tickAnim - 4) / 6) * (-33.35998-(5.769)));
            zz = -16.36122 + (((tickAnim - 4) / 6) * (6.53294-(-16.36122)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.66469 + (((tickAnim - 10) / 5) * (-4.54675-(-0.66469)));
            yy = -33.35998 + (((tickAnim - 10) / 5) * (41.84491-(-33.35998)));
            zz = 6.53294 + (((tickAnim - 10) / 5) * (-5.06628-(6.53294)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.54675 + (((tickAnim - 15) / 5) * (15.76358-(-4.54675)));
            yy = 41.84491 + (((tickAnim - 15) / 5) * (22.19512-(41.84491)));
            zz = -5.06628 + (((tickAnim - 15) / 5) * (3.14889-(-5.06628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.05887 + (((tickAnim - 0) / 4) * (-3.83727-(-6.05887)));
            yy = -1.92816 + (((tickAnim - 0) / 4) * (55.42245-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 0) / 4) * (14.45494-(2.68165)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.83727 + (((tickAnim - 4) / 6) * (64-(-3.83727)));
            yy = 55.42245 + (((tickAnim - 4) / 6) * (0-(55.42245)));
            zz = 14.45494 + (((tickAnim - 4) / 6) * (0-(14.45494)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 64 + (((tickAnim - 10) / 2) * (84.41203-(64)));
            yy = 0 + (((tickAnim - 10) / 2) * (-23.1703-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (35.21273-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 84.41203 + (((tickAnim - 12) / 3) * (-12.77666-(84.41203)));
            yy = -23.1703 + (((tickAnim - 12) / 3) * (7.1294-(-23.1703)));
            zz = 35.21273 + (((tickAnim - 12) / 3) * (43.24693-(35.21273)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.77666 + (((tickAnim - 15) / 5) * (-6.05887-(-12.77666)));
            yy = 7.1294 + (((tickAnim - 15) / 5) * (-1.92816-(7.1294)));
            zz = 43.24693 + (((tickAnim - 15) / 5) * (2.68165-(43.24693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 4) * (0.175-(0.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.09-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 4) / 8) * (-0.45-(0.175)));
            zz = 0.09 + (((tickAnim - 4) / 8) * (0.25-(0.09)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 8) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 12) / 8) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.55946 + (((tickAnim - 0) / 5) * (19.26131-(-0.55946)));
            yy = 48.52634 + (((tickAnim - 0) / 5) * (3.64133-(48.52634)));
            zz = 0.1372 + (((tickAnim - 0) / 5) * (30.79808-(0.1372)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.26131 + (((tickAnim - 5) / 5) * (18.95402-(19.26131)));
            yy = 3.64133 + (((tickAnim - 5) / 5) * (-30.85193-(3.64133)));
            zz = 30.79808 + (((tickAnim - 5) / 5) * (-2.8377-(30.79808)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.95402 + (((tickAnim - 10) / 10) * (-0.55946-(18.95402)));
            yy = -30.85193 + (((tickAnim - 10) / 10) * (48.52634-(-30.85193)));
            zz = -2.8377 + (((tickAnim - 10) / 10) * (0.1372-(-2.8377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.66469 + (((tickAnim - 0) / 5) * (-4.54675-(-0.66469)));
            yy = 33.35998 + (((tickAnim - 0) / 5) * (-41.84491-(33.35998)));
            zz = -6.53294 + (((tickAnim - 0) / 5) * (5.06628-(-6.53294)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.54675 + (((tickAnim - 5) / 5) * (15.76358-(-4.54675)));
            yy = -41.84491 + (((tickAnim - 5) / 5) * (-22.19512-(-41.84491)));
            zz = 5.06628 + (((tickAnim - 5) / 5) * (-3.14889-(5.06628)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.76358 + (((tickAnim - 10) / 10) * (-0.66469-(15.76358)));
            yy = -22.19512 + (((tickAnim - 10) / 10) * (33.35998-(-22.19512)));
            zz = -3.14889 + (((tickAnim - 10) / 10) * (-6.53294-(-3.14889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 5) / 5) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64 + (((tickAnim - 0) / 2) * (74.84736-(64)));
            yy = 0 + (((tickAnim - 0) / 2) * (32.08689-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-11.34172-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 74.84736 + (((tickAnim - 2) / 3) * (-12.77666-(74.84736)));
            yy = 32.08689 + (((tickAnim - 2) / 3) * (-7.1294-(32.08689)));
            zz = -11.34172 + (((tickAnim - 2) / 3) * (-43.24693-(-11.34172)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.77666 + (((tickAnim - 5) / 5) * (-7.55887-(-12.77666)));
            yy = -7.1294 + (((tickAnim - 5) / 5) * (-1.92816-(-7.1294)));
            zz = -43.24693 + (((tickAnim - 5) / 5) * (2.68165-(-43.24693)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.55887 + (((tickAnim - 10) / 5) * (-0.97737-(-7.55887)));
            yy = -1.92816 + (((tickAnim - 10) / 5) * (-73.44131-(-1.92816)));
            zz = 2.68165 + (((tickAnim - 10) / 5) * (5.6899-(2.68165)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.97737 + (((tickAnim - 15) / 5) * (64-(-0.97737)));
            yy = -73.44131 + (((tickAnim - 15) / 5) * (0-(-73.44131)));
            zz = 5.6899 + (((tickAnim - 15) / 5) * (0-(5.6899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 2) / 8) * (0.25-(-0.45)));
            zz = 0.25 + (((tickAnim - 2) / 8) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0.24-(0)));
            yy = 0.25 + (((tickAnim - 10) / 3) * (1.055-(0.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.24 + (((tickAnim - 13) / 2) * (0.475-(0.24)));
            yy = 1.055 + (((tickAnim - 13) / 2) * (0.6-(1.055)));
            zz = -0.1 + (((tickAnim - 13) / 2) * (-0.2-(-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.475 + (((tickAnim - 15) / 5) * (0-(0.475)));
            yy = 0.6 + (((tickAnim - 15) / 5) * (0-(0.6)));
            zz = -0.2 + (((tickAnim - 15) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.9103 + (((tickAnim - 0) / 11) * (-11.65947-(-4.9103)));
            yy = -52.68758 + (((tickAnim - 0) / 11) * (32.93383-(-52.68758)));
            zz = 14.51389 + (((tickAnim - 0) / 11) * (5.91489-(14.51389)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.65947 + (((tickAnim - 11) / 4) * (-2.51057-(-11.65947)));
            yy = 32.93383 + (((tickAnim - 11) / 4) * (0.99855-(32.93383)));
            zz = 5.91489 + (((tickAnim - 11) / 4) * (28.76334-(5.91489)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.51057 + (((tickAnim - 15) / 5) * (-4.9103-(-2.51057)));
            yy = 0.99855 + (((tickAnim - 15) / 5) * (-52.68758-(0.99855)));
            zz = 28.76334 + (((tickAnim - 15) / 5) * (14.51389-(28.76334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.29848 + (((tickAnim - 0) / 11) * (16.91576-(19.29848)));
            yy = -3.74885 + (((tickAnim - 0) / 11) * (21.15-(-3.74885)));
            zz = -5.29491 + (((tickAnim - 0) / 11) * (7.81086-(-5.29491)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 16.91576 + (((tickAnim - 11) / 4) * (28.21762-(16.91576)));
            yy = 21.15 + (((tickAnim - 11) / 4) * (5.48668-(21.15)));
            zz = 7.81086 + (((tickAnim - 11) / 4) * (16.21744-(7.81086)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 28.21762 + (((tickAnim - 15) / 5) * (19.29848-(28.21762)));
            yy = 5.48668 + (((tickAnim - 15) / 5) * (-3.74885-(5.48668)));
            zz = 16.21744 + (((tickAnim - 15) / 5) * (-5.29491-(16.21744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.94716 + (((tickAnim - 0) / 5) * (-16.64662-(0.94716)));
            yy = -29.80469 + (((tickAnim - 0) / 5) * (-58.99737-(-29.80469)));
            zz = 10.29656 + (((tickAnim - 0) / 5) * (25.4688-(10.29656)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.64662 + (((tickAnim - 5) / 6) * (54.28635-(-16.64662)));
            yy = -58.99737 + (((tickAnim - 5) / 6) * (-24.69615-(-58.99737)));
            zz = 25.4688 + (((tickAnim - 5) / 6) * (-5.51886-(25.4688)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 54.28635 + (((tickAnim - 11) / 4) * (65.45697-(54.28635)));
            yy = -24.69615 + (((tickAnim - 11) / 4) * (20.28231-(-24.69615)));
            zz = -5.51886 + (((tickAnim - 11) / 4) * (-0.09855-(-5.51886)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 65.45697 + (((tickAnim - 15) / 5) * (0.94716-(65.45697)));
            yy = 20.28231 + (((tickAnim - 15) / 5) * (-29.80469-(20.28231)));
            zz = -0.09855 + (((tickAnim - 15) / 5) * (10.29656-(-0.09855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.65-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0.125-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 11) / 9) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 11) / 9) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.65947 + (((tickAnim - 0) / 4) * (-2.51057-(-11.65947)));
            yy = -32.93383 + (((tickAnim - 0) / 4) * (-0.99855-(-32.93383)));
            zz = -5.91489 + (((tickAnim - 0) / 4) * (-28.76334-(-5.91489)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -2.51057 + (((tickAnim - 4) / 5) * (-4.9103-(-2.51057)));
            yy = -0.99855 + (((tickAnim - 4) / 5) * (52.68758-(-0.99855)));
            zz = -28.76334 + (((tickAnim - 4) / 5) * (-14.51389-(-28.76334)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -4.9103 + (((tickAnim - 9) / 11) * (-11.65947-(-4.9103)));
            yy = 52.68758 + (((tickAnim - 9) / 11) * (-32.93383-(52.68758)));
            zz = -14.51389 + (((tickAnim - 9) / 11) * (-5.91489-(-14.51389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.91576 + (((tickAnim - 0) / 4) * (28.21762-(16.91576)));
            yy = -21.15 + (((tickAnim - 0) / 4) * (-5.48668-(-21.15)));
            zz = -7.81086 + (((tickAnim - 0) / 4) * (-16.21744-(-7.81086)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 28.21762 + (((tickAnim - 4) / 5) * (19.29848-(28.21762)));
            yy = -5.48668 + (((tickAnim - 4) / 5) * (3.74885-(-5.48668)));
            zz = -16.21744 + (((tickAnim - 4) / 5) * (5.29491-(-16.21744)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.29848 + (((tickAnim - 9) / 11) * (16.91576-(19.29848)));
            yy = 3.74885 + (((tickAnim - 9) / 11) * (-21.15-(3.74885)));
            zz = 5.29491 + (((tickAnim - 9) / 11) * (-7.81086-(5.29491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54.28635 + (((tickAnim - 0) / 4) * (65.45697-(54.28635)));
            yy = 24.69615 + (((tickAnim - 0) / 4) * (20.28231-(24.69615)));
            zz = 5.51886 + (((tickAnim - 0) / 4) * (-0.09855-(5.51886)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 65.45697 + (((tickAnim - 4) / 5) * (7.46876-(65.45697)));
            yy = 20.28231 + (((tickAnim - 4) / 5) * (-14.4173-(20.28231)));
            zz = -0.09855 + (((tickAnim - 4) / 5) * (-1.82195-(-0.09855)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 7.46876 + (((tickAnim - 9) / 6) * (-16.64662-(7.46876)));
            yy = -14.4173 + (((tickAnim - 9) / 6) * (58.99737-(-14.4173)));
            zz = -1.82195 + (((tickAnim - 9) / 6) * (-25.4688-(-1.82195)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -16.64662 + (((tickAnim - 15) / 5) * (54.28635-(-16.64662)));
            yy = 58.99737 + (((tickAnim - 15) / 5) * (24.69615-(58.99737)));
            zz = -25.4688 + (((tickAnim - 15) / 5) * (5.51886-(-25.4688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 9) * (0-(0.65)));
            zz = 0.125 + (((tickAnim - 0) / 9) * (0-(0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
