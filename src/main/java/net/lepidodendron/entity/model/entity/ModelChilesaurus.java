package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChilesaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelChilesaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodyMiddle;
    private final AdvancedModelRenderer bodyFront;
    private final AdvancedModelRenderer neckBase;
    private final AdvancedModelRenderer NeckBaseextra;
    private final AdvancedModelRenderer neckMiddlebase;
    private final AdvancedModelRenderer neckMiddlefront;
    private final AdvancedModelRenderer neckFront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headSlope;
    private final AdvancedModelRenderer headFeathers;
    private final AdvancedModelRenderer upperJawback;
    private final AdvancedModelRenderer upperJawslopefront;
    private final AdvancedModelRenderer upperJawslopeback;
    private final AdvancedModelRenderer upperJawfront;
    private final AdvancedModelRenderer snoutSlopefront;
    private final AdvancedModelRenderer snoutSlopeback;
    private final AdvancedModelRenderer leftUpperteeth;
    private final AdvancedModelRenderer rightUpperteeth;
    private final AdvancedModelRenderer lowerJawbase;
    private final AdvancedModelRenderer lowerJawmiddle;
    private final AdvancedModelRenderer lowerJawfront;
    private final AdvancedModelRenderer leftLowerteeth;
    private final AdvancedModelRenderer rightLowerteeth;
    private final AdvancedModelRenderer lowerJawslope;
    private final AdvancedModelRenderer masseterLeft;
    private final AdvancedModelRenderer masseterRight;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer neckfeathers1;
    private final AdvancedModelRenderer neckfeathers2;
    private final AdvancedModelRenderer neckfeathers3;
    private final AdvancedModelRenderer featherbeard1;
    private final AdvancedModelRenderer featherbeard2;
    private final AdvancedModelRenderer chestSlope;
    private final AdvancedModelRenderer chestfluff1;
    private final AdvancedModelRenderer leftUpperarm;
    private final AdvancedModelRenderer leftLowerarm;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftShoulderfluff;
    private final AdvancedModelRenderer rightUpperarm;
    private final AdvancedModelRenderer rightLowerarm;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightShoulderfluff;
    private final AdvancedModelRenderer leftBackfluff1;
    private final AdvancedModelRenderer leftBackfluff2;
    private final AdvancedModelRenderer bellySlope;
    private final AdvancedModelRenderer backfluff1;
    private final AdvancedModelRenderer backfluff2;
    private final AdvancedModelRenderer tailBase;
    private final AdvancedModelRenderer tailMiddlebase;
    private final AdvancedModelRenderer tailMiddle;
    private final AdvancedModelRenderer tailMiddleend;
    private final AdvancedModelRenderer tailEnd;
    private final AdvancedModelRenderer underfluff3;
    private final AdvancedModelRenderer tailbrush;
    private final AdvancedModelRenderer tailsidefluff2;
    private final AdvancedModelRenderer underfluff2;
    private final AdvancedModelRenderer tailsidefluff1;
    private final AdvancedModelRenderer tailfluff3;
    private final AdvancedModelRenderer underfluff1;
    private final AdvancedModelRenderer tailfluff2;
    private final AdvancedModelRenderer tailfluff1;
    private final AdvancedModelRenderer rightThigh;
    private final AdvancedModelRenderer rightShin;
    private final AdvancedModelRenderer rightAnkle;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftThigh;
    private final AdvancedModelRenderer leftShin;
    private final AdvancedModelRenderer leftAnkle;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer backfluff3;
    private final AdvancedModelRenderer backfluff4;


    private ModelAnimator animator;

    public ModelChilesaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 4.4F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1061F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 77, -3.5F, -2.5F, -6.0F, 7, 11, 12, 0.0F, false));

        this.bodyMiddle = new AdvancedModelRenderer(this);
        this.bodyMiddle.setRotationPoint(0.0F, -1.4F, -5.3F);
        this.hips.addChild(bodyMiddle);
        this.setRotateAngle(bodyMiddle, 0.1698F, 0.0F, 0.0F);
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 0, 59, -4.0F, -1.0F, -8.0F, 8, 9, 8, 0.0F, false));

        this.bodyFront = new AdvancedModelRenderer(this);
        this.bodyFront.setRotationPoint(0.0F, 0.1F, -7.3F);
        this.bodyMiddle.addChild(bodyFront);
        this.setRotateAngle(bodyFront, 0.1061F, 0.0F, 0.0F);
        this.bodyFront.cubeList.add(new ModelBox(bodyFront, 0, 44, -3.5F, -1.0F, -8.0F, 7, 6, 8, 0.0F, false));

        this.neckBase = new AdvancedModelRenderer(this);
        this.neckBase.setRotationPoint(0.0F, -0.2F, -6.8F);
        this.bodyFront.addChild(neckBase);
        this.setRotateAngle(neckBase, -0.7006F, 0.0F, 0.0F);
        this.neckBase.cubeList.add(new ModelBox(neckBase, 0, 33, -2.0F, -0.5F, -5.0F, 4, 5, 5, 0.0F, false));

        this.NeckBaseextra = new AdvancedModelRenderer(this);
        this.NeckBaseextra.setRotationPoint(-0.01F, 4.5F, 0.0F);
        this.neckBase.addChild(NeckBaseextra);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);
        this.NeckBaseextra.cubeList.add(new ModelBox(NeckBaseextra, 23, 42, -2.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.neckMiddlebase = new AdvancedModelRenderer(this);
        this.neckMiddlebase.setRotationPoint(0.0F, 0.8F, -3.8F);
        this.neckBase.addChild(neckMiddlebase);
        this.setRotateAngle(neckMiddlebase, -0.2972F, 0.0F, 0.0F);
        this.neckMiddlebase.cubeList.add(new ModelBox(neckMiddlebase, 0, 24, -1.5F, -1.0F, -4.0F, 3, 4, 4, 0.0F, false));

        this.neckMiddlefront = new AdvancedModelRenderer(this);
        this.neckMiddlefront.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.neckMiddlebase.addChild(neckMiddlefront);
        this.setRotateAngle(neckMiddlefront, -0.1274F, 0.0F, 0.0F);
        this.neckMiddlefront.cubeList.add(new ModelBox(neckMiddlefront, 19, 33, -1.0F, -1.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.neckFront = new AdvancedModelRenderer(this);
        this.neckFront.setRotationPoint(-0.01F, -0.1F, -3.3F);
        this.neckMiddlefront.addChild(neckFront);
        this.setRotateAngle(neckFront, 0.4033F, 0.0F, 0.0F);
        this.neckFront.cubeList.add(new ModelBox(neckFront, 15, 25, -1.0F, -1.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3F, -2.0F);
        this.neckFront.addChild(head);
        this.setRotateAngle(head, 0.6156F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 36, -1.5F, -0.25F, -3.0F, 3, 2, 3, 0.0F, false));

        this.headSlope = new AdvancedModelRenderer(this);
        this.headSlope.setRotationPoint(-0.01F, -0.75F, -3.04F);
        this.head.addChild(headSlope);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);
        this.headSlope.cubeList.add(new ModelBox(headSlope, 28, 31, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.headFeathers = new AdvancedModelRenderer(this);
        this.headFeathers.setRotationPoint(-0.01F, 0.0F, 1.5F);
        this.headSlope.addChild(headFeathers);
        this.setRotateAngle(headFeathers, 0.2546F, 0.0F, 0.0F);
        this.headFeathers.cubeList.add(new ModelBox(headFeathers, 37, 21, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.upperJawback = new AdvancedModelRenderer(this);
        this.upperJawback.setRotationPoint(0.0F, -0.32F, -3.0F);
        this.head.addChild(upperJawback);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);
        this.upperJawback.cubeList.add(new ModelBox(upperJawback, 41, 31, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.upperJawslopefront = new AdvancedModelRenderer(this);
        this.upperJawslopefront.setRotationPoint(0.01F, -0.41F, -0.02F);
        this.upperJawback.addChild(upperJawslopefront);
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);
        this.upperJawslopefront.cubeList.add(new ModelBox(upperJawslopefront, 45, 37, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.upperJawslopeback = new AdvancedModelRenderer(this);
        this.upperJawslopeback.setRotationPoint(-0.02F, 0.0F, 0.0F);
        this.upperJawslopefront.addChild(upperJawslopeback);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);
        this.upperJawslopeback.cubeList.add(new ModelBox(upperJawslopeback, 28, 22, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.upperJawfront = new AdvancedModelRenderer(this);
        this.upperJawfront.setRotationPoint(0.0F, 2.0F, -2.55F);
        this.upperJawback.addChild(upperJawfront);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);
        this.upperJawfront.cubeList.add(new ModelBox(upperJawfront, 19, 20, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.snoutSlopefront = new AdvancedModelRenderer(this);
        this.snoutSlopefront.setRotationPoint(-0.01F, -1.0F, -2.0F);
        this.upperJawfront.addChild(snoutSlopefront);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);
        this.snoutSlopefront.cubeList.add(new ModelBox(snoutSlopefront, 8, 20, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.snoutSlopeback = new AdvancedModelRenderer(this);
        this.snoutSlopeback.setRotationPoint(0.02F, 0.0F, 1.0F);
        this.snoutSlopefront.addChild(snoutSlopeback);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);
        this.snoutSlopeback.cubeList.add(new ModelBox(snoutSlopeback, 24, 19, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.leftUpperteeth = new AdvancedModelRenderer(this);
        this.leftUpperteeth.setRotationPoint(-0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(leftUpperteeth);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);
        this.leftUpperteeth.cubeList.add(new ModelBox(leftUpperteeth, 0, 9, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.rightUpperteeth = new AdvancedModelRenderer(this);
        this.rightUpperteeth.setRotationPoint(0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(rightUpperteeth);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);
        this.rightUpperteeth.cubeList.add(new ModelBox(rightUpperteeth, 0, 7, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.lowerJawbase = new AdvancedModelRenderer(this);
        this.lowerJawbase.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.head.addChild(lowerJawbase);
        this.lowerJawbase.cubeList.add(new ModelBox(lowerJawbase, 26, 26, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.lowerJawmiddle = new AdvancedModelRenderer(this);
        this.lowerJawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerJawbase.addChild(lowerJawmiddle);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);
        this.lowerJawmiddle.cubeList.add(new ModelBox(lowerJawmiddle, 0, 20, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerJawfront = new AdvancedModelRenderer(this);
        this.lowerJawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lowerJawmiddle.addChild(lowerJawfront);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);
        this.lowerJawfront.cubeList.add(new ModelBox(lowerJawfront, 23, 23, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.leftLowerteeth = new AdvancedModelRenderer(this);
        this.leftLowerteeth.setRotationPoint(-0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(leftLowerteeth);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);
        this.leftLowerteeth.cubeList.add(new ModelBox(leftLowerteeth, 0, 5, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.rightLowerteeth = new AdvancedModelRenderer(this);
        this.rightLowerteeth.setRotationPoint(0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(rightLowerteeth);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);
        this.rightLowerteeth.cubeList.add(new ModelBox(rightLowerteeth, 0, 3, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.lowerJawslope = new AdvancedModelRenderer(this);
        this.lowerJawslope.setRotationPoint(-0.01F, 0.0F, -0.7F);
        this.lowerJawmiddle.addChild(lowerJawslope);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);
        this.lowerJawslope.cubeList.add(new ModelBox(lowerJawslope, 10, 20, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.masseterLeft = new AdvancedModelRenderer(this);
        this.masseterLeft.setRotationPoint(-0.4F, 0.0F, -2.9F);
        this.lowerJawbase.addChild(masseterLeft);
        this.setRotateAngle(masseterLeft, -0.3183F, -0.0213F, 0.0F);
        this.masseterLeft.cubeList.add(new ModelBox(masseterLeft, 0, 15, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.masseterRight = new AdvancedModelRenderer(this);
        this.masseterRight.setRotationPoint(0.4F, 0.0F, -2.9F);
        this.lowerJawbase.addChild(masseterRight);
        this.setRotateAngle(masseterRight, -0.3183F, 0.0213F, 0.0F);
        this.masseterRight.cubeList.add(new ModelBox(masseterRight, 9, 15, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.1F, 0.3F, -2.42F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.1344F, 0.0F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 14, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.08F, 0.3F, -2.42F);
        this.head.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, -0.1344F, 0.0F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 14, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.neckfeathers1 = new AdvancedModelRenderer(this);
        this.neckfeathers1.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neckFront.addChild(neckfeathers1);
        this.setRotateAngle(neckfeathers1, 0.5943F, 0.0F, 0.0F);
        this.neckfeathers1.cubeList.add(new ModelBox(neckfeathers1, 84, 11, -0.5F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.neckfeathers2 = new AdvancedModelRenderer(this);
        this.neckfeathers2.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.neckMiddlefront.addChild(neckfeathers2);
        this.setRotateAngle(neckfeathers2, -0.3609F, 0.0F, 0.0F);
        this.neckfeathers2.cubeList.add(new ModelBox(neckfeathers2, 68, 23, -0.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.neckfeathers3 = new AdvancedModelRenderer(this);
        this.neckfeathers3.setRotationPoint(0.0F, -0.8F, -3.8F);
        this.neckMiddlebase.addChild(neckfeathers3);
        this.setRotateAngle(neckfeathers3, -0.1061F, 0.0F, 0.0F);
        this.neckfeathers3.cubeList.add(new ModelBox(neckfeathers3, 69, 11, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.featherbeard1 = new AdvancedModelRenderer(this);
        this.featherbeard1.setRotationPoint(0.0F, 4.5F, -2.0F);
        this.neckBase.addChild(featherbeard1);
        this.setRotateAngle(featherbeard1, 0.7217F, 0.0F, 0.0F);
        this.featherbeard1.cubeList.add(new ModelBox(featherbeard1, 79, 19, -0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F, false));

        this.featherbeard2 = new AdvancedModelRenderer(this);
        this.featherbeard2.setRotationPoint(0.0F, 4.5F, -2.7F);
        this.neckBase.addChild(featherbeard2);
        this.setRotateAngle(featherbeard2, 0.4671F, 0.0F, 0.0F);
        this.featherbeard2.cubeList.add(new ModelBox(featherbeard2, 100, 0, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.chestSlope = new AdvancedModelRenderer(this);
        this.chestSlope.setRotationPoint(0.01F, 5.0F, -8.0F);
        this.bodyFront.addChild(chestSlope);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);
        this.chestSlope.cubeList.add(new ModelBox(chestSlope, 39, 89, -3.5F, -3.0F, 0.0F, 7, 3, 8, 0.0F, false));

        this.chestfluff1 = new AdvancedModelRenderer(this);
        this.chestfluff1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestSlope.addChild(chestfluff1);
        this.setRotateAngle(chestfluff1, 0.3396F, 0.0F, 0.0F);
        this.chestfluff1.cubeList.add(new ModelBox(chestfluff1, 94, 56, -1.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F, false));

        this.leftUpperarm = new AdvancedModelRenderer(this);
        this.leftUpperarm.setRotationPoint(4.5F, 4.5F, -5.0F);
        this.bodyFront.addChild(leftUpperarm);
        this.setRotateAngle(leftUpperarm, 0.7854F, -0.1911F, 0.0424F);
        this.leftUpperarm.cubeList.add(new ModelBox(leftUpperarm, 41, 101, -1.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F, true));

        this.leftLowerarm = new AdvancedModelRenderer(this);
        this.leftLowerarm.setRotationPoint(-0.4F, 4.0F, 0.0F);
        this.leftUpperarm.addChild(leftLowerarm);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);
        this.leftLowerarm.cubeList.add(new ModelBox(leftLowerarm, 39, 111, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.7F, 3.0F, 0.0F);
        this.leftLowerarm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2759F, 0.0F, 0.3396F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 61, 101, 0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, true));

        this.leftShoulderfluff = new AdvancedModelRenderer(this);
        this.leftShoulderfluff.setRotationPoint(-1.0F, -1.0F, -1.3F);
        this.leftUpperarm.addChild(leftShoulderfluff);
        this.setRotateAngle(leftShoulderfluff, -0.2122F, 0.658F, 0.0213F);
        this.leftShoulderfluff.cubeList.add(new ModelBox(leftShoulderfluff, 58, 109, -1.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, true));

        this.rightUpperarm = new AdvancedModelRenderer(this);
        this.rightUpperarm.setRotationPoint(-4.5F, 4.5F, -5.0F);
        this.bodyFront.addChild(rightUpperarm);
        this.setRotateAngle(rightUpperarm, 0.7854F, 0.1911F, -0.0424F);
        this.rightUpperarm.cubeList.add(new ModelBox(rightUpperarm, 41, 101, -0.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F, false));

        this.rightLowerarm = new AdvancedModelRenderer(this);
        this.rightLowerarm.setRotationPoint(0.4F, 4.0F, 0.0F);
        this.rightUpperarm.addChild(rightLowerarm);
        this.setRotateAngle(rightLowerarm, -1.1675F, -0.0424F, -0.0637F);
        this.rightLowerarm.cubeList.add(new ModelBox(rightLowerarm, 39, 111, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.7F, 3.0F, 0.0F);
        this.rightLowerarm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2759F, 0.0F, -0.3396F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 61, 101, -1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.rightShoulderfluff = new AdvancedModelRenderer(this);
        this.rightShoulderfluff.setRotationPoint(1.0F, -1.0F, -1.3F);
        this.rightUpperarm.addChild(rightShoulderfluff);
        this.setRotateAngle(rightShoulderfluff, -0.2122F, -0.658F, -0.0213F);
        this.rightShoulderfluff.cubeList.add(new ModelBox(rightShoulderfluff, 58, 109, -1.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

        this.leftBackfluff1 = new AdvancedModelRenderer(this);
        this.leftBackfluff1.setRotationPoint(-1.2F, -0.5F, -7.7F);
        this.bodyFront.addChild(leftBackfluff1);
        this.setRotateAngle(leftBackfluff1, 0.0637F, -0.0213F, 0.2335F);
        this.leftBackfluff1.cubeList.add(new ModelBox(leftBackfluff1, 27, 0, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.leftBackfluff2 = new AdvancedModelRenderer(this);
        this.leftBackfluff2.setRotationPoint(1.2F, -0.5F, -7.6F);
        this.bodyFront.addChild(leftBackfluff2);
        this.setRotateAngle(leftBackfluff2, 0.0637F, 0.0213F, -0.2335F);
        this.leftBackfluff2.cubeList.add(new ModelBox(leftBackfluff2, 38, 17, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.bellySlope = new AdvancedModelRenderer(this);
        this.bellySlope.setRotationPoint(-0.01F, 8.0F, -8.0F);
        this.bodyMiddle.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);
        this.bellySlope.cubeList.add(new ModelBox(bellySlope, 69, 0, -3.5F, -2.0F, 0.0F, 7, 2, 8, 0.0F, false));

        this.backfluff1 = new AdvancedModelRenderer(this);
        this.backfluff1.setRotationPoint(0.0F, -0.8F, -7.8F);
        this.bodyMiddle.addChild(backfluff1);
        this.setRotateAngle(backfluff1, 0.0637F, 0.0F, 0.0F);
        this.backfluff1.cubeList.add(new ModelBox(backfluff1, 51, 39, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.backfluff2 = new AdvancedModelRenderer(this);
        this.backfluff2.setRotationPoint(0.0F, -0.6F, -7.8F);
        this.bodyMiddle.addChild(backfluff2);
        this.setRotateAngle(backfluff2, 0.0213F, 0.0F, 0.0F);
        this.backfluff2.cubeList.add(new ModelBox(backfluff2, 95, 9, -2.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F, false));

        this.tailBase = new AdvancedModelRenderer(this);
        this.tailBase.setRotationPoint(0.0F, -0.4F, 5.2F);
        this.hips.addChild(tailBase);
        this.setRotateAngle(tailBase, 0.0424F, 0.0F, 0.0F);
        this.tailBase.cubeList.add(new ModelBox(tailBase, 27, 72, -3.0F, -2.0F, 0.0F, 6, 8, 8, 0.0F, false));

        this.tailMiddlebase = new AdvancedModelRenderer(this);
        this.tailMiddlebase.setRotationPoint(0.0F, -0.4F, 6.9F);
        this.tailBase.addChild(tailMiddlebase);
        this.setRotateAngle(tailMiddlebase, -0.0848F, 0.0F, 0.0F);
        this.tailMiddlebase.cubeList.add(new ModelBox(tailMiddlebase, 33, 56, -2.5F, -1.5F, 0.0F, 5, 6, 9, 0.0F, false));

        this.tailMiddle = new AdvancedModelRenderer(this);
        this.tailMiddle.setRotationPoint(0.0F, 0.1F, 8.1F);
        this.tailMiddlebase.addChild(tailMiddle);
        this.setRotateAngle(tailMiddle, -0.0848F, 0.0F, 0.0F);
        this.tailMiddle.cubeList.add(new ModelBox(tailMiddle, 31, 42, -2.0F, -1.5F, 0.0F, 4, 4, 9, 0.0F, false));

        this.tailMiddleend = new AdvancedModelRenderer(this);
        this.tailMiddleend.setRotationPoint(0.0F, -0.4F, 8.2F);
        this.tailMiddle.addChild(tailMiddleend);
        this.setRotateAngle(tailMiddleend, -0.0637F, 0.0F, 0.0F);
        this.tailMiddleend.cubeList.add(new ModelBox(tailMiddleend, 70, 87, -1.5F, -1.0F, 0.0F, 3, 3, 10, 0.0F, false));

        this.tailEnd = new AdvancedModelRenderer(this);
        this.tailEnd.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.tailMiddleend.addChild(tailEnd);
        this.setRotateAngle(tailEnd, 0.0637F, 0.0F, 0.0F);
        this.tailEnd.cubeList.add(new ModelBox(tailEnd, 53, 51, -1.0F, -0.75F, 0.0F, 2, 2, 11, 0.0F, false));

        this.underfluff3 = new AdvancedModelRenderer(this);
        this.underfluff3.setRotationPoint(-0.01F, 1.25F, 0.0F);
        this.tailEnd.addChild(underfluff3);
        this.underfluff3.cubeList.add(new ModelBox(underfluff3, 35, 0, -1.0F, 0.0F, 0.0F, 2, 3, 13, 0.0F, false));

        this.tailbrush = new AdvancedModelRenderer(this);
        this.tailbrush.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.tailEnd.addChild(tailbrush);
        this.setRotateAngle(tailbrush, 0.0637F, 0.0F, 0.0F);
        this.tailbrush.cubeList.add(new ModelBox(tailbrush, 51, 2, -0.5F, -1.0F, 0.0F, 1, 5, 15, 0.0F, false));

        this.tailsidefluff2 = new AdvancedModelRenderer(this);
        this.tailsidefluff2.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.tailEnd.addChild(tailsidefluff2);
        this.setRotateAngle(tailsidefluff2, -0.1061F, 0.0F, 0.0F);
        this.tailsidefluff2.cubeList.add(new ModelBox(tailsidefluff2, 64, 31, -2.0F, -0.5F, 0.0F, 4, 1, 14, 0.0F, false));

        this.underfluff2 = new AdvancedModelRenderer(this);
        this.underfluff2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.tailMiddleend.addChild(underfluff2);
        this.setRotateAngle(underfluff2, -0.0213F, 0.0F, 0.0F);
        this.underfluff2.cubeList.add(new ModelBox(underfluff2, 52, 23, -1.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tailsidefluff1 = new AdvancedModelRenderer(this);
        this.tailsidefluff1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailMiddleend.addChild(tailsidefluff1);
        this.tailsidefluff1.cubeList.add(new ModelBox(tailsidefluff1, 77, 34, -2.0F, 0.0F, 0.0F, 4, 0, 10, 0.0F, false));

        this.tailfluff3 = new AdvancedModelRenderer(this);
        this.tailfluff3.setRotationPoint(0.01F, -1.1F, 0.2F);
        this.tailMiddle.addChild(tailfluff3);
        this.setRotateAngle(tailfluff3, -0.0424F, 0.0F, 0.0F);
        this.tailfluff3.cubeList.add(new ModelBox(tailfluff3, 104, 42, -1.5F, -1.0F, 0.0F, 3, 1, 9, 0.0F, false));

        this.underfluff1 = new AdvancedModelRenderer(this);
        this.underfluff1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tailMiddle.addChild(underfluff1);
        this.setRotateAngle(underfluff1, -0.0213F, 0.0F, 0.0F);
        this.underfluff1.cubeList.add(new ModelBox(underfluff1, 91, 43, -0.5F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.tailfluff2 = new AdvancedModelRenderer(this);
        this.tailfluff2.setRotationPoint(0.0F, -1.4F, 0.2F);
        this.tailMiddlebase.addChild(tailfluff2);
        this.setRotateAngle(tailfluff2, -0.0424F, 0.0F, 0.0F);
        this.tailfluff2.cubeList.add(new ModelBox(tailfluff2, 11, 2, -1.5F, -1.0F, 0.0F, 3, 1, 9, 0.0F, false));

        this.tailfluff1 = new AdvancedModelRenderer(this);
        this.tailfluff1.setRotationPoint(-0.01F, -2.3F, 0.2F);
        this.tailBase.addChild(tailfluff1);
        this.setRotateAngle(tailfluff1, -0.0637F, 0.0F, 0.0F);
        this.tailfluff1.cubeList.add(new ModelBox(tailfluff1, 96, 31, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.rightThigh = new AdvancedModelRenderer(this);
        this.rightThigh.setRotationPoint(2.6F, 1.2F, 0.0F);
        this.hips.addChild(rightThigh);
        this.setRotateAngle(rightThigh, -0.1485F, 0.0F, 0.0F);
        this.rightThigh.cubeList.add(new ModelBox(rightThigh, 55, 65, -1.0F, -1.5F, -2.5F, 4, 9, 7, 0.0F, false));

        this.rightShin = new AdvancedModelRenderer(this);
        this.rightShin.setRotationPoint(1.2F, 7.5F, -1.5F);
        this.rightThigh.addChild(rightShin);
        this.setRotateAngle(rightShin, 0.5943F, 0.0F, 0.0F);
        this.rightShin.cubeList.add(new ModelBox(rightShin, 0, 101, -1.5F, -0.5F, -0.5F, 3, 9, 4, 0.0F, false));

        this.rightAnkle = new AdvancedModelRenderer(this);
        this.rightAnkle.setRotationPoint(-0.01F, 8.0F, 2.5F);
        this.rightShin.addChild(rightAnkle);
        this.setRotateAngle(rightAnkle, -0.4882F, 0.0F, 0.0F);
        this.rightAnkle.cubeList.add(new ModelBox(rightAnkle, 0, 115, -1.5F, -0.5F, -2.5F, 3, 5, 3, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.2F, -1.25F);
        this.rightAnkle.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1485F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 26, 118, -2.0F, -0.2F, -2.0F, 4, 1, 3, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 25, 123, -2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F, false));

        this.leftThigh = new AdvancedModelRenderer(this);
        this.leftThigh.setRotationPoint(-2.6F, 1.2F, 0.0F);
        this.hips.addChild(leftThigh);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);
        this.leftThigh.cubeList.add(new ModelBox(leftThigh, 78, 65, -3.0F, -1.5F, -2.5F, 4, 9, 7, 0.0F, false));

        this.leftShin = new AdvancedModelRenderer(this);
        this.leftShin.setRotationPoint(-1.2F, 7.5F, -1.5F);
        this.leftThigh.addChild(leftShin);
        this.setRotateAngle(leftShin, 0.5943F, 0.0F, 0.0F);
        this.leftShin.cubeList.add(new ModelBox(leftShin, 15, 101, -1.5F, -0.5F, -0.5F, 3, 9, 4, 0.0F, false));

        this.leftAnkle = new AdvancedModelRenderer(this);
        this.leftAnkle.setRotationPoint(0.01F, 8.0F, 2.5F);
        this.leftShin.addChild(leftAnkle);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);
        this.leftAnkle.cubeList.add(new ModelBox(leftAnkle, 13, 115, -1.5F, -0.5F, -2.5F, 3, 5, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.2F, -1.25F);
        this.leftAnkle.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.1485F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 41, 118, -2.0F, -0.2F, -2.0F, 4, 1, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 42, 123, -2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F, false));

        this.backfluff3 = new AdvancedModelRenderer(this);
        this.backfluff3.setRotationPoint(0.0F, -2.6F, -5.8F);
        this.hips.addChild(backfluff3);
        this.setRotateAngle(backfluff3, 0.0213F, 0.0F, 0.0F);
        this.backfluff3.cubeList.add(new ModelBox(backfluff3, 69, 47, -0.5F, -1.0F, 0.0F, 1, 2, 12, 0.0F, false));

        this.backfluff4 = new AdvancedModelRenderer(this);
        this.backfluff4.setRotationPoint(0.0F, -2.3F, -5.5F);
        this.hips.addChild(backfluff4);
        this.setRotateAngle(backfluff4, -0.0424F, 0.0F, 0.0F);
        this.backfluff4.cubeList.add(new ModelBox(backfluff4, 86, 19, -2.0F, -1.0F, 0.0F, 4, 1, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff2, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff1, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(tailsidefluff2, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddleend, 0.0672F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddlebase, -0.1285F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddle, 0.0897F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff3, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff2, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff1, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailEnd, 0.1946F, 0.0F, 0.0F);
        this.setRotateAngle(tailbrush, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailBase, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(rightUpperarm, 0.1638F, 0.2099F, 1.5941F);
        this.setRotateAngle(rightThigh, -0.4103F, 0.0F, 0.0F);
        this.setRotateAngle(rightShoulderfluff, -0.2122F, -0.658F, -0.0213F);
        this.setRotateAngle(rightShin, 0.3325F, 0.0F, 0.0F);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);
        this.setRotateAngle(rightLowerarm, -1.1675F, -0.0424F, -0.0637F);
        this.setRotateAngle(rightHand, 0.2759F, 0.0F, -0.3396F);
        this.setRotateAngle(rightFoot, 0.3667F, 0.0F, 0.0F);
        this.setRotateAngle(rightEye, 0.0F, -0.1344F, 0.0F);
        this.setRotateAngle(rightAnkle, -0.2264F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlefront, -0.171F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlebase, 0.0955F, 0.0F, 0.0F);
        this.setRotateAngle(neckFront, -0.1639F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers3, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers2, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers1, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(neckBase, -0.6133F, 0.0F, 0.0F);
        this.setRotateAngle(masseterRight, -0.3183F, 0.0213F, 0.0F);
        this.setRotateAngle(masseterLeft, -0.3183F, -0.0213F, 0.0F);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawbase, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(leftUpperarm, 0.1638F, -0.2099F, -1.5941F);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftShoulderfluff, -0.2122F, 0.658F, 0.0213F);
        this.setRotateAngle(leftShin, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);
        this.setRotateAngle(leftHand, 0.2759F, 0.0F, 0.3396F);
        this.setRotateAngle(leftFoot, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftEye, 0.0F, 0.1344F, 0.0F);
        this.setRotateAngle(leftBackfluff2, 0.0637F, 0.0213F, -0.2335F);
        this.setRotateAngle(leftBackfluff1, 0.0637F, -0.0213F, 0.2335F);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.0712F, 0.0F, 0.0F);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(headFeathers, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.441F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard2, 0.4671F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard1, 0.7217F, 0.0F, 0.0F);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(chestfluff1, 0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(bodyMiddle, 0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(bodyFront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff4, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff3, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff2, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff1, 0.0637F, 0.0F, 0.0F);
        this.neckMiddlefront.offsetY = -0.01F;
        this.neckMiddlefront.offsetZ = -0.09F;
        this.neckMiddlefront.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff2, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff1, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(tailsidefluff2, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddleend, 0.0672F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddlebase, -0.1285F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddle, 0.0897F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff3, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff2, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff1, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailEnd, 0.1946F, 0.0F, 0.0F);
        this.setRotateAngle(tailbrush, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailBase, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(rightUpperarm, 0.1638F, 0.2099F, 1.5941F);
        this.setRotateAngle(rightThigh, -0.4103F, 0.0F, 0.0F);
        this.setRotateAngle(rightShoulderfluff, -0.2122F, -0.658F, -0.0213F);
        this.setRotateAngle(rightShin, 0.3325F, 0.0F, 0.0F);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);
        this.setRotateAngle(rightLowerarm, -1.1675F, -0.0424F, -0.0637F);
        this.setRotateAngle(rightHand, 0.2759F, 0.0F, -0.3396F);
        this.setRotateAngle(rightFoot, 0.3667F, 0.0F, 0.0F);
        this.setRotateAngle(rightEye, 0.0F, -0.1344F, 0.0F);
        this.setRotateAngle(rightAnkle, -0.2264F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlefront, -0.171F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlebase, 0.0955F, 0.0F, 0.0F);
        this.setRotateAngle(neckFront, -0.1639F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers3, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers2, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers1, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(neckBase, -0.6133F, 0.0F, 0.0F);
        this.setRotateAngle(masseterRight, -0.3183F, 0.0213F, 0.0F);
        this.setRotateAngle(masseterLeft, -0.3183F, -0.0213F, 0.0F);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawbase, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(leftUpperarm, 0.1638F, -0.2099F, -1.5941F);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftShoulderfluff, -0.2122F, 0.658F, 0.0213F);
        this.setRotateAngle(leftShin, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);
        this.setRotateAngle(leftHand, 0.2759F, 0.0F, 0.3396F);
        this.setRotateAngle(leftFoot, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftEye, 0.0F, 0.1344F, 0.0F);
        this.setRotateAngle(leftBackfluff2, 0.0637F, 0.0213F, -0.2335F);
        this.setRotateAngle(leftBackfluff1, 0.0637F, -0.0213F, 0.2335F);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.0712F, 0.0F, 0.0F);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(headFeathers, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.441F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard2, 0.4671F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard1, 0.7217F, 0.0F, 0.0F);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(chestfluff1, 0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(bodyMiddle, 0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(bodyFront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff4, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff3, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff2, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff1, 0.0637F, 0.0F, 0.0F);
        this.root.offsetY = -0.103F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.250F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(225);
        this.root.rotateAngleX = (float)Math.toRadians(-2);
        this.root.rotateAngleZ = (float)Math.toRadians(3);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff2, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(underfluff1, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(tailsidefluff2, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddleend, 0.0672F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddlebase, -0.1285F, 0.0F, 0.0F);
        this.setRotateAngle(tailMiddle, 0.0897F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff3, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff2, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(tailfluff1, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailEnd, 0.1946F, 0.0F, 0.0F);
        this.setRotateAngle(tailbrush, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(tailBase, 0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(rightUpperarm, 0.1638F, 0.2099F, 1.5941F);
        this.setRotateAngle(rightThigh, -0.4103F, 0.0F, 0.0F);
        this.setRotateAngle(rightShoulderfluff, -0.2122F, -0.658F, -0.0213F);
        this.setRotateAngle(rightShin, 0.3325F, 0.0F, 0.0F);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);
        this.setRotateAngle(rightLowerarm, -1.1675F, -0.0424F, -0.0637F);
        this.setRotateAngle(rightHand, 0.2759F, 0.0F, -0.3396F);
        this.setRotateAngle(rightFoot, 0.3667F, 0.0F, 0.0F);
        this.setRotateAngle(rightEye, 0.0F, -0.1344F, 0.0F);
        this.setRotateAngle(rightAnkle, -0.2264F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlefront, -0.171F, 0.0F, 0.0F);
        this.setRotateAngle(neckMiddlebase, 0.0955F, 0.0F, 0.0F);
        this.setRotateAngle(neckFront, -0.1639F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers3, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers2, -0.3609F, 0.0F, 0.0F);
        this.setRotateAngle(neckfeathers1, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(neckBase, -0.6133F, 0.0F, 0.0F);
        this.setRotateAngle(masseterRight, -0.3183F, 0.0213F, 0.0F);
        this.setRotateAngle(masseterLeft, -0.3183F, -0.0213F, 0.0F);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJawbase, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(leftUpperarm, 0.1638F, -0.2099F, -1.5941F);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftShoulderfluff, -0.2122F, 0.658F, 0.0213F);
        this.setRotateAngle(leftShin, 0.5943F, 0.0F, 0.0F);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);
        this.setRotateAngle(leftHand, 0.2759F, 0.0F, 0.3396F);
        this.setRotateAngle(leftFoot, 0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(leftEye, 0.0F, 0.1344F, 0.0F);
        this.setRotateAngle(leftBackfluff2, 0.0637F, 0.0213F, -0.2335F);
        this.setRotateAngle(leftBackfluff1, 0.0637F, -0.0213F, 0.2335F);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.0712F, 0.0F, 0.0F);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(headFeathers, 0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.441F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard2, 0.4671F, 0.0F, 0.0F);
        this.setRotateAngle(featherbeard1, 0.7217F, 0.0F, 0.0F);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);
        this.setRotateAngle(chestfluff1, 0.3396F, 0.0F, 0.0F);
        this.setRotateAngle(bodyMiddle, 0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(bodyFront, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff4, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff3, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff2, 0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(backfluff1, 0.0637F, 0.0F, 0.0F);
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

        EntityPrehistoricFloraChilesaurus entityChilesaurus = (EntityPrehistoricFloraChilesaurus) e;

        this.faceTarget(f3, f4, 12, neckBase);
        this.faceTarget(f3, f4, 12, neckMiddlebase);
        this.faceTarget(f3, f4, 12, neckMiddlefront);
        this.faceTarget(f3, f4, 12, neckFront);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tailBase, this.tailMiddlebase, this.tailMiddle, this.tailMiddleend, this.tailEnd};
        AdvancedModelRenderer[] Neck = {this.bodyFront, this.neckBase, this.neckMiddlebase, this.neckMiddlefront, this.neckFront, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftUpperarm, this.leftLowerarm, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightUpperarm, this.rightLowerarm, this.rightHand};

        entityChilesaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityChilesaurus.getAnimation() == entityChilesaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityChilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityChilesaurus.getIsMoving()) {
                    if (entityChilesaurus.getAnimation() != entityChilesaurus.EAT_ANIMATION
                        && entityChilesaurus.getAnimation() != entityChilesaurus.DRINK_ANIMATION) {
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityChilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraChilesaurus ee = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) { //
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //
            animShake(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -6.25 + (((tickAnim - 11) / 19) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 11) / 9) * (1.5-(-8.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 20) / 10) * (0-(1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 11) / 9) * (-11.75-(0.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 20) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 8.25 + (((tickAnim - 11) / 9) * (7.75-(8.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 20) / 10) * (0-(7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 11) / 9) * (-4.75-(-11.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 20) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 9) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (15.25-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 15.25 + (((tickAnim - 19) / 3) * (0-(15.25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawbase, lowerJawbase.rotateAngleX + (float) Math.toRadians(xx), lowerJawbase.rotateAngleY + (float) Math.toRadians(yy), lowerJawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 11) / 19) * (0-(13.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -37.25 + (((tickAnim - 11) / 19) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 11) / 19) * (0-(13.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -37.25 + (((tickAnim - 11) / 19) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 10) / 50) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -10 + (((tickAnim - 10) / 11) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 21) / 6) * (13.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 13.5 + (((tickAnim - 27) / 7) * (16-(13.5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 16 + (((tickAnim - 34) / 6) * (13.5-(16)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 13.5 + (((tickAnim - 40) / 11) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 13.5 + (((tickAnim - 51) / 9) * (0-(13.5)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -2.5 + (((tickAnim - 12) / 17) * (23.96-(-2.5)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 23.96 + (((tickAnim - 29) / 11) * (23.96-(23.96)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 23.96 + (((tickAnim - 40) / 12) * (23.96-(23.96)));
            yy = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 23.96 + (((tickAnim - 52) / 8) * (0-(23.96)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (20-(0)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 14) / 9) * (4.8-(20)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 4.8 + (((tickAnim - 23) / 8) * (15.34-(4.8)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 15.34 + (((tickAnim - 31) / 12) * (15.34-(15.34)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 15.34 + (((tickAnim - 43) / 9) * (15.34-(15.34)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 15.34 + (((tickAnim - 52) / 8) * (0-(15.34)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 10 + (((tickAnim - 13) / 16) * (-5.42-(10)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -5.42 + (((tickAnim - 29) / 14) * (-10.69-(-5.42)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -10.69 + (((tickAnim - 43) / 11) * (-10.69-(-10.69)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -10.69 + (((tickAnim - 54) / 6) * (0-(-10.69)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (7.6484-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (-10.34053-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (10.92591-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 7.6484 + (((tickAnim - 28) / 8) * (7.6484-(7.6484)));
            yy = -10.34053 + (((tickAnim - 28) / 8) * (-10.34053-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 28) / 8) * (10.92591-(10.92591)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 7.6484 + (((tickAnim - 36) / 7) * (-34.8516-(7.6484)));
            yy = -10.34053 + (((tickAnim - 36) / 7) * (-10.34053-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 36) / 7) * (10.92591-(10.92591)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -34.8516 + (((tickAnim - 43) / 8) * (-33.04366-(-34.8516)));
            yy = -10.34053 + (((tickAnim - 43) / 8) * (-10.10914-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 43) / 8) * (0.76683-(10.92591)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -33.04366 + (((tickAnim - 51) / 4) * (-33.04366-(-33.04366)));
            yy = -10.10914 + (((tickAnim - 51) / 4) * (-10.10914-(-10.10914)));
            zz = 0.76683 + (((tickAnim - 51) / 4) * (0.76683-(0.76683)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -33.04366 + (((tickAnim - 55) / 5) * (0-(-33.04366)));
            yy = -10.10914 + (((tickAnim - 55) / 5) * (0-(-10.10914)));
            zz = 0.76683 + (((tickAnim - 55) / 5) * (0-(0.76683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animShake(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-1.5-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 12) / 2) * (1.5-(-1.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 1.5 + (((tickAnim - 14) / 3) * (-1.5-(1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 17) / 2) * (1.5-(-1.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 1.5 + (((tickAnim - 19) / 3) * (-1.5-(1.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 22) / 2) * (1.5-(-1.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 1.5 + (((tickAnim - 24) / 3) * (-1.5-(1.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 27) / 2) * (1.5-(-1.5)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 1.5 + (((tickAnim - 29) / 1) * (0-(1.5)));
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 10) / 2) * (-0.05363-(5)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1.26981-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (4.83647-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.05363 + (((tickAnim - 12) / 2) * (2.44637-(-0.05363)));
            yy = -1.26981 + (((tickAnim - 12) / 2) * (1.26981-(-1.26981)));
            zz = 4.83647 + (((tickAnim - 12) / 2) * (-4.83647-(4.83647)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 2.44637 + (((tickAnim - 14) / 3) * (-0.05363-(2.44637)));
            yy = 1.26981 + (((tickAnim - 14) / 3) * (-1.26981-(1.26981)));
            zz = -4.83647 + (((tickAnim - 14) / 3) * (4.83647-(-4.83647)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.05363 + (((tickAnim - 17) / 2) * (2.44637-(-0.05363)));
            yy = -1.26981 + (((tickAnim - 17) / 2) * (1.26981-(-1.26981)));
            zz = 4.83647 + (((tickAnim - 17) / 2) * (-4.83647-(4.83647)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 2.44637 + (((tickAnim - 19) / 3) * (-0.05363-(2.44637)));
            yy = 1.26981 + (((tickAnim - 19) / 3) * (-1.26981-(1.26981)));
            zz = -4.83647 + (((tickAnim - 19) / 3) * (4.83647-(-4.83647)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -0.05363 + (((tickAnim - 22) / 2) * (4.94637-(-0.05363)));
            yy = -1.26981 + (((tickAnim - 22) / 2) * (1.26981-(-1.26981)));
            zz = 4.83647 + (((tickAnim - 22) / 2) * (-4.83647-(4.83647)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 4.94637 + (((tickAnim - 24) / 3) * (-0.05363-(4.94637)));
            yy = 1.26981 + (((tickAnim - 24) / 3) * (-1.26981-(1.26981)));
            zz = -4.83647 + (((tickAnim - 24) / 3) * (4.83647-(-4.83647)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.05363 + (((tickAnim - 27) / 3) * (5-(-0.05363)));
            yy = -1.26981 + (((tickAnim - 27) / 3) * (0-(-1.26981)));
            zz = 4.83647 + (((tickAnim - 27) / 3) * (0-(4.83647)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 30) / 3) * (4.98659-(5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.63547-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-2.41794-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 4.98659 + (((tickAnim - 33) / 3) * (4.98659-(4.98659)));
            yy = 0.63547 + (((tickAnim - 33) / 3) * (-0.63547-(0.63547)));
            zz = -2.41794 + (((tickAnim - 33) / 3) * (2.41794-(-2.41794)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 4.98659 + (((tickAnim - 36) / 3) * (5-(4.98659)));
            yy = -0.63547 + (((tickAnim - 36) / 3) * (0-(-0.63547)));
            zz = 2.41794 + (((tickAnim - 36) / 3) * (0-(2.41794)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 39) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 10) / 1) * (-5.00924-(-5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0.14096-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (-7.49868-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -5.00924 + (((tickAnim - 11) / 2) * (-7.50924-(-5.00924)));
            yy = 0.14096 + (((tickAnim - 11) / 2) * (-0.14096-(0.14096)));
            zz = -7.49868 + (((tickAnim - 11) / 2) * (7.49868-(-7.49868)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -7.50924 + (((tickAnim - 13) / 3) * (-5.00924-(-7.50924)));
            yy = -0.14096 + (((tickAnim - 13) / 3) * (0.14096-(-0.14096)));
            zz = 7.49868 + (((tickAnim - 13) / 3) * (-7.49868-(7.49868)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -5.00924 + (((tickAnim - 16) / 2) * (-7.50924-(-5.00924)));
            yy = 0.14096 + (((tickAnim - 16) / 2) * (-0.14096-(0.14096)));
            zz = -7.49868 + (((tickAnim - 16) / 2) * (7.49868-(-7.49868)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -7.50924 + (((tickAnim - 18) / 3) * (-5.00924-(-7.50924)));
            yy = -0.14096 + (((tickAnim - 18) / 3) * (0.14096-(-0.14096)));
            zz = 7.49868 + (((tickAnim - 18) / 3) * (-7.49868-(7.49868)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -5.00924 + (((tickAnim - 21) / 2) * (-7.50924-(-5.00924)));
            yy = 0.14096 + (((tickAnim - 21) / 2) * (-0.14096-(0.14096)));
            zz = -7.49868 + (((tickAnim - 21) / 2) * (7.49868-(-7.49868)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -7.50924 + (((tickAnim - 23) / 3) * (-5.00924-(-7.50924)));
            yy = -0.14096 + (((tickAnim - 23) / 3) * (0.14096-(-0.14096)));
            zz = 7.49868 + (((tickAnim - 23) / 3) * (-7.49868-(7.49868)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -5.00924 + (((tickAnim - 26) / 2) * (-7.50924-(-5.00924)));
            yy = 0.14096 + (((tickAnim - 26) / 2) * (-0.14096-(0.14096)));
            zz = -7.49868 + (((tickAnim - 26) / 2) * (7.49868-(-7.49868)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -7.50924 + (((tickAnim - 28) / 2) * (-5-(-7.50924)));
            yy = -0.14096 + (((tickAnim - 28) / 2) * (0-(-0.14096)));
            zz = 7.49868 + (((tickAnim - 28) / 2) * (0-(7.49868)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 30) / 3) * (-5.00103-(-5)));
            yy = 0 + (((tickAnim - 30) / 3) * (-0.04711-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (2.49956-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -5.00103 + (((tickAnim - 33) / 2) * (-5.00103-(-5.00103)));
            yy = -0.04711 + (((tickAnim - 33) / 2) * (0.04711-(-0.04711)));
            zz = 2.49956 + (((tickAnim - 33) / 2) * (-2.49956-(2.49956)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -5.00103 + (((tickAnim - 35) / 3) * (-5.00103-(-5.00103)));
            yy = 0.04711 + (((tickAnim - 35) / 3) * (-0.04711-(0.04711)));
            zz = -2.49956 + (((tickAnim - 35) / 3) * (2.49956-(-2.49956)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -5.00103 + (((tickAnim - 38) / 1) * (-5-(-5.00103)));
            yy = -0.04711 + (((tickAnim - 38) / 1) * (0-(-0.04711)));
            zz = 2.49956 + (((tickAnim - 38) / 1) * (0-(2.49956)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 39) / 11) * (0-(-5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 10) / 18) * (20-(20)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 28) / 2) * (20.63364-(20)));
            yy = 0 + (((tickAnim - 28) / 2) * (5.11271-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (14.12062-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 20.63364 + (((tickAnim - 30) / 3) * (20.63364-(20.63364)));
            yy = 5.11271 + (((tickAnim - 30) / 3) * (-5.11271-(5.11271)));
            zz = 14.12062 + (((tickAnim - 30) / 3) * (-14.12062-(14.12062)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 20.63364 + (((tickAnim - 33) / 2) * (20.63364-(20.63364)));
            yy = -5.11271 + (((tickAnim - 33) / 2) * (5.11271-(-5.11271)));
            zz = -14.12062 + (((tickAnim - 33) / 2) * (14.12062-(-14.12062)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 20.63364 + (((tickAnim - 35) / 3) * (20.63364-(20.63364)));
            yy = 5.11271 + (((tickAnim - 35) / 3) * (-5.11271-(5.11271)));
            zz = 14.12062 + (((tickAnim - 35) / 3) * (-14.12062-(14.12062)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20.63364 + (((tickAnim - 38) / 2) * (20.63364-(20.63364)));
            yy = -5.11271 + (((tickAnim - 38) / 2) * (5.11271-(-5.11271)));
            zz = -14.12062 + (((tickAnim - 38) / 2) * (14.12062-(-14.12062)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 20.63364 + (((tickAnim - 40) / 5) * (20-(20.63364)));
            yy = 5.11271 + (((tickAnim - 40) / 5) * (0-(5.11271)));
            zz = 14.12062 + (((tickAnim - 40) / 5) * (0-(14.12062)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 45) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 10) / 18) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 28) / 2) * (20.63364-(10)));
            yy = 0 + (((tickAnim - 28) / 2) * (5.11271-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (14.12062-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 20.63364 + (((tickAnim - 30) / 3) * (20.63364-(20.63364)));
            yy = 5.11271 + (((tickAnim - 30) / 3) * (-5.11271-(5.11271)));
            zz = 14.12062 + (((tickAnim - 30) / 3) * (-14.12062-(14.12062)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 20.63364 + (((tickAnim - 33) / 2) * (20.63364-(20.63364)));
            yy = -5.11271 + (((tickAnim - 33) / 2) * (5.11271-(-5.11271)));
            zz = -14.12062 + (((tickAnim - 33) / 2) * (14.12062-(-14.12062)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 20.63364 + (((tickAnim - 35) / 3) * (20.63364-(20.63364)));
            yy = 5.11271 + (((tickAnim - 35) / 3) * (-5.11271-(5.11271)));
            zz = 14.12062 + (((tickAnim - 35) / 3) * (-14.12062-(14.12062)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20.63364 + (((tickAnim - 38) / 2) * (20.63364-(20.63364)));
            yy = -5.11271 + (((tickAnim - 38) / 2) * (5.11271-(-5.11271)));
            zz = -14.12062 + (((tickAnim - 38) / 2) * (14.12062-(-14.12062)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 20.63364 + (((tickAnim - 40) / 10) * (0-(20.63364)));
            yy = 5.11271 + (((tickAnim - 40) / 10) * (0-(5.11271)));
            zz = 14.12062 + (((tickAnim - 40) / 10) * (0-(14.12062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 10) / 18) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 28) / 2) * (12.45575-(12.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.67782-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (7.46948-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 12.45575 + (((tickAnim - 30) / 3) * (12.45575-(12.45575)));
            yy = -0.67782 + (((tickAnim - 30) / 3) * (0.67782-(-0.67782)));
            zz = 7.46948 + (((tickAnim - 30) / 3) * (-7.46948-(7.46948)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.45575 + (((tickAnim - 33) / 2) * (12.45575-(12.45575)));
            yy = 0.67782 + (((tickAnim - 33) / 2) * (-0.67782-(0.67782)));
            zz = -7.46948 + (((tickAnim - 33) / 2) * (7.46948-(-7.46948)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 12.45575 + (((tickAnim - 35) / 3) * (12.45575-(12.45575)));
            yy = -0.67782 + (((tickAnim - 35) / 3) * (0.67782-(-0.67782)));
            zz = 7.46948 + (((tickAnim - 35) / 3) * (-7.46948-(7.46948)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 12.45575 + (((tickAnim - 38) / 1) * (12.5-(12.45575)));
            yy = 0.67782 + (((tickAnim - 38) / 1) * (0-(0.67782)));
            zz = -7.46948 + (((tickAnim - 38) / 1) * (0-(-7.46948)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 39) / 11) * (0-(12.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -7.5 + (((tickAnim - 10) / 18) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 28) / 2) * (-7.62711-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-2.01281-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (7.22635-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -7.62711 + (((tickAnim - 30) / 3) * (-7.62711-(-7.62711)));
            yy = -2.01281 + (((tickAnim - 30) / 3) * (2.01281-(-2.01281)));
            zz = 7.22635 + (((tickAnim - 30) / 3) * (-7.22635-(7.22635)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -7.62711 + (((tickAnim - 33) / 2) * (-7.62711-(-7.62711)));
            yy = 2.01281 + (((tickAnim - 33) / 2) * (-2.01281-(2.01281)));
            zz = -7.22635 + (((tickAnim - 33) / 2) * (7.22635-(-7.22635)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -7.62711 + (((tickAnim - 35) / 3) * (-7.62711-(-7.62711)));
            yy = -2.01281 + (((tickAnim - 35) / 3) * (2.01281-(-2.01281)));
            zz = 7.22635 + (((tickAnim - 35) / 3) * (-7.22635-(7.22635)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -7.62711 + (((tickAnim - 38) / 1) * (-7.5-(-7.62711)));
            yy = 2.01281 + (((tickAnim - 38) / 1) * (0-(2.01281)));
            zz = -7.22635 + (((tickAnim - 38) / 1) * (0-(-7.22635)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 39) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -7.5 + (((tickAnim - 10) / 18) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 28) / 2) * (-11.53676-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (7.75981-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (14.90133-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -11.53676 + (((tickAnim - 30) / 3) * (-11.53676-(-11.53676)));
            yy = 7.75981 + (((tickAnim - 30) / 3) * (-7.75981-(7.75981)));
            zz = 14.90133 + (((tickAnim - 30) / 3) * (-14.90133-(14.90133)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -11.53676 + (((tickAnim - 33) / 2) * (-11.53676-(-11.53676)));
            yy = -7.75981 + (((tickAnim - 33) / 2) * (7.75981-(-7.75981)));
            zz = -14.90133 + (((tickAnim - 33) / 2) * (14.90133-(-14.90133)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -11.53676 + (((tickAnim - 35) / 3) * (-11.53676-(-11.53676)));
            yy = 7.75981 + (((tickAnim - 35) / 3) * (-7.75981-(7.75981)));
            zz = 14.90133 + (((tickAnim - 35) / 3) * (-14.90133-(14.90133)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -11.53676 + (((tickAnim - 38) / 1) * (-7.5-(-11.53676)));
            yy = -7.75981 + (((tickAnim - 38) / 1) * (0-(-7.75981)));
            zz = -14.90133 + (((tickAnim - 38) / 1) * (0-(-14.90133)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 39) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 10) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (4.80365-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-14.375-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -25.35037 + (((tickAnim - 13) / 3) * (-27.5-(-25.35037)));
            yy = 4.80365 + (((tickAnim - 13) / 3) * (0-(4.80365)));
            zz = -14.375 + (((tickAnim - 13) / 3) * (0-(-14.375)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 16) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (4.80365-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (-14.375-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -25.35037 + (((tickAnim - 19) / 3) * (-27.5-(-25.35037)));
            yy = 4.80365 + (((tickAnim - 19) / 3) * (0-(4.80365)));
            zz = -14.375 + (((tickAnim - 19) / 3) * (0-(-14.375)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 22) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (4.80365-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-14.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -25.35037 + (((tickAnim - 25) / 3) * (-27.5-(-25.35037)));
            yy = 4.80365 + (((tickAnim - 25) / 3) * (0-(4.80365)));
            zz = -14.375 + (((tickAnim - 25) / 3) * (0-(-14.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 28) / 22) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 10) / 18) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 28) / 22) * (0-(10)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 10) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-4.80365-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (14.375-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -25.35037 + (((tickAnim - 13) / 3) * (-27.5-(-25.35037)));
            yy = -4.80365 + (((tickAnim - 13) / 3) * (0-(-4.80365)));
            zz = 14.375 + (((tickAnim - 13) / 3) * (0-(14.375)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 16) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (-4.80365-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (14.375-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -25.35037 + (((tickAnim - 19) / 3) * (-27.5-(-25.35037)));
            yy = -4.80365 + (((tickAnim - 19) / 3) * (0-(-4.80365)));
            zz = 14.375 + (((tickAnim - 19) / 3) * (0-(14.375)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 22) / 3) * (-25.35037-(-27.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (-4.80365-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (14.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -25.35037 + (((tickAnim - 25) / 3) * (-27.5-(-25.35037)));
            yy = -4.80365 + (((tickAnim - 25) / 3) * (0-(-4.80365)));
            zz = 14.375 + (((tickAnim - 25) / 3) * (0-(14.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 28) / 22) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 10) / 18) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 28) / 22) * (0-(10)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.5 + (((tickAnim - 12) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 2) * (5-(-5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 14) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 17) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 17) / 2) * (5-(-5)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 19) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 22) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 22) / 2) * (5-(-5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 27) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 27) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 35) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 38) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(xx), tailBase.rotateAngleY + (float) Math.toRadians(yy), tailBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (10-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 12) / 2) * (-10-(10)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 14) / 3) * (10-(-10)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 17) / 2) * (-10-(10)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 19) / 3) * (10-(-10)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 22) / 2) * (-10-(10)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 24) / 3) * (10-(-10)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 27) / 3) * (0-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 32) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 34) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 37) / 2) * (0-(-2.5)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailMiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0.23036-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (2.90506-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-2.72357-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.23036 + (((tickAnim - 12) / 2) * (0.23036-(0.23036)));
            yy = 2.90506 + (((tickAnim - 12) / 2) * (-2.90506-(2.90506)));
            zz = -2.72357 + (((tickAnim - 12) / 2) * (2.72357-(-2.72357)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.23036 + (((tickAnim - 14) / 3) * (0.23036-(0.23036)));
            yy = -2.90506 + (((tickAnim - 14) / 3) * (2.90506-(-2.90506)));
            zz = 2.72357 + (((tickAnim - 14) / 3) * (-2.72357-(2.72357)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.23036 + (((tickAnim - 17) / 2) * (0.23036-(0.23036)));
            yy = 2.90506 + (((tickAnim - 17) / 2) * (-2.90506-(2.90506)));
            zz = -2.72357 + (((tickAnim - 17) / 2) * (2.72357-(-2.72357)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.23036 + (((tickAnim - 19) / 3) * (0.23036-(0.23036)));
            yy = -2.90506 + (((tickAnim - 19) / 3) * (2.90506-(-2.90506)));
            zz = 2.72357 + (((tickAnim - 19) / 3) * (-2.72357-(2.72357)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0.23036 + (((tickAnim - 22) / 2) * (0.23036-(0.23036)));
            yy = 2.90506 + (((tickAnim - 22) / 2) * (-2.90506-(2.90506)));
            zz = -2.72357 + (((tickAnim - 22) / 2) * (2.72357-(-2.72357)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0.23036 + (((tickAnim - 24) / 3) * (0.23036-(0.23036)));
            yy = -2.90506 + (((tickAnim - 24) / 3) * (2.90506-(-2.90506)));
            zz = 2.72357 + (((tickAnim - 24) / 3) * (-2.72357-(2.72357)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0.23036 + (((tickAnim - 27) / 2) * (0.23036-(0.23036)));
            yy = 2.90506 + (((tickAnim - 27) / 2) * (-2.90506-(2.90506)));
            zz = -2.72357 + (((tickAnim - 27) / 2) * (2.72357-(-2.72357)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0.23036 + (((tickAnim - 29) / 1) * (0-(0.23036)));
            yy = -2.90506 + (((tickAnim - 29) / 1) * (0-(-2.90506)));
            zz = 2.72357 + (((tickAnim - 29) / 1) * (0-(2.72357)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 35) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 38) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(xx), tailMiddle.rotateAngleY + (float) Math.toRadians(yy), tailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0.20739-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (5.1448-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (4.68587-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.20739 + (((tickAnim - 12) / 2) * (0.20739-(0.20739)));
            yy = 5.1448 + (((tickAnim - 12) / 2) * (-5.1448-(5.1448)));
            zz = 4.68587 + (((tickAnim - 12) / 2) * (-4.68587-(4.68587)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.20739 + (((tickAnim - 14) / 3) * (0.20739-(0.20739)));
            yy = -5.1448 + (((tickAnim - 14) / 3) * (5.1448-(-5.1448)));
            zz = -4.68587 + (((tickAnim - 14) / 3) * (4.68587-(-4.68587)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.20739 + (((tickAnim - 17) / 2) * (0.20739-(0.20739)));
            yy = 5.1448 + (((tickAnim - 17) / 2) * (-5.1448-(5.1448)));
            zz = 4.68587 + (((tickAnim - 17) / 2) * (-4.68587-(4.68587)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.20739 + (((tickAnim - 19) / 3) * (0.20739-(0.20739)));
            yy = -5.1448 + (((tickAnim - 19) / 3) * (5.1448-(-5.1448)));
            zz = -4.68587 + (((tickAnim - 19) / 3) * (4.68587-(-4.68587)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0.20739 + (((tickAnim - 22) / 2) * (0.20739-(0.20739)));
            yy = 5.1448 + (((tickAnim - 22) / 2) * (-5.1448-(5.1448)));
            zz = 4.68587 + (((tickAnim - 22) / 2) * (-4.68587-(4.68587)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0.20739 + (((tickAnim - 24) / 3) * (0.20739-(0.20739)));
            yy = -5.1448 + (((tickAnim - 24) / 3) * (5.1448-(-5.1448)));
            zz = -4.68587 + (((tickAnim - 24) / 3) * (4.68587-(-4.68587)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0.20739 + (((tickAnim - 27) / 2) * (0.20739-(0.20739)));
            yy = 5.1448 + (((tickAnim - 27) / 2) * (-5.1448-(5.1448)));
            zz = 4.68587 + (((tickAnim - 27) / 2) * (-4.68587-(4.68587)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0.20739 + (((tickAnim - 29) / 1) * (0-(0.20739)));
            yy = -5.1448 + (((tickAnim - 29) / 1) * (0-(-5.1448)));
            zz = -4.68587 + (((tickAnim - 29) / 1) * (0-(-4.68587)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 32) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 34) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 37) / 2) * (0-(-2.5)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(xx), tailMiddleend.rotateAngleY + (float) Math.toRadians(yy), tailMiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0.95034-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (6.9597-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (7.54058-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.95034 + (((tickAnim - 12) / 2) * (0.95034-(0.95034)));
            yy = 6.9597 + (((tickAnim - 12) / 2) * (-6.9597-(6.9597)));
            zz = 7.54058 + (((tickAnim - 12) / 2) * (-7.54058-(7.54058)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.95034 + (((tickAnim - 14) / 3) * (0.95034-(0.95034)));
            yy = -6.9597 + (((tickAnim - 14) / 3) * (6.9597-(-6.9597)));
            zz = -7.54058 + (((tickAnim - 14) / 3) * (7.54058-(-7.54058)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.95034 + (((tickAnim - 17) / 2) * (0.95034-(0.95034)));
            yy = 6.9597 + (((tickAnim - 17) / 2) * (-6.9597-(6.9597)));
            zz = 7.54058 + (((tickAnim - 17) / 2) * (-7.54058-(7.54058)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.95034 + (((tickAnim - 19) / 3) * (0.95034-(0.95034)));
            yy = -6.9597 + (((tickAnim - 19) / 3) * (6.9597-(-6.9597)));
            zz = -7.54058 + (((tickAnim - 19) / 3) * (7.54058-(-7.54058)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0.95034 + (((tickAnim - 22) / 2) * (0.95034-(0.95034)));
            yy = 6.9597 + (((tickAnim - 22) / 2) * (-6.9597-(6.9597)));
            zz = 7.54058 + (((tickAnim - 22) / 2) * (-7.54058-(7.54058)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0.95034 + (((tickAnim - 24) / 2) * (0.95034-(0.95034)));
            yy = -6.9597 + (((tickAnim - 24) / 2) * (6.9597-(-6.9597)));
            zz = -7.54058 + (((tickAnim - 24) / 2) * (7.54058-(-7.54058)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0.95034 + (((tickAnim - 26) / 2) * (0.95034-(0.95034)));
            yy = 6.9597 + (((tickAnim - 26) / 2) * (-6.9597-(6.9597)));
            zz = 7.54058 + (((tickAnim - 26) / 2) * (-7.54058-(7.54058)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.95034 + (((tickAnim - 28) / 2) * (0-(0.95034)));
            yy = -6.9597 + (((tickAnim - 28) / 2) * (0-(-6.9597)));
            zz = -7.54058 + (((tickAnim - 28) / 2) * (0-(-7.54058)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 32) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 34) / 3) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 37) / 2) * (0-(-2.5)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailEnd, tailEnd.rotateAngleX + (float) Math.toRadians(xx), tailEnd.rotateAngleY + (float) Math.toRadians(yy), tailEnd.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.00574-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.26471-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.48596-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.00574 + (((tickAnim - 12) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 12) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 12) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.00078 + (((tickAnim - 14) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 14) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 14) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.00574 + (((tickAnim - 17) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 17) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 17) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.00078 + (((tickAnim - 19) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 19) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 19) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -0.00574 + (((tickAnim - 22) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 22) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 22) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -0.00078 + (((tickAnim - 24) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 24) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 24) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -0.00574 + (((tickAnim - 27) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 27) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 27) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -0.00078 + (((tickAnim - 29) / 1) * (0-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 29) / 1) * (0-(0.03613)));
            zz = -0.33899 + (((tickAnim - 29) / 1) * (0-(-0.33899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.00574-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.26471-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.48596-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.00574 + (((tickAnim - 12) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 12) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 12) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.00078 + (((tickAnim - 14) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 14) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 14) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.00574 + (((tickAnim - 17) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 17) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 17) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.00078 + (((tickAnim - 19) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 19) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 19) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -0.00574 + (((tickAnim - 22) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 22) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 22) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -0.00078 + (((tickAnim - 24) / 3) * (-0.00574-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 24) / 3) * (-0.26471-(0.03613)));
            zz = -0.33899 + (((tickAnim - 24) / 3) * (2.48596-(-0.33899)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -0.00574 + (((tickAnim - 27) / 2) * (-0.00078-(-0.00574)));
            yy = -0.26471 + (((tickAnim - 27) / 2) * (0.03613-(-0.26471)));
            zz = 2.48596 + (((tickAnim - 27) / 2) * (-0.33899-(2.48596)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -0.00078 + (((tickAnim - 29) / 1) * (0-(-0.00078)));
            yy = 0.03613 + (((tickAnim - 29) / 1) * (0-(0.03613)));
            zz = -0.33899 + (((tickAnim - 29) / 1) * (0-(-0.33899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 3) / 4) * (3.5-(5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 7) / 13) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 3.5 + (((tickAnim - 20) / 1) * (2.5-(3.5)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 2.5 + (((tickAnim - 21) / 8) * (0-(2.5)));
            yy = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 7) / 19) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 26) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.4665-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.17441-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.8302-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 14.4665 + (((tickAnim - 7) / 19) * (14.4665-(14.4665)));
            yy = -3.17441 + (((tickAnim - 7) / 19) * (-3.17441-(-3.17441)));
            zz = -2.8302 + (((tickAnim - 7) / 19) * (-2.8302-(-2.8302)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 14.4665 + (((tickAnim - 26) / 4) * (0-(14.4665)));
            yy = -3.17441 + (((tickAnim - 26) / 4) * (0-(-3.17441)));
            zz = -2.8302 + (((tickAnim - 26) / 4) * (0-(-2.8302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 25 + (((tickAnim - 7) / 7) * (20-(25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 14) / 6) * (21.17-(20)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 21.17 + (((tickAnim - 20) / 6) * (25-(21.17)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 25 + (((tickAnim - 26) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -5 + (((tickAnim - 7) / 7) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 14) / 3) * (-9-(-7.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = -9 + (((tickAnim - 17) / 9) * (-5-(-9)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 26) / 4) * (0-(-5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = -25 + (((tickAnim - 7) / 19) * (-25-(-25)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -25 + (((tickAnim - 26) / 4) * (0-(-25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -15 + (((tickAnim - 7) / 5) * (-12.5-(-15)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -12.5 + (((tickAnim - 12) / 5) * (-15.83-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -15.83 + (((tickAnim - 17) / 4) * (-12.91-(-15.83)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -12.91 + (((tickAnim - 21) / 5) * (-15-(-12.91)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 26) / 4) * (0-(-15)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 32.5 + (((tickAnim - 7) / 5) * (37.5-(32.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 37.5 + (((tickAnim - 12) / 7) * (28.75-(37.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 28.75 + (((tickAnim - 19) / 7) * (20-(28.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 26) / 4) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawbase, lowerJawbase.rotateAngleX + (float) Math.toRadians(xx), lowerJawbase.rotateAngleY + (float) Math.toRadians(yy), lowerJawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-90-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35 + (((tickAnim - 7) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 7) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 7) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -35.02564 + (((tickAnim - 8) / 0) * (-42.5-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 8) / 0) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 8) / 0) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -42.5 + (((tickAnim - 8) / 1) * (-35.02564-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 8) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -35.02564 + (((tickAnim - 9) / 1) * (-40-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 9) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 9) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -40 + (((tickAnim - 10) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 10) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 10) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -35.02564 + (((tickAnim - 11) / 1) * (-40-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 11) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 11) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 12) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 12) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 12) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -35.02564 + (((tickAnim - 13) / 0) * (-42.5-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 13) / 0) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 13) / 0) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -42.5 + (((tickAnim - 13) / 1) * (-22.52564-(-42.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 13) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -22.52564 + (((tickAnim - 14) / 1) * (-40-(-22.52564)));
            yy = -2.04767 + (((tickAnim - 14) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 14) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -40 + (((tickAnim - 15) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 15) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 15) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -35.02564 + (((tickAnim - 16) / 1) * (-35-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 16) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 16) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35 + (((tickAnim - 17) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 17) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 17) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -35.02564 + (((tickAnim - 18) / 0) * (-42.5-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 18) / 0) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 18) / 0) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -42.5 + (((tickAnim - 18) / 1) * (-35.02564-(-42.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 18) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -35.02564 + (((tickAnim - 19) / 1) * (-45-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 19) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 19) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -45 + (((tickAnim - 20) / 1) * (-35-(-45)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -90 + (((tickAnim - 20) / 1) * (-90-(-90)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -35 + (((tickAnim - 21) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 21) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 21) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -35.02564 + (((tickAnim - 22) / 1) * (-35-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 22) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 22) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -35 + (((tickAnim - 23) / 0) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 23) / 0) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 23) / 0) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -35.02564 + (((tickAnim - 23) / 1) * (-40-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 23) / 1) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 23) / 1) * (-90-(-88.56545)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -40 + (((tickAnim - 24) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 24) / 1) * (-2.04767-(0)));
            zz = -90 + (((tickAnim - 24) / 1) * (-88.56545-(-90)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -35.02564 + (((tickAnim - 25) / 5) * (0-(-35.02564)));
            yy = -2.04767 + (((tickAnim - 25) / 5) * (0-(-2.04767)));
            zz = -88.56545 + (((tickAnim - 25) / 5) * (0-(-88.56545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (90-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35 + (((tickAnim - 7) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 7) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 7) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -35.02564 + (((tickAnim - 8) / 0) * (-42.5-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 8) / 0) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 8) / 0) * (90-(88.56545)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -42.5 + (((tickAnim - 8) / 1) * (-35.02564-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 8) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -35.02564 + (((tickAnim - 9) / 1) * (-40-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 9) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 9) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -40 + (((tickAnim - 10) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 10) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 10) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -35.02564 + (((tickAnim - 11) / 1) * (-40-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 11) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 11) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 12) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 12) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 12) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -35.02564 + (((tickAnim - 13) / 0) * (-42.5-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 13) / 0) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 13) / 0) * (90-(88.56545)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -42.5 + (((tickAnim - 13) / 1) * (-22.52564-(-42.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 13) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -22.52564 + (((tickAnim - 14) / 1) * (-40-(-22.52564)));
            yy = 2.04767 + (((tickAnim - 14) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 14) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -40 + (((tickAnim - 15) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 15) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 15) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -35.02564 + (((tickAnim - 16) / 1) * (-35-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 16) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 16) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35 + (((tickAnim - 17) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 17) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 17) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -35.02564 + (((tickAnim - 18) / 0) * (-42.5-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 18) / 0) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 18) / 0) * (90-(88.56545)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -42.5 + (((tickAnim - 18) / 1) * (-35.02564-(-42.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 18) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -35.02564 + (((tickAnim - 19) / 1) * (-45-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 19) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 19) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -45 + (((tickAnim - 20) / 1) * (-35-(-45)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 90 + (((tickAnim - 20) / 1) * (90-(90)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -35 + (((tickAnim - 21) / 1) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 21) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 21) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -35.02564 + (((tickAnim - 22) / 1) * (-35-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 22) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 22) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -35 + (((tickAnim - 23) / 0) * (-35.02564-(-35)));
            yy = 0 + (((tickAnim - 23) / 0) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 23) / 0) * (88.56545-(90)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -35.02564 + (((tickAnim - 23) / 1) * (-40-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 23) / 1) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 23) / 1) * (90-(88.56545)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -40 + (((tickAnim - 24) / 1) * (-35.02564-(-40)));
            yy = 0 + (((tickAnim - 24) / 1) * (2.04767-(0)));
            zz = 90 + (((tickAnim - 24) / 1) * (88.56545-(90)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -35.02564 + (((tickAnim - 25) / 5) * (0-(-35.02564)));
            yy = 2.04767 + (((tickAnim - 25) / 5) * (0-(2.04767)));
            zz = 88.56545 + (((tickAnim - 25) / 5) * (0-(88.56545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 7) / 10) * (-1-(-5)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -1 + (((tickAnim - 17) / 6) * (4.5-(-1)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.5 + (((tickAnim - 23) / 7) * (0-(4.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(xx), tailBase.rotateAngleY + (float) Math.toRadians(yy), tailBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 7) / 6) * (5-(10)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5 + (((tickAnim - 13) / 4) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 20) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailMiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.68-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.68 + (((tickAnim - 7) / 3) * (3.18-(0.68)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.18 + (((tickAnim - 10) / 3) * (8.18-(3.18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 8.18 + (((tickAnim - 13) / 17) * (0-(8.18)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(xx), tailMiddle.rotateAngleY + (float) Math.toRadians(yy), tailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 7.5 + (((tickAnim - 7) / 9) * (0-(7.5)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (2.5-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (0-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(xx), tailMiddleend.rotateAngleY + (float) Math.toRadians(yy), tailMiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 7) / 8) * (-7.5-(7.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 15) / 3) * (-2.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 18) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailEnd, tailEnd.rotateAngleX + (float) Math.toRadians(xx), tailEnd.rotateAngleY + (float) Math.toRadians(yy), tailEnd.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -33.75 + (((tickAnim - 3) / 4) * (-12.5-(-33.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = -12.5 + (((tickAnim - 7) / 14) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -12.5 + (((tickAnim - 21) / 5) * (-33.75-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -33.75 + (((tickAnim - 26) / 4) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 3) / 4) * (-15-(12.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = -15 + (((tickAnim - 7) / 14) * (-15-(-15)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -15 + (((tickAnim - 21) / 5) * (12.5-(-15)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 26) / 4) * (0-(12.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightShin, rightShin.rotateAngleX + (float) Math.toRadians(xx), rightShin.rotateAngleY + (float) Math.toRadians(yy), rightShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 3) / 4) * (15-(12.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 7) / 14) * (15-(15)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 15 + (((tickAnim - 21) / 5) * (12.5-(15)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 26) / 4) * (0-(12.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAnkle, rightAnkle.rotateAngleX + (float) Math.toRadians(xx), rightAnkle.rotateAngleY + (float) Math.toRadians(yy), rightAnkle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 7) / 14) * (10-(10)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 21) / 9) * (0-(10)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 7) / 14) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 21) / 9) * (0-(7.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 7) / 14) * (-5-(-5)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 21) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftShin, leftShin.rotateAngleX + (float) Math.toRadians(xx), leftShin.rotateAngleY + (float) Math.toRadians(yy), leftShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAnkle, leftAnkle.rotateAngleX + (float) Math.toRadians(xx), leftAnkle.rotateAngleY + (float) Math.toRadians(yy), leftAnkle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 7) / 14) * (-5-(-5)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 21) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 22) {
            xx = 7.5 + (((tickAnim - 5) / 17) * (22.36765-(7.5)));
            yy = 0 + (((tickAnim - 5) / 17) * (10.23829-(0)));
            zz = 0 + (((tickAnim - 5) / 17) * (-3.48207-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 22.36765 + (((tickAnim - 22) / 5) * (10.57924-(22.36765)));
            yy = 10.23829 + (((tickAnim - 22) / 5) * (3.35217-(10.23829)));
            zz = -3.48207 + (((tickAnim - 22) / 5) * (0.84532-(-3.48207)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 10.57924 + (((tickAnim - 27) / 5) * (4.98942-(10.57924)));
            yy = 3.35217 + (((tickAnim - 27) / 5) * (1.808-(3.35217)));
            zz = 0.84532 + (((tickAnim - 27) / 5) * (-1.13654-(0.84532)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 4.98942 + (((tickAnim - 32) / 6) * (6.07093-(4.98942)));
            yy = 1.808 + (((tickAnim - 32) / 6) * (1.36703-(1.808)));
            zz = -1.13654 + (((tickAnim - 32) / 6) * (-0.85933-(-1.13654)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.07093 + (((tickAnim - 38) / 2) * (0-(6.07093)));
            yy = 1.36703 + (((tickAnim - 38) / 2) * (0-(1.36703)));
            zz = -0.85933 + (((tickAnim - 38) / 2) * (0-(-0.85933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 22.5 + (((tickAnim - 19) / 7) * (4.40929-(22.5)));
            yy = 0 + (((tickAnim - 19) / 7) * (8.424-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (3.12093-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 4.40929 + (((tickAnim - 26) / 7) * (-4.64292-(4.40929)));
            yy = 8.424 + (((tickAnim - 26) / 7) * (2.56806-(8.424)));
            zz = 3.12093 + (((tickAnim - 26) / 7) * (3.03362-(3.12093)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -4.64292 + (((tickAnim - 33) / 7) * (0-(-4.64292)));
            yy = 2.56806 + (((tickAnim - 33) / 7) * (0-(2.56806)));
            zz = 3.03362 + (((tickAnim - 33) / 7) * (0-(3.03362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 16) / 5) * (11.26778-(10)));
            yy = 0 + (((tickAnim - 16) / 5) * (4.21049-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (-0.01656-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 11.26778 + (((tickAnim - 21) / 3) * (9.35249-(11.26778)));
            yy = 4.21049 + (((tickAnim - 21) / 3) * (4.34366-(4.21049)));
            zz = -0.01656 + (((tickAnim - 21) / 3) * (-0.11706-(-0.01656)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 9.35249 + (((tickAnim - 24) / 4) * (7.07348-(9.35249)));
            yy = 4.34366 + (((tickAnim - 24) / 4) * (9.99992-(4.34366)));
            zz = -0.11706 + (((tickAnim - 24) / 4) * (-0.03933-(-0.11706)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.07348 + (((tickAnim - 28) / 5) * (-1.19094-(7.07348)));
            yy = 9.99992 + (((tickAnim - 28) / 5) * (6.48541-(9.99992)));
            zz = -0.03933 + (((tickAnim - 28) / 5) * (3.31135-(-0.03933)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -1.19094 + (((tickAnim - 33) / 7) * (0-(-1.19094)));
            yy = 6.48541 + (((tickAnim - 33) / 7) * (0-(6.48541)));
            zz = 3.31135 + (((tickAnim - 33) / 7) * (0-(3.31135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = -7.5 + (((tickAnim - 21) / 13) * (0.13-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.13 + (((tickAnim - 34) / 6) * (0-(0.13)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (32.5-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 32.5 + (((tickAnim - 22) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawbase, lowerJawbase.rotateAngleX + (float) Math.toRadians(xx), lowerJawbase.rotateAngleY + (float) Math.toRadians(yy), lowerJawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-92.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -92.5 + (((tickAnim - 8) / 4) * (-92.5-(-92.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -92.5 + (((tickAnim - 12) / 3) * (-73.62-(-92.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -73.62 + (((tickAnim - 15) / 3) * (-90.71496-(-73.62)));
            yy = 0 + (((tickAnim - 15) / 3) * (3.60439-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (3.55365-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -90.71496 + (((tickAnim - 18) / 5) * (-113.85-(-90.71496)));
            yy = 3.60439 + (((tickAnim - 18) / 5) * (0-(3.60439)));
            zz = 3.55365 + (((tickAnim - 18) / 5) * (0-(3.55365)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -113.85 + (((tickAnim - 23) / 10) * (-20.87-(-113.85)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -20.87 + (((tickAnim - 33) / 7) * (0-(-20.87)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (55-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 6) * (0-(5)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 55 + (((tickAnim - 6) / 6) * (-7.50052-(55)));
            yy = 0 + (((tickAnim - 6) / 6) * (4.81581-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (1.34502-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -7.50052 + (((tickAnim - 12) / 6) * (5.70799-(-7.50052)));
            yy = 4.81581 + (((tickAnim - 12) / 6) * (6.81177-(4.81581)));
            zz = 1.34502 + (((tickAnim - 12) / 6) * (3.11629-(1.34502)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.70799 + (((tickAnim - 18) / 5) * (13.82329-(5.70799)));
            yy = 6.81177 + (((tickAnim - 18) / 5) * (2.38201-(6.81177)));
            zz = 3.11629 + (((tickAnim - 18) / 5) * (0.7007-(3.11629)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 13.82329 + (((tickAnim - 23) / 5) * (-5.71114-(13.82329)));
            yy = 2.38201 + (((tickAnim - 23) / 5) * (7.41478-(2.38201)));
            zz = 0.7007 + (((tickAnim - 23) / 5) * (1.70367-(0.7007)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -5.71114 + (((tickAnim - 28) / 6) * (7.1789-(-5.71114)));
            yy = 7.41478 + (((tickAnim - 28) / 6) * (6.60857-(7.41478)));
            zz = 1.70367 + (((tickAnim - 28) / 6) * (3.51031-(1.70367)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 7.1789 + (((tickAnim - 34) / 6) * (0-(7.1789)));
            yy = 6.60857 + (((tickAnim - 34) / 6) * (0-(6.60857)));
            zz = 3.51031 + (((tickAnim - 34) / 6) * (0-(3.51031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 4) / 6) * (-5-(-5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 10) / 8) * (1.04-(-5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1.04 + (((tickAnim - 18) / 6) * (13.35-(1.04)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 13.35 + (((tickAnim - 24) / 6) * (8.35-(13.35)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.35 + (((tickAnim - 30) / 10) * (13.35-(8.35)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.35 + (((tickAnim - 40) / 10) * (0-(13.35)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 4) / 6) * (-5-(-5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 10) / 8) * (1.04-(-5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1.04 + (((tickAnim - 18) / 6) * (3.35-(1.04)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 3.35 + (((tickAnim - 24) / 16) * (3.35-(3.35)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.35 + (((tickAnim - 40) / 10) * (0-(3.35)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 4) / 6) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 10) / 8) * (19.19-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 19.19 + (((tickAnim - 18) / 6) * (45.63-(19.19)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 45.63 + (((tickAnim - 24) / 3) * (36.63-(45.63)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 36.63 + (((tickAnim - 27) / 6) * (40.63-(36.63)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 40.63 + (((tickAnim - 33) / 7) * (45.63-(40.63)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 45.63 + (((tickAnim - 40) / 4) * (29.12-(45.63)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 29.12 + (((tickAnim - 44) / 6) * (0-(29.12)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 4) / 9) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 13) / 6) * (21.01-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 21.01 + (((tickAnim - 19) / 5) * (26.88-(21.01)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 26.88 + (((tickAnim - 24) / 7) * (21.88-(26.88)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 21.88 + (((tickAnim - 31) / 9) * (26.88-(21.88)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 26.88 + (((tickAnim - 40) / 3) * (20.42-(26.88)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 20.42 + (((tickAnim - 43) / 3) * (25.26-(20.42)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 25.26 + (((tickAnim - 46) / 4) * (0-(25.26)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = 25 + (((tickAnim - 4) / 13) * (25-(25)));
            yy = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 13) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 25 + (((tickAnim - 17) / 7) * (8.65-(25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 8.65 + (((tickAnim - 24) / 16) * (8.65-(8.65)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 8.65 + (((tickAnim - 40) / 10) * (0-(8.65)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = 17.5 + (((tickAnim - 4) / 13) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 13) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 17.5 + (((tickAnim - 17) / 7) * (-21.2-(17.5)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -21.2 + (((tickAnim - 24) / 6) * (-31.2-(-21.2)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -31.2 + (((tickAnim - 30) / 4) * (-19.53-(-31.2)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -19.53 + (((tickAnim - 34) / 6) * (-21.2-(-19.53)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -21.2 + (((tickAnim - 40) / 10) * (0-(-21.2)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 4) / 3) * (6.23958-(7.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (-10.06973-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (11.17553-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.23958 + (((tickAnim - 7) / 3) * (6.23958-(6.23958)));
            yy = -10.06973 + (((tickAnim - 7) / 3) * (-10.06973-(-10.06973)));
            zz = 11.17553 + (((tickAnim - 7) / 3) * (11.17553-(11.17553)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 6.23958 + (((tickAnim - 10) / 14) * (-2.5-(6.23958)));
            yy = -10.06973 + (((tickAnim - 10) / 14) * (0-(-10.06973)));
            zz = 11.17553 + (((tickAnim - 10) / 14) * (0-(11.17553)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 24) / 3) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -12.5 + (((tickAnim - 27) / 2) * (-0.62-(-12.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -0.62 + (((tickAnim - 29) / 4) * (-18.7-(-0.62)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -18.7 + (((tickAnim - 33) / 2) * (-5.8-(-18.7)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.8 + (((tickAnim - 35) / 5) * (-2.5-(-5.8)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 40) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (30-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 30 + (((tickAnim - 27) / 2) * (0-(30)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (30-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 30 + (((tickAnim - 32) / 2) * (0-(30)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawbase, lowerJawbase.rotateAngleX + (float) Math.toRadians(xx), lowerJawbase.rotateAngleY + (float) Math.toRadians(yy), lowerJawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -1.625 + (((tickAnim - 9) / 9) * (-2.97-(-1.625)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -2.97 + (((tickAnim - 18) / 13) * (-2.97-(-2.97)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 31) / 11) * (0-(0)));
            yy = -2.97 + (((tickAnim - 31) / 11) * (-1.675-(-2.97)));
            zz = 0 + (((tickAnim - 31) / 11) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -1.675 + (((tickAnim - 42) / 8) * (0-(-1.675)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (5.42-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.42 + (((tickAnim - 38) / 12) * (0-(5.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (0-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(xx), tailBase.rotateAngleY + (float) Math.toRadians(yy), tailBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailMiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(xx), tailMiddle.rotateAngleY + (float) Math.toRadians(yy), tailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(xx), tailMiddleend.rotateAngleY + (float) Math.toRadians(yy), tailMiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightShin, rightShin.rotateAngleX + (float) Math.toRadians(xx), rightShin.rotateAngleY + (float) Math.toRadians(yy), rightShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAnkle, rightAnkle.rotateAngleX + (float) Math.toRadians(xx), rightAnkle.rotateAngleY + (float) Math.toRadians(yy), rightAnkle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightAnkle.rotationPointX = this.rightAnkle.rotationPointX + (float)(xx);
        this.rightAnkle.rotationPointY = this.rightAnkle.rotationPointY - (float)(yy);
        this.rightAnkle.rotationPointZ = this.rightAnkle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.66-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66 + (((tickAnim - 4) / 5) * (12.12-(5.66)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.12 + (((tickAnim - 9) / 5) * (17.84-(12.12)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.84 + (((tickAnim - 14) / 5) * (21.5-(17.84)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftShin, leftShin.rotateAngleX + (float) Math.toRadians(xx), leftShin.rotateAngleY + (float) Math.toRadians(yy), leftShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.83 + (((tickAnim - 4) / 5) * (-19.66-(-9.83)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.66 + (((tickAnim - 9) / 5) * (-28.91-(-19.66)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -28.91 + (((tickAnim - 14) / 5) * (-34.75-(-28.91)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAnkle, leftAnkle.rotateAngleX + (float) Math.toRadians(xx), leftAnkle.rotateAngleY + (float) Math.toRadians(yy), leftAnkle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.175 + (((tickAnim - 18) / 1) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftAnkle.rotationPointX = this.leftAnkle.rotationPointX + (float)(xx);
        this.leftAnkle.rotationPointY = this.leftAnkle.rotationPointY - (float)(yy);
        this.leftAnkle.rotationPointZ = this.leftAnkle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.52-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.52 + (((tickAnim - 4) / 5) * (7.25-(3.52)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 9) / 4) * (9.67-(7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.67 + (((tickAnim - 13) / 1) * (10.76-(9.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.76 + (((tickAnim - 14) / 3) * (11-(10.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 11 + (((tickAnim - 17) / 2) * (13.75-(11)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 50) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.60681 + (((tickAnim - 0) / 50) * (-0.60681-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 0) / 50) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.28486 + (((tickAnim - 0) / 50) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 50) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(xx), tailBase.rotateAngleY + (float) Math.toRadians(yy), tailBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailMiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(xx), tailMiddle.rotateAngleY + (float) Math.toRadians(yy), tailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(xx), tailMiddleend.rotateAngleY + (float) Math.toRadians(yy), tailMiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailEnd, tailEnd.rotateAngleX + (float) Math.toRadians(xx), tailEnd.rotateAngleY + (float) Math.toRadians(yy), tailEnd.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.25 + (((tickAnim - 0) / 5) * (-12.5-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (-1.2701-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (-2.60395-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.88457-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -1.2701 + (((tickAnim - 10) / 15) * (33.57674-(-1.2701)));
            yy = -2.60395 + (((tickAnim - 10) / 15) * (-5.52655-(-2.60395)));
            zz = 0.88457 + (((tickAnim - 10) / 15) * (-1.58985-(0.88457)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 33.57674 + (((tickAnim - 25) / 6) * (30.36394-(33.57674)));
            yy = -5.52655 + (((tickAnim - 25) / 6) * (-6.09433-(-5.52655)));
            zz = -1.58985 + (((tickAnim - 25) / 6) * (-1.38886-(-1.58985)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 30.36394 + (((tickAnim - 31) / 9) * (12.29-(30.36394)));
            yy = -6.09433 + (((tickAnim - 31) / 9) * (0-(-6.09433)));
            zz = -1.38886 + (((tickAnim - 31) / 9) * (0-(-1.38886)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 12.29 + (((tickAnim - 40) / 4) * (0.25-(12.29)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 44) / 6) * (-18.25-(0.25)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 20) * (-1.25-(0.25)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            yy = -1.25 + (((tickAnim - 25) / 19) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 25) / 19) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightThigh.rotationPointX = this.rightThigh.rotationPointX + (float)(xx);
        this.rightThigh.rotationPointY = this.rightThigh.rotationPointY - (float)(yy);
        this.rightThigh.rotationPointZ = this.rightThigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-16.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.5 + (((tickAnim - 5) / 6) * (0.25-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.25 + (((tickAnim - 11) / 7) * (8.1-(0.25)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 8.1 + (((tickAnim - 18) / 4) * (2.93-(8.1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 2.93 + (((tickAnim - 22) / 3) * (-8-(2.93)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -8 + (((tickAnim - 25) / 6) * (10.4-(-8)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 10.4 + (((tickAnim - 31) / 6) * (37.5-(10.4)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 37.5 + (((tickAnim - 37) / 6) * (22.69-(37.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.69 + (((tickAnim - 43) / 7) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightShin, rightShin.rotateAngleX + (float) Math.toRadians(xx), rightShin.rotateAngleY + (float) Math.toRadians(yy), rightShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (19.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 5) / 3) * (7.95-(19.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.95 + (((tickAnim - 8) / 3) * (0.75-(7.95)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.75 + (((tickAnim - 11) / 7) * (-1.54-(0.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.54 + (((tickAnim - 18) / 4) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0.48 + (((tickAnim - 22) / 6) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 14.7 + (((tickAnim - 28) / 3) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 20.39 + (((tickAnim - 31) / 13) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 31) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -54.58 + (((tickAnim - 44) / 6) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAnkle, rightAnkle.rotateAngleX + (float) Math.toRadians(xx), rightAnkle.rotateAngleY + (float) Math.toRadians(yy), rightAnkle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (3.5-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.5 + (((tickAnim - 8) / 3) * (-3.00976-(3.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-1.91268-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -3.00976 + (((tickAnim - 11) / 2) * (-8.61-(-3.00976)));
            yy = 0.58463 + (((tickAnim - 11) / 2) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 11) / 2) * (0-(-1.91268)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.61 + (((tickAnim - 13) / 1) * (-0.85-(-8.61)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -0.85 + (((tickAnim - 14) / 8) * (39.75-(-0.85)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 39.75 + (((tickAnim - 22) / 3) * (71-(39.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 71 + (((tickAnim - 25) / 3) * (76.75-(71)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 76.75 + (((tickAnim - 28) / 3) * (71-(76.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 71 + (((tickAnim - 31) / 9) * (91.5-(71)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 91.5 + (((tickAnim - 40) / 10) * (16.75-(91.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 3) * (-0.025-(0.375)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 11) / 7) * (-0.145-(-0.025)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.145 + (((tickAnim - 18) / 7) * (0.15-(-0.145)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 25) / 15) * (0-(0.15)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.75 + (((tickAnim - 0) / 5) * (-6.5-(12.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 5) / 3) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-37.28-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -37.28 + (((tickAnim - 18) / 4) * (-68.39-(-37.28)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -68.39 + (((tickAnim - 22) / 3) * (-104.5-(-68.39)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -104.5 + (((tickAnim - 25) / 3) * (-103.05-(-104.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -103.05 + (((tickAnim - 28) / 1) * (-81.74-(-103.05)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -81.74 + (((tickAnim - 29) / 2) * (-35.92-(-81.74)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -35.92 + (((tickAnim - 31) / 3) * (56.08-(-35.92)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 56.08 + (((tickAnim - 34) / 4) * (54.33-(56.08)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 54.33 + (((tickAnim - 38) / 12) * (12.75-(54.33)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0.4 + (((tickAnim - 25) / 3) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftShin, leftShin.rotateAngleX + (float) Math.toRadians(xx), leftShin.rotateAngleY + (float) Math.toRadians(yy), leftShin.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftAnkle, leftAnkle.rotateAngleX + (float) Math.toRadians(xx), leftAnkle.rotateAngleY + (float) Math.toRadians(yy), leftAnkle.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 7) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 7) / 6) * (3.75-(-2.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 13) / 7) * (0-(3.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-21.67-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -21.67 + (((tickAnim - 7) / 6) * (-4.03-(-21.67)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -4.03 + (((tickAnim - 13) / 7) * (0-(-4.03)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 8) / 5) * (7.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 13) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckMiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (11.81-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.81 + (((tickAnim - 13) / 7) * (0-(11.81)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 9) / 11) * (0-(10)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(xx), neckFront.rotateAngleY + (float) Math.toRadians(yy), neckFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 8) / 5) * (-7.78-(5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.78 + (((tickAnim - 13) / 7) * (0-(-7.78)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 8) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerJawbase, lowerJawbase.rotateAngleX + (float) Math.toRadians(xx), lowerJawbase.rotateAngleY + (float) Math.toRadians(yy), lowerJawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.8744-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.9399-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.87016-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.8744 + (((tickAnim - 5) / 3) * (12.33626-(22.8744)));
            yy = 6.9399 + (((tickAnim - 5) / 3) * (22.97161-(6.9399)));
            zz = -2.87016 + (((tickAnim - 5) / 3) * (-13.62602-(-2.87016)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.33626 + (((tickAnim - 8) / 5) * (-37.72157-(12.33626)));
            yy = 22.97161 + (((tickAnim - 8) / 5) * (27.89779-(22.97161)));
            zz = -13.62602 + (((tickAnim - 8) / 5) * (-55.55302-(-13.62602)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -37.72157 + (((tickAnim - 13) / 2) * (-68.14652-(-37.72157)));
            yy = 27.89779 + (((tickAnim - 13) / 2) * (12.76201-(27.89779)));
            zz = -55.55302 + (((tickAnim - 13) / 2) * (-7.57001-(-55.55302)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -68.14652 + (((tickAnim - 15) / 5) * (0-(-68.14652)));
            yy = 12.76201 + (((tickAnim - 15) / 5) * (0-(12.76201)));
            zz = -7.57001 + (((tickAnim - 15) / 5) * (0-(-7.57001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 6) / 7) * (33.24-(-17.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 33.24 + (((tickAnim - 13) / 2) * (-2.84-(33.24)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.84 + (((tickAnim - 15) / 5) * (0-(-2.84)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (22.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 22.5 + (((tickAnim - 6) / 7) * (19.41-(22.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 19.41 + (((tickAnim - 13) / 2) * (-22.89-(19.41)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -22.89 + (((tickAnim - 15) / 3) * (11.06-(-22.89)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 11.06 + (((tickAnim - 18) / 2) * (0-(11.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.8744-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-6.9399-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.87016-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.8744 + (((tickAnim - 5) / 3) * (12.33626-(22.8744)));
            yy = -6.9399 + (((tickAnim - 5) / 3) * (-22.97161-(-6.9399)));
            zz = 2.87016 + (((tickAnim - 5) / 3) * (13.62602-(2.87016)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.33626 + (((tickAnim - 8) / 5) * (-37.72157-(12.33626)));
            yy = -22.97161 + (((tickAnim - 8) / 5) * (-27.89779-(-22.97161)));
            zz = 13.62602 + (((tickAnim - 8) / 5) * (55.55302-(13.62602)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -37.72157 + (((tickAnim - 13) / 2) * (-68.14652-(-37.72157)));
            yy = -27.89779 + (((tickAnim - 13) / 2) * (-12.76201-(-27.89779)));
            zz = 55.55302 + (((tickAnim - 13) / 2) * (7.57001-(55.55302)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -68.14652 + (((tickAnim - 15) / 5) * (0-(-68.14652)));
            yy = -12.76201 + (((tickAnim - 15) / 5) * (0-(-12.76201)));
            zz = 7.57001 + (((tickAnim - 15) / 5) * (0-(7.57001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 6) / 7) * (33.24-(-17.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 33.24 + (((tickAnim - 13) / 2) * (-2.84-(33.24)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.84 + (((tickAnim - 15) / 5) * (0-(-2.84)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-22.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -22.5 + (((tickAnim - 6) / 7) * (-19.41-(-22.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -19.41 + (((tickAnim - 13) / 2) * (22.89-(-19.41)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 22.89 + (((tickAnim - 15) / 3) * (-11.06-(22.89)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -11.06 + (((tickAnim - 18) / 2) * (0-(-11.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));
    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.2-(0)));
            zz = 0.75 + (((tickAnim - 0) / 7) * (1.5-(0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -1.2 + (((tickAnim - 7) / 4) * (0-(-1.2)));
            zz = 1.5 + (((tickAnim - 7) / 4) * (0.75-(1.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (-1.2-(0)));
            zz = 0.75 + (((tickAnim - 11) / 6) * (1.5-(0.75)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 17) / 3) * (0-(-1.2)));
            zz = 1.5 + (((tickAnim - 17) / 3) * (0.75-(1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -12.5 + (((tickAnim - 0) / 7) * (-5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 7) / 4) * (-12.5-(-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -12.5 + (((tickAnim - 11) / 6) * (-5-(-12.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 17) / 3) * (-12.5-(-5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyMiddle, bodyMiddle.rotateAngleX + (float) Math.toRadians(xx), bodyMiddle.rotateAngleY + (float) Math.toRadians(yy), bodyMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 2.5 + (((tickAnim - 5) / 6) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 14) / 6) * (0-(2.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(xx), bodyFront.rotateAngleY + (float) Math.toRadians(yy), bodyFront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 7) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 17) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(xx), neckBase.rotateAngleY + (float) Math.toRadians(yy), neckBase.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-11), neckMiddlefront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-3), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1));


        this.setRotateAngle(neckFront, neckFront.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*5), neckFront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-1), neckFront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));


        this.setRotateAngle(lowerJawmiddle, lowerJawmiddle.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*1), lowerJawmiddle.rotateAngleY + (float) Math.toRadians(0), lowerJawmiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), leftUpperarm.rotateAngleY + (float) Math.toRadians(-7.45077), leftUpperarm.rotateAngleZ + (float) Math.toRadians(11.2468+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-5));


        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*10), leftLowerarm.rotateAngleY + (float) Math.toRadians(0), leftLowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5+10.5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-170))*-4));


        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), rightUpperarm.rotateAngleY + (float) Math.toRadians(7.45077), rightUpperarm.rotateAngleZ + (float) Math.toRadians(-11.2468+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-5));


        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*10), rightLowerarm.rotateAngleY + (float) Math.toRadians(0), rightLowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5+10.5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-170))*4));


        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-7), tailBase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-12), tailBase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-3));


        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tailMiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-8), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-2), tailMiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-9), tailMiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));


        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-70))*-5), tailMiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-6), tailMiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-3));


        this.setRotateAngle(tailEnd, tailEnd.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-8), tailEnd.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6), tailEnd.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-3));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -36.33724 + (((tickAnim - 0) / 10) * (8.66276-(-36.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 10) * (-6.98519-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 10) * (1.31992-(1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 8.66276 + (((tickAnim - 10) / 6) * (-53.42057-(8.66276)));
            yy = -6.98519 + (((tickAnim - 10) / 6) * (-6.98519-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 10) / 6) * (1.31992-(1.31992)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -53.42057 + (((tickAnim - 16) / 4) * (-36.33724-(-53.42057)));
            yy = -6.98519 + (((tickAnim - 16) / 4) * (-6.98519-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 16) / 4) * (1.31992-(1.31992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0.75-(0.5)));
            zz = -1 + (((tickAnim - 3) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 5) / 2) * (0.1-(0.75)));
            zz = -1 + (((tickAnim - 5) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 7) / 13) * (0-(0.1)));
            zz = -1 + (((tickAnim - 7) / 13) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightThigh.rotationPointX = this.rightThigh.rotationPointX + (float)(xx);
        this.rightThigh.rotationPointY = this.rightThigh.rotationPointY - (float)(yy);
        this.rightThigh.rotationPointZ = this.rightThigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27.42 + (((tickAnim - 0) / 10) * (32.58-(-27.42)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 32.58 + (((tickAnim - 10) / 3) * (52.58-(32.58)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 52.58 + (((tickAnim - 13) / 3) * (41.47-(52.58)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 41.47 + (((tickAnim - 16) / 4) * (-27.42-(41.47)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightShin, rightShin.rotateAngleX + (float) Math.toRadians(xx), rightShin.rotateAngleY + (float) Math.toRadians(yy), rightShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.16 + (((tickAnim - 0) / 3) * (-24.03-(-12.16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -24.03 + (((tickAnim - 3) / 7) * (20.34-(-24.03)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 20.34 + (((tickAnim - 10) / 6) * (-51.12-(20.34)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -51.12 + (((tickAnim - 16) / 4) * (-12.16-(-51.12)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAnkle, rightAnkle.rotateAngleX + (float) Math.toRadians(xx), rightAnkle.rotateAngleY + (float) Math.toRadians(yy), rightAnkle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (54.46-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 54.46 + (((tickAnim - 3) / 4) * (-9.57-(54.46)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.57 + (((tickAnim - 7) / 1) * (-13.31-(-9.57)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.31 + (((tickAnim - 8) / 2) * (44.37-(-13.31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 44.37 + (((tickAnim - 10) / 1) * (73.21-(44.37)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 73.21 + (((tickAnim - 11) / 2) * (81.96-(73.21)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 81.96 + (((tickAnim - 13) / 7) * (58.21-(81.96)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.66276 + (((tickAnim - 0) / 6) * (-53.42057-(8.66276)));
            yy = 6.98519 + (((tickAnim - 0) / 6) * (6.98519-(6.98519)));
            zz = -1.31992 + (((tickAnim - 0) / 6) * (-1.31992-(-1.31992)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -53.42057 + (((tickAnim - 6) / 4) * (-36.33724-(-53.42057)));
            yy = 6.98519 + (((tickAnim - 6) / 4) * (6.98519-(6.98519)));
            zz = -1.31992 + (((tickAnim - 6) / 4) * (-1.31992-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -36.33724 + (((tickAnim - 10) / 10) * (8.66276-(-36.33724)));
            yy = 6.98519 + (((tickAnim - 10) / 10) * (6.98519-(6.98519)));
            zz = -1.31992 + (((tickAnim - 10) / 10) * (-1.31992-(-1.31992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 10) * (-1-(-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.5-(0)));
            zz = -1 + (((tickAnim - 10) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 2) * (1-(0.5)));
            zz = -1 + (((tickAnim - 13) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 2) * (0.5-(1)));
            zz = -1 + (((tickAnim - 15) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 17) / 3) * (0-(0.5)));
            zz = -1 + (((tickAnim - 17) / 3) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftThigh.rotationPointX = this.leftThigh.rotationPointX + (float)(xx);
        this.leftThigh.rotationPointY = this.leftThigh.rotationPointY - (float)(yy);
        this.leftThigh.rotationPointZ = this.leftThigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.58 + (((tickAnim - 0) / 3) * (52.58-(32.58)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 52.58 + (((tickAnim - 3) / 3) * (41.47-(52.58)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 41.47 + (((tickAnim - 6) / 4) * (-27.42-(41.47)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.42 + (((tickAnim - 10) / 10) * (32.58-(-27.42)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftShin, leftShin.rotateAngleX + (float) Math.toRadians(xx), leftShin.rotateAngleY + (float) Math.toRadians(yy), leftShin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.34 + (((tickAnim - 0) / 6) * (-51.12-(20.34)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -51.12 + (((tickAnim - 6) / 4) * (-12.16-(-51.12)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.16 + (((tickAnim - 10) / 3) * (-24.03-(-12.16)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -24.03 + (((tickAnim - 13) / 7) * (20.34-(-24.03)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAnkle, leftAnkle.rotateAngleX + (float) Math.toRadians(xx), leftAnkle.rotateAngleY + (float) Math.toRadians(yy), leftAnkle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 44.37 + (((tickAnim - 0) / 1) * (73.21-(44.37)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 73.21 + (((tickAnim - 1) / 2) * (81.96-(73.21)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 81.96 + (((tickAnim - 3) / 7) * (58.21-(81.96)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 58.21 + (((tickAnim - 10) / 3) * (54.46-(58.21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 54.46 + (((tickAnim - 13) / 4) * (-9.57-(54.46)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -9.57 + (((tickAnim - 17) / 1) * (-13.31-(-9.57)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13.31 + (((tickAnim - 18) / 2) * (44.37-(-13.31)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


}

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChilesaurus entity = (EntityPrehistoricFloraChilesaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-1.8), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.4), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6 + (((tickAnim - 0) / 4) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6 + (((tickAnim - 4) / 4) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1 + (((tickAnim - 8) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6 + (((tickAnim - 8) / 15) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1 + (((tickAnim - 23) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6 + (((tickAnim - 23) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-40))*-0.075-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6 + (((tickAnim - 28) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-50))*0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyFront, bodyFront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1.8), bodyFront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-1.2), bodyFront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neckBase, neckBase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1), neckBase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2), neckBase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neckMiddlebase, neckMiddlebase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2.5), neckMiddlebase.rotateAngleY + (float) Math.toRadians(0), neckMiddlebase.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 0) / 10) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 10) / 10) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 20) / 10) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 30) / 10) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckMiddlefront, neckMiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckMiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 30) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperarm, leftUpperarm.rotateAngleX + (float) Math.toRadians(xx), leftUpperarm.rotateAngleY + (float) Math.toRadians(yy), leftUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 30) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerarm, leftLowerarm.rotateAngleX + (float) Math.toRadians(xx), leftLowerarm.rotateAngleY + (float) Math.toRadians(yy), leftLowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 30) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperarm, rightUpperarm.rotateAngleX + (float) Math.toRadians(xx), rightUpperarm.rotateAngleY + (float) Math.toRadians(yy), rightUpperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 30) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerarm, rightLowerarm.rotateAngleX + (float) Math.toRadians(xx), rightLowerarm.rotateAngleY + (float) Math.toRadians(yy), rightLowerarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tailBase, tailBase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2+50))*-3), tailBase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*-4), tailBase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*-3));


        this.setRotateAngle(tailMiddlebase, tailMiddlebase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2))*-2), tailMiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-4), tailMiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-3));


        this.setRotateAngle(tailMiddle, tailMiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2-50))*-1), tailMiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-50))*-4), tailMiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-50))*-3));


        this.setRotateAngle(tailMiddleend, tailMiddleend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2-70))*-3), tailMiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-70))*-4), tailMiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-70))*-3));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -11.17172 + (((tickAnim - 0) / 20) * (18.89629-(-11.17172)));
            yy = -1.47535 + (((tickAnim - 0) / 20) * (0.32762-(-1.47535)));
            zz = 6.074 + (((tickAnim - 0) / 20) * (9.093-(6.074)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 18.89629 + (((tickAnim - 20) / 15) * (0.56725-(18.89629)));
            yy = 0.32762 + (((tickAnim - 20) / 15) * (-8.64428-(0.32762)));
            zz = 9.093 + (((tickAnim - 20) / 15) * (1.04822-(9.093)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.56725 + (((tickAnim - 35) / 5) * (-11.17172-(0.56725)));
            yy = -8.64428 + (((tickAnim - 35) / 5) * (-1.47535-(-8.64428)));
            zz = 1.04822 + (((tickAnim - 35) / 5) * (6.074-(1.04822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThigh, rightThigh.rotateAngleX + (float) Math.toRadians(xx), rightThigh.rotateAngleY + (float) Math.toRadians(yy), rightThigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 6) * (-0.95-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.95 + (((tickAnim - 6) / 4) * (-1.87-(-0.95)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -1.87 + (((tickAnim - 10) / 7) * (-0.79-(-1.87)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.79 + (((tickAnim - 17) / 3) * (-1-(-0.79)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -1 + (((tickAnim - 20) / 15) * (1.25-(-1)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 35) / 5) * (-0.25-(1.25)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightThigh.rotationPointX = this.rightThigh.rotationPointX + (float)(xx);
        this.rightThigh.rotationPointY = this.rightThigh.rotationPointY - (float)(yy);
        this.rightThigh.rotationPointZ = this.rightThigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 0) / 20) * (4.96878-(-6)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.755-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.2801-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 4.96878 + (((tickAnim - 20) / 7) * (31-(4.96878)));
            yy = -2.755 + (((tickAnim - 20) / 7) * (0-(-2.755)));
            zz = -4.2801 + (((tickAnim - 20) / 7) * (0-(-4.2801)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 31 + (((tickAnim - 27) / 8) * (-5.09826-(31)));
            yy = 0 + (((tickAnim - 27) / 8) * (6.75064-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0.97073-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.09826 + (((tickAnim - 35) / 5) * (-6-(-5.09826)));
            yy = 6.75064 + (((tickAnim - 35) / 5) * (0-(6.75064)));
            zz = 0.97073 + (((tickAnim - 35) / 5) * (0-(0.97073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightShin, rightShin.rotateAngleX + (float) Math.toRadians(xx), rightShin.rotateAngleY + (float) Math.toRadians(yy), rightShin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0.08-(0)));
            yy = 1.775 + (((tickAnim - 10) / 10) * (-0.215-(1.775)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.08 + (((tickAnim - 20) / 15) * (-0.205-(0.08)));
            yy = -0.215 + (((tickAnim - 20) / 15) * (0.34-(-0.215)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.205 + (((tickAnim - 35) / 5) * (0-(-0.205)));
            yy = 0.34 + (((tickAnim - 35) / 5) * (0-(0.34)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightShin.rotationPointX = this.rightShin.rotationPointX + (float)(xx);
        this.rightShin.rotationPointY = this.rightShin.rotationPointY - (float)(yy);
        this.rightShin.rotationPointZ = this.rightShin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 0) / 20) * (10.27347-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.05957-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.53782-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 10.27347 + (((tickAnim - 20) / 7) * (-31-(10.27347)));
            yy = -1.05957 + (((tickAnim - 20) / 7) * (0-(-1.05957)));
            zz = -2.53782 + (((tickAnim - 20) / 7) * (0-(-2.53782)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -31 + (((tickAnim - 27) / 8) * (-36.43-(-31)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -36.43 + (((tickAnim - 35) / 5) * (-0.25-(-36.43)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAnkle, rightAnkle.rotateAngleX + (float) Math.toRadians(xx), rightAnkle.rotateAngleY + (float) Math.toRadians(yy), rightAnkle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (1.025-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.075 + (((tickAnim - 27) / 13) * (0-(-0.075)));
            zz = 1.025 + (((tickAnim - 27) / 13) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightAnkle.rotationPointX = this.rightAnkle.rotationPointX + (float)(xx);
        this.rightAnkle.rotationPointY = this.rightAnkle.rotationPointY - (float)(yy);
        this.rightAnkle.rotationPointZ = this.rightAnkle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.30651 + (((tickAnim - 0) / 10) * (-9.26149-(17.30651)));
            yy = 4.16643 + (((tickAnim - 0) / 10) * (0.60795-(4.16643)));
            zz = -5.31537 + (((tickAnim - 0) / 10) * (-2.16635-(-5.31537)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.26149 + (((tickAnim - 10) / 10) * (58.01511-(-9.26149)));
            yy = 0.60795 + (((tickAnim - 10) / 10) * (-0.58861-(0.60795)));
            zz = -2.16635 + (((tickAnim - 10) / 10) * (-2.94174-(-2.16635)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 58.01511 + (((tickAnim - 20) / 15) * (68.58-(58.01511)));
            yy = -0.58861 + (((tickAnim - 20) / 15) * (0-(-0.58861)));
            zz = -2.94174 + (((tickAnim - 20) / 15) * (0-(-2.94174)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 68.58 + (((tickAnim - 35) / 5) * (17.30651-(68.58)));
            yy = 0 + (((tickAnim - 35) / 5) * (4.16643-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-5.31537-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.05-(0)));
            yy = -0.175 + (((tickAnim - 0) / 10) * (0.24-(-0.175)));
            zz = 0.075 + (((tickAnim - 0) / 10) * (0.04-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.05 + (((tickAnim - 10) / 10) * (0.1-(0.05)));
            yy = 0.24 + (((tickAnim - 10) / 10) * (0.575-(0.24)));
            zz = 0.04 + (((tickAnim - 10) / 10) * (0-(0.04)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.1 + (((tickAnim - 20) / 15) * (-0.06-(0.1)));
            yy = 0.575 + (((tickAnim - 20) / 15) * (-0.21-(0.575)));
            zz = 0 + (((tickAnim - 20) / 15) * (-0.215-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.06 + (((tickAnim - 35) / 5) * (0-(-0.06)));
            yy = -0.21 + (((tickAnim - 35) / 5) * (-0.175-(-0.21)));
            zz = -0.215 + (((tickAnim - 35) / 5) * (0.075-(-0.215)));
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
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-89.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -89.25 + (((tickAnim - 20) / 7) * (17.08-(-89.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 17.08 + (((tickAnim - 27) / 8) * (31.72-(17.08)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 31.72 + (((tickAnim - 35) / 5) * (0-(31.72)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.475-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 20) * (0-(0.5)));
            zz = 0.475 + (((tickAnim - 20) / 20) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 18.89629 + (((tickAnim - 0) / 15) * (5.25844-(18.89629)));
            yy = 0.32762 + (((tickAnim - 0) / 15) * (8.61214-(0.32762)));
            zz = -9.09302 + (((tickAnim - 0) / 15) * (1.55302-(-9.09302)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.25844 + (((tickAnim - 15) / 5) * (-11.17172-(5.25844)));
            yy = 8.61214 + (((tickAnim - 15) / 5) * (-1.47535-(8.61214)));
            zz = 1.55302 + (((tickAnim - 15) / 5) * (-6.07404-(1.55302)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -11.17172 + (((tickAnim - 20) / 20) * (18.89629-(-11.17172)));
            yy = -1.47535 + (((tickAnim - 20) / 20) * (0.32762-(-1.47535)));
            zz = -6.07404 + (((tickAnim - 20) / 20) * (-9.09302-(-6.07404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThigh, leftThigh.rotateAngleX + (float) Math.toRadians(xx), leftThigh.rotateAngleY + (float) Math.toRadians(yy), leftThigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 15) * (1.25-(-1)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 15) / 4) * (-0.25-(1.25)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 19) / 6) * (-0.95-(-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = -0.95 + (((tickAnim - 25) / 4) * (-1.87-(-0.95)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = -1.87 + (((tickAnim - 29) / 7) * (-0.79-(-1.87)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = -0.79 + (((tickAnim - 36) / 3) * (-1-(-0.79)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftThigh.rotationPointX = this.leftThigh.rotationPointX + (float)(xx);
        this.leftThigh.rotationPointY = this.leftThigh.rotationPointY - (float)(yy);
        this.leftThigh.rotationPointZ = this.leftThigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4.96878 + (((tickAnim - 0) / 7) * (31-(4.96878)));
            yy = 2.755 + (((tickAnim - 0) / 7) * (0-(2.755)));
            zz = 4.2801 + (((tickAnim - 0) / 7) * (0-(4.2801)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 31 + (((tickAnim - 7) / 8) * (-9.58408-(31)));
            yy = 0 + (((tickAnim - 7) / 8) * (-5.5168-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (-3.44261-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -9.58408 + (((tickAnim - 15) / 5) * (-1.50592-(-9.58408)));
            yy = -5.5168 + (((tickAnim - 15) / 5) * (-0.62723-(-5.5168)));
            zz = -3.44261 + (((tickAnim - 15) / 5) * (1.08126-(-3.44261)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -1.50592 + (((tickAnim - 20) / 20) * (4.96878-(-1.50592)));
            yy = -0.62723 + (((tickAnim - 20) / 20) * (2.755-(-0.62723)));
            zz = 1.08126 + (((tickAnim - 20) / 20) * (4.2801-(1.08126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftShin, leftShin.rotateAngleX + (float) Math.toRadians(xx), leftShin.rotateAngleY + (float) Math.toRadians(yy), leftShin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.08 + (((tickAnim - 0) / 15) * (-0.005-(0.08)));
            yy = -0.215 + (((tickAnim - 0) / 15) * (0.34-(-0.215)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.005 + (((tickAnim - 15) / 5) * (0-(-0.005)));
            yy = 0.34 + (((tickAnim - 15) / 5) * (0-(0.34)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (1.775-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0.08-(0)));
            yy = 1.775 + (((tickAnim - 30) / 10) * (-0.215-(1.775)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftShin.rotationPointX = this.leftShin.rotationPointX + (float)(xx);
        this.leftShin.rotationPointY = this.leftShin.rotationPointY - (float)(yy);
        this.leftShin.rotationPointZ = this.leftShin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 16.25 + (((tickAnim - 0) / 7) * (-31-(16.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -31 + (((tickAnim - 7) / 8) * (-36.43-(-31)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.43 + (((tickAnim - 15) / 5) * (-0.25-(-36.43)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 20) / 20) * (16.25-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAnkle, leftAnkle.rotateAngleX + (float) Math.toRadians(xx), leftAnkle.rotateAngleY + (float) Math.toRadians(yy), leftAnkle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.075 + (((tickAnim - 7) / 13) * (0-(-0.075)));
            zz = 1.025 + (((tickAnim - 7) / 13) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftAnkle.rotationPointX = this.leftAnkle.rotationPointX + (float)(xx);
        this.leftAnkle.rotationPointY = this.leftAnkle.rotationPointY - (float)(yy);
        this.leftAnkle.rotationPointZ = this.leftAnkle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 43.57967 + (((tickAnim - 0) / 15) * (68.58-(43.57967)));
            yy = 1.74913 + (((tickAnim - 0) / 15) * (0-(1.74913)));
            zz = 5.21527 + (((tickAnim - 0) / 15) * (0-(5.21527)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 68.58 + (((tickAnim - 15) / 5) * (12.10373-(68.58)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.33331-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (4.08349-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.10373 + (((tickAnim - 20) / 10) * (-13.26771-(12.10373)));
            yy = 0.33331 + (((tickAnim - 20) / 10) * (-0.58815-(0.33331)));
            zz = 4.08349 + (((tickAnim - 20) / 10) * (3.45029-(4.08349)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13.26771 + (((tickAnim - 30) / 10) * (43.57967-(-13.26771)));
            yy = -0.58815 + (((tickAnim - 30) / 10) * (1.74913-(-0.58815)));
            zz = 3.45029 + (((tickAnim - 30) / 10) * (5.21527-(3.45029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.2 + (((tickAnim - 0) / 15) * (-0.06-(-0.2)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.21-(0)));
            zz = 0.375 + (((tickAnim - 0) / 15) * (-0.215-(0.375)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.06 + (((tickAnim - 15) / 5) * (0-(-0.06)));
            yy = -0.21 + (((tickAnim - 15) / 5) * (-0.3-(-0.21)));
            zz = -0.215 + (((tickAnim - 15) / 5) * (0.425-(-0.215)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (0.05-(-0.3)));
            zz = 0.425 + (((tickAnim - 20) / 10) * (0.19-(0.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-0.2-(0)));
            yy = 0.05 + (((tickAnim - 30) / 10) * (0-(0.05)));
            zz = 0.19 + (((tickAnim - 30) / 10) * (0.375-(0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -85 + (((tickAnim - 0) / 7) * (17.08-(-85)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 17.08 + (((tickAnim - 7) / 8) * (31.72-(17.08)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 31.72 + (((tickAnim - 15) / 5) * (0-(31.72)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-85-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraChilesaurus e = (EntityPrehistoricFloraChilesaurus) entity;
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
