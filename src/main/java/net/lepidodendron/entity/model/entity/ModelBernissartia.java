package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBernissartia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBernissartia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperJaw;
    private final AdvancedModelRenderer upperJaw2;
    private final AdvancedModelRenderer upperTeethL3;
    private final AdvancedModelRenderer upperTeethR3;
    private final AdvancedModelRenderer upperJawSlopeL2;
    private final AdvancedModelRenderer upperTeethL2;
    private final AdvancedModelRenderer upperJawSlopeR2;
    private final AdvancedModelRenderer upperTeethR2;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftUpperMasseter;
    private final AdvancedModelRenderer rightUpperMasseter;
    private final AdvancedModelRenderer headSlope;
    private final AdvancedModelRenderer headSlope_r1;
    private final AdvancedModelRenderer upperJawSlopeL;
    private final AdvancedModelRenderer upperTeethL;
    private final AdvancedModelRenderer upperJawSlopeR;
    private final AdvancedModelRenderer upperTeethR;
    private final AdvancedModelRenderer lowerJaw;
    private final AdvancedModelRenderer lowerJaw1;
    private final AdvancedModelRenderer lowerJaw2;
    private final AdvancedModelRenderer lowerTeethL4;
    private final AdvancedModelRenderer lowerTeethR4;
    private final AdvancedModelRenderer lowerFrontTeeth;
    private final AdvancedModelRenderer lowerJawSlopeL2;
    private final AdvancedModelRenderer lowerTeethL2;
    private final AdvancedModelRenderer lowerTeethL3;
    private final AdvancedModelRenderer lowerJawSlopeR2;
    private final AdvancedModelRenderer lowerTeethR2;
    private final AdvancedModelRenderer lowerTeethR3;
    private final AdvancedModelRenderer lowerJawUnderside;
    private final AdvancedModelRenderer leftLowerMasseter;
    private final AdvancedModelRenderer rightLowerMasseter;
    private final AdvancedModelRenderer lowerJawSlopeL;
    private final AdvancedModelRenderer lowerTeethL;
    private final AdvancedModelRenderer lowerJawSlopeR;
    private final AdvancedModelRenderer lowerTeethR;
    private final AdvancedModelRenderer headTop;
    private final AdvancedModelRenderer headTop2;
    private final AdvancedModelRenderer dorsalScutes;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer dorsalScutes2;
    private final AdvancedModelRenderer leftUpperArm;
    private final AdvancedModelRenderer leftLowerArm;
    private final AdvancedModelRenderer leftFrontFoot;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer rightLowerArm;
    private final AdvancedModelRenderer rightFrontFoot;
    private final AdvancedModelRenderer dorsalScutes3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tailFluke2;
    private final AdvancedModelRenderer tailFluke;
    private final AdvancedModelRenderer tailScutesL2;
    private final AdvancedModelRenderer tailScutesR2;
    private final AdvancedModelRenderer dorsalScutes5;
    private final AdvancedModelRenderer tailScutesL;
    private final AdvancedModelRenderer tailScutesR;
    private final AdvancedModelRenderer dorsalScutes4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftHindFoot;
    private final AdvancedModelRenderer RightLeg;
    private final AdvancedModelRenderer RightLeg2;
    private final AdvancedModelRenderer rightHindFoot;

    private ModelAnimator animator;

    public ModelBernissartia() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 21.0F, 2.8F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0637F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 32, 0, -2.0F, -1.0F, -2.5F, 4, 3, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -2.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0637F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 9, 0, -2.5F, -1.0F, -5.5F, 5, 4, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3F, -5.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1061F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 11, -2.0F, -0.5F, -3.5F, 4, 3, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2F, -3.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.2335F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 31, 45, -1.5F, -0.5F, -2.5F, 3, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2335F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 47, 22, -1.5F, -0.5F, -1.0F, 3, 1, 1, 0.0F, false));

        this.upperJaw = new AdvancedModelRenderer(this);
        this.upperJaw.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.head.addChild(upperJaw);
        this.upperJaw.cubeList.add(new ModelBox(upperJaw, 28, 14, -0.99F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.upperJaw2 = new AdvancedModelRenderer(this);
        this.upperJaw2.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.upperJaw.addChild(upperJaw2);
        this.setRotateAngle(upperJaw2, -0.1169F, 0.0F, 0.0F);
        this.upperJaw2.cubeList.add(new ModelBox(upperJaw2, 38, 19, -0.49F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.upperTeethL3 = new AdvancedModelRenderer(this);
        this.upperTeethL3.setRotationPoint(-0.08F, -0.8F, -3.0F);
        this.upperJaw2.addChild(upperTeethL3);
        this.setRotateAngle(upperTeethL3, 0.1274F, -0.3396F, 0.0F);
        this.upperTeethL3.cubeList.add(new ModelBox(upperTeethL3, 29, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.upperTeethR3 = new AdvancedModelRenderer(this);
        this.upperTeethR3.setRotationPoint(0.08F, -0.8F, -3.0F);
        this.upperJaw2.addChild(upperTeethR3);
        this.setRotateAngle(upperTeethR3, 0.1274F, 0.3396F, 0.0F);
        this.upperTeethR3.cubeList.add(new ModelBox(upperTeethR3, 26, 2, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.upperJawSlopeL2 = new AdvancedModelRenderer(this);
        this.upperJawSlopeL2.setRotationPoint(-0.99F, 1.01F, -3.0F);
        this.upperJaw.addChild(upperJawSlopeL2);
        this.setRotateAngle(upperJawSlopeL2, -0.1152F, -0.2335F, 0.0175F);
        this.upperJawSlopeL2.cubeList.add(new ModelBox(upperJawSlopeL2, 19, 22, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.upperTeethL2 = new AdvancedModelRenderer(this);
        this.upperTeethL2.setRotationPoint(0.13F, -0.85F, -1.5F);
        this.upperJawSlopeL2.addChild(upperTeethL2);
        this.setRotateAngle(upperTeethL2, -0.2335F, -0.0637F, 0.0637F);
        this.upperTeethL2.cubeList.add(new ModelBox(upperTeethL2, 33, 1, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.upperJawSlopeR2 = new AdvancedModelRenderer(this);
        this.upperJawSlopeR2.setRotationPoint(1.0F, 1.01F, -3.0F);
        this.upperJaw.addChild(upperJawSlopeR2);
        this.setRotateAngle(upperJawSlopeR2, -0.1152F, 0.2335F, -0.0175F);
        this.upperJawSlopeR2.cubeList.add(new ModelBox(upperJawSlopeR2, 11, 42, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.upperTeethR2 = new AdvancedModelRenderer(this);
        this.upperTeethR2.setRotationPoint(-0.13F, -0.85F, -1.5F);
        this.upperJawSlopeR2.addChild(upperTeethR2);
        this.setRotateAngle(upperTeethR2, -0.2335F, 0.0637F, -0.0637F);
        this.upperTeethR2.cubeList.add(new ModelBox(upperTeethR2, 3, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(-0.07F, 0.25F, -1.3F);
        this.upperJaw.addChild(leftEye);
        this.setRotateAngle(leftEye, -0.2335F, -0.3821F, 0.1911F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 8, 3, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(0.07F, 0.25F, -1.3F);
        this.upperJaw.addChild(rightEye);
        this.setRotateAngle(rightEye, -0.2335F, 0.3821F, -0.1911F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 6, 0, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftUpperMasseter = new AdvancedModelRenderer(this);
        this.leftUpperMasseter.setRotationPoint(0.0F, 0.9F, -1.1F);
        this.upperJaw.addChild(leftUpperMasseter);
        this.setRotateAngle(leftUpperMasseter, 0.4245F, -0.1485F, -0.1061F);
        this.leftUpperMasseter.cubeList.add(new ModelBox(leftUpperMasseter, 16, 44, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightUpperMasseter = new AdvancedModelRenderer(this);
        this.rightUpperMasseter.setRotationPoint(0.0F, 0.9F, -1.1F);
        this.upperJaw.addChild(rightUpperMasseter);
        this.setRotateAngle(rightUpperMasseter, 0.4245F, 0.1485F, 0.1061F);
        this.rightUpperMasseter.cubeList.add(new ModelBox(rightUpperMasseter, 27, 26, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.headSlope = new AdvancedModelRenderer(this);
        this.headSlope.setRotationPoint(0.0F, -0.3F, -1.8F);
        this.upperJaw.addChild(headSlope);
        this.setRotateAngle(headSlope, 0.3042F, 0.0F, 0.0F);
        this.headSlope.cubeList.add(new ModelBox(headSlope, 48, 3, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.headSlope_r1 = new AdvancedModelRenderer(this);
        this.headSlope_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headSlope.addChild(headSlope_r1);
        this.setRotateAngle(headSlope_r1, -0.4232F, 0.0F, 0.0F);
        this.headSlope_r1.cubeList.add(new ModelBox(headSlope_r1, 52, 1, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.upperJawSlopeL = new AdvancedModelRenderer(this);
        this.upperJawSlopeL.setRotationPoint(-1.5F, 0.01F, -1.0F);
        this.head.addChild(upperJawSlopeL);
        this.setRotateAngle(upperJawSlopeL, -0.0017F, -0.1911F, 0.0F);
        this.upperJawSlopeL.cubeList.add(new ModelBox(upperJawSlopeL, 38, 25, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.upperTeethL = new AdvancedModelRenderer(this);
        this.upperTeethL.setRotationPoint(0.1F, -0.25F, -2.1F);
        this.upperJawSlopeL.addChild(upperTeethL);
        this.setRotateAngle(upperTeethL, -0.1061F, 0.0F, 0.0F);
        this.upperTeethL.cubeList.add(new ModelBox(upperTeethL, 11, 0, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.upperJawSlopeR = new AdvancedModelRenderer(this);
        this.upperJawSlopeR.setRotationPoint(1.5F, 0.01F, -1.0F);
        this.head.addChild(upperJawSlopeR);
        this.setRotateAngle(upperJawSlopeR, -0.0017F, 0.1698F, 0.0F);
        this.upperJawSlopeR.cubeList.add(new ModelBox(upperJawSlopeR, 0, 5, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.upperTeethR = new AdvancedModelRenderer(this);
        this.upperTeethR.setRotationPoint(-0.1F, -0.25F, -2.1F);
        this.upperJawSlopeR.addChild(upperTeethR);
        this.setRotateAngle(upperTeethR, -0.1061F, 0.0F, 0.0F);
        this.upperTeethR.cubeList.add(new ModelBox(upperTeethR, 3, 1, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.lowerJaw = new AdvancedModelRenderer(this);
        this.lowerJaw.setRotationPoint(-0.01F, 0.5F, 0.0F);
        this.head.addChild(lowerJaw);
        this.lowerJaw.cubeList.add(new ModelBox(lowerJaw, 27, 41, -1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.lowerJaw1 = new AdvancedModelRenderer(this);
        this.lowerJaw1.setRotationPoint(0.01F, 1.0F, -1.0F);
        this.lowerJaw.addChild(lowerJaw1);
        this.setRotateAngle(lowerJaw1, -0.0637F, 0.0F, 0.0F);
        this.lowerJaw1.cubeList.add(new ModelBox(lowerJaw1, 20, 46, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.lowerJaw2 = new AdvancedModelRenderer(this);
        this.lowerJaw2.setRotationPoint(-0.01F, 0.0F, -3.0F);
        this.lowerJaw1.addChild(lowerJaw2);
        this.setRotateAngle(lowerJaw2, -0.1169F, 0.0F, 0.0F);
        this.lowerJaw2.cubeList.add(new ModelBox(lowerJaw2, 30, 28, -0.48F, -0.99F, -3.14F, 1, 1, 4, -0.005F, false));

        this.lowerTeethL4 = new AdvancedModelRenderer(this);
        this.lowerTeethL4.setRotationPoint(-0.4F, 0.0F, -2.4F);
        this.lowerJaw2.addChild(lowerTeethL4);
        this.setRotateAngle(lowerTeethL4, 0.6369F, -0.0424F, -0.1061F);
        this.lowerTeethL4.cubeList.add(new ModelBox(lowerTeethL4, 6, 5, 0.02F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.lowerTeethR4 = new AdvancedModelRenderer(this);
        this.lowerTeethR4.setRotationPoint(0.41F, 0.0F, -2.4F);
        this.lowerJaw2.addChild(lowerTeethR4);
        this.setRotateAngle(lowerTeethR4, 0.6369F, 0.0424F, 0.1061F);
        this.lowerTeethR4.cubeList.add(new ModelBox(lowerTeethR4, 8, 10, 0.01F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.lowerFrontTeeth = new AdvancedModelRenderer(this);
        this.lowerFrontTeeth.setRotationPoint(0.01F, -0.7F, -2.17F);
        this.lowerJaw2.addChild(lowerFrontTeeth);
        this.setRotateAngle(lowerFrontTeeth, 1.1675F, 0.0F, 0.0F);
        this.lowerFrontTeeth.cubeList.add(new ModelBox(lowerFrontTeeth, 11, 0, -0.49F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.lowerJawSlopeL2 = new AdvancedModelRenderer(this);
        this.lowerJawSlopeL2.setRotationPoint(-1.0F, -0.01F, -3.0F);
        this.lowerJaw1.addChild(lowerJawSlopeL2);
        this.setRotateAngle(lowerJawSlopeL2, -0.1152F, -0.2546F, 0.0279F);
        this.lowerJawSlopeL2.cubeList.add(new ModelBox(lowerJawSlopeL2, 20, 25, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.lowerTeethL2 = new AdvancedModelRenderer(this);
        this.lowerTeethL2.setRotationPoint(0.13F, -0.3F, -0.6F);
        this.lowerJawSlopeL2.addChild(lowerTeethL2);
        this.setRotateAngle(lowerTeethL2, -0.0213F, 0.1061F, 0.0F);
        this.lowerTeethL2.cubeList.add(new ModelBox(lowerTeethL2, 0, 4, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerTeethL3 = new AdvancedModelRenderer(this);
        this.lowerTeethL3.setRotationPoint(0.07F, -0.08F, -1.5F);
        this.lowerJawSlopeL2.addChild(lowerTeethL3);
        this.setRotateAngle(lowerTeethL3, 0.1061F, 0.1061F, 0.0F);
        this.lowerTeethL3.cubeList.add(new ModelBox(lowerTeethL3, 11, 10, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerJawSlopeR2 = new AdvancedModelRenderer(this);
        this.lowerJawSlopeR2.setRotationPoint(1.0F, -0.01F, -3.0F);
        this.lowerJaw1.addChild(lowerJawSlopeR2);
        this.setRotateAngle(lowerJawSlopeR2, -0.1152F, 0.2546F, -0.0279F);
        this.lowerJawSlopeR2.cubeList.add(new ModelBox(lowerJawSlopeR2, 10, 18, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.lowerTeethR2 = new AdvancedModelRenderer(this);
        this.lowerTeethR2.setRotationPoint(-0.13F, -0.3F, -0.6F);
        this.lowerJawSlopeR2.addChild(lowerTeethR2);
        this.setRotateAngle(lowerTeethR2, -0.0213F, -0.1061F, 0.0F);
        this.lowerTeethR2.cubeList.add(new ModelBox(lowerTeethR2, 0, 9, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerTeethR3 = new AdvancedModelRenderer(this);
        this.lowerTeethR3.setRotationPoint(-0.07F, -0.08F, -1.5F);
        this.lowerJawSlopeR2.addChild(lowerTeethR3);
        this.setRotateAngle(lowerTeethR3, 0.1061F, -0.1061F, 0.0F);
        this.lowerTeethR3.cubeList.add(new ModelBox(lowerTeethR3, 26, 0, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerJawUnderside = new AdvancedModelRenderer(this);
        this.lowerJawUnderside.setRotationPoint(0.0F, 0.1F, -2.4F);
        this.lowerJaw1.addChild(lowerJawUnderside);
        this.setRotateAngle(lowerJawUnderside, -0.0848F, 0.0F, 0.0F);
        this.lowerJawUnderside.cubeList.add(new ModelBox(lowerJawUnderside, 27, 8, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.leftLowerMasseter = new AdvancedModelRenderer(this);
        this.leftLowerMasseter.setRotationPoint(0.0F, -0.9F, -1.2F);
        this.lowerJaw1.addChild(leftLowerMasseter);
        this.setRotateAngle(leftLowerMasseter, -0.4245F, -0.1485F, 0.1061F);
        this.leftLowerMasseter.cubeList.add(new ModelBox(leftLowerMasseter, 17, 18, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightLowerMasseter = new AdvancedModelRenderer(this);
        this.rightLowerMasseter.setRotationPoint(0.0F, -0.9F, -1.2F);
        this.lowerJaw1.addChild(rightLowerMasseter);
        this.setRotateAngle(rightLowerMasseter, -0.4245F, 0.1485F, -0.1061F);
        this.rightLowerMasseter.cubeList.add(new ModelBox(rightLowerMasseter, 21, 42, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.lowerJawSlopeL = new AdvancedModelRenderer(this);
        this.lowerJawSlopeL.setRotationPoint(-1.5F, 1.0F, -1.0F);
        this.lowerJaw.addChild(lowerJawSlopeL);
        this.setRotateAngle(lowerJawSlopeL, -0.062F, -0.1911F, 0.0F);
        this.lowerJawSlopeL.cubeList.add(new ModelBox(lowerJawSlopeL, 20, 34, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.lowerTeethL = new AdvancedModelRenderer(this);
        this.lowerTeethL.setRotationPoint(0.12F, -0.25F, -3.1F);
        this.lowerJawSlopeL.addChild(lowerTeethL);
        this.setRotateAngle(lowerTeethL, -0.1911F, 0.0F, 0.0F);
        this.lowerTeethL.cubeList.add(new ModelBox(lowerTeethL, 0, 2, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.lowerJawSlopeR = new AdvancedModelRenderer(this);
        this.lowerJawSlopeR.setRotationPoint(1.5F, 1.0F, -1.0F);
        this.lowerJaw.addChild(lowerJawSlopeR);
        this.setRotateAngle(lowerJawSlopeR, -0.062F, 0.1911F, 0.0F);
        this.lowerJawSlopeR.cubeList.add(new ModelBox(lowerJawSlopeR, 32, 23, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.lowerTeethR = new AdvancedModelRenderer(this);
        this.lowerTeethR.setRotationPoint(-0.12F, -0.25F, -3.1F);
        this.lowerJawSlopeR.addChild(lowerTeethR);
        this.setRotateAngle(lowerTeethR, -0.1911F, 0.0F, 0.0F);
        this.lowerTeethR.cubeList.add(new ModelBox(lowerTeethR, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.headTop = new AdvancedModelRenderer(this);
        this.headTop.setRotationPoint(0.01F, -0.5F, -1.97F);
        this.head.addChild(headTop);
        this.setRotateAngle(headTop, 0.1911F, 0.0F, 0.0F);
        this.headTop.cubeList.add(new ModelBox(headTop, 45, 25, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.headTop2 = new AdvancedModelRenderer(this);
        this.headTop2.setRotationPoint(-0.01F, 0.0F, 1.0F);
        this.headTop.addChild(headTop2);
        this.setRotateAngle(headTop2, -0.1485F, 0.0F, 0.0F);
        this.headTop2.cubeList.add(new ModelBox(headTop2, 9, 38, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.dorsalScutes = new AdvancedModelRenderer(this);
        this.dorsalScutes.setRotationPoint(0.0F, -0.7F, 0.01F);
        this.neck.addChild(dorsalScutes);
        this.dorsalScutes.cubeList.add(new ModelBox(dorsalScutes, 43, 29, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.01F, 1.1F, 0.0F);
        this.neck.addChild(throat);
        this.setRotateAngle(throat, -0.0637F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 36, 8, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.dorsalScutes2 = new AdvancedModelRenderer(this);
        this.dorsalScutes2.setRotationPoint(0.01F, -0.8F, 0.01F);
        this.body2.addChild(dorsalScutes2);
        this.setRotateAngle(dorsalScutes2, 0.0424F, 0.0F, 0.0F);
        this.dorsalScutes2.cubeList.add(new ModelBox(dorsalScutes2, 34, 33, -1.0F, 0.0F, -3.5F, 2, 1, 4, 0.0F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(-1.7F, 1.7F, -2.3F);
        this.body2.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, 0.0F, -0.8915F, 0.1274F);
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 0, 10, -1.0F, -0.5F, -0.5F, 2, 1, 3, 0.0F, false));

        this.leftLowerArm = new AdvancedModelRenderer(this);
        this.leftLowerArm.setRotationPoint(0.0F, 0.1F, 2.2F);
        this.leftUpperArm.addChild(leftLowerArm);
        this.setRotateAngle(leftLowerArm, -0.0637F, 1.2736F, 0.1698F);
        this.leftLowerArm.cubeList.add(new ModelBox(leftLowerArm, 0, 20, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftFrontFoot = new AdvancedModelRenderer(this);
        this.leftFrontFoot.setRotationPoint(0.0F, 1.9F, -0.7F);
        this.leftLowerArm.addChild(leftFrontFoot);
        this.setRotateAngle(leftFrontFoot, 0.3396F, -0.1061F, -0.2546F);
        this.leftFrontFoot.cubeList.add(new ModelBox(leftFrontFoot, 5, 26, -1.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(1.7F, 1.7F, -2.3F);
        this.body2.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, 0.0F, 0.8915F, -0.1274F);
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 0, 15, -1.0F, -0.5F, -0.5F, 2, 1, 3, 0.0F, false));

        this.rightLowerArm = new AdvancedModelRenderer(this);
        this.rightLowerArm.setRotationPoint(0.0F, 0.1F, 2.2F);
        this.rightUpperArm.addChild(rightLowerArm);
        this.setRotateAngle(rightLowerArm, -0.0637F, -1.2736F, -0.1698F);
        this.rightLowerArm.cubeList.add(new ModelBox(rightLowerArm, 12, 22, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightFrontFoot = new AdvancedModelRenderer(this);
        this.rightFrontFoot.setRotationPoint(0.0F, 1.9F, -0.7F);
        this.rightLowerArm.addChild(rightFrontFoot);
        this.setRotateAngle(rightFrontFoot, 0.3396F, 0.1061F, 0.2546F);
        this.rightFrontFoot.cubeList.add(new ModelBox(rightFrontFoot, 13, 27, -1.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.dorsalScutes3 = new AdvancedModelRenderer(this);
        this.dorsalScutes3.setRotationPoint(0.0F, -1.2F, 0.01F);
        this.body.addChild(dorsalScutes3);
        this.dorsalScutes3.cubeList.add(new ModelBox(dorsalScutes3, 41, 8, -1.5F, 0.0F, -5.5F, 3, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1274F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 45, -1.5F, -0.5F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.01F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0848F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 38, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.01F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2122F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 46, -0.5F, -0.5F, 0.0F, 1, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.01F, 0.4F, 3.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0424F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 37, -0.49F, 0.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.tailFluke2 = new AdvancedModelRenderer(this);
        this.tailFluke2.setRotationPoint(0.0F, 0.5F, 0.05F);
        this.tail4.addChild(tailFluke2);
        this.setRotateAngle(tailFluke2, -0.0848F, 0.0F, 0.0F);
        this.tailFluke2.cubeList.add(new ModelBox(tailFluke2, 40, 11, 0.0F, -2.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.tailFluke = new AdvancedModelRenderer(this);
        this.tailFluke.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.tail3.addChild(tailFluke);
        this.setRotateAngle(tailFluke, 0.0213F, 0.0F, 0.0F);
        this.tailFluke.cubeList.add(new ModelBox(tailFluke, 31, 16, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.tailScutesL2 = new AdvancedModelRenderer(this);
        this.tailScutesL2.setRotationPoint(-0.6F, 0.2F, 0.6F);
        this.tail2.addChild(tailScutesL2);
        this.setRotateAngle(tailScutesL2, 0.0637F, 0.1485F, 0.0F);
        this.tailScutesL2.cubeList.add(new ModelBox(tailScutesL2, 24, 16, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tailScutesR2 = new AdvancedModelRenderer(this);
        this.tailScutesR2.setRotationPoint(0.6F, 0.2F, 0.6F);
        this.tail2.addChild(tailScutesR2);
        this.setRotateAngle(tailScutesR2, 0.0637F, -0.1485F, 0.0F);
        this.tailScutesR2.cubeList.add(new ModelBox(tailScutesR2, 31, 19, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.dorsalScutes5 = new AdvancedModelRenderer(this);
        this.dorsalScutes5.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.tail.addChild(dorsalScutes5);
        this.setRotateAngle(dorsalScutes5, -0.0424F, 0.0F, 0.0F);
        this.dorsalScutes5.cubeList.add(new ModelBox(dorsalScutes5, 20, 29, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tailScutesL = new AdvancedModelRenderer(this);
        this.tailScutesL.setRotationPoint(-0.9F, 0.4F, 0.0F);
        this.tail.addChild(tailScutesL);
        this.setRotateAngle(tailScutesL, 0.0637F, 0.1061F, 0.0F);
        this.tailScutesL.cubeList.add(new ModelBox(tailScutesL, 26, 21, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tailScutesR = new AdvancedModelRenderer(this);
        this.tailScutesR.setRotationPoint(0.9F, 0.4F, 0.0F);
        this.tail.addChild(tailScutesR);
        this.setRotateAngle(tailScutesR, 0.0637F, -0.1061F, 0.0F);
        this.tailScutesR.cubeList.add(new ModelBox(tailScutesR, 24, 18, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.dorsalScutes4 = new AdvancedModelRenderer(this);
        this.dorsalScutes4.setRotationPoint(0.0F, -1.2F, 0.01F);
        this.hips.addChild(dorsalScutes4);
        this.setRotateAngle(dorsalScutes4, -0.0637F, 0.0F, 0.0F);
        this.dorsalScutes4.cubeList.add(new ModelBox(dorsalScutes4, 25, 35, -1.0F, 0.0F, -2.5F, 2, 1, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(-1.5F, 0.84F, 0.3F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3183F, 0.743F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 31, -0.5F, -1.0F, -3.3F, 1, 2, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 0.7F, -2.8F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3609F, -0.1911F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 25, -0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F, false));

        this.leftHindFoot = new AdvancedModelRenderer(this);
        this.leftHindFoot.setRotationPoint(0.0F, 2.43F, 0.3F);
        this.leftLeg2.addChild(leftHindFoot);
        this.setRotateAngle(leftHindFoot, 0.0213F, 0.0F, -0.0424F);
        this.leftHindFoot.cubeList.add(new ModelBox(leftHindFoot, 10, 34, -1.0F, 0.0F, -2.8F, 2, 0, 3, 0.0F, false));

        this.RightLeg = new AdvancedModelRenderer(this);
        this.RightLeg.setRotationPoint(1.5F, 0.84F, 0.3F);
        this.hips.addChild(RightLeg);
        this.setRotateAngle(RightLeg, -0.3183F, -0.743F, 0.0F);
        this.RightLeg.cubeList.add(new ModelBox(RightLeg, 8, 27, -0.5F, -1.0F, -3.3F, 1, 2, 4, 0.0F, false));

        this.RightLeg2 = new AdvancedModelRenderer(this);
        this.RightLeg2.setRotationPoint(0.0F, 0.7F, -2.8F);
        this.RightLeg.addChild(RightLeg2);
        this.setRotateAngle(RightLeg2, 0.3609F, 0.1911F, 0.0F);
        this.RightLeg2.cubeList.add(new ModelBox(RightLeg2, 6, 20, -0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F, false));

        this.rightHindFoot = new AdvancedModelRenderer(this);
        this.rightHindFoot.setRotationPoint(0.0F, 2.43F, 0.3F);
        this.RightLeg2.addChild(rightHindFoot);
        this.setRotateAngle(rightHindFoot, 0.0213F, 0.0F, 0.0424F);
        this.rightHindFoot.cubeList.add(new ModelBox(rightHindFoot, 15, 33, -1.0F, 0.0F, -2.8F, 2, 0, 3, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.0F;
        this.root.offsetX = -0.038F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(18);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.33F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.root.offsetY = 0.0F;

        EntityPrehistoricFloraBernissartia proteros = (EntityPrehistoricFloraBernissartia) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBernissartia ee = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.3125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.0625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.3125 + (((tickAnim - 3) / 4) * (-4.3386-(-13.3125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.2048-(0)));
            zz = -1.0625 + (((tickAnim - 3) / 4) * (-5.8262-(-1.0625)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.3386 + (((tickAnim - 7) / 3) * (-6.75-(-4.3386)));
            yy = 0.2048 + (((tickAnim - 7) / 3) * (0-(0.2048)));
            zz = -5.8262 + (((tickAnim - 7) / 3) * (-4.25-(-5.8262)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 10) / 4) * (-9.4063-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 4) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -9.4063 + (((tickAnim - 14) / 7) * (-8.4063-(-9.4063)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 14) / 7) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -8.4063 + (((tickAnim - 21) / 6) * (-13.3125-(-8.4063)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 21) / 6) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -13.3125 + (((tickAnim - 27) / 4) * (0-(-13.3125)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 27) / 4) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.9689-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.5076-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.6432-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (27-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (0-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-12.25-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27 + (((tickAnim - 10) / 4) * (-12.7269-(27)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.772-(0)));
            zz = -12.25 + (((tickAnim - 10) / 4) * (3.4139-(-12.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.7269 + (((tickAnim - 14) / 4) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 14) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 14) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.5 + (((tickAnim - 18) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 21) / 3) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.772-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (3.4139-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.7269 + (((tickAnim - 24) / 4) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 24) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 24) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 7) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 14) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 29.25 + (((tickAnim - 24) / 4) * (0-(29.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 8) * (0-(36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*60-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*60 + (((tickAnim - 7) / 2) * (-129.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*60)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -129.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-129.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 50 + (((tickAnim - 7) / 2) * (0-(50)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.7884-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7.4586-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.0514-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.7884 + (((tickAnim - 15) / 17) * (0-(-0.7884)));
            yy = 7.4586 + (((tickAnim - 15) / 17) * (-3.75-(7.4586)));
            zz = -6.0514 + (((tickAnim - 15) / 17) * (0-(-6.0514)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -3.75 + (((tickAnim - 32) / 18) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.8313-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.7211-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.0853-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.8313 + (((tickAnim - 15) / 17) * (0-(-0.8313)));
            yy = -11.7211 + (((tickAnim - 15) / 17) * (6.5-(-11.7211)));
            zz = 4.0853 + (((tickAnim - 15) / 17) * (0-(4.0853)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 6.5 + (((tickAnim - 32) / 18) * (0-(6.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (-3.5-(0)));
            zz = 1.75 + (((tickAnim - 15) / 17) * (0-(1.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -3.5 + (((tickAnim - 32) / 18) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -9.5 + (((tickAnim - 15) / 17) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -9.5 + (((tickAnim - 32) / 18) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -3.25 + (((tickAnim - 15) / 17) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.5213-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.3754-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.7615-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.5213 + (((tickAnim - 15) / 17) * (0-(-0.5213)));
            yy = -5.3754 + (((tickAnim - 15) / 17) * (3.5-(-5.3754)));
            zz = 5.7615 + (((tickAnim - 15) / 17) * (0-(5.7615)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 3.5 + (((tickAnim - 32) / 18) * (0-(3.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -5.75 + (((tickAnim - 15) / 17) * (5.5-(-5.75)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 5.5 + (((tickAnim - 32) / 18) * (0-(5.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.6793-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-13.1318-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.0691-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -4.6793 + (((tickAnim - 15) / 17) * (0-(-4.6793)));
            yy = -13.1318 + (((tickAnim - 15) / 17) * (0-(-13.1318)));
            zz = 2.0691 + (((tickAnim - 15) / 17) * (0-(2.0691)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.1272-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.2376-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-41.8612-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 20.1272 + (((tickAnim - 15) / 17) * (121.4901-(20.1272)));
            yy = 6.2376 + (((tickAnim - 15) / 17) * (21.6583-(6.2376)));
            zz = -41.8612 + (((tickAnim - 15) / 17) * (-86.6409-(-41.8612)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 121.4901 + (((tickAnim - 32) / 9) * (48.591-(121.4901)));
            yy = 21.6583 + (((tickAnim - 32) / 9) * (-1.4885-(21.6583)));
            zz = -86.6409 + (((tickAnim - 32) / 9) * (-78.4664-(-86.6409)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 48.591 + (((tickAnim - 41) / 9) * (0-(48.591)));
            yy = -1.4885 + (((tickAnim - 41) / 9) * (0-(-1.4885)));
            zz = -78.4664 + (((tickAnim - 41) / 9) * (0-(-78.4664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.55 + (((tickAnim - 32) / 18) * (0-(-0.55)));
            yy = 0.825 + (((tickAnim - 32) / 18) * (0-(0.825)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg.rotationPointX = this.RightLeg.rotationPointX + (float)(xx);
        this.RightLeg.rotationPointY = this.RightLeg.rotationPointY - (float)(yy);
        this.RightLeg.rotationPointZ = this.RightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (-26.3533-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (-11.7895-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (-2.3245-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -26.3533 + (((tickAnim - 32) / 18) * (0-(-26.3533)));
            yy = -11.7895 + (((tickAnim - 32) / 18) * (0-(-11.7895)));
            zz = -2.3245 + (((tickAnim - 32) / 18) * (0-(-2.3245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (51.25-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 51.25 + (((tickAnim - 37) / 8) * (-11.3431-(51.25)));
            yy = 0 + (((tickAnim - 37) / 8) * (25.2507-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (16.5168-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -11.3431 + (((tickAnim - 45) / 5) * (0-(-11.3431)));
            yy = 25.2507 + (((tickAnim - 45) / 5) * (0-(25.2507)));
            zz = 16.5168 + (((tickAnim - 45) / 5) * (0-(16.5168)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindFoot, rightHindFoot.rotateAngleX + (float) Math.toRadians(xx), rightHindFoot.rotateAngleY + (float) Math.toRadians(yy), rightHindFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0.425-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0.425 + (((tickAnim - 45) / 3) * (0.39-(0.425)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0.39 + (((tickAnim - 48) / 2) * (0-(0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHindFoot.rotationPointX = this.rightHindFoot.rotationPointX + (float)(xx);
        this.rightHindFoot.rotationPointY = this.rightHindFoot.rotationPointY - (float)(yy);
        this.rightHindFoot.rotationPointZ = this.rightHindFoot.rotationPointZ + (float)(zz);

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.125-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 540) * (-0.4-(-0.4)));
            zz = 0.125 + (((tickAnim - 35) / 540) * (0.125-(0.125)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            yy = -0.4 + (((tickAnim - 575) / 25) * (0-(-0.4)));
            zz = 0.125 + (((tickAnim - 575) / 25) * (0-(0.125)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (17.46-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.46 + (((tickAnim - 15) / 20) * (21.5-(17.46)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 21.5 + (((tickAnim - 35) / 540) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 21.5 + (((tickAnim - 575) / 25) * (0-(21.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 89) {
            xx = -14 + (((tickAnim - 35) / 54) * (-14-(-14)));
            yy = 0 + (((tickAnim - 35) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 54) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = -14 + (((tickAnim - 89) / 1) * (-43.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30-(-14)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -43.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30 + (((tickAnim - 90) / 30) * (-33-(-43.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 452) {
            xx = -33 + (((tickAnim - 120) / 332) * (-33-(-33)));
            yy = 0 + (((tickAnim - 120) / 332) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 332) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = -33 + (((tickAnim - 452) / 1) * (-33-(-33)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 543) {
            xx = -33 + (((tickAnim - 453) / 90) * (-14.5-(-33)));
            yy = 0 + (((tickAnim - 453) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 90) * (0-(0)));
        }
        else if (tickAnim >= 543 && tickAnim < 575) {
            xx = -14.5 + (((tickAnim - 543) / 32) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 543) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 543) / 32) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -14.5 + (((tickAnim - 575) / 25) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 165 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 165) / 35) * (8.75-(0)));
            yy = 0 + (((tickAnim - 165) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 35) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 8.75 + (((tickAnim - 200) / 148) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 200) / 148) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 148) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 8.75 + (((tickAnim - 348) / 40) * (0-(8.75)));
            yy = 0 + (((tickAnim - 348) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 348) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftEye, leftEye.rotateAngleX + (float) Math.toRadians(xx), leftEye.rotateAngleY + (float) Math.toRadians(yy), leftEye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 165 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 165) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 35) * (0.2-(0)));
            zz = 0 + (((tickAnim - 165) / 35) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 0 + (((tickAnim - 200) / 148) * (0-(0)));
            yy = 0.2 + (((tickAnim - 200) / 148) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 200) / 148) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 0 + (((tickAnim - 348) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 348) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 348) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftEye.rotationPointX = this.leftEye.rotationPointX + (float)(xx);
        this.leftEye.rotationPointY = this.leftEye.rotationPointY - (float)(yy);
        this.leftEye.rotationPointZ = this.leftEye.rotationPointZ + (float)(zz);


        if (tickAnim >= 120 && tickAnim < 165) {
            xx = 1 + (((tickAnim - 120) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 120) / 45) * (1-(1)));
        }
        else if (tickAnim >= 165 && tickAnim < 200) {
            xx = 1 + (((tickAnim - 165) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 165) / 35) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 165) / 35) * (1-(1)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 1 + (((tickAnim - 200) / 148) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 200) / 148) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 200) / 148) * (1-(1)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 1 + (((tickAnim - 348) / 40) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 348) / 40) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 348) / 40) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 165 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 165) / 35) * (8.75-(0)));
            yy = 0 + (((tickAnim - 165) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 35) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 8.75 + (((tickAnim - 200) / 148) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 200) / 148) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 148) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 8.75 + (((tickAnim - 348) / 40) * (0-(8.75)));
            yy = 0 + (((tickAnim - 348) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 348) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightEye, rightEye.rotateAngleX + (float) Math.toRadians(xx), rightEye.rotateAngleY + (float) Math.toRadians(yy), rightEye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 165 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 165) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 35) * (0.2-(0)));
            zz = 0 + (((tickAnim - 165) / 35) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 0 + (((tickAnim - 200) / 148) * (0-(0)));
            yy = 0.2 + (((tickAnim - 200) / 148) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 200) / 148) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 0 + (((tickAnim - 348) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 348) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 348) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightEye.rotationPointX = this.rightEye.rotationPointX + (float)(xx);
        this.rightEye.rotationPointY = this.rightEye.rotationPointY - (float)(yy);
        this.rightEye.rotationPointZ = this.rightEye.rotationPointZ + (float)(zz);


        if (tickAnim >= 120 && tickAnim < 165) {
            xx = 1 + (((tickAnim - 120) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 120) / 45) * (1-(1)));
        }
        else if (tickAnim >= 165 && tickAnim < 200) {
            xx = 1 + (((tickAnim - 165) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 165) / 35) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 165) / 35) * (1-(1)));
        }
        else if (tickAnim >= 200 && tickAnim < 348) {
            xx = 1 + (((tickAnim - 200) / 148) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 200) / 148) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 200) / 148) * (1-(1)));
        }
        else if (tickAnim >= 348 && tickAnim < 388) {
            xx = 1 + (((tickAnim - 348) / 40) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 348) / 40) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 348) / 40) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 89 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 89) / 31) * (19-(0)));
            yy = 0 + (((tickAnim - 89) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 31) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 452) {
            xx = 19 + (((tickAnim - 120) / 332) * (19-(19)));
            yy = 0 + (((tickAnim - 120) / 332) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 332) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = 19 + (((tickAnim - 452) / 1) * (19-(19)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 543) {
            xx = 19 + (((tickAnim - 453) / 90) * (0-(19)));
            yy = 0 + (((tickAnim - 453) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 10.75 + (((tickAnim - 35) / 540) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 10.75 + (((tickAnim - 575) / 25) * (0-(10.75)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6.5063-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1.1556-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-5.1451-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -6.5063 + (((tickAnim - 35) / 540) * (-6.5063-(-6.5063)));
            yy = 1.1556 + (((tickAnim - 35) / 540) * (1.1556-(1.1556)));
            zz = -5.1451 + (((tickAnim - 35) / 540) * (-5.1451-(-5.1451)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -6.5063 + (((tickAnim - 575) / 25) * (0-(-6.5063)));
            yy = 1.1556 + (((tickAnim - 575) / 25) * (0-(1.1556)));
            zz = -5.1451 + (((tickAnim - 575) / 25) * (0-(-5.1451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontFoot, leftFrontFoot.rotateAngleX + (float) Math.toRadians(xx), leftFrontFoot.rotateAngleY + (float) Math.toRadians(yy), leftFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 10.75 + (((tickAnim - 35) / 540) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 10.75 + (((tickAnim - 575) / 25) * (0-(10.75)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6.5063-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-1.1556-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.1451-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -6.5063 + (((tickAnim - 35) / 540) * (-6.5063-(-6.5063)));
            yy = -1.1556 + (((tickAnim - 35) / 540) * (-1.1556-(-1.1556)));
            zz = 5.1451 + (((tickAnim - 35) / 540) * (5.1451-(5.1451)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -6.5063 + (((tickAnim - 575) / 25) * (0-(-6.5063)));
            yy = -1.1556 + (((tickAnim - 575) / 25) * (0-(-1.1556)));
            zz = 5.1451 + (((tickAnim - 575) / 25) * (0-(5.1451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontFoot, rightFrontFoot.rotateAngleX + (float) Math.toRadians(xx), rightFrontFoot.rotateAngleY + (float) Math.toRadians(yy), rightFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -4.25 + (((tickAnim - 35) / 540) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -4.25 + (((tickAnim - 575) / 25) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (4.5-(0)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 4.5 + (((tickAnim - 35) / 540) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 4.5 + (((tickAnim - 575) / 25) * (0-(4.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -9.5 + (((tickAnim - 35) / 540) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -9.5 + (((tickAnim - 575) / 25) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 10 + (((tickAnim - 35) / 540) * (10-(10)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 10 + (((tickAnim - 575) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindFoot, leftHindFoot.rotateAngleX + (float) Math.toRadians(xx), leftHindFoot.rotateAngleY + (float) Math.toRadians(yy), leftHindFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -9.5 + (((tickAnim - 35) / 540) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -9.5 + (((tickAnim - 575) / 25) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 10 + (((tickAnim - 35) / 540) * (10-(10)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 10 + (((tickAnim - 575) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindFoot, rightHindFoot.rotateAngleX + (float) Math.toRadians(xx), rightHindFoot.rotateAngleY + (float) Math.toRadians(yy), rightHindFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 0) / 55) * (-16.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -16.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20 + (((tickAnim - 55) / 25) * (0-(-16.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 0) / 55) * (-22.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -22.5 + (((tickAnim - 55) / 25) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 8.75 + (((tickAnim - 35) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 8.75 + (((tickAnim - 55) / 25) * (0-(8.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftEye, leftEye.rotateAngleX + (float) Math.toRadians(xx), leftEye.rotateAngleY + (float) Math.toRadians(yy), leftEye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0.2-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 35) / 20) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0.2 + (((tickAnim - 55) / 25) * (0-(0.2)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftEye.rotationPointX = this.leftEye.rotationPointX + (float)(xx);
        this.leftEye.rotationPointY = this.leftEye.rotationPointY - (float)(yy);
        this.leftEye.rotationPointZ = this.leftEye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 15) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 35) / 20) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 35) / 20) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 35) / 20) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 55) / 25) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 55) / 25) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 55) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 8.75 + (((tickAnim - 35) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 8.75 + (((tickAnim - 55) / 25) * (0-(8.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightEye, rightEye.rotateAngleX + (float) Math.toRadians(xx), rightEye.rotateAngleY + (float) Math.toRadians(yy), rightEye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0.2-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 35) / 20) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0.2 + (((tickAnim - 55) / 25) * (0-(0.2)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightEye.rotationPointX = this.rightEye.rotationPointX + (float)(xx);
        this.rightEye.rotationPointY = this.rightEye.rotationPointY - (float)(yy);
        this.rightEye.rotationPointZ = this.rightEye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 15) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 35) / 20) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 35) / 20) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 35) / 20) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 55) / 25) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 55) / 25) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 55) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 19.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+100))*20 + (((tickAnim - 0) / 55) * (34.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(19.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+100))*20)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 34.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 55) / 25) * (0-(34.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 51;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 21) * (26.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 52) {
            xx = 26.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 21) / 31) * (0-(26.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 0 + (((tickAnim - 21) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 2.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-5 + (((tickAnim - 0) / 30) * (-6.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50-(2.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 52) {
            xx = -6.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50 + (((tickAnim - 30) / 22) * (0-(-6.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50)));
            yy = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 8) / 13) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (-5-(-5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 52) {
            xx = -5 + (((tickAnim - 35) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawUnderside, lowerJawUnderside.rotateAngleX + (float) Math.toRadians(xx), lowerJawUnderside.rotateAngleY + (float) Math.toRadians(yy), lowerJawUnderside.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (12.5214-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-0.2094-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0.0968-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 12.5214 + (((tickAnim - 30) / 5) * (12.5214-(12.5214)));
            yy = -0.2094 + (((tickAnim - 30) / 5) * (-0.2094-(-0.2094)));
            zz = 0.0968 + (((tickAnim - 30) / 5) * (0.0968-(0.0968)));
        }
        else if (tickAnim >= 35 && tickAnim < 52) {
            xx = 12.5214 + (((tickAnim - 35) / 17) * (0-(12.5214)));
            yy = -0.2094 + (((tickAnim - 35) / 17) * (0-(-0.2094)));
            zz = 0.0968 + (((tickAnim - 35) / 17) * (0-(0.0968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-60))*2), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-20))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-20))*-0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-15))*0.3);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5))*3));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+40))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-120))*-3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+60))*3), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-120))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*3));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0.175);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12.0092-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+50))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.5888 + (((tickAnim - 0) / 8) * (19.3447-(11.5888)));
            yy = 11.3303 + (((tickAnim - 0) / 8) * (23.5658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(11.3303)));
            zz = -0.4801 + (((tickAnim - 0) / 8) * (-13.5945-(-0.4801)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 19.3447 + (((tickAnim - 8) / 6) * (3.4514-(19.3447)));
            yy = 23.5658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 8) / 6) * (-47.6949-(23.5658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            zz = -13.5945 + (((tickAnim - 8) / 6) * (-14.3146-(-13.5945)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 3.4514 + (((tickAnim - 14) / 21) * (11.5888-(3.4514)));
            yy = -47.6949 + (((tickAnim - 14) / 21) * (11.3303-(-47.6949)));
            zz = -14.3146 + (((tickAnim - 14) / 21) * (-0.4801-(-14.3146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 62.6629 + (((tickAnim - 0) / 8) * (137.1829-(62.6629)));
            yy = -8.9763 + (((tickAnim - 0) / 8) * (13.5179-(-8.9763)));
            zz = 11.9016 + (((tickAnim - 0) / 8) * (152.3916-(11.9016)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 137.1829 + (((tickAnim - 8) / 6) * (101.1782-(137.1829)));
            yy = 13.5179 + (((tickAnim - 8) / 6) * (7.5299-(13.5179)));
            zz = 152.3916 + (((tickAnim - 8) / 6) * (90.2902-(152.3916)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 101.1782 + (((tickAnim - 14) / 21) * (62.6629-(101.1782)));
            yy = 7.5299 + (((tickAnim - 14) / 21) * (-8.9763-(7.5299)));
            zz = 90.2902 + (((tickAnim - 14) / 21) * (11.9016-(90.2902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = -0.3 + (((tickAnim - 14) / 21) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerArm.rotationPointX = this.leftLowerArm.rotationPointX + (float)(xx);
        this.leftLowerArm.rotationPointY = this.leftLowerArm.rotationPointY - (float)(yy);
        this.leftLowerArm.rotationPointZ = this.leftLowerArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 59.5 + (((tickAnim - 0) / 8) * (83.5-(59.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 83.5 + (((tickAnim - 8) / 6) * (-18.0098-(83.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (6.0544-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (13.8498-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -18.0098 + (((tickAnim - 14) / 5) * (-32.9775-(-18.0098)));
            yy = 6.0544 + (((tickAnim - 14) / 5) * (0.8736-(6.0544)));
            zz = 13.8498 + (((tickAnim - 14) / 5) * (-0.1372-(13.8498)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -32.9775 + (((tickAnim - 19) / 6) * (4.6984-(-32.9775)));
            yy = 0.8736 + (((tickAnim - 19) / 6) * (0.5517-(0.8736)));
            zz = -0.1372 + (((tickAnim - 19) / 6) * (-0.0867-(-0.1372)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.6984 + (((tickAnim - 25) / 10) * (59.5-(4.6984)));
            yy = 0.5517 + (((tickAnim - 25) / 10) * (0-(0.5517)));
            zz = -0.0867 + (((tickAnim - 25) / 10) * (0-(-0.0867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontFoot, leftFrontFoot.rotateAngleX + (float) Math.toRadians(xx), leftFrontFoot.rotateAngleY + (float) Math.toRadians(yy), leftFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 3) * (0.18-(-0.15)));
            zz = -0.3 + (((tickAnim - 0) / 3) * (-0.14-(-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.18 + (((tickAnim - 3) / 5) * (0.18-(0.18)));
            zz = -0.14 + (((tickAnim - 3) / 5) * (-0.14-(-0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.18 + (((tickAnim - 8) / 6) * (0-(0.18)));
            zz = -0.14 + (((tickAnim - 8) / 6) * (0-(-0.14)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (-0.03-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.03 + (((tickAnim - 17) / 2) * (0-(-0.03)));
            yy = 0.1 + (((tickAnim - 17) / 2) * (0.125-(0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0.125 + (((tickAnim - 19) / 16) * (-0.15-(0.125)));
            zz = 0 + (((tickAnim - 19) / 16) * (-0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFrontFoot.rotationPointX = this.leftFrontFoot.rotationPointX + (float)(xx);
        this.leftFrontFoot.rotationPointY = this.leftFrontFoot.rotationPointY - (float)(yy);
        this.leftFrontFoot.rotationPointZ = this.leftFrontFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -13.7921 + (((tickAnim - 0) / 16) * (11.5888-(-13.7921)));
            yy = 33.3022 + (((tickAnim - 0) / 16) * (-11.3303-(33.3022)));
            zz = 8.0732 + (((tickAnim - 0) / 16) * (0.4801-(8.0732)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 11.5888 + (((tickAnim - 16) / 7) * (-1.3447-(11.5888)));
            yy = -11.3303 + (((tickAnim - 16) / 7) * (-104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-11.3303)));
            zz = 0.4801 + (((tickAnim - 16) / 7) * (-13.5945-(0.4801)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1.3447 + (((tickAnim - 23) / 7) * (3.4514-(-1.3447)));
            yy = -104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 23) / 7) * (47.6949-(-104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            zz = -13.5945 + (((tickAnim - 23) / 7) * (14.3146-(-13.5945)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 3.4514 + (((tickAnim - 30) / 5) * (-13.7921-(3.4514)));
            yy = 47.6949 + (((tickAnim - 30) / 5) * (33.3022-(47.6949)));
            zz = 14.3146 + (((tickAnim - 30) / 5) * (8.0732-(14.3146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 82.7455 + (((tickAnim - 0) / 16) * (62.6629-(82.7455)));
            yy = 13.5173 + (((tickAnim - 0) / 16) * (8.9763-(13.5173)));
            zz = -85.2748 + (((tickAnim - 0) / 16) * (-11.9016-(-85.2748)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 62.6629 + (((tickAnim - 16) / 7) * (137.1829-(62.6629)));
            yy = 8.9763 + (((tickAnim - 16) / 7) * (-13.5179-(8.9763)));
            zz = -11.9016 + (((tickAnim - 16) / 7) * (-152.3916-(-11.9016)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 137.1829 + (((tickAnim - 23) / 7) * (101.1782-(137.1829)));
            yy = -13.5179 + (((tickAnim - 23) / 7) * (-7.5299-(-13.5179)));
            zz = -152.3916 + (((tickAnim - 23) / 7) * (-90.2902-(-152.3916)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 101.1782 + (((tickAnim - 30) / 5) * (82.7455-(101.1782)));
            yy = -7.5299 + (((tickAnim - 30) / 5) * (13.5173-(-7.5299)));
            zz = -90.2902 + (((tickAnim - 30) / 5) * (-85.2748-(-90.2902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerArm.rotationPointX = this.rightLowerArm.rotationPointX + (float)(xx);
        this.rightLowerArm.rotationPointY = this.rightLowerArm.rotationPointY - (float)(yy);
        this.rightLowerArm.rotationPointZ = this.rightLowerArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.7275 + (((tickAnim - 0) / 3) * (-17.8703-(-12.7275)));
            yy = -0.8736 + (((tickAnim - 0) / 3) * (-0.8269-(-0.8736)));
            zz = 0.1372 + (((tickAnim - 0) / 3) * (6.1328-(0.1372)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = -17.8703 + (((tickAnim - 3) / 13) * (58.75-(-17.8703)));
            yy = -0.8269 + (((tickAnim - 3) / 13) * (0-(-0.8269)));
            zz = 6.1328 + (((tickAnim - 3) / 13) * (0-(6.1328)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 58.75 + (((tickAnim - 16) / 7) * (83.5-(58.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 83.5 + (((tickAnim - 23) / 7) * (-18.0098-(83.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (-6.0544-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-13.8498-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -18.0098 + (((tickAnim - 30) / 5) * (-12.7275-(-18.0098)));
            yy = -6.0544 + (((tickAnim - 30) / 5) * (-0.8736-(-6.0544)));
            zz = -13.8498 + (((tickAnim - 30) / 5) * (0.1372-(-13.8498)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontFoot, rightFrontFoot.rotateAngleX + (float) Math.toRadians(xx), rightFrontFoot.rotateAngleY + (float) Math.toRadians(yy), rightFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 16) * (-0.2-(0.125)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = -0.2 + (((tickAnim - 16) / 14) * (0-(-0.2)));
            zz = -0.3 + (((tickAnim - 16) / 14) * (0-(-0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.03-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.03 + (((tickAnim - 33) / 2) * (0-(-0.03)));
            yy = 0.1 + (((tickAnim - 33) / 2) * (0.125-(0.1)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFrontFoot.rotationPointX = this.rightFrontFoot.rotationPointX + (float)(xx);
        this.rightFrontFoot.rotationPointY = this.rightFrontFoot.rotationPointY - (float)(yy);
        this.rightFrontFoot.rotationPointZ = this.rightFrontFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-30))*-3), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*3), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-20))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+50))*3), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-180))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-140))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+100))*-3), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-230))*5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-130))*5));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 7.75 + (((tickAnim - 0) / 18) * (83.813-(7.75)));
            yy = -11.5 + (((tickAnim - 0) / 18) * (-21.3448-(-11.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (78.1522-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 83.813 + (((tickAnim - 18) / 8) * (353.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(83.813)));
            yy = -21.3448 + (((tickAnim - 18) / 8) * (-12.6541-(-21.3448)));
            zz = 78.1522 + (((tickAnim - 18) / 8) * (42.2823-(78.1522)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 353.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 26) / 9) * (7.75-(353.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -12.6541 + (((tickAnim - 26) / 9) * (-11.5-(-12.6541)));
            zz = 42.2823 + (((tickAnim - 26) / 9) * (0-(42.2823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -10.75 + (((tickAnim - 0) / 18) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (11.7998-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (-0.7775-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-3.669-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 11.7998 + (((tickAnim - 26) / 9) * (-10.75-(11.7998)));
            yy = -0.7775 + (((tickAnim - 26) / 9) * (0-(-0.7775)));
            zz = -3.669 + (((tickAnim - 26) / 9) * (0-(-3.669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 18) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.8801 + (((tickAnim - 0) / 4) * (-7.0641-(0.8801)));
            yy = -11.6976 + (((tickAnim - 0) / 4) * (-12.8372-(-11.6976)));
            zz = -1.1184 + (((tickAnim - 0) / 4) * (-10.771-(-1.1184)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.0641 + (((tickAnim - 4) / 4) * (-11.5489-(-7.0641)));
            yy = -12.8372 + (((tickAnim - 4) / 4) * (-14.9247-(-12.8372)));
            zz = -10.771 + (((tickAnim - 4) / 4) * (-23.445-(-10.771)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -11.5489 + (((tickAnim - 8) / 10) * (22.6816-(-11.5489)));
            yy = -14.9247 + (((tickAnim - 8) / 10) * (-7.4147-(-14.9247)));
            zz = -23.445 + (((tickAnim - 8) / 10) * (-7.9768-(-23.445)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 22.6816 + (((tickAnim - 18) / 4) * (46.3027-(22.6816)));
            yy = -7.4147 + (((tickAnim - 18) / 4) * (2.6436-(-7.4147)));
            zz = -7.9768 + (((tickAnim - 18) / 4) * (49.5541-(-7.9768)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 46.3027 + (((tickAnim - 22) / 4) * (6.4796-(46.3027)));
            yy = 2.6436 + (((tickAnim - 22) / 4) * (6.2652-(2.6436)));
            zz = 49.5541 + (((tickAnim - 22) / 4) * (30.1798-(49.5541)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 6.4796 + (((tickAnim - 26) / 9) * (0.8801-(6.4796)));
            yy = 6.2652 + (((tickAnim - 26) / 9) * (-11.6976-(6.2652)));
            zz = 30.1798 + (((tickAnim - 26) / 9) * (-1.1184-(30.1798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindFoot, leftHindFoot.rotateAngleX + (float) Math.toRadians(xx), leftHindFoot.rotateAngleY + (float) Math.toRadians(yy), leftHindFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.625-(0)));
            zz = 0.1 + (((tickAnim - 0) / 4) * (0.55-(0.1)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 4) / 4) * (0.55-(0.625)));
            zz = 0.55 + (((tickAnim - 4) / 4) * (0.55-(0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 8) / 10) * (0-(0.55)));
            zz = 0.55 + (((tickAnim - 8) / 10) * (0-(0.55)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHindFoot.rotationPointX = this.leftHindFoot.rotationPointX + (float)(xx);
        this.leftHindFoot.rotationPointY = this.leftHindFoot.rotationPointY - (float)(yy);
        this.leftHindFoot.rotationPointZ = this.leftHindFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 76.813 + (((tickAnim - 0) / 8) * (94.132-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(76.813)));
            yy = 21.3448 + (((tickAnim - 0) / 8) * (12.6541-(21.3448)));
            zz = -78.1522 + (((tickAnim - 0) / 8) * (-42.2823-(-78.1522)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 94.132-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 10) * (7.75-(94.132-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 12.6541 + (((tickAnim - 8) / 10) * (11.5-(12.6541)));
            zz = -42.2823 + (((tickAnim - 8) / 10) * (0-(-42.2823)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 18) / 17) * (76.813-(7.75)));
            yy = 11.5 + (((tickAnim - 18) / 17) * (21.3448-(11.5)));
            zz = 0 + (((tickAnim - 18) / 17) * (-78.1522-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.7998-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.7775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.669-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 11.7998 + (((tickAnim - 8) / 10) * (-10.75-(11.7998)));
            yy = -0.7775 + (((tickAnim - 8) / 10) * (0-(-0.7775)));
            zz = -3.669 + (((tickAnim - 8) / 10) * (0-(-3.669)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -10.75 + (((tickAnim - 18) / 17) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -0.6 + (((tickAnim - 18) / 17) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.rotationPointX = this.RightLeg2.rotationPointX + (float)(xx);
        this.RightLeg2.rotationPointY = this.RightLeg2.rotationPointY - (float)(yy);
        this.RightLeg2.rotationPointZ = this.RightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.6816 + (((tickAnim - 0) / 4) * (46.3027-(22.6816)));
            yy = 7.4147 + (((tickAnim - 0) / 4) * (-2.6436-(7.4147)));
            zz = 7.9768 + (((tickAnim - 0) / 4) * (-49.5541-(7.9768)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 46.3027 + (((tickAnim - 4) / 4) * (6.4796-(46.3027)));
            yy = -2.6436 + (((tickAnim - 4) / 4) * (-6.2652-(-2.6436)));
            zz = -49.5541 + (((tickAnim - 4) / 4) * (-30.1798-(-49.5541)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 6.4796 + (((tickAnim - 8) / 10) * (0.8801-(6.4796)));
            yy = -6.2652 + (((tickAnim - 8) / 10) * (11.6976-(-6.2652)));
            zz = -30.1798 + (((tickAnim - 8) / 10) * (1.1184-(-30.1798)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.8801 + (((tickAnim - 18) / 4) * (-7.0641-(0.8801)));
            yy = 11.6976 + (((tickAnim - 18) / 4) * (12.8372-(11.6976)));
            zz = 1.1184 + (((tickAnim - 18) / 4) * (10.771-(1.1184)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -7.0641 + (((tickAnim - 22) / 4) * (-11.5489-(-7.0641)));
            yy = 12.8372 + (((tickAnim - 22) / 4) * (14.9247-(12.8372)));
            zz = 10.771 + (((tickAnim - 22) / 4) * (23.445-(10.771)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -11.5489 + (((tickAnim - 26) / 9) * (22.6816-(-11.5489)));
            yy = 14.9247 + (((tickAnim - 26) / 9) * (7.4147-(14.9247)));
            zz = 23.445 + (((tickAnim - 26) / 9) * (7.9768-(23.445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindFoot, rightHindFoot.rotateAngleX + (float) Math.toRadians(xx), rightHindFoot.rotateAngleY + (float) Math.toRadians(yy), rightHindFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.45-(0)));
            zz = 0.1 + (((tickAnim - 18) / 4) * (0.55-(0.1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 22) / 4) * (0.325-(0.45)));
            zz = 0.55 + (((tickAnim - 22) / 4) * (0.55-(0.55)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.325 + (((tickAnim - 26) / 9) * (0-(0.325)));
            zz = 0.55 + (((tickAnim - 26) / 9) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHindFoot.rotationPointX = this.rightHindFoot.rotationPointX + (float)(xx);
        this.rightHindFoot.rotationPointY = this.rightHindFoot.rotationPointY - (float)(yy);
        this.rightHindFoot.rotationPointZ = this.rightHindFoot.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-20))*-5), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-10), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*0.8);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*-7), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-180))*-15), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(19.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0.1);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-16.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerJawUnderside, lowerJawUnderside.rotateAngleX + (float) Math.toRadians(2.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-3), lowerJawUnderside.rotateAngleY + (float) Math.toRadians(0), lowerJawUnderside.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-3.25+.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.4964 + (((tickAnim - 0) / 3) * (81.1218-(23.4964)));
            yy = 29.9159 + (((tickAnim - 0) / 3) * (20.9583-(29.9159)));
            zz = -63.8335 + (((tickAnim - 0) / 3) * (-99.5146-(-63.8335)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 81.1218 + (((tickAnim - 3) / 5) * (153-(81.1218)));
            yy = 20.9583 + (((tickAnim - 3) / 5) * (7.16-(20.9583)));
            zz = -99.5146 + (((tickAnim - 3) / 5) * (-180-(-99.5146)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 153 + (((tickAnim - 8) / 7) * (23.4964-(153)));
            yy = 7.16 + (((tickAnim - 8) / 7) * (29.9159-(7.16)));
            zz = -180 + (((tickAnim - 8) / 7) * (-63.8335-(-180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 81.1689 + (((tickAnim - 0) / 3) * (59.379-(81.1689)));
            yy = -52.3876 + (((tickAnim - 0) / 3) * (13.5342-(-52.3876)));
            zz = 63.1349 + (((tickAnim - 0) / 3) * (113.2468-(63.1349)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 59.379 + (((tickAnim - 3) / 5) * (140.6854-(59.379)));
            yy = 13.5342 + (((tickAnim - 3) / 5) * (-23.7901-(13.5342)));
            zz = 113.2468 + (((tickAnim - 3) / 5) * (139.8407-(113.2468)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 140.6854 + (((tickAnim - 8) / 7) * (81.1689-(140.6854)));
            yy = -23.7901 + (((tickAnim - 8) / 7) * (-52.3876-(-23.7901)));
            zz = 139.8407 + (((tickAnim - 8) / 7) * (63.1349-(139.8407)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.725-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.19-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.04-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.725 + (((tickAnim - 3) / 5) * (0-(0.725)));
            yy = 0.19 + (((tickAnim - 3) / 5) * (0.425-(0.19)));
            zz = 0.04 + (((tickAnim - 3) / 5) * (0.1-(0.04)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 7) * (0-(0.425)));
            zz = 0.1 + (((tickAnim - 8) / 7) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerArm.rotationPointX = this.leftLowerArm.rotationPointX + (float)(xx);
        this.leftLowerArm.rotationPointY = this.leftLowerArm.rotationPointY - (float)(yy);
        this.leftLowerArm.rotationPointZ = this.leftLowerArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 87.4659 + (((tickAnim - 0) / 3) * (114.3246-(87.4659)));
            yy = 2.3896 + (((tickAnim - 0) / 3) * (4.7792-(2.3896)));
            zz = 2.3491 + (((tickAnim - 0) / 3) * (4.6982-(2.3491)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 114.3246 + (((tickAnim - 3) / 3) * (-29.9342-(114.3246)));
            yy = 4.7792 + (((tickAnim - 3) / 3) * (3.1188-(4.7792)));
            zz = 4.6982 + (((tickAnim - 3) / 3) * (18.0405-(4.6982)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.9342 + (((tickAnim - 6) / 2) * (-21.5286-(-29.9342)));
            yy = 3.1188 + (((tickAnim - 6) / 2) * (10.7532-(3.1188)));
            zz = 18.0405 + (((tickAnim - 6) / 2) * (10.5708-(18.0405)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21.5286 + (((tickAnim - 8) / 1) * (-47.9433-(-21.5286)));
            yy = 10.7532 + (((tickAnim - 8) / 1) * (24.9773-(10.7532)));
            zz = 10.5708 + (((tickAnim - 8) / 1) * (-10.5183-(10.5708)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -47.9433 + (((tickAnim - 9) / 6) * (87.4659-(-47.9433)));
            yy = 24.9773 + (((tickAnim - 9) / 6) * (2.3896-(24.9773)));
            zz = -10.5183 + (((tickAnim - 9) / 6) * (2.3491-(-10.5183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontFoot, leftFrontFoot.rotateAngleX + (float) Math.toRadians(xx), leftFrontFoot.rotateAngleY + (float) Math.toRadians(yy), leftFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.435-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.435 + (((tickAnim - 3) / 3) * (0.525-(0.435)));
            zz = 0.225 + (((tickAnim - 3) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 6) / 2) * (0.125-(0.525)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-0.35-(0)));
            yy = 0.125 + (((tickAnim - 8) / 1) * (1.05-(0.125)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -0.35 + (((tickAnim - 9) / 6) * (0-(-0.35)));
            yy = 1.05 + (((tickAnim - 9) / 6) * (0-(1.05)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFrontFoot.rotationPointX = this.leftFrontFoot.rotationPointX + (float)(xx);
        this.leftFrontFoot.rotationPointY = this.leftFrontFoot.rotationPointY - (float)(yy);
        this.leftFrontFoot.rotationPointZ = this.leftFrontFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 168.0881 + (((tickAnim - 0) / 8) * (26.6791-(168.0881)));
            yy = -4.1795 + (((tickAnim - 0) / 8) * (-18.0891-(-4.1795)));
            zz = 192.7351 + (((tickAnim - 0) / 8) * (40.3231-(192.7351)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 26.6791 + (((tickAnim - 8) / 7) * (168.0881-(26.6791)));
            yy = -18.0891 + (((tickAnim - 8) / 7) * (-4.1795-(-18.0891)));
            zz = 40.3231 + (((tickAnim - 8) / 7) * (192.7351-(40.3231)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 142.8892 + (((tickAnim - 0) / 8) * (81.1689-(142.8892)));
            yy = 20.8599 + (((tickAnim - 0) / 8) * (52.3876-(20.8599)));
            zz = -141.8394 + (((tickAnim - 0) / 8) * (-63.1349-(-141.8394)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 81.1689 + (((tickAnim - 8) / 3) * (43.251-(81.1689)));
            yy = 52.3876 + (((tickAnim - 8) / 3) * (-3.0143-(52.3876)));
            zz = -63.1349 + (((tickAnim - 8) / 3) * (-110.4116-(-63.1349)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 43.251 + (((tickAnim - 11) / 4) * (142.8892-(43.251)));
            yy = -3.0143 + (((tickAnim - 11) / 4) * (20.8599-(-3.0143)));
            zz = -110.4116 + (((tickAnim - 11) / 4) * (-141.8394-(-110.4116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 8) * (0-(0.125)));
            zz = -0.1 + (((tickAnim - 0) / 8) * (0-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.065-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.04-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 11) / 4) * (0-(-0.5)));
            yy = -0.065 + (((tickAnim - 11) / 4) * (0.125-(-0.065)));
            zz = -0.04 + (((tickAnim - 11) / 4) * (-0.1-(-0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerArm.rotationPointX = this.rightLowerArm.rotationPointX + (float)(xx);
        this.rightLowerArm.rotationPointY = this.rightLowerArm.rotationPointY - (float)(yy);
        this.rightLowerArm.rotationPointZ = this.rightLowerArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -13.5286 + (((tickAnim - 0) / 2) * (-32.9462-(-13.5286)));
            yy = -10.7532 + (((tickAnim - 0) / 2) * (-5.3976-(-10.7532)));
            zz = -10.5708 + (((tickAnim - 0) / 2) * (4.1811-(-10.5708)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -32.9462 + (((tickAnim - 2) / 6) * (88.25-(-32.9462)));
            yy = -5.3976 + (((tickAnim - 2) / 6) * (0-(-5.3976)));
            zz = 4.1811 + (((tickAnim - 2) / 6) * (0-(4.1811)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 88.25 + (((tickAnim - 8) / 3) * (114.3246-(88.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (4.7792-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (4.6982-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 114.3246 + (((tickAnim - 11) / 2) * (-2.8329-(114.3246)));
            yy = 4.7792 + (((tickAnim - 11) / 2) * (-5.6775-(4.7792)));
            zz = 4.6982 + (((tickAnim - 11) / 2) * (4.5238-(4.6982)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.8329 + (((tickAnim - 13) / 2) * (-13.5286-(-2.8329)));
            yy = -5.6775 + (((tickAnim - 13) / 2) * (-10.7532-(-5.6775)));
            zz = 4.5238 + (((tickAnim - 13) / 2) * (-10.5708-(4.5238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontFoot, rightFrontFoot.rotateAngleX + (float) Math.toRadians(xx), rightFrontFoot.rotateAngleY + (float) Math.toRadians(yy), rightFrontFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 2) / 3) * (0-(0.8)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.435-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.435 + (((tickAnim - 11) / 2) * (0.525-(0.435)));
            zz = 0.225 + (((tickAnim - 11) / 2) * (0-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 2) * (0-(0.525)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFrontFoot.rotationPointX = this.rightFrontFoot.rotationPointX + (float)(xx);
        this.rightFrontFoot.rotationPointY = this.rightFrontFoot.rotationPointY - (float)(yy);
        this.rightFrontFoot.rotationPointZ = this.rightFrontFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-10), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-30), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*10), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-50), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (115.5408-(25)));
            yy = -14.75 + (((tickAnim - 0) / 8) * (-27.2593-(-14.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (76.9904-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 115.5408 + (((tickAnim - 8) / 3) * (197.9592-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(115.5408)));
            yy = -27.2593 + (((tickAnim - 8) / 3) * (-38.3168-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-27.2593)));
            zz = 76.9904 + (((tickAnim - 8) / 3) * (-22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250-(76.9904)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 197.9592-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 11) / 4) * (25-(197.9592-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -38.3168-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 11) / 4) * (-14.75-(-38.3168-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = -22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250 + (((tickAnim - 11) / 4) * (0-(-22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26 + (((tickAnim - 0) / 8) * (-26.1833-(-26)));
            yy = 0 + (((tickAnim - 0) / 8) * (17.4199-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.6832-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -26.1833 + (((tickAnim - 8) / 3) * (-26.23-(-26.1833)));
            yy = 17.4199 + (((tickAnim - 8) / 3) * (10.492-(17.4199)));
            zz = -1.6832 + (((tickAnim - 8) / 3) * (7.5268-(-1.6832)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -26.23 + (((tickAnim - 11) / 4) * (-26-(-26.23)));
            yy = 10.492 + (((tickAnim - 11) / 4) * (0-(10.492)));
            zz = 7.5268 + (((tickAnim - 11) / 4) * (0-(7.5268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 3) * (1.025-(0.375)));
            zz = -0.725 + (((tickAnim - 0) / 3) * (0-(-0.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.025 + (((tickAnim - 3) / 5) * (0-(1.025)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.375-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.725-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-17.9789-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.6446-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-17.0361-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.9789 + (((tickAnim - 3) / 1) * (-23.1734-(-17.9789)));
            yy = -3.6446 + (((tickAnim - 3) / 1) * (-4.8719-(-3.6446)));
            zz = -17.0361 + (((tickAnim - 3) / 1) * (-32.3241-(-17.0361)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -23.1734 + (((tickAnim - 4) / 4) * (39.8131-(-23.1734)));
            yy = -4.8719 + (((tickAnim - 4) / 4) * (-6.4321-(-4.8719)));
            zz = -32.3241 + (((tickAnim - 4) / 4) * (-5.5683-(-32.3241)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 39.8131 + (((tickAnim - 8) / 1) * (92.8684-(39.8131)));
            yy = -6.4321 + (((tickAnim - 8) / 1) * (3.5734-(-6.4321)));
            zz = -5.5683 + (((tickAnim - 8) / 1) * (3.0935-(-5.5683)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 92.8684 + (((tickAnim - 9) / 4) * (-15.3203-(92.8684)));
            yy = 3.5734 + (((tickAnim - 9) / 4) * (-8.192-(3.5734)));
            zz = 3.0935 + (((tickAnim - 9) / 4) * (-35.2695-(3.0935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.3203 + (((tickAnim - 13) / 2) * (0-(-15.3203)));
            yy = -8.192 + (((tickAnim - 13) / 2) * (0-(-8.192)));
            zz = -35.2695 + (((tickAnim - 13) / 2) * (0-(-35.2695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindFoot, leftHindFoot.rotateAngleX + (float) Math.toRadians(xx), leftHindFoot.rotateAngleY + (float) Math.toRadians(yy), leftHindFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.325 + (((tickAnim - 2) / 6) * (0-(0.325)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.6-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 2) * (0-(0.6)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHindFoot.rotationPointX = this.leftHindFoot.rotationPointX + (float)(xx);
        this.leftHindFoot.rotationPointY = this.leftHindFoot.rotationPointY - (float)(yy);
        this.leftHindFoot.rotationPointZ = this.leftHindFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 115.5408 + (((tickAnim - 0) / 3) * (117.1445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(115.5408)));
            yy = 27.2593 + (((tickAnim - 0) / 3) * (6.7618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(27.2593)));
            zz = -76.9904 + (((tickAnim - 0) / 3) * (19.5654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(-76.9904)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 117.1445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 3) / 5) * (25-(117.1445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 6.7618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 3) / 5) * (14.75-(6.7618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 19.5654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 3) / 5) * (0-(19.5654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 8) / 7) * (115.5408-(25)));
            yy = 14.75 + (((tickAnim - 8) / 7) * (27.2593-(14.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (-76.9904-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -26.1833 + (((tickAnim - 0) / 3) * (-26.23-(-26.1833)));
            yy = -17.4199 + (((tickAnim - 0) / 3) * (-10.492-(-17.4199)));
            zz = 1.6832 + (((tickAnim - 0) / 3) * (-7.5268-(1.6832)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -26.23 + (((tickAnim - 3) / 5) * (-26-(-26.23)));
            yy = -10.492 + (((tickAnim - 3) / 5) * (0-(-10.492)));
            zz = -7.5268 + (((tickAnim - 3) / 5) * (0-(-7.5268)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -26 + (((tickAnim - 8) / 7) * (-26.1833-(-26)));
            yy = 0 + (((tickAnim - 8) / 7) * (-17.4199-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (1.6832-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.725-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 2) * (1.025-(0.375)));
            zz = -0.725 + (((tickAnim - 8) / 2) * (0-(-0.725)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.025 + (((tickAnim - 10) / 5) * (0-(1.025)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.rotationPointX = this.RightLeg2.rotationPointX + (float)(xx);
        this.RightLeg2.rotationPointY = this.RightLeg2.rotationPointY - (float)(yy);
        this.RightLeg2.rotationPointZ = this.RightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 39.8131 + (((tickAnim - 0) / 2) * (92.8684-(39.8131)));
            yy = -6.4321 + (((tickAnim - 0) / 2) * (-3.5734-(-6.4321)));
            zz = -5.5683 + (((tickAnim - 0) / 2) * (-3.0935-(-5.5683)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 92.8684 + (((tickAnim - 2) / 3) * (-8-(92.8684)));
            yy = -3.5734 + (((tickAnim - 2) / 3) * (0-(-3.5734)));
            zz = -3.0935 + (((tickAnim - 2) / 3) * (36.25-(-3.0935)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8 + (((tickAnim - 5) / 3) * (0-(-8)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 36.25 + (((tickAnim - 5) / 3) * (0-(36.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-17.9789-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (3.6446-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (17.0361-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -17.9789 + (((tickAnim - 10) / 2) * (-23.1734-(-17.9789)));
            yy = 3.6446 + (((tickAnim - 10) / 2) * (4.8719-(3.6446)));
            zz = 17.0361 + (((tickAnim - 10) / 2) * (32.3241-(17.0361)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -23.1734 + (((tickAnim - 12) / 3) * (39.8131-(-23.1734)));
            yy = 4.8719 + (((tickAnim - 12) / 3) * (-6.4321-(4.8719)));
            zz = 32.3241 + (((tickAnim - 12) / 3) * (-5.5683-(32.3241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindFoot, rightHindFoot.rotateAngleX + (float) Math.toRadians(xx), rightHindFoot.rotateAngleY + (float) Math.toRadians(yy), rightHindFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 5) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.325 + (((tickAnim - 9) / 6) * (0-(0.325)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHindFoot.rotationPointX = this.rightHindFoot.rotationPointX + (float)(xx);
        this.rightHindFoot.rotationPointY = this.rightHindFoot.rotationPointY - (float)(yy);
        this.rightHindFoot.rotationPointZ = this.rightHindFoot.rotationPointZ + (float)(zz);



    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBernissartia entity = (EntityPrehistoricFloraBernissartia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.5), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8.75), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.25), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(36.5465), leftUpperArm.rotateAngleY + (float) Math.toRadians(32.2654-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), leftUpperArm.rotateAngleZ + (float) Math.toRadians(-101.0202+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));


        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(93.3723), leftLowerArm.rotateAngleY + (float) Math.toRadians(-35.0939), leftLowerArm.rotateAngleZ + (float) Math.toRadians(82.3978));


        this.setRotateAngle(leftFrontFoot, leftFrontFoot.rotateAngleX + (float) Math.toRadians(-124.75), leftFrontFoot.rotateAngleY + (float) Math.toRadians(95.41), leftFrontFoot.rotateAngleZ + (float) Math.toRadians(180));
        this.leftFrontFoot.rotationPointX = this.leftFrontFoot.rotationPointX + (float)(-0.4);
        this.leftFrontFoot.rotationPointY = this.leftFrontFoot.rotationPointY - (float)(0);
        this.leftFrontFoot.rotationPointZ = this.leftFrontFoot.rotationPointZ + (float)(0.6);


        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(36.5465), rightUpperArm.rotateAngleY + (float) Math.toRadians(-32.2654-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), rightUpperArm.rotateAngleZ + (float) Math.toRadians(101.0202+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));


        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(93.3723), rightLowerArm.rotateAngleY + (float) Math.toRadians(35.0939), rightLowerArm.rotateAngleZ + (float) Math.toRadians(-82.3978));


        this.setRotateAngle(rightFrontFoot, rightFrontFoot.rotateAngleX + (float) Math.toRadians(-124.75), rightFrontFoot.rotateAngleY + (float) Math.toRadians(-95.41), rightFrontFoot.rotateAngleZ + (float) Math.toRadians(-180));
        this.rightFrontFoot.rotationPointX = this.rightFrontFoot.rotationPointX + (float)(0.4);
        this.rightFrontFoot.rotationPointY = this.rightFrontFoot.rotationPointY - (float)(0);
        this.rightFrontFoot.rotationPointZ = this.rightFrontFoot.rotationPointZ + (float)(0.6);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(8), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*15), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-8.75), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*25), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(129.0958-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), leftLeg.rotateAngleY + (float) Math.toRadians(-33.6106), leftLeg.rotateAngleZ + (float) Math.toRadians(68.1545));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-38.7239-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), leftLeg2.rotateAngleY + (float) Math.toRadians(14.2444), leftLeg2.rotateAngleZ + (float) Math.toRadians(-0.387));


        this.setRotateAngle(leftHindFoot, leftHindFoot.rotateAngleX + (float) Math.toRadians(84.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), leftHindFoot.rotateAngleY + (float) Math.toRadians(0), leftHindFoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(129.8458-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), RightLeg.rotateAngleY + (float) Math.toRadians(33.6106), RightLeg.rotateAngleZ + (float) Math.toRadians(-68.1545));


        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(-38.2239-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), RightLeg2.rotateAngleY + (float) Math.toRadians(-14.2444), RightLeg2.rotateAngleZ + (float) Math.toRadians(0.387));


        this.setRotateAngle(rightHindFoot, rightHindFoot.rotateAngleX + (float) Math.toRadians(84.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-10), rightHindFoot.rotateAngleY + (float) Math.toRadians(0), rightHindFoot.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBernissartia e = (EntityPrehistoricFloraBernissartia) entity;
        animator.update(entity);

    }
}
