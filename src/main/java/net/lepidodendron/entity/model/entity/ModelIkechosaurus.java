package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIkechosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIkechosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvis;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightUpperLeg;
    private final AdvancedModelRenderer rightLowerLeg;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftUpperLeg;
    private final AdvancedModelRenderer leftLowerLeg;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftUpperArm;
    private final AdvancedModelRenderer leftLowerArmw;
    private final AdvancedModelRenderer leftLowerArm;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer rightLowerArmw;
    private final AdvancedModelRenderer rightLowerArm;
    private final AdvancedModelRenderer rightHand;

    private ModelAnimator animator;

    public ModelIkechosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 21.1F, -3.7F);
        this.chest.cubeList.add(new ModelBox(chest, 34, 0, -1.5F, -2.0F, -3.0F, 3, 4, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0833F, -0.0734F, -2.8052F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1047F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.837F, -1.7515F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4538F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 28, -1.0833F, -1.8F, 0.0F, 2, 2, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -0.6F, -1.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 45, -0.0833F, -1.3F, -0.4F, 2, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0833F, -0.6F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1396F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 47, -1.0F, -1.3266F, -1.0948F, 2, 2, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 50, 0.6F, -1.3266F, -1.0948F, 1, 2, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 51, -1.6F, -1.3266F, -1.0948F, 1, 2, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 19, -0.5F, -0.8266F, -7.0948F, 1, 1, 6, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 33, 0.4F, -0.6266F, -6.8948F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 37, -0.4F, -0.6266F, -6.8948F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.9167F, 0.0F, -3.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0517F, -0.1979F, 0.0509F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 8, 0.1046F, -0.9819F, -1.8567F, 1, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.9167F, 0.0F, -3.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.191F, -0.2453F, -0.0027F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 12, -0.0954F, -0.5019F, -1.8567F, 1, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 53, 0.1016F, -0.297F, -1.8805F, 0, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.1734F, -1.0948F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0896F, -0.2963F, 0.0095F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 20, -0.0954F, -0.5019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.317F, -0.3229F, -0.9936F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0384F, -0.2889F, 0.1122F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 47, -0.0954F, -0.8019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.6F, -0.4266F, -3.1948F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0108F, -0.2057F, 0.0366F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 15, -0.438F, -0.6723F, -0.6204F, 1, 1, 1, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6F, -0.4266F, -3.1948F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0108F, 0.2057F, -0.0366F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 12, -0.562F, -0.6723F, -0.6204F, 1, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.3266F, -1.0948F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 35, -0.5F, 0.0F, -5.0F, 1, 1, 5, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.317F, -0.3229F, -0.9936F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0384F, 0.2889F, -0.1122F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 47, -0.9046F, -0.8019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 0.1734F, -1.0948F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0896F, 0.2963F, -0.0095F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 16, -0.9046F, -0.5019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.9167F, 0.0F, -3.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0517F, 0.1979F, -0.0509F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 4, -1.1046F, -0.9819F, -1.8567F, 1, 1, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9167F, 0.0F, -3.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.191F, 0.2453F, 0.0027F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 41, -0.1016F, -0.297F, -1.8805F, 0, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 0, -0.9046F, -0.5019F, -1.8567F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.6734F, -0.9948F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 49, -0.5F, -1.0F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -0.3266F, -0.1948F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 8, -0.9F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, -0.3266F, -0.1948F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.7854F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 54, -0.1F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5751F, -0.5844F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0611F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 27, -0.5F, -0.6F, -6.4F, 1, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 42, -0.5F, -0.8F, -6.1F, 1, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 21, 51, -0.5F, -0.4F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.0081F, -0.0163F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2094F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 46, -1.0F, -1.0F, -1.9F, 2, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.2266F, 0.3729F, -2.0291F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0839F, -0.1412F, -0.0146F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 4, -0.9954F, -1.0019F, -1.9567F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.6F, -3.4F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0175F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 51, 53, -0.5F, -1.4F, -2.6F, 0, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.6F, -3.4F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0175F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 53, 49, 0.5F, -1.4F, -2.6F, 0, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.9167F, 0.2266F, -2.4052F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0023F, -0.3312F, 0.0096F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 51, 0.1046F, -0.6719F, 0.0433F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.2266F, 0.3729F, -2.0291F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0847F, -0.1934F, -0.0101F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 51, -1.0954F, -0.8019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2266F, 0.3729F, -2.0291F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0839F, 0.1412F, 0.0146F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 0, 0.9954F, -1.0019F, -1.9567F, 0, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2266F, 0.3729F, -2.0291F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0847F, 0.1934F, 0.0101F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 50, 0.0954F, -0.8019F, -1.9567F, 1, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9167F, 0.2266F, -2.4052F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0023F, 0.3312F, -0.0096F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 50, -1.1046F, -0.6719F, 0.0433F, 1, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.0995F, 0.5209F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0698F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 24, -1.0F, -0.6F, -1.0F, 3, 1, 1, -0.01F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.chest.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 17, 18, -2.0F, -2.0F, 0.0F, 4, 4, 4, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -2.0F, -2.0F, -0.4F, 4, 4, 4, 0.02F, false));

        this.pelvis = new AdvancedModelRenderer(this);
        this.pelvis.setRotationPoint(0.0F, -1.0F, 3.3F);
        this.body2.addChild(pelvis);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvis.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 35, -1.5F, 1.0F, -0.2F, 3, 2, 3, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.0F, 0.4F);
        this.pelvis.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1222F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 35, -1.5F, 0.0F, -0.2F, 3, 3, 3, 0.0F, false));

        this.rightUpperLeg = new AdvancedModelRenderer(this);
        this.rightUpperLeg.setRotationPoint(-0.9F, 1.7F, 1.7F);
        this.pelvis.addChild(rightUpperLeg);
        this.setRotateAngle(rightUpperLeg, -0.1819F, -0.4445F, -0.1838F);
        this.rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 39, 35, -3.9F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.rightLowerLeg = new AdvancedModelRenderer(this);
        this.rightLowerLeg.setRotationPoint(-3.4625F, 0.1281F, -0.0687F);
        this.rightUpperLeg.addChild(rightLowerLeg);
        this.setRotateAngle(rightLowerLeg, 0.0F, 0.6981F, 0.0F);
        this.rightLowerLeg.cubeList.add(new ModelBox(rightLowerLeg, 45, 24, -2.7878F, -0.5F, -1.147F, 3, 1, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-2.8F, 0.25F, -0.3F);
        this.rightLowerLeg.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, -0.4145F, -0.0698F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.7699F, -0.3134F, 0.3112F);
        this.rightFoot.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3033F, -0.6194F, 0.0906F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 39, 40, -2.9098F, 0.0113F, -1.5326F, 3, 1, 3, 0.0F, true));

        this.leftUpperLeg = new AdvancedModelRenderer(this);
        this.leftUpperLeg.setRotationPoint(0.9F, 1.7F, 1.7F);
        this.pelvis.addChild(leftUpperLeg);
        this.setRotateAngle(leftUpperLeg, -0.1819F, 0.4445F, 0.1838F);
        this.leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 39, 35, -0.1F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.leftLowerLeg = new AdvancedModelRenderer(this);
        this.leftLowerLeg.setRotationPoint(3.4625F, 0.1281F, -0.0687F);
        this.leftUpperLeg.addChild(leftLowerLeg);
        this.setRotateAngle(leftLowerLeg, 0.0F, -0.6981F, 0.0F);
        this.leftLowerLeg.cubeList.add(new ModelBox(leftLowerLeg, 45, 24, -0.2122F, -0.5F, -1.147F, 3, 1, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(2.8F, 0.5F, -0.3F);
        this.leftLowerLeg.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0F, 0.4145F, 0.0698F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.7699F, -0.5634F, 0.3112F);
        this.leftFoot.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3033F, 0.6194F, -0.0906F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 39, 40, -0.0902F, 0.0113F, -1.5326F, 3, 1, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.4482F, 2.6068F);
        this.pelvis.addChild(tail1);
        this.setRotateAngle(tail1, -0.1571F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 0, -1.0F, -1.9F, -0.1F, 2, 3, 6, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0524F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -1.0F, -1.6022F, -0.2792F, 2, 2, 6, 0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 9, -1.0F, -0.8022F, -0.2792F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0175F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 8, -0.2F, -1.2F, -0.9F, 1, 2, 5, 0.001F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 16, -0.8F, -1.2F, -0.9F, 1, 2, 5, 0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0349F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 27, -0.5F, -0.9F, 0.0F, 1, 1, 6, 0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 27, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.3F, 5.9F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 41, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(1.2833F, 0.8028F, -1.8385F);
        this.chest.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, -0.0422F, 0.0895F, 0.1306F);
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 0, 42, -0.3F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.leftLowerArmw = new AdvancedModelRenderer(this);
        this.leftLowerArmw.setRotationPoint(2.2072F, 0.223F, -0.1026F);
        this.leftUpperArm.addChild(leftLowerArmw);


        this.leftLowerArm = new AdvancedModelRenderer(this);
        this.leftLowerArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLowerArmw.addChild(leftLowerArm);
        this.setRotateAngle(leftLowerArm, 0.4069F, 0.7751F, 0.552F);
        this.leftLowerArm.cubeList.add(new ModelBox(leftLowerArm, 11, 42, -0.3F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.5658F, -0.0936F, -0.0082F);
        this.leftLowerArm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.082F, 0.0298F, -0.3478F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 46, 45, -0.1F, -0.4F, -1.0F, 2, 1, 2, 0.0F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-1.2833F, 0.8028F, -1.8385F);
        this.chest.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, -0.0422F, -0.0895F, -0.1306F);
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 0, 42, -2.7F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.rightLowerArmw = new AdvancedModelRenderer(this);
        this.rightLowerArmw.setRotationPoint(-2.2072F, 0.223F, -0.1026F);
        this.rightUpperArm.addChild(rightLowerArmw);


        this.rightLowerArm = new AdvancedModelRenderer(this);
        this.rightLowerArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLowerArmw.addChild(rightLowerArm);
        this.setRotateAngle(rightLowerArm, 0.4069F, -0.7751F, -0.552F);
        this.rightLowerArm.cubeList.add(new ModelBox(rightLowerArm, 11, 42, -2.7F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.5658F, -0.0936F, -0.0082F);
        this.rightLowerArm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.082F, -0.0298F, 0.3478F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 46, 45, -1.9F, -0.4F, -1.0F, 2, 1, 2, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.chest.offsetY = -2.0F;
        this.chest.offsetX = -1.338F;
        this.chest.rotateAngleY = (float)Math.toRadians(200);
        this.chest.rotateAngleX = (float)Math.toRadians(8);
        this.chest.rotateAngleZ = (float)Math.toRadians(-8);
        this.chest.scaleChildren = true;
        float scaler = 1.63F;
        this.chest.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.chest.render(f);
        //Reset rotations, positions and sizing:
        this.chest.setScale(1.0F, 1.0F, 1.0F);
        this.chest.scaleChildren = false;
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
        this.chest.offsetY = 0.0F;

        EntityPrehistoricFloraIkechosaurus proteros = (EntityPrehistoricFloraIkechosaurus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
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
        EntityPrehistoricFloraIkechosaurus ee = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.21844-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.51748-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.98094-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 10.21844 + (((tickAnim - 7) / 4) * (6.96844-(10.21844)));
            yy = 0.51748 + (((tickAnim - 7) / 4) * (0.51748-(0.51748)));
            zz = -6.98094 + (((tickAnim - 7) / 4) * (-6.98094-(-6.98094)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6.96844 + (((tickAnim - 11) / 4) * (0-(6.96844)));
            yy = 0.51748 + (((tickAnim - 11) / 4) * (0-(0.51748)));
            zz = -6.98094 + (((tickAnim - 11) / 4) * (0-(-6.98094)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 8.75 + (((tickAnim - 7) / 4) * (15.5-(8.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 15.5 + (((tickAnim - 11) / 4) * (-14-(15.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 15) / 5) * (0-(-14)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 3) / 4) * (8.25-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 8.25 + (((tickAnim - 7) / 4) * (0-(8.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (16-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 16 + (((tickAnim - 13) / 2) * (0-(16)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 3) / 5) * (4.5-(16.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 8) / 2) * (0-(4.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 3) / 5) * (-11.5-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.5 + (((tickAnim - 8) / 2) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 3) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.85759-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.08914-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8.90046-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.85759 + (((tickAnim - 5) / 5) * (7-(0.85759)));
            yy = 12.08914 + (((tickAnim - 5) / 5) * (24.25-(12.08914)));
            zz = -8.90046 + (((tickAnim - 5) / 5) * (0-(-8.90046)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 10) / 10) * (7.12391-(7)));
            yy = 24.25 + (((tickAnim - 10) / 10) * (-37.08473-(24.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (-4.74415-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.12391 + (((tickAnim - 20) / 5) * (7.22768-(7.12391)));
            yy = -37.08473 + (((tickAnim - 20) / 5) * (-4.83793-(-37.08473)));
            zz = -4.74415 + (((tickAnim - 20) / 5) * (-21.30763-(-4.74415)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.22768 + (((tickAnim - 25) / 5) * (7-(7.22768)));
            yy = -4.83793 + (((tickAnim - 25) / 5) * (24.25-(-4.83793)));
            zz = -21.30763 + (((tickAnim - 25) / 5) * (0-(-21.30763)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 30) / 10) * (7.12391-(7)));
            yy = 24.25 + (((tickAnim - 30) / 10) * (-37.08473-(24.25)));
            zz = 0 + (((tickAnim - 30) / 10) * (-4.74415-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.12391 + (((tickAnim - 40) / 10) * (0-(7.12391)));
            yy = -37.08473 + (((tickAnim - 40) / 10) * (0-(-37.08473)));
            zz = -4.74415 + (((tickAnim - 40) / 10) * (0-(-4.74415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (25.13-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 25.13 + (((tickAnim - 5) / 5) * (0-(25.13)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (25.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 25.75 + (((tickAnim - 20) / 10) * (0-(25.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (25.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 25.75 + (((tickAnim - 40) / 10) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.77923-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.11554-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-28.26598-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.77923 + (((tickAnim - 5) / 5) * (-3.25-(13.77923)));
            yy = 3.11554 + (((tickAnim - 5) / 5) * (3.75-(3.11554)));
            zz = -28.26598 + (((tickAnim - 5) / 5) * (0-(-28.26598)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 10) / 10) * (37.68569-(-3.25)));
            yy = 3.75 + (((tickAnim - 10) / 10) * (-13.03379-(3.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (-32.39379-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.68569 + (((tickAnim - 20) / 10) * (-3.25-(37.68569)));
            yy = -13.03379 + (((tickAnim - 20) / 10) * (3.75-(-13.03379)));
            zz = -32.39379 + (((tickAnim - 20) / 10) * (0-(-32.39379)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 30) / 10) * (37.68569-(-3.25)));
            yy = 3.75 + (((tickAnim - 30) / 10) * (-13.03379-(3.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (-32.39379-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.68569 + (((tickAnim - 40) / 10) * (0-(37.68569)));
            yy = -13.03379 + (((tickAnim - 40) / 10) * (0-(-13.03379)));
            zz = -32.39379 + (((tickAnim - 40) / 10) * (0-(-32.39379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArmw, leftLowerArmw.rotateAngleX + (float) Math.toRadians(xx), leftLowerArmw.rotateAngleY + (float) Math.toRadians(yy), leftLowerArmw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 7) / 7) * (0-(0.15)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 21) / 4) * (0-(0.15)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*4), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))));


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-4), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.78262-(0)));
            yy = -23.75 + (((tickAnim - 0) / 5) * (7.25404-(-23.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.19698-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 6.78262 + (((tickAnim - 5) / 7) * (12.04003-(6.78262)));
            yy = 7.25404 + (((tickAnim - 5) / 7) * (49.4986-(7.25404)));
            zz = -5.19698 + (((tickAnim - 5) / 7) * (0.1055-(-5.19698)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 12.04003 + (((tickAnim - 12) / 6) * (0.21536-(12.04003)));
            yy = 49.4986 + (((tickAnim - 12) / 6) * (16.84935-(49.4986)));
            zz = 0.1055 + (((tickAnim - 12) / 6) * (30.8379-(0.1055)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.21536 + (((tickAnim - 18) / 7) * (0-(0.21536)));
            yy = 16.84935 + (((tickAnim - 18) / 7) * (-23.75-(16.84935)));
            zz = 30.8379 + (((tickAnim - 18) / 7) * (0-(30.8379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.76938 + (((tickAnim - 0) / 6) * (-0.78148-(5.76938)));
            yy = -20.53486 + (((tickAnim - 0) / 6) * (-1.18346-(-20.53486)));
            zz = -5.41234 + (((tickAnim - 0) / 6) * (-3.1254-(-5.41234)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.78148 + (((tickAnim - 6) / 6) * (-27.67633-(-0.78148)));
            yy = -1.18346 + (((tickAnim - 6) / 6) * (19.1599-(-1.18346)));
            zz = -3.1254 + (((tickAnim - 6) / 6) * (-31.4191-(-3.1254)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -27.67633 + (((tickAnim - 12) / 3) * (20.50002-(-27.67633)));
            yy = 19.1599 + (((tickAnim - 12) / 3) * (21.2526-(19.1599)));
            zz = -31.4191 + (((tickAnim - 12) / 3) * (-24.21706-(-31.4191)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.50002 + (((tickAnim - 15) / 3) * (52.47977-(20.50002)));
            yy = 21.2526 + (((tickAnim - 15) / 3) * (5.77356-(21.2526)));
            zz = -24.21706 + (((tickAnim - 15) / 3) * (-19.6643-(-24.21706)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 52.47977 + (((tickAnim - 18) / 4) * (30.77109-(52.47977)));
            yy = 5.77356 + (((tickAnim - 18) / 4) * (-14.24999-(5.77356)));
            zz = -19.6643 + (((tickAnim - 18) / 4) * (-1.02373-(-19.6643)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 30.77109 + (((tickAnim - 22) / 3) * (5.76938-(30.77109)));
            yy = -14.24999 + (((tickAnim - 22) / 3) * (-20.53486-(-14.24999)));
            zz = -1.02373 + (((tickAnim - 22) / 3) * (-5.41234-(-1.02373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 12) * (0-(0.225)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerLeg.rotationPointX = this.rightLowerLeg.rotationPointX + (float)(xx);
        this.rightLowerLeg.rotationPointY = this.rightLowerLeg.rotationPointY - (float)(yy);
        this.rightLowerLeg.rotationPointZ = this.rightLowerLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-15.63978-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-2.16227-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-4.50415-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -15.63978 + (((tickAnim - 12) / 3) * (-14.37886-(-15.63978)));
            yy = -2.16227 + (((tickAnim - 12) / 3) * (55.34457-(-2.16227)));
            zz = -4.50415 + (((tickAnim - 12) / 3) * (-14.95906-(-4.50415)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.37886 + (((tickAnim - 15) / 3) * (-14.46815-(-14.37886)));
            yy = 55.34457 + (((tickAnim - 15) / 3) * (51.1439-(55.34457)));
            zz = -14.95906 + (((tickAnim - 15) / 3) * (-22.7472-(-14.95906)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -14.46815 + (((tickAnim - 18) / 4) * (4.54937-(-14.46815)));
            yy = 51.1439 + (((tickAnim - 18) / 4) * (21.91881-(51.1439)));
            zz = -22.7472 + (((tickAnim - 18) / 4) * (-9.7488-(-22.7472)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 4.54937 + (((tickAnim - 22) / 3) * (0-(4.54937)));
            yy = 21.91881 + (((tickAnim - 22) / 3) * (0-(21.91881)));
            zz = -9.7488 + (((tickAnim - 22) / 3) * (0-(-9.7488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+420))*-12), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.70061 + (((tickAnim - 0) / 11) * (37.31012-(3.70061)));
            yy = 30.05226 + (((tickAnim - 0) / 11) * (-19.3224-(30.05226)));
            zz = 6.4222 + (((tickAnim - 0) / 11) * (-28.8441-(6.4222)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 37.31012 + (((tickAnim - 11) / 7) * (17.05961-(37.31012)));
            yy = -19.3224 + (((tickAnim - 11) / 7) * (10.20096-(-19.3224)));
            zz = -28.8441 + (((tickAnim - 11) / 7) * (-33.90562-(-28.8441)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 17.05961 + (((tickAnim - 18) / 7) * (3.70061-(17.05961)));
            yy = 10.20096 + (((tickAnim - 18) / 7) * (30.05226-(10.20096)));
            zz = -33.90562 + (((tickAnim - 18) / 7) * (6.4222-(-33.90562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-27.57931-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.29712-(0)));
            zz = 1.5 + (((tickAnim - 0) / 6) * (-55.62548-(1.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -27.57931 + (((tickAnim - 6) / 5) * (-23.16446-(-27.57931)));
            yy = -4.29712 + (((tickAnim - 6) / 5) * (-3.27098-(-4.29712)));
            zz = -55.62548 + (((tickAnim - 6) / 5) * (-67.54831-(-55.62548)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -23.16446 + (((tickAnim - 11) / 3) * (-11.37334-(-23.16446)));
            yy = -3.27098 + (((tickAnim - 11) / 3) * (7.41254-(-3.27098)));
            zz = -67.54831 + (((tickAnim - 11) / 3) * (22.95804-(-67.54831)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -11.37334 + (((tickAnim - 14) / 4) * (-3.69789-(-11.37334)));
            yy = 7.41254 + (((tickAnim - 14) / 4) * (5.88095-(7.41254)));
            zz = 22.95804 + (((tickAnim - 14) / 4) * (62.48826-(22.95804)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -3.69789 + (((tickAnim - 18) / 4) * (-4.05493-(-3.69789)));
            yy = 5.88095 + (((tickAnim - 18) / 4) * (3.21763-(5.88095)));
            zz = 62.48826 + (((tickAnim - 18) / 4) * (10.37882-(62.48826)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -4.05493 + (((tickAnim - 22) / 3) * (0-(-4.05493)));
            yy = 3.21763 + (((tickAnim - 22) / 3) * (0-(3.21763)));
            zz = 10.37882 + (((tickAnim - 22) / 3) * (1.5-(10.37882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.5 + (((tickAnim - 6) / 8) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.31012 + (((tickAnim - 0) / 7) * (17.05961-(37.31012)));
            yy = 19.3224 + (((tickAnim - 0) / 7) * (-10.201-(19.3224)));
            zz = 28.8441 + (((tickAnim - 0) / 7) * (33.9056-(28.8441)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 17.05961 + (((tickAnim - 7) / 7) * (3.70061-(17.05961)));
            yy = -10.201 + (((tickAnim - 7) / 7) * (-30.0523-(-10.201)));
            zz = 33.9056 + (((tickAnim - 7) / 7) * (-6.4222-(33.9056)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 3.70061 + (((tickAnim - 14) / 11) * (37.31012-(3.70061)));
            yy = -30.0523 + (((tickAnim - 14) / 11) * (19.3224-(-30.0523)));
            zz = -6.4222 + (((tickAnim - 14) / 11) * (28.8441-(-6.4222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.73812 + (((tickAnim - 0) / 5) * (-8.24974-(-15.73812)));
            yy = 4.06848 + (((tickAnim - 0) / 5) * (1.55818-(4.06848)));
            zz = 88.44702 + (((tickAnim - 0) / 5) * (-31.06244-(88.44702)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.24974 + (((tickAnim - 5) / 4) * (-1.06373-(-8.24974)));
            yy = 1.55818 + (((tickAnim - 5) / 4) * (-0.29992-(1.55818)));
            zz = -31.06244 + (((tickAnim - 5) / 4) * (5.93264-(-31.06244)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -1.06373 + (((tickAnim - 9) / 5) * (8.5-(-1.06373)));
            yy = -0.29992 + (((tickAnim - 9) / 5) * (0-(-0.29992)));
            zz = 5.93264 + (((tickAnim - 9) / 5) * (13-(5.93264)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 14) / 6) * (-19.08856-(8.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (4.6121-(0)));
            zz = 13 + (((tickAnim - 14) / 6) * (60.64884-(13)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.08856 + (((tickAnim - 20) / 5) * (-15.73812-(-19.08856)));
            yy = 4.6121 + (((tickAnim - 20) / 5) * (4.06848-(4.6121)));
            zz = 60.64884 + (((tickAnim - 20) / 5) * (88.44702-(60.64884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.175 + (((tickAnim - 14) / 6) * (0.775-(0.175)));
            yy = 0.075 + (((tickAnim - 14) / 6) * (0-(0.075)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.775 + (((tickAnim - 20) / 5) * (0-(0.775)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 12.04003 + (((tickAnim - 0) / 7) * (0.21536-(12.04003)));
            yy = -49.4986 + (((tickAnim - 0) / 7) * (-16.8493-(-49.4986)));
            zz = 0.1055 + (((tickAnim - 0) / 7) * (-30.8379-(0.1055)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.21536 + (((tickAnim - 7) / 6) * (0-(0.21536)));
            yy = -16.8493 + (((tickAnim - 7) / 6) * (23.75-(-16.8493)));
            zz = -30.8379 + (((tickAnim - 7) / 6) * (0-(-30.8379)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (12.04003-(0)));
            yy = 23.75 + (((tickAnim - 13) / 12) * (-49.4986-(23.75)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.1055-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.67633 + (((tickAnim - 0) / 3) * (20.50002-(-27.67633)));
            yy = -19.1599 + (((tickAnim - 0) / 3) * (-21.2526-(-19.1599)));
            zz = 31.4191 + (((tickAnim - 0) / 3) * (24.2171-(31.4191)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.50002 + (((tickAnim - 3) / 4) * (52.47977-(20.50002)));
            yy = -21.2526 + (((tickAnim - 3) / 4) * (-5.7736-(-21.2526)));
            zz = 24.2171 + (((tickAnim - 3) / 4) * (19.6643-(24.2171)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 52.47977 + (((tickAnim - 7) / 3) * (30.77109-(52.47977)));
            yy = -5.7736 + (((tickAnim - 7) / 3) * (14.25-(-5.7736)));
            zz = 19.6643 + (((tickAnim - 7) / 3) * (1.0237-(19.6643)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30.77109 + (((tickAnim - 10) / 3) * (5.76938-(30.77109)));
            yy = 14.25 + (((tickAnim - 10) / 3) * (20.5349-(14.25)));
            zz = 1.0237 + (((tickAnim - 10) / 3) * (5.4123-(1.0237)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5.76938 + (((tickAnim - 13) / 12) * (-27.67633-(5.76938)));
            yy = 20.5349 + (((tickAnim - 13) / 12) * (-19.1599-(20.5349)));
            zz = 5.4123 + (((tickAnim - 13) / 12) * (31.4191-(5.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.225 + (((tickAnim - 13) / 12) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerLeg.rotationPointX = this.leftLowerLeg.rotationPointX + (float)(xx);
        this.leftLowerLeg.rotationPointY = this.leftLowerLeg.rotationPointY - (float)(yy);
        this.leftLowerLeg.rotationPointZ = this.leftLowerLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.63978 + (((tickAnim - 0) / 3) * (-14.37886-(-15.63978)));
            yy = 2.1623 + (((tickAnim - 0) / 3) * (-55.3446-(2.1623)));
            zz = 4.5041 + (((tickAnim - 0) / 3) * (14.9591-(4.5041)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.37886 + (((tickAnim - 3) / 4) * (-14.46815-(-14.37886)));
            yy = -55.3446 + (((tickAnim - 3) / 4) * (-51.1439-(-55.3446)));
            zz = 14.9591 + (((tickAnim - 3) / 4) * (22.7472-(14.9591)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -14.46815 + (((tickAnim - 7) / 3) * (4.54937-(-14.46815)));
            yy = -51.1439 + (((tickAnim - 7) / 3) * (-21.9188-(-51.1439)));
            zz = 22.7472 + (((tickAnim - 7) / 3) * (9.7488-(22.7472)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.54937 + (((tickAnim - 10) / 3) * (0-(4.54937)));
            yy = -21.9188 + (((tickAnim - 10) / 3) * (0-(-21.9188)));
            zz = 9.7488 + (((tickAnim - 10) / 3) * (0-(9.7488)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-14.33949-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-1.2985-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-10.80264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.33949 + (((tickAnim - 20) / 5) * (-15.63978-(-14.33949)));
            yy = -1.2985 + (((tickAnim - 20) / 5) * (2.1623-(-1.2985)));
            zz = -10.80264 + (((tickAnim - 20) / 5) * (4.5041-(-10.80264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.06227 + (((tickAnim - 0) / 11) * (72.32187-(3.06227)));
            yy = 2.01184 + (((tickAnim - 0) / 11) * (34.47711-(2.01184)));
            zz = -8.5317 + (((tickAnim - 0) / 11) * (28.3356-(-8.5317)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 72.32187 + (((tickAnim - 11) / 3) * (68.43563-(72.32187)));
            yy = 34.47711 + (((tickAnim - 11) / 3) * (15.14222-(34.47711)));
            zz = 28.3356 + (((tickAnim - 11) / 3) * (18.9729-(28.3356)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 68.43563 + (((tickAnim - 14) / 4) * (25.13843-(68.43563)));
            yy = 15.14222 + (((tickAnim - 14) / 4) * (3.97012-(15.14222)));
            zz = 18.9729 + (((tickAnim - 14) / 4) * (0.28382-(18.9729)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 25.13843 + (((tickAnim - 18) / 3) * (0.85035-(25.13843)));
            yy = 3.97012 + (((tickAnim - 18) / 3) * (2.99098-(3.97012)));
            zz = 0.28382 + (((tickAnim - 18) / 3) * (-4.12394-(0.28382)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0.85035 + (((tickAnim - 21) / 4) * (3.06227-(0.85035)));
            yy = 2.99098 + (((tickAnim - 21) / 4) * (2.01184-(2.99098)));
            zz = -4.12394 + (((tickAnim - 21) / 4) * (-8.5317-(-4.12394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArmw, leftLowerArmw.rotateAngleX + (float) Math.toRadians(xx), leftLowerArmw.rotateAngleY + (float) Math.toRadians(yy), leftLowerArmw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.525-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.35 + (((tickAnim - 18) / 7) * (0-(-0.35)));
            yy = 0.525 + (((tickAnim - 18) / 7) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 18) / 7) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerArmw.rotationPointX = this.leftLowerArmw.rotationPointX + (float)(xx);
        this.leftLowerArmw.rotationPointY = this.leftLowerArmw.rotationPointY - (float)(yy);
        this.leftLowerArmw.rotationPointZ = this.leftLowerArmw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.32187 + (((tickAnim - 0) / 3) * (76.33682-(72.32187)));
            yy = -34.4771 + (((tickAnim - 0) / 3) * (2.43518-(-34.4771)));
            zz = -28.3356 + (((tickAnim - 0) / 3) * (-15.25244-(-28.3356)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 76.33682 + (((tickAnim - 3) / 4) * (25.13843-(76.33682)));
            yy = 2.43518 + (((tickAnim - 3) / 4) * (3.97012-(2.43518)));
            zz = -15.25244 + (((tickAnim - 3) / 4) * (0.28382-(-15.25244)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25.13843 + (((tickAnim - 7) / 3) * (0.85035-(25.13843)));
            yy = 3.97012 + (((tickAnim - 7) / 3) * (2.99098-(3.97012)));
            zz = 0.28382 + (((tickAnim - 7) / 3) * (-4.12394-(0.28382)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.85035 + (((tickAnim - 10) / 4) * (3.06227-(0.85035)));
            yy = 2.99098 + (((tickAnim - 10) / 4) * (2.01184-(2.99098)));
            zz = -4.12394 + (((tickAnim - 10) / 4) * (-8.5317-(-4.12394)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 3.06227 + (((tickAnim - 14) / 11) * (72.32187-(3.06227)));
            yy = 2.01184 + (((tickAnim - 14) / 11) * (-34.4771-(2.01184)));
            zz = -8.5317 + (((tickAnim - 14) / 11) * (-28.3356-(-8.5317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArmw, rightLowerArmw.rotateAngleX + (float) Math.toRadians(xx), rightLowerArmw.rotateAngleY + (float) Math.toRadians(yy), rightLowerArmw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.21-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.23 + (((tickAnim - 3) / 4) * (-0.1-(0.23)));
            yy = 0.21 + (((tickAnim - 3) / 4) * (0.35-(0.21)));
            zz = 0.08 + (((tickAnim - 3) / 4) * (0.15-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.1 + (((tickAnim - 7) / 7) * (0-(-0.1)));
            yy = 0.35 + (((tickAnim - 7) / 7) * (0-(0.35)));
            zz = 0.15 + (((tickAnim - 7) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerArmw.rotationPointX = this.rightLowerArmw.rotationPointX + (float)(xx);
        this.rightLowerArmw.rotationPointY = this.rightLowerArmw.rotationPointY - (float)(yy);
        this.rightLowerArmw.rotationPointZ = this.rightLowerArmw.rotationPointZ + (float)(zz);

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-0.5);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*10), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.25), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*-10), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*10), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+50))*-10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))));
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+100))*-10), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), rightUpperLeg.rotateAngleY + (float) Math.toRadians(74.9019), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-38.4699));
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), rightLowerLeg.rotateAngleY + (float) Math.toRadians(-16.4612), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(-14.7519));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-5.99252), rightFoot.rotateAngleY + (float) Math.toRadians(42.6036), rightFoot.rotateAngleZ + (float) Math.toRadians(-17.9958));
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-74.90189), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(38.46993));
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), leftLowerLeg.rotateAngleY + (float) Math.toRadians(16.46116), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(14.75187));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-5.99252), leftFoot.rotateAngleY + (float) Math.toRadians(-42.60361), leftFoot.rotateAngleZ + (float) Math.toRadians(17.99582));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+50))*-14), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*18), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*24), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+250))*-28), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(85.53489), leftUpperArm.rotateAngleY + (float) Math.toRadians(-52.42488), leftUpperArm.rotateAngleZ + (float) Math.toRadians(1.84232));
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(0), leftLowerArm.rotateAngleY + (float) Math.toRadians(-35.25), leftLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(37.5));
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(85.53489), rightUpperArm.rotateAngleY + (float) Math.toRadians(52.4249), rightUpperArm.rotateAngleZ + (float) Math.toRadians(1.84232));
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(0), rightLowerArm.rotateAngleY + (float) Math.toRadians(35.25), rightLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-37.5));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIkechosaurus entity = (EntityPrehistoricFloraIkechosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.25), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*7), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))));
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-7), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), rightUpperLeg.rotateAngleY + (float) Math.toRadians(74.9019), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-38.4699));
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), rightLowerLeg.rotateAngleY + (float) Math.toRadians(-16.4612), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(-14.7519));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-5.99252), rightFoot.rotateAngleY + (float) Math.toRadians(42.6036), rightFoot.rotateAngleZ + (float) Math.toRadians(-17.9958));
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-74.90189), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(38.46993));
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), leftLowerLeg.rotateAngleY + (float) Math.toRadians(16.46116), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(14.75187));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-5.99252), leftFoot.rotateAngleY + (float) Math.toRadians(-42.60361), leftFoot.rotateAngleZ + (float) Math.toRadians(17.99582));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*7), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*-22), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(85.53489), leftUpperArm.rotateAngleY + (float) Math.toRadians(-52.42488), leftUpperArm.rotateAngleZ + (float) Math.toRadians(1.84232));
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(0), leftLowerArm.rotateAngleY + (float) Math.toRadians(-35.25), leftLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(37.5));
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(85.53489), rightUpperArm.rotateAngleY + (float) Math.toRadians(52.4249), rightUpperArm.rotateAngleZ + (float) Math.toRadians(1.84232));
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(0), rightLowerArm.rotateAngleY + (float) Math.toRadians(35.25), rightLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-37.5));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIkechosaurus e = (EntityPrehistoricFloraIkechosaurus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
