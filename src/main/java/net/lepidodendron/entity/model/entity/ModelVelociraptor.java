package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVelociraptor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelVelociraptor extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer throatPouch;
    private final AdvancedModelRenderer throatPouch2;
    private final AdvancedModelRenderer headTop;
    private final AdvancedModelRenderer headTop2;
    private final AdvancedModelRenderer rightLacrimal;
    private final AdvancedModelRenderer rightLacrimal2;
    private final AdvancedModelRenderer leftLacrimal;
    private final AdvancedModelRenderer leftLacrimal2;
    private final AdvancedModelRenderer headFeathers;
    private final AdvancedModelRenderer headFeathers2;
    private final AdvancedModelRenderer upperJaw;
    private final AdvancedModelRenderer upperJawRight;
    private final AdvancedModelRenderer upperJawLeft;
    private final AdvancedModelRenderer upperJaw2;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer noseSlope;
    private final AdvancedModelRenderer rightUpperTeeth;
    private final AdvancedModelRenderer leftUpperTeeth;
    private final AdvancedModelRenderer upperTeeth;
    private final AdvancedModelRenderer upperSlopeRight;
    private final AdvancedModelRenderer upperSlopeLeft;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer throatPouch3;
    private final AdvancedModelRenderer throatPouch4;
    private final AdvancedModelRenderer neckFeathers5;
    private final AdvancedModelRenderer neckFeathers4;
    private final AdvancedModelRenderer neckSupport2;
    private final AdvancedModelRenderer neckFeathers2;
    private final AdvancedModelRenderer neckFeathers3;
    private final AdvancedModelRenderer neckFeathers;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer leftFinger2;
    private final AdvancedModelRenderer leftFinger3;
    private final AdvancedModelRenderer leftWingFeathers3;
    private final AdvancedModelRenderer leftWingFeathers4;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftWingFeathers2;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftPropatagiumExtention;
    private final AdvancedModelRenderer leftWingFeathers;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer rightFinger2;
    private final AdvancedModelRenderer rightFinger3;
    private final AdvancedModelRenderer rightWingFeathers3;
    private final AdvancedModelRenderer rightWingFeathers4;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightWingFeathers2;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer cube;
    private final AdvancedModelRenderer rightWingFeathers;
    private final AdvancedModelRenderer bodyFeathersUnder2;
    private final AdvancedModelRenderer bodyFeathers3;
    private final AdvancedModelRenderer bodyFeathers4;
    private final AdvancedModelRenderer bodyFeathersUnder;
    private final AdvancedModelRenderer bodyFeathers2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer rightTailFan3;
    private final AdvancedModelRenderer rightTailFan4;
    private final AdvancedModelRenderer leftTailFan3;
    private final AdvancedModelRenderer leftTailFan4;
    private final AdvancedModelRenderer rightTailFan2;
    private final AdvancedModelRenderer leftTailFan2;
    private final AdvancedModelRenderer tailfeathersUnder3;
    private final AdvancedModelRenderer rightTailFan;
    private final AdvancedModelRenderer leftTailFan;
    private final AdvancedModelRenderer tailFeathersUnder2;
    private final AdvancedModelRenderer tailFeathersUnder;
    private final AdvancedModelRenderer tailFeathers;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightSickleClaw;
    private final AdvancedModelRenderer rightSickleClaw2;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer rightLegFeathers2;
    private final AdvancedModelRenderer rightLegFeathers;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftSickleClaw;
    private final AdvancedModelRenderer leftSickleClaw2;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer leftLegFeathers2;
    private final AdvancedModelRenderer leftLegFeathers;
    private final AdvancedModelRenderer bodyFeathers;
    private ModelAnimator animator;

    public ModelVelociraptor() {
        this.textureWidth = 99;
        this.textureHeight = 100;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 5.85F, 0.0F);
        this.main.addChild(hips);
        this.setRotateAngle(hips, -0.0637F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 13, -2.0F, -2.0F, -3.5F, 4, 9, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.01F, 0.0F, -2.8F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1698F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 50, 38, -2.49F, -2.0F, -5.0F, 5, 8, 5, 0.004F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -4.3F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1911F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 35, 0, -2.99F, -1.5F, -6.0F, 6, 6, 6, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.8727F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 26, 79, -1.49F, -0.5F, -3.0F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.01F, 2.5F, 1.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5541F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 33, -1.5F, -2.0F, 0.0F, 3, 2, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.01F, 2.5F, -1.5F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2138F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 72, -2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2F, -2.4F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2972F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 77, 13, -0.99F, -0.5F, -4.5F, 2, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.01F, 1.4F, 0.0F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1265F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 81, 0, -1.0F, -0.5F, -4.5F, 2, 1, 5, -0.004F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.02F, 0.0F, -3.9F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3396F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 82, 79, -1.01F, -0.5F, -2.9F, 2, 3, 3, -0.002F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-0.01F, -0.5F, -2.7F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.4882F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 88, 21, -1.0F, 0.0F, -1.9F, 2, 3, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.7F, -1.6F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3396F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 67, 83, -0.99F, -0.5F, -3.0F, 2, 2, 3, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 84, 62, -0.99F, 0.0F, -3.0F, 2, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.01F, 0.495F, -6.15F);
        this.jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 89, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.225F, 0.17F, -5.875F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 67, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 67, -0.43F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3F, 0.65F, -4.775F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0742F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 93, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 93, -1.08F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.395F, 1.025F, -4.975F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1353F, -0.096F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 92, -0.3704F, -0.9315F, 0.2651F, 1, 1, 2, -0.006F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.415F, 1.025F, -4.975F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1353F, 0.096F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 92, -0.6296F, -0.9315F, 0.2651F, 1, 1, 2, -0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.45F, 0.125F, -2.65F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1884F, 0.09F, -0.0171F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 88, -0.5F, -2.125F, -0.05F, 1, 2, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.47F, 0.125F, -2.65F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1884F, -0.09F, 0.0171F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 88, -0.5F, -2.125F, -0.05F, 1, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.01F, 0.725F, -1.4F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1484F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 73, 33, -1.0F, -0.5F, -1.5F, 2, 1, 3, 0.002F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 1.2F, -3.0F);
        this.jaw.addChild(throatPouch);
        this.setRotateAngle(throatPouch, -0.1911F, 0.0F, 0.0F);
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 93, 77, -0.49F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));

        this.throatPouch2 = new AdvancedModelRenderer(this);
        this.throatPouch2.setRotationPoint(-0.01F, 0.0F, 2.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, 0.4033F, 0.0F, 0.0F);
        this.throatPouch2.cubeList.add(new ModelBox(throatPouch2, 95, 46, -0.48F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.headTop = new AdvancedModelRenderer(this);
        this.headTop.setRotationPoint(0.02F, -0.5F, -0.1F);
        this.head.addChild(headTop);
        this.setRotateAngle(headTop, -0.2759F, 0.0F, 0.0F);
        this.headTop.cubeList.add(new ModelBox(headTop, 92, 43, -1.01F, -0.2F, -1.0F, 2, 1, 1, 0.0F, false));

        this.headTop2 = new AdvancedModelRenderer(this);
        this.headTop2.setRotationPoint(-0.01F, -0.2F, -1.0F);
        this.headTop.addChild(headTop2);
        this.setRotateAngle(headTop2, 0.3609F, 0.0F, 0.0F);
        this.headTop2.cubeList.add(new ModelBox(headTop2, 89, 91, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.rightLacrimal = new AdvancedModelRenderer(this);
        this.rightLacrimal.setRotationPoint(1.12F, 0.06F, -2.0F);
        this.headTop2.addChild(rightLacrimal);
        this.setRotateAngle(rightLacrimal, 0.3821F, 0.0848F, 0.1911F);
        this.rightLacrimal.cubeList.add(new ModelBox(rightLacrimal, 0, 94, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.rightLacrimal2 = new AdvancedModelRenderer(this);
        this.rightLacrimal2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLacrimal.addChild(rightLacrimal2);
        this.setRotateAngle(rightLacrimal2, -0.5308F, -0.1698F, -0.0213F);
        this.rightLacrimal2.cubeList.add(new ModelBox(rightLacrimal2, 93, 81, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftLacrimal = new AdvancedModelRenderer(this);
        this.leftLacrimal.setRotationPoint(-1.12F, 0.06F, -2.0F);
        this.headTop2.addChild(leftLacrimal);
        this.setRotateAngle(leftLacrimal, 0.3821F, -0.0848F, -0.1911F);
        this.leftLacrimal.cubeList.add(new ModelBox(leftLacrimal, 0, 94, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.leftLacrimal2 = new AdvancedModelRenderer(this);
        this.leftLacrimal2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLacrimal.addChild(leftLacrimal2);
        this.setRotateAngle(leftLacrimal2, -0.5308F, 0.1698F, 0.0213F);
        this.leftLacrimal2.cubeList.add(new ModelBox(leftLacrimal2, 93, 81, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.headFeathers = new AdvancedModelRenderer(this);
        this.headFeathers.setRotationPoint(0.0F, -0.2F, -0.6F);
        this.headTop.addChild(headFeathers);
        this.setRotateAngle(headFeathers, 0.2972F, 0.0F, 0.0F);
        this.headFeathers.cubeList.add(new ModelBox(headFeathers, 77, 21, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.headFeathers2 = new AdvancedModelRenderer(this);
        this.headFeathers2.setRotationPoint(0.0F, -0.2F, -1.0F);
        this.headTop.addChild(headFeathers2);
        this.setRotateAngle(headFeathers2, 0.4671F, 0.0F, 0.0F);
        this.headFeathers2.cubeList.add(new ModelBox(headFeathers2, 84, 67, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.upperJaw = new AdvancedModelRenderer(this);
        this.upperJaw.setRotationPoint(-0.3F, 0.51F, -2.9F);
        this.head.addChild(upperJaw);
        this.setRotateAngle(upperJaw, 0.0637F, 0.0F, 0.0F);


        this.upperJawRight = new AdvancedModelRenderer(this);
        this.upperJawRight.setRotationPoint(0.6F, 0.0F, 0.0F);
        this.upperJaw.addChild(upperJawRight);
        this.upperJawRight.cubeList.add(new ModelBox(upperJawRight, 66, 94, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.upperJawLeft = new AdvancedModelRenderer(this);
        this.upperJawLeft.setRotationPoint(0.02F, 0.0F, 0.0F);
        this.upperJaw.addChild(upperJawLeft);
        this.upperJawLeft.cubeList.add(new ModelBox(upperJawLeft, 66, 94, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.upperJaw2 = new AdvancedModelRenderer(this);
        this.upperJaw2.setRotationPoint(0.3F, 1.0F, -1.8F);
        this.upperJaw.addChild(upperJaw2);
        this.setRotateAngle(upperJaw2, -0.1485F, 0.0F, 0.0F);
        this.upperJaw2.cubeList.add(new ModelBox(upperJaw2, 89, 86, -0.49F, -1.0F, -3.0F, 1, 1, 3, 0.001F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-0.01F, -1.0F, -3.0F);
        this.upperJaw2.addChild(nose);
        this.setRotateAngle(nose, 0.3183F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 95, 58, -0.48F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.noseSlope = new AdvancedModelRenderer(this);
        this.noseSlope.setRotationPoint(0.02F, 0.0F, 1.0F);
        this.nose.addChild(noseSlope);
        this.setRotateAngle(noseSlope, -0.1183F, 0.0F, 0.0F);
        this.noseSlope.cubeList.add(new ModelBox(noseSlope, 7, 95, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.rightUpperTeeth = new AdvancedModelRenderer(this);
        this.rightUpperTeeth.setRotationPoint(0.25F, -0.8F, -2.8F);
        this.upperJaw2.addChild(rightUpperTeeth);
        this.setRotateAngle(rightUpperTeeth, -0.0637F, 0.0637F, 0.0F);
        this.rightUpperTeeth.cubeList.add(new ModelBox(rightUpperTeeth, 38, 92, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.leftUpperTeeth = new AdvancedModelRenderer(this);
        this.leftUpperTeeth.setRotationPoint(-0.23F, -0.8F, -2.8F);
        this.upperJaw2.addChild(leftUpperTeeth);
        this.setRotateAngle(leftUpperTeeth, -0.0637F, -0.0637F, 0.0F);
        this.leftUpperTeeth.cubeList.add(new ModelBox(leftUpperTeeth, 38, 92, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.upperTeeth = new AdvancedModelRenderer(this);
        this.upperTeeth.setRotationPoint(0.31F, 0.35F, -1.6F);
        this.upperJaw.addChild(upperTeeth);
        this.setRotateAngle(upperTeeth, 0.2335F, 0.0F, 0.0F);
        this.upperTeeth.cubeList.add(new ModelBox(upperTeeth, 95, 61, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.upperSlopeRight = new AdvancedModelRenderer(this);
        this.upperSlopeRight.setRotationPoint(0.39F, -0.5F, -2.9F);
        this.head.addChild(upperSlopeRight);
        this.setRotateAngle(upperSlopeRight, 0.2335F, 0.0424F, 0.0F);
        this.upperSlopeRight.cubeList.add(new ModelBox(upperSlopeRight, 91, 67, -0.5F, 0.0F, -2.2F, 1, 1, 3, 0.0F, false));

        this.upperSlopeLeft = new AdvancedModelRenderer(this);
        this.upperSlopeLeft.setRotationPoint(-0.37F, -0.5F, -2.9F);
        this.head.addChild(upperSlopeLeft);
        this.setRotateAngle(upperSlopeLeft, 0.2335F, -0.0424F, 0.0F);
        this.upperSlopeLeft.cubeList.add(new ModelBox(upperSlopeLeft, 91, 67, -0.5F, 0.0F, -2.2F, 1, 1, 3, 0.0F, true));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(0.56F, 0.25F, -2.0F);
        this.head.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.2546F, 0.0848F, 0.0F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 95, 64, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(-0.54F, 0.25F, -2.0F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.2546F, -0.0848F, 0.0F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 95, 64, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.throatPouch3 = new AdvancedModelRenderer(this);
        this.throatPouch3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.neck4.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, 0.4882F, 0.0F, 0.0F);
        this.throatPouch3.cubeList.add(new ModelBox(throatPouch3, 95, 54, -0.5F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));

        this.throatPouch4 = new AdvancedModelRenderer(this);
        this.throatPouch4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.throatPouch3.addChild(throatPouch4);
        this.setRotateAngle(throatPouch4, -0.5095F, 0.0F, 0.0F);
        this.throatPouch4.cubeList.add(new ModelBox(throatPouch4, 95, 50, -0.5F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));

        this.neckFeathers5 = new AdvancedModelRenderer(this);
        this.neckFeathers5.setRotationPoint(-0.02F, 0.0F, -1.7F);
        this.neck4.addChild(neckFeathers5);
        this.setRotateAngle(neckFeathers5, 0.1911F, 0.0F, 0.0F);
        this.neckFeathers5.cubeList.add(new ModelBox(neckFeathers5, 91, 72, -0.98F, 0.0F, 0.0F, 2, 2, 2, 0.004F, false));

        this.neckFeathers4 = new AdvancedModelRenderer(this);
        this.neckFeathers4.setRotationPoint(0.01F, -0.5F, -2.9F);
        this.neck3.addChild(neckFeathers4);
        this.setRotateAngle(neckFeathers4, 0.2122F, 0.0F, 0.0F);
        this.neckFeathers4.cubeList.add(new ModelBox(neckFeathers4, 84, 56, -1.02F, 0.0F, 0.0F, 2, 2, 3, 0.002F, false));

        this.neckSupport2 = new AdvancedModelRenderer(this);
        this.neckSupport2.setRotationPoint(-0.01F, 0.9F, 0.0F);
        this.neck2.addChild(neckSupport2);
        this.setRotateAngle(neckSupport2, 0.0848F, 0.0F, 0.0F);


        this.neckFeathers2 = new AdvancedModelRenderer(this);
        this.neckFeathers2.setRotationPoint(0.01F, -0.5F, -4.5F);
        this.neck2.addChild(neckFeathers2);
        this.setRotateAngle(neckFeathers2, 0.1485F, 0.0F, 0.0F);
        this.neckFeathers2.cubeList.add(new ModelBox(neckFeathers2, 43, 73, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.001F, false));

        this.neckFeathers3 = new AdvancedModelRenderer(this);
        this.neckFeathers3.setRotationPoint(0.0F, -0.5F, -4.425F);
        this.neck2.addChild(neckFeathers3);
        this.setRotateAngle(neckFeathers3, 0.2546F, 0.0F, 0.0F);
        this.neckFeathers3.cubeList.add(new ModelBox(neckFeathers3, 88, 27, -1.0F, -0.0202F, -0.0639F, 2, 0, 3, 0.0F, false));

        this.neckFeathers = new AdvancedModelRenderer(this);
        this.neckFeathers.setRotationPoint(-0.01F, -0.5F, -3.0F);
        this.neck.addChild(neckFeathers);
        this.setRotateAngle(neckFeathers, 0.2759F, 0.0F, 0.0F);
        this.neckFeathers.cubeList.add(new ModelBox(neckFeathers, 0, 82, -1.48F, 0.0F, 0.0F, 3, 2, 3, 0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(-2.68F, 1.3F, -5.0F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.0613F, -0.2122F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 82, 69, -1.5F, -0.5F, -1.0F, 2, 7, 2, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.8F, 6.3F, -0.2F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.3565F, 0.0247F, -0.0247F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 13, 86, -0.5F, 0.0F, -1.8F, 1, 6, 2, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.45F, 5.1F, -0.8F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.9976F, 0.0147F, 0.0542F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 92, 38, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.02F, 1.8F, 0.5F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, 0.0213F, 0.0F, -0.0637F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 95, 31, 0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.leftFinger2 = new AdvancedModelRenderer(this);
        this.leftFinger2.setRotationPoint(0.01F, 1.8F, -0.5F);
        this.leftHand.addChild(leftFinger2);
        this.setRotateAngle(leftFinger2, -0.0213F, 0.0F, -0.0213F);
        this.leftFinger2.cubeList.add(new ModelBox(leftFinger2, 25, 92, 0.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.leftFinger3 = new AdvancedModelRenderer(this);
        this.leftFinger3.setRotationPoint(0.02F, 0.5F, -1.0F);
        this.leftHand.addChild(leftFinger3);
        this.setRotateAngle(leftFinger3, -0.2972F, 0.0F, -0.0637F);
        this.leftFinger3.cubeList.add(new ModelBox(leftFinger3, 52, 81, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, true));

        this.leftWingFeathers3 = new AdvancedModelRenderer(this);
        this.leftWingFeathers3.setRotationPoint(-0.01F, 0.0F, -1.0F);
        this.leftHand.addChild(leftWingFeathers3);
        this.setRotateAngle(leftWingFeathers3, 0.0637F, 0.0F, 0.0F);
        this.leftWingFeathers3.cubeList.add(new ModelBox(leftWingFeathers3, 71, 56, 0.0F, 0.0F, 0.0F, 0, 6, 6, 0.0F, true));

        this.leftWingFeathers4 = new AdvancedModelRenderer(this);
        this.leftWingFeathers4.setRotationPoint(0.0F, 6.0F, 0.5F);
        this.leftWingFeathers3.addChild(leftWingFeathers4);
        this.setRotateAngle(leftWingFeathers4, 0.3183F, 0.0017F, 0.0F);
        this.leftWingFeathers4.cubeList.add(new ModelBox(leftWingFeathers4, 41, 81, 0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F, true));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(-0.18F, 6.0F, -1.8F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.2546F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 75, 91, 0.0F, -6.0F, 0.0F, 0, 6, 2, 0.0F, true));

        this.leftWingFeathers2 = new AdvancedModelRenderer(this);
        this.leftWingFeathers2.setRotationPoint(-0.49F, 0.0F, 0.2F);
        this.leftArm2.addChild(leftWingFeathers2);
        this.leftWingFeathers2.cubeList.add(new ModelBox(leftWingFeathers2, 71, 69, 0.0F, -2.0F, 0.0F, 0, 8, 5, 0.0F, true));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(-1.0F, -0.5F, -1.5F);
        this.leftArm.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.2546F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 20, 92, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.leftPropatagiumExtention = new AdvancedModelRenderer(this);
        this.leftPropatagiumExtention.setRotationPoint(0.01F, 4.0F, 0.0F);
        this.leftUpperPropatagium.addChild(leftPropatagiumExtention);
        this.setRotateAngle(leftPropatagiumExtention, 0.7217F, 0.0F, 0.0F);
        this.leftPropatagiumExtention.cubeList.add(new ModelBox(leftPropatagiumExtention, 14, 95, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.leftWingFeathers = new AdvancedModelRenderer(this);
        this.leftWingFeathers.setRotationPoint(-0.91F, 0.0F, -1.0F);
        this.leftArm.addChild(leftWingFeathers);
        this.setRotateAngle(leftWingFeathers, 0.0F, 0.0213F, 0.0637F);
        this.leftWingFeathers.cubeList.add(new ModelBox(leftWingFeathers, 58, 73, 0.0F, 0.0F, 0.0F, 0, 9, 4, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(2.7F, 1.3F, -5.0F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.0613F, 0.2122F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 82, 69, -0.5F, -0.5F, -1.0F, 2, 7, 2, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.8F, 6.3F, -0.2F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.3565F, -0.0247F, 0.0247F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 13, 86, -0.5F, 0.0F, -1.8F, 1, 6, 2, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.45F, 5.1F, -0.8F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.9976F, -0.0147F, -0.0542F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 92, 38, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(-0.02F, 1.8F, 0.5F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, 0.0213F, 0.0F, 0.0637F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 95, 31, -1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.rightFinger2 = new AdvancedModelRenderer(this);
        this.rightFinger2.setRotationPoint(-0.01F, 1.8F, -0.5F);
        this.rightHand.addChild(rightFinger2);
        this.setRotateAngle(rightFinger2, -0.0213F, 0.0F, 0.0213F);
        this.rightFinger2.cubeList.add(new ModelBox(rightFinger2, 25, 92, -1.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.rightFinger3 = new AdvancedModelRenderer(this);
        this.rightFinger3.setRotationPoint(-0.02F, 0.5F, -1.0F);
        this.rightHand.addChild(rightFinger3);
        this.setRotateAngle(rightFinger3, -0.2972F, 0.0F, 0.0637F);
        this.rightFinger3.cubeList.add(new ModelBox(rightFinger3, 52, 81, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        this.rightWingFeathers3 = new AdvancedModelRenderer(this);
        this.rightWingFeathers3.setRotationPoint(0.01F, 0.0F, -1.0F);
        this.rightHand.addChild(rightWingFeathers3);
        this.setRotateAngle(rightWingFeathers3, 0.0637F, 0.0F, 0.0F);
        this.rightWingFeathers3.cubeList.add(new ModelBox(rightWingFeathers3, 71, 56, 0.0F, 0.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.rightWingFeathers4 = new AdvancedModelRenderer(this);
        this.rightWingFeathers4.setRotationPoint(0.0F, 6.0F, 0.5F);
        this.rightWingFeathers3.addChild(rightWingFeathers4);
        this.setRotateAngle(rightWingFeathers4, 0.3183F, -0.0017F, 0.0F);
        this.rightWingFeathers4.cubeList.add(new ModelBox(rightWingFeathers4, 41, 81, 0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(0.18F, 6.0F, -1.8F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.2546F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 75, 91, 0.0F, -6.0F, 0.0F, 0, 6, 2, 0.0F, false));

        this.rightWingFeathers2 = new AdvancedModelRenderer(this);
        this.rightWingFeathers2.setRotationPoint(0.49F, 0.0F, 0.2F);
        this.rightArm2.addChild(rightWingFeathers2);
        this.rightWingFeathers2.cubeList.add(new ModelBox(rightWingFeathers2, 71, 69, 0.0F, -2.0F, 0.0F, 0, 8, 5, 0.0F, false));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(1.0F, -0.5F, -1.5F);
        this.rightArm.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.2546F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 20, 92, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.cube = new AdvancedModelRenderer(this);
        this.cube.setRotationPoint(-0.01F, 4.0F, 0.0F);
        this.rightUpperPropatagium.addChild(cube);
        this.setRotateAngle(cube, 0.7217F, 0.0F, 0.0F);
        this.cube.cubeList.add(new ModelBox(cube, 14, 95, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.rightWingFeathers = new AdvancedModelRenderer(this);
        this.rightWingFeathers.setRotationPoint(0.91F, 0.0F, -1.0F);
        this.rightArm.addChild(rightWingFeathers);
        this.setRotateAngle(rightWingFeathers, 0.0F, -0.0213F, -0.0637F);
        this.rightWingFeathers.cubeList.add(new ModelBox(rightWingFeathers, 58, 73, 0.0F, 0.0F, 0.0F, 0, 9, 4, 0.0F, false));

        this.bodyFeathersUnder2 = new AdvancedModelRenderer(this);
        this.bodyFeathersUnder2.setRotationPoint(-0.01F, 4.5F, -6.0F);
        this.body2.addChild(bodyFeathersUnder2);
        this.setRotateAngle(bodyFeathersUnder2, -0.5095F, 0.0F, 0.0F);
        this.bodyFeathersUnder2.cubeList.add(new ModelBox(bodyFeathersUnder2, 48, 64, -2.98F, -3.0F, 0.0F, 6, 3, 5, 0.005F, false));

        this.bodyFeathers3 = new AdvancedModelRenderer(this);
        this.bodyFeathers3.setRotationPoint(-0.02F, -1.5F, -6.0F);
        this.body2.addChild(bodyFeathers3);
        this.setRotateAngle(bodyFeathers3, 0.1061F, 0.0F, 0.0F);
        this.bodyFeathers3.cubeList.add(new ModelBox(bodyFeathers3, 0, 45, -2.97F, 0.0F, 0.0F, 6, 4, 6, 0.01F, false));

        this.bodyFeathers4 = new AdvancedModelRenderer(this);
        this.bodyFeathers4.setRotationPoint(0.0F, -1.5F, -5.8F);
        this.body2.addChild(bodyFeathers4);
        this.setRotateAngle(bodyFeathers4, 0.3609F, 0.0F, 0.0F);
        this.bodyFeathers4.cubeList.add(new ModelBox(bodyFeathers4, 81, 7, -1.99F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.bodyFeathersUnder = new AdvancedModelRenderer(this);
        this.bodyFeathersUnder.setRotationPoint(0.01F, 6.0F, -5.0F);
        this.body.addChild(bodyFeathersUnder);
        this.setRotateAngle(bodyFeathersUnder, -0.4458F, 0.0F, 0.0F);
        this.bodyFeathersUnder.cubeList.add(new ModelBox(bodyFeathersUnder, 71, 38, -3.0F, -3.0F, 0.0F, 6, 3, 4, 0.0F, false));

        this.bodyFeathers2 = new AdvancedModelRenderer(this);
        this.bodyFeathers2.setRotationPoint(0.02F, -2.0F, -5.0F);
        this.body.addChild(bodyFeathers2);
        this.setRotateAngle(bodyFeathers2, 0.0848F, 0.0F, 0.0F);
        this.bodyFeathers2.cubeList.add(new ModelBox(bodyFeathers2, 0, 56, -3.01F, 0.0F, 0.0F, 6, 5, 5, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, 3.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0213F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 60, 0, -1.5F, -1.5F, -0.8F, 3, 5, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 5.3F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1061F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 25, -1.0F, -1.0F, 0.0F, 2, 3, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.45F, 9.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0848F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 31, -0.5F, -0.5F, 0.0F, 1, 2, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.01F, 0.1F, 10.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0848F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 39, -0.49F, -0.5F, 0.0F, 1, 1, 11, -0.001F, false));

        this.rightTailFan3 = new AdvancedModelRenderer(this);
        this.rightTailFan3.setRotationPoint(0.0F, -0.37F, 0.0F);
        this.tail4.addChild(rightTailFan3);
        this.setRotateAngle(rightTailFan3, -0.0213F, 0.0424F, 0.3609F);
        this.rightTailFan3.cubeList.add(new ModelBox(rightTailFan3, 0, 0, 0.0F, 0.0F, 0.0F, 5, 0, 12, 0.0F, false));

        this.rightTailFan4 = new AdvancedModelRenderer(this);
        this.rightTailFan4.setRotationPoint(3.0F, 0.0F, 12.0F);
        this.rightTailFan3.addChild(rightTailFan4);
        this.setRotateAngle(rightTailFan4, -0.3821F, 0.0F, 0.0F);
        this.rightTailFan4.cubeList.add(new ModelBox(rightTailFan4, 23, 64, -2.5F, 0.0F, 0.0F, 5, 0, 7, 0.0F, false));

        this.leftTailFan3 = new AdvancedModelRenderer(this);
        this.leftTailFan3.setRotationPoint(0.02F, -0.37F, 0.0F);
        this.tail4.addChild(leftTailFan3);
        this.setRotateAngle(leftTailFan3, -0.0213F, -0.0424F, -0.3609F);
        this.leftTailFan3.cubeList.add(new ModelBox(leftTailFan3, 0, 0, -5.0F, 0.0F, 0.0F, 5, 0, 12, 0.0F, true));

        this.leftTailFan4 = new AdvancedModelRenderer(this);
        this.leftTailFan4.setRotationPoint(-3.0F, 0.0F, 12.0F);
        this.leftTailFan3.addChild(leftTailFan4);
        this.setRotateAngle(leftTailFan4, -0.3821F, 0.0F, 0.0F);
        this.leftTailFan4.cubeList.add(new ModelBox(leftTailFan4, 23, 64, -2.5F, 0.0F, 0.0F, 5, 0, 7, 0.0F, true));

        this.rightTailFan2 = new AdvancedModelRenderer(this);
        this.rightTailFan2.setRotationPoint(0.0F, -0.07F, 0.0F);
        this.tail3.addChild(rightTailFan2);
        this.setRotateAngle(rightTailFan2, 0.0213F, 0.0424F, 0.3609F);
        this.rightTailFan2.cubeList.add(new ModelBox(rightTailFan2, 25, 13, 0.0F, 0.0F, 0.0F, 3, 0, 11, 0.0F, false));

        this.leftTailFan2 = new AdvancedModelRenderer(this);
        this.leftTailFan2.setRotationPoint(0.0F, -0.07F, 0.0F);
        this.tail3.addChild(leftTailFan2);
        this.setRotateAngle(leftTailFan2, 0.0213F, -0.0424F, -0.3609F);
        this.leftTailFan2.cubeList.add(new ModelBox(leftTailFan2, 25, 13, -3.0F, 0.0F, 0.0F, 3, 0, 11, 0.0F, true));

        this.tailfeathersUnder3 = new AdvancedModelRenderer(this);
        this.tailfeathersUnder3.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.tail3.addChild(tailfeathersUnder3);
        this.setRotateAngle(tailfeathersUnder3, 0.0848F, 0.0F, 0.0F);
        this.tailfeathersUnder3.cubeList.add(new ModelBox(tailfeathersUnder3, 50, 25, 0.0F, 0.0F, 0.0F, 0, 1, 11, 0.0F, false));

        this.rightTailFan = new AdvancedModelRenderer(this);
        this.rightTailFan.setRotationPoint(0.5F, 0.07F, 0.0F);
        this.tail2.addChild(rightTailFan);
        this.setRotateAngle(rightTailFan, 0.0424F, 0.0424F, 0.3609F);
        this.rightTailFan.cubeList.add(new ModelBox(rightTailFan, 54, 13, 0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, false));

        this.leftTailFan = new AdvancedModelRenderer(this);
        this.leftTailFan.setRotationPoint(-0.5F, 0.07F, 0.0F);
        this.tail2.addChild(leftTailFan);
        this.setRotateAngle(leftTailFan, 0.0424F, -0.0424F, -0.3609F);
        this.leftTailFan.cubeList.add(new ModelBox(leftTailFan, 54, 13, -1.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, true));

        this.tailFeathersUnder2 = new AdvancedModelRenderer(this);
        this.tailFeathersUnder2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tail2.addChild(tailFeathersUnder2);
        this.setRotateAngle(tailFeathersUnder2, 0.0848F, 0.0F, 0.0F);
        this.tailFeathersUnder2.cubeList.add(new ModelBox(tailFeathersUnder2, 25, 52, -0.5F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

        this.tailFeathersUnder = new AdvancedModelRenderer(this);
        this.tailFeathersUnder.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tail.addChild(tailFeathersUnder);
        this.setRotateAngle(tailFeathersUnder, 0.2122F, 0.0F, 0.0F);
        this.tailFeathersUnder.cubeList.add(new ModelBox(tailFeathersUnder, 73, 24, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.tailFeathers = new AdvancedModelRenderer(this);
        this.tailFeathers.setRotationPoint(-0.01F, -1.7F, 0.0F);
        this.tail.addChild(tailFeathers);
        this.setRotateAngle(tailFeathers, 0.0637F, 0.0F, 0.0F);
        this.tailFeathers.cubeList.add(new ModelBox(tailFeathers, 71, 46, -1.49F, 0.0F, 0.0F, 3, 4, 5, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(1.7F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2122F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 67, 0.0F, -1.0F, -1.5F, 2, 9, 5, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.99F, 7.0F, -0.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9765F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 15, 72, -1.0F, -0.3F, -0.5F, 2, 10, 3, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.01F, 8.6F, 0.3F);
        this.rightLeg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.0189F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 88, 46, -1.0F, -1.0F, -0.5F, 2, 6, 1, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightleg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3183F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 20, 87, -0.5F, 0.0F, -2.8F, 2, 1, 3, 0.0F, false));

        this.rightSickleClaw = new AdvancedModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(-0.4F, 0.4F, -0.2F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.5732F, 0.2972F, 0.0F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 80, 91, -0.8F, -0.5F, -2.8F, 1, 1, 3, 0.0F, false));

        this.rightSickleClaw2 = new AdvancedModelRenderer(this);
        this.rightSickleClaw2.setRotationPoint(-0.3F, 0.0F, -2.8F);
        this.rightSickleClaw.addChild(rightSickleClaw2);
        this.setRotateAngle(rightSickleClaw2, -0.743F, 0.0F, 0.0F);
        this.rightSickleClaw2.cubeList.add(new ModelBox(rightSickleClaw2, 92, 13, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.51F, 0.49F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 78, 86, -1.0F, -0.5F, -2.9F, 2, 1, 3, 0.0F, false));

        this.rightLegFeathers2 = new AdvancedModelRenderer(this);
        this.rightLegFeathers2.setRotationPoint(0.15F, 0.5F, 2.3F);
        this.rightLeg2.addChild(rightLegFeathers2);
        this.setRotateAngle(rightLegFeathers2, 0.2759F, 0.0F, 0.0F);
        this.rightLegFeathers2.cubeList.add(new ModelBox(rightLegFeathers2, 31, 87, -0.5F, 0.0F, -1.5F, 1, 6, 2, 0.0F, false));

        this.rightLegFeathers = new AdvancedModelRenderer(this);
        this.rightLegFeathers.setRotationPoint(0.7F, -0.5F, 3.0F);
        this.rightLeg.addChild(rightLegFeathers);
        this.setRotateAngle(rightLegFeathers, 0.0F, 0.0F, -0.0637F);
        this.rightLegFeathers.cubeList.add(new ModelBox(rightLegFeathers, 61, 87, -0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(-1.7F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2122F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 67, -2.0F, -1.0F, -1.5F, 2, 9, 5, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.99F, 7.0F, -0.9F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9765F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 15, 72, -1.0F, -0.3F, -0.5F, 2, 10, 3, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.01F, 8.6F, 0.3F);
        this.leftLeg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.0189F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 88, 46, -1.0F, -1.0F, -0.5F, 2, 6, 1, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftleg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3183F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 20, 87, -1.5F, 0.0F, -2.8F, 2, 1, 3, 0.0F, true));

        this.leftSickleClaw = new AdvancedModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(0.4F, 0.4F, -0.2F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.5732F, -0.2972F, 0.0F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 80, 91, -0.2F, -0.5F, -2.8F, 1, 1, 3, 0.0F, true));

        this.leftSickleClaw2 = new AdvancedModelRenderer(this);
        this.leftSickleClaw2.setRotationPoint(0.3F, 0.0F, -2.8F);
        this.leftSickleClaw.addChild(leftSickleClaw2);
        this.setRotateAngle(leftSickleClaw2, -0.743F, 0.0F, 0.0F);
        this.leftSickleClaw2.cubeList.add(new ModelBox(leftSickleClaw2, 92, 13, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, true));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(-0.51F, 0.49F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 78, 86, -1.0F, -0.5F, -2.9F, 2, 1, 3, 0.0F, true));

        this.leftLegFeathers2 = new AdvancedModelRenderer(this);
        this.leftLegFeathers2.setRotationPoint(-0.15F, 0.5F, 2.3F);
        this.leftLeg2.addChild(leftLegFeathers2);
        this.setRotateAngle(leftLegFeathers2, 0.2759F, 0.0F, 0.0F);
        this.leftLegFeathers2.cubeList.add(new ModelBox(leftLegFeathers2, 31, 87, -0.5F, 0.0F, -1.5F, 1, 6, 2, 0.0F, true));

        this.leftLegFeathers = new AdvancedModelRenderer(this);
        this.leftLegFeathers.setRotationPoint(-0.7F, -0.5F, 3.0F);
        this.leftLeg.addChild(leftLegFeathers);
        this.setRotateAngle(leftLegFeathers, 0.0F, 0.0F, 0.0637F);
        this.leftLegFeathers.cubeList.add(new ModelBox(leftLegFeathers, 61, 87, -0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F, true));

        this.bodyFeathers = new AdvancedModelRenderer(this);
        this.bodyFeathers.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.hips.addChild(bodyFeathers);
        this.setRotateAngle(bodyFeathers, 0.0848F, 0.0F, 0.0F);
        this.bodyFeathers.cubeList.add(new ModelBox(bodyFeathers, 48, 52, -2.5F, 0.0F, 0.0F, 5, 5, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.6F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(240);
        this.main.rotateAngleX = (float)Math.toRadians(-0);
        this.main.rotateAngleZ = (float)Math.toRadians(3);
        this.main.scaleChildren = true;
        float scaler = 0.45F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraVelociraptor EntityMegalosaurus = (EntityPrehistoricFloraVelociraptor) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightHand};

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

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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
        EntityPrehistoricFloraVelociraptor ee = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION_FEMALE) {
            animDispFemale(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) {
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 500;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 59) {
            xx = 4.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*6 + (((tickAnim - 0) / 59) * (-23-(4.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*6)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 61) {
            xx = -23 + (((tickAnim - 59) / 2) * (-25.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-23)));
            yy = 0 + (((tickAnim - 59) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 2) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 94) {
            xx = -25.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 61) / 33) * (-20.325-(-25.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 61) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 33) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = -20.325 + (((tickAnim - 94) / 31) * (-7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10-(-20.325)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = -7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10 + (((tickAnim - 125) / 60) * (-20.275-(-7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 186) {
            xx = -20.275 + (((tickAnim - 185) / 1) * (-25.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-20.275)));
            yy = 0 + (((tickAnim - 185) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 1) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 219) {
            xx = -25.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 186) / 33) * (-22.075-(-25.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 186) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 33) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -22.075 + (((tickAnim - 219) / 9) * (-8.84099-(-22.075)));
            yy = 0 + (((tickAnim - 219) / 9) * (0.29123-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (-8.24489-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -8.84099 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1-(-8.84099)));
            yy = 0.29123 + (((tickAnim - 228) / 9) * (0-(0.29123)));
            zz = -8.24489 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-8.24489)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 237) / 83) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 320) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else if (tickAnim >= 328 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 328) / 0) * (-49.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 328) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 0) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = -49.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 328) / 22) * (-36.25-(-49.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 462) {
            xx = -36.25 + (((tickAnim - 350) / 112) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 350) / 112) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 112) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = -36.25 + (((tickAnim - 462) / 1) * (9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*50-(-36.25)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 1) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*50 + (((tickAnim - 463) / 37) * (0-(9.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*50)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (1-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            yy = 0.9 + (((tickAnim - 59) / 66) * (0-(0.9)));
            zz = 1 + (((tickAnim - 59) / 66) * (0-(1)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0.9-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (1-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            yy = 0.9 + (((tickAnim - 185) / 34) * (0.9-(0.9)));
            zz = 1 + (((tickAnim - 185) / 34) * (1-(1)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 219) / 9) * (-0.4-(0.9)));
            zz = 1 + (((tickAnim - 219) / 9) * (1-(1)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            yy = -0.4 + (((tickAnim - 228) / 9) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2-(-0.4)));
            zz = 1 + (((tickAnim - 228) / 9) * (1-(1)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2 + (((tickAnim - 237) / 83) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2)));
            zz = 1 + (((tickAnim - 237) / 83) * (1-(1)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2 + (((tickAnim - 320) / 8) * (-0.4-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.2)));
            zz = 1 + (((tickAnim - 320) / 8) * (1-(1)));
        }
        else if (tickAnim >= 328 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 328) / 0) * (0-(0)));
            yy = -0.4 + (((tickAnim - 328) / 0) * (-0.4-(-0.4)));
            zz = 1 + (((tickAnim - 328) / 0) * (1-(1)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            yy = -0.4 + (((tickAnim - 328) / 22) * (0-(-0.4)));
            zz = 1 + (((tickAnim - 328) / 22) * (-0.9-(1)));
        }
        else if (tickAnim >= 350 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 350) / 112) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 112) * (0-(0)));
            zz = -0.9 + (((tickAnim - 350) / 112) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 462 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 462) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 462) / 38) * (0-(0)));
            zz = -0.9 + (((tickAnim - 462) / 38) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (28.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 30) / 29) * (1.26188-(0)));
            yy = 28.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 30) / 29) * (13.38451-(28.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            zz = 0 + (((tickAnim - 30) / 29) * (8.54771-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 155) {
            xx = 1.26188 + (((tickAnim - 59) / 96) * (0-(1.26188)));
            yy = 13.38451 + (((tickAnim - 59) / 96) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(13.38451)));
            zz = 8.54771 + (((tickAnim - 59) / 96) * (0-(8.54771)));
        }
        else if (tickAnim >= 155 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 155) / 30) * (1.26188-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 155) / 30) * (-13.38451-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 155) / 30) * (-8.54771-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 1.26188 + (((tickAnim - 185) / 34) * (1.26188-(1.26188)));
            yy = -13.38451 + (((tickAnim - 185) / 34) * (-13.38451-(-13.38451)));
            zz = -8.54771 + (((tickAnim - 185) / 34) * (-8.54771-(-8.54771)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 1.26188 + (((tickAnim - 219) / 9) * (-1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(1.26188)));
            yy = -13.38451 + (((tickAnim - 219) / 9) * (0-(-13.38451)));
            zz = -8.54771 + (((tickAnim - 219) / 9) * (0-(-8.54771)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 228) / 9) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3-(-1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3 + (((tickAnim - 237) / 83) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3 + (((tickAnim - 320) / 30) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*3)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3 + (((tickAnim - 320) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 443) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1 + (((tickAnim - 350) / 93) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1)));
            yy = 0 + (((tickAnim - 350) / 93) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1 + (((tickAnim - 350) / 93) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1)));
        }
        else if (tickAnim >= 443 && tickAnim < 455) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1 + (((tickAnim - 443) / 12) * (-4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1)));
            yy = 0 + (((tickAnim - 443) / 12) * (-2.27188-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1 + (((tickAnim - 443) / 12) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1)));
        }
        else if (tickAnim >= 455 && tickAnim < 463) {
            xx = -4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1 + (((tickAnim - 455) / 8) * (-4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1-(-4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1)));
            yy = -2.27188 + (((tickAnim - 455) / 8) * (-2.27188-(-2.27188)));
            zz = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1 + (((tickAnim - 455) / 8) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1 + (((tickAnim - 463) / 37) * (0-(-4.7193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-290))*0.1)));
            yy = -2.27188 + (((tickAnim - 463) / 37) * (0-(-2.27188)));
            zz = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1 + (((tickAnim - 463) / 37) * (0-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-290))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (19.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 30) / 128) * (0-(0)));
            yy = 19.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 30) / 128) * (2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(19.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            zz = 0 + (((tickAnim - 30) / 128) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 158) / 27) * (-5.90285-(0)));
            yy = 2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 158) / 27) * (-7.571-(2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 158) / 27) * (-3.62911-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -5.90285 + (((tickAnim - 185) / 34) * (-5.90285-(-5.90285)));
            yy = -7.571 + (((tickAnim - 185) / 34) * (-7.571-(-7.571)));
            zz = -3.62911 + (((tickAnim - 185) / 34) * (-3.62911-(-3.62911)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -5.90285 + (((tickAnim - 219) / 18) * (23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3-(-5.90285)));
            yy = -7.571 + (((tickAnim - 219) / 18) * (0-(-7.571)));
            zz = -3.62911 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3-(-3.62911)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3 + (((tickAnim - 237) / 83) * (23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3-(23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 331) {
            xx = 23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3 + (((tickAnim - 320) / 11) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3-(23.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3)));
            yy = 0 + (((tickAnim - 320) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3 + (((tickAnim - 320) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3)));
        }
        else if (tickAnim >= 331 && tickAnim < 350) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3 + (((tickAnim - 331) / 19) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*3)));
            yy = 0 + (((tickAnim - 331) / 19) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3 + (((tickAnim - 331) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 443) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1 + (((tickAnim - 350) / 93) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1)));
            yy = 0 + (((tickAnim - 350) / 93) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1 + (((tickAnim - 350) / 93) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1)));
        }
        else if (tickAnim >= 443 && tickAnim < 455) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1 + (((tickAnim - 443) / 12) * (-8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1)));
            yy = 0 + (((tickAnim - 443) / 12) * (-0.43745-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1 + (((tickAnim - 443) / 12) * (-0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1)));
        }
        else if (tickAnim >= 455 && tickAnim < 463) {
            xx = -8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1 + (((tickAnim - 455) / 8) * (-8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1-(-8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1)));
            yy = -0.43745 + (((tickAnim - 455) / 8) * (-0.43745-(-0.43745)));
            zz = -0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1 + (((tickAnim - 455) / 8) * (-0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1-(-0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1 + (((tickAnim - 463) / 37) * (0-(-8.2465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*0.1)));
            yy = -0.43745 + (((tickAnim - 463) / 37) * (0-(-0.43745)));
            zz = -0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1 + (((tickAnim - 463) / 37) * (0-(-0.8992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80 + (((tickAnim - 42) / 17) * (4.25-(79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 4.25 + (((tickAnim - 59) / 66) * (0-(4.25)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 125) / 42) * (79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80-(0)));
            yy = 0 + (((tickAnim - 125) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 42) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 185) {
            xx = 79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80 + (((tickAnim - 167) / 18) * (4.25-(79.795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*80)));
            yy = 0 + (((tickAnim - 167) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 18) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 4.25 + (((tickAnim - 185) / 34) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 4.25 + (((tickAnim - 219) / 9) * (29.22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(4.25)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 29.22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3-(29.22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 331) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3 + (((tickAnim - 320) / 11) * (-10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3)));
            yy = 0 + (((tickAnim - 320) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3 + (((tickAnim - 320) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3)));
        }
        else if (tickAnim >= 331 && tickAnim < 350) {
            xx = -10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3 + (((tickAnim - 331) / 19) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1-(-10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*3)));
            yy = 0 + (((tickAnim - 331) / 19) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3 + (((tickAnim - 331) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 443) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1 + (((tickAnim - 350) / 93) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1)));
            yy = 0 + (((tickAnim - 350) / 93) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1 + (((tickAnim - 350) / 93) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1)));
        }
        else if (tickAnim >= 443 && tickAnim < 455) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1 + (((tickAnim - 443) / 12) * (4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1)));
            yy = 0 + (((tickAnim - 443) / 12) * (0.20275-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1 + (((tickAnim - 443) / 12) * (-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1)));
        }
        else if (tickAnim >= 455 && tickAnim < 463) {
            xx = 4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1 + (((tickAnim - 455) / 8) * (4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1-(4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1)));
            yy = 0.20275 + (((tickAnim - 455) / 8) * (0.20275-(0.20275)));
            zz = -0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1 + (((tickAnim - 455) / 8) * (-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1-(-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1 + (((tickAnim - 463) / 37) * (0-(4.637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-350))*0.1)));
            yy = 0.20275 + (((tickAnim - 463) / 37) * (0-(0.20275)));
            zz = -0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1 + (((tickAnim - 463) / 37) * (0-(-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-350))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.19389-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0.23137-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 38) / 21) * (-22.48539-(-36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 0.19389 + (((tickAnim - 38) / 21) * (0.37936-(0.19389)));
            zz = 0.23137 + (((tickAnim - 38) / 21) * (0.45269-(0.23137)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = -22.48539 + (((tickAnim - 59) / 66) * (0-(-22.48539)));
            yy = 0.37936 + (((tickAnim - 59) / 66) * (0-(0.37936)));
            zz = 0.45269 + (((tickAnim - 59) / 66) * (0-(0.45269)));
        }
        else if (tickAnim >= 125 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 125) / 38) * (-36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(0)));
            yy = 0 + (((tickAnim - 125) / 38) * (0.19389-(0)));
            zz = 0 + (((tickAnim - 125) / 38) * (0.23137-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 185) {
            xx = -36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 163) / 22) * (-22.48539-(-36.1925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 0.19389 + (((tickAnim - 163) / 22) * (0.37936-(0.19389)));
            zz = 0.23137 + (((tickAnim - 163) / 22) * (0.45269-(0.23137)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -22.48539 + (((tickAnim - 185) / 34) * (-22.48539-(-22.48539)));
            yy = 0.37936 + (((tickAnim - 185) / 34) * (0.37936-(0.37936)));
            zz = 0.45269 + (((tickAnim - 185) / 34) * (0.45269-(0.45269)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -22.48539 + (((tickAnim - 219) / 9) * (-28.6011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-22.48539)));
            yy = 0.37936 + (((tickAnim - 219) / 9) * (10.54949-(0.37936)));
            zz = 0.45269 + (((tickAnim - 219) / 9) * (1.87959-(0.45269)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -28.6011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 228) / 9) * (-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3-(-28.6011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 10.54949 + (((tickAnim - 228) / 9) * (0-(10.54949)));
            zz = 1.87959 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3-(1.87959)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = -15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3 + (((tickAnim - 237) / 83) * (-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3-(-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 331) {
            xx = -15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3 + (((tickAnim - 320) / 11) * (-27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3-(-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3)));
            yy = 0 + (((tickAnim - 320) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3 + (((tickAnim - 320) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3)));
        }
        else if (tickAnim >= 331 && tickAnim < 350) {
            xx = -27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3 + (((tickAnim - 331) / 19) * (-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1-(-27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*3)));
            yy = 0 + (((tickAnim - 331) / 19) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3 + (((tickAnim - 331) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 443) {
            xx = -11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1 + (((tickAnim - 350) / 93) * (-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1-(-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1)));
            yy = 0 + (((tickAnim - 350) / 93) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1 + (((tickAnim - 350) / 93) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1)));
        }
        else if (tickAnim >= 443 && tickAnim < 455) {
            xx = -11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1 + (((tickAnim - 443) / 12) * (-10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1-(-11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1)));
            yy = 0 + (((tickAnim - 443) / 12) * (0.14927-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1 + (((tickAnim - 443) / 12) * (-0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1)));
        }
        else if (tickAnim >= 455 && tickAnim < 463) {
            xx = -10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1 + (((tickAnim - 455) / 8) * (-10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1-(-10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1)));
            yy = 0.14927 + (((tickAnim - 455) / 8) * (0.14927-(0.14927)));
            zz = -0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1 + (((tickAnim - 455) / 8) * (-0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1-(-0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1 + (((tickAnim - 463) / 37) * (0-(-10.5006+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*0.1)));
            yy = 0.14927 + (((tickAnim - 463) / 37) * (0-(0.14927)));
            zz = -0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1 + (((tickAnim - 463) / 37) * (0-(-0.4772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-400))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 59) / 66) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 125) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 331) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 185) / 146) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 185) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 146) * (0-(0)));
        }
        else if (tickAnim >= 331 && tickAnim < 341) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 331) / 10) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 331) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 331) / 10) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 350) {
            xx = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.7 + (((tickAnim - 341) / 9) * (0-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.7)));
            yy = 0 + (((tickAnim - 341) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 34.25 + (((tickAnim - 42) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 38) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 163) / 11) * (34.25-(0)));
            yy = 0 + (((tickAnim - 163) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 11) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 193) {
            xx = 34.25 + (((tickAnim - 174) / 19) * (0-(34.25)));
            yy = 0 + (((tickAnim - 174) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 19) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 307) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(xx), headFeathers.rotateAngleY + (float) Math.toRadians(yy), headFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (48.5-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 48.5 + (((tickAnim - 42) / 17) * (0-(48.5)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 59) / 104) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 104) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 163) / 11) * (48.5-(0)));
            yy = 0 + (((tickAnim - 163) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 11) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 193) {
            xx = 48.5 + (((tickAnim - 174) / 19) * (0-(48.5)));
            yy = 0 + (((tickAnim - 174) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 19) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 307) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (30.75-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 30.75 + (((tickAnim - 42) / 17) * (0-(30.75)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 38) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 163) / 11) * (30.75-(0)));
            yy = 0 + (((tickAnim - 163) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 11) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 193) {
            xx = 30.75 + (((tickAnim - 174) / 19) * (0-(30.75)));
            yy = 0 + (((tickAnim - 174) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 19) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 307) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (45.5-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 45.5 + (((tickAnim - 42) / 17) * (0-(45.5)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 38) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 163) / 11) * (45.5-(0)));
            yy = 0 + (((tickAnim - 163) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 11) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 193) {
            xx = 45.5 + (((tickAnim - 174) / 19) * (0-(45.5)));
            yy = 0 + (((tickAnim - 174) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 19) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 307) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 307) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 94) {
            xx = -11.5 + (((tickAnim - 59) / 35) * (-8.75-(-11.5)));
            yy = 0 + (((tickAnim - 59) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 35) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = -8.75 + (((tickAnim - 94) / 31) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 140) / 45) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 140) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 45) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -11.5 + (((tickAnim - 185) / 34) * (-8.75-(-11.5)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -8.75 + (((tickAnim - 219) / 18) * (-54.50356-(-8.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (-6.80361-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = -54.50356 + (((tickAnim - 237) / 83) * (-54.50356-(-54.50356)));
            yy = -6.80361 + (((tickAnim - 237) / 83) * (-6.80361-(-6.80361)));
            zz = 74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5 + (((tickAnim - 237) / 83) * (74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5-(74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -54.50356 + (((tickAnim - 320) / 20) * (13.5-(-54.50356)));
            yy = -6.80361 + (((tickAnim - 320) / 20) * (0-(-6.80361)));
            zz = 74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5 + (((tickAnim - 320) / 20) * (0-(74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 13.5 + (((tickAnim - 340) / 10) * (-54.48016-(13.5)));
            yy = 0 + (((tickAnim - 340) / 10) * (31.72842-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (78.2966-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = -54.48016 + (((tickAnim - 350) / 113) * (-54.48016-(-54.48016)));
            yy = 31.72842 + (((tickAnim - 350) / 113) * (31.72842-(31.72842)));
            zz = 78.2966 + (((tickAnim - 350) / 113) * (78.2966-(78.2966)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -54.48016 + (((tickAnim - 463) / 37) * (0-(-54.48016)));
            yy = 31.72842 + (((tickAnim - 463) / 37) * (0-(31.72842)));
            zz = 78.2966 + (((tickAnim - 463) / 37) * (0-(78.2966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (42.25-(0)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 94) {
            xx = 42.25 + (((tickAnim - 59) / 35) * (31-(42.25)));
            yy = 0 + (((tickAnim - 59) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 35) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 31 + (((tickAnim - 94) / 31) * (0-(31)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 140) / 45) * (42.25-(0)));
            yy = 0 + (((tickAnim - 140) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 45) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 42.25 + (((tickAnim - 185) / 34) * (31-(42.25)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 31 + (((tickAnim - 219) / 18) * (31-(31)));
            yy = 0 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 31 + (((tickAnim - 237) / 83) * (31-(31)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 331) {
            xx = 31 + (((tickAnim - 320) / 11) * (31-(31)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5 + (((tickAnim - 320) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5)));
            zz = 0 + (((tickAnim - 320) / 11) * (0-(0)));
        }
        else if (tickAnim >= 331 && tickAnim < 340) {
            xx = 31 + (((tickAnim - 331) / 9) * (20.5-(31)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5 + (((tickAnim - 331) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*5)));
            zz = 0 + (((tickAnim - 331) / 9) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 20.5 + (((tickAnim - 340) / 10) * (75-(20.5)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 75 + (((tickAnim - 350) / 113) * (75-(75)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 75 + (((tickAnim - 463) / 37) * (0-(75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 94) {
            xx = -11.5 + (((tickAnim - 59) / 35) * (-8.75-(-11.5)));
            yy = 0 + (((tickAnim - 59) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 35) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = -8.75 + (((tickAnim - 94) / 31) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 140) / 45) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 140) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 45) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -11.5 + (((tickAnim - 185) / 34) * (-8.75-(-11.5)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -8.75 + (((tickAnim - 219) / 18) * (-54.50356-(-8.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (6.80361-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (-74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = -54.50356 + (((tickAnim - 237) / 83) * (-54.50356-(-54.50356)));
            yy = 6.80361 + (((tickAnim - 237) / 83) * (6.80361-(6.80361)));
            zz = -74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5 + (((tickAnim - 237) / 83) * (-74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5-(-74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -54.50356 + (((tickAnim - 320) / 20) * (13.5-(-54.50356)));
            yy = 6.80361 + (((tickAnim - 320) / 20) * (0-(6.80361)));
            zz = -74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5 + (((tickAnim - 320) / 20) * (0-(-74.1122752671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 13.5 + (((tickAnim - 340) / 10) * (-54.48016-(13.5)));
            yy = 0 + (((tickAnim - 340) / 10) * (-31.72842-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (-78.2966-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = -54.48016 + (((tickAnim - 350) / 113) * (-54.48016-(-54.48016)));
            yy = -31.72842 + (((tickAnim - 350) / 113) * (-31.72842-(-31.72842)));
            zz = -78.2966 + (((tickAnim - 350) / 113) * (-78.2966-(-78.2966)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -54.48016 + (((tickAnim - 463) / 37) * (0-(-54.48016)));
            yy = -31.72842 + (((tickAnim - 463) / 37) * (0-(-31.72842)));
            zz = -78.2966 + (((tickAnim - 463) / 37) * (0-(-78.2966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (42.25-(0)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 94) {
            xx = 42.25 + (((tickAnim - 59) / 35) * (31-(42.25)));
            yy = 0 + (((tickAnim - 59) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 35) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 31 + (((tickAnim - 94) / 31) * (0-(31)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 140) / 45) * (42.25-(0)));
            yy = 0 + (((tickAnim - 140) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 45) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 42.25 + (((tickAnim - 185) / 34) * (31-(42.25)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 31 + (((tickAnim - 219) / 18) * (31-(31)));
            yy = 0 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 31 + (((tickAnim - 237) / 83) * (31-(31)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 31 + (((tickAnim - 320) / 20) * (20.5-(31)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5 + (((tickAnim - 320) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*-5)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 20.5 + (((tickAnim - 340) / 10) * (75-(20.5)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 75 + (((tickAnim - 350) / 113) * (75-(75)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 75 + (((tickAnim - 463) / 37) * (0-(75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*6 + (((tickAnim - 0) / 38) * (7.75-(5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*6)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 94) {
            xx = 7.75 + (((tickAnim - 38) / 56) * (10.75-(7.75)));
            yy = 0 + (((tickAnim - 38) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 56) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 10.75 + (((tickAnim - 94) / 31) * (5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*6-(10.75)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 219) {
            xx = 5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*6 + (((tickAnim - 125) / 94) * (10.75-(5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*6)));
            yy = 0 + (((tickAnim - 125) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 94) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 10.75 + (((tickAnim - 219) / 18) * (18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))-(10.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6)) + (((tickAnim - 237) / 83) * (18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))-(18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6)))));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 358) {
            xx = 18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6)) + (((tickAnim - 320) / 38) * (6-(18.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6)))));
            yy = 0 + (((tickAnim - 320) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 38) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 438) {
            xx = 6 + (((tickAnim - 358) / 80) * (6.75-(6)));
            yy = 0 + (((tickAnim - 358) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 80) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = 6.75 + (((tickAnim - 438) / 25) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 6.75 + (((tickAnim - 463) / 37) * (0-(6.75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 101) {
            xx = 5.5 + (((tickAnim - 38) / 63) * (2.21-(5.5)));
            yy = 0 + (((tickAnim - 38) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 63) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 219) {
            xx = 2.21 + (((tickAnim - 101) / 118) * (11-(2.21)));
            yy = 0 + (((tickAnim - 101) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 118) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 11 + (((tickAnim - 219) / 18) * (16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2-(11)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2 + (((tickAnim - 237) / 83) * (16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2-(16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2 + (((tickAnim - 320) / 30) * (6.5-(16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-100))*2)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 438) {
            xx = 6.5 + (((tickAnim - 350) / 88) * (7-(6.5)));
            yy = 0 + (((tickAnim - 350) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 88) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = 7 + (((tickAnim - 438) / 25) * (7-(7)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 7 + (((tickAnim - 463) / 37) * (0-(7)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 101) {
            xx = 15.5 + (((tickAnim - 38) / 63) * (-3.84-(15.5)));
            yy = 0 + (((tickAnim - 38) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 63) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 219) {
            xx = -3.84 + (((tickAnim - 101) / 118) * (1-(-3.84)));
            yy = 0 + (((tickAnim - 101) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 118) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 1 + (((tickAnim - 219) / 18) * (21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4-(1)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4 + (((tickAnim - 237) / 83) * (21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4-(21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4 + (((tickAnim - 320) / 30) * (27.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*-4-(21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-250))*4)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 358) {
            xx = 27.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*-4 + (((tickAnim - 350) / 8) * (22.25-(27.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*-4)));
            yy = 0 + (((tickAnim - 350) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 8) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 438) {
            xx = 22.25 + (((tickAnim - 358) / 80) * (20.75-(22.25)));
            yy = 0 + (((tickAnim - 358) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 80) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = 20.75 + (((tickAnim - 438) / 25) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 20.75 + (((tickAnim - 463) / 37) * (0-(20.75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 101) {
            xx = -9.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 38) / 63) * (6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-9.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 38) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 63) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 163) {
            xx = 6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 101) / 62) * (11.25-(6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 101) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 62) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 219) {
            xx = 11.25 + (((tickAnim - 163) / 56) * (0-(11.25)));
            yy = 0 + (((tickAnim - 163) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 56) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8 + (((tickAnim - 320) / 30) * (-21.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-360))*55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-360))*8)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 358) {
            xx = -21.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-360))*55 + (((tickAnim - 350) / 8) * (0-(-21.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-360))*55)));
            yy = 0 + (((tickAnim - 350) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 8) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 358) / 80) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 358) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 80) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -0.25 + (((tickAnim - 438) / 25) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -0.25 + (((tickAnim - 463) / 37) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 38.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 0) / 59) * (24.5-(38.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 24.5 + (((tickAnim - 59) / 66) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(24.5)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 184) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 125) / 59) * (24.5-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 125) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 59) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 219) {
            xx = 24.5 + (((tickAnim - 184) / 35) * (0-(24.5)));
            yy = 0 + (((tickAnim - 184) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 35) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 358) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8 + (((tickAnim - 320) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8)));
            yy = 0 + (((tickAnim - 320) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 38) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 358) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 105) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(xx), rightTailFan4.rotateAngleY + (float) Math.toRadians(yy), rightTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 38.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 0) / 59) * (24.5-(38.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 24.5 + (((tickAnim - 59) / 66) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(24.5)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 184) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 125) / 59) * (24.5-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 125) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 59) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 219) {
            xx = 24.5 + (((tickAnim - 184) / 35) * (0-(24.5)));
            yy = 0 + (((tickAnim - 184) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 35) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 358) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8 + (((tickAnim - 320) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-400))*8)));
            yy = 0 + (((tickAnim - 320) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 38) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 358) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 105) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(xx), leftTailFan4.rotateAngleY + (float) Math.toRadians(yy), leftTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-6 + (((tickAnim - 0) / 59) * (19.575-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-6)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 61) {
            xx = 19.575 + (((tickAnim - 59) / 2) * (22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(19.575)));
            yy = 0 + (((tickAnim - 59) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 2) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 94) {
            xx = 22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 61) / 33) * (18.75-(22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 61) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 33) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 18.75 + (((tickAnim - 94) / 31) * (7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+60))*9-(18.75)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+60))*9 + (((tickAnim - 125) / 60) * (16.825-(7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+60))*9)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 186) {
            xx = 16.825 + (((tickAnim - 185) / 1) * (21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(16.825)));
            yy = 0 + (((tickAnim - 185) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 1) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 219) {
            xx = 21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 186) / 33) * (18.75-(21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 186) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 33) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 18.75 + (((tickAnim - 219) / 4) * (-17.15148-(18.75)));
            yy = 0 + (((tickAnim - 219) / 4) * (-4.78963-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (2.62487-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = -17.15148 + (((tickAnim - 223) / 5) * (-16.78295-(-17.15148)));
            yy = -4.78963 + (((tickAnim - 223) / 5) * (-10.53709-(-4.78963)));
            zz = 2.62487 + (((tickAnim - 223) / 5) * (5.77467-(2.62487)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -16.78295 + (((tickAnim - 228) / 9) * (-23.5-(-16.78295)));
            yy = -10.53709 + (((tickAnim - 228) / 9) * (0-(-10.53709)));
            zz = 5.77467 + (((tickAnim - 228) / 9) * (0-(5.77467)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = -23.5 + (((tickAnim - 237) / 7) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 237) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 7) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 252) {
            xx = -38.25 + (((tickAnim - 244) / 8) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 244) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 8) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = -23.5 + (((tickAnim - 252) / 16) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 276) {
            xx = -23.5 + (((tickAnim - 268) / 8) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 268) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 8) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 283) {
            xx = -38.25 + (((tickAnim - 276) / 7) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 276) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 7) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = -23.5 + (((tickAnim - 283) / 17) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 308) {
            xx = -23.5 + (((tickAnim - 300) / 8) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 300) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 8) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 315) {
            xx = -38.25 + (((tickAnim - 308) / 7) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 308) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 7) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = -23.5 + (((tickAnim - 315) / 5) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = -23.5 + (((tickAnim - 320) / 8) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 328) {
            xx = -23.5 + (((tickAnim - 328) / 0) * (26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-23.5)));
            yy = 0 + (((tickAnim - 328) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 0) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 328) / 22) * (21-(26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 462) {
            xx = 21 + (((tickAnim - 350) / 112) * (21-(21)));
            yy = 0 + (((tickAnim - 350) / 112) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 112) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = 21 + (((tickAnim - 462) / 1) * (-24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50-(21)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 1) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50 + (((tickAnim - 463) / 37) * (0-(-24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = -10.5 + (((tickAnim - 59) / 66) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -10.5 + (((tickAnim - 185) / 34) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = -10.5 + (((tickAnim - 219) / 4) * (22.5-(-10.5)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 22.5 + (((tickAnim - 223) / 5) * (5.25-(22.5)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 5.25 + (((tickAnim - 228) / 9) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = 5.25 + (((tickAnim - 237) / 7) * (36-(5.25)));
            yy = 0 + (((tickAnim - 237) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 7) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 252) {
            xx = 36 + (((tickAnim - 244) / 8) * (5.25-(36)));
            yy = 0 + (((tickAnim - 244) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 8) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = 5.25 + (((tickAnim - 252) / 16) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 276) {
            xx = 5.25 + (((tickAnim - 268) / 8) * (36-(5.25)));
            yy = 0 + (((tickAnim - 268) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 8) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 283) {
            xx = 36 + (((tickAnim - 276) / 7) * (5.25-(36)));
            yy = 0 + (((tickAnim - 276) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 7) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = 5.25 + (((tickAnim - 283) / 17) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 308) {
            xx = 5.25 + (((tickAnim - 300) / 8) * (36-(5.25)));
            yy = 0 + (((tickAnim - 300) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 8) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 315) {
            xx = 36 + (((tickAnim - 308) / 7) * (5.25-(36)));
            yy = 0 + (((tickAnim - 308) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 7) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 5.25 + (((tickAnim - 315) / 5) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 5.25 + (((tickAnim - 320) / 8) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 5.25 + (((tickAnim - 328) / 22) * (7.25-(5.25)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 7.25 + (((tickAnim - 350) / 113) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 7.25 + (((tickAnim - 463) / 37) * (0-(7.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 0) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 223) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 223) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 223) / 277) * (0-(0)));
            yy = -0.55 + (((tickAnim - 223) / 277) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 223) / 277) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 18 + (((tickAnim - 59) / 66) * (0-(18)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (18-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 18 + (((tickAnim - 185) / 34) * (18-(18)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 18 + (((tickAnim - 219) / 4) * (-33.52-(18)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = -33.52 + (((tickAnim - 223) / 5) * (21.25-(-33.52)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 21.25 + (((tickAnim - 228) / 9) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = 21.25 + (((tickAnim - 237) / 7) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 237) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 7) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 252) {
            xx = -26.25 + (((tickAnim - 244) / 8) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 244) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 8) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = 21.25 + (((tickAnim - 252) / 16) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 276) {
            xx = 21.25 + (((tickAnim - 268) / 8) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 268) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 8) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 283) {
            xx = -26.25 + (((tickAnim - 276) / 7) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 276) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 7) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = 21.25 + (((tickAnim - 283) / 17) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 308) {
            xx = 21.25 + (((tickAnim - 300) / 8) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 300) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 8) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 315) {
            xx = -26.25 + (((tickAnim - 308) / 7) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 308) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 7) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 21.25 + (((tickAnim - 315) / 5) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 21.25 + (((tickAnim - 320) / 8) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 21.25 + (((tickAnim - 328) / 22) * (9-(21.25)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 9 + (((tickAnim - 350) / 113) * (9-(9)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 9 + (((tickAnim - 463) / 37) * (0-(9)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (1.025-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            yy = -0.325 + (((tickAnim - 59) / 66) * (0-(-0.325)));
            zz = 1.025 + (((tickAnim - 59) / 66) * (0-(1.025)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (1.025-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            yy = -0.325 + (((tickAnim - 185) / 34) * (-0.325-(-0.325)));
            zz = 1.025 + (((tickAnim - 185) / 34) * (1.025-(1.025)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 219) / 4) * (-0.795-(-0.325)));
            zz = 1.025 + (((tickAnim - 219) / 4) * (1.02-(1.025)));
        }
        else if (tickAnim >= 223 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 223) / 240) * (0-(0)));
            yy = -0.795 + (((tickAnim - 223) / 240) * (-0.795-(-0.795)));
            zz = 1.02 + (((tickAnim - 223) / 240) * (1.02-(1.02)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = -0.795 + (((tickAnim - 463) / 37) * (0-(-0.795)));
            zz = 1.02 + (((tickAnim - 463) / 37) * (0-(1.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 125) {
            xx = -3.75 + (((tickAnim - 59) / 66) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 59) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 66) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -3.75 + (((tickAnim - 185) / 34) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = -3.75 + (((tickAnim - 219) / 4) * (72.14062-(-3.75)));
            yy = 0 + (((tickAnim - 219) / 4) * (-2.06706-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0.28465-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 72.14062 + (((tickAnim - 223) / 5) * (0-(72.14062)));
            yy = -2.06706 + (((tickAnim - 223) / 5) * (0-(-2.06706)));
            zz = 0.28465 + (((tickAnim - 223) / 5) * (0-(0.28465)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 228) / 9) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = -3.5 + (((tickAnim - 237) / 7) * (61-(-3.5)));
            yy = 0 + (((tickAnim - 237) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 7) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 252) {
            xx = 61 + (((tickAnim - 244) / 8) * (-3.5-(61)));
            yy = 0 + (((tickAnim - 244) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 8) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = -3.5 + (((tickAnim - 252) / 16) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 276) {
            xx = -3.5 + (((tickAnim - 268) / 8) * (61-(-3.5)));
            yy = 0 + (((tickAnim - 268) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 8) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 283) {
            xx = 61 + (((tickAnim - 276) / 7) * (-3.5-(61)));
            yy = 0 + (((tickAnim - 276) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 7) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = -3.5 + (((tickAnim - 283) / 17) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 308) {
            xx = -3.5 + (((tickAnim - 300) / 8) * (61-(-3.5)));
            yy = 0 + (((tickAnim - 300) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 8) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 315) {
            xx = 61 + (((tickAnim - 308) / 7) * (-3.5-(61)));
            yy = 0 + (((tickAnim - 308) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 7) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = -3.5 + (((tickAnim - 315) / 5) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = -3.5 + (((tickAnim - 320) / 8) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = -3.5 + (((tickAnim - 328) / 22) * (1-(-3.5)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 1 + (((tickAnim - 350) / 113) * (1-(1)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 463) / 37) * (0-(1)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 219) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 219) / 4) * (1.525-(0.5)));
            zz = 0 + (((tickAnim - 219) / 4) * (-0.35-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 223) / 5) * (0.65-(1.525)));
            zz = -0.35 + (((tickAnim - 223) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            yy = 0.65 + (((tickAnim - 228) / 9) * (1-(0.65)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 237) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            yy = 1 + (((tickAnim - 252) / 16) * (1-(1)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 268) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            yy = 1 + (((tickAnim - 283) / 17) * (1-(1)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 300) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 315) / 5) * (0.725-(1)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 320) / 8) * (1-(0.725)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            yy = 1 + (((tickAnim - 328) / 22) * (0.45-(1)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            yy = 0.45 + (((tickAnim - 350) / 113) * (-0.025-(0.45)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = -0.025 + (((tickAnim - 463) / 37) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-6 + (((tickAnim - 0) / 59) * (19.575-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-6)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 61) {
            xx = 19.575 + (((tickAnim - 59) / 2) * (22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(19.575)));
            yy = 0 + (((tickAnim - 59) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 2) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 94) {
            xx = 22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 61) / 33) * (18.75-(22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 61) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 33) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 18.75 + (((tickAnim - 94) / 31) * (7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*9-(18.75)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*9 + (((tickAnim - 125) / 60) * (16.825-(7.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*9)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 186) {
            xx = 16.825 + (((tickAnim - 185) / 1) * (21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(16.825)));
            yy = 0 + (((tickAnim - 185) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 1) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 219) {
            xx = 21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 186) / 33) * (18.75-(21.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 186) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 33) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 18.75 + (((tickAnim - 219) / 9) * (3.71828-(18.75)));
            yy = 0 + (((tickAnim - 219) / 9) * (6.86713-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (11.31983-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 3.71828 + (((tickAnim - 228) / 5) * (-17.15148-(3.71828)));
            yy = 6.86713 + (((tickAnim - 228) / 5) * (4.78963-(6.86713)));
            zz = 11.31983 + (((tickAnim - 228) / 5) * (-2.62487-(11.31983)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = -17.15148 + (((tickAnim - 233) / 4) * (-23.5-(-17.15148)));
            yy = 4.78963 + (((tickAnim - 233) / 4) * (0-(4.78963)));
            zz = -2.62487 + (((tickAnim - 233) / 4) * (0-(-2.62487)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = -23.5 + (((tickAnim - 237) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 260) {
            xx = -23.5 + (((tickAnim - 252) / 8) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 252) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 8) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = -38.25 + (((tickAnim - 260) / 8) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = -23.5 + (((tickAnim - 268) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 292) {
            xx = -23.5 + (((tickAnim - 283) / 9) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 283) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 9) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 300) {
            xx = -38.25 + (((tickAnim - 292) / 8) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 292) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 8) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = -23.5 + (((tickAnim - 300) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 322) {
            xx = -23.5 + (((tickAnim - 315) / 7) * (-38.25-(-23.5)));
            yy = 0 + (((tickAnim - 315) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 7) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 328) {
            xx = -38.25 + (((tickAnim - 322) / 6) * (-23.5-(-38.25)));
            yy = 0 + (((tickAnim - 322) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 6) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 328) {
            xx = -23.5 + (((tickAnim - 328) / 0) * (26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-23.5)));
            yy = 0 + (((tickAnim - 328) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 0) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 328) / 22) * (21-(26.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 462) {
            xx = 21 + (((tickAnim - 350) / 112) * (21-(21)));
            yy = 0 + (((tickAnim - 350) / 112) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 112) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 463) {
            xx = 21 + (((tickAnim - 462) / 1) * (-24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50-(21)));
            yy = 0 + (((tickAnim - 462) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 1) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50 + (((tickAnim - 463) / 37) * (0-(-24.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-50)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -10.5 + (((tickAnim - 60) / 65) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -10.5 + (((tickAnim - 185) / 34) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -10.5 + (((tickAnim - 219) / 9) * (1.75-(-10.5)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 1.75 + (((tickAnim - 228) / 5) * (22.5-(1.75)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 22.5 + (((tickAnim - 233) / 4) * (5.25-(22.5)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = 5.25 + (((tickAnim - 237) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 260) {
            xx = 5.25 + (((tickAnim - 252) / 8) * (32.75-(5.25)));
            yy = 0 + (((tickAnim - 252) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 8) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 32.75 + (((tickAnim - 260) / 8) * (5.25-(32.75)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 5.25 + (((tickAnim - 268) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 292) {
            xx = 5.25 + (((tickAnim - 283) / 9) * (32.75-(5.25)));
            yy = 0 + (((tickAnim - 283) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 9) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 300) {
            xx = 32.75 + (((tickAnim - 292) / 8) * (5.25-(32.75)));
            yy = 0 + (((tickAnim - 292) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 8) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 5.25 + (((tickAnim - 300) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 322) {
            xx = 5.25 + (((tickAnim - 315) / 7) * (32.75-(5.25)));
            yy = 0 + (((tickAnim - 315) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 7) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 328) {
            xx = 32.75 + (((tickAnim - 322) / 6) * (5.25-(32.75)));
            yy = 0 + (((tickAnim - 322) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 6) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 5.25 + (((tickAnim - 328) / 22) * (7.25-(5.25)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 7.25 + (((tickAnim - 350) / 113) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 7.25 + (((tickAnim - 463) / 37) * (0-(7.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 0) / 233) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 233) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 233) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 233) / 4) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 237) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 237) / 2) * (-0.25-(-0.55)));
            zz = 0 + (((tickAnim - 237) / 2) * (0.025-(0)));
        }
        else if (tickAnim >= 239 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 239) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 239) / 4) * (-0.245-(-0.25)));
            zz = 0.025 + (((tickAnim - 239) / 4) * (0.02-(0.025)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 243) / 5) * (0-(0)));
            yy = -0.245 + (((tickAnim - 243) / 5) * (-0.52-(-0.245)));
            zz = 0.02 + (((tickAnim - 243) / 5) * (0.01-(0.02)));
        }
        else if (tickAnim >= 248 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 248) / 4) * (0-(0)));
            yy = -0.52 + (((tickAnim - 248) / 4) * (-0.55-(-0.52)));
            zz = 0.01 + (((tickAnim - 248) / 4) * (0-(0.01)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            yy = -0.55 + (((tickAnim - 252) / 16) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 252) / 16) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            yy = -0.55 + (((tickAnim - 268) / 15) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            yy = -0.55 + (((tickAnim - 283) / 17) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 283) / 17) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            yy = -0.55 + (((tickAnim - 300) / 15) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 315) / 13) * (0-(0)));
            yy = -0.55 + (((tickAnim - 315) / 13) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 315) / 13) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 328) / 135) * (0-(0)));
            yy = -0.55 + (((tickAnim - 328) / 135) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 328) / 135) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = -0.55 + (((tickAnim - 463) / 37) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = 18 + (((tickAnim - 60) / 65) * (0-(18)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (18-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 18 + (((tickAnim - 185) / 34) * (18-(18)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 18 + (((tickAnim - 219) / 9) * (-10.75-(18)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = -10.75 + (((tickAnim - 228) / 5) * (-42.52-(-10.75)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = -42.52 + (((tickAnim - 233) / 4) * (21.25-(-42.52)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = 21.25 + (((tickAnim - 237) / 15) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 260) {
            xx = 21.25 + (((tickAnim - 252) / 8) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 252) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 8) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = -26.25 + (((tickAnim - 260) / 8) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 21.25 + (((tickAnim - 268) / 15) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 292) {
            xx = 21.25 + (((tickAnim - 283) / 9) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 283) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 9) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 300) {
            xx = -26.25 + (((tickAnim - 292) / 8) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 292) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 8) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 21.25 + (((tickAnim - 300) / 15) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 322) {
            xx = 21.25 + (((tickAnim - 315) / 7) * (-26.25-(21.25)));
            yy = 0 + (((tickAnim - 315) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 7) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 328) {
            xx = -26.25 + (((tickAnim - 322) / 6) * (21.25-(-26.25)));
            yy = 0 + (((tickAnim - 322) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 6) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 21.25 + (((tickAnim - 328) / 22) * (9-(21.25)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 9 + (((tickAnim - 350) / 113) * (9-(9)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 9 + (((tickAnim - 463) / 37) * (0-(9)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.025-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            yy = -0.325 + (((tickAnim - 60) / 65) * (0-(-0.325)));
            zz = 1.025 + (((tickAnim - 60) / 65) * (0-(1.025)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (1.025-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            yy = -0.325 + (((tickAnim - 185) / 34) * (-0.325-(-0.325)));
            zz = 1.025 + (((tickAnim - 185) / 34) * (1.025-(1.025)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = -0.325 + (((tickAnim - 219) / 9) * (-0.695-(-0.325)));
            zz = 1.025 + (((tickAnim - 219) / 9) * (1.02-(1.025)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            yy = -0.695 + (((tickAnim - 228) / 5) * (-1.045-(-0.695)));
            zz = 1.02 + (((tickAnim - 228) / 5) * (1.02-(1.02)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            yy = -1.045 + (((tickAnim - 233) / 4) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 233) / 4) * (1.02-(1.02)));
        }
        else if (tickAnim >= 237 && tickAnim < 239) {
            xx = 0 + (((tickAnim - 237) / 2) * (0-(0)));
            yy = -1.045 + (((tickAnim - 237) / 2) * (-0.89-(-1.045)));
            zz = 1.02 + (((tickAnim - 237) / 2) * (1.02-(1.02)));
        }
        else if (tickAnim >= 239 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 239) / 4) * (0-(0)));
            yy = -0.89 + (((tickAnim - 239) / 4) * (-0.895-(-0.89)));
            zz = 1.02 + (((tickAnim - 239) / 4) * (1.02-(1.02)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 243) / 5) * (0-(0)));
            yy = -0.895 + (((tickAnim - 243) / 5) * (-1.075-(-0.895)));
            zz = 1.02 + (((tickAnim - 243) / 5) * (1.02-(1.02)));
        }
        else if (tickAnim >= 248 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 248) / 4) * (0-(0)));
            yy = -1.075 + (((tickAnim - 248) / 4) * (-1.045-(-1.075)));
            zz = 1.02 + (((tickAnim - 248) / 4) * (1.02-(1.02)));
        }
        else if (tickAnim >= 252 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 252) / 16) * (0-(0)));
            yy = -1.045 + (((tickAnim - 252) / 16) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 252) / 16) * (1.02-(1.02)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            yy = -1.045 + (((tickAnim - 268) / 15) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 268) / 15) * (1.02-(1.02)));
        }
        else if (tickAnim >= 283 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 283) / 17) * (0-(0)));
            yy = -1.045 + (((tickAnim - 283) / 17) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 283) / 17) * (1.02-(1.02)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            yy = -1.045 + (((tickAnim - 300) / 15) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 300) / 15) * (1.02-(1.02)));
        }
        else if (tickAnim >= 315 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 315) / 13) * (0-(0)));
            yy = -1.045 + (((tickAnim - 315) / 13) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 315) / 13) * (1.02-(1.02)));
        }
        else if (tickAnim >= 328 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 328) / 135) * (0-(0)));
            yy = -1.045 + (((tickAnim - 328) / 135) * (-1.045-(-1.045)));
            zz = 1.02 + (((tickAnim - 328) / 135) * (1.02-(1.02)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = -1.045 + (((tickAnim - 463) / 37) * (0-(-1.045)));
            zz = 1.02 + (((tickAnim - 463) / 37) * (0-(1.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 125) {
            xx = -3.75 + (((tickAnim - 60) / 65) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 60) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 65) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 125) / 60) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 125) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 60) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = -3.75 + (((tickAnim - 185) / 34) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -3.75 + (((tickAnim - 219) / 9) * (14.75-(-3.75)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 14.75 + (((tickAnim - 228) / 5) * (63.64062-(14.75)));
            yy = 0 + (((tickAnim - 228) / 5) * (-2.06706-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0.28465-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 63.64062 + (((tickAnim - 233) / 4) * (-3.5-(63.64062)));
            yy = -2.06706 + (((tickAnim - 233) / 4) * (0-(-2.06706)));
            zz = 0.28465 + (((tickAnim - 233) / 4) * (0-(0.28465)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = -3.5 + (((tickAnim - 237) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 260) {
            xx = -3.5 + (((tickAnim - 252) / 8) * (66-(-3.5)));
            yy = 0 + (((tickAnim - 252) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 8) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 66 + (((tickAnim - 260) / 8) * (-3.5-(66)));
            yy = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = -3.5 + (((tickAnim - 268) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 292) {
            xx = -3.5 + (((tickAnim - 283) / 9) * (66-(-3.5)));
            yy = 0 + (((tickAnim - 283) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 9) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 300) {
            xx = 66 + (((tickAnim - 292) / 8) * (-3.5-(66)));
            yy = 0 + (((tickAnim - 292) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 8) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = -3.5 + (((tickAnim - 300) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 322) {
            xx = -3.5 + (((tickAnim - 315) / 7) * (66-(-3.5)));
            yy = 0 + (((tickAnim - 315) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 7) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 328) {
            xx = 66 + (((tickAnim - 322) / 6) * (-3.5-(66)));
            yy = 0 + (((tickAnim - 322) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 6) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = -3.5 + (((tickAnim - 328) / 22) * (1-(-3.5)));
            yy = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 1 + (((tickAnim - 350) / 113) * (1-(1)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 463) / 37) * (0-(1)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 219) * (0.5-(0.45)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = 0.5 + (((tickAnim - 219) / 9) * (0.65-(0.5)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 228) / 5) * (1.525-(0.65)));
            zz = 0 + (((tickAnim - 228) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            yy = 1.525 + (((tickAnim - 233) / 4) * (1-(1.525)));
            zz = -0.35 + (((tickAnim - 233) / 4) * (0-(-0.35)));
        }
        else if (tickAnim >= 237 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 237) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 237) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 237) / 15) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 252) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 252) / 8) * (1-(1)));
            zz = 0 + (((tickAnim - 252) / 8) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 260) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 260) / 8) * (1-(1)));
            zz = 0 + (((tickAnim - 260) / 8) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 268) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 268) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 268) / 15) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 292) {
            xx = 0 + (((tickAnim - 283) / 9) * (0-(0)));
            yy = 1 + (((tickAnim - 283) / 9) * (1-(1)));
            zz = 0 + (((tickAnim - 283) / 9) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 292) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 292) / 8) * (1-(1)));
            zz = 0 + (((tickAnim - 292) / 8) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 300) / 15) * (0-(0)));
            yy = 1 + (((tickAnim - 300) / 15) * (1-(1)));
            zz = 0 + (((tickAnim - 300) / 15) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 322) {
            xx = 0 + (((tickAnim - 315) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 315) / 7) * (1-(1)));
            zz = 0 + (((tickAnim - 315) / 7) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 322) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 322) / 6) * (1.3-(1)));
            zz = 0 + (((tickAnim - 322) / 6) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 328) / 22) * (0-(0)));
            yy = 1.3 + (((tickAnim - 328) / 22) * (0.675-(1.3)));
            zz = 0 + (((tickAnim - 328) / 22) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            yy = 0.675 + (((tickAnim - 350) / 113) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0.675 + (((tickAnim - 463) / 37) * (0.45-(0.675)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (10.5-(0)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 10.5 + (((tickAnim - 228) / 9) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3-(10.5)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3 + (((tickAnim - 237) / 83) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3 + (((tickAnim - 320) / 30) * (0-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6))*3)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3 + (((tickAnim - 320) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (15.75-(0)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 15.75 + (((tickAnim - 228) / 9) * (15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3-(15.75)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3 + (((tickAnim - 237) / 83) * (15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3-(15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3 + (((tickAnim - 320) / 30) * (0-(15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-150))*3)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3 + (((tickAnim - 320) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-150))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (14.83-(0)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 14.83 + (((tickAnim - 223) / 5) * (14.83-(14.83)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 14.83 + (((tickAnim - 228) / 9) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3-(14.83)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3 + (((tickAnim - 237) / 83) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3 + (((tickAnim - 237) / 83) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3)));
        }
        else if (tickAnim >= 320 && tickAnim < 331) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3 + (((tickAnim - 320) / 11) * (-20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3)));
            yy = 0 + (((tickAnim - 320) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3 + (((tickAnim - 320) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3)));
        }
        else if (tickAnim >= 331 && tickAnim < 350) {
            xx = -20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3 + (((tickAnim - 331) / 19) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1-(-20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*3)));
            yy = 0 + (((tickAnim - 331) / 19) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3 + (((tickAnim - 331) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*3)));
        }
        else if (tickAnim >= 350 && tickAnim < 443) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1 + (((tickAnim - 350) / 93) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1)));
            yy = 0 + (((tickAnim - 350) / 93) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1 + (((tickAnim - 350) / 93) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1)));
        }
        else if (tickAnim >= 443 && tickAnim < 455) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1 + (((tickAnim - 443) / 12) * (-3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1)));
            yy = 0 + (((tickAnim - 443) / 12) * (0.40651-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1 + (((tickAnim - 443) / 12) * (-1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1)));
        }
        else if (tickAnim >= 455 && tickAnim < 463) {
            xx = -3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1 + (((tickAnim - 455) / 8) * (-3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1-(-3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1)));
            yy = 0.40651 + (((tickAnim - 455) / 8) * (0.40651-(0.40651)));
            zz = -1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1 + (((tickAnim - 455) / 8) * (-1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1-(-1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1 + (((tickAnim - 463) / 37) * (0-(-3.7551+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.6-500))*0.1)));
            yy = 0.40651 + (((tickAnim - 463) / 37) * (0-(0.40651)));
            zz = -1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1 + (((tickAnim - 463) / 37) * (0-(-1.4439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-500))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 0) / 237) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 237) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 237) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 500) {
            xx = 2.5 + (((tickAnim - 237) / 263) * (0-(2.5)));
            yy = 0 + (((tickAnim - 237) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 263) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (34.25-(0)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 34.25 + (((tickAnim - 223) / 5) * (0-(34.25)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 235) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 235) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 228 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 228) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 34.25 + (((tickAnim - 233) / 4) * (0-(34.25)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 237) / 226) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 226) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 226) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 237 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 237) / 226) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 226) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 226) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 331 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 331) / 9) * (27.75-(0)));
            yy = 0 + (((tickAnim - 331) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 331) / 9) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 27.75 + (((tickAnim - 340) / 10) * (-35-(27.75)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = -35 + (((tickAnim - 350) / 113) * (-35-(-35)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -35 + (((tickAnim - 463) / 37) * (0-(-35)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 331) {
            xx = 0 + (((tickAnim - 0) / 331) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 331) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 331) * (0-(0)));
        }
        else if (tickAnim >= 331 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 331) / 9) * (27.75-(0)));
            yy = 0 + (((tickAnim - 331) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 331) / 9) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 27.75 + (((tickAnim - 340) / 10) * (-35-(27.75)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 463) {
            xx = -35 + (((tickAnim - 350) / 113) * (-35-(-35)));
            yy = 0 + (((tickAnim - 350) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 113) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -35 + (((tickAnim - 463) / 37) * (0-(-35)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bodyFeathersUnder2, bodyFeathersUnder2.rotateAngleX + (float) Math.toRadians(0), bodyFeathersUnder2.rotateAngleY + (float) Math.toRadians(0), bodyFeathersUnder2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 443 && tickAnim < 450) {
            xx = 1 + (((tickAnim - 443) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 443) / 7) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 443) / 7) * (1-(1)));
        }
        else if (tickAnim >= 450 && tickAnim < 455) {
            xx = 1 + (((tickAnim - 450) / 5) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 450) / 5) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 450) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 0) / 500) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 500) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animDispFemale(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 500;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.15492-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.49964-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.00211-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.15492 + (((tickAnim - 10) / 10) * (0-(0.15492)));
            yy = 4.49964 + (((tickAnim - 10) / 10) * (8.75-(4.49964)));
            zz = 2.00211 + (((tickAnim - 10) / 10) * (0-(2.00211)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 20) / 50) * (-1.5-(0)));
            yy = 8.75 + (((tickAnim - 20) / 50) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 219) {
            xx = -1.5 + (((tickAnim - 70) / 149) * (-1.5-(-1.5)));
            yy = 8.75 + (((tickAnim - 70) / 149) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 70) / 149) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -1.5 + (((tickAnim - 219) / 18) * (0-(-1.5)));
            yy = 8.75 + (((tickAnim - 219) / 18) * (0-(8.75)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (-3.75-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 400) {
            xx = -4.5 + (((tickAnim - 392) / 8) * (-4-(-4.5)));
            yy = -3.75 + (((tickAnim - 392) / 8) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 392) / 8) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 414) {
            xx = -4 + (((tickAnim - 400) / 14) * (-4-(-4)));
            yy = -3.75 + (((tickAnim - 400) / 14) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 400) / 14) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = -4 + (((tickAnim - 414) / 18) * (-4-(-4)));
            yy = -3.75 + (((tickAnim - 414) / 18) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = -4 + (((tickAnim - 432) / 6) * (-3.75-(-4)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -3.75 + (((tickAnim - 438) / 25) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 472) {
            xx = -3.75 + (((tickAnim - 463) / 9) * (0.27-(-3.75)));
            yy = 0 + (((tickAnim - 463) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 9) * (0-(0)));
        }
        else if (tickAnim >= 472 && tickAnim < 480) {
            xx = 0.27 + (((tickAnim - 472) / 8) * (-2.75-(0.27)));
            yy = 0 + (((tickAnim - 472) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 472) / 8) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -2.75 + (((tickAnim - 480) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 1.1 + (((tickAnim - 20) / 199) * (1.1-(1.1)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 2.875 + (((tickAnim - 20) / 199) * (2.875-(2.875)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 1.1 + (((tickAnim - 219) / 18) * (0-(1.1)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 2.875 + (((tickAnim - 219) / 18) * (0-(2.875)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (-6.625-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 392) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 8) * (0-(0)));
            zz = -6.625 + (((tickAnim - 392) / 8) * (-6.495-(-6.625)));
        }
        else if (tickAnim >= 400 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 400) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 14) * (0-(0)));
            zz = -6.495 + (((tickAnim - 400) / 14) * (-6.625-(-6.495)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = -6.625 + (((tickAnim - 414) / 18) * (-14.47-(-6.625)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = -14.47 + (((tickAnim - 432) / 6) * (-14.37-(-14.47)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = -14.37 + (((tickAnim - 438) / 25) * (-14.37-(-14.37)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = -14.37 + (((tickAnim - 463) / 17) * (-7.71-(-14.37)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = -7.71 + (((tickAnim - 480) / 20) * (0-(-7.71)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.68269-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.70729-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.07954-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 91) {
            xx = -10.68269 + (((tickAnim - 20) / 71) * (-10.8665-(-10.68269)));
            yy = -3.70729 + (((tickAnim - 20) / 71) * (-5.05017-(-3.70729)));
            zz = -2.07954 + (((tickAnim - 20) / 71) * (0.32737-(-2.07954)));
        }
        else if (tickAnim >= 91 && tickAnim < 159) {
            xx = -10.8665 + (((tickAnim - 91) / 68) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2-(-10.8665)));
            yy = -5.05017 + (((tickAnim - 91) / 68) * (-0.36472-(-5.05017)));
            zz = 0.32737 + (((tickAnim - 91) / 68) * (0.6467-(0.32737)));
        }
        else if (tickAnim >= 159 && tickAnim < 205) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2 + (((tickAnim - 159) / 46) * (-10.8665-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2)));
            yy = -0.36472 + (((tickAnim - 159) / 46) * (5.05017-(-0.36472)));
            zz = 0.6467 + (((tickAnim - 159) / 46) * (-0.32737-(0.6467)));
        }
        else if (tickAnim >= 205 && tickAnim < 219) {
            xx = -10.8665 + (((tickAnim - 205) / 14) * (-10.8665-(-10.8665)));
            yy = 5.05017 + (((tickAnim - 205) / 14) * (5.05017-(5.05017)));
            zz = -0.32737 + (((tickAnim - 205) / 14) * (-0.32737-(-0.32737)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -10.8665 + (((tickAnim - 219) / 18) * (0-(-10.8665)));
            yy = 5.05017 + (((tickAnim - 219) / 18) * (0-(5.05017)));
            zz = -0.32737 + (((tickAnim - 219) / 18) * (0-(-0.32737)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 0 + (((tickAnim - 320) / 31) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 320) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 31) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 353) {
            xx = -8.25 + (((tickAnim - 351) / 2) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 351) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 2) * (0-(0)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = -8.25 + (((tickAnim - 353) / 5) * (-8.18744-(-8.25)));
            yy = 0 + (((tickAnim - 353) / 5) * (3.40064-(0)));
            zz = 0 + (((tickAnim - 353) / 5) * (2.10733-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 362) {
            xx = -8.18744 + (((tickAnim - 358) / 4) * (-8.18744-(-8.18744)));
            yy = 3.40064 + (((tickAnim - 358) / 4) * (3.40064-(3.40064)));
            zz = 2.10733 + (((tickAnim - 358) / 4) * (2.10733-(2.10733)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = -8.18744 + (((tickAnim - 362) / 30) * (0-(-8.18744)));
            yy = 3.40064 + (((tickAnim - 362) / 30) * (0-(3.40064)));
            zz = 2.10733 + (((tickAnim - 362) / 30) * (0-(2.10733)));
        }
        else if (tickAnim >= 392 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 392) / 8) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 392) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 8) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 414) {
            xx = -1.25 + (((tickAnim - 400) / 14) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 400) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 14) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = -1.25 + (((tickAnim - 414) / 18) * (-15.5-(-1.25)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = -15.5 + (((tickAnim - 432) / 31) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = -15.5 + (((tickAnim - 463) / 17) * (-19.02-(-15.5)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -19.02 + (((tickAnim - 480) / 20) * (0-(-19.02)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.825-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 91) {
            xx = -11.825 + (((tickAnim - 20) / 71) * (-25.5831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(-11.825)));
            yy = 0 + (((tickAnim - 20) / 71) * (-1.2182-(0)));
            zz = 0 + (((tickAnim - 20) / 71) * (-1.58631-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 120) {
            xx = -25.5831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 91) / 29) * (-19.73313-(-25.5831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = -1.2182 + (((tickAnim - 91) / 29) * (-1.2182-(-1.2182)));
            zz = -1.58631 + (((tickAnim - 91) / 29) * (-1.58631-(-1.58631)));
        }
        else if (tickAnim >= 120 && tickAnim < 158) {
            xx = -19.73313 + (((tickAnim - 120) / 38) * (-19.73313-(-19.73313)));
            yy = -1.2182 + (((tickAnim - 120) / 38) * (-1.2182-(-1.2182)));
            zz = -1.58631 + (((tickAnim - 120) / 38) * (-1.58631-(-1.58631)));
        }
        else if (tickAnim >= 158 && tickAnim < 159) {
            xx = -19.73313 + (((tickAnim - 158) / 1) * (-24.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-19.73313)));
            yy = -1.2182 + (((tickAnim - 158) / 1) * (-1.2182-(-1.2182)));
            zz = -1.58631 + (((tickAnim - 158) / 1) * (-1.58631-(-1.58631)));
        }
        else if (tickAnim >= 159 && tickAnim < 219) {
            xx = -24.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 159) / 60) * (-37.0831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(-24.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = -1.2182 + (((tickAnim - 159) / 60) * (1.2182-(-1.2182)));
            zz = -1.58631 + (((tickAnim - 159) / 60) * (1.58631-(-1.58631)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -37.0831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 219) / 18) * (-31.25-(-37.0831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 1.2182 + (((tickAnim - 219) / 18) * (0-(1.2182)));
            zz = 1.58631 + (((tickAnim - 219) / 18) * (0-(1.58631)));
        }
        else if (tickAnim >= 237 && tickAnim < 392) {
            xx = -31.25 + (((tickAnim - 237) / 155) * (0-(-31.25)));
            yy = 0 + (((tickAnim - 237) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 155) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = -14.25 + (((tickAnim - 432) / 6) * (-15-(-14.25)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -15 + (((tickAnim - 438) / 25) * (-15-(-15)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = -15 + (((tickAnim - 463) / 17) * (-17.25-(-15)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -17.25 + (((tickAnim - 480) / 20) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 0) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 91) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 91) * (0.575-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 91) / 114) * (0-(0)));
            yy = -0.325 + (((tickAnim - 91) / 114) * (-0.325-(-0.325)));
            zz = 0.575 + (((tickAnim - 91) / 114) * (0.575-(0.575)));
        }
        else if (tickAnim >= 205 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 205) / 14) * (0-(0)));
            yy = -0.325 + (((tickAnim - 205) / 14) * (-0.325-(-0.325)));
            zz = 0.575 + (((tickAnim - 205) / 14) * (0.575-(0.575)));
        }
        else if (tickAnim >= 219 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 219) / 173) * (0-(0)));
            yy = -0.325 + (((tickAnim - 219) / 173) * (0-(-0.325)));
            zz = 0.575 + (((tickAnim - 219) / 173) * (-0.6-(0.575)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = -0.6 + (((tickAnim - 392) / 22) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = -0.6 + (((tickAnim - 414) / 18) * (0-(-0.6)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 91) {
            xx = 19 + (((tickAnim - 20) / 71) * (3.25-(19)));
            yy = 0 + (((tickAnim - 20) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 71) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 159) {
            xx = 3.25 + (((tickAnim - 91) / 68) * (16.5-(3.25)));
            yy = 0 + (((tickAnim - 91) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 68) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 205) {
            xx = 16.5 + (((tickAnim - 159) / 46) * (14.5-(16.5)));
            yy = 0 + (((tickAnim - 159) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 46) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 219) {
            xx = 14.5 + (((tickAnim - 205) / 14) * (7.25-(14.5)));
            yy = 0 + (((tickAnim - 205) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 14) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 7.25 + (((tickAnim - 219) / 18) * (24.25-(7.25)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 24.25 + (((tickAnim - 237) / 83) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 24.25 + (((tickAnim - 320) / 31) * (9-(24.25)));
            yy = 0 + (((tickAnim - 320) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 31) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 353) {
            xx = 9 + (((tickAnim - 351) / 2) * (9-(9)));
            yy = 0 + (((tickAnim - 351) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 2) * (0-(0)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = 9 + (((tickAnim - 353) / 5) * (7.5-(9)));
            yy = 0 + (((tickAnim - 353) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 353) / 5) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 362) {
            xx = 7.5 + (((tickAnim - 358) / 4) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 358) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 4) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 7.5 + (((tickAnim - 362) / 30) * (0-(7.5)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 7.5 + (((tickAnim - 432) / 31) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 7.5 + (((tickAnim - 463) / 17) * (29.75-(7.5)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 29.75 + (((tickAnim - 480) / 20) * (0-(29.75)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 205) {
            xx = 11.5 + (((tickAnim - 20) / 185) * (0-(11.5)));
            yy = 0 + (((tickAnim - 20) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 185) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 205) / 14) * (4-(0)));
            yy = 0 + (((tickAnim - 205) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 14) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 230) {
            xx = 4 + (((tickAnim - 219) / 11) * (17.47871-(4)));
            yy = 0 + (((tickAnim - 219) / 11) * (-4.63951-(0)));
            zz = 0 + (((tickAnim - 219) / 11) * (-4.47299-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 17.47871 + (((tickAnim - 230) / 7) * (2.01655-(17.47871)));
            yy = -4.63951 + (((tickAnim - 230) / 7) * (-1.62365-(-4.63951)));
            zz = -4.47299 + (((tickAnim - 230) / 7) * (-1.16796-(-4.47299)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 2.01655 + (((tickAnim - 237) / 83) * (2.01655-(2.01655)));
            yy = -1.62365 + (((tickAnim - 237) / 83) * (-1.62365-(-1.62365)));
            zz = -1.16796 + (((tickAnim - 237) / 83) * (-1.16796-(-1.16796)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 2.01655 + (((tickAnim - 320) / 31) * (-16.98345-(2.01655)));
            yy = -1.62365 + (((tickAnim - 320) / 31) * (-1.62365-(-1.62365)));
            zz = -1.16796 + (((tickAnim - 320) / 31) * (-1.16796-(-1.16796)));
        }
        else if (tickAnim >= 351 && tickAnim < 353) {
            xx = -16.98345 + (((tickAnim - 351) / 2) * (-16.98345-(-16.98345)));
            yy = -1.62365 + (((tickAnim - 351) / 2) * (-1.62365-(-1.62365)));
            zz = -1.16796 + (((tickAnim - 351) / 2) * (-1.16796-(-1.16796)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = -16.98345 + (((tickAnim - 353) / 5) * (-16.92412-(-16.98345)));
            yy = -1.62365 + (((tickAnim - 353) / 5) * (-1.14586-(-1.62365)));
            zz = -1.16796 + (((tickAnim - 353) / 5) * (-3.6226-(-1.16796)));
        }
        else if (tickAnim >= 358 && tickAnim < 362) {
            xx = -16.92412 + (((tickAnim - 358) / 4) * (-16.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 358) / 4) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 358) / 4) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = -16.92412 + (((tickAnim - 362) / 30) * (-16.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 362) / 30) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 362) / 30) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 392 && tickAnim < 395) {
            xx = -16.92412 + (((tickAnim - 392) / 3) * (-15.67412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 392) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 392) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 395 && tickAnim < 398) {
            xx = -15.67412 + (((tickAnim - 395) / 3) * (-16.92412-(-15.67412)));
            yy = -1.14586 + (((tickAnim - 395) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 395) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 398 && tickAnim < 402) {
            xx = -16.92412 + (((tickAnim - 398) / 4) * (-15.67412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 398) / 4) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 398) / 4) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 402 && tickAnim < 405) {
            xx = -15.67412 + (((tickAnim - 402) / 3) * (-16.92412-(-15.67412)));
            yy = -1.14586 + (((tickAnim - 402) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 402) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 405 && tickAnim < 408) {
            xx = -16.92412 + (((tickAnim - 405) / 3) * (-15.67412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 405) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 405) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 408 && tickAnim < 412) {
            xx = -15.67412 + (((tickAnim - 408) / 4) * (-16.92412-(-15.67412)));
            yy = -1.14586 + (((tickAnim - 408) / 4) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 408) / 4) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 412 && tickAnim < 414) {
            xx = -16.92412 + (((tickAnim - 412) / 2) * (-16.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 412) / 2) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 412) / 2) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 414 && tickAnim < 438) {
            xx = -16.92412 + (((tickAnim - 414) / 24) * (-16.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 414) / 24) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 414) / 24) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 438 && tickAnim < 442) {
            xx = -16.92412 + (((tickAnim - 438) / 4) * (-14.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 438) / 4) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 438) / 4) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 442 && tickAnim < 445) {
            xx = -14.92412 + (((tickAnim - 442) / 3) * (-16.92412-(-14.92412)));
            yy = -1.14586 + (((tickAnim - 442) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 442) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 445 && tickAnim < 448) {
            xx = -16.92412 + (((tickAnim - 445) / 3) * (-14.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 445) / 3) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 445) / 3) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 448 && tickAnim < 452) {
            xx = -14.92412 + (((tickAnim - 448) / 4) * (-16.92412-(-14.92412)));
            yy = -1.14586 + (((tickAnim - 448) / 4) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 448) / 4) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 452 && tickAnim < 463) {
            xx = -16.92412 + (((tickAnim - 452) / 11) * (-16.92412-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 452) / 11) * (-1.14586-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 452) / 11) * (-3.6226-(-3.6226)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -16.92412 + (((tickAnim - 463) / 37) * (0-(-16.92412)));
            yy = -1.14586 + (((tickAnim - 463) / 37) * (0-(-1.14586)));
            zz = -3.6226 + (((tickAnim - 463) / 37) * (0-(-3.6226)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (1.5-(0)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 1.5 + (((tickAnim - 95) / 25) * (0-(1.5)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 25) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 120) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 45) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 165) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0)));
            yy = 0 + (((tickAnim - 165) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 20) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 219) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 185) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 185) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 34) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 351) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7 + (((tickAnim - 219) / 132) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*0.7)));
            yy = 0 + (((tickAnim - 219) / 132) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 132) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 149) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = -10.25 + (((tickAnim - 20) / 199) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (15.5-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 15.5 + (((tickAnim - 237) / 83) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 15.5 + (((tickAnim - 320) / 31) * (0-(15.5)));
            yy = 0 + (((tickAnim - 320) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 31) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 149) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(xx), headFeathers.rotateAngleY + (float) Math.toRadians(yy), headFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 218) {
            xx = -20.5 + (((tickAnim - 20) / 198) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 20) / 198) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 198) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 218) / 19) * (24.5-(0)));
            yy = 0 + (((tickAnim - 218) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 19) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 24.5 + (((tickAnim - 237) / 83) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 24.5 + (((tickAnim - 320) / 31) * (0-(24.5)));
            yy = 0 + (((tickAnim - 320) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 31) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 149) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 500) {
            xx = -7.25 + (((tickAnim - 20) / 480) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 480) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 480) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 215 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*1-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 346) {
            xx = 0 + (((tickAnim - 237) / 109) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 109) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*1 + (((tickAnim - 237) / 109) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*1)));
        }
        else if (tickAnim >= 346 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 346) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 346) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 346) / 16) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (12.75-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 412) {
            xx = 12.75 + (((tickAnim - 392) / 20) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 392) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 20) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 463) {
            xx = 12.75 + (((tickAnim - 412) / 51) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 412) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 51) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 12.75 + (((tickAnim - 463) / 37) * (0-(12.75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 215 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 215 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*-1-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 346) {
            xx = 0 + (((tickAnim - 237) / 109) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 109) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*-1 + (((tickAnim - 237) / 109) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))*-1)));
        }
        else if (tickAnim >= 346 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 346) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 346) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 346) / 16) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (12.75-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 412) {
            xx = 12.75 + (((tickAnim - 392) / 20) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 392) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 20) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 463) {
            xx = 12.75 + (((tickAnim - 412) / 51) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 412) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 51) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 12.75 + (((tickAnim - 463) / 37) * (0-(12.75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 215 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1-(0)));
            yy = 11.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(11.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 158) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1 + (((tickAnim - 60) / 98) * (-3.25-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 60) / 98) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            zz = 0 + (((tickAnim - 60) / 98) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = -3.25 + (((tickAnim - 158) / 24) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-3.25)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 182) / 37) * (-3.25-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -3.25 + (((tickAnim - 219) / 18) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 219) / 18) * (8.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = 8.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 237) / 30) * (-10.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*15-(8.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 267) / 26) * (0-(0)));
            yy = -10.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*15 + (((tickAnim - 267) / 26) * (0-(-10.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*15)));
            zz = 0 + (((tickAnim - 267) / 26) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 293) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 69) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (-5.48104-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (-3.43859-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (1.05078-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = -5.48104 + (((tickAnim - 392) / 22) * (-5.48104-(-5.48104)));
            yy = -3.43859 + (((tickAnim - 392) / 22) * (-3.43859-(-3.43859)));
            zz = 1.05078 + (((tickAnim - 392) / 22) * (1.05078-(1.05078)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = -5.48104 + (((tickAnim - 414) / 18) * (-5.47001-(-5.48104)));
            yy = -3.43859 + (((tickAnim - 414) / 18) * (1.03075-(-3.43859)));
            zz = 1.05078 + (((tickAnim - 414) / 18) * (0.52613-(1.05078)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = -5.47001 + (((tickAnim - 432) / 6) * (-4.47001-(-5.47001)));
            yy = 1.03075 + (((tickAnim - 432) / 6) * (1.03075-(1.03075)));
            zz = 0.52613 + (((tickAnim - 432) / 6) * (0.52613-(0.52613)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -4.47001 + (((tickAnim - 438) / 25) * (-4.47001-(-4.47001)));
            yy = 1.03075 + (((tickAnim - 438) / 25) * (1.03075-(1.03075)));
            zz = 0.52613 + (((tickAnim - 438) / 25) * (0.52613-(0.52613)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -4.47001 + (((tickAnim - 463) / 37) * (0-(-4.47001)));
            yy = 1.03075 + (((tickAnim - 463) / 37) * (0-(1.03075)));
            zz = 0.52613 + (((tickAnim - 463) / 37) * (0-(0.52613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*1.5-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*5 + (((tickAnim - 0) / 60) * (2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*5)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 158) {
            xx = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*1.5 + (((tickAnim - 60) / 98) * (0.75-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*1.5)));
            yy = 2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*5 + (((tickAnim - 60) / 98) * (0-(2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*5)));
            zz = 0 + (((tickAnim - 60) / 98) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = 0.75 + (((tickAnim - 158) / 24) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5-(0.75)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5 + (((tickAnim - 182) / 37) * (0.75-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0.75 + (((tickAnim - 219) / 18) * (0-(0.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*25-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = 0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*25 + (((tickAnim - 237) / 30) * (0-(0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*25)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 95) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (4.5-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 392) / 22) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            yy = 4.5 + (((tickAnim - 414) / 18) * (0-(4.5)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 432) / 6) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -0.25 + (((tickAnim - 438) / 25) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -0.25 + (((tickAnim - 463) / 37) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 158) {
            xx = 5.75 + (((tickAnim - 60) / 98) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 60) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 98) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = 5.75 + (((tickAnim - 158) / 24) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-130))*5-(5.75)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-130))*5 + (((tickAnim - 182) / 37) * (5.75-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-130))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 5.75 + (((tickAnim - 219) / 18) * (0-(5.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (-30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*35-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = -30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*35 + (((tickAnim - 237) / 30) * (0-(-30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*35)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 95) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (9.25-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (5.25-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 9.25 + (((tickAnim - 392) / 22) * (9.25-(9.25)));
            yy = 5.25 + (((tickAnim - 392) / 22) * (5.25-(5.25)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 9.25 + (((tickAnim - 414) / 18) * (0-(9.25)));
            yy = 5.25 + (((tickAnim - 414) / 18) * (-7-(5.25)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 432) / 6) * (-1.5-(0)));
            yy = -7 + (((tickAnim - 432) / 6) * (-7-(-7)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -1.5 + (((tickAnim - 438) / 25) * (-1.5-(-1.5)));
            yy = -7 + (((tickAnim - 438) / 25) * (-7-(-7)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -1.5 + (((tickAnim - 463) / 37) * (0-(-1.5)));
            yy = -7 + (((tickAnim - 463) / 37) * (0-(-7)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.5-(0)));
            yy = 12.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*25 + (((tickAnim - 0) / 60) * (0-(12.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*25)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 158) {
            xx = 4.5 + (((tickAnim - 60) / 98) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 60) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 98) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = 4.5 + (((tickAnim - 158) / 24) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-180))*5-(4.5)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-180))*5 + (((tickAnim - 182) / 37) * (4.5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-180))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 4.5 + (((tickAnim - 219) / 18) * (0-(4.5)));
            yy = 0 + (((tickAnim - 219) / 18) * (-14.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-45-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = -14.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-45 + (((tickAnim - 237) / 30) * (0-(-14.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-45)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 95) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (7.75-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (5.25-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 7.75 + (((tickAnim - 392) / 22) * (7.75-(7.75)));
            yy = 5.25 + (((tickAnim - 392) / 22) * (5.25-(5.25)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 7.75 + (((tickAnim - 414) / 18) * (0-(7.75)));
            yy = 5.25 + (((tickAnim - 414) / 18) * (0-(5.25)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 0) / 158) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 158) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 158) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 158) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5-(0)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5 + (((tickAnim - 182) / 37) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = 28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55 + (((tickAnim - 237) / 30) * (0-(28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 267) / 233) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 233) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 233) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(xx), rightTailFan4.rotateAngleY + (float) Math.toRadians(yy), rightTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 0) / 158) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 158) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 158) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 158) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5-(0)));
            yy = 0 + (((tickAnim - 158) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 24) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5 + (((tickAnim - 182) / 37) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-250))*5)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 237) / 30) * (0-(0)));
            yy = 28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55 + (((tickAnim - 237) / 30) * (0-(28.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*-55)));
            zz = 0 + (((tickAnim - 237) / 30) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 267) / 233) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 233) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 233) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(xx), leftTailFan4.rotateAngleY + (float) Math.toRadians(yy), leftTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.94478-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.1806-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.61862-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.94478 + (((tickAnim - 10) / 10) * (-12.23222-(-5.94478)));
            yy = -4.1806 + (((tickAnim - 10) / 10) * (-6.64393-(-4.1806)));
            zz = -0.61862 + (((tickAnim - 10) / 10) * (3.99906-(-0.61862)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = -12.23222 + (((tickAnim - 20) / 199) * (-12.23222-(-12.23222)));
            yy = -6.64393 + (((tickAnim - 20) / 199) * (-6.64393-(-6.64393)));
            zz = 3.99906 + (((tickAnim - 20) / 199) * (3.99906-(3.99906)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -12.23222 + (((tickAnim - 219) / 18) * (0-(-12.23222)));
            yy = -6.64393 + (((tickAnim - 219) / 18) * (0-(-6.64393)));
            zz = 3.99906 + (((tickAnim - 219) / 18) * (0-(3.99906)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 362) / 21) * (-37.36-(0)));
            yy = 0 + (((tickAnim - 362) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 21) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 392) {
            xx = -37.36 + (((tickAnim - 383) / 9) * (-20.75-(-37.36)));
            yy = 0 + (((tickAnim - 383) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 9) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 400) {
            xx = -20.75 + (((tickAnim - 392) / 8) * (-21.5-(-20.75)));
            yy = 0 + (((tickAnim - 392) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 8) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 414) {
            xx = -21.5 + (((tickAnim - 400) / 14) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 400) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 14) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = -21.5 + (((tickAnim - 414) / 18) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 432) / 6) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -0.25 + (((tickAnim - 438) / 25) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 472) {
            xx = -0.25 + (((tickAnim - 463) / 9) * (-13.57-(-0.25)));
            yy = 0 + (((tickAnim - 463) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 9) * (0-(0)));
        }
        else if (tickAnim >= 472 && tickAnim < 480) {
            xx = -13.57 + (((tickAnim - 472) / 8) * (-16.13-(-13.57)));
            yy = 0 + (((tickAnim - 472) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 472) / 8) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -16.13 + (((tickAnim - 480) / 20) * (0-(-16.13)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = -13.75 + (((tickAnim - 20) / 50) * (-12-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 219) {
            xx = -12 + (((tickAnim - 70) / 149) * (-13.75-(-12)));
            yy = 0 + (((tickAnim - 70) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 149) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = -13.75 + (((tickAnim - 219) / 18) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (31.19-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 31.19 + (((tickAnim - 375) / 17) * (-11.25-(31.19)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = -11.25 + (((tickAnim - 392) / 22) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = -11.25 + (((tickAnim - 414) / 18) * (4.25-(-11.25)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 4.25 + (((tickAnim - 432) / 31) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 4.25 + (((tickAnim - 463) / 17) * (-18.73-(4.25)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = -18.73 + (((tickAnim - 480) / 11) * (31.92-(-18.73)));
            yy = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 11) * (0-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 31.92 + (((tickAnim - 491) / 9) * (0-(31.92)));
            yy = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 491) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 237 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 237) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 138) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 237) / 138) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 375) / 105) * (0-(0)));
            yy = -0.55 + (((tickAnim - 375) / 105) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 375) / 105) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = -0.55 + (((tickAnim - 480) / 20) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 10.75 + (((tickAnim - 20) / 199) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 10.75 + (((tickAnim - 219) / 18) * (0-(10.75)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (-32.17-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = -32.17 + (((tickAnim - 375) / 17) * (1-(-32.17)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 1 + (((tickAnim - 392) / 22) * (1-(1)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 1 + (((tickAnim - 414) / 18) * (0-(1)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = -9.25 + (((tickAnim - 480) / 11) * (-30.99-(-9.25)));
            yy = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 11) * (0-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = -30.99 + (((tickAnim - 491) / 9) * (0-(-30.99)));
            yy = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 491) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0.875 + (((tickAnim - 20) / 199) * (0.875-(0.875)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0.875 + (((tickAnim - 219) / 18) * (0-(0.875)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (-0.72-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0.96-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            yy = -0.72 + (((tickAnim - 375) / 17) * (-1.175-(-0.72)));
            zz = 0.96 + (((tickAnim - 375) / 17) * (0.575-(0.96)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = -1.175 + (((tickAnim - 392) / 22) * (-1.175-(-1.175)));
            zz = 0.575 + (((tickAnim - 392) / 22) * (0.575-(0.575)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            yy = -1.175 + (((tickAnim - 414) / 18) * (0-(-1.175)));
            zz = 0.575 + (((tickAnim - 414) / 18) * (0-(0.575)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0.725-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            yy = -1.025 + (((tickAnim - 480) / 11) * (-0.62-(-1.025)));
            zz = 0.725 + (((tickAnim - 480) / 11) * (1.105-(0.725)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            yy = -0.62 + (((tickAnim - 491) / 9) * (0-(-0.62)));
            zz = 1.105 + (((tickAnim - 491) / 9) * (0-(1.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.61824-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.7296-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.04514-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 15.61824 + (((tickAnim - 20) / 199) * (15.61824-(15.61824)));
            yy = 3.7296 + (((tickAnim - 20) / 199) * (3.7296-(3.7296)));
            zz = -4.04514 + (((tickAnim - 20) / 199) * (-4.04514-(-4.04514)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 15.61824 + (((tickAnim - 219) / 18) * (0-(15.61824)));
            yy = 3.7296 + (((tickAnim - 219) / 18) * (0-(3.7296)));
            zz = -4.04514 + (((tickAnim - 219) / 18) * (0-(-4.04514)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (76.97-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 76.97 + (((tickAnim - 375) / 17) * (36.25-(76.97)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 36.25 + (((tickAnim - 392) / 22) * (36.25-(36.25)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 36.25 + (((tickAnim - 414) / 18) * (0-(36.25)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (48-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = 48 + (((tickAnim - 480) / 11) * (76-(48)));
            yy = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 11) * (0-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 76 + (((tickAnim - 491) / 9) * (0-(76)));
            yy = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 491) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = 0.475 + (((tickAnim - 20) / 199) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = 0.475 + (((tickAnim - 219) / 18) * (0-(0.475)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (1.425-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (-0.43-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            yy = 1.425 + (((tickAnim - 375) / 17) * (0-(1.425)));
            zz = -0.43 + (((tickAnim - 375) / 17) * (-0.3-(-0.43)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = -0.3 + (((tickAnim - 392) / 22) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 414 && tickAnim < 424) {
            xx = 0 + (((tickAnim - 414) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 10) * (0.875-(0)));
            zz = -0.3 + (((tickAnim - 414) / 10) * (-0.13-(-0.3)));
        }
        else if (tickAnim >= 424 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 424) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 424) / 8) * (0-(0.875)));
            zz = -0.13 + (((tickAnim - 424) / 8) * (0-(-0.13)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 7) * (0.75-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 470) / 10) * (0-(0.75)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 11) * (1.5-(0)));
            zz = 0 + (((tickAnim - 480) / 11) * (-0.325-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            yy = 1.5 + (((tickAnim - 491) / 9) * (0-(1.5)));
            zz = -0.325 + (((tickAnim - 491) / 9) * (0-(-0.325)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 10) / 10) * (22.5-(6.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 22.5 + (((tickAnim - 20) / 199) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 22.5 + (((tickAnim - 219) / 9) * (-8.21-(22.5)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -8.21 + (((tickAnim - 228) / 9) * (0-(-8.21)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (22.25-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 400) {
            xx = 22.25 + (((tickAnim - 392) / 8) * (22-(22.25)));
            yy = 0 + (((tickAnim - 392) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 8) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 414) {
            xx = 22 + (((tickAnim - 400) / 14) * (22-(22)));
            yy = 0 + (((tickAnim - 400) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 14) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 22 + (((tickAnim - 414) / 18) * (-18-(22)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 438) {
            xx = -18 + (((tickAnim - 432) / 6) * (-18.25-(-18)));
            yy = 0 + (((tickAnim - 432) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 6) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 463) {
            xx = -18.25 + (((tickAnim - 438) / 25) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 438) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 25) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = -18.25 + (((tickAnim - 463) / 17) * (23.77-(-18.25)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 23.77 + (((tickAnim - 480) / 20) * (0-(23.77)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.5 + (((tickAnim - 10) / 10) * (-9.5-(24.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = -9.5 + (((tickAnim - 20) / 50) * (-7.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 219) {
            xx = -7.5 + (((tickAnim - 70) / 149) * (-9.5-(-7.5)));
            yy = 0 + (((tickAnim - 70) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 149) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -9.5 + (((tickAnim - 219) / 9) * (27.02-(-9.5)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 27.02 + (((tickAnim - 228) / 9) * (0-(27.02)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (7-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 7 + (((tickAnim - 392) / 22) * (7-(7)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 7 + (((tickAnim - 414) / 9) * (28.23-(7)));
            yy = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 432) {
            xx = 28.23 + (((tickAnim - 423) / 9) * (-15-(28.23)));
            yy = 0 + (((tickAnim - 423) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 423) / 9) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = -15 + (((tickAnim - 432) / 31) * (-15-(-15)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = -15 + (((tickAnim - 463) / 7) * (31-(-15)));
            yy = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 31 + (((tickAnim - 470) / 10) * (-7.25-(31)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -7.25 + (((tickAnim - 480) / 20) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 0) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 228) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 228) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 228) / 252) * (0-(0)));
            yy = -0.375 + (((tickAnim - 228) / 252) * (-0.55-(-0.375)));
            zz = 0 + (((tickAnim - 228) / 252) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = -0.55 + (((tickAnim - 480) / 20) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 10) / 10) * (8-(-32.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 8 + (((tickAnim - 20) / 199) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 8 + (((tickAnim - 219) / 4) * (-1.78-(8)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = -1.78 + (((tickAnim - 223) / 5) * (-31.06-(-1.78)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -31.06 + (((tickAnim - 228) / 9) * (0-(-31.06)));
            yy = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 9) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (4.75-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 4.75 + (((tickAnim - 392) / 22) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 4.75 + (((tickAnim - 414) / 9) * (-31.24-(4.75)));
            yy = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 428) {
            xx = -31.24 + (((tickAnim - 423) / 5) * (-44.59-(-31.24)));
            yy = 0 + (((tickAnim - 423) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 423) / 5) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 432) {
            xx = -44.59 + (((tickAnim - 428) / 4) * (-5.25-(-44.59)));
            yy = 0 + (((tickAnim - 428) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 4) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = -5.25 + (((tickAnim - 432) / 31) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = -5.25 + (((tickAnim - 463) / 7) * (-33.13-(-5.25)));
            yy = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -33.13 + (((tickAnim - 470) / 10) * (13.7-(-33.13)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 13.7 + (((tickAnim - 480) / 20) * (0-(13.7)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = -0.025 + (((tickAnim - 20) / 199) * (-0.025-(-0.025)));
            yy = -1.275 + (((tickAnim - 20) / 199) * (-1.275-(-1.275)));
            zz = 0.3 + (((tickAnim - 20) / 199) * (0.3-(0.3)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = -0.025 + (((tickAnim - 219) / 9) * (-0.025-(-0.025)));
            yy = -1.275 + (((tickAnim - 219) / 9) * (-0.795-(-1.275)));
            zz = 0.3 + (((tickAnim - 219) / 9) * (1.035-(0.3)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = -0.025 + (((tickAnim - 228) / 9) * (0-(-0.025)));
            yy = -0.795 + (((tickAnim - 228) / 9) * (0-(-0.795)));
            zz = 1.035 + (((tickAnim - 228) / 9) * (0-(1.035)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0.575-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = -1.275 + (((tickAnim - 392) / 22) * (-1.275-(-1.275)));
            zz = 0.575 + (((tickAnim - 392) / 22) * (0.575-(0.575)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            yy = -1.275 + (((tickAnim - 414) / 9) * (-0.77-(-1.275)));
            zz = 0.575 + (((tickAnim - 414) / 9) * (1.02-(0.575)));
        }
        else if (tickAnim >= 423 && tickAnim < 428) {
            xx = 0 + (((tickAnim - 423) / 5) * (0-(0)));
            yy = -0.77 + (((tickAnim - 423) / 5) * (-1.12-(-0.77)));
            zz = 1.02 + (((tickAnim - 423) / 5) * (1.02-(1.02)));
        }
        else if (tickAnim >= 428 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 428) / 35) * (0-(0)));
            yy = -1.12 + (((tickAnim - 428) / 35) * (-1.12-(-1.12)));
            zz = 1.02 + (((tickAnim - 428) / 35) * (1.02-(1.02)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            yy = -1.12 + (((tickAnim - 463) / 7) * (-0.715-(-1.12)));
            zz = 1.02 + (((tickAnim - 463) / 7) * (1.135-(1.02)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = -0.715 + (((tickAnim - 470) / 10) * (-1.4-(-0.715)));
            zz = 1.135 + (((tickAnim - 470) / 10) * (0.54-(1.135)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = -1.4 + (((tickAnim - 480) / 20) * (0-(-1.4)));
            zz = 0.54 + (((tickAnim - 480) / 20) * (0-(0.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 76.75 + (((tickAnim - 10) / 10) * (-21-(76.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = -21 + (((tickAnim - 20) / 199) * (-19-(-21)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = -19 + (((tickAnim - 219) / 4) * (72-(-19)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 72 + (((tickAnim - 223) / 5) * (71.5-(72)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 232) {
            xx = 71.5 + (((tickAnim - 228) / 4) * (27.25-(71.5)));
            yy = 0 + (((tickAnim - 228) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 4) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 237) {
            xx = 27.25 + (((tickAnim - 232) / 5) * (0-(27.25)));
            yy = 0 + (((tickAnim - 232) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 5) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = -13.25 + (((tickAnim - 375) / 17) * (45.25-(-13.25)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 45.25 + (((tickAnim - 392) / 22) * (45.25-(45.25)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 45.25 + (((tickAnim - 414) / 9) * (71.06-(45.25)));
            yy = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 428) {
            xx = 71.06 + (((tickAnim - 423) / 5) * (45.81-(71.06)));
            yy = 0 + (((tickAnim - 423) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 423) / 5) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 432) {
            xx = 45.81 + (((tickAnim - 428) / 4) * (42.5-(45.81)));
            yy = 0 + (((tickAnim - 428) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 4) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 42.5 + (((tickAnim - 432) / 31) * (42.5-(42.5)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = 42.5 + (((tickAnim - 463) / 7) * (73-(42.5)));
            yy = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 73 + (((tickAnim - 470) / 10) * (-26.33-(73)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -26.33 + (((tickAnim - 480) / 20) * (0-(-26.33)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.365-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.375-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.365 + (((tickAnim - 10) / 10) * (-0.225-(1.365)));
            zz = -0.375 + (((tickAnim - 10) / 10) * (0-(-0.375)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = -0.225 + (((tickAnim - 20) / 199) * (0.325-(-0.225)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = 0.325 + (((tickAnim - 219) / 9) * (1.93-(0.325)));
            zz = 0 + (((tickAnim - 219) / 9) * (-0.35-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 228) / 9) * (0-(0)));
            yy = 1.93 + (((tickAnim - 228) / 9) * (0-(1.93)));
            zz = -0.35 + (((tickAnim - 228) / 9) * (0-(-0.35)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            yy = -0.275 + (((tickAnim - 375) / 17) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 9) * (1-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 428) {
            xx = 0 + (((tickAnim - 423) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 423) / 5) * (1-(1)));
            zz = 0 + (((tickAnim - 423) / 5) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 428) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 428) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 428) / 4) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 7) * (1.38-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (-0.375-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 1.38 + (((tickAnim - 470) / 10) * (-0.175-(1.38)));
            zz = -0.375 + (((tickAnim - 470) / 10) * (0.225-(-0.375)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 480) / 20) * (0-(-0.175)));
            zz = 0.225 + (((tickAnim - 480) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = -4.75 + (((tickAnim - 20) / 199) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = -4.75 + (((tickAnim - 219) / 18) * (0-(-4.75)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 362) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 52) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (5.25-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 5.25 + (((tickAnim - 432) / 31) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 5.25 + (((tickAnim - 463) / 37) * (0-(5.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = -1.25 + (((tickAnim - 20) / 199) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            yy = -1.25 + (((tickAnim - 219) / 18) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 362) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 52) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 414) / 18) * (4-(0)));
            yy = 0 + (((tickAnim - 414) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 18) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 4 + (((tickAnim - 432) / 31) * (4-(4)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 4 + (((tickAnim - 463) / 37) * (0-(4)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 0) / 230) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 230) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 230) / 7) * (12-(0)));
            yy = 0 + (((tickAnim - 230) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 7) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 12 + (((tickAnim - 237) / 83) * (8.75-(12)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 330) {
            xx = 8.75 + (((tickAnim - 320) / 10) * (20.5-(8.75)));
            yy = 0 + (((tickAnim - 320) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 10) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 351) {
            xx = 20.5 + (((tickAnim - 330) / 21) * (0-(20.5)));
            yy = 0 + (((tickAnim - 330) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 21) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 353) {
            xx = 0 + (((tickAnim - 351) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 2) * (0-(0)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = 0 + (((tickAnim - 353) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 353) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 353) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 358) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 4) * (0-(0)));
            zz = -2 + (((tickAnim - 358) / 4) * (-2-(-2)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = -2 + (((tickAnim - 362) / 30) * (-2-(-2)));
        }
        else if (tickAnim >= 392 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 392) / 3) * (-2-(0)));
            yy = 0 + (((tickAnim - 392) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 392) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 395 && tickAnim < 398) {
            xx = -2 + (((tickAnim - 395) / 3) * (0-(-2)));
            yy = 0 + (((tickAnim - 395) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 395) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 398 && tickAnim < 402) {
            xx = 0 + (((tickAnim - 398) / 4) * (-2-(0)));
            yy = 0 + (((tickAnim - 398) / 4) * (0-(0)));
            zz = -2 + (((tickAnim - 398) / 4) * (-2-(-2)));
        }
        else if (tickAnim >= 402 && tickAnim < 405) {
            xx = -2 + (((tickAnim - 402) / 3) * (0-(-2)));
            yy = 0 + (((tickAnim - 402) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 402) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 405 && tickAnim < 408) {
            xx = 0 + (((tickAnim - 405) / 3) * (-2-(0)));
            yy = 0 + (((tickAnim - 405) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 405) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 408 && tickAnim < 412) {
            xx = -2 + (((tickAnim - 408) / 4) * (0-(-2)));
            yy = 0 + (((tickAnim - 408) / 4) * (0-(0)));
            zz = -2 + (((tickAnim - 408) / 4) * (-2-(-2)));
        }
        else if (tickAnim >= 412 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 412) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 412) / 2) * (0-(0)));
            zz = -2 + (((tickAnim - 412) / 2) * (-2-(-2)));
        }
        else if (tickAnim >= 414 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 414) / 24) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 414) / 24) * (0-(0)));
            zz = -2 + (((tickAnim - 414) / 24) * (-2-(-2)));
        }
        else if (tickAnim >= 438 && tickAnim < 442) {
            xx = -3.75 + (((tickAnim - 438) / 4) * (-8.25-(-3.75)));
            yy = 0 + (((tickAnim - 438) / 4) * (0-(0)));
            zz = -2 + (((tickAnim - 438) / 4) * (-2-(-2)));
        }
        else if (tickAnim >= 442 && tickAnim < 445) {
            xx = -8.25 + (((tickAnim - 442) / 3) * (-3.75-(-8.25)));
            yy = 0 + (((tickAnim - 442) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 442) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 445 && tickAnim < 448) {
            xx = -3.75 + (((tickAnim - 445) / 3) * (-8.25-(-3.75)));
            yy = 0 + (((tickAnim - 445) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 445) / 3) * (-2-(-2)));
        }
        else if (tickAnim >= 448 && tickAnim < 452) {
            xx = -8.25 + (((tickAnim - 448) / 4) * (-3.75-(-8.25)));
            yy = 0 + (((tickAnim - 448) / 4) * (0-(0)));
            zz = -2 + (((tickAnim - 448) / 4) * (-2-(-2)));
        }
        else if (tickAnim >= 452 && tickAnim < 463) {
            xx = -3.75 + (((tickAnim - 452) / 11) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 452) / 11) * (0-(0)));
            zz = -2 + (((tickAnim - 452) / 11) * (-2-(-2)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = -3.75 + (((tickAnim - 463) / 37) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = -2 + (((tickAnim - 463) / 37) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 0) / 237) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 237) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 237) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 500) {
            xx = 2.5 + (((tickAnim - 237) / 263) * (0-(2.5)));
            yy = 0 + (((tickAnim - 237) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 263) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (34.25-(0)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = 34.25 + (((tickAnim - 223) / 5) * (0-(34.25)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 228) / 134) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 134) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (40.5-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 40.5 + (((tickAnim - 375) / 17) * (0-(40.5)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 392) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 71) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 486) {
            xx = 0 + (((tickAnim - 480) / 6) * (-31.58-(0)));
            yy = 0 + (((tickAnim - 480) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 6) * (0-(0)));
        }
        else if (tickAnim >= 486 && tickAnim < 491) {
            xx = -31.58 + (((tickAnim - 486) / 5) * (46.75-(-31.58)));
            yy = 0 + (((tickAnim - 486) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 486) / 5) * (0-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 46.75 + (((tickAnim - 491) / 9) * (0-(46.75)));
            yy = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 491) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 219) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 235) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 17) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 491) {
            xx = 0 + (((tickAnim - 480) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 11) * (0.125-(0)));
            zz = 0 + (((tickAnim - 480) / 11) * (0.05-(0)));
        }
        else if (tickAnim >= 491 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 491) / 9) * (0-(0)));
            yy = 0.125 + (((tickAnim - 491) / 9) * (0-(0.125)));
            zz = 0.05 + (((tickAnim - 491) / 9) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.12 + (((tickAnim - 5) / 5) * (29.75-(-19.12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 10) / 3) * (-8.79-(29.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -8.79 + (((tickAnim - 13) / 2) * (-9.5-(-8.79)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 15) / 5) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 219) / 4) * (-87.63-(0)));
            yy = 0 + (((tickAnim - 219) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 4) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 228) {
            xx = -87.63 + (((tickAnim - 223) / 5) * (34.75-(-87.63)));
            yy = 0 + (((tickAnim - 223) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 5) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 228) {
            xx = 34.75 + (((tickAnim - 228) / 0) * (0-(34.75)));
            yy = 0 + (((tickAnim - 228) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 0) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 228) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 228) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 5) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 34.25 + (((tickAnim - 233) / 4) * (0-(34.25)));
            yy = 0 + (((tickAnim - 233) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 4) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 375) / 17) * (-76-(0)));
            yy = 0 + (((tickAnim - 375) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 17) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 414) {
            xx = -76 + (((tickAnim - 392) / 22) * (-76-(-76)));
            yy = 0 + (((tickAnim - 392) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 22) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = -76 + (((tickAnim - 414) / 9) * (53.75-(-76)));
            yy = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 427) {
            xx = 53.75 + (((tickAnim - 423) / 4) * (53.75-(53.75)));
            yy = 0 + (((tickAnim - 423) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 423) / 4) * (0-(0)));
        }
        else if (tickAnim >= 427 && tickAnim < 432) {
            xx = 53.75 + (((tickAnim - 427) / 5) * (0-(53.75)));
            yy = 0 + (((tickAnim - 427) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 427) / 5) * (0-(0)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 466) {
            xx = 0 + (((tickAnim - 463) / 3) * (-25.44-(0)));
            yy = 0 + (((tickAnim - 463) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 3) * (0-(0)));
        }
        else if (tickAnim >= 466 && tickAnim < 470) {
            xx = -25.44 + (((tickAnim - 466) / 4) * (53-(-25.44)));
            yy = 0 + (((tickAnim - 466) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 466) / 4) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 53 + (((tickAnim - 470) / 10) * (0-(53)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 0) / 237) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 237) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 237) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 362) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 13) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 375) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 39) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 423) {
            xx = 0 + (((tickAnim - 414) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 9) * (0.15-(0)));
            zz = 0 + (((tickAnim - 414) / 9) * (0.1-(0)));
        }
        else if (tickAnim >= 423 && tickAnim < 427) {
            xx = 0 + (((tickAnim - 423) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 423) / 4) * (0.15-(0.15)));
            zz = 0.1 + (((tickAnim - 423) / 4) * (0.225-(0.1)));
        }
        else if (tickAnim >= 427 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 427) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 427) / 5) * (0-(0.15)));
            zz = 0.225 + (((tickAnim - 427) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 432 && tickAnim < 463) {
            xx = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 432) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 432) / 31) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 463) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 463) / 7) * (0.125-(0)));
            zz = 0 + (((tickAnim - 463) / 7) * (0.075-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 470) / 10) * (0-(0.125)));
            zz = 0.075 + (((tickAnim - 470) / 10) * (0-(0.075)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 215) {
            xx = 14.5 + (((tickAnim - 80) / 135) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 80) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 135) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 237) {
            xx = 14.5 + (((tickAnim - 215) / 22) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 14.5 + (((tickAnim - 237) / 125) * (0-(14.5)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (27.25-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 412) {
            xx = 27.25 + (((tickAnim - 392) / 20) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 392) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 20) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 463) {
            xx = 27.25 + (((tickAnim - 412) / 51) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 412) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 51) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 27.25 + (((tickAnim - 463) / 37) * (0-(27.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 215) {
            xx = 14.5 + (((tickAnim - 80) / 135) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 80) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 135) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 237) {
            xx = 14.5 + (((tickAnim - 215) / 22) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 215) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 22) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 362) {
            xx = 14.5 + (((tickAnim - 237) / 125) * (0-(14.5)));
            yy = 0 + (((tickAnim - 237) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 125) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 392) {
            xx = 0 + (((tickAnim - 362) / 30) * (27.25-(0)));
            yy = 0 + (((tickAnim - 362) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 30) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 412) {
            xx = 27.25 + (((tickAnim - 392) / 20) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 392) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 20) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 463) {
            xx = 27.25 + (((tickAnim - 412) / 51) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 412) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 51) * (0-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 500) {
            xx = 27.25 + (((tickAnim - 463) / 37) * (0-(27.25)));
            yy = 0 + (((tickAnim - 463) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 463) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bodyFeathersUnder2, bodyFeathersUnder2.rotateAngleX + (float) Math.toRadians(0), bodyFeathersUnder2.rotateAngleY + (float) Math.toRadians(0), bodyFeathersUnder2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 443 && tickAnim < 450) {
            xx = 1 + (((tickAnim - 443) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 443) / 7) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 443) / 7) * (1-(1)));
        }
        else if (tickAnim >= 450 && tickAnim < 455) {
            xx = 1 + (((tickAnim - 450) / 5) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 450) / 5) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 450) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 219) {
            xx = -5.25 + (((tickAnim - 20) / 199) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 199) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 199) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 237) {
            xx = 0 + (((tickAnim - 219) / 18) * (12.75-(0)));
            yy = 0 + (((tickAnim - 219) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 18) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 320) {
            xx = 12.75 + (((tickAnim - 237) / 83) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 237) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 83) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 351) {
            xx = 12.75 + (((tickAnim - 320) / 31) * (0-(12.75)));
            yy = 0 + (((tickAnim - 320) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 31) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 149) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (29.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 29.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 21) / 9) * (-15-(29.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -15 + (((tickAnim - 30) / 25) * (0-(-15)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-8.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -8.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50 + (((tickAnim - 21) / 9) * (-26.75-(-8.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -26.75 + (((tickAnim - 30) / 25) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.575-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 21) / 34) * (0-(0)));
            yy = -0.675 + (((tickAnim - 21) / 34) * (0-(-0.675)));
            zz = 0.575 + (((tickAnim - 21) / 34) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-169.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*190-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 55) {
            xx = -169.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*190 + (((tickAnim - 21) / 34) * (0-(-169.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*190)));
            yy = 0 + (((tickAnim - 21) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 21) / 34) * (0-(0)));
            yy = 0.2 + (((tickAnim - 21) / 34) * (0-(0.2)));
            zz = -0.225 + (((tickAnim - 21) / 34) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (84.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*90-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 55) {
            xx = 84.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*90 + (((tickAnim - 21) / 34) * (0-(84.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*90)));
            yy = 0 + (((tickAnim - 21) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 21) / 9) * (-8.75-(3.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -8.75 + (((tickAnim - 30) / 25) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.42-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 5.42 + (((tickAnim - 13) / 17) * (35.25-(5.42)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 35.25 + (((tickAnim - 30) / 10) * (0-(35.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (29.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 29.75 + (((tickAnim - 30) / 10) * (0-(29.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(xx), headFeathers.rotateAngleY + (float) Math.toRadians(yy), headFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (34-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 34 + (((tickAnim - 30) / 10) * (0-(34)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 21) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 21) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 21) / 9) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 21) / 9) * (0.0225-(0.0225)));
            zz = 1 + (((tickAnim - 21) / 9) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 30) / 10) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 21) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 21) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 21) / 9) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 21) / 9) * (0.0225-(0.0225)));
            zz = 1 + (((tickAnim - 21) / 9) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 30) / 10) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (24.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 24.75 + (((tickAnim - 30) / 10) * (0-(24.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (30-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30 + (((tickAnim - 30) / 10) * (0-(30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (26.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 26.75 + (((tickAnim - 30) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(xx), neckFeathers2.rotateAngleY + (float) Math.toRadians(yy), neckFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (43.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 43.75 + (((tickAnim - 30) / 10) * (0-(43.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 30) / 10) * (0-(12.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers3.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (23.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 23.75 + (((tickAnim - 30) / 10) * (0-(23.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers4.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (4.5-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.5 + (((tickAnim - 30) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers2.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 38) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 43) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 48) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 53) / 2) * (0-(0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 38) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 43) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 48) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 53) / 2) * (0-(0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (48.13232-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-13.78508-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (3.51222-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 48.13232 + (((tickAnim - 35) / 20) * (48.13232-(48.13232)));
            yy = -13.78508 + (((tickAnim - 35) / 20) * (-13.78508-(-13.78508)));
            zz = 3.51222 + (((tickAnim - 35) / 20) * (3.51222-(3.51222)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 48.13232 + (((tickAnim - 55) / 10) * (48.16813-(48.13232)));
            yy = -13.78508 + (((tickAnim - 55) / 10) * (-8.03807-(-13.78508)));
            zz = 3.51222 + (((tickAnim - 55) / 10) * (3.32327-(3.51222)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 48.16813 + (((tickAnim - 65) / 35) * (0-(48.16813)));
            yy = -8.03807 + (((tickAnim - 65) / 35) * (0-(-8.03807)));
            zz = 3.32327 + (((tickAnim - 65) / 35) * (0-(3.32327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (48.27403-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-46.02818-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-7.58699-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 48.27403 + (((tickAnim - 35) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 35) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 35) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 47.77403 + (((tickAnim - 38) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 38) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 38) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 48.27403 + (((tickAnim - 40) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 40) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 40) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 47.77403 + (((tickAnim - 43) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 43) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 43) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 48.27403 + (((tickAnim - 45) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 45) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 45) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 47.77403 + (((tickAnim - 48) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 48) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 48) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 48.27403 + (((tickAnim - 50) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 50) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 50) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 47.77403 + (((tickAnim - 53) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 53) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 53) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 48.27403 + (((tickAnim - 55) / 10) * (35.93929-(48.27403)));
            yy = -46.02818 + (((tickAnim - 55) / 10) * (-35.93643-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 55) / 10) * (-0.24927-(-7.58699)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 35.93929 + (((tickAnim - 65) / 35) * (0-(35.93929)));
            yy = -35.93643 + (((tickAnim - 65) / 35) * (0-(-35.93643)));
            zz = -0.24927 + (((tickAnim - 65) / 35) * (0-(-0.24927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1.11518-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-45.04838-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-10.50705-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.11518 + (((tickAnim - 35) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 35) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 35) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.11518 + (((tickAnim - 38) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 38) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 38) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 1.11518 + (((tickAnim - 40) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 40) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 40) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.11518 + (((tickAnim - 43) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 43) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 43) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 1.11518 + (((tickAnim - 45) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 45) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 45) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.11518 + (((tickAnim - 48) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 48) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 48) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 1.11518 + (((tickAnim - 50) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 50) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 50) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0.11518 + (((tickAnim - 53) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 53) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 53) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 1.11518 + (((tickAnim - 55) / 20) * (-13.42493-(1.11518)));
            yy = -45.04838 + (((tickAnim - 55) / 20) * (-18.55498-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 55) / 20) * (-1.76194-(-10.50705)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -13.42493 + (((tickAnim - 75) / 25) * (0-(-13.42493)));
            yy = -18.55498 + (((tickAnim - 75) / 25) * (0-(-18.55498)));
            zz = -1.76194 + (((tickAnim - 75) / 25) * (0-(-1.76194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.025 + (((tickAnim - 35) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.025 + (((tickAnim - 40) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.025 + (((tickAnim - 45) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -0.025 + (((tickAnim - 50) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = -0.025 + (((tickAnim - 55) / 45) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-26.69377-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-28.83002-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.97259-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -26.69377 + (((tickAnim - 35) / 3) * (-24.19377-(-26.69377)));
            yy = -28.83002 + (((tickAnim - 35) / 3) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 35) / 3) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -24.19377 + (((tickAnim - 38) / 2) * (-26.69377-(-24.19377)));
            yy = -28.83002 + (((tickAnim - 38) / 2) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 38) / 2) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -26.69377 + (((tickAnim - 40) / 3) * (-24.19377-(-26.69377)));
            yy = -28.83002 + (((tickAnim - 40) / 3) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 40) / 3) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -24.19377 + (((tickAnim - 43) / 2) * (-26.69377-(-24.19377)));
            yy = -28.83002 + (((tickAnim - 43) / 2) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 43) / 2) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -26.69377 + (((tickAnim - 45) / 3) * (-24.19377-(-26.69377)));
            yy = -28.83002 + (((tickAnim - 45) / 3) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 45) / 3) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -24.19377 + (((tickAnim - 48) / 2) * (-26.69377-(-24.19377)));
            yy = -28.83002 + (((tickAnim - 48) / 2) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 48) / 2) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -26.69377 + (((tickAnim - 50) / 3) * (-24.19377-(-26.69377)));
            yy = -28.83002 + (((tickAnim - 50) / 3) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 50) / 3) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -24.19377 + (((tickAnim - 53) / 2) * (-26.69377-(-24.19377)));
            yy = -28.83002 + (((tickAnim - 53) / 2) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 53) / 2) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -26.69377 + (((tickAnim - 55) / 10) * (-18.19377-(-26.69377)));
            yy = -28.83002 + (((tickAnim - 55) / 10) * (-28.83002-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 55) / 10) * (5.97259-(5.97259)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -18.19377 + (((tickAnim - 65) / 10) * (-0.51251-(-18.19377)));
            yy = -28.83002 + (((tickAnim - 65) / 10) * (-40.64708-(-28.83002)));
            zz = 5.97259 + (((tickAnim - 65) / 10) * (2.21727-(5.97259)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -0.51251 + (((tickAnim - 75) / 25) * (0-(-0.51251)));
            yy = -40.64708 + (((tickAnim - 75) / 25) * (0-(-40.64708)));
            zz = 2.21727 + (((tickAnim - 75) / 25) * (0-(2.21727)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.15-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.275 + (((tickAnim - 35) / 5) * (0.275-(0.275)));
            yy = -0.15 + (((tickAnim - 35) / 5) * (-0.15-(-0.15)));
            zz = 0.15 + (((tickAnim - 35) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.275 + (((tickAnim - 40) / 5) * (0.275-(0.275)));
            yy = -0.15 + (((tickAnim - 40) / 5) * (-0.15-(-0.15)));
            zz = 0.15 + (((tickAnim - 40) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.275 + (((tickAnim - 45) / 5) * (0.275-(0.275)));
            yy = -0.15 + (((tickAnim - 45) / 5) * (-0.15-(-0.15)));
            zz = 0.15 + (((tickAnim - 45) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0.275 + (((tickAnim - 50) / 5) * (0.275-(0.275)));
            yy = -0.15 + (((tickAnim - 50) / 5) * (-0.15-(-0.15)));
            zz = 0.15 + (((tickAnim - 50) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = 0.275 + (((tickAnim - 55) / 45) * (0-(0.275)));
            yy = -0.15 + (((tickAnim - 55) / 45) * (0-(-0.15)));
            zz = 0.15 + (((tickAnim - 55) / 45) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (7.97836-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-54.99973-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-14.57252-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 7.97836 + (((tickAnim - 35) / 3) * (9.97836-(7.97836)));
            yy = -54.99973 + (((tickAnim - 35) / 3) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 35) / 3) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 9.97836 + (((tickAnim - 38) / 2) * (7.97836-(9.97836)));
            yy = -54.99973 + (((tickAnim - 38) / 2) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 38) / 2) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 7.97836 + (((tickAnim - 40) / 3) * (9.97836-(7.97836)));
            yy = -54.99973 + (((tickAnim - 40) / 3) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 40) / 3) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 9.97836 + (((tickAnim - 43) / 2) * (7.97836-(9.97836)));
            yy = -54.99973 + (((tickAnim - 43) / 2) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 43) / 2) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 7.97836 + (((tickAnim - 45) / 3) * (9.97836-(7.97836)));
            yy = -54.99973 + (((tickAnim - 45) / 3) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 45) / 3) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 9.97836 + (((tickAnim - 48) / 2) * (7.97836-(9.97836)));
            yy = -54.99973 + (((tickAnim - 48) / 2) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 48) / 2) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 7.97836 + (((tickAnim - 50) / 3) * (9.97836-(7.97836)));
            yy = -54.99973 + (((tickAnim - 50) / 3) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 50) / 3) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 9.97836 + (((tickAnim - 53) / 2) * (7.97836-(9.97836)));
            yy = -54.99973 + (((tickAnim - 53) / 2) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 53) / 2) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 7.97836 + (((tickAnim - 55) / 10) * (14.97836-(7.97836)));
            yy = -54.99973 + (((tickAnim - 55) / 10) * (-54.99973-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 55) / 10) * (-14.57252-(-14.57252)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 14.97836 + (((tickAnim - 65) / 10) * (7.8807835521+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(14.97836)));
            yy = -54.99973 + (((tickAnim - 65) / 10) * (-51.10761-(-54.99973)));
            zz = -14.57252 + (((tickAnim - 65) / 10) * (-2.95652-(-14.57252)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 7.8807835521+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 75) / 25) * (0-(7.8807835521+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -51.10761 + (((tickAnim - 75) / 25) * (0-(-51.10761)));
            zz = -2.95652 + (((tickAnim - 75) / 25) * (0-(-2.95652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.2-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.075 + (((tickAnim - 35) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 35) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.075 + (((tickAnim - 40) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 40) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.075 + (((tickAnim - 45) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 45) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -0.075 + (((tickAnim - 50) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 50) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = -0.075 + (((tickAnim - 55) / 20) * (0.43-(-0.075)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0.2 + (((tickAnim - 55) / 20) * (-0.025-(0.2)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0.43 + (((tickAnim - 75) / 25) * (0-(0.43)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = -0.025 + (((tickAnim - 75) / 25) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 12) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 18) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 25) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 40) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 5 + (((tickAnim - 45) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 5 + (((tickAnim - 50) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 55) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWingFeathers4, leftWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), leftWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), leftWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (37.9494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-68.5034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (12.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 37.9494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 23) / 12) * (-42.98842-(37.9494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = -68.5034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 23) / 12) * (-18.85897-(-68.5034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 12.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 23) / 12) * (-77.05626-(12.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -42.98842 + (((tickAnim - 35) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 35) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 35) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -43.07375 + (((tickAnim - 38) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 38) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 38) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -42.98842 + (((tickAnim - 40) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 40) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 40) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -43.07375 + (((tickAnim - 43) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 43) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 43) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -42.98842 + (((tickAnim - 45) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 45) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 45) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -43.07375 + (((tickAnim - 48) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 48) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 48) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -42.98842 + (((tickAnim - 50) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 50) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 50) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -43.07375 + (((tickAnim - 53) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 53) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 53) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -42.98842 + (((tickAnim - 55) / 10) * (-42.85273-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 55) / 10) * (-18.47498-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 55) / 10) * (-78.25354-(-77.05626)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -42.85273 + (((tickAnim - 65) / 13) * (-31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-42.85273)));
            yy = -18.47498 + (((tickAnim - 65) / 13) * (-9.23749-(-18.47498)));
            zz = -78.25354 + (((tickAnim - 65) / 13) * (-39.12677-(-78.25354)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 78) / 12) * (0-(-31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = -9.23749 + (((tickAnim - 78) / 12) * (0-(-9.23749)));
            zz = -39.12677 + (((tickAnim - 78) / 12) * (0-(-39.12677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 50.5 + (((tickAnim - 35) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 50.50541 + (((tickAnim - 38) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 38) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 38) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 50.5 + (((tickAnim - 40) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 50.50541 + (((tickAnim - 43) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 43) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 43) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 50.5 + (((tickAnim - 45) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 50.50541 + (((tickAnim - 48) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 48) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 48) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 50.5 + (((tickAnim - 50) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 50.50541 + (((tickAnim - 53) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 53) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 53) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 50.5 + (((tickAnim - 55) / 10) * (50.5-(50.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 50.5 + (((tickAnim - 65) / 13) * (50.04-(50.5)));
            yy = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 50.04 + (((tickAnim - 78) / 12) * (0-(50.04)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.41314-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-4.7256-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.87217-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 90) {
            xx = 0.41314 + (((tickAnim - 35) / 55) * (0-(0.41314)));
            yy = -4.7256 + (((tickAnim - 35) / 55) * (0-(-4.7256)));
            zz = 5.87217 + (((tickAnim - 35) / 55) * (0-(5.87217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 0) / 35) * (-13.99528-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.31436-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.72154-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -13.99528 + (((tickAnim - 35) / 3) * (-13.98834-(-13.99528)));
            yy = -0.31436 + (((tickAnim - 35) / 3) * (-0.49388-(-0.31436)));
            zz = -1.72154 + (((tickAnim - 35) / 3) * (-2.70532-(-1.72154)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -13.98834 + (((tickAnim - 38) / 2) * (-13.99528-(-13.98834)));
            yy = -0.49388 + (((tickAnim - 38) / 2) * (-0.31436-(-0.49388)));
            zz = -2.70532 + (((tickAnim - 38) / 2) * (-1.72154-(-2.70532)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -13.99528 + (((tickAnim - 40) / 3) * (-13.98834-(-13.99528)));
            yy = -0.31436 + (((tickAnim - 40) / 3) * (-0.49388-(-0.31436)));
            zz = -1.72154 + (((tickAnim - 40) / 3) * (-2.70532-(-1.72154)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -13.98834 + (((tickAnim - 43) / 2) * (-13.99528-(-13.98834)));
            yy = -0.49388 + (((tickAnim - 43) / 2) * (-0.31436-(-0.49388)));
            zz = -2.70532 + (((tickAnim - 43) / 2) * (-1.72154-(-2.70532)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -13.99528 + (((tickAnim - 45) / 3) * (-13.98834-(-13.99528)));
            yy = -0.31436 + (((tickAnim - 45) / 3) * (-0.49388-(-0.31436)));
            zz = -1.72154 + (((tickAnim - 45) / 3) * (-2.70532-(-1.72154)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -13.98834 + (((tickAnim - 48) / 2) * (-13.99528-(-13.98834)));
            yy = -0.49388 + (((tickAnim - 48) / 2) * (-0.31436-(-0.49388)));
            zz = -2.70532 + (((tickAnim - 48) / 2) * (-1.72154-(-2.70532)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -13.99528 + (((tickAnim - 50) / 3) * (-13.98834-(-13.99528)));
            yy = -0.31436 + (((tickAnim - 50) / 3) * (-0.49388-(-0.31436)));
            zz = -1.72154 + (((tickAnim - 50) / 3) * (-2.70532-(-1.72154)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -13.98834 + (((tickAnim - 53) / 2) * (-13.99528-(-13.98834)));
            yy = -0.49388 + (((tickAnim - 53) / 2) * (-0.31436-(-0.49388)));
            zz = -2.70532 + (((tickAnim - 53) / 2) * (-1.72154-(-2.70532)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -13.99528 + (((tickAnim - 55) / 10) * (-14.03861-(-13.99528)));
            yy = -0.31436 + (((tickAnim - 55) / 10) * (-0.31575-(-0.31436)));
            zz = -1.72154 + (((tickAnim - 55) / 10) * (-1.71751-(-1.72154)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = -14.03861 + (((tickAnim - 65) / 25) * (0-(-14.03861)));
            yy = -0.31575 + (((tickAnim - 65) / 25) * (0-(-0.31575)));
            zz = -1.71751 + (((tickAnim - 65) / 25) * (0-(-1.71751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWingFeathers3, rightWingFeathers3.rotateAngleX + (float) Math.toRadians(xx), rightWingFeathers3.rotateAngleY + (float) Math.toRadians(yy), rightWingFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 61.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80 + (((tickAnim - 0) / 35) * (0.07461-(61.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80)));
            yy = 0 + (((tickAnim - 0) / 35) * (-4.98548-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (11.60235-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.07461 + (((tickAnim - 35) / 3) * (0.28691-(0.07461)));
            yy = -4.98548 + (((tickAnim - 35) / 3) * (-4.11635-(-4.98548)));
            zz = 11.60235 + (((tickAnim - 35) / 3) * (8.98466-(11.60235)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.28691 + (((tickAnim - 38) / 2) * (0.07461-(0.28691)));
            yy = -4.11635 + (((tickAnim - 38) / 2) * (-4.98548-(-4.11635)));
            zz = 8.98466 + (((tickAnim - 38) / 2) * (11.60235-(8.98466)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0.07461 + (((tickAnim - 40) / 3) * (0.28691-(0.07461)));
            yy = -4.98548 + (((tickAnim - 40) / 3) * (-4.11635-(-4.98548)));
            zz = 11.60235 + (((tickAnim - 40) / 3) * (8.98466-(11.60235)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.28691 + (((tickAnim - 43) / 2) * (0.07461-(0.28691)));
            yy = -4.11635 + (((tickAnim - 43) / 2) * (-4.98548-(-4.11635)));
            zz = 8.98466 + (((tickAnim - 43) / 2) * (11.60235-(8.98466)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0.07461 + (((tickAnim - 45) / 3) * (0.28691-(0.07461)));
            yy = -4.98548 + (((tickAnim - 45) / 3) * (-4.11635-(-4.98548)));
            zz = 11.60235 + (((tickAnim - 45) / 3) * (8.98466-(11.60235)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.28691 + (((tickAnim - 48) / 2) * (0.07461-(0.28691)));
            yy = -4.11635 + (((tickAnim - 48) / 2) * (-4.98548-(-4.11635)));
            zz = 8.98466 + (((tickAnim - 48) / 2) * (11.60235-(8.98466)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0.07461 + (((tickAnim - 50) / 3) * (0.28691-(0.07461)));
            yy = -4.98548 + (((tickAnim - 50) / 3) * (-4.11635-(-4.98548)));
            zz = 11.60235 + (((tickAnim - 50) / 3) * (8.98466-(11.60235)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0.28691 + (((tickAnim - 53) / 2) * (0.07461-(0.28691)));
            yy = -4.11635 + (((tickAnim - 53) / 2) * (-4.98548-(-4.11635)));
            zz = 8.98466 + (((tickAnim - 53) / 2) * (11.60235-(8.98466)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0.07461 + (((tickAnim - 55) / 10) * (-0.30552-(0.07461)));
            yy = -4.98548 + (((tickAnim - 55) / 10) * (-6.23028-(-4.98548)));
            zz = 11.60235 + (((tickAnim - 55) / 10) * (15.42275-(11.60235)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = -0.30552 + (((tickAnim - 65) / 25) * (0-(-0.30552)));
            yy = -6.23028 + (((tickAnim - 65) / 25) * (0-(-6.23028)));
            zz = 15.42275 + (((tickAnim - 65) / 25) * (0-(15.42275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWingFeathers4, rightWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), rightWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), rightWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(xx), rightTailFan4.rotateAngleY + (float) Math.toRadians(yy), rightTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(xx), leftTailFan4.rotateAngleY + (float) Math.toRadians(yy), leftTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 55) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 5) * (-0.015-(1)));
            zz = 1 + (((tickAnim - 55) / 5) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 60) / 5) * (1-(1)));
            yy = -0.015 + (((tickAnim - 60) / 5) * (1-(-0.015)));
            zz = 1 + (((tickAnim - 60) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 230;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 119) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1 + (((tickAnim - 20) / 99) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1)));
            yy = 0 + (((tickAnim - 20) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 99) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1 + (((tickAnim - 119) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1)));
            yy = 0 + (((tickAnim - 119) / 1) * (42.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*50-(0)));
            zz = 0 + (((tickAnim - 119) / 1) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1 + (((tickAnim - 120) / 10) * (-1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1)));
            yy = 42.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*50 + (((tickAnim - 120) / 10) * (-4.97956-(42.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*50)));
            zz = 0 + (((tickAnim - 120) / 10) * (-4.18307-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 200) {
            xx = -1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1 + (((tickAnim - 130) / 70) * (-1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1-(-1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1)));
            yy = -4.97956 + (((tickAnim - 130) / 70) * (-4.97956-(-4.97956)));
            zz = -4.18307 + (((tickAnim - 130) / 70) * (-3.48221-(-4.18307)));
        }
        else if (tickAnim >= 200 && tickAnim < 213) {
            xx = -1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1 + (((tickAnim - 200) / 13) * (-0.77402-(-1.3181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.1)));
            yy = -4.97956 + (((tickAnim - 200) / 13) * (-2.9601-(-4.97956)));
            zz = -3.48221 + (((tickAnim - 200) / 13) * (-2.4822077591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*3-(-3.48221)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = -0.77402 + (((tickAnim - 213) / 17) * (0-(-0.77402)));
            yy = -2.9601 + (((tickAnim - 213) / 17) * (0-(-2.9601)));
            zz = -2.4822077591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*3 + (((tickAnim - 213) / 17) * (0-(-2.4822077591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 119) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5 + (((tickAnim - 20) / 99) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5)));
            yy = 0 + (((tickAnim - 20) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 99) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5 + (((tickAnim - 119) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5)));
            yy = 0 + (((tickAnim - 119) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 1) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5 + (((tickAnim - 120) / 10) * (-3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (-17.42871-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (-6.17763-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 200) {
            xx = -3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5 + (((tickAnim - 130) / 70) * (-3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5-(-3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5)));
            yy = -17.42871 + (((tickAnim - 130) / 70) * (-17.42871-(-17.42871)));
            zz = -6.17763 + (((tickAnim - 130) / 70) * (-6.17763-(-6.17763)));
        }
        else if (tickAnim >= 200 && tickAnim < 213) {
            xx = -3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5 + (((tickAnim - 200) / 13) * (-1.5224-(-3.0389+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-150))*0.5)));
            yy = -17.42871 + (((tickAnim - 200) / 13) * (-9.68261-(-17.42871)));
            zz = -6.17763 + (((tickAnim - 200) / 13) * (-3.4320154211+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*6-(-6.17763)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = -1.5224 + (((tickAnim - 213) / 17) * (0-(-1.5224)));
            yy = -9.68261 + (((tickAnim - 213) / 17) * (0-(-9.68261)));
            zz = -3.4320154211+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*6 + (((tickAnim - 213) / 17) * (0-(-3.4320154211+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 100) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 10 + (((tickAnim - 125) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 130) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 70) * (-2.48221-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 200) / 15) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = -2.48221 + (((tickAnim - 200) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-9-(-2.48221)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -10.5 + (((tickAnim - 215) / 15) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-9 + (((tickAnim - 215) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = -11.25 + (((tickAnim - 125) / 5) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 130) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 70) * (-2.48221-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 200) / 15) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = -2.48221 + (((tickAnim - 200) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*-12-(-2.48221)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -17.75 + (((tickAnim - 215) / 15) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*-12 + (((tickAnim - 215) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*-12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 200) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5 + (((tickAnim - 20) / 180) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5)));
            yy = 0 + (((tickAnim - 20) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 180) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5 + (((tickAnim - 200) / 15) * (0-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.5)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 200) {
            xx = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2 + (((tickAnim - 20) / 180) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2)));
            yy = 0 + (((tickAnim - 20) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 180) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 230) {
            xx = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2 + (((tickAnim - 200) / 30) * (0-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*2)));
            yy = 0 + (((tickAnim - 200) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 200) {
            xx = 36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2 + (((tickAnim - 20) / 180) * (36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2-(36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2)));
            yy = 0 + (((tickAnim - 20) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 180) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 230) {
            xx = 36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2 + (((tickAnim - 200) / 30) * (0-(36.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2)));
            yy = 0 + (((tickAnim - 200) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(xx), throatPouch3.rotateAngleY + (float) Math.toRadians(yy), throatPouch3.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(xx), throatPouch2.rotateAngleY + (float) Math.toRadians(yy), throatPouch2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 120 && tickAnim < 125) {
            xx = 1 + (((tickAnim - 120) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 5) * (0.0525-(1)));
            zz = 1 + (((tickAnim - 120) / 5) * (1-(1)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 125) / 5) * (1-(1)));
            yy = 0.0525 + (((tickAnim - 125) / 5) * (1-(0.0525)));
            zz = 1 + (((tickAnim - 125) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 120 && tickAnim < 125) {
            xx = 1 + (((tickAnim - 120) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 5) * (0.0525-(1)));
            zz = 1 + (((tickAnim - 120) / 5) * (1-(1)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 125) / 5) * (1-(1)));
            yy = 0.0525 + (((tickAnim - 125) / 5) * (1-(0.0525)));
            zz = 1 + (((tickAnim - 125) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 0) / 200) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 200) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15 + (((tickAnim - 215) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 213) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(xx), headFeathers.rotateAngleY + (float) Math.toRadians(yy), headFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-25-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 213) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-25 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 213) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-280))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-25-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-15-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 213) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-25 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-15 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-25-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-15-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 213) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-25 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-15 + (((tickAnim - 213) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 111;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 15) * (21.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.25 + (((tickAnim - 15) / 20) * (21.20817-(21.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (3.47554-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-0.20984-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 21.20817 + (((tickAnim - 35) / 7) * (9.70817-(21.20817)));
            yy = 3.47554 + (((tickAnim - 35) / 7) * (3.47554-(3.47554)));
            zz = -0.20984 + (((tickAnim - 35) / 7) * (-0.20984-(-0.20984)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 9.70817 + (((tickAnim - 42) / 17) * (21.20817-(9.70817)));
            yy = 3.47554 + (((tickAnim - 42) / 17) * (3.47554-(3.47554)));
            zz = -0.20984 + (((tickAnim - 42) / 17) * (-0.20984-(-0.20984)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 21.20817 + (((tickAnim - 59) / 44) * (21.18161-(21.20817)));
            yy = 3.47554 + (((tickAnim - 59) / 44) * (1.56856-(3.47554)));
            zz = -0.20984 + (((tickAnim - 59) / 44) * (-0.8133-(-0.20984)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 21.18161 + (((tickAnim - 103) / 9) * (247.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(21.18161)));
            yy = 1.56856 + (((tickAnim - 103) / 9) * (0-(1.56856)));
            zz = -0.8133 + (((tickAnim - 103) / 9) * (0-(-0.8133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 15) / 88) * (0-(0)));
            yy = -2.3 + (((tickAnim - 15) / 88) * (-2.3-(-2.3)));
            zz = 2.575 + (((tickAnim - 15) / 88) * (2.575-(2.575)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = -2.3 + (((tickAnim - 103) / 9) * (0-(-2.3)));
            zz = 2.575 + (((tickAnim - 103) / 9) * (0-(2.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-10.49995-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.73649-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1.00999-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -10.49995 + (((tickAnim - 35) / 7) * (-20.24995-(-10.49995)));
            yy = -0.73649 + (((tickAnim - 35) / 7) * (-0.33015-(-0.73649)));
            zz = 1.00999 + (((tickAnim - 35) / 7) * (0.45275-(1.00999)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -20.24995 + (((tickAnim - 42) / 7) * (-10.49995-(-20.24995)));
            yy = -0.33015 + (((tickAnim - 42) / 7) * (-0.73649-(-0.33015)));
            zz = 0.45275 + (((tickAnim - 42) / 7) * (1.00999-(0.45275)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -10.49995 + (((tickAnim - 49) / 10) * (-10.49995-(-10.49995)));
            yy = -0.73649 + (((tickAnim - 49) / 10) * (0.73649-(-0.73649)));
            zz = 1.00999 + (((tickAnim - 49) / 10) * (-1.00999-(1.00999)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -10.49995 + (((tickAnim - 59) / 44) * (-10.49995-(-10.49995)));
            yy = 0.73649 + (((tickAnim - 59) / 44) * (-0.73649-(0.73649)));
            zz = -1.00999 + (((tickAnim - 59) / 44) * (1.00999-(-1.00999)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -10.49995 + (((tickAnim - 103) / 9) * (0-(-10.49995)));
            yy = -0.73649 + (((tickAnim - 103) / 9) * (0-(-0.73649)));
            zz = 1.00999 + (((tickAnim - 103) / 9) * (0-(1.00999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 15) * (1.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (9.25399-(1.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 15) / 20) * (-2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (-0.18321-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 9.25399 + (((tickAnim - 35) / 7) * (-8.5-(9.25399)));
            yy = -2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 35) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(-2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
            zz = -0.18321 + (((tickAnim - 35) / 7) * (0-(-0.18321)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = -8.5 + (((tickAnim - 42) / 17) * (-6.74601-(-8.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 42) / 17) * (2.49328-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
            zz = 0 + (((tickAnim - 42) / 17) * (0.18321-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -6.74601 + (((tickAnim - 59) / 44) * (-6.74601-(-6.74601)));
            yy = 2.49328 + (((tickAnim - 59) / 44) * (-2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(2.49328)));
            zz = 0.18321 + (((tickAnim - 59) / 44) * (0.18321-(0.18321)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -6.74601 + (((tickAnim - 103) / 9) * (0-(-6.74601)));
            yy = -2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 103) / 9) * (0-(-2.4932819462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
            zz = 0.18321 + (((tickAnim - 103) / 9) * (0-(0.18321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.59632-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-7.52151-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (8.55326-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -0.59632 + (((tickAnim - 35) / 7) * (263.3287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-0.59632)));
            yy = -7.52151 + (((tickAnim - 35) / 7) * (0.25936-(-7.52151)));
            zz = 8.55326 + (((tickAnim - 35) / 7) * (-0.29494-(8.55326)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 263.3287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 42) / 17) * (-0.59632-(263.3287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0.25936 + (((tickAnim - 42) / 17) * (7.52151-(0.25936)));
            zz = -0.29494 + (((tickAnim - 42) / 17) * (-8.55326-(-0.29494)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -0.59632 + (((tickAnim - 59) / 44) * (-0.00671-(-0.59632)));
            yy = 7.52151 + (((tickAnim - 59) / 44) * (-0.80345-(7.52151)));
            zz = -8.55326 + (((tickAnim - 59) / 44) * (0.45762-(-8.55326)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -0.00671 + (((tickAnim - 103) / 9) * (0-(-0.00671)));
            yy = -0.80345 + (((tickAnim - 103) / 9) * (0-(-0.80345)));
            zz = 0.45762 + (((tickAnim - 103) / 9) * (0-(0.45762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-64-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -64 + (((tickAnim - 15) / 20) * (-64-(-64)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -64 + (((tickAnim - 35) / 7) * (-253.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(-64)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = -253.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 42) / 17) * (-64-(-253.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -64 + (((tickAnim - 59) / 44) * (-64-(-64)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -64 + (((tickAnim - 103) / 9) * (0-(-64)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -1.425 + (((tickAnim - 15) / 20) * (-1.425-(-1.425)));
            zz = 1.05 + (((tickAnim - 15) / 20) * (1.05-(1.05)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = -1.425 + (((tickAnim - 35) / 7) * (0-(-1.425)));
            zz = 1.05 + (((tickAnim - 35) / 7) * (0-(1.05)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 17) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (1.05-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            yy = -1.425 + (((tickAnim - 59) / 44) * (-1.425-(-1.425)));
            zz = 1.05 + (((tickAnim - 59) / 44) * (1.05-(1.05)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = -1.425 + (((tickAnim - 103) / 9) * (0-(-1.425)));
            zz = 1.05 + (((tickAnim - 103) / 9) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 27 + (((tickAnim - 15) / 20) * (27-(27)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 27 + (((tickAnim - 35) / 7) * (0-(27)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 42) / 17) * (27-(0)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 27 + (((tickAnim - 59) / 44) * (27-(27)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 27 + (((tickAnim - 103) / 9) * (0-(27)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = -22.5 + (((tickAnim - 42) / 17) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-5.25-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -18.25 + (((tickAnim - 38) / 4) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = -5.25 + (((tickAnim - 38) / 4) * (0-(-5.25)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 28.5 + (((tickAnim - 15) / 20) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 28.5 + (((tickAnim - 35) / 3) * (38.75-(28.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 38.75 + (((tickAnim - 38) / 4) * (0-(38.75)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 42) / 17) * (28.5-(0)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 28.5 + (((tickAnim - 59) / 44) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 28.5 + (((tickAnim - 103) / 9) * (0-(28.5)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49 + (((tickAnim - 15) / 20) * (49-(49)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 49 + (((tickAnim - 35) / 7) * (0-(49)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (49-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 49 + (((tickAnim - 51) / 8) * (49-(49)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 49 + (((tickAnim - 59) / 44) * (49-(49)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 49 + (((tickAnim - 103) / 9) * (0-(49)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(xx), headFeathers.rotateAngleY + (float) Math.toRadians(yy), headFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (53-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 53 + (((tickAnim - 15) / 20) * (53-(53)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 53 + (((tickAnim - 35) / 7) * (0-(53)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (53-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 53 + (((tickAnim - 51) / 8) * (53-(53)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 53 + (((tickAnim - 59) / 44) * (53-(53)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 53 + (((tickAnim - 103) / 9) * (0-(53)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 46.75 + (((tickAnim - 15) / 20) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 46.75 + (((tickAnim - 35) / 7) * (0-(46.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (46.75-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 46.75 + (((tickAnim - 51) / 8) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 46.75 + (((tickAnim - 59) / 44) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 46.75 + (((tickAnim - 103) / 9) * (0-(46.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(xx), neckFeathers5.rotateAngleY + (float) Math.toRadians(yy), neckFeathers5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 44.5 + (((tickAnim - 15) / 20) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 44.5 + (((tickAnim - 35) / 7) * (0-(44.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (44.5-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 44.5 + (((tickAnim - 51) / 8) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 44.5 + (((tickAnim - 59) / 44) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 44.5 + (((tickAnim - 103) / 9) * (0-(44.5)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (126.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 126.75 + (((tickAnim - 15) / 20) * (126.75-(126.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 126.75 + (((tickAnim - 35) / 7) * (0-(126.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (126.75-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 126.75 + (((tickAnim - 51) / 8) * (126.75-(126.75)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 126.75 + (((tickAnim - 59) / 44) * (126.75-(126.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 126.75 + (((tickAnim - 103) / 9) * (0-(126.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(xx), neckFeathers3.rotateAngleY + (float) Math.toRadians(yy), neckFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.84455-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-24.25601-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.84455 + (((tickAnim - 15) / 20) * (-25.84455-(-25.84455)));
            yy = -24.25601 + (((tickAnim - 15) / 20) * (-24.25601-(-24.25601)));
            zz = 83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 15) / 20) * (83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -25.84455 + (((tickAnim - 35) / 7) * (-3.87728-(-25.84455)));
            yy = -24.25601 + (((tickAnim - 35) / 7) * (11.2749-(-24.25601)));
            zz = 83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 35) / 7) * (27.89981-(83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -3.87728 + (((tickAnim - 42) / 7) * (-25.84455-(-3.87728)));
            yy = 11.2749 + (((tickAnim - 42) / 7) * (-24.25601-(11.2749)));
            zz = 27.89981 + (((tickAnim - 42) / 7) * (83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(27.89981)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -25.84455 + (((tickAnim - 49) / 10) * (-25.84455-(-25.84455)));
            yy = -24.25601 + (((tickAnim - 49) / 10) * (-24.25601-(-24.25601)));
            zz = 83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 49) / 10) * (83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -25.84455 + (((tickAnim - 59) / 44) * (-25.84455-(-25.84455)));
            yy = -24.25601 + (((tickAnim - 59) / 44) * (-24.25601-(-24.25601)));
            zz = 83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 59) / 44) * (83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -25.84455 + (((tickAnim - 103) / 9) * (0-(-25.84455)));
            yy = -24.25601 + (((tickAnim - 103) / 9) * (0-(-24.25601)));
            zz = 83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 103) / 9) * (0-(83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 15) / 20) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 15.75 + (((tickAnim - 35) / 7) * (0-(15.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (15.75-(0)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 15.75 + (((tickAnim - 49) / 10) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 15.75 + (((tickAnim - 59) / 44) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 15.75 + (((tickAnim - 103) / 9) * (0-(15.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -47.25 + (((tickAnim - 15) / 20) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -47.25 + (((tickAnim - 35) / 7) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -47.25 + (((tickAnim - 49) / 10) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -47.25 + (((tickAnim - 59) / 44) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -47.25 + (((tickAnim - 103) / 9) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWingFeathers3, leftWingFeathers3.rotateAngleX + (float) Math.toRadians(xx), leftWingFeathers3.rotateAngleY + (float) Math.toRadians(yy), leftWingFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 28 + (((tickAnim - 15) / 20) * (28-(28)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 28 + (((tickAnim - 35) / 14) * (0-(28)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (28-(0)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 28 + (((tickAnim - 103) / 9) * (0-(28)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWingFeathers4, leftWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), leftWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), leftWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.84455-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (24.25601-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.84455 + (((tickAnim - 15) / 20) * (-25.84455-(-25.84455)));
            yy = 24.25601 + (((tickAnim - 15) / 20) * (24.25601-(24.25601)));
            zz = -83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2 + (((tickAnim - 15) / 20) * (-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2-(-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -25.84455 + (((tickAnim - 35) / 7) * (-3.87728-(-25.84455)));
            yy = 24.25601 + (((tickAnim - 35) / 7) * (-11.2749-(24.25601)));
            zz = -83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2 + (((tickAnim - 35) / 7) * (-27.89981-(-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -3.87728 + (((tickAnim - 42) / 7) * (-25.84455-(-3.87728)));
            yy = -11.2749 + (((tickAnim - 42) / 7) * (24.25601-(-11.2749)));
            zz = -27.89981 + (((tickAnim - 42) / 7) * (-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2-(-27.89981)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -25.84455 + (((tickAnim - 49) / 10) * (-25.84455-(-25.84455)));
            yy = 24.25601 + (((tickAnim - 49) / 10) * (24.25601-(24.25601)));
            zz = -83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2 + (((tickAnim - 49) / 10) * (-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2-(-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -25.84455 + (((tickAnim - 59) / 44) * (-25.84455-(-25.84455)));
            yy = 24.25601 + (((tickAnim - 59) / 44) * (24.25601-(24.25601)));
            zz = -83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2 + (((tickAnim - 59) / 44) * (-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2-(-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -25.84455 + (((tickAnim - 103) / 9) * (0-(-25.84455)));
            yy = 24.25601 + (((tickAnim - 103) / 9) * (0-(24.25601)));
            zz = -83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2 + (((tickAnim - 103) / 9) * (0-(-83.5253210125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 15) / 20) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 15.75 + (((tickAnim - 35) / 7) * (0-(15.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (15.75-(0)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 15.75 + (((tickAnim - 49) / 10) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 15.75 + (((tickAnim - 59) / 44) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 15.75 + (((tickAnim - 103) / 9) * (0-(15.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -46.5 + (((tickAnim - 15) / 20) * (-46.5-(-46.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -46.5 + (((tickAnim - 35) / 7) * (0-(-46.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -46.5 + (((tickAnim - 49) / 10) * (-46.5-(-46.5)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -46.5 + (((tickAnim - 59) / 44) * (-46.5-(-46.5)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -46.5 + (((tickAnim - 103) / 9) * (0-(-46.5)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWingFeathers3, rightWingFeathers3.rotateAngleX + (float) Math.toRadians(xx), rightWingFeathers3.rotateAngleY + (float) Math.toRadians(yy), rightWingFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 28 + (((tickAnim - 15) / 20) * (28-(28)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 28 + (((tickAnim - 35) / 14) * (0-(28)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (28-(0)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 28 + (((tickAnim - 103) / 9) * (0-(28)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWingFeathers4, rightWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), rightWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), rightWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 15) * (-21-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -21 + (((tickAnim - 35) / 7) * (8-(-21)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 8 + (((tickAnim - 42) / 9) * (-14.25-(8)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -14.25 + (((tickAnim - 51) / 8) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -14.25 + (((tickAnim - 59) / 44) * (-9-(-14.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -9 + (((tickAnim - 103) / 9) * (0-(-9)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathersUnder2, bodyFeathersUnder2.rotateAngleX + (float) Math.toRadians(xx), bodyFeathersUnder2.rotateAngleY + (float) Math.toRadians(yy), bodyFeathersUnder2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 15) / 20) * (18.75-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 15) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 18.75 + (((tickAnim - 35) / 7) * (0-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 35) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (18.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 42) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 18.75 + (((tickAnim - 49) / 10) * (18.75-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 49) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 18.75 + (((tickAnim - 59) / 44) * (18.75-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 18.75 + (((tickAnim - 103) / 9) * (0-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*1)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers3.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 30.25 + (((tickAnim - 15) / 20) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 30.25 + (((tickAnim - 35) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (30.25-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 30.25 + (((tickAnim - 51) / 8) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 30.25 + (((tickAnim - 59) / 44) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 30.25 + (((tickAnim - 103) / 9) * (0-(30.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers4.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -49.75 + (((tickAnim - 15) / 20) * (-49.75-(-49.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -49.75 + (((tickAnim - 35) / 7) * (0-(-49.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (-49.75-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -49.75 + (((tickAnim - 51) / 8) * (-49.75-(-49.75)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -49.75 + (((tickAnim - 59) / 44) * (-49.75-(-49.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -49.75 + (((tickAnim - 103) / 9) * (0-(-49.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathersUnder, bodyFeathersUnder.rotateAngleX + (float) Math.toRadians(xx), bodyFeathersUnder.rotateAngleY + (float) Math.toRadians(yy), bodyFeathersUnder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 15) * (21.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.5 + (((tickAnim - 15) / 20) * (21.5-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1 + (((tickAnim - 15) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 21.5 + (((tickAnim - 35) / 7) * (0-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1 + (((tickAnim - 35) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (21.5-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1 + (((tickAnim - 42) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 21.5 + (((tickAnim - 49) / 10) * (21.5-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1 + (((tickAnim - 49) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 21.5 + (((tickAnim - 59) / 44) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 21.5 + (((tickAnim - 103) / 9) * (0-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*1)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers2.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30 + (((tickAnim - 0) / 15) * (-4.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20-(-14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -4.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20 + (((tickAnim - 15) / 18) * (18.5-(-4.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 15) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 18.5 + (((tickAnim - 33) / 11) * (27.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-20-(18.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 33) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = 27.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-20 + (((tickAnim - 44) / 15) * (18.5-(27.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 44) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 44) / 15) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 18.5 + (((tickAnim - 59) / 44) * (18.5-(18.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 18.5 + (((tickAnim - 103) / 9) * (0-(18.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-30.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -30.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 15) / 44) * (-3.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-50-(-30.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 15) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -3.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-50 + (((tickAnim - 59) / 44) * (11.5-(-3.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 11.5 + (((tickAnim - 103) / 9) * (-247.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(11.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 15) * (-49.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -49.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 15) / 44) * (20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-60-(-49.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2 + (((tickAnim - 15) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-60 + (((tickAnim - 59) / 44) * (20.75-(20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-60)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 20.75 + (((tickAnim - 103) / 9) * (-179.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-350-(20.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*2)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 15) * (-127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 15) / 44) * (34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100-(-127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 15) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100 + (((tickAnim - 59) / 44) * (34.25-(34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 34.25 + (((tickAnim - 103) / 9) * (0-(34.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(xx), rightTailFan4.rotateAngleY + (float) Math.toRadians(yy), rightTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 15) * (-127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 15) / 44) * (34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100-(-127.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 15) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100 + (((tickAnim - 59) / 44) * (34.25-(34.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-100)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 34.25 + (((tickAnim - 103) / 9) * (0-(34.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-300))*2)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(xx), leftTailFan4.rotateAngleY + (float) Math.toRadians(yy), leftTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 26.75 + (((tickAnim - 15) / 20) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 26.75 + (((tickAnim - 35) / 7) * (0-(26.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (26.75-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 26.75 + (((tickAnim - 50) / 9) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 26.75 + (((tickAnim - 59) / 44) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 26.75 + (((tickAnim - 103) / 9) * (0-(26.75)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(xx), tailFeathers.rotateAngleY + (float) Math.toRadians(yy), tailFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 15) * (-51.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -51.25 + (((tickAnim - 15) / 20) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -51.25 + (((tickAnim - 35) / 7) * (-39-(-51.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = -39 + (((tickAnim - 42) / 17) * (-51.25-(-39)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -51.25 + (((tickAnim - 59) / 44) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -51.25 + (((tickAnim - 103) / 9) * (-49.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-51.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 35.25 + (((tickAnim - 15) / 44) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 35.25 + (((tickAnim - 59) / 44) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 35.25 + (((tickAnim - 103) / 9) * (0-(35.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            yy = -1.125 + (((tickAnim - 15) / 44) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            yy = -1.125 + (((tickAnim - 59) / 44) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = -1.125 + (((tickAnim - 103) / 9) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -6.25 + (((tickAnim - 15) / 44) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -6.25 + (((tickAnim - 59) / 44) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -6.25 + (((tickAnim - 103) / 9) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 15) * (-51.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -51.25 + (((tickAnim - 15) / 20) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -51.25 + (((tickAnim - 35) / 7) * (-39-(-51.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = -39 + (((tickAnim - 42) / 17) * (-51.25-(-39)));
            yy = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -51.25 + (((tickAnim - 59) / 44) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -51.25 + (((tickAnim - 103) / 9) * (-49.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-51.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 35.25 + (((tickAnim - 15) / 44) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 35.25 + (((tickAnim - 59) / 44) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 35.25 + (((tickAnim - 103) / 9) * (0-(35.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            yy = -1.125 + (((tickAnim - 15) / 44) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            yy = -1.125 + (((tickAnim - 59) / 44) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = -1.125 + (((tickAnim - 103) / 9) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 59) {
            xx = -6.25 + (((tickAnim - 15) / 44) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 44) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = -6.25 + (((tickAnim - 59) / 44) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 59) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = -6.25 + (((tickAnim - 103) / 9) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 15) * (21.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.5 + (((tickAnim - 15) / 20) * (21.5-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1 + (((tickAnim - 15) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 21.5 + (((tickAnim - 35) / 7) * (0-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1 + (((tickAnim - 35) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (21.5-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1 + (((tickAnim - 42) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 21.5 + (((tickAnim - 49) / 10) * (21.5-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1 + (((tickAnim - 49) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 103) {
            xx = 21.5 + (((tickAnim - 59) / 44) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 59) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1-(0)));
            zz = 0 + (((tickAnim - 59) / 44) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 21.5 + (((tickAnim - 103) / 9) * (0-(21.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1 + (((tickAnim - 103) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*1)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 30.25 + (((tickAnim - 23) / 15) * (-18.75-(30.25)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 38) / 12) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.75 + (((tickAnim - 23) / 7) * (8.5-(19.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 8.5 + (((tickAnim - 30) / 8) * (-3.25-(8.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 38) / 12) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (0.4-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.4 + (((tickAnim - 30) / 20) * (0-(0.4)));
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




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-41.4-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -41.4 + (((tickAnim - 30) / 8) * (17-(-41.4)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 38) / 12) * (0-(17)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (-0.095-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.095 + (((tickAnim - 30) / 8) * (-0.775-(-0.095)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.775 + (((tickAnim - 38) / 12) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 53.5 + (((tickAnim - 9) / 14) * (72-(53.5)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 72 + (((tickAnim - 23) / 7) * (77.5-(72)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 77.5 + (((tickAnim - 30) / 8) * (4.25-(77.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 38) / 12) * (0-(4.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.75-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = -0.75 + (((tickAnim - 9) / 14) * (-0.85-(-0.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (1.875-(0)));
            zz = -0.85 + (((tickAnim - 23) / 7) * (-0.875-(-0.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 1.875 + (((tickAnim - 30) / 8) * (0.675-(1.875)));
            zz = -0.875 + (((tickAnim - 30) / 8) * (0-(-0.875)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 38) / 12) * (0-(0.675)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-62.81-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -62.81 + (((tickAnim - 9) / 14) * (31.75-(-62.81)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 31.75 + (((tickAnim - 23) / 15) * (0-(31.75)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 9) / 14) * (0.15-(-0.6)));
            zz = 0 + (((tickAnim - 9) / 14) * (0.15-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 23) / 15) * (0-(0.15)));
            zz = 0.15 + (((tickAnim - 23) / 15) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -15.5 + (((tickAnim - 18) / 10) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 28) / 12) * (3.85-(-15.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.85 + (((tickAnim - 40) / 10) * (0-(3.85)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -9.225 + (((tickAnim - 18) / 10) * (-9.225-(-9.225)));
            zz = 7.175 + (((tickAnim - 18) / 10) * (7.175-(7.175)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -9.225 + (((tickAnim - 28) / 12) * (-2.185-(-9.225)));
            zz = 7.175 + (((tickAnim - 28) / 12) * (3.31-(7.175)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -2.185 + (((tickAnim - 40) / 10) * (0-(-2.185)));
            zz = 3.31 + (((tickAnim - 40) / 10) * (0-(3.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 9.75 + (((tickAnim - 18) / 10) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 28) / 22) * (0-(9.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10.75 + (((tickAnim - 18) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 28) / 22) * (0-(10.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 18) / 10) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -12.25 + (((tickAnim - 28) / 12) * (-18.15-(-12.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -18.15 + (((tickAnim - 40) / 10) * (0-(-18.15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -34.5 + (((tickAnim - 18) / 10) * (-34.5-(-34.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -34.5 + (((tickAnim - 28) / 12) * (-27.17-(-34.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -27.17 + (((tickAnim - 40) / 10) * (0-(-27.17)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 18) / 10) * (-0.45-(-0.45)));
            zz = 0.6 + (((tickAnim - 18) / 10) * (0.6-(0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.45 + (((tickAnim - 28) / 22) * (0-(-0.45)));
            zz = 0.6 + (((tickAnim - 28) / 22) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 42.5 + (((tickAnim - 18) / 10) * (42.5-(42.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 28) / 22) * (0-(42.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 10) * (0.3-(0.3)));
            zz = -0.15 + (((tickAnim - 18) / 10) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 22) * (0-(0.3)));
            zz = -0.15 + (((tickAnim - 28) / 22) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 19) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 19) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 19) / 3) * (0.09-(1)));
            zz = 1 + (((tickAnim - 19) / 3) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 22) / 2) * (1-(1)));
            yy = 0.09 + (((tickAnim - 22) / 2) * (1-(0.09)));
            zz = 1 + (((tickAnim - 22) / 2) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 24) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 24) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 19) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 19) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 19) / 3) * (0.09-(1)));
            zz = 1 + (((tickAnim - 19) / 3) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 22) / 2) * (1-(1)));
            yy = 0.09 + (((tickAnim - 22) / 2) * (1-(0.09)));
            zz = 1 + (((tickAnim - 22) / 2) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 24) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 24) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
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
        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(xx), neckFeathers4.rotateAngleY + (float) Math.toRadians(yy), neckFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
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
        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(xx), neckFeathers2.rotateAngleY + (float) Math.toRadians(yy), neckFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.2024-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.15877-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (41.01981-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -7.2024 + (((tickAnim - 18) / 10) * (-7.2024-(-7.2024)));
            yy = -4.15877 + (((tickAnim - 18) / 10) * (-4.15877-(-4.15877)));
            zz = 41.01981 + (((tickAnim - 18) / 10) * (41.01981-(41.01981)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7.2024 + (((tickAnim - 28) / 22) * (0-(-7.2024)));
            yy = -4.15877 + (((tickAnim - 28) / 22) * (0-(-4.15877)));
            zz = 41.01981 + (((tickAnim - 28) / 22) * (0-(41.01981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (14.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 14.5 + (((tickAnim - 18) / 10) * (14.5-(14.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 14.5 + (((tickAnim - 28) / 22) * (0-(14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (39-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 39 + (((tickAnim - 18) / 10) * (39-(39)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 39 + (((tickAnim - 28) / 22) * (0-(39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWingFeathers4, leftWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), leftWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), leftWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.2024-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.15877-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-41.01981-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -7.2024 + (((tickAnim - 18) / 10) * (-7.2024-(-7.2024)));
            yy = 4.15877 + (((tickAnim - 18) / 10) * (4.15877-(4.15877)));
            zz = -41.01981 + (((tickAnim - 18) / 10) * (-41.01981-(-41.01981)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7.2024 + (((tickAnim - 28) / 22) * (0-(-7.2024)));
            yy = 4.15877 + (((tickAnim - 28) / 22) * (0-(4.15877)));
            zz = -41.01981 + (((tickAnim - 28) / 22) * (0-(-41.01981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -14.5 + (((tickAnim - 18) / 10) * (-14.5-(-14.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -14.5 + (((tickAnim - 28) / 22) * (0-(-14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-39-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -39 + (((tickAnim - 18) / 10) * (-39-(-39)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -39 + (((tickAnim - 28) / 22) * (0-(-39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWingFeathers4, rightWingFeathers4.rotateAngleX + (float) Math.toRadians(xx), rightWingFeathers4.rotateAngleY + (float) Math.toRadians(yy), rightWingFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 5.5 + (((tickAnim - 18) / 10) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 28) / 22) * (0-(5.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers3.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 18) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 28) / 22) * (0-(9.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers4.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 16.25 + (((tickAnim - 18) / 10) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 28) / 22) * (0-(16.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers2.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -5.5 + (((tickAnim - 18) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 28) / 22) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -2.25 + (((tickAnim - 18) / 10) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -2.25 + (((tickAnim - 28) / 12) * (-11.04-(-2.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.04 + (((tickAnim - 40) / 10) * (0-(-11.04)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (23.75-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 23.75 + (((tickAnim - 18) / 10) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 23.75 + (((tickAnim - 28) / 12) * (0.71-(23.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.71 + (((tickAnim - 40) / 10) * (0-(0.71)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10.5 + (((tickAnim - 18) / 10) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 28) / 22) * (0-(10.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (19.5-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 18) / 10) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 28) / 22) * (0-(19.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(xx), rightTailFan4.rotateAngleY + (float) Math.toRadians(yy), rightTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (19.5-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 18) / 10) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 28) / 22) * (0-(19.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(xx), leftTailFan4.rotateAngleY + (float) Math.toRadians(yy), leftTailFan4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 18) / 10) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 28) / 22) * (0-(11.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(xx), tailFeathers.rotateAngleY + (float) Math.toRadians(yy), tailFeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-53.19898-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.07775-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.668-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -53.19898 + (((tickAnim - 18) / 10) * (-53.19898-(-53.19898)));
            yy = -11.07775 + (((tickAnim - 18) / 10) * (-11.07775-(-11.07775)));
            zz = 4.668 + (((tickAnim - 18) / 10) * (4.668-(4.668)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -53.19898 + (((tickAnim - 28) / 22) * (0-(-53.19898)));
            yy = -11.07775 + (((tickAnim - 28) / 22) * (0-(-11.07775)));
            zz = 4.668 + (((tickAnim - 28) / 22) * (0-(4.668)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (37.39-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 37.39 + (((tickAnim - 9) / 9) * (48-(37.39)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 48 + (((tickAnim - 18) / 10) * (48-(48)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 28) / 22) * (0-(48)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -1.525 + (((tickAnim - 18) / 10) * (-1.525-(-1.525)));
            zz = 0.425 + (((tickAnim - 18) / 10) * (0.425-(0.425)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.525 + (((tickAnim - 28) / 22) * (0-(-1.525)));
            zz = 0.425 + (((tickAnim - 28) / 22) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-48.67-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -48.67 + (((tickAnim - 9) / 9) * (-54.25-(-48.67)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -54.25 + (((tickAnim - 18) / 10) * (-54.25-(-54.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -54.25 + (((tickAnim - 28) / 12) * (-30.29-(-54.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30.29 + (((tickAnim - 40) / 10) * (0-(-30.29)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (48.21766-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.03113-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.48074-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 48.21766 + (((tickAnim - 9) / 9) * (73.43827-(48.21766)));
            yy = 4.03113 + (((tickAnim - 9) / 9) * (7.69579-(4.03113)));
            zz = -0.48074 + (((tickAnim - 9) / 9) * (-0.91778-(-0.48074)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 73.43827 + (((tickAnim - 18) / 10) * (73.43827-(73.43827)));
            yy = 7.69579 + (((tickAnim - 18) / 10) * (7.69579-(7.69579)));
            zz = -0.91778 + (((tickAnim - 18) / 10) * (-0.91778-(-0.91778)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 73.43827 + (((tickAnim - 28) / 12) * (28.10087-(73.43827)));
            yy = 7.69579 + (((tickAnim - 28) / 12) * (3.05873-(7.69579)));
            zz = -0.91778 + (((tickAnim - 28) / 12) * (2.20849-(-0.91778)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.10087 + (((tickAnim - 40) / 10) * (0-(28.10087)));
            yy = 3.05873 + (((tickAnim - 40) / 10) * (0-(3.05873)));
            zz = 2.20849 + (((tickAnim - 40) / 10) * (0-(2.20849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-53.19898-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (11.07775-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-4.668-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -53.19898 + (((tickAnim - 18) / 10) * (-53.19898-(-53.19898)));
            yy = 11.07775 + (((tickAnim - 18) / 10) * (11.07775-(11.07775)));
            zz = -4.668 + (((tickAnim - 18) / 10) * (-4.668-(-4.668)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -53.19898 + (((tickAnim - 28) / 22) * (0-(-53.19898)));
            yy = 11.07775 + (((tickAnim - 28) / 22) * (0-(11.07775)));
            zz = -4.668 + (((tickAnim - 28) / 22) * (0-(-4.668)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (37.39-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 37.39 + (((tickAnim - 9) / 9) * (48-(37.39)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 48 + (((tickAnim - 18) / 10) * (48-(48)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 28) / 22) * (0-(48)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -1.525 + (((tickAnim - 18) / 10) * (-1.525-(-1.525)));
            zz = 0.425 + (((tickAnim - 18) / 10) * (0.425-(0.425)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.525 + (((tickAnim - 28) / 22) * (0-(-1.525)));
            zz = 0.425 + (((tickAnim - 28) / 22) * (0-(0.425)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (-48.67-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -48.67 + (((tickAnim - 9) / 9) * (-54.25-(-48.67)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -54.25 + (((tickAnim - 18) / 10) * (-54.25-(-54.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -54.25 + (((tickAnim - 28) / 12) * (-30.29-(-54.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30.29 + (((tickAnim - 40) / 10) * (0-(-30.29)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (48.21766-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-4.03113-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.48074-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 48.21766 + (((tickAnim - 9) / 9) * (73.43827-(48.21766)));
            yy = -4.03113 + (((tickAnim - 9) / 9) * (-7.69579-(-4.03113)));
            zz = 0.48074 + (((tickAnim - 9) / 9) * (0.91778-(0.48074)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 73.43827 + (((tickAnim - 18) / 10) * (73.43827-(73.43827)));
            yy = -7.69579 + (((tickAnim - 18) / 10) * (-7.69579-(-7.69579)));
            zz = 0.91778 + (((tickAnim - 18) / 10) * (0.91778-(0.91778)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 73.43827 + (((tickAnim - 28) / 12) * (28.10087-(73.43827)));
            yy = -7.69579 + (((tickAnim - 28) / 12) * (-3.05873-(-7.69579)));
            zz = 0.91778 + (((tickAnim - 28) / 12) * (-2.20849-(0.91778)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.10087 + (((tickAnim - 40) / 10) * (0-(28.10087)));
            yy = -3.05873 + (((tickAnim - 40) / 10) * (0-(-3.05873)));
            zz = -2.20849 + (((tickAnim - 40) / 10) * (0-(-2.20849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 12.25 + (((tickAnim - 18) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 28) / 22) * (0-(12.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(xx), bodyFeathers.rotateAngleY + (float) Math.toRadians(yy), bodyFeathers.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (50.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 50.75 + (((tickAnim - 10) / 10) * (0-(50.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.8-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.475 + (((tickAnim - 10) / 10) * (0-(-0.475)));
            zz = -0.8 + (((tickAnim - 10) / 10) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34 + (((tickAnim - 10) / 3) * (55.42-(34)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 55.42 + (((tickAnim - 13) / 7) * (0-(55.42)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 19.75 + (((tickAnim - 10) / 3) * (-6.58-(19.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -6.58 + (((tickAnim - 13) / 7) * (0-(-6.58)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.325 + (((tickAnim - 10) / 10) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 5) / 5) * (-20.5-(17.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20.5 + (((tickAnim - 10) / 3) * (-7.67-(-20.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.67 + (((tickAnim - 13) / 7) * (0-(-7.67)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.225 + (((tickAnim - 5) / 5) * (0-(-0.225)));
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
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.25 + (((tickAnim - 10) / 3) * (8.75-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 13) / 7) * (0-(8.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (30.5-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 8) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 5) / 5) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 10) / 10) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.80152-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.87155-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.13972-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.80152 + (((tickAnim - 5) / 5) * (-0.80152-(-0.80152)));
            yy = 0.87155 + (((tickAnim - 5) / 5) * (0.87155-(0.87155)));
            zz = -9.13972 + (((tickAnim - 5) / 5) * (-9.13972-(-9.13972)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.80152 + (((tickAnim - 10) / 10) * (0-(-0.80152)));
            yy = 0.87155 + (((tickAnim - 10) / 10) * (0-(0.87155)));
            zz = -9.13972 + (((tickAnim - 10) / 10) * (0-(-9.13972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -0.75 + (((tickAnim - 3) / 7) * (-1.75-(-0.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 10) / 10) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 3) / 7) * (3-(1.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3 + (((tickAnim - 10) / 10) * (0-(3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.75 + (((tickAnim - 3) / 7) * (7.75-(0.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.75 + (((tickAnim - 10) / 10) * (0-(7.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 3) / 7) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.75 + (((tickAnim - 10) / 10) * (0-(6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.5 + (((tickAnim - 5) / 5) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 10) / 5) * (30.5-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 30.5 + (((tickAnim - 15) / 5) * (0-(30.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.575 + (((tickAnim - 10) / 5) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 5) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -43.75 + (((tickAnim - 3) / 2) * (-8.25-(-43.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 5) / 5) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 10) / 5) * (-28.87-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -28.87 + (((tickAnim - 15) / 5) * (0-(-28.87)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.8 + (((tickAnim - 3) / 7) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 10) / 5) * (-0.775-(-0.8)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 5) * (0-(-0.775)));
            zz = 0.1 + (((tickAnim - 15) / 5) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 32.5 + (((tickAnim - 5) / 5) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 10) / 5) * (72.75-(32.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 72.75 + (((tickAnim - 15) / 5) * (0-(72.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (2.375-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 2.375 + (((tickAnim - 15) / 5) * (0-(2.375)));
            zz = -0.425 + (((tickAnim - 15) / 5) * (0-(-0.425)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (44-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 44 + (((tickAnim - 5) / 5) * (44-(44)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 44 + (((tickAnim - 10) / 10) * (0-(44)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (80.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 80.5 + (((tickAnim - 5) / 5) * (80.5-(80.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 80.5 + (((tickAnim - 10) / 5) * (0-(80.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw2, rightSickleClaw2.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw2.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 47.25 + (((tickAnim - 5) / 5) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.25 + (((tickAnim - 10) / 3) * (-7.5-(47.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 13) / 2) * (20.25-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 15) / 3) * (-16.12-(20.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.12 + (((tickAnim - 18) / 2) * (0-(-16.12)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.25 + (((tickAnim - 5) / 5) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 3) / 3) * (5-(-10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 6) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 3) / 3) * (-10.25-(12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.25 + (((tickAnim - 6) / 4) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -19.25 + (((tickAnim - 3) / 3) * (24-(-19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 6) / 4) * (0-(24)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 3) * (0-(-0.5)));
            zz = 0.575 + (((tickAnim - 3) / 3) * (0-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.25 + (((tickAnim - 3) / 3) * (18-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 18 + (((tickAnim - 6) / 4) * (0-(18)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 3) / 3) * (0-(-0.575)));
            zz = -0.025 + (((tickAnim - 3) / 3) * (0-(-0.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.25 + (((tickAnim - 3) / 3) * (-20.75-(19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 6) / 2) * (-0.95-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.95 + (((tickAnim - 8) / 2) * (0-(-0.95)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 3) * (0.15-(-0.3)));
            zz = -0.1 + (((tickAnim - 3) / 3) * (0.3-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (-0.16-(0.15)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.18-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 8) / 2) * (0-(-0.16)));
            zz = 0.18 + (((tickAnim - 8) / 2) * (0-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 18 + (((tickAnim - 3) / 3) * (-21.25-(18)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -21.25 + (((tickAnim - 6) / 4) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (35.5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 35.5 + (((tickAnim - 6) / 2) * (0-(35.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(19.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+150))*9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+250))*-9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(7.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+300))*9), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-27.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(7.75), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(-7.5), throatPouch3.rotateAngleY + (float) Math.toRadians(0), throatPouch3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+100))*12), leftArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*-3), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-17.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+150))*-12), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(25.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+250))*-5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+100))*12), rightArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*-3), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-17.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+150))*-12), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(25.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+250))*-5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*-4), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-90))*-1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+40))*6), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*-4));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+90))*-9), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*-3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*4));


        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+300))*-9), headFeathers2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+250))*9), headFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(-6.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+390))*-2), neckFeathers5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+200))*-9), neckFeathers5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(-6.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+450))*-2), neckFeathers4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+150))*-9), neckFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(-3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+500))*-2), neckFeathers3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-9), neckFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers3, bodyFeathers3.rotateAngleX + (float) Math.toRadians(-5), bodyFeathers3.rotateAngleY + (float) Math.toRadians(0), bodyFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers4, bodyFeathers4.rotateAngleX + (float) Math.toRadians(-15.5), bodyFeathers4.rotateAngleY + (float) Math.toRadians(0), bodyFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyFeathers2, bodyFeathers2.rotateAngleX + (float) Math.toRadians(-3.75), bodyFeathers2.rotateAngleY + (float) Math.toRadians(0), bodyFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-100))*-4), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*-6), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-250))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*-8), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-300))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*4));


        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*-12), rightTailFan4.rotateAngleY + (float) Math.toRadians(0), rightTailFan4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*-12), leftTailFan4.rotateAngleY + (float) Math.toRadians(0), leftTailFan4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailFeathers, tailFeathers.rotateAngleX + (float) Math.toRadians(-5.25), tailFeathers.rotateAngleY + (float) Math.toRadians(0), tailFeathers.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -38.28032 + (((tickAnim - 0) / 6) * (15.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-38.28032)));
            yy = -7.55983 + (((tickAnim - 0) / 6) * (0-(-7.55983)));
            zz = 8.01389 + (((tickAnim - 0) / 6) * (0-(8.01389)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 15.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 6) / 6) * (-38.28032-(15.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 6) / 6) * (-7.55983-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (8.01389-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4 + (((tickAnim - 0) / 6) * (20.75-(-4)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 6) / 2) * (34.68-(20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 34.68 + (((tickAnim - 8) / 4) * (-4-(34.68)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 6) * (-0.675-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 6) / 6) * (-0.725-(-0.675)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38 + (((tickAnim - 0) / 6) * (-14.25-(38)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -14.25 + (((tickAnim - 6) / 1) * (-26.32-(-14.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -26.32 + (((tickAnim - 7) / 1) * (-39.34-(-26.32)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -39.34 + (((tickAnim - 8) / 2) * (-50.01-(-39.34)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -50.01 + (((tickAnim - 10) / 2) * (38-(-50.01)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 6) * (-0.925-(-0.75)));
            zz = 0.675 + (((tickAnim - 0) / 6) * (0.925-(0.675)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 6) / 1) * (-0.91-(-0.925)));
            zz = 0.925 + (((tickAnim - 6) / 1) * (1.15-(0.925)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.91 + (((tickAnim - 7) / 1) * (-1-(-0.91)));
            zz = 1.15 + (((tickAnim - 7) / 1) * (1.085-(1.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 8) / 2) * (-1.225-(-1)));
            zz = 1.085 + (((tickAnim - 8) / 2) * (0.98-(1.085)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -1.225 + (((tickAnim - 10) / 2) * (-0.75-(-1.225)));
            zz = 0.98 + (((tickAnim - 10) / 2) * (0.675-(0.98)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.43896 + (((tickAnim - 0) / 3) * (-14.68836-(2.43896)));
            yy = 8.06998 + (((tickAnim - 0) / 3) * (4.15494-(8.06998)));
            zz = -5.82178 + (((tickAnim - 0) / 3) * (-4.61809-(-5.82178)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -14.68836 + (((tickAnim - 3) / 3) * (47.25-(-14.68836)));
            yy = 4.15494 + (((tickAnim - 3) / 3) * (0-(4.15494)));
            zz = -4.61809 + (((tickAnim - 3) / 3) * (0-(-4.61809)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 47.25 + (((tickAnim - 6) / 1) * (73.30399-(47.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (2.30571-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-1.66337-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 73.30399 + (((tickAnim - 7) / 1) * (72.93122-(73.30399)));
            yy = 2.30571 + (((tickAnim - 7) / 1) * (-1.94765-(2.30571)));
            zz = -1.66337 + (((tickAnim - 7) / 1) * (-1.45371-(-1.66337)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.93122 + (((tickAnim - 8) / 2) * (62.49565-(72.93122)));
            yy = -1.94765 + (((tickAnim - 8) / 2) * (0.55676-(-1.94765)));
            zz = -1.45371 + (((tickAnim - 8) / 2) * (-2.54573-(-1.45371)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 62.49565 + (((tickAnim - 10) / 2) * (2.43896-(62.49565)));
            yy = 0.55676 + (((tickAnim - 10) / 2) * (8.06998-(0.55676)));
            zz = -2.54573 + (((tickAnim - 10) / 2) * (-5.82178-(-2.54573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 1) * (2.275-(0.3)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 2.275 + (((tickAnim - 1) / 1) * (1.835-(2.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.835 + (((tickAnim - 2) / 1) * (0.565-(1.835)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.565 + (((tickAnim - 3) / 0) * (-0.475-(0.565)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 3) / 3) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.615-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.615 + (((tickAnim - 8) / 4) * (0.3-(0.615)));
            zz = -0.425 + (((tickAnim - 8) / 4) * (0-(-0.425)));
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
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (37.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 37.25 + (((tickAnim - 6) / 2) * (28-(37.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 28 + (((tickAnim - 8) / 4) * (0-(28)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -18.25 + (((tickAnim - 3) / 1) * (-18-(-18.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18 + (((tickAnim - 4) / 2) * (32-(-18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32 + (((tickAnim - 6) / 2) * (75.75-(32)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 75.75 + (((tickAnim - 8) / 2) * (20-(75.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 10) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.225-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 2) * (0-(0.225)));
            zz = 0.125 + (((tickAnim - 8) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 6) * (-38.28032-(38.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 6) * (7.55983-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-8.01389-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -38.28032 + (((tickAnim - 6) / 6) * (13.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-38.28032)));
            yy = 7.55983 + (((tickAnim - 6) / 6) * (0-(7.55983)));
            zz = -8.01389 + (((tickAnim - 6) / 6) * (0-(-8.01389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20.75 + (((tickAnim - 0) / 2) * (34.68-(20.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 34.68 + (((tickAnim - 2) / 4) * (-4-(34.68)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -4 + (((tickAnim - 6) / 6) * (20.75-(-4)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 6) * (-0.725-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.725 + (((tickAnim - 6) / 6) * (-0.675-(-0.725)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -14.25 + (((tickAnim - 0) / 1) * (-26.32-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -26.32 + (((tickAnim - 1) / 2) * (-39.34-(-26.32)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -39.34 + (((tickAnim - 3) / 1) * (-50.01-(-39.34)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -50.01 + (((tickAnim - 4) / 2) * (38-(-50.01)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 38 + (((tickAnim - 6) / 6) * (-14.25-(38)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 0) / 1) * (-0.91-(-0.925)));
            zz = 0.925 + (((tickAnim - 0) / 1) * (1.15-(0.925)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.91 + (((tickAnim - 1) / 2) * (-1-(-0.91)));
            zz = 1.15 + (((tickAnim - 1) / 2) * (1.085-(1.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 1) * (-1.225-(-1)));
            zz = 1.085 + (((tickAnim - 3) / 1) * (0.98-(1.085)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -1.225 + (((tickAnim - 4) / 2) * (-0.75-(-1.225)));
            zz = 0.98 + (((tickAnim - 4) / 2) * (0.675-(0.98)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 6) * (-0.925-(-0.75)));
            zz = 0.675 + (((tickAnim - 6) / 6) * (0.925-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 47.25 + (((tickAnim - 0) / 1) * (73.30399-(47.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (2.30571-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.66337-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 73.30399 + (((tickAnim - 1) / 2) * (72.93122-(73.30399)));
            yy = 2.30571 + (((tickAnim - 1) / 2) * (-1.94765-(2.30571)));
            zz = -1.66337 + (((tickAnim - 1) / 2) * (-1.45371-(-1.66337)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 72.93122 + (((tickAnim - 3) / 1) * (62.49565-(72.93122)));
            yy = -1.94765 + (((tickAnim - 3) / 1) * (0.55676-(-1.94765)));
            zz = -1.45371 + (((tickAnim - 3) / 1) * (-2.54573-(-1.45371)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 62.49565 + (((tickAnim - 4) / 2) * (0.18896-(62.49565)));
            yy = 0.55676 + (((tickAnim - 4) / 2) * (-8.06998-(0.55676)));
            zz = -2.54573 + (((tickAnim - 4) / 2) * (5.82178-(-2.54573)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.18896 + (((tickAnim - 6) / 2) * (-14.68836-(0.18896)));
            yy = -8.06998 + (((tickAnim - 6) / 2) * (-4.15494-(-8.06998)));
            zz = 5.82178 + (((tickAnim - 6) / 2) * (4.61809-(5.82178)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -14.68836 + (((tickAnim - 8) / 4) * (47.25-(-14.68836)));
            yy = -4.15494 + (((tickAnim - 8) / 4) * (0-(-4.15494)));
            zz = 4.61809 + (((tickAnim - 8) / 4) * (0-(4.61809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.615-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.615 + (((tickAnim - 3) / 3) * (0.3-(0.615)));
            zz = -0.425 + (((tickAnim - 3) / 3) * (0-(-0.425)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 1) * (2.275-(0.3)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.275 + (((tickAnim - 7) / 1) * (1.835-(2.275)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.835 + (((tickAnim - 8) / 0) * (0.565-(1.835)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.565 + (((tickAnim - 8) / 1) * (-0.475-(0.565)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 9) / 3) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
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
            xx = 37.25 + (((tickAnim - 0) / 3) * (28-(37.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 28 + (((tickAnim - 3) / 3) * (0-(28)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (37.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32 + (((tickAnim - 0) / 3) * (75.75-(32)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 75.75 + (((tickAnim - 3) / 1) * (20-(75.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 20 + (((tickAnim - 4) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -18.25 + (((tickAnim - 9) / 1) * (-18-(-18.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -18 + (((tickAnim - 10) / 2) * (32-(-18)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 1) * (0-(0.225)));
            zz = 0.125 + (((tickAnim - 3) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyFeathers, bodyFeathers.rotateAngleX + (float) Math.toRadians(-3.25), bodyFeathers.rotateAngleY + (float) Math.toRadians(0), bodyFeathers.rotateAngleZ + (float) Math.toRadians(0));
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVelociraptor entity = (EntityPrehistoricFloraVelociraptor) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -31.73364 + (((tickAnim - 0) / 13) * (22.5-(-31.73364)));
            yy = -7.35026 + (((tickAnim - 0) / 13) * (0-(-7.35026)));
            zz = 7.51895 + (((tickAnim - 0) / 13) * (0-(7.51895)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 13) / 5) * (166.005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(22.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 166.005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 18) / 7) * (-31.73364-(166.005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (-7.35026-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (7.51895-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -8.5 + (((tickAnim - 0) / 13) * (2.775-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 2.775 + (((tickAnim - 13) / 4) * (86.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-110-(2.775)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 86.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-110 + (((tickAnim - 17) / 8) * (-8.5-(86.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-110)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.55 + (((tickAnim - 17) / 1) * (0.335-(-0.55)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.335 + (((tickAnim - 18) / 7) * (0-(0.335)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 33 + (((tickAnim - 0) / 13) * (0-(33)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-41.5-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -41.5 + (((tickAnim - 17) / 3) * (-41.5-(-41.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -41.5 + (((tickAnim - 20) / 5) * (33-(-41.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 6) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(-0.675)));
            zz = 0.5 + (((tickAnim - 0) / 6) * (0.885-(0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 6) / 7) * (-1.125-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            zz = 0.885 + (((tickAnim - 6) / 7) * (-0.275-(0.885)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -1.125 + (((tickAnim - 13) / 4) * (-0.98-(-1.125)));
            zz = -0.275 + (((tickAnim - 13) / 4) * (0.955-(-0.275)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.98 + (((tickAnim - 17) / 3) * (-0.855-(-0.98)));
            zz = 0.955 + (((tickAnim - 17) / 3) * (0.955-(0.955)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.855 + (((tickAnim - 20) / 5) * (-0.675-(-0.855)));
            zz = 0.955 + (((tickAnim - 20) / 5) * (0.5-(0.955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.85527 + (((tickAnim - 0) / 6) * (-1.41327-(4.85527)));
            yy = 9.33426 + (((tickAnim - 0) / 6) * (5.72597-(9.33426)));
            zz = 0.02405 + (((tickAnim - 0) / 6) * (-2.56848-(0.02405)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.41327 + (((tickAnim - 6) / 7) * (-10.5-(-1.41327)));
            yy = 5.72597 + (((tickAnim - 6) / 7) * (0-(5.72597)));
            zz = -2.56848 + (((tickAnim - 6) / 7) * (0-(-2.56848)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -10.5 + (((tickAnim - 13) / 4) * (72.58-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 72.58 + (((tickAnim - 17) / 3) * (72.58-(72.58)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 72.58 + (((tickAnim - 20) / 5) * (4.85527-(72.58)));
            yy = 0 + (((tickAnim - 20) / 5) * (9.33426-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.02405-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.425 + (((tickAnim - 0) / 6) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(1.425)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 6) / 2) * (0.22-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.22 + (((tickAnim - 8) / 5) * (0.25-(0.22)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 13) / 4) * (1.825-(0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.825 + (((tickAnim - 17) / 3) * (1.825-(1.825)));
            zz = -0.5 + (((tickAnim - 17) / 3) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.825 + (((tickAnim - 20) / 5) * (1.425-(1.825)));
            zz = -0.5 + (((tickAnim - 20) / 5) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 21 + (((tickAnim - 0) / 6) * (40.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-170-(21)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 40.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-170 + (((tickAnim - 6) / 7) * (-33.73364-(40.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-170)));
            yy = 0 + (((tickAnim - 6) / 7) * (7.35026-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-7.51895-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -33.73364 + (((tickAnim - 13) / 12) * (21-(-33.73364)));
            yy = 7.35026 + (((tickAnim - 13) / 12) * (0-(7.35026)));
            zz = -7.51895 + (((tickAnim - 13) / 12) * (0-(-7.51895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -38.5 + (((tickAnim - 3) / 5) * (-39.75-(-38.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -39.75 + (((tickAnim - 8) / 5) * (33-(-39.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 33 + (((tickAnim - 13) / 12) * (0-(33)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 3) * (-0.98-(-1.125)));
            zz = -0.275 + (((tickAnim - 0) / 3) * (0.955-(-0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.98 + (((tickAnim - 3) / 5) * (-0.855-(-0.98)));
            zz = 0.955 + (((tickAnim - 3) / 5) * (0.955-(0.955)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.855 + (((tickAnim - 8) / 5) * (-0.675-(-0.855)));
            zz = 0.955 + (((tickAnim - 8) / 5) * (0.5-(0.955)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 13) / 6) * (1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(-0.675)));
            zz = 0.5 + (((tickAnim - 13) / 6) * (0.885-(0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 19) / 6) * (-1.125-(1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            zz = 0.885 + (((tickAnim - 19) / 6) * (-0.275-(0.885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8 + (((tickAnim - 0) / 3) * (72.58-(-8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 72.58 + (((tickAnim - 3) / 5) * (72.32688-(72.58)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.05958-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.99971-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 72.32688 + (((tickAnim - 8) / 5) * (7.43428-(72.32688)));
            yy = 0.05958 + (((tickAnim - 8) / 5) * (-8.79163-(0.05958)));
            zz = -5.99971 + (((tickAnim - 8) / 5) * (-0.60863-(-5.99971)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.43428 + (((tickAnim - 13) / 5) * (-2.41327-(7.43428)));
            yy = -8.79163 + (((tickAnim - 13) / 5) * (-5.72597-(-8.79163)));
            zz = -0.60863 + (((tickAnim - 13) / 5) * (2.56848-(-0.60863)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.41327 + (((tickAnim - 18) / 7) * (-8-(-2.41327)));
            yy = -5.72597 + (((tickAnim - 18) / 7) * (0-(-5.72597)));
            zz = 2.56848 + (((tickAnim - 18) / 7) * (0-(2.56848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (1.45-(0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.45 + (((tickAnim - 3) / 5) * (2.3-(1.45)));
            zz = -0.35 + (((tickAnim - 3) / 5) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.3 + (((tickAnim - 8) / 5) * (1.225-(2.3)));
            zz = -0.35 + (((tickAnim - 8) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 13) / 5) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(1.225)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 18) / 1) * (-0.105-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.105 + (((tickAnim - 19) / 6) * (0.3-(-0.105)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.25 + (((tickAnim - 0) / 6) * (10.88-(5.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 10.88 + (((tickAnim - 6) / 6) * (-9.25-(10.88)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 12) / 13) * (5.25-(-9.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (53.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 53.75 + (((tickAnim - 3) / 5) * (53.75-(53.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 53.75 + (((tickAnim - 8) / 4) * (0-(53.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -9.75 + (((tickAnim - 22) / 3) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 5) * (0.125-(0.125)));
            zz = 0.05 + (((tickAnim - 3) / 5) * (0.05-(0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 4) * (0-(0.125)));
            zz = 0.05 + (((tickAnim - 8) / 4) * (0-(0.05)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*-3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-30))*1);


        this.setRotateAngle(rightTailFan4, rightTailFan4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*9), rightTailFan4.rotateAngleY + (float) Math.toRadians(0), rightTailFan4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftTailFan4, leftTailFan4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*9), leftTailFan4.rotateAngleY + (float) Math.toRadians(0), leftTailFan4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.25 + (((tickAnim - 0) / 13) * (5.25-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5.25 + (((tickAnim - 13) / 5) * (10.88-(5.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 10.88 + (((tickAnim - 18) / 7) * (-9.25-(10.88)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9.75 + (((tickAnim - 9) / 4) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (53.75-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 53.75 + (((tickAnim - 17) / 3) * (53.75-(53.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 53.75 + (((tickAnim - 20) / 5) * (0-(53.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.125-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.05-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 17) / 3) * (0.125-(0.125)));
            zz = 0.05 + (((tickAnim - 17) / 3) * (0.05-(0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 20) / 5) * (0-(0.125)));
            zz = 0.05 + (((tickAnim - 20) / 5) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.775 + (((tickAnim - 0) / 3) * (26.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(2.775)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 26.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 3) / 10) * (-8.5-(26.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -8.5 + (((tickAnim - 13) / 12) * (2.775-(-8.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 3) / 3) * (0.335-(-0.55)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.335 + (((tickAnim - 6) / 7) * (0-(0.335)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*-3));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-130))*5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*3.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-190))*4.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-3.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*5.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headFeathers, headFeathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*7), headFeathers.rotateAngleY + (float) Math.toRadians(0), headFeathers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*5), headFeathers2.rotateAngleY + (float) Math.toRadians(0), headFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers5, neckFeathers5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-500))*2), neckFeathers5.rotateAngleY + (float) Math.toRadians(0), neckFeathers5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers4, neckFeathers4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-550))*3), neckFeathers4.rotateAngleY + (float) Math.toRadians(0), neckFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers2, neckFeathers2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-550))*0.5), neckFeathers2.rotateAngleY + (float) Math.toRadians(0), neckFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckFeathers3, neckFeathers3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-600))*3), neckFeathers3.rotateAngleY + (float) Math.toRadians(0), neckFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-170))*-5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*-3.5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-230))*7), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-290))*-7), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-170))*-5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*-3.5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-230))*7), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-290))*-7), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+40))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+90))*-4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2.5));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraVelociraptor e = (EntityPrehistoricFloraVelociraptor) entity;
        animator.update(entity);

    }
}
