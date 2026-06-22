package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBeishanlong;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBeishanlong extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperJaw;
    private final AdvancedModelRenderer upperJaw2;
    private final AdvancedModelRenderer upperJaw3;
    private final AdvancedModelRenderer upperJaw3slope;
    private final AdvancedModelRenderer upperBeak;
    private final AdvancedModelRenderer upperJaw2slope;
    private final AdvancedModelRenderer upperJawslope;
    private final AdvancedModelRenderer leftCheek2;
    private final AdvancedModelRenderer rightCheek2;
    private final AdvancedModelRenderer headSlope;
    private final AdvancedModelRenderer headSlope2;
    private final AdvancedModelRenderer lowerJaw;
    private final AdvancedModelRenderer lowerJaw2;
    private final AdvancedModelRenderer lowerJaw3;
    private final AdvancedModelRenderer lowerJaw4;
    private final AdvancedModelRenderer lowerJaw4slope;
    private final AdvancedModelRenderer leftLowerbeak;
    private final AdvancedModelRenderer rightLowerbeak;
    private final AdvancedModelRenderer lowerJaw3slope;
    private final AdvancedModelRenderer leftChinside2;
    private final AdvancedModelRenderer rightChinside2;
    private final AdvancedModelRenderer leftChinside;
    private final AdvancedModelRenderer rightChinside;
    private final AdvancedModelRenderer leftMasseter;
    private final AdvancedModelRenderer rightMasseter;
    private final AdvancedModelRenderer throatPouch;
    private final AdvancedModelRenderer throatPouch2;
    private final AdvancedModelRenderer leftCheek;
    private final AdvancedModelRenderer rightCheek;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer throatPouch3;
    private final AdvancedModelRenderer throatPouch4;
    private final AdvancedModelRenderer neckFeathers2;
    private final AdvancedModelRenderer neckFeathers;
    private final AdvancedModelRenderer neck2Support;
    private final AdvancedModelRenderer neckFeathers3;
    private final AdvancedModelRenderer neckFeathers4;
    private final AdvancedModelRenderer neckSupport;
    private final AdvancedModelRenderer neckUnderfeathers;
    private final AdvancedModelRenderer neckFeathers5;
    private final AdvancedModelRenderer neckFeathers6;
    private final AdvancedModelRenderer chestSlope;
    private final AdvancedModelRenderer chestSlopefeathers;
    private final AdvancedModelRenderer chestSlopefeathers2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftFingers;
    private final AdvancedModelRenderer leftHandfeathers2;
    private final AdvancedModelRenderer rightHandfeathers_r1;
    private final AdvancedModelRenderer leftThumb;
    private final AdvancedModelRenderer leftThumbclaw;
    private final AdvancedModelRenderer leftHandfeathers;
    private final AdvancedModelRenderer leftArmfeathers2;
    private final AdvancedModelRenderer leftArmfeathers;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightFingers;
    private final AdvancedModelRenderer rightHandfeathers2;
    private final AdvancedModelRenderer leftHandfeathers_r1;
    private final AdvancedModelRenderer rightThumb;
    private final AdvancedModelRenderer rightThumbclaw;
    private final AdvancedModelRenderer rightHandfeathers;
    private final AdvancedModelRenderer rightArmfeathers2;
    private final AdvancedModelRenderer rightArmfeathers;
    private final AdvancedModelRenderer bodyFeathers;
    private final AdvancedModelRenderer bodyFeathers2;
    private final AdvancedModelRenderer bellySlope;
    private final AdvancedModelRenderer bellySlopefeathers;
    private final AdvancedModelRenderer bellySlopefeathers2;
    private final AdvancedModelRenderer bodyFeathers3;
    private final AdvancedModelRenderer bodyFeathers4;
    private final AdvancedModelRenderer bodyFeathers5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tailUnderfeathers5;
    private final AdvancedModelRenderer tailFanend;
    private final AdvancedModelRenderer rightTailfan4;
    private final AdvancedModelRenderer leftTailfan4;
    private final AdvancedModelRenderer tailUnderfeathers4;
    private final AdvancedModelRenderer rightTailfan3;
    private final AdvancedModelRenderer leftTailfan3;
    private final AdvancedModelRenderer tailUnderfeathers3;
    private final AdvancedModelRenderer rightTailfan2;
    private final AdvancedModelRenderer leftTailfan2;
    private final AdvancedModelRenderer tailUnderfeathers2;
    private final AdvancedModelRenderer rightTailfan;
    private final AdvancedModelRenderer leftTailfan;
    private final AdvancedModelRenderer tailUnderfeathers;
    private final AdvancedModelRenderer tailFeathers;
    private final AdvancedModelRenderer tailFeathers2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer leftLegfeathers2;
    private final AdvancedModelRenderer leftLegfeathers;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer rightLegfeathers2;
    private final AdvancedModelRenderer rightLegfeathers;
    private final AdvancedModelRenderer hipUnderfeathers;
    private final AdvancedModelRenderer hipFeathers;
    private final AdvancedModelRenderer hipFeathers2;
    private final AdvancedModelRenderer hipFeathers3;


    private ModelAnimator animator;

    public ModelBeishanlong() {
        this.textureWidth = 173;
        this.textureHeight = 200;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -4.64F, 1.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.2759F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 157, -5.5667F, -15.8607F, -11.4609F, 11, 23, 20, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.0667F, -11.0607F, -10.4609F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 63, 169, -7.0F, -4.5F, -14.0F, 14, 16, 15, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.2F, -13.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0848F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 136, -5.5F, -3.0F, -9.0F, 11, 10, 10, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.8F, -7.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.6793F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 43, 161, -3.0F, -1.5F, -6.5F, 6, 7, 8, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.6F, -6.4F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5308F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 43, 147, -2.0F, -1.5F, -7.0F, 4, 5, 8, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.05F, -6.2F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2546F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 97, 129, -1.5F, -1.5F, -6.5F, 3, 5, 7, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-0.01F, 0.3F, -6.2F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.7641F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 64, 155, -1.5F, -1.5F, -5.0F, 3, 7, 6, 0.0F, false));

        this.neck5_r1 = new AdvancedModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, 5.5F, 0.95F);
        this.neck4.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.48F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 66, 157, -1.5F, -1.9513F, -0.0286F, 3, 2, 4, -0.06F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.4F, -4.3F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.2759F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 39, 120, -2.0F, -1.0F, -3.5F, 4, 3, 4, 0.0F, false));

        this.upperJaw = new AdvancedModelRenderer(this);
        this.upperJaw.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.head.addChild(upperJaw);
        this.setRotateAngle(upperJaw, 0.1485F, 0.0F, 0.0F);
        this.upperJaw.cubeList.add(new ModelBox(upperJaw, 52, 112, -1.5F, -2.0F, -1.7F, 3, 2, 2, 0.0F, false));

        this.upperJaw2 = new AdvancedModelRenderer(this);
        this.upperJaw2.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.upperJaw.addChild(upperJaw2);
        this.setRotateAngle(upperJaw2, 0.1274F, 0.0F, 0.0F);
        this.upperJaw2.cubeList.add(new ModelBox(upperJaw2, 33, 140, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.upperJaw3 = new AdvancedModelRenderer(this);
        this.upperJaw3.setRotationPoint(0.02F, -1.0F, -3.0F);
        this.upperJaw2.addChild(upperJaw3);
        this.setRotateAngle(upperJaw3, 0.1911F, 0.0F, 0.0F);
        this.upperJaw3.cubeList.add(new ModelBox(upperJaw3, 45, 142, -1.0F, 0.0F, -2.4F, 2, 1, 3, 0.0F, false));

        this.upperJaw3slope = new AdvancedModelRenderer(this);
        this.upperJaw3slope.setRotationPoint(0.01F, 0.0F, -2.4F);
        this.upperJaw3.addChild(upperJaw3slope);
        this.setRotateAngle(upperJaw3slope, 0.145F, 0.0F, 0.0F);
        this.upperJaw3slope.cubeList.add(new ModelBox(upperJaw3slope, 53, 118, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.upperBeak = new AdvancedModelRenderer(this);
        this.upperBeak.setRotationPoint(-0.02F, 0.0F, -2.4F);
        this.upperJaw3.addChild(upperBeak);
        this.setRotateAngle(upperBeak, -0.8278F, 0.0F, 0.0F);
        this.upperBeak.cubeList.add(new ModelBox(upperBeak, 65, 125, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.upperJaw2slope = new AdvancedModelRenderer(this);
        this.upperJaw2slope.setRotationPoint(0.01F, -1.4F, -3.0F);
        this.upperJaw2.addChild(upperJaw2slope);
        this.setRotateAngle(upperJaw2slope, 0.2759F, 0.0F, 0.0F);
        this.upperJaw2slope.cubeList.add(new ModelBox(upperJaw2slope, 61, 107, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.upperJawslope = new AdvancedModelRenderer(this);
        this.upperJawslope.setRotationPoint(-0.01F, -2.4F, -1.8F);
        this.upperJaw.addChild(upperJawslope);
        this.setRotateAngle(upperJawslope, 0.2759F, 0.0F, 0.0F);
        this.upperJawslope.cubeList.add(new ModelBox(upperJawslope, 0, 123, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.leftCheek2 = new AdvancedModelRenderer(this);
        this.leftCheek2.setRotationPoint(-1.5F, -1.0F, -1.7F);
        this.upperJaw.addChild(leftCheek2);
        this.setRotateAngle(leftCheek2, 0.1274F, -0.1698F, 0.0213F);
        this.leftCheek2.cubeList.add(new ModelBox(leftCheek2, 9, 104, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.rightCheek2 = new AdvancedModelRenderer(this);
        this.rightCheek2.setRotationPoint(1.5F, -1.0F, -1.7F);
        this.upperJaw.addChild(rightCheek2);
        this.setRotateAngle(rightCheek2, 0.1274F, 0.1698F, -0.0213F);
        this.rightCheek2.cubeList.add(new ModelBox(rightCheek2, 9, 109, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.headSlope = new AdvancedModelRenderer(this);
        this.headSlope.setRotationPoint(0.02F, -1.1F, -3.4F);
        this.head.addChild(headSlope);
        this.setRotateAngle(headSlope, 0.6793F, 0.0F, 0.0F);
        this.headSlope.cubeList.add(new ModelBox(headSlope, 0, 117, -1.5F, 0.0F, -0.3F, 3, 2, 3, 0.0F, false));

        this.headSlope2 = new AdvancedModelRenderer(this);
        this.headSlope2.setRotationPoint(-0.01F, 0.0F, 2.7F);
        this.headSlope.addChild(headSlope2);
        this.setRotateAngle(headSlope2, -0.6793F, 0.0F, 0.0F);
        this.headSlope2.cubeList.add(new ModelBox(headSlope2, 0, 112, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.lowerJaw = new AdvancedModelRenderer(this);
        this.lowerJaw.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.head.addChild(lowerJaw);
        this.lowerJaw.cubeList.add(new ModelBox(lowerJaw, 39, 113, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.lowerJaw2 = new AdvancedModelRenderer(this);
        this.lowerJaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.lowerJaw.addChild(lowerJaw2);
        this.setRotateAngle(lowerJaw2, 0.1485F, 0.0F, 0.0F);
        this.lowerJaw2.cubeList.add(new ModelBox(lowerJaw2, 62, 120, -1.5F, 0.0F, -1.7F, 3, 2, 2, 0.0F, false));

        this.lowerJaw3 = new AdvancedModelRenderer(this);
        this.lowerJaw3.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.lowerJaw2.addChild(lowerJaw3);
        this.setRotateAngle(lowerJaw3, 0.1274F, 0.0F, 0.0F);
        this.lowerJaw3.cubeList.add(new ModelBox(lowerJaw3, 73, 112, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.lowerJaw4 = new AdvancedModelRenderer(this);
        this.lowerJaw4.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.lowerJaw3.addChild(lowerJaw4);
        this.setRotateAngle(lowerJaw4, 0.1911F, 0.0F, 0.0F);
        this.lowerJaw4.cubeList.add(new ModelBox(lowerJaw4, 64, 114, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerJaw4slope = new AdvancedModelRenderer(this);
        this.lowerJaw4slope.setRotationPoint(0.01F, 1.0F, -2.0F);
        this.lowerJaw4.addChild(lowerJaw4slope);
        this.setRotateAngle(lowerJaw4slope, -0.2759F, 0.0F, 0.0F);
        this.lowerJaw4slope.cubeList.add(new ModelBox(lowerJaw4slope, 84, 113, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.leftLowerbeak = new AdvancedModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(-0.42F, 1.0F, -1.9F);
        this.lowerJaw4.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, -0.5095F, 0.0848F, 0.0F);
        this.leftLowerbeak.cubeList.add(new ModelBox(leftLowerbeak, 66, 136, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.rightLowerbeak = new AdvancedModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(0.42F, 1.0F, -1.9F);
        this.lowerJaw4.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, -0.5095F, -0.0848F, 0.0F);
        this.rightLowerbeak.cubeList.add(new ModelBox(rightLowerbeak, 61, 136, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.lowerJaw3slope = new AdvancedModelRenderer(this);
        this.lowerJaw3slope.setRotationPoint(-0.01F, 1.5F, -3.0F);
        this.lowerJaw3.addChild(lowerJaw3slope);
        this.setRotateAngle(lowerJaw3slope, -0.1625F, 0.0F, 0.0F);
        this.lowerJaw3slope.cubeList.add(new ModelBox(lowerJaw3slope, 91, 93, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.leftChinside2 = new AdvancedModelRenderer(this);
        this.leftChinside2.setRotationPoint(-1.5F, 0.0F, -1.7F);
        this.lowerJaw2.addChild(leftChinside2);
        this.setRotateAngle(leftChinside2, 0.1274F, -0.1698F, 0.0F);
        this.leftChinside2.cubeList.add(new ModelBox(leftChinside2, 25, 104, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.rightChinside2 = new AdvancedModelRenderer(this);
        this.rightChinside2.setRotationPoint(1.5F, 0.0F, -1.7F);
        this.lowerJaw2.addChild(rightChinside2);
        this.setRotateAngle(rightChinside2, 0.1274F, 0.1698F, 0.0F);
        this.rightChinside2.cubeList.add(new ModelBox(rightChinside2, 25, 109, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.leftChinside = new AdvancedModelRenderer(this);
        this.leftChinside.setRotationPoint(-2.0F, 0.0F, -4.0F);
        this.lowerJaw.addChild(leftChinside);
        this.setRotateAngle(leftChinside, 0.1538F, -0.2972F, 0.0424F);
        this.leftChinside.cubeList.add(new ModelBox(leftChinside, 0, 102, 0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.rightChinside = new AdvancedModelRenderer(this);
        this.rightChinside.setRotationPoint(2.0F, 0.0F, -4.0F);
        this.lowerJaw.addChild(rightChinside);
        this.setRotateAngle(rightChinside, 0.1538F, 0.2972F, -0.0424F);
        this.rightChinside.cubeList.add(new ModelBox(rightChinside, 0, 107, -1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.leftMasseter = new AdvancedModelRenderer(this);
        this.leftMasseter.setRotationPoint(-1.4F, 0.1F, -3.8F);
        this.lowerJaw.addChild(leftMasseter);
        this.setRotateAngle(leftMasseter, -0.3821F, 0.0F, 0.0F);
        this.leftMasseter.cubeList.add(new ModelBox(leftMasseter, 105, 90, 0.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.rightMasseter = new AdvancedModelRenderer(this);
        this.rightMasseter.setRotationPoint(1.4F, 0.1F, -3.81F);
        this.lowerJaw.addChild(rightMasseter);
        this.setRotateAngle(rightMasseter, -0.3821F, 0.0F, 0.0F);
        this.rightMasseter.cubeList.add(new ModelBox(rightMasseter, 112, 96, -2.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(-0.01F, 2.0F, -4.1F);
        this.lowerJaw.addChild(throatPouch);
        this.setRotateAngle(throatPouch, -0.2122F, 0.0F, 0.0F);
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 106, 169, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.throatPouch2 = new AdvancedModelRenderer(this);
        this.throatPouch2.setRotationPoint(-0.01F, 0.0F, 3.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, 0.2972F, 0.0F, 0.0F);
        this.throatPouch2.cubeList.add(new ModelBox(throatPouch2, 107, 175, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.leftCheek = new AdvancedModelRenderer(this);
        this.leftCheek.setRotationPoint(-2.0F, 1.0F, -3.5F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, 0.1485F, -0.2546F, 0.0424F);
        this.leftCheek.cubeList.add(new ModelBox(leftCheek, 18, 106, 0.0F, 0.0F, -1.92F, 1, 1, 2, 0.0F, false));

        this.rightCheek = new AdvancedModelRenderer(this);
        this.rightCheek.setRotationPoint(2.0F, 1.0F, -3.5F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, 0.1485F, 0.2546F, -0.0424F);
        this.rightCheek.cubeList.add(new ModelBox(rightCheek, 18, 110, -1.0F, 0.0F, -1.92F, 1, 1, 2, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.55F, 0.4F, -2.4F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0201F, 3.1416F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 7, 109, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.53F, 0.4F, -2.4F);
        this.head.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, -0.0201F, -3.1416F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 7, 109, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.throatPouch3 = new AdvancedModelRenderer(this);
        this.throatPouch3.setRotationPoint(0.0F, 5.5F, 0.6F);
        this.neck4.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, 0.1698F, 0.0F, 0.0F);
        this.throatPouch3.cubeList.add(new ModelBox(throatPouch3, 123, 167, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.throatPouch4 = new AdvancedModelRenderer(this);
        this.throatPouch4.setRotationPoint(1.01F, 0.0F, -3.0F);
        this.throatPouch3.addChild(throatPouch4);
        this.setRotateAngle(throatPouch4, -0.4458F, 0.0F, 0.0F);
        this.throatPouch4.cubeList.add(new ModelBox(throatPouch4, 122, 173, -2.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.neckFeathers2 = new AdvancedModelRenderer(this);
        this.neckFeathers2.setRotationPoint(0.0F, -1.5F, -1.1F);
        this.neck3.addChild(neckFeathers2);
        this.setRotateAngle(neckFeathers2, 0.2335F, 0.0F, 0.0F);
        this.neckFeathers2.cubeList.add(new ModelBox(neckFeathers2, 28, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.neckFeathers = new AdvancedModelRenderer(this);
        this.neckFeathers.setRotationPoint(0.0F, -1.5F, -2.2F);
        this.neck3.addChild(neckFeathers);
        this.setRotateAngle(neckFeathers, 0.2972F, 0.0F, 0.0F);
        this.neckFeathers.cubeList.add(new ModelBox(neckFeathers, 23, 0, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.neck2Support = new AdvancedModelRenderer(this);
        this.neck2Support.setRotationPoint(0.01F, 3.5F, 1.0F);
        this.neck2.addChild(neck2Support);
        this.setRotateAngle(neck2Support, 0.5308F, 0.0F, 0.0F);
        this.neck2Support.cubeList.add(new ModelBox(neck2Support, 111, 142, -2.0F, -4.0F, 0.0F, 4, 4, 3, 0.0F, false));

        this.neckFeathers3 = new AdvancedModelRenderer(this);
        this.neckFeathers3.setRotationPoint(0.0F, -1.5F, -6.6F);
        this.neck2.addChild(neckFeathers3);
        this.setRotateAngle(neckFeathers3, 0.3609F, 0.0F, 0.0F);
        this.neckFeathers3.cubeList.add(new ModelBox(neckFeathers3, 39, 7, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.neckFeathers4 = new AdvancedModelRenderer(this);
        this.neckFeathers4.setRotationPoint(-0.01F, -1.5F, -4.2F);
        this.neck2.addChild(neckFeathers4);
        this.setRotateAngle(neckFeathers4, 0.5095F, 0.0F, 0.0F);
        this.neckFeathers4.cubeList.add(new ModelBox(neckFeathers4, 37, 0, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.neckSupport = new AdvancedModelRenderer(this);
        this.neckSupport.setRotationPoint(-0.01F, 5.5F, 1.5F);
        this.neck.addChild(neckSupport);
        this.setRotateAngle(neckSupport, 0.5519F, 0.0F, 0.0F);
        this.neckSupport.cubeList.add(new ModelBox(neckSupport, 111, 150, -3.0F, -5.0F, 0.0F, 6, 5, 4, 0.0F, false));

        this.neckUnderfeathers = new AdvancedModelRenderer(this);
        this.neckUnderfeathers.setRotationPoint(0.0F, 5.5F, -5.5F);
        this.neck.addChild(neckUnderfeathers);
        this.setRotateAngle(neckUnderfeathers, 1.1887F, 0.0F, 0.0F);
        this.neckUnderfeathers.cubeList.add(new ModelBox(neckUnderfeathers, 105, 0, -2.5F, 0.0F, 0.0F, 5, 9, 3, 0.0F, false));

        this.neckFeathers5 = new AdvancedModelRenderer(this);
        this.neckFeathers5.setRotationPoint(0.0F, -1.5F, -6.5F);
        this.neck.addChild(neckFeathers5);
        this.setRotateAngle(neckFeathers5, 0.3396F, 0.0F, 0.0F);
        this.neckFeathers5.cubeList.add(new ModelBox(neckFeathers5, 40, 21, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.neckFeathers6 = new AdvancedModelRenderer(this);
        this.neckFeathers6.setRotationPoint(0.0F, -1.5F, -3.3F);
        this.neck.addChild(neckFeathers6);
        this.setRotateAngle(neckFeathers6, 0.4458F, 0.0F, 0.0F);
        this.neckFeathers6.cubeList.add(new ModelBox(neckFeathers6, 53, 18, -2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.chestSlope = new AdvancedModelRenderer(this);
        this.chestSlope.setRotationPoint(0.0F, 7.0F, -9.0F);
        this.body2.addChild(chestSlope);
        this.setRotateAngle(chestSlope, -0.5732F, 0.0F, 0.0F);
        this.chestSlope.cubeList.add(new ModelBox(chestSlope, 61, 117, -5.0F, -6.0F, 0.0F, 10, 6, 11, 0.0F, false));

        this.chestSlopefeathers = new AdvancedModelRenderer(this);
        this.chestSlopefeathers.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestSlope.addChild(chestSlopefeathers);
        this.setRotateAngle(chestSlopefeathers, 1.125F, 0.0F, 0.0F);
        this.chestSlopefeathers.cubeList.add(new ModelBox(chestSlopefeathers, 122, 0, -4.0F, 0.0F, 0.0F, 8, 8, 4, 0.0F, false));

        this.chestSlopefeathers2 = new AdvancedModelRenderer(this);
        this.chestSlopefeathers2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.chestSlope.addChild(chestSlopefeathers2);
        this.setRotateAngle(chestSlopefeathers2, -0.1698F, 0.0F, 0.0F);
        this.chestSlopefeathers2.cubeList.add(new ModelBox(chestSlopefeathers2, 84, 3, -2.5F, -3.0F, 0.0F, 5, 4, 10, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(-5.0F, 6.5F, -5.5F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6989F, -0.0534F, 0.1698F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 132, 153, -2.5F, -1.0F, -2.0F, 4, 11, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.6F, 9.0F, 0.2F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8278F, 0.0F, -0.1698F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 119, 129, -1.5F, -0.5F, -2.0F, 3, 8, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-1.49F, 6.9F, -0.51F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0424F, 0.0F, -0.0637F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 93, 116, 0.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F, false));

        this.leftFingers = new AdvancedModelRenderer(this);
        this.leftFingers.setRotationPoint(2.07F, 3.3F, 0.5F);
        this.leftHand.addChild(leftFingers);
        this.setRotateAngle(leftFingers, 0.1485F, 0.0F, -0.2335F);
        this.leftFingers.cubeList.add(new ModelBox(leftFingers, 132, 122, -1.9F, 0.0F, -1.0F, 2, 10, 3, 0.0F, true));

        this.leftHandfeathers2 = new AdvancedModelRenderer(this);
        this.leftHandfeathers2.setRotationPoint(-2.3762F, 3.8943F, 1.3994F);
        this.leftFingers.addChild(leftHandfeathers2);
        this.setRotateAngle(leftHandfeathers2, 0.0124F, 0.148F, 0.0838F);


        this.rightHandfeathers_r1 = new AdvancedModelRenderer(this);
        this.rightHandfeathers_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHandfeathers2.addChild(rightHandfeathers_r1);
        this.setRotateAngle(rightHandfeathers_r1, 0.0F, -0.24F, 0.0F);
        this.rightHandfeathers_r1.cubeList.add(new ModelBox(rightHandfeathers_r1, 24, 28, 0.0F, -3.5F, -1.5F, 0, 7, 3, 0.0F, true));

        this.leftThumb = new AdvancedModelRenderer(this);
        this.leftThumb.setRotationPoint(1.51F, 3.3F, -0.75F);
        this.leftHand.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.0424F, 0.1698F, -0.2335F);
        this.leftThumb.cubeList.add(new ModelBox(leftThumb, 116, 103, -1.5F, 0.0F, -0.5F, 2, 5, 1, 0.0F, true));

        this.leftThumbclaw = new AdvancedModelRenderer(this);
        this.leftThumbclaw.setRotationPoint(-1.475F, 4.75F, 0.01F);
        this.leftThumb.addChild(leftThumbclaw);
        this.setRotateAngle(leftThumbclaw, 0.0F, 0.0F, -0.5308F);
        this.leftThumbclaw.cubeList.add(new ModelBox(leftThumbclaw, 111, 111, -0.0896F, 0.2517F, -0.5F, 2, 4, 1, 0.0F, true));

        this.leftHandfeathers = new AdvancedModelRenderer(this);
        this.leftHandfeathers.setRotationPoint(0.43F, 2.175F, 0.975F);
        this.leftHand.addChild(leftHandfeathers);
        this.setRotateAngle(leftHandfeathers, -0.308F, -0.1286F, -0.0349F);
        this.leftHandfeathers.cubeList.add(new ModelBox(leftHandfeathers, 28, 14, -0.303F, -1.442F, -0.0808F, 0, 4, 5, 0.0F, true));

        this.leftArmfeathers2 = new AdvancedModelRenderer(this);
        this.leftArmfeathers2.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.leftArm2.addChild(leftArmfeathers2);
        this.setRotateAngle(leftArmfeathers2, -0.1698F, -0.2122F, -0.0213F);
        this.leftArmfeathers2.cubeList.add(new ModelBox(leftArmfeathers2, 25, 0, -0.0666F, 0.0F, 0.0F, 0, 9, 6, 0.0F, true));

        this.leftArmfeathers = new AdvancedModelRenderer(this);
        this.leftArmfeathers.setRotationPoint(-2.0F, 1.2F, 3.0F);
        this.leftArm.addChild(leftArmfeathers);
        this.setRotateAngle(leftArmfeathers, -0.1698F, -0.1911F, 0.0F);
        this.leftArmfeathers.cubeList.add(new ModelBox(leftArmfeathers, 14, 0, -0.3666F, 0.0F, 0.0F, 1, 11, 4, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(5.0F, 6.5F, -5.5F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.7001F, 0.0281F, -0.2032F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 132, 153, -1.5F, -1.0F, -2.0F, 4, 11, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.6F, 9.0F, 0.2F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8278F, 0.0F, 0.1698F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 119, 129, -1.5F, -0.5F, -2.0F, 3, 8, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(1.49F, 6.9F, -0.51F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0424F, 0.0F, 0.0637F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 93, 116, -2.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F, true));

        this.rightFingers = new AdvancedModelRenderer(this);
        this.rightFingers.setRotationPoint(-2.07F, 3.3F, 0.5F);
        this.rightHand.addChild(rightFingers);
        this.setRotateAngle(rightFingers, 0.1485F, 0.0F, 0.2335F);
        this.rightFingers.cubeList.add(new ModelBox(rightFingers, 132, 122, -0.1F, 0.0F, -1.0F, 2, 10, 3, 0.0F, false));

        this.rightHandfeathers2 = new AdvancedModelRenderer(this);
        this.rightHandfeathers2.setRotationPoint(2.3762F, 3.8943F, 1.3994F);
        this.rightFingers.addChild(rightHandfeathers2);
        this.setRotateAngle(rightHandfeathers2, 0.0124F, -0.148F, -0.0838F);


        this.leftHandfeathers_r1 = new AdvancedModelRenderer(this);
        this.leftHandfeathers_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHandfeathers2.addChild(leftHandfeathers_r1);
        this.setRotateAngle(leftHandfeathers_r1, 0.0F, 0.24F, 0.0F);
        this.leftHandfeathers_r1.cubeList.add(new ModelBox(leftHandfeathers_r1, 24, 28, 0.0F, -3.5F, -1.5F, 0, 7, 3, 0.0F, false));

        this.rightThumb = new AdvancedModelRenderer(this);
        this.rightThumb.setRotationPoint(-1.51F, 3.3F, -0.75F);
        this.rightHand.addChild(rightThumb);
        this.setRotateAngle(rightThumb, -0.0424F, -0.1698F, 0.2335F);
        this.rightThumb.cubeList.add(new ModelBox(rightThumb, 116, 103, -0.5F, 0.0F, -0.5F, 2, 5, 1, 0.0F, false));

        this.rightThumbclaw = new AdvancedModelRenderer(this);
        this.rightThumbclaw.setRotationPoint(1.475F, 4.75F, 0.01F);
        this.rightThumb.addChild(rightThumbclaw);
        this.setRotateAngle(rightThumbclaw, 0.0F, 0.0F, 0.5308F);
        this.rightThumbclaw.cubeList.add(new ModelBox(rightThumbclaw, 111, 111, -1.9104F, 0.2517F, -0.5F, 2, 4, 1, 0.0F, false));

        this.rightHandfeathers = new AdvancedModelRenderer(this);
        this.rightHandfeathers.setRotationPoint(-0.43F, 2.175F, 0.975F);
        this.rightHand.addChild(rightHandfeathers);
        this.setRotateAngle(rightHandfeathers, -0.308F, 0.1286F, 0.0349F);
        this.rightHandfeathers.cubeList.add(new ModelBox(rightHandfeathers, 28, 14, 0.2947F, -1.442F, -0.0808F, 0, 4, 5, 0.0F, false));

        this.rightArmfeathers2 = new AdvancedModelRenderer(this);
        this.rightArmfeathers2.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.rightArm2.addChild(rightArmfeathers2);
        this.setRotateAngle(rightArmfeathers2, -0.1698F, 0.2122F, 0.0213F);
        this.rightArmfeathers2.cubeList.add(new ModelBox(rightArmfeathers2, 25, 0, -0.1166F, 0.0F, 0.0F, 0, 9, 6, 0.0F, false));

        this.rightArmfeathers = new AdvancedModelRenderer(this);
        this.rightArmfeathers.setRotationPoint(2.0F, 1.2F, 3.0F);
        this.rightArm.addChild(rightArmfeathers);
        this.setRotateAngle(rightArmfeathers, -0.1698F, 0.1911F, 0.0F);
        this.rightArmfeathers.cubeList.add(new ModelBox(rightArmfeathers, 14, 0, -0.8916F, 0.0F, 0.0F, 1, 11, 4, 0.0F, false));

        this.bodyFeathers = new AdvancedModelRenderer(this);
        this.bodyFeathers.setRotationPoint(0.0F, -3.0F, -7.8F);
        this.body2.addChild(bodyFeathers);
        this.setRotateAngle(bodyFeathers, 0.3183F, 0.0F, 0.0F);
        this.bodyFeathers.cubeList.add(new ModelBox(bodyFeathers, 72, 18, -3.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.bodyFeathers2 = new AdvancedModelRenderer(this);
        this.bodyFeathers2.setRotationPoint(0.0F, -3.0F, -4.5F);
        this.body2.addChild(bodyFeathers2);
        this.setRotateAngle(bodyFeathers2, 0.2759F, 0.0F, 0.0F);
        this.bodyFeathers2.cubeList.add(new ModelBox(bodyFeathers2, 95, 18, -3.5F, 0.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.bellySlope = new AdvancedModelRenderer(this);
        this.bellySlope.setRotationPoint(0.0F, 11.5F, -14.0F);
        this.body.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.4458F, 0.0F, 0.0F);
        this.bellySlope.cubeList.add(new ModelBox(bellySlope, 0, 114, -6.0F, -7.0F, 0.0F, 12, 7, 14, 0.0F, false));

        this.bellySlopefeathers = new AdvancedModelRenderer(this);
        this.bellySlopefeathers.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bellySlope.addChild(bellySlopefeathers);
        this.setRotateAngle(bellySlopefeathers, -0.0848F, 0.0F, 0.0F);
        this.bellySlopefeathers.cubeList.add(new ModelBox(bellySlopefeathers, 133, 0, -4.5F, -1.5F, 0.0F, 9, 3, 14, 0.0F, false));

        this.bellySlopefeathers2 = new AdvancedModelRenderer(this);
        this.bellySlopefeathers2.setRotationPoint(0.0F, -0.7F, 1.0F);
        this.bellySlope.addChild(bellySlopefeathers2);
        this.setRotateAngle(bellySlopefeathers2, -0.2335F, 0.0F, 0.0F);
        this.bellySlopefeathers2.cubeList.add(new ModelBox(bellySlopefeathers2, 67, 0, -2.0F, -1.5F, 0.0F, 4, 4, 9, 0.0F, false));

        this.bodyFeathers3 = new AdvancedModelRenderer(this);
        this.bodyFeathers3.setRotationPoint(0.0F, -4.5F, -13.8F);
        this.body.addChild(bodyFeathers3);
        this.setRotateAngle(bodyFeathers3, 0.2759F, 0.0F, 0.0F);
        this.bodyFeathers3.cubeList.add(new ModelBox(bodyFeathers3, 72, 26, -4.0F, 0.0F, 0.0F, 8, 2, 6, 0.0F, false));

        this.bodyFeathers4 = new AdvancedModelRenderer(this);
        this.bodyFeathers4.setRotationPoint(0.0F, -4.5F, -9.5F);
        this.body.addChild(bodyFeathers4);
        this.setRotateAngle(bodyFeathers4, 0.2546F, 0.0F, 0.0F);
        this.bodyFeathers4.cubeList.add(new ModelBox(bodyFeathers4, 100, 27, -4.5F, 0.0F, 0.0F, 9, 2, 7, 0.0F, false));

        this.bodyFeathers5 = new AdvancedModelRenderer(this);
        this.bodyFeathers5.setRotationPoint(0.0F, -4.5F, -4.2F);
        this.body.addChild(bodyFeathers5);
        this.setRotateAngle(bodyFeathers5, 0.2335F, 0.0F, 0.0F);
        this.bodyFeathers5.cubeList.add(new ModelBox(bodyFeathers5, 125, 29, -5.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0667F, -10.7607F, 7.5391F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0213F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 122, 170, -4.5F, -5.0F, -1.0F, 9, 14, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.8F, 14.2F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2335F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 83, 145, -3.0F, -3.0F, -1.0F, 6, 8, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.3F, 13.3F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2122F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 60, 135, -2.0F, -1.5F, -1.0F, 4, 5, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3F, 12.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1698F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 127, -1.5F, -1.0F, -0.5F, 3, 3, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 10.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3821F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 107, 171, -1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.2F, 9.5F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2335F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 83, 135, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tailUnderfeathers5 = new AdvancedModelRenderer(this);
        this.tailUnderfeathers5.setRotationPoint(-0.01F, -0.3F, 0.0F);
        this.tail6.addChild(tailUnderfeathers5);
        this.setRotateAngle(tailUnderfeathers5, -0.0848F, 0.0F, 0.0F);
        this.tailUnderfeathers5.cubeList.add(new ModelBox(tailUnderfeathers5, 58, 64, 0.0F, 0.0F, 0.0F, 0, 3, 9, 0.0F, false));

        this.tailFanend = new AdvancedModelRenderer(this);
        this.tailFanend.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.tail6.addChild(tailFanend);
        this.setRotateAngle(tailFanend, -0.6156F, 0.0F, 0.0F);
        this.tailFanend.cubeList.add(new ModelBox(tailFanend, 49, 27, -3.5F, 0.0F, 0.0F, 7, 1, 8, 0.0F, false));

        this.rightTailfan4 = new AdvancedModelRenderer(this);
        this.rightTailfan4.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.tail6.addChild(rightTailfan4);
        this.setRotateAngle(rightTailfan4, 0.0F, 0.0F, -0.7854F);
        this.rightTailfan4.cubeList.add(new ModelBox(rightTailfan4, 97, 38, -7.0F, -0.5F, 0.0F, 7, 1, 13, 0.0F, false));

        this.leftTailfan4 = new AdvancedModelRenderer(this);
        this.leftTailfan4.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.tail6.addChild(leftTailfan4);
        this.setRotateAngle(leftTailfan4, 0.0F, 0.0F, 0.7854F);
        this.leftTailfan4.cubeList.add(new ModelBox(leftTailfan4, 0, 16, 0.0F, -0.5F, 0.0F, 7, 1, 13, 0.0F, false));

        this.tailUnderfeathers4 = new AdvancedModelRenderer(this);
        this.tailUnderfeathers4.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail5.addChild(tailUnderfeathers4);
        this.setRotateAngle(tailUnderfeathers4, 0.0848F, 0.0F, 0.0F);
        this.tailUnderfeathers4.cubeList.add(new ModelBox(tailUnderfeathers4, 58, 60, 0.0F, 0.0F, 0.0F, 0, 2, 10, 0.0F, false));

        this.rightTailfan3 = new AdvancedModelRenderer(this);
        this.rightTailfan3.setRotationPoint(-0.3F, 0.0F, 5.0F);
        this.tail5.addChild(rightTailfan3);
        this.setRotateAngle(rightTailfan3, 0.0F, -0.0637F, -0.7854F);
        this.rightTailfan3.cubeList.add(new ModelBox(rightTailfan3, 73, 36, -6.0F, -0.5F, -5.0F, 6, 1, 12, 0.0F, false));

        this.leftTailfan3 = new AdvancedModelRenderer(this);
        this.leftTailfan3.setRotationPoint(0.3F, 0.0F, 5.0F);
        this.tail5.addChild(leftTailfan3);
        this.setRotateAngle(leftTailfan3, 0.0F, 0.0637F, 0.7854F);
        this.leftTailfan3.cubeList.add(new ModelBox(leftTailfan3, 24, 31, 0.0F, -0.5F, -5.0F, 6, 1, 12, 0.0F, false));

        this.tailUnderfeathers3 = new AdvancedModelRenderer(this);
        this.tailUnderfeathers3.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.tail4.addChild(tailUnderfeathers3);
        this.setRotateAngle(tailUnderfeathers3, 0.1274F, 0.0F, 0.0F);
        this.tailUnderfeathers3.cubeList.add(new ModelBox(tailUnderfeathers3, 38, 52, -1.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.rightTailfan2 = new AdvancedModelRenderer(this);
        this.rightTailfan2.setRotationPoint(-0.9F, 0.7F, 5.5F);
        this.tail4.addChild(rightTailfan2);
        this.setRotateAngle(rightTailfan2, 0.0F, -0.1274F, -0.7854F);
        this.rightTailfan2.cubeList.add(new ModelBox(rightTailfan2, 49, 37, -4.5F, -0.5F, -6.0F, 5, 1, 13, 0.0F, false));

        this.leftTailfan2 = new AdvancedModelRenderer(this);
        this.leftTailfan2.setRotationPoint(0.9F, 0.7F, 5.5F);
        this.tail4.addChild(leftTailfan2);
        this.setRotateAngle(leftTailfan2, 0.0F, 0.1274F, 0.7854F);
        this.leftTailfan2.cubeList.add(new ModelBox(leftTailfan2, 0, 31, -0.5F, -0.5F, -6.0F, 5, 1, 13, 0.0F, false));

        this.tailUnderfeathers2 = new AdvancedModelRenderer(this);
        this.tailUnderfeathers2.setRotationPoint(0.0F, 3.4F, -1.0F);
        this.tail3.addChild(tailUnderfeathers2);
        this.setRotateAngle(tailUnderfeathers2, 0.1698F, 0.0F, 0.0F);
        this.tailUnderfeathers2.cubeList.add(new ModelBox(tailUnderfeathers2, 75, 76, -1.5F, 0.0F, 0.0F, 3, 3, 13, 0.0F, false));

        this.rightTailfan = new AdvancedModelRenderer(this);
        this.rightTailfan.setRotationPoint(-1.4F, 1.5F, 6.0F);
        this.tail3.addChild(rightTailfan);
        this.setRotateAngle(rightTailfan, 0.1274F, 0.0424F, -0.7854F);
        this.rightTailfan.cubeList.add(new ModelBox(rightTailfan, 20, 47, -3.0F, 0.0F, -7.0F, 3, 0, 15, 0.0F, false));

        this.leftTailfan = new AdvancedModelRenderer(this);
        this.leftTailfan.setRotationPoint(1.4F, 1.5F, 6.0F);
        this.tail3.addChild(leftTailfan);
        this.setRotateAngle(leftTailfan, 0.1274F, -0.0424F, 0.7854F);
        this.leftTailfan.cubeList.add(new ModelBox(leftTailfan, 27, 47, 0.0F, 0.0F, -7.0F, 3, 0, 15, 0.0F, false));

        this.tailUnderfeathers = new AdvancedModelRenderer(this);
        this.tailUnderfeathers.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.tail2.addChild(tailUnderfeathers);
        this.setRotateAngle(tailUnderfeathers, 0.0848F, 0.0F, 0.0F);
        this.tailUnderfeathers.cubeList.add(new ModelBox(tailUnderfeathers, 52, 52, -2.5F, 0.0F, 0.0F, 5, 2, 15, 0.0F, false));

        this.tailFeathers = new AdvancedModelRenderer(this);
        this.tailFeathers.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.tail.addChild(tailFeathers);
        this.setRotateAngle(tailFeathers, 0.1698F, 0.0F, 0.0F);
        this.tailFeathers.cubeList.add(new ModelBox(tailFeathers, 116, 63, -3.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.tailFeathers2 = new AdvancedModelRenderer(this);
        this.tailFeathers2.setRotationPoint(0.0F, -5.0F, 6.0F);
        this.tail.addChild(tailFeathers2);
        this.setRotateAngle(tailFeathers2, 0.1274F, 0.0F, 0.0F);
        this.tailFeathers2.cubeList.add(new ModelBox(tailFeathers2, 114, 72, -2.5F, 0.0F, 0.0F, 5, 1, 7, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(-5.0667F, -6.8607F, -1.4608F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1485F, 0.0F, -0.0424F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 46, -4.0F, -2.5F, -4.0F, 6, 16, 11, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.0F, 13.0F, -3.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4245F, 0.0F, 0.0424F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 35, 66, -2.5F, 0.0F, 0.0F, 5, 16, 6, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5732F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 58, 77, -2.0F, 0.0F, -2.5F, 4, 10, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.08F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.2759F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 75, 93, -2.5F, -1.0F, -3.5F, 5, 3, 5, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.99F, -3.1F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 86, 106, -3.5F, -1.0F, -4.5F, 7, 2, 5, 0.0F, false));

        this.leftLegfeathers2 = new AdvancedModelRenderer(this);
        this.leftLegfeathers2.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftLegfeathers2);
        this.setRotateAngle(leftLegfeathers2, -0.0424F, 0.0F, -0.0175F);
        this.leftLegfeathers2.cubeList.add(new ModelBox(leftLegfeathers2, 78, 51, -2.5F, 0.0F, 0.0F, 5, 7, 8, 0.0F, false));

        this.leftLegfeathers = new AdvancedModelRenderer(this);
        this.leftLegfeathers.setRotationPoint(-2.0F, -1.0F, 6.7F);
        this.leftLeg.addChild(leftLegfeathers);
        this.setRotateAngle(leftLegfeathers, -0.1061F, 0.0F, 0.0424F);
        this.leftLegfeathers.cubeList.add(new ModelBox(leftLegfeathers, 105, 54, -1.0F, 0.0F, 0.0F, 2, 15, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(4.9333F, -6.8607F, -1.4608F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1485F, 0.0F, 0.0424F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 46, -2.0F, -2.5F, -4.0F, 6, 16, 11, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.0F, 13.0F, -3.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4245F, 0.0F, -0.0424F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 35, 66, -2.5F, 0.0F, 0.0F, 5, 16, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5732F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 58, 77, -2.0F, 0.0F, -2.5F, 4, 10, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.08F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.2759F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 75, 93, -2.5F, -1.0F, -3.5F, 5, 3, 5, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.99F, -3.1F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 86, 106, -3.5F, -1.0F, -4.5F, 7, 2, 5, 0.0F, true));

        this.rightLegfeathers2 = new AdvancedModelRenderer(this);
        this.rightLegfeathers2.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightLegfeathers2);
        this.setRotateAngle(rightLegfeathers2, -0.0424F, 0.0F, 0.0175F);
        this.rightLegfeathers2.cubeList.add(new ModelBox(rightLegfeathers2, 78, 51, -2.5F, 0.0F, 0.0F, 5, 7, 8, 0.0F, true));

        this.rightLegfeathers = new AdvancedModelRenderer(this);
        this.rightLegfeathers.setRotationPoint(2.0F, -1.0F, 6.7F);
        this.rightLeg.addChild(rightLegfeathers);
        this.setRotateAngle(rightLegfeathers, -0.1061F, 0.0F, -0.0424F);
        this.rightLegfeathers.cubeList.add(new ModelBox(rightLegfeathers, 105, 54, -1.0F, 0.0F, 0.0F, 2, 15, 3, 0.0F, true));

        this.hipUnderfeathers = new AdvancedModelRenderer(this);
        this.hipUnderfeathers.setRotationPoint(-0.0667F, 7.1393F, -10.7608F);
        this.hips.addChild(hipUnderfeathers);
        this.setRotateAngle(hipUnderfeathers, 0.1485F, 0.0F, 0.0F);
        this.hipUnderfeathers.cubeList.add(new ModelBox(hipUnderfeathers, 40, 2, -3.5F, -0.5F, 0.0F, 7, 3, 12, 0.0F, false));

        this.hipFeathers = new AdvancedModelRenderer(this);
        this.hipFeathers.setRotationPoint(-0.0667F, -15.8607F, -10.4609F);
        this.hips.addChild(hipFeathers);
        this.setRotateAngle(hipFeathers, 0.2546F, 0.0F, 0.0F);
        this.hipFeathers.cubeList.add(new ModelBox(hipFeathers, 125, 40, -4.5F, 0.0F, 0.0F, 9, 2, 8, 0.0F, false));

        this.hipFeathers2 = new AdvancedModelRenderer(this);
        this.hipFeathers2.setRotationPoint(-0.0667F, -15.8607F, -3.9609F);
        this.hips.addChild(hipFeathers2);
        this.setRotateAngle(hipFeathers2, 0.2122F, 0.0F, 0.0F);
        this.hipFeathers2.cubeList.add(new ModelBox(hipFeathers2, 137, 55, -4.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F, false));

        this.hipFeathers3 = new AdvancedModelRenderer(this);
        this.hipFeathers3.setRotationPoint(-0.0667F, -15.8607F, 2.0391F);
        this.hips.addChild(hipFeathers3);
        this.setRotateAngle(hipFeathers3, 0.1698F, 0.0F, 0.0F);
        this.hipFeathers3.cubeList.add(new ModelBox(hipFeathers3, 116, 53, -3.5F, 0.0F, 0.0F, 7, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.165F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.4F;
        this.root.offsetX = 0.1F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(2);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        setRotateAngle(root, 0.0F, 4.0F, 0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraBeishanlong entityBeishanlong = (EntityPrehistoricFloraBeishanlong) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityBeishanlong.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityBeishanlong.getAnimation() == entityBeishanlong.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityBeishanlong.isReallyInWater()) {

                if (f3 == 0.0F || !entityBeishanlong.getIsMoving()) {
                    if (entityBeishanlong.getAnimation() != entityBeishanlong.EAT_ANIMATION
                            && entityBeishanlong.getAnimation() != entityBeishanlong.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityBeishanlong.getIsFast()) { //Running


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
        this.leftEye.setScale(1,1,1);
        this.rightEye.setScale(1,1,1);
        EntityPrehistoricFloraBeishanlong ee = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;

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
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.SAND_ANIMATION) {
            animSand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 7) / 5) * (0-(-9)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 7) * (89.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-100-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 89.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-100 + (((tickAnim - 7) / 5) * (-74.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*100-(89.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-100)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -74.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*100 + (((tickAnim - 12) / 6) * (0-(-74.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*100)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -7.75 + (((tickAnim - 7) / 5) * (7.5-(-7.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 12) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -26.5 + (((tickAnim - 7) / 5) * (-34-(-26.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -34 + (((tickAnim - 12) / 6) * (0-(-34)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.75 + (((tickAnim - 7) / 5) * (-29-(0.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -29 + (((tickAnim - 12) / 6) * (0-(-29)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 25.5 + (((tickAnim - 7) / 5) * (27.48-(25.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 27.48 + (((tickAnim - 12) / 6) * (0-(27.48)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 7) / 5) * (8.5-(9)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 8.5 + (((tickAnim - 12) / 6) * (0-(8.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.3-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0.3 + (((tickAnim - 12) / 6) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 13 + (((tickAnim - 7) / 5) * (22.25-(13)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 22.25 + (((tickAnim - 12) / 6) * (0-(22.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (20.5-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 20.5 + (((tickAnim - 12) / 6) * (0-(20.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-37.73479-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (13.32747-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-37.5878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*100-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -37.73479 + (((tickAnim - 5) / 7) * (-98.9516-(-37.73479)));
            yy = 13.32747 + (((tickAnim - 5) / 7) * (-12.14133-(13.32747)));
            zz = -37.5878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*100 + (((tickAnim - 5) / 7) * (13.14693-(-37.5878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*100)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -98.9516 + (((tickAnim - 12) / 6) * (0-(-98.9516)));
            yy = -12.14133 + (((tickAnim - 12) / 6) * (0-(-12.14133)));
            zz = 13.14693 + (((tickAnim - 12) / 6) * (0-(13.14693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.9-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.57834-(0)));
            yy = 5.9 + (((tickAnim - 5) / 3) * (7.75113-(5.9)));
            zz = -6.7 + (((tickAnim - 5) / 3) * (4.35861-(-6.7)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.57834 + (((tickAnim - 8) / 4) * (38.25-(-0.57834)));
            yy = 7.75113 + (((tickAnim - 8) / 4) * (0-(7.75113)));
            zz = 4.35861 + (((tickAnim - 8) / 4) * (-50.25-(4.35861)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 38.25 + (((tickAnim - 12) / 6) * (0-(38.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = -50.25 + (((tickAnim - 12) / 6) * (0-(-50.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90 + (((tickAnim - 0) / 5) * (15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 5) / 3) * (10.75-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 10.75 + (((tickAnim - 8) / 1) * (10.75-(10.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 10.75 + (((tickAnim - 9) / 3) * (-38.5-(10.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = -38.5 + (((tickAnim - 12) / 6) * (0-(-38.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90 + (((tickAnim - 0) / 5) * (25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 25 + (((tickAnim - 5) / 3) * (25-(25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 8) / 1) * (25-(25)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 25 + (((tickAnim - 9) / 3) * (-25.5-(25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -25.5 + (((tickAnim - 12) / 1) * (-65.5-(-25.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -65.5 + (((tickAnim - 13) / 2) * (-65.5-(-65.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -65.5 + (((tickAnim - 15) / 3) * (0-(-65.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(xx), leftFingers.rotateAngleY + (float) Math.toRadians(yy), leftFingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90 + (((tickAnim - 0) / 5) * (20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-90)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 20 + (((tickAnim - 5) / 3) * (20-(20)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 20 + (((tickAnim - 8) / 1) * (20-(20)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 20 + (((tickAnim - 9) / 3) * (-24.5-(20)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -24.5 + (((tickAnim - 12) / 1) * (-49.32-(-24.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -49.32 + (((tickAnim - 13) / 2) * (-49.32-(-49.32)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -49.32 + (((tickAnim - 15) / 3) * (0-(-49.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(xx), leftThumb.rotateAngleY + (float) Math.toRadians(yy), leftThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (28.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 28.25 + (((tickAnim - 8) / 5) * (0-(28.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumbclaw, leftThumbclaw.rotateAngleX + (float) Math.toRadians(xx), leftThumbclaw.rotateAngleY + (float) Math.toRadians(yy), leftThumbclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 7) / 5) * (0-(6.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 7) / 5) * (0-(2.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-30.06759-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-80.02786-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 13.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 5) * (-39.8409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(13.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -30.06759 + (((tickAnim - 7) / 5) * (-12.11964-(-30.06759)));
            zz = -80.02786 + (((tickAnim - 7) / 5) * (-15.1953-(-80.02786)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -39.8409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 12) / 6) * (0-(-39.8409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = -12.11964 + (((tickAnim - 12) / 6) * (0-(-12.11964)));
            zz = -15.1953 + (((tickAnim - 12) / 6) * (0-(-15.1953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.92445-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (14.23496-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (41.55216-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 31.92445 + (((tickAnim - 12) / 6) * (0-(31.92445)));
            yy = 14.23496 + (((tickAnim - 12) / 6) * (0-(14.23496)));
            zz = 41.55216 + (((tickAnim - 12) / 6) * (0-(41.55216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-20.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = -20.5 + (((tickAnim - 7) / 5) * (28-(-20.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 28 + (((tickAnim - 12) / 6) * (0-(28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-28.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = -28.25 + (((tickAnim - 7) / 11) * (0-(-28.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(xx), rightFingers.rotateAngleY + (float) Math.toRadians(yy), rightFingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-31.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = -31.25 + (((tickAnim - 7) / 11) * (0-(-31.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(xx), rightThumb.rotateAngleY + (float) Math.toRadians(yy), rightThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 7) / 5) * (0-(6.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 7) / 5) * (0-(2.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 105;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30*0.5))*30 + (((tickAnim - 0) / 50) * (-11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*7-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30*0.5))*30)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*7 + (((tickAnim - 50) / 25) * (-3.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+40))*15-(-11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*7)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -3.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+40))*15 + (((tickAnim - 75) / 30) * (0-(-3.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+40))*15)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40*1))*-20 + (((tickAnim - 0) / 50) * (-2.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40*1))*-20)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -2.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*10 + (((tickAnim - 50) / 25) * (0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+30))*25-(-2.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*10)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+30))*25 + (((tickAnim - 75) / 30) * (0-(0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+30))*25)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*30 + (((tickAnim - 0) / 50) * (10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*30)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*10 + (((tickAnim - 50) / 25) * (-8.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30-(10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*10)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -8.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30 + (((tickAnim - 75) / 30) * (0-(-8.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -11.5 + (((tickAnim - 75) / 30) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 75) {
            xx = 7.75 + (((tickAnim - 44) / 31) * (22.75-(7.75)));
            yy = 0 + (((tickAnim - 44) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 31) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 92) {
            xx = 22.75 + (((tickAnim - 75) / 17) * (0-(22.75)));
            yy = 0 + (((tickAnim - 75) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 75) {
            xx = -10.5 + (((tickAnim - 44) / 31) * (-12-(-10.5)));
            yy = 0 + (((tickAnim - 44) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 31) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -12 + (((tickAnim - 75) / 30) * (0-(-12)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 0) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 28) * (0.86-(1)));
            zz = 1 + (((tickAnim - 0) / 28) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 28) / 47) * (1-(1)));
            yy = 0.86 + (((tickAnim - 28) / 47) * (0.08-(0.86)));
            zz = 1 + (((tickAnim - 28) / 47) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 75) / 17) * (1-(1)));
            yy = 0.08 + (((tickAnim - 75) / 17) * (1-(0.08)));
            zz = 1 + (((tickAnim - 75) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 75) {
            xx = 8.5 + (((tickAnim - 44) / 31) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 44) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 31) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 8.5 + (((tickAnim - 75) / 30) * (0-(8.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(xx), throatPouch3.rotateAngleY + (float) Math.toRadians(yy), throatPouch3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 0) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 28) * (0.86-(1)));
            zz = 1 + (((tickAnim - 0) / 28) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 28) / 47) * (1-(1)));
            yy = 0.86 + (((tickAnim - 28) / 47) * (0.08-(0.86)));
            zz = 1 + (((tickAnim - 28) / 47) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 75) / 17) * (1-(1)));
            yy = 0.08 + (((tickAnim - 75) / 17) * (1-(0.08)));
            zz = 1 + (((tickAnim - 75) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);
       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-3.9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*4), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1.95-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(2.6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-220))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(3.8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-290))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(2.025-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-330))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-28.16-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -28.16 + (((tickAnim - 9) / 11) * (-17.25-(-28.16)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -17.25 + (((tickAnim - 20) / 16) * (14.62-(-17.25)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 14.62 + (((tickAnim - 36) / 14) * (0-(14.62)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 38 + (((tickAnim - 9) / 11) * (0-(38)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (32-(0)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 36) / 14) * (0-(32)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-44.15-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -44.15 + (((tickAnim - 9) / 11) * (3.5-(-44.15)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 3.5 + (((tickAnim - 20) / 16) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 3.5 + (((tickAnim - 36) / 7) * (-57.13-(3.5)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -57.13 + (((tickAnim - 43) / 7) * (0-(-57.13)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = -1.125 + (((tickAnim - 20) / 16) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = -1.125 + (((tickAnim - 36) / 7) * (-1.105-(-1.125)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -1.105 + (((tickAnim - 43) / 7) * (0-(-1.105)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (71.2014-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.18655-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.00477-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 71.2014 + (((tickAnim - 9) / 11) * (13.53034-(71.2014)));
            yy = 0.18655 + (((tickAnim - 9) / 11) * (0.40701-(0.18655)));
            zz = 0.00477 + (((tickAnim - 9) / 11) * (0.0104-(0.00477)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 13.53034 + (((tickAnim - 20) / 5) * (-7.25-(13.53034)));
            yy = 0.40701 + (((tickAnim - 20) / 5) * (0-(0.40701)));
            zz = 0.0104 + (((tickAnim - 20) / 5) * (0-(0.0104)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -7.25 + (((tickAnim - 25) / 11) * (70.26517-(-7.25)));
            yy = 0 + (((tickAnim - 25) / 11) * (0.2035-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0.0052-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 70.26517 + (((tickAnim - 36) / 14) * (0-(70.26517)));
            yy = 0.2035 + (((tickAnim - 36) / 14) * (0-(0.2035)));
            zz = 0.0052 + (((tickAnim - 36) / 14) * (0-(0.0052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = -0.4 + (((tickAnim - 20) / 30) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (36-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 36 + (((tickAnim - 9) / 11) * (0-(36)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (-45.3-(0)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -45.3 + (((tickAnim - 31) / 5) * (45.75-(-45.3)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 45.75 + (((tickAnim - 36) / 3) * (82.33-(45.75)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 82.33 + (((tickAnim - 39) / 4) * (82.33-(82.33)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 82.33 + (((tickAnim - 43) / 7) * (0-(82.33)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -15.75 + (((tickAnim - 15) / 15) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 30) / 20) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -9.15 + (((tickAnim - 15) / 15) * (-9.15-(-9.15)));
            zz = 5.8 + (((tickAnim - 15) / 15) * (5.8-(5.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -9.15 + (((tickAnim - 30) / 20) * (0-(-9.15)));
            zz = 5.8 + (((tickAnim - 30) / 20) * (0-(5.8)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 13.75 + (((tickAnim - 15) / 15) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 30) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 16 + (((tickAnim - 15) / 15) * (16-(16)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16 + (((tickAnim - 30) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 15) / 15) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 30) / 20) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -30.5 + (((tickAnim - 15) / 15) * (-30.5-(-30.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.5 + (((tickAnim - 30) / 20) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 15) / 15) * (20-(20)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 15) / 15) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 30) / 20) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 15) / 15) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 30) / 20) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 15) / 15) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 15) / 15) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 30) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 15) / 15) * (20-(20)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.11866-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (4.28105-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.71076-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -11.11866 + (((tickAnim - 15) / 15) * (-11.11866-(-11.11866)));
            yy = 4.28105 + (((tickAnim - 15) / 15) * (4.28105-(4.28105)));
            zz = 4.71076 + (((tickAnim - 15) / 15) * (4.71076-(4.71076)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.11866 + (((tickAnim - 30) / 20) * (0-(-11.11866)));
            yy = 4.28105 + (((tickAnim - 30) / 20) * (0-(4.28105)));
            zz = 4.71076 + (((tickAnim - 30) / 20) * (0-(4.71076)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 15) / 15) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -69.25 + (((tickAnim - 15) / 15) * (-69.25-(-69.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -69.25 + (((tickAnim - 30) / 20) * (0-(-69.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -3.1 + (((tickAnim - 15) / 15) * (-3.1-(-3.1)));
            zz = 0.7 + (((tickAnim - 15) / 15) * (0.7-(0.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.1 + (((tickAnim - 30) / 20) * (0-(-3.1)));
            zz = 0.7 + (((tickAnim - 30) / 20) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 74 + (((tickAnim - 15) / 15) * (74-(74)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 74 + (((tickAnim - 30) / 20) * (0-(74)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.7-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 7) * (0-(0.775)));
            zz = -0.7 + (((tickAnim - 8) / 7) * (0-(-0.7)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 11) * (0.9-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (-0.675-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 41) / 9) * (0-(0.9)));
            zz = -0.675 + (((tickAnim - 41) / 9) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 15) / 15) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 30) / 20) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.11866-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.28105-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.71076-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -11.11866 + (((tickAnim - 15) / 15) * (-11.11866-(-11.11866)));
            yy = -4.28105 + (((tickAnim - 15) / 15) * (-4.28105-(-4.28105)));
            zz = -4.71076 + (((tickAnim - 15) / 15) * (-4.71076-(-4.71076)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.11866 + (((tickAnim - 30) / 20) * (0-(-11.11866)));
            yy = -4.28105 + (((tickAnim - 30) / 20) * (0-(-4.28105)));
            zz = -4.71076 + (((tickAnim - 30) / 20) * (0-(-4.71076)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 15) / 15) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -69.25 + (((tickAnim - 15) / 15) * (-69.25-(-69.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -69.25 + (((tickAnim - 30) / 20) * (0-(-69.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -3.1 + (((tickAnim - 15) / 15) * (-3.1-(-3.1)));
            zz = 0.7 + (((tickAnim - 15) / 15) * (0.7-(0.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.1 + (((tickAnim - 30) / 20) * (0-(-3.1)));
            zz = 0.7 + (((tickAnim - 30) / 20) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 74 + (((tickAnim - 15) / 15) * (74-(74)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 74 + (((tickAnim - 30) / 20) * (0-(74)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.7-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 7) * (0-(0.775)));
            zz = -0.7 + (((tickAnim - 8) / 7) * (0-(-0.7)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 11) * (0.9-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (-0.675-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 41) / 9) * (0-(0.9)));
            zz = -0.675 + (((tickAnim - 41) / 9) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 24) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*5 + (((tickAnim - 0) / 24) * (-28.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -28.25 + (((tickAnim - 24) / 1) * (-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*-15-(-28.25)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*-15 + (((tickAnim - 25) / 20) * (0-(-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*-15)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -4.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-80))*5 + (((tickAnim - 0) / 24) * (-13.25-(-4.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-80))*5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 24) / 1) * (-3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-15-(-13.25)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-15 + (((tickAnim - 25) / 20) * (0-(-3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260))*-15)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -2.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5 + (((tickAnim - 0) / 24) * (19.25-(-2.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 19.25 + (((tickAnim - 24) / 1) * (-3.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-250))*-25-(19.25)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -3.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-250))*-25 + (((tickAnim - 25) / 20) * (0-(-3.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-250))*-25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 4.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-250))*5 + (((tickAnim - 0) / 24) * (10.75-(4.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-250))*5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 10.75 + (((tickAnim - 24) / 1) * (18.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-300))*25-(10.75)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 18.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-300))*25 + (((tickAnim - 25) / 20) * (0-(18.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-300))*25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -3.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5 + (((tickAnim - 0) / 7) * (4.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5-(-3.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 4.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5 + (((tickAnim - 7) / 11) * (4.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5-(4.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 4.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5 + (((tickAnim - 18) / 6) * (0-(4.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (15.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 15.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5 + (((tickAnim - 28) / 17) * (0-(15.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-150))*5)));
            yy = 0 + (((tickAnim - 28) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -9.75 + (((tickAnim - 24) / 4) * (-24-(-9.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -24 + (((tickAnim - 28) / 3) * (-24-(-24)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -24 + (((tickAnim - 31) / 14) * (0-(-24)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 9.75 + (((tickAnim - 24) / 4) * (31.75-(9.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 31.75 + (((tickAnim - 28) / 3) * (36.5-(31.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 36.5 + (((tickAnim - 31) / 14) * (0-(36.5)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(xx), throatPouch3.rotateAngleY + (float) Math.toRadians(yy), throatPouch3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 0) / 24) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 24) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 24) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 24) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 24) / 3) * (0.6731-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 27) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 27) / 1) * (1-(1)));
            zz = 0.6731 + (((tickAnim - 27) / 1) * (0.7875-(0.6731)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 28) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 3) * (1-(1)));
            zz = 0.7875 + (((tickAnim - 28) / 3) * (0.7875-(0.7875)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 31) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 31) / 14) * (1-(1)));
            zz = 0.7875 + (((tickAnim - 31) / 14) * (1-(0.7875)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (-53.5-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -53.5 + (((tickAnim - 27) / 2) * (5.31-(-53.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 5.31 + (((tickAnim - 29) / 1) * (-1.75-(5.31)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -1.75 + (((tickAnim - 30) / 3) * (-38.5-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -38.5 + (((tickAnim - 33) / 12) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch4, throatPouch4.rotateAngleX + (float) Math.toRadians(xx), throatPouch4.rotateAngleY + (float) Math.toRadians(yy), throatPouch4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 0) / 27) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 27) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 27) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 27) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 27) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 27) / 2) * (0.35-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 29) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 29) / 1) * (1-(1)));
            zz = 0.35 + (((tickAnim - 29) / 1) * (0.4-(0.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 30) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 15) * (1-(1)));
            zz = 0.4 + (((tickAnim - 30) / 15) * (1-(0.4)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -19 + (((tickAnim - 25) / 12) * (37-(-19)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 37 + (((tickAnim - 37) / 8) * (0-(37)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(xx), neckFeathers2.rotateAngleY + (float) Math.toRadians(yy), neckFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -18.5 + (((tickAnim - 25) / 12) * (17.45883-(-18.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0.40367-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0.01741-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 17.45883 + (((tickAnim - 37) / 8) * (0-(17.45883)));
            yy = 0.40367 + (((tickAnim - 37) / 8) * (0-(0.40367)));
            zz = 0.01741 + (((tickAnim - 37) / 8) * (0-(0.01741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers, neckFeathers.rotateAngleX + (float) Math.toRadians(xx), neckFeathers.rotateAngleY + (float) Math.toRadians(yy), neckFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -17 + (((tickAnim - 25) / 12) * (9.25-(-17)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 9.25 + (((tickAnim - 37) / 8) * (0-(9.25)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -22.25 + (((tickAnim - 25) / 12) * (-6.25-(-22.25)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = -6.25 + (((tickAnim - 37) / 8) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*5 + (((tickAnim - 0) / 24) * (8.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 8.75 + (((tickAnim - 24) / 1) * (-4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*15-(8.75)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*15 + (((tickAnim - 25) / 20) * (0-(-4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*260-80))*15)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckUnderfeathers, neckUnderfeathers.rotateAngleX + (float) Math.toRadians(xx), neckUnderfeathers.rotateAngleY + (float) Math.toRadians(yy), neckUnderfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -16 + (((tickAnim - 25) / 12) * (6-(-16)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 6 + (((tickAnim - 37) / 8) * (0-(6)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -13.75 + (((tickAnim - 25) / 12) * (17.75-(-13.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 17.75 + (((tickAnim - 37) / 8) * (0-(17.75)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers6, neckFeathers6.rotateAngleX + (float) Math.toRadians(xx), neckFeathers6.rotateAngleY + (float) Math.toRadians(yy), neckFeathers6.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 10) / 10) * (0-(18.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 22.25 + (((tickAnim - 10) / 2) * (37.04-(22.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 37.04 + (((tickAnim - 12) / 8) * (0-(37.04)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 41.25 + (((tickAnim - 10) / 2) * (45.87-(41.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 45.87 + (((tickAnim - 12) / 8) * (0-(45.87)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.25 + (((tickAnim - 10) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -12.5 + (((tickAnim - 10) / 2) * (-28.42-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -28.42 + (((tickAnim - 12) / 8) * (0-(-28.42)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 33.75 + (((tickAnim - 8) / 4) * (0-(33.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (3.25-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 12) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 12) / 8) * (0-(7.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(xx), throatPouch2.rotateAngleY + (float) Math.toRadians(yy), throatPouch2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -13.75 + (((tickAnim - 10) / 2) * (-30.21-(-13.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -30.21 + (((tickAnim - 12) / 8) * (0-(-30.21)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckUnderfeathers, neckUnderfeathers.rotateAngleX + (float) Math.toRadians(xx), neckUnderfeathers.rotateAngleY + (float) Math.toRadians(yy), neckUnderfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23 + (((tickAnim - 10) / 10) * (0-(-23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.0629-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.88625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.08567-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.0629 + (((tickAnim - 10) / 10) * (0-(-2.0629)));
            yy = -0.88625 + (((tickAnim - 10) / 10) * (0-(-0.88625)));
            zz = 2.08567 + (((tickAnim - 10) / 10) * (0-(2.08567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-20.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -20.5 + (((tickAnim - 10) / 10) * (0-(-20.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-23-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -23 + (((tickAnim - 10) / 10) * (0-(-23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(xx), leftFingers.rotateAngleY + (float) Math.toRadians(yy), leftFingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-31.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -31.75 + (((tickAnim - 10) / 10) * (0-(-31.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(xx), leftThumb.rotateAngleY + (float) Math.toRadians(yy), leftThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-36.79639-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.55919-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.48368-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -36.79639 + (((tickAnim - 10) / 10) * (0-(-36.79639)));
            yy = 0.55919 + (((tickAnim - 10) / 10) * (0-(0.55919)));
            zz = -9.48368 + (((tickAnim - 10) / 10) * (0-(-9.48368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.22905-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.89744-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.89767-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.22905 + (((tickAnim - 10) / 10) * (0-(-0.22905)));
            yy = 4.89744 + (((tickAnim - 10) / 10) * (0-(4.89744)));
            zz = 5.89767 + (((tickAnim - 10) / 10) * (0-(5.89767)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (19.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 19.75 + (((tickAnim - 10) / 10) * (0-(19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (17.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 17.75 + (((tickAnim - 10) / 10) * (0-(17.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(xx), rightFingers.rotateAngleY + (float) Math.toRadians(yy), rightFingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(xx), rightThumb.rotateAngleY + (float) Math.toRadians(yy), rightThumb.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-4), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-120))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-1));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3 + (((tickAnim - 0) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3)));
            yy = -1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5 + (((tickAnim - 0) / 1) * (-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5-(-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3 + (((tickAnim - 1) / 2) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3)));
            yy = -1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5 + (((tickAnim - 1) / 2) * (-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5-(-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2 + (((tickAnim - 1) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3 + (((tickAnim - 3) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3)));
            yy = -1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5 + (((tickAnim - 3) / 10) * (-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5-(-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2 + (((tickAnim - 3) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3 + (((tickAnim - 13) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3)));
            yy = -1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5 + (((tickAnim - 13) / 1) * (-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5-(-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3 + (((tickAnim - 14) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*254))*-0.3)));
            yy = -1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5 + (((tickAnim - 14) / 3) * (-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+50))*-1.5-(-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*504/0.5+50))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2 + (((tickAnim - 14) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*254/0.5+150))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-140))*-5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-120))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*-1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+50))*-5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-13.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(14.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckUnderfeathers, neckUnderfeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*-4), neckUnderfeathers.rotateAngleY + (float) Math.toRadians(0), neckUnderfeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(12.4428-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+50))*-3), leftArm.rotateAngleY + (float) Math.toRadians(-16.03018), leftArm.rotateAngleZ + (float) Math.toRadians(2.4071+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*1));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1 + (((tickAnim - 1) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1 + (((tickAnim - 14) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-22.1892-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+150))*5), leftArm2.rotateAngleY + (float) Math.toRadians(-4.05461), leftArm2.rotateAngleZ + (float) Math.toRadians(12.36188));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+250))*-4), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+300))*-4), leftFingers.rotateAngleY + (float) Math.toRadians(0), leftFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+300))*-4), leftThumb.rotateAngleY + (float) Math.toRadians(0), leftThumb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5))*2), bodyFeathers.rotateAngleY + (float) Math.toRadians(0), bodyFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-120))*2.7), bodyFeathers2.rotateAngleY + (float) Math.toRadians(0), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-120))*1.7), bodyFeathers3.rotateAngleY + (float) Math.toRadians(0), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-120))*1.7), bodyFeathers4.rotateAngleY + (float) Math.toRadians(0), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers5, bodyFeathers5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-1.5), bodyFeathers5.rotateAngleY + (float) Math.toRadians(0), bodyFeathers5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*-4), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*-6), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-300))*-9), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-350))*-12), tail5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-8));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.5 + (((tickAnim - 0) / 2) * (-49.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -49.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 2) / 11) * (-29.2915-(-49.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 2) / 11) * (9.48695-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (-0.50011-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -29.2915 + (((tickAnim - 13) / 4) * (-19.28228-(-29.2915)));
            yy = 9.48695 + (((tickAnim - 13) / 4) * (7.37874-(9.48695)));
            zz = -0.50011 + (((tickAnim - 13) / 4) * (-0.38898-(-0.50011)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -19.28228 + (((tickAnim - 17) / 11) * (22.5-(-19.28228)));
            yy = 7.37874 + (((tickAnim - 17) / 11) * (0-(7.37874)));
            zz = -0.38898 + (((tickAnim - 17) / 11) * (0-(-0.38898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 0) / 5) * (35.29345-(32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.59868-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.03186-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 35.29345 + (((tickAnim - 5) / 6) * (6.73362-(35.29345)));
            yy = 0.59868 + (((tickAnim - 5) / 6) * (-1.49669-(0.59868)));
            zz = 1.03186 + (((tickAnim - 5) / 6) * (-2.57965-(1.03186)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.73362 + (((tickAnim - 11) / 2) * (16.13034-(6.73362)));
            yy = -1.49669 + (((tickAnim - 11) / 2) * (-1.79603-(-1.49669)));
            zz = -2.57965 + (((tickAnim - 11) / 2) * (-3.09558-(-2.57965)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 16.13034 + (((tickAnim - 13) / 4) * (18.53253-(16.13034)));
            yy = -1.79603 + (((tickAnim - 13) / 4) * (-1.59647-(-1.79603)));
            zz = -3.09558 + (((tickAnim - 13) / 4) * (-2.75163-(-3.09558)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 18.53253 + (((tickAnim - 17) / 11) * (32.5-(18.53253)));
            yy = -1.59647 + (((tickAnim - 17) / 11) * (0-(-1.59647)));
            zz = -2.75163 + (((tickAnim - 17) / 11) * (0-(-2.75163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 0) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5 + (((tickAnim - 13) / 4) * (-0.6-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = -0.6 + (((tickAnim - 17) / 11) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.25 + (((tickAnim - 0) / 5) * (-58.25-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -58.25 + (((tickAnim - 5) / 3) * (-58.25-(-58.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -58.25 + (((tickAnim - 8) / 5) * (-3-(-58.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3 + (((tickAnim - 13) / 4) * (-11.67-(-3)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -11.67 + (((tickAnim - 17) / 11) * (-12.25-(-11.67)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 13) * (-1.425-(-0.675)));
            zz = 1.775 + (((tickAnim - 0) / 13) * (0.725-(1.775)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -1.425 + (((tickAnim - 13) / 1) * (-1.4255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5-(-1.425)));
            zz = 0.725 + (((tickAnim - 13) / 1) * (0.725-(0.725)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -1.4255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5 + (((tickAnim - 14) / 3) * (-1.425-(-1.4255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5)));
            zz = 0.725 + (((tickAnim - 14) / 3) * (0.725-(0.725)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -1.425 + (((tickAnim - 17) / 6) * (-1.095-(-1.425)));
            zz = 0.725 + (((tickAnim - 17) / 6) * (1.02-(0.725)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -1.095 + (((tickAnim - 23) / 5) * (-0.675-(-1.095)));
            zz = 1.02 + (((tickAnim - 23) / 5) * (1.775-(1.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 70.5 + (((tickAnim - 0) / 3) * (81.89496-(70.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.04359-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.52183-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 81.89496 + (((tickAnim - 3) / 5) * (67.53991-(81.89496)));
            yy = 2.04359 + (((tickAnim - 3) / 5) * (4.08719-(2.04359)));
            zz = -0.52183 + (((tickAnim - 3) / 5) * (-1.04366-(-0.52183)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 67.53991 + (((tickAnim - 8) / 5) * (15.53852-(67.53991)));
            yy = 4.08719 + (((tickAnim - 8) / 5) * (-6.91282-(4.08719)));
            zz = -1.04366 + (((tickAnim - 8) / 5) * (2.85385-(-1.04366)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15.53852 + (((tickAnim - 13) / 4) * (7.80322-(15.53852)));
            yy = -6.91282 + (((tickAnim - 13) / 4) * (-5.44959-(-6.91282)));
            zz = 2.85385 + (((tickAnim - 13) / 4) * (1.39155-(2.85385)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 7.80322 + (((tickAnim - 17) / 6) * (30.26431-(7.80322)));
            yy = -5.44959 + (((tickAnim - 17) / 6) * (-2.40537-(-5.44959)));
            zz = 1.39155 + (((tickAnim - 17) / 6) * (2.81848-(1.39155)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 30.26431 + (((tickAnim - 23) / 2) * (64.8296-(30.26431)));
            yy = -2.40537 + (((tickAnim - 23) / 2) * (-1.3745-(-2.40537)));
            zz = 2.81848 + (((tickAnim - 23) / 2) * (1.61056-(2.81848)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 64.8296 + (((tickAnim - 25) / 3) * (70.5-(64.8296)));
            yy = -1.3745 + (((tickAnim - 25) / 3) * (0-(-1.3745)));
            zz = 1.61056 + (((tickAnim - 25) / 3) * (0-(1.61056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.28 + (((tickAnim - 8) / 5) * (0.075-(-0.28)));
            zz = -0.35 + (((tickAnim - 8) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 13) / 4) * (1.195-(0.075)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.195 + (((tickAnim - 17) / 3) * (-0.285-(1.195)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.285 + (((tickAnim - 20) / 3) * (-1.3-(-0.285)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -1.3 + (((tickAnim - 23) / 5) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.25 + (((tickAnim - 0) / 3) * (42-(32.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 42 + (((tickAnim - 3) / 5) * (50.25-(42)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 50.25 + (((tickAnim - 8) / 5) * (0-(50.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (-31.43-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -31.43 + (((tickAnim - 20) / 3) * (-23.5-(-31.43)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.5 + (((tickAnim - 23) / 5) * (32.25-(-23.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hipFeathers, hipFeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-2.5), hipFeathers.rotateAngleY + (float) Math.toRadians(0), hipFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hipFeathers2, hipFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-2.5), hipFeathers2.rotateAngleY + (float) Math.toRadians(0), hipFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hipFeathers3, hipFeathers3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-2.5), hipFeathers3.rotateAngleY + (float) Math.toRadians(0), hipFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(12.2536-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+50))*-3), rightArm.rotateAngleY + (float) Math.toRadians(17.26304), rightArm.rotateAngleZ + (float) Math.toRadians(-3.2815+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*1));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1 + (((tickAnim - 1) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1 + (((tickAnim - 14) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.1)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-22.2238-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+150))*5), rightArm2.rotateAngleY + (float) Math.toRadians(4.20797), rightArm2.rotateAngleZ + (float) Math.toRadians(-12.83902));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+250))*-4), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+300))*-4), rightFingers.rotateAngleY + (float) Math.toRadians(0), rightFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+300))*-4), rightThumb.rotateAngleY + (float) Math.toRadians(0), rightThumb.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -29.2915 + (((tickAnim - 0) / 3) * (-19.28228-(-29.2915)));
            yy = -9.48695 + (((tickAnim - 0) / 3) * (-7.37874-(-9.48695)));
            zz = 0.50011 + (((tickAnim - 0) / 3) * (0.38898-(0.50011)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -19.28228 + (((tickAnim - 3) / 12) * (22.5-(-19.28228)));
            yy = -7.37874 + (((tickAnim - 3) / 12) * (0-(-7.37874)));
            zz = 0.38898 + (((tickAnim - 3) / 12) * (0-(0.38898)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 15) / 2) * (7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(22.5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 17) / 11) * (-29.2915-(7.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 17) / 11) * (-9.48695-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0.50011-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.13034 + (((tickAnim - 0) / 3) * (16.78253-(16.13034)));
            yy = 1.79603 + (((tickAnim - 0) / 3) * (1.59647-(1.79603)));
            zz = 3.09558 + (((tickAnim - 0) / 3) * (2.75163-(3.09558)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 16.78253 + (((tickAnim - 3) / 12) * (32.5-(16.78253)));
            yy = 1.59647 + (((tickAnim - 3) / 12) * (0-(1.59647)));
            zz = 2.75163 + (((tickAnim - 3) / 12) * (0-(2.75163)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 32.5 + (((tickAnim - 15) / 5) * (95.6434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(32.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.59868-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (1.03186-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 95.6434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 20) / 6) * (56.4086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(95.6434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0.59868 + (((tickAnim - 20) / 6) * (1.49669-(0.59868)));
            zz = 1.03186 + (((tickAnim - 20) / 6) * (2.57965-(1.03186)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 56.4086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 26) / 2) * (16.13034-(56.4086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 1.49669 + (((tickAnim - 26) / 2) * (1.79603-(1.49669)));
            zz = 2.57965 + (((tickAnim - 26) / 2) * (3.09558-(2.57965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5 + (((tickAnim - 0) / 3) * (-0.6-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 12) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 13) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
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
            xx = -3 + (((tickAnim - 0) / 2) * (-12.38-(-3)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.38 + (((tickAnim - 2) / 1) * (-15.92-(-12.38)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -15.92 + (((tickAnim - 3) / 12) * (-12.25-(-15.92)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 15) / 5) * (67.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-12.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 67.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 20) / 3) * (-14.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(67.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 23) / 5) * (-3-(-14.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.425 + (((tickAnim - 0) / 1) * (-1.7505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5-(-1.425)));
            zz = 0.725 + (((tickAnim - 0) / 1) * (0.725-(0.725)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -1.7505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5 + (((tickAnim - 1) / 2) * (-1.425-(-1.7505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*0.5)));
            zz = 0.725 + (((tickAnim - 1) / 2) * (0.725-(0.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -1.425 + (((tickAnim - 3) / 6) * (-1.095-(-1.425)));
            zz = 0.725 + (((tickAnim - 3) / 6) * (1.02-(0.725)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -1.095 + (((tickAnim - 9) / 6) * (-0.675-(-1.095)));
            zz = 1.02 + (((tickAnim - 9) / 6) * (1.775-(1.02)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 15) / 13) * (-1.425-(-0.675)));
            zz = 1.775 + (((tickAnim - 15) / 13) * (0.725-(1.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.68487 + (((tickAnim - 0) / 2) * (17.79413-(14.68487)));
            yy = 6.13078 + (((tickAnim - 0) / 2) * (5.79019-(6.13078)));
            zz = -1.56549 + (((tickAnim - 0) / 2) * (-1.47852-(-1.56549)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.79413 + (((tickAnim - 2) / 1) * (11.30322-(17.79413)));
            yy = 5.79019 + (((tickAnim - 2) / 1) * (5.44959-(5.79019)));
            zz = -1.47852 + (((tickAnim - 2) / 1) * (-1.39155-(-1.47852)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 11.30322 + (((tickAnim - 3) / 6) * (42.26431-(11.30322)));
            yy = 5.44959 + (((tickAnim - 3) / 6) * (2.40537-(5.44959)));
            zz = -1.39155 + (((tickAnim - 3) / 6) * (-2.81848-(-1.39155)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 42.26431 + (((tickAnim - 9) / 3) * (64.8296-(42.26431)));
            yy = 2.40537 + (((tickAnim - 9) / 3) * (1.3745-(2.40537)));
            zz = -2.81848 + (((tickAnim - 9) / 3) * (-1.61056-(-2.81848)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 64.8296 + (((tickAnim - 12) / 3) * (70.5-(64.8296)));
            yy = 1.3745 + (((tickAnim - 12) / 3) * (0-(1.3745)));
            zz = -1.61056 + (((tickAnim - 12) / 3) * (0-(-1.61056)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 70.5 + (((tickAnim - 15) / 3) * (81.89496-(70.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (2.04359-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.52183-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 81.89496 + (((tickAnim - 18) / 5) * (67.53991-(81.89496)));
            yy = 2.04359 + (((tickAnim - 18) / 5) * (4.08719-(2.04359)));
            zz = -0.52183 + (((tickAnim - 18) / 5) * (-1.04366-(-0.52183)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 67.53991 + (((tickAnim - 23) / 5) * (14.68487-(67.53991)));
            yy = 4.08719 + (((tickAnim - 23) / 5) * (6.13078-(4.08719)));
            zz = -1.04366 + (((tickAnim - 23) / 5) * (-1.56549-(-1.04366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.92-(0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.92 + (((tickAnim - 3) / 4) * (-0.635-(0.92)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.635 + (((tickAnim - 7) / 2) * (-1.3-(-0.635)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -1.3 + (((tickAnim - 9) / 6) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-0.35-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.28 + (((tickAnim - 23) / 5) * (0.4-(-0.28)));
            zz = -0.35 + (((tickAnim - 23) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-36.46-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -36.46 + (((tickAnim - 7) / 2) * (-35.75-(-36.46)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -35.75 + (((tickAnim - 9) / 6) * (32.25-(-35.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 32.25 + (((tickAnim - 15) / 3) * (42-(32.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 42 + (((tickAnim - 18) / 5) * (50.25-(42)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 50.25 + (((tickAnim - 23) / 5) * (0-(50.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));
       
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*2.5), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-0.1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.475+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-130))*1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*-2.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*1.3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*2.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*1));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-0.15);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*0.15);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-200))*8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*3), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));


        this.leftEye.setScale((float)1, (float) ((float)1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*0.019),(float)1);


        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-10))*-3), throatPouch3.rotateAngleY + (float) Math.toRadians(0), throatPouch3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+50))*3.5), neckFeathers2.rotateAngleY + (float) Math.toRadians(0), neckFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers, neckFeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+90))*3.5), neckFeathers.rotateAngleY + (float) Math.toRadians(0), neckFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(-7.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+20))*3.5), neckFeathers3.rotateAngleY + (float) Math.toRadians(0), neckFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(-9.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*3.5), neckFeathers4.rotateAngleY + (float) Math.toRadians(0), neckFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckUnderfeathers, neckUnderfeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+40))*3), neckUnderfeathers.rotateAngleY + (float) Math.toRadians(0), neckUnderfeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(-8.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*3.5), neckFeathers5.rotateAngleY + (float) Math.toRadians(0), neckFeathers5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers6, neckFeathers6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*2.5), neckFeathers6.rotateAngleY + (float) Math.toRadians(0), neckFeathers6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(4.4807-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-2.5), leftArm.rotateAngleY + (float) Math.toRadians(-6.0481-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1), leftArm.rotateAngleZ + (float) Math.toRadians(-1.2334+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*-1.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), leftFingers.rotateAngleY + (float) Math.toRadians(0), leftFingers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-5));


        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), leftThumb.rotateAngleY + (float) Math.toRadians(0), leftThumb.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-5));


        this.setRotateAngle(leftThumbclaw, leftThumbclaw.rotateAngleX + (float) Math.toRadians(0), leftThumbclaw.rotateAngleY + (float) Math.toRadians(0), leftThumbclaw.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-9));


        this.setRotateAngle(leftHandfeathers, leftHandfeathers.rotateAngleX + (float) Math.toRadians(0), leftHandfeathers.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*1.5), leftHandfeathers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));


        this.setRotateAngle(leftArmfeathers2, leftArmfeathers2.rotateAngleX + (float) Math.toRadians(0), leftArmfeathers2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*1.5), leftArmfeathers2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));


        this.setRotateAngle(leftArmfeathers, leftArmfeathers.rotateAngleX + (float) Math.toRadians(0), leftArmfeathers.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5), leftArmfeathers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));


        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(-8.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*1.5), bodyFeathers.rotateAngleY + (float) Math.toRadians(0), bodyFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(-4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*-1.5), bodyFeathers2.rotateAngleY + (float) Math.toRadians(0), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(-6.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-70))*-1.5), bodyFeathers3.rotateAngleY + (float) Math.toRadians(0), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(-7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-30))*-1.9), bodyFeathers4.rotateAngleY + (float) Math.toRadians(0), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers5, bodyFeathers5.rotateAngleX + (float) Math.toRadians(-6.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-1.2), bodyFeathers5.rotateAngleY + (float) Math.toRadians(0), bodyFeathers5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*1.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-90))*2.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-170))*2.5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-180))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-200))*3.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-230))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-280))*-13), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-4), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-300))*-12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-0.5));


        this.setRotateAngle(rightTailfan, rightTailfan.rotateAngleX + (float) Math.toRadians(0), rightTailfan.rotateAngleY + (float) Math.toRadians(0), rightTailfan.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));


        this.setRotateAngle(leftTailfan, leftTailfan.rotateAngleX + (float) Math.toRadians(0), leftTailfan.rotateAngleY + (float) Math.toRadians(0), leftTailfan.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-140))*-1.2), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers2, tailFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-160))*-1.5), tailFeathers2.rotateAngleY + (float) Math.toRadians(0), tailFeathers2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -24.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-150))*95 + (((tickAnim - 0) / 21) * (70.9889-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-90))*-95-(-24.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-150))*95)));
            yy = 0 + (((tickAnim - 0) / 21) * (4.90311-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.2849-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 70.9889-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-90))*-95 + (((tickAnim - 21) / 3) * (29.5139-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20*3+50))*60-(70.9889-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-90))*-95)));
            yy = 4.90311 + (((tickAnim - 21) / 3) * (4.90311-(4.90311)));
            zz = 0.2849 + (((tickAnim - 21) / 3) * (0.2849-(0.2849)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 29.5139-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20*3+50))*60 + (((tickAnim - 24) / 26) * (22.8-(29.5139-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20*3+50))*60)));
            yy = 4.90311 + (((tickAnim - 24) / 26) * (0-(4.90311)));
            zz = 0.2849 + (((tickAnim - 24) / 26) * (0-(0.2849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 24 + (((tickAnim - 0) / 8) * (22.745-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*120-(24)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 22.745-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*120 + (((tickAnim - 8) / 13) * (0.9381-(22.745-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*120)));
            yy = 0 + (((tickAnim - 8) / 13) * (-1.97823-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (-3.26329-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0.9381 + (((tickAnim - 21) / 3) * (14.4-(0.9381)));
            yy = -1.97823 + (((tickAnim - 21) / 3) * (-1.44677-(-1.97823)));
            zz = -3.26329 + (((tickAnim - 21) / 3) * (-3.26329-(-3.26329)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 14.4 + (((tickAnim - 24) / 15) * (7.97345-(14.4)));
            yy = -1.44677 + (((tickAnim - 24) / 15) * (-0.60671-(-1.44677)));
            zz = -3.26329 + (((tickAnim - 24) / 15) * (-1.36848-(-3.26329)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 7.97345 + (((tickAnim - 39) / 11) * (51.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*1.5-50))*40-(7.97345)));
            yy = -0.60671 + (((tickAnim - 39) / 11) * (0-(-0.60671)));
            zz = -1.36848 + (((tickAnim - 39) / 11) * (0-(-1.36848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 21) / 18) * (0-(0)));
            yy = -0.475 + (((tickAnim - 21) / 18) * (-0.83-(-0.475)));
            zz = 0 + (((tickAnim - 21) / 18) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.83 + (((tickAnim - 39) / 11) * (0-(-0.83)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -16 + (((tickAnim - 0) / 9) * (-11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(-16)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 9) / 4) * (-21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(-11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 13) / 8) * (-10-(-21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -10 + (((tickAnim - 21) / 3) * (-9.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 24) / 26) * (-16-(-9.5)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = -0.975 + (((tickAnim - 0) / 21) * (-1.15-(-0.975)));
            zz = 1.95 + (((tickAnim - 0) / 21) * (0-(1.95)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = -1.15 + (((tickAnim - 21) / 3) * (-1.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*1-50))*2-(-1.15)));
            zz = 0 + (((tickAnim - 21) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            yy = -1.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*1-50))*2 + (((tickAnim - 24) / 15) * (-1.265-(-1.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*1-50))*2)));
            zz = 0.09 + (((tickAnim - 24) / 15) * (-0.045-(0.09)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -1.265 + (((tickAnim - 39) / 11) * (-0.975-(-1.265)));
            zz = -0.045 + (((tickAnim - 39) / 11) * (1.95-(-0.045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 68 + (((tickAnim - 0) / 11) * (76.87-(68)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 76.87 + (((tickAnim - 11) / 2) * (60.37-(76.87)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 60.37 + (((tickAnim - 13) / 8) * (24.2541-(60.37)));
            yy = 0 + (((tickAnim - 13) / 8) * (-2.18402-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (3.52679-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 24.2541 + (((tickAnim - 21) / 3) * (13.66153-(24.2541)));
            yy = -2.18402 + (((tickAnim - 21) / 3) * (-2.0516-(-2.18402)));
            zz = 3.52679 + (((tickAnim - 21) / 3) * (4.26594-(3.52679)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 13.66153 + (((tickAnim - 24) / 10) * (-5.4752-(13.66153)));
            yy = -2.0516 + (((tickAnim - 24) / 10) * (-1.86636-(-2.0516)));
            zz = 4.26594 + (((tickAnim - 24) / 10) * (3.79993-(4.26594)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -5.4752 + (((tickAnim - 34) / 5) * (-13.50491-(-5.4752)));
            yy = -1.86636 + (((tickAnim - 34) / 5) * (-0.54199-(-1.86636)));
            zz = 3.79993 + (((tickAnim - 34) / 5) * (1.68364-(3.79993)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -13.50491 + (((tickAnim - 39) / 11) * (68-(-13.50491)));
            yy = -0.54199 + (((tickAnim - 39) / 11) * (0-(-0.54199)));
            zz = 1.68364 + (((tickAnim - 39) / 11) * (0-(1.68364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
            zz = -0.125 + (((tickAnim - 0) / 23) * (0-(-0.125)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 23) / 1) * (0.1-(0.4)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 24) / 10) * (3.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-9-(0.1)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 3.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-9 + (((tickAnim - 34) / 5) * (4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8-(3.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-9)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8 + (((tickAnim - 39) / 11) * (0-(4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8)));
            zz = 0 + (((tickAnim - 39) / 11) * (-0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.25 + (((tickAnim - 0) / 8) * (52.62-(15.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 52.62 + (((tickAnim - 8) / 5) * (52.62-(52.62)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 52.62 + (((tickAnim - 13) / 8) * (0-(52.62)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (-23.63-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -23.63 + (((tickAnim - 42) / 8) * (15.25-(-23.63)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 5) * (0.475-(0.475)));
            zz = 0.15 + (((tickAnim - 8) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 8) * (0-(0.475)));
            zz = 0.15 + (((tickAnim - 13) / 8) * (0-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 21) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 16) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (-0.65-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 42) / 8) * (0-(-0.2)));
            zz = -0.65 + (((tickAnim - 42) / 8) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hipFeathers, hipFeathers.rotateAngleX + (float) Math.toRadians(-5.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-1.2), hipFeathers.rotateAngleY + (float) Math.toRadians(0), hipFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hipFeathers2, hipFeathers2.rotateAngleX + (float) Math.toRadians(-3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-80))*-1.2), hipFeathers2.rotateAngleY + (float) Math.toRadians(0), hipFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hipFeathers3, hipFeathers3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-120))*-1.2), hipFeathers3.rotateAngleY + (float) Math.toRadians(0), hipFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.rightEye.setScale((float)1, (float) ((float)1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*0.019),(float)1);


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-2.5), rightArm.rotateAngleY + (float) Math.toRadians(6.0481-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-1), rightArm.rotateAngleZ + (float) Math.toRadians(1.2334+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*-1.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), rightFingers.rotateAngleY + (float) Math.toRadians(0), rightFingers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-5));


        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-3.5), rightThumb.rotateAngleY + (float) Math.toRadians(0), rightThumb.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-5));


        this.setRotateAngle(rightThumbclaw, rightThumbclaw.rotateAngleX + (float) Math.toRadians(0), rightThumbclaw.rotateAngleY + (float) Math.toRadians(0), rightThumbclaw.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-9));


        this.setRotateAngle(rightHandfeathers, rightHandfeathers.rotateAngleX + (float) Math.toRadians(0), rightHandfeathers.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*1.5), rightHandfeathers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));


        this.setRotateAngle(rightArmfeathers2, rightArmfeathers2.rotateAngleX + (float) Math.toRadians(0), rightArmfeathers2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*1.5), rightArmfeathers2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));


        this.setRotateAngle(rightArmfeathers, rightArmfeathers.rotateAngleX + (float) Math.toRadians(0), rightArmfeathers.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5), rightArmfeathers.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*0.5));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 45.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-80))*-60 + (((tickAnim - 0) / 25) * (-73.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*100-(45.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-80))*-60)));
            yy = -4.90311 + (((tickAnim - 0) / 25) * (0-(-4.90311)));
            zz = -0.2849 + (((tickAnim - 0) / 25) * (0-(-0.2849)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = -73.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*100 + (((tickAnim - 25) / 21) * (-25.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*125-(-73.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*100)));
            yy = 0 + (((tickAnim - 25) / 21) * (-4.90311-(0)));
            zz = 0 + (((tickAnim - 25) / 21) * (-0.2849-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -25.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*125 + (((tickAnim - 46) / 4) * (-3.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20*-1-50))*-10-(-25.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*125)));
            yy = -4.90311 + (((tickAnim - 46) / 4) * (-4.90311-(-4.90311)));
            zz = -0.2849 + (((tickAnim - 46) / 4) * (-0.2849-(-0.2849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -12.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2+150))*-50 + (((tickAnim - 0) / 25) * (64.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-1+40))*-80-(-12.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2+150))*-50)));
            yy = -1.97823 + (((tickAnim - 0) / 25) * (0-(-1.97823)));
            zz = 3.26329 + (((tickAnim - 0) / 25) * (0-(3.26329)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 64.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-1+40))*-80 + (((tickAnim - 25) / 8) * (91.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120-(64.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-1+40))*-80)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 91.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120 + (((tickAnim - 33) / 13) * (75.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(91.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120)));
            yy = 0 + (((tickAnim - 33) / 13) * (-1.97823-(0)));
            zz = 0 + (((tickAnim - 33) / 13) * (3.26329-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 75.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 46) / 4) * (12.9-(75.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = -1.97823 + (((tickAnim - 46) / 4) * (-1.97823-(-1.97823)));
            zz = 3.26329 + (((tickAnim - 46) / 4) * (3.26329-(3.26329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 25) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 36) / 10) * (-0.55-(0.6)));
            zz = 0 + (((tickAnim - 36) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -21 + (((tickAnim - 0) / 10) * (-4.02-(-21)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -4.02 + (((tickAnim - 10) / 15) * (-9.925-(-4.02)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -9.925 + (((tickAnim - 25) / 11) * (-23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*70-(-9.925)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*70 + (((tickAnim - 36) / 3) * (-36.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50-(-23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*70)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = -36.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50 + (((tickAnim - 39) / 7) * (-10.25-(-36.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*50)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 46) / 4) * (-20.75-(-10.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 10) * (-1.085-(-0.875)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.07-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = -1.085 + (((tickAnim - 10) / 15) * (-0.975-(-1.085)));
            zz = -0.07 + (((tickAnim - 10) / 15) * (1.95-(-0.07)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -0.975 + (((tickAnim - 25) / 13) * (-1.87-(-0.975)));
            zz = 1.95 + (((tickAnim - 25) / 13) * (1.77-(1.95)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = -1.87 + (((tickAnim - 38) / 3) * (-1.81-(-1.87)));
            zz = 1.77 + (((tickAnim - 38) / 3) * (1.735-(1.77)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = -1.81 + (((tickAnim - 41) / 5) * (-0.95-(-1.81)));
            zz = 1.735 + (((tickAnim - 41) / 5) * (0-(1.735)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -0.95 + (((tickAnim - 46) / 4) * (-0.875-(-0.95)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 19.2193 + (((tickAnim - 0) / 10) * (-14.99825-(19.2193)));
            yy = 5.47491 + (((tickAnim - 0) / 10) * (-0.05738-(5.47491)));
            zz = -2.98503 + (((tickAnim - 0) / 10) * (-3.49953-(-2.98503)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -14.99825 + (((tickAnim - 10) / 6) * (37.50032-(-14.99825)));
            yy = -0.05738 + (((tickAnim - 10) / 6) * (2.01184-(-0.05738)));
            zz = -3.49953 + (((tickAnim - 10) / 6) * (-0.97596-(-3.49953)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 37.50032 + (((tickAnim - 16) / 7) * (68-(37.50032)));
            yy = 2.01184 + (((tickAnim - 16) / 7) * (0-(2.01184)));
            zz = -0.97596 + (((tickAnim - 16) / 7) * (0-(-0.97596)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 68 + (((tickAnim - 23) / 13) * (76.87-(68)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 76.87 + (((tickAnim - 36) / 2) * (73.37-(76.87)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 73.37 + (((tickAnim - 38) / 8) * (21.4693-(73.37)));
            yy = 0 + (((tickAnim - 38) / 8) * (5.47491-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (-2.98503-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 21.4693 + (((tickAnim - 46) / 4) * (19.2193-(21.4693)));
            yy = 5.47491 + (((tickAnim - 46) / 4) * (5.47491-(5.47491)));
            zz = -2.98503 + (((tickAnim - 46) / 4) * (-2.98503-(-2.98503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*3))*1.5 + (((tickAnim - 0) / 10) * (0.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*3))*1.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 10) / 6) * (-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*1-(0.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*1 + (((tickAnim - 16) / 7) * (0-(-1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*1)));
            zz = 0 + (((tickAnim - 16) / 7) * (-0.475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 13) * (0.3-(0)));
            zz = -0.475 + (((tickAnim - 23) / 13) * (-0.7-(-0.475)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 36) / 10) * (0-(0.3)));
            zz = -0.7 + (((tickAnim - 36) / 10) * (0-(-0.7)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-26.63-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -26.63 + (((tickAnim - 13) / 0) * (-32.8-(-26.63)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -32.8 + (((tickAnim - 13) / 10) * (15.25-(-32.8)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15.25 + (((tickAnim - 23) / 10) * (68.87-(15.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 68.87 + (((tickAnim - 33) / 5) * (44.12-(68.87)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 44.12 + (((tickAnim - 38) / 8) * (0-(44.12)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 13) / 10) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (1.1-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0.375-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 5) * (0.475-(1.1)));
            zz = 0.375 + (((tickAnim - 33) / 5) * (0.15-(0.375)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 38) / 8) * (0-(0.475)));
            zz = 0.15 + (((tickAnim - 38) / 8) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 145;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5 + (((tickAnim - 60) / 16) * (15.5-(6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 15.5 + (((tickAnim - 76) / 49) * (-4.5-(15.5)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = -4.5 + (((tickAnim - 125) / 20) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-5.3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -5.3 + (((tickAnim - 60) / 16) * (-5.3-(-5.3)));
            zz = 0 + (((tickAnim - 60) / 16) * (0.15-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            yy = -5.3 + (((tickAnim - 76) / 49) * (0-(-5.3)));
            zz = 0.15 + (((tickAnim - 76) / 49) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 76) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*4 + (((tickAnim - 0) / 76) * (9.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-2))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*4)));
            yy = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 76) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 9.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-2))*-5 + (((tickAnim - 76) / 49) * (16.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25-(9.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*-2))*-5)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 126) {
            xx = 16.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 125) / 1) * (-1.25-(16.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
            yy = 0 + (((tickAnim - 125) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 1) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 145) {
            xx = -1.25 + (((tickAnim - 126) / 19) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 126) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-55-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-55 + (((tickAnim - 60) / 16) * (25.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*25-(-29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-55)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 25.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*25 + (((tickAnim - 76) / 49) * (-10.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(25.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*25)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = -10.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 125) / 20) * (0-(-10.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (45.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 45.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 60) / 20) * (52.7-(45.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 52.7 + (((tickAnim - 80) / 15) * (44-(52.7)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 125) {
            xx = 44 + (((tickAnim - 95) / 30) * (0-(44)));
            yy = 0 + (((tickAnim - 95) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 30) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.175-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 80) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 65) * (0-(0)));
            zz = -1.175 + (((tickAnim - 80) / 65) * (0-(-1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (51.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 51.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*15 + (((tickAnim - 60) / 20) * (9.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-55-(51.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*15)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 9.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-55 + (((tickAnim - 80) / 15) * (-17.625-(9.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-55)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 119) {
            xx = -17.625 + (((tickAnim - 95) / 24) * (0-(-17.625)));
            yy = 0 + (((tickAnim - 95) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 24) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 119) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -35.5 + (((tickAnim - 60) / 20) * (-31.5-(-35.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -31.5 + (((tickAnim - 80) / 15) * (-38.25-(-31.5)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 125) {
            xx = -38.25 + (((tickAnim - 95) / 30) * (0-(-38.25)));
            yy = 0 + (((tickAnim - 95) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 30) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 48) / 25) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 48) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 25) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 119) {
            xx = -35.5 + (((tickAnim - 73) / 46) * (2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-45-(-35.5)));
            yy = 0 + (((tickAnim - 73) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 46) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 145) {
            xx = 2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-45 + (((tickAnim - 119) / 26) * (0-(2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-45)));
            yy = 0 + (((tickAnim - 119) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.275-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0.25-(0)));
            zz = 0.275 + (((tickAnim - 60) / 20) * (0-(0.275)));
        }
        else if (tickAnim >= 80 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 80) / 39) * (0-(0)));
            yy = 0.25 + (((tickAnim - 80) / 39) * (0-(0.25)));
            zz = 0 + (((tickAnim - 80) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 13.25 + (((tickAnim - 60) / 14) * (-2.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-60-(13.25)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 102) {
            xx = -2.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-60 + (((tickAnim - 74) / 28) * (-24.75-(-2.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-60)));
            yy = 0 + (((tickAnim - 74) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 28) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 119) {
            xx = -24.75 + (((tickAnim - 102) / 17) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 102) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 17) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 119) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0.225-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 83) / 19) * (0-(0)));
            yy = -0.1 + (((tickAnim - 83) / 19) * (-0.1-(-0.1)));
            zz = 0.225 + (((tickAnim - 83) / 19) * (0.225-(0.225)));
        }
        else if (tickAnim >= 102 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 102) / 17) * (0-(0)));
            yy = -0.1 + (((tickAnim - 102) / 17) * (0-(-0.1)));
            zz = 0.225 + (((tickAnim - 102) / 17) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 48) / 20) * (12.75-(0)));
            yy = 0 + (((tickAnim - 48) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 20) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = 12.75 + (((tickAnim - 68) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 68) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 2.25 + (((tickAnim - 80) / 18) * (6.44-(2.25)));
            yy = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 18) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 125) {
            xx = 6.44 + (((tickAnim - 98) / 27) * (0-(6.44)));
            yy = 0 + (((tickAnim - 98) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 27) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 80) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 80) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 18) * (1.26-(1)));
        }
        else if (tickAnim >= 98 && tickAnim < 125) {
            xx = 1 + (((tickAnim - 98) / 27) * (1-(1)));
            yy = 1 + (((tickAnim - 98) / 27) * (1-(1)));
            zz = 1.26 + (((tickAnim - 98) / 27) * (1-(1.26)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (19.25-(0)));
            yy = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(xx), throatPouch2.rotateAngleY + (float) Math.toRadians(yy), throatPouch2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.87244-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.90794-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (10.1776-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -7.87244 + (((tickAnim - 60) / 65) * (0-(-7.87244)));
            yy = 0.90794 + (((tickAnim - 60) / 65) * (0-(0.90794)));
            zz = 10.1776 + (((tickAnim - 60) / 65) * (0-(10.1776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -16.75 + (((tickAnim - 60) / 65) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = 12 + (((tickAnim - 60) / 65) * (0-(12)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 5.5 + (((tickAnim - 60) / 16) * (0.5-(5.5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 0.5 + (((tickAnim - 76) / 49) * (-4.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0.5)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = -4.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 125) / 20) * (0-(-4.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 60) / 16) * (-2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(0.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = -2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 76) / 49) * (-11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(-2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = -11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 125) / 20) * (0-(-11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -14.75 + (((tickAnim - 60) / 65) * (-8.75-(-14.75)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = -8.75 + (((tickAnim - 125) / 20) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-22.40488-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (11.32337-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (3.90705-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -22.40488 + (((tickAnim - 60) / 16) * (-26.65488-(-22.40488)));
            yy = 11.32337 + (((tickAnim - 60) / 16) * (11.32337-(11.32337)));
            zz = 3.90705 + (((tickAnim - 60) / 16) * (3.90705-(3.90705)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = -26.65488 + (((tickAnim - 76) / 49) * (3.75-(-26.65488)));
            yy = 11.32337 + (((tickAnim - 76) / 49) * (0-(11.32337)));
            zz = 3.90705 + (((tickAnim - 76) / 49) * (0-(3.90705)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 3.75 + (((tickAnim - 125) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (32.56952-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.23952-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-4.0234-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 32.56952 + (((tickAnim - 60) / 16) * (33.81952-(32.56952)));
            yy = -0.23952 + (((tickAnim - 60) / 16) * (-0.23952-(-0.23952)));
            zz = -4.0234 + (((tickAnim - 60) / 16) * (-4.0234-(-4.0234)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 33.81952 + (((tickAnim - 76) / 49) * (0-(33.81952)));
            yy = -0.23952 + (((tickAnim - 76) / 49) * (0-(-0.23952)));
            zz = -4.0234 + (((tickAnim - 76) / 49) * (0-(-4.0234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -29.25 + (((tickAnim - 60) / 16) * (-28.5-(-29.25)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = -28.5 + (((tickAnim - 76) / 49) * (0-(-28.5)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.575-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -0.825 + (((tickAnim - 60) / 16) * (-0.825-(-0.825)));
            zz = 0.575 + (((tickAnim - 60) / 16) * (0.575-(0.575)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            yy = -0.825 + (((tickAnim - 76) / 49) * (0-(-0.825)));
            zz = 0.575 + (((tickAnim - 76) / 49) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 8.75 + (((tickAnim - 60) / 16) * (6.5-(8.75)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 6.5 + (((tickAnim - 76) / 49) * (0-(6.5)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0.6 + (((tickAnim - 60) / 16) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            yy = 0.6 + (((tickAnim - 76) / 49) * (0-(0.6)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.87244-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.90794-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-10.1776-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -7.87244 + (((tickAnim - 60) / 65) * (0-(-7.87244)));
            yy = -0.90794 + (((tickAnim - 60) / 65) * (0-(-0.90794)));
            zz = -10.1776 + (((tickAnim - 60) / 65) * (0-(-10.1776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -16.75 + (((tickAnim - 60) / 65) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = 12 + (((tickAnim - 60) / 65) * (0-(12)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16.40488-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-11.32337-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.90705-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -16.40488 + (((tickAnim - 25) / 35) * (-22.40488-(-16.40488)));
            yy = -11.32337 + (((tickAnim - 25) / 35) * (-11.32337-(-11.32337)));
            zz = -3.90705 + (((tickAnim - 25) / 35) * (-3.90705-(-3.90705)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -22.40488 + (((tickAnim - 60) / 16) * (-26.15488-(-22.40488)));
            yy = -11.32337 + (((tickAnim - 60) / 16) * (-11.32337-(-11.32337)));
            zz = -3.90705 + (((tickAnim - 60) / 16) * (-3.90705-(-3.90705)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = -26.15488 + (((tickAnim - 76) / 24) * (-11.00309-(-26.15488)));
            yy = -11.32337 + (((tickAnim - 76) / 24) * (-11.41738-(-11.32337)));
            zz = -3.90705 + (((tickAnim - 76) / 24) * (-5.94484-(-3.90705)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -11.00309 + (((tickAnim - 100) / 13) * (-11.63478-(-11.00309)));
            yy = -11.41738 + (((tickAnim - 100) / 13) * (-5.32811-(-11.41738)));
            zz = -5.94484 + (((tickAnim - 100) / 13) * (-2.77426-(-5.94484)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -11.63478 + (((tickAnim - 113) / 12) * (3.75-(-11.63478)));
            yy = -5.32811 + (((tickAnim - 113) / 12) * (0-(-5.32811)));
            zz = -2.77426 + (((tickAnim - 113) / 12) * (0-(-2.77426)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 3.75 + (((tickAnim - 125) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 125) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (24.39911-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.11178-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (1.87759-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 24.39911 + (((tickAnim - 12) / 13) * (19.81952-(24.39911)));
            yy = -0.11178 + (((tickAnim - 12) / 13) * (-0.23952-(-0.11178)));
            zz = 1.87759 + (((tickAnim - 12) / 13) * (4.0234-(1.87759)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 19.81952 + (((tickAnim - 25) / 35) * (28.31952-(19.81952)));
            yy = -0.23952 + (((tickAnim - 25) / 35) * (-0.23952-(-0.23952)));
            zz = 4.0234 + (((tickAnim - 25) / 35) * (4.0234-(4.0234)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 28.31952 + (((tickAnim - 60) / 16) * (28.31952-(28.31952)));
            yy = -0.23952 + (((tickAnim - 60) / 16) * (-0.23952-(-0.23952)));
            zz = 4.0234 + (((tickAnim - 60) / 16) * (4.0234-(4.0234)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 28.31952 + (((tickAnim - 76) / 24) * (12.81952-(28.31952)));
            yy = -0.23952 + (((tickAnim - 76) / 24) * (-0.23952-(-0.23952)));
            zz = 4.0234 + (((tickAnim - 76) / 24) * (4.0234-(4.0234)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 12.81952 + (((tickAnim - 100) / 13) * (34.73244-(12.81952)));
            yy = -0.23952 + (((tickAnim - 100) / 13) * (-0.11178-(-0.23952)));
            zz = 4.0234 + (((tickAnim - 100) / 13) * (1.87759-(4.0234)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 34.73244 + (((tickAnim - 113) / 12) * (0-(34.73244)));
            yy = -0.11178 + (((tickAnim - 113) / 12) * (0-(-0.11178)));
            zz = 1.87759 + (((tickAnim - 113) / 12) * (0-(1.87759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (24.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 24.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*100 + (((tickAnim - 12) / 13) * (-14-(24.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*100)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -14 + (((tickAnim - 25) / 35) * (-37.25-(-14)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -37.25 + (((tickAnim - 60) / 16) * (-38.75-(-37.25)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = -38.75 + (((tickAnim - 76) / 24) * (-25-(-38.75)));
            yy = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 24) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -25 + (((tickAnim - 100) / 5) * (-27.25-(-25)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -27.25 + (((tickAnim - 105) / 8) * (-49.67-(-27.25)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -49.67 + (((tickAnim - 113) / 12) * (0-(-49.67)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-1.805-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.27-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -1.805 + (((tickAnim - 12) / 13) * (-0.825-(-1.805)));
            zz = 0.27 + (((tickAnim - 12) / 13) * (0.575-(0.27)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = -0.825 + (((tickAnim - 25) / 35) * (-0.825-(-0.825)));
            zz = 0.575 + (((tickAnim - 25) / 35) * (0.575-(0.575)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -0.825 + (((tickAnim - 60) / 16) * (-0.825-(-0.825)));
            zz = 0.575 + (((tickAnim - 60) / 16) * (0.575-(0.575)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            yy = -0.825 + (((tickAnim - 76) / 24) * (-0.825-(-0.825)));
            zz = 0.575 + (((tickAnim - 76) / 24) * (0.575-(0.575)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            yy = -0.825 + (((tickAnim - 100) / 13) * (-1.03-(-0.825)));
            zz = 0.575 + (((tickAnim - 100) / 13) * (1.545-(0.575)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            yy = -1.03 + (((tickAnim - 113) / 12) * (0-(-1.03)));
            zz = 1.545 + (((tickAnim - 113) / 12) * (0-(1.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (71.83991-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.66154-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.81548-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 71.83991 + (((tickAnim - 12) / 13) * (7.49176-(71.83991)));
            yy = 0.66154 + (((tickAnim - 12) / 13) * (0.31657-(0.66154)));
            zz = -0.81548 + (((tickAnim - 12) / 13) * (-2.98327-(-0.81548)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 7.49176 + (((tickAnim - 25) / 35) * (22-(7.49176)));
            yy = 0.31657 + (((tickAnim - 25) / 35) * (0-(0.31657)));
            zz = -2.98327 + (((tickAnim - 25) / 35) * (0-(-2.98327)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 22 + (((tickAnim - 60) / 16) * (22-(22)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 22 + (((tickAnim - 76) / 24) * (18-(22)));
            yy = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 24) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 18 + (((tickAnim - 100) / 13) * (82.65-(18)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 82.65 + (((tickAnim - 113) / 12) * (0-(82.65)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            yy = 0.9 + (((tickAnim - 3) / 22) * (0-(0.9)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 35) * (0.6-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0.6 + (((tickAnim - 60) / 16) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            yy = 0.6 + (((tickAnim - 76) / 24) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 76) / 24) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            yy = 0.6 + (((tickAnim - 100) / 25) * (0-(0.6)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -24.75 + (((tickAnim - 3) / 4) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -24.75 + (((tickAnim - 7) / 5) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 12) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 88) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 100) / 5) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 109) {
            xx = -27.25 + (((tickAnim - 105) / 4) * (-15.25-(-27.25)));
            yy = 0 + (((tickAnim - 105) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 4) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = -15.25 + (((tickAnim - 109) / 4) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 109) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 113) / 1) * (8.25-(0)));
            yy = 0 + (((tickAnim - 113) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 1) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = 8.25 + (((tickAnim - 114) / 4) * (-12.75-(8.25)));
            yy = 0 + (((tickAnim - 114) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 4) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -12.75 + (((tickAnim - 118) / 3) * (-13.58-(-12.75)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 125) {
            xx = -13.58 + (((tickAnim - 121) / 4) * (0-(-13.58)));
            yy = 0 + (((tickAnim - 121) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 3) / 2) * (0.575-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 5) / 8) * (0-(0.575)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 105) / 40) * (0-(0)));
            yy = -0.25 + (((tickAnim - 105) / 40) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 105) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);

    }
    public void animSand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeishanlong entity = (EntityPrehistoricFloraBeishanlong) entitylivingbaseIn;
        int animCycle = 605;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
		{
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-29.075-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0.01 + (((tickAnim - 0) / 43) * (0-(0.01)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -29.075 + (((tickAnim - 43) / 0) * (-14.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+10))*-20-(-29.075)));
            yy = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 0) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 84) {
            xx = -14.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+10))*-20 + (((tickAnim - 43) / 41) * (12.25-(-14.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+10))*-20)));
            yy = 0 + (((tickAnim - 43) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 41) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = 12.25 + (((tickAnim - 84) / 84) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 84) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 12.25 + (((tickAnim - 168) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (-125.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*150-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 203) {
            xx = 12.25 + (((tickAnim - 178) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 178) / 25) * (0-(0)));
            zz = -125.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*150 + (((tickAnim - 178) / 25) * (-97.375-(-125.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*150)));
        }
        else if (tickAnim >= 203 && tickAnim < 216) {
            xx = 12.25 + (((tickAnim - 203) / 13) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 203) / 13) * (0-(0)));
            zz = -97.375 + (((tickAnim - 203) / 13) * (-137.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-97.375)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = 12.25 + (((tickAnim - 216) / 15) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 216) / 15) * (0-(0)));
            zz = -137.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 216) / 15) * (-90.75-(-137.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 12.25 + (((tickAnim - 231) / 1) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = -90.75 + (((tickAnim - 231) / 1) * (-90.75-(-90.75)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = 12.25 + (((tickAnim - 232) / 11) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 232) / 11) * (0-(0)));
            zz = -90.75 + (((tickAnim - 232) / 11) * (-70.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-90.75)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = 12.25 + (((tickAnim - 243) / 15) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 243) / 15) * (0-(0)));
            zz = -70.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 243) / 15) * (-90.75-(-70.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
        }
        else if (tickAnim >= 258 && tickAnim < 279) {
            xx = 12.25 + (((tickAnim - 258) / 21) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 258) / 21) * (0-(0)));
            zz = -90.75 + (((tickAnim - 258) / 21) * (-21.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(-90.75)));
        }
        else if (tickAnim >= 279 && tickAnim < 304) {
            xx = 12.25 + (((tickAnim - 279) / 25) * (0-(12.25)));
            yy = 0 + (((tickAnim - 279) / 25) * (0-(0)));
            zz = -21.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 279) / 25) * (0.01-(-21.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0.01 + (((tickAnim - 304) / 81) * (0.01-(0.01)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 385) / 40) * (17-(0)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0.01 + (((tickAnim - 385) / 40) * (0-(0.01)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 17 + (((tickAnim - 425) / 15) * (20.5-(17)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 20.5 + (((tickAnim - 440) / 90) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 20.5 + (((tickAnim - 530) / 30) * (0-(20.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0.01-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0.01 + (((tickAnim - 560) / 17) * (9.5-(0.01)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 9.5 + (((tickAnim - 577) / 28) * (0.01-(9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (-8.225-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = -8.225 + (((tickAnim - 43) / 6) * (-10.74-(-8.225)));
            zz = 0 + (((tickAnim - 43) / 6) * (-6.11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            yy = -10.74 + (((tickAnim - 49) / 1) * (-10.915-(-10.74)));
            zz = -6.11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 49) / 1) * (2.315-(-6.11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            yy = -10.915 + (((tickAnim - 50) / 20) * (-18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*2-(-10.915)));
            zz = 2.315 + (((tickAnim - 50) / 20) * (3.075-(2.315)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            yy = -18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*2 + (((tickAnim - 70) / 14) * (-17.45-(-18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*2)));
            zz = 3.075 + (((tickAnim - 70) / 14) * (3.075-(3.075)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            yy = -17.45 + (((tickAnim - 84) / 84) * (-17.45-(-17.45)));
            zz = 3.075 + (((tickAnim - 84) / 84) * (3.075-(3.075)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (-0.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-2-(0)));
            yy = -17.45 + (((tickAnim - 168) / 10) * (-17.45-(-17.45)));
            zz = 3.075 + (((tickAnim - 168) / 10) * (3.075-(3.075)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = -0.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-2 + (((tickAnim - 178) / 15) * (-9.335-(-0.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-2)));
            yy = -17.45 + (((tickAnim - 178) / 15) * (-22.12-(-17.45)));
            zz = 3.075 + (((tickAnim - 178) / 15) * (3.08-(3.075)));
        }
        else if (tickAnim >= 193 && tickAnim < 203) {
            xx = -9.335 + (((tickAnim - 193) / 10) * (-10.875-(-9.335)));
            yy = -22.12 + (((tickAnim - 193) / 10) * (-24.375-(-22.12)));
            zz = 3.08 + (((tickAnim - 193) / 10) * (3.08-(3.08)));
        }
        else if (tickAnim >= 203 && tickAnim < 216) {
            xx = -10.875 + (((tickAnim - 203) / 13) * (-11.075-(-10.875)));
            yy = -24.375 + (((tickAnim - 203) / 13) * (-23.745-(-24.375)));
            zz = 3.08 + (((tickAnim - 203) / 13) * (3.08-(3.08)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = -11.075 + (((tickAnim - 216) / 15) * (-10.875-(-11.075)));
            yy = -23.745 + (((tickAnim - 216) / 15) * (-24.375-(-23.745)));
            zz = 3.08 + (((tickAnim - 216) / 15) * (3.08-(3.08)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -10.875 + (((tickAnim - 231) / 1) * (-10.875-(-10.875)));
            yy = -24.375 + (((tickAnim - 231) / 1) * (-24.375-(-24.375)));
            zz = 3.08 + (((tickAnim - 231) / 1) * (3.08-(3.08)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = -10.875 + (((tickAnim - 232) / 11) * (-11.075-(-10.875)));
            yy = -24.375 + (((tickAnim - 232) / 11) * (-23.745-(-24.375)));
            zz = 3.08 + (((tickAnim - 232) / 11) * (3.08-(3.08)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = -11.075 + (((tickAnim - 243) / 15) * (-10.875-(-11.075)));
            yy = -23.745 + (((tickAnim - 243) / 15) * (-24.375-(-23.745)));
            zz = 3.08 + (((tickAnim - 243) / 15) * (3.08-(3.08)));
        }
        else if (tickAnim >= 258 && tickAnim < 279) {
            xx = -10.875 + (((tickAnim - 258) / 21) * (-12.68-(-10.875)));
            yy = -24.375 + (((tickAnim - 258) / 21) * (-22.995-(-24.375)));
            zz = 3.08 + (((tickAnim - 258) / 21) * (3.08-(3.08)));
        }
        else if (tickAnim >= 279 && tickAnim < 304) {
            xx = -12.68 + (((tickAnim - 279) / 25) * (0.125-(-12.68)));
            yy = -22.995 + (((tickAnim - 279) / 25) * (-17.1-(-22.995)));
            zz = 3.08 + (((tickAnim - 279) / 25) * (0-(3.08)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0.125 + (((tickAnim - 304) / 81) * (0.125-(0.125)));
            yy = -17.1 + (((tickAnim - 304) / 81) * (-17.1-(-17.1)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0.125 + (((tickAnim - 385) / 40) * (0.12-(0.125)));
            yy = -17.1 + (((tickAnim - 385) / 40) * (-18.35-(-17.1)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0.12 + (((tickAnim - 425) / 15) * (0.12-(0.12)));
            yy = -18.35 + (((tickAnim - 425) / 15) * (-18.35-(-18.35)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0.12 + (((tickAnim - 440) / 90) * (0.12-(0.12)));
            yy = -18.35 + (((tickAnim - 440) / 90) * (-18.35-(-18.35)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 0.12 + (((tickAnim - 530) / 30) * (0.125-(0.12)));
            yy = -18.35 + (((tickAnim - 530) / 30) * (-17.1-(-18.35)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 0.125 + (((tickAnim - 560) / 17) * (0.12-(0.125)));
            yy = -17.1 + (((tickAnim - 560) / 17) * (-10.9-(-17.1)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 0.12 + (((tickAnim - 577) / 28) * (0-(0.12)));
            yy = -10.9 + (((tickAnim - 577) / 28) * (0-(-10.9)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = 13.5 + (((tickAnim - 43) / 16) * (14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(13.5)));
            yy = 0 + (((tickAnim - 43) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 16) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 83) {
            xx = 14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 59) / 24) * (16.5-(14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 59) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 24) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 168) {
            xx = 16.5 + (((tickAnim - 83) / 85) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 83) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 85) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 16.5 + (((tickAnim - 168) / 10) * (16.7908-(16.5)));
            yy = 0 + (((tickAnim - 168) / 10) * (-7.89351-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (-4.13088-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 211) {
            xx = 16.7908 + (((tickAnim - 178) / 33) * (16.53774-(16.7908)));
            yy = -7.89351 + (((tickAnim - 178) / 33) * (2.88376-(-7.89351)));
            zz = -4.13088 + (((tickAnim - 178) / 33) * (1.49943-(-4.13088)));
        }
        else if (tickAnim >= 211 && tickAnim < 223) {
            xx = 16.53774 + (((tickAnim - 211) / 12) * (16.30149-(16.53774)));
            yy = 2.88376 + (((tickAnim - 211) / 12) * (4.72327-(2.88376)));
            zz = 1.49943 + (((tickAnim - 211) / 12) * (-2.0605-(1.49943)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = 16.30149 + (((tickAnim - 223) / 15) * (16.53774-(16.30149)));
            yy = 4.72327 + (((tickAnim - 223) / 15) * (2.88376-(4.72327)));
            zz = -2.0605 + (((tickAnim - 223) / 15) * (1.49943-(-2.0605)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 16.53774 + (((tickAnim - 238) / 1) * (16.53774-(16.53774)));
            yy = 2.88376 + (((tickAnim - 238) / 1) * (2.88376-(2.88376)));
            zz = 1.49943 + (((tickAnim - 238) / 1) * (1.49943-(1.49943)));
        }
        else if (tickAnim >= 239 && tickAnim < 251) {
            xx = 16.53774 + (((tickAnim - 239) / 12) * (16.30149-(16.53774)));
            yy = 2.88376 + (((tickAnim - 239) / 12) * (4.72327-(2.88376)));
            zz = 1.49943 + (((tickAnim - 239) / 12) * (-2.0605-(1.49943)));
        }
        else if (tickAnim >= 251 && tickAnim < 266) {
            xx = 16.30149 + (((tickAnim - 251) / 15) * (16.53774-(16.30149)));
            yy = 4.72327 + (((tickAnim - 251) / 15) * (2.88376-(4.72327)));
            zz = -2.0605 + (((tickAnim - 251) / 15) * (1.49943-(-2.0605)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 16.53774 + (((tickAnim - 266) / 14) * (16.53774-(16.53774)));
            yy = 2.88376 + (((tickAnim - 266) / 14) * (2.88376-(2.88376)));
            zz = 1.49943 + (((tickAnim - 266) / 14) * (1.49943-(1.49943)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 16.53774 + (((tickAnim - 280) / 24) * (9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*15-(16.53774)));
            yy = 2.88376 + (((tickAnim - 280) / 24) * (0-(2.88376)));
            zz = 1.49943 + (((tickAnim - 280) / 24) * (0-(1.49943)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*15 + (((tickAnim - 304) / 11) * (-2.5-(9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*15)));
            yy = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 11) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 385) {
            xx = -2.5 + (((tickAnim - 315) / 70) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 315) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 70) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = -2.5 + (((tickAnim - 385) / 40) * (17.75-(-2.5)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = 17.75 + (((tickAnim - 425) / 105) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 425) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 105) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 17.75 + (((tickAnim - 530) / 30) * (-5.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*20-(17.75)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = -5.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*20 + (((tickAnim - 560) / 17) * (-14.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20-(-5.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*20)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -14.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20 + (((tickAnim - 577) / 28) * (0-(-14.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 14.25 + (((tickAnim - 43) / 27) * (14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(14.25)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 70) / 14) * (9-(14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = 9 + (((tickAnim - 84) / 84) * (9-(9)));
            yy = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 84) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 9 + (((tickAnim - 168) / 10) * (9.04895-(9)));
            yy = 0 + (((tickAnim - 168) / 10) * (-4.57578-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (-1.13217-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 203) {
            xx = 9.04895 + (((tickAnim - 178) / 25) * (9.15681-(9.04895)));
            yy = -4.57578 + (((tickAnim - 178) / 25) * (-8.49332-(-4.57578)));
            zz = -1.13217 + (((tickAnim - 178) / 25) * (-2.11156-(-1.13217)));
        }
        else if (tickAnim >= 203 && tickAnim < 216) {
            xx = 9.15681 + (((tickAnim - 203) / 13) * (10.06445-(9.15681)));
            yy = -8.49332 + (((tickAnim - 203) / 13) * (-6.74204-(-8.49332)));
            zz = -2.11156 + (((tickAnim - 203) / 13) * (-8.94964-(-2.11156)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = 10.06445 + (((tickAnim - 216) / 15) * (9.15681-(10.06445)));
            yy = -6.74204 + (((tickAnim - 216) / 15) * (-8.49332-(-6.74204)));
            zz = -8.94964 + (((tickAnim - 216) / 15) * (-2.11156-(-8.94964)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 9.15681 + (((tickAnim - 231) / 1) * (9.15681-(9.15681)));
            yy = -8.49332 + (((tickAnim - 231) / 1) * (-8.49332-(-8.49332)));
            zz = -2.11156 + (((tickAnim - 231) / 1) * (-2.11156-(-2.11156)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = 9.15681 + (((tickAnim - 232) / 11) * (10.06445-(9.15681)));
            yy = -8.49332 + (((tickAnim - 232) / 11) * (-6.74204-(-8.49332)));
            zz = -2.11156 + (((tickAnim - 232) / 11) * (-8.94964-(-2.11156)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = 10.06445 + (((tickAnim - 243) / 15) * (9.15681-(10.06445)));
            yy = -6.74204 + (((tickAnim - 243) / 15) * (-8.49332-(-6.74204)));
            zz = -8.94964 + (((tickAnim - 243) / 15) * (-2.11156-(-8.94964)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = 9.15681 + (((tickAnim - 258) / 22) * (9.15681-(9.15681)));
            yy = -8.49332 + (((tickAnim - 258) / 22) * (-8.49332-(-8.49332)));
            zz = -2.11156 + (((tickAnim - 258) / 22) * (-2.11156-(-2.11156)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 9.15681 + (((tickAnim - 280) / 24) * (5.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(9.15681)));
            yy = -8.49332 + (((tickAnim - 280) / 24) * (0-(-8.49332)));
            zz = -2.11156 + (((tickAnim - 280) / 24) * (0-(-2.11156)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 5.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 304) / 11) * (2.75-(5.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 11) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 385) {
            xx = 2.75 + (((tickAnim - 315) / 70) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 315) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 70) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 2.75 + (((tickAnim - 385) / 40) * (0-(2.75)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = -5.5 + (((tickAnim - 440) / 90) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 530) / 30) * (2.75-(-5.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 2.75 + (((tickAnim - 560) / 17) * (9.50351-(2.75)));
            yy = 0 + (((tickAnim - 560) / 17) * (1.73458-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0.23182-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 9.50351 + (((tickAnim - 577) / 28) * (0-(9.50351)));
            yy = 1.73458 + (((tickAnim - 577) / 28) * (0-(1.73458)));
            zz = 0.23182 + (((tickAnim - 577) / 28) * (0-(0.23182)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 85) {
            xx = -26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10 + (((tickAnim - 43) / 42) * (-15.10746-(-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10)));
            yy = 0 + (((tickAnim - 43) / 42) * (-5.50305-(0)));
            zz = 0 + (((tickAnim - 43) / 42) * (3.57384-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = -15.10746 + (((tickAnim - 85) / 22) * (-15.10746-(-15.10746)));
            yy = -5.50305 + (((tickAnim - 85) / 22) * (-5.50305-(-5.50305)));
            zz = 3.57384 + (((tickAnim - 85) / 22) * (3.57384-(3.57384)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = -15.10746 + (((tickAnim - 107) / 1) * (-7.1825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-10-(-15.10746)));
            yy = -5.50305 + (((tickAnim - 107) / 1) * (-5.50305-(-5.50305)));
            zz = 3.57384 + (((tickAnim - 107) / 1) * (3.57384-(3.57384)));
        }
        else if (tickAnim >= 108 && tickAnim < 128) {
            xx = -7.1825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-10 + (((tickAnim - 108) / 20) * (-10.82769-(-7.1825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-10)));
            yy = -5.50305 + (((tickAnim - 108) / 20) * (-4.92184-(-5.50305)));
            zz = 3.57384 + (((tickAnim - 108) / 20) * (6.37571-(3.57384)));
        }
        else if (tickAnim >= 128 && tickAnim < 162) {
            xx = -10.82769 + (((tickAnim - 128) / 34) * (-8.87769-(-10.82769)));
            yy = -4.92184 + (((tickAnim - 128) / 34) * (-4.92184-(-4.92184)));
            zz = 6.37571 + (((tickAnim - 128) / 34) * (6.37571-(6.37571)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -8.87769 + (((tickAnim - 162) / 6) * (-8.32769-(-8.87769)));
            yy = -4.92184 + (((tickAnim - 162) / 6) * (-4.92184-(-4.92184)));
            zz = 6.37571 + (((tickAnim - 162) / 6) * (6.37571-(6.37571)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -8.32769 + (((tickAnim - 168) / 7) * (-323.3409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-8.32769)));
            yy = -4.92184 + (((tickAnim - 168) / 7) * (81.6226-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*80-(-4.92184)));
            zz = 6.37571 + (((tickAnim - 168) / 7) * (4.50607-(6.37571)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = -323.3409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 175) / 7) * (-14.7357-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-50-(-323.3409-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 81.6226-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*80 + (((tickAnim - 175) / 7) * (21.71822-(81.6226-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*80)));
            zz = 4.50607 + (((tickAnim - 175) / 7) * (-10.97277-(4.50607)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = -14.7357-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-50 + (((tickAnim - 182) / 5) * (-15.7977-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-14.7357-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-50)));
            yy = 21.71822 + (((tickAnim - 182) / 5) * (22.66401-(21.71822)));
            zz = -10.97277 + (((tickAnim - 182) / 5) * (-12.92244-(-10.97277)));
        }
        else if (tickAnim >= 187 && tickAnim < 195) {
            xx = -15.7977-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 187) / 8) * (11.06116-(-15.7977-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 22.66401 + (((tickAnim - 187) / 8) * (33.84007-(22.66401)));
            zz = -12.92244 + (((tickAnim - 187) / 8) * (-19.4613-(-12.92244)));
        }
        else if (tickAnim >= 195 && tickAnim < 231) {
            xx = 11.06116 + (((tickAnim - 195) / 36) * (25-(11.06116)));
            yy = 33.84007 + (((tickAnim - 195) / 36) * (15.25-(33.84007)));
            zz = -19.4613 + (((tickAnim - 195) / 36) * (-29.775-(-19.4613)));
        }
        else if (tickAnim >= 231 && tickAnim < 243) {
            xx = 25 + (((tickAnim - 231) / 12) * (17.1654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50-(25)));
            yy = 15.25 + (((tickAnim - 231) / 12) * (17.43319-(15.25)));
            zz = -29.775 + (((tickAnim - 231) / 12) * (-13.3172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-75))*-50-(-29.775)));
        }
        else if (tickAnim >= 243 && tickAnim < 266) {
            xx = 17.1654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50 + (((tickAnim - 243) / 23) * (25-(17.1654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50)));
            yy = 17.43319 + (((tickAnim - 243) / 23) * (15.25-(17.43319)));
            zz = -13.3172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-75))*-50 + (((tickAnim - 243) / 23) * (-10.65-(-13.3172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-75))*-50)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 25 + (((tickAnim - 266) / 14) * (25.94617-(25)));
            yy = 15.25 + (((tickAnim - 266) / 14) * (-10.97244-(15.25)));
            zz = -10.65 + (((tickAnim - 266) / 14) * (-1.94171-(-10.65)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 25.94617 + (((tickAnim - 280) / 24) * (11.6462-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(25.94617)));
            yy = -10.97244 + (((tickAnim - 280) / 24) * (-6.0345-(-10.97244)));
            zz = -1.94171 + (((tickAnim - 280) / 24) * (-0.97792-(-1.94171)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 11.6462-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 304) / 11) * (-3.90385-(11.6462-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -6.0345 + (((tickAnim - 304) / 11) * (-6.0345-(-6.0345)));
            zz = -0.97792 + (((tickAnim - 304) / 11) * (-0.97792-(-0.97792)));
        }
        else if (tickAnim >= 315 && tickAnim < 352) {
            xx = -3.90385 + (((tickAnim - 315) / 37) * (-3.90385-(-3.90385)));
            yy = -6.0345 + (((tickAnim - 315) / 37) * (-6.0345-(-6.0345)));
            zz = -0.97792 + (((tickAnim - 315) / 37) * (-0.97792-(-0.97792)));
        }
        else if (tickAnim >= 352 && tickAnim < 370) {
            xx = -3.90385 + (((tickAnim - 352) / 18) * (-3.9545-(-3.90385)));
            yy = -6.0345 + (((tickAnim - 352) / 18) * (-2.13561-(-6.0345)));
            zz = -0.97792 + (((tickAnim - 352) / 18) * (-1.18585-(-0.97792)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = -3.9545 + (((tickAnim - 370) / 15) * (-3.9545-(-3.9545)));
            yy = -2.13561 + (((tickAnim - 370) / 15) * (-2.13561-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 370) / 15) * (-1.18585-(-1.18585)));
        }
        else if (tickAnim >= 385 && tickAnim < 406) {
            xx = -3.9545 + (((tickAnim - 385) / 21) * (48.41529-(-3.9545)));
            yy = -2.13561 + (((tickAnim - 385) / 21) * (-2.13561-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 385) / 21) * (-1.18585-(-1.18585)));
        }
        else if (tickAnim >= 406 && tickAnim < 423) {
            xx = 48.41529 + (((tickAnim - 406) / 17) * (43.7955-(48.41529)));
            yy = -2.13561 + (((tickAnim - 406) / 17) * (-2.13561-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 406) / 17) * (-1.18585-(-1.18585)));
        }
        else if (tickAnim >= 423 && tickAnim < 425) {
            xx = 43.7955 + (((tickAnim - 423) / 2) * (40.7955-(43.7955)));
            yy = -2.13561 + (((tickAnim - 423) / 2) * (-2.13561-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 423) / 2) * (-1.18585-(-1.18585)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 40.7955 + (((tickAnim - 425) / 15) * (44.00934-(40.7955)));
            yy = -2.13561 + (((tickAnim - 425) / 15) * (-14.68303-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 425) / 15) * (0.53765-(-1.18585)));
        }
        else if (tickAnim >= 440 && tickAnim < 453) {
            xx = 44.00934 + (((tickAnim - 440) / 13) * (45.55381-(44.00934)));
            yy = -14.68303 + (((tickAnim - 440) / 13) * (-46.0082-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-14.68303)));
            zz = 0.53765 + (((tickAnim - 440) / 13) * (23.443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0.53765)));
        }
        else if (tickAnim >= 453 && tickAnim < 474) {
            xx = 45.55381 + (((tickAnim - 453) / 21) * (30.84286-(45.55381)));
            yy = -46.0082-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 453) / 21) * (9.34968-(-46.0082-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 23.443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 453) / 21) * (-17.03606-(23.443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else if (tickAnim >= 474 && tickAnim < 485) {
            xx = 30.84286 + (((tickAnim - 474) / 11) * (42.50913-(30.84286)));
            yy = 9.34968 + (((tickAnim - 474) / 11) * (10.51141-(9.34968)));
            zz = -17.03606 + (((tickAnim - 474) / 11) * (-11.65453-(-17.03606)));
        }
        else if (tickAnim >= 485 && tickAnim < 497) {
            xx = 42.50913 + (((tickAnim - 485) / 12) * (46.50913-(42.50913)));
            yy = 10.51141 + (((tickAnim - 485) / 12) * (10.51141-(10.51141)));
            zz = -11.65453 + (((tickAnim - 485) / 12) * (-11.65453-(-11.65453)));
        }
        else if (tickAnim >= 497 && tickAnim < 510) {
            xx = 46.50913 + (((tickAnim - 497) / 13) * (42.50913-(46.50913)));
            yy = 10.51141 + (((tickAnim - 497) / 13) * (10.51141-(10.51141)));
            zz = -11.65453 + (((tickAnim - 497) / 13) * (-11.65453-(-11.65453)));
        }
        else if (tickAnim >= 510 && tickAnim < 520) {
            xx = 42.50913 + (((tickAnim - 510) / 10) * (42.50913-(42.50913)));
            yy = 10.51141 + (((tickAnim - 510) / 10) * (10.51141-(10.51141)));
            zz = -11.65453 + (((tickAnim - 510) / 10) * (-11.65453-(-11.65453)));
        }
        else if (tickAnim >= 520 && tickAnim < 530) {
            xx = 42.50913 + (((tickAnim - 520) / 10) * (42.50913-(42.50913)));
            yy = 10.51141 + (((tickAnim - 520) / 10) * (10.51141-(10.51141)));
            zz = -11.65453 + (((tickAnim - 520) / 10) * (-11.65453-(-11.65453)));
        }
        else if (tickAnim >= 530 && tickAnim < 540) {
            xx = 42.50913 + (((tickAnim - 530) / 10) * (-2.0537-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(42.50913)));
            yy = 10.51141 + (((tickAnim - 530) / 10) * (6.29573-(10.51141)));
            zz = -11.65453 + (((tickAnim - 530) / 10) * (-8.16497-(-11.65453)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = -2.0537-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 540) / 20) * (-16.5295-(-2.0537-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 6.29573 + (((tickAnim - 540) / 20) * (-2.13561-(6.29573)));
            zz = -8.16497 + (((tickAnim - 540) / 20) * (-1.18585-(-8.16497)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = -16.5295 + (((tickAnim - 560) / 17) * (-14.2045-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-10-(-16.5295)));
            yy = -2.13561 + (((tickAnim - 560) / 17) * (-2.13561-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 560) / 17) * (-1.18585-(-1.18585)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -14.2045-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-10 + (((tickAnim - 577) / 28) * (0-(-14.2045-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-10)));
            yy = -2.13561 + (((tickAnim - 577) / 28) * (0-(-2.13561)));
            zz = -1.18585 + (((tickAnim - 577) / 28) * (0-(-1.18585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 0) / 423) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 423) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 423) * (-2.525-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 423) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 423) / 2) * (0-(0)));
            zz = -2.525 + (((tickAnim - 423) / 2) * (-2.525-(-2.525)));
        }
        else if (tickAnim >= 425 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 425) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 180) * (0-(0)));
            zz = -2.525 + (((tickAnim - 425) / 180) * (0-(-2.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-7.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 85) {
            xx = -7.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-10 + (((tickAnim - 43) / 42) * (-5.33772-(-7.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-10)));
            yy = 0 + (((tickAnim - 43) / 42) * (-5.06314-(0)));
            zz = 0 + (((tickAnim - 43) / 42) * (-3.66908-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = -5.33772 + (((tickAnim - 85) / 22) * (-5.33772-(-5.33772)));
            yy = -5.06314 + (((tickAnim - 85) / 22) * (-5.06314-(-5.06314)));
            zz = -3.66908 + (((tickAnim - 85) / 22) * (-3.66908-(-3.66908)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = -5.33772 + (((tickAnim - 107) / 1) * (-5.33772-(-5.33772)));
            yy = -5.06314 + (((tickAnim - 107) / 1) * (-12.9881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10-(-5.06314)));
            zz = -3.66908 + (((tickAnim - 107) / 1) * (-3.66908-(-3.66908)));
        }
        else if (tickAnim >= 108 && tickAnim < 128) {
            xx = -5.33772 + (((tickAnim - 108) / 20) * (-5.37219-(-5.33772)));
            yy = -12.9881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10 + (((tickAnim - 108) / 20) * (-10.2313-(-12.9881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10)));
            zz = -3.66908 + (((tickAnim - 108) / 20) * (-2.70969-(-3.66908)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -5.37219 + (((tickAnim - 128) / 5) * (-5.37219-(-5.37219)));
            yy = -10.2313 + (((tickAnim - 128) / 5) * (-10.2313-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 128) / 5) * (-2.70969-(-2.70969)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = -5.37219 + (((tickAnim - 133) / 5) * (-6.12219-(-5.37219)));
            yy = -10.2313 + (((tickAnim - 133) / 5) * (-10.2313-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 133) / 5) * (-2.70969-(-2.70969)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = -6.12219 + (((tickAnim - 138) / 6) * (-5.37219-(-6.12219)));
            yy = -10.2313 + (((tickAnim - 138) / 6) * (-10.2313-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 138) / 6) * (-2.70969-(-2.70969)));
        }
        else if (tickAnim >= 144 && tickAnim < 162) {
            xx = -5.37219 + (((tickAnim - 144) / 18) * (-4.54719-(-5.37219)));
            yy = -10.2313 + (((tickAnim - 144) / 18) * (-10.2313-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 144) / 18) * (-2.70969-(-2.70969)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -4.54719 + (((tickAnim - 162) / 6) * (-3.87219-(-4.54719)));
            yy = -10.2313 + (((tickAnim - 162) / 6) * (-10.2313-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 162) / 6) * (-2.70969-(-2.70969)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = -3.87219 + (((tickAnim - 168) / 10) * (9.22123-(-3.87219)));
            yy = -10.2313 + (((tickAnim - 168) / 10) * (2.26346-(-10.2313)));
            zz = -2.70969 + (((tickAnim - 168) / 10) * (-8.24705-(-2.70969)));
        }
        else if (tickAnim >= 178 && tickAnim < 223) {
            xx = 9.22123 + (((tickAnim - 178) / 45) * (151.1958-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*130-(9.22123)));
            yy = 2.26346 + (((tickAnim - 178) / 45) * (-2.01876-(2.26346)));
            zz = -8.24705 + (((tickAnim - 178) / 45) * (140.2853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-150-(-8.24705)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = 151.1958-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*130 + (((tickAnim - 223) / 15) * (39.73185-(151.1958-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*130)));
            yy = -2.01876 + (((tickAnim - 223) / 15) * (3.44771-(-2.01876)));
            zz = 140.2853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-150 + (((tickAnim - 223) / 15) * (-0.60308-(140.2853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-150)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 39.73185 + (((tickAnim - 238) / 1) * (39.73185-(39.73185)));
            yy = 3.44771 + (((tickAnim - 238) / 1) * (3.44771-(3.44771)));
            zz = -0.60308 + (((tickAnim - 238) / 1) * (-0.60308-(-0.60308)));
        }
        else if (tickAnim >= 239 && tickAnim < 251) {
            xx = 39.73185 + (((tickAnim - 239) / 12) * (78.4891-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50-(39.73185)));
            yy = 3.44771 + (((tickAnim - 239) / 12) * (13.56692-(3.44771)));
            zz = -0.60308 + (((tickAnim - 239) / 12) * (-74.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-90-(-0.60308)));
        }
        else if (tickAnim >= 251 && tickAnim < 266) {
            xx = 78.4891-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50 + (((tickAnim - 251) / 15) * (39.73185-(78.4891-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50)));
            yy = 13.56692 + (((tickAnim - 251) / 15) * (3.44771-(13.56692)));
            zz = -74.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-90 + (((tickAnim - 251) / 15) * (-0.60308-(-74.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-90)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 39.73185 + (((tickAnim - 266) / 14) * (40.07138-(39.73185)));
            yy = 3.44771 + (((tickAnim - 266) / 14) * (-15.54366-(3.44771)));
            zz = -0.60308 + (((tickAnim - 266) / 14) * (-3.78065-(-0.60308)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 40.07138 + (((tickAnim - 280) / 10) * (30.77157-(40.07138)));
            yy = -15.54366 + (((tickAnim - 280) / 10) * (-16.80374-(-15.54366)));
            zz = -3.78065 + (((tickAnim - 280) / 10) * (-1.24379-(-3.78065)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = 30.77157 + (((tickAnim - 290) / 14) * (12.0347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(30.77157)));
            yy = -16.80374 + (((tickAnim - 290) / 14) * (2.8025-(-16.80374)));
            zz = -1.24379 + (((tickAnim - 290) / 14) * (5.35359-(-1.24379)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 12.0347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 304) / 11) * (0.70972-(12.0347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 2.8025 + (((tickAnim - 304) / 11) * (2.8025-(2.8025)));
            zz = 5.35359 + (((tickAnim - 304) / 11) * (5.35359-(5.35359)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 0.70972 + (((tickAnim - 315) / 5) * (1.20972-(0.70972)));
            yy = 2.8025 + (((tickAnim - 315) / 5) * (2.8025-(2.8025)));
            zz = 5.35359 + (((tickAnim - 315) / 5) * (5.35359-(5.35359)));
        }
        else if (tickAnim >= 320 && tickAnim < 325) {
            xx = 1.20972 + (((tickAnim - 320) / 5) * (0.70972-(1.20972)));
            yy = 2.8025 + (((tickAnim - 320) / 5) * (2.8025-(2.8025)));
            zz = 5.35359 + (((tickAnim - 320) / 5) * (5.35359-(5.35359)));
        }
        else if (tickAnim >= 325 && tickAnim < 352) {
            xx = 0.70972 + (((tickAnim - 325) / 27) * (0.70972-(0.70972)));
            yy = 2.8025 + (((tickAnim - 325) / 27) * (2.8025-(2.8025)));
            zz = 5.35359 + (((tickAnim - 325) / 27) * (5.35359-(5.35359)));
        }
        else if (tickAnim >= 352 && tickAnim < 370) {
            xx = 0.70972 + (((tickAnim - 352) / 18) * (0.795-(0.70972)));
            yy = 2.8025 + (((tickAnim - 352) / 18) * (5.80746-(2.8025)));
            zz = 5.35359 + (((tickAnim - 352) / 18) * (7.09937-(5.35359)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = 0.795 + (((tickAnim - 370) / 15) * (0.795-(0.795)));
            yy = 5.80746 + (((tickAnim - 370) / 15) * (5.80746-(5.80746)));
            zz = 7.09937 + (((tickAnim - 370) / 15) * (7.09937-(7.09937)));
        }
        else if (tickAnim >= 385 && tickAnim < 406) {
            xx = 0.795 + (((tickAnim - 385) / 21) * (18.84448-(0.795)));
            yy = 5.80746 + (((tickAnim - 385) / 21) * (2.78274-(5.80746)));
            zz = 7.09937 + (((tickAnim - 385) / 21) * (3.40178-(7.09937)));
        }
        else if (tickAnim >= 406 && tickAnim < 423) {
            xx = 18.84448 + (((tickAnim - 406) / 17) * (4.25-(18.84448)));
            yy = 2.78274 + (((tickAnim - 406) / 17) * (0-(2.78274)));
            zz = 3.40178 + (((tickAnim - 406) / 17) * (0-(3.40178)));
        }
        else if (tickAnim >= 423 && tickAnim < 440) {
            xx = 4.25 + (((tickAnim - 423) / 17) * (7.95784-(4.25)));
            yy = 0 + (((tickAnim - 423) / 17) * (-18.28111-(0)));
            zz = 0 + (((tickAnim - 423) / 17) * (-8.67276-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 453) {
            xx = 7.95784 + (((tickAnim - 440) / 13) * (-50.3262-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-70))*80-(7.95784)));
            yy = -18.28111 + (((tickAnim - 440) / 13) * (-174.3202-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*150-(-18.28111)));
            zz = -8.67276 + (((tickAnim - 440) / 13) * (-8.54092-(-8.67276)));
        }
        else if (tickAnim >= 453 && tickAnim < 458) {
            xx = -50.3262-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-70))*80 + (((tickAnim - 453) / 5) * (2.2206-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50-(-50.3262-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-70))*80)));
            yy = -174.3202-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*150 + (((tickAnim - 453) / 5) * (-26.89069-(-174.3202-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*150)));
            zz = -8.54092 + (((tickAnim - 453) / 5) * (-9.75201-(-8.54092)));
        }
        else if (tickAnim >= 458 && tickAnim < 474) {
            xx = 2.2206-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50 + (((tickAnim - 458) / 16) * (-12.4861-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-50-(2.2206-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50)));
            yy = -26.89069 + (((tickAnim - 458) / 16) * (-3.509-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50-(-26.89069)));
            zz = -9.75201 + (((tickAnim - 458) / 16) * (5.18422-(-9.75201)));
        }
        else if (tickAnim >= 474 && tickAnim < 485) {
            xx = -12.4861-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-50 + (((tickAnim - 474) / 11) * (-2.25-(-12.4861-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-50)));
            yy = -3.509-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50 + (((tickAnim - 474) / 11) * (10-(-3.509-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50)));
            zz = 5.18422 + (((tickAnim - 474) / 11) * (0-(5.18422)));
        }
        else if (tickAnim >= 485 && tickAnim < 497) {
            xx = -2.25 + (((tickAnim - 485) / 12) * (-5.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-20-(-2.25)));
            yy = 10 + (((tickAnim - 485) / 12) * (10-(10)));
            zz = 0 + (((tickAnim - 485) / 12) * (0-(0)));
        }
        else if (tickAnim >= 497 && tickAnim < 510) {
            xx = -5.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-20 + (((tickAnim - 497) / 13) * (-2.25-(-5.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*-20)));
            yy = 10 + (((tickAnim - 497) / 13) * (10-(10)));
            zz = 0 + (((tickAnim - 497) / 13) * (0-(0)));
        }
        else if (tickAnim >= 510 && tickAnim < 520) {
            xx = -2.25 + (((tickAnim - 510) / 10) * (-2.25-(-2.25)));
            yy = 10 + (((tickAnim - 510) / 10) * (10-(10)));
            zz = 0 + (((tickAnim - 510) / 10) * (0-(0)));
        }
        else if (tickAnim >= 520 && tickAnim < 530) {
            xx = -2.25 + (((tickAnim - 520) / 10) * (-2.25-(-2.25)));
            yy = 10 + (((tickAnim - 520) / 10) * (10-(10)));
            zz = 0 + (((tickAnim - 520) / 10) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 540) {
            xx = -2.25 + (((tickAnim - 530) / 10) * (13.765-(-2.25)));
            yy = 10 + (((tickAnim - 530) / 10) * (8.60249-(10)));
            zz = 0 + (((tickAnim - 530) / 10) * (2.36646-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = 13.765 + (((tickAnim - 540) / 20) * (0.795-(13.765)));
            yy = 8.60249 + (((tickAnim - 540) / 20) * (5.80746-(8.60249)));
            zz = 2.36646 + (((tickAnim - 540) / 20) * (7.09937-(2.36646)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 0.795 + (((tickAnim - 560) / 17) * (-6.555-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20-(0.795)));
            yy = 5.80746 + (((tickAnim - 560) / 17) * (5.80746-(5.80746)));
            zz = 7.09937 + (((tickAnim - 560) / 17) * (7.09937-(7.09937)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -6.555-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20 + (((tickAnim - 577) / 28) * (0-(-6.555-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20)));
            yy = 5.80746 + (((tickAnim - 577) / 28) * (0-(5.80746)));
            zz = 7.09937 + (((tickAnim - 577) / 28) * (0-(7.09937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (9.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 85) {
            xx = 9.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10 + (((tickAnim - 43) / 42) * (4.575-(9.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*10)));
            yy = 0 + (((tickAnim - 43) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 42) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 4.575 + (((tickAnim - 85) / 23) * (4.575-(4.575)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 128) {
            xx = 4.575 + (((tickAnim - 108) / 20) * (4.53248-(4.575)));
            yy = 0 + (((tickAnim - 108) / 20) * (-0.18692-(0)));
            zz = 0 + (((tickAnim - 108) / 20) * (-4.03415-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 4.53248 + (((tickAnim - 128) / 5) * (4.53248-(4.53248)));
            yy = -0.18692 + (((tickAnim - 128) / 5) * (-0.18692-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 128) / 5) * (-4.03415-(-4.03415)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 4.53248 + (((tickAnim - 133) / 5) * (5.28248-(4.53248)));
            yy = -0.18692 + (((tickAnim - 133) / 5) * (-0.18692-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 133) / 5) * (-4.03415-(-4.03415)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 5.28248 + (((tickAnim - 138) / 6) * (4.53248-(5.28248)));
            yy = -0.18692 + (((tickAnim - 138) / 6) * (-0.18692-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 138) / 6) * (-4.03415-(-4.03415)));
        }
        else if (tickAnim >= 144 && tickAnim < 162) {
            xx = 4.53248 + (((tickAnim - 144) / 18) * (2.10748-(4.53248)));
            yy = -0.18692 + (((tickAnim - 144) / 18) * (-0.18692-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 144) / 18) * (-4.03415-(-4.03415)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = 2.10748 + (((tickAnim - 162) / 6) * (0.43248-(2.10748)));
            yy = -0.18692 + (((tickAnim - 162) / 6) * (-0.18692-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 162) / 6) * (-4.03415-(-4.03415)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = 0.43248 + (((tickAnim - 168) / 5) * (-230.47-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-250-(0.43248)));
            yy = -0.18692 + (((tickAnim - 168) / 5) * (0.60359-(-0.18692)));
            zz = -4.03415 + (((tickAnim - 168) / 5) * (-0.46428-(-4.03415)));
        }
        else if (tickAnim >= 173 && tickAnim < 195) {
            xx = -230.47-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-250 + (((tickAnim - 173) / 22) * (0.77915-(-230.47-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-250)));
            yy = 0.60359 + (((tickAnim - 173) / 22) * (25.0542-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50-(0.60359)));
            zz = -0.46428 + (((tickAnim - 173) / 22) * (-1.96715-(-0.46428)));
        }
        else if (tickAnim >= 195 && tickAnim < 207) {
            xx = 0.77915 + (((tickAnim - 195) / 12) * (6.15264-(0.77915)));
            yy = 25.0542-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50 + (((tickAnim - 195) / 12) * (6.33225-(25.0542-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50)));
            zz = -1.96715 + (((tickAnim - 195) / 12) * (10.0847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*20-(-1.96715)));
        }
        else if (tickAnim >= 207 && tickAnim < 223) {
            xx = 6.15264 + (((tickAnim - 207) / 16) * (-8.2425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50-(6.15264)));
            yy = 6.33225 + (((tickAnim - 207) / 16) * (-4.58122-(6.33225)));
            zz = 10.0847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*20 + (((tickAnim - 207) / 16) * (20.5084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-20-(10.0847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*20)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = -8.2425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50 + (((tickAnim - 223) / 15) * (-4.19003-(-8.2425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*50)));
            yy = -4.58122 + (((tickAnim - 223) / 15) * (-4.73755-(-4.58122)));
            zz = 20.5084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-20 + (((tickAnim - 223) / 15) * (-2.91314-(20.5084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-20)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = -4.19003 + (((tickAnim - 238) / 1) * (-2.34003-(-4.19003)));
            yy = -4.73755 + (((tickAnim - 238) / 1) * (-4.73755-(-4.73755)));
            zz = -2.91314 + (((tickAnim - 238) / 1) * (-2.91314-(-2.91314)));
        }
        else if (tickAnim >= 239 && tickAnim < 251) {
            xx = -2.34003 + (((tickAnim - 239) / 12) * (65.3654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-210))*100-(-2.34003)));
            yy = -4.73755 + (((tickAnim - 239) / 12) * (-17.43319-(-4.73755)));
            zz = -2.91314 + (((tickAnim - 239) / 12) * (7.7828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50-(-2.91314)));
        }
        else if (tickAnim >= 251 && tickAnim < 266) {
            xx = 65.3654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-210))*100 + (((tickAnim - 251) / 15) * (6.05997-(65.3654-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-210))*100)));
            yy = -17.43319 + (((tickAnim - 251) / 15) * (-4.73755-(-17.43319)));
            zz = 7.7828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50 + (((tickAnim - 251) / 15) * (-2.91314-(7.7828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 6.05997 + (((tickAnim - 266) / 14) * (0.12433-(6.05997)));
            yy = -4.73755 + (((tickAnim - 266) / 14) * (-34.88316-(-4.73755)));
            zz = -2.91314 + (((tickAnim - 266) / 14) * (3.50276-(-2.91314)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 0.12433 + (((tickAnim - 280) / 24) * (-9.71998-(0.12433)));
            yy = -34.88316 + (((tickAnim - 280) / 24) * (3.38895-(-34.88316)));
            zz = 3.50276 + (((tickAnim - 280) / 24) * (7.02737-(3.50276)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = -9.71998 + (((tickAnim - 304) / 11) * (-5.21998-(-9.71998)));
            yy = 3.38895 + (((tickAnim - 304) / 11) * (3.38895-(3.38895)));
            zz = 7.02737 + (((tickAnim - 304) / 11) * (7.02737-(7.02737)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = -5.21998 + (((tickAnim - 315) / 5) * (-5.96998-(-5.21998)));
            yy = 3.38895 + (((tickAnim - 315) / 5) * (3.38895-(3.38895)));
            zz = 7.02737 + (((tickAnim - 315) / 5) * (7.02737-(7.02737)));
        }
        else if (tickAnim >= 320 && tickAnim < 325) {
            xx = -5.96998 + (((tickAnim - 320) / 5) * (-5.21998-(-5.96998)));
            yy = 3.38895 + (((tickAnim - 320) / 5) * (3.38895-(3.38895)));
            zz = 7.02737 + (((tickAnim - 320) / 5) * (7.02737-(7.02737)));
        }
        else if (tickAnim >= 325 && tickAnim < 352) {
            xx = -5.21998 + (((tickAnim - 325) / 27) * (-5.21998-(-5.21998)));
            yy = 3.38895 + (((tickAnim - 325) / 27) * (3.38895-(3.38895)));
            zz = 7.02737 + (((tickAnim - 325) / 27) * (7.02737-(7.02737)));
        }
        else if (tickAnim >= 352 && tickAnim < 370) {
            xx = -5.21998 + (((tickAnim - 352) / 18) * (-5.13553-(-5.21998)));
            yy = 3.38895 + (((tickAnim - 352) / 18) * (3.14363-(3.38895)));
            zz = 7.02737 + (((tickAnim - 352) / 18) * (8.50958-(7.02737)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = -5.13553 + (((tickAnim - 370) / 15) * (-5.13553-(-5.13553)));
            yy = 3.14363 + (((tickAnim - 370) / 15) * (3.14363-(3.14363)));
            zz = 8.50958 + (((tickAnim - 370) / 15) * (8.50958-(8.50958)));
        }
        else if (tickAnim >= 385 && tickAnim < 423) {
            xx = -5.13553 + (((tickAnim - 385) / 38) * (-33.75-(-5.13553)));
            yy = 3.14363 + (((tickAnim - 385) / 38) * (0-(3.14363)));
            zz = 8.50958 + (((tickAnim - 385) / 38) * (0-(8.50958)));
        }
        else if (tickAnim >= 423 && tickAnim < 440) {
            xx = -33.75 + (((tickAnim - 423) / 17) * (-34.77589-(-33.75)));
            yy = 0 + (((tickAnim - 423) / 17) * (-3.26449-(0)));
            zz = 0 + (((tickAnim - 423) / 17) * (-7.85238-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 453) {
            xx = -34.77589 + (((tickAnim - 440) / 13) * (-21.60955-(-34.77589)));
            yy = -3.26449 + (((tickAnim - 440) / 13) * (-12.31795-(-3.26449)));
            zz = -7.85238 + (((tickAnim - 440) / 13) * (-11.50336-(-7.85238)));
        }
        else if (tickAnim >= 453 && tickAnim < 458) {
            xx = -21.60955 + (((tickAnim - 453) / 5) * (-45.1872-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50-(-21.60955)));
            yy = -12.31795 + (((tickAnim - 453) / 5) * (10.72-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50-(-12.31795)));
            zz = -11.50336 + (((tickAnim - 453) / 5) * (-13.25476-(-11.50336)));
        }
        else if (tickAnim >= 458 && tickAnim < 485) {
            xx = -45.1872-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50 + (((tickAnim - 458) / 27) * (-29.92865-(-45.1872-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50)));
            yy = 10.72-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50 + (((tickAnim - 458) / 27) * (16.91282-(10.72-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50)));
            zz = -13.25476 + (((tickAnim - 458) / 27) * (-4.56234-(-13.25476)));
        }
        else if (tickAnim >= 485 && tickAnim < 497) {
            xx = -29.92865 + (((tickAnim - 485) / 12) * (-31.67865-(-29.92865)));
            yy = 16.91282 + (((tickAnim - 485) / 12) * (16.91282-(16.91282)));
            zz = -4.56234 + (((tickAnim - 485) / 12) * (-4.56234-(-4.56234)));
        }
        else if (tickAnim >= 497 && tickAnim < 510) {
            xx = -31.67865 + (((tickAnim - 497) / 13) * (-29.92865-(-31.67865)));
            yy = 16.91282 + (((tickAnim - 497) / 13) * (16.91282-(16.91282)));
            zz = -4.56234 + (((tickAnim - 497) / 13) * (-4.56234-(-4.56234)));
        }
        else if (tickAnim >= 510 && tickAnim < 515) {
            xx = -29.92865 + (((tickAnim - 510) / 5) * (-30.42865-(-29.92865)));
            yy = 16.91282 + (((tickAnim - 510) / 5) * (16.91282-(16.91282)));
            zz = -4.56234 + (((tickAnim - 510) / 5) * (-4.56234-(-4.56234)));
        }
        else if (tickAnim >= 515 && tickAnim < 520) {
            xx = -30.42865 + (((tickAnim - 515) / 5) * (-29.92865-(-30.42865)));
            yy = 16.91282 + (((tickAnim - 515) / 5) * (16.91282-(16.91282)));
            zz = -4.56234 + (((tickAnim - 515) / 5) * (-4.56234-(-4.56234)));
        }
        else if (tickAnim >= 520 && tickAnim < 530) {
            xx = -29.92865 + (((tickAnim - 520) / 10) * (-29.92865-(-29.92865)));
            yy = 16.91282 + (((tickAnim - 520) / 10) * (16.91282-(16.91282)));
            zz = -4.56234 + (((tickAnim - 520) / 10) * (-4.56234-(-4.56234)));
        }
        else if (tickAnim >= 530 && tickAnim < 540) {
            xx = -29.92865 + (((tickAnim - 530) / 10) * (-32.91428-(-29.92865)));
            yy = 16.91282 + (((tickAnim - 530) / 10) * (12.32309-(16.91282)));
            zz = -4.56234 + (((tickAnim - 530) / 10) * (-0.20504-(-4.56234)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = -32.91428 + (((tickAnim - 540) / 20) * (0.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20-(-32.91428)));
            yy = 12.32309 + (((tickAnim - 540) / 20) * (3.14363-(12.32309)));
            zz = -0.20504 + (((tickAnim - 540) / 20) * (8.50958-(-0.20504)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20 + (((tickAnim - 560) / 45) * (0-(0.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-20)));
            yy = 3.14363 + (((tickAnim - 560) / 45) * (0-(3.14363)));
            zz = 8.50958 + (((tickAnim - 560) / 45) * (0-(8.50958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 0) / 423) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 423) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 423) * (0.325-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 453) {
            xx = 0 + (((tickAnim - 423) / 30) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 423) / 30) * (0-(0)));
            zz = 0.325 + (((tickAnim - 423) / 30) * (0.33-(0.325)));
        }
        else if (tickAnim >= 453 && tickAnim < 605) {
            xx = -0.175 + (((tickAnim - 453) / 152) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 453) / 152) * (0-(0)));
            zz = 0.33 + (((tickAnim - 453) / 152) * (0-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = 11 + (((tickAnim - 20) / 22) * (0-(11)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 42) / 43) * (-24-(0)));
            yy = 0 + (((tickAnim - 42) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 43) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = -24 + (((tickAnim - 85) / 23) * (-24-(-24)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 128) {
            xx = -24 + (((tickAnim - 108) / 20) * (-30-(-24)));
            yy = 0 + (((tickAnim - 108) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 20) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -30 + (((tickAnim - 128) / 5) * (-30-(-30)));
            yy = 0 + (((tickAnim - 128) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 5) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = -30 + (((tickAnim - 133) / 5) * (-29.5-(-30)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = -29.5 + (((tickAnim - 138) / 6) * (-30-(-29.5)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 162) {
            xx = -30 + (((tickAnim - 144) / 18) * (-30-(-30)));
            yy = 0 + (((tickAnim - 144) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 18) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -30 + (((tickAnim - 162) / 6) * (-30-(-30)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -30 + (((tickAnim - 168) / 7) * (-17.3014-(-30)));
            yy = 0 + (((tickAnim - 168) / 7) * (-3.86159-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (-8.93222-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 179) {
            xx = -17.3014 + (((tickAnim - 175) / 4) * (-32.18408-(-17.3014)));
            yy = -3.86159 + (((tickAnim - 175) / 4) * (-8.4604-(-3.86159)));
            zz = -8.93222 + (((tickAnim - 175) / 4) * (-13.95091-(-8.93222)));
        }
        else if (tickAnim >= 179 && tickAnim < 182) {
            xx = -32.18408 + (((tickAnim - 179) / 3) * (-30.71355-(-32.18408)));
            yy = -8.4604 + (((tickAnim - 179) / 3) * (-8.39461-(-8.4604)));
            zz = -13.95091 + (((tickAnim - 179) / 3) * (-16.96204-(-13.95091)));
        }
        else if (tickAnim >= 182 && tickAnim < 187) {
            xx = -30.71355 + (((tickAnim - 182) / 5) * (-35.94014-(-30.71355)));
            yy = -8.39461 + (((tickAnim - 182) / 5) * (-6.192-(-8.39461)));
            zz = -16.96204 + (((tickAnim - 182) / 5) * (0.45687-(-16.96204)));
        }
        else if (tickAnim >= 187 && tickAnim < 195) {
            xx = -35.94014 + (((tickAnim - 187) / 8) * (-37.76875-(-35.94014)));
            yy = -6.192 + (((tickAnim - 187) / 8) * (-10.57953-(-6.192)));
            zz = 0.45687 + (((tickAnim - 187) / 8) * (5.07191-(0.45687)));
        }
        else if (tickAnim >= 195 && tickAnim < 207) {
            xx = -37.76875 + (((tickAnim - 195) / 12) * (-21-(-37.76875)));
            yy = -10.57953 + (((tickAnim - 195) / 12) * (0-(-10.57953)));
            zz = 5.07191 + (((tickAnim - 195) / 12) * (0-(5.07191)));
        }
        else if (tickAnim >= 207 && tickAnim < 223) {
            xx = -21 + (((tickAnim - 207) / 16) * (-12.75-(-21)));
            yy = 0 + (((tickAnim - 207) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 16) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = -12.75 + (((tickAnim - 223) / 15) * (-27.5-(-12.75)));
            yy = 0 + (((tickAnim - 223) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 15) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = -27.5 + (((tickAnim - 238) / 1) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 251) {
            xx = -27.5 + (((tickAnim - 239) / 12) * (-12.75-(-27.5)));
            yy = 0 + (((tickAnim - 239) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 12) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 266) {
            xx = -12.75 + (((tickAnim - 251) / 15) * (-27.5-(-12.75)));
            yy = 0 + (((tickAnim - 251) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 15) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = -27.5 + (((tickAnim - 266) / 14) * (-1.5-(-27.5)));
            yy = 0 + (((tickAnim - 266) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 266) / 14) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -1.5 + (((tickAnim - 280) / 10) * (-33.13-(-1.5)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = -33.13 + (((tickAnim - 290) / 14) * (0-(-33.13)));
            yy = 0 + (((tickAnim - 290) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 14) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 11) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 320) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 5) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 352) {
            xx = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 27) * (0-(0)));
        }
        else if (tickAnim >= 352 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 352) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 352) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 352) / 33) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 407) {
            xx = 0 + (((tickAnim - 385) / 22) * (-25.08-(0)));
            yy = 0 + (((tickAnim - 385) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 22) * (0-(0)));
        }
        else if (tickAnim >= 407 && tickAnim < 418) {
            xx = -25.08 + (((tickAnim - 407) / 11) * (-32-(-25.08)));
            yy = 0 + (((tickAnim - 407) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 407) / 11) * (0-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 423) {
            xx = -32 + (((tickAnim - 418) / 5) * (-36.5-(-32)));
            yy = 0 + (((tickAnim - 418) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 418) / 5) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 440) {
            xx = -36.5 + (((tickAnim - 423) / 17) * (-36.15216-(-36.5)));
            yy = 0 + (((tickAnim - 423) / 17) * (-3.87871-(0)));
            zz = 0 + (((tickAnim - 423) / 17) * (-5.04508-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 458) {
            xx = -36.15216 + (((tickAnim - 440) / 18) * (-35.87017-(-36.15216)));
            yy = -3.87871 + (((tickAnim - 440) / 18) * (-11.78424-(-3.87871)));
            zz = -5.04508 + (((tickAnim - 440) / 18) * (-8.16505-(-5.04508)));
        }
        else if (tickAnim >= 458 && tickAnim < 474) {
            xx = -35.87017 + (((tickAnim - 458) / 16) * (-39.55919-(-35.87017)));
            yy = -11.78424 + (((tickAnim - 458) / 16) * (-4.17435-(-11.78424)));
            zz = -8.16505 + (((tickAnim - 458) / 16) * (-2.80907-(-8.16505)));
        }
        else if (tickAnim >= 474 && tickAnim < 530) {
            xx = -39.55919 + (((tickAnim - 474) / 56) * (-39.55919-(-39.55919)));
            yy = -4.17435 + (((tickAnim - 474) / 56) * (-4.17435-(-4.17435)));
            zz = -2.80907 + (((tickAnim - 474) / 56) * (-2.80907-(-2.80907)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -39.55919 + (((tickAnim - 530) / 30) * (0-(-39.55919)));
            yy = -4.17435 + (((tickAnim - 530) / 30) * (0-(-4.17435)));
            zz = -2.80907 + (((tickAnim - 530) / 30) * (0-(-2.80907)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-0.475-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0.125 + (((tickAnim - 85) / 23) * (0.125-(0.125)));
            zz = -0.475 + (((tickAnim - 85) / 23) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 108 && tickAnim < 266) {
            xx = 0 + (((tickAnim - 108) / 158) * (0-(0)));
            yy = 0.125 + (((tickAnim - 108) / 158) * (0.125-(0.125)));
            zz = -0.475 + (((tickAnim - 108) / 158) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 266) / 14) * (0-(0)));
            yy = 0.125 + (((tickAnim - 266) / 14) * (0-(0.125)));
            zz = -0.475 + (((tickAnim - 266) / 14) * (0-(-0.475)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (0.175-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 290) / 14) * (0-(0)));
            yy = 0.175 + (((tickAnim - 290) / 14) * (0-(0.175)));
            zz = -0.775 + (((tickAnim - 290) / 14) * (0-(-0.775)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 11) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 315) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 315) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 10) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 352) {
            xx = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 27) * (0-(0)));
        }
        else if (tickAnim >= 352 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 352) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 352) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 352) / 33) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 385) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 33) * (0.175-(0)));
            zz = 0 + (((tickAnim - 385) / 33) * (-0.6-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 418) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 418) / 5) * (0.175-(0.175)));
            zz = -0.6 + (((tickAnim - 418) / 5) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 423 && tickAnim < 474) {
            xx = 0 + (((tickAnim - 423) / 51) * (0-(0)));
            yy = 0.175 + (((tickAnim - 423) / 51) * (0.175-(0.175)));
            zz = -0.6 + (((tickAnim - 423) / 51) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 474 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 474) / 56) * (0-(0)));
            yy = 0.175 + (((tickAnim - 474) / 56) * (0.175-(0.175)));
            zz = -0.6 + (((tickAnim - 474) / 56) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            yy = 0.175 + (((tickAnim - 530) / 30) * (0-(0.175)));
            zz = -0.6 + (((tickAnim - 530) / 30) * (0-(-0.6)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (8.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 45) {
            xx = 8.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*5 + (((tickAnim - 44) / 1) * (36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-35-(8.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*5)));
            yy = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 1) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-35 + (((tickAnim - 45) / 40) * (0-(36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50*2))*-35)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 85) / 77) * (-1.675-(0)));
            yy = 0 + (((tickAnim - 85) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 77) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -1.675 + (((tickAnim - 162) / 6) * (-2.5-(-1.675)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -2.5 + (((tickAnim - 168) / 7) * (-12.92328-(-2.5)));
            yy = 0 + (((tickAnim - 168) / 7) * (0.88378-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0.66137-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = -12.92328 + (((tickAnim - 175) / 7) * (-13-(-12.92328)));
            yy = 0.88378 + (((tickAnim - 175) / 7) * (-14.275-(0.88378)));
            zz = 0.66137 + (((tickAnim - 175) / 7) * (0-(0.66137)));
        }
        else if (tickAnim >= 182 && tickAnim < 207) {
            xx = -13 + (((tickAnim - 182) / 25) * (0-(-13)));
            yy = -14.275 + (((tickAnim - 182) / 25) * (0-(-14.275)));
            zz = 0 + (((tickAnim - 182) / 25) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 207) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 207) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 31) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 266) {
            xx = 0 + (((tickAnim - 239) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 239) / 27) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 266) / 14) * (10.25-(0)));
            yy = 0 + (((tickAnim - 266) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 266) / 14) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 10.25 + (((tickAnim - 280) / 24) * (0-(10.25)));
            yy = 0 + (((tickAnim - 280) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 24) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 304) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 21) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 352) {
            xx = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 325) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 27) * (0-(0)));
        }
        else if (tickAnim >= 352 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 352) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 352) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 352) / 18) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = 7.5 + (((tickAnim - 370) / 15) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 15) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 406) {
            xx = 7.5 + (((tickAnim - 385) / 21) * (-10.08-(7.5)));
            yy = 0 + (((tickAnim - 385) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 21) * (0-(0)));
        }
        else if (tickAnim >= 406 && tickAnim < 425) {
            xx = -10.08 + (((tickAnim - 406) / 19) * (-14.25-(-10.08)));
            yy = 0 + (((tickAnim - 406) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 406) / 19) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 453) {
            xx = -14.25 + (((tickAnim - 425) / 28) * (30.428-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50-(-14.25)));
            yy = 0 + (((tickAnim - 425) / 28) * (-7.81219-(0)));
            zz = 0 + (((tickAnim - 425) / 28) * (-2.36498-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 458) {
            xx = 30.428-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50 + (((tickAnim - 453) / 5) * (-2.52921-(30.428-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50)));
            yy = -7.81219 + (((tickAnim - 453) / 5) * (-7.88198-(-7.81219)));
            zz = -2.36498 + (((tickAnim - 453) / 5) * (-3.00975-(-2.36498)));
        }
        else if (tickAnim >= 458 && tickAnim < 474) {
            xx = -2.52921 + (((tickAnim - 458) / 16) * (-8.9418-(-2.52921)));
            yy = -7.88198 + (((tickAnim - 458) / 16) * (-7.44679-(-7.88198)));
            zz = -3.00975 + (((tickAnim - 458) / 16) * (-0.89437-(-3.00975)));
        }
        else if (tickAnim >= 474 && tickAnim < 510) {
            xx = -8.9418 + (((tickAnim - 474) / 36) * (-8.9418-(-8.9418)));
            yy = -7.44679 + (((tickAnim - 474) / 36) * (-7.44679-(-7.44679)));
            zz = -0.89437 + (((tickAnim - 474) / 36) * (-0.89437-(-0.89437)));
        }
        else if (tickAnim >= 510 && tickAnim < 515) {
            xx = -8.9418 + (((tickAnim - 510) / 5) * (-8.4418-(-8.9418)));
            yy = -7.44679 + (((tickAnim - 510) / 5) * (-7.44679-(-7.44679)));
            zz = -0.89437 + (((tickAnim - 510) / 5) * (-0.89437-(-0.89437)));
        }
        else if (tickAnim >= 515 && tickAnim < 520) {
            xx = -8.4418 + (((tickAnim - 515) / 5) * (-8.9418-(-8.4418)));
            yy = -7.44679 + (((tickAnim - 515) / 5) * (-7.44679-(-7.44679)));
            zz = -0.89437 + (((tickAnim - 515) / 5) * (-0.89437-(-0.89437)));
        }
        else if (tickAnim >= 520 && tickAnim < 530) {
            xx = -8.9418 + (((tickAnim - 520) / 10) * (-8.9418-(-8.9418)));
            yy = -7.44679 + (((tickAnim - 520) / 10) * (-7.44679-(-7.44679)));
            zz = -0.89437 + (((tickAnim - 520) / 10) * (-0.89437-(-0.89437)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -8.9418 + (((tickAnim - 530) / 30) * (7.5-(-8.9418)));
            yy = -7.44679 + (((tickAnim - 530) / 30) * (0-(-7.44679)));
            zz = -0.89437 + (((tickAnim - 530) / 30) * (0-(-0.89437)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 7.5 + (((tickAnim - 560) / 45) * (0-(7.5)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 108 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 108) / 9) * (2.25-(0)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 2.25 + (((tickAnim - 117) / 11) * (0-(2.25)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 128) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 49) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 177) / 173) * (0-(0)));
            yy = 0 + (((tickAnim - 177) / 173) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 173) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 350) / 10) * (2.89415-(0)));
            yy = 0 + (((tickAnim - 350) / 10) * (0.52737-(0)));
            zz = 0 + (((tickAnim - 350) / 10) * (1.90985-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 370) {
            xx = 2.89415 + (((tickAnim - 360) / 10) * (0-(2.89415)));
            yy = 0.52737 + (((tickAnim - 360) / 10) * (0-(0.52737)));
            zz = 1.90985 + (((tickAnim - 360) / 10) * (0-(1.90985)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 15) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 385) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 100) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 497) {
            xx = 0 + (((tickAnim - 485) / 12) * (6.5-(0)));
            yy = 0 + (((tickAnim - 485) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 12) * (0-(0)));
        }
        else if (tickAnim >= 497 && tickAnim < 510) {
            xx = 6.5 + (((tickAnim - 497) / 13) * (0-(6.5)));
            yy = 0 + (((tickAnim - 497) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 497) / 13) * (0-(0)));
        }
        else if (tickAnim >= 510 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 510) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 510) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 510) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJaw, lowerJaw.rotateAngleX + (float) Math.toRadians(xx), lowerJaw.rotateAngleY + (float) Math.toRadians(yy), lowerJaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 85 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 85) / 12) * (-3-(0)));
            yy = 0 + (((tickAnim - 85) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 12) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = -3 + (((tickAnim - 97) / 9) * (0-(-3)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 106) / 198) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 198) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 198) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 304) / 11) * (-4-(0)));
            yy = 0 + (((tickAnim - 304) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 11) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 350) {
            xx = -4 + (((tickAnim - 315) / 35) * (0-(-4)));
            yy = 0 + (((tickAnim - 315) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 35) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 350) / 10) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 350) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 10) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 370) {
            xx = -10.75 + (((tickAnim - 360) / 10) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 360) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 10) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 15) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 91 && tickAnim < 97) {
            xx = 1 + (((tickAnim - 91) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 91) / 6) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 91) / 6) * (1-(1)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 97) / 1) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 97) / 1) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 97) / 1) * (1-(1)));
        }
        else if (tickAnim >= 98 && tickAnim < 106) {
            xx = 1 + (((tickAnim - 98) / 8) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 98) / 8) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 98) / 8) * (1-(1)));
        }
        else if (tickAnim >= 106 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 106) / 24) * (1-(1)));
            yy = 1 + (((tickAnim - 106) / 24) * (1-(1)));
            zz = 1 + (((tickAnim - 106) / 24) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 132) {
            xx = 1 + (((tickAnim - 130) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 130) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 130) / 2) * (1-(1)));
        }
        else if (tickAnim >= 132 && tickAnim < 138) {
            xx = 1 + (((tickAnim - 132) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 132) / 6) * (0.265-(1)));
            zz = 1 + (((tickAnim - 132) / 6) * (1-(1)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 1 + (((tickAnim - 138) / 6) * (1-(1)));
            yy = 0.265 + (((tickAnim - 138) / 6) * (1-(0.265)));
            zz = 1 + (((tickAnim - 138) / 6) * (1-(1)));
        }
        else if (tickAnim >= 144 && tickAnim < 198) {
            xx = 1 + (((tickAnim - 144) / 54) * (1-(1)));
            yy = 1 + (((tickAnim - 144) / 54) * (1-(1)));
            zz = 1 + (((tickAnim - 144) / 54) * (1-(1)));
        }
        else if (tickAnim >= 198 && tickAnim < 207) {
            xx = 1 + (((tickAnim - 198) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 198) / 9) * (0-(1)));
            zz = 1 + (((tickAnim - 198) / 9) * (1-(1)));
        }
        else if (tickAnim >= 207 && tickAnim < 231) {
            xx = 1 + (((tickAnim - 207) / 24) * (1-(1)));
            yy = 0 + (((tickAnim - 207) / 24) * (0-(0)));
            zz = 1 + (((tickAnim - 207) / 24) * (1-(1)));
        }
        else if (tickAnim >= 231 && tickAnim < 242) {
            xx = 1 + (((tickAnim - 231) / 11) * (1-(1)));
            yy = 0 + (((tickAnim - 231) / 11) * (1-(0)));
            zz = 1 + (((tickAnim - 231) / 11) * (1-(1)));
        }
        else if (tickAnim >= 242 && tickAnim < 251) {
            xx = 1 + (((tickAnim - 242) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 242) / 9) * (0-(1)));
            zz = 1 + (((tickAnim - 242) / 9) * (1-(1)));
        }
        else if (tickAnim >= 251 && tickAnim < 266) {
            xx = 1 + (((tickAnim - 251) / 15) * (1-(1)));
            yy = 0 + (((tickAnim - 251) / 15) * (1-(0)));
            zz = 1 + (((tickAnim - 251) / 15) * (1-(1)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 1 + (((tickAnim - 266) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 266) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 266) / 14) * (1-(1)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 1 + (((tickAnim - 280) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 280) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 280) / 35) * (1-(1)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 1 + (((tickAnim - 315) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 315) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 315) / 5) * (1-(1)));
        }
        else if (tickAnim >= 320 && tickAnim < 325) {
            xx = 1 + (((tickAnim - 320) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 320) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 320) / 5) * (1-(1)));
        }
        else if (tickAnim >= 325 && tickAnim < 345) {
            xx = 1 + (((tickAnim - 325) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 325) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 325) / 20) * (1-(1)));
        }
        else if (tickAnim >= 345 && tickAnim < 425) {
            xx = 1 + (((tickAnim - 345) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 345) / 80) * (1-(1)));
            zz = 1 + (((tickAnim - 345) / 80) * (1-(1)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 1 + (((tickAnim - 425) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 425) / 15) * (0.215-(1)));
            zz = 1 + (((tickAnim - 425) / 15) * (1-(1)));
        }
        else if (tickAnim >= 440 && tickAnim < 450) {
            xx = 1 + (((tickAnim - 440) / 10) * (1-(1)));
            yy = 0.215 + (((tickAnim - 440) / 10) * (1-(0.215)));
            zz = 1 + (((tickAnim - 440) / 10) * (1-(1)));
        }
        else if (tickAnim >= 450 && tickAnim < 473) {
            xx = 1 + (((tickAnim - 450) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 450) / 23) * (0.09-(1)));
            zz = 1 + (((tickAnim - 450) / 23) * (1-(1)));
        }
        else if (tickAnim >= 473 && tickAnim < 486) {
            xx = 1 + (((tickAnim - 473) / 13) * (1-(1)));
            yy = 0.09 + (((tickAnim - 473) / 13) * (0.09-(0.09)));
            zz = 1 + (((tickAnim - 473) / 13) * (1-(1)));
        }
        else if (tickAnim >= 486 && tickAnim < 497) {
            xx = 1 + (((tickAnim - 486) / 11) * (1-(1)));
            yy = 0.09 + (((tickAnim - 486) / 11) * (1-(0.09)));
            zz = 1 + (((tickAnim - 486) / 11) * (1-(1)));
        }
        else if (tickAnim >= 497 && tickAnim < 510) {
            xx = 1 + (((tickAnim - 497) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 497) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 497) / 13) * (1-(1)));
        }
        else if (tickAnim >= 510 && tickAnim < 515) {
            xx = 1 + (((tickAnim - 510) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 510) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 510) / 5) * (1-(1)));
        }
        else if (tickAnim >= 515 && tickAnim < 520) {
            xx = 1 + (((tickAnim - 515) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 515) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 515) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 85) / 12) * (4.5-(0)));
            yy = 0 + (((tickAnim - 85) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 12) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = 4.5 + (((tickAnim - 97) / 9) * (0-(4.5)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 106) / 244) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 244) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 350) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 350) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 10) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 370) {
            xx = 10.75 + (((tickAnim - 360) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 360) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 10) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 15) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(xx), throatPouch3.rotateAngleY + (float) Math.toRadians(yy), throatPouch3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -12 + (((tickAnim - 84) / 476) * (-12-(-12)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -12 + (((tickAnim - 560) / 45) * (0-(-12)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(xx), neckFeathers2.rotateAngleY + (float) Math.toRadians(yy), neckFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -17 + (((tickAnim - 84) / 476) * (-17-(-17)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -17 + (((tickAnim - 560) / 45) * (0-(-17)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers, neckFeathers.rotateAngleX + (float) Math.toRadians(xx), neckFeathers.rotateAngleY + (float) Math.toRadians(yy), neckFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -18.25 + (((tickAnim - 84) / 476) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -18.25 + (((tickAnim - 560) / 45) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -24.5 + (((tickAnim - 84) / 476) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -24.5 + (((tickAnim - 560) / 45) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 14.25 + (((tickAnim - 43) / 27) * (0-(14.25)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckUnderfeathers, neckUnderfeathers.rotateAngleX + (float) Math.toRadians(xx), neckUnderfeathers.rotateAngleY + (float) Math.toRadians(yy), neckUnderfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -14.25 + (((tickAnim - 84) / 476) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -14.25 + (((tickAnim - 560) / 45) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 385) / 40) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 560) {
            xx = -18.5 + (((tickAnim - 425) / 135) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 425) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 135) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers6, neckFeathers6.rotateAngleX + (float) Math.toRadians(xx), neckFeathers6.rotateAngleY + (float) Math.toRadians(yy), neckFeathers6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (20.21274-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (-17.61426-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (11.3386411854+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 20.21274 + (((tickAnim - 70) / 14) * (10.77124-(20.21274)));
            yy = -17.61426 + (((tickAnim - 70) / 14) * (-29.35711-(-17.61426)));
            zz = 11.3386411854+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 70) / 14) * (18.89774-(11.3386411854+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = 10.77124 + (((tickAnim - 84) / 84) * (10.77124-(10.77124)));
            yy = -29.35711 + (((tickAnim - 84) / 84) * (-29.35711-(-29.35711)));
            zz = 18.89774 + (((tickAnim - 84) / 84) * (18.89774-(18.89774)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 10.77124 + (((tickAnim - 168) / 10) * (0-(10.77124)));
            yy = -29.35711 + (((tickAnim - 168) / 10) * (0-(-29.35711)));
            zz = 18.89774 + (((tickAnim - 168) / 10) * (77.5-(18.89774)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 77.5 + (((tickAnim - 178) / 8) * (0-(77.5)));
        }
        else if (tickAnim >= 186 && tickAnim < 196) {
            xx = 0 + (((tickAnim - 186) / 10) * (-36.80132-(0)));
            yy = 0 + (((tickAnim - 186) / 10) * (1.25171-(0)));
            zz = 0 + (((tickAnim - 186) / 10) * (-30.42118-(0)));
        }
        else if (tickAnim >= 196 && tickAnim < 203) {
            xx = -36.80132 + (((tickAnim - 196) / 7) * (-51.9992-(-36.80132)));
            yy = 1.25171 + (((tickAnim - 196) / 7) * (-1.32432-(1.25171)));
            zz = -30.42118 + (((tickAnim - 196) / 7) * (-10.82543-(-30.42118)));
        }
        else if (tickAnim >= 203 && tickAnim < 216) {
            xx = -51.9992 + (((tickAnim - 203) / 13) * (-93.95134-(-51.9992)));
            yy = -1.32432 + (((tickAnim - 203) / 13) * (16.99171-(-1.32432)));
            zz = -10.82543 + (((tickAnim - 203) / 13) * (6.77032-(-10.82543)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = -93.95134 + (((tickAnim - 216) / 15) * (-94.1773-(-93.95134)));
            yy = 16.99171 + (((tickAnim - 216) / 15) * (-9.55202-(16.99171)));
            zz = 6.77032 + (((tickAnim - 216) / 15) * (-12.15509-(6.77032)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -94.1773 + (((tickAnim - 231) / 1) * (-94.1773-(-94.1773)));
            yy = -9.55202 + (((tickAnim - 231) / 1) * (-9.55202-(-9.55202)));
            zz = -12.15509 + (((tickAnim - 231) / 1) * (-12.15509-(-12.15509)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = -94.1773 + (((tickAnim - 232) / 11) * (-80.33088-(-94.1773)));
            yy = -9.55202 + (((tickAnim - 232) / 11) * (1.28722-(-9.55202)));
            zz = -12.15509 + (((tickAnim - 232) / 11) * (-25.86319-(-12.15509)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = -80.33088 + (((tickAnim - 243) / 15) * (-75.25233-(-80.33088)));
            yy = 1.28722 + (((tickAnim - 243) / 15) * (-8.07964-(1.28722)));
            zz = -25.86319 + (((tickAnim - 243) / 15) * (-14.21977-(-25.86319)));
        }
        else if (tickAnim >= 258 && tickAnim < 266) {
            xx = -75.25233 + (((tickAnim - 258) / 8) * (-74.95716-(-75.25233)));
            yy = -8.07964 + (((tickAnim - 258) / 8) * (-9.085-(-8.07964)));
            zz = -14.21977 + (((tickAnim - 258) / 8) * (-15.68227-(-14.21977)));
        }
        else if (tickAnim >= 266 && tickAnim < 279) {
            xx = -74.95716 + (((tickAnim - 266) / 13) * (-76.71302-(-74.95716)));
            yy = -9.085 + (((tickAnim - 266) / 13) * (4.93872-(-9.085)));
            zz = -15.68227 + (((tickAnim - 266) / 13) * (3.61283-(-15.68227)));
        }
        else if (tickAnim >= 279 && tickAnim < 284) {
            xx = -76.71302 + (((tickAnim - 279) / 5) * (-30.90171-(-76.71302)));
            yy = 4.93872 + (((tickAnim - 279) / 5) * (-10.61168-(4.93872)));
            zz = 3.61283 + (((tickAnim - 279) / 5) * (-18.79398-(3.61283)));
        }
        else if (tickAnim >= 284 && tickAnim < 290) {
            xx = -30.90171 + (((tickAnim - 284) / 6) * (22.45674-(-30.90171)));
            yy = -10.61168 + (((tickAnim - 284) / 6) * (-2.0452-(-10.61168)));
            zz = -18.79398 + (((tickAnim - 284) / 6) * (10.87404-(-18.79398)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = 22.45674 + (((tickAnim - 290) / 14) * (-12.85989-(22.45674)));
            yy = -2.0452 + (((tickAnim - 290) / 14) * (-11.17797-(-2.0452)));
            zz = 10.87404 + (((tickAnim - 290) / 14) * (20.36943-(10.87404)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -12.85989 + (((tickAnim - 304) / 81) * (-12.85989-(-12.85989)));
            yy = -11.17797 + (((tickAnim - 304) / 81) * (-11.17797-(-11.17797)));
            zz = 20.36943 + (((tickAnim - 304) / 81) * (20.36943-(20.36943)));
        }
        else if (tickAnim >= 385 && tickAnim < 412) {
            xx = -12.85989 + (((tickAnim - 385) / 27) * (-72.9781-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-12.85989)));
            yy = -11.17797 + (((tickAnim - 385) / 27) * (36.7996-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-11.17797)));
            zz = 20.36943 + (((tickAnim - 385) / 27) * (51.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-50-(20.36943)));
        }
        else if (tickAnim >= 412 && tickAnim < 425) {
            xx = -72.9781-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 412) / 13) * (-54.8694-(-72.9781-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 36.7996-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 412) / 13) * (6.84029-(36.7996-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 51.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-50 + (((tickAnim - 412) / 13) * (70.98257-(51.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-50)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = -54.8694 + (((tickAnim - 425) / 15) * (-52.51896-(-54.8694)));
            yy = 6.84029 + (((tickAnim - 425) / 15) * (11.91397-(6.84029)));
            zz = 70.98257 + (((tickAnim - 425) / 15) * (69.62471-(70.98257)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = -52.51896 + (((tickAnim - 440) / 90) * (-52.51896-(-52.51896)));
            yy = 11.91397 + (((tickAnim - 440) / 90) * (11.91397-(11.91397)));
            zz = 69.62471 + (((tickAnim - 440) / 90) * (69.62471-(69.62471)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -52.51896 + (((tickAnim - 530) / 30) * (7.14011-(-52.51896)));
            yy = 11.91397 + (((tickAnim - 530) / 30) * (-11.17797-(11.91397)));
            zz = 69.62471 + (((tickAnim - 530) / 30) * (20.36943-(69.62471)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 7.14011 + (((tickAnim - 560) / 45) * (0-(7.14011)));
            yy = -11.17797 + (((tickAnim - 560) / 45) * (0-(-11.17797)));
            zz = 20.36943 + (((tickAnim - 560) / 45) * (0-(20.36943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 168) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 168) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 35) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 28) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-19.06461-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (7.27168-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (13.80877-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 84) {
            xx = -19.06461 + (((tickAnim - 60) / 24) * (-5.5-(-19.06461)));
            yy = 7.27168 + (((tickAnim - 60) / 24) * (0-(7.27168)));
            zz = 13.80877 + (((tickAnim - 60) / 24) * (0-(13.80877)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = -5.5 + (((tickAnim - 84) / 84) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 84) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 181) {
            xx = -5.5 + (((tickAnim - 168) / 13) * (-79.83568-(-5.5)));
            yy = 0 + (((tickAnim - 168) / 13) * (-9.44954-(0)));
            zz = 0 + (((tickAnim - 168) / 13) * (6.56796-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 186) {
            xx = -79.83568 + (((tickAnim - 181) / 5) * (-44.62053-(-79.83568)));
            yy = -9.44954 + (((tickAnim - 181) / 5) * (-19.73833-(-9.44954)));
            zz = 6.56796 + (((tickAnim - 181) / 5) * (0.69278-(6.56796)));
        }
        else if (tickAnim >= 186 && tickAnim < 203) {
            xx = -44.62053 + (((tickAnim - 186) / 17) * (-3.39678-(-44.62053)));
            yy = -19.73833 + (((tickAnim - 186) / 17) * (17.39145-(-19.73833)));
            zz = 0.69278 + (((tickAnim - 186) / 17) * (13.68753-(0.69278)));
        }
        else if (tickAnim >= 203 && tickAnim < 209) {
            xx = -3.39678 + (((tickAnim - 203) / 6) * (16.54939-(-3.39678)));
            yy = 17.39145 + (((tickAnim - 203) / 6) * (0.70138-(17.39145)));
            zz = 13.68753 + (((tickAnim - 203) / 6) * (-0.01811-(13.68753)));
        }
        else if (tickAnim >= 209 && tickAnim < 216) {
            xx = 16.54939 + (((tickAnim - 209) / 7) * (27.5-(16.54939)));
            yy = 0.70138 + (((tickAnim - 209) / 7) * (0-(0.70138)));
            zz = -0.01811 + (((tickAnim - 209) / 7) * (0-(-0.01811)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = 27.5 + (((tickAnim - 216) / 15) * (-3.39678-(27.5)));
            yy = 0 + (((tickAnim - 216) / 15) * (17.39145-(0)));
            zz = 0 + (((tickAnim - 216) / 15) * (13.68753-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -3.39678 + (((tickAnim - 231) / 1) * (-3.39678-(-3.39678)));
            yy = 17.39145 + (((tickAnim - 231) / 1) * (17.39145-(17.39145)));
            zz = 13.68753 + (((tickAnim - 231) / 1) * (13.68753-(13.68753)));
        }
        else if (tickAnim >= 232 && tickAnim < 237) {
            xx = -3.39678 + (((tickAnim - 232) / 5) * (16.54939-(-3.39678)));
            yy = 17.39145 + (((tickAnim - 232) / 5) * (0.70138-(17.39145)));
            zz = 13.68753 + (((tickAnim - 232) / 5) * (-0.01811-(13.68753)));
        }
        else if (tickAnim >= 237 && tickAnim < 243) {
            xx = 16.54939 + (((tickAnim - 237) / 6) * (27.5-(16.54939)));
            yy = 0.70138 + (((tickAnim - 237) / 6) * (0-(0.70138)));
            zz = -0.01811 + (((tickAnim - 237) / 6) * (0-(-0.01811)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = 27.5 + (((tickAnim - 243) / 15) * (-3.39678-(27.5)));
            yy = 0 + (((tickAnim - 243) / 15) * (17.39145-(0)));
            zz = 0 + (((tickAnim - 243) / 15) * (13.68753-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 279) {
            xx = -3.39678 + (((tickAnim - 258) / 21) * (-3.72751-(-3.39678)));
            yy = 17.39145 + (((tickAnim - 258) / 21) * (16.03155-(17.39145)));
            zz = 13.68753 + (((tickAnim - 258) / 21) * (12.53748-(13.68753)));
        }
        else if (tickAnim >= 279 && tickAnim < 287) {
            xx = -3.72751 + (((tickAnim - 279) / 8) * (-85.58236-(-3.72751)));
            yy = 16.03155 + (((tickAnim - 279) / 8) * (11.22207-(16.03155)));
            zz = 12.53748 + (((tickAnim - 279) / 8) * (8.77623-(12.53748)));
        }
        else if (tickAnim >= 287 && tickAnim < 290) {
            xx = -85.58236 + (((tickAnim - 287) / 3) * (-89.4623-(-85.58236)));
            yy = 11.22207 + (((tickAnim - 287) / 3) * (9.08453-(11.22207)));
            zz = 8.77623 + (((tickAnim - 287) / 3) * (7.10456-(8.77623)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = -89.4623 + (((tickAnim - 290) / 14) * (-50-(-89.4623)));
            yy = 9.08453 + (((tickAnim - 290) / 14) * (0-(9.08453)));
            zz = 7.10456 + (((tickAnim - 290) / 14) * (0-(7.10456)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -50 + (((tickAnim - 304) / 81) * (-50-(-50)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 401) {
            xx = -50 + (((tickAnim - 385) / 16) * (4.49402-(-50)));
            yy = 0 + (((tickAnim - 385) / 16) * (48.332-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            zz = 0 + (((tickAnim - 385) / 16) * (57.7154+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 401 && tickAnim < 425) {
            xx = 4.49402 + (((tickAnim - 401) / 24) * (15.15441-(4.49402)));
            yy = 48.332-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 401) / 24) * (3.34694-(48.332-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 57.7154+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 401) / 24) * (5.28131-(57.7154+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 15.15441 + (((tickAnim - 425) / 15) * (15.15441-(15.15441)));
            yy = 3.34694 + (((tickAnim - 425) / 15) * (3.34694-(3.34694)));
            zz = 5.28131 + (((tickAnim - 425) / 15) * (5.28131-(5.28131)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 15.15441 + (((tickAnim - 440) / 90) * (15.15441-(15.15441)));
            yy = 3.34694 + (((tickAnim - 440) / 90) * (3.34694-(3.34694)));
            zz = 5.28131 + (((tickAnim - 440) / 90) * (5.28131-(5.28131)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 15.15441 + (((tickAnim - 530) / 30) * (-50-(15.15441)));
            yy = 3.34694 + (((tickAnim - 530) / 30) * (0-(3.34694)));
            zz = 5.28131 + (((tickAnim - 530) / 30) * (0-(5.28131)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -50 + (((tickAnim - 560) / 45) * (0-(-50)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 168) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 279) {
            xx = 0 + (((tickAnim - 168) / 111) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 111) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 279) / 8) * (0.85-(0)));
            yy = 0 + (((tickAnim - 279) / 8) * (-1.9-(0)));
            zz = 0 + (((tickAnim - 279) / 8) * (1.75-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 290) {
            xx = 0.85 + (((tickAnim - 287) / 3) * (0-(0.85)));
            yy = -1.9 + (((tickAnim - 287) / 3) * (0-(-1.9)));
            zz = 1.75 + (((tickAnim - 287) / 3) * (1.8-(1.75)));
        }
        else if (tickAnim >= 290 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 290) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 95) * (0-(0)));
            zz = 1.8 + (((tickAnim - 290) / 95) * (1.8-(1.8)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 1.8 + (((tickAnim - 385) / 40) * (0-(1.8)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (1.8-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 1.8 + (((tickAnim - 560) / 45) * (0-(1.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 84) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (-0.30077-(0)));
            yy = 0 + (((tickAnim - 168) / 10) * (1.26596-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (-45.72695-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 182) {
            xx = -0.30077 + (((tickAnim - 178) / 4) * (-19.90038-(-0.30077)));
            yy = 1.26596 + (((tickAnim - 178) / 4) * (0.63299-(1.26596)));
            zz = -45.72695 + (((tickAnim - 178) / 4) * (-52.23842-(-45.72695)));
        }
        else if (tickAnim >= 182 && tickAnim < 203) {
            xx = -19.90038 + (((tickAnim - 182) / 21) * (-0.25019-(-19.90038)));
            yy = 0.63299 + (((tickAnim - 182) / 21) * (-3.66094-(0.63299)));
            zz = -52.23842 + (((tickAnim - 182) / 21) * (4.00458-(-52.23842)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = -0.25019 + (((tickAnim - 203) / 28) * (-0.59459-(-0.25019)));
            yy = -3.66094 + (((tickAnim - 203) / 28) * (-3.84498-(-3.66094)));
            zz = 4.00458 + (((tickAnim - 203) / 28) * (9.26264-(4.00458)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -0.59459 + (((tickAnim - 231) / 1) * (-0.59459-(-0.59459)));
            yy = -3.84498 + (((tickAnim - 231) / 1) * (-3.84498-(-3.84498)));
            zz = 9.26264 + (((tickAnim - 231) / 1) * (9.26264-(9.26264)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = -0.59459 + (((tickAnim - 232) / 26) * (-0.59459-(-0.59459)));
            yy = -3.84498 + (((tickAnim - 232) / 26) * (-3.84498-(-3.84498)));
            zz = 9.26264 + (((tickAnim - 232) / 26) * (9.26264-(9.26264)));
        }
        else if (tickAnim >= 258 && tickAnim < 290) {
            xx = -0.59459 + (((tickAnim - 258) / 32) * (-32.43378-(-0.59459)));
            yy = -3.84498 + (((tickAnim - 258) / 32) * (-1.18845-(-3.84498)));
            zz = 9.26264 + (((tickAnim - 258) / 32) * (-6.98247-(9.26264)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = -32.43378 + (((tickAnim - 290) / 14) * (0-(-32.43378)));
            yy = -1.18845 + (((tickAnim - 290) / 14) * (0-(-1.18845)));
            zz = -6.98247 + (((tickAnim - 290) / 14) * (-14.25-(-6.98247)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = -14.25 + (((tickAnim - 304) / 81) * (-14.25-(-14.25)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = -14.25 + (((tickAnim - 385) / 40) * (28.75-(-14.25)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 28.75 + (((tickAnim - 425) / 15) * (28.75-(28.75)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 28.75 + (((tickAnim - 440) / 90) * (28.75-(28.75)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 28.75 + (((tickAnim - 530) / 30) * (-14.25-(28.75)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = -14.25 + (((tickAnim - 560) / 45) * (0-(-14.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 84) {
            xx = 20.25 + (((tickAnim - 60) / 24) * (18.23884-(20.25)));
            yy = 0 + (((tickAnim - 60) / 24) * (7.71426-(0)));
            zz = 0 + (((tickAnim - 60) / 24) * (-14.91322-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 173) {
            xx = 18.23884 + (((tickAnim - 84) / 89) * (14.28996-(18.23884)));
            yy = 7.71426 + (((tickAnim - 84) / 89) * (16.27851-(7.71426)));
            zz = -14.91322 + (((tickAnim - 84) / 89) * (-33.69634-(-14.91322)));
        }
        else if (tickAnim >= 173 && tickAnim < 181) {
            xx = 14.28996 + (((tickAnim - 173) / 8) * (3.3822-(14.28996)));
            yy = 16.27851 + (((tickAnim - 173) / 8) * (14.81728-(16.27851)));
            zz = -33.69634 + (((tickAnim - 173) / 8) * (-46.2666-(-33.69634)));
        }
        else if (tickAnim >= 181 && tickAnim < 186) {
            xx = 3.3822 + (((tickAnim - 181) / 5) * (0-(3.3822)));
            yy = 14.81728 + (((tickAnim - 181) / 5) * (0-(14.81728)));
            zz = -46.2666 + (((tickAnim - 181) / 5) * (0-(-46.2666)));
        }
        else if (tickAnim >= 186 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 186) / 17) * (19.10946-(0)));
            yy = 0 + (((tickAnim - 186) / 17) * (-2.90653-(0)));
            zz = 0 + (((tickAnim - 186) / 17) * (5.53542-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 19.10946 + (((tickAnim - 203) / 28) * (19.10946-(19.10946)));
            yy = -2.90653 + (((tickAnim - 203) / 28) * (-2.90653-(-2.90653)));
            zz = 5.53542 + (((tickAnim - 203) / 28) * (5.53542-(5.53542)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 19.10946 + (((tickAnim - 231) / 1) * (19.10946-(19.10946)));
            yy = -2.90653 + (((tickAnim - 231) / 1) * (-2.90653-(-2.90653)));
            zz = 5.53542 + (((tickAnim - 231) / 1) * (5.53542-(5.53542)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 19.10946 + (((tickAnim - 232) / 26) * (19.10946-(19.10946)));
            yy = -2.90653 + (((tickAnim - 232) / 26) * (-2.90653-(-2.90653)));
            zz = 5.53542 + (((tickAnim - 232) / 26) * (5.53542-(5.53542)));
        }
        else if (tickAnim >= 258 && tickAnim < 290) {
            xx = 19.10946 + (((tickAnim - 258) / 32) * (-8.34345-(19.10946)));
            yy = -2.90653 + (((tickAnim - 258) / 32) * (-0.89838-(-2.90653)));
            zz = 5.53542 + (((tickAnim - 258) / 32) * (-18.67089-(5.53542)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = -8.34345 + (((tickAnim - 290) / 8) * (-14.67631-(-8.34345)));
            yy = -0.89838 + (((tickAnim - 290) / 8) * (-0.42277-(-0.89838)));
            zz = -18.67089 + (((tickAnim - 290) / 8) * (-24.40398-(-18.67089)));
        }
        else if (tickAnim >= 298 && tickAnim < 304) {
            xx = -14.67631 + (((tickAnim - 298) / 6) * (0-(-14.67631)));
            yy = -0.42277 + (((tickAnim - 298) / 6) * (0-(-0.42277)));
            zz = -24.40398 + (((tickAnim - 298) / 6) * (-29.5-(-24.40398)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = -29.5 + (((tickAnim - 304) / 81) * (-29.5-(-29.5)));
        }
        else if (tickAnim >= 385 && tickAnim < 393) {
            xx = 0 + (((tickAnim - 385) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 8) * (0-(0)));
            zz = -29.5 + (((tickAnim - 385) / 8) * (-82.48-(-29.5)));
        }
        else if (tickAnim >= 393 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 393) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 393) / 25) * (0-(0)));
            zz = -82.48 + (((tickAnim - 393) / 25) * (98.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-82.48)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            zz = 98.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 418) / 7) * (15-(98.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 15 + (((tickAnim - 425) / 15) * (15-(15)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 15 + (((tickAnim - 440) / 90) * (15-(15)));
        }
        else if (tickAnim >= 530 && tickAnim < 540) {
            xx = 0 + (((tickAnim - 530) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 10) * (0-(0)));
            zz = 15 + (((tickAnim - 530) / 10) * (30.67-(15)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            zz = 30.67 + (((tickAnim - 540) / 20) * (20.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-80-(30.67)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 20.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-80 + (((tickAnim - 560) / 45) * (0-(20.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-80)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(xx), leftFingers.rotateAngleY + (float) Math.toRadians(yy), leftFingers.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 0) / 173) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 173) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 173) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 173) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 173) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 13) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 186) / 199) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 199) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 393) {
            xx = 0 + (((tickAnim - 385) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 385) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 8) * (0-(0)));
        }
        else if (tickAnim >= 393 && tickAnim < 425) {
            xx = -1.5 + (((tickAnim - 393) / 32) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 393) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 393) / 32) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFingers.rotationPointX = this.leftFingers.rotationPointX + (float)(xx);
        this.leftFingers.rotationPointY = this.leftFingers.rotationPointY - (float)(yy);
        this.leftFingers.rotationPointZ = this.leftFingers.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 84) {
            xx = 21.25 + (((tickAnim - 60) / 24) * (22.5-(21.25)));
            yy = 0 + (((tickAnim - 60) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 24) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 173) {
            xx = 22.5 + (((tickAnim - 84) / 89) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 84) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 89) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 181) {
            xx = 22.5 + (((tickAnim - 173) / 8) * (3.81871-(22.5)));
            yy = 0 + (((tickAnim - 173) / 8) * (4.00769-(0)));
            zz = 0 + (((tickAnim - 173) / 8) * (-39.92251-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 186) {
            xx = 3.81871 + (((tickAnim - 181) / 5) * (0-(3.81871)));
            yy = 4.00769 + (((tickAnim - 181) / 5) * (0-(4.00769)));
            zz = -39.92251 + (((tickAnim - 181) / 5) * (0-(-39.92251)));
        }
        else if (tickAnim >= 186 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 186) / 17) * (24.23905-(0)));
            yy = 0 + (((tickAnim - 186) / 17) * (-5.38821-(0)));
            zz = 0 + (((tickAnim - 186) / 17) * (14.11103-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 24.23905 + (((tickAnim - 203) / 28) * (24.23905-(24.23905)));
            yy = -5.38821 + (((tickAnim - 203) / 28) * (-5.38821-(-5.38821)));
            zz = 14.11103 + (((tickAnim - 203) / 28) * (14.11103-(14.11103)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 24.23905 + (((tickAnim - 231) / 1) * (24.23905-(24.23905)));
            yy = -5.38821 + (((tickAnim - 231) / 1) * (-5.38821-(-5.38821)));
            zz = 14.11103 + (((tickAnim - 231) / 1) * (14.11103-(14.11103)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 24.23905 + (((tickAnim - 232) / 26) * (24.23905-(24.23905)));
            yy = -5.38821 + (((tickAnim - 232) / 26) * (-5.38821-(-5.38821)));
            zz = 14.11103 + (((tickAnim - 232) / 26) * (14.11103-(14.11103)));
        }
        else if (tickAnim >= 258 && tickAnim < 290) {
            xx = 24.23905 + (((tickAnim - 258) / 32) * (-2.00794-(24.23905)));
            yy = -5.38821 + (((tickAnim - 258) / 32) * (-1.66544-(-5.38821)));
            zz = 14.11103 + (((tickAnim - 258) / 32) * (-11.87479-(14.11103)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = -2.00794 + (((tickAnim - 290) / 8) * (-5.94491-(-2.00794)));
            yy = -1.66544 + (((tickAnim - 290) / 8) * (-0.78373-(-1.66544)));
            zz = -11.87479 + (((tickAnim - 290) / 8) * (-18.02934-(-11.87479)));
        }
        else if (tickAnim >= 298 && tickAnim < 304) {
            xx = -5.94491 + (((tickAnim - 298) / 6) * (0-(-5.94491)));
            yy = -0.78373 + (((tickAnim - 298) / 6) * (0-(-0.78373)));
            zz = -18.02934 + (((tickAnim - 298) / 6) * (-23.5-(-18.02934)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = -23.5 + (((tickAnim - 304) / 81) * (-23.5-(-23.5)));
        }
        else if (tickAnim >= 385 && tickAnim < 393) {
            xx = 0 + (((tickAnim - 385) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 8) * (0-(0)));
            zz = -23.5 + (((tickAnim - 385) / 8) * (-69.54-(-23.5)));
        }
        else if (tickAnim >= 393 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 393) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 393) / 25) * (0-(0)));
            zz = -69.54 + (((tickAnim - 393) / 25) * (95.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-69.54)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            zz = 95.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 418) / 7) * (13.5-(95.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 13.5 + (((tickAnim - 425) / 15) * (13.5-(13.5)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 13.5 + (((tickAnim - 440) / 90) * (13.5-(13.5)));
        }
        else if (tickAnim >= 530 && tickAnim < 540) {
            xx = 0 + (((tickAnim - 530) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 10) * (0-(0)));
            zz = 13.5 + (((tickAnim - 530) / 10) * (34.42-(13.5)));
        }
        else if (tickAnim >= 540 && tickAnim < 547) {
            xx = 0 + (((tickAnim - 540) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 7) * (0-(0)));
            zz = 34.42 + (((tickAnim - 540) / 7) * (45.03-(34.42)));
        }
        else if (tickAnim >= 547 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 547) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 547) / 13) * (0-(0)));
            zz = 45.03 + (((tickAnim - 547) / 13) * (-23.5-(45.03)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = -23.5 + (((tickAnim - 560) / 45) * (0-(-23.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(xx), leftThumb.rotateAngleY + (float) Math.toRadians(yy), leftThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 0) / 186) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 186) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 186) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 186) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 25) * (29-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 211) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 211) / 27) * (0-(0)));
            zz = 29 + (((tickAnim - 211) / 27) * (29-(29)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 29 + (((tickAnim - 238) / 1) * (29-(29)));
        }
        else if (tickAnim >= 239 && tickAnim < 266) {
            xx = 0 + (((tickAnim - 239) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 27) * (0-(0)));
            zz = 29 + (((tickAnim - 239) / 27) * (29-(29)));
        }
        else if (tickAnim >= 266 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 266) / 174) * (0-(0)));
            yy = 0 + (((tickAnim - 266) / 174) * (0-(0)));
            zz = 29 + (((tickAnim - 266) / 174) * (29-(29)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 29 + (((tickAnim - 440) / 90) * (29-(29)));
        }
        else if (tickAnim >= 530 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 530) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 530) / 75) * (0-(0)));
            zz = 29 + (((tickAnim - 530) / 75) * (0-(29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumbclaw, leftThumbclaw.rotateAngleX + (float) Math.toRadians(xx), leftThumbclaw.rotateAngleY + (float) Math.toRadians(yy), leftThumbclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -14 + (((tickAnim - 84) / 476) * (-14-(-14)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -14 + (((tickAnim - 560) / 45) * (0-(-14)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -10.75 + (((tickAnim - 84) / 476) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -10.75 + (((tickAnim - 560) / 45) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers2.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -13 + (((tickAnim - 84) / 476) * (-13-(-13)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -13 + (((tickAnim - 560) / 45) * (0-(-13)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers3.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -12.75 + (((tickAnim - 84) / 476) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -12.75 + (((tickAnim - 560) / 45) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers4.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -10 + (((tickAnim - 84) / 476) * (-10-(-10)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -10 + (((tickAnim - 560) / 45) * (0-(-10)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers5, bodyFeathers5.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers5.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0.1 + (((tickAnim - 38) / 5) * (-6.77-(0.1)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -6.77 + (((tickAnim - 43) / 8) * (-22.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*30-(-6.77)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 84) {
            xx = -22.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*30 + (((tickAnim - 51) / 33) * (-21.97331-(-22.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*30)));
            yy = 0 + (((tickAnim - 51) / 33) * (6.92966-(0)));
            zz = 0 + (((tickAnim - 51) / 33) * (1.69342-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -21.97331 + (((tickAnim - 84) / 6) * (-21.93924-(-21.97331)));
            yy = 6.92966 + (((tickAnim - 84) / 6) * (6.24018-(6.92966)));
            zz = 1.69342 + (((tickAnim - 84) / 6) * (1.99055-(1.69342)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = -21.93924 + (((tickAnim - 90) / 87) * (-21.93924-(-21.93924)));
            yy = 6.24018 + (((tickAnim - 90) / 87) * (6.24018-(6.24018)));
            zz = 1.99055 + (((tickAnim - 90) / 87) * (1.99055-(1.99055)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = -21.93924 + (((tickAnim - 177) / 34) * (0-(-21.93924)));
            yy = 6.24018 + (((tickAnim - 177) / 34) * (-4.75-(6.24018)));
            zz = 1.99055 + (((tickAnim - 177) / 34) * (0-(1.99055)));
        }
        else if (tickAnim >= 211 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 211) / 12) * (0.59509-(0)));
            yy = -4.75 + (((tickAnim - 211) / 12) * (3.6533-(-4.75)));
            zz = 0 + (((tickAnim - 211) / 12) * (9.51735-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = 0.59509 + (((tickAnim - 223) / 15) * (0-(0.59509)));
            yy = 3.6533 + (((tickAnim - 223) / 15) * (-4.75-(3.6533)));
            zz = 9.51735 + (((tickAnim - 223) / 15) * (0-(9.51735)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = -4.75 + (((tickAnim - 238) / 1) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 239) / 10) * (0.59509-(0)));
            yy = -4.75 + (((tickAnim - 239) / 10) * (3.6533-(-4.75)));
            zz = 0 + (((tickAnim - 239) / 10) * (9.51735-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 258) {
            xx = 0.59509 + (((tickAnim - 249) / 9) * (0-(0.59509)));
            yy = 3.6533 + (((tickAnim - 249) / 9) * (-4.75-(3.6533)));
            zz = 9.51735 + (((tickAnim - 249) / 9) * (0-(9.51735)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 258) / 22) * (0.6288-(0)));
            yy = -4.75 + (((tickAnim - 258) / 22) * (7.57512-(-4.75)));
            zz = 0 + (((tickAnim - 258) / 22) * (4.79083-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0.6288 + (((tickAnim - 280) / 10) * (-7.51316-(0.6288)));
            yy = 7.57512 + (((tickAnim - 280) / 10) * (-4.69519-(7.57512)));
            zz = 4.79083 + (((tickAnim - 280) / 10) * (12.97618-(4.79083)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = -7.51316 + (((tickAnim - 290) / 14) * (-15.5-(-7.51316)));
            yy = -4.69519 + (((tickAnim - 290) / 14) * (0-(-4.69519)));
            zz = 12.97618 + (((tickAnim - 290) / 14) * (0-(12.97618)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -15.5 + (((tickAnim - 304) / 81) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = -15.5 + (((tickAnim - 385) / 40) * (-20.5-(-15.5)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = -20.5 + (((tickAnim - 425) / 105) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 425) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 105) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -20.5 + (((tickAnim - 530) / 30) * (-15.5-(-20.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = -15.5 + (((tickAnim - 560) / 17) * (-9.75-(-15.5)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -9.75 + (((tickAnim - 577) / 28) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -8.75 + (((tickAnim - 20) / 18) * (-3.63-(-8.75)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -3.63 + (((tickAnim - 38) / 5) * (11.06196-(-3.63)));
            yy = 0 + (((tickAnim - 38) / 5) * (0.69236-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0.45955-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 11.06196 + (((tickAnim - 43) / 7) * (11.0536-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-40-(11.06196)));
            yy = 0.69236 + (((tickAnim - 43) / 7) * (1.48363-(0.69236)));
            zz = 0.45955 + (((tickAnim - 43) / 7) * (0.98475-(0.45955)));
        }
        else if (tickAnim >= 50 && tickAnim < 84) {
            xx = 11.0536-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-40 + (((tickAnim - 50) / 34) * (-19.16526-(11.0536-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-40)));
            yy = 1.48363 + (((tickAnim - 50) / 34) * (8.24239-(1.48363)));
            zz = 0.98475 + (((tickAnim - 50) / 34) * (5.47084-(0.98475)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -19.16526 + (((tickAnim - 84) / 6) * (-19.15482-(-19.16526)));
            yy = 8.24239 + (((tickAnim - 84) / 6) * (8.0712-(8.24239)));
            zz = 5.47084 + (((tickAnim - 84) / 6) * (5.54709-(5.47084)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = -19.15482 + (((tickAnim - 90) / 87) * (-19.15482-(-19.15482)));
            yy = 8.0712 + (((tickAnim - 90) / 87) * (7.4962-(8.0712)));
            zz = 5.54709 + (((tickAnim - 90) / 87) * (5.54709-(5.54709)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = -19.15482 + (((tickAnim - 177) / 34) * (-20.25-(-19.15482)));
            yy = 7.4962 + (((tickAnim - 177) / 34) * (0-(7.4962)));
            zz = 5.54709 + (((tickAnim - 177) / 34) * (0-(5.54709)));
        }
        else if (tickAnim >= 211 && tickAnim < 226) {
            xx = -20.25 + (((tickAnim - 211) / 15) * (-20.3348-(-20.25)));
            yy = 0 + (((tickAnim - 211) / 15) * (-12.1651-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40-(0)));
            zz = 0 + (((tickAnim - 211) / 15) * (-1.08537-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 238) {
            xx = -20.3348 + (((tickAnim - 226) / 12) * (-20.25-(-20.3348)));
            yy = -12.1651-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40 + (((tickAnim - 226) / 12) * (0-(-12.1651-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40)));
            zz = -1.08537 + (((tickAnim - 226) / 12) * (0-(-1.08537)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = -20.25 + (((tickAnim - 238) / 1) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = -20.25 + (((tickAnim - 239) / 14) * (-20.3348-(-20.25)));
            yy = 0 + (((tickAnim - 239) / 14) * (31.7849-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (-1.08537-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = -20.3348 + (((tickAnim - 253) / 5) * (-20.25-(-20.3348)));
            yy = 31.7849-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40 + (((tickAnim - 253) / 5) * (0-(31.7849-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40)));
            zz = -1.08537 + (((tickAnim - 253) / 5) * (0-(-1.08537)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = -20.25 + (((tickAnim - 258) / 22) * (-20.27866-(-20.25)));
            yy = 0 + (((tickAnim - 258) / 22) * (5.2122-(0)));
            zz = 0 + (((tickAnim - 258) / 22) * (-0.62973-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 297) {
            xx = -20.27866 + (((tickAnim - 280) / 17) * (-11.58298-(-20.27866)));
            yy = 5.2122 + (((tickAnim - 280) / 17) * (38.088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(5.2122)));
            zz = -0.62973 + (((tickAnim - 280) / 17) * (1.96174-(-0.62973)));
        }
        else if (tickAnim >= 297 && tickAnim < 304) {
            xx = -11.58298 + (((tickAnim - 297) / 7) * (-10-(-11.58298)));
            yy = 38.088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 297) / 7) * (0-(38.088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = 1.96174 + (((tickAnim - 297) / 7) * (0-(1.96174)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -10 + (((tickAnim - 304) / 81) * (-10-(-10)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = -10 + (((tickAnim - 385) / 40) * (-26.25-(-10)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = -26.25 + (((tickAnim - 425) / 105) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 425) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 105) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -26.25 + (((tickAnim - 530) / 30) * (-10-(-26.25)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = -10 + (((tickAnim - 560) / 17) * (-18.5-(-10)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -18.5 + (((tickAnim - 577) / 28) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 20) / 18) * (-5.52173-(-2)));
            yy = 0 + (((tickAnim - 20) / 18) * (-0.57191-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0.61192-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = -5.52173 + (((tickAnim - 38) / 13) * (-18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*20-(-5.52173)));
            yy = -0.57191 + (((tickAnim - 38) / 13) * (0-(-0.57191)));
            zz = 0.61192 + (((tickAnim - 38) / 13) * (0-(0.61192)));
        }
        else if (tickAnim >= 51 && tickAnim < 84) {
            xx = -18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*20 + (((tickAnim - 51) / 33) * (-4.1785-(-18.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*20)));
            yy = 0 + (((tickAnim - 51) / 33) * (11.22676-(0)));
            zz = 0 + (((tickAnim - 51) / 33) * (0.72749-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -4.1785 + (((tickAnim - 84) / 6) * (-4.15709-(-4.1785)));
            yy = 11.22676 + (((tickAnim - 84) / 6) * (11.16947-(11.22676)));
            zz = 0.72749 + (((tickAnim - 84) / 6) * (0.83394-(0.72749)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = -4.15709 + (((tickAnim - 90) / 87) * (-4.15709-(-4.15709)));
            yy = 11.16947 + (((tickAnim - 90) / 87) * (11.96947-(11.16947)));
            zz = 0.83394 + (((tickAnim - 90) / 87) * (0.83394-(0.83394)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = -4.15709 + (((tickAnim - 177) / 34) * (-14.75158-(-4.15709)));
            yy = 11.96947 + (((tickAnim - 177) / 34) * (1.99796-(11.96947)));
            zz = 0.83394 + (((tickAnim - 177) / 34) * (-0.09041-(0.83394)));
        }
        else if (tickAnim >= 211 && tickAnim < 226) {
            xx = -14.75158 + (((tickAnim - 211) / 15) * (-14.79159-(-14.75158)));
            yy = 1.99796 + (((tickAnim - 211) / 15) * (-30.6764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(1.99796)));
            zz = -0.09041 + (((tickAnim - 211) / 15) * (-0.46401-(-0.09041)));
        }
        else if (tickAnim >= 226 && tickAnim < 238) {
            xx = -14.79159 + (((tickAnim - 226) / 12) * (-14.75158-(-14.79159)));
            yy = -30.6764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 226) / 12) * (1.99796-(-30.6764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = -0.46401 + (((tickAnim - 226) / 12) * (-0.09041-(-0.46401)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = -14.75158 + (((tickAnim - 238) / 1) * (-14.75158-(-14.75158)));
            yy = 1.99796 + (((tickAnim - 238) / 1) * (1.99796-(1.99796)));
            zz = -0.09041 + (((tickAnim - 238) / 1) * (-0.09041-(-0.09041)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = -14.75158 + (((tickAnim - 239) / 14) * (-14.79159-(-14.75158)));
            yy = 1.99796 + (((tickAnim - 239) / 14) * (9.2236-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(1.99796)));
            zz = -0.09041 + (((tickAnim - 239) / 14) * (-0.46401-(-0.09041)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = -14.79159 + (((tickAnim - 253) / 5) * (-14.75158-(-14.79159)));
            yy = 9.2236-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 253) / 5) * (1.99796-(9.2236-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = -0.46401 + (((tickAnim - 253) / 5) * (-0.09041-(-0.46401)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = -14.75158 + (((tickAnim - 258) / 22) * (-1.0881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(-14.75158)));
            yy = 1.99796 + (((tickAnim - 258) / 22) * (14.73459-(1.99796)));
            zz = -0.09041 + (((tickAnim - 258) / 22) * (-0.68163-(-0.09041)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -1.0881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 280) / 10) * (0.86115-(-1.0881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 14.73459 + (((tickAnim - 280) / 10) * (0.23183-(14.73459)));
            zz = -0.68163 + (((tickAnim - 280) / 10) * (4.33883-(-0.68163)));
        }
        else if (tickAnim >= 290 && tickAnim < 296) {
            xx = 0.86115 + (((tickAnim - 290) / 6) * (2.41303-(0.86115)));
            yy = 0.23183 + (((tickAnim - 290) / 6) * (41.7133-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(0.23183)));
            zz = 4.33883 + (((tickAnim - 290) / 6) * (0.50777-(4.33883)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = 2.41303 + (((tickAnim - 296) / 8) * (0-(2.41303)));
            yy = 41.7133-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 296) / 8) * (0-(41.7133-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = 0.50777 + (((tickAnim - 296) / 8) * (0-(0.50777)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 385) / 40) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = -6.5 + (((tickAnim - 425) / 15) * (-11.5-(-6.5)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = -11.5 + (((tickAnim - 440) / 90) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -11.5 + (((tickAnim - 530) / 30) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 0 + (((tickAnim - 560) / 17) * (-8-(0)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -8 + (((tickAnim - 577) / 28) * (0-(-8)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (36.425-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 36.425 + (((tickAnim - 38) / 10) * (-5.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*50-(36.425)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 84) {
            xx = -5.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*50 + (((tickAnim - 48) / 36) * (32.01204-(-5.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*50)));
            yy = 0 + (((tickAnim - 48) / 36) * (3.85577-(0)));
            zz = 0 + (((tickAnim - 48) / 36) * (0.71436-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 32.01204 + (((tickAnim - 84) / 6) * (32.05735-(32.01204)));
            yy = 3.85577 + (((tickAnim - 84) / 6) * (5.24355-(3.85577)));
            zz = 0.71436 + (((tickAnim - 84) / 6) * (1.28544-(0.71436)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = 32.05735 + (((tickAnim - 90) / 87) * (32.05735-(32.05735)));
            yy = 5.24355 + (((tickAnim - 90) / 87) * (5.24355-(5.24355)));
            zz = 1.28544 + (((tickAnim - 90) / 87) * (1.28544-(1.28544)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = 32.05735 + (((tickAnim - 177) / 34) * (0-(32.05735)));
            yy = 5.24355 + (((tickAnim - 177) / 34) * (0-(5.24355)));
            zz = 1.28544 + (((tickAnim - 177) / 34) * (0-(1.28544)));
        }
        else if (tickAnim >= 211 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 211) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 211) / 15) * (-35.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50-(0)));
            zz = 0 + (((tickAnim - 211) / 15) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 226) / 12) * (0-(0)));
            yy = -35.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 226) / 12) * (0-(-35.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            zz = 0 + (((tickAnim - 226) / 12) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 14) * (-2.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 253) / 5) * (0-(0)));
            yy = -2.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30 + (((tickAnim - 253) / 5) * (0-(-2.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30)));
            zz = 0 + (((tickAnim - 253) / 5) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 258) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 258) / 22) * (9.25-(0)));
            zz = 0 + (((tickAnim - 258) / 22) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 280) / 3) * (9.19671-(0)));
            yy = 9.25 + (((tickAnim - 280) / 3) * (16.33901-(9.25)));
            zz = 0 + (((tickAnim - 280) / 3) * (2.96484-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 290) {
            xx = 9.19671 + (((tickAnim - 283) / 7) * (21.50069-(9.19671)));
            yy = 16.33901 + (((tickAnim - 283) / 7) * (3.62527-(16.33901)));
            zz = 2.96484 + (((tickAnim - 283) / 7) * (7.1248-(2.96484)));
        }
        else if (tickAnim >= 290 && tickAnim < 296) {
            xx = 21.50069 + (((tickAnim - 290) / 6) * (21.61376-(21.50069)));
            yy = 3.62527 + (((tickAnim - 290) / 6) * (7.7792-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50-(3.62527)));
            zz = 7.1248 + (((tickAnim - 290) / 6) * (2.03891-(7.1248)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = 21.61376 + (((tickAnim - 296) / 8) * (21.5-(21.61376)));
            yy = 7.7792-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50 + (((tickAnim - 296) / 8) * (0-(7.7792-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50)));
            zz = 2.03891 + (((tickAnim - 296) / 8) * (0-(2.03891)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 21.5 + (((tickAnim - 304) / 81) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 21.5 + (((tickAnim - 385) / 40) * (23.5-(21.5)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = 23.5 + (((tickAnim - 425) / 15) * (21.5-(23.5)));
            yy = 0 + (((tickAnim - 425) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 15) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = 21.5 + (((tickAnim - 440) / 90) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 440) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 90) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 21.5 + (((tickAnim - 530) / 30) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 21.5 + (((tickAnim - 560) / 17) * (13.25-(21.5)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 13.25 + (((tickAnim - 577) / 28) * (0-(13.25)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 22.75 + (((tickAnim - 42) / 1) * (35.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30-(22.75)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 84) {
            xx = 35.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30 + (((tickAnim - 43) / 41) * (22.25-(35.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30)));
            yy = 0 + (((tickAnim - 43) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 41) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 22.25 + (((tickAnim - 84) / 6) * (22.25049-(22.25)));
            yy = 0 + (((tickAnim - 84) / 6) * (2.99994-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0.01887-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = 22.25049 + (((tickAnim - 90) / 87) * (22.25049-(22.25049)));
            yy = 2.99994 + (((tickAnim - 90) / 87) * (2.99994-(2.99994)));
            zz = 0.01887 + (((tickAnim - 90) / 87) * (0.01887-(0.01887)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = 22.25049 + (((tickAnim - 177) / 34) * (0-(22.25049)));
            yy = 2.99994 + (((tickAnim - 177) / 34) * (0-(2.99994)));
            zz = 0.01887 + (((tickAnim - 177) / 34) * (0-(0.01887)));
        }
        else if (tickAnim >= 211 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 211) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 211) / 15) * (-7.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-50-(0)));
            zz = 0 + (((tickAnim - 211) / 15) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 226) / 12) * (0-(0)));
            yy = -7.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-50 + (((tickAnim - 226) / 12) * (0-(-7.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-50)));
            zz = 0 + (((tickAnim - 226) / 12) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 14) * (19.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*50-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 253) / 5) * (0-(0)));
            yy = 19.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*50 + (((tickAnim - 253) / 5) * (0-(19.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*50)));
            zz = 0 + (((tickAnim - 253) / 5) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 266) {
            xx = 0 + (((tickAnim - 258) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 258) / 8) * (-19.5-(0)));
            zz = 0 + (((tickAnim - 258) / 8) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 266) / 14) * (0-(0)));
            yy = -19.5 + (((tickAnim - 266) / 14) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 266) / 14) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 280) / 3) * (7.15863-(0)));
            yy = 0 + (((tickAnim - 280) / 3) * (-140.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150-(0)));
            zz = 0 + (((tickAnim - 280) / 3) * (0.13955-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 296) {
            xx = 7.15863 + (((tickAnim - 283) / 13) * (20.61141-(7.15863)));
            yy = -140.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150 + (((tickAnim - 283) / 13) * (40.5086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(-140.1789-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150)));
            zz = 0.13955 + (((tickAnim - 283) / 13) * (4.95286-(0.13955)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = 20.61141 + (((tickAnim - 296) / 8) * (25-(20.61141)));
            yy = 40.5086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 296) / 8) * (0-(40.5086-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = 4.95286 + (((tickAnim - 296) / 8) * (0-(4.95286)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 25 + (((tickAnim - 304) / 81) * (25-(25)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 25 + (((tickAnim - 385) / 40) * (36.5-(25)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = 36.5 + (((tickAnim - 425) / 105) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 425) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 105) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 36.5 + (((tickAnim - 530) / 30) * (25-(36.5)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 25 + (((tickAnim - 560) / 17) * (37.46773-(25)));
            yy = 0 + (((tickAnim - 560) / 17) * (4.12713-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (-4.55983-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 37.46773 + (((tickAnim - 577) / 28) * (0-(37.46773)));
            yy = 4.12713 + (((tickAnim - 577) / 28) * (0-(4.12713)));
            zz = -4.55983 + (((tickAnim - 577) / 28) * (0-(-4.55983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 17.75 + (((tickAnim - 42) / 1) * (66.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(17.75)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 84) {
            xx = 66.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 43) / 41) * (17.75-(66.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 43) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 41) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 17.75 + (((tickAnim - 84) / 6) * (17.75415-(17.75)));
            yy = 0 + (((tickAnim - 84) / 6) * (2.49273-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0.19061-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 177) {
            xx = 17.75415 + (((tickAnim - 90) / 87) * (17.75415-(17.75415)));
            yy = 2.49273 + (((tickAnim - 90) / 87) * (2.49273-(2.49273)));
            zz = 0.19061 + (((tickAnim - 90) / 87) * (0.19061-(0.19061)));
        }
        else if (tickAnim >= 177 && tickAnim < 211) {
            xx = 17.75415 + (((tickAnim - 177) / 34) * (0-(17.75415)));
            yy = 2.49273 + (((tickAnim - 177) / 34) * (0-(2.49273)));
            zz = 0.19061 + (((tickAnim - 177) / 34) * (0-(0.19061)));
        }
        else if (tickAnim >= 211 && tickAnim < 226) {
            xx = 0 + (((tickAnim - 211) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 211) / 15) * (65.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-100-(0)));
            zz = 0 + (((tickAnim - 211) / 15) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 226) / 12) * (0-(0)));
            yy = 65.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-100 + (((tickAnim - 226) / 12) * (0-(65.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-100)));
            zz = 0 + (((tickAnim - 226) / 12) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 238) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 1) * (0-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 239) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 239) / 14) * (79.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100-(0)));
            zz = 0 + (((tickAnim - 239) / 14) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 253) / 5) * (0-(0)));
            yy = 79.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100 + (((tickAnim - 253) / 5) * (-13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-50-(79.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100)));
            zz = 0 + (((tickAnim - 253) / 5) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 258) / 22) * (11.76336-(0)));
            yy = -13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-50 + (((tickAnim - 258) / 22) * (41.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(-13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-50)));
            zz = 0 + (((tickAnim - 258) / 22) * (4.62803-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 283) {
            xx = 11.76336 + (((tickAnim - 280) / 3) * (14.53454-(11.76336)));
            yy = 41.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 280) / 3) * (-140.7026-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150-(41.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            zz = 4.62803 + (((tickAnim - 280) / 3) * (4.95393-(4.62803)));
        }
        else if (tickAnim >= 283 && tickAnim < 296) {
            xx = 14.53454 + (((tickAnim - 283) / 13) * (17.8359-(14.53454)));
            yy = -140.7026-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150 + (((tickAnim - 283) / 13) * (88.1984-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-100-(-140.7026-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*150)));
            zz = 4.95393 + (((tickAnim - 283) / 13) * (2.36492-(4.95393)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = 17.8359 + (((tickAnim - 296) / 8) * (17-(17.8359)));
            yy = 88.1984-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-100 + (((tickAnim - 296) / 8) * (0-(88.1984-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-100)));
            zz = 2.36492 + (((tickAnim - 296) / 8) * (0-(2.36492)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 17 + (((tickAnim - 304) / 81) * (17-(17)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 530) {
            xx = 17 + (((tickAnim - 385) / 145) * (17-(17)));
            yy = 0 + (((tickAnim - 385) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 145) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 17 + (((tickAnim - 530) / 30) * (17-(17)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 577) {
            xx = 17 + (((tickAnim - 560) / 17) * (24.75-(17)));
            yy = 0 + (((tickAnim - 560) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 17) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 24.75 + (((tickAnim - 577) / 28) * (0-(24.75)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -8.75 + (((tickAnim - 84) / 476) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -8.75 + (((tickAnim - 560) / 45) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(xx), tailFeathers.rotateAngleY + (float) Math.toRadians(yy), tailFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 560) {
            xx = -5.75 + (((tickAnim - 84) / 476) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 84) / 476) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 476) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = -5.75 + (((tickAnim - 560) / 45) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeathers2, tailFeathers2.rotateAngleX + (float) Math.toRadians(xx), tailFeathers2.rotateAngleY + (float) Math.toRadians(yy), tailFeathers2.rotateAngleZ + (float) Math.toRadians(zz));
        animSandHelper(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, animTick, tickAnim, xx, yy, zz);

    }

    public void animSandHelper(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick, double tickAnim, double xx, double yy, double zz) {

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.09389-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (8.98143-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.24948-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.09389 + (((tickAnim - 10) / 10) * (-9.68777-(-13.09389)));
            yy = 8.98143 + (((tickAnim - 10) / 10) * (17.96286-(8.98143)));
            zz = 3.24948 + (((tickAnim - 10) / 10) * (6.49897-(3.24948)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -9.68777 + (((tickAnim - 20) / 23) * (1.52496-(-9.68777)));
            yy = 17.96286 + (((tickAnim - 20) / 23) * (18.03723-(17.96286)));
            zz = 6.49897 + (((tickAnim - 20) / 23) * (11.23003-(6.49897)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 1.52496 + (((tickAnim - 43) / 27) * (-54.22504-(1.52496)));
            yy = 18.03723 + (((tickAnim - 43) / 27) * (18.03723-(18.03723)));
            zz = 11.23003 + (((tickAnim - 43) / 27) * (11.23003-(11.23003)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -54.22504 + (((tickAnim - 70) / 14) * (-59.72504-(-54.22504)));
            yy = 18.03723 + (((tickAnim - 70) / 14) * (18.03723-(18.03723)));
            zz = 11.23003 + (((tickAnim - 70) / 14) * (11.23003-(11.23003)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = -59.72504 + (((tickAnim - 84) / 84) * (-59.72504-(-59.72504)));
            yy = 18.03723 + (((tickAnim - 84) / 84) * (18.03723-(18.03723)));
            zz = 11.23003 + (((tickAnim - 84) / 84) * (11.23003-(11.23003)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = -59.72504 + (((tickAnim - 168) / 10) * (-28.0878-(-59.72504)));
            yy = 18.03723 + (((tickAnim - 168) / 10) * (19.80451-(18.03723)));
            zz = 11.23003 + (((tickAnim - 168) / 10) * (22.55564-(11.23003)));
        }
        else if (tickAnim >= 178 && tickAnim < 203) {
            xx = -28.0878 + (((tickAnim - 178) / 25) * (-29-(-28.0878)));
            yy = 19.80451 + (((tickAnim - 178) / 25) * (0-(19.80451)));
            zz = 22.55564 + (((tickAnim - 178) / 25) * (0-(22.55564)));
        }
        else if (tickAnim >= 203 && tickAnim < 211) {
            xx = -29 + (((tickAnim - 203) / 8) * (-28.21136-(-29)));
            yy = 0 + (((tickAnim - 203) / 8) * (-5.77155-(0)));
            zz = 0 + (((tickAnim - 203) / 8) * (0.30679-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 216) {
            xx = -28.21136 + (((tickAnim - 211) / 5) * (-28.21136-(-28.21136)));
            yy = -5.77155 + (((tickAnim - 211) / 5) * (-5.77155-(-5.77155)));
            zz = 0.30679 + (((tickAnim - 211) / 5) * (0.30679-(0.30679)));
        }
        else if (tickAnim >= 216 && tickAnim < 231) {
            xx = -28.21136 + (((tickAnim - 216) / 15) * (-29-(-28.21136)));
            yy = -5.77155 + (((tickAnim - 216) / 15) * (0-(-5.77155)));
            zz = 0.30679 + (((tickAnim - 216) / 15) * (0-(0.30679)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -29 + (((tickAnim - 231) / 1) * (-29-(-29)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = -29 + (((tickAnim - 232) / 11) * (-22.5711-(-29)));
            yy = 0 + (((tickAnim - 232) / 11) * (-7.68115-(0)));
            zz = 0 + (((tickAnim - 232) / 11) * (-5.15474-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = -22.5711 + (((tickAnim - 243) / 15) * (-29-(-22.5711)));
            yy = -7.68115 + (((tickAnim - 243) / 15) * (0-(-7.68115)));
            zz = -5.15474 + (((tickAnim - 243) / 15) * (0-(-5.15474)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = -29 + (((tickAnim - 258) / 22) * (-27.75364-(-29)));
            yy = 0 + (((tickAnim - 258) / 22) * (-4.84508-(0)));
            zz = 0 + (((tickAnim - 258) / 22) * (23.18519-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 293) {
            xx = -27.75364 + (((tickAnim - 280) / 13) * (-65.4289-(-27.75364)));
            yy = -4.84508 + (((tickAnim - 280) / 13) * (15.86353-(-4.84508)));
            zz = 23.18519 + (((tickAnim - 280) / 13) * (21.41824-(23.18519)));
        }
        else if (tickAnim >= 293 && tickAnim < 304) {
            xx = -65.4289 + (((tickAnim - 293) / 11) * (-43.38833-(-65.4289)));
            yy = 15.86353 + (((tickAnim - 293) / 11) * (26.55382-(15.86353)));
            zz = 21.41824 + (((tickAnim - 293) / 11) * (12.75575-(21.41824)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -43.38833 + (((tickAnim - 304) / 81) * (-43.38833-(-43.38833)));
            yy = 26.55382 + (((tickAnim - 304) / 81) * (26.55382-(26.55382)));
            zz = 12.75575 + (((tickAnim - 304) / 81) * (12.75575-(12.75575)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = -43.38833 + (((tickAnim - 385) / 40) * (-58.77469-(-43.38833)));
            yy = 26.55382 + (((tickAnim - 385) / 40) * (26.55382-(26.55382)));
            zz = 12.75575 + (((tickAnim - 385) / 40) * (12.75575-(12.75575)));
        }
        else if (tickAnim >= 425 && tickAnim < 440) {
            xx = -58.77469 + (((tickAnim - 425) / 15) * (-62.13833-(-58.77469)));
            yy = 26.55382 + (((tickAnim - 425) / 15) * (26.55382-(26.55382)));
            zz = 12.75575 + (((tickAnim - 425) / 15) * (12.75575-(12.75575)));
        }
        else if (tickAnim >= 440 && tickAnim < 530) {
            xx = -62.13833 + (((tickAnim - 440) / 90) * (-62.13833-(-62.13833)));
            yy = 26.55382 + (((tickAnim - 440) / 90) * (26.55382-(26.55382)));
            zz = 12.75575 + (((tickAnim - 440) / 90) * (12.75575-(12.75575)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -62.13833 + (((tickAnim - 530) / 30) * (-43.38833-(-62.13833)));
            yy = 26.55382 + (((tickAnim - 530) / 30) * (26.55382-(26.55382)));
            zz = 12.75575 + (((tickAnim - 530) / 30) * (12.75575-(12.75575)));
        }
        else if (tickAnim >= 560 && tickAnim < 568) {
            xx = -43.38833 + (((tickAnim - 560) / 8) * (-50.54067-(-43.38833)));
            yy = 26.55382 + (((tickAnim - 560) / 8) * (10.78018-(26.55382)));
            zz = 12.75575 + (((tickAnim - 560) / 8) * (3.51678-(12.75575)));
        }
        else if (tickAnim >= 568 && tickAnim < 577) {
            xx = -50.54067 + (((tickAnim - 568) / 9) * (-25.97358-(-50.54067)));
            yy = 10.78018 + (((tickAnim - 568) / 9) * (-0.97628-(10.78018)));
            zz = 3.51678 + (((tickAnim - 568) / 9) * (-3.10005-(3.51678)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -25.97358 + (((tickAnim - 577) / 28) * (0-(-25.97358)));
            yy = -0.97628 + (((tickAnim - 577) / 28) * (0-(-0.97628)));
            zz = -3.10005 + (((tickAnim - 577) / 28) * (0-(-3.10005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 168) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 168) / 35) * (2.1-(0)));
            yy = 0 + (((tickAnim - 168) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 35) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 2.1 + (((tickAnim - 203) / 28) * (2.1-(2.1)));
            yy = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 28) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 2.1 + (((tickAnim - 231) / 1) * (2.1-(2.1)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 2.1 + (((tickAnim - 232) / 26) * (2.1-(2.1)));
            yy = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 26) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 280) {
            xx = 2.1 + (((tickAnim - 258) / 22) * (4.1-(2.1)));
            yy = 0 + (((tickAnim - 258) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 22) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 4.1 + (((tickAnim - 280) / 24) * (0-(4.1)));
            yy = 0 + (((tickAnim - 280) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 24) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (21.87-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 21.87 + (((tickAnim - 4) / 6) * (28.5-(21.87)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.5 + (((tickAnim - 10) / 10) * (15.75-(28.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 15.75 + (((tickAnim - 20) / 23) * (24.5-(15.75)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 24.5 + (((tickAnim - 43) / 27) * (58-(24.5)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 168) {
            xx = 58 + (((tickAnim - 70) / 98) * (58-(58)));
            yy = 0 + (((tickAnim - 70) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 98) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 58 + (((tickAnim - 168) / 10) * (58-(58)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 181) {
            xx = 58 + (((tickAnim - 178) / 3) * (66.6756-(58)));
            yy = 0 + (((tickAnim - 178) / 3) * (3.68239-(0)));
            zz = 0 + (((tickAnim - 178) / 3) * (-17.16903-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 185) {
            xx = 66.6756 + (((tickAnim - 181) / 4) * (46.26561-(66.6756)));
            yy = 3.68239 + (((tickAnim - 181) / 4) * (8.47408-(3.68239)));
            zz = -17.16903 + (((tickAnim - 181) / 4) * (-52.15759-(-17.16903)));
        }
        else if (tickAnim >= 185 && tickAnim < 203) {
            xx = 46.26561 + (((tickAnim - 185) / 18) * (46-(46.26561)));
            yy = 8.47408 + (((tickAnim - 185) / 18) * (0-(8.47408)));
            zz = -52.15759 + (((tickAnim - 185) / 18) * (0-(-52.15759)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 46 + (((tickAnim - 203) / 28) * (16-(46)));
            yy = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 28) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 16 + (((tickAnim - 231) / 1) * (16-(16)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 16 + (((tickAnim - 232) / 26) * (16-(16)));
            yy = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 26) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 270) {
            xx = 16 + (((tickAnim - 258) / 12) * (30.16643-(16)));
            yy = 0 + (((tickAnim - 258) / 12) * (2.08826-(0)));
            zz = 0 + (((tickAnim - 258) / 12) * (-2.46704-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 30.16643 + (((tickAnim - 270) / 10) * (42.3448-(30.16643)));
            yy = 2.08826 + (((tickAnim - 270) / 10) * (3.8782-(2.08826)));
            zz = -2.46704 + (((tickAnim - 270) / 10) * (-4.58166-(-2.46704)));
        }
        else if (tickAnim >= 280 && tickAnim < 286) {
            xx = 42.3448 + (((tickAnim - 280) / 6) * (35.55674-(42.3448)));
            yy = 3.8782 + (((tickAnim - 280) / 6) * (31.98609-(3.8782)));
            zz = -4.58166 + (((tickAnim - 280) / 6) * (-43.00866-(-4.58166)));
        }
        else if (tickAnim >= 286 && tickAnim < 289) {
            xx = 35.55674 + (((tickAnim - 286) / 3) * (45.67342-(35.55674)));
            yy = 31.98609 + (((tickAnim - 286) / 3) * (41.26309-(31.98609)));
            zz = -43.00866 + (((tickAnim - 286) / 3) * (-31.46683-(-43.00866)));
        }
        else if (tickAnim >= 289 && tickAnim < 296) {
            xx = 45.67342 + (((tickAnim - 289) / 7) * (62.86475-(45.67342)));
            yy = 41.26309 + (((tickAnim - 289) / 7) * (1.87223-(41.26309)));
            zz = -31.46683 + (((tickAnim - 289) / 7) * (-2.21183-(-31.46683)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = 62.86475 + (((tickAnim - 296) / 8) * (30.25-(62.86475)));
            yy = 1.87223 + (((tickAnim - 296) / 8) * (0-(1.87223)));
            zz = -2.21183 + (((tickAnim - 296) / 8) * (0-(-2.21183)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = 30.25 + (((tickAnim - 304) / 81) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = 30.25 + (((tickAnim - 385) / 40) * (46.25-(30.25)));
            yy = 0 + (((tickAnim - 385) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = 46.25 + (((tickAnim - 425) / 105) * (46.25-(46.25)));
            yy = 0 + (((tickAnim - 425) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 105) * (0-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = 46.25 + (((tickAnim - 530) / 30) * (46.25-(46.25)));
            yy = 0 + (((tickAnim - 530) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 530) / 30) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 568) {
            xx = 46.25 + (((tickAnim - 560) / 8) * (52.75-(46.25)));
            yy = 0 + (((tickAnim - 560) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 8) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 577) {
            xx = 52.75 + (((tickAnim - 568) / 9) * (41.75-(52.75)));
            yy = 0 + (((tickAnim - 568) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 9) * (0-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = 41.75 + (((tickAnim - 577) / 28) * (0-(41.75)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 168) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (4.075-(0)));
            yy = 0 + (((tickAnim - 178) / 7) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 203) {
            xx = 4.075 + (((tickAnim - 185) / 18) * (0-(4.075)));
            yy = -0.725 + (((tickAnim - 185) / 18) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 185) / 18) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 28) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 232) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 26) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 286) {
            xx = 0 + (((tickAnim - 258) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 258) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 28) * (0-(0)));
        }
        else if (tickAnim >= 286 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 286) / 7) * (0.7-(0)));
            yy = 0 + (((tickAnim - 286) / 7) * (-0.59-(0)));
            zz = 0 + (((tickAnim - 286) / 7) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 296) {
            xx = 0.7 + (((tickAnim - 293) / 3) * (0-(0.7)));
            yy = -0.59 + (((tickAnim - 293) / 3) * (-0.65-(-0.59)));
            zz = 0 + (((tickAnim - 293) / 3) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 296) / 89) * (0-(0)));
            yy = -0.65 + (((tickAnim - 296) / 89) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 296) / 89) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 385) / 175) * (0-(0)));
            yy = -0.65 + (((tickAnim - 385) / 175) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 385) / 175) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 560) / 45) * (0-(0)));
            yy = -0.65 + (((tickAnim - 560) / 45) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 560) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39.56-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39.56 + (((tickAnim - 10) / 10) * (-28.25-(-39.56)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -28.25 + (((tickAnim - 20) / 23) * (-67.75-(-28.25)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -67.75 + (((tickAnim - 43) / 0) * (-76.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*20-(-67.75)));
            yy = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 0) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 84) {
            xx = -76.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*20 + (((tickAnim - 43) / 41) * (-74.34788-(-76.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*20)));
            yy = 0 + (((tickAnim - 43) / 41) * (-3.03873-(0)));
            zz = 0 + (((tickAnim - 43) / 41) * (-6.03063-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 168) {
            xx = -74.34788 + (((tickAnim - 84) / 84) * (-74.34788-(-74.34788)));
            yy = -3.03873 + (((tickAnim - 84) / 84) * (-3.03873-(-3.03873)));
            zz = -6.03063 + (((tickAnim - 84) / 84) * (-6.03063-(-6.03063)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = -74.34788 + (((tickAnim - 168) / 5) * (-75.12306-(-74.34788)));
            yy = -3.03873 + (((tickAnim - 168) / 5) * (-2.78504-(-3.03873)));
            zz = -6.03063 + (((tickAnim - 168) / 5) * (-5.52715-(-6.03063)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = -75.12306 + (((tickAnim - 173) / 5) * (-86.50338-(-75.12306)));
            yy = -2.78504 + (((tickAnim - 173) / 5) * (-2.4806-(-2.78504)));
            zz = -5.52715 + (((tickAnim - 173) / 5) * (-4.92297-(-5.52715)));
        }
        else if (tickAnim >= 178 && tickAnim < 180) {
            xx = -86.50338 + (((tickAnim - 178) / 2) * (-111.35819-(-86.50338)));
            yy = -2.4806 + (((tickAnim - 178) / 2) * (25.38464-(-2.4806)));
            zz = -4.92297 + (((tickAnim - 178) / 2) * (16.72867-(-4.92297)));
        }
        else if (tickAnim >= 180 && tickAnim < 203) {
            xx = -111.35819 + (((tickAnim - 180) / 23) * (-57.5-(-111.35819)));
            yy = 25.38464 + (((tickAnim - 180) / 23) * (0-(25.38464)));
            zz = 16.72867 + (((tickAnim - 180) / 23) * (0-(16.72867)));
        }
        else if (tickAnim >= 203 && tickAnim < 231) {
            xx = -57.5 + (((tickAnim - 203) / 28) * (-19.5-(-57.5)));
            yy = 0 + (((tickAnim - 203) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 28) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 232) {
            xx = -19.5 + (((tickAnim - 231) / 1) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 231) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 1) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 243) {
            xx = -19.5 + (((tickAnim - 232) / 11) * (-59.5-(-19.5)));
            yy = 0 + (((tickAnim - 232) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 11) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = -59.5 + (((tickAnim - 243) / 15) * (-19.5-(-59.5)));
            yy = 0 + (((tickAnim - 243) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 15) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 270) {
            xx = -19.5 + (((tickAnim - 258) / 12) * (-42-(-19.5)));
            yy = 0 + (((tickAnim - 258) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 12) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = -42 + (((tickAnim - 270) / 10) * (-48.25-(-42)));
            yy = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 286) {
            xx = -48.25 + (((tickAnim - 280) / 6) * (-73.40618-(-48.25)));
            yy = 0 + (((tickAnim - 280) / 6) * (-0.00002-(0)));
            zz = 0 + (((tickAnim - 280) / 6) * (16-(0)));
        }
        else if (tickAnim >= 286 && tickAnim < 296) {
            xx = -73.40618 + (((tickAnim - 286) / 10) * (-68.80803-(-73.40618)));
            yy = -0.00002 + (((tickAnim - 286) / 10) * (0.7074-(-0.00002)));
            zz = 16 + (((tickAnim - 286) / 10) * (6.65386-(16)));
        }
        else if (tickAnim >= 296 && tickAnim < 304) {
            xx = -68.80803 + (((tickAnim - 296) / 8) * (-57.5-(-68.80803)));
            yy = 0.7074 + (((tickAnim - 296) / 8) * (0-(0.7074)));
            zz = 6.65386 + (((tickAnim - 296) / 8) * (0-(6.65386)));
        }
        else if (tickAnim >= 304 && tickAnim < 385) {
            xx = -57.5 + (((tickAnim - 304) / 81) * (-57.5-(-57.5)));
            yy = 0 + (((tickAnim - 304) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 81) * (0-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 425) {
            xx = -57.5 + (((tickAnim - 385) / 40) * (-72.96064-(-57.5)));
            yy = 0 + (((tickAnim - 385) / 40) * (-3.42042-(0)));
            zz = 0 + (((tickAnim - 385) / 40) * (-9.66822-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 530) {
            xx = -72.96064 + (((tickAnim - 425) / 105) * (-72.96064-(-72.96064)));
            yy = -3.42042 + (((tickAnim - 425) / 105) * (-3.42042-(-3.42042)));
            zz = -9.66822 + (((tickAnim - 425) / 105) * (-9.66822-(-9.66822)));
        }
        else if (tickAnim >= 530 && tickAnim < 560) {
            xx = -72.96064 + (((tickAnim - 530) / 30) * (-71.23146-(-72.96064)));
            yy = -3.42042 + (((tickAnim - 530) / 30) * (-0.73002-(-3.42042)));
            zz = -9.66822 + (((tickAnim - 530) / 30) * (-2.9099-(-9.66822)));
        }
        else if (tickAnim >= 560 && tickAnim < 568) {
            xx = -71.23146 + (((tickAnim - 560) / 8) * (-69.61573-(-71.23146)));
            yy = -0.73002 + (((tickAnim - 560) / 8) * (-0.36501-(-0.73002)));
            zz = -2.9099 + (((tickAnim - 560) / 8) * (-1.45495-(-2.9099)));
        }
        else if (tickAnim >= 568 && tickAnim < 577) {
            xx = -69.61573 + (((tickAnim - 568) / 9) * (-56.75-(-69.61573)));
            yy = -0.36501 + (((tickAnim - 568) / 9) * (0-(-0.36501)));
            zz = -1.45495 + (((tickAnim - 568) / 9) * (0-(-1.45495)));
        }
        else if (tickAnim >= 577 && tickAnim < 605) {
            xx = -56.75 + (((tickAnim - 577) / 28) * (0-(-56.75)));
            yy = 0 + (((tickAnim - 577) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 577) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 10) / 10) * (-0.975-(-0.725)));
            zz = 1.15 + (((tickAnim - 10) / 10) * (0-(1.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 20) / -20) * (-(0)));
            yy = -0.975 + (((tickAnim - 20) / -20) * (-(-0.975)));
            zz = 0 + (((tickAnim - 20) / -20) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -3.375 + (((tickAnim - 43) / -43) * (-(-3.375)));
            zz = 0.65 + (((tickAnim - 43) / -43) * (-(0.65)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -3.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-4 + (((tickAnim - 43) / -43) * (-(-3.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-4)));
            zz = 0.65 + (((tickAnim - 43) / -43) * (-(0.65)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 70) / -70) * (-(0)));
            yy = -19.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-10))*20 + (((tickAnim - 70) / -70) * (-(-19.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-10))*20)));
            zz = 1.45 + (((tickAnim - 70) / -70) * (-(1.45)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 84) / -84) * (-(0)));
            yy = -1.9 + (((tickAnim - 84) / -84) * (-(-1.9)));
            zz = 1.45 + (((tickAnim - 84) / -84) * (-(1.45)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = -1.9 + (((tickAnim - 168) / -168) * (-(-1.9)));
            zz = 1.45 + (((tickAnim - 168) / -168) * (-(1.45)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 203) / -203) * (-(0)));
            yy = -1.375 + (((tickAnim - 203) / -203) * (-(-1.375)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 231) / -231) * (-(0)));
            yy = 0 + (((tickAnim - 231) / -231) * (-(0)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 232) / -232) * (-(0)));
            yy = 0 + (((tickAnim - 232) / -232) * (-(0)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 243) / -243) * (-(0)));
            yy = -1 + (((tickAnim - 243) / -243) * (-(-1)));
            zz = 0 + (((tickAnim - 243) / -243) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 258) / -258) * (-(0)));
            yy = 0 + (((tickAnim - 258) / -258) * (-(0)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 286 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 286) / -286) * (-(0)));
            yy = 2.325 + (((tickAnim - 286) / -286) * (-(2.325)));
            zz = 0.97 + (((tickAnim - 286) / -286) * (-(0.97)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 1.4 + (((tickAnim - 304) / -304) * (-(1.4)));
            zz = 2 + (((tickAnim - 304) / -304) * (-(2)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = 1.4 + (((tickAnim - 385) / -385) * (-(1.4)));
            zz = 2 + (((tickAnim - 385) / -385) * (-(2)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0.425 + (((tickAnim - 425) / -425) * (-(0.425)));
            zz = 2 + (((tickAnim - 425) / -425) * (-(2)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0.425 + (((tickAnim - 530) / -530) * (-(0.425)));
            zz = 2 + (((tickAnim - 530) / -530) * (-(2)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0.25 + (((tickAnim - 560) / -560) * (-(0.25)));
            zz = 2 + (((tickAnim - 560) / -560) * (-(2)));
        }
        else if (tickAnim >= 568 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 568) / -568) * (-(0)));
            yy = -1.62 + (((tickAnim - 568) / -568) * (-(-1.62)));
            zz = 1.76 + (((tickAnim - 568) / -568) * (-(1.76)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 577) / -577) * (-(0)));
            yy = -1.9 + (((tickAnim - 577) / -577) * (-(-1.9)));
            zz = 1.525 + (((tickAnim - 577) / -577) * (-(1.525)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 0) {
            xx = 16.5 + (((tickAnim - 3) / -3) * (-(16.5)));
            yy = 0 + (((tickAnim - 3) / -3) * (-(0)));
            zz = 0 + (((tickAnim - 3) / -3) * (-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 0) {
            xx = 49.9908 + (((tickAnim - 10) / -10) * (-(49.9908)));
            yy = -0.42801 + (((tickAnim - 10) / -10) * (-(-0.42801)));
            zz = 0.61597 + (((tickAnim - 10) / -10) * (-(0.61597)));
        }
        else if (tickAnim >= 20 && tickAnim < 0) {
            xx = 37.71318 + (((tickAnim - 20) / -20) * (-(37.71318)));
            yy = -1.71204 + (((tickAnim - 20) / -20) * (-(-1.71204)));
            zz = 2.46388 + (((tickAnim - 20) / -20) * (-(2.46388)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 70.73689 + (((tickAnim - 43) / -43) * (-(70.73689)));
            yy = -4.99097 + (((tickAnim - 43) / -43) * (-(-4.99097)));
            zz = 2.30078 + (((tickAnim - 43) / -43) * (-(2.30078)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 67.6052 + (((tickAnim - 84) / -84) * (-(67.6052)));
            yy = 1.00359 + (((tickAnim - 84) / -84) * (-(1.00359)));
            zz = -2.0746 + (((tickAnim - 84) / -84) * (-(-2.0746)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 67.6052 + (((tickAnim - 168) / -168) * (-(67.6052)));
            yy = 1.00359 + (((tickAnim - 168) / -168) * (-(1.00359)));
            zz = -2.0746 + (((tickAnim - 168) / -168) * (-(-2.0746)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = 53.17657 + (((tickAnim - 178) / -178) * (-(53.17657)));
            yy = 11.07042 + (((tickAnim - 178) / -178) * (-(11.07042)));
            zz = -5.57369 + (((tickAnim - 178) / -178) * (-(-5.57369)));
        }
        else if (tickAnim >= 180 && tickAnim < 0) {
            xx = 62.51759 + (((tickAnim - 180) / -180) * (-(62.51759)));
            yy = 17.18211 + (((tickAnim - 180) / -180) * (-(17.18211)));
            zz = -5.74593 + (((tickAnim - 180) / -180) * (-(-5.74593)));
        }
        else if (tickAnim >= 183 && tickAnim < 0) {
            xx = 65.5634 + (((tickAnim - 183) / -183) * (-(65.5634)));
            yy = -27.64266 + (((tickAnim - 183) / -183) * (-(-27.64266)));
            zz = -1.75085 + (((tickAnim - 183) / -183) * (-(-1.75085)));
        }
        else if (tickAnim >= 185 && tickAnim < 0) {
            xx = 82.5 + (((tickAnim - 185) / -185) * (-(82.5)));
            yy = 0 + (((tickAnim - 185) / -185) * (-(0)));
            zz = 0 + (((tickAnim - 185) / -185) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 91.84896 + (((tickAnim - 203) / -203) * (-(91.84896)));
            yy = 11.27335 + (((tickAnim - 203) / -203) * (-(11.27335)));
            zz = -4.07869 + (((tickAnim - 203) / -203) * (-(-4.07869)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 91.84896 + (((tickAnim - 280) / -280) * (-(91.84896)));
            yy = 11.27335 + (((tickAnim - 280) / -280) * (-(11.27335)));
            zz = -4.07869 + (((tickAnim - 280) / -280) * (-(-4.07869)));
        }
        else if (tickAnim >= 289 && tickAnim < 0) {
            xx = 80.4752 + (((tickAnim - 289) / -289) * (-(80.4752)));
            yy = -34.24096 + (((tickAnim - 289) / -289) * (-(-34.24096)));
            zz = -10.94517 + (((tickAnim - 289) / -289) * (-(-10.94517)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = 74.49951 + (((tickAnim - 293) / -293) * (-(74.49951)));
            yy = -1.49953 + (((tickAnim - 293) / -293) * (-(-1.49953)));
            zz = 0.0377 + (((tickAnim - 293) / -293) * (-(0.0377)));
        }
        else if (tickAnim >= 296 && tickAnim < 0) {
            xx = 57.49964 + (((tickAnim - 296) / -296) * (-(57.49964)));
            yy = -1.07109 + (((tickAnim - 296) / -296) * (-(-1.07109)));
            zz = 0.02693 + (((tickAnim - 296) / -296) * (-(0.02693)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 304) / -304) * (-(72.75)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 530) / -530) * (-(72.75)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 560) / -560) * (-(72.75)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 0) {
            xx = 88.66604 + (((tickAnim - 568) / -568) * (-(88.66604)));
            yy = 4.22601 + (((tickAnim - 568) / -568) * (-(4.22601)));
            zz = -1.13616 + (((tickAnim - 568) / -568) * (-(-1.13616)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 39.83207 + (((tickAnim - 577) / -577) * (-(39.83207)));
            yy = 8.45201 + (((tickAnim - 577) / -577) * (-(8.45201)));
            zz = -2.27232 + (((tickAnim - 577) / -577) * (-(-2.27232)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 3) / -3) * (-(0)));
            yy = -0.475 + (((tickAnim - 3) / -3) * (-(-0.475)));
            zz = 0 + (((tickAnim - 3) / -3) * (-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 20) / -20) * (-(0)));
            yy = -0.095 + (((tickAnim - 20) / -20) * (-(-0.095)));
            zz = 0 + (((tickAnim - 20) / -20) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -0.6 + (((tickAnim - 43) / -43) * (-(-0.6)));
            zz = -0.425 + (((tickAnim - 43) / -43) * (-(-0.425)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 70) / -70) * (-(0)));
            yy = -0.2 + (((tickAnim - 70) / -70) * (-(-0.2)));
            zz = -0.75 + (((tickAnim - 70) / -70) * (-(-0.75)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 84) / -84) * (-(0)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = -1.3 + (((tickAnim - 84) / -84) * (-(-1.3)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = -1.3 + (((tickAnim - 168) / -168) * (-(-1.3)));
        }
        else if (tickAnim >= 180 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 180) / -180) * (-(0)));
            yy = 0 + (((tickAnim - 180) / -180) * (-(0)));
            zz = 0 + (((tickAnim - 180) / -180) * (-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 0) {
            xx = 1.125 + (((tickAnim - 183) / -183) * (-(1.125)));
            yy = 0 + (((tickAnim - 183) / -183) * (-(0)));
            zz = -1.87 + (((tickAnim - 183) / -183) * (-(-1.87)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 203) / -203) * (-(0)));
            yy = 0 + (((tickAnim - 203) / -203) * (-(0)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 293) / -293) * (-(0)));
            yy = 0 + (((tickAnim - 293) / -293) * (-(0)));
            zz = -1.35 + (((tickAnim - 293) / -293) * (-(-1.35)));
        }
        else if (tickAnim >= 300 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 300) / -300) * (-(0)));
            yy = 0 + (((tickAnim - 300) / -300) * (-(0)));
            zz = -0.23 + (((tickAnim - 300) / -300) * (-(-0.23)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = -0.7 + (((tickAnim - 304) / -304) * (-(-0.7)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = -0.7 + (((tickAnim - 530) / -530) * (-(-0.7)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = -0.7 + (((tickAnim - 560) / -560) * (-(-0.7)));
        }
        else if (tickAnim >= 592 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 592) / -592) * (-(0)));
            yy = 1.9 + (((tickAnim - 592) / -592) * (-(1.9)));
            zz = -0.21 + (((tickAnim - 592) / -592) * (-(-0.21)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 0) {
            xx = -11.5 + (((tickAnim - 3) / -3) * (-(-11.5)));
            yy = 0 + (((tickAnim - 3) / -3) * (-(0)));
            zz = 0 + (((tickAnim - 3) / -3) * (-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 8) / -8) * (-(0)));
            yy = 0 + (((tickAnim - 8) / -8) * (-(0)));
            zz = 0 + (((tickAnim - 8) / -8) * (-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 0) {
            xx = 21.75 + (((tickAnim - 10) / -10) * (-(21.75)));
            yy = 0 + (((tickAnim - 10) / -10) * (-(0)));
            zz = 0 + (((tickAnim - 10) / -10) * (-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 20) / -20) * (-(0)));
            yy = 0 + (((tickAnim - 20) / -20) * (-(0)));
            zz = 0 + (((tickAnim - 20) / -20) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 177) / -177) * (-(0)));
            yy = 0 + (((tickAnim - 177) / -177) * (-(0)));
            zz = 0 + (((tickAnim - 177) / -177) * (-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 183) / -183) * (-(0)));
            yy = 0 + (((tickAnim - 183) / -183) * (-(0)));
            zz = 0 + (((tickAnim - 183) / -183) * (-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 0) {
            xx = 44.25 + (((tickAnim - 211) / -211) * (-(44.25)));
            yy = 0 + (((tickAnim - 211) / -211) * (-(0)));
            zz = 0 + (((tickAnim - 211) / -211) * (-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 0) {
            xx = 44.25 + (((tickAnim - 238) / -238) * (-(44.25)));
            yy = 0 + (((tickAnim - 238) / -238) * (-(0)));
            zz = 0 + (((tickAnim - 238) / -238) * (-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 0) {
            xx = 44.25 + (((tickAnim - 239) / -239) * (-(44.25)));
            yy = 0 + (((tickAnim - 239) / -239) * (-(0)));
            zz = 0 + (((tickAnim - 239) / -239) * (-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 0) {
            xx = 44.25 + (((tickAnim - 266) / -266) * (-(44.25)));
            yy = 0 + (((tickAnim - 266) / -266) * (-(0)));
            zz = 0 + (((tickAnim - 266) / -266) * (-(0)));
        }
        else if (tickAnim >= 289 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 289) / -289) * (-(0)));
            yy = 0 + (((tickAnim - 289) / -289) * (-(0)));
            zz = 13 + (((tickAnim - 289) / -289) * (-(13)));
        }
        else if (tickAnim >= 296 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 296) / -296) * (-(0)));
            yy = 0 + (((tickAnim - 296) / -296) * (-(0)));
            zz = 0 + (((tickAnim - 296) / -296) * (-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -7.75 + (((tickAnim - 84) / -84) * (-(-7.75)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -7.75 + (((tickAnim - 560) / -560) * (-(-7.75)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -9.25 + (((tickAnim - 84) / -84) * (-(-9.25)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -9.25 + (((tickAnim - 560) / -560) * (-(-9.25)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -9 + (((tickAnim - 84) / -84) * (-(-9)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -9 + (((tickAnim - 560) / -560) * (-(-9)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 91 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 91) / -91) * (-(1)));
            yy = 1 + (((tickAnim - 91) / -91) * (-(1)));
            zz = 1 + (((tickAnim - 91) / -91) * (-(1)));
        }
        else if (tickAnim >= 97 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 97) / -97) * (-(1)));
            yy = 0.0275 + (((tickAnim - 97) / -97) * (-(0.0275)));
            zz = 1 + (((tickAnim - 97) / -97) * (-(1)));
        }
        else if (tickAnim >= 98 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 98) / -98) * (-(1)));
            yy = 0.0275 + (((tickAnim - 98) / -98) * (-(0.0275)));
            zz = 1 + (((tickAnim - 98) / -98) * (-(1)));
        }
        else if (tickAnim >= 106 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 106) / -106) * (-(1)));
            yy = 1 + (((tickAnim - 106) / -106) * (-(1)));
            zz = 1 + (((tickAnim - 106) / -106) * (-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 130) / -130) * (-(1)));
            yy = 1 + (((tickAnim - 130) / -130) * (-(1)));
            zz = 1 + (((tickAnim - 130) / -130) * (-(1)));
        }
        else if (tickAnim >= 132 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 132) / -132) * (-(1)));
            yy = 1 + (((tickAnim - 132) / -132) * (-(1)));
            zz = 1 + (((tickAnim - 132) / -132) * (-(1)));
        }
        else if (tickAnim >= 138 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 138) / -138) * (-(1)));
            yy = 0.265 + (((tickAnim - 138) / -138) * (-(0.265)));
            zz = 1 + (((tickAnim - 138) / -138) * (-(1)));
        }
        else if (tickAnim >= 144 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 144) / -144) * (-(1)));
            yy = 1 + (((tickAnim - 144) / -144) * (-(1)));
            zz = 1 + (((tickAnim - 144) / -144) * (-(1)));
        }
        else if (tickAnim >= 315 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 315) / -315) * (-(1)));
            yy = 1 + (((tickAnim - 315) / -315) * (-(1)));
            zz = 1 + (((tickAnim - 315) / -315) * (-(1)));
        }
        else if (tickAnim >= 320 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 320) / -320) * (-(1)));
            yy = 0 + (((tickAnim - 320) / -320) * (-(0)));
            zz = 1 + (((tickAnim - 320) / -320) * (-(1)));
        }
        else if (tickAnim >= 325 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 325) / -325) * (-(1)));
            yy = 1 + (((tickAnim - 325) / -325) * (-(1)));
            zz = 1 + (((tickAnim - 325) / -325) * (-(1)));
        }
        else if (tickAnim >= 345 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 345) / -345) * (-(1)));
            yy = 1 + (((tickAnim - 345) / -345) * (-(1)));
            zz = 1 + (((tickAnim - 345) / -345) * (-(1)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 425) / -425) * (-(1)));
            yy = 1 + (((tickAnim - 425) / -425) * (-(1)));
            zz = 1 + (((tickAnim - 425) / -425) * (-(1)));
        }
        else if (tickAnim >= 440 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 440) / -440) * (-(1)));
            yy = 0.215 + (((tickAnim - 440) / -440) * (-(0.215)));
            zz = 1 + (((tickAnim - 440) / -440) * (-(1)));
        }
        else if (tickAnim >= 450 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 450) / -450) * (-(1)));
            yy = 1 + (((tickAnim - 450) / -450) * (-(1)));
            zz = 1 + (((tickAnim - 450) / -450) * (-(1)));
        }
        else if (tickAnim >= 473 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 473) / -473) * (-(1)));
            yy = 0.09 + (((tickAnim - 473) / -473) * (-(0.09)));
            zz = 1 + (((tickAnim - 473) / -473) * (-(1)));
        }
        else if (tickAnim >= 486 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 486) / -486) * (-(1)));
            yy = 0.09 + (((tickAnim - 486) / -486) * (-(0.09)));
            zz = 1 + (((tickAnim - 486) / -486) * (-(1)));
        }
        else if (tickAnim >= 497 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 497) / -497) * (-(1)));
            yy = 1 + (((tickAnim - 497) / -497) * (-(1)));
            zz = 1 + (((tickAnim - 497) / -497) * (-(1)));
        }
        else if (tickAnim >= 510 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 510) / -510) * (-(1)));
            yy = 1 + (((tickAnim - 510) / -510) * (-(1)));
            zz = 1 + (((tickAnim - 510) / -510) * (-(1)));
        }
        else if (tickAnim >= 515 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 515) / -515) * (-(1)));
            yy = 0 + (((tickAnim - 515) / -515) * (-(0)));
            zz = 1 + (((tickAnim - 515) / -515) * (-(1)));
        }
        else if (tickAnim >= 520 && tickAnim < 0) {
            xx = 1 + (((tickAnim - 520) / -520) * (-(1)));
            yy = 1 + (((tickAnim - 520) / -520) * (-(1)));
            zz = 1 + (((tickAnim - 520) / -520) * (-(1)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 20.21274 + (((tickAnim - 70) / -70) * (-(20.21274)));
            yy = 17.61426 + (((tickAnim - 70) / -70) * (-(17.61426)));
            zz = -11.3386411854+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 70) / -70) * (-(-11.3386411854+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 10.77124 + (((tickAnim - 84) / -84) * (-(10.77124)));
            yy = 29.35711 + (((tickAnim - 84) / -84) * (-(29.35711)));
            zz = -18.89774 + (((tickAnim - 84) / -84) * (-(-18.89774)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 10.77124 + (((tickAnim - 168) / -168) * (-(10.77124)));
            yy = 29.35711 + (((tickAnim - 168) / -168) * (-(29.35711)));
            zz = -18.89774 + (((tickAnim - 168) / -168) * (-(-18.89774)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = 11.38732 + (((tickAnim - 178) / -178) * (-(11.38732)));
            yy = 44.91551 + (((tickAnim - 178) / -178) * (-(44.91551)));
            zz = -33.66763 + (((tickAnim - 178) / -178) * (-(-33.66763)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = -24.00155 + (((tickAnim - 203) / -203) * (-(-24.00155)));
            yy = 7.56316 + (((tickAnim - 203) / -203) * (-(7.56316)));
            zz = 19.75725 + (((tickAnim - 203) / -203) * (-(19.75725)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = -39.68544 + (((tickAnim - 216) / -216) * (-(-39.68544)));
            yy = -3.54747 + (((tickAnim - 216) / -216) * (-(-3.54747)));
            zz = -59.8504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 216) / -216) * (-(-59.8504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = -46.86794 + (((tickAnim - 231) / -231) * (-(-46.86794)));
            yy = 4.39634 + (((tickAnim - 231) / -231) * (-(4.39634)));
            zz = 31.27035 + (((tickAnim - 231) / -231) * (-(31.27035)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = -46.86794 + (((tickAnim - 232) / -232) * (-(-46.86794)));
            yy = 4.39634 + (((tickAnim - 232) / -232) * (-(4.39634)));
            zz = 31.27035 + (((tickAnim - 232) / -232) * (-(31.27035)));
        }
        else if (tickAnim >= 248 && tickAnim < 0) {
            xx = -39.68544 + (((tickAnim - 248) / -248) * (-(-39.68544)));
            yy = -3.54747 + (((tickAnim - 248) / -248) * (-(-3.54747)));
            zz = 20.8246+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-100 + (((tickAnim - 248) / -248) * (-(20.8246+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-100)));
        }
        else if (tickAnim >= 261 && tickAnim < 0) {
            xx = -35.1549 + (((tickAnim - 261) / -261) * (-(-35.1549)));
            yy = 20.38612 + (((tickAnim - 261) / -261) * (-(20.38612)));
            zz = 28.94206 + (((tickAnim - 261) / -261) * (-(28.94206)));
        }
        else if (tickAnim >= 266 && tickAnim < 0) {
            xx = -35.86213 + (((tickAnim - 266) / -266) * (-(-35.86213)));
            yy = 20.52662 + (((tickAnim - 266) / -266) * (-(20.52662)));
            zz = 27.0598 + (((tickAnim - 266) / -266) * (-(27.0598)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = -21.73356 + (((tickAnim - 280) / -280) * (-(-21.73356)));
            yy = 4.7947 + (((tickAnim - 280) / -280) * (-(4.7947)));
            zz = -13.98748 + (((tickAnim - 280) / -280) * (-(-13.98748)));
        }
        else if (tickAnim >= 290 && tickAnim < 0) {
            xx = -37.51166 + (((tickAnim - 290) / -290) * (-(-37.51166)));
            yy = -2.3551 + (((tickAnim - 290) / -290) * (-(-2.3551)));
            zz = -36.33979 + (((tickAnim - 290) / -290) * (-(-36.33979)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = -10.68182 + (((tickAnim - 304) / -304) * (-(-10.68182)));
            yy = 6.37516 + (((tickAnim - 304) / -304) * (-(6.37516)));
            zz = -11.08654 + (((tickAnim - 304) / -304) * (-(-11.08654)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = -10.68182 + (((tickAnim - 385) / -385) * (-(-10.68182)));
            yy = 6.37516 + (((tickAnim - 385) / -385) * (-(6.37516)));
            zz = -11.08654 + (((tickAnim - 385) / -385) * (-(-11.08654)));
        }
        else if (tickAnim >= 412 && tickAnim < 0) {
            xx = -72.9781-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 412) / -412) * (-(-72.9781-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -36.7996-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 412) / -412) * (-(-36.7996-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -51.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*50 + (((tickAnim - 412) / -412) * (-(-51.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*50)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = -54.8694 + (((tickAnim - 425) / -425) * (-(-54.8694)));
            yy = -6.84029 + (((tickAnim - 425) / -425) * (-(-6.84029)));
            zz = -70.98257 + (((tickAnim - 425) / -425) * (-(-70.98257)));
        }
        else if (tickAnim >= 440 && tickAnim < 0) {
            xx = -52.51896 + (((tickAnim - 440) / -440) * (-(-52.51896)));
            yy = -11.91397 + (((tickAnim - 440) / -440) * (-(-11.91397)));
            zz = -69.62471 + (((tickAnim - 440) / -440) * (-(-69.62471)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = -52.51896 + (((tickAnim - 530) / -530) * (-(-52.51896)));
            yy = -11.91397 + (((tickAnim - 530) / -530) * (-(-11.91397)));
            zz = -69.62471 + (((tickAnim - 530) / -530) * (-(-69.62471)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 10.81818 + (((tickAnim - 560) / -560) * (-(10.81818)));
            yy = 6.37516 + (((tickAnim - 560) / -560) * (-(6.37516)));
            zz = -11.08654 + (((tickAnim - 560) / -560) * (-(-11.08654)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 0) {
            xx = -19.06461 + (((tickAnim - 60) / -60) * (-(-19.06461)));
            yy = -7.27168 + (((tickAnim - 60) / -60) * (-(-7.27168)));
            zz = -13.80877 + (((tickAnim - 60) / -60) * (-(-13.80877)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -5.5 + (((tickAnim - 84) / -84) * (-(-5.5)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = -5.5 + (((tickAnim - 168) / -168) * (-(-5.5)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = -3.85989 + (((tickAnim - 203) / -203) * (-(-3.85989)));
            yy = 15.44685 + (((tickAnim - 203) / -203) * (-(15.44685)));
            zz = 12.04947 + (((tickAnim - 203) / -203) * (-(12.04947)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = -0.17012 + (((tickAnim - 216) / -216) * (-(-0.17012)));
            yy = 4.22351 + (((tickAnim - 216) / -216) * (-(4.22351)));
            zz = -19.36118 + (((tickAnim - 216) / -216) * (-(-19.36118)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = -3.85989 + (((tickAnim - 231) / -231) * (-(-3.85989)));
            yy = 15.44685 + (((tickAnim - 231) / -231) * (-(15.44685)));
            zz = 12.04947 + (((tickAnim - 231) / -231) * (-(12.04947)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = -3.85989 + (((tickAnim - 232) / -232) * (-(-3.85989)));
            yy = 15.44685 + (((tickAnim - 232) / -232) * (-(15.44685)));
            zz = 12.04947 + (((tickAnim - 232) / -232) * (-(12.04947)));
        }
        else if (tickAnim >= 248 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 248) / -248) * (-(0)));
            yy = 0 + (((tickAnim - 248) / -248) * (-(0)));
            zz = 0 + (((tickAnim - 248) / -248) * (-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 0) {
            xx = -2.76054 + (((tickAnim - 256) / -256) * (-(-2.76054)));
            yy = 6.78049 + (((tickAnim - 256) / -256) * (-(6.78049)));
            zz = 5.09655 + (((tickAnim - 256) / -256) * (-(5.09655)));
        }
        else if (tickAnim >= 261 && tickAnim < 0) {
            xx = -4.14741 + (((tickAnim - 261) / -261) * (-(-4.14741)));
            yy = 14.0785 + (((tickAnim - 261) / -261) * (-(14.0785)));
            zz = 10.92127 + (((tickAnim - 261) / -261) * (-(10.92127)));
        }
        else if (tickAnim >= 266 && tickAnim < 0) {
            xx = -4.22414 + (((tickAnim - 266) / -266) * (-(-4.22414)));
            yy = 13.68657 + (((tickAnim - 266) / -266) * (-(13.68657)));
            zz = 10.60146 + (((tickAnim - 266) / -266) * (-(10.60146)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 290) / -290) * (-(0)));
            yy = 0 + (((tickAnim - 290) / -290) * (-(0)));
            zz = 0 + (((tickAnim - 290) / -290) * (-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = -47.25 + (((tickAnim - 304) / -304) * (-(-47.25)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = -47.25 + (((tickAnim - 385) / -385) * (-(-47.25)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 0 + (((tickAnim - 385) / -385) * (-(0)));
        }
        else if (tickAnim >= 401 && tickAnim < 0) {
            xx = 4.49402 + (((tickAnim - 401) / -401) * (-(4.49402)));
            yy = -48.332-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 401) / -401) * (-(-48.332-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -78.0154+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70 + (((tickAnim - 401) / -401) * (-(-78.0154+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 15.15441 + (((tickAnim - 425) / -425) * (-(15.15441)));
            yy = -3.34694 + (((tickAnim - 425) / -425) * (-(-3.34694)));
            zz = -5.28131 + (((tickAnim - 425) / -425) * (-(-5.28131)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 15.15441 + (((tickAnim - 530) / -530) * (-(15.15441)));
            yy = -3.34694 + (((tickAnim - 530) / -530) * (-(-3.34694)));
            zz = -5.28131 + (((tickAnim - 530) / -530) * (-(-5.28131)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -47.25 + (((tickAnim - 560) / -560) * (-(-47.25)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = 0 + (((tickAnim - 425) / -425) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 84) / -84) * (-(0)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = -0.29047 + (((tickAnim - 203) / -203) * (-(-0.29047)));
            yy = 7.09375 + (((tickAnim - 203) / -203) * (-(7.09375)));
            zz = -20.71872 + (((tickAnim - 203) / -203) * (-(-20.71872)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 216) / -216) * (-(0)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = -12.5 + (((tickAnim - 216) / -216) * (-(-12.5)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = -0.29047 + (((tickAnim - 231) / -231) * (-(-0.29047)));
            yy = 7.09375 + (((tickAnim - 231) / -231) * (-(7.09375)));
            zz = -20.71872 + (((tickAnim - 231) / -231) * (-(-20.71872)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = -0.29047 + (((tickAnim - 232) / -232) * (-(-0.29047)));
            yy = 7.09375 + (((tickAnim - 232) / -232) * (-(7.09375)));
            zz = -20.71872 + (((tickAnim - 232) / -232) * (-(-20.71872)));
        }
        else if (tickAnim >= 248 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 248) / -248) * (-(0)));
            yy = 0 + (((tickAnim - 248) / -248) * (-(0)));
            zz = -12.5 + (((tickAnim - 248) / -248) * (-(-12.5)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = -2.4301 + (((tickAnim - 258) / -258) * (-(-2.4301)));
            yy = 6.0554 + (((tickAnim - 258) / -258) * (-(6.0554)));
            zz = -37.6343 + (((tickAnim - 258) / -258) * (-(-37.6343)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 23.75 + (((tickAnim - 280) / -280) * (-(23.75)));
        }
        else if (tickAnim >= 290 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 290) / -290) * (-(0)));
            yy = 0 + (((tickAnim - 290) / -290) * (-(0)));
            zz = 0 + (((tickAnim - 290) / -290) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 37.54 + (((tickAnim - 298) / -298) * (-(37.54)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 14.25 + (((tickAnim - 304) / -304) * (-(14.25)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 14.25 + (((tickAnim - 385) / -385) * (-(14.25)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0.00521 + (((tickAnim - 425) / -425) * (-(0.00521)));
            yy = -3.74662 + (((tickAnim - 425) / -425) * (-(-3.74662)));
            zz = -22.90922 + (((tickAnim - 425) / -425) * (-(-22.90922)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0.00521 + (((tickAnim - 530) / -530) * (-(0.00521)));
            yy = -3.74662 + (((tickAnim - 530) / -530) * (-(-3.74662)));
            zz = -22.90922 + (((tickAnim - 530) / -530) * (-(-22.90922)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 14.25 + (((tickAnim - 560) / -560) * (-(14.25)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 0) {
            xx = -0.15 + (((tickAnim - 60) / -60) * (-(-0.15)));
            yy = 0 + (((tickAnim - 60) / -60) * (-(0)));
            zz = 0 + (((tickAnim - 60) / -60) * (-(0)));
        }
        else if (tickAnim >= 261 && tickAnim < 0) {
            xx = -0.15 + (((tickAnim - 261) / -261) * (-(-0.15)));
            yy = 0.85 + (((tickAnim - 261) / -261) * (-(0.85)));
            zz = 0 + (((tickAnim - 261) / -261) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 0) {
            xx = 20.25 + (((tickAnim - 60) / -60) * (-(20.25)));
            yy = 0 + (((tickAnim - 60) / -60) * (-(0)));
            zz = 0 + (((tickAnim - 60) / -60) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 18.23884 + (((tickAnim - 84) / -84) * (-(18.23884)));
            yy = -7.71426 + (((tickAnim - 84) / -84) * (-(-7.71426)));
            zz = 14.91322 + (((tickAnim - 84) / -84) * (-(14.91322)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 18.23884 + (((tickAnim - 168) / -168) * (-(18.23884)));
            yy = -7.71426 + (((tickAnim - 168) / -168) * (-(-7.71426)));
            zz = 14.91322 + (((tickAnim - 168) / -168) * (-(14.91322)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 17.74604 + (((tickAnim - 203) / -203) * (-(17.74604)));
            yy = -0.79811 + (((tickAnim - 203) / -203) * (-(-0.79811)));
            zz = -20.83102 + (((tickAnim - 203) / -203) * (-(-20.83102)));
        }
        else if (tickAnim >= 208 && tickAnim < 0) {
            xx = 17.49531 + (((tickAnim - 208) / -208) * (-(17.49531)));
            yy = 3.83676 + (((tickAnim - 208) / -208) * (-(3.83676)));
            zz = -30.25859 + (((tickAnim - 208) / -208) * (-(-30.25859)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 216) / -216) * (-(0)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = 0 + (((tickAnim - 216) / -216) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 17.74604 + (((tickAnim - 231) / -231) * (-(17.74604)));
            yy = -0.79811 + (((tickAnim - 231) / -231) * (-(-0.79811)));
            zz = -20.83102 + (((tickAnim - 231) / -231) * (-(-20.83102)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 17.74604 + (((tickAnim - 232) / -232) * (-(17.74604)));
            yy = -0.79811 + (((tickAnim - 232) / -232) * (-(-0.79811)));
            zz = -20.83102 + (((tickAnim - 232) / -232) * (-(-20.83102)));
        }
        else if (tickAnim >= 242 && tickAnim < 0) {
            xx = 16.59662 + (((tickAnim - 242) / -242) * (-(16.59662)));
            yy = -12.84316 + (((tickAnim - 242) / -242) * (-(-12.84316)));
            zz = 37.62877 + (((tickAnim - 242) / -242) * (-(37.62877)));
        }
        else if (tickAnim >= 250 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 250) / -250) * (-(0)));
            yy = 0 + (((tickAnim - 250) / -250) * (-(0)));
            zz = 0 + (((tickAnim - 250) / -250) * (-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 0) {
            xx = 17.74604 + (((tickAnim - 260) / -260) * (-(17.74604)));
            yy = -0.79811 + (((tickAnim - 260) / -260) * (-(-0.79811)));
            zz = -20.83102 + (((tickAnim - 260) / -260) * (-(-20.83102)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 289 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 289) / -289) * (-(0)));
            yy = 0 + (((tickAnim - 289) / -289) * (-(0)));
            zz = 56.62 + (((tickAnim - 289) / -289) * (-(56.62)));
        }
        else if (tickAnim >= 295 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 295) / -295) * (-(0)));
            yy = 0 + (((tickAnim - 295) / -295) * (-(0)));
            zz = 72.87 + (((tickAnim - 295) / -295) * (-(72.87)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 43.25 + (((tickAnim - 304) / -304) * (-(43.25)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 29.5 + (((tickAnim - 385) / -385) * (-(29.5)));
        }
        else if (tickAnim >= 393 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 393) / -393) * (-(0)));
            yy = 0 + (((tickAnim - 393) / -393) * (-(0)));
            zz = 82.48 + (((tickAnim - 393) / -393) * (-(82.48)));
        }
        else if (tickAnim >= 418 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 418) / -418) * (-(0)));
            yy = 0 + (((tickAnim - 418) / -418) * (-(0)));
            zz = -36.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-150 + (((tickAnim - 418) / -418) * (-(-36.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-150)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = -13 + (((tickAnim - 425) / -425) * (-(-13)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = -13 + (((tickAnim - 530) / -530) * (-(-13)));
        }
        else if (tickAnim >= 540 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 540) / -540) * (-(0)));
            yy = 0 + (((tickAnim - 540) / -540) * (-(0)));
            zz = -32.58 + (((tickAnim - 540) / -540) * (-(-32.58)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = -20.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*80 + (((tickAnim - 560) / -560) * (-(-20.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*80)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 289 && tickAnim < 0) {
            xx = 0.675 + (((tickAnim - 289) / -289) * (-(0.675)));
            yy = 1.05 + (((tickAnim - 289) / -289) * (-(1.05)));
            zz = 0 + (((tickAnim - 289) / -289) * (-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 0) {
            xx = 0.675 + (((tickAnim - 295) / -295) * (-(0.675)));
            yy = 1.05 + (((tickAnim - 295) / -295) * (-(1.05)));
            zz = 0 + (((tickAnim - 295) / -295) * (-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0.675 + (((tickAnim - 385) / -385) * (-(0.675)));
            yy = 1.05 + (((tickAnim - 385) / -385) * (-(1.05)));
            zz = 0 + (((tickAnim - 385) / -385) * (-(0)));
        }
        else if (tickAnim >= 393 && tickAnim < 0) {
            xx = 1.5 + (((tickAnim - 393) / -393) * (-(1.5)));
            yy = 0 + (((tickAnim - 393) / -393) * (-(0)));
            zz = 0 + (((tickAnim - 393) / -393) * (-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = 0 + (((tickAnim - 425) / -425) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0.675 + (((tickAnim - 560) / -560) * (-(0.675)));
            yy = 1.05 + (((tickAnim - 560) / -560) * (-(1.05)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 0) {
            xx = 21.25 + (((tickAnim - 60) / -60) * (-(21.25)));
            yy = 0 + (((tickAnim - 60) / -60) * (-(0)));
            zz = 0 + (((tickAnim - 60) / -60) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 22.5 + (((tickAnim - 84) / -84) * (-(22.5)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = 0 + (((tickAnim - 84) / -84) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 22.5 + (((tickAnim - 168) / -168) * (-(22.5)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 24.35308 + (((tickAnim - 203) / -203) * (-(24.35308)));
            yy = 6.04002 + (((tickAnim - 203) / -203) * (-(6.04002)));
            zz = -15.73912 + (((tickAnim - 203) / -203) * (-(-15.73912)));
        }
        else if (tickAnim >= 208 && tickAnim < 0) {
            xx = 24.64298 + (((tickAnim - 208) / -208) * (-(24.64298)));
            yy = 9.33297 + (((tickAnim - 208) / -208) * (-(9.33297)));
            zz = -23.85213 + (((tickAnim - 208) / -208) * (-(-23.85213)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 216) / -216) * (-(0)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = 0 + (((tickAnim - 216) / -216) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 24.35308 + (((tickAnim - 231) / -231) * (-(24.35308)));
            yy = 6.04002 + (((tickAnim - 231) / -231) * (-(6.04002)));
            zz = -15.73912 + (((tickAnim - 231) / -231) * (-(-15.73912)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 24.35308 + (((tickAnim - 232) / -232) * (-(24.35308)));
            yy = 6.04002 + (((tickAnim - 232) / -232) * (-(6.04002)));
            zz = -15.73912 + (((tickAnim - 232) / -232) * (-(-15.73912)));
        }
        else if (tickAnim >= 242 && tickAnim < 0) {
            xx = 12.14298 + (((tickAnim - 242) / -242) * (-(12.14298)));
            yy = -9.33297 + (((tickAnim - 242) / -242) * (-(-9.33297)));
            zz = 23.85213 + (((tickAnim - 242) / -242) * (-(23.85213)));
        }
        else if (tickAnim >= 250 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 250) / -250) * (-(0)));
            yy = 0 + (((tickAnim - 250) / -250) * (-(0)));
            zz = 0 + (((tickAnim - 250) / -250) * (-(0)));
        }
        else if (tickAnim >= 261 && tickAnim < 0) {
            xx = 18.1414 + (((tickAnim - 261) / -261) * (-(18.1414)));
            yy = 6.36099 + (((tickAnim - 261) / -261) * (-(6.36099)));
            zz = -18.61737 + (((tickAnim - 261) / -261) * (-(-18.61737)));
        }
        else if (tickAnim >= 265 && tickAnim < 0) {
            xx = 24.35308 + (((tickAnim - 265) / -265) * (-(24.35308)));
            yy = 6.04002 + (((tickAnim - 265) / -265) * (-(6.04002)));
            zz = -15.73912 + (((tickAnim - 265) / -265) * (-(-15.73912)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 48.44 + (((tickAnim - 298) / -298) * (-(48.44)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 23.5 + (((tickAnim - 304) / -304) * (-(23.5)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 23.5 + (((tickAnim - 385) / -385) * (-(23.5)));
        }
        else if (tickAnim >= 393 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 393) / -393) * (-(0)));
            yy = 0 + (((tickAnim - 393) / -393) * (-(0)));
            zz = 69.54 + (((tickAnim - 393) / -393) * (-(69.54)));
        }
        else if (tickAnim >= 418 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 418) / -418) * (-(0)));
            yy = 0 + (((tickAnim - 418) / -418) * (-(0)));
            zz = -88.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 418) / -418) * (-(-88.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = -13.5 + (((tickAnim - 425) / -425) * (-(-13.5)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = -13.5 + (((tickAnim - 530) / -530) * (-(-13.5)));
        }
        else if (tickAnim >= 540 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 540) / -540) * (-(0)));
            yy = 0 + (((tickAnim - 540) / -540) * (-(0)));
            zz = -42.67 + (((tickAnim - 540) / -540) * (-(-42.67)));
        }
        else if (tickAnim >= 547 && tickAnim < 0) {
            xx = 0.1037 + (((tickAnim - 547) / -547) * (-(0.1037)));
            yy = 10.53908 + (((tickAnim - 547) / -547) * (-(10.53908)));
            zz = -54.77361 + (((tickAnim - 547) / -547) * (-(-54.77361)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 23.5 + (((tickAnim - 560) / -560) * (-(23.5)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 211) / -211) * (-(0)));
            yy = 0 + (((tickAnim - 211) / -211) * (-(0)));
            zz = -25.25 + (((tickAnim - 211) / -211) * (-(-25.25)));
        }
        else if (tickAnim >= 238 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 238) / -238) * (-(0)));
            yy = 0 + (((tickAnim - 238) / -238) * (-(0)));
            zz = -25.25 + (((tickAnim - 238) / -238) * (-(-25.25)));
        }
        else if (tickAnim >= 239 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 239) / -239) * (-(0)));
            yy = 0 + (((tickAnim - 239) / -239) * (-(0)));
            zz = -25.25 + (((tickAnim - 239) / -239) * (-(-25.25)));
        }
        else if (tickAnim >= 261 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 261) / -261) * (-(0)));
            yy = 0 + (((tickAnim - 261) / -261) * (-(0)));
            zz = -25.25 + (((tickAnim - 261) / -261) * (-(-25.25)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 15 + (((tickAnim - 298) / -298) * (-(15)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 15 + (((tickAnim - 385) / -385) * (-(15)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = -29 + (((tickAnim - 425) / -425) * (-(-29)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = -29 + (((tickAnim - 530) / -530) * (-(-29)));
        }
        else if (tickAnim >= 547 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 547) / -547) * (-(0)));
            yy = 0 + (((tickAnim - 547) / -547) * (-(0)));
            zz = -25.56 + (((tickAnim - 547) / -547) * (-(-25.56)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 15 + (((tickAnim - 560) / -560) * (-(15)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = -6.91 + (((tickAnim - 24) / -24) * (-(-6.91)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 1.02496 + (((tickAnim - 43) / -43) * (-(1.02496)));
            yy = -18.03723 + (((tickAnim - 43) / -43) * (-(-18.03723)));
            zz = -11.23003 + (((tickAnim - 43) / -43) * (-(-11.23003)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = -52.22504 + (((tickAnim - 70) / -70) * (-(-52.22504)));
            yy = -18.03723 + (((tickAnim - 70) / -70) * (-(-18.03723)));
            zz = -11.23003 + (((tickAnim - 70) / -70) * (-(-11.23003)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -59.72504 + (((tickAnim - 84) / -84) * (-(-59.72504)));
            yy = -18.03723 + (((tickAnim - 84) / -84) * (-(-18.03723)));
            zz = -11.23003 + (((tickAnim - 84) / -84) * (-(-11.23003)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = -59.72504 + (((tickAnim - 168) / -168) * (-(-59.72504)));
            yy = -18.03723 + (((tickAnim - 168) / -168) * (-(-18.03723)));
            zz = -11.23003 + (((tickAnim - 168) / -168) * (-(-11.23003)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = -51.38304 + (((tickAnim - 178) / -178) * (-(-51.38304)));
            yy = -9.82026 + (((tickAnim - 178) / -178) * (-(-9.82026)));
            zz = -19.52089 + (((tickAnim - 178) / -178) * (-(-19.52089)));
        }
        else if (tickAnim >= 189 && tickAnim < 0) {
            xx = -15.73255 + (((tickAnim - 189) / -189) * (-(-15.73255)));
            yy = -0.5037 + (((tickAnim - 189) / -189) * (-(-0.5037)));
            zz = -3.96821 + (((tickAnim - 189) / -189) * (-(-3.96821)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = -9.96525 + (((tickAnim - 203) / -203) * (-(-9.96525)));
            yy = 0.56802 + (((tickAnim - 203) / -203) * (-(0.56802)));
            zz = 5.20118 + (((tickAnim - 203) / -203) * (-(5.20118)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 216) / -216) * (-(0)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = -10.75 + (((tickAnim - 216) / -216) * (-(-10.75)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = -0.96525 + (((tickAnim - 231) / -231) * (-(-0.96525)));
            yy = 0.56802 + (((tickAnim - 231) / -231) * (-(0.56802)));
            zz = 5.20118 + (((tickAnim - 231) / -231) * (-(5.20118)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = -0.96525 + (((tickAnim - 232) / -232) * (-(-0.96525)));
            yy = 0.56802 + (((tickAnim - 232) / -232) * (-(0.56802)));
            zz = 5.20118 + (((tickAnim - 232) / -232) * (-(5.20118)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 243) / -243) * (-(0)));
            yy = 0 + (((tickAnim - 243) / -243) * (-(0)));
            zz = -10.75 + (((tickAnim - 243) / -243) * (-(-10.75)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = -0.96525 + (((tickAnim - 258) / -258) * (-(-0.96525)));
            yy = 0.56802 + (((tickAnim - 258) / -258) * (-(0.56802)));
            zz = 5.20118 + (((tickAnim - 258) / -258) * (-(5.20118)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = -14.75 + (((tickAnim - 280) / -280) * (-(-14.75)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = -25.87918 + (((tickAnim - 293) / -293) * (-(-25.87918)));
            yy = -5.804 + (((tickAnim - 293) / -293) * (-(-5.804)));
            zz = -17.49218 + (((tickAnim - 293) / -293) * (-(-17.49218)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = -52.69459 + (((tickAnim - 304) / -304) * (-(-52.69459)));
            yy = -13.23845 + (((tickAnim - 304) / -304) * (-(-13.23845)));
            zz = -8.79843 + (((tickAnim - 304) / -304) * (-(-8.79843)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = -52.69459 + (((tickAnim - 385) / -385) * (-(-52.69459)));
            yy = -13.23845 + (((tickAnim - 385) / -385) * (-(-13.23845)));
            zz = -8.79843 + (((tickAnim - 385) / -385) * (-(-8.79843)));
        }
        else if (tickAnim >= 440 && tickAnim < 0) {
            xx = -62.13833 + (((tickAnim - 440) / -440) * (-(-62.13833)));
            yy = -26.55382 + (((tickAnim - 440) / -440) * (-(-26.55382)));
            zz = -12.75575 + (((tickAnim - 440) / -440) * (-(-12.75575)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = -62.13833 + (((tickAnim - 530) / -530) * (-(-62.13833)));
            yy = -26.55382 + (((tickAnim - 530) / -530) * (-(-26.55382)));
            zz = -12.75575 + (((tickAnim - 530) / -530) * (-(-12.75575)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -52.69459 + (((tickAnim - 560) / -560) * (-(-52.69459)));
            yy = -13.23845 + (((tickAnim - 560) / -560) * (-(-13.23845)));
            zz = -8.79843 + (((tickAnim - 560) / -560) * (-(-8.79843)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = -38.17595 + (((tickAnim - 577) / -577) * (-(-38.17595)));
            yy = -10.62286 + (((tickAnim - 577) / -577) * (-(-10.62286)));
            zz = -13.3174 + (((tickAnim - 577) / -577) * (-(-13.3174)));
        }
        else if (tickAnim >= 594 && tickAnim < 0) {
            xx = -23.17595 + (((tickAnim - 594) / -594) * (-(-23.17595)));
            yy = -10.62286 + (((tickAnim - 594) / -594) * (-(-10.62286)));
            zz = -13.3174 + (((tickAnim - 594) / -594) * (-(-13.3174)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }

        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(0);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = 35.95585 + (((tickAnim - 24) / -24) * (-(35.95585)));
            yy = 0.01845 + (((tickAnim - 24) / -24) * (-(0.01845)));
            zz = 0.07669 + (((tickAnim - 24) / -24) * (-(0.07669)));
        }
        else if (tickAnim >= 30 && tickAnim < 0) {
            xx = 38.85 + (((tickAnim - 30) / -30) * (-(38.85)));
            yy = 0 + (((tickAnim - 30) / -30) * (-(0)));
            zz = 0 + (((tickAnim - 30) / -30) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 24.5 + (((tickAnim - 43) / -43) * (-(24.5)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 58 + (((tickAnim - 70) / -70) * (-(58)));
            yy = 0 + (((tickAnim - 70) / -70) * (-(0)));
            zz = 0 + (((tickAnim - 70) / -70) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 58 + (((tickAnim - 168) / -168) * (-(58)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = 52.04612 + (((tickAnim - 178) / -178) * (-(52.04612)));
            yy = -0.60887 + (((tickAnim - 178) / -178) * (-(-0.60887)));
            zz = 0.99191 + (((tickAnim - 178) / -178) * (-(0.99191)));
        }
        else if (tickAnim >= 189 && tickAnim < 0) {
            xx = -143.0556-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 189) / -189) * (-(-143.0556-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -2.43549 + (((tickAnim - 189) / -189) * (-(-2.43549)));
            zz = 3.96764 + (((tickAnim - 189) / -189) * (-(3.96764)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 40.83884 + (((tickAnim - 203) / -203) * (-(40.83884)));
            yy = -4.87097 + (((tickAnim - 203) / -203) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 203) / -203) * (-(7.93528)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 27.58884 + (((tickAnim - 216) / -216) * (-(27.58884)));
            yy = -4.87097 + (((tickAnim - 216) / -216) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 216) / -216) * (-(7.93528)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 24.83884 + (((tickAnim - 231) / -231) * (-(24.83884)));
            yy = -4.87097 + (((tickAnim - 231) / -231) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 231) / -231) * (-(7.93528)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 24.83884 + (((tickAnim - 232) / -232) * (-(24.83884)));
            yy = -4.87097 + (((tickAnim - 232) / -232) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 232) / -232) * (-(7.93528)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = 27.58884 + (((tickAnim - 243) / -243) * (-(27.58884)));
            yy = -4.87097 + (((tickAnim - 243) / -243) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 243) / -243) * (-(7.93528)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 17.33884 + (((tickAnim - 258) / -258) * (-(17.33884)));
            yy = -4.87097 + (((tickAnim - 258) / -258) * (-(-4.87097)));
            zz = 7.93528 + (((tickAnim - 258) / -258) * (-(7.93528)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 34.25 + (((tickAnim - 280) / -280) * (-(34.25)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 0) {
            xx = -5.25 + (((tickAnim - 290) / -290) * (-(-5.25)));
            yy = 0 + (((tickAnim - 290) / -290) * (-(0)));
            zz = 0 + (((tickAnim - 290) / -290) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 31.96 + (((tickAnim - 298) / -298) * (-(31.96)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 0 + (((tickAnim - 298) / -298) * (-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 53.5 + (((tickAnim - 304) / -304) * (-(53.5)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 51 + (((tickAnim - 425) / -425) * (-(51)));
            yy = 0 + (((tickAnim - 425) / -425) * (-(0)));
            zz = 0 + (((tickAnim - 425) / -425) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 51 + (((tickAnim - 530) / -530) * (-(51)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 51 + (((tickAnim - 560) / -560) * (-(51)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 26 + (((tickAnim - 577) / -577) * (-(26)));
            yy = 0 + (((tickAnim - 577) / -577) * (-(0)));
            zz = 0 + (((tickAnim - 577) / -577) * (-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 0) {
            xx = 51 + (((tickAnim - 594) / -594) * (-(51)));
            yy = 0 + (((tickAnim - 594) / -594) * (-(0)));
            zz = 0 + (((tickAnim - 594) / -594) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 203) / -203) * (-(0)));
            yy = 0 + (((tickAnim - 203) / -203) * (-(0)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 231) / -231) * (-(0)));
            yy = 0 + (((tickAnim - 231) / -231) * (-(0)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 232) / -232) * (-(0)));
            yy = 0 + (((tickAnim - 232) / -232) * (-(0)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 258) / -258) * (-(0)));
            yy = 0 + (((tickAnim - 258) / -258) * (-(0)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0.425 + (((tickAnim - 298) / -298) * (-(0.425)));
            zz = -0.325 + (((tickAnim - 298) / -298) * (-(-0.325)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = -21.82 + (((tickAnim - 24) / -24) * (-(-21.82)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = -67.29 + (((tickAnim - 32) / -32) * (-(-67.29)));
            yy = 0 + (((tickAnim - 32) / -32) * (-(0)));
            zz = 0 + (((tickAnim - 32) / -32) * (-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 0) {
            xx = -50.09 + (((tickAnim - 37) / -37) * (-(-50.09)));
            yy = 0 + (((tickAnim - 37) / -37) * (-(0)));
            zz = 0 + (((tickAnim - 37) / -37) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = -67.75 + (((tickAnim - 43) / -43) * (-(-67.75)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = -76.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*20 + (((tickAnim - 43) / -43) * (-(-76.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*20)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = -74.44944 + (((tickAnim - 84) / -84) * (-(-74.44944)));
            yy = 2.37186 + (((tickAnim - 84) / -84) * (-(2.37186)));
            zz = 3.87932 + (((tickAnim - 84) / -84) * (-(3.87932)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = -74.44944 + (((tickAnim - 168) / -168) * (-(-74.44944)));
            yy = 2.37186 + (((tickAnim - 168) / -168) * (-(2.37186)));
            zz = 3.87932 + (((tickAnim - 168) / -168) * (-(3.87932)));
        }
        else if (tickAnim >= 173 && tickAnim < 0) {
            xx = -82.63125 + (((tickAnim - 173) / -173) * (-(-82.63125)));
            yy = 2.37186 + (((tickAnim - 173) / -173) * (-(2.37186)));
            zz = 3.87932 + (((tickAnim - 173) / -173) * (-(3.87932)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = -84.19944 + (((tickAnim - 178) / -178) * (-(-84.19944)));
            yy = 2.37186 + (((tickAnim - 178) / -178) * (-(2.37186)));
            zz = 3.87932 + (((tickAnim - 178) / -178) * (-(3.87932)));
        }
        else if (tickAnim >= 182 && tickAnim < 0) {
            xx = -63.27892 + (((tickAnim - 182) / -182) * (-(-63.27892)));
            yy = 1.90556 + (((tickAnim - 182) / -182) * (-(1.90556)));
            zz = 17.64589 + (((tickAnim - 182) / -182) * (-(17.64589)));
        }
        else if (tickAnim >= 189 && tickAnim < 0) {
            xx = 4 + (((tickAnim - 189) / -189) * (-(4)));
            yy = 0 + (((tickAnim - 189) / -189) * (-(0)));
            zz = 0 + (((tickAnim - 189) / -189) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = -38.75 + (((tickAnim - 203) / -203) * (-(-38.75)));
            yy = 0 + (((tickAnim - 203) / -203) * (-(0)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = -37 + (((tickAnim - 216) / -216) * (-(-37)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = 0 + (((tickAnim - 216) / -216) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = -26.75 + (((tickAnim - 231) / -231) * (-(-26.75)));
            yy = 0 + (((tickAnim - 231) / -231) * (-(0)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = -26.75 + (((tickAnim - 232) / -232) * (-(-26.75)));
            yy = 0 + (((tickAnim - 232) / -232) * (-(0)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = -37 + (((tickAnim - 243) / -243) * (-(-37)));
            yy = 0 + (((tickAnim - 243) / -243) * (-(0)));
            zz = 0 + (((tickAnim - 243) / -243) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 258) / -258) * (-(0)));
            yy = 0 + (((tickAnim - 258) / -258) * (-(0)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = -49.5 + (((tickAnim - 280) / -280) * (-(-49.5)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 287) / -287) * (-(0)));
            yy = 0 + (((tickAnim - 287) / -287) * (-(0)));
            zz = 0 + (((tickAnim - 287) / -287) * (-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = -42.14477 + (((tickAnim - 293) / -293) * (-(-42.14477)));
            yy = 1.451 + (((tickAnim - 293) / -293) * (-(1.451)));
            zz = 5.94366 + (((tickAnim - 293) / -293) * (-(5.94366)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = -66 + (((tickAnim - 298) / -298) * (-(-66)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 0 + (((tickAnim - 298) / -298) * (-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = -71.75 + (((tickAnim - 304) / -304) * (-(-71.75)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = -71.75 + (((tickAnim - 385) / -385) * (-(-71.75)));
            yy = 0 + (((tickAnim - 385) / -385) * (-(0)));
            zz = 0 + (((tickAnim - 385) / -385) * (-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = -76.46064 + (((tickAnim - 425) / -425) * (-(-76.46064)));
            yy = 3.42042 + (((tickAnim - 425) / -425) * (-(3.42042)));
            zz = 9.66822 + (((tickAnim - 425) / -425) * (-(9.66822)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = -76.46064 + (((tickAnim - 530) / -530) * (-(-76.46064)));
            yy = 3.42042 + (((tickAnim - 530) / -530) * (-(3.42042)));
            zz = 9.66822 + (((tickAnim - 530) / -530) * (-(9.66822)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = -71.75 + (((tickAnim - 560) / -560) * (-(-71.75)));
            yy = 0 + (((tickAnim - 560) / -560) * (-(0)));
            zz = 0 + (((tickAnim - 560) / -560) * (-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = -60.25 + (((tickAnim - 577) / -577) * (-(-60.25)));
            yy = 0 + (((tickAnim - 577) / -577) * (-(0)));
            zz = 0 + (((tickAnim - 577) / -577) * (-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 0) {
            xx = -76.75 + (((tickAnim - 594) / -594) * (-(-76.75)));
            yy = 0 + (((tickAnim - 594) / -594) * (-(0)));
            zz = 0 + (((tickAnim - 594) / -594) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 24) / -24) * (-(0)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 32) / -32) * (-(0)));
            yy = -1.45 + (((tickAnim - 32) / -32) * (-(-1.45)));
            zz = 0 + (((tickAnim - 32) / -32) * (-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 37) / -37) * (-(0)));
            yy = -1.075 + (((tickAnim - 37) / -37) * (-(-1.075)));
            zz = 0 + (((tickAnim - 37) / -37) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -3.375 + (((tickAnim - 43) / -43) * (-(-3.375)));
            zz = 0.65 + (((tickAnim - 43) / -43) * (-(0.65)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-4 + (((tickAnim - 43) / -43) * (-(-3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-4)));
            zz = 0.65 + (((tickAnim - 43) / -43) * (-(0.65)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 70) / -70) * (-(0)));
            yy = -19.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-10))*20 + (((tickAnim - 70) / -70) * (-(-19.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-10))*20)));
            zz = 1.45 + (((tickAnim - 70) / -70) * (-(1.45)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 84) / -84) * (-(0)));
            yy = -1.9 + (((tickAnim - 84) / -84) * (-(-1.9)));
            zz = 1.45 + (((tickAnim - 84) / -84) * (-(1.45)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = -1.9 + (((tickAnim - 168) / -168) * (-(-1.9)));
            zz = 1.45 + (((tickAnim - 168) / -168) * (-(1.45)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = -0.7 + (((tickAnim - 178) / -178) * (-(-0.7)));
            yy = -2.04 + (((tickAnim - 178) / -178) * (-(-2.04)));
            zz = 1.27 + (((tickAnim - 178) / -178) * (-(1.27)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 203) / -203) * (-(0)));
            yy = 0 + (((tickAnim - 203) / -203) * (-(0)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 231) / -231) * (-(0)));
            yy = 0 + (((tickAnim - 231) / -231) * (-(0)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 232) / -232) * (-(0)));
            yy = 0 + (((tickAnim - 232) / -232) * (-(0)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 258) / -258) * (-(0)));
            yy = 0 + (((tickAnim - 258) / -258) * (-(0)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = -0.85 + (((tickAnim - 280) / -280) * (-(-0.85)));
            zz = 2 + (((tickAnim - 280) / -280) * (-(2)));
        }
        else if (tickAnim >= 287 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 287) / -287) * (-(0)));
            yy = 0 + (((tickAnim - 287) / -287) * (-(0)));
            zz = 0 + (((tickAnim - 287) / -287) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 0 + (((tickAnim - 298) / -298) * (-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 301) / -301) * (-(0)));
            yy = -0.54 + (((tickAnim - 301) / -301) * (-(-0.54)));
            zz = 1 + (((tickAnim - 301) / -301) * (-(1)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = -2.775 + (((tickAnim - 304) / -304) * (-(-2.775)));
            zz = 2 + (((tickAnim - 304) / -304) * (-(2)));
        }
        else if (tickAnim >= 385 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 385) / -385) * (-(0)));
            yy = -2.775 + (((tickAnim - 385) / -385) * (-(-2.775)));
            zz = 2 + (((tickAnim - 385) / -385) * (-(2)));
        }
        else if (tickAnim >= 425 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 425) / -425) * (-(0)));
            yy = -0.575 + (((tickAnim - 425) / -425) * (-(-0.575)));
            zz = 2 + (((tickAnim - 425) / -425) * (-(2)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = -0.575 + (((tickAnim - 530) / -530) * (-(-0.575)));
            zz = 2 + (((tickAnim - 530) / -530) * (-(2)));
        }
        else if (tickAnim >= 560 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 560) / -560) * (-(0)));
            yy = -2.775 + (((tickAnim - 560) / -560) * (-(-2.775)));
            zz = 2 + (((tickAnim - 560) / -560) * (-(2)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 577) / -577) * (-(0)));
            yy = -2.775 + (((tickAnim - 577) / -577) * (-(-2.775)));
            zz = 2 + (((tickAnim - 577) / -577) * (-(2)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = 10.22 + (((tickAnim - 24) / -24) * (-(10.22)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = 67.46659 + (((tickAnim - 32) / -32) * (-(67.46659)));
            yy = 0.85602 + (((tickAnim - 32) / -32) * (-(0.85602)));
            zz = -1.23194 + (((tickAnim - 32) / -32) * (-(-1.23194)));
        }
        else if (tickAnim >= 37 && tickAnim < 0) {
            xx = 58.28291 + (((tickAnim - 37) / -37) * (-(58.28291)));
            yy = 1.32294 + (((tickAnim - 37) / -37) * (-(1.32294)));
            zz = -1.90391 + (((tickAnim - 37) / -37) * (-(-1.90391)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 70.73689 + (((tickAnim - 43) / -43) * (-(70.73689)));
            yy = 4.99097 + (((tickAnim - 43) / -43) * (-(4.99097)));
            zz = -2.30078 + (((tickAnim - 43) / -43) * (-(-2.30078)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 67.5972 + (((tickAnim - 84) / -84) * (-(67.5972)));
            yy = -2.99038 + (((tickAnim - 84) / -84) * (-(-2.99038)));
            zz = 2.30421 + (((tickAnim - 84) / -84) * (-(2.30421)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 67.5972 + (((tickAnim - 168) / -168) * (-(67.5972)));
            yy = -2.99038 + (((tickAnim - 168) / -168) * (-(-2.99038)));
            zz = 2.30421 + (((tickAnim - 168) / -168) * (-(2.30421)));
        }
        else if (tickAnim >= 173 && tickAnim < 0) {
            xx = 67.2563 + (((tickAnim - 173) / -173) * (-(67.2563)));
            yy = -1.40895 + (((tickAnim - 173) / -173) * (-(-1.40895)));
            zz = 1.45096 + (((tickAnim - 173) / -173) * (-(1.45096)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = 73.72926 + (((tickAnim - 178) / -178) * (-(73.72926)));
            yy = -10.89019 + (((tickAnim - 178) / -178) * (-(-10.89019)));
            zz = 2.83966 + (((tickAnim - 178) / -178) * (-(2.83966)));
        }
        else if (tickAnim >= 182 && tickAnim < 0) {
            xx = 58.51501 + (((tickAnim - 182) / -182) * (-(58.51501)));
            yy = -19.28386 + (((tickAnim - 182) / -182) * (-(-19.28386)));
            zz = 11.23847 + (((tickAnim - 182) / -182) * (-(11.23847)));
        }
        else if (tickAnim >= 184 && tickAnim < 0) {
            xx = 51.82894 + (((tickAnim - 184) / -184) * (-(51.82894)));
            yy = -30.09977 + (((tickAnim - 184) / -184) * (-(-30.09977)));
            zz = 7.98218 + (((tickAnim - 184) / -184) * (-(7.98218)));
        }
        else if (tickAnim >= 189 && tickAnim < 0) {
            xx = 101.25 + (((tickAnim - 189) / -189) * (-(101.25)));
            yy = 0 + (((tickAnim - 189) / -189) * (-(0)));
            zz = 0 + (((tickAnim - 189) / -189) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 73 + (((tickAnim - 203) / -203) * (-(73)));
            yy = 0 + (((tickAnim - 203) / -203) * (-(0)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 23.5 + (((tickAnim - 216) / -216) * (-(23.5)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = 0 + (((tickAnim - 216) / -216) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 73 + (((tickAnim - 231) / -231) * (-(73)));
            yy = 0 + (((tickAnim - 231) / -231) * (-(0)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 73 + (((tickAnim - 232) / -232) * (-(73)));
            yy = 0 + (((tickAnim - 232) / -232) * (-(0)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = 23.5 + (((tickAnim - 243) / -243) * (-(23.5)));
            yy = 0 + (((tickAnim - 243) / -243) * (-(0)));
            zz = 0 + (((tickAnim - 243) / -243) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 73 + (((tickAnim - 258) / -258) * (-(73)));
            yy = 0 + (((tickAnim - 258) / -258) * (-(0)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = -7 + (((tickAnim - 280) / -280) * (-(-7)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 0) {
            xx = 77.5016 + (((tickAnim - 287) / -287) * (-(77.5016)));
            yy = -1.99948 + (((tickAnim - 287) / -287) * (-(-1.99948)));
            zz = -0.0458 + (((tickAnim - 287) / -287) * (-(-0.0458)));
        }
        else if (tickAnim >= 296 && tickAnim < 0) {
            xx = 70.17408 + (((tickAnim - 296) / -296) * (-(70.17408)));
            yy = -16.05858 + (((tickAnim - 296) / -296) * (-(-16.05858)));
            zz = 1.46155 + (((tickAnim - 296) / -296) * (-(1.46155)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 304) / -304) * (-(72.75)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 530) / -530) * (-(72.75)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 72.75 + (((tickAnim - 577) / -577) * (-(72.75)));
            yy = 0 + (((tickAnim - 577) / -577) * (-(0)));
            zz = 0 + (((tickAnim - 577) / -577) * (-(0)));
        }
        else if (tickAnim >= 594 && tickAnim < 0) {
            xx = 104.5 + (((tickAnim - 594) / -594) * (-(104.5)));
            yy = 0 + (((tickAnim - 594) / -594) * (-(0)));
            zz = 0 + (((tickAnim - 594) / -594) * (-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }


        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 24) / -24) * (-(0)));
            yy = -0.22 + (((tickAnim - 24) / -24) * (-(-0.22)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 32) / -32) * (-(0)));
            yy = 0.84 + (((tickAnim - 32) / -32) * (-(0.84)));
            zz = -0.425 + (((tickAnim - 32) / -32) * (-(-0.425)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = -0.6 + (((tickAnim - 43) / -43) * (-(-0.6)));
            zz = -0.425 + (((tickAnim - 43) / -43) * (-(-0.425)));
        }
        else if (tickAnim >= 70 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 70) / -70) * (-(0)));
            yy = -0.2 + (((tickAnim - 70) / -70) * (-(-0.2)));
            zz = -1.375 + (((tickAnim - 70) / -70) * (-(-1.375)));
        }
        else if (tickAnim >= 84 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 84) / -84) * (-(0)));
            yy = 0 + (((tickAnim - 84) / -84) * (-(0)));
            zz = -1.3 + (((tickAnim - 84) / -84) * (-(-1.3)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = -1.3 + (((tickAnim - 168) / -168) * (-(-1.3)));
        }
        else if (tickAnim >= 178 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 178) / -178) * (-(0)));
            yy = 0 + (((tickAnim - 178) / -178) * (-(0)));
            zz = -0.775 + (((tickAnim - 178) / -178) * (-(-0.775)));
        }
        else if (tickAnim >= 182 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 182) / -182) * (-(0)));
            yy = 0 + (((tickAnim - 182) / -182) * (-(0)));
            zz = 0 + (((tickAnim - 182) / -182) * (-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 189) / -189) * (-(0)));
            yy = 0 + (((tickAnim - 189) / -189) * (-(0)));
            zz = 0 + (((tickAnim - 189) / -189) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 280) / -280) * (-(0)));
            yy = 0 + (((tickAnim - 280) / -280) * (-(0)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 287) / -287) * (-(0)));
            yy = 0 + (((tickAnim - 287) / -287) * (-(0)));
            zz = 0 + (((tickAnim - 287) / -287) * (-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 293) / -293) * (-(0)));
            yy = 1.52 + (((tickAnim - 293) / -293) * (-(1.52)));
            zz = -1.125 + (((tickAnim - 293) / -293) * (-(-1.125)));
        }
        else if (tickAnim >= 301 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 301) / -301) * (-(0)));
            yy = 1.1 + (((tickAnim - 301) / -301) * (-(1.1)));
            zz = -0.695 + (((tickAnim - 301) / -301) * (-(-0.695)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = -0.825 + (((tickAnim - 304) / -304) * (-(-0.825)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = -0.825 + (((tickAnim - 530) / -530) * (-(-0.825)));
        }
        else if (tickAnim >= 577 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 577) / -577) * (-(0)));
            yy = 0 + (((tickAnim - 577) / -577) * (-(0)));
            zz = -0.825 + (((tickAnim - 577) / -577) * (-(-0.825)));
        }
        else if (tickAnim >= 605 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 605) / -605) * (-(0)));
            yy = 0 + (((tickAnim - 605) / -605) * (-(0)));
            zz = 0 + (((tickAnim - 605) / -605) * (-(0)));
        }




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 24) / -24) * (-(0)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 0) {
            xx = 5.75 + (((tickAnim - 27) / -27) * (-(5.75)));
            yy = 0 + (((tickAnim - 27) / -27) * (-(0)));
            zz = 0 + (((tickAnim - 27) / -27) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = 10.75 + (((tickAnim - 32) / -32) * (-(10.75)));
            yy = 0 + (((tickAnim - 32) / -32) * (-(0)));
            zz = 0 + (((tickAnim - 32) / -32) * (-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 0) {
            xx = -9.5 + (((tickAnim - 37) / -37) * (-(-9.5)));
            yy = 0 + (((tickAnim - 37) / -37) * (-(0)));
            zz = 0 + (((tickAnim - 37) / -37) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 182) / -182) * (-(0)));
            yy = 0 + (((tickAnim - 182) / -182) * (-(0)));
            zz = 0 + (((tickAnim - 182) / -182) * (-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 0) {
            xx = -4 + (((tickAnim - 184) / -184) * (-(-4)));
            yy = 0 + (((tickAnim - 184) / -184) * (-(0)));
            zz = 8.75 + (((tickAnim - 184) / -184) * (-(8.75)));
        }
        else if (tickAnim >= 186 && tickAnim < 0) {
            xx = -18.29915 + (((tickAnim - 186) / -186) * (-(-18.29915)));
            yy = 4.55123 + (((tickAnim - 186) / -186) * (-(4.55123)));
            zz = 23.58963 + (((tickAnim - 186) / -186) * (-(23.58963)));
        }
        else if (tickAnim >= 188 && tickAnim < 0) {
            xx = -14.54668 + (((tickAnim - 188) / -188) * (-(-14.54668)));
            yy = 4.84432 + (((tickAnim - 188) / -188) * (-(4.84432)));
            zz = 21.47882 + (((tickAnim - 188) / -188) * (-(21.47882)));
        }
        else if (tickAnim >= 192 && tickAnim < 0) {
            xx = 44 + (((tickAnim - 192) / -192) * (-(44)));
            yy = 0 + (((tickAnim - 192) / -192) * (-(0)));
            zz = 0 + (((tickAnim - 192) / -192) * (-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 0) {
            xx = 38 + (((tickAnim - 203) / -203) * (-(38)));
            yy = -8.5 + (((tickAnim - 203) / -203) * (-(-8.5)));
            zz = 0 + (((tickAnim - 203) / -203) * (-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 0) {
            xx = 42 + (((tickAnim - 216) / -216) * (-(42)));
            yy = 0 + (((tickAnim - 216) / -216) * (-(0)));
            zz = 0 + (((tickAnim - 216) / -216) * (-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 0) {
            xx = 38 + (((tickAnim - 231) / -231) * (-(38)));
            yy = -8.5 + (((tickAnim - 231) / -231) * (-(-8.5)));
            zz = 0 + (((tickAnim - 231) / -231) * (-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 0) {
            xx = 38 + (((tickAnim - 232) / -232) * (-(38)));
            yy = -8.5 + (((tickAnim - 232) / -232) * (-(-8.5)));
            zz = 0 + (((tickAnim - 232) / -232) * (-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 0) {
            xx = 42 + (((tickAnim - 243) / -243) * (-(42)));
            yy = 0 + (((tickAnim - 243) / -243) * (-(0)));
            zz = 0 + (((tickAnim - 243) / -243) * (-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 258) / -258) * (-(0)));
            yy = -8.5 + (((tickAnim - 258) / -258) * (-(-8.5)));
            zz = 0 + (((tickAnim - 258) / -258) * (-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 0) {
            xx = -29 + (((tickAnim - 280) / -280) * (-(-29)));
            yy = -8.5 + (((tickAnim - 280) / -280) * (-(-8.5)));
            zz = 0 + (((tickAnim - 280) / -280) * (-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 287) / -287) * (-(0)));
            yy = 0 + (((tickAnim - 287) / -287) * (-(0)));
            zz = 0 + (((tickAnim - 287) / -287) * (-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = -14.62623 + (((tickAnim - 293) / -293) * (-(-14.62623)));
            yy = 1.13479 + (((tickAnim - 293) / -293) * (-(1.13479)));
            zz = 14.9492 + (((tickAnim - 293) / -293) * (-(14.9492)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0 + (((tickAnim - 298) / -298) * (-(0)));
            zz = 4 + (((tickAnim - 298) / -298) * (-(4)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }


        if (tickAnim >= 24 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 24) / -24) * (-(0)));
            yy = 0 + (((tickAnim - 24) / -24) * (-(0)));
            zz = 0 + (((tickAnim - 24) / -24) * (-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 27) / -27) * (-(0)));
            yy = 0 + (((tickAnim - 27) / -27) * (-(0)));
            zz = 0 + (((tickAnim - 27) / -27) * (-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 32) / -32) * (-(0)));
            yy = 0 + (((tickAnim - 32) / -32) * (-(0)));
            zz = 0 + (((tickAnim - 32) / -32) * (-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 37) / -37) * (-(0)));
            yy = 0 + (((tickAnim - 37) / -37) * (-(0)));
            zz = 0 + (((tickAnim - 37) / -37) * (-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 43) / -43) * (-(0)));
            yy = 0 + (((tickAnim - 43) / -43) * (-(0)));
            zz = 0 + (((tickAnim - 43) / -43) * (-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 168) / -168) * (-(0)));
            yy = 0 + (((tickAnim - 168) / -168) * (-(0)));
            zz = 0 + (((tickAnim - 168) / -168) * (-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 293) / -293) * (-(0)));
            yy = 0 + (((tickAnim - 293) / -293) * (-(0)));
            zz = 0 + (((tickAnim - 293) / -293) * (-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 298) / -298) * (-(0)));
            yy = 0.525 + (((tickAnim - 298) / -298) * (-(0.525)));
            zz = 0 + (((tickAnim - 298) / -298) * (-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 304) / -304) * (-(0)));
            yy = 0 + (((tickAnim - 304) / -304) * (-(0)));
            zz = 0 + (((tickAnim - 304) / -304) * (-(0)));
        }
        else if (tickAnim >= 530 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 530) / -530) * (-(0)));
            yy = 0 + (((tickAnim - 530) / -530) * (-(0)));
            zz = 0 + (((tickAnim - 530) / -530) * (-(0)));
        }



    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBeishanlong e = (EntityPrehistoricFloraBeishanlong) entity;
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
