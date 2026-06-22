package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDicynodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDicynodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
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
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer backLeftLeg1;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer backRightLeg1;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer cube_r40;

    private ModelAnimator animator;

    public ModelDicynodon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 14.0286F, 12.3965F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -5.4303F, -1.2249F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 0, -4.0F, 0.275F, 0.025F, 7, 9, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -5.4803F, -13.9749F, 10, 12, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 20, -4.5F, -5.1803F, -6.9749F, 9, 11, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -5.9857F, -6.9816F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1134F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 48, -3.5F, 0.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.6803F, -13.9749F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 39, -3.5F, 0.0F, 0.0F, 7, 1, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 20, -4.5F, -4.9973F, -6.7594F, 9, 11, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.9973F, -6.8594F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0916F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 54, -3.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(4.0F, 1.4027F, -3.8594F);
        this.chest.addChild(frontLeftLeg);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0096F, 0.0096F);
        this.frontLeftLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.249F, -0.4732F, 0.3919F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 64, 0, -1.0F, -2.0F, -2.05F, 6, 4, 4, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(4.1131F, 1.6905F, 2.0381F);
        this.frontLeftLeg.addChild(frontLeftLeg2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.frontLeftLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0042F, 0.1158F, 1.6678F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 65, -0.5F, -1.5F, -1.8F, 7, 3, 3, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(-0.5775F, 5.9318F, -0.9431F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.frontLeftLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 72, 0.0F, -2.0F, -3.3F, 1, 4, 5, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-4.0F, 1.4027F, -3.8594F);
        this.chest.addChild(frontRightLeg);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0096F, 0.0096F);
        this.frontRightLeg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.249F, 0.4732F, -0.3919F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 0, -5.0F, -2.0F, -2.05F, 6, 4, 4, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-4.1131F, 1.6905F, 2.0381F);
        this.frontRightLeg.addChild(frontRightLeg2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.frontRightLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0042F, -0.1158F, -1.6678F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 65, -6.5F, -1.5F, -1.8F, 7, 3, 3, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.5775F, 5.9318F, -0.9431F);
        this.frontRightLeg2.addChild(frontRightLeg3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.frontRightLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 72, -1.0F, -2.0F, -3.3F, 1, 4, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.2873F, -6.4248F);
        this.chest.addChild(neck);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.6961F, -4.0813F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4974F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 57, -3.5F, -2.5F, 1.0F, 7, 2, 5, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.5117F, -4.8769F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1658F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 39, -4.0F, 0.0F, 0.0F, 8, 8, 6, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.2413F, -4.5218F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1222F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5766F, -7.8647F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.1781F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 79, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.5766F, -7.8647F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 75, 59, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.6512F, -6.1779F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 72, -1.5F, -2.0F, 0.0F, 3, 2, 4, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, 4.0384F, -6.0457F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1719F, 0.0302F, 0.1719F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 69, 75, 0.0F, -3.0F, -1.0F, 1, 4, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 4.0384F, -6.0457F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6781F, 0.0302F, 0.1719F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 79, 0.0F, -3.0F, -1.0F, 1, 3, 1, -0.002F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.725F, -0.1025F, -4.47F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3276F, -0.5158F, -0.2566F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 17, -1.025F, -0.025F, -0.25F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.2192F, 3.5174F, -5.7397F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2334F, -0.5257F, -0.2076F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 67, 0.0F, -3.0F, 0.0F, 3, 3, 4, -0.002F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.2392F, 3.372F, -5.7708F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3276F, -0.5158F, -0.2566F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 67, 0.0F, -3.0F, 0.0F, 3, 3, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.725F, -0.1025F, -4.47F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3276F, 0.5158F, 0.2566F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 17, 0.025F, -0.025F, -0.25F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.2192F, 3.5174F, -5.7397F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2334F, 0.5257F, 0.2076F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 67, -3.0F, -3.0F, 0.0F, 3, 3, 4, -0.002F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.2392F, 3.372F, -5.7708F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3276F, 0.5158F, 0.2566F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 67, -3.0F, -3.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.0F, 4.0384F, -6.0457F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6781F, -0.0302F, -0.1719F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 79, -1.0F, -3.0F, -1.0F, 1, 3, 1, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.0F, 4.0384F, -6.0457F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1719F, -0.0302F, -0.1719F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 69, 75, -1.0F, -3.0F, -1.0F, 1, 4, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.7289F, -7.0993F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 66, 30, -1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(4.0F, 2.9776F, -2.7795F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 63, -8.0F, -4.0F, 0.0F, 8, 4, 3, -0.004F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.9616F, -3.4741F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 39, -4.0F, 0.0F, 0.0F, 8, 4, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.4825F, -0.5197F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.5061F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 52, 59, -4.0F, 0.0F, 0.0F, 8, 4, 3, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7098F, -2.7426F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.192F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 3.5315F, -2.7356F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0175F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 81, 18, -1.0F, -4.0F, 1.25F, 2, 1, 2, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 74, 67, -2.5F, -4.0F, 3.0F, 5, 4, 2, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 75, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 3.5315F, -2.7356F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2443F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 35, 17, -1.5F, -1.0F, 0.0F, 3, 1, 1, -0.002F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 74, 74, -1.5F, -2.7F, 0.0F, 3, 2, 4, 0.002F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 2.9173F, -3.1587F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6109F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 81, 22, -1.0F, -2.25F, 0.0F, 2, 3, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -2.0303F, 4.6751F);
        this.hip.addChild(tail);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -1.0162F, 0.5144F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.48F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 71, -2.0F, 0.0F, -1.0F, 3, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.3338F, 2.3144F);
        this.tail.addChild(tail2);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -2.85F, -1.8F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.48F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 43, 75, -2.0F, 1.0F, 2.0F, 2, 2, 4, 0.0F, false));

        this.backLeftLeg1 = new AdvancedModelRenderer(this);
        this.backLeftLeg1.setRotationPoint(2.25F, 0.4027F, 0.3906F);
        this.hip.addChild(backLeftLeg1);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.8811F, 0.5214F, -0.1232F);
        this.backLeftLeg1.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0417F, 0.2175F, 0.7328F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 48, -2.0F, -2.5F, -2.55F, 7, 5, 5, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(4.3631F, 3.9405F, -1.2119F);
        this.backLeftLeg1.addChild(backLeftLeg2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.25F, -1.25F, 0.0F);
        this.backLeftLeg2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1692F, 0.0298F, 1.6531F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 64, 9, 0.2F, -1.7F, -1.9F, 6, 4, 4, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.0775F, 4.6818F, 0.0569F);
        this.backLeftLeg2.addChild(backLeftLeg3);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.backLeftLeg3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 1.5708F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 66, 18, 0.0F, -2.0F, -4.3F, 1, 5, 6, 0.0F, false));

        this.backRightLeg1 = new AdvancedModelRenderer(this);
        this.backRightLeg1.setRotationPoint(-2.25F, 0.4027F, 0.3906F);
        this.hip.addChild(backRightLeg1);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.8811F, 0.5214F, -0.1232F);
        this.backRightLeg1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0417F, -0.2175F, -0.7328F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 56, 48, -5.0F, -2.5F, -2.55F, 7, 5, 5, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-4.3631F, 3.9405F, -1.2119F);
        this.backRightLeg1.addChild(backRightLeg2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.25F, -1.25F, 0.0F);
        this.backRightLeg2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1692F, -0.0298F, -1.6531F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 64, 9, -6.2F, -1.7F, -1.9F, 6, 4, 4, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0775F, 4.6818F, 0.0569F);
        this.backRightLeg2.addChild(backRightLeg3);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.backRightLeg3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -1.5708F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 66, 18, -1.0F, -2.0F, -4.3F, 1, 5, 6, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }


    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.hip.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.8F;
        this.hip.offsetX = -0.5F;
        this.hip.rotateAngleY = (float)Math.toRadians(130);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 0.9F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();

    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraDicynodon EntityMegalosaurus = (EntityPrehistoricFloraDicynodon) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.head};

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

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
        yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (15.38-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = 15.38 + (((tickAnim - 5) / 5) * (7-(15.38)));
        yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = 7 + (((tickAnim - 10) / 10) * (0-(7)));
        yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 5) / 5) * (40-(0)));
        yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 40 + (((tickAnim - 10) / 3) * (0-(40)));
        yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 59;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (43.7206-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (-27.07871-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-21.49759-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 43.7206 + (((tickAnim - 20) / 10) * (-4.77436-(43.7206)));
        yy = -27.07871 + (((tickAnim - 20) / 10) * (0.66955-(-27.07871)));
        zz = -21.49759 + (((tickAnim - 20) / 10) * (-39.55149-(-21.49759)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -4.77436 + (((tickAnim - 30) / 10) * (-12.77298-(-4.77436)));
        yy = 0.66955 + (((tickAnim - 30) / 10) * (10.57922-(0.66955)));
        zz = -39.55149 + (((tickAnim - 30) / 10) * (1.44334-(-39.55149)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
        xx = -12.77298 + (((tickAnim - 40) / 9) * (0-(-12.77298)));
        yy = 10.57922 + (((tickAnim - 40) / 9) * (0-(10.57922)));
        zz = 1.44334 + (((tickAnim - 40) / 9) * (0-(1.44334)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (28.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 28.5 + (((tickAnim - 20) / 10) * (12.41225-(28.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (-8.78656-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (9.07437-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = 12.41225 + (((tickAnim - 30) / 10) * (0-(12.41225)));
        yy = -8.78656 + (((tickAnim - 30) / 10) * (-10.5-(-8.78656)));
        zz = 9.07437 + (((tickAnim - 30) / 10) * (-11.75-(9.07437)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
        xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        yy = -10.5 + (((tickAnim - 40) / 9) * (0-(-10.5)));
        zz = -11.75 + (((tickAnim - 40) / 9) * (0-(-11.75)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (1.325-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        yy = 1.325 + (((tickAnim - 30) / 10) * (-0.5-(1.325)));
        zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
        xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        yy = -0.5 + (((tickAnim - 40) / 9) * (0-(-0.5)));
        zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (44.25-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
        xx = 44.25 + (((tickAnim - 20) / 5) * (70.35378-(44.25)));
        yy = 0 + (((tickAnim - 20) / 5) * (-0.44837-(0)));
        zz = 0 + (((tickAnim - 20) / 5) * (1.43208-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
        xx = 70.35378 + (((tickAnim - 25) / 15) * (14.66514-(70.35378)));
        yy = -0.44837 + (((tickAnim - 25) / 15) * (-1.79348-(-0.44837)));
        zz = 1.43208 + (((tickAnim - 25) / 15) * (5.72832-(1.43208)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
        xx = 14.66514 + (((tickAnim - 40) / 9) * (0-(14.66514)));
        yy = -1.79348 + (((tickAnim - 40) / 9) * (0-(-1.79348)));
        zz = 5.72832 + (((tickAnim - 40) / 9) * (0-(5.72832)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 11) * (1.245-(0)));
        zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        yy = 1.245 + (((tickAnim - 11) / 9) * (0.675-(1.245)));
        zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        yy = 0.675 + (((tickAnim - 20) / 20) * (0-(0.675)));
        zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
        xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (-11.75-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = -11.75 + (((tickAnim - 20) / 10) * (-11.75-(-11.75)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = -11.75 + (((tickAnim - 30) / 20) * (0-(-11.75)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = -2.75 + (((tickAnim - 20) / 10) * (-2.75-(-2.75)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = -2.75 + (((tickAnim - 30) / 20) * (0-(-2.75)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0.575 + (((tickAnim - 20) / 10) * (0.575-(0.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0.575 + (((tickAnim - 30) / 20) * (0-(0.575)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (6.2441-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.27208-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (12.26484-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 6.2441 + (((tickAnim - 20) / 10) * (6.2441-(6.2441)));
        yy = 0.27208 + (((tickAnim - 20) / 10) * (0.27208-(0.27208)));
        zz = 12.26484 + (((tickAnim - 20) / 10) * (12.26484-(12.26484)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 6.2441 + (((tickAnim - 30) / 20) * (0-(6.2441)));
        yy = 0.27208 + (((tickAnim - 30) / 20) * (0-(0.27208)));
        zz = 12.26484 + (((tickAnim - 30) / 20) * (0-(12.26484)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.475-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0.475 + (((tickAnim - 20) / 10) * (0.475-(0.475)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0.475 + (((tickAnim - 30) / 20) * (0-(0.475)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (13-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 13 + (((tickAnim - 20) / 10) * (13-(13)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 13 + (((tickAnim - 30) / 20) * (0-(13)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (6.2441-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (-0.27208-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-12.26484-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 6.2441 + (((tickAnim - 20) / 10) * (6.2441-(6.2441)));
        yy = -0.27208 + (((tickAnim - 20) / 10) * (-0.27208-(-0.27208)));
        zz = -12.26484 + (((tickAnim - 20) / 10) * (-12.26484-(-12.26484)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 6.2441 + (((tickAnim - 30) / 20) * (0-(6.2441)));
        yy = -0.27208 + (((tickAnim - 30) / 20) * (0-(-0.27208)));
        zz = -12.26484 + (((tickAnim - 30) / 20) * (0-(-12.26484)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0.475 + (((tickAnim - 20) / 10) * (0.475-(0.475)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-26.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = -26.25 + (((tickAnim - 20) / 10) * (-26.25-(-26.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = -26.25 + (((tickAnim - 30) / 20) * (0-(-26.25)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg1, backLeftLeg1.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg1.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (8.48207-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.5539-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (26.04107-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 8.48207 + (((tickAnim - 20) / 10) * (8.48207-(8.48207)));
        yy = 0.5539 + (((tickAnim - 20) / 10) * (0.5539-(0.5539)));
        zz = 26.04107 + (((tickAnim - 20) / 10) * (26.04107-(26.04107)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 8.48207 + (((tickAnim - 30) / 20) * (0-(8.48207)));
        yy = 0.5539 + (((tickAnim - 30) / 20) * (0-(0.5539)));
        zz = 26.04107 + (((tickAnim - 30) / 20) * (0-(26.04107)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.3-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0.3 + (((tickAnim - 30) / 20) * (0-(0.3)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (4.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 4.5 + (((tickAnim - 20) / 10) * (4.5-(4.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 4.5 + (((tickAnim - 30) / 20) * (0-(4.5)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (26.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 26.25 + (((tickAnim - 20) / 10) * (26.25-(26.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 26.25 + (((tickAnim - 30) / 20) * (0-(26.25)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg1, backRightLeg1.rotateAngleX + (float) Math.toRadians(xx), backRightLeg1.rotateAngleY + (float) Math.toRadians(yy), backRightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (8.48207-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (-0.5539-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-26.04107-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 8.48207 + (((tickAnim - 20) / 10) * (8.48207-(8.48207)));
        yy = -0.5539 + (((tickAnim - 20) / 10) * (-0.5539-(-0.5539)));
        zz = -26.04107 + (((tickAnim - 20) / 10) * (-26.04107-(-26.04107)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 8.48207 + (((tickAnim - 30) / 20) * (0-(8.48207)));
        yy = -0.5539 + (((tickAnim - 30) / 20) * (0-(-0.5539)));
        zz = -26.04107 + (((tickAnim - 30) / 20) * (0-(-26.04107)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (4.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 4.5 + (((tickAnim - 20) / 10) * (4.5-(4.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
        xx = 4.5 + (((tickAnim - 30) / 20) * (0-(4.5)));
        yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 0) / 18) * (-34.4998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        yy = 0 + (((tickAnim - 0) / 18) * (-0.00981-(0)));
        zz = 0 + (((tickAnim - 0) / 18) * (-2.24998-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
        xx = -34.4998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 18) / 12) * (0-(-34.4998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        yy = -0.00981 + (((tickAnim - 18) / 12) * (0-(-0.00981)));
        zz = -2.24998 + (((tickAnim - 18) / 12) * (0-(-2.24998)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 9) * (0.65-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        yy = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        zz = 0.65 + (((tickAnim - 9) / 21) * (0-(0.65)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 0) / 18) * (-12.75-(0)));
        yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
        xx = -12.75 + (((tickAnim - 18) / 12) * (0-(-12.75)));
        yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (38-(0)));
        yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
        xx = 38 + (((tickAnim - 8) / 22) * (0-(38)));
        yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (5.5-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 5.5 + (((tickAnim - 20) / 17) * (5.5-(5.5)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 5.5 + (((tickAnim - 37) / 13) * (0-(5.5)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = 0.625 + (((tickAnim - 20) / 17) * (0.625-(0.625)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 0.625 + (((tickAnim - 37) / 13) * (0-(0.625)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = 4.75 + (((tickAnim - 20) / 4) * (8-(4.75)));
        yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = 8 + (((tickAnim - 24) / 4) * (4.75-(8)));
        yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 4.75 + (((tickAnim - 28) / 5) * (8-(4.75)));
        yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = 8 + (((tickAnim - 33) / 4) * (4.75-(8)));
        yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 4.75 + (((tickAnim - 37) / 13) * (0-(4.75)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        zz = 0.575 + (((tickAnim - 20) / 4) * (0.745-(0.575)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        zz = 0.745 + (((tickAnim - 24) / 4) * (0.575-(0.745)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        zz = 0.575 + (((tickAnim - 28) / 5) * (0.745-(0.575)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        zz = 0.745 + (((tickAnim - 33) / 4) * (0.575-(0.745)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 0.575 + (((tickAnim - 37) / 13) * (0-(0.575)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (-11.7664-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (13.01525-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-14.53269-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = -11.7664 + (((tickAnim - 20) / 4) * (-17.34184-(-11.7664)));
        yy = 13.01525 + (((tickAnim - 20) / 4) * (12.57218-(13.01525)));
        zz = -14.53269 + (((tickAnim - 20) / 4) * (-16.00225-(-14.53269)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = -17.34184 + (((tickAnim - 24) / 4) * (-11.7664-(-17.34184)));
        yy = 12.57218 + (((tickAnim - 24) / 4) * (13.01525-(12.57218)));
        zz = -16.00225 + (((tickAnim - 24) / 4) * (-14.53269-(-16.00225)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = -11.7664 + (((tickAnim - 28) / 5) * (-17.34184-(-11.7664)));
        yy = 13.01525 + (((tickAnim - 28) / 5) * (12.57218-(13.01525)));
        zz = -14.53269 + (((tickAnim - 28) / 5) * (-16.00225-(-14.53269)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = -17.34184 + (((tickAnim - 33) / 4) * (-11.7664-(-17.34184)));
        yy = 12.57218 + (((tickAnim - 33) / 4) * (13.01525-(12.57218)));
        zz = -16.00225 + (((tickAnim - 33) / 4) * (-14.53269-(-16.00225)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = -11.7664 + (((tickAnim - 37) / 13) * (0-(-11.7664)));
        yy = 13.01525 + (((tickAnim - 37) / 13) * (0-(13.01525)));
        zz = -14.53269 + (((tickAnim - 37) / 13) * (0-(-14.53269)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = -13.75 + (((tickAnim - 20) / 17) * (-13.75-(-13.75)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = -13.75 + (((tickAnim - 37) / 13) * (0-(-13.75)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (23.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = 23.5 + (((tickAnim - 20) / 17) * (23.5-(23.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 23.5 + (((tickAnim - 37) / 13) * (0-(23.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0.625 + (((tickAnim - 20) / 17) * (0.625-(0.625)));
        zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0.625 + (((tickAnim - 37) / 13) * (0-(0.625)));
        zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (-11.7664-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (-13.01525-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (14.53269-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = -11.7664 + (((tickAnim - 20) / 4) * (-17.34184-(-11.7664)));
        yy = -13.01525 + (((tickAnim - 20) / 4) * (-12.57218-(-13.01525)));
        zz = 14.53269 + (((tickAnim - 20) / 4) * (16.00225-(14.53269)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = -17.34184 + (((tickAnim - 24) / 4) * (-11.7664-(-17.34184)));
        yy = -12.57218 + (((tickAnim - 24) / 4) * (-13.01525-(-12.57218)));
        zz = 16.00225 + (((tickAnim - 24) / 4) * (14.53269-(16.00225)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = -11.7664 + (((tickAnim - 28) / 5) * (-17.34184-(-11.7664)));
        yy = -13.01525 + (((tickAnim - 28) / 5) * (-12.57218-(-13.01525)));
        zz = 14.53269 + (((tickAnim - 28) / 5) * (16.00225-(14.53269)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = -17.34184 + (((tickAnim - 33) / 4) * (-11.7664-(-17.34184)));
        yy = -12.57218 + (((tickAnim - 33) / 4) * (-13.01525-(-12.57218)));
        zz = 16.00225 + (((tickAnim - 33) / 4) * (14.53269-(16.00225)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = -11.7664 + (((tickAnim - 37) / 13) * (0-(-11.7664)));
        yy = -13.01525 + (((tickAnim - 37) / 13) * (0-(-13.01525)));
        zz = 14.53269 + (((tickAnim - 37) / 13) * (0-(14.53269)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = 13.75 + (((tickAnim - 20) / 17) * (13.75-(13.75)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = 13.75 + (((tickAnim - 37) / 13) * (0-(13.75)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-23.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        zz = -23.5 + (((tickAnim - 20) / 17) * (-23.5-(-23.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = -23.5 + (((tickAnim - 37) / 13) * (0-(-23.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        yy = 0.625 + (((tickAnim - 20) / 17) * (0.625-(0.625)));
        zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0.625 + (((tickAnim - 37) / 13) * (0-(0.625)));
        zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (25.72418-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (1.19435-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-2.47728-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = 25.72418 + (((tickAnim - 20) / 4) * (19.97418-(25.72418)));
        yy = 1.19435 + (((tickAnim - 20) / 4) * (1.19435-(1.19435)));
        zz = -2.47728 + (((tickAnim - 20) / 4) * (-2.47728-(-2.47728)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = 19.97418 + (((tickAnim - 24) / 4) * (25.72418-(19.97418)));
        yy = 1.19435 + (((tickAnim - 24) / 4) * (1.19435-(1.19435)));
        zz = -2.47728 + (((tickAnim - 24) / 4) * (-2.47728-(-2.47728)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 25.72418 + (((tickAnim - 28) / 5) * (19.97418-(25.72418)));
        yy = 1.19435 + (((tickAnim - 28) / 5) * (1.19435-(1.19435)));
        zz = -2.47728 + (((tickAnim - 28) / 5) * (-2.47728-(-2.47728)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = 19.97418 + (((tickAnim - 33) / 4) * (25.72418-(19.97418)));
        yy = 1.19435 + (((tickAnim - 33) / 4) * (1.19435-(1.19435)));
        zz = -2.47728 + (((tickAnim - 33) / 4) * (-2.47728-(-2.47728)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 25.72418 + (((tickAnim - 37) / 13) * (0-(25.72418)));
        yy = 1.19435 + (((tickAnim - 37) / 13) * (0-(1.19435)));
        zz = -2.47728 + (((tickAnim - 37) / 13) * (0-(-2.47728)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 0) / 20) * (1.60756-(0)));
        yy = 0 + (((tickAnim - 0) / 20) * (2.28056-(0)));
        zz = 0 + (((tickAnim - 0) / 20) * (-7.14675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = 1.60756 + (((tickAnim - 20) / 4) * (18.10756-(1.60756)));
        yy = 2.28056 + (((tickAnim - 20) / 4) * (2.28056-(2.28056)));
        zz = -7.14675 + (((tickAnim - 20) / 4) * (-7.14675-(-7.14675)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = 18.10756 + (((tickAnim - 24) / 4) * (1.60756-(18.10756)));
        yy = 2.28056 + (((tickAnim - 24) / 4) * (2.28056-(2.28056)));
        zz = -7.14675 + (((tickAnim - 24) / 4) * (-7.14675-(-7.14675)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 1.60756 + (((tickAnim - 28) / 5) * (18.10756-(1.60756)));
        yy = 2.28056 + (((tickAnim - 28) / 5) * (2.28056-(2.28056)));
        zz = -7.14675 + (((tickAnim - 28) / 5) * (-7.14675-(-7.14675)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = 18.10756 + (((tickAnim - 33) / 4) * (1.60756-(18.10756)));
        yy = 2.28056 + (((tickAnim - 33) / 4) * (2.28056-(2.28056)));
        zz = -7.14675 + (((tickAnim - 33) / 4) * (-7.14675-(-7.14675)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 1.60756 + (((tickAnim - 37) / 13) * (0-(1.60756)));
        yy = 2.28056 + (((tickAnim - 37) / 13) * (0-(2.28056)));
        zz = -7.14675 + (((tickAnim - 37) / 13) * (0-(-7.14675)));
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
        zz = 0 + (((tickAnim - 0) / 20) * (-1.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        zz = -1.15 + (((tickAnim - 20) / 8) * (-1.15-(-1.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        zz = -1.15 + (((tickAnim - 28) / 9) * (-1.15-(-1.15)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        zz = -1.15 + (((tickAnim - 37) / 13) * (0-(-1.15)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-390))*0.85);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.15);



        if (tickAnim >= 0 && tickAnim < 16) {
        xx = -32.38842 + (((tickAnim - 0) / 16) * (-5.09475-(-32.38842)));
        yy = 34.77141 + (((tickAnim - 0) / 16) * (-23.30715-(34.77141)));
        zz = -2.13331 + (((tickAnim - 0) / 16) * (-9.42244-(-2.13331)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = -5.09475 + (((tickAnim - 16) / 7) * (-20.96396-(-5.09475)));
        yy = -23.30715 + (((tickAnim - 16) / 7) * (5.59841-(-23.30715)));
        zz = -9.42244 + (((tickAnim - 16) / 7) * (-28.46828-(-9.42244)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = -20.96396 + (((tickAnim - 23) / 7) * (-32.38842-(-20.96396)));
        yy = 5.59841 + (((tickAnim - 23) / 7) * (34.77141-(5.59841)));
        zz = -28.46828 + (((tickAnim - 23) / 7) * (-2.13331-(-28.46828)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 19.93177 + (((tickAnim - 0) / 8) * (24.37996-(19.93177)));
        yy = -31.22038 + (((tickAnim - 0) / 8) * (-3.31714-(-31.22038)));
        zz = -23.46731 + (((tickAnim - 0) / 8) * (-7.62073-(-23.46731)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
        xx = 24.37996 + (((tickAnim - 8) / 8) * (61.83286-(24.37996)));
        yy = -3.31714 + (((tickAnim - 8) / 8) * (22.04944-(-3.31714)));
        zz = -7.62073 + (((tickAnim - 8) / 8) * (6.78525-(-7.62073)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = 61.83286 + (((tickAnim - 16) / 7) * (6.64993-(61.83286)));
        yy = 22.04944 + (((tickAnim - 16) / 7) * (-6.15223-(22.04944)));
        zz = 6.78525 + (((tickAnim - 16) / 7) * (-9.23081-(6.78525)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 6.64993 + (((tickAnim - 23) / 7) * (19.93177-(6.64993)));
        yy = -6.15223 + (((tickAnim - 23) / 7) * (-31.22038-(-6.15223)));
        zz = -9.23081 + (((tickAnim - 23) / 7) * (-23.46731-(-9.23081)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 16 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 16) / 7) * (-0.775-(0)));
        yy = 0 + (((tickAnim - 16) / 7) * (0.775-(0)));
        zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = -0.775 + (((tickAnim - 23) / 7) * (0-(-0.775)));
        yy = 0.775 + (((tickAnim - 23) / 7) * (0-(0.775)));
        zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 18.68602 + (((tickAnim - 0) / 5) * (5.5-(18.68602)));
        yy = 4.07445 + (((tickAnim - 0) / 5) * (0-(4.07445)));
        zz = 4.52532 + (((tickAnim - 0) / 5) * (11.25-(4.52532)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = 5.5 + (((tickAnim - 5) / 5) * (3.28386-(5.5)));
        yy = 0 + (((tickAnim - 5) / 5) * (0.53586-(0)));
        zz = 11.25 + (((tickAnim - 5) / 5) * (12.85528-(11.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
        xx = 3.28386 + (((tickAnim - 10) / 2) * (13.48847-(3.28386)));
        yy = 0.53586 + (((tickAnim - 10) / 2) * (0.38276-(0.53586)));
        zz = 12.85528 + (((tickAnim - 10) / 2) * (9.18234-(12.85528)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
        xx = 13.48847 + (((tickAnim - 12) / 4) * (56.5-(13.48847)));
        yy = 0.38276 + (((tickAnim - 12) / 4) * (0-(0.38276)));
        zz = 9.18234 + (((tickAnim - 12) / 4) * (0-(9.18234)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
        xx = 56.5 + (((tickAnim - 16) / 3) * (98.82482-(56.5)));
        yy = 0 + (((tickAnim - 16) / 3) * (0.9587-(0)));
        zz = 0 + (((tickAnim - 16) / 3) * (1.06478-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
        xx = 98.82482 + (((tickAnim - 19) / 4) * (77.48084-(98.82482)));
        yy = 0.9587 + (((tickAnim - 19) / 4) * (2.15706-(0.9587)));
        zz = 1.06478 + (((tickAnim - 19) / 4) * (2.39576-(1.06478)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 77.48084 + (((tickAnim - 23) / 7) * (18.68602-(77.48084)));
        yy = 2.15706 + (((tickAnim - 23) / 7) * (4.07445-(2.15706)));
        zz = 2.39576 + (((tickAnim - 23) / 7) * (4.52532-(2.39576)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
        xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 5) / 7) * (0.43-(0)));
        zz = 0 + (((tickAnim - 5) / 7) * (0.9-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        yy = 0.43 + (((tickAnim - 12) / 1) * (0.93-(0.43)));
        zz = 0.9 + (((tickAnim - 12) / 1) * (1.115-(0.9)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        yy = 0.93 + (((tickAnim - 13) / 3) * (0.55-(0.93)));
        zz = 1.115 + (((tickAnim - 13) / 3) * (0-(1.115)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        yy = 0.55 + (((tickAnim - 16) / 7) * (1.285-(0.55)));
        zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        yy = 1.285 + (((tickAnim - 23) / 7) * (0-(1.285)));
        zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = -5.09475 + (((tickAnim - 0) / 8) * (-20.96396-(-5.09475)));
        yy = 23.30715 + (((tickAnim - 0) / 8) * (-5.59841-(23.30715)));
        zz = 9.42244 + (((tickAnim - 0) / 8) * (28.46828-(9.42244)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
        xx = -20.96396 + (((tickAnim - 8) / 6) * (-32.38842-(-20.96396)));
        yy = -5.59841 + (((tickAnim - 8) / 6) * (-34.77141-(-5.59841)));
        zz = 28.46828 + (((tickAnim - 8) / 6) * (2.13331-(28.46828)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
        xx = -32.38842 + (((tickAnim - 14) / 16) * (-5.09475-(-32.38842)));
        yy = -34.77141 + (((tickAnim - 14) / 16) * (23.30715-(-34.77141)));
        zz = 2.13331 + (((tickAnim - 14) / 16) * (9.42244-(2.13331)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 61.83286 + (((tickAnim - 0) / 8) * (6.64993-(61.83286)));
        yy = -22.04944 + (((tickAnim - 0) / 8) * (6.15223-(-22.04944)));
        zz = -6.78525 + (((tickAnim - 0) / 8) * (9.23081-(-6.78525)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
        xx = 6.64993 + (((tickAnim - 8) / 6) * (19.93177-(6.64993)));
        yy = 6.15223 + (((tickAnim - 8) / 6) * (31.22038-(6.15223)));
        zz = 9.23081 + (((tickAnim - 8) / 6) * (23.46731-(9.23081)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
        xx = 19.93177 + (((tickAnim - 14) / 16) * (61.83286-(19.93177)));
        yy = 31.22038 + (((tickAnim - 14) / 16) * (-22.04944-(31.22038)));
        zz = 23.46731 + (((tickAnim - 14) / 16) * (-6.78525-(23.46731)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
        yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
        zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
        xx = 0.775 + (((tickAnim - 8) / 6) * (0-(0.775)));
        yy = 0.775 + (((tickAnim - 8) / 6) * (0-(0.775)));
        zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 56.5 + (((tickAnim - 0) / 3) * (98.82482-(56.5)));
        yy = 0 + (((tickAnim - 0) / 3) * (-0.9587-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (-1.06478-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 98.82482 + (((tickAnim - 3) / 5) * (77.48084-(98.82482)));
        yy = -0.9587 + (((tickAnim - 3) / 5) * (-2.15706-(-0.9587)));
        zz = -1.06478 + (((tickAnim - 3) / 5) * (-2.39576-(-1.06478)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
        xx = 77.48084 + (((tickAnim - 8) / 6) * (18.68602-(77.48084)));
        yy = -2.15706 + (((tickAnim - 8) / 6) * (-4.07445-(-2.15706)));
        zz = -2.39576 + (((tickAnim - 8) / 6) * (-4.52532-(-2.39576)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
        xx = 18.68602 + (((tickAnim - 14) / 8) * (-18.57377-(18.68602)));
        yy = -4.07445 + (((tickAnim - 14) / 8) * (-5.52039-(-4.07445)));
        zz = -4.52532 + (((tickAnim - 14) / 8) * (-11.01429-(-4.52532)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
        xx = -18.57377 + (((tickAnim - 22) / 8) * (56.5-(-18.57377)));
        yy = -5.52039 + (((tickAnim - 22) / 8) * (0-(-5.52039)));
        zz = -11.01429 + (((tickAnim - 22) / 8) * (0-(-11.01429)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        yy = 0.55 + (((tickAnim - 0) / 8) * (1.285-(0.55)));
        zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
        xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        yy = 1.285 + (((tickAnim - 8) / 6) * (0-(1.285)));
        zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        yy = 0 + (((tickAnim - 14) / 8) * (0.135-(0)));
        zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
        xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        yy = 0.135 + (((tickAnim - 22) / 4) * (0.715-(0.135)));
        zz = 0 + (((tickAnim - 22) / 4) * (0.725-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        yy = 0.715 + (((tickAnim - 26) / 4) * (0.55-(0.715)));
        zz = 0.725 + (((tickAnim - 26) / 4) * (0-(0.725)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*12));



         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 26.46142 + (((tickAnim - 0) / 7) * (11.74875-(26.46142)));
        yy = -37.54557 + (((tickAnim - 0) / 7) * (2.14868-(-37.54557)));
        zz = -11.3339 + (((tickAnim - 0) / 7) * (-31.81914-(-11.3339)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
        xx = 11.74875 + (((tickAnim - 7) / 6) * (-3.05054-(11.74875)));
        yy = 2.14868 + (((tickAnim - 7) / 6) * (32.79311-(2.14868)));
        zz = -31.81914 + (((tickAnim - 7) / 6) * (-9.23381-(-31.81914)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = -3.05054 + (((tickAnim - 13) / 2) * (-2.74765-(-3.05054)));
        yy = 32.79311 + (((tickAnim - 13) / 2) * (25.683-(32.79311)));
        zz = -9.23381 + (((tickAnim - 13) / 2) * (-8.56844-(-9.23381)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
        xx = -2.74765 + (((tickAnim - 15) / 15) * (26.46142-(-2.74765)));
        yy = 25.683 + (((tickAnim - 15) / 15) * (-37.54557-(25.683)));
        zz = -8.56844 + (((tickAnim - 15) / 15) * (-11.3339-(-8.56844)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg1, backLeftLeg1.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg1.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 26.37852 + (((tickAnim - 0) / 7) * (9.02467-(26.37852)));
        yy = 25.54219 + (((tickAnim - 0) / 7) * (-7.76784-(25.54219)));
        zz = -20.7498 + (((tickAnim - 0) / 7) * (4.25066-(-20.7498)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
        xx = 9.02467 + (((tickAnim - 7) / 6) * (-5-(9.02467)));
        yy = -7.76784 + (((tickAnim - 7) / 6) * (-36-(-7.76784)));
        zz = 4.25066 + (((tickAnim - 7) / 6) * (0-(4.25066)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = -5 + (((tickAnim - 13) / 2) * (-2.75-(-5)));
        yy = -36 + (((tickAnim - 13) / 2) * (-42.1-(-36)));
        zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
        xx = -2.75 + (((tickAnim - 15) / 15) * (26.37852-(-2.75)));
        yy = -42.1 + (((tickAnim - 15) / 15) * (25.54219-(-42.1)));
        zz = 0 + (((tickAnim - 15) / 15) * (-20.7498-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 0) / 7) * (0.28-(0)));
        yy = 0 + (((tickAnim - 0) / 7) * (0.705-(0)));
        zz = 0 + (((tickAnim - 0) / 7) * (-0.19-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
        xx = 0.28 + (((tickAnim - 7) / 6) * (0-(0.28)));
        yy = 0.705 + (((tickAnim - 7) / 6) * (0-(0.705)));
        zz = -0.19 + (((tickAnim - 7) / 6) * (0-(-0.19)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
        xx = 0 + (((tickAnim - 15) / 4) * (0.4-(0)));
        yy = 0 + (((tickAnim - 15) / 4) * (-1.595-(0)));
        zz = 0 + (((tickAnim - 15) / 4) * (-0.27-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
        xx = 0.4 + (((tickAnim - 19) / 11) * (0-(0.4)));
        yy = -1.595 + (((tickAnim - 19) / 11) * (0-(-1.595)));
        zz = -0.27 + (((tickAnim - 19) / 11) * (0-(-0.27)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 31.85261 + (((tickAnim - 0) / 3) * (70.69068-(31.85261)));
        yy = 14.34013 + (((tickAnim - 0) / 3) * (11.13454-(14.34013)));
        zz = 8.74815 + (((tickAnim - 0) / 3) * (8.4147-(8.74815)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
        xx = 70.69068 + (((tickAnim - 3) / 4) * (54.55075-(70.69068)));
        yy = 11.13454 + (((tickAnim - 3) / 4) * (7.12755-(11.13454)));
        zz = 8.4147 + (((tickAnim - 3) / 4) * (7.99787-(8.4147)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
        xx = 54.55075 + (((tickAnim - 7) / 3) * (12.77194-(54.55075)));
        yy = 7.12755 + (((tickAnim - 7) / 3) * (3.12056-(7.12755)));
        zz = 7.99787 + (((tickAnim - 7) / 3) * (7.58105-(7.99787)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 12.77194 + (((tickAnim - 10) / 3) * (7.24889-(12.77194)));
        yy = 3.12056 + (((tickAnim - 10) / 3) * (-0.08503-(3.12056)));
        zz = 7.58105 + (((tickAnim - 10) / 3) * (7.24759-(7.58105)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = 7.24889 + (((tickAnim - 13) / 2) * (7.50113-(7.24889)));
        yy = -0.08503 + (((tickAnim - 13) / 2) * (13.92735-(-0.08503)));
        zz = 7.24759 + (((tickAnim - 13) / 2) * (8.29272-(7.24759)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
        xx = 7.50113 + (((tickAnim - 15) / 8) * (1.57008-(7.50113)));
        yy = 13.92735 + (((tickAnim - 15) / 8) * (6.95618-(13.92735)));
        zz = 8.29272 + (((tickAnim - 15) / 8) * (22.35571-(8.29272)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 1.57008 + (((tickAnim - 23) / 7) * (31.85261-(1.57008)));
        yy = 6.95618 + (((tickAnim - 23) / 7) * (14.34013-(6.95618)));
        zz = 22.35571 + (((tickAnim - 23) / 7) * (8.74815-(22.35571)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        yy = 1.175 + (((tickAnim - 0) / 7) * (1.375-(1.175)));
        zz = 0.5 + (((tickAnim - 0) / 7) * (0.25-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        yy = 1.375 + (((tickAnim - 7) / 6) * (-0.175-(1.375)));
        zz = 0.25 + (((tickAnim - 7) / 6) * (0-(0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        yy = -0.175 + (((tickAnim - 13) / 2) * (-0.1-(-0.175)));
        zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
        xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        yy = -0.1 + (((tickAnim - 15) / 4) * (0.24-(-0.1)));
        zz = 0 + (((tickAnim - 15) / 4) * (0.38-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        yy = 0.24 + (((tickAnim - 19) / 4) * (0-(0.24)));
        zz = 0.38 + (((tickAnim - 19) / 4) * (0.675-(0.38)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
        xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 23) / 4) * (1.455-(0)));
        zz = 0.675 + (((tickAnim - 23) / 4) * (1.155-(0.675)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        yy = 1.455 + (((tickAnim - 27) / 3) * (1.175-(1.455)));
        zz = 1.155 + (((tickAnim - 27) / 3) * (0.5-(1.155)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 15) {
        xx = -2.74765 + (((tickAnim - 0) / 15) * (26.46142-(-2.74765)));
        yy = -25.683 + (((tickAnim - 0) / 15) * (37.54557-(-25.683)));
        zz = 8.56844 + (((tickAnim - 0) / 15) * (11.3339-(8.56844)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
        xx = 26.46142 + (((tickAnim - 15) / 7) * (11.74875-(26.46142)));
        yy = 37.54557 + (((tickAnim - 15) / 7) * (-2.14868-(37.54557)));
        zz = 11.3339 + (((tickAnim - 15) / 7) * (31.81914-(11.3339)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
        xx = 11.74875 + (((tickAnim - 22) / 6) * (-3.05054-(11.74875)));
        yy = -2.14868 + (((tickAnim - 22) / 6) * (-32.79311-(-2.14868)));
        zz = 31.81914 + (((tickAnim - 22) / 6) * (9.23381-(31.81914)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = -3.05054 + (((tickAnim - 28) / 2) * (-2.74765-(-3.05054)));
        yy = -32.79311 + (((tickAnim - 28) / 2) * (-25.683-(-32.79311)));
        zz = 9.23381 + (((tickAnim - 28) / 2) * (8.56844-(9.23381)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg1, backRightLeg1.rotateAngleX + (float) Math.toRadians(xx), backRightLeg1.rotateAngleY + (float) Math.toRadians(yy), backRightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 15) {
        xx = -2.75 + (((tickAnim - 0) / 15) * (26.37852-(-2.75)));
        yy = 42.1 + (((tickAnim - 0) / 15) * (-25.54219-(42.1)));
        zz = 0 + (((tickAnim - 0) / 15) * (20.7498-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
        xx = 26.37852 + (((tickAnim - 15) / 7) * (9.02467-(26.37852)));
        yy = -25.54219 + (((tickAnim - 15) / 7) * (7.76784-(-25.54219)));
        zz = 20.7498 + (((tickAnim - 15) / 7) * (-4.25066-(20.7498)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
        xx = 9.02467 + (((tickAnim - 22) / 6) * (-5-(9.02467)));
        yy = 7.76784 + (((tickAnim - 22) / 6) * (36-(7.76784)));
        zz = -4.25066 + (((tickAnim - 22) / 6) * (0-(-4.25066)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = -5 + (((tickAnim - 28) / 2) * (-2.75-(-5)));
        yy = 36 + (((tickAnim - 28) / 2) * (42.1-(36)));
        zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0.55 + (((tickAnim - 0) / 4) * (0.4-(0.55)));
        yy = -0.45 + (((tickAnim - 0) / 4) * (-1.595-(-0.45)));
        zz = -0.375 + (((tickAnim - 0) / 4) * (-0.27-(-0.375)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
        xx = 0.4 + (((tickAnim - 4) / 11) * (0-(0.4)));
        yy = -1.595 + (((tickAnim - 4) / 11) * (0-(-1.595)));
        zz = -0.27 + (((tickAnim - 4) / 11) * (0-(-0.27)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 15) / 7) * (0.28-(0)));
        yy = 0 + (((tickAnim - 15) / 7) * (0.705-(0)));
        zz = 0 + (((tickAnim - 15) / 7) * (-0.19-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
        xx = 0.28 + (((tickAnim - 22) / 6) * (0.55-(0.28)));
        yy = 0.705 + (((tickAnim - 22) / 6) * (-0.45-(0.705)));
        zz = -0.19 + (((tickAnim - 22) / 6) * (-0.375-(-0.19)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 0.55 + (((tickAnim - 28) / 2) * (0.55-(0.55)));
        yy = -0.45 + (((tickAnim - 28) / 2) * (-0.45-(-0.45)));
        zz = -0.375 + (((tickAnim - 28) / 2) * (-0.375-(-0.375)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 7.50113 + (((tickAnim - 0) / 8) * (1.57008-(7.50113)));
        yy = -13.92735 + (((tickAnim - 0) / 8) * (-6.95618-(-13.92735)));
        zz = -8.29272 + (((tickAnim - 0) / 8) * (-22.35571-(-8.29272)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
        xx = 1.57008 + (((tickAnim - 8) / 7) * (31.85261-(1.57008)));
        yy = -6.95618 + (((tickAnim - 8) / 7) * (-14.34013-(-6.95618)));
        zz = -22.35571 + (((tickAnim - 8) / 7) * (-8.74815-(-22.35571)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 31.85261 + (((tickAnim - 15) / 3) * (70.69068-(31.85261)));
        yy = -14.34013 + (((tickAnim - 15) / 3) * (-11.13454-(-14.34013)));
        zz = -8.74815 + (((tickAnim - 15) / 3) * (-8.4147-(-8.74815)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
        xx = 70.69068 + (((tickAnim - 18) / 4) * (54.55075-(70.69068)));
        yy = -11.13454 + (((tickAnim - 18) / 4) * (-7.12755-(-11.13454)));
        zz = -8.4147 + (((tickAnim - 18) / 4) * (-7.99787-(-8.4147)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
        xx = 54.55075 + (((tickAnim - 22) / 3) * (12.77194-(54.55075)));
        yy = -7.12755 + (((tickAnim - 22) / 3) * (-3.12056-(-7.12755)));
        zz = -7.99787 + (((tickAnim - 22) / 3) * (-7.58105-(-7.99787)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
        xx = 12.77194 + (((tickAnim - 25) / 3) * (7.24889-(12.77194)));
        yy = -3.12056 + (((tickAnim - 25) / 3) * (0.08503-(-3.12056)));
        zz = -7.58105 + (((tickAnim - 25) / 3) * (-7.24759-(-7.58105)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 7.24889 + (((tickAnim - 28) / 2) * (7.50113-(7.24889)));
        yy = 0.08503 + (((tickAnim - 28) / 2) * (-13.92735-(0.08503)));
        zz = -7.24759 + (((tickAnim - 28) / 2) * (-8.29272-(-7.24759)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = 0.25 + (((tickAnim - 0) / 4) * (0.24-(0.25)));
        zz = 0 + (((tickAnim - 0) / 4) * (0.38-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = 0.24 + (((tickAnim - 4) / 4) * (0-(0.24)));
        zz = 0.38 + (((tickAnim - 4) / 4) * (0.675-(0.38)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
        xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 8) / 4) * (1.455-(0)));
        zz = 0.675 + (((tickAnim - 8) / 4) * (1.155-(0.675)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
        xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        yy = 1.455 + (((tickAnim - 12) / 3) * (1.175-(1.455)));
        zz = 1.155 + (((tickAnim - 12) / 3) * (0.5-(1.155)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        yy = 1.175 + (((tickAnim - 15) / 7) * (1.375-(1.175)));
        zz = 0.5 + (((tickAnim - 15) / 7) * (0.25-(0.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        yy = 1.375 + (((tickAnim - 22) / 6) * (0.675-(1.375)));
        zz = 0.25 + (((tickAnim - 22) / 6) * (0-(0.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        yy = 0.675 + (((tickAnim - 28) / 2) * (0.25-(0.675)));
        zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDicynodon entity = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-50))*3), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*6), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-390))*1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-6), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*4));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.55);



         if (tickAnim >= 0 && tickAnim < 9) {
        xx = -32.38842 + (((tickAnim - 0) / 9) * (-5.09475-(-32.38842)));
        yy = 34.77141 + (((tickAnim - 0) / 9) * (-23.30715-(34.77141)));
        zz = -2.13331 + (((tickAnim - 0) / 9) * (-9.42244-(-2.13331)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = -5.09475 + (((tickAnim - 9) / 4) * (-20.96396-(-5.09475)));
        yy = -23.30715 + (((tickAnim - 9) / 4) * (5.59841-(-23.30715)));
        zz = -9.42244 + (((tickAnim - 9) / 4) * (-28.46828-(-9.42244)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = -20.96396 + (((tickAnim - 13) / 5) * (-32.38842-(-20.96396)));
        yy = 5.59841 + (((tickAnim - 13) / 5) * (34.77141-(5.59841)));
        zz = -28.46828 + (((tickAnim - 13) / 5) * (-2.13331-(-28.46828)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 19.93177 + (((tickAnim - 0) / 5) * (24.37996-(19.93177)));
        yy = -31.22038 + (((tickAnim - 0) / 5) * (-3.31714-(-31.22038)));
        zz = -23.46731 + (((tickAnim - 0) / 5) * (-7.62073-(-23.46731)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
        xx = 24.37996 + (((tickAnim - 5) / 4) * (61.83286-(24.37996)));
        yy = -3.31714 + (((tickAnim - 5) / 4) * (22.04944-(-3.31714)));
        zz = -7.62073 + (((tickAnim - 5) / 4) * (6.78525-(-7.62073)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 61.83286 + (((tickAnim - 9) / 4) * (6.64993-(61.83286)));
        yy = 22.04944 + (((tickAnim - 9) / 4) * (-6.15223-(22.04944)));
        zz = 6.78525 + (((tickAnim - 9) / 4) * (-9.23081-(6.78525)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = 6.64993 + (((tickAnim - 13) / 5) * (19.93177-(6.64993)));
        yy = -6.15223 + (((tickAnim - 13) / 5) * (-31.22038-(-6.15223)));
        zz = -9.23081 + (((tickAnim - 13) / 5) * (-23.46731-(-9.23081)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 9 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 9) / 4) * (-0.775-(0)));
        yy = 0 + (((tickAnim - 9) / 4) * (0.775-(0)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = -0.775 + (((tickAnim - 13) / 5) * (0-(-0.775)));
        yy = 0.775 + (((tickAnim - 13) / 5) * (0-(0.775)));
        zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
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
        xx = 18.68602 + (((tickAnim - 0) / 3) * (5.5-(18.68602)));
        yy = 4.07445 + (((tickAnim - 0) / 3) * (0-(4.07445)));
        zz = 4.52532 + (((tickAnim - 0) / 3) * (11.25-(4.52532)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
        xx = 5.5 + (((tickAnim - 3) / 3) * (3.28386-(5.5)));
        yy = 0 + (((tickAnim - 3) / 3) * (0.53586-(0)));
        zz = 11.25 + (((tickAnim - 3) / 3) * (12.85528-(11.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
        xx = 3.28386 + (((tickAnim - 6) / 1) * (13.48847-(3.28386)));
        yy = 0.53586 + (((tickAnim - 6) / 1) * (0.38276-(0.53586)));
        zz = 12.85528 + (((tickAnim - 6) / 1) * (9.18234-(12.85528)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
        xx = 13.48847 + (((tickAnim - 7) / 2) * (56.5-(13.48847)));
        yy = 0.38276 + (((tickAnim - 7) / 2) * (0-(0.38276)));
        zz = 9.18234 + (((tickAnim - 7) / 2) * (0-(9.18234)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
        xx = 56.5 + (((tickAnim - 9) / 2) * (98.82482-(56.5)));
        yy = 0 + (((tickAnim - 9) / 2) * (0.9587-(0)));
        zz = 0 + (((tickAnim - 9) / 2) * (1.06478-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
        xx = 98.82482 + (((tickAnim - 11) / 2) * (77.48084-(98.82482)));
        yy = 0.9587 + (((tickAnim - 11) / 2) * (2.15706-(0.9587)));
        zz = 1.06478 + (((tickAnim - 11) / 2) * (2.39576-(1.06478)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = 77.48084 + (((tickAnim - 13) / 5) * (18.68602-(77.48084)));
        yy = 2.15706 + (((tickAnim - 13) / 5) * (4.07445-(2.15706)));
        zz = 2.39576 + (((tickAnim - 13) / 5) * (4.52532-(2.39576)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0.675-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        yy = 0.675 + (((tickAnim - 3) / 4) * (0.43-(0.675)));
        zz = 0 + (((tickAnim - 3) / 4) * (0.9-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        yy = 0.43 + (((tickAnim - 7) / 1) * (0.93-(0.43)));
        zz = 0.9 + (((tickAnim - 7) / 1) * (1.115-(0.9)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        yy = 0.93 + (((tickAnim - 8) / 1) * (0.55-(0.93)));
        zz = 1.115 + (((tickAnim - 8) / 1) * (0-(1.115)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        yy = 0.55 + (((tickAnim - 9) / 4) * (1.285-(0.55)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        yy = 1.285 + (((tickAnim - 13) / 5) * (0-(1.285)));
        zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = -5.09475 + (((tickAnim - 0) / 4) * (-20.96396-(-5.09475)));
        yy = 23.30715 + (((tickAnim - 0) / 4) * (-5.59841-(23.30715)));
        zz = 9.42244 + (((tickAnim - 0) / 4) * (28.46828-(9.42244)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = -20.96396 + (((tickAnim - 4) / 4) * (-32.38842-(-20.96396)));
        yy = -5.59841 + (((tickAnim - 4) / 4) * (-34.77141-(-5.59841)));
        zz = 28.46828 + (((tickAnim - 4) / 4) * (2.13331-(28.46828)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = -32.38842 + (((tickAnim - 8) / 10) * (-5.09475-(-32.38842)));
        yy = -34.77141 + (((tickAnim - 8) / 10) * (23.30715-(-34.77141)));
        zz = 2.13331 + (((tickAnim - 8) / 10) * (9.42244-(2.13331)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 61.83286 + (((tickAnim - 0) / 4) * (6.64993-(61.83286)));
        yy = -22.04944 + (((tickAnim - 0) / 4) * (6.15223-(-22.04944)));
        zz = -6.78525 + (((tickAnim - 0) / 4) * (9.23081-(-6.78525)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 6.64993 + (((tickAnim - 4) / 4) * (19.93177-(6.64993)));
        yy = 6.15223 + (((tickAnim - 4) / 4) * (31.22038-(6.15223)));
        zz = 9.23081 + (((tickAnim - 4) / 4) * (23.46731-(9.23081)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = 19.93177 + (((tickAnim - 8) / 10) * (61.83286-(19.93177)));
        yy = 31.22038 + (((tickAnim - 8) / 10) * (-22.04944-(31.22038)));
        zz = 23.46731 + (((tickAnim - 8) / 10) * (-6.78525-(23.46731)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0.775-(0)));
        yy = 0 + (((tickAnim - 0) / 4) * (0.775-(0)));
        zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0.775 + (((tickAnim - 4) / 4) * (0-(0.775)));
        yy = 0.775 + (((tickAnim - 4) / 4) * (0-(0.775)));
        zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
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
        xx = 56.5 + (((tickAnim - 0) / 2) * (98.82482-(56.5)));
        yy = 0 + (((tickAnim - 0) / 2) * (-0.9587-(0)));
        zz = 0 + (((tickAnim - 0) / 2) * (-1.06478-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
        xx = 98.82482 + (((tickAnim - 2) / 2) * (77.48084-(98.82482)));
        yy = -0.9587 + (((tickAnim - 2) / 2) * (-2.15706-(-0.9587)));
        zz = -1.06478 + (((tickAnim - 2) / 2) * (-2.39576-(-1.06478)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 77.48084 + (((tickAnim - 4) / 4) * (18.68602-(77.48084)));
        yy = -2.15706 + (((tickAnim - 4) / 4) * (-4.07445-(-2.15706)));
        zz = -2.39576 + (((tickAnim - 4) / 4) * (-4.52532-(-2.39576)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 18.68602 + (((tickAnim - 8) / 5) * (-18.57377-(18.68602)));
        yy = -4.07445 + (((tickAnim - 8) / 5) * (-5.52039-(-4.07445)));
        zz = -4.52532 + (((tickAnim - 8) / 5) * (-11.01429-(-4.52532)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = -18.57377 + (((tickAnim - 13) / 5) * (56.5-(-18.57377)));
        yy = -5.52039 + (((tickAnim - 13) / 5) * (0-(-5.52039)));
        zz = -11.01429 + (((tickAnim - 13) / 5) * (0-(-11.01429)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = 0.55 + (((tickAnim - 0) / 4) * (1.285-(0.55)));
        zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = 1.285 + (((tickAnim - 4) / 4) * (0-(1.285)));
        zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 8) / 3) * (0.805-(0)));
        zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        yy = 0.805 + (((tickAnim - 11) / 2) * (0.135-(0.805)));
        zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        yy = 0.135 + (((tickAnim - 13) / 2) * (0.715-(0.135)));
        zz = 0 + (((tickAnim - 13) / 2) * (0.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        yy = 0.715 + (((tickAnim - 15) / 3) * (0.55-(0.715)));
        zz = 0.725 + (((tickAnim - 15) / 3) * (0-(0.725)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-200))*4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*6), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-200))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-50))*6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*12));



         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 26.46142 + (((tickAnim - 0) / 4) * (11.74875-(26.46142)));
        yy = -37.54557 + (((tickAnim - 0) / 4) * (2.14868-(-37.54557)));
        zz = -11.3339 + (((tickAnim - 0) / 4) * (-31.81914-(-11.3339)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 11.74875 + (((tickAnim - 4) / 4) * (-3.05054-(11.74875)));
        yy = 2.14868 + (((tickAnim - 4) / 4) * (32.79311-(2.14868)));
        zz = -31.81914 + (((tickAnim - 4) / 4) * (-9.23381-(-31.81914)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
        xx = -3.05054 + (((tickAnim - 8) / 0) * (-2.74765-(-3.05054)));
        yy = 32.79311 + (((tickAnim - 8) / 0) * (25.683-(32.79311)));
        zz = -9.23381 + (((tickAnim - 8) / 0) * (-8.56844-(-9.23381)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = -2.74765 + (((tickAnim - 8) / 10) * (26.46142-(-2.74765)));
        yy = 25.683 + (((tickAnim - 8) / 10) * (-37.54557-(25.683)));
        zz = -8.56844 + (((tickAnim - 8) / 10) * (-11.3339-(-8.56844)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg1, backLeftLeg1.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg1.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 26.37852 + (((tickAnim - 0) / 4) * (9.02467-(26.37852)));
        yy = 25.54219 + (((tickAnim - 0) / 4) * (-7.76784-(25.54219)));
        zz = -20.7498 + (((tickAnim - 0) / 4) * (4.25066-(-20.7498)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 9.02467 + (((tickAnim - 4) / 4) * (-5-(9.02467)));
        yy = -7.76784 + (((tickAnim - 4) / 4) * (-36-(-7.76784)));
        zz = 4.25066 + (((tickAnim - 4) / 4) * (0-(4.25066)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
        xx = -5 + (((tickAnim - 8) / 0) * (-2.75-(-5)));
        yy = -36 + (((tickAnim - 8) / 0) * (-42.1-(-36)));
        zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = -2.75 + (((tickAnim - 8) / 10) * (26.37852-(-2.75)));
        yy = -42.1 + (((tickAnim - 8) / 10) * (25.54219-(-42.1)));
        zz = 0 + (((tickAnim - 8) / 10) * (-20.7498-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0.28-(0)));
        yy = 0 + (((tickAnim - 0) / 4) * (0.705-(0)));
        zz = 0 + (((tickAnim - 0) / 4) * (-0.19-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0.28 + (((tickAnim - 4) / 4) * (0-(0.28)));
        yy = 0.705 + (((tickAnim - 4) / 4) * (0-(0.705)));
        zz = -0.19 + (((tickAnim - 4) / 4) * (0-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 8) / 3) * (0.4-(0)));
        yy = 0 + (((tickAnim - 8) / 3) * (-1.595-(0)));
        zz = 0 + (((tickAnim - 8) / 3) * (-0.27-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
        xx = 0.4 + (((tickAnim - 11) / 7) * (0-(0.4)));
        yy = -1.595 + (((tickAnim - 11) / 7) * (0-(-1.595)));
        zz = -0.27 + (((tickAnim - 11) / 7) * (0-(-0.27)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 31.85261 + (((tickAnim - 0) / 2) * (70.69068-(31.85261)));
        yy = 14.34013 + (((tickAnim - 0) / 2) * (11.13454-(14.34013)));
        zz = 8.74815 + (((tickAnim - 0) / 2) * (8.4147-(8.74815)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
        xx = 70.69068 + (((tickAnim - 2) / 2) * (54.55075-(70.69068)));
        yy = 11.13454 + (((tickAnim - 2) / 2) * (7.12755-(11.13454)));
        zz = 8.4147 + (((tickAnim - 2) / 2) * (7.99787-(8.4147)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
        xx = 54.55075 + (((tickAnim - 4) / 2) * (12.77194-(54.55075)));
        yy = 7.12755 + (((tickAnim - 4) / 2) * (3.12056-(7.12755)));
        zz = 7.99787 + (((tickAnim - 4) / 2) * (7.58105-(7.99787)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
        xx = 12.77194 + (((tickAnim - 6) / 2) * (7.24889-(12.77194)));
        yy = 3.12056 + (((tickAnim - 6) / 2) * (-0.08503-(3.12056)));
        zz = 7.58105 + (((tickAnim - 6) / 2) * (7.24759-(7.58105)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
        xx = 7.24889 + (((tickAnim - 8) / 0) * (7.50113-(7.24889)));
        yy = -0.08503 + (((tickAnim - 8) / 0) * (13.92735-(-0.08503)));
        zz = 7.24759 + (((tickAnim - 8) / 0) * (8.29272-(7.24759)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 7.50113 + (((tickAnim - 8) / 5) * (1.57008-(7.50113)));
        yy = 13.92735 + (((tickAnim - 8) / 5) * (6.95618-(13.92735)));
        zz = 8.29272 + (((tickAnim - 8) / 5) * (22.35571-(8.29272)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = 1.57008 + (((tickAnim - 13) / 5) * (31.85261-(1.57008)));
        yy = 6.95618 + (((tickAnim - 13) / 5) * (14.34013-(6.95618)));
        zz = 22.35571 + (((tickAnim - 13) / 5) * (8.74815-(22.35571)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = 1.175 + (((tickAnim - 0) / 4) * (1.375-(1.175)));
        zz = 0.5 + (((tickAnim - 0) / 4) * (0.25-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = 1.375 + (((tickAnim - 4) / 4) * (-0.175-(1.375)));
        zz = 0.25 + (((tickAnim - 4) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        yy = -0.175 + (((tickAnim - 8) / 0) * (-0.1-(-0.175)));
        zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        yy = -0.1 + (((tickAnim - 8) / 3) * (0.24-(-0.1)));
        zz = 0 + (((tickAnim - 8) / 3) * (0.38-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        yy = 0.24 + (((tickAnim - 11) / 2) * (0-(0.24)));
        zz = 0.38 + (((tickAnim - 11) / 2) * (0.675-(0.38)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        yy = 0 + (((tickAnim - 13) / 2) * (1.455-(0)));
        zz = 0.675 + (((tickAnim - 13) / 2) * (1.155-(0.675)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        yy = 1.455 + (((tickAnim - 15) / 3) * (1.175-(1.455)));
        zz = 1.155 + (((tickAnim - 15) / 3) * (0.5-(1.155)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = -2.74765 + (((tickAnim - 0) / 8) * (26.46142-(-2.74765)));
        yy = -25.683 + (((tickAnim - 0) / 8) * (37.54557-(-25.683)));
        zz = 8.56844 + (((tickAnim - 0) / 8) * (11.3339-(8.56844)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 26.46142 + (((tickAnim - 8) / 5) * (11.74875-(26.46142)));
        yy = 37.54557 + (((tickAnim - 8) / 5) * (-2.14868-(37.54557)));
        zz = 11.3339 + (((tickAnim - 8) / 5) * (31.81914-(11.3339)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 11.74875 + (((tickAnim - 13) / 3) * (-3.05054-(11.74875)));
        yy = -2.14868 + (((tickAnim - 13) / 3) * (-32.79311-(-2.14868)));
        zz = 31.81914 + (((tickAnim - 13) / 3) * (9.23381-(31.81914)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = -3.05054 + (((tickAnim - 16) / 2) * (-2.74765-(-3.05054)));
        yy = -32.79311 + (((tickAnim - 16) / 2) * (-25.683-(-32.79311)));
        zz = 9.23381 + (((tickAnim - 16) / 2) * (8.56844-(9.23381)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg1, backRightLeg1.rotateAngleX + (float) Math.toRadians(xx), backRightLeg1.rotateAngleY + (float) Math.toRadians(yy), backRightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = -2.75 + (((tickAnim - 0) / 8) * (26.37852-(-2.75)));
        yy = 42.1 + (((tickAnim - 0) / 8) * (-25.54219-(42.1)));
        zz = 0 + (((tickAnim - 0) / 8) * (20.7498-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 26.37852 + (((tickAnim - 8) / 5) * (9.02467-(26.37852)));
        yy = -25.54219 + (((tickAnim - 8) / 5) * (7.76784-(-25.54219)));
        zz = 20.7498 + (((tickAnim - 8) / 5) * (-4.25066-(20.7498)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 9.02467 + (((tickAnim - 13) / 3) * (-5-(9.02467)));
        yy = 7.76784 + (((tickAnim - 13) / 3) * (36-(7.76784)));
        zz = -4.25066 + (((tickAnim - 13) / 3) * (0-(-4.25066)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = -5 + (((tickAnim - 16) / 2) * (-2.75-(-5)));
        yy = 36 + (((tickAnim - 16) / 2) * (42.1-(36)));
        zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0.55 + (((tickAnim - 0) / 3) * (0.4-(0.55)));
        yy = -0.45 + (((tickAnim - 0) / 3) * (-1.595-(-0.45)));
        zz = -0.375 + (((tickAnim - 0) / 3) * (-0.27-(-0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 0.4 + (((tickAnim - 3) / 5) * (0-(0.4)));
        yy = -1.595 + (((tickAnim - 3) / 5) * (0-(-1.595)));
        zz = -0.27 + (((tickAnim - 3) / 5) * (0-(-0.27)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0.28-(0)));
        yy = 0 + (((tickAnim - 8) / 5) * (0.705-(0)));
        zz = 0 + (((tickAnim - 8) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 0.28 + (((tickAnim - 13) / 3) * (0.55-(0.28)));
        yy = 0.705 + (((tickAnim - 13) / 3) * (-0.45-(0.705)));
        zz = -0.19 + (((tickAnim - 13) / 3) * (-0.375-(-0.19)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = 0.55 + (((tickAnim - 16) / 2) * (0.55-(0.55)));
        yy = -0.45 + (((tickAnim - 16) / 2) * (-0.45-(-0.45)));
        zz = -0.375 + (((tickAnim - 16) / 2) * (-0.375-(-0.375)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 7.50113 + (((tickAnim - 0) / 4) * (1.57008-(7.50113)));
        yy = -13.92735 + (((tickAnim - 0) / 4) * (-6.95618-(-13.92735)));
        zz = -8.29272 + (((tickAnim - 0) / 4) * (-22.35571-(-8.29272)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 1.57008 + (((tickAnim - 4) / 4) * (31.85261-(1.57008)));
        yy = -6.95618 + (((tickAnim - 4) / 4) * (-14.34013-(-6.95618)));
        zz = -22.35571 + (((tickAnim - 4) / 4) * (-8.74815-(-22.35571)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 31.85261 + (((tickAnim - 8) / 3) * (70.69068-(31.85261)));
        yy = -14.34013 + (((tickAnim - 8) / 3) * (-11.13454-(-14.34013)));
        zz = -8.74815 + (((tickAnim - 8) / 3) * (-8.4147-(-8.74815)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
        xx = 70.69068 + (((tickAnim - 11) / 2) * (54.55075-(70.69068)));
        yy = -11.13454 + (((tickAnim - 11) / 2) * (-7.12755-(-11.13454)));
        zz = -8.4147 + (((tickAnim - 11) / 2) * (-7.99787-(-8.4147)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
        xx = 54.55075 + (((tickAnim - 13) / 1) * (12.77194-(54.55075)));
        yy = -7.12755 + (((tickAnim - 13) / 1) * (-3.12056-(-7.12755)));
        zz = -7.99787 + (((tickAnim - 13) / 1) * (-7.58105-(-7.99787)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
        xx = 12.77194 + (((tickAnim - 14) / 2) * (7.24889-(12.77194)));
        yy = -3.12056 + (((tickAnim - 14) / 2) * (0.08503-(-3.12056)));
        zz = -7.58105 + (((tickAnim - 14) / 2) * (-7.24759-(-7.58105)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = 7.24889 + (((tickAnim - 16) / 2) * (7.50113-(7.24889)));
        yy = 0.08503 + (((tickAnim - 16) / 2) * (-13.92735-(0.08503)));
        zz = -7.24759 + (((tickAnim - 16) / 2) * (-8.29272-(-7.24759)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0.25 + (((tickAnim - 0) / 3) * (0.24-(0.25)));
        zz = 0 + (((tickAnim - 0) / 3) * (0.38-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        yy = 0.24 + (((tickAnim - 3) / 1) * (0-(0.24)));
        zz = 0.38 + (((tickAnim - 3) / 1) * (0.675-(0.38)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 4) / 3) * (1.455-(0)));
        zz = 0.675 + (((tickAnim - 4) / 3) * (1.155-(0.675)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        yy = 1.455 + (((tickAnim - 7) / 1) * (1.175-(1.455)));
        zz = 1.155 + (((tickAnim - 7) / 1) * (0.5-(1.155)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = 1.175 + (((tickAnim - 8) / 5) * (1.375-(1.175)));
        zz = 0.5 + (((tickAnim - 8) / 5) * (0.25-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        yy = 1.375 + (((tickAnim - 13) / 3) * (0.675-(1.375)));
        zz = 0.25 + (((tickAnim - 13) / 3) * (0-(0.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        yy = 0.675 + (((tickAnim - 16) / 2) * (0.25-(0.675)));
        zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDicynodon ee = (EntityPrehistoricFloraDicynodon) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDicynodon e = (EntityPrehistoricFloraDicynodon) entity;

    }
}
