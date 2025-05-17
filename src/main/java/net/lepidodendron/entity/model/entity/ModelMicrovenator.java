package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMicrovenator extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer microvenator;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer torso;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightPropatagiumExtention;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftPropatagiumExtention;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer headFluff2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer headFluff1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;


    private ModelAnimator animator;

    public ModelMicrovenator() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.microvenator = new AdvancedModelRenderer(this);
        this.microvenator.setRotationPoint(0.0F, 0.4F, -1.4F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.microvenator.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.549F, 3.1215F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 71, -4.0F, -0.2F, -4.0F, 8, 2, 9, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, -2.1F, 7.7F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 49, -7.0F, -1.4F, -9.0F, 8, 13, 8, 0.0F, false));

        this.torso = new AdvancedModelRenderer(this);
        this.torso.setRotationPoint(0.0F, -4.8362F, -1.1678F);
        this.hips.addChild(torso);
        this.torso.cubeList.add(new ModelBox(torso, 0, 38, -5.0F, -0.6638F, -9.4322F, 10, 12, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 10.7882F, -4.0324F);
        this.torso.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 112, -5.0F, 0.5F, 4.7F, 10, 1, 1, 0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 20, -5.0F, -0.5F, -5.3F, 10, 2, 10, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.2362F, -3.9322F);
        this.torso.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 0, -5.0F, -1.2F, -5.5F, 10, 2, 11, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 7.0239F, -15.7657F);
        this.torso.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 112, -3.5F, 1.0F, 3.0F, 7, 1, 1, 0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 77, 28, -3.5F, -2.0F, -3.0F, 7, 4, 6, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 3.6362F, -13.8322F);
        this.torso.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 112, -2.0F, 6.4F, 6.1F, 8, 1, 1, 0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 51, -2.0F, 3.4F, 0.1F, 8, 4, 6, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, 2.9362F, -16.5322F);
        this.torso.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 76, 39, -1.0F, -2.1F, -0.4F, 6, 3, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 2.9362F, -16.3322F);
        this.torso.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 14, -2.0F, -2.1F, -0.1F, 8, 3, 9, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, 3.7362F, -16.8322F);
        this.torso.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 63, -1.0F, -2.1F, 0.6F, 8, 9, 8, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.5536F, 5.3193F, -12.1772F);
        this.torso.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.9223F, -0.2293F, 0.1845F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 35, 0, -0.8772F, -0.7897F, -1.4178F, 2, 7, 3, 0.01F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 9, 97, -0.7772F, -0.7897F, -0.4178F, 0, 9, 4, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0067F, -1.0687F, -0.1484F);
        this.rightArm1.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 0, 0, -0.3839F, 1.0845F, -0.8777F, 1, 4, 2, -0.01F, true));

        this.rightPropatagiumExtention = new AdvancedModelRenderer(this);
        this.rightPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.rightUpperPropatagium.addChild(rightPropatagiumExtention);
        this.setRotateAngle(rightPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.rightPropatagiumExtention.cubeList.add(new ModelBox(rightPropatagiumExtention, 8, 0, -0.3839F, -0.811F, -2.2982F, 1, 2, 2, -0.03F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0249F, 6.0759F, -0.828F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.0944F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.5381F, -1.3652F);
        this.rightArm2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 91, 0.2661F, -0.317F, 1.1397F, 0, 8, 6, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 38, 0.1661F, 1.683F, -0.8603F, 2, 6, 2, 0.01F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(-1.0F, 3.9619F, -2.8652F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 41, 49, 0.6161F, -2.6062F, 0.5613F, 1, 5, 2, -0.02F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.0839F, 4.9822F, -0.1604F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.1781F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-10.0072F, 8.5145F, 6.0904F);
        this.rightHand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 19, 9.5F, -1.6F, -4.5F, 0, 4, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.4161F, 8.4775F, -0.3344F);
        this.rightHand.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.1839F, -8.4406F, 1.4997F, 0, 10, 7, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.1781F, 0.7969F, -0.6236F);
        this.rightHand.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 97, 1.6781F, -0.9468F, -1.2088F, 0, 10, 4, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(1.183F, 1.1857F, -1.5226F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 13, 19, -1.6325F, -0.8226F, -0.094F, 1, 4, 1, -0.02F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(4.5536F, 5.3193F, -12.1772F);
        this.torso.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9223F, 0.2293F, -0.1845F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 35, 0, -1.1228F, -0.7897F, -1.4178F, 2, 7, 3, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 9, 97, 0.7772F, -0.7897F, -0.4178F, 0, 9, 4, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(-0.0067F, -1.0687F, -0.1484F);
        this.leftArm1.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 0, 0, -0.6161F, 1.0845F, -0.8777F, 1, 4, 2, -0.01F, false));

        this.leftPropatagiumExtention = new AdvancedModelRenderer(this);
        this.leftPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.leftUpperPropatagium.addChild(leftPropatagiumExtention);
        this.setRotateAngle(leftPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.leftPropatagiumExtention.cubeList.add(new ModelBox(leftPropatagiumExtention, 8, 0, -0.6161F, -0.811F, -2.2982F, 1, 2, 2, -0.03F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0249F, 6.0759F, -0.828F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.0944F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -1.5381F, -1.3652F);
        this.leftArm2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 73, 91, -0.2661F, -0.317F, 1.1397F, 0, 8, 6, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 38, -2.1661F, 1.683F, -0.8603F, 2, 6, 2, 0.01F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(1.0F, 3.9619F, -2.8652F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 41, 49, -1.6161F, -2.6062F, 0.5613F, 1, 5, 2, -0.02F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0839F, 4.9822F, -0.1604F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.1781F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(10.0072F, 8.5145F, 6.0904F);
        this.leftHand.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 19, -9.5F, -1.6F, -4.5F, 0, 4, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4161F, 8.4775F, -0.3344F);
        this.leftHand.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.1839F, -8.4406F, 1.4997F, 0, 10, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.1781F, 0.7969F, -0.6236F);
        this.leftHand.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 97, -1.6781F, -0.9468F, -1.2088F, 0, 10, 4, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(-1.183F, 1.1857F, -1.5226F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 13, 19, 0.6325F, -0.8226F, -0.094F, 1, 4, 1, -0.02F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, 2.5991F, -15.3077F);
        this.torso.addChild(neck1);
        this.setRotateAngle(neck1, -0.0567F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.1371F, -1.5245F);
        this.neck1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 96, -3.0F, -2.2F, -2.9F, 5, 5, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4F, -3.6F);
        this.neck1.addChild(neck2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -4.4526F, -0.7447F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7418F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 33, -1.5F, 0.1F, -1.6F, 3, 1, 3, 0.005F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.4F, -2.1F);
        this.neck2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.0472F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 88, 83, -2.0F, -1.7F, -2.6F, 3, 4, 8, -0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -5.2F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.3881F, -1.1454F);
        this.neck3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6981F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 91, -1.5F, -0.7F, -2.0F, 3, 1, 4, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0371F, -0.9245F);
        this.neck3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.829F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 93, 14, -2.0F, -1.3F, -3.2F, 3, 4, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 3.7776F, 0.1564F);
        this.neck3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0785F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 101, -1.0F, -0.5F, -1.5F, 2, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -0.2588F, -4.9805F);
        this.neck3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6021F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 97, 0, -0.5F, -1.4F, 0.4707F, 2, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.33F, -2.4723F, -2.6122F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 39, 99, -1.67F, -1.5837F, -7.6026F, 3, 3, 3, 0.03F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.17F, -3.1724F, -3.2868F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.6109F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 61, -1.0F, 0.3523F, -0.6377F, 2, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.17F, -3.4789F, -5.4868F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 80, -1.0F, 0.2934F, -1.5358F, 2, 2, 3, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.17F, -2.6424F, -6.7276F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.8727F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 49, 87, -1.0F, -0.5212F, -2.8156F, 2, 2, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.67F, -0.8163F, -8.0252F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 33, -1.0F, 0.8947F, -0.678F, 3, 1, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.67F, -0.8072F, -7.9742F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 103, 96, -1.0F, 0.3947F, -0.878F, 3, 2, 2, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.17F, 1.2415F, -4.3271F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.6545F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 103, 83, -1.5F, -1.0F, -1.0F, 3, 2, 2, -0.021F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.17F, -1.0494F, -3.1482F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.6109F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 49, -2.0F, -1.8477F, 0.5624F, 4, 4, 3, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.17F, -1.8994F, -3.8886F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 91, 62, -2.0F, -0.6332F, -1.803F, 4, 4, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.17F, 0.6779F, -0.2894F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0661F, -3.7595F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1484F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 67, 0, -1.0F, 1.4788F, -5.0224F, 2, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.0661F, -3.7595F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4363F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 99, 46, -1.0F, -1.712F, -0.6173F, 3, 3, 3, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.0661F, -3.7595F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2618F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 98, 23, -1.0F, -0.0013F, -0.2611F, 3, 2, 4, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.0661F, -3.7595F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0436F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 31, 38, -1.0F, 0.8156F, -3.4788F, 3, 1, 6, 0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.3607F, -4.4193F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.7418F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.5373F, 5.2496F);
        this.throat.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.7941F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 66, 33, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.02F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.throat.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.096F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 99, 39, -0.5F, -0.6803F, 0.438F, 2, 2, 4, 0.01F, false));

        this.headFluff2 = new AdvancedModelRenderer(this);
        this.headFluff2.setRotationPoint(-0.17F, -1.077F, -0.8833F);
        this.head.addChild(headFluff2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.4156F, 0.7983F);
        this.headFluff2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.48F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 53, 14, -2.0F, -0.5F, -1.5F, 4, 1, 3, 0.03F, false));

        this.headFluff1 = new AdvancedModelRenderer(this);
        this.headFluff1.setRotationPoint(-0.17F, -2.4123F, -2.0362F);
        this.head.addChild(headFluff1);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.7509F, 1.9513F);
        this.headFluff1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0436F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 35, 14, -2.0F, -1.7F, -2.1F, 4, 1, 2, 0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.7522F, 6.9183F);
        this.hips.addChild(tail1);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.7F, 3.2F);
        this.tail1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1745F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 37, 85, -1.5F, 3.5F, -6.5F, 0, 2, 11, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 37, 85, 1.5F, 3.5F, -6.5F, 0, 2, 11, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 61, -2.5F, -2.5F, -6.5F, 5, 6, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 2.3522F, 6.8817F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 73, -2.0F, -1.3F, -0.8F, 3, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 50, 89, -1.0F, 1.7F, -0.8F, 1, 1, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.1F);
        this.tail2.addChild(tail3);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0F, 0.6021F, 4.0509F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.121F, -0.0367F, -0.4002F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 67, 0, -4.5F, -1.1F, -4.5F, 5, 0, 9, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.6021F, 4.0509F);
        this.tail3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.121F, 0.0367F, 0.4002F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 67, 81, -0.5F, -1.1F, -4.5F, 5, 0, 9, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.0F, -4.4F);
        this.tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1309F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 23, 83, -1.0F, -0.3F, 3.3F, 2, 2, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.1F, 8.4F);
        this.tail3.addChild(tail4);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.4329F, 0.0985F, 4.9464F);
        this.tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0403F, -0.0167F, -0.3924F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, -8.0F, -0.1745F, -5.0038F, 8, 0, 18, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5672F, 0.0985F, 4.9464F);
        this.tail4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0403F, 0.0167F, 0.3924F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 19, 0.0F, -0.1745F, -5.0038F, 8, 0, 18, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.4039F, 10.8397F);
        this.tail4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.4363F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 41, 38, -6.0F, -0.0181F, -0.0048F, 12, 0, 10, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0F, -0.1144F, 4.0859F);
        this.tail4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0436F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 22, 61, 0.0F, -0.2F, -4.1F, 1, 1, 7, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.3F, -0.4329F, 1.2949F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6545F, 0.0F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4363F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 15, 0, 1.6F, -0.6332F, 3.003F, 0, 10, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 79, -1.7F, -0.6332F, -3.997F, 4, 10, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.5519F, 1.0184F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2217F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 6.8854F, 2.869F);
        this.leftLeg2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0436F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 95, 77, -2.2F, -1.5693F, -3.2022F, 4, 1, 4, -0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 6.9054F, 2.8699F);
        this.leftLeg2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0436F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 86, 96, -2.2F, -7.5693F, -3.2022F, 4, 6, 4, -0.01F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 19, -2.0F, -7.5693F, -2.5022F, 3, 13, 3, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 12.1287F, 0.1908F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(1.0F, 0.75F, 1.55F);
        this.leftLeg3.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0873F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 61, -2.0F, -3.4344F, -1.7712F, 2, 8, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3491F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 99, 71, -1.5F, 0.9F, -2.5F, 3, 1, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 98, 30, -2.0F, 0.9F, -2.0F, 3, 1, 2, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.3F, -0.4329F, 1.2949F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.6545F, 0.0F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4363F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 15, 0, -1.6F, -0.6332F, 3.003F, 0, 10, 1, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 79, -2.3F, -0.6332F, -3.997F, 4, 10, 7, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.5519F, 1.0184F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2217F, 0.0F, 0.0F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 6.8854F, 2.869F);
        this.rightLeg2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0436F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 95, 77, -1.8F, -1.5693F, -3.2022F, 4, 1, 4, -0.01F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 6.9054F, 2.8699F);
        this.rightLeg2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0436F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 86, 96, -1.8F, -7.5693F, -3.2022F, 4, 6, 4, -0.01F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 19, -1.0F, -7.5693F, -2.5022F, 3, 13, 3, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 12.1287F, 0.1908F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0F, 0.75F, 1.55F);
        this.rightLeg3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 61, 0.0F, -3.4344F, -1.7712F, 2, 8, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 99, 71, -1.5F, 0.9F, -2.5F, 3, 1, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 98, 30, -1.0F, 0.9F, -2.0F, 3, 1, 2, 0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.microvenator.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.microvenator.offsetY = -0.01F;
        this.microvenator.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.microvenator.offsetY = -0.4F;
        this.microvenator.offsetX = 0.1F;
        this.microvenator.offsetZ = 2.0F;
        this.microvenator.rotateAngleY = (float)Math.toRadians(130);
        this.microvenator.rotateAngleX = (float)Math.toRadians(0);
        this.microvenator.rotateAngleZ = (float)Math.toRadians(0);
        this.microvenator.scaleChildren = true;
        float scaler = 0.8F;
        this.microvenator.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.microvenator.render(f);
        //Reset rotations, positions and sizing:
        this.microvenator.setScale(1.0F, 1.0F, 1.0F);
        this.microvenator.scaleChildren = false;
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

        EntityPrehistoricFloraMicrovenator entityMicrovenator = (EntityPrehistoricFloraMicrovenator) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityMicrovenator.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityMicrovenator.getAnimation() == entityMicrovenator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityMicrovenator.isReallyInWater()) {

                if (f3 == 0.0F || !entityMicrovenator.getIsMoving()) {
                    if (entityMicrovenator.getAnimation() != entityMicrovenator.EAT_ANIMATION
                            && entityMicrovenator.getAnimation() != entityMicrovenator.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityMicrovenator.getIsFast()) { //Running


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
        EntityPrehistoricFloraMicrovenator ee = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 19.75 + (((tickAnim - 42) / 11) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = 19.75 + (((tickAnim - 53) / 11) * (6.5-(19.75)));
            yy = 0 + (((tickAnim - 53) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 11) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = 6.5 + (((tickAnim - 64) / 36) * (19.75-(6.5)));
            yy = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 19.75 + (((tickAnim - 100) / 20) * (0-(19.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (-4.275-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = -4.275 + (((tickAnim - 42) / 11) * (-4.275-(-4.275)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 53) / 11) * (0-(0)));
            yy = -4.275 + (((tickAnim - 53) / 11) * (-4.275-(-4.275)));
            zz = 0 + (((tickAnim - 53) / 11) * (-0.45-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            yy = -4.275 + (((tickAnim - 64) / 36) * (-4.275-(-4.275)));
            zz = -0.45 + (((tickAnim - 64) / 36) * (0-(-0.45)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -4.275 + (((tickAnim - 100) / 20) * (0-(-4.275)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)) + (((tickAnim - 42) / 11) * (-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))-(-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)))));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = -12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)) + (((tickAnim - 53) / 11) * (-25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))-(-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)))));
            yy = 0 + (((tickAnim - 53) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 11) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)) + (((tickAnim - 64) / 36) * (-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))-(-25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)))));
            yy = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)) + (((tickAnim - 100) / 20) * (0-(-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)))));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-54.99207-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (-37.23401-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -54.99207 + (((tickAnim - 42) / 11) * (-54.99207-(-54.99207)));
            yy = -37.23401 + (((tickAnim - 42) / 11) * (-37.23401-(-37.23401)));
            zz = 87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 42) / 11) * (87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = -54.99207 + (((tickAnim - 53) / 11) * (-3.063-(-54.99207)));
            yy = -37.23401 + (((tickAnim - 53) / 11) * (3.89608-(-37.23401)));
            zz = 87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 53) / 11) * (0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -3.063 + (((tickAnim - 64) / 36) * (-54.99207-(-3.063)));
            yy = 3.89608 + (((tickAnim - 64) / 36) * (-37.23401-(3.89608)));
            zz = 0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 64) / 36) * (87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -54.99207 + (((tickAnim - 100) / 20) * (0-(-54.99207)));
            yy = -37.23401 + (((tickAnim - 100) / 20) * (0-(-37.23401)));
            zz = 87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 100) / 20) * (0-(87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 32 + (((tickAnim - 42) / 58) * (32-(32)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 32 + (((tickAnim - 100) / 20) * (0-(32)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-54.99207-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (37.23401-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -54.99207 + (((tickAnim - 42) / 11) * (-54.99207-(-54.99207)));
            yy = 37.23401 + (((tickAnim - 42) / 11) * (37.23401-(37.23401)));
            zz = -87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 42) / 11) * (-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = -54.99207 + (((tickAnim - 53) / 11) * (-3.063-(-54.99207)));
            yy = 37.23401 + (((tickAnim - 53) / 11) * (-3.89608-(37.23401)));
            zz = -87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 53) / 11) * (-0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -3.063 + (((tickAnim - 64) / 36) * (-54.99207-(-3.063)));
            yy = -3.89608 + (((tickAnim - 64) / 36) * (37.23401-(-3.89608)));
            zz = -0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 64) / 36) * (-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(-0.0497743538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -54.99207 + (((tickAnim - 100) / 20) * (0-(-54.99207)));
            yy = 37.23401 + (((tickAnim - 100) / 20) * (0-(37.23401)));
            zz = -87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 100) / 20) * (0-(-87.0861888603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 32 + (((tickAnim - 42) / 58) * (32-(32)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 32 + (((tickAnim - 100) / 20) * (0-(32)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = -17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)) + (((tickAnim - 42) / 58) * (-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))-(-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)))));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)) + (((tickAnim - 100) / 20) * (0-(-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)))));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0.325-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            yy = -1 + (((tickAnim - 42) / 58) * (-1-(-1)));
            zz = 0.325 + (((tickAnim - 42) / 58) * (0.325-(0.325)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -1 + (((tickAnim - 100) / 20) * (0-(-1)));
            zz = 0.325 + (((tickAnim - 100) / 20) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)) + (((tickAnim - 42) / 58) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)))));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)) + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)))));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = -19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200)) + (((tickAnim - 42) / 58) * (-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))-(-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200)))));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200)) + (((tickAnim - 100) / 20) * (0-(-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200)))));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -12.5 + (((tickAnim - 50) / 14) * (22.75-(-12.5)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 14) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 22.75 + (((tickAnim - 64) / 6) * (-12.5-(22.75)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -12.5 + (((tickAnim - 70) / 5) * (22.75-(-12.5)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 22.75 + (((tickAnim - 75) / 25) * (-12.5-(22.75)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -12.5 + (((tickAnim - 100) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 50) / 14) * (14.75-(0)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 14) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 14.75 + (((tickAnim - 64) / 6) * (0-(14.75)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 14.75 + (((tickAnim - 75) / 25) * (0-(14.75)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -31.5 + (((tickAnim - 42) / 8) * (-24.5-(-31.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -24.5 + (((tickAnim - 50) / 14) * (-85.23-(-24.5)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 14) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -85.23 + (((tickAnim - 64) / 6) * (-24.5-(-85.23)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -24.5 + (((tickAnim - 70) / 5) * (-85.23-(-24.5)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -85.23 + (((tickAnim - 75) / 25) * (-25-(-85.23)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -25 + (((tickAnim - 100) / 20) * (0-(-25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (1.725-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0.1-(0)));
            zz = 1.725 + (((tickAnim - 42) / 8) * (1.73-(1.725)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            yy = 0.1 + (((tickAnim - 50) / 14) * (-1.98-(0.1)));
            zz = 1.73 + (((tickAnim - 50) / 14) * (2.13-(1.73)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = -1.98 + (((tickAnim - 64) / 6) * (0.1-(-1.98)));
            zz = 2.13 + (((tickAnim - 64) / 6) * (1.73-(2.13)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 70) / 5) * (-1.98-(0.1)));
            zz = 1.73 + (((tickAnim - 70) / 5) * (2.13-(1.73)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -1.98 + (((tickAnim - 75) / 25) * (0-(-1.98)));
            zz = 2.13 + (((tickAnim - 75) / 25) * (1.725-(2.13)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 1.725 + (((tickAnim - 100) / 20) * (0-(1.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 0) / 42) * (1.4025-(1)));
            yy = 1 + (((tickAnim - 0) / 42) * (2.24-(1)));
            zz = 1 + (((tickAnim - 0) / 42) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 1.4025 + (((tickAnim - 42) / 22) * (1.055-(1.4025)));
            yy = 2.24 + (((tickAnim - 42) / 22) * (2.24-(2.24)));
            zz = 1 + (((tickAnim - 42) / 22) * (0.585-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 1.055 + (((tickAnim - 64) / 6) * (1.51-(1.055)));
            yy = 2.24 + (((tickAnim - 64) / 6) * (2.24-(2.24)));
            zz = 0.585 + (((tickAnim - 64) / 6) * (1-(0.585)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1.51 + (((tickAnim - 70) / 5) * (1.055-(1.51)));
            yy = 2.24 + (((tickAnim - 70) / 5) * (2.24-(2.24)));
            zz = 1 + (((tickAnim - 70) / 5) * (0.585-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 1.055 + (((tickAnim - 75) / 25) * (1.4025-(1.055)));
            yy = 2.24 + (((tickAnim - 75) / 25) * (2.24-(2.24)));
            zz = 0.585 + (((tickAnim - 75) / 25) * (1-(0.585)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 1.4025 + (((tickAnim - 100) / 20) * (1-(1.4025)));
            yy = 2.24 + (((tickAnim - 100) / 20) * (1-(2.24)));
            zz = 1 + (((tickAnim - 100) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 9.75 + (((tickAnim - 42) / 11) * (9.75-(9.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)) + (((tickAnim - 42) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000)))));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = 9.75 + (((tickAnim - 53) / 11) * (-13.25-(9.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 53) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
            zz = 0 + (((tickAnim - 53) / 11) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -13.25 + (((tickAnim - 64) / 36) * (19-(-13.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 64) / 36) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 19 + (((tickAnim - 100) / 20) * (0-(19)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 15 + (((tickAnim - 42) / 22) * (4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*25-(15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3 + (((tickAnim - 42) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3)));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 83) {
            xx = 4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*25 + (((tickAnim - 64) / 19) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*35-(4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3 + (((tickAnim - 64) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3)));
            zz = 0 + (((tickAnim - 64) / 19) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*35 + (((tickAnim - 83) / 17) * (15-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3 + (((tickAnim - 83) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 15 + (((tickAnim - 100) / 20) * (0-(15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3 + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*3)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 19.25 + (((tickAnim - 42) / 22) * (13-(19.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)) + (((tickAnim - 42) / 22) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)))));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 83) {
            xx = 13 + (((tickAnim - 64) / 19) * (-5.8937144808+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*40-(13)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)) + (((tickAnim - 64) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)))));
            zz = 0 + (((tickAnim - 64) / 19) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = -5.8937144808+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*40 + (((tickAnim - 83) / 17) * (19.25-(-5.8937144808+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*40)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)) + (((tickAnim - 83) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100)))));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 19.25 + (((tickAnim - 100) / 20) * (0-(19.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5 + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 42) / 22) * (-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-35-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)) + (((tickAnim - 42) / 22) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)))));
            zz = 0 + (((tickAnim - 42) / 22) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 83) {
            xx = -2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-35 + (((tickAnim - 64) / 19) * (-0.36078-(-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-35)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)) + (((tickAnim - 64) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)))));
            zz = 0 + (((tickAnim - 64) / 19) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = -0.36078 + (((tickAnim - 83) / 17) * (22.75-(-0.36078)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)) + (((tickAnim - 83) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150)))));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 22.75 + (((tickAnim - 100) / 20) * (0-(22.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*10 + (((tickAnim - 100) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*10)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 22) * (-0.725-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 64) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 19) * (0-(0)));
            zz = -0.725 + (((tickAnim - 64) / 19) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 83 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 83) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 37) * (0-(0)));
            zz = -0.725 + (((tickAnim - 83) / 37) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -19.25 + (((tickAnim - 42) / 11) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = -19.25 + (((tickAnim - 53) / 11) * (-4.75-(-19.25)));
            yy = 0 + (((tickAnim - 53) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 11) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -4.75 + (((tickAnim - 64) / 36) * (-19.25-(-4.75)));
            yy = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -19.25 + (((tickAnim - 100) / 20) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 12.5 + (((tickAnim - 42) / 58) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 100) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = -36.75 + (((tickAnim - 42) / 58) * (-36.75-(-36.75)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -36.75 + (((tickAnim - 100) / 20) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            yy = 1.15 + (((tickAnim - 42) / 58) * (1.15-(1.15)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 1.15 + (((tickAnim - 100) / 20) * (0-(1.15)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 23 + (((tickAnim - 42) / 58) * (23-(23)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 23 + (((tickAnim - 100) / 20) * (0-(23)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 58) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 100) / 20) * (0-(0.175)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -19.25 + (((tickAnim - 42) / 11) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 64) {
            xx = -19.25 + (((tickAnim - 53) / 11) * (-4.75-(-19.25)));
            yy = 0 + (((tickAnim - 53) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 11) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -4.75 + (((tickAnim - 64) / 36) * (-19.25-(-4.75)));
            yy = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -19.25 + (((tickAnim - 100) / 20) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 12.5 + (((tickAnim - 42) / 58) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 100) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (-36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = -36.75 + (((tickAnim - 42) / 58) * (-36.75-(-36.75)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -36.75 + (((tickAnim - 100) / 20) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            yy = 1.15 + (((tickAnim - 42) / 58) * (1.15-(1.15)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 1.15 + (((tickAnim - 100) / 20) * (0-(1.15)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 23 + (((tickAnim - 42) / 58) * (23-(23)));
            yy = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 23 + (((tickAnim - 100) / 20) * (0-(23)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 42) / 58) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 58) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 42) / 58) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 100) / 20) * (0-(0.175)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38.75 + (((tickAnim - 15) / 20) * (38.75-(38.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 38.75 + (((tickAnim - 35) / 15) * (0-(38.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38.75 + (((tickAnim - 15) / 20) * (38.75-(38.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 38.75 + (((tickAnim - 35) / 15) * (0-(38.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 15) / 20) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.25 + (((tickAnim - 35) / 15) * (0-(-16.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-5.025-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.025 + (((tickAnim - 15) / 20) * (-5.025-(-5.025)));
            zz = -0.8 + (((tickAnim - 15) / 20) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.025 + (((tickAnim - 35) / 15) * (0-(-5.025)));
            zz = -0.8 + (((tickAnim - 35) / 15) * (0-(-0.8)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 15) / 20) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 15) / 20) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 35) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 7) / 8) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 40) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 15) / 20) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 35) / 5) * (7.25-(15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 7.25 + (((tickAnim - 40) / 4) * (-5.02-(7.25)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.02 + (((tickAnim - 44) / 6) * (0-(-5.02)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 12) / 13) * (17.75-(-3.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 17.75 + (((tickAnim - 25) / 10) * (0-(17.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0.65-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0.65 + (((tickAnim - 25) / 10) * (0-(0.65)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -4.5 + (((tickAnim - 12) / 13) * (-27.25-(-4.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 25) / 10) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.1 + (((tickAnim - 12) / 13) * (-0.85-(-0.1)));
            zz = 0.25 + (((tickAnim - 12) / 13) * (0.925-(0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -0.85 + (((tickAnim - 25) / 10) * (0-(-0.85)));
            zz = 0.925 + (((tickAnim - 25) / 10) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -18.75 + (((tickAnim - 12) / 23) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 20.25 + (((tickAnim - 12) / 13) * (-5-(20.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 25) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (20.5-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 20.5 + (((tickAnim - 25) / 6) * (0-(20.5)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -20.5 + (((tickAnim - 12) / 23) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1.4125-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1.8625-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1.4125 + (((tickAnim - 12) / 13) * (1-(1.4125)));
            yy = 1.8625 + (((tickAnim - 12) / 13) * (1-(1.8625)));
            zz = 1 + (((tickAnim - 12) / 13) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 47.5 + (((tickAnim - 12) / 13) * (0-(47.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFluff2, headFluff2.rotateAngleX + (float) Math.toRadians(xx), headFluff2.rotateAngleY + (float) Math.toRadians(yy), headFluff2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 41 + (((tickAnim - 12) / 13) * (0-(41)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFluff1, headFluff1.rotateAngleX + (float) Math.toRadians(xx), headFluff1.rotateAngleY + (float) Math.toRadians(yy), headFluff1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 10) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 39.75 + (((tickAnim - 10) / 10) * (0-(39.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 10) / 10) * (0-(0.7)));
            zz = -1.725 + (((tickAnim - 10) / 10) * (0-(-1.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 43.5 + (((tickAnim - 10) / 10) * (0-(43.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.38 + (((tickAnim - 5) / 5) * (-28.75-(10.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -28.75 + (((tickAnim - 10) / 5) * (6.63-(-28.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.63 + (((tickAnim - 15) / 5) * (0-(6.63)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11.75 + (((tickAnim - 5) / 5) * (0-(11.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 15.25 + (((tickAnim - 38) / 42) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 42) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 15.25 + (((tickAnim - 80) / 20) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 15.25 + (((tickAnim - 100) / 46) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = 15.25 + (((tickAnim - 146) / 34) * (0-(15.25)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0.45-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            yy = -0.55 + (((tickAnim - 38) / 42) * (-0.55-(-0.55)));
            zz = 0.45 + (((tickAnim - 38) / 42) * (0.45-(0.45)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -0.55 + (((tickAnim - 80) / 20) * (-0.55-(-0.55)));
            zz = 0.45 + (((tickAnim - 80) / 20) * (0.225-(0.45)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            yy = -0.55 + (((tickAnim - 100) / 46) * (-0.55-(-0.55)));
            zz = 0.225 + (((tickAnim - 100) / 46) * (0.225-(0.225)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            yy = -0.55 + (((tickAnim - 146) / 34) * (0-(-0.55)));
            zz = 0.225 + (((tickAnim - 146) / 34) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 38) / 12) * (12.25-(5.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 12.25 + (((tickAnim - 50) / 5) * (10.75-(12.25)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 10.75 + (((tickAnim - 55) / 25) * (4.5-(10.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 4.5 + (((tickAnim - 80) / 20) * (9.5-(4.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 9.5 + (((tickAnim - 100) / 8) * (9-(9.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 9 + (((tickAnim - 108) / 5) * (9.5-(9)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 128) {
            xx = 9.5 + (((tickAnim - 113) / 15) * (9-(9.5)));
            yy = 0 + (((tickAnim - 113) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 15) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 136) {
            xx = 9 + (((tickAnim - 128) / 8) * (9.5-(9)));
            yy = 0 + (((tickAnim - 128) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 8) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 146) {
            xx = 9.5 + (((tickAnim - 136) / 10) * (8.5-(9.5)));
            yy = 0 + (((tickAnim - 136) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 10) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = 8.5 + (((tickAnim - 146) / 34) * (0-(8.5)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 22.5 + (((tickAnim - 38) / 42) * (29.75-(22.5)));
            yy = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 42) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 146) {
            xx = 29.75 + (((tickAnim - 80) / 66) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 80) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 66) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = 29.75 + (((tickAnim - 146) / 34) * (0-(29.75)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 146) {
            xx = -27.75 + (((tickAnim - 38) / 108) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 38) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 108) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -27.75 + (((tickAnim - 146) / 34) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 146) {
            xx = 29.75 + (((tickAnim - 80) / 66) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 80) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 66) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = 29.75 + (((tickAnim - 146) / 34) * (0-(29.75)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 146) {
            xx = -25.5 + (((tickAnim - 80) / 66) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 80) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 66) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -25.5 + (((tickAnim - 146) / 34) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 38) / 12) * (26.75-(17.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 26.75 + (((tickAnim - 50) / 5) * (25.25-(26.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 25.25 + (((tickAnim - 55) / 25) * (12.75-(25.25)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 12.75 + (((tickAnim - 80) / 20) * (31.25-(12.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 31.25 + (((tickAnim - 100) / 8) * (27.25-(31.25)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 27.25 + (((tickAnim - 108) / 5) * (31.25-(27.25)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 128) {
            xx = 31.25 + (((tickAnim - 113) / 15) * (25-(31.25)));
            yy = 0 + (((tickAnim - 113) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 15) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 136) {
            xx = 25 + (((tickAnim - 128) / 8) * (31.25-(25)));
            yy = 0 + (((tickAnim - 128) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 8) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 165) {
            xx = 31.25 + (((tickAnim - 136) / 29) * (10.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(31.25)));
            yy = 0 + (((tickAnim - 136) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 29) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 10.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 165) / 15) * (0-(10.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.725 + (((tickAnim - 38) / 12) * (0.805-(0.725)));
            zz = 0 + (((tickAnim - 38) / 12) * (-1.975-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0.805 + (((tickAnim - 50) / 30) * (0.3-(0.805)));
            zz = -1.975 + (((tickAnim - 50) / 30) * (0-(-1.975)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 80) / 20) * (0.9-(0.3)));
            zz = 0 + (((tickAnim - 80) / 20) * (-1.7-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 100) / 8) * (0.9-(0.9)));
            zz = -1.7 + (((tickAnim - 100) / 8) * (-1.6-(-1.7)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = 0.9 + (((tickAnim - 108) / 5) * (0.9-(0.9)));
            zz = -1.6 + (((tickAnim - 108) / 5) * (-1.7-(-1.6)));
        }
        else if (tickAnim >= 113 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 113) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 113) / 15) * (0.9-(0.9)));
            zz = -1.7 + (((tickAnim - 113) / 15) * (-1.6-(-1.7)));
        }
        else if (tickAnim >= 128 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 128) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 128) / 8) * (0.9-(0.9)));
            zz = -1.6 + (((tickAnim - 128) / 8) * (-1.7-(-1.6)));
        }
        else if (tickAnim >= 136 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 136) / 29) * (0-(0)));
            yy = 0.9 + (((tickAnim - 136) / 29) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0.9)));
            zz = -1.7 + (((tickAnim - 136) / 29) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-1.7)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 165) / 15) * (0-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            zz = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 165) / 15) * (0-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (36.75-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 36.75 + (((tickAnim - 50) / 5) * (33.25-(36.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 33.25 + (((tickAnim - 55) / 25) * (24.75-(33.25)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 24.75 + (((tickAnim - 80) / 20) * (41.25-(24.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 41.25 + (((tickAnim - 100) / 8) * (36-(41.25)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 36 + (((tickAnim - 108) / 5) * (41.25-(36)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 128) {
            xx = 41.25 + (((tickAnim - 113) / 15) * (34.5-(41.25)));
            yy = 0 + (((tickAnim - 113) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 15) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 136) {
            xx = 34.5 + (((tickAnim - 128) / 8) * (41.25-(34.5)));
            yy = 0 + (((tickAnim - 128) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 8) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 165) {
            xx = 41.25 + (((tickAnim - 136) / 29) * (-8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25-(41.25)));
            yy = 0 + (((tickAnim - 136) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 29) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25 + (((tickAnim - 165) / 15) * (0-(-8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 38) / 12) * (0.25-(5.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0.25 + (((tickAnim - 50) / 5) * (7.25-(0.25)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 7.25 + (((tickAnim - 55) / 25) * (7.5-(7.25)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 7.5 + (((tickAnim - 80) / 20) * (4.5-(7.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 4.5 + (((tickAnim - 100) / 13) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 136) {
            xx = 4.5 + (((tickAnim - 113) / 23) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 113) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 23) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 180) {
            xx = 4.5 + (((tickAnim - 136) / 44) * (0-(4.5)));
            yy = 0 + (((tickAnim - 136) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 11.5 + (((tickAnim - 38) / 6) * (-16.38631-(11.5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0.07592-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0.04624-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -16.38631 + (((tickAnim - 44) / 6) * (-33.25-(-16.38631)));
            yy = 0.07592 + (((tickAnim - 44) / 6) * (0-(0.07592)));
            zz = 0.04624 + (((tickAnim - 44) / 6) * (0-(0.04624)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -33.25 + (((tickAnim - 50) / 5) * (-26-(-33.25)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -26 + (((tickAnim - 55) / 25) * (0.75-(-26)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.75 + (((tickAnim - 80) / 20) * (-35.5-(0.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -35.5 + (((tickAnim - 100) / 8) * (-19.25-(-35.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = -19.25 + (((tickAnim - 108) / 5) * (-35.5-(-19.25)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 128) {
            xx = -35.5 + (((tickAnim - 113) / 15) * (-16.5-(-35.5)));
            yy = 0 + (((tickAnim - 113) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 15) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 136) {
            xx = -16.5 + (((tickAnim - 128) / 8) * (-35.5-(-16.5)));
            yy = 0 + (((tickAnim - 128) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 8) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 155) {
            xx = -35.5 + (((tickAnim - 136) / 19) * (4.91-(-35.5)));
            yy = 0 + (((tickAnim - 136) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 19) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 180) {
            xx = 4.91 + (((tickAnim - 155) / 25) * (0-(4.91)));
            yy = 0 + (((tickAnim - 155) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (18.25-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 18.25 + (((tickAnim - 44) / 6) * (0-(18.25)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 4 + (((tickAnim - 70) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (18.25-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 18.25 + (((tickAnim - 90) / 10) * (0-(18.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 2) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 102) / 2) * (4-(0)));
            yy = 0 + (((tickAnim - 102) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 2) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = 4 + (((tickAnim - 104) / 4) * (0-(4)));
            yy = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 4) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (12.75-(0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 12.75 + (((tickAnim - 111) / 2) * (0-(12.75)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 120) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 2) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 122) / 2) * (4-(0)));
            yy = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 2) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 4 + (((tickAnim - 124) / 4) * (0-(4)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 128) / 5) * (12.75-(0)));
            yy = 0 + (((tickAnim - 128) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 5) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 12.75 + (((tickAnim - 133) / 3) * (0-(12.75)));
            yy = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -4.5 + (((tickAnim - 38) / 17) * (-3.75-(-4.5)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = -3.75 + (((tickAnim - 55) / 45) * (-1.25-(-3.75)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -1.25 + (((tickAnim - 100) / 20) * (-3.25-(-1.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 146) {
            xx = -3.25 + (((tickAnim - 120) / 26) * (-2.5-(-3.25)));
            yy = 0 + (((tickAnim - 120) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 26) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -2.5 + (((tickAnim - 146) / 34) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -14 + (((tickAnim - 38) / 17) * (-16-(-14)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = -16 + (((tickAnim - 55) / 45) * (-13.5-(-16)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -13.5 + (((tickAnim - 100) / 20) * (-12.25-(-13.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 146) {
            xx = -12.25 + (((tickAnim - 120) / 26) * (-11-(-12.25)));
            yy = 0 + (((tickAnim - 120) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 26) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -11 + (((tickAnim - 146) / 34) * (0-(-11)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -12.75 + (((tickAnim - 38) / 17) * (-15.5-(-12.75)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = -15.5 + (((tickAnim - 55) / 45) * (-13.5-(-15.5)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -13.5 + (((tickAnim - 100) / 20) * (-11-(-13.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 146) {
            xx = -11 + (((tickAnim - 120) / 26) * (-9.25-(-11)));
            yy = 0 + (((tickAnim - 120) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 26) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -9.25 + (((tickAnim - 146) / 34) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = -15.5 + (((tickAnim - 38) / 42) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 42) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -15.5 + (((tickAnim - 80) / 20) * (-13-(-15.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = -13 + (((tickAnim - 100) / 46) * (-13-(-13)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 180) {
            xx = -13 + (((tickAnim - 146) / 34) * (0-(-13)));
            yy = 0 + (((tickAnim - 146) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = -15.5 + (((tickAnim - 38) / 42) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 42) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -15.5 + (((tickAnim - 80) / 20) * (-28.80696-(-15.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (-3.38926-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.44763-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = -28.80696 + (((tickAnim - 100) / 46) * (-28.80696-(-28.80696)));
            yy = -3.38926 + (((tickAnim - 100) / 46) * (-3.38926-(-3.38926)));
            zz = -0.44763 + (((tickAnim - 100) / 46) * (-0.44763-(-0.44763)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = -28.80696 + (((tickAnim - 146) / 19) * (-30.14696-(-28.80696)));
            yy = -3.38926 + (((tickAnim - 146) / 19) * (-1.48797-(-3.38926)));
            zz = -0.44763 + (((tickAnim - 146) / 19) * (-0.19652-(-0.44763)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -30.14696 + (((tickAnim - 165) / 15) * (0-(-30.14696)));
            yy = -1.48797 + (((tickAnim - 165) / 15) * (0-(-1.48797)));
            zz = -0.19652 + (((tickAnim - 165) / 15) * (0-(-0.19652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = -10.75 + (((tickAnim - 100) / 46) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = -10.75 + (((tickAnim - 146) / 19) * (35.78-(-10.75)));
            yy = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 19) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 35.78 + (((tickAnim - 165) / 15) * (0-(35.78)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -31.5 + (((tickAnim - 90) / 10) * (11.5-(-31.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 11.5 + (((tickAnim - 100) / 46) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = 11.5 + (((tickAnim - 146) / 19) * (-13.2-(11.5)));
            yy = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 19) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -13.2 + (((tickAnim - 165) / 15) * (0-(-13.2)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (1.175-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 1.175 + (((tickAnim - 90) / 10) * (0-(1.175)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 146) / 19) * (0.425-(0)));
            zz = 0 + (((tickAnim - 146) / 19) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0.425 + (((tickAnim - 165) / 15) * (0-(0.425)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (68-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 68 + (((tickAnim - 90) / 10) * (12.5-(68)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 12.5 + (((tickAnim - 100) / 46) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = 12.5 + (((tickAnim - 146) / 19) * (69.99-(12.5)));
            yy = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 19) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 69.99 + (((tickAnim - 165) / 15) * (0-(69.99)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-1.075-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -1.075 + (((tickAnim - 90) / 10) * (0-(-1.075)));
        }
        else if (tickAnim >= 100 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 46) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 146) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 19) * (-1.025-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = -1.025 + (((tickAnim - 165) / 15) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 146 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 146) / 11) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 146) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 11) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = -27.5 + (((tickAnim - 157) / 8) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 0) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 146) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 146) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 146) / 11) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 146) / 11) * (0.85-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            yy = -0.3 + (((tickAnim - 157) / 8) * (0-(-0.3)));
            zz = 0.85 + (((tickAnim - 157) / 8) * (0-(0.85)));
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
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*7), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-120))*-1.5);


        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*4), torso.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*-7), torso.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+140))*-5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+180))*5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-280))*-9), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+180))*3));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+180))*5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-280))*-9), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+180))*3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headFluff2, headFluff2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-9), headFluff2.rotateAngleY + (float) Math.toRadians(0), headFluff2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headFluff1, headFluff1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-9), headFluff1.rotateAngleY + (float) Math.toRadians(0), headFluff1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*8), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+200))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*18), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+200))*3));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.85);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26 + (((tickAnim - 0) / 8) * (41-(-26)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 41 + (((tickAnim - 8) / 7) * (-26-(41)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.66699 + (((tickAnim - 0) / 8) * (9.5-(-12.66699)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.5 + (((tickAnim - 8) / 1) * (23.07-(9.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 23.07 + (((tickAnim - 9) / 6) * (-12.66699-(23.07)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.25 + (((tickAnim - 0) / 8) * (18.25-(10.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.25 + (((tickAnim - 8) / 1) * (-4.28-(18.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -4.28 + (((tickAnim - 9) / 4) * (-46.98-(-4.28)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -46.98 + (((tickAnim - 13) / 2) * (10.25-(-46.98)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 8) * (-1.1-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -1.1 + (((tickAnim - 8) / 1) * (-0.02-(-1.1)));
            zz = 0.15 + (((tickAnim - 8) / 1) * (0.12-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.02 + (((tickAnim - 9) / 4) * (1.23-(-0.02)));
            zz = 0.12 + (((tickAnim - 9) / 4) * (0.65-(0.12)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.23 + (((tickAnim - 13) / 2) * (-0.725-(1.23)));
            zz = 0.65 + (((tickAnim - 13) / 2) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 63.25 + (((tickAnim - 0) / 2) * (6.5-(63.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 6.5 + (((tickAnim - 2) / 2) * (-26.43-(6.5)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -26.43 + (((tickAnim - 4) / 2) * (41.29-(-26.43)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 41.29 + (((tickAnim - 6) / 2) * (40.5-(41.29)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 40.5 + (((tickAnim - 8) / 1) * (67.81-(40.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 67.81 + (((tickAnim - 9) / 6) * (63.25-(67.81)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.2-(0)));
            zz = -0.95 + (((tickAnim - 0) / 2) * (0.225-(-0.95)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.2 + (((tickAnim - 2) / 1) * (1.425-(1.2)));
            zz = 0.225 + (((tickAnim - 2) / 1) * (0.31-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.425 + (((tickAnim - 3) / 1) * (0-(1.425)));
            zz = 0.31 + (((tickAnim - 3) / 1) * (0.475-(0.31)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0.475 + (((tickAnim - 4) / 2) * (-0.755-(0.475)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -0.755 + (((tickAnim - 6) / 2) * (-0.725-(-0.755)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -0.725 + (((tickAnim - 8) / 7) * (-0.95-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (-41.06-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -41.06 + (((tickAnim - 5) / 1) * (0-(-41.06)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (29.75-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 29.75 + (((tickAnim - 8) / 7) * (0-(29.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 1) * (0-(-0.5)));
            zz = 1.2 + (((tickAnim - 5) / 1) * (0-(1.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 8) / 7) * (0-(-0.15)));
            zz = -0.425 + (((tickAnim - 8) / 7) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 41 + (((tickAnim - 0) / 8) * (-26-(41)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -26 + (((tickAnim - 8) / 7) * (41-(-26)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.5 + (((tickAnim - 0) / 2) * (23.07-(9.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 23.07 + (((tickAnim - 2) / 6) * (-12.66699-(23.07)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.66699 + (((tickAnim - 8) / 7) * (9.5-(-12.66699)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.25 + (((tickAnim - 0) / 2) * (-4.28-(18.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -4.28 + (((tickAnim - 2) / 3) * (-46.98-(-4.28)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -46.98 + (((tickAnim - 5) / 3) * (10.25-(-46.98)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 10.25 + (((tickAnim - 8) / 7) * (18.25-(10.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.1 + (((tickAnim - 0) / 2) * (-0.02-(-1.1)));
            zz = 0.15 + (((tickAnim - 0) / 2) * (0.12-(0.15)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.02 + (((tickAnim - 2) / 3) * (1.23-(-0.02)));
            zz = 0.12 + (((tickAnim - 2) / 3) * (0.65-(0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.23 + (((tickAnim - 5) / 3) * (-0.725-(1.23)));
            zz = 0.65 + (((tickAnim - 5) / 3) * (0-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.725 + (((tickAnim - 8) / 7) * (-1.1-(-0.725)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.15-(0)));
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
            xx = 40.5 + (((tickAnim - 0) / 2) * (67.81-(40.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 67.81 + (((tickAnim - 2) / 6) * (63.25-(67.81)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 63.25 + (((tickAnim - 8) / 1) * (6.5-(63.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 6.5 + (((tickAnim - 9) / 3) * (-26.43-(6.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -26.43 + (((tickAnim - 12) / 1) * (41.29-(-26.43)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 41.29 + (((tickAnim - 13) / 2) * (40.5-(41.29)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -0.725 + (((tickAnim - 0) / 8) * (-0.95-(-0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (1.2-(0)));
            zz = -0.95 + (((tickAnim - 8) / 1) * (0.225-(-0.95)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.2 + (((tickAnim - 9) / 1) * (1.425-(1.2)));
            zz = 0.225 + (((tickAnim - 9) / 1) * (0.31-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.425 + (((tickAnim - 10) / 2) * (0-(1.425)));
            zz = 0.31 + (((tickAnim - 10) / 2) * (0.475-(0.31)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0.475 + (((tickAnim - 12) / 1) * (-0.755-(0.475)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.755 + (((tickAnim - 13) / 2) * (-0.725-(-0.755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29.75 + (((tickAnim - 0) / 8) * (0-(29.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-41.06-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -41.06 + (((tickAnim - 13) / 0) * (0-(-41.06)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (29.75-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 8) * (0-(-0.15)));
            zz = -0.425 + (((tickAnim - 0) / 8) * (0-(-0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (1.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (0-(-0.5)));
            zz = 1.2 + (((tickAnim - 13) / 0) * (0-(1.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.425-(0)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 33;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 15.058 + (((tickAnim - 0) / 7) * (24.49527-(15.058)));
            yy = 3.1085 + (((tickAnim - 0) / 7) * (5.51383-(3.1085)));
            zz = -2.36368 + (((tickAnim - 0) / 7) * (-0.84395-(-2.36368)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 24.49527 + (((tickAnim - 7) / 11) * (-17.75-(24.49527)));
            yy = 5.51383 + (((tickAnim - 7) / 11) * (0-(5.51383)));
            zz = -0.84395 + (((tickAnim - 7) / 11) * (0-(-0.84395)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.75 + (((tickAnim - 18) / 15) * (15.058-(-17.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (3.1085-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (-2.36368-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 0) / 7) * (16-(-10)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 16 + (((tickAnim - 7) / 1) * (0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*25-(16)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*25 + (((tickAnim - 8) / 9) * (-15.21-(0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -15.21 + (((tickAnim - 17) / 1) * (-5.75-(-15.21)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.75 + (((tickAnim - 18) / 15) * (-10-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.25 + (((tickAnim - 0) / 7) * (9.25-(8.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 9.25 + (((tickAnim - 7) / 5) * (-40.87-(9.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -40.87 + (((tickAnim - 12) / 3) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -40.87 + (((tickAnim - 15) / 3) * (17-(-40.87)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 18) / 15) * (8.25-(17)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.25 + (((tickAnim - 0) / 7) * (61.75-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 61.75 + (((tickAnim - 7) / 5) * (78.65-(61.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 78.65 + (((tickAnim - 12) / 3) * (70.9-(78.65)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 70.9 + (((tickAnim - 15) / 3) * (5.5-(70.9)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 18) / 15) * (-13.25-(5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 7) * (0-(0.925)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.08-(0)));
            zz = -0.6 + (((tickAnim - 7) / 5) * (-1.145-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 12) / 3) * (0.13-(0.08)));
            zz = -1.145 + (((tickAnim - 12) / 3) * (-1.125-(-1.145)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 15) / 3) * (0.025-(0.13)));
            zz = -1.125 + (((tickAnim - 15) / 3) * (0-(-1.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 4) * (-0.52-(0.025)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.52 + (((tickAnim - 22) / 3) * (-0.145-(-0.52)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = -0.145 + (((tickAnim - 25) / 4) * (1.195-(-0.145)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 1.195 + (((tickAnim - 29) / 4) * (0.925-(1.195)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -17.75 + (((tickAnim - 0) / 15) * (14.98167-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.57447-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.63843-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.98167 + (((tickAnim - 15) / 7) * (24.62924-(14.98167)));
            yy = -2.57447 + (((tickAnim - 15) / 7) * (-7.13929-(-2.57447)));
            zz = 1.63843 + (((tickAnim - 15) / 7) * (2.30437-(1.63843)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 24.62924 + (((tickAnim - 22) / 11) * (-17.75-(24.62924)));
            yy = -7.13929 + (((tickAnim - 22) / 11) * (0-(-7.13929)));
            zz = 2.30437 + (((tickAnim - 22) / 11) * (0-(2.30437)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5.75 + (((tickAnim - 0) / 15) * (-10-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -10 + (((tickAnim - 15) / 7) * (16-(-10)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 16 + (((tickAnim - 22) / 1) * (-13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*-35-(16)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*-35 + (((tickAnim - 23) / 8) * (-15.21-(-13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*216+30))*-35)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -15.21 + (((tickAnim - 31) / 2) * (-5.75-(-15.21)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 0) / 15) * (8.25-(7.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 8.25 + (((tickAnim - 15) / 7) * (9.25-(8.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 9.25 + (((tickAnim - 22) / 5) * (-40.87-(9.25)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -40.87 + (((tickAnim - 27) / 2) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -40.87 + (((tickAnim - 29) / 4) * (7.75-(-40.87)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 16.5 + (((tickAnim - 0) / 15) * (-13.25-(16.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -13.25 + (((tickAnim - 15) / 7) * (61.75-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 61.75 + (((tickAnim - 22) / 4) * (78.65-(61.75)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 78.65 + (((tickAnim - 26) / 3) * (70.9-(78.65)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 70.9 + (((tickAnim - 29) / 4) * (16.5-(70.9)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 3) * (0.13-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.13 + (((tickAnim - 3) / 4) * (-0.045-(0.13)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.045 + (((tickAnim - 7) / 5) * (0.98-(-0.045)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.98 + (((tickAnim - 12) / 3) * (1-(0.98)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 7) * (0-(1)));
            zz = 0 + (((tickAnim - 15) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0.08-(0)));
            zz = -0.6 + (((tickAnim - 22) / 4) * (-1.145-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 26) / 3) * (0.13-(0.08)));
            zz = -1.145 + (((tickAnim - 26) / 3) * (-1.125-(-1.145)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.13 + (((tickAnim - 29) / 4) * (-0.075-(0.13)));
            zz = -1.125 + (((tickAnim - 29) / 4) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+90))*7), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+80))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-50))*0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-120))*-1);


        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-100))*2), torso.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+90))*-7), torso.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+140))*-3));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-200))*3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+180))*5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-280))*3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+180))*3));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-200))*3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+180))*5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-280))*3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+180))*3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-200))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-250))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-350))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-50))*1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+150))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-100))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-50))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+150))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-100))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+200))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.5-200))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216+200))*3));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.85);


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMicrovenator e = (EntityPrehistoricFloraMicrovenator) entity;
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
